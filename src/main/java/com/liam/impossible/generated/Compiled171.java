package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled171 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/launch/apply_jumppad_2", Compiled171::f0);
        Logic.register("impossible_to_survive:effects/launch/apply_jumppad_3", Compiled171::f1);
        Logic.register("impossible_to_survive:effects/launch/apply_jumppad_4", Compiled171::f2);
        Logic.register("impossible_to_survive:effects/launch/init", Compiled171::f3);
        Logic.register("impossible_to_survive:effects/launch/player_loop", Compiled171::f4);
        Logic.register("impossible_to_survive:effects/launch/zzz/0", Compiled171::f5);
        Logic.register("impossible_to_survive:effects/lightning_projectile/colission_event", Compiled171::f6);
        Logic.register("impossible_to_survive:effects/lightning_projectile/init", Compiled171::f7);
        Logic.register("impossible_to_survive:effects/lightning_projectile/loop", Compiled171::f8);
        Logic.register("impossible_to_survive:effects/lightning_projectile/summon", Compiled171::f9);
        Logic.register("impossible_to_survive:effects/lightning_projectile/summon_secondary_zap", Compiled171::f10);
        Logic.register("impossible_to_survive:effects/lightning_projectile/target_lost_event", Compiled171::f11);
        Logic.register("impossible_to_survive:effects/lightning_projectile/target_reached_event", Compiled171::f12);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zap_forward_main", Compiled171::f13);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zap_forward_secondary", Compiled171::f14);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/0", Compiled171::f15);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/1", Compiled171::f16);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/10", Compiled171::f17);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/11", Compiled171::f18);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/12", Compiled171::f19);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/13", Compiled171::f20);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/14", Compiled171::f21);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/15", Compiled171::f22);
        Logic.register("impossible_to_survive:effects/lightning_projectile/zzz/16", Compiled171::f23);
    }
    // impossible_to_survive:effects/launch/apply_jumppad_2
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.launch.timer", "6"));
        Logic.step(() -> Native.effect(c, "give", "@s", "minecraft:levitation", "1", "72", "true"));
        return 1;
    }
    // impossible_to_survive:effects/launch/apply_jumppad_3
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.launch.timer", "7"));
        Logic.step(() -> Native.effect(c, "give", "@s", "minecraft:levitation", "1", "69", "true"));
        return 1;
    }
    // impossible_to_survive:effects/launch/apply_jumppad_4
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.launch.timer", "7"));
        Logic.step(() -> Native.effect(c, "give", "@s", "minecraft:levitation", "1", "80", "true"));
        return 1;
    }
    // impossible_to_survive:effects/launch/init
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.launch.timer", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/launch/player_loop
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/launch/zzz/0"), Control.when("score", "@s", "mcm.launch.timer", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:effects/launch/zzz/0
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.launch.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "clear", "@s", "levitation"), Control.when("score", "@s", "mcm.launch.timer", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/colission_event
    private static int f6(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_zap_changes", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/14"), Control.as("@e[tag=mcm.lightning_vfx.this_target]")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/init
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.zap_counter", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.colission_enabled", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.zap_init_dir_x", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.zap_init_dir_y", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.travel_iterations", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.travel_speed", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.target_id", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.zap_dir", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.spread", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.zap_step_distance", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.max_secondary_zap_changes", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.max_zap_changes", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.targeting_behaviour", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.homing_strength", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lightning_vfx.override_homing_duration", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lifetime", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.misc", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.temp", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.random", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/loop
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.travel_iterations", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/17"), Control.when("entity", "@s[tag=mcm.lightning_vfx.main_zap]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zap_forward_secondary"), Control.when("entity", "@s[tag=mcm.lightning_vfx.secondary_zap]")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/summon
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@e[type=armor_stand,tag=targeted_lightning_target,sort=random,limit=1,distance=1..]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/0"), Control.as("@e[type=armor_stand,tag=targeted_lightning_target,sort=random,limit=1,distance=1..]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@e[type=armor_stand,tag=targeted_lightning_target]")));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.lightning_vfx\",\"mcm.lightning_vfx.main_zap\",\"mcm.lightning_vfx.projectile\",\"mcm.init\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/2"), Control.as("@e[type=marker,tag=mcm.lightning_vfx.projectile,tag=mcm.init,limit=1,sort=nearest]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/summon_secondary_zap
    private static int f10(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.lightning_vfx\",\"mcm.lightning_vfx.secondary_zap\",\"mcm.lightning_vfx.projectile\",\"mcm.init\"]}"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#temp", "mcm.lightning_vfx.zap_dir", "=", "@s", "mcm.lightning_vfx.zap_dir"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#temp", "mcm.lightning_vfx.max_secondary_zap_changes", "=", "@s", "mcm.lightning_vfx.max_secondary_zap_changes"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#temp", "mcm.lightning_vfx.travel_speed", "=", "@s", "mcm.lightning_vfx.travel_speed"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/51"), Control.as("@e[type=marker,tag=mcm.lightning_vfx.secondary_zap,tag=mcm.init,limit=1,sort=nearest]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/target_lost_event
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_zap_changes", "0"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/target_reached_event
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lightning_vfx.max_zap_changes", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#stage_transition", "mcm.temp", "1"), Control.when("entity", "@s[tag=mcm.lightning_vfx.projectile.stage_transition]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/3"), Control.as("@e[tag=mcm.lightning_vfx.this_target,distance=..3.0]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#stage_transition"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zap_forward_main
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lightning_vfx.zap_counter", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lightning_vfx.travel_iterations", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.lightning_vfx.max_zap_changes", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.lightning_vfx.override_homing_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/20"), Control.when("score", "@s", "mcm.lightning_vfx.max_zap_changes", "matches", "1.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/42"), Control.when("score", "@s", "mcm.lightning_vfx.max_zap_changes", "matches", "..0")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zap_forward_secondary
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lightning_vfx.travel_iterations", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.lightning_vfx.max_zap_changes", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/44"), Control.when("score", "@s", "mcm.lightning_vfx.max_zap_changes", "matches", "1.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.lightning_vfx.max_zap_changes", "matches", "..0")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/0
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/1"), Control.unless("score", "@s", "mcm.lightning_vfx.target_id", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/1
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#last_id", "mcm.lightning_vfx.target_id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#last_id", "mcm.lightning_vfx.target_id"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/10
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "17", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "18", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "2..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "19", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "4..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "20", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/11
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "2", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "4", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/12
    private static int f19(Frame c) {
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:amethyst_shard\"}", "~", "~0.5", "~", "0.3", "0.3", "0.3", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:amethyst_block\"}", "~", "~0.5", "~", "0.3", "0.3", "0.3", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "flash", "~", "~0.6", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "~", "~0.5", "~", "0.3", "0.3", "0.3", "0.2", "10", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~0.5", "~", "0", "0", "0", "0.5", "15", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~0.5", "~", "0", "0", "0", "0.2", "12", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~0.6", "~", "0", "0", "0", "0.5", "5", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~0.6", "~", "0", "0", "0", "0.2", "5", "force"));
        Logic.step(() -> Native.particle(c, "witch", "~", "~0.6", "~", "0", "0", "0", "0.2", "10", "force"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/crystal_tail_break"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/13"), Control.positioned("~", "~0.6", "~")));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:amethyst_shard\"}", "~", "~0.5", "~", "0.3", "0.3", "0.3", "0.1", "30", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:amethyst_block\"}", "~", "~0.5", "~", "0.3", "0.3", "0.3", "0.1", "10", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.crystal_tail.destroyed"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:2,transformation:{translation:[0.0f,0.075f,-0.02f],scale:[0.0f,0.0f,0.0f]}}"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/13
    private static int f20(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_b/summon"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/crystal_tail/destroy_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/crystal_tail/destroy_lightning"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/14
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.at("@s"), Control.as("@e[tag=mcm.lightning_vfx.main_zap,tag=mcm.lightning_vfx.projectile,tag=!mcm.lightning_vfx.self_bolt]"), Control.when("score", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/15"), Control.when("score", "#temp", "mcm.temp", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/lightning_projectile/zzz/16"), Control.when("entity", "@s[tag=targeted_lightning_target]")));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/15
    private static int f22(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:effects/lightning_projectile/zzz/16
    private static int f23(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "1", "1", "1", "0.1", "20", "force"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "flash", "^", "^", "^-1", "0", "0", "0", "0.1", "1", "force"), Control.when("score", "#global", "disabled_flashbang", "matches", "1")));
        return 1;
    }
}
