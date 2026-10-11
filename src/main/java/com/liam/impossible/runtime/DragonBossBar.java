package com.liam.impossible.runtime;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.FontDescription;
import net.minecraft.resources.Identifier;
import net.minecraft.server.bossevents.CustomBossEvent;
import net.minecraft.world.BossEvent;
import java.util.Locale;
import java.util.Optional;

/** Original bitmap layout, now with a bright Russian texture and no shader marker tint. */
public final class DragonBossBar {
    public static final String NAME_KEY="impossible_difficulty.game.48ad3c29f330";
    private static final Identifier ID=Identifier.withDefaultNamespace("impossible_dragon");
    public static boolean matches(Identifier id){return ID.equals(id);}
    public static Component name(String authored){
        int hearts=authored.contains("bossbar_3")?1:authored.contains("bossbar_2")?2:3;
        return title(hearts);
    }
    public static Component title(int hearts){
        return Component.literal("\uFFF1").withStyle(style->style.withColor(0xFFFFFF).withFont(
            new FontDescription.Resource(Identifier.withDefaultNamespace("bossbar_"+(4-Math.clamp(hearts,1,3))))));
    }
    private static Optional<String> bitmapFont(Component name){
        return name.visit((style,text)->text.indexOf('\uFFF1')>=0?Optional.of(style.getFont().toString()):Optional.empty(),Style.EMPTY);
    }
    public static boolean matches(Component name){
        return name.getContents() instanceof TranslatableContents text&&text.getKey().equals(NAME_KEY)||
            bitmapFont(name).map(font->font.contains("bossbar_")).orElse(false);
    }
    public static int hearts(Component name){
        return bitmapFont(name).map(font->font.contains("bossbar_3")?1:font.contains("bossbar_2")?2:3)
            .orElseGet(()->Math.clamp((int)name.getString().chars().filter(c->c=='♥').count(),1,3));
    }
    public static void refresh(Identifier id,CustomBossEvent event){
        if(!matches(id))return;
        if(matches(event.getName())){
            Component expected=title(hearts(event.getName()));
            if(!expected.equals(event.getName()))event.setName(expected);
        }
        if(event.getColor()==BossEvent.BossBarColor.PINK)event.setColor(BossEvent.BossBarColor.BLUE);
        else if(event.getColor()==BossEvent.BossBarColor.WHITE)event.setColor(BossEvent.BossBarColor.PURPLE);
    }
    public static BossEvent.BossBarColor color(Identifier id,String authored){
        return BossEvent.BossBarColor.valueOf(authored.toUpperCase(Locale.ROOT));
    }
}
