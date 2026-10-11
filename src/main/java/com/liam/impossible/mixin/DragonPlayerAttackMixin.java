package com.liam.impossible.mixin;

import com.liam.impossible.runtime.DragonPart;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

/** Let vanilla calculate critical hits, enchantments and weapon wear against the health reservoir. */
@Mixin(Player.class)
public abstract class DragonPlayerAttackMixin {
    @Inject(method="attack",at=@At("HEAD"),cancellable=true)
    private void impossible$attackPart(Entity entity,CallbackInfo ci){
        if(entity instanceof DragonPart part&&part.damageTarget()!=null){((Player)(Object)this).attack(part.damageTarget());ci.cancel();}
    }
    @Inject(method="stabAttack",at=@At("HEAD"),cancellable=true)
    private void impossible$stabPart(EquipmentSlot slot,Entity entity,float damage,boolean hurt,boolean knockback,boolean dismount,CallbackInfoReturnable<Boolean> ci){
        if(entity instanceof DragonPart part&&part.damageTarget()!=null)
            ci.setReturnValue(((Player)(Object)this).stabAttack(slot,part.damageTarget(),damage,hurt,knockback,dismount));
    }
}
