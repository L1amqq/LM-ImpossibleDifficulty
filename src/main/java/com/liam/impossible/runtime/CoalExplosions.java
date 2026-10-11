package com.liam.impossible.runtime;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

/** Explode the timed coal directly, without a temporary mob. */
public final class CoalExplosions {
    public static int explode(Frame frame) throws Exception {
        if(!(frame.source().getEntity() instanceof ItemEntity coal)||coal.isRemoved()||!coal.getItem().is(Items.COAL))return 0;
        var difficulty=Native.scoreInfo(frame,"#global","mcm.its.overall_difficulty");
        if(difficulty!=null&&difficulty.value()>=1&&difficulty.value()<=3){
            var position=coal.position();
            frame.source().getLevel().explode(coal,position.x,position.y,position.z,difficulty.value()+1f,Level.ExplosionInteraction.MOB);
        }
        coal.discard();
        return 1;
    }
}
