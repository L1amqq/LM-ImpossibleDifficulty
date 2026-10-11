package com.liam.impossible.mixin;

import com.liam.impossible.runtime.ChestEncounters;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ContainerUser;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import java.util.ArrayList;
import java.util.List;

@Mixin(ContainerOpenersCounter.class)
public abstract class ContainerOpenersCounterMixin {
    @Inject(method="getEntitiesWithContainerOpen",at=@At("RETURN"),cancellable=true)
    private void impossible$holdLid(Level level,BlockPos position,CallbackInfoReturnable<List<ContainerUser>> ci) {
        var holder=ChestEncounters.holder(level,position,(ContainerOpenersCounter)(Object)this);
        if(holder!=null) {
            var users=new ArrayList<>(ci.getReturnValue());users.add(holder);ci.setReturnValue(users);
        }
    }
}
