package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled216 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/7", Compiled216::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/8", Compiled216::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/9", Compiled216::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/zzz/0", Compiled216::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/zzz/1", Compiled216::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tutorial/sleeping_z_loop", Compiled216::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tutorial/zzz/0", Compiled216::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tutorial/zzz/1", Compiled216::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/tutorial/zzz/2", Compiled216::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/zzz/0", Compiled216::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/zzz/1", Compiled216::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/zzz/10", Compiled216::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/zzz/11", Compiled216::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/zzz/12", Compiled216::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/zzz/2", Compiled216::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/zzz/3", Compiled216::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/zzz/4", Compiled216::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/zzz/5", Compiled216::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/zzz/6", Compiled216::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/zzz/7", Compiled216::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/zzz/8", Compiled216::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/zzz/9", Compiled216::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/do_dash_attack", Compiled216::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/activity/do_death_flying", Compiled216::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/7
    private static int f0(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/launch/apply_2"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "4", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "2..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "4..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "6", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/8
    private static int f1(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/launch/apply_3"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "6", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "2..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "7", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "4..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/zzz/9
    private static int f2(Frame c) {
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/zzz/0
    private static int f3(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/stun_activate/tween", "{to_frame:27,duration:3}"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/stunned/apply"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/apply"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/1_head/apply"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "1")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_tail_disabled"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "12"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.stun_landed"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.stun_pose_set"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/zzz/1
    private static int f4(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.crystal_tail.unbreakable"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.crystal_tail.destroyed"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_l/summon"), Control.positioned("~", "~0.1", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_k/summon"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~0.5", "~", "0", "0", "0", "0.8", "20", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~0.5", "~", "0", "0", "0", "0.5", "20", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~0.5", "~", "0", "0", "0", "0.3", "10", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~0.5", "~", "0", "0", "0", "0.5", "10", "force"));
        Logic.step(() -> Native.particle(c, "witch", "~", "~0.5", "~", "0.2", "0.2", "0.2", "0.5", "20", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/apply_ground_slam_stun"), Control.as("@a[distance=..15]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tutorial/sleeping_z_loop
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tutorial/zzz/0"), Control.when("entity", "@s[tag=mcm.its.dragon.tutorial.z_particle.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tutorial/zzz/1"), Control.when("entity", "@s[tag=mcm.its.dragon.tutorial.z_particle.2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tutorial/zzz/2"), Control.when("entity", "@s[tag=mcm.its.dragon.tutorial.z_particle.3]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tutorial/zzz/0
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:2,start_interpolation:0,transformation:{scale:[0.6f,0.6f,0.6f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:26,start_interpolation:0,transformation:{translation:[0.25f,0f,0f],right_rotation:[0.0f,0f,-0.199f,0.980f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.2", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "1..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.15", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "4..6")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.1", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "7..10")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.05", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "11..14")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.025", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "15..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:20,start_interpolation:0,transformation:{scale:[0.0f,0.0f,0.0f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.lifetime", "matches", "30..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tutorial/zzz/1
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:2,start_interpolation:0,transformation:{scale:[0.6f,0.6f,0.6f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:26,start_interpolation:0,transformation:{translation:[0.15f,0f,0f],right_rotation:[0.0f,0f,0.199f,0.980f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.18", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "1..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.13", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "4..6")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.08", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "7..10")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.03", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "11..14")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.02", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "15..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:22,start_interpolation:0,transformation:{scale:[0.0f,0.0f,0.0f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.lifetime", "matches", "30..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/tutorial/zzz/2
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:2,start_interpolation:0,transformation:{scale:[0.6f,0.6f,0.6f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:26,start_interpolation:0,transformation:{translation:[-0.1f,0f,0f],right_rotation:[0.0f,0f,0.199f,0.980f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.22", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "1..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.18", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "4..6")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.1", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "7..10")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.04", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "11..14")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.02", "~"), Control.when("score", "@s", "mcm.lifetime", "matches", "15..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:18,start_interpolation:0,transformation:{scale:[0.0f,0.0f,0.0f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.lifetime", "matches", "30..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/zzz/0
    private static int f9(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.attack_priority.ground_player_nearby"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.tail_slam", "10"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/zzz/1
    private static int f10(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.attack_priority.no_player_nearby"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.lightning", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.forcefield", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.fireball", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.laser", "5"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/zzz/10
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/zzz/11"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "500..799")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/zzz/12"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "800..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/zzz/11
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.6"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "500..599")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.7"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "600..699")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.8"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "700..799")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/zzz/12
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.9"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "800..899")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1.0"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "900..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/zzz/2
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.dash", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.fireball", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.lightning", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.tail_slam", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.decision.forcefield", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.decision.laser", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.dash", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.fireball", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.lightning", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.tail_slam", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.forcefield", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.laser", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "6")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.decision_range", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.fireball"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.fireball_range_max", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.dash_range_min", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.dash"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.dash_range_max", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.lightning_range_min", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.lightning"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.lightning_range_max", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.tail_slam_range_min", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.tail_slam"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.tail_slam_range_max", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.total_range", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/select_random_ability_macro_heads_3", "with", "storage", "mcm:temp", "decision"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/zzz/3
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.dash", "8"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.fireball", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.lightning", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.tail_slam", "14"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.forcefield", "16"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.decision.laser", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.dash", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.fireball", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.lightning", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.tail_slam", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.forcefield", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.laser", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "6")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.decision_range", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.fireball"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.fireball_range_max", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.dash_range_min", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.dash"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.dash_range_max", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.lightning_range_min", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.lightning"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.lightning_range_max", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.tail_slam_range_min", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.tail_slam"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.tail_slam_range_max", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.forcefield_range_min", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.forcefield"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.forcefield_range_max", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.total_range", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/select_random_ability_macro_heads_2", "with", "storage", "mcm:temp", "decision"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/zzz/4
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.dash", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.fireball", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.lightning", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.tail_slam", "20"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.forcefield", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision.laser", "23"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.dash", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.fireball", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.lightning", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.tail_slam", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.forcefield", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.decision.laser", "1"), Control.when("score", "@s", "mcm.its.dragon.last_attack", "matches", "6")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.decision_range", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.fireball"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.fireball_range_max", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.dash_range_min", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.dash"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.dash_range_max", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.lightning_range_min", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.lightning"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.lightning_range_max", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.tail_slam_range_min", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.tail_slam"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.tail_slam_range_max", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.forcefield_range_min", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.forcefield"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.forcefield_range_max", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.laser_range_min", "int", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.decision_range", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.decision_range", "+=", "@s", "mcm.its.dragon.decision.laser"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.laser_range_max", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.decision_range"), Control.store("result", "storage", "mcm:temp", "decision.total_range", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/select_random_ability_macro_heads_1", "with", "storage", "mcm:temp", "decision"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/zzz/5
    private static int f17(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.attack_priority.ground_player_nearby"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.decision.tail_slam", "10"), Control.when("score", "@s", "mcm.its.dragon.decision.tail_slam", "matches", "11..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/zzz/6
    private static int f18(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.attack_priority.no_player_nearby"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.decision.lightning", "5"), Control.when("score", "@s", "mcm.its.dragon.decision.lightning", "matches", "6..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.decision.forcefield", "5"), Control.when("score", "@s", "mcm.its.dragon.decision.forcefield", "matches", "6..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.decision.fireball", "5"), Control.when("score", "@s", "mcm.its.dragon.decision.fireball", "matches", "6..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.decision.laser", "5"), Control.when("score", "@s", "mcm.its.dragon.decision.laser", "matches", "6..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/zzz/7
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/zzz/8"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1..299")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/zzz/9"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "300..499")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/zzz/8
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.1"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1..99")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.2"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "100..199")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.3"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "200..299")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/zzz/9
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.4"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "300..399")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.5"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "400..499")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/do_dash_attack
    private static int f22(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.last_attack", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.decision.dash", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "14"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.player_dash_hit_cd", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.dash_count", "1"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.first_dash_attack"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.dash_count", "1"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.dash_count", "1"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.dash_count", "1"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "3..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.dash_count", "1"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "5..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.dash_count", "1"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "7..")));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/dash/tween", "{to_frame:0,duration:5}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/activity/do_death_flying
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.safety_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "15"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_fly"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.inner,sort=random,limit=1,distance=30..]", "add", "mcm.its.dragon_environment.waypoint.active"));
        return 1;
    }
}
