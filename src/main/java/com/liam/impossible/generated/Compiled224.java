package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled224 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_roar", Compiled224::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_stun", Compiled224::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/crystal_tail_break", Compiled224::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/death", Compiled224::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/death_land", Compiled224::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/destroy_crystal_tail", Compiled224::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/display_hint", Compiled224::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/end_crystal_destroy", Compiled224::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/end_crystal_reactivate", Compiled224::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/end_crystal_reactivate_quiet", Compiled224::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/healing", Compiled224::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/healing_arrive", Compiled224::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/healing_long", Compiled224::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/healing_short", Compiled224::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/hit_body", Compiled224::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/hit_crystal_tail", Compiled224::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/hit_head", Compiled224::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/hurt_growl", Compiled224::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/lightning_hit", Compiled224::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/stage_transition", Compiled224::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/unstun", Compiled224::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/wake_up", Compiled224::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/wing_flap", Compiled224::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/wing_flap_close", Compiled224::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_roar
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..4"), Control.store("result", "score", "#sfx", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_tail_slam_roar", "master", "@a", "~", "~", "~", "10", "1.05"), Control.when("score", "#sfx", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_tail_slam_roar", "master", "@a", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_tail_slam_roar", "master", "@a", "~", "~", "~", "10", "0.95"), Control.when("score", "#sfx", "mcm.temp", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_tail_slam_roar", "master", "@a", "~", "~", "~", "10", "0.9"), Control.when("score", "#sfx", "mcm.temp", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_stun
    private static int f1(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_tail_slam_stun", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/crystal_tail_break
    private static int f2(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.crystal_tail_break", "master", "@a", "~", "~", "~", "1", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.amethyst_block.break", "master", "@a", "~", "~", "~", "1", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/death
    private static int f3(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.death", "master", "@a", "~", "~", "~", "15", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/death_land
    private static int f4(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.death_land", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/destroy_crystal_tail
    private static int f5(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.generic.hurt", "master", "@a", "~", "~", "~", "10", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.destroy_crystal_tail", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/display_hint
    private static int f6(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.experience_orb.pickup", "master", "@s", "~", "~", "~", "0.35", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.hint", "master", "@s", "~", "~", "~", "0.2", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/end_crystal_destroy
    private static int f7(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.end_crystal_destroy", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/end_crystal_reactivate
    private static int f8(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.end_crystal_reactivate", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/end_crystal_reactivate_quiet
    private static int f9(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.end_crystal_reactivate_quiet", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/healing
    private static int f10(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.healing", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/healing_arrive
    private static int f11(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.healing_arrive", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/healing_long
    private static int f12(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.healing_long", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/healing_short
    private static int f13(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.healing_short", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/hit_body
    private static int f14(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.ender_dragon.hurt", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/hit_crystal_tail
    private static int f15(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.generic.hurt", "master", "@a", "~", "~", "~", "10", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.hit_crystal_tail", "master", "@a", "~", "~", "~", "10", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.amethyst_block.break", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/hit_head
    private static int f16(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.generic.hurt", "master", "@a", "~", "~", "~", "10", "1.0"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..4"), Control.store("result", "score", "#sfx", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.hit_head_1", "master", "@a", "~", "~", "~", "10", "0.9"), Control.when("score", "#sfx", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.hit_head_1", "master", "@a", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.hit_head_2", "master", "@a", "~", "~", "~", "10", "0.9"), Control.when("score", "#sfx", "mcm.temp", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.hit_head_2", "master", "@a", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/hurt_growl
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("predicate", "mcm:random/75_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..4"), Control.store("result", "score", "#sfx", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.hurt_growl_1", "master", "@a", "~", "~", "~", "10", "0.95"), Control.when("score", "#sfx", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.hurt_growl_2", "master", "@a", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.hurt_growl_3", "master", "@a", "~", "~", "~", "10", "0.95"), Control.when("score", "#sfx", "mcm.temp", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.hurt_growl_4", "master", "@a", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/lightning_hit
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..6"), Control.store("result", "score", "#sfx", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/zzz/0"), Control.when("score", "#sfx", "mcm.temp", "matches", "1..3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/zzz/1"), Control.when("score", "#sfx", "mcm.temp", "matches", "4..6")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/stage_transition
    private static int f19(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.stage_transition", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/unstun
    private static int f20(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.unstun", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/wake_up
    private static int f21(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.wake_up", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/wing_flap
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/wing_flap_close"), Control.as("@a[distance=..20]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/wing_flap_far"), Control.as("@a[distance=20.01..45]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/wing_flap_close
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..6"), Control.store("result", "score", "#sfx", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/zzz/2"), Control.when("score", "#sfx", "mcm.temp", "matches", "1..3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/zzz/3"), Control.when("score", "#sfx", "mcm.temp", "matches", "4..6")));
        return 1;
    }
}
