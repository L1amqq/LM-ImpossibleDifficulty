package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled158 {
    public static void register() {
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/28", Compiled158::f0);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/29", Compiled158::f1);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/3", Compiled158::f2);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/30", Compiled158::f3);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/31", Compiled158::f4);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/32", Compiled158::f5);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/33", Compiled158::f6);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/34", Compiled158::f7);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/35", Compiled158::f8);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/36", Compiled158::f9);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/37", Compiled158::f10);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/38", Compiled158::f11);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/39", Compiled158::f12);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/4", Compiled158::f13);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/40", Compiled158::f14);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/41", Compiled158::f15);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/42", Compiled158::f16);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/43", Compiled158::f17);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/44", Compiled158::f18);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/45", Compiled158::f19);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/46", Compiled158::f20);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/47", Compiled158::f21);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/48", Compiled158::f22);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/49", Compiled158::f23);
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/28
    private static int f0(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Have fun filling up this Creeper hole!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.creeper", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/29
    private static int f1(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"You came for wool, right?\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.sheep", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/3
    private static int f2(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"The weather doesn't seem to be in your favour today!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.storm", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/30
    private static int f3(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Good luck winning this staring contest!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.enderman", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/31"), Control.unless("score", "#global", "toggle_enderman_settings_message", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/31
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "toggle_enderman_settings_message", "1"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\n\"},{\"text\":\"\\u002a\",\"font\":\"minecraft:icons\",\"color\":\"white\",\"bold\":false},{\"text\":\" Hint:\",\"bold\":true,\"color\":\"#d9d134\",\"font\":\"minecraft:default\"},{\"text\":\" The enderman feature only works in singleplayer and causes rubberbanding on servers. You can disabled it using the command: \",\"color\":\"aqua\",\"font\":\"minecraft:default\"},{\"text\":\" /trigger toggle_endermen\",\"color\":\"gray\",\"font\":\"minecraft:default\"}]"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/32
    private static int f5(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Blazes seem to have gotten a little upgrade\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.blaze", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/33
    private static int f6(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Enderpearls now come with free Lasik surgery!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.enderpearl", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/34
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.dragon", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/35
    private static int f8(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Too much armor is just gonna slow you down...\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.armor", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/36
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "toggle_armor_settings_message", "1"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u002a\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\" Hint:\",\"bold\":true,\"color\":\"#d9d134\",\"font\":\"minecraft:default\"},{\"text\":\" Armor gives you slowness in this gamemode. If you'd prefer playing without this mechanic you can disable it with the command\",\"color\":\"aqua\",\"font\":\"minecraft:default\"},{\"text\":\" /trigger toggle_armor_slowdown\",\"color\":\"gray\",\"font\":\"minecraft:default\"}]"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/37
    private static int f10(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Congratulations, you fished up some extra loot!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.trident", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/38
    private static int f11(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"You've grown yourself a problem!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.scarecrow", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/39
    private static int f12(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Evolution gave spiders a little upgrade!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.spider", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/4
    private static int f13(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"The cactus doesn't want hugs today!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.cactus", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/40
    private static int f14(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Oh, you thought sharks were aquatic animals?\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.land_shark", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/41
    private static int f15(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Anvils took some self-defense classes!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.anvil", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/42
    private static int f16(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Your lungs don't appreciate you standing this close to a smoker!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.smoker", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/43
    private static int f17(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"The scientifically correct brewing temperature is widely known to be 20-25 blazepowder!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.brewing_stand", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/44
    private static int f18(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Slimes are looking extra slimey...\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.slime", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/45
    private static int f19(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Kill a mob within 60 seconds to stop the vampire infection or die instantly!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.vampire", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/46
    private static int f20(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Hope you don't mind that I fertilized sculk a bit\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.sculk_root", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/47
    private static int f21(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Watch your step, the depths are calling!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.sculk_hand", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/48
    private static int f22(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"I wouldn't recommend running while holding shears...\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.shears", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/49
    private static int f23(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"You'll have to try a little harder to kill shulkers!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.shulker", "1"));
        return 1;
    }
}
