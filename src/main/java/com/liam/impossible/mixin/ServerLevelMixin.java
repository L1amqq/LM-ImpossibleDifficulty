package com.liam.impossible.mixin;

import com.liam.impossible.runtime.Logic;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Use the same world-time phase as the original scheduled clocks. */
@Mixin(ServerLevel.class)
public abstract class ServerLevelMixin {
    @Inject(method="tickTime",at=@At(value="INVOKE",target="Lnet/minecraft/world/level/timers/TimerQueue;tick(Ljava/lang/Object;J)V"))
    private void impossible$scheduledClocks(CallbackInfo ci){
        ServerLevel level=(ServerLevel)(Object)this;
        if(level.dimension().equals(Level.OVERWORLD))Logic.scheduledTick(level.getServer());
    }
}
