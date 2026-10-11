package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled174 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/magic_circle_a/zzz/1", Compiled174::f0);
        Logic.register("impossible_to_survive:effects/magic_circle_a/zzz/2", Compiled174::f1);
        Logic.register("impossible_to_survive:effects/magic_circle_b/game_loop", Compiled174::f2);
        Logic.register("impossible_to_survive:effects/magic_circle_b/init", Compiled174::f3);
        Logic.register("impossible_to_survive:effects/magic_circle_b/loop", Compiled174::f4);
        Logic.register("impossible_to_survive:effects/magic_circle_b/summon", Compiled174::f5);
        Logic.register("impossible_to_survive:effects/magic_circle_b/zzz/0", Compiled174::f6);
        Logic.register("impossible_to_survive:effects/magic_circle_b/zzz/1", Compiled174::f7);
        Logic.register("impossible_to_survive:effects/magic_circle_b/zzz/2", Compiled174::f8);
        Logic.register("impossible_to_survive:effects/magic_circle_b/zzz/3", Compiled174::f9);
        Logic.register("impossible_to_survive:effects/magic_circle_b/zzz/4", Compiled174::f10);
        Logic.register("impossible_to_survive:effects/random_lightning/directional", Compiled174::f11);
        Logic.register("impossible_to_survive:effects/random_lightning/directional_up", Compiled174::f12);
        Logic.register("impossible_to_survive:effects/random_lightning/init", Compiled174::f13);
        Logic.register("impossible_to_survive:effects/random_lightning/random", Compiled174::f14);
        Logic.register("impossible_to_survive:effects/random_lightning/summon_secondary_zap", Compiled174::f15);
        Logic.register("impossible_to_survive:effects/random_lightning/zap", Compiled174::f16);
        Logic.register("impossible_to_survive:effects/random_lightning/zap_forward", Compiled174::f17);
        Logic.register("impossible_to_survive:effects/random_lightning/zzz/0", Compiled174::f18);
        Logic.register("impossible_to_survive:effects/random_lightning/zzz/1", Compiled174::f19);
        Logic.register("impossible_to_survive:effects/random_lightning/zzz/2", Compiled174::f20);
        Logic.register("impossible_to_survive:effects/random_lightning/zzz/3", Compiled174::f21);
        Logic.register("impossible_to_survive:effects/random_lightning/zzz/4", Compiled174::f22);
        Logic.register("impossible_to_survive:effects/random_lightning/zzz/5", Compiled174::f23);
    }
    // impossible_to_survive:effects/magic_circle_a/zzz/1
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#global", "mcm.vfx.magic_circle_a.game_time"), Control.store("result", "storage", "mcm:vfx_magic_circle_a", "rotation_2.angle", "float", "0.025")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "transformation.left_rotation", "set", "from", "storage", "mcm:vfx_magic_circle_a", "rotation_2"), Control.store("success", "entity", "@s", "start_interpolation", "int", "0")));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_a/zzz/2
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#global", "mcm.vfx.magic_circle_a.game_time"), Control.store("result", "storage", "mcm:vfx_magic_circle_a", "rotation_3.angle", "float", "0.05")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "transformation.left_rotation", "set", "from", "storage", "mcm:vfx_magic_circle_a", "rotation_3"), Control.store("success", "entity", "@s", "start_interpolation", "int", "0")));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_b/game_loop
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#global", "mcm.vfx.magic_circle_b.game_time", "1"));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_b/init
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lifetime", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.vfx.magic_circle_b.game_time", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.random", "dummy"));
        Logic.step(() -> Native.data(c, "merge", "storage", "mcm:vfx_magic_circle_b", "{rotation_1:{angle:0f,axis:[-0.1d,0.7d,0.2d]},rotation_2:{angle:45f,axis:[-0.3d,0.1d,0.6d]},rotation_3:{angle:20f,axis:[0.8d,0.2d,0.0d]}}"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.vfx.magic_circle_b.game_time", "0"));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_b/loop
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/magic_circle_b/zzz/0"), Control.when("score", "@s", "mcm.lifetime", "matches", "10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/magic_circle_b/zzz/1"), Control.when("score", "@s", "mcm.lifetime", "matches", "80")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/magic_circle_b/zzz/2"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_b.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/magic_circle_b/zzz/3"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_b.2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/magic_circle_b/zzz/4"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_b.3]")));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_b/summon
    private static int f5(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{interpolation_duration:3,teleport_duration:2,Tags:[\"mcm.vfx.magic_circle_b\",\"mcm.vfx.magic_circle_b.1\",\"mcm.vfx\",\"mcm.its.dragon.stage_force_field.component\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[0.0f,0.0f,0.0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":20}}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{interpolation_duration:3,teleport_duration:2,Tags:[\"mcm.vfx.magic_circle_b\",\"mcm.vfx.magic_circle_b.2\",\"mcm.vfx\",\"mcm.its.dragon.stage_force_field.component\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[0.0f,0.0f,0.0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":20}}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{interpolation_duration:3,teleport_duration:2,Tags:[\"mcm.vfx.magic_circle_b\",\"mcm.vfx.magic_circle_b.3\",\"mcm.vfx\",\"mcm.its.dragon.stage_force_field.component\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[0.0f,0.0f,0.0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":20}}}"));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_b/zzz/0
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{scale:[3.0f,3.0f,3.0f]}}"));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_b/zzz/1
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{interpolation_duration:3,start_interpolation:1,transformation:{scale:[0.0f,0.0f,0.0f]}}"));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_b/zzz/2
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#global", "mcm.vfx.magic_circle_b.game_time"), Control.store("result", "storage", "mcm:vfx_magic_circle_b", "rotation_1.angle", "float", "0.075")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "transformation.left_rotation", "set", "from", "storage", "mcm:vfx_magic_circle_b", "rotation_1"), Control.store("success", "entity", "@s", "start_interpolation", "int", "0")));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_b/zzz/3
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#global", "mcm.vfx.magic_circle_b.game_time"), Control.store("result", "storage", "mcm:vfx_magic_circle_b", "rotation_2.angle", "float", "0.025")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "transformation.left_rotation", "set", "from", "storage", "mcm:vfx_magic_circle_b", "rotation_2"), Control.store("success", "entity", "@s", "start_interpolation", "int", "0")));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_b/zzz/4
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#global", "mcm.vfx.magic_circle_b.game_time"), Control.store("result", "storage", "mcm:vfx_magic_circle_b", "rotation_3.angle", "float", "0.05")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "transformation.left_rotation", "set", "from", "storage", "mcm:vfx_magic_circle_b", "rotation_3"), Control.store("success", "entity", "@s", "start_interpolation", "int", "0")));
        return 1;
    }
    // impossible_to_survive:effects/random_lightning/directional
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "10..18"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.max_zap_changes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.lightning_vfx.max_secondary_zap_changes", "3"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/random_lightning/zap"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#temp"));
        return 1;
    }
    // impossible_to_survive:effects/random_lightning/directional_up
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "4..9"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.max_zap_changes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.lightning_vfx.max_secondary_zap_changes", "3"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "-90..-70"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..360"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/random_lightning/zap"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#temp"));
        return 1;
    }
    // impossible_to_survive:effects/random_lightning/init
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.zap_dir", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.spread", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.zap_step_distance", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.zap_init_dir_x", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.zap_init_dir_y", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.pos_spread_x", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.max_secondary_zap_changes", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.max_zap_changes", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.pos_spread_y", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.pos_spread_z", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.x_rotation", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.y_rotation", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.random", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/random_lightning/random
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "4..10"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.max_zap_changes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.lightning_vfx.max_secondary_zap_changes", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "-90..90"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..360"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/random_lightning/zap"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#temp"));
        return 1;
    }
    // impossible_to_survive:effects/random_lightning/summon_secondary_zap
    private static int f15(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.lightning_vfx\",\"mcm.lightning_vfx.secondary_zap\"]}"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#temp", "mcm.lightning_vfx.zap_dir", "=", "@s", "mcm.lightning_vfx.zap_dir"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/random_lightning/zzz/8"), Control.as("@e[type=marker,tag=mcm.lightning_vfx.secondary_zap]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:effects/random_lightning/zap
    private static int f16(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.lightning_vfx\",\"mcm.lightning_vfx.main_zap\",\"mcm.init\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/random_lightning/zzz/0"), Control.as("@e[type=marker,tag=mcm.lightning_vfx.main_zap,tag=mcm.init]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:effects/random_lightning/zap_forward
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.lightning_vfx.max_zap_changes", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/random_lightning/zzz/1"), Control.when("score", "@s", "mcm.lightning_vfx.max_zap_changes", "matches", "1.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.lightning_vfx.max_zap_changes", "matches", "..0")));
        return 1;
    }
    // impossible_to_survive:effects/random_lightning/zzz/0
    private static int f18(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#temp", "mcm.lightning_vfx.zap_init_dir_x"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#temp", "mcm.lightning_vfx.zap_init_dir_y"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.zap_init_dir_x", "=", "#temp", "mcm.lightning_vfx.zap_init_dir_x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.zap_init_dir_y", "=", "#temp", "mcm.lightning_vfx.zap_init_dir_y"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.max_zap_changes", "=", "#temp", "mcm.lightning_vfx.max_zap_changes"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_dir")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/random_lightning/zap_forward"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:effects/random_lightning/zzz/1
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.lightning_vfx.zap_init_dir_x"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.lightning_vfx.zap_init_dir_y"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..5"), Control.store("result", "score", "@s", "mcm.lightning_vfx.spread")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/random_lightning/zzz/2"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "0..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/random_lightning/zzz/3"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "3..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/random_lightning/zzz/4"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..3"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_step_distance")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.lightning_vfx.zap_step_distance", "0"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/random_lightning/zzz/5"), Control.when("score", "@s", "mcm.lightning_vfx.zap_step_distance", "matches", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/random_lightning/zzz/6"), Control.when("score", "@s", "mcm.lightning_vfx.zap_step_distance", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/random_lightning/zzz/7"), Control.when("score", "@s", "mcm.lightning_vfx.zap_step_distance", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "2..5"), Control.store("result", "score", "@s", "mcm.random")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.zap_dir", "+=", "@s", "mcm.random"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s[scores={mcm.lightning_vfx.zap_dir=8..}]", "mcm.lightning_vfx.zap_dir", "8"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/random_lightning/summon_secondary_zap"), Control.when("entity", "@s[tag=mcm.lightning_vfx.main_zap]"), Control.when("predicate", "mcm:random/50_percent"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/random_lightning/zap_forward"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:effects/random_lightning/zzz/2
    private static int f20(Frame c) {
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
    // impossible_to_survive:effects/random_lightning/zzz/3
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-35"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~35", "~-35"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~35", "~"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~35", "~35"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "3"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~35"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "4"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-35", "~35"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "5"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-35", "~"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "6"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-35", "~-35"), Control.when("score", "@s", "mcm.lightning_vfx.zap_dir", "matches", "7"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:effects/random_lightning/zzz/4
    private static int f22(Frame c) {
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
    // impossible_to_survive:effects/random_lightning/zzz/5
    private static int f23(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "^", "^", "^0.5"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.1", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.2", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.3", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.4", "0.01", "0.01", "0.01", "0", "1", "force"));
        return 1;
    }
}
