package com.liam.impossible.runtime;

import net.minecraft.core.*;
import net.minecraft.core.registries.*;
import net.minecraft.resources.*;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.pig.Pig;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.phys.*;
import java.util.*;

/** Attack volumes follow the animated dragon without changing its original movement or pose. */
public final class DragonCombat {
    private static final ResourceKey<EntityType<?>> KEY=ResourceKey.create(Registries.ENTITY_TYPE,Identifier.fromNamespaceAndPath("impossible_difficulty","dragon_part"));
    public static final EntityType<DragonPart> TYPE=Registry.register(BuiltInRegistries.ENTITY_TYPE,KEY,
        EntityType.Builder.of(DragonPart::new,MobCategory.MISC).sized(1,1).clientTrackingRange(16).updateInterval(1).noSave().noSummon().noLootTable().build(KEY));
    private static final Map<Entity,Map<String,DragonPart>> PARTS=new IdentityHashMap<>();
    public static void register(){}
    /** A lethal last-head hit must finish without requiring another hit on disabled attack volumes. */
    public static void afterLoop(Frame frame) throws Exception {
        Entity root=frame.source().getEntity();if(root==null||!isDragon(root))return;
        if(root.isRemoved()){
            // The remaining original loop statements can show the boss bar again after removing @s.
            remove(root);CrystalShields.remove(root);
            Native.bossbar(frame,"set","minecraft:impossible_dragon","visible","false");return;
        }
        frame=frame.with(frame.source().withPosition(root.position()).withRotation(root.getRotationVector()));
        var health=Native.scoreInfo(frame,"@s","mcm.its.dragon.health");var heads=Native.scoreInfo(frame,"@s","mcm.its.dragon.head_count");
        if(health!=null&&health.value()<=0&&heads!=null&&heads.value()==1&&!DragonLifecycle.transitioning(frame)){
            var activity=Native.scoreInfo(frame,"@s","mcm.its.dragon.activity");
            if(activity==null||activity.value()!=15)Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/activity/do_death_flying");
            var sub=Native.scoreInfo(frame,"@s","mcm.its.dragon.sub_activity");var timer=Native.scoreInfo(frame,"@s","mcm.its.dragon.activity.timer");
            if(sub!=null&&sub.value()==1&&timer!=null&&timer.value()>=20)Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/zzz/420");
        }
        CrystalShields.sync(frame);
        update(root);
        DragonTutorial.showTailHint(frame);
    }
    public static boolean isDragon(Entity entity){return entity.getTags().contains("aj.impossible_dragon.root");}
    private static boolean living(Entity root){
        if(root.isRemoved()||DragonDeath.isDying(root))return false;
        var score=root.level().getServer().getScoreboard().getObjective("mcm.its.dragon.health");
        var value=score==null?null:root.level().getServer().getScoreboard().getPlayerScoreInfo(root,score);
        var board=root.level().getServer().getScoreboard();
        var heads=board.getObjective("mcm.its.dragon.head_count");var activity=board.getObjective("mcm.its.dragon.activity");
        var count=heads==null?null:board.getPlayerScoreInfo(root,heads);var phase=activity==null?null:board.getPlayerScoreInfo(root,activity);
        return value==null||value.value()>0||(count!=null&&count.value()>1)||(phase!=null&&phase.value()==13);
    }
    public static void update(Entity root) throws Exception {
        if(!isDragon(root))return;
        if(!living(root)){remove(root);return;}
        var boxes=DragonGeometry.boxes(root,root.position(),root.getRotationVector());
        Frame context=new Frame(root.level().getServer().createCommandSourceStack().withLevel((ServerLevel)root.level()).withEntity(root).withPosition(root.position()).withRotation(root.getRotationVector()));
        // Refresh locators after the original animation and movement, without moving the rig root.
        Control.run(context,c->Logic.call(c,"animated_java:impossible_dragon/root/zzz/1"),Control.on("passengers"),Control.when("entity","@s[tag=aj.impossible_dragon.data]"));
        Control.run(context,c->Native.tp(c,"@s","~","~","~","~","~"),Control.on("passengers"));
        Entity data=root.getPassengers().stream().filter(e->e.getTags().contains("aj.impossible_dragon.data")).findFirst().orElse(null);
        if(data==null)return;
        boolean repaired=false;
        int heads=DragonLifecycle.score(context,"head_count",3),tail=DragonLifecycle.score(context,"has_tail",1);
        for(String name:new String[]{"body","tail","head_left","head_middle","head_right"}){
            if(name.equals("tail")&&tail!=1||name.equals("head_middle")&&heads==2||name.startsWith("head_")&&!name.equals("head_middle")&&heads<2)continue;
            String locator=switch(name){case "body"->"body_hitbox_locator";case "tail"->"tail_end_hitbox_locator";default->"head_hitbox_"+name.substring(5)+"_locator";};
            String id=AnimationData.customData(data).getCompoundOrEmpty("locators").getCompoundOrEmpty(locator).getStringOr("uuid","");
            Entity target=null;try{if(!id.isEmpty())target=((ServerLevel)root.level()).getEntity(UUID.fromString(id));}catch(IllegalArgumentException ignored){}
            if(target instanceof Pig pig&&pig.isAlive())continue;
            Logic.call(context.with(context.source().withEntity(data)),"impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/"+name);
            repaired=true;
        }
        if(repaired)Control.run(context,c->Logic.call(c,"animated_java:impossible_dragon/root/zzz/1"),Control.on("passengers"),Control.when("entity","@s[tag=aj.impossible_dragon.data]"));
        var locators=AnimationData.customData(data).getCompoundOrEmpty("locators");
        Map<String,Pig> targets=new HashMap<>();
        for(var entry:Map.of("body","body_hitbox_locator","tail","tail_end_hitbox_locator","head.left","head_hitbox_left_locator","head.middle","head_hitbox_middle_locator","head.right","head_hitbox_right_locator").entrySet()){
            String uuid=locators.getCompoundOrEmpty(entry.getValue()).getStringOr("uuid","");
            if(uuid.isEmpty())continue;
            Entity entity=((ServerLevel)root.level()).getEntity(UUID.fromString(uuid));
            if(entity instanceof Pig pig){
                // Keep the original health reservoir and mechanics, without the old oversized floating cube.
                var scale=pig.getAttribute(Attributes.SCALE);if(scale!=null&&scale.getBaseValue()!=.0625){scale.setBaseValue(.0625);pig.refreshDimensions();}
                pig.noPhysics=true;pig.setNoGravity(true);targets.put(entry.getKey(),pig);
            }
        }
        Map<String,DragonPart> parts=PARTS.computeIfAbsent(root,r->new LinkedHashMap<>());Set<String> used=new HashSet<>();
        for(var box:boxes){
            Pig target=targets.get(box.part());if(target==null)continue;
            AABB bounds=box.bounds();double dx=bounds.getXsize(),dz=bounds.getZsize();boolean splitX=dx>dz;
            double shorter=Math.min(dx,dz),longer=Math.max(dx,dz);
            int slices=Math.max(1,(int)Math.ceil(longer/Math.max(3,shorter*1.5)));
            for(int slice=0;slice<slices;slice++){
                AABB b=splitX?new AABB(bounds.minX+dx*slice/slices,bounds.minY,bounds.minZ,bounds.minX+dx*(slice+1)/slices,bounds.maxY,bounds.maxZ):
                    new AABB(bounds.minX,bounds.minY,bounds.minZ+dz*slice/slices,bounds.maxX,bounds.maxY,bounds.minZ+dz*(slice+1)/slices);
                String key=box.bone()+"/"+slice;used.add(key);DragonPart part=parts.get(key);
                if(part==null||part.isRemoved()){
                    part=new DragonPart(TYPE,root.level());part.owner=root;part.target=target;part.bone=box.bone();
                    part.addTag("impossible.dragon.part");parts.put(key,part);
                    part.setSize((float)b.getXsize(),(float)Math.max(.25,b.getYsize()),(float)b.getZsize());
                    part.setPos(b.getCenter().x,b.minY,b.getCenter().z);((ServerLevel)root.level()).addFreshEntity(part);
                }else {
                    part.target=target;part.setSize((float)b.getXsize(),(float)Math.max(.25,b.getYsize()),(float)b.getZsize());
                    part.setPos(b.getCenter().x,b.minY,b.getCenter().z);
                }
            }
        }
        var iterator=parts.entrySet().iterator();while(iterator.hasNext()){
            var entry=iterator.next();if(!used.contains(entry.getKey())){entry.getValue().discard();iterator.remove();}
        }
    }
    public static boolean damage(DragonPart part,ServerLevel level,DamageSource source,float amount){
        if(part.owner==null||!living(part.owner)||part.target==null||part.target.isRemoved())return false;
        var objective=level.getServer().getScoreboard().getObjective("mcm.its.dragon.health");
        var health=objective==null?null:level.getServer().getScoreboard().getPlayerScoreInfo(part.owner,objective);
        if(health!=null&&health.value()<=0)return false;
        return part.target.hurtServer(level,source,amount);
    }
    /** Resolve the exact pig that was hit, rather than selecting a different part near the player. */
    public static boolean hit(ServerPlayer player,Entity target,String part) throws Exception {
        Entity owner=null;
        for(var entry:PARTS.entrySet())if(entry.getValue().values().stream().anyMatch(p->p.target==target)){owner=entry.getKey();break;}
        if(owner==null)return false;
        Frame root=new Frame(player.level().getServer().createCommandSourceStack().withLevel((ServerLevel)owner.level()).withEntity(owner).withPosition(owner.position()));
        var cooldown=Native.scoreInfo(root,"@s","mcm.its.dragon.damaged_cd");
        if((cooldown!=null&&cooldown.value()>0)||DragonLifecycle.score(root,"health",1)<=0||owner.getTags().contains("mcm.its.dragon.invulnerable"))return true;
        String action=switch(part){case "body"->"1";case "tail"->"3";case "head.left"->"6";case "head.middle"->"8";case "head.right"->"10";default->throw new IllegalArgumentException(part);};
        Logic.call(root.with(root.source().withEntity(target).withPosition(target.position())),"impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/"+action);
        return true;
    }
    public static List<DragonPart> parts(Entity root){return List.copyOf(PARTS.getOrDefault(root,Map.of()).values());}
    public static void remove(Entity root){var parts=PARTS.remove(root);if(parts!=null)parts.values().forEach(Entity::discard);}
    public static void tick(MinecraftServer server){for(Entity root:List.copyOf(PARTS.keySet()))if(root.level().getServer()==server&&root.isRemoved())remove(root);}
    public static void stopped(MinecraftServer server){for(Entity root:List.copyOf(PARTS.keySet()))if(root.level().getServer()==server)remove(root);}
}
