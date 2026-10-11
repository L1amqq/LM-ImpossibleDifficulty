package com.liam.impossible.mixin;

import com.liam.impossible.client.EndermanCamera;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Camera.class)
public abstract class EndermanCameraMixin {
    @Inject(method="setup",at=@At("HEAD"))
    private void impossible$smoothGaze(Level level,Entity entity,boolean detached,boolean reverse,float partialTick,CallbackInfo ci){
        if(entity==Minecraft.getInstance().player)EndermanCamera.frame(partialTick);
    }
}
