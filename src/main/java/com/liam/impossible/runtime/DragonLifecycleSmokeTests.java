package com.liam.impossible.runtime;

import java.util.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import org.slf4j.LoggerFactory;

final class DragonLifecycleSmokeTests {
    static int run(Frame origin,Entity root,ServerPlayer player) throws Exception {
        int passed=0;
        for(String tag:List.copyOf(root.getTags()))if(tag.endsWith(".playing")||tag.contains("initiate_")||tag.equals("mcm.its.dragon.invulnerable"))root.removeTag(tag);
        root.teleportTo(origin.source().getLevel(),0,120,0,Set.of(),0,0,true);
        Frame frame=context(origin,root);
        Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/state/set_3_heads");
        Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/state/set_tail_enabled");
        Native.setScore(frame,"@s","mcm.its.dragon.health",1000000);
        Native.setScore(frame,"@s","mcm.its.dragon.tutorial.stage",3);
        Native.setScore(frame,"@s","mcm.its.dragon.activity",1);
        DragonCombat.update(root);
        // Persisted locators can be missing independently of the non-persistent attack volumes.
        var originalParts=DragonCombat.parts(root);var reservoirs=new HashSet<Entity>();
        originalParts.forEach(part->reservoirs.add(part.target));reservoirs.forEach(Entity::discard);
        DragonCombat.remove(root);DragonCombat.update(root);
        check(!DragonCombat.parts(root).isEmpty()&&DragonCombat.parts(root).stream().noneMatch(p->reservoirs.contains(p.target)),"missing saved reservoirs and transient attack volumes recover together");passed++;
        int count=DragonCombat.parts(root).size();DragonCombat.update(root);
        check(DragonCombat.parts(root).size()==count,"recovery does not multiply attack volumes");passed++;
        // A saved zero-health flight with a lost pending flag must still enter recharge.
        Native.setScore(frame,"@s","mcm.its.dragon.health",0);
        Native.setScore(frame,"@s","mcm.its.dragon.attack_delay_timer",0);
        Native.kill(origin,"@e[tag=mcm.its.dragon_environment.stage_transition_point]");
        tick(origin,root);
        check(score(origin,root,"activity")==13&&!DragonDeath.isDying(root),"empty first heart enters recharge even with expired attack timer and lost flag");passed++;
        check(!Native.entities(origin,"@e[tag=mcm.its.dragon_environment.stage_transition_point]").isEmpty(),"lost transition destination is restored");passed++;
        check(!DragonCombat.parts(root).isEmpty(),"empty intermediate heart retains body hitboxes");passed++;
        // Exercise the complete native recharge and head replacement twice, including timer expiry.
        for(int expectedHeads:new int[]{2,1}){
            if(expectedHeads==1){
                frame=context(origin,root);root.removeTag("mcm.its.dragon.invulnerable");
                Native.setScore(frame,"@s","mcm.its.dragon.health",1);
                Native.setScore(frame,"@s","mcm.its.dragon.damaged_cd",0);
                DragonCombat.update(root);var body=DragonCombat.parts(root).stream().filter(p->p.bone.equals("body")).findFirst().orElseThrow();
                body.target.invulnerableTime=0;player.snapTo(body.getX()+1,body.getY(),body.getZ(),90,0);
                for(int i=0;i<30;i++)player.doTick();player.attack(body);
                check(score(origin,root,"health")<=0&&!DragonDeath.isDying(root),"real lethal hit on the second heart requests recharge");passed++;
                tick(origin,root);
            }
            int ticks=0;boolean recharge=false;
            while(score(origin,root,"activity")==13&&ticks++<600){
                Native.setScore(context(origin,root),"@s","mcm.its.dragon.attack_delay_timer",0);
                tick(origin,root);recharge|=score(origin,root,"sub_activity")==2;
                check(!root.isRemoved()&&!DragonDeath.isDying(root),"recharge cannot be preempted by a random attack or mistaken for final death");passed++;
            }
            check(recharge&&ticks<600&&score(origin,root,"head_count")==expectedHeads&&score(origin,root,"health")==1000000,"native recharge completes once and restores next heart; heads="+score(origin,root,"head_count")+", activity="+score(origin,root,"activity")+", ticks="+ticks);passed++;
            check(!DragonCombat.parts(root).isEmpty(),"next phase has attack volumes");passed++;
            var bar=origin.source().getServer().getCustomBossEvents().get(net.minecraft.resources.Identifier.withDefaultNamespace("impossible_dragon"));
            check(bar!=null&&bar.isVisible()&&bar.getValue()==1000000&&DragonBossBar.hearts(bar.getName())==expectedHeads,"boss bar follows regenerated heart");passed++;
            check(DragonCombat.parts(root).stream().allMatch(p->p.target.isAlive()),"all volumes reference live reservoirs after head replacement");passed++;
        }
        // Old saves can contain zero HP after head replacement but before recharge finishes.
        frame=context(origin,root);
        Native.setScore(frame,"@s","mcm.its.dragon.activity",13);
        Native.setScore(frame,"@s","mcm.its.dragon.sub_activity",2);
        Native.setScore(frame,"@s","mcm.its.dragon.activity.timer",114);
        Native.setScore(frame,"@s","mcm.its.dragon.health",0);
        tick(origin,root);
        check(!DragonDeath.isDying(root)&&score(origin,root,"health")==1000000&&!DragonCombat.parts(root).isEmpty(),"saved empty last heart during recharge completes instead of starting death");passed++;
        LoggerFactory.getLogger("impossible_difficulty").info("DRAGON_LIFECYCLE_PASS: {} assertions",passed);return passed;
    }
    private static Frame context(Frame origin,Entity root){return origin.with(origin.source().withEntity(root).withPosition(root.position()).withRotation(root.getRotationVector()));}
    private static int score(Frame origin,Entity root,String name) throws Exception{return DragonLifecycle.score(context(origin,root),name,Integer.MIN_VALUE);}
    private static void tick(Frame origin,Entity root){Logic.call(context(origin,root),"animated_java:impossible_dragon/root/on_tick");Logic.call(context(origin,root),"impossible_to_survive:mobs/impossible_dragon/loop");}
    private static void check(boolean condition,String message){if(!condition)throw new IllegalStateException(message);}
}
