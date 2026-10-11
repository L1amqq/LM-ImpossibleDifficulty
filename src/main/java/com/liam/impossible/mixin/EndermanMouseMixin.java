package com.liam.impossible.mixin;

import com.liam.impossible.client.EndermanCamera;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public abstract class EndermanMouseMixin {
    @Inject(method="turn",at=@At("HEAD"),cancellable=true)
    private void impossible$lockedMouse(double yaw,double pitch,CallbackInfo ci){
        if((Object)this==Minecraft.getInstance().player&&EndermanCamera.active())ci.cancel();
    }
}
