package com.liam.impossible.runtime;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;

/** Use the clicked block directly, including smokers already present in an existing world. */
public final class Smokers {
    public static void register(){
        UseBlockCallback.EVENT.register((player,world,hand,hit)->{
            if(world instanceof ServerLevel level&&!player.isSpectator()&&world.getBlockState(hit.getBlockPos()).is(Blocks.SMOKER))
                Logic.step(()->track(level,hit.getBlockPos()));
            return InteractionResult.PASS;
        });
    }
    public static int track(ServerLevel level,BlockPos position) throws Exception {
        Frame context=new Frame(level.getServer().createCommandSourceStack().withLevel(level).withPosition(Vec3.atCenterOf(position)));
        if(!Native.entities(context,"@e[type=marker,tag=smoker_marker,distance=..0.1]").isEmpty())return 0;
        return Native.summon(context,"marker","~","~","~","{CustomName:'\"Smoker\"',Tags:[smoker_marker]}");
    }
}
