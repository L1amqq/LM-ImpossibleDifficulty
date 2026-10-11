package com.liam.impossible.mixin;

import com.liam.impossible.runtime.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.*;
import net.minecraft.world.level.storage.loot.parameters.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import java.util.function.Consumer;

/** Original custom death drops use compiled loot definitions instead of a datapack registry. */
@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Inject(method="dropFromLootTable(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;ZLnet/minecraft/resources/ResourceKey;Ljava/util/function/Consumer;)V",at=@At("HEAD"),cancellable=true)
    private void impossible$deathLoot(ServerLevel level,DamageSource source,boolean killedByPlayer,ResourceKey<LootTable> key,Consumer<ItemStack> drops,CallbackInfo ci){
        String id=key.identifier().toString();if(!Content.hasLoot(id))return;
        LivingEntity entity=(LivingEntity)(Object)this;
        var builder=new LootParams.Builder(level)
            .withParameter(LootContextParams.THIS_ENTITY,entity)
            .withParameter(LootContextParams.ORIGIN,entity.position())
            .withParameter(LootContextParams.DAMAGE_SOURCE,source)
            .withOptionalParameter(LootContextParams.ATTACKING_ENTITY,source.getEntity())
            .withOptionalParameter(LootContextParams.DIRECT_ATTACKING_ENTITY,source.getDirectEntity());
        var player=entity.getLastHurtByPlayer();
        if(killedByPlayer&&player!=null)builder.withParameter(LootContextParams.LAST_DAMAGE_PLAYER,player).withLuck(player.getLuck());
        var context=new Frame(level.getServer().createCommandSourceStack().withEntity(entity).withLevel(level).withPosition(entity.position()));
        Content.loot(context,id).getRandomItems(builder.create(LootContextParamSets.ENTITY),entity.getLootTableSeed(),drops);
        ci.cancel();
    }
}
