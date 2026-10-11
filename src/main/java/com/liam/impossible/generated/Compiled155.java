package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled155 {
    public static void register() {
        Logic.register("impossible_to_survive:challenge/feature_encounter/anvil", Compiled155::f2);
        Logic.register("impossible_to_survive:challenge/feature_encounter/armor", Compiled155::f3);
        Logic.register("impossible_to_survive:challenge/feature_encounter/bed", Compiled155::f4);
        Logic.register("impossible_to_survive:challenge/feature_encounter/blaze", Compiled155::f5);
        Logic.register("impossible_to_survive:challenge/feature_encounter/brewing_stand", Compiled155::f6);
        Logic.register("impossible_to_survive:challenge/feature_encounter/cactus", Compiled155::f7);
        Logic.register("impossible_to_survive:challenge/feature_encounter/chest", Compiled155::f8);
        Logic.register("impossible_to_survive:challenge/feature_encounter/chicken", Compiled155::f9);
        Logic.register("impossible_to_survive:challenge/feature_encounter/coal", Compiled155::f10);
        Logic.register("impossible_to_survive:challenge/feature_encounter/cow", Compiled155::f11);
        Logic.register("impossible_to_survive:challenge/feature_encounter/crafting_table", Compiled155::f12);
        Logic.register("impossible_to_survive:challenge/feature_encounter/creeper", Compiled155::f13);
        Logic.register("impossible_to_survive:challenge/feature_encounter/diamond", Compiled155::f14);
        Logic.register("impossible_to_survive:challenge/feature_encounter/dragon", Compiled155::f15);
        Logic.register("impossible_to_survive:challenge/feature_encounter/enchanting_table", Compiled155::f16);
        Logic.register("impossible_to_survive:challenge/feature_encounter/ender_eye", Compiled155::f17);
        Logic.register("impossible_to_survive:challenge/feature_encounter/enderman", Compiled155::f18);
        Logic.register("impossible_to_survive:challenge/feature_encounter/enderpearl", Compiled155::f19);
        Logic.register("impossible_to_survive:challenge/feature_encounter/furnace", Compiled155::f20);
        Logic.register("impossible_to_survive:challenge/feature_encounter/glowstone", Compiled155::f21);
        Logic.register("impossible_to_survive:challenge/feature_encounter/gold_block", Compiled155::f22);
    }
    // impossible_to_survive:challenge/feature_encounter/anvil
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/41"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.anvil", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/armor
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/35"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.armor", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/36"), Control.unless("score", "#global", "toggle_armor_settings_message", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/bed
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/17"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.bed", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/blaze
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/32"), Control.as("@a[distance=..25]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.blaze", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/brewing_stand
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/43"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.brewing_stand", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/cactus
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/4"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.cactus", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/chest
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/21"), Control.as("@a[distance=..15]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.chest", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/chicken
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/24"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.chicken", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/coal
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/12"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.coal", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/cow
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/22"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.cow", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/crafting_table
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/19"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.crafting_table", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/creeper
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/28"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.creeper", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/diamond
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/10"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.diamond", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/dragon
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/34"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.dragon", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/enchanting_table
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/1"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.enchanting_table", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/ender_eye
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/9"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.ender_eye", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/enderman
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/30"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.enderman", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/enderpearl
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/33"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.enderpearl", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/furnace
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/18"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.furnace", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/glowstone
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/6"), Control.as("@a[distance=..30]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.glowstone", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:challenge/feature_encounter/gold_block
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/zzz/5"), Control.as("@a[distance=..20]"), Control.at("@s"), Control.unless("score", "@s", "mcm.itsv.feature_encountered.gold_block", "matches", "1")));
        return 1;
    }
}
