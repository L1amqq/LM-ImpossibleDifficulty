package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled241 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/42", Compiled241::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/420", Compiled241::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/43", Compiled241::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/44", Compiled241::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/45", Compiled241::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/46", Compiled241::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/47", Compiled241::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/48", Compiled241::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/49", Compiled241::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/5", Compiled241::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/50", Compiled241::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/51", Compiled241::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/52", Compiled241::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/53", Compiled241::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/54", Compiled241::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/55", Compiled241::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/56", Compiled241::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/57", Compiled241::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/58", Compiled241::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/59", Compiled241::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/6", Compiled241::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/60", Compiled241::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/61", Compiled241::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/62", Compiled241::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/42
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "50"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^-0.2"), Control.at("@s"), Control.when("block", "^", "^", "^2", "obsidian")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.4"), Control.at("@s"), Control.when("block", "^", "^", "^", "obsidian")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.3"), Control.at("@s"), Control.when("block", "^", "^", "^-2", "obsidian")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.2"), Control.at("@s"), Control.when("block", "^", "^", "^-4", "obsidian")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/420
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_death_flying"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/43
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/44"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "59.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=60..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "-69.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-70]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=20..90]")), Control.at("@s"), Control.when("block", "~", "~-7", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-20..90]")), Control.at("@s"), Control.when("block", "~", "~-2", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.at("@s"), Control.store("result", "score", "@s", "mcm.its.dragon.homing_rotation_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.at("@s"), Control.store("result", "score", "@s", "mcm.its.dragon.homing_rotation_y")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "add", "@s", "mcm.its.dragon.flight_speed", "75"), Control.unless("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1000..")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "..15"), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=..2]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "40"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "100..")), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=..10]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "50"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "100..")), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=..4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.flight_speed", "1"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "..-1")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/50"), Control.unless("score", "#dragon_rotation_tweening", "mcm.temp", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/51"), Control.when("score", "#dragon_rotation_tweening", "mcm.temp", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/52"), Control.when("score", "@s", "mcm.its.dragon.state", "matches", "2..3"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=..3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/53"), Control.at("@s"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=..0.6]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/44
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#dragon_rotation_tweening", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#dragon_rotation_tweening", "mcm.temp", "1"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=..5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.homing_rotation_x"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.homing_rotation_y"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tag(x1, "@s", "add", "mcm.its.dragon_environment.waypoint.active"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.waypoint,sort=random,limit=1]"), Control.at("@s")), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/45"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=100..]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/46"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=20..99]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/47"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=10..20]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/48"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=4..10]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/49"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=..4]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-0.02", "~"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/45
    private static int f4(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.active]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/46
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "eyes"), Control.positioned("^", "^", "^0.1"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.9"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/47
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "eyes"), Control.positioned("^", "^", "^0.25"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.75"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/48
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "eyes"), Control.positioned("^", "^", "^0.4"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.6"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/49
    private static int f8(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.active]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/5
    private static int f9(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "0", "-20", "0"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/50
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "@s", "mcm.its.dragon.tweened_rotation_y")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/51
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.tweened_rotation_y"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=20..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-20]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-2"), Control.at("@s"), Control.when("entity", "@s[x_rotation=3..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~2"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=2..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-0.5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=1..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~0.5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-1..1]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.at("@s"), Control.store("result", "score", "@s", "mcm.its.dragon.tweened_rotation_y")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/52
    private static int f12(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_hover"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/53
    private static int f13(Frame c) {
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.flight_speed", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/54"), Control.unless("score", "@s", "mcm.its.dragon.next_activity", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/54
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.activity", "=", "@s", "mcm.its.dragon.next_activity"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.next_activity", "0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/55
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/56"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/65"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/77"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.jumppad_cd", "1"), Control.as("@a"), Control.when("score", "@s", "mcm.its.dragon.jumppad_cd", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/56
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/57"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=20..90]")), Control.at("@s"), Control.when("block", "~", "~-7", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-20..90]")), Control.at("@s"), Control.when("block", "~", "~-2", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "mcm.its.dragon.flight_speed", "1000"), Control.unless("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1000..")), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.heal_point.active,distance=20..]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "300"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.heal_point.active,distance=..2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.flight_speed", "99"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.heal_point.active,distance=..0.35]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.flight_speed", "1"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "..0")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/63"), Control.unless("score", "#healing_arrive_sfx", "mcm.misc", "matches", "1"), Control.at("@s"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.heal_point.active,distance=..10]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/64"), Control.at("@s"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.heal_point.active,distance=..0.3]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/57
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@n[type=marker,tag=mcm.its.dragon_environment.heal_point,tag=!mcm.its.dragon_environment.heal_point.destroyed]", "add", "mcm.its.dragon_environment.heal_point.active"), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.heal_point.active]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/58"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.heal_point.active,distance=20..]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/59"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.heal_point.active,distance=10..20]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/60"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.heal_point.active,distance=3..10]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/61"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.heal_point.active,distance=..3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-0.01", "~"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/62"), Control.unless("score", "#spawned_jumppads", "mcm.temp", "matches", "1"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.heal_point.active]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/58
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.heal_point.active]", "eyes"), Control.positioned("^", "^", "^0.15"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.85"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "59.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=60..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "-69.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-70]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/59
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.heal_point.active]", "eyes"), Control.positioned("^", "^", "^0.25"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.75"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/6
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#dragon_setup_detected_crystals"));
        Logic.step(() -> Control.run(c, x0 -> Native.forceload(x0, "add", "0", "0"), Control.dimension("minecraft:the_end")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/7"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/9"), Control.as("@e[type=marker,tag=mcm.its.dragon.temp_setup.crystal]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/setup"), Control.dimension("minecraft:the_end")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.its.dragon.setup.state", "2"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/60
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.heal_point.active]", "eyes"), Control.positioned("^", "^", "^0.5"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.5"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/61
    private static int f22(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.heal_point.active]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/62
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#spawned_jumppads", "mcm.temp", "1"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "0", "60", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/spawn_jumppads"), Control.at("@s")));
        return 1;
    }
}
