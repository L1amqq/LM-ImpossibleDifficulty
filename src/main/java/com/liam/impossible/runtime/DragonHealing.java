package com.liam.impossible.runtime;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import java.util.*;

/** Terminal execute-if-entity returns the number of matches, not a boolean one. */
public final class DragonHealing {
    private static final String BEAM="impossible.dragon.healing_beam";
    private static Frame at(Frame frame,Entity entity){return frame.with(frame.source().withEntity(entity).withLevel((ServerLevel)entity.level()).withPosition(entity.position()).withRotation(entity.getRotationVector()));}
    public static int beam(Frame frame) throws Exception {
        if(!(frame.source().getEntity() instanceof EndCrystal crystal))return 0;
        crystal.setBeamTarget(net.minecraft.core.BlockPos.containing(frame.arguments().getDoubleOr("x",0),frame.arguments().getDoubleOr("y",0),frame.arguments().getDoubleOr("z",0)));
        crystal.addTag(BEAM);return 1;
    }
    private static Set<EndCrystal> managed(Frame frame) throws Exception {
        Set<EndCrystal> result=new LinkedHashSet<>();
        for(Entity entity:Native.entities(frame,"@e[type=end_crystal,tag="+BEAM+",distance=0..]"))result.add((EndCrystal)entity);
        // Older versions did not record beam ownership. Arena markers identify those crystals.
        for(Entity marker:Native.entities(frame,"@e[type=marker,tag=mcm.its.dragon_environment.end_crystal,distance=0..]"))
            result.addAll(frame.source().getLevel().getEntitiesOfClass(EndCrystal.class,marker.getBoundingBox().inflate(2)));
        return result;
    }
    public static void stop(Frame frame) throws Exception {
        for(EndCrystal crystal:managed(frame))crystal.setBeamTarget(null);
    }
    public static void sync(Frame frame) throws Exception {
        Set<EndCrystal> active=new HashSet<>();
        for(Entity root:Native.entities(frame,"@e[type=item_display,tag=aj.impossible_dragon.root,distance=0..]")){
            Frame dragon=at(frame,root);
            int difficulty=DragonLifecycle.score(dragon,"attack_difficulty",1),close=difficulty<=1?103:difficulty==2?83:63;
            int timer=DragonLifecycle.score(dragon,"activity.timer",0);
            if(DragonDeath.isDying(root)||root.getTags().contains("mcm.its.dragon.crystal_healing_interrupted")||
                DragonLifecycle.score(dragon,"activity",-1)!=5||DragonLifecycle.score(dragon,"sub_activity",-1)!=3||timer<16||timer>=close)continue;
            Frame nearest=dragon.with(dragon.source().withPosition(Native.position(dragon,new String[]{"^","^","^-20"},0)));
            var markers=Native.entities(nearest,"@n[type=marker,tag=mcm.its.dragon_environment.end_crystal,distance=0..]");
            if(!markers.isEmpty()&&!markers.getFirst().getTags().contains("mcm.its.dragon_environment.end_crystal.destroyed")){
                // Match the healing ability's nearest-crystal selection, including a missing crystal.
                var crystals=Native.entities(at(frame,markers.getFirst()),"@n[type=end_crystal,distance=0..]");
                if(!crystals.isEmpty())active.add((EndCrystal)crystals.getFirst());
            }
        }
        for(EndCrystal crystal:managed(frame))if(crystal.getBeamTarget()!=null&&!active.contains(crystal))crystal.setBeamTarget(null);
    }
    public static void tick(MinecraftServer server){
        if(server.getTickCount()%5!=0)return;
        for(ServerLevel level:server.getAllLevels())Logic.step(()->{sync(new Frame(server.createCommandSourceStack().withLevel(level)));return 1;});
    }
    public static int crystals(Frame frame) throws Exception {
        int count=Native.entities(frame,"@e[type=marker,tag=mcm.its.dragon_environment.end_crystal,tag=!mcm.its.dragon_environment.end_crystal.destroyed]").size();
        Native.setScore(frame,"#global","mcm.its.dragon.crystal_count",count);return count;
    }
    public static int players(Frame frame) throws Exception {
        int count=Native.players(frame,"@a[predicate=mcm:gm/vulnerable,distance=..300]").size();
        Native.setScore(frame,"#player_count","mcm.its.dragon.settings",count);return count;
    }
}
