package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled184 {
    public static void register() {
        Logic.register("impossible_to_survive:features/furnace/furnace_loop", Compiled184::f0);
        Logic.register("impossible_to_survive:features/furnace/place_furnace_marker", Compiled184::f1);
        Logic.register("impossible_to_survive:features/furnace/zzz/0", Compiled184::f2);
        Logic.register("impossible_to_survive:features/furnace/zzz/1", Compiled184::f3);
        Logic.register("impossible_to_survive:features/furnace/zzz/10", Compiled184::f4);
        Logic.register("impossible_to_survive:features/furnace/zzz/100", Compiled184::f5);
        Logic.register("impossible_to_survive:features/furnace/zzz/101", Compiled184::f6);
        Logic.register("impossible_to_survive:features/furnace/zzz/102", Compiled184::f7);
        Logic.register("impossible_to_survive:features/furnace/zzz/103", Compiled184::f8);
        Logic.register("impossible_to_survive:features/furnace/zzz/104", Compiled184::f9);
        Logic.register("impossible_to_survive:features/furnace/zzz/105", Compiled184::f10);
        Logic.register("impossible_to_survive:features/furnace/zzz/106", Compiled184::f11);
        Logic.register("impossible_to_survive:features/furnace/zzz/107", Compiled184::f12);
        Logic.register("impossible_to_survive:features/furnace/zzz/108", Compiled184::f13);
        Logic.register("impossible_to_survive:features/furnace/zzz/109", Compiled184::f14);
        Logic.register("impossible_to_survive:features/furnace/zzz/11", Compiled184::f15);
        Logic.register("impossible_to_survive:features/furnace/zzz/110", Compiled184::f16);
        Logic.register("impossible_to_survive:features/furnace/zzz/111", Compiled184::f17);
        Logic.register("impossible_to_survive:features/furnace/zzz/112", Compiled184::f18);
        Logic.register("impossible_to_survive:features/furnace/zzz/113", Compiled184::f19);
        Logic.register("impossible_to_survive:features/furnace/zzz/114", Compiled184::f20);
        Logic.register("impossible_to_survive:features/furnace/zzz/115", Compiled184::f21);
        Logic.register("impossible_to_survive:features/furnace/zzz/116", Compiled184::f22);
        Logic.register("impossible_to_survive:features/furnace/zzz/117", Compiled184::f23);
    }
    // impossible_to_survive:features/furnace/furnace_loop
    private static int f0(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "furnace_lit"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/0"), Control.when("block", "~", "~", "~", "minecraft:furnace[lit=true]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/1"), Control.when("score", "#ifelse", "mcb.internal", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.unless("block", "~", "~", "~", "minecraft:furnace")));
        return 1;
    }
    // impossible_to_survive:features/furnace/place_furnace_marker
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^0.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^0.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^0.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^0.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^1.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^1.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^1.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^1.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^1.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^2.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^2.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^2.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^2.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^2.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^3.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^3.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^3.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^3.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^3.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^4.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^4.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^4.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^4.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^4.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[furnace_marker]}"), Control.positioned("^", "^", "^5.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:furnace"), Control.unless("entity", "@e[type=marker,tag=furnace_marker,distance=..0.1]")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/0
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "1"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/furnace/furnace_lit_loop"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/1
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "furnace_lit_timer", "1"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/10
    private static int f4(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.09992239712026874", "~0.03510365916475393", "~0.042477962639370516", "-0.081929202478708", "0.044291282788259556", "-0.829375238903277", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.12035223972528723", "~-0.10748505289762207", "~0.04821701363922541", "-0.06916223372316042", "-0.0629427998139791", "-1.350923552114439", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/100
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/101
    private static int f6(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/102
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/103"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/104"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/103
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/104
    private static int f9(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/105
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/106"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/107"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/106
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/107
    private static int f12(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/108
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/109"), Control.when("score", "@s", "misc", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/110"), Control.when("score", "@s", "misc", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/111"), Control.when("score", "@s", "misc", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/112"), Control.when("score", "@s", "misc", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/113"), Control.when("score", "@s", "misc", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/114"), Control.when("score", "@s", "misc", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/115"), Control.when("score", "@s", "misc", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/116"), Control.when("score", "@s", "misc", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/117"), Control.when("score", "@s", "misc", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/118"), Control.when("score", "@s", "misc", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/119"), Control.positioned("~1", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/122"), Control.positioned("~2", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/125"), Control.positioned("~3", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/128"), Control.positioned("~4", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/131"), Control.positioned("~5", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/134"), Control.positioned("~6", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/137"), Control.positioned("~7", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/140"), Control.positioned("~8", "~", "~")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/109
    private static int f14(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.013729499783638022", "~0.08533591616160834", "~-0.013659338386097697", "0.9181956598950893", "0.023341101375206022", "0.047427140854912286", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.08114218326445022", "~-0.07877046094439917", "~-0.04380066496098265", "1.4985410033470812", "-0.0655068149812144", "0.03395435736183346", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/11
    private static int f15(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.007287289906587845", "~0.05019211014405509", "~-0.05178660738830205", "0.025915845503844626", "-0.006867801599253376", "-1.0796104368885593", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.09581068555725374", "~0.041707997779525115", "~-0.05628865096212192", "0.07191377137061812", "-0.04308619842524824", "-1.404622248373784", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/110
    private static int f16(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.14460194653879893", "~-0.10512784258276082", "~0.14020307658484976", "0.8728225787739264", "0.09562886237636584", "-0.00317674284657028", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.026554122817589", "~-0.13727119820293188", "~-0.08733260609023319", "1.262873841728127", "-0.061777138429796485", "0.05818281136560688", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/111
    private static int f17(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.011301741489045392", "~-0.10318803023577883", "~-0.14673885134322198", "0.7939799548465035", "0.09586384137810629", "-0.09643271187061334", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.11786656752540911", "~0.09840836059160492", "~0.04095678035451933", "1.4184436889381673", "-0.07812984146168166", "-0.09530002365205253", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/112
    private static int f18(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.01926128458021734", "~0.08348530475101985", "~-0.01881733341536109", "1.0750371251851856", "0.03224919744425319", "-0.0059047349390148", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.1396641665270527", "~-0.14979946233186914", "~0.1340946070744085", "1.521524636369211", "0.07735749729202245", "-0.019630168483709732", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/113
    private static int f19(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.14230315043267258", "~0.0554075291896182", "~0.12040744937204141", "1.105972289974738", "-0.07095979546816715", "-0.012701869305039803", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.12689844316890989", "~0.015775575280761855", "~0.01768083323169276", "1.4644406697875567", "0.043094499963627936", "-0.020569974250312397", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/114
    private static int f20(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.023655054906053928", "~0.07255463724545083", "~0.009639228601229477", "1.24647455194056", "-0.019939587968712848", "-0.041790227332338996", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.011717235254565117", "~0.13577087437988414", "~-0.02650276691751232", "1.420850086433449", "-0.08836280843295126", "0.00007147430866396577", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/115
    private static int f21(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.0992757208093072", "~-0.11184209154167732", "~0.02697559789314965", "1.036393829891713", "0.02815264777157611", "-0.08299502996412374", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.13700248968985157", "~0.1386198487976263", "~0.1048475554423628", "1.729987314656034", "0.06855261279558592", "-0.03145071363483165", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/116
    private static int f22(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.055732161490483656", "~-0.08307379798603431", "~-0.04187664242717155", "1.105380345292314", "-0.0908628396855086", "-0.040238267153179845", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.10730883875373483", "~0.008741357261872928", "~0.06676053611243268", "1.2827326765544256", "0.01768944846643299", "0.058164317541069946", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/117
    private static int f23(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.10774363975356006", "~0.09151014542432369", "~-0.037281827692062716", "1.171717135659501", "-0.036213686467903065", "-0.03287010606020764", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.039048265633585676", "~-0.11070192457868475", "~0.08070842977924435", "1.6852746744515832", "-0.08095102287966004", "0.04337216478087638", "0.3", "0", "force"));
        return 1;
    }
}
