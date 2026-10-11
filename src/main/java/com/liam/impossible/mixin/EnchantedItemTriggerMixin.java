package com.liam.impossible.mixin;
import com.liam.impossible.runtime.*;
import net.minecraft.advancements.criterion.EnchantedItemTrigger;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(EnchantedItemTrigger.class)
public abstract class EnchantedItemTriggerMixin {
    @Inject(method="trigger",at=@At("TAIL"))
    private void impossible$enchant(ServerPlayer player,ItemStack item,int levels,CallbackInfo ci){
        Logic.call(new Frame(player.level().getServer().createCommandSourceStack().withEntity(player).withLevel(player.level()).withPosition(player.position()).withRotation(player.getRotationVector())),"impossible_to_survive:features/enchanting_table/enchanted_item");
    }
}
