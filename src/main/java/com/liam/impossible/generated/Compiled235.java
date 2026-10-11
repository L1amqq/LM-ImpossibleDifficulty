package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled235 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/290", Compiled235::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/291", Compiled235::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/292", Compiled235::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/293", Compiled235::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/294", Compiled235::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/295", Compiled235::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/296", Compiled235::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/297", Compiled235::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/298", Compiled235::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/299", Compiled235::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/3", Compiled235::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/30", Compiled235::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/300", Compiled235::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/301", Compiled235::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/302", Compiled235::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/303", Compiled235::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/304", Compiled235::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/305", Compiled235::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/306", Compiled235::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/307", Compiled235::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/308", Compiled235::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/309", Compiled235::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/31", Compiled235::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/310", Compiled235::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/290
    private static int f0(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.stage_transition_point]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/291
    private static int f1(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/healing_arrive"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#stage_transition_arrive_sfx", "mcm.misc", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/292
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#stage_transition_arrive_sfx"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity.timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "100"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.invulnerable"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "operation", "#temp", "mcm.its.dragon.transition_frame", "=", "@s", "aj.fly.frame"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.fly.playing]")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#temp", "mcm.its.dragon.transition_frame", "5"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "#temp", "mcm.its.dragon.transition_frame", "21"), Control.when("score", "#temp", "mcm.its.dragon.transition_frame", "matches", "20..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.its.dragon.transition_frame", "1"), Control.when("score", "#temp", "mcm.its.dragon.transition_frame", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#temp", "mcm.its.dragon.transition_frame"), Control.store("result", "storage", "mcm:temp", "value", "int", "1")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/internal/set_recharge_crystals", "with", "storage", "mcm:temp"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.activity.timer", "=", "#temp", "mcm.its.dragon.transition_frame"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.tower_level", "2"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "3"), Control.as("@e[tag=mcm.its.dragon_environment.end_crystal]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.tower_level", "3"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "2"), Control.as("@e[tag=mcm.its.dragon_environment.end_crystal]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/293
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/294"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/298"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/316"), Control.at("@s"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1..499")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/319"), Control.at("@s"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "500..999")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/322"), Control.at("@s"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1000..1499")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/325"), Control.at("@s"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1500..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/294
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "100"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "800..")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tag(x1, "@s", "add", "mcm.its.dragon_environment.waypoint.active"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.waypoint,sort=random,limit=1]"), Control.at("@s")), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/295"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "..30"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/296"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "31.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.01", "~"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "50"), Control.at("@s"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=..20]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/297"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "50.."), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/295
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "eyes"), Control.positioned("^", "^", "^0.085"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.915"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/296
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[predicate=mcm:gm/vulnerable]", "eyes"), Control.positioned("^", "^", "^0.1"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.9"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/297
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/dash/tween", "{to_frame:0,duration:5}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/298
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.flight_speed", "200"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "..1900")));
        Logic.step(() -> Native.tag(c, "@a", "remove", "mcm.its.dragon.dash_target"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@p[predicate=mcm:gm/vulnerable]", "add", "mcm.its.dragon.dash_target"), Control.positioned("^", "^-2", "^10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/299"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/300"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1..80"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/306"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "50"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/307"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "81.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/308"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "4..12"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/309"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "10.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "remove", "@s", "mcm.its.dragon.player_dash_hit_cd", "1"), Control.when("score", "@s", "mcm.its.dragon.player_dash_hit_cd", "matches", "1..")), Control.as("@a")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-2"), Control.at("@s"), Control.when("entity", "@s[x_rotation=20..90]")), Control.at("@s"), Control.when("block", "~", "~-4", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-20..90]")), Control.at("@s"), Control.when("block", "~", "~-2", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-10"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-20..90]")), Control.at("@s"), Control.when("block", "~", "~1", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "59.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=60..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "-69.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-70]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying"), Control.unless("entity", "@a[tag=mcm.its.dragon.dash_target]")));
        Logic.step(() -> Native.tag(c, "@a", "remove", "mcm.its.dragon.dash_target"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/310"), Control.when("entity", "@a[predicate=mcm:gm/vulnerable,distance=..4.5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/313"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "100.."), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/299
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_dash_growl"), Control.when("entity", "@s[tag=mcm.its.dragon.first_dash_attack]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_dash"), Control.unless("entity", "@s[tag=mcm.its.dragon.first_dash_attack]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.first_dash_attack"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/3
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#dragon_setup_detected_crystals", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "#dragon_setup_detected_crystals", "mcm.temp", "1"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/30
    private static int f11(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_death_flying"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..125"), Control.store("result", "score", "@s", "mcm.its.dragon.attack_delay_timer")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.attack_delay_timer", "100"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/do_death_flying"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/300
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/301"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1..3"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/302"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "4..6"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/303"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "7..9"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/304"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "10..13"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/305"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "14.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.02", "~"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/301
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=mcm.its.dragon.dash_target]", "eyes"), Control.positioned("^", "^", "^0.17"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.83"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/302
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=mcm.its.dragon.dash_target]", "eyes"), Control.positioned("^", "^", "^0.28"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.72"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/303
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=mcm.its.dragon.dash_target]", "eyes"), Control.positioned("^", "^", "^0.17"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.83"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/304
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=mcm.its.dragon.dash_target]", "eyes"), Control.positioned("^", "^", "^0.1"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.9"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/305
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=mcm.its.dragon.dash_target]", "eyes"), Control.positioned("^", "^", "^0.065"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.935"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/306
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "100"), Control.unless("entity", "@p[predicate=mcm:gm/vulnerable,distance=..10]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/307
    private static int f19(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~-2"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-2"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "86..94"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/308
    private static int f20(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "1.5", "1.5", "1.5", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "1", "1", "1", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "dust{color:[0.9,0.1,0.9],scale:1.9}", "^", "^", "^", "1", "1", "1", "0.1", "1", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/309
    private static int f21(Frame c) {
        Logic.step(() -> Native.particle(c, "dust{color:[0.9,0.1,0.9],scale:1.9}", "^", "^", "^", "1", "1", "1", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "dust{color:[0.95,0.3,0.95],scale:0.9}", "^", "^", "^0.5", "0.5", "0.5", "0.5", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "reverse_portal", "^", "^", "^", "0.5", "0.5", "0.5", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "reverse_portal", "^", "^", "^0.33", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "reverse_portal", "^", "^", "^0.66", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/spiral_particles"), Control.at("@s"), Control.positioned("^", "^", "^-1.75"), Control.rotated("~", "~-10")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/31
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/select_random_ability"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "1.."), Control.when("entity", "@a[distance=..300]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/32"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/33"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/34"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/310
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/311"), Control.unless("score", "#attack_dash_bite_sfx", "mcm.misc", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/312"), Control.as("@a[predicate=mcm:gm/vulnerable,distance=..4.5]"), Control.at("@s"), Control.unless("score", "@s", "mcm.its.dragon.player_dash_hit_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "81"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1..80"), Control.at("@s")));
        return 1;
    }
}
