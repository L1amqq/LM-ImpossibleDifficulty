package com.liam.impossible.runtime;

import net.minecraft.core.component.DataComponents;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Items;

/** Guide items use the original native loot definitions and page actions. */
public final class GuideBook {
    public static void give(ServerPlayer player){
        Frame frame=new Frame(player.level().getServer().createCommandSourceStack()
            .withEntity(player).withLevel(player.level()).withPosition(player.position()));
        try {
            Native.loot(frame,"give","@s","loot","impossible_to_survive:lore_book_closed");
            Native.setScore(frame,"@s","mcm.its.dragon.guide_unlocked",1);
        } catch(Exception error){throw new IllegalStateException("Could not give the guide",error);}
    }

    public static int turnPage(Frame frame) throws Exception {
        if(!(frame.source().getEntity() instanceof ServerPlayer player))return 0;
        var item=player.getMainHandItem();
        var data=item.get(DataComponents.CUSTOM_DATA);
        if(!item.is(Items.WARPED_FUNGUS_ON_A_STICK)||data==null||!data.copyTag().getBooleanOr("CrystalspineGuide",false))return 0;
        var model=item.get(DataComponents.CUSTOM_MODEL_DATA);
        Float number=model==null?null:model.getFloat(0);
        if(number==null)return 0;
        String page=number==10f?"1":number==8f?"2":number==9f?"3":null;
        if(page==null)return 0;
        Native.setScore(frame,"@s","wfoas_click_cd",10);
        return Logic.call(frame,"impossible_to_survive:dragon_book/zzz/"+page);
    }
}
