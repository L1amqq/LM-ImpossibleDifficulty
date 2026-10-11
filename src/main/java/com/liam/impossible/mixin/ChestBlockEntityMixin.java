package com.liam.impossible.mixin;

import com.liam.impossible.runtime.ChestEncounters;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.ContainerUser;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChestBlockEntity.class)
public abstract class ChestBlockEntityMixin {
    @Inject(method="startOpen",at=@At("RETURN"))
    private void impossible$opened(ContainerUser user,CallbackInfo ci) {
        if(user.getLivingEntity() instanceof ServerPlayer player)
            ChestEncounters.open((ChestBlockEntity)(Object)this,player);
    }
}
