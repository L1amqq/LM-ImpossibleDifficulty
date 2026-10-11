package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled156 {
    public static void register() {
        Logic.register("impossible_to_survive:challenge/feature_encounter/iron", Compiled156::f0);
        Logic.register("impossible_to_survive:challenge/feature_encounter/land_shark", Compiled156::f1);
        Logic.register("impossible_to_survive:challenge/feature_encounter/lava_wave", Compiled156::f2);
        Logic.register("impossible_to_survive:challenge/feature_encounter/nether_portal", Compiled156::f3);
        Logic.register("impossible_to_survive:challenge/feature_encounter/obsidian", Compiled156::f4);
        Logic.register("impossible_to_survive:challenge/feature_encounter/pig", Compiled156::f5);
        Logic.register("impossible_to_survive:challenge/feature_encounter/redstone", Compiled156::f6);
        Logic.register("impossible_to_survive:challenge/feature_encounter/scarecrow", Compiled156::f7);
        Logic.register("impossible_to_survive:challenge/feature_encounter/sculk_hand", Compiled156::f8);
        Logic.register("impossible_to_survive:challenge/feature_encounter/sculk_root", Compiled156::f9);
        Logic.register("impossible_to_survive:challenge/feature_encounter/shark", Compiled156::f10);
        Logic.register("impossible_to_survive:challenge/feature_encounter/shears", Compiled156::f11);
        Logic.register("impossible_to_survive:challenge/feature_encounter/sheep", Compiled156::f12);
        Logic.register("impossible_to_survive:challenge/feature_encounter/shulker", Compiled156::f13);
        Logic.register("impossible_to_survive:challenge/feature_encounter/skeleton", Compiled156::f14);
        Logic.register("impossible_to_survive:challenge/feature_encounter/slime", Compiled156::f15);
        Logic.register("impossible_to_survive:challenge/feature_encounter/smoker", Compiled156::f16);
        Logic.register("impossible_to_survive:challenge/feature_encounter/soul_sand", Compiled156::f17);
        Logic.register("impossible_to_survive:challenge/feature_encounter/spider", Compiled156::f18);
        Logic.register("impossible_to_survive:challenge/feature_encounter/storm", Compiled156::f19);
        Logic.register("impossible_to_survive:challenge/feature_encounter/sugarcane", Compiled156::f20);
        Logic.register("impossible_to_survive:challenge/feature_encounter/tree", Compiled156::f21);
        Logic.register("impossible_to_survive:challenge/feature_encounter/trident", Compiled156::f22);
        Logic.register("impossible_to_survive:challenge/feature_encounter/vampire", Compiled156::f23);
    }
    // impossible_to_survive:challenge/feature_encounter/iron
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/11"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.iron", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/land_shark
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/40"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.land_shark", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/lava_wave
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/8"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.lava_wave", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/nether_portal
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/20"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.nether_portal", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/obsidian
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/2"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.obsidian", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/pig
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/23"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.pig", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/redstone
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/13"), Control.as("@a[distance=..15]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.redstone", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/scarecrow
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/38"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.scarecrow", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/sculk_hand
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/47"), Control.as("@a[distance=..10]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.sculk_hand", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/sculk_root
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/46"), Control.as("@a[distance=..15]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.sculk_root", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/shark
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/0"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.shark", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/shears
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/48"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.shears", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/sheep
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/29"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.sheep", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/shulker
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/49"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.shulker", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/skeleton
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/27"), Control.as("@a[distance=..25]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.skeleton", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/slime
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/44"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.slime", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/smoker
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/42"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.smoker", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/soul_sand
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/16"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.soul_sand", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/spider
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/39"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.spider", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/storm
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/3"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.storm", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/sugarcane
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/14"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.sugar_cane", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/tree
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/15"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.tree", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/trident
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/37"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.trident", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/vampire
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/45"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.vampire", "matches", "1")));
        return 1;
    }
}
