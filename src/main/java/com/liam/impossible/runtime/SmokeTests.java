package com.liam.impossible.runtime;

import net.minecraft.server.MinecraftServer;
import net.minecraft.nbt.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;
import org.slf4j.LoggerFactory;

/** Runs only in the dedicated disposable smoke world, never normal worlds. */
public final class SmokeTests {
    public static void run(MinecraftServer server){
        int passed=0;Frame c=new Frame(server.createCommandSourceStack().withPosition(new Vec3(0,100,0)));
        try {
            Native.kill(c,"@e[tag=aj.rig_entity]");
            check(server.getScoreboard().getObjective("mcm.its.overall_difficulty")!=null,"overall difficulty initialization");passed++;
            Native.scoreboard(c,"objectives","add","native_test","dummy");
            Native.scoreboard(c,"players","set","#test","native_test","17");
            Native.scoreboard(c,"players","set","#divisor","native_test","5");
            Native.scoreboard(c,"players","operation","#test","native_test","/=","#divisor","native_test");
            check(Native.scoreInfo(c,"#test","native_test").value()==3,"score arithmetic");passed++;
            int condition=Control.run(c,x->42,Control.when("score","#test","native_test","matches","3"));check(condition==42,"compiled branching");passed++;
            Native.data(c,"modify","storage","impossible_difficulty:test","values","set","value","{a:3,b:[1,2]}");
            Native.data(c,"modify","storage","impossible_difficulty:test","values.b","append","value","4");
            check(Native.data(c,"get","storage","impossible_difficulty:test","values.b")==3,"NBT list operation");passed++;
            Native.summon(c,"item_display","~","~","~","{Tags:[native_test],item:{id:'minecraft:green_dye',count:1,components:{'minecraft:custom_model_data':1}},transformation:{scale:[1f,1f,1f]}}");
            Entity display=Native.entity(c,"@e[tag=native_test,type=item_display,limit=1]");
            Native.data(c,"merge","entity","@e[tag=native_test,limit=1]","{transformation:[1f,0f,0f,2f,0f,1f,0f,3f,0f,0f,1f,4f,0f,0f,0f,1f],start_interpolation:0}");
            check(display.getType()==EntityType.ITEM_DISPLAY,"animated display creation");passed++;
            Native.summon(c,"armor_stand","~","~","~","{Tags:[native_test_armor],ArmorItems:[{},{},{},{id:'minecraft:iron_nugget',count:1,components:{'minecraft:custom_model_data':2}}]}");
            Entity stand=Native.entity(c,"@e[tag=native_test_armor,limit=1]");check(((LivingEntity)stand).getItemBySlot(EquipmentSlot.HEAD).is(Items.IRON_NUGGET),"legacy equipment migration");passed++;
            check(Predicates.test(c,"mcm:random/100_percent"),"compiled probability predicate");passed++;
            var loot=Content.loot(c,"impossible_to_survive:lore_book_closed");check(loot!=null,"native loot decoding");passed++;
            var structure=Content.structure(c,net.minecraft.resources.Identifier.parse("impossible_to_survive:end_pillar_size_1_level_2"));check(structure.getSize().getY()>0,"structure decoding");passed++;
            check(Native.stack(c,"green_dye[custom_model_data=17]",1).is(Items.GREEN_DYE),"item component migration");passed++;
            Control.run(c,x->Native.scoreboard(x,"players","set","#zero","native_test","0"),Control.store("success","score","#success","native_test"));check(Native.scoreInfo(c,"#success","native_test").value()==1,"zero result remains successful");passed++;
            int lootCount=Content.validate(c);check(lootCount==9,"all nine active item loot tables after removing challenge icons");passed++;
            check(Native.stack(c,"written_book[written_book_content={title:'Admin',author:'LIAM',pages:['{\"text\":\"Start\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/function impossible_to_survive:challenge/start\"}}']}]",1).is(Items.WRITTEN_BOOK),"native book action conversion");passed++;
            Logic.call(c,"animated_java:baby_golem/summon","{args:{animation:'animation_baby_golem_idle',start_animation:true}}");
            Entity rig=Native.entity(c,"@e[tag=aj.baby_golem.root,type=item_display,limit=1]");
            Frame rigContext=c.with(c.source().withEntity(rig).withPosition(rig.position()));
            check(rig.getPassengers().size()>=7,"original rig skeleton");passed++;
            Logic.call(rigContext,"animated_java:baby_golem/animations/animation_baby_golem_idle/apply_frame","{frame:0}");
            check(Native.entityData(rig.getPassengers().get(1)).contains("transformation"),"compiled animation pose");passed++;
            Native.kill(c,"@e[tag=aj.rig_entity]");
            check(Native.itemPredicate(c,"brick[custom_data~{ZombieKillPoint:1b}]").test(Native.stack(c,"brick[custom_data={ZombieKillPoint:1b}]",1)),"custom item filter");passed++;
            check(!Native.itemPredicate(c,"brick[custom_data~{ZombieKillPoint:1b}]").test(new net.minecraft.world.item.ItemStack(Items.BRICK)),"custom item filter keeps ordinary bricks");passed++;
            var chanceTag=Schema.upgrade(Native.compound("{ArmorDropChances:[0f,0f,0f,0f],HandDropChances:[0f,0f]}"));
            check(chanceTag.getCompoundOrEmpty("drop_chances").size()==6,"equipment drop chances migration");passed++;
            passed+=rigSamples(c);
            passed+=RigLifecycleSmokeTests.run(c);
            passed+=sourceFormats(c);
            passed+=playerEvents(server,c);
            passed+=variantEvents(c);
            passed+=configOptions(server,c);
            passed+=chestEvents(server,c);
            passed+=utilityClouds(c);
            passed+=localizedText(c);
            passed+=guideBook(server,c);
            passed+=coalExplosions(server,c);
            passed+=MechanicsFixSmokeTests.run(c);
            passed+=CleanupSmokeTests.run(c);
            passed+=DragonArtifactSmokeTests.run(server);
            passed+=DragonSmokeTests.run(server);
            Native.kill(c,"@e[tag=native_test]");Native.kill(c,"@e[tag=native_test_armor]");
            LoggerFactory.getLogger("impossible_difficulty").info("NATIVE_SMOKE_PASS: {} assertions",passed);
        } catch(Exception e){LoggerFactory.getLogger("impossible_difficulty").error("NATIVE_SMOKE_FAIL after {} assertions",passed,e);}
        server.halt(false);
    }
    private static void check(boolean condition,String message){if(!condition)throw new IllegalStateException(message);}
    private static int coalExplosions(MinecraftServer server,Frame c) throws Exception {
        var level=server.overworld();var rules=level.getGameRules();
        var rule=net.minecraft.world.level.gamerules.GameRules.MOB_GRIEFING;
        boolean savedGriefing=rules.get(rule);
        int savedDifficulty=Native.scoreInfo(c,"#global","mcm.its.overall_difficulty").value();
        var profile=new com.mojang.authlib.GameProfile(java.util.UUID.randomUUID(),"CoalSmoke");
        var player=new net.minecraft.server.level.ServerPlayer(server,level,profile,net.minecraft.server.level.ClientInformation.createDefault());
        var packets=new java.util.ArrayList<net.minecraft.network.protocol.Packet<?>>();
        var connection=new net.minecraft.network.Connection(net.minecraft.network.protocol.PacketFlow.SERVERBOUND){
            @Override public void send(net.minecraft.network.protocol.Packet<?> packet,io.netty.channel.ChannelFutureListener listener,boolean flush){packets.add(packet);}
        };
        new net.minecraft.server.network.ServerGamePacketListenerImpl(server,connection,player,net.minecraft.server.network.CommonListenerCookie.createInitial(profile,false));
        player.snapTo(14.5,110,14.5,0,0);player.setInvulnerable(true);
        server.getPlayerList().getPlayers().add(player);level.addNewPlayer(player);
        var position=new Vec3(7.5,110.4,7.5);var woolPos=new BlockPos(8,110,7);var savedBlock=level.getBlockState(woolPos);
        int passed=0;
        try {
            for(int difficulty=1;difficulty<=3;difficulty++)for(boolean griefing:new boolean[]{true,false}){
                Native.setScore(c,"#global","mcm.its.overall_difficulty",difficulty);rules.set(rule,griefing,server);
                level.setBlock(woolPos,net.minecraft.world.level.block.Blocks.WHITE_WOOL.defaultBlockState(),3);
                var coal=new net.minecraft.world.entity.item.ItemEntity(level,position.x,position.y,position.z,new net.minecraft.world.item.ItemStack(Items.COAL));
                coal.addTag("coalExplosion");coal.addTag("native_coal_test");coal.setOnGround(true);level.addFreshEntity(coal);
                var target=EntityType.COW.create(level,EntitySpawnReason.COMMAND);
                target.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).setBaseValue(200);target.setHealth(200);
                target.addTag("native_coal_test");target.snapTo(6,110.4,7.5,0,0);level.addFreshEntity(target);
                Frame context=new Frame(c.source().withEntity(coal).withPosition(position));
                Native.setScore(context,"@s","coalTimer",0);packets.clear();
                for(int tick=0;tick<50;tick++)Logic.call(context,"impossible_to_survive:features/coal/timer");
                check(!coal.isRemoved()&&packets.stream().noneMatch(packet->packet instanceof net.minecraft.network.protocol.game.ClientboundExplodePacket),"coal keeps its countdown before explosion");passed++;
                check(Native.entities(context,"@e[tag=coal_display,distance=..2]").size()==1,"coal countdown display exists");passed++;
                long creepers=Native.entities(c,"@e[type=creeper]").size();
                Logic.call(context,"impossible_to_survive:features/coal/timer");
                var explosions=packets.stream().filter(packet->packet instanceof net.minecraft.network.protocol.game.ClientboundExplodePacket).map(packet->(net.minecraft.network.protocol.game.ClientboundExplodePacket)packet).toList();
                check(explosions.size()==1,"coal sends one immediate explosion packet");passed++;
                var explosion=explosions.getFirst();
                check(explosion.radius()==difficulty+1&&explosion.center().equals(position),"coal explosion strength and item origin");passed++;
                check(explosion.explosionParticle().getType()==(griefing?net.minecraft.core.particles.ParticleTypes.EXPLOSION_EMITTER:net.minecraft.core.particles.ParticleTypes.EXPLOSION),"coal uses vanilla explosion particles for block interaction");passed++;
                check(explosion.explosionSound().equals(net.minecraft.sounds.SoundEvents.GENERIC_EXPLODE),"coal uses vanilla explosion sound");passed++;
                check(target.getHealth()<200&&target.getDeltaMovement().lengthSqr()>0,"coal explosion deals damage and knockback");passed++;
                check(griefing?level.getBlockState(woolPos).isAir():level.getBlockState(woolPos).is(net.minecraft.world.level.block.Blocks.WHITE_WOOL),"coal honors mobGriefing block destruction");passed++;
                check(coal.isRemoved()&&Native.entities(c,"@e[type=creeper]").size()==creepers,"coal is consumed without spawning creeper");passed++;
                for(Entity display:Native.entities(context,"@e[tag=coal_display,distance=..2]")){
                    Logic.call(new Frame(c.source().withEntity(display).withPosition(display.position())),"impossible_to_survive:features/coal/timer_display_loop");
                    check(display.isRemoved(),"coal countdown display clears after explosion");passed++;
                }
                target.discard();
                for(Entity drop:Native.entities(context,"@e[type=item,distance=..10]"))drop.discard();
            }
        } finally {
            rules.set(rule,savedGriefing,server);Native.setScore(c,"#global","mcm.its.overall_difficulty",savedDifficulty);
            level.setBlock(woolPos,savedBlock,3);server.getPlayerList().getPlayers().remove(player);player.discard();
            Native.kill(c,"@e[tag=native_coal_test]");
            Native.kill(new Frame(c.source().withPosition(position)),"@e[tag=coal_display,distance=..2]");
        }
        LoggerFactory.getLogger("impossible_difficulty").info("COAL_EXPLOSION_PASS: {} assertions; countdown, all three strengths, damage, knockback, particles/sound, mobGriefing, no creeper",passed);
        return passed;
    }
    private static int guideBook(MinecraftServer server,Frame c) throws Exception {
        var profile=new com.mojang.authlib.GameProfile(java.util.UUID.randomUUID(),"GuideSmoke");
        var player=new net.minecraft.server.level.ServerPlayer(server,server.overworld(),profile,net.minecraft.server.level.ClientInformation.createDefault());
        var connection=new net.minecraft.network.Connection(net.minecraft.network.protocol.PacketFlow.SERVERBOUND);
        new net.minecraft.server.network.ServerGamePacketListenerImpl(server,connection,player,net.minecraft.server.network.CommonListenerCookie.createInitial(profile,false));
        player.snapTo(0.5,100,0.5,0,0);player.addTag("guide_test");
        server.getPlayerList().getPlayers().add(player);
        Frame context=new Frame(c.source().withEntity(player).withPosition(player.position()));
        var dispatcher=server.getCommands().getDispatcher();int passed=0;
        try {
            player.setItemSlot(EquipmentSlot.MAINHAND,new net.minecraft.world.item.ItemStack(Items.DIAMOND));
            check(dispatcher.execute("impossible guide",context.source())==1,"guide command gives to self");passed++;
            check(player.getMainHandItem().is(Items.DIAMOND)&&player.getInventory().getItem(1).is(Items.WARPED_FUNGUS_ON_A_STICK),"guide is added without replacing held item");passed++;
            check(Native.scoreInfo(context,"@s","mcm.its.dragon.guide_unlocked").value()==1,"issued guide is recorded as unlocked");passed++;
            player.getInventory().clearContent();
            check(dispatcher.execute("impossible guide @a[tag=guide_test]",c.source())==1&&player.getMainHandItem().is(Items.WARPED_FUNGUS_ON_A_STICK),"console can issue guide to selected players");passed++;
            boolean needsPlayer=false;
            try{dispatcher.execute("impossible guide",c.source());}catch(com.mojang.brigadier.exceptions.CommandSyntaxException expected){needsPlayer=true;}
            check(needsPlayer,"console self command requires a player");passed++;
            for(var mode:java.util.List.of(net.minecraft.world.level.GameType.SURVIVAL,net.minecraft.world.level.GameType.CREATIVE)){
                player.setGameMode(mode);
                player.getInventory().clearContent();GuideBook.give(player);
                for(float expected:new float[]{8f,9f,10f}){
                    Native.setScore(context,"@s","wfoas_click_cd",0);
                    player.getMainHandItem().getItem().use(server.overworld(),player,net.minecraft.world.InteractionHand.MAIN_HAND);
                    Logic.call(context,"impossible_to_survive:player/tick/1t");
                    check(player.getMainHandItem().get(net.minecraft.core.component.DataComponents.CUSTOM_MODEL_DATA).getFloat(0)==expected,"real item use turns guide page "+expected+" in "+mode);passed++;
                    check(Native.scoreInfo(context,"@s","mcm.use_wfoas").value()==0,"guide use is consumed by player tick");passed++;
                    player.getMainHandItem().getItem().use(server.overworld(),player,net.minecraft.world.InteractionHand.MAIN_HAND);
                    Logic.call(context,"impossible_to_survive:player/tick/1t");
                    check(player.getMainHandItem().get(net.minecraft.core.component.DataComponents.CUSTOM_MODEL_DATA).getFloat(0)==expected,"guide cooldown prevents repeated turn");passed++;
                }
            }
            Native.setScore(context,"@s","wfoas_click_cd",0);
            player.setItemSlot(EquipmentSlot.MAINHAND,Native.stack(context,"warped_fungus_on_a_stick[custom_model_data=10]",1));
            Logic.call(context,"impossible_to_survive:dragon_book/zzz/0");
            check(player.getMainHandItem().get(net.minecraft.core.component.DataComponents.CUSTOM_MODEL_DATA).getFloat(0)==10f,"ordinary item with matching model is not treated as guide");passed++;
            player.setGameMode(net.minecraft.world.level.GameType.SURVIVAL);
            for(int slot=0;slot<36;slot++)player.getInventory().setItem(slot,new net.minecraft.world.item.ItemStack(Items.BRICK,64));
            dispatcher.execute("impossible guide",context.source());
            check(player.getInventory().getItem(0).is(Items.BRICK)&&player.getInventory().getItem(35).getCount()==64,"full inventory contents preserved");passed++;
            var dropped=Native.entities(context,"@e[type=item,distance=..5]").stream().filter(entity->((net.minecraft.world.entity.item.ItemEntity)entity).getItem().is(Items.WARPED_FUNGUS_ON_A_STICK)).toList();
            check(dropped.size()==1,"full inventory drops issued guide nearby");passed++;
            dropped.forEach(Entity::discard);
        } finally {server.getPlayerList().getPlayers().remove(player);}
        LoggerFactory.getLogger("impossible_difficulty").info("GUIDE_BOOK_PASS: {} assertions; commands, inventory, item-use page cycle, cooldown, survival and creative",passed);
        return passed;
    }
    private static int localizedText(Frame context) throws Exception {
        int passed=0;
        var staff=Native.text(context,"{\"text\":\"Dragon Staff\",\"color\":\"dark_purple\"}");
        check(staff.getContents() instanceof net.minecraft.network.chat.contents.TranslatableContents&&staff.getStyle().getColor()!=null,"item text localizes and retains style");passed++;
        var name=Schema.upgrade(Native.compound("{CustomName:'\"Chest\"'}")).getCompoundOrEmpty("CustomName");
        check(name.contains("translate"),"literal death-message entity names localize");passed++;
        var styled=Schema.upgrade(Native.compound("{CustomName:{text:'Crystalspine',color:'dark_purple'}}")).getCompoundOrEmpty("CustomName");
        check(styled.contains("translate")&&styled.getStringOr("color","").equals("dark_purple"),"modern entity component localizes without losing style");passed++;
        var item=Native.stack(context,"warped_fungus_on_a_stick[custom_name={text:'Dragon Staff'},lore=[{text:'• Right-click to shoot a powerful laser!'}]]",1);
        check(item.getHoverName().getContents() instanceof net.minecraft.network.chat.contents.TranslatableContents,"modern item-name component localizes");passed++;
        check(item.get(net.minecraft.core.component.DataComponents.LORE).lines().getFirst().getContents() instanceof net.minecraft.network.chat.contents.TranslatableContents,"modern lore component localizes");passed++;
        var bookSpec=SourceSmokeCases.ITEMS.stream().filter(value->value.startsWith("written_book[")).findFirst().orElseThrow();
        var book=Native.stack(context,bookSpec,1).get(net.minecraft.core.component.DataComponents.WRITTEN_BOOK_CONTENT);
        check(book.author().equals("LIAM")&&!book.pages().isEmpty(),"admin book author and pages preserved");passed++;
        var page=book.pages().getFirst().raw();
        check(net.minecraft.network.chat.ComponentSerialization.CODEC.encodeStart(com.mojang.serialization.JsonOps.INSTANCE,page).getOrThrow().toString().contains("/impossible action"),"translated admin book retains working action buttons");passed++;
        var gradient=Native.text(context,"[{\"text\":\"D\",\"color\":\"green\"},{\"text\":\"ra\"},{\"text\":\"gon\"},{\"text\":\" Gu\"},{\"text\":\"ide\"},{\"text\":\" \"}]");
        check(gradient.getContents() instanceof net.minecraft.network.chat.contents.TranslatableContents,"split gradient heading translates as a whole phrase");passed++;
        var link=Schema.modernJson(com.google.gson.JsonParser.parseString("{\"text\":\" Subscribe on Youtube! \",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.youtube.com/@liamkkd\"}}"));
        check(link.getAsJsonObject().getAsJsonObject("click_event").get("url").getAsString().equals("https://www.youtube.com/@liamkkd"),"translated link retains LIAM channel");passed++;
        LoggerFactory.getLogger("impossible_difficulty").info("LOCALIZATION_PASS: component styles, death names, item names/lore, admin author/pages/actions, gradient headings, channel link");
        return passed;
    }
    private static int rigSamples(Frame c) throws Exception {
        String current="";Entity root=null;int count=0,poses=0;
        for(var sample:RigSmokeCases.ALL){
            if(!current.equals(sample.model())){
                Native.kill(c,"@e[tag=aj.rig_entity]");current=sample.model();
                check(Logic.call(c,"animated_java:"+current+"/summon","{args:{}}")>0,"summon "+current);
                root=Native.entity(c,"@e[tag=aj."+current+".root,type=item_display,limit=1]");
                root.addTag("aj.transforms_only");
            }
            Frame context=c.with(c.source().withEntity(root).withPosition(root.position()));
            check(Logic.call(context,"animated_java:"+current+"/animations/"+sample.animation()+"/apply_frame","{frame:"+sample.frame()+"}")>0,"frame invocation "+sample.animation());
            Entity marker=root.getPassengers().stream().filter(e->e.getType()==EntityType.MARKER).findFirst().orElseThrow(()->new IllegalStateException("missing data marker: "+sample.model()+" "+sample.animation()));
            CompoundTag bones=Native.entityData(marker).getCompoundOrEmpty("data").getCompoundOrEmpty("bones");
            for(var pose:sample.poses()){
                Entity bone=Native.entity(context,bones.getStringOr(pose.bone(),""));
                Tag actual=Native.entityData(bone).get("transformation"),expected=Native.compound(pose.nbt()).get("transformation");
                var matrix=com.mojang.math.Transformation.EXTENDED_CODEC.parse(NbtOps.INSTANCE,actual).getOrThrow().getMatrix();
                var original=com.mojang.math.Transformation.EXTENDED_CODEC.parse(NbtOps.INSTANCE,expected).getOrThrow().getMatrix();
                check(matrix.equals(original,0.0001f),"pose "+current+"/"+sample.animation()+"/"+sample.frame()+"/"+pose.bone());poses++;
                check(bone.getVehicle()==root,"rig passenger remains attached");
                checkModelAsset(bone);
            }
            count++;
        }
        Native.kill(c,"@e[tag=aj.rig_entity]");
        LoggerFactory.getLogger("impossible_difficulty").info("RIG_SMOKE_PASS: {} animation samples, {} bone matrices",count,poses);
        return count;
    }
    private static final java.util.Set<String> MODEL_ASSETS=new java.util.HashSet<>();
    private static void checkModelAsset(Entity bone) throws Exception {
        CompoundTag item=Native.entityData(bone).getCompoundOrEmpty("item");
        String id=item.getStringOr("id","");var floats=item.getCompoundOrEmpty("components").getCompoundOrEmpty("minecraft:custom_model_data").getListOrEmpty("floats");
        double value=floats.isEmpty()?0:((NumericTag)floats.getFirst()).doubleValue();String sample=id+"/"+value;
        if(!MODEL_ASSETS.add(sample))return;
        var identifier=net.minecraft.resources.Identifier.parse(id);
        String path="/assets/"+identifier.getNamespace()+"/items/"+identifier.getPath()+".json";
        try(var stream=modelResource(path)){
            check(stream!=null,"item definition "+sample);
            var definition=com.google.gson.JsonParser.parseReader(new java.io.InputStreamReader(stream,java.nio.charset.StandardCharsets.UTF_8)).getAsJsonObject().getAsJsonObject("model");
            var selected=definition;
            if(definition.get("type").getAsString().equals("minecraft:range_dispatch")){
                selected=definition.getAsJsonObject("fallback");
                for(var entry:definition.getAsJsonArray("entries"))if(value>=entry.getAsJsonObject().get("threshold").getAsDouble())selected=entry.getAsJsonObject().getAsJsonObject("model");
            }
            check(selected.has("model"),"rig model definition "+sample+" "+selected);
            var model=net.minecraft.resources.Identifier.parse(selected.get("model").getAsString());
            String modelPath="/assets/"+model.getNamespace()+"/models/"+model.getPath()+".json";
            try(var resource=modelResource(modelPath)){check(resource!=null,"rig model asset "+sample+" -> "+modelPath);}
        }
    }
    private static java.io.InputStream modelResource(String path) throws Exception {
        String directory=System.getProperty("impossible.smoke.resources");
        if(directory==null)return SmokeTests.class.getResourceAsStream(path);
        var file=java.nio.file.Path.of(directory).resolve(path.substring(1));
        return java.nio.file.Files.exists(file)?java.nio.file.Files.newInputStream(file):SmokeTests.class.getResourceAsStream(path);
    }
    private static int sourceFormats(Frame c) throws Exception {
        int count=0;
        for(String selector:SourceSmokeCases.SELECTORS){try{Native.entities(c,selector);}catch(Exception e){throw new IllegalStateException("selector format: "+selector,e);}count++;}
        for(String item:SourceSmokeCases.ITEMS){try{Native.stack(c,item,1);}catch(Exception e){throw new IllegalStateException("item format: "+item,e);}count++;}
        for(String item:SourceSmokeCases.FILTERS){Native.itemPredicate(c,item);count++;}
        for(String block:SourceSmokeCases.BLOCKS){net.minecraft.commands.arguments.blocks.BlockStateParser.parseForBlock(c.source().registryAccess().lookupOrThrow(net.minecraft.core.registries.Registries.BLOCK),block,true);count++;}
        for(String particle:SourceSmokeCases.PARTICLES){try{net.minecraft.commands.arguments.ParticleArgument.readParticle(new com.mojang.brigadier.StringReader(Schema.particleSpec(particle)),c.source().registryAccess());}catch(Exception e){throw new IllegalStateException("particle format: "+particle,e);}count++;}
        for(String text:SourceSmokeCases.TEXTS){try{Native.text(c,text);}catch(Exception e){throw new IllegalStateException("text format: "+text,e);}count++;}
        for(String type:SourceSmokeCases.ENTITY_TYPES){check(net.minecraft.core.registries.BuiltInRegistries.ENTITY_TYPE.getOptional(net.minecraft.resources.Identifier.parse(type)).isPresent(),"entity type "+type);count++;}
        LoggerFactory.getLogger("impossible_difficulty").info("SOURCE_FORMAT_PASS: {} definitions",count);return count;
    }
    private static int playerEvents(MinecraftServer server,Frame c) throws Exception {
        var profile=new com.mojang.authlib.GameProfile(java.util.UUID.randomUUID(),"NativeSmoke");
        var player=new net.minecraft.server.level.ServerPlayer(server,server.overworld(),profile,net.minecraft.server.level.ClientInformation.createDefault());
        var connection=new net.minecraft.network.Connection(net.minecraft.network.protocol.PacketFlow.SERVERBOUND);
        new net.minecraft.server.network.ServerGamePacketListenerImpl(server,connection,player,net.minecraft.server.network.CommonListenerCookie.createInitial(profile,false));
        player.snapTo(0.5,100,0.5,0,0);
        player.addTag("survivor");
        Frame context=new Frame(c.source().withEntity(player).withPosition(player.position()));
        server.getPlayerList().getPlayers().add(player);
        try {
            player.setXRot(35);
            context=new Frame(c.source().withEntity(player).withPosition(player.position()).withRotation(player.getRotationVector()));
            server.overworld().setBlock(new BlockPos(0,100,2),net.minecraft.world.level.block.Blocks.CRAFTING_TABLE.defaultBlockState(),3);
            for(int i=0;i<24;i++) {
                Logic.call(context,"impossible_to_survive:features/crafting_table/crafting_table_check");
                for(Entity cloud:Native.entities(context,"@e[tag=crafting_table_looked_aec]")) for(int tick=0;tick<5;tick++)cloud.tick();
            }
            check(Native.entities(context,"@e[tag=aj.crafting_table_table.root]").size()==1,"crafting table gaze spawns table rig");
            check(Native.entities(context,"@e[tag=aj.crafting_table_rocket_launcher.root]").size()==1,"crafting table gaze spawns launcher rig");
            Entity table=Native.entity(context,"@e[tag=aj.crafting_table_table.root,limit=1]");
            check(table.getTags().contains("aj.crafting_table_table.animation.transform.playing"),"crafting transform starts");
            for(int i=0;i<50;i++) Logic.call(context,"animated_java:global/on_tick");
            check(table.getTags().contains("do_blade_damage"),"crafting transform enables saw damage");
            check(Native.entities(context,"@e[tag=crafting_table_looked_aec]").isEmpty(),"gaze tracking emits no cloud particles");
        } finally {
            server.getPlayerList().getPlayers().remove(player);
            Native.kill(context,"@e[tag=crafting_table_looked_aec]");
            Native.kill(context,"@e[tag=aj.rig_entity]");
            server.overworld().setBlock(new BlockPos(0,100,2),net.minecraft.world.level.block.Blocks.AIR.defaultBlockState(),3);
        }
        Native.summon(context,"wither_skeleton","~","~","~","{Tags:[native_event_test],NoAI:1b,HurtTime:10s}");
        Entity target=Native.entity(context,"@e[tag=native_event_test,limit=1]");
        net.minecraft.advancements.CriteriaTriggers.PLAYER_HURT_ENTITY.trigger(player,target,player.damageSources().playerAttack(player),1,1,false);
        check(((LivingEntity)target).getMainHandItem().is(Items.NETHERITE_SWORD),"native hit event reward");
        check(Native.scoreInfo(context.with(context.source().withEntity(target)),"@s","wither_skeleton_invis_timer").value()>0,"wither skeleton invisibility timer");
        Native.summon(context,"marker","~","~","~","{Tags:[enchanting_table_marker,native_event_test]}");
        net.minecraft.advancements.CriteriaTriggers.ENCHANTED_ITEM.trigger(player,new net.minecraft.world.item.ItemStack(Items.DIAMOND_SWORD),1);
        check(Native.entities(context,"@e[tag=aj.flying_book.root]").size()==2,"native enchant event spawns two books");
        Native.scoreboard(context,"players","enable","@s","difficulty");
        check(!Native.scoreInfo(context,"@s","difficulty").isLocked(),"original difficulty trigger enabled");
        Native.summon(context,"zombie","~","~","~","{Tags:[native_zombie_test],NoAI:1b,DeathLootTable:'impossible_to_survive:zombie_kill'}");
        LivingEntity zombie=(LivingEntity)Native.entity(context,"@e[tag=native_zombie_test,limit=1]");
        var drops=new java.util.ArrayList<net.minecraft.world.item.ItemStack>();
        zombie.dropFromLootTable(server.overworld(),player.damageSources().playerAttack(player),true,zombie.getLootTable().orElseThrow(),drops::add);
        check(drops.size()==1&&Native.itemPredicate(context,"brick[custom_data~{ZombieKillPoint:1b}]").test(drops.getFirst()),"custom zombie death reward");
        zombie.discard();
        Native.kill(context,"@e[tag=native_event_test]");Native.kill(context,"@e[tag=aj.rig_entity]");
        LoggerFactory.getLogger("impossible_difficulty").info("PLAYER_EVENT_PASS: crafting gaze, transformation, saw damage, hit, enchant, trigger, zombie reward");return 10;
    }
    private static int variantEvents(Frame c) throws Exception {
        int passed=0;
        for(String animal:java.util.List.of("cow","pig","chicken"))for(String variant:java.util.List.of("temperate","warm","cold")) {
            Native.kill(c,"@e[tag=aj.rig_entity]");Native.kill(c,"@e[tag=chicken_component]");
            Native.summon(c,animal,"~","~","~","{Tags:[native_variant_test],variant:'minecraft:"+variant+"',NoAI:1b}");
            Entity original=Native.entity(c,"@e[tag=native_variant_test,limit=1]");
            Frame context=c.with(c.source().withEntity(original).withPosition(original.position()));
            Native.setScore(context,"@s",animal+"Timer",0);
            for(int tick=0;tick<(animal.equals("cow")?9:animal.equals("pig")?8:10);tick++)
                Logic.call(context,"impossible_to_survive:mobs/"+animal+"/"+animal+"_timer");
            var visuals=Native.entities(context,animal.equals("chicken")?"@e[tag=chicken_component]":
                "@e[tag=aj."+(animal.equals("cow")?"matrix_cow":"bouncing_pig")+".bone]");
            check(visuals.size()==(animal.equals("cow")?10:animal.equals("pig")?7:2),"variant visual count "+animal);passed++;
            for(Entity visual:visuals) {
                var stack=visual instanceof Display.ItemDisplay display?display.getItemStack():((LivingEntity)visual).getItemBySlot(EquipmentSlot.HEAD);
                var model=stack.get(net.minecraft.core.component.DataComponents.ITEM_MODEL);
                check(model!=null&&model.getPath().startsWith("mob/"+animal+"/"+variant+"/"),"variant model "+animal+" "+variant);passed++;
                java.nio.file.Path asset=java.nio.file.Path.of(System.getProperty("impossible.smoke.resources"),"assets",model.getNamespace(),"items",model.getPath()+".json");
                check(java.nio.file.Files.exists(asset),"variant item asset "+model);passed++;
                var saved=Native.entityData(visual);Native.writeEntity(visual,saved);
                var restored=visual instanceof Display.ItemDisplay display?display.getItemStack():((LivingEntity)visual).getItemBySlot(EquipmentSlot.HEAD);
                check(model.equals(restored.get(net.minecraft.core.component.DataComponents.ITEM_MODEL)),"variant survives entity reload");passed++;
            }
            check(Native.entityData(original).getStringOr("variant","").equals("minecraft:"+variant),"original animal variant preserved");passed++;
            original.discard();
        }
        Native.kill(c,"@e[tag=aj.rig_entity]");Native.kill(c,"@e[tag=chicken_component]");
        LoggerFactory.getLogger("impossible_difficulty").info("VARIANT_EVENT_PASS: all 9 cow/pig/chicken variants, {} assertions",passed);return passed;
    }
    private static int configOptions(MinecraftServer server,Frame c) throws Exception {
        var original=com.liam.impossible.config.ConfigStore.capture(server);
        java.nio.file.Path file=java.nio.file.Path.of("config/native-smoke-config.json");
        var option=new com.liam.impossible.config.Settings(3,1,false,false,false,true);
        try {
            com.liam.impossible.config.ConfigStore.write(file,option);
            check(option.equals(com.liam.impossible.config.ConfigStore.read(file)),"config persistence");
            com.liam.impossible.config.ConfigStore.apply(server,option);
            check(option.equals(com.liam.impossible.config.ConfigStore.capture(server)),"menu settings reach all native mechanics");
            check(server.getWorldData().getDifficulty()==net.minecraft.world.Difficulty.HARD,"menu changes vanilla difficulty");
            check(Native.scoreInfo(c,"#global_health_multiplier","mcm.its.dragon.settings").value()==33,"dragon difficulty updates ability settings");
            var buffer=new net.minecraft.network.RegistryFriendlyByteBuf(io.netty.buffer.Unpooled.buffer(),server.registryAccess());
            try {
                var payload=new com.liam.impossible.config.ConfigPayload(1,option,false);
                com.liam.impossible.config.ConfigPayload.CODEC.encode(buffer,payload);
                check(payload.equals(com.liam.impossible.config.ConfigPayload.CODEC.decode(buffer)),"settings network round trip");
            } finally {buffer.release();}
            boolean rejected=false;
            try {com.liam.impossible.config.ConfigStore.write(file,option.with(0,99));}catch(java.io.IOException expected){rejected=true;}
            check(rejected&&option.equals(com.liam.impossible.config.ConfigStore.read(file)),"invalid settings rejected without overwriting config");
        } finally {
            com.liam.impossible.config.ConfigStore.apply(server,original);
            java.nio.file.Files.deleteIfExists(file);
        }
        LoggerFactory.getLogger("impossible_difficulty").info("CONFIG_PASS: persistence, gameplay application, packet codec, validation");return 6;
    }
    private static int utilityClouds(Frame c) throws Exception {
        int passed=0;
        for(String tag:java.util.List.of("chest_looked_aec","crafting_table_looked_aec","tree_center","creeper_aec","creeper_spawn_point")) {
            Native.summon(c,"area_effect_cloud","~","~","~","{Tags:[native_cloud_test,"+tag+"],Duration:30}");
            var cloud=(AreaEffectCloud)Native.entity(c,"@e[tag=native_cloud_test,limit=1]");
            check(cloud.getParticle()==UtilityParticles.INVISIBLE,"no visible particles from helper "+tag);passed++;
            Native.writeEntity(cloud,Native.entityData(cloud));
            check(cloud.getParticle()==UtilityParticles.INVISIBLE,"hidden helper particle persists");passed++;
            cloud.discard();
        }
        Native.summon(c,"area_effect_cloud","~","~","~","{Tags:[native_cloud_test],Duration:600,Particle:{type:'minecraft:dragon_breath'},potion_contents:{custom_effects:[{id:'minecraft:instant_damage',amplifier:0,duration:1}]}}");
        var actual=(AreaEffectCloud)Native.entity(c,"@e[tag=native_cloud_test,limit=1]");
        check(actual.getParticle().getType()==net.minecraft.core.particles.ParticleTypes.DRAGON_BREATH,"actual dragon potion cloud keeps its visual effect");passed++;
        actual.discard();
        LoggerFactory.getLogger("impossible_difficulty").info("UTILITY_CLOUD_PASS: five invisible helper tags, persistence, real dragon cloud");return passed;
    }
    private static int chestEvents(MinecraftServer server,Frame context) throws Exception {
        var profile=new com.mojang.authlib.GameProfile(java.util.UUID.randomUUID(),"ChestSmoke");
        var player=new net.minecraft.server.level.ServerPlayer(server,server.overworld(),profile,net.minecraft.server.level.ClientInformation.createDefault());
        var connection=new net.minecraft.network.Connection(net.minecraft.network.protocol.PacketFlow.SERVERBOUND);
        new net.minecraft.server.network.ServerGamePacketListenerImpl(server,connection,player,net.minecraft.server.network.CommonListenerCookie.createInitial(profile,false));
        player.snapTo(0.5,100,2.5,180,0);player.addTag("survivor");player.setInvulnerable(true);
        server.getPlayerList().getPlayers().add(player);server.overworld().addNewPlayer(player);
        player.connection.handleAcceptPlayerLoad(new net.minecraft.network.protocol.game.ServerboundPlayerLoadedPacket());
        var level=server.overworld();BlockPos position=new BlockPos(0,100,0);
        var savedState=level.getBlockState(position);
        int passed=0;
        int previousDisabled=Native.scoreInfo(context,"#global","disabled_chest").value();
        int previousDifficulty=Native.scoreInfo(context,"#global","mcm.its.overall_difficulty").value();
        Native.setScore(context,"#global","disabled_chest",0);
        Native.setScore(context,"#global","mcm.its.overall_difficulty",1);
        try {
            int directionIndex=0;
            for(var direction:java.util.List.of(net.minecraft.core.Direction.NORTH,net.minecraft.core.Direction.EAST,net.minecraft.core.Direction.SOUTH,net.minecraft.core.Direction.WEST)) {
                player.snapTo(0.5+direction.getStepX()*4,100,0.5+direction.getStepZ()*4,180,0);
                player.setInvulnerable(false);player.setHealth(20);player.invulnerableTime=0;
                level.setBlock(position,net.minecraft.world.level.block.Blocks.CHEST.defaultBlockState().setValue(net.minecraft.world.level.block.ChestBlock.FACING,direction),3);
                var chest=(net.minecraft.world.level.block.entity.ChestBlockEntity)level.getBlockEntity(position);
                chest.setItem(0,new net.minecraft.world.item.ItemStack(Items.DIAMOND,17));
                Native.data(context,"merge","block","0","100","0","{CustomName:{text:'Native chest inventory'}}");
                player.openMenu(chest);
                var menu=player.containerMenu;
                check(menu instanceof net.minecraft.world.inventory.ChestMenu&&ChestEncounters.active(chest),"opening container starts native visitor "+direction);passed++;
                check(net.minecraft.world.level.block.entity.ChestBlockEntity.getOpenCount(level,position)==2,"player plus visitor hold chest open");passed++;
                boolean keepMenu=directionIndex++==3;
                if(!keepMenu)player.closeContainer();
                chest.recheckOpen();
                int expectedOpenCount=keepMenu?2:1;
                check(net.minecraft.world.level.block.entity.ChestBlockEntity.getOpenCount(level,position)==expectedOpenCount,"closing GUI retains virtual opener");passed++;
                for(int tick=1;tick<=90;tick++) {
                    boolean shot=tick==54||tick==62||tick==70;
                    if(shot) {player.setHealth(20);player.invulnerableTime=0;}
                    ChestEncounters.tick(server);
                    if(shot) {check(player.getHealth()==15,"scheduled chest shot reaches player "+direction+" tick "+tick);passed++;}
                    if(tick>10)Logic.call(context,"animated_java:global/on_tick");
                    if(tick%5==0)chest.recheckOpen();
                    int count=net.minecraft.world.level.block.entity.ChestBlockEntity.getOpenCount(level,position);
                    // The same count is sent by vanilla block event 1 to the client lid controller.
                    chest.triggerEvent(1,count);
                    net.minecraft.world.level.block.entity.ChestBlockEntity.lidAnimateTick(level,position,chest.getBlockState(),chest);
                    check(level.getBlockEntity(position)==chest,"real chest is never replaced during visitor animation");passed++;
                    check(chest.getItem(0).is(Items.DIAMOND)&&chest.getItem(0).getCount()==17,"chest items preserved");passed++;
                    if(tick>=10&&tick<90) {
                        check(count==expectedOpenCount&&chest.getOpenNess(1)==1,"lid stays fully open while visitor emerges "+tick);passed++;
                    }
                    if(keepMenu) {check(player.containerMenu==menu,"visitor does not close the inventory GUI");passed++;}
                    if(tick==10) {
                        var roots=Native.entities(context,"@e[tag=impossible.chest_visitor]");
                        check(roots.size()==1,"exactly one visitor without a second chest model");passed++;
                        passed+=chestShots(context,player,roots.getFirst(),position,direction);
                        for(Entity bone:roots.getFirst().getPassengers())
                            if(bone.getTags().contains("aj.chest_mob.bone.chest")||bone.getTags().contains("aj.chest_mob.bone.chest_lid")) {
                                check(((Display.ItemDisplay)bone).getItemStack().isEmpty(),"replacement chest geometry hidden");passed++;
                            }
                    }
                }
                check(!ChestEncounters.active(chest)&&Native.entities(context,"@e[tag=impossible.chest_visitor]").isEmpty(),"visitor finishes and releases lid");passed++;
                check(net.minecraft.world.level.block.entity.ChestBlockEntity.getOpenCount(level,position)==(keepMenu?1:0),"real viewer count restored");passed++;
                check(chest.getCustomName().getString().equals("Native chest inventory"),"chest name preserved");passed++;
                check(Native.entities(context,"@e[tag=chest_looked_aec]").isEmpty(),"opening chest does not spawn potion tracking clouds");passed++;
                if(keepMenu)player.closeContainer();
                level.setBlock(position,net.minecraft.world.level.block.Blocks.AIR.defaultBlockState(),3);
            }
            level.setBlock(position,net.minecraft.world.level.block.Blocks.CHEST.defaultBlockState(),3);
            var disabledChest=(net.minecraft.world.level.block.entity.ChestBlockEntity)level.getBlockEntity(position);
            Native.setScore(context,"#global","disabled_chest",1);player.openMenu(disabledChest);
            check(!ChestEncounters.active(disabledChest)&&net.minecraft.world.level.block.entity.ChestBlockEntity.getOpenCount(level,position)==1,"chest configuration toggle disables visitor and hold");passed++;
            player.closeContainer();Native.setScore(context,"#global","disabled_chest",0);
            player.openMenu(disabledChest);player.closeContainer();
            for(int tick=0;tick<12;tick++)ChestEncounters.tick(server);
            level.setBlock(position,net.minecraft.world.level.block.Blocks.AIR.defaultBlockState(),3);ChestEncounters.tick(server);
            check(!ChestEncounters.active(disabledChest)&&Native.entities(context,"@e[tag=impossible.chest_visitor]").isEmpty(),"breaking chest safely cancels visitor");passed++;
        } finally {
            player.closeContainer();player.discard();server.getPlayerList().getPlayers().remove(player);
            Native.setScore(context,"#global","disabled_chest",previousDisabled);
            Native.setScore(context,"#global","mcm.its.overall_difficulty",previousDifficulty);
            level.setBlock(position,savedState,3);ChestEncounters.tick(server);
            Native.kill(context,"@e[tag=aj.rig_entity]");
        }
        LoggerFactory.getLogger("impossible_difficulty").info("CHEST_EVENT_PASS: all four facings, three timed hits, different target heights, stone/chest obstacles, continuous lid opening, real inventory/menu, no clones or clouds, cancellation; {} assertions",passed);
        return passed;
    }
    private static int chestShots(Frame context,net.minecraft.server.level.ServerPlayer player,Entity root,BlockPos source,net.minecraft.core.Direction direction) throws Exception {
        var level=context.source().getLevel();
        Frame shot=context.with(context.source().withEntity(root).withPosition(root.position()).withRotation(root.getRotationVector()));
        int passed=0;
        // Exercise the real shot selector, ray traversal and damage, not only the collision guard.
        for(int height:new int[]{0,-1,2}) {
            player.snapTo(source.getX()+0.5+direction.getStepX()*4,source.getY()+height,source.getZ()+0.5+direction.getStepZ()*4,180,0);
            player.setHealth(20);player.invulnerableTime=0;
            Logic.call(shot,"impossible_to_survive:features/chest_mob/shoot_player");
            check(player.getHealth()==15,"chest shot leaves its own block and hits target height "+height+" facing "+direction+" health="+player.getHealth()+" iterations="+Native.scoreInfo(shot,"@s","raycast_iterations").value());passed++;
        }
        player.snapTo(source.getX()+0.5+direction.getStepX()*4,source.getY(),source.getZ()+0.5+direction.getStepZ()*4,180,0);
        var obstacles=new java.util.LinkedHashMap<BlockPos,net.minecraft.world.level.block.state.BlockState>();
        for(int height=-1;height<=2;height++) {
            var position=source.relative(direction,2).above(height);obstacles.put(position,level.getBlockState(position));
        }
        try {
            for(var block:java.util.List.of(net.minecraft.world.level.block.Blocks.STONE,net.minecraft.world.level.block.Blocks.CHEST)) {
                for(var position:obstacles.keySet())level.setBlock(position,block.defaultBlockState(),3);
                player.setHealth(20);player.invulnerableTime=0;
                Logic.call(shot,"impossible_to_survive:features/chest_mob/shoot_player");
                check(player.getHealth()==20,"chest shot stops at other block "+block+" facing "+direction);passed++;
                check(Native.scoreInfo(shot,"@s","raycast_iterations").value()==101,"obstacle uses original impact handler");passed++;
            }
        } finally {for(var entry:obstacles.entrySet())level.setBlock(entry.getKey(),entry.getValue(),3);}
        Native.summon(shot,"marker","~","~","~","{Tags:['native_chest_collision_test']}");
        Entity unrelated=Native.entity(shot,"@e[tag=native_chest_collision_test,limit=1]");
        try {
            Frame other=shot.with(shot.source().withEntity(unrelated));
            player.setHealth(20);player.invulnerableTime=0;
            Logic.call(other,"impossible_to_survive:features/chest_mob/shoot_player");
            check(player.getHealth()==20&&Native.scoreInfo(other,"@s","raycast_iterations").value()==101,"only the owning visitor can fire through its source chest");passed++;
        } finally {unrelated.discard();player.setHealth(20);player.invulnerableTime=0;}
        return passed;
    }
}
