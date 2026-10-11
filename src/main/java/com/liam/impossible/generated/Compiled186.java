package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled186 {
    public static void register() {
        Logic.register("impossible_to_survive:features/furnace/zzz/14", Compiled186::f0);
        Logic.register("impossible_to_survive:features/furnace/zzz/140", Compiled186::f1);
        Logic.register("impossible_to_survive:features/furnace/zzz/141", Compiled186::f2);
        Logic.register("impossible_to_survive:features/furnace/zzz/142", Compiled186::f3);
        Logic.register("impossible_to_survive:features/furnace/zzz/15", Compiled186::f4);
        Logic.register("impossible_to_survive:features/furnace/zzz/16", Compiled186::f5);
        Logic.register("impossible_to_survive:features/furnace/zzz/17", Compiled186::f6);
        Logic.register("impossible_to_survive:features/furnace/zzz/18", Compiled186::f7);
        Logic.register("impossible_to_survive:features/furnace/zzz/19", Compiled186::f8);
        Logic.register("impossible_to_survive:features/furnace/zzz/2", Compiled186::f9);
        Logic.register("impossible_to_survive:features/furnace/zzz/20", Compiled186::f10);
        Logic.register("impossible_to_survive:features/furnace/zzz/21", Compiled186::f11);
        Logic.register("impossible_to_survive:features/furnace/zzz/22", Compiled186::f12);
        Logic.register("impossible_to_survive:features/furnace/zzz/23", Compiled186::f13);
        Logic.register("impossible_to_survive:features/furnace/zzz/24", Compiled186::f14);
        Logic.register("impossible_to_survive:features/furnace/zzz/25", Compiled186::f15);
        Logic.register("impossible_to_survive:features/furnace/zzz/26", Compiled186::f16);
        Logic.register("impossible_to_survive:features/furnace/zzz/27", Compiled186::f17);
        Logic.register("impossible_to_survive:features/furnace/zzz/28", Compiled186::f18);
        Logic.register("impossible_to_survive:features/furnace/zzz/29", Compiled186::f19);
        Logic.register("impossible_to_survive:features/furnace/zzz/3", Compiled186::f20);
        Logic.register("impossible_to_survive:features/furnace/zzz/30", Compiled186::f21);
        Logic.register("impossible_to_survive:features/furnace/zzz/31", Compiled186::f22);
        Logic.register("impossible_to_survive:features/furnace/zzz/32", Compiled186::f23);
    }
    // impossible_to_survive:features/furnace/zzz/14
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/15"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/16"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/140
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/141"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/142"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/141
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/142
    private static int f3(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/15
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.when("block", "~", "~", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/16
    private static int f5(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/17
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/18"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/19"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/18
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.when("block", "~", "~", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/19
    private static int f8(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/2
    private static int f9(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/furnace"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.blaze.shoot", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/20
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/21"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/22"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/21
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.when("block", "~", "~", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/22
    private static int f12(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/23
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/24"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/25"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/24
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.when("block", "~", "~", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/25
    private static int f15(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/26
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/27"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/28"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/27
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.when("block", "~", "~", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/28
    private static int f18(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/29
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/30"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/31"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/3
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/4"), Control.when("score", "@s", "misc", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/5"), Control.when("score", "@s", "misc", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/6"), Control.when("score", "@s", "misc", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/7"), Control.when("score", "@s", "misc", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/8"), Control.when("score", "@s", "misc", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/9"), Control.when("score", "@s", "misc", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/10"), Control.when("score", "@s", "misc", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/11"), Control.when("score", "@s", "misc", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/12"), Control.when("score", "@s", "misc", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/13"), Control.when("score", "@s", "misc", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/14"), Control.positioned("~", "~", "~-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/17"), Control.positioned("~", "~", "~-2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/20"), Control.positioned("~", "~", "~-3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/23"), Control.positioned("~", "~", "~-4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/26"), Control.positioned("~", "~", "~-5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/29"), Control.positioned("~", "~", "~-6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/32"), Control.positioned("~", "~", "~-7")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/35"), Control.positioned("~", "~", "~-8")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/30
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.when("block", "~", "~", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/31
    private static int f22(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/32
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/33"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/34"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
}
