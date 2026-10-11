package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled214 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/13", Compiled214::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/14", Compiled214::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/15", Compiled214::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/16", Compiled214::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/17", Compiled214::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/18", Compiled214::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/19", Compiled214::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/2", Compiled214::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/20", Compiled214::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/21", Compiled214::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/22", Compiled214::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/23", Compiled214::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/24", Compiled214::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/25", Compiled214::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/26", Compiled214::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/27", Compiled214::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/28", Compiled214::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/29", Compiled214::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/3", Compiled214::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/30", Compiled214::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/31", Compiled214::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/32", Compiled214::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/33", Compiled214::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/4", Compiled214::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/13
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#last_id", "mcm.lightning_vfx.target_id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#last_id", "mcm.lightning_vfx.target_id"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/14
    private static int f1(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.end_crystal.4]", "feet"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.colission_enabled", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.targeting_behaviour", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.override_homing_duration", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.homing_strength", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.travel_speed", "7"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_zap_changes", "400"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_secondary_zap_changes", "6"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_dir")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/15
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/16"), Control.unless("score", "@s", "mcm.lightning_vfx.target_id", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/16
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#last_id", "mcm.lightning_vfx.target_id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#last_id", "mcm.lightning_vfx.target_id"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/17
    private static int f4(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.end_crystal.5]", "feet"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.colission_enabled", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.targeting_behaviour", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.override_homing_duration", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.homing_strength", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.travel_speed", "7"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_zap_changes", "400"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_secondary_zap_changes", "6"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_dir")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/18
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/19"), Control.unless("score", "@s", "mcm.lightning_vfx.target_id", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/19
    private static int f6(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#last_id", "mcm.lightning_vfx.target_id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#last_id", "mcm.lightning_vfx.target_id"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/2
    private static int f7(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[tag=mcm.its.dragon_environment.exit_portal_center]", "feet"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.colission_enabled", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.targeting_behaviour", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.override_homing_duration", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.homing_strength", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.travel_speed", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_zap_changes", "400"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_secondary_zap_changes", "6"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_dir")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/20
    private static int f8(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.end_crystal.6]", "feet"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.colission_enabled", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.targeting_behaviour", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.override_homing_duration", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.homing_strength", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.travel_speed", "7"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_zap_changes", "400"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_secondary_zap_changes", "6"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_dir")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/21
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/22"), Control.unless("score", "@s", "mcm.lightning_vfx.target_id", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/22
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#last_id", "mcm.lightning_vfx.target_id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#last_id", "mcm.lightning_vfx.target_id"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/23
    private static int f11(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.end_crystal.7]", "feet"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.colission_enabled", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.targeting_behaviour", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.override_homing_duration", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.homing_strength", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.travel_speed", "7"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_zap_changes", "400"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_secondary_zap_changes", "6"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_dir")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/24
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/25"), Control.unless("score", "@s", "mcm.lightning_vfx.target_id", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/25
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#last_id", "mcm.lightning_vfx.target_id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#last_id", "mcm.lightning_vfx.target_id"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/26
    private static int f14(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.end_crystal.8]", "feet"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.colission_enabled", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.targeting_behaviour", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.override_homing_duration", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.homing_strength", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.travel_speed", "7"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_zap_changes", "400"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_secondary_zap_changes", "6"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_dir")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/27
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/28"), Control.unless("score", "@s", "mcm.lightning_vfx.target_id", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/28
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#last_id", "mcm.lightning_vfx.target_id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#last_id", "mcm.lightning_vfx.target_id"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/29
    private static int f17(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.end_crystal.9]", "feet"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.colission_enabled", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.targeting_behaviour", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.override_homing_duration", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.homing_strength", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.travel_speed", "7"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_zap_changes", "400"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_secondary_zap_changes", "6"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_dir")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/3
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/4"), Control.unless("score", "@s", "mcm.lightning_vfx.target_id", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/30
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/31"), Control.unless("score", "@s", "mcm.lightning_vfx.target_id", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/31
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#last_id", "mcm.lightning_vfx.target_id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#last_id", "mcm.lightning_vfx.target_id"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/32
    private static int f21(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.end_crystal.10]", "feet"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.colission_enabled", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.targeting_behaviour", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.override_homing_duration", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.homing_strength", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.travel_speed", "7"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_zap_changes", "400"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_secondary_zap_changes", "6"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_dir")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/33
    private static int f22(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivate_and_upgrade"));
        Logic.step(() -> Native.particle(c, "flash", "~", "~1", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "explosion_emitter", "~", "~-1", "~", "3", "3", "3", "0.1", "10", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/4
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#last_id", "mcm.lightning_vfx.target_id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#last_id", "mcm.lightning_vfx.target_id"));
        return 1;
    }
}
