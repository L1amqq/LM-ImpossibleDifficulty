package com.liam.impossible.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EnderDragonRenderer;
import net.minecraft.client.renderer.rendertype.RenderType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(EnderDragonRenderer.class)
public interface EnderDragonDeathRaysInvoker {
    @Invoker("submitRays")
    static void impossible$submitRays(PoseStack poses,float progress,SubmitNodeCollector collector,RenderType type){throw new AssertionError();}
}
