package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled185 {
    public static void register() {
        Logic.register("impossible_to_survive:features/furnace/zzz/118", Compiled185::f0);
        Logic.register("impossible_to_survive:features/furnace/zzz/119", Compiled185::f1);
        Logic.register("impossible_to_survive:features/furnace/zzz/12", Compiled185::f2);
        Logic.register("impossible_to_survive:features/furnace/zzz/120", Compiled185::f3);
        Logic.register("impossible_to_survive:features/furnace/zzz/121", Compiled185::f4);
        Logic.register("impossible_to_survive:features/furnace/zzz/122", Compiled185::f5);
        Logic.register("impossible_to_survive:features/furnace/zzz/123", Compiled185::f6);
        Logic.register("impossible_to_survive:features/furnace/zzz/124", Compiled185::f7);
        Logic.register("impossible_to_survive:features/furnace/zzz/125", Compiled185::f8);
        Logic.register("impossible_to_survive:features/furnace/zzz/126", Compiled185::f9);
        Logic.register("impossible_to_survive:features/furnace/zzz/127", Compiled185::f10);
        Logic.register("impossible_to_survive:features/furnace/zzz/128", Compiled185::f11);
        Logic.register("impossible_to_survive:features/furnace/zzz/129", Compiled185::f12);
        Logic.register("impossible_to_survive:features/furnace/zzz/13", Compiled185::f13);
        Logic.register("impossible_to_survive:features/furnace/zzz/130", Compiled185::f14);
        Logic.register("impossible_to_survive:features/furnace/zzz/131", Compiled185::f15);
        Logic.register("impossible_to_survive:features/furnace/zzz/132", Compiled185::f16);
        Logic.register("impossible_to_survive:features/furnace/zzz/133", Compiled185::f17);
        Logic.register("impossible_to_survive:features/furnace/zzz/134", Compiled185::f18);
        Logic.register("impossible_to_survive:features/furnace/zzz/135", Compiled185::f19);
        Logic.register("impossible_to_survive:features/furnace/zzz/136", Compiled185::f20);
        Logic.register("impossible_to_survive:features/furnace/zzz/137", Compiled185::f21);
        Logic.register("impossible_to_survive:features/furnace/zzz/138", Compiled185::f22);
        Logic.register("impossible_to_survive:features/furnace/zzz/139", Compiled185::f23);
    }
    // impossible_to_survive:features/furnace/zzz/118
    private static int f0(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.1356202254591257", "~-0.03584082648122417", "~-0.12295255145532906", "0.8288716892994215", "-0.08722989119783958", "0.008013098172153255", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.049589044640868926", "~0.08675511769328978", "~-0.04060309272468641", "1.3118946275035448", "-0.0034089750346845363", "0.07306382000384985", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/119
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/120"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/121"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/12
    private static int f2(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.13405230190721598", "~-0.13062768026066976", "~0.05327590623667933", "-0.001232653519415683", "0.005142291407978128", "-0.9158777995221505", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.1136412192359618", "~0.06070661654452625", "~0.11601027150770886", "-0.021682901209853833", "0.09827851010905345", "-1.5294785552855803", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/120
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/121
    private static int f4(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/122
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/123"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/124"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/123
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/124
    private static int f7(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/125
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/126"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/127"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/126
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/127
    private static int f10(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/128
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/129"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/130"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/129
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/13
    private static int f13(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.121544638263926", "~0.09130559042697994", "~0.0476106588249219", "-0.0033429116992508058", "0.07726238239450081", "-1.0272286582452668", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.05245464688538204", "~0.08973794918942488", "~-0.10714978940189443", "0.045023377391950704", "-0.0841084113902718", "-1.5162497846537626", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/130
    private static int f14(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/131
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/132"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/133"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/132
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/133
    private static int f17(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/134
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/135"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/136"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/135
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/136
    private static int f20(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/137
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/138"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/139"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/138
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/139
    private static int f23(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
}
