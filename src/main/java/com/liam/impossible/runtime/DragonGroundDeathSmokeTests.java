package com.liam.impossible.runtime;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import java.util.*;

final class DragonGroundDeathSmokeTests {
    static int run(Frame origin) throws Exception {
        var level=origin.source().getLevel();Map<BlockPos,BlockState> saved=new LinkedHashMap<>();Entity root=null;int passed=0;
        try {
            for(BlockPos p:BlockPos.betweenClosed(new BlockPos(-16,220,-16),new BlockPos(16,220,16))){
                saved.put(p.immutable(),level.getBlockState(p));level.setBlock(p,Blocks.END_STONE.defaultBlockState(),2|16);
            }
            Frame spawn=origin.with(origin.source().withPosition(new Vec3(0,225,0)));
            Logic.call(spawn,"impossible_to_survive:mobs/impossible_dragon/summon");
            root=Native.entity(spawn,"@e[tag=aj.impossible_dragon.root,limit=1]");Frame frame=spawn.with(spawn.source().withEntity(root));
            Native.setScore(frame,"@s","mcm.its.dragon.head_count",1);
            Native.setScore(frame,"@s","mcm.its.dragon.activity",12);
            Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/state/set_undamaged");
            Logic.call(frame,"animated_java:impossible_dragon/animations/stun_loop/apply_frame","{frame:3}");
            double bottom=DragonGeometry.boxes(root,Vec3.ZERO,root.getRotationVector()).stream().mapToDouble(b->b.bounds().minY).min().orElseThrow();
            root.teleportTo(level,0,221-bottom+.05,0,Set.of(),root.getYRot(),0,true);
            frame=frame.with(frame.source().withPosition(root.position()));double initial=root.getY();
            Native.setScore(frame,"@s","mcm.its.dragon.health",0);DragonDeath.beginIfDead(frame);
            int travel=DragonDeath.flightTicks(root);
            var data=AnimationData.customData(root).getCompoundOrEmpty("impossible_death");
            check(data.getIntOr("version",0)==3,"grounded kill also starts the portal death sequence");passed++;
            for(int i=0;i<travel+1;i++)Logic.call(frame.with(frame.source().withPosition(root.position())),"impossible_to_survive:mobs/impossible_dragon/loop");
            check(Math.abs(root.getY()-data.getDoubleOr("target_y",0))<.001,"grounded kill flies to the portal instead of leaving a corpse");passed++;
            check(!root.getTags().contains("aj.impossible_dragon.animation.die.playing"),"grounded kill never folds the dragon");passed++;
            for(int i=0;i<DragonDeath.DURATION&&!root.isRemoved();i++)Logic.call(frame.with(frame.source().withPosition(root.position())),"impossible_to_survive:mobs/impossible_dragon/loop");
            check(root.isRemoved(),"grounded death completes and cleans up normally");passed++;
        } finally {
            if(root!=null&&!root.isRemoved())Logic.call(origin.with(origin.source().withEntity(root)),"animated_java:impossible_dragon/remove/this");
            for(var e:saved.entrySet())level.setBlock(e.getKey(),e.getValue(),2|16);
        }
        return passed;
    }
    private static void check(boolean condition,String message){if(!condition)throw new IllegalStateException(message);}
}
