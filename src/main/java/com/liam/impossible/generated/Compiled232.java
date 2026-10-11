package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled232 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/225", Compiled232::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/226", Compiled232::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/227", Compiled232::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/228", Compiled232::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/229", Compiled232::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/23", Compiled232::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/230", Compiled232::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/231", Compiled232::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/232", Compiled232::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/233", Compiled232::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/234", Compiled232::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/235", Compiled232::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/236", Compiled232::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/237", Compiled232::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/238", Compiled232::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/239", Compiled232::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/24", Compiled232::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/240", Compiled232::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/241", Compiled232::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/242", Compiled232::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/243", Compiled232::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/244", Compiled232::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/245", Compiled232::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/246", Compiled232::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/225
    private static int f0(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_m/summon"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/flash_g/summon"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/226
    private static int f1(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_growl"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_indicator"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/227
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "mcm.its.dragon.activity.timer", "201"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "35..")), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "mcm.its.dragon.activity.timer", "201"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "55..")), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "mcm.its.dragon.activity.timer", "201"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "85..")), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "..1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/228
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/229"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.tail_locator]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.animation", "8"), Control.as("@e[type=item_display,tag=mcm.vfx.impact_m]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.animation", "25"), Control.as("@e[type=item_display,tag=mcm.vfx.flash_g]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/229
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_n/summon"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/23
    private static int f5(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.initialized"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/24"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{brightness:{block:15,sky:15},CustomName:'\"Crystalspine\"'}"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/not_stunned/apply"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.id", "=", "aj.last_id", "aj.id"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.health", "1000000"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.has_tail", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.head_count", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.its.dragon.crystal_count", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.next_activity", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.tutorial.stage", "0"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/fly/play"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/230
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/231"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.tail_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/231
    private static int f7(Frame c) {
        Logic.step(() -> Native.particle(c, "dust_color_transition{from_color: [0.9f, 0.0f, 0.9f], scale: 0.9f, to_color: [0.95f, 0.3f, 0.95f]}", "^", "^", "^", "0.5", "0.5", "0.5", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "portal", "~", "~", "~", "0.2", "0.2", "0.2", "0.3", "3", "force"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "^", "^", "^", "0.1", "0.1", "0.1", "0.2", "1", "force"), Control.when("predicate", "mcm:random/25_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "^", "^", "^", "0.1", "0.1", "0.1", "0.15", "1", "force"), Control.when("predicate", "mcm:random/25_percent")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/232
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/233"), Control.when("score", "@s", "aj.hover.frame", "matches", "19")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/233
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "251"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/tail_slam/tween", "{to_frame:2,duration:2}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/234
    private static int f10(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/set_tail_enabled"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/235
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.flight_speed", "15"), Control.at("@s"), Control.positioned("^", "^-10", "^5"), Control.unless("entity", "@a[predicate=mcm:gm/vulnerable,distance=..8]"), Control.when("entity", "@a[predicate=mcm:gm/vulnerable,distance=..40]"), Control.positioned("^", "^10", "^-5"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "..500")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.flight_speed", "10"), Control.at("@s"), Control.positioned("^", "^-10", "^5"), Control.unless("entity", "@a[predicate=mcm:gm/vulnerable,distance=..20]"), Control.when("entity", "@a[predicate=mcm:gm/vulnerable,distance=..40]"), Control.positioned("^", "^10", "^-5"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "..200")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.flight_speed", "0"), Control.at("@s"), Control.unless("block", "^", "^", "^2", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "250"), Control.at("@s"), Control.unless("block", "^", "^", "^8", "#mcm:passable"), Control.unless("block", "^-3", "^", "^8", "#mcm:passable"), Control.unless("block", "^3", "^", "^8", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "90"), Control.at("@s"), Control.positioned("^", "^-10", "^5"), Control.when("entity", "@a[predicate=mcm:gm/vulnerable,distance=..10]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/236
    private static int f12(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/237
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{NoGravity:1,Tags:[\"mcm.its.dragon.shockwave_spawn_position\"]}"), Control.positioned("^", "^-11", "^6.5"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/238"), Control.as("@e[type=marker,tag=mcm.its.dragon.shockwave_spawn_position]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/238
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#shockwave_averted", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/239"), Control.at("@s"), Control.when("entity", "@e[type=item_display,tag=mcm.crystal_tail,distance=..3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/240"), Control.when("score", "#shockwave_averted", "mcm.temp", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/239
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#shockwave_averted", "mcm.temp", "1"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_stun"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/24
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{brightness:{block:15,sky:15}}"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.id", "=", "aj.last_id", "aj.id"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/240
    private static int f17(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_impact"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_roar"), Control.when("predicate", "mcm:random/50_percent")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/241
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/set_shockwave_averted"), Control.at("@n[type=item_display,tag=mcm.crystal_tail,tag=mcm.crystal_tail.unbreakable]")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.attack_delay_timer", "350"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.kill(c, "@e[tag=mcm.its.dragon.shockwave_spawn_position]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/242
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/243"), Control.as("@e[type=marker,tag=mcm.its.dragon.shockwave_spawn_position]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/243
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/set_shockwave_averted"), Control.when("score", "#shockwave_averted", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/244"), Control.when("score", "#shockwave_averted", "mcm.temp", "matches", "0"), Control.at("@s"), Control.when("block", "~", "~", "~", "#mcm:passable"), Control.unless("block", "~", "~-1", "~", "#mcm:passable")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/244
    private static int f21(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/summon"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/245
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/246"), Control.when("score", "@s", "mcm.its.dragon.tutorial.stage", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/246
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "16"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "3"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/hover/tween", "{to_frame:5,duration:5}"));
        return 1;
    }
}
