package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled175 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/random_lightning/zzz/6", Compiled175::f0);
        Logic.register("impossible_to_survive:effects/random_lightning/zzz/7", Compiled175::f1);
        Logic.register("impossible_to_survive:effects/random_lightning/zzz/8", Compiled175::f2);
        Logic.register("impossible_to_survive:effects/ring_end_rod_particles", Compiled175::f3);
        Logic.register("impossible_to_survive:effects/screen_shake/apply_ground_slam_impact", Compiled175::f4);
        Logic.register("impossible_to_survive:effects/screen_shake/apply_ground_slam_launch", Compiled175::f5);
        Logic.register("impossible_to_survive:effects/screen_shake/apply_ground_slam_stun", Compiled175::f6);
        Logic.register("impossible_to_survive:effects/screen_shake/apply_recharge_explosion", Compiled175::f7);
        Logic.register("impossible_to_survive:effects/screen_shake/init", Compiled175::f8);
        Logic.register("impossible_to_survive:effects/screen_shake/player_loop", Compiled175::f9);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/0", Compiled175::f10);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/1", Compiled175::f11);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/10", Compiled175::f12);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/11", Compiled175::f13);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/12", Compiled175::f14);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/13", Compiled175::f15);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/2", Compiled175::f16);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/3", Compiled175::f17);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/4", Compiled175::f18);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/5", Compiled175::f19);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/6", Compiled175::f20);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/7", Compiled175::f21);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/8", Compiled175::f22);
        Logic.register("impossible_to_survive:effects/screen_shake/zzz/9", Compiled175::f23);
    }
    // impossible_to_survive:effects/random_lightning/zzz/6
    private static int f0(Frame c) {
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
    // impossible_to_survive:effects/random_lightning/zzz/7
    private static int f1(Frame c) {
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
    // impossible_to_survive:effects/random_lightning/zzz/8
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#temp", "mcm.lightning_vfx.zap_init_dir_x"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#temp", "mcm.lightning_vfx.zap_init_dir_y"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.spread")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-35"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~35", "~-35"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~35", "~"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~35", "~35"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "3"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~35"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "4"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-35", "~35"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "5"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-35", "~"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "6"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-35", "~-35"), Control.when("score", "@s", "mcm.lightning_vfx.spread", "matches", "7"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..7"), Control.store("result", "score", "@s", "mcm.lightning_vfx.zap_dir")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.max_zap_changes", "=", "#temp", "mcm.lightning_vfx.max_secondary_zap_changes"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/random_lightning/zap_forward"));
        return 1;
    }
    // impossible_to_survive:effects/ring_end_rod_particles
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000015", "0", "force"), Control.positioned("^0.5", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000015", "0", "force"), Control.positioned("^0.2701511529340699", "^0.42073549240394825", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000015", "0", "force"), Control.positioned("^-0.2080734182735712", "^0.45464871341284085", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000015", "0", "force"), Control.positioned("^-0.4949962483002227", "^0.0705600040299336", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000015", "0", "force"), Control.positioned("^-0.32682181043180597", "^-0.3784012476539641", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000015", "0", "force"), Control.positioned("^0.14183109273161312", "^-0.4794621373315692", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000015", "0", "force"), Control.positioned("^0.48008514332518304", "^-0.13970774909946293", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000015", "0", "force"), Control.positioned("^0.3769511271716523", "^0.32849329935939453", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000015", "0", "force"), Control.positioned("^-0.07275001690430677", "^0.4946791233116909", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000015", "0", "force"), Control.positioned("^-0.45556513094233847", "^0.2060592426208783", "^")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/apply_ground_slam_impact
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.apply_delay", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.timer", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.decay_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.decay_rate", "4"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.magnitude", "2"));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/apply_ground_slam_launch
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.apply_delay", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.timer", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.decay_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.decay_rate", "4"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.magnitude", "3"));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/apply_ground_slam_stun
    private static int f6(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.apply_delay", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.timer", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.decay_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.decay_rate", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.magnitude", "3"));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/apply_recharge_explosion
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.apply_delay", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.timer", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.decay_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.decay_rate", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.screen_shake.magnitude", "3"));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/init
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.screen_shake.apply_delay", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.screen_shake.decay_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.screen_shake.decay_rate", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.screen_shake.direction_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.screen_shake.timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.screen_shake.magnitude", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/player_loop
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/0"), Control.when("score", "@s", "mcm.screen_shake.timer", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/0
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.screen_shake.apply_delay", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("score", "@s", "mcm.screen_shake.apply_delay", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.screen_shake.decay_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/1"), Control.when("score", "@s", "mcm.screen_shake.decay_timer", "matches", "..0")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.screen_shake.direction_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.screen_shake.direction_timer", "1"), Control.when("predicate", "mcm:random/25_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.screen_shake.direction_timer", "0"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "5..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/2"), Control.when("score", "@s", "mcm.screen_shake.magnitude", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/5"), Control.when("score", "@s", "mcm.screen_shake.magnitude", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/8"), Control.when("score", "@s", "mcm.screen_shake.magnitude", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/11"), Control.when("score", "@s", "mcm.screen_shake.magnitude", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/1
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.screen_shake.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.screen_shake.magnitude", "1"), Control.when("score", "@s", "mcm.screen_shake.magnitude", "matches", "2..")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.screen_shake.decay_timer", "=", "@s", "mcm.screen_shake.decay_rate"));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/10
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.5", "~-1.5"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.5", "~1.5"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-1.5", "~-1"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/11
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/12"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "0..1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/13"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "2..4")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/12
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~3", "~"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-2.25", "~1.5"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/13
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.75", "~-2.25"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.75", "~2.25"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-2.25", "~-1.5"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/2
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/3"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "0..1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/4"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "2..4")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/3
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.5", "~"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-0.375", "~0.25"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/4
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.125", "~-0.375"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.215", "~0.375"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-0.375", "~-0.25"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/5
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/6"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "0..1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/7"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "2..4")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/6
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~1", "~"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-0.75", "~0.5"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/7
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.25", "~-0.75"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.25", "~0.75"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-0.75", "~-0.5"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/8
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/9"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "0..1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/zzz/10"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "2..4")));
        return 1;
    }
    // impossible_to_survive:effects/screen_shake/zzz/9
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~2", "~"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-1.5", "~1"), Control.when("score", "@s", "mcm.screen_shake.direction_timer", "matches", "1")));
        return 1;
    }
}
