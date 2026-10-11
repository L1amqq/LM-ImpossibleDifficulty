package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled154 {
    public static void register() {
        Logic.register("impossible_to_survive:challenge/book/click_event/keep_inventory_off", Compiled154::f2);
        Logic.register("impossible_to_survive:challenge/book/click_event/keep_inventory_on", Compiled154::f3);
        Logic.register("impossible_to_survive:challenge/book/click_event/night_vision_off", Compiled154::f4);
        Logic.register("impossible_to_survive:challenge/book/click_event/night_vision_on", Compiled154::f5);
        Logic.register("impossible_to_survive:challenge/book/click_event/saturation_off", Compiled154::f10);
        Logic.register("impossible_to_survive:challenge/book/click_event/saturation_on", Compiled154::f11);
        Logic.register("impossible_to_survive:challenge/book/click_event/show_discovered_feature_count", Compiled154::f12);
        Logic.register("impossible_to_survive:challenge/book/click_event/unlock_dragon_staff", Compiled154::f15);
        Logic.register("impossible_to_survive:challenge/book/click_event/unlock_totems", Compiled154::f16);
        Logic.register("impossible_to_survive:challenge/book/give", Compiled154::f23);
    }
    // impossible_to_survive:challenge/book/click_event/keep_inventory_off
    private static int f2(Frame c) {
        Logic.step(() -> Native.gamerule(c, "keepInventory", "false"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.tripwire.click_off", "master", "@s", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:challenge/book/click_event/keep_inventory_on
    private static int f3(Frame c) {
        Logic.step(() -> Native.gamerule(c, "keepInventory", "true"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.tripwire.click_on", "master", "@s", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:challenge/book/click_event/night_vision_off
    private static int f4(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:block.tripwire.click_on", "master", "@s", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "nightVision", "0"));
        return 1;
    }
    // impossible_to_survive:challenge/book/click_event/night_vision_on
    private static int f5(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:block.tripwire.click_on", "master", "@s", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "nightVision", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/book/click_event/saturation_off
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "infinite_saturation", "0"));
        Logic.step(() -> Native.effect(c, "clear", "@a", "minecraft:saturation"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.tripwire.click_off", "master", "@s", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:challenge/book/click_event/saturation_on
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "infinite_saturation", "1"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.tripwire.click_on", "master", "@s", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:challenge/book/click_event/show_discovered_feature_count
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "display_override_timer", "60"));
        Logic.step(() -> Native.title(c, "@a", "actionbar", "[{\"text\":\"D\",\"color\":\"#d99834\"},{\"text\":\"i\",\"color\":\"#d9a02f\"},{\"text\":\"s\",\"color\":\"#daa82a\"},{\"text\":\"c\",\"color\":\"#dab025\"},{\"text\":\"o\",\"color\":\"#dbb820\"},{\"text\":\"v\",\"color\":\"#dcc01c\"},{\"text\":\"e\",\"color\":\"#dbb420\"},{\"text\":\"r\",\"color\":\"#daa825\"},{\"text\":\"e\",\"color\":\"#da9c2a\"},{\"text\":\"d\",\"color\":\"#d9902f\"},{\"text\":\": \",\"color\":\"#d98434\"},{\"score\":{\"name\":\"#global\",\"objective\":\"mcm.itsv.feature_encountered\"},\"color\":\"#80FF80\",\"bold\":false},{\"text\":\"/\",\"color\":\"white\",\"bold\":false},{\"text\":\"3\",\"color\":\"#3DE13D\",\"bold\":false},{\"text\":\"4\",\"color\":\"#32D232\",\"bold\":false}]"));
        return 1;
    }
    // impossible_to_survive:challenge/book/click_event/unlock_dragon_staff
    private static int f15(Frame c) {
        Logic.step(() -> Native.loot(c, "give", "@s", "loot", "impossible_to_survive:challenge_dragon_staff"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.tripwire.click_on", "master", "@s", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:challenge/book/click_event/unlock_totems
    private static int f16(Frame c) {
        Logic.step(() -> Native.loot(c, "give", "@s", "loot", "impossible_to_survive:totem_of_nutrition"));
        Logic.step(() -> Native.loot(c, "give", "@s", "loot", "impossible_to_survive:totem_of_preservation"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.tripwire.click_on", "master", "@s", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:challenge/book/give
    private static int f23(Frame c) throws Exception {
        return Native.give(c,"@s","written_book[written_book_content={title:\"Управление модом\",author:\"LIAM\",pages:[\"[{\\\"text\\\": \\\"Выдать посох дракона\\\\n\\\", \\\"color\\\": \\\"dark_purple\\\", \\\"clickEvent\\\": {\\\"action\\\": \\\"run_command\\\", \\\"value\\\": \\\"/impossible action impossible_to_survive:challenge/book/click_event/unlock_dragon_staff\\\"}}, {\\\"text\\\": \\\"Выдать тотемы\\\\n\\\", \\\"color\\\": \\\"dark_purple\\\", \\\"clickEvent\\\": {\\\"action\\\": \\\"run_command\\\", \\\"value\\\": \\\"/impossible action impossible_to_survive:challenge/book/click_event/unlock_totems\\\"}}, {\\\"text\\\": \\\"Ночное зрение: вкл.\\\\n\\\", \\\"color\\\": \\\"dark_purple\\\", \\\"clickEvent\\\": {\\\"action\\\": \\\"run_command\\\", \\\"value\\\": \\\"/impossible action impossible_to_survive:challenge/book/click_event/night_vision_on\\\"}}, {\\\"text\\\": \\\"Ночное зрение: выкл.\\\\n\\\", \\\"color\\\": \\\"dark_purple\\\", \\\"clickEvent\\\": {\\\"action\\\": \\\"run_command\\\", \\\"value\\\": \\\"/impossible action impossible_to_survive:challenge/book/click_event/night_vision_off\\\"}}, {\\\"text\\\": \\\"Насыщение: вкл.\\\\n\\\", \\\"color\\\": \\\"dark_purple\\\", \\\"clickEvent\\\": {\\\"action\\\": \\\"run_command\\\", \\\"value\\\": \\\"/impossible action impossible_to_survive:challenge/book/click_event/saturation_on\\\"}}, {\\\"text\\\": \\\"Насыщение: выкл.\\\\n\\\", \\\"color\\\": \\\"dark_purple\\\", \\\"clickEvent\\\": {\\\"action\\\": \\\"run_command\\\", \\\"value\\\": \\\"/impossible action impossible_to_survive:challenge/book/click_event/saturation_off\\\"}}, {\\\"text\\\": \\\"Сохранение инвентаря: вкл.\\\\n\\\", \\\"color\\\": \\\"dark_purple\\\", \\\"clickEvent\\\": {\\\"action\\\": \\\"run_command\\\", \\\"value\\\": \\\"/impossible action impossible_to_survive:challenge/book/click_event/keep_inventory_on\\\"}}, {\\\"text\\\": \\\"Сохранение инвентаря: выкл.\\\\n\\\", \\\"color\\\": \\\"dark_purple\\\", \\\"clickEvent\\\": {\\\"action\\\": \\\"run_command\\\", \\\"value\\\": \\\"/impossible action impossible_to_survive:challenge/book/click_event/keep_inventory_off\\\"}}, {\\\"text\\\": \\\"Счётчик событий\\\\n\\\", \\\"color\\\": \\\"dark_purple\\\", \\\"clickEvent\\\": {\\\"action\\\": \\\"run_command\\\", \\\"value\\\": \\\"/impossible action impossible_to_survive:challenge/book/click_event/show_discovered_feature_count\\\"}}]\"]}]","1");
    }
}
