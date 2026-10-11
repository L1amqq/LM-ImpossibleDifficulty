package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled159 {
    public static void register() {
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/5", Compiled159::f0);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/6", Compiled159::f1);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/7", Compiled159::f2);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/8", Compiled159::f3);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/9", Compiled159::f4);
        Logic.register("impossible_to_survive:challenge/load", Compiled159::f6);
        Logic.register("impossible_to_survive:clock_10s", Compiled159::f13);
        Logic.register("impossible_to_survive:clock_10t", Compiled159::f14);
        Logic.register("impossible_to_survive:clock_1s", Compiled159::f15);
        Logic.register("impossible_to_survive:clock_2s", Compiled159::f16);
        Logic.register("impossible_to_survive:clock_2t", Compiled159::f17);
        Logic.register("impossible_to_survive:clock_3t", Compiled159::f18);
        Logic.register("impossible_to_survive:clock_5s", Compiled159::f19);
        Logic.register("impossible_to_survive:clock_5t", Compiled159::f20);
        Logic.register("impossible_to_survive:complete_message", Compiled159::f21);
        Logic.register("impossible_to_survive:count_features", Compiled159::f22);
        Logic.register("impossible_to_survive:dragon_book/attempt_give", Compiled159::f23);
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/5
    private static int f0(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Hope you enjoy the new gold block drop!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.gold_block", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/6
    private static int f1(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Watch your step, walking beneath glowstone is known to give bad luck!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.glowstone", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/7
    private static int f2(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Looks like wither skeletons are in the mood for hide and seek!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.wither_skeleton", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/8
    private static int f3(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Hope you brought a surfboard!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.lava_wave", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/9
    private static int f4(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Enjoy your new pet!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.ender_eye", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/load
    private static int f6(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.shark", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.storm", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.cactus", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.lava_wave", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.ender_eye", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.diamond", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.iron", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.coal", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.redstone", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.sugar_cane", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.tree", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.soul_sand", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.bed", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.furnace", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.crafting_table", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.nether_portal", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.chest", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.cow", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.pig", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.chicken", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.villager", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.zombie", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.skeleton", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.creeper", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.sheep", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.enderman", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.blaze", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.enderpearl", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.dragon", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.armor", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.wither_skeleton", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.gold_block", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.glowstone", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.enchanting_table", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.obsidian", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.trident", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.scarecrow", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.spider", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.land_shark", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.anvil", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.smoker", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.brewing_stand", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.slime", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.vampire", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.sculk_root", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.sculk_hand", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.shears", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.itsv.feature_encountered.shulker", "dummy"));
        return 1;
    }
    // impossible_to_survive:clock_10s
    private static int f13(Frame c) {
        Logic.step(() -> Native.schedule(c, "function", "impossible_to_survive:clock_10s", "10s", "replace"));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@a", "minecraft:saturation", "infinite", "0", "true"), Control.when("score", "#global", "infinite_saturation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/10s"), Control.as("@a"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:clock_10t
    private static int f14(Frame c) {
        Logic.step(() -> Native.schedule(c, "function", "impossible_to_survive:clock_10t", "10t", "replace"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/loop_10t"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:clock_1s
    private static int f15(Frame c) {
        Logic.step(() -> Native.schedule(c, "function", "impossible_to_survive:clock_1s", "1s", "replace"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/31"), Control.as("@a"), Control.at("@s")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/tick_1s"));
        return 1;
    }
    // impossible_to_survive:clock_2s
    private static int f16(Frame c) {
        Logic.step(() -> Native.schedule(c, "function", "impossible_to_survive:clock_2s", "2s", "replace"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/2s"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/32"), Control.as("@e[type=!player]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:clock_2t
    private static int f17(Frame c) {
        Logic.step(() -> Native.schedule(c, "function", "impossible_to_survive:clock_2t", "2t", "replace"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/2t"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:clock_3t
    private static int f18(Frame c) {
        Logic.step(() -> Native.schedule(c, "function", "impossible_to_survive:clock_3t", "3t", "replace"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/3t"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:clock_5s
    private static int f19(Frame c) {
        Logic.step(() -> Native.schedule(c, "function", "impossible_to_survive:clock_5s", "5s", "replace"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/34"), Control.as("@a"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/35"), Control.when("score", "#global", "stormTimer", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/37"), Control.as("@e[type=marker]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/loop_5s"), Control.as("@e[type=item_display,tag=aj.impossible_dragon.root]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:clock_5t
    private static int f20(Frame c) {
        Logic.step(() -> Native.schedule(c, "function", "impossible_to_survive:clock_5t", "5t", "replace"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/5t"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:complete_message
    private static int f21(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "{\"text\":\"\"}"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\"},{\"text\":\"D\",\"bold\":true,\"color\":\"dark_green\"},{\"text\":\"i\",\"bold\":true,\"color\":\"#0ac40a\"},{\"text\":\"f\",\"bold\":true,\"color\":\"#14cb14\"},{\"text\":\"f\",\"bold\":true,\"color\":\"#1ed21e\"},{\"text\":\"i\",\"bold\":true,\"color\":\"#28d928\"},{\"text\":\"c\",\"bold\":true,\"color\":\"#32df32\"},{\"text\":\"u\",\"bold\":true,\"color\":\"#3ce63c\"},{\"text\":\"l\",\"bold\":true,\"color\":\"#46ed46\"},{\"text\":\"t\",\"bold\":true,\"color\":\"#50f450\"},{\"text\":\"y \",\"bold\":true,\"color\":\"#5afb5a\"},{\"text\":\"c\",\"bold\":true,\"color\":\"#50f450\"},{\"text\":\"o\",\"bold\":true,\"color\":\"#45ed45\"},{\"text\":\"m\",\"bold\":true,\"color\":\"#3ce63c\"},{\"text\":\"p\",\"bold\":true,\"color\":\"#32df32\"},{\"text\":\"l\",\"bold\":true,\"color\":\"#28d928\"},{\"text\":\"e\",\"bold\":true,\"color\":\"#1dd21d\"},{\"text\":\"t\",\"bold\":true,\"color\":\"#14cb14\"},{\"text\":\"e\",\"bold\":true,\"color\":\"#0ac40a\"},{\"text\":\"d \",\"bold\":true,\"color\":\"dark_green\"},{\"text\":\"\\u0022\",\"font\":\"minecraft:icons\",\"color\":\"#4e5c24\"}]"));
        Logic.step(() -> Native.tellraw(c, "@s", "{\"text\":\"\"}"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"Thanks for playing! Please consider supporting me so I can continue releasing free datapacks! \",\"color\":\"white\",\"font\":\"minecraft:default\"},{\"text\":\"\\u0070\",\"font\":\"minecraft:icons\",\"color\":\"white\"}]"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"~LIAM\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.tellraw(c, "@s", "{\"text\":\"\"}"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"%\",\"font\":\"minecraft:icons\",\"color\":\"white\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.youtube.com/@liamkkd\"},\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"Click to subscribe and never miss any of my new videos!\",\"color\":\"red\"}]}},{\"text\":\" Subscribe on Youtube! \",\"font\":\"minecraft:default\",\"color\":\"aqua\"},{\"text\":\"$\",\"font\":\"minecraft:icons\",\"color\":\"white\"}]"));
        return 1;
    }
    // impossible_to_survive:count_features
    private static int f22(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "hermit_feature_counter", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.shark", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.storm", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.cactus", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.lava_wave", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.ender_eye", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.diamond", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.iron", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.coal", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.redstone", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.sugar_cane", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.tree", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.soul_sand", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.bed", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.furnace", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.crafting_table", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.nether_portal", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.chest", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.cow", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.pig", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.chicken", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.villager", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.zombie", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.skeleton", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.creeper", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.sheep", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.enderman", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.blaze", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.enderpearl", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.dragon", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.armor", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.wither_skeleton", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.gold_block", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.glowstone", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.enchanting_table", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.obsidian", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.trident", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.scarecrow", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.spider", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.land_shark", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.anvil", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.smoker", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.brewing_stand", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.slime", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.vampire", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.sculk_root", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.sculk_hand", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.shears", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "hermit_feature_counter", "1"), Control.when("score", "@s", "mcm.itsv.feature_encountered.shulker", "matches", "1..")));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.experience_orb.pickup", "master", "@s", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"D\",\"color\":\"#d99834\"},{\"text\":\"i\",\"color\":\"#d9a02f\"},{\"text\":\"s\",\"color\":\"#daa82a\"},{\"text\":\"c\",\"color\":\"#dab025\"},{\"text\":\"o\",\"color\":\"#dbb820\"},{\"text\":\"v\",\"color\":\"#dcc01c\"},{\"text\":\"e\",\"color\":\"#dbb420\"},{\"text\":\"r\",\"color\":\"#daa825\"},{\"text\":\"e\",\"color\":\"#da9c2a\"},{\"text\":\"d\",\"color\":\"#d9902f\"},{\"text\":\": \",\"color\":\"#d98434\"},{\"score\":{\"name\":\"@s\",\"objective\":\"hermit_feature_counter\"},\"color\":\"#80FF80\",\"bold\":false},{\"text\":\"/\",\"color\":\"white\",\"bold\":false},{\"text\":\"4\",\"color\":\"#3DE13D\",\"bold\":false},{\"text\":\"8\",\"color\":\"#3DE13D\",\"bold\":false}]"));
        return 1;
    }
    // impossible_to_survive:dragon_book/attempt_give
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:dragon_book/zzz/4"), Control.unless("predicate", "impossible_to_survive:has_guide_book")));
        return 1;
    }
}
