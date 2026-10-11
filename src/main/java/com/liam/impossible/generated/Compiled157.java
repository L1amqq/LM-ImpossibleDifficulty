package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled157 {
    public static void register() {
        Logic.register("impossible_to_survive:challenge/feature_encounter/villager", Compiled157::f0);
        Logic.register("impossible_to_survive:challenge/feature_encounter/wither_skeleton", Compiled157::f1);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zombie", Compiled157::f2);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/0", Compiled157::f3);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/1", Compiled157::f4);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/10", Compiled157::f5);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/11", Compiled157::f6);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/12", Compiled157::f7);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/13", Compiled157::f8);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/14", Compiled157::f9);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/15", Compiled157::f10);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/16", Compiled157::f11);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/17", Compiled157::f12);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/18", Compiled157::f13);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/19", Compiled157::f14);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/2", Compiled157::f15);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/20", Compiled157::f16);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/21", Compiled157::f17);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/22", Compiled157::f18);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/23", Compiled157::f19);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/24", Compiled157::f20);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/25", Compiled157::f21);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/26", Compiled157::f22);
        Logic.register("impossible_to_survive:challenge/feature_encounter/zzz/27", Compiled157::f23);
    }
    // impossible_to_survive:challenge/feature_encounter/villager
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/25"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.villager", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/wither_skeleton
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/7"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.wither_skeleton", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zombie
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/26"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.zombie", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/0
    private static int f3(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Very kind that you're feeding the sharks!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.shark", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/1
    private static int f4(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"The enchanting book did not consent to its knowledge being consumed!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.enchanting_table", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/10
    private static int f5(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Diamonds are looking extra shiny today...\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.diamond", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/11
    private static int f6(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"You'll have to work a little harder to get iron!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.iron", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/12
    private static int f7(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"You better pick up coal quickly!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.coal", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/13
    private static int f8(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Touching uninsulated wires truly is a very smart idea\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.redstone", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/14
    private static int f9(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Sugar Cane seems to have an attitude today...\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.sugar_cane", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/15
    private static int f10(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"It's tree shedding season!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.tree", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/16
    private static int f11(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"I wouldn't touch that if I were you...\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.soul_sand", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/17
    private static int f12(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Your bed must have gotten brand new springs...\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.bed", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/18
    private static int f13(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"The furnace can't seem to handle the heat\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.furnace", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/19
    private static int f14(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"You gotta craft faster than that...\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.crafting_table", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/2
    private static int f15(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Obsidian appears to have self-destructive tendencies\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.obsidian", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/20
    private static int f16(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"The souls don't want you in the Nether!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.nether_portal", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/21
    private static int f17(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Theft is not taken lightly among Shulkers...\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.chest", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/22
    private static int f18(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Hope you're thirsty for milk!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.cow", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/23
    private static int f19(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Oink oink, mate!\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.pig", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/24
    private static int f20(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Heads up, \",\"color\":\"aqua\"},{\"selector\":\"@p[tag=survivor,predicate=mcm:gm/vulnerable]\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.chicken", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/25
    private static int f21(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Looks like Villagers have entered the industrial age\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.villager", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/26
    private static int f22(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"You've angered the wrong zombie...\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.zombie", "1"));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/zzz/27
    private static int f23(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",\"<\",{\"text\":\"LIAM> \",\"color\":\"aqua\"},{\"text\":\"Are you enjoying the new arrow upgrade?\",\"color\":\"aqua\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.itsv.feature_encountered.skeleton", "1"));
        return 1;
    }
}
