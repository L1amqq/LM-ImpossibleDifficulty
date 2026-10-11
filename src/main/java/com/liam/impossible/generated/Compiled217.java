package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled217 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/do_fireball_attack", Compiled217::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/do_forcefield_attack", Compiled217::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/do_laser_attack", Compiled217::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/do_lightning_attack", Compiled217::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/do_sleep", Compiled217::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/do_stage_transition", Compiled217::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/do_tail_slam_attack", Compiled217::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/fly_to_center", Compiled217::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/seek_healing", Compiled217::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/start_gradual_hover", Compiled217::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/start_hover_at_nearest_waypoint", Compiled217::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/start_hover_at_nearest_waypoint_to_player", Compiled217::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/start_hover_at_nearest_waypoint_to_player_high", Compiled217::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/start_hover_at_nearest_waypoint_to_player_low", Compiled217::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/start_hover_at_sixth_nearest_waypoint_high", Compiled217::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/start_instant_hover", Compiled217::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying", Compiled217::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying_forward", Compiled217::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying_forward_high_waypoint", Compiled217::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/zzz/0", Compiled217::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/apply_damage", Compiled217::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/crystal_tail/destroy_lightning", Compiled217::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/crystal_tail/loop", Compiled217::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/crystal_tail/place", Compiled217::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/do_fireball_attack
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.last_attack", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/start_hover_at_nearest_waypoint_to_player"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.next_activity", "8"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.decision.fireball", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/do_forcefield_attack
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.last_attack", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_fly"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.decision.forcefield", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/do_laser_attack
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.last_attack", "6"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/start_hover_at_sixth_nearest_waypoint_high"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.next_activity", "9"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.decision.laser", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/do_lightning_attack
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.last_attack", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "7"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.decision.lightning", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/do_sleep
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "16"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.bossbar_invisible"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/sleeping/tween", "{to_frame:0,duration:0}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/do_stage_transition
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "13"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.health", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_fly"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/do_tail_slam_attack
    private static int f6(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.last_attack", "4"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/start_hover_at_nearest_waypoint_to_player_low"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.next_activity", "11"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.decision.tail_slam", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/fly_to_center
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "6"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_fly"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/seek_healing
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#spawned_jumppads", "mcm.temp"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.flight_speed", "1000"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_fly"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.heal_point]", "remove", "mcm.its.dragon_environment.heal_point.active"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.heal_point,tag=!mcm.its.dragon_environment.heal_point.destroyed,limit=1,sort=nearest]", "add", "mcm.its.dragon_environment.heal_point.active"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/start_gradual_hover
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "3"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_hover"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/start_hover_at_nearest_waypoint
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "4"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_fly"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "@s", "mcm.its.dragon.homing_rotation_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "@s", "mcm.its.dragon.homing_rotation_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "@s", "mcm.its.dragon.tweened_rotation_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "@s", "mcm.its.dragon.tweened_rotation_y")));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Native.tag(c, "@n[type=marker,tag=mcm.its.dragon_environment.waypoint]", "add", "mcm.its.dragon_environment.waypoint.active"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/start_hover_at_nearest_waypoint_to_player
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "4"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_fly"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "@s", "mcm.its.dragon.homing_rotation_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "@s", "mcm.its.dragon.homing_rotation_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "@s", "mcm.its.dragon.tweened_rotation_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "@s", "mcm.its.dragon.tweened_rotation_y")));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@n[type=marker,tag=mcm.its.dragon_environment.waypoint]", "add", "mcm.its.dragon_environment.waypoint.active"), Control.as("@p[predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@n[type=marker,tag=mcm.its.dragon_environment.waypoint]", "add", "mcm.its.dragon_environment.waypoint.active"), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/start_hover_at_nearest_waypoint_to_player_high
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "4"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_fly"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "@s", "mcm.its.dragon.homing_rotation_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "@s", "mcm.its.dragon.homing_rotation_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "@s", "mcm.its.dragon.tweened_rotation_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "@s", "mcm.its.dragon.tweened_rotation_y")));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.high]", "add", "mcm.its.dragon_environment.waypoint.active"), Control.as("@p[predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.high]", "add", "mcm.its.dragon_environment.waypoint.active"), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/start_hover_at_nearest_waypoint_to_player_low
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "4"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_fly"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "@s", "mcm.its.dragon.homing_rotation_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "@s", "mcm.its.dragon.homing_rotation_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "@s", "mcm.its.dragon.tweened_rotation_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "@s", "mcm.its.dragon.tweened_rotation_y")));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.low]", "add", "mcm.its.dragon_environment.waypoint.active"), Control.as("@p[predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.low]", "add", "mcm.its.dragon_environment.waypoint.active"), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/start_hover_at_sixth_nearest_waypoint_high
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "4"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "@s", "mcm.its.dragon.homing_rotation_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "@s", "mcm.its.dragon.homing_rotation_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "@s", "mcm.its.dragon.tweened_rotation_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "@s", "mcm.its.dragon.tweened_rotation_y")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_fly"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/activity/zzz/0"), Control.as("@p[predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.high]", "add", "mcm.its.dragon_environment.waypoint.active"), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/start_instant_hover
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "2"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_hover"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.flight_speed", "0"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "1"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_fly"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint,sort=random,limit=1,distance=30..]", "add", "mcm.its.dragon_environment.waypoint.active"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying_forward
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "1"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_fly"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@n[type=marker,tag=mcm.its.dragon_environment.waypoint]", "add", "mcm.its.dragon_environment.waypoint.active"), Control.positioned("^", "^", "^30")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying_forward_high_waypoint
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "1"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_fly"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.high]", "add", "mcm.its.dragon_environment.waypoint.active"), Control.positioned("^", "^", "^30")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/zzz/0
    private static int f19(Frame c) {
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.high,limit=5,sort=nearest]", "add", "mcm.exclude"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "mcm.its.dragon_environment.waypoint.active"), Control.as("@n[type=marker,tag=mcm.its.dragon_environment.waypoint.high,tag=!mcm.exclude]"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.high,tag=mcm.exclude]", "remove", "mcm.exclude"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/apply_damage
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#damage_dealt", "mcm.temp", "<", "#impact_damage_cap", "mcm.its.dragon.settings"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#damage_dealt", "mcm.temp", "*=", "#global_health_multiplier", "mcm.its.dragon.settings"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.health", "-=", "#damage_dealt", "mcm.temp"));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "color", "pink"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_damaged"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.damaged_cd", "6"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#require_healing_check", "mcm.temp", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#require_healing_check", "mcm.temp", "=", "#global", "mcm.its.dragon.crystal_count"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#require_healing_check", "mcm.temp", "*=", "100000", "constant"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#require_healing_check", "mcm.temp", "-=", "@s", "mcm.its.dragon.health"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "mcm.its.dragon.initiate_seek_healing"), Control.when("score", "#require_healing_check", "mcm.temp", "matches", "100000.."), Control.unless("score", "@s", "mcm.its.dragon.health", "matches", "..0"), Control.unless("score", "@s", "mcm.its.dragon.activity", "matches", "5"), Control.unless("score", "@s", "mcm.its.dragon.activity", "matches", "13")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/418"), Control.when("score", "@s", "mcm.its.dragon.health", "matches", "..0")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#require_healing_check"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/crystal_tail/destroy_lightning
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "7..9"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.max_zap_changes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.lightning_vfx.max_secondary_zap_changes", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "-75..30"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..360"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/random_lightning/zap"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#temp"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/crystal_tail/loop
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/3"), Control.unless("entity", "@s[tag=mcm.crystal_tail.destroyed]"), Control.unless("entity", "@s[tag=mcm.crystal_tail.unbreakable]"), Control.unless("entity", "@s[tag=mcm.crystal_tail.removed]"), Control.unless("block", "~", "~", "~", "minecraft:skeleton_skull")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/4"), Control.when("entity", "@s[tag=mcm.crystal_tail.destroyed]"), Control.unless("entity", "@s[tag=mcm.crystal_tail.unbreakable]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/6"), Control.when("entity", "@s[tag=mcm.crystal_tail.unbreakable]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/crystal_tail/place
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/0"), Control.unless("block", "~", "~", "~", "skeleton_skull")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/2"), Control.when("score", "#ifelse", "mcb.internal", "matches", "0")));
        return 1;
    }
}
