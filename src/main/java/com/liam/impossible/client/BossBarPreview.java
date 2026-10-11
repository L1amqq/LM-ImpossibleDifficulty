package com.liam.impossible.client;

import com.liam.impossible.runtime.DragonBossBar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.BossHealthOverlay;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundBossEventPacket;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.world.BossEvent;

/** Development-only screenshot using the actual HUD renderer and network packet path. */
final class BossBarPreview extends Screen {
    private final java.util.List<BossHealthOverlay> bars=new java.util.ArrayList<>();
    BossBarPreview(){
        super(Component.literal("Проверка полосы босса"));
        for(int hearts=3;hearts>=1;hearts--){
            Component name=DragonBossBar.title(hearts);
            if(!DragonBossBar.matches(name)||DragonBossBar.hearts(name)!=hearts||name.getStyle().getColor().getValue()!=0xFFFFFF)
                throw new IllegalStateException("Bitmap boss title, heart count or untinted color missing");
            var overlay=new BossHealthOverlay(Minecraft.getInstance());bars.add(overlay);
            var event=new ServerBossEvent(name,BossEvent.BossBarColor.BLUE,BossEvent.BossBarOverlay.NOTCHED_10);
            event.setProgress(hearts==3?1:hearts==2?.65f:.25f);
            overlay.update(ClientboundBossEventPacket.createAddPacket(event));
        }
    }
    @Override public void render(GuiGraphics gui,int mouseX,int mouseY,float partialTick){
        gui.fill(0,0,width,height,0xFF171321);
        for(int i=0;i<bars.size();i++){
            gui.pose().pushMatrix();gui.pose().translate(0,i*65);bars.get(i).render(gui);gui.pose().popMatrix();
        }
        gui.drawCenteredString(font,"Три, два и одно оставшееся сердце",width/2,205,0xFFE9ACFF);
    }
}
