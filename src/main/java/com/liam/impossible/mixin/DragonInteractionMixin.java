package com.liam.impossible.mixin;

import com.liam.impossible.runtime.*;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Interaction.class)
public abstract class DragonInteractionMixin {
    @Inject(method="canBeHitByProjectile",at=@At("HEAD"),cancellable=true)
    private void impossible$projectiles(CallbackInfoReturnable<Boolean> ci){if((Object)this instanceof DragonPart)ci.setReturnValue(true);}
    @Inject(method="skipAttackInteraction",at=@At("HEAD"),cancellable=true)
    private void impossible$normalAttack(Entity attacker,CallbackInfoReturnable<Boolean> ci){if((Object)this instanceof DragonPart)ci.setReturnValue(false);}
    @Inject(method="hurtServer",at=@At("HEAD"),cancellable=true)
    private void impossible$damage(ServerLevel level,DamageSource source,float amount,CallbackInfoReturnable<Boolean> ci){
        if((Object)this instanceof DragonPart part)ci.setReturnValue(DragonCombat.damage(part,level,source,amount));
    }
}
