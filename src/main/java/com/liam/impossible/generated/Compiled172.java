package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled172 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/17", Compiled172::f0);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/18", Compiled172::f1);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/19", Compiled172::f2);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/2", Compiled172::f3);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/20", Compiled172::f4);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/21", Compiled172::f5);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/22", Compiled172::f6);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/23", Compiled172::f7);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/24", Compiled172::f8);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/25", Compiled172::f9);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/26", Compiled172::f10);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/27", Compiled172::f11);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/28", Compiled172::f12);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/29", Compiled172::f13);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/3", Compiled172::f14);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/30", Compiled172::f15);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/31", Compiled172::f16);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/32", Compiled172::f17);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/33", Compiled172::f18);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/34", Compiled172::f19);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/35", Compiled172::f20);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/36", Compiled172::f21);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/37", Compiled172::f22);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/38", Compiled172::f23);
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/17
    private static int f0(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.self_bolt"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/18"), Control.as("@e[tag=mcm.lightning_vfx.target]"), Control.when("score", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.when("entity", "@e[tag=mcm.lightning_vfx.this_target]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/target_lost_event"), Control.when("score", "#temp", "mcm.temp", "matches", "0")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/lightning_projectile/zap_forward_main"));
        Logic.step(() -> Native.tag(c, "@e[tag=mcm.lightning_vfx.this_target]", "remove", "mcm.lightning_vfx.this_target"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.lightning_vfx.self_bolt"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/18
    private static int f1(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.this_target"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/19"), Control.when("entity", "@s[type=player]")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/19
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.title(x0, "@s", "actionbar", "[{\"text\":\"\\u0028\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\"\\u0027\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\"\\u0029\",\"font\":\"minecraft:icons\",\"color\":\"white\"}]"), Control.unless("entity", "@s[nbt={SelectedItem:{}}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.title(x0, "@s", "actionbar", "[{\"text\":\"\\u0028\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\"\\u0026\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\"\\u0029\",\"font\":\"minecraft:icons\",\"color\":\"white\"}]"), Control.when("entity", "@s[nbt={SelectedItem:{}}]")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/2
    private static int f3(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[tag=mcm.lightning_vfx.this_target]", "feet"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.colission_enabled", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.override_homing_duration", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.targeting_behaviour", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.homing_strength", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.travel_speed", "8"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_zap_changes", "200"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_secondary_zap_changes", "6"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_dir")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/20
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/21"), Control.when("score", "@s", "mcm.lightning_vfx.targeting_behaviour", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/22"), Control.when("score", "@s", "mcm.lightning_vfx.targeting_behaviour", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/23"), Control.when("score", "@s", "mcm.lightning_vfx.targeting_behaviour", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..5"), Control.store("result", "score", "@s", "mcm.lightning_vfx.spread")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/31"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "0..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/32"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "3..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/33"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..3"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_step_distance")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.lightning_vfx.zap_step_distance", "0"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/34"), Control.when("score", "@s", "mcm.lightning_vfx.zap_step_distance", "matches", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/35"), Control.when("score", "@s", "mcm.lightning_vfx.zap_step_distance", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/36"), Control.when("score", "@s", "mcm.lightning_vfx.zap_step_distance", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "2..5"), Control.store("result", "score", "@s", "mcm.random")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.zap_dir", "+=", "@s", "mcm.random"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s[scores={mcm.lightning_vfx.zap_dir=8..}]", "mcm.lightning_vfx.zap_dir", "8"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/summon_secondary_zap"), Control.when("predicate", "mcm:random/25_percent"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/37"), Control.when("entity", "@s[tag=mcm.lightning_vfx.projectile.egg_attracted,tag=!mcm.lightning_vfx.projectile.egg_change_made]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/target_reached_event"), Control.when("entity", "@e[tag=mcm.lightning_vfx.this_target,distance=..2.0]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/colission_event"), Control.when("score", "@s", "mcm.lightning_vfx.colission_enabled", "matches", "1"), Control.when("score", "@s", "mcm.lightning_vfx.zap_counter", "matches", "6.."), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zap_forward_main"), Control.when("score", "@s", "mcm.lightning_vfx.travel_iterations", "<=", "@s", "mcm.lightning_vfx.travel_speed")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/21
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.lightning_vfx.zap_init_dir_x"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.lightning_vfx.zap_init_dir_y"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/22
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "facing", "entity", "@n[tag=mcm.lightning_vfx.this_target]", "feet"), Control.when("score", "@s", "mcm.lightning_vfx.override_homing_duration", "matches", "..0")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/23
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.lightning_vfx.zap_init_dir_x"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.lightning_vfx.zap_init_dir_y"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("score", "@s", "mcm.lightning_vfx.override_homing_duration", "matches", "..0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/24"), Control.when("score", "@s", "mcm.lightning_vfx.homing_strength", "matches", "1..2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/28"), Control.when("score", "@s", "mcm.lightning_vfx.homing_strength", "matches", "3..4"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-50]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_y")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/24
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/25"), Control.when("score", "@s", "mcm.lightning_vfx.homing_strength", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/26"), Control.when("score", "@s", "mcm.lightning_vfx.homing_strength", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/27"), Control.when("entity", "@e[tag=mcm.lightning_vfx.this_target,distance=..6]")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/25
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[tag=mcm.lightning_vfx.this_target]", "eyes"), Control.positioned("^", "^", "^0.05"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.95"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/26
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[tag=mcm.lightning_vfx.this_target]", "eyes"), Control.positioned("^", "^", "^0.1"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.9"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/27
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[tag=mcm.lightning_vfx.this_target]", "eyes"), Control.positioned("^", "^", "^0.2"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.8"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/28
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/29"), Control.when("score", "@s", "mcm.lightning_vfx.homing_strength", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/30"), Control.when("score", "@s", "mcm.lightning_vfx.homing_strength", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/29
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[tag=mcm.lightning_vfx.this_target]", "eyes"), Control.positioned("^", "^", "^0.2"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.8"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/3
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.at("@s"), Control.as("@e[tag=mcm.lightning_vfx.main_zap,tag=mcm.lightning_vfx.projectile,tag=!mcm.lightning_vfx.self_bolt]"), Control.when("score", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/4"), Control.when("score", "#temp", "mcm.temp", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/lightning_hit_end_crystal"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal]")), Control.when("score", "#stage_transition", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/impossible_dragon/ability/heal/lightning_hit_end_crystal"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal,tag=mcm.its.dragon_environment.end_crystal.destroyed]")), Control.unless("score", "#stage_transition", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/lightning_hit_end_crystal"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal,tag=mcm.its.dragon_environment.end_crystal.destroyed]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/5"), Control.when("entity", "@s[type=player]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/12"), Control.when("entity", "@s[type=item_display,tag=mcm.crystal_tail,tag=!mcm.crystal_tail.destroyed]")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/30
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[tag=mcm.lightning_vfx.this_target]", "eyes"), Control.positioned("^", "^", "^0.3"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.7"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/31
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-15"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~15", "~-15"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~15", "~"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~15", "~15"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "3"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~15"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "4"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-15", "~15"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "5"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-15", "~"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "6"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-15", "~-15"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "7"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/32
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-25"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~25", "~-25"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~25", "~"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~25", "~25"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "3"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~25"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "4"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-25", "~25"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "5"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-25", "~"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "6"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-25", "~-25"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "7"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/33
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-75"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~75", "~-75"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~75", "~"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~75", "~75"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "3"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~75"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "4"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-75", "~75"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "5"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-75", "~"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "6"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-75", "~-75"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "7"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/34
    private static int f19(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "^", "^", "^0.5"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.1", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.2", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.3", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.4", "0.01", "0.01", "0.01", "0", "1", "force"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/35
    private static int f20(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "^", "^", "^1"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.1", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.2", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.3", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.4", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.5", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.6", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.7", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.8", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.9", "0.01", "0.01", "0.01", "0", "1", "force"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/36
    private static int f21(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "^", "^", "^1.5"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.1", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.2", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.3", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.4", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.5", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.6", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.7", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.8", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.9", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^1", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^1.1", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^1.2", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^1.3", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^1.4", "0.01", "0.01", "0.01", "0", "1", "force"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/37
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/38"), Control.when("entity", "@e[type=item_display,tag=mcm.crystal_tail,tag=!mcm.crystal_tail.destroyed,distance=..20]")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/38
    private static int f23(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.projectile.egg_change_made"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/39"), Control.as("@e[tag=mcm.lightning_vfx.target]"), Control.when("score", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/40"), Control.as("@n[type=item_display,tag=mcm.crystal_tail,tag=!mcm.crystal_tail.destroyed,distance=..20]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id"));
        return 1;
    }
}
