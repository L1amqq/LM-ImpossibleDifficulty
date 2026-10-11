package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled181 {
    public static void register() {
        Logic.register("impossible_to_survive:features/crafting_table/summon", Compiled181::f0);
        Logic.register("impossible_to_survive:features/crafting_table/summon_aj_crafting_table", Compiled181::f1);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/0", Compiled181::f2);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/1", Compiled181::f3);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/10", Compiled181::f4);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/11", Compiled181::f5);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/12", Compiled181::f6);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/13", Compiled181::f7);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/14", Compiled181::f8);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/15", Compiled181::f9);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/16", Compiled181::f10);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/17", Compiled181::f11);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/18", Compiled181::f12);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/19", Compiled181::f13);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/2", Compiled181::f14);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/20", Compiled181::f15);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/21", Compiled181::f16);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/22", Compiled181::f17);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/23", Compiled181::f18);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/3", Compiled181::f19);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/4", Compiled181::f20);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/5", Compiled181::f21);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/6", Compiled181::f22);
        Logic.register("impossible_to_survive:features/crafting_table/zzz/7", Compiled181::f23);
    }
    // impossible_to_survive:features/crafting_table/summon
    private static int f0(Frame c) {
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "barrier"));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_table/summon", "{args:{animation:'transform', start_animation: true}}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/summon", "{args:{animation:'transform', start_animation: true}}"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable]", "eyes"), Control.rotated("~", "0")));
        Logic.step(() -> Native.playsound(c, "minecraft:crafting_table_transform", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/summon_aj_crafting_table
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/10"), Control.anchored("eyes")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/0
    private static int f2(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "crafting_table_looking"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^", "^-0.5", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^0.5", "^", "^0", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^-0.5", "^", "^0", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^0.5", "^0", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^-0.5", "^0", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^", "^0.5", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^0.5", "^", "^1", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^-0.5", "^", "^1", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^0.5", "^1", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^-0.5", "^1", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^", "^1.5", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^0.5", "^", "^2", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^-0.5", "^", "^2", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^0.5", "^2", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^-0.5", "^2", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^", "^2.5", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^0.5", "^", "^3", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^-0.5", "^", "^3", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^0.5", "^3", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^-0.5", "^3", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^", "^3.5", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^0.5", "^", "^4", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^-0.5", "^", "^4", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^0.5", "^4", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^-0.5", "^4", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^", "^4.5", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^0.5", "^", "^5", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^-0.5", "^", "^5", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^0.5", "^5", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^-0.5", "^5", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^", "^5.5", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^0.5", "^", "^6", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^-0.5", "^", "^6", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^0.5", "^6", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "crafting_table_looking"), Control.when("block", "^", "^-0.5", "^6", "minecraft:crafting_table")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/1"), Control.when("entity", "@s[tag=crafting_table_looking]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/9"), Control.unless("entity", "@s[tag=crafting_table_looking]")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/1
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/2"), Control.when("entity", "@e[type=area_effect_cloud,tag=crafting_table_looked_aec,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "crafting_table_look_timer", "0"), Control.unless("entity", "@s[tag=unchanged_position]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "unchanged_position"));
        Logic.step(() -> Native.summon(c, "area_effect_cloud", "~", "~", "~", "{Invulnerable:1,Tags:[\"crafting_table_looked_aec\",\"init\"],Duration:10}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/8"), Control.as("@e[type=area_effect_cloud,tag=crafting_table_looked_aec,tag=init,limit=1,sort=nearest]")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/10
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^", "^-0.5"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^0.5", "^", "^0"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^-0.5", "^", "^0"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^0.5", "^0"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^-0.5", "^0"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^", "^0.5"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^0.5", "^", "^1"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^-0.5", "^", "^1"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^0.5", "^1"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^-0.5", "^1"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^", "^1.5"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^0.5", "^", "^2"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^-0.5", "^", "^2"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^0.5", "^2"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^-0.5", "^2"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^", "^2.5"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^0.5", "^", "^3"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^-0.5", "^", "^3"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^0.5", "^3"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^-0.5", "^3"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^", "^3.5"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^0.5", "^", "^4"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^-0.5", "^", "^4"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^0.5", "^4"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^-0.5", "^4"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^", "^4.5"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^0.5", "^", "^5"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^-0.5", "^", "^5"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^0.5", "^5"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^-0.5", "^5"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^", "^5.5"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^0.5", "^", "^6"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^-0.5", "^", "^6"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^0.5", "^6"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[crafting_table_summon_marker]}"), Control.positioned("^", "^-0.5", "^6"), Control.when("block", "~", "~", "~", "minecraft:crafting_table"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/11"), Control.as("@e[type=marker,tag=crafting_table_summon_marker,limit=1,sort=nearest]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=crafting_table_summon_marker]"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/11
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/12"), Control.rotated("-90", "0")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/12
    private static int f6(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/crafting_table/summon"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/13
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "sawblade_damage_cooldown", "1"), Control.as("@e[type=!player,distance=..10]"), Control.when("score", "@s", "sawblade_damage_cooldown", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/14"), Control.as("@e[type=marker,tag=aj.sawblade_locator,distance=..4]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/14
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "smoke", "~", "~", "~", "0.4", "0.1", "0.4", "0.1", "1", "force"), Control.when("predicate", "impossible_to_survive:random/50_percent")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/15"), Control.when("entity", "@e[type=#impossible_to_survive:mobs_and_player,distance=..1.75]"), Control.unless("score", "@s", "sawblade_damage_cooldown", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/15
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:entity.generic.hurt", "master", "@a", "~", "~", "~", "1.0", "1.0"), Control.as("@e[type=#impossible_to_survive:mobs,distance=..1.75]"), Control.unless("score", "@s", "sawblade_damage_cooldown", "matches", "1..")));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{CustomName:'\"Crafting Table\"',Tags:[\"mcm.death_message_marker\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/16"), Control.as("@n[type=#impossible_to_survive:mobs_and_player,distance=..1.75]"), Control.unless("score", "@s", "sawblade_damage_cooldown", "matches", "1.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/17"), Control.as("@e[type=#impossible_to_survive:mobs_and_player,distance=..1.75]"), Control.unless("score", "@s", "sawblade_damage_cooldown", "matches", "1.."), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.death_message_marker]"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/16
    private static int f10(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:crafting_table_hit", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.bee.sting", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/17
    private static int f11(Frame c) {
        Logic.step(() -> Native.damage(c, "@s[type=!player]", "5", "minecraft:generic"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/18"), Control.when("entity", "@s[tag=survivor,predicate=mcm:gm/vulnerable]")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/18
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "sawblade_damage_cooldown", "10"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:mob_projectile", "by", "@e[type=marker,tag=mcm.death_message_marker,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:mob_projectile", "by", "@e[type=marker,tag=mcm.death_message_marker,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "15", "minecraft:mob_projectile", "by", "@e[type=marker,tag=mcm.death_message_marker,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/19
    private static int f13(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"crafting_table_projectile\",\"init\"]}"));
        Logic.step(() -> Native.particle(c, "explosion", "^", "^2.25", "^1.0", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "^", "^2.25", "^1.0", "0", "0", "0", "0.2", "10", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "^", "^2.25", "^1.0", "0", "0", "0", "0.2", "5", "force"));
        Logic.step(() -> Native.particle(c, "white_ash", "^", "^2.25", "^1.0", "0.5", "0.5", "0.5", "0.04", "10", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:gray_concrete\"}", "^", "^2.25", "^1.0", "0.5", "0.5", "0.5", "0.04", "5", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:brown_concrete\"}", "^", "^2.25", "^1.0", "0.5", "0.5", "0.5", "0.04", "10", "force"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/2
    private static int f14(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "unchanged_position"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "crafting_table_look_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "crafting_table_look_y")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/3"), Control.when("score", "@e[type=area_effect_cloud,tag=crafting_table_looked_aec,limit=1,sort=nearest]", "crafting_table_look_x", "=", "@s", "crafting_table_look_x"), Control.when("score", "@e[type=area_effect_cloud,tag=crafting_table_looked_aec,limit=1,sort=nearest]", "crafting_table_look_y", "=", "@s", "crafting_table_look_y")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/7"), Control.when("score", "#ifelse", "mcb.internal", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/20
    private static int f15(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "init"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@n[type=item_display,tag=aj.crafting_table_rocket_launcher.root,distance=..0.1]", "Rotation[0]", "1"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^2.3", "^1.0"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/21
    private static int f16(Frame c) {
        Logic.step(() -> Native.kill(c, "@s"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.generic.explode", "master", "@a", "~", "~", "~", "1.0", "1.3"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.2", "0.2", "0.2", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.2", "0.2", "0.2", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:crafting_table\"}", "~", "~", "~", "0.1", "0.1", "0.1", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "explosion", "~", "~", "~", "0.0", "0.0", "0.0", "0.1", "1", "force"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/22
    private static int f17(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{CustomName:'\"Crafting Table\"',Tags:[\"mcm.death_message_marker\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/23"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..2,limit=1,sort=nearest]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.death_message_marker]"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.generic.explode", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.ravager.step", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.bee.sting", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:item.trident.hit_ground", "master", "@a", "~", "~", "~", "1.5", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.shulker_bullet.hurt", "master", "@a", "~", "~", "~", "1.5", "1.0"));
        Logic.step(() -> Native.particle(c, "smoke", "^", "^1", "^", "0.5", "0.8", "0.5", "0.02", "7", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "^", "^1", "^", "0.5", "0.8", "0.5", "0.02", "7", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "^", "^1", "^", "0", "0.3", "0", "0.2", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "^", "^1", "^", "0", "0.2", "0", "0.2", "10", "force"));
        Logic.step(() -> Native.particle(c, "firework", "^", "^1", "^", "0", "0", "0", "0.1", "3", "force"));
        Logic.step(() -> Native.particle(c, "end_rod", "^", "^1", "^", "0", "0", "0", "0.2", "3", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^01", "^", "0.3", "0.8", "0.3", "0.2", "10", "force"));
        Logic.step(() -> Native.particle(c, "explosion", "^", "^1", "^", "0.5", "0.8", "0.5", "0.2", "5", "force"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/23
    private static int f18(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:arrow", "by", "@e[type=marker,tag=mcm.death_message_marker,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:arrow", "by", "@e[type=marker,tag=mcm.death_message_marker,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "14", "minecraft:arrow", "by", "@e[type=marker,tag=mcm.death_message_marker,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/3
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "crafting_table_look_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:features/crafting_table/zzz/4"), Control.when("score", "@s", "crafting_table_look_timer", "matches", "21..")), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:features/crafting_table/zzz/5"), Control.when("score", "@s", "crafting_table_look_timer", "matches", "17..")), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:features/crafting_table/zzz/6"), Control.when("score", "@s", "crafting_table_look_timer", "matches", "11..")), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/4
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "crafting_table_look_timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/crafting_table/summon_aj_crafting_table"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/5
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "crafting_table_look_timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/crafting_table/summon_aj_crafting_table"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/6
    private static int f22(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "crafting_table_look_timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/crafting_table/summon_aj_crafting_table"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/zzz/7
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "crafting_table_look_timer", "0"));
        return 1;
    }
}
