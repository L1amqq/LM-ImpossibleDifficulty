package com.liam.impossible.mixin;
import com.liam.impossible.runtime.*;
import net.minecraft.advancements.criterion.PlayerHurtEntityTrigger;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(PlayerHurtEntityTrigger.class)
public abstract class PlayerHurtEntityTriggerMixin {
    @Inject(method="trigger",at=@At("TAIL"))
    private void impossible$hit(ServerPlayer player,Entity target,DamageSource source,float dealt,float taken,boolean blocked,CallbackInfo ci){
        EventBridge.hit(player,target);
    }
}
