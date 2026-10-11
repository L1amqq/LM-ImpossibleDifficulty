package com.liam.impossible.runtime;

import com.mojang.brigadier.StringReader;
import net.minecraft.commands.arguments.*;
import net.minecraft.commands.arguments.blocks.*;
import net.minecraft.commands.arguments.coordinates.*;
import net.minecraft.commands.arguments.item.*;
import net.minecraft.commands.arguments.selector.*;
import net.minecraft.commands.arguments.selector.EntitySelector;
import net.minecraft.core.*;
import net.minecraft.core.registries.*;
import net.minecraft.nbt.*;
import net.minecraft.network.chat.*;
import net.minecraft.network.protocol.game.*;
import net.minecraft.resources.*;
import net.minecraft.server.level.*;
import net.minecraft.sounds.*;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.*;
import net.minecraft.world.damagesource.*;
import net.minecraft.world.effect.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.*;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.storage.*;
import net.minecraft.world.level.portal.TeleportTransition;
import net.minecraft.world.phys.*;
import net.minecraft.world.scores.*;
import net.minecraft.world.scores.criteria.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

/** Native implementations of the original primitives. No command dispatcher or function loader. */
public final class Native {
    private static final Map<String,EntitySelector> SELECTORS=new HashMap<>();
    private static final Map<String,NbtPathArgument.NbtPath> PATHS=new HashMap<>();
    private static final Map<String,CompoundTag> COMPOUNDS=new HashMap<>();
    public static CompoundTag compound(String text) throws Exception {
        CompoundTag tag=COMPOUNDS.get(text);
        if(tag==null){tag=TagParser.parseCompoundFully(text);COMPOUNDS.put(text,tag);}
        return tag.copy();
    }
    public static Tag tagValue(String text) throws Exception {return TagParser.create(NbtOps.INSTANCE).parseFully(text);}
    public static NbtPathArgument.NbtPath path(String text) throws Exception {
        var p=PATHS.get(text);if(p==null){p=NbtPathArgument.NbtPath.of(text);PATHS.put(text,p);}return p;
    }
    public static List<Entity> entities(Frame c,String text) throws Exception {
        text=c.expand(text);EntitySelector selector=SELECTORS.get(text);
        if(selector==null){
            List<String> predicates=new ArrayList<>(),nbtPredicates=new ArrayList<>();
            String query=text;
            if(text.startsWith("@")&&text.contains("[")){
                int bracket=text.indexOf('[');List<String> kept=new ArrayList<>();
                for(String option:splitOptions(text.substring(bracket+1,text.length()-1))){
                    if(option.startsWith("predicate="))predicates.add(option.substring(10));
                    else if(option.startsWith("nbt="))nbtPredicates.add(option.substring(4));
                    else kept.add(option);
                }
                query=text.substring(0,bracket)+(kept.isEmpty()?"":"["+String.join(",",kept)+"]");
            }
            EntitySelectorParser parser=new EntitySelectorParser(new StringReader(query),true);
            parser.addPredicate(e->!e.isRemoved());
            selector=parser.parse();
            // Add predicates before the selector's result limit and ordering are applied.
            if(!predicates.isEmpty()||!nbtPredicates.isEmpty()){
                parser=new EntitySelectorParser(new StringReader(query),true);
                parser.addPredicate(e->!e.isRemoved());
                for(String id:predicates)parser.addPredicate(e -> Predicates.test(new Frame(e.level().getServer().createCommandSourceStack().withEntity(e).withLevel((ServerLevel)e.level()).withPosition(e.position()).withRotation(e.getRotationVector())),id));
                for(String literal:nbtPredicates){boolean invert=literal.startsWith("!");CompoundTag required=compound(invert?literal.substring(1):literal);parser.addPredicate(e -> NbtUtils.compareNbt(required,entityData(e),true)!=invert);}
                selector=parser.parse();
            }
            SELECTORS.put(text,selector);
        }
        return new ArrayList<>(selector.findEntities(c.source()));
    }
    public static List<String> splitOptions(String text){List<String> result=new ArrayList<>();int depth=0,start=0;char quote=0;boolean escape=false;for(int i=0;i<text.length();i++){char ch=text.charAt(i);if(quote!=0){if(escape)escape=false;else if(ch=='\\')escape=true;else if(ch==quote)quote=0;}else if(ch=='\''||ch=='"')quote=ch;else if(ch=='['||ch=='{')depth++;else if(ch==']'||ch=='}')depth--;else if(ch==','&&depth==0){result.add(text.substring(start,i).trim());start=i+1;}}if(start<text.length())result.add(text.substring(start).trim());return result;}
    public static List<ServerPlayer> players(Frame c,String text) throws Exception {return entities(c,text).stream().filter(ServerPlayer.class::isInstance).map(ServerPlayer.class::cast).toList();}
    public static final class NoTarget extends RuntimeException {NoTarget(){super(null,null,false,false);}}
    public static Entity entity(Frame c,String text) throws Exception {var result=entities(c,text);if(result.isEmpty())throw new NoTarget();if(result.size()!=1)throw new IllegalArgumentException("Expected one entity: "+text);return result.getFirst();}
    public static Vec3 position(Frame c,String[] a,int i) throws Exception {return Vec3Argument.vec3().parse(new StringReader(a[i]+" "+a[i+1]+" "+a[i+2])).getPosition(c.source());}
    public static BlockPos blockPos(Frame c,String[] a,int i) throws Exception {return BlockPosArgument.blockPos().parse(new StringReader(a[i]+" "+a[i+1]+" "+a[i+2])).getBlockPos(c.source());}
    public static Vec2 rotation(Frame c,String[] a,int i) throws Exception {return RotationArgument.rotation().parse(new StringReader(a[i]+" "+a[i+1])).getRotation(c.source());}
    public static boolean matches(int n,String range){String[] a=range.split("\\.\\.",-1);return a.length==1?n==Integer.parseInt(a[0]):(a[0].isEmpty()||n>=Integer.parseInt(a[0]))&&(a[1].isEmpty()||n<=Integer.parseInt(a[1]));}
    public static List<ScoreHolder> holders(Frame c,String name) throws Exception {
        if(name.equals("*"))return new ArrayList<>(c.source().getServer().getScoreboard().getTrackedPlayers());
        if(name.startsWith("@")||name.matches("[a-fA-F0-9-]{36}"))return new ArrayList<>(entities(c,name));
        ServerPlayer player=c.source().getServer().getPlayerList().getPlayerByName(name);return List.of(player==null?ScoreHolder.forNameOnly(name):player);
    }
    public static Objective objective(Frame c,String name){var o=c.source().getServer().getScoreboard().getObjective(name);if(o==null)throw new IllegalArgumentException("Missing objective "+name);return o;}
    public static ReadOnlyScoreInfo scoreInfo(Frame c,String holder,String objective) throws Exception {var o=c.source().getServer().getScoreboard().getObjective(objective);var h=holders(c,holder);return o==null||h.isEmpty()?null:c.source().getServer().getScoreboard().getPlayerScoreInfo(h.getFirst(),o);}
    public static void setScore(Frame c,String holder,String objective,int value) throws Exception {var board=c.source().getServer().getScoreboard();for(var h:holders(c,holder))board.getOrCreatePlayerScore(h,objective(c,objective)).set(value);}
    public static int scoreboard(Frame c,String... args) throws Exception {
        String[] a=c.expand(args);var board=c.source().getServer().getScoreboard();
        if(a[0].equals("objectives")){
            switch(a[1]){
                case "add"->{if(board.getObjective(a[2])!=null)return 0;var criteria=ObjectiveCriteria.byName(a[3]).orElseThrow();board.addObjective(a[2],criteria,a.length>4?text(c,a[4]):Component.literal(a[2]),criteria.getDefaultRenderType(),false,null);}
                case "remove"->board.removeObjective(objective(c,a[2]));
                case "setdisplay"->board.setDisplayObjective(DisplaySlot.CODEC.parse(com.mojang.serialization.JsonOps.INSTANCE,new com.google.gson.JsonPrimitive(a[2])).getOrThrow(),a.length>3?objective(c,a[3]):null);
                default->throw new UnsupportedOperationException("objective "+a[1]);
            }return 1;
        }
        List<ScoreHolder> targets=holders(c,a[2]);
        if(a[1].equals("reset")){for(var h:targets){if(a.length>3)board.resetSinglePlayerScore(h,objective(c,a[3]));else board.resetAllPlayerScores(h);}return targets.size();}
        if(a[1].equals("operation")){
            var leftObj=objective(c,a[3]);var rightObj=objective(c,a[6]);int sum=0;
            for(var h:targets)for(var r:holders(c,a[5])){
                var left=board.getOrCreatePlayerScore(h,leftObj);var right=board.getOrCreatePlayerScore(r,rightObj);int x=left.get(),y=right.get();
                switch(a[4]){case "="->left.set(y);case "+="->left.set(x+y);case "-="->left.set(x-y);case "*="->left.set(x*y);case "/="->{if(y==0)throw new ArithmeticException();left.set(Math.floorDiv(x,y));}case "%="->{if(y==0)throw new ArithmeticException();left.set(Math.floorMod(x,y));}case "<"->left.set(Math.min(x,y));case ">"->left.set(Math.max(x,y));case "><"->{left.set(y);right.set(x);}default->throw new IllegalArgumentException(a[4]);}sum+=left.get();
            }return sum;
        }
        int sum=0;for(var h:targets){var score=board.getOrCreatePlayerScore(h,objective(c,a[3]));switch(a[1]){case "set"->score.set(Integer.parseInt(a[4]));case "add"->score.set(score.get()+Integer.parseInt(a[4]));case "remove"->score.set(score.get()-Integer.parseInt(a[4]));case "enable"->score.unlock();case "get"->{}default->throw new IllegalArgumentException(a[1]);}sum+=score.get();}return sum;
    }
    public static CompoundTag entityData(Entity e){return Schema.legacyView(net.minecraft.advancements.criterion.NbtPredicate.getEntityTagToCompare(e),e);}
    public static void writeEntity(Entity e,CompoundTag tag){if(e instanceof Player)throw new IllegalArgumentException("Player data is read-only");var uuid=e.getUUID();e.load(TagValueInput.create(ProblemReporter.DISCARDING,e.registryAccess(),Schema.upgrade(tag)));e.setUUID(uuid);MobAppearance.refresh(e);}
    public record Target(CompoundTag data,Consumer<CompoundTag> writer,int next){public void write(CompoundTag value){writer.accept(value);}}
    public static Target target(Frame c,String[] a,int i) throws Exception {
        switch(a[i]){
            case "storage":{Identifier id=Identifier.parse(a[i+1]);var store=c.source().getServer().getCommandStorage();return new Target(store.get(id).copy(),t->store.set(id,t),i+2);}
            case "entity":{Entity e=entity(c,a[i+1]);if(a.length>i+2){var direct=AnimationData.target(e,a[i+2],i+2);if(direct!=null)return direct;}return new Target(entityData(e),t->writeEntity(e,t),i+2);}
            case "block":{BlockPos p=blockPos(c,a,i+1);BlockEntity e=c.source().getLevel().getBlockEntity(p);if(e==null)throw new IllegalArgumentException("No block entity");CompoundTag view=Schema.blockView(e.saveWithFullMetadata(c.source().registryAccess()),e);CompoundTag baseline=view.copy();return new Target(view,t->{e.loadWithComponents(TagValueInput.create(ProblemReporter.DISCARDING,c.source().registryAccess(),Schema.blockInput(t,baseline)));e.setChanged();var state=e.getBlockState();c.source().getLevel().sendBlockUpdated(p,state,state,3);},i+4);}
            default:throw new IllegalArgumentException("NBT target "+a[i]);
        }
    }
    public static int data(Frame c,String... args) throws Exception {
        String[] a=c.expand(args);Integer direct=AnimationData.apply(c,a);if(direct!=null)return direct;Target dst=target(c,a,1);CompoundTag root=dst.data();int i=dst.next();
        if(a[0].equals("merge")){CompoundTag before=root.copy();root.merge(compound(a[i]));if(before.equals(root))return Logic.result(0,false);dst.write(root);return Logic.result(1,true);}
        if(a[0].equals("remove")){int n=path(a[i]).remove(root);dst.write(root);return n;}
        if(a[0].equals("get")){if(a.length==i)return 1;Tag value=path(a[i]).get(root).getFirst();if(value instanceof NumericTag number)return (int)Math.floor(number.doubleValue()*(a.length>i+1?Double.parseDouble(a[i+1]):1));if(value instanceof CollectionTag list)return list.size();if(value instanceof CompoundTag t)return t.size();if(value instanceof StringTag s)return s.value().length();return 0;}
        var path=path(a[i++]);String mode=a[i++];int index=0;if(mode.equals("insert"))index=Integer.parseInt(a[i++]);List<Tag> values;
        if(a[i].equals("value"))values=List.of(tagValue(a[i+1]));
        else {boolean string=a[i].equals("string");Target source=target(c,a,i+1);int si=source.next();values=si<a.length?path(a[si++]).get(source.data()):List.of(source.data());if(string){List<Tag> converted=new ArrayList<>();for(Tag value:values){String s=value instanceof StringTag st?st.value():value.toString();int start=si<a.length?Integer.parseInt(a[si]):0,end=si+1<a.length?Integer.parseInt(a[si+1]):s.length();if(start<0)start+=s.length();if(end<0)end+=s.length();converted.add(StringTag.valueOf(s.substring(start,end)));}values=converted;}}
        int n=switch(mode){case "set"->path.set(root,values.getLast());case "append"->path.insert(-1,root,values);case "prepend"->path.insert(0,root,values);case "insert"->path.insert(index,root,values);case "merge"->{int count=0;for(Tag t:path.getOrCreate(root,CompoundTag::new)){if(!(t instanceof CompoundTag object))throw new IllegalArgumentException("Expected compound");for(Tag value:values)object.merge((CompoundTag)value);count++;}yield count;}default->throw new IllegalArgumentException(mode);};dst.write(root);return Logic.result(n,n>0);
    }
    public static Tag number(String type,double value){return switch(type){case "byte"->ByteTag.valueOf((byte)value);case "short"->ShortTag.valueOf((short)value);case "int"->IntTag.valueOf((int)value);case "long"->LongTag.valueOf((long)value);case "float"->FloatTag.valueOf((float)value);case "double"->DoubleTag.valueOf(value);default->throw new IllegalArgumentException(type);};}
    public static int summon(Frame c,String... args) throws Exception {if(c.source().getEntity()!=null&&c.source().getEntity().getTags().contains(DragonAttacks.ATTACK)&&DragonAttacks.blocked(c.source().getEntity()))return 0;String[] a=c.expand(args);Vec3 p=a.length>3?position(c,a,1):c.source().getPosition();CompoundTag tag=a.length>4?Schema.upgrade(compound(a[4])):new CompoundTag();tag.putString("id",Identifier.parse(a[0]).toString());Entity e=EntityType.loadEntityRecursive(tag,c.source().getLevel(),EntitySpawnReason.COMMAND,entity->{entity.snapTo(p.x,p.y,p.z,entity.getYRot(),entity.getXRot());return entity;});if(e==null||!DragonAttacks.mark(c.source().getEntity(),e))return 0;UtilityParticles.hide(e);MobAppearance.inherit(c.source().getEntity(),e);return c.source().getLevel().tryAddFreshEntityWithPassengers(e)?1:0;}
    public static int tag(Frame c,String... args) throws Exception {String[] a=c.expand(args);int n=0;for(Entity e:entities(c,a[0])){boolean changed=a[1].equals("add")?e.addTag(a[2]):e.removeTag(a[2]);if(changed)n++;}return n;}
    public static int kill(Frame c,String... args) throws Exception {var entities=entities(c,args.length>0?args[0]:"@s");for(Entity e:entities)e.kill(c.source().getLevel());return entities.size();}
    public static int tp(Frame c,String... args) throws Exception {
        String[] a=c.expand(args);int i=0;List<Entity> targets;
        if(a[0].startsWith("@")||a[0].matches("[a-fA-F0-9-]{36}")){targets=entities(c,a[0]);i=1;}else targets=List.of(c.source().getEntityOrException());
        if(a.length-i==1){Entity destination=entity(c,a[i]);int count=0;for(Entity e:targets)if(teleport(e,(ServerLevel)destination.level(),destination.position(),destination.getRotationVector()))count++;return count;}
        Vec3 p=position(c,a,i);i+=3;Vec2 r=null;if(a.length>i&&!a[i].equals("facing"))r=rotation(c,a,i);int count=0;
        for(Entity e:targets){Vec2 rot=r==null?e.getRotationVector():r;if(a.length>i&&a[i].equals("facing")){var src=c.source().withPosition(p);if(a[i+1].equals("entity"))src=src.facing(entity(c,a[i+2]),a.length>i+3&&a[i+3].equals("eyes")?EntityAnchorArgument.Anchor.EYES:EntityAnchorArgument.Anchor.FEET);else src=src.facing(position(c,a,i+1));rot=src.getRotation();}if(teleport(e,c.source().getLevel(),p,rot))count++;}return count;
    }
    private static boolean teleport(Entity e,ServerLevel level,Vec3 p,Vec2 rotation){
        boolean result;
        if(e.isPassenger()&&e.getTags().contains("aj.rig_entity"))result=e.teleport(new TeleportTransition(level,p,e.getDeltaMovement(),rotation.y,rotation.x,Set.of(),TeleportTransition.DO_NOTHING).transitionAsPassenger())!=null;
        else result=e.teleportTo(level,p.x,p.y,p.z,Set.of(),rotation.y,rotation.x,true);
        if(result&&!(e instanceof LivingEntity l&&l.isFallFlying())){e.setDeltaMovement(e.getDeltaMovement().multiply(1,0,1));e.setOnGround(true);}
        if(result&&e instanceof PathfinderMob mob)mob.getNavigation().stop();return result;
    }
    public static int particle(Frame c,String... args) throws Exception {String[] a=c.expand(args);var particle=ParticleArgument.readParticle(new StringReader(Schema.particleSpec(a[0])),c.source().registryAccess());Vec3 p=a.length>3?position(c,a,1):c.source().getPosition();Vec3 delta=a.length>6?Vec3Argument.vec3(false).parse(new StringReader(a[4]+" "+a[5]+" "+a[6])).getPosition(c.source()):Vec3.ZERO;double x=delta.x,y=delta.y,z=delta.z,speed=a.length>7?Double.parseDouble(a[7]):0;int count=a.length>8?Integer.parseInt(a[8]):0;boolean force=a.length>9&&a[9].equals("force");List<ServerPlayer> viewers=a.length>10?players(c,a[10]):c.source().getServer().getPlayerList().getPlayers();int n=0;for(ServerPlayer player:viewers)if(c.source().getLevel().sendParticles(player,particle,force,false,p.x,p.y,p.z,count,x,y,z,speed))n++;return n;}
    public static int damage(Frame c,String... args) throws Exception {if(DragonAttacks.blockedContext(c.source().getEntity()))return 0;String[] a=c.expand(args);Entity e=entity(c,a[0]);float amount=Float.parseFloat(a[1]);var type=c.source().registryAccess().lookupOrThrow(Registries.DAMAGE_TYPE).getOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE,Identifier.parse(a.length>2?a[2]:"minecraft:generic")));DamageSource src=new DamageSource(type);if(a.length>3){if(a[3].equals("by")){Entity direct=entity(c,a[4]);src=new DamageSource(type,direct,a.length>6?entity(c,a[6]):direct);}else src=new DamageSource(type,position(c,a,4));}return e.hurtServer(c.source().getLevel(),src,amount)?1:0;}
    public static int effect(Frame c,String... args) throws Exception {String[] a=c.expand(args);if(!a[0].equals("clear")&&DragonAttacks.blockedContext(c.source().getEntity()))return 0;List<Entity> targets=entities(c,a.length>1?a[1]:"@s");int n=0;var effect=a.length>2?BuiltInRegistries.MOB_EFFECT.get(Identifier.parse(a[2])).orElseThrow():null;for(Entity e:targets)if(e instanceof LivingEntity living){if(a[0].equals("clear")){boolean changed=effect==null?living.removeAllEffects():living.removeEffect(effect);if(changed)n++;}else{int duration=a.length>3?(a[3].equals("infinite")?-1:Integer.parseInt(a[3])*20):600,amp=a.length>4?Integer.parseInt(a[4]):0;boolean show=!(a.length>5&&Boolean.parseBoolean(a[5]));if(living.addEffect(new MobEffectInstance(effect,duration,amp,false,show),c.source().getEntity()))n++;}}return n;}
    public static int randomValue(Frame c,String... args){String[] a=c.expand(args);if(!a[0].equals("value")&&!a[0].equals("roll"))throw new IllegalArgumentException(a[0]);String[] bounds=a[1].split("\\.\\.");int min=Integer.parseInt(bounds[0]),max=Integer.parseInt(bounds[1]);var random=a.length>2?c.source().getLevel().getRandomSequence(Identifier.parse(a[2])):c.source().getLevel().random;return min+random.nextInt(max-min+1);}
    public static int uuidString(Frame c) throws Exception {int[] a=c.arguments().getIntArray("UUID").orElseThrow();UUID uuid=new UUID(((long)a[0]<<32)|(a[1]&0xffffffffL),((long)a[2]<<32)|(a[3]&0xffffffffL));var storage=c.source().getServer().getCommandStorage();Identifier id=Identifier.parse("aj:uuid");CompoundTag tag=storage.get(id).copy();path("main.out").set(tag,StringTag.valueOf(uuid.toString()));storage.set(id,tag);return Logic.result(1,true);}
    public static int schedule(Frame c,String... args){String[] a=c.expand(args);if(!a[0].equals("function"))throw new IllegalArgumentException(a[0]);String duration=a[2];double amount=Double.parseDouble(duration.substring(0,duration.length()-1));char unit=duration.charAt(duration.length()-1);long ticks=Math.round(amount*(unit=='s'?20:unit=='d'?24000:1));Logic.schedule(c.source().getServer(),a[1],ticks,a.length>3&&a[3].equals("append"));return (int)ticks;}
    public static boolean blockMatches(Frame c,BlockPos pos,String spec) throws Exception {
        var level=c.source().getLevel();var parsed=BlockStateParser.parseForTesting(c.source().registryAccess().lookupOrThrow(Registries.BLOCK),spec,true);BlockState state=level.getBlockState(pos);
        if(parsed.left().isPresent()){var value=parsed.left().get();if(!state.is(value.blockState().getBlock()))return false;for(var prop:value.properties().entrySet())if(!state.getValue(prop.getKey()).equals(prop.getValue()))return false;if(value.nbt()!=null){var e=level.getBlockEntity(pos);if(e==null||!NbtUtils.compareNbt(value.nbt(),e.saveWithFullMetadata(level.registryAccess()),true))return false;}return true;}
        var value=parsed.right().orElseThrow();if(!state.is(value.tag()))return false;for(var prop:value.vagueProperties().entrySet()){var key=state.getBlock().getStateDefinition().getProperty(prop.getKey());if(key==null||!Objects.equals(state.getValue(key).toString(),prop.getValue()))return false;}return true;
    }
    public static int setblock(Frame c,String... args) throws Exception {String[] a=c.expand(args);BlockPos p=blockPos(c,a,0);if(a.length>4&&a[4].equals("keep")&&!c.source().getLevel().isEmptyBlock(p))return 0;if(a.length>4&&a[4].equals("destroy"))c.source().getLevel().destroyBlock(p,true);return putBlock(c,p,a[3]);}
    private static int putBlock(Frame c,BlockPos p,String spec) throws Exception {var parsed=BlockStateParser.parseForBlock(c.source().registryAccess().lookupOrThrow(Registries.BLOCK),spec,true);boolean changed=c.source().getLevel().setBlock(p,parsed.blockState(),3);if(parsed.nbt()!=null){var e=c.source().getLevel().getBlockEntity(p);if(e!=null){e.loadWithComponents(TagValueInput.create(ProblemReporter.DISCARDING,c.source().registryAccess(),Schema.upgrade(parsed.nbt())));e.setChanged();}}return changed?1:0;}
    public static int fill(Frame c,String... args) throws Exception {String[] a=c.expand(args);BlockPos p=blockPos(c,a,0),q=blockPos(c,a,3);int count=0;for(BlockPos pos:BlockPos.betweenClosed(p,q)){boolean edge=pos.getX()==Math.min(p.getX(),q.getX())||pos.getX()==Math.max(p.getX(),q.getX())||pos.getY()==Math.min(p.getY(),q.getY())||pos.getY()==Math.max(p.getY(),q.getY())||pos.getZ()==Math.min(p.getZ(),q.getZ())||pos.getZ()==Math.max(p.getZ(),q.getZ());String mode=a.length>7?a[7]:"replace";if(mode.equals("outline")&&!edge)continue;if(mode.equals("keep")&&!c.source().getLevel().isEmptyBlock(pos))continue;if(mode.equals("replace")&&a.length>8&&!blockMatches(c,pos,a[8]))continue;if(mode.equals("destroy"))c.source().getLevel().destroyBlock(pos,true);count+=putBlock(c,pos,mode.equals("hollow")&&!edge?"air":a[6]);}return count;}
    public static List<Entity> origin(Entity entity){if(entity instanceof Projectile p&&p.getOwner()!=null)return List.of(p.getOwner());if(entity instanceof net.minecraft.world.entity.AreaEffectCloud cloud&&cloud.getOwner()!=null)return List.of(cloud.getOwner());return List.of();}
    public static Component text(Frame c,String value) throws Exception {return ComponentUtils.updateForEntity(c.source(),Schema.component(value,c.source().registryAccess()),c.source().getEntity(),0);}
    public static int tellraw(Frame c,String... args) throws Exception {String[] a=c.expand(args);Component value=text(c,a[1]);List<ServerPlayer> players=players(c,a[0]);for(var p:players)p.sendSystemMessage(value,false);return players.size();}
    public static int say(Frame c,String... args) throws Exception {return tellraw(c,"@a",com.google.gson.JsonParser.parseString("\""+String.join(" ",args).replace("\"","\\\"")+"\"").toString());}
    public static int title(Frame c,String... args) throws Exception {String[] a=c.expand(args);var targets=players(c,a[0]);for(var p:targets)switch(a[1]){case "clear","reset"->p.connection.send(new ClientboundClearTitlesPacket(a[1].equals("reset")));case "times"->p.connection.send(new ClientboundSetTitlesAnimationPacket(Integer.parseInt(a[2]),Integer.parseInt(a[3]),Integer.parseInt(a[4])));case "title"->p.connection.send(new ClientboundSetTitleTextPacket(text(c,a[2])));case "subtitle"->p.connection.send(new ClientboundSetSubtitleTextPacket(text(c,a[2])));case "actionbar"->p.connection.send(new ClientboundSetActionBarTextPacket(text(c,a[2])));default->throw new IllegalArgumentException(a[1]);}return targets.size();}
    public static int playsound(Frame c,String... args) throws Exception {String[] a=c.expand(args);var sound=Holder.direct(SoundEvent.createVariableRangeEvent(Identifier.parse(a[0])));SoundSource source=SoundSource.valueOf(a[1].toUpperCase(Locale.ROOT));var targets=players(c,a[2]);Vec3 pos=a.length>5?position(c,a,3):c.source().getPosition();float volume=a.length>6?Float.parseFloat(a[6]):1,pitch=a.length>7?Float.parseFloat(a[7]):1;float minimum=a.length>8?Float.parseFloat(a[8]):0;int n=0;for(var p:targets){Vec3 location=pos;float v=volume;double distance=p.position().distanceToSqr(pos);double range=sound.value().getRange(volume);if(distance>range*range){if(minimum<=0)continue;location=p.position().add(pos.subtract(p.position()).normalize().scale(2));v=minimum;}p.connection.send(new ClientboundSoundPacket(sound,source,location.x,location.y,location.z,v,pitch,c.source().getLevel().random.nextLong()));n++;}return n;}
    public static int stopsound(Frame c,String... args) throws Exception {String[] a=c.expand(args);var targets=players(c,a[0]);SoundSource source=a.length>1&&!a[1].equals("*")?SoundSource.valueOf(a[1].toUpperCase(Locale.ROOT)):null;Identifier sound=a.length>2?Identifier.parse(a[2]):null;for(var p:targets)p.connection.send(new ClientboundStopSoundPacket(sound,source));return targets.size();}
    public static ItemStack stack(Frame c,String spec,int count) throws Exception {var parsed=new ItemParser(c.source().registryAccess()).parse(new StringReader(Schema.itemSpec(spec)));return new ItemInput(parsed.item(),parsed.components()).createItemStack(count,false);}
    public static int give(Frame c,String... args) throws Exception {String[] a=c.expand(args);var targets=players(c,a[0]);for(var p:targets){ItemStack item=stack(c,a[1],a.length>2?Integer.parseInt(a[2]):1);if(!p.getInventory().add(item))p.drop(item,false);}return targets.size();}
    public static Predicate<ItemStack> itemPredicate(Frame c,String spec) throws Exception {return ItemPredicateArgument.itemPredicate(net.minecraft.commands.CommandBuildContext.simple(c.source().registryAccess(),c.source().getLevel().enabledFeatures())).parse(new StringReader(Schema.itemSpec(spec)));}
    public static int clear(Frame c,String... args) throws Exception {String[] a=c.expand(args);var targets=players(c,a.length>0?a[0]:"@s");Predicate<ItemStack> predicate=a.length>1?itemPredicate(c,a[1]):s -> true;int n=0;int max=a.length>2?Integer.parseInt(a[2]):-1;for(var p:targets){n+=p.getInventory().clearOrCountMatchingItems(predicate,max,p.inventoryMenu.getCraftSlots());p.containerMenu.broadcastChanges();}return n;}
    public static int item(Frame c,String... args) throws Exception {String[] a=c.expand(args);if(!a[0].equals("replace"))throw new UnsupportedOperationException("item "+a[0]);int offset=a[1].equals("entity")?4:6;int slot=SlotArgument.slot().parse(new StringReader(a[offset-1]));if(a[offset].equals("with")){ItemStack value=stack(c,a[offset+1],a.length>offset+2?Integer.parseInt(a[offset+2]):1);if(a[1].equals("entity")){int n=0;for(Entity e:entities(c,a[2]))if(e.getSlot(slot).set(value.copy()))n++;return n;}var e=c.source().getLevel().getBlockEntity(blockPos(c,a,2));if(e instanceof Container container&&slot<container.getContainerSize()){container.setItem(slot,value);return 1;}return 0;}if(a[offset].equals("from")){int sourceSlot=SlotArgument.slot().parse(new StringReader(a[offset+3]));ItemStack value;if(a[offset+1].equals("entity"))value=entity(c,a[offset+2]).getSlot(sourceSlot).get().copy();else {var e=c.source().getLevel().getBlockEntity(blockPos(c,a,offset+2));value=((Container)e).getItem(sourceSlot).copy();}int n=0;for(Entity e:entities(c,a[2]))if(e.getSlot(slot).set(value.copy()))n++;return n;}throw new IllegalArgumentException(a[offset]);}
    public static int ride(Frame c,String... args) throws Exception {String[] a=c.expand(args);Entity rider=entity(c,a[0]);if(a[1].equals("dismount")){rider.stopRiding();return 1;}return rider.startRiding(entity(c,a[2]),true,true)?1:0;}
    public static int team(Frame c,String... args) throws Exception {String[] a=c.expand(args);var board=c.source().getServer().getScoreboard();switch(a[0]){case "add"->{if(board.getPlayerTeam(a[1])==null)board.addPlayerTeam(a[1]);}case "join"->{var team=board.getPlayerTeam(a[1]);for(var h:holders(c,a.length>2?a[2]:"@s"))board.addPlayerToTeam(h.getScoreboardName(),team);}case "leave"->{for(var h:holders(c,a[1]))board.removePlayerFromTeam(h.getScoreboardName());}case "modify"->{var team=board.getPlayerTeam(a[1]);switch(a[2]){case "collisionRule"->team.setCollisionRule(Team.CollisionRule.valueOf(a[3].toUpperCase(Locale.ROOT)));case "seeFriendlyInvisibles"->team.setSeeFriendlyInvisibles(Boolean.parseBoolean(a[3]));case "friendlyFire"->team.setAllowFriendlyFire(Boolean.parseBoolean(a[3]));default->throw new IllegalArgumentException(a[2]);}}default->throw new IllegalArgumentException(a[0]);}return 1;}
    public static int gamemode(Frame c,String... args) throws Exception {String[] a=c.expand(args);var targets=players(c,a.length>1?a[1]:"@s");for(var p:targets)p.setGameMode(GameType.byName(a[0]));return targets.size();}
    public static int difficulty(Frame c,String... args){c.source().getServer().setDifficulty(Difficulty.byName(c.expand(args[0])),true);return 1;}
    public static int weather(Frame c,String... args) throws Exception {String[] a=c.expand(args);var level=c.source().getServer().overworld();int duration=a.length>1?TimeArgument.time(1).parse(new StringReader(a[1])):(a[0].equals("clear")?ServerLevel.RAIN_DELAY:a[0].equals("thunder")?ServerLevel.THUNDER_DURATION:ServerLevel.RAIN_DURATION).sample(level.random);boolean raining=!a[0].equals("clear"),thunder=a[0].equals("thunder");level.setWeatherParameters(raining?0:duration,raining?duration:0,raining,thunder);return a.length>1?duration:-1;}
    public static int time(Frame c,String... args){String[] a=c.expand(args);long value=switch(a[1]){case "day"->1000;case "noon"->6000;case "night"->13000;case "midnight"->18000;default->Long.parseLong(a[1]);};for(var level:c.source().getServer().getAllLevels())level.setDayTime(a[0].equals("add")?level.getDayTime()+value:value);return (int)value;}
    public static int xp(Frame c,String... args) throws Exception {String[] a=c.expand(args);var targets=players(c,a[1]);for(var p:targets){int value=Integer.parseInt(a[2]);boolean levels=a.length>3&&a[3].equals("levels");if(a[0].equals("add")){if(levels)p.giveExperienceLevels(value);else p.giveExperiencePoints(value);}else if(levels)p.setExperienceLevels(value);else p.setExperiencePoints(value);}return targets.size();}
    public static int bossbar(Frame c,String... args) throws Exception {String[] a=c.expand(args);var bars=c.source().getServer().getCustomBossEvents();var id=Identifier.parse(a[1]);if(a[0].equals("add")){if(bars.get(id)==null)bars.create(id,DragonBossBar.matches(id)?DragonBossBar.name(a[2]):text(c,a[2]));return 1;}var event=bars.get(id);if(event==null)throw new IllegalArgumentException("bossbar "+a[1]);DragonBossBar.refresh(id,event);switch(a[2]){case "players"->event.setPlayers(a.length>3?players(c,a[3]):List.of());case "value"->event.setValue(Integer.parseInt(a[3]));case "max"->event.setMax(Integer.parseInt(a[3]));case "visible"->event.setVisible(Boolean.parseBoolean(a[3]));case "name"->event.setName(DragonBossBar.matches(id)?DragonBossBar.name(a[3]):text(c,a[3]));case "color"->event.setColor(DragonBossBar.color(id,a[3]));case "style"->event.setOverlay(BossEvent.BossBarOverlay.valueOf(a[3].toUpperCase(Locale.ROOT)));default->throw new IllegalArgumentException(a[2]);}return 1;}
    public static int attribute(Frame c,String... args) throws Exception {String[] a=c.expand(args);Entity e=entity(c,a[0]);if(!(e instanceof LivingEntity l))return 0;String id=a[1].replace("generic.","").replace("player.","");var attribute=BuiltInRegistries.ATTRIBUTE.get(Identifier.parse(id)).orElseThrow();var instance=l.getAttribute(attribute);if(instance==null)return 0;if(a[2].equals("base")){if(a[3].equals("set")){instance.setBaseValue(Double.parseDouble(a[4]));return 1;}return(int)(instance.getBaseValue()*(a.length>4?Double.parseDouble(a[4]):1));}if(a[2].equals("get"))return(int)(instance.getValue()*(a.length>3?Double.parseDouble(a[3]):1));throw new UnsupportedOperationException("attribute "+a[2]);}
    public static int forceload(Frame c,String... args) throws Exception {String[] a=c.expand(args);if(a[0].equals("remove")&&a[1].equals("all")){for(long chunk:c.source().getLevel().getForceLoadedChunks().toLongArray()){var p=new ChunkPos(chunk);c.source().getLevel().setChunkForced(p.x,p.z,false);}return 1;}var p=ColumnPosArgument.columnPos().parse(new StringReader(a[1]+" "+a[2])).getBlockPos(c.source());var q=a.length>4?ColumnPosArgument.columnPos().parse(new StringReader(a[3]+" "+a[4])).getBlockPos(c.source()):p;int n=0;for(int x=Math.min(p.getX(),q.getX())>>4;x<=Math.max(p.getX(),q.getX())>>4;x++)for(int z=Math.min(p.getZ(),q.getZ())>>4;z<=Math.max(p.getZ(),q.getZ())>>4;z++)if(c.source().getLevel().setChunkForced(x,z,a[0].equals("add")))n++;return n;}
    public static boolean compareBlocks(Frame c,String[] a) throws Exception {
        BlockPos first=blockPos(c,a,1),last=blockPos(c,a,4),destination=blockPos(c,a,7);
        BlockPos min=new BlockPos(Math.min(first.getX(),last.getX()),Math.min(first.getY(),last.getY()),Math.min(first.getZ(),last.getZ()));
        for(BlockPos p:BlockPos.betweenClosed(first,last)){BlockState state=c.source().getLevel().getBlockState(p);if(a[10].equals("masked")&&state.isAir())continue;BlockPos q=destination.offset(p.getX()-min.getX(),p.getY()-min.getY(),p.getZ()-min.getZ());if(!state.equals(c.source().getLevel().getBlockState(q)))return false;var src=c.source().getLevel().getBlockEntity(p);var dst=c.source().getLevel().getBlockEntity(q);if((src==null)!=(dst==null))return false;if(src!=null&&!src.saveWithoutMetadata(c.source().registryAccess()).equals(dst.saveWithoutMetadata(c.source().registryAccess())))return false;}return true;
    }
    public static int cloneBlocks(Frame c,String... args) throws Exception {
        String[] a=c.expand(args);BlockPos first=blockPos(c,a,0),last=blockPos(c,a,3),destination=blockPos(c,a,6);var level=c.source().getLevel();BlockPos min=new BlockPos(Math.min(first.getX(),last.getX()),Math.min(first.getY(),last.getY()),Math.min(first.getZ(),last.getZ()));
        record Copy(BlockPos from,BlockPos to,BlockState state,CompoundTag data){}List<Copy> copy=new ArrayList<>();String mode=a.length>9?a[9]:"replace";boolean move=a.length>10&&a[a.length-1].equals("move");
        for(BlockPos p:BlockPos.betweenClosed(first,last)){BlockState state=level.getBlockState(p);if(mode.equals("masked")&&state.isAir())continue;if(mode.equals("filtered")&&!blockMatches(c,p,a[10]))continue;var e=level.getBlockEntity(p);copy.add(new Copy(p.immutable(),destination.offset(p.getX()-min.getX(),p.getY()-min.getY(),p.getZ()-min.getZ()),state,e==null?null:e.saveWithoutMetadata(level.registryAccess())));}
        if(move)for(var entry:copy)level.setBlock(entry.from(),Blocks.AIR.defaultBlockState(),3);
        for(var entry:copy){var existing=level.getBlockEntity(entry.to());if(existing instanceof Container container)container.clearContent();level.setBlock(entry.to(),Blocks.BARRIER.defaultBlockState(),2);}
        for(var entry:copy){level.setBlock(entry.to(),entry.state(),2);if(entry.data()!=null){var e=level.getBlockEntity(entry.to());if(e!=null){e.loadWithComponents(TagValueInput.create(ProblemReporter.DISCARDING,level.registryAccess(),entry.data()));e.setChanged();}}}
        for(var entry:copy)level.updateNeighborsAt(entry.to(),entry.state().getBlock());return copy.size();
    }
    public static int place(Frame c,String... args) throws Exception {
        String[] a=c.expand(args);if(!a[0].equals("template"))throw new IllegalArgumentException(a[0]);Identifier id=Identifier.parse(a[1]);
        // Arena templates must never overwrite terrain in another dimension.
        if(id.getNamespace().equals("impossible_to_survive")&&id.getPath().startsWith("end_pillar_")&&!c.source().getLevel().dimension().equals(net.minecraft.world.level.Level.END))return 0;
        var template=Content.structure(c,id);BlockPos p=a.length>4?blockPos(c,a,2):BlockPos.containing(c.source().getPosition());var settings=new net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings();
        if(a.length>5)settings.setRotation(Rotation.valueOf(a[5].toUpperCase(Locale.ROOT)));if(a.length>6)settings.setMirror(Mirror.valueOf(a[6].toUpperCase(Locale.ROOT)));if(a.length>7&&Float.parseFloat(a[7])<1)settings.addProcessor(new net.minecraft.world.level.levelgen.structure.templatesystem.BlockRotProcessor(Float.parseFloat(a[7])));
        return template.placeInWorld(c.source().getLevel(),p,p,settings,c.source().getLevel().random,2)?1:0;
    }
    public static int loot(Frame c,String... args) throws Exception {
        String[] a=c.expand(args);int index=List.of(a).lastIndexOf("loot");if(index<0)throw new IllegalArgumentException("Only source loot tables are used");var table=Content.loot(c,a[index+1]);var builder=new net.minecraft.world.level.storage.loot.LootParams.Builder(c.source().getLevel()).withParameter(net.minecraft.world.level.storage.loot.parameters.LootContextParams.ORIGIN,c.source().getPosition()).withOptionalParameter(net.minecraft.world.level.storage.loot.parameters.LootContextParams.THIS_ENTITY,c.source().getEntity());var items=table.getRandomItems(builder.create(net.minecraft.world.level.storage.loot.parameters.LootContextParamSets.COMMAND));
        switch(a[0]){case "give"->{for(var player:players(c,a[1]))for(ItemStack value:items){ItemStack copy=value.copy();if(!player.getInventory().add(copy))player.drop(copy,false);}}case "spawn"->{Vec3 p=position(c,a,1);for(var value:items)c.source().getLevel().addFreshEntity(new net.minecraft.world.entity.item.ItemEntity(c.source().getLevel(),p.x,p.y,p.z,value.copy()));}case "replace"->{if(a[1].equals("entity")){int slot=SlotArgument.slot().parse(new StringReader(a[3]));for(var e:entities(c,a[2]))for(int i=0;i<items.size();i++)e.getSlot(slot+i).set(items.get(i).copy());}else{var block=c.source().getLevel().getBlockEntity(blockPos(c,a,2));if(block instanceof Container container){int slot=SlotArgument.slot().parse(new StringReader(a[5]));for(int i=0;i<items.size()&&slot+i<container.getContainerSize();i++)container.setItem(slot+i,items.get(i).copy());}}}default->throw new IllegalArgumentException(a[0]);}return items.size();
    }
    public static int advancement(Frame c,String... args) {
        // These seven rewards are repeatable Java event callbacks; no advancement progress is created.
        return 1;
    }
    public static int locate(Frame c,String... args) throws Exception {
        String[] a=c.expand(args);if(!a[0].equals("structure"))throw new IllegalArgumentException(a[0]);var registry=c.source().registryAccess().lookupOrThrow(Registries.STRUCTURE);HolderSet<net.minecraft.world.level.levelgen.structure.Structure> set=a[1].startsWith("#")?registry.getOrThrow(net.minecraft.tags.TagKey.create(Registries.STRUCTURE,Identifier.parse(a[1].substring(1)))):HolderSet.direct(registry.getOrThrow(ResourceKey.create(Registries.STRUCTURE,Identifier.parse(a[1]))));BlockPos pos=BlockPos.containing(c.source().getPosition());var result=c.source().getLevel().getChunkSource().getGenerator().findNearestMapStructure(c.source().getLevel(),set,pos,100,false);if(result==null)return 0;long dx=result.getFirst().getX()-pos.getX(),dz=result.getFirst().getZ()-pos.getZ();return(int)Math.floor(Math.sqrt(dx*dx+dz*dz));
    }
    public static int spreadplayers(Frame c,String... args) throws Exception {
        String[] a=c.expand(args);Vec3 origin=c.source().getPosition();double x=a[0].startsWith("~")?origin.x+(a[0].length()==1?0:Double.parseDouble(a[0].substring(1))):Double.parseDouble(a[0]),z=a[1].startsWith("~")?origin.z+(a[1].length()==1?0:Double.parseDouble(a[1].substring(1))):Double.parseDouble(a[1]);double separation=Double.parseDouble(a[2]),range=Double.parseDouble(a[3]);var targets=entities(c,a[5]);List<Vec3> placed=new ArrayList<>();var level=c.source().getLevel();
        for(Entity e:targets){boolean found=false;for(int attempt=0;attempt<10000;attempt++){double px=x+(level.random.nextDouble()*2-1)*range,pz=z+(level.random.nextDouble()*2-1)*range;int py=level.getHeight(net.minecraft.world.level.levelgen.Heightmap.Types.MOTION_BLOCKING,(int)Math.floor(px),(int)Math.floor(pz));var ground=level.getBlockState(BlockPos.containing(px,py-1,pz));if(!ground.getFluidState().isEmpty()||ground.is(net.minecraft.tags.BlockTags.FIRE))continue;Vec3 p=new Vec3(Math.floor(px)+0.5,py,Math.floor(pz)+0.5);boolean close=false;for(var previous:placed)if(previous.distanceTo(p)<separation){close=true;break;}if(close)continue;e.teleportTo(level,p.x,p.y,p.z,Set.of(),e.getYRot(),e.getXRot(),true);placed.add(p);found=true;break;}if(!found)throw new IllegalStateException("No safe spread position");}return targets.size();
    }
    public static int gamerule(Frame c,String... args) throws Exception {
        String[] a=c.expand(args);String key=switch(a[0]){case "doDaylightCycle"->"advance_time";case "doMobSpawning"->"spawn_mobs";case "maxCommandChainLength"->"max_command_sequence_length";case "disableElytraMovementCheck"->"elytra_movement_check";default->a[0].replaceAll("([a-z])([A-Z])","$1_$2").toLowerCase(Locale.ROOT);};var rule=BuiltInRegistries.GAME_RULE.getValue(Identifier.withDefaultNamespace(key));return gameRule(c,rule,a.length>1?(a[0].equals("disableElytraMovementCheck")?Boolean.toString(!Boolean.parseBoolean(a[1])):a[1]):null);
    }
    private static <T> int gameRule(Frame c,net.minecraft.world.level.gamerules.GameRule<T> rule,String value){var rules=c.source().getLevel().getGameRules();if(value!=null)rules.set(rule,rule.deserialize(value).getOrThrow(),c.source().getServer());return rule.getCommandResult(rules.get(rule));}
}

