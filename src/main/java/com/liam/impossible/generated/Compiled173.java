package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled173 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/39", Compiled173::f0);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/4", Compiled173::f1);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/40", Compiled173::f2);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/41", Compiled173::f3);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/42", Compiled173::f4);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/43", Compiled173::f5);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/44", Compiled173::f6);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/45", Compiled173::f7);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/46", Compiled173::f8);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/47", Compiled173::f9);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/48", Compiled173::f10);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/49", Compiled173::f11);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/5", Compiled173::f12);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/50", Compiled173::f13);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/51", Compiled173::f14);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/6", Compiled173::f15);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/7", Compiled173::f16);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/8", Compiled173::f17);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/9", Compiled173::f18);
        Logic.register("impossible_to_survive:effects/magic_circle_a/game_loop", Compiled173::f19);
        Logic.register("impossible_to_survive:effects/magic_circle_a/init", Compiled173::f20);
        Logic.register("impossible_to_survive:effects/magic_circle_a/loop", Compiled173::f21);
        Logic.register("impossible_to_survive:effects/magic_circle_a/summon", Compiled173::f22);
        Logic.register("impossible_to_survive:effects/magic_circle_a/zzz/0", Compiled173::f23);
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/39
    private static int f0(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.lightning_vfx.target"));
        Logic.step(() -> Control.run(c, x0 -> Native.title(x0, "@s", "actionbar", "{\"text\":\"\"}"), Control.when("entity", "@s[type=player]")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/4
    private static int f1(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/40
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/41"), Control.unless("score", "@s", "mcm.lightning_vfx.target_id", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/41
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#last_id", "mcm.lightning_vfx.target_id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#last_id", "mcm.lightning_vfx.target_id"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/42
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/43"), Control.at("@s"), Control.as("@e[tag=mcm.lightning_vfx.target]"), Control.when("score", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/43
    private static int f5(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.lightning_vfx.target"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/44
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.lightning_vfx.zap_init_dir_x"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.lightning_vfx.zap_init_dir_y"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..5"), Control.store("result", "score", "@s", "mcm.lightning_vfx.spread")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/45"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "0..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/46"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "3..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/47"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..3"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_step_distance")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.lightning_vfx.zap_step_distance", "0"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/48"), Control.when("score", "@s", "mcm.lightning_vfx.zap_step_distance", "matches", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/49"), Control.when("score", "@s", "mcm.lightning_vfx.zap_step_distance", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/50"), Control.when("score", "@s", "mcm.lightning_vfx.zap_step_distance", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "2..5"), Control.store("result", "score", "@s", "mcm.random")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.zap_dir", "+=", "@s", "mcm.random"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s[scores={mcm.lightning_vfx.zap_dir=8..}]", "mcm.lightning_vfx.zap_dir", "8"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zap_forward_secondary"), Control.when("score", "@s", "mcm.lightning_vfx.travel_iterations", "<=", "@s", "mcm.lightning_vfx.travel_speed")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/45
    private static int f7(Frame c) {
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
    // impossible_to_survive:effects/lightning_projectile/zzz/46
    private static int f8(Frame c) {
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
    // impossible_to_survive:effects/lightning_projectile/zzz/47
    private static int f9(Frame c) {
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
    // impossible_to_survive:effects/lightning_projectile/zzz/48
    private static int f10(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "^", "^", "^0.5"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.1", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.2", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.3", "0.01", "0.01", "0.01", "0", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "^", "^", "^0.4", "0.01", "0.01", "0.01", "0", "1", "force"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/49
    private static int f11(Frame c) {
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
    // impossible_to_survive:effects/lightning_projectile/zzz/5
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "flash", "~", "~1", "~", "0", "0", "0", "0.1", "1", "force"), Control.when("score", "#global", "disabled_flashbang", "matches", "1")));
        Logic.step(() -> Native.particle(c, "firework", "~", "~1", "~", "0", "0.5", "0", "0.2", "5", "force"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/lightning_hit"));
        Logic.step(() -> Native.title(c, "@s", "actionbar", "{\"text\":\"\"}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/6"), Control.unless("score", "@s", "mcm.its.dragon.hint.lightning_hit", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/7"), Control.when("entity", "@s[nbt={SelectedItem:{}}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/11"), Control.unless("entity", "@s[nbt={SelectedItem:{}}]")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/50
    private static int f13(Frame c) {
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
    // impossible_to_survive:effects/lightning_projectile/zzz/51
    private static int f14(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[tag=mcm.lightning_vfx.this_target]", "feet"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.spread")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-25"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~25", "~-25"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~25", "~"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~25", "~25"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "3"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~25"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "4"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-25", "~25"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "5"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-25", "~"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "6"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-25", "~-25"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "7"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_dir")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.max_zap_changes", "=", "#temp", "mcm.lightning_vfx.max_secondary_zap_changes"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.travel_speed", "=", "#temp", "mcm.lightning_vfx.travel_speed"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/6
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.hint.lightning_hit", "1"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u002a\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\" Hint:\",\"bold\":true,\"color\":\"#d9d134\",\"font\":\"minecraft:default\"},{\"text\":\" Lightning bolts destroy the item you are currently holding! Drop your item or select an empty slot before it reaches you!\",\"color\":\"aqua\",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/display_hint"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/7
    private static int f16(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:item.shield.break", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Control.run(c, x0 -> Native.item(x0, "replace", "entity", "@s", "weapon.mainhand", "with", "air"), Control.unless("predicate", "impossible_to_survive:holding_dragon_guide")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/8"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/9"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/10"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/8
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "4", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "2..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "6", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "4..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "7", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/9
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "11", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "2..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "12", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "4..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "13", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_a/game_loop
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#global", "mcm.vfx.magic_circle_a.game_time", "1"));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_a/init
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lifetime", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.vfx.magic_circle_a.game_time", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.random", "dummy"));
        Logic.step(() -> Native.data(c, "merge", "storage", "mcm:vfx_magic_circle_a", "{rotation_1:{angle:0f,axis:[-0.1d,0.7d,0.2d]},rotation_2:{angle:45f,axis:[-0.3d,0.1d,0.6d]},rotation_3:{angle:20f,axis:[0.8d,0.2d,0.0d]}}"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.vfx.magic_circle_a.game_time", "0"));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_a/loop
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/magic_circle_a/zzz/0"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_a.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/magic_circle_a/zzz/1"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_a.2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/magic_circle_a/zzz/2"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_a.3]")));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_a/summon
    private static int f22(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{interpolation_duration:3,teleport_duration:2,Tags:[\"mcm.vfx.magic_circle_a\",\"mcm.vfx.magic_circle_a.1\",\"mcm.vfx\",\"mcm.its.dragon.force_field.component\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[5.25f,5.25f,5.25f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":20}}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{interpolation_duration:3,teleport_duration:2,Tags:[\"mcm.vfx.magic_circle_a\",\"mcm.vfx.magic_circle_a.2\",\"mcm.vfx\",\"mcm.its.dragon.force_field.component\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[4.5f,4.5f,4.5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":20}}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{interpolation_duration:3,teleport_duration:2,Tags:[\"mcm.vfx.magic_circle_a\",\"mcm.vfx.magic_circle_a.3\",\"mcm.vfx\",\"mcm.its.dragon.force_field.component\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[5.27f,5.27f,5.27f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":20}}}"));
        return 1;
    }
    // impossible_to_survive:effects/magic_circle_a/zzz/0
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#global", "mcm.vfx.magic_circle_a.game_time"), Control.store("result", "storage", "mcm:vfx_magic_circle_a", "rotation_1.angle", "float", "0.075")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "transformation.left_rotation", "set", "from", "storage", "mcm:vfx_magic_circle_a", "rotation_1"), Control.store("success", "entity", "@s", "start_interpolation", "int", "0")));
        return 1;
    }
}
