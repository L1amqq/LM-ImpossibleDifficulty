package com.liam.impossible.runtime;

import net.minecraft.world.entity.Entity;

/** Health exhaustion belongs to a phase transition until the final heart is spent. */
public final class DragonLifecycle {
    private static final String PREFIX="impossible_to_survive:mobs/impossible_dragon/";
    public static int score(Frame frame,String name,int fallback) throws Exception {
        var score=Native.scoreInfo(frame,"@s","mcm.its.dragon."+name);
        return score==null?fallback:score.value();
    }
    public static boolean transitioning(Frame frame) throws Exception {return score(frame,"activity",-1)==13;}
    public static void beforeLoop(Frame frame) throws Exception {
        Entity root=frame.source().getEntity();
        if(root==null||root.isRemoved()||!DragonCombat.isDragon(root)||DragonDeath.isDying(root))return;
        // The original safety reset removes the pending transition flag. Restore it from health.
        if(score(frame,"health",1)<=0&&score(frame,"head_count",1)>1&&!transitioning(frame)){
            root.removeTag("mcm.its.dragon.initiate_seek_healing");
            root.addTag("mcm.its.dragon.initiate_stage_transition");
            if(score(frame,"activity",-1)<=1)Logic.call(frame,PREFIX+"zzz/29");
        }
        if(transitioning(frame))ensureTransitionPoint(frame);
    }
    public static boolean canSelectAttack(Frame frame) throws Exception {
        int activity=score(frame,"activity",-1);
        return activity>=0&&activity<=1&&score(frame,"health",1)>0&&!DragonDeath.isDying(frame.source().getEntity());
    }
    private static void ensureTransitionPoint(Frame frame) throws Exception {
        if(!Native.entities(frame,"@e[type=marker,tag=mcm.its.dragon_environment.stage_transition_point]").isEmpty())return;
        var centers=Native.entities(frame,"@e[type=marker,tag=mcm.its.dragon_environment.exit_portal_center,sort=nearest,limit=1]");
        var center=centers.isEmpty()?new net.minecraft.world.phys.Vec3(0,80,0):centers.getFirst().position().add(0,20,0);
        frame.source().getLevel().getChunk(net.minecraft.core.BlockPos.containing(center));
        Native.summon(frame.with(frame.source().withPosition(center)),"marker","~","~","~",
            "{Tags:[mcm.its.dragon_environment,mcm.its.dragon_environment.stage_transition_point]}");
    }
}
