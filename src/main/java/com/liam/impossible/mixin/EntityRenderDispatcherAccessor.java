package com.liam.impossible.mixin;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.world.entity.EntityType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import java.util.Map;

@Mixin(EntityRenderDispatcher.class)
public interface EntityRenderDispatcherAccessor {
    @Accessor("renderers") Map<EntityType<?>,EntityRenderer<?,?>> impossible$renderers();
}
