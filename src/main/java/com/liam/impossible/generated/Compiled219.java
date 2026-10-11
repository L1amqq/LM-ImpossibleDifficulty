package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled219 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/0", Compiled219::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/1", Compiled219::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/2", Compiled219::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/3", Compiled219::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/4", Compiled219::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/5", Compiled219::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/6", Compiled219::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/7", Compiled219::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/marker_loop", Compiled219::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/recursive_tp_to_exit_portal", Compiled219::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/reset", Compiled219::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/setup", Compiled219::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/tp_to_endstone_surface", Compiled219::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/0", Compiled219::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/1", Compiled219::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/10", Compiled219::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/11", Compiled219::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/12", Compiled219::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/13", Compiled219::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/14", Compiled219::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/15", Compiled219::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/16", Compiled219::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/17", Compiled219::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/18", Compiled219::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/0
    private static int f0(Frame c) {
        Logic.step(() -> Native.particle(c, "portal", "~", "~", "~", "0.0", "0.0", "0.0", "1.6", "1", "force"));
        Logic.step(() -> Native.particle(c, "portal", "~", "~", "~", "0.0", "0.0", "0.0", "1.2", "1", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/1
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.crystal_reactivation_timer", "1"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_linger_lightning"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/2
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "end_crystal", "~", "~-1", "~", "{ShowBottom:1b}"), Control.unless("entity", "@e[type=end_crystal,distance=..1]")));
        Logic.step(() -> Native.kill(c, "@e[type=arrow,distance=..3]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/3
    private static int f3(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_invulnerable"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/activate"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon_environment.end_crystal.destroyed"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tag(x1, "@s", "remove", "mcm.its.dragon_environment.heal_point.destroyed"), Control.as("@n[tag=mcm.its.dragon_environment.heal_point]"), Control.at("@s")), Control.positioned("^", "^", "^10")));
        Logic.step(() -> Native.summon(c, "end_crystal", "~", "~-1", "~", "{ShowBottom:1b}"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.crystal_reactivation_timer", "12"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#global", "mcm.its.dragon.crystal_count", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/4
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_1_level_2"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "1"), Control.positioned("~-3", "~-8", "~-3")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_2_level_2"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "2"), Control.positioned("~-4", "~-8", "~-4")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_3_level_2"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "3"), Control.positioned("~-5", "~-8", "~-5")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_4_level_2"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "4"), Control.positioned("~-6", "~-8", "~-6")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/5
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_1_level_3"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "1"), Control.positioned("~-3", "~-8", "~-3")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_2_level_3"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "2"), Control.positioned("~-4", "~-8", "~-4")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_3_level_3"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "3"), Control.positioned("~-5", "~-8", "~-5")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_4_level_3"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "4"), Control.positioned("~-6", "~-8", "~-6")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/6
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_1_level_2"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "1"), Control.positioned("~-3", "~-8", "~-3")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_2_level_2"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "2"), Control.positioned("~-4", "~-8", "~-4")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_3_level_2"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "3"), Control.positioned("~-5", "~-8", "~-5")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_4_level_2"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "4"), Control.positioned("~-6", "~-8", "~-6")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/7
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_1_level_3"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "1"), Control.positioned("~-3", "~-8", "~-3")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_2_level_3"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "2"), Control.positioned("~-4", "~-8", "~-4")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_3_level_3"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "3"), Control.positioned("~-5", "~-8", "~-5")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_4_level_3"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "4"), Control.positioned("~-6", "~-8", "~-6")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/marker_loop
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/loop"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/recursive_tp_to_exit_portal
    private static int f9(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~-1", "~"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/recursive_tp_to_exit_portal"), Control.at("@s"), Control.unless("block", "~", "~", "~", "bedrock")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/reset
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/0"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.vfx.magic_circle_a.game_time", "0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/setup
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.vfx.magic_circle_a.game_time", "0"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.ticking\",\"mcm.its.dragon_environment.exit_portal_center\",\"mcm.its.dragon_environment.main\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.dragon_spawn_point\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.perch_point\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.stage_transition_point\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.ticking\",\"mcm.its.dragon_environment.end_crystal\",\"mcm.its.dragon_environment.end_crystal.invulnerable\",\"mcm.its.dragon_environment.end_crystal.1\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.1\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.1\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.1\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.1\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.ticking\",\"mcm.its.dragon_environment.end_crystal\",\"mcm.its.dragon_environment.end_crystal.invulnerable\",\"mcm.its.dragon_environment.end_crystal.2\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.2\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.2\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.2\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.2\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.ticking\",\"mcm.its.dragon_environment.end_crystal\",\"mcm.its.dragon_environment.end_crystal.invulnerable\",\"mcm.its.dragon_environment.end_crystal.3\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.3\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.3\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.3\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.3\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.ticking\",\"mcm.its.dragon_environment.end_crystal\",\"mcm.its.dragon_environment.end_crystal.invulnerable\",\"mcm.its.dragon_environment.end_crystal.4\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.4\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.4\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.4\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.4\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.ticking\",\"mcm.its.dragon_environment.end_crystal\",\"mcm.its.dragon_environment.end_crystal.invulnerable\",\"mcm.its.dragon_environment.end_crystal.5\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.5\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.5\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.5\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.5\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.ticking\",\"mcm.its.dragon_environment.end_crystal\",\"mcm.its.dragon_environment.end_crystal.invulnerable\",\"mcm.its.dragon_environment.end_crystal.6\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.6\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.6\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.6\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.6\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.ticking\",\"mcm.its.dragon_environment.end_crystal\",\"mcm.its.dragon_environment.end_crystal.invulnerable\",\"mcm.its.dragon_environment.end_crystal.7\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.7\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.7\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.7\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.7\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.ticking\",\"mcm.its.dragon_environment.end_crystal\",\"mcm.its.dragon_environment.end_crystal.invulnerable\",\"mcm.its.dragon_environment.end_crystal.8\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.8\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.8\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.8\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.8\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.ticking\",\"mcm.its.dragon_environment.end_crystal\",\"mcm.its.dragon_environment.end_crystal.invulnerable\",\"mcm.its.dragon_environment.end_crystal.9\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.9\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.9\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.9\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.9\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.ticking\",\"mcm.its.dragon_environment.end_crystal\",\"mcm.its.dragon_environment.end_crystal.invulnerable\",\"mcm.its.dragon_environment.end_crystal.10\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.10\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.inner\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.10\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.high\",\"mcm.its.dragon_environment.waypoint.10\",\"mcm.init\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "0", "80", "0", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.waypoint\",\"mcm.its.dragon_environment.waypoint.outer\",\"mcm.its.dragon_environment.waypoint.low\",\"mcm.its.dragon_environment.waypoint.10\",\"mcm.init\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/3"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment,tag=mcm.init]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/15"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.perch_point]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/16"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.stage_transition_point]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/17"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/29"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.waypoint]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/42"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#crystal.1"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#crystal.2"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#crystal.3"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#crystal.4"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#crystal.5"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#crystal.6"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#crystal.7"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#crystal.8"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#crystal.9"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#crystal.10"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s"), Control.unless("block", "~", "~-2", "~", "bedrock")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#crystal.a"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#crystal.b"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#exit_portal_top"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#highest"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#tower_size", "mcm.temp"));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.its.dragon.temp_setup.crystal]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/tp_to_endstone_surface
    private static int f12(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~-1", "~"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/recursive_tp_to_exit_portal"), Control.at("@s"), Control.unless("block", "~", "~-1", "~", "end_stone")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/0
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/1"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/2"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.heal_point]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/1
    private static int f14(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon_environment.end_crystal.destroyed"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon_environment.end_crystal.invulnerable"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/activate"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/10
    private static int f15(Frame c) {
        Logic.step(() -> Native.forceload(c, "add", "~", "~"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/11
    private static int f16(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "@n[type=marker,tag=mcm.its.dragon.temp_setup.crystal,tag=!mcm.initialized,distance=0..]"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@n[type=marker,tag=mcm.its.dragon.temp_setup.crystal,distance=..1]", "add", "mcm.initialized"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]"), Control.store("result", "score", "@s", "mcm.its.dragon.crystal_y_level")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/12"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "facing", "0", "70", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/13"), Control.at("@s"), Control.positioned("^", "^2", "^20")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "80", "~"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/12
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.tower_size", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.tower_level", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.tower_size", "4"), Control.when("block", "~", "~-3", "~6", "#mcm:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.tower_size", "3"), Control.when("block", "~", "~-3", "~5", "#mcm:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.tower_size", "2"), Control.when("block", "~", "~-3", "~4", "#mcm:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.tower_size", "1"), Control.when("block", "~", "~-3", "~3", "#mcm:air")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#tower_size", "mcm.temp", "=", "@s", "mcm.its.dragon.tower_size"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/13
    private static int f18(Frame c) {
        Logic.step(() -> Native.forceload(c, "add", "~", "~"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon_environment\",\"mcm.its.dragon_environment.heal_point\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/14"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.heal_point,distance=..1]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/14
    private static int f19(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "0", "60", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.tower_size", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.tower_size", "=", "#tower_size", "mcm.temp"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/15
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#exit_portal_top", "mcm.position.y"), Control.store("result", "entity", "@s", "Pos[1]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~3", "~"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/16
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#exit_portal_top", "mcm.position.y"), Control.store("result", "entity", "@s", "Pos[1]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~20", "~"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/17
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]"), Control.store("result", "score", "#crystal.a", "mcm.position.x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]"), Control.store("result", "score", "#crystal.a", "mcm.position.z")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/18"), Control.positioned("^25", "^", "^"), Control.as("@n[type=marker,tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#result", "mcm.position.x", "=", "#crystal.a", "mcm.position.x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#result", "mcm.position.x", "+=", "#crystal.b", "mcm.position.x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#result", "mcm.position.x", "/=", "#2", "mcm.constant"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#result", "mcm.position.z", "=", "#crystal.a", "mcm.position.z"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#result", "mcm.position.z", "+=", "#crystal.b", "mcm.position.z"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#result", "mcm.position.z", "/=", "#2", "mcm.constant"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/19"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/20"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/21"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/22"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/23"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/24"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.6]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/25"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.7]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/26"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.8]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/27"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.9]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/28"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.10]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/18
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]"), Control.store("result", "score", "#crystal.b", "mcm.position.x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]"), Control.store("result", "score", "#crystal.b", "mcm.position.z")));
        return 1;
    }
}
