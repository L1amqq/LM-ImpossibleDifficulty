package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled215 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/5", Compiled215::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/6", Compiled215::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/7", Compiled215::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/8", Compiled215::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/9", Compiled215::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/set_shockwave_averted", Compiled215::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/crystal_spike_loop", Compiled215::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/impact_lightning", Compiled215::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/impact_point_loop", Compiled215::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/lightning_up", Compiled215::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/particle_ring_dragon_breath", Compiled215::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/particle_ring_end_rod", Compiled215::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/particle_ring_end_rod2", Compiled215::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/shockwave_travel_loop", Compiled215::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/summon", Compiled215::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/summon_crystal_spike", Compiled215::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/0", Compiled215::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/1", Compiled215::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/10", Compiled215::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/2", Compiled215::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/3", Compiled215::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/4", Compiled215::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/5", Compiled215::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/6", Compiled215::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/5
    private static int f0(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.end_crystal.1]", "feet"));
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
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/6
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/7"), Control.unless("score", "@s", "mcm.lightning_vfx.target_id", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/7
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#last_id", "mcm.lightning_vfx.target_id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#last_id", "mcm.lightning_vfx.target_id"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/8
    private static int f3(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.end_crystal.2]", "feet"));
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
    // impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/9
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/zzz/10"), Control.unless("score", "@s", "mcm.lightning_vfx.target_id", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/set_shockwave_averted
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/zzz/0"), Control.as("@n[tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/zzz/1"), Control.as("@n[type=item_display,tag=mcm.crystal_tail]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s[type=marker,tag=mcm.its.dragon.shockwave_spawn_position]"));
        Logic.step(() -> Logic.returnValue(1));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/crystal_spike_loop
    private static int f6(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/10"), Control.when("score", "@s", "mcm.lifetime", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/lightning_up"), Control.when("predicate", "mcm:random/75_percent")), Control.when("score", "@s", "mcm.lifetime", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:8,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-0.5f,-1f,-0.5f],scale:[1f,1f,1f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "15")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.lifetime", "matches", "25..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/impact_lightning
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "10..20"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.max_zap_changes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.lightning_vfx.max_secondary_zap_changes", "3"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "-80..15"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..360"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/random_lightning/zap"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#temp"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/impact_point_loop
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/0"), Control.when("score", "@s", "mcm.lifetime", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/1"), Control.when("score", "@s", "mcm.lifetime", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/particle_ring_end_rod2"), Control.when("score", "@s", "mcm.lifetime", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/impact_lightning"), Control.when("score", "@s", "mcm.lifetime", "matches", "4..10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/2"), Control.when("score", "@s", "mcm.lifetime", "matches", "20..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/lightning_up
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "4..7"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.max_zap_changes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.lightning_vfx.max_secondary_zap_changes", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "-90..-50"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..360"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/random_lightning/zap"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#temp"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/particle_ring_dragon_breath
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~2.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~7.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~12.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~17.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~22.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~27.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~32.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~37.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~42.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~47.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~52.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~57.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~62.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~67.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~72.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~77.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~82.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~87.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~92.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~97.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~102.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~107.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~112.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~117.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~122.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~127.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~132.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~137.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~142.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~147.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~152.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~157.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~162.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~167.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~172.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~177.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~182.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~187.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~192.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~197.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~202.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~207.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~212.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~217.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~222.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~227.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~232.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~237.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~242.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~247.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~252.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~257.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~262.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~267.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~272.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~277.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~282.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~287.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~292.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~297.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~302.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~307.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~312.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~317.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~322.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~327.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~332.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~337.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~342.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~347.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~352.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000008", "0", "force"), Control.rotated("~357.5", "0"), Control.positioned("~", "~0.5", "~")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/particle_ring_end_rod
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~0", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~10", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~15", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~20", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~25", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~30", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~35", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~40", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~45", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~50", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~55", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~60", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~65", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~70", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~75", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~80", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~85", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~90", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~95", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~100", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~105", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~110", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~115", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~120", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~125", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~130", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~135", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~140", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~145", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~150", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~155", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~160", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~165", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~170", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~175", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~180", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~185", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~190", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~195", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~200", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~205", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~210", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~215", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~220", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~225", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~230", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~235", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~240", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~245", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~250", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~255", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~260", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~265", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~270", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~275", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~280", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~285", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~290", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~295", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~300", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~305", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~310", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~315", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~320", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~325", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~330", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~335", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~340", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~345", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~350", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^", "^-10000000", "0.00000010", "0", "force"), Control.rotated("~355", "0"), Control.positioned("~", "~0.5", "~")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/particle_ring_end_rod2
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~2.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~7.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~12.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~17.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~22.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~27.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~32.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~37.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~42.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~47.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~52.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~57.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~62.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~67.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~72.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~77.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~82.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~87.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~92.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~97.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~102.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~107.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~112.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~117.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~122.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~127.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~132.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~137.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~142.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~147.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~152.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~157.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~162.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~167.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~172.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~177.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~182.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~187.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~192.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~197.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~202.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~207.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~212.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~217.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~222.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~227.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~232.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~237.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~242.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~247.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~252.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~257.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~262.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~267.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~272.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~277.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~282.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~287.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~292.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~297.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~302.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~307.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~312.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~317.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~322.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~327.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~332.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~337.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~342.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~347.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~352.5", "0"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "^", "^", "^-10000000", "0.00000013", "0", "force"), Control.rotated("~357.5", "0"), Control.positioned("~", "~0.5", "~")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/shockwave_travel_loop
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Native.tp(c, "@s", "^", "^", "^1", "~8", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/3"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/9"), Control.when("score", "@s", "mcm.lifetime", "matches", "20..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/summon
    private static int f14(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.impact_marker\",\"mcm.tail_slam_shockwave.component\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[0.0f]}"), Control.rotated("~0", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[10.0f]}"), Control.rotated("~10", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[20.0f]}"), Control.rotated("~20", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[30.0f]}"), Control.rotated("~30", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[40.0f]}"), Control.rotated("~40", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[50.0f]}"), Control.rotated("~50", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[60.0f]}"), Control.rotated("~60", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[70.0f]}"), Control.rotated("~70", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[80.0f]}"), Control.rotated("~80", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[90.0f]}"), Control.rotated("~90", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[100.0f]}"), Control.rotated("~100", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[110.0f]}"), Control.rotated("~110", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[120.0f]}"), Control.rotated("~120", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[130.0f]}"), Control.rotated("~130", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[140.0f]}"), Control.rotated("~140", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[150.0f]}"), Control.rotated("~150", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[160.0f]}"), Control.rotated("~160", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[170.0f]}"), Control.rotated("~170", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[180.0f]}"), Control.rotated("~180", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[190.0f]}"), Control.rotated("~190", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[200.0f]}"), Control.rotated("~200", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[210.0f]}"), Control.rotated("~210", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[220.0f]}"), Control.rotated("~220", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[230.0f]}"), Control.rotated("~230", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[240.0f]}"), Control.rotated("~240", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[250.0f]}"), Control.rotated("~250", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[260.0f]}"), Control.rotated("~260", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[270.0f]}"), Control.rotated("~270", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[280.0f]}"), Control.rotated("~280", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[290.0f]}"), Control.rotated("~290", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[300.0f]}"), Control.rotated("~300", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[310.0f]}"), Control.rotated("~310", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[320.0f]}"), Control.rotated("~320", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[330.0f]}"), Control.rotated("~330", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[340.0f]}"), Control.rotated("~340", "0"), Control.positioned("^-0.2", "^", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.tail_slam_shockwave.travel_marker\",\"mcm.tail_slam_shockwave.component\"],Rotation:[350.0f]}"), Control.rotated("~350", "0"), Control.positioned("^-0.2", "^", "^")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/summon_crystal_spike
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..2"), Control.store("result", "score", "#temp", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "block_display", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.tail_slam_shockwave.crystal_spike\",\"mcm.tail_slam_shockwave.component\",\"mcm.tail_slam_shockwave.crystal_spike_small\"],block_state:{Name:\"minecraft:small_amethyst_bud\"},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-0.0f,-0.2f,-0.0f],scale:[0.0f,0.0f,0.0f]},brightness:{block:15,sky:15}}"), Control.when("score", "#temp", "mcm.temp", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "block_display", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.tail_slam_shockwave.crystal_spike\",\"mcm.tail_slam_shockwave.component\",\"mcm.tail_slam_shockwave.crystal_spike_medium\"],block_state:{Name:\"minecraft:medium_amethyst_bud\"},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-0.0f,-0.2f,-0.0f],scale:[0.0f,0.0f,0.0f]},brightness:{block:15,sky:15}}"), Control.when("score", "#temp", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "block_display", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.tail_slam_shockwave.crystal_spike\",\"mcm.tail_slam_shockwave.component\",\"mcm.tail_slam_shockwave.crystal_spike_large\"],block_state:{Name:\"minecraft:large_amethyst_bud\"},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-0.0f,-0.2f,-0.0f],scale:[0.0f,0.0f,0.0f]},brightness:{block:15,sky:15}}"), Control.when("score", "#temp", "mcm.temp", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/0
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_l/summon"), Control.positioned("~", "~0.1", "~")));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~1", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_i\",\"mcm.vfx.impact_f_to_j\",\"mcm.vfx\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,0f],scale:[10f,10f,10f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":211}}}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/1
    private static int f17(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/impact_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/impact_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/impact_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/particle_ring_end_rod"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/particle_ring_dragon_breath"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~0.5", "~", "1", "1", "1", "0.2", "100", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~0.5", "~", "0", "0", "0", "0.5", "50", "force"));
        Logic.step(() -> Native.particle(c, "flash", "~", "~0.5", "~", "0", "0", "0", "0.1", "1", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/10
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:4,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-0.5f,0f,-0.5f],scale:[1f,1f,1f]}}"), Control.when("entity", "@s[tag=mcm.tail_slam_shockwave.crystal_spike_small]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:4,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-0.6f,0f,-0.6f],scale:[1.2f,1.3f,1.2f]}}"), Control.when("entity", "@s[tag=mcm.tail_slam_shockwave.crystal_spike_medium]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:4,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-0.8f,0f,-0.8f],scale:[1.6f,2f,1.6f]}}"), Control.when("entity", "@s[tag=mcm.tail_slam_shockwave.crystal_spike_large]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.lifetime", "3"), Control.when("predicate", "mcm:random/75_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.lifetime", "1"), Control.when("predicate", "mcm:random/50_percent")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/2
    private static int f19(Frame c) {
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/3
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/summon_crystal_spike"), Control.when("predicate", "mcm:random/33_percent"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5"), Control.unless("block", "~", "~-1", "~", "#mcm:passable"), Control.when("block", "~", "~", "~", "#mcm:passable"), Control.unless("entity", "@e[type=block_display,tag=mcm.tail_slam_shockwave.crystal_spike,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/4"), Control.positioned("^", "^", "^-1"), Control.as("@a[distance=..2,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/4
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/5"), Control.unless("score", "@s", "mcm.launch.timer", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/5
    private static int f22(Frame c) {
        Logic.step(() -> Native.particle(c, "flash", "~", "~1", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_launch"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/6"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/7"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/8"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/6
    private static int f23(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/launch/apply_1"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "1", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "2", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "2..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "4..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "4", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        return 1;
    }
}
