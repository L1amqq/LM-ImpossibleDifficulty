package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled223 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/settings/set_player_count", Compiled223::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_dash", Compiled223::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_dash_bite", Compiled223::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_dash_growl", Compiled223::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_fireball", Compiled223::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_fireball_impact", Compiled223::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_fireball_indicator", Compiled223::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_fireball_roar", Compiled223::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield", Compiled223::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield_bite", Compiled223::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield_end", Compiled223::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield_hit", Compiled223::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield_land", Compiled223::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_laser", Compiled223::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_laser_growl", Compiled223::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_laser_wind_up", Compiled223::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_laser_wisp_break", Compiled223::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_lightning", Compiled223::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_lightning_growl", Compiled223::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam", Compiled223::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_growl", Compiled223::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_impact", Compiled223::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_indicator", Compiled223::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_launch", Compiled223::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/settings/set_player_count
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#player_count", "mcm.its.dragon.settings", "0"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> 1, Control.when("entity", "@a[predicate=mcm:gm/vulnerable,distance=..300]")), Control.store("result", "score", "#player_count", "mcm.its.dragon.settings")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_dash
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..4"), Control.store("result", "score", "#sfx", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_dash", "master", "@a", "~", "~", "~", "10", "1.05"), Control.when("score", "#sfx", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_dash", "master", "@a", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_dash", "master", "@a", "~", "~", "~", "10", "0.95"), Control.when("score", "#sfx", "mcm.temp", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_dash", "master", "@a", "~", "~", "~", "10", "0.9"), Control.when("score", "#sfx", "mcm.temp", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_dash_bite
    private static int f2(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_dash_bite", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_dash_growl
    private static int f3(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_dash_growl", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_fireball
    private static int f4(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_fireball", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_fireball_impact
    private static int f5(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_fireball_impact", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_fireball_indicator
    private static int f6(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_fireball_indicator", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_fireball_roar
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..4"), Control.store("result", "score", "#sfx", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_fireball_roar", "master", "@a", "~", "~", "~", "10", "0.9"), Control.when("score", "#sfx", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_fireball_roar", "master", "@a", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_fireball_roar", "master", "@a", "~", "~", "~", "10", "1.1"), Control.when("score", "#sfx", "mcm.temp", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield
    private static int f8(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_forcefield", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield_bite
    private static int f9(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_forcefield_bite", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield_end
    private static int f10(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_forcefield_end", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield_hit
    private static int f11(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_forcefield_hit", "master", "@a", "~", "~", "~", "1.5", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield_land
    private static int f12(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_forcefield_land", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_laser
    private static int f13(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_laser", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_laser_growl
    private static int f14(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_laser_growl", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_laser_wind_up
    private static int f15(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_laser_wind_up", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_laser_wisp_break
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..4"), Control.store("result", "score", "#sfx", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_laser_wisp_break", "master", "@a", "~", "~", "~", "0.8", "1.05"), Control.when("score", "#sfx", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_laser_wisp_break", "master", "@a", "~", "~", "~", "0.8", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_laser_wisp_break", "master", "@a", "~", "~", "~", "0.8", "0.95"), Control.when("score", "#sfx", "mcm.temp", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_laser_wisp_break", "master", "@a", "~", "~", "~", "0.8", "0.9"), Control.when("score", "#sfx", "mcm.temp", "matches", "4")));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.ender_eye.death", "master", "@a", "~", "~", "~", "0.8", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_lightning
    private static int f17(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_lightning", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_lightning_growl
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("predicate", "mcm:random/50_percent")));
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_lightning_growl", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam
    private static int f19(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_tail_slam", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_growl
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..4"), Control.store("result", "score", "#sfx", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_tail_slam_growl", "master", "@a", "~", "~", "~", "10", "1.05"), Control.when("score", "#sfx", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_tail_slam_growl", "master", "@a", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_tail_slam_growl", "master", "@a", "~", "~", "~", "10", "0.95"), Control.when("score", "#sfx", "mcm.temp", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.attack_tail_slam_growl", "master", "@a", "~", "~", "~", "10", "0.9"), Control.when("score", "#sfx", "mcm.temp", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_impact
    private static int f21(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_tail_slam_impact", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_indicator
    private static int f22(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:dragon.attack_tail_slam_indicator", "master", "@a", "~", "~", "~", "10", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.amethyst_cluster.hit", "master", "@a", "~", "~", "~", "10", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_launch
    private static int f23(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:block.amethyst_cluster.hit", "master", "@a", "~", "~", "~", "2", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.illusioner.cast_spell", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
}
