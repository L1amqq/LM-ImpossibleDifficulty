package com.liam.impossible.client;

import com.liam.impossible.config.*;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import java.util.ArrayList;
import java.util.List;

public final class SettingsScreen extends Screen {
    private static final String[] KEYS={"difficulty","dragon_difficulty","armor","endermen","chests","flashbang"};
    private final Screen parent;
    private Settings draft=ConfigStore.local();
    private final List<Button> options=new ArrayList<>();
    private Button save,reset;
    private boolean editable,requested,pending;
    private String status="local";
    public SettingsScreen(Screen parent) {super(text("title"));this.parent=parent;}
    private static Component text(String key) {return Component.translatable("impossible_difficulty.config."+key);}
    @Override protected void init() {
        boolean online=minecraft.getConnection()!=null;
        if(!requested) {
            editable=!online;
            status=online?"loading":"local";
        }
        int w=Math.min(310,width-20),x=(width-w)/2;
        int y=Math.max(38,(height-206)/2);
        options.clear();
        for(int i=0;i<KEYS.length;i++) {
            final int index=i;
            Button option=Button.builder(label(i),button-> {
                int next=index<2?draft.value(index)%3+1:1-draft.value(index);
                draft=draft.with(index,next);button.setMessage(label(index));
            }).bounds(x,y+i*24,w,20).build();
            if(i==5)option.setTooltip(Tooltip.create(text("flashbang_hint")));
            options.add(addRenderableWidget(option));
        }
        reset=addRenderableWidget(Button.builder(text("reset"),button->{draft=Settings.DEFAULT;refresh();}).bounds(x,y+148,w,20).build());
        save=addRenderableWidget(Button.builder(text("save"),button->save()).bounds(x,y+176,(w-4)/2,20).build());
        addRenderableWidget(Button.builder(text("cancel"),button->onClose()).bounds(x+(w+4)/2,y+176,(w-4)/2,20).build());
        refresh();
        if(online&&!requested) {
            requested=true;
            if(ClientPlayNetworking.canSend(ConfigPayload.TYPE))ClientPlayNetworking.send(new ConfigPayload(ConfigPayload.REQUEST,draft,false));
            else {status="unsupported";refresh();}
        }
    }
    private Component label(int index) {
        Component value=index<2?text("level."+draft.value(index)):text(draft.value(index)==1?"on":"off");
        return Component.translatable("impossible_difficulty.config.option",text(KEYS[index]),value);
    }
    private void refresh() {
        for(int i=0;i<options.size();i++){options.get(i).setMessage(label(i));options.get(i).active=editable&&!pending;}
        save.active=reset.active=editable&&!pending;
    }
    private void save() {
        if(!editable||pending)return;
        if(minecraft.getConnection()==null) {
            if(ConfigStore.save(draft))onClose();else {status="error";refresh();}
        } else {
            pending=true;status="saving";refresh();
            ClientPlayNetworking.send(new ConfigPayload(ConfigPayload.SAVE,draft,false));
        }
    }
    public void receive(ConfigPayload payload) {
        if(payload.action()!=ConfigPayload.SNAPSHOT&&payload.action()!=ConfigPayload.SAVED&&payload.action()!=ConfigPayload.ERROR)return;
        if(!payload.settings().valid())return;
        editable=payload.editable();draft=payload.settings();
        if(pending&&payload.action()==ConfigPayload.SAVED){pending=false;onClose();return;}
        pending=false;status=payload.action()==ConfigPayload.ERROR?"error":editable?"server":"readonly";
        refresh();
    }
    @Override public void render(GuiGraphics graphics,int mouseX,int mouseY,float delta) {
        super.render(graphics,mouseX,mouseY,delta);
        graphics.drawCenteredString(font,title,width/2,14,0xFFFFFFFF);
        graphics.drawCenteredString(font,text(status),width/2,28,0xFFBBBBBB);
    }
    @Override public void onClose() {minecraft.setScreen(parent);}
}
