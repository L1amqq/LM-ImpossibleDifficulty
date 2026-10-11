package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled188 {
    public static void register() {
        Logic.register("impossible_to_survive:features/furnace/zzz/55", Compiled188::f0);
        Logic.register("impossible_to_survive:features/furnace/zzz/56", Compiled188::f1);
        Logic.register("impossible_to_survive:features/furnace/zzz/57", Compiled188::f2);
        Logic.register("impossible_to_survive:features/furnace/zzz/58", Compiled188::f3);
        Logic.register("impossible_to_survive:features/furnace/zzz/59", Compiled188::f4);
        Logic.register("impossible_to_survive:features/furnace/zzz/6", Compiled188::f5);
        Logic.register("impossible_to_survive:features/furnace/zzz/60", Compiled188::f6);
        Logic.register("impossible_to_survive:features/furnace/zzz/61", Compiled188::f7);
        Logic.register("impossible_to_survive:features/furnace/zzz/62", Compiled188::f8);
        Logic.register("impossible_to_survive:features/furnace/zzz/63", Compiled188::f9);
        Logic.register("impossible_to_survive:features/furnace/zzz/64", Compiled188::f10);
        Logic.register("impossible_to_survive:features/furnace/zzz/65", Compiled188::f11);
        Logic.register("impossible_to_survive:features/furnace/zzz/66", Compiled188::f12);
        Logic.register("impossible_to_survive:features/furnace/zzz/67", Compiled188::f13);
        Logic.register("impossible_to_survive:features/furnace/zzz/68", Compiled188::f14);
        Logic.register("impossible_to_survive:features/furnace/zzz/69", Compiled188::f15);
        Logic.register("impossible_to_survive:features/furnace/zzz/7", Compiled188::f16);
        Logic.register("impossible_to_survive:features/furnace/zzz/70", Compiled188::f17);
        Logic.register("impossible_to_survive:features/furnace/zzz/71", Compiled188::f18);
        Logic.register("impossible_to_survive:features/furnace/zzz/72", Compiled188::f19);
        Logic.register("impossible_to_survive:features/furnace/zzz/73", Compiled188::f20);
        Logic.register("impossible_to_survive:features/furnace/zzz/74", Compiled188::f21);
        Logic.register("impossible_to_survive:features/furnace/zzz/75", Compiled188::f22);
        Logic.register("impossible_to_survive:features/furnace/zzz/76", Compiled188::f23);
    }
    // impossible_to_survive:features/furnace/zzz/55
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/56"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/57"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/56
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/57
    private static int f2(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/58
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/59"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/60"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/59
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/6
    private static int f5(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.04923427006160388", "~-0.13521423652711154", "~0.1400006060613141", "-0.031172045697326213", "0.0022731346567892888", "-1.0851900245609039", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.11593062417457631", "~0.03787765822396833", "~0.04358939783011444", "-0.02546128388188751", "0.09633412371199235", "-1.7060905875723407", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/60
    private static int f6(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/61
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/62"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/63"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/62
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/63
    private static int f9(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/64
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/65"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/66"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/65
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/66
    private static int f12(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/67
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/68"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/69"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/68
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/69
    private static int f15(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/7
    private static int f16(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.06567897795368512", "~-0.09008844906017943", "~0.14202266529031732", "-0.0764654677182572", "-0.0012535667702421984", "-1.1680525370031627", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.05871405231864277", "~-0.11438142734744983", "~0.1000622222510217", "0.09108594055923645", "0.08019034334618343", "-1.690188285737908", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/70
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/71"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/72"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/71
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/72
    private static int f19(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/73
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/74"), Control.when("score", "@s", "misc", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/75"), Control.when("score", "@s", "misc", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/76"), Control.when("score", "@s", "misc", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/77"), Control.when("score", "@s", "misc", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/78"), Control.when("score", "@s", "misc", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/79"), Control.when("score", "@s", "misc", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/80"), Control.when("score", "@s", "misc", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/81"), Control.when("score", "@s", "misc", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/82"), Control.when("score", "@s", "misc", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/83"), Control.when("score", "@s", "misc", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/84"), Control.positioned("~-1", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/87"), Control.positioned("~-2", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/90"), Control.positioned("~-3", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/93"), Control.positioned("~-4", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/96"), Control.positioned("~-5", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/99"), Control.positioned("~-6", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/102"), Control.positioned("~-7", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/105"), Control.positioned("~-8", "~", "~")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/74
    private static int f21(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.04821914693887208", "~-0.1149428440315354", "~0.03141250060954876", "-0.9014693970469461", "0.08591927935145205", "0.06205748477015791", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.1169063242158579", "~-0.02725919243884185", "~0.1287499165207955", "-1.6033132787613436", "-0.017925338467025754", "0.06651885427428535", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/75
    private static int f22(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.051176622813297996", "~0.052137237454127995", "~-0.11269204281258893", "-1.2084112970908159", "0.053101497276556046", "-0.09803156750127272", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.0027128671078792796", "~-0.1462286894978744", "~0.08566920936682783", "-1.4266128279868782", "0.06538581244824489", "-0.060707467383411956", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/76
    private static int f23(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.09840070708458777", "~0.14491374856952927", "~0.08472493440975093", "-1.0483400028065595", "0.0697610965204321", "-0.00809793958087135", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.03652171619645685", "~0.05668865365302311", "~-0.02753324321786057", "-1.5672182726453512", "0.07609602999433958", "0.09458378012199718", "0.3", "0", "force"));
        return 1;
    }
}
