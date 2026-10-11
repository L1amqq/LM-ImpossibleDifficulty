package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled170 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/impact_o/init", Compiled170::f0);
        Logic.register("impossible_to_survive:effects/impact_o/loop", Compiled170::f1);
        Logic.register("impossible_to_survive:effects/impact_o/summon", Compiled170::f2);
        Logic.register("impossible_to_survive:effects/impact_o/zzz/0", Compiled170::f3);
        Logic.register("impossible_to_survive:effects/impact_o/zzz/1", Compiled170::f4);
        Logic.register("impossible_to_survive:effects/impact_o/zzz/2", Compiled170::f5);
        Logic.register("impossible_to_survive:effects/impact_o/zzz/3", Compiled170::f6);
        Logic.register("impossible_to_survive:effects/impact_o/zzz/4", Compiled170::f7);
        Logic.register("impossible_to_survive:effects/impact_o/zzz/5", Compiled170::f8);
        Logic.register("impossible_to_survive:effects/impact_p/init", Compiled170::f9);
        Logic.register("impossible_to_survive:effects/impact_p/loop", Compiled170::f10);
        Logic.register("impossible_to_survive:effects/impact_p/summon", Compiled170::f11);
        Logic.register("impossible_to_survive:effects/impact_p/zzz/0", Compiled170::f12);
        Logic.register("impossible_to_survive:effects/impact_p/zzz/1", Compiled170::f13);
        Logic.register("impossible_to_survive:effects/impact_p/zzz/2", Compiled170::f14);
        Logic.register("impossible_to_survive:effects/impact_p/zzz/3", Compiled170::f15);
        Logic.register("impossible_to_survive:effects/impact_p/zzz/4", Compiled170::f16);
        Logic.register("impossible_to_survive:effects/impact_p/zzz/5", Compiled170::f17);
        Logic.register("impossible_to_survive:effects/init", Compiled170::f18);
        Logic.register("impossible_to_survive:effects/inwards_sphere_particles", Compiled170::f19);
        Logic.register("impossible_to_survive:effects/launch/apply_1", Compiled170::f20);
        Logic.register("impossible_to_survive:effects/launch/apply_2", Compiled170::f21);
        Logic.register("impossible_to_survive:effects/launch/apply_3", Compiled170::f22);
        Logic.register("impossible_to_survive:effects/launch/apply_jumppad_1", Compiled170::f23);
    }
    // impossible_to_survive:effects/impact_o/init
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_o/loop
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_o/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_o/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "5..8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_o/summon
    private static int f2(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_o\",\"mcm.vfx\",\"mcm.vfx.impact_k_to_p\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,1f],scale:[20f,20f,20f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":411}}}"));
        return 1;
    }
    // impossible_to_survive:effects/impact_o/zzz/0
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_o/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_o/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_o/zzz/1
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "412"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "413"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_o/zzz/2
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "414"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "415"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_o/zzz/3
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_o/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_o/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "7..8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_o/zzz/4
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "416"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "417"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_o/zzz/5
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "418"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_p/init
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.random", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_p/loop
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_p/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_p/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "5..9")));
        return 1;
    }
    // impossible_to_survive:effects/impact_p/summon
    private static int f11(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_p\",\"mcm.vfx\",\"mcm.vfx.impact_k_to_p\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,1f],scale:[15f,15f,15f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":421}}}"));
        return 1;
    }
    // impossible_to_survive:effects/impact_p/zzz/0
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_p/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_p/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_p/zzz/1
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "422"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "423"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_p/zzz/2
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "424"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "425"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_p/zzz/3
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_p/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_p/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "7..9")));
        return 1;
    }
    // impossible_to_survive:effects/impact_p/zzz/4
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "426"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "427"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_p/zzz/5
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "428"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "429"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        return 1;
    }
    // impossible_to_survive:effects/init
    private static int f18(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/launch/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/screen_shake/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/lightning_projectile/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/random_lightning/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/screen_shake/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/electric_shield/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/magic_circle_a/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/magic_circle_b/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_a/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_b/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_c/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_d/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_e/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_e_shoot/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_f/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_g/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_h/init"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_i/init"));
        return 1;
    }
    // impossible_to_survive:effects/inwards_sphere_particles
    private static int f19(Frame c) {

        return 1;
    }
    // impossible_to_survive:effects/launch/apply_1
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.launch.timer", "4"));
        Logic.step(() -> Native.effect(c, "give", "@s", "minecraft:levitation", "1", "35", "true"));
        return 1;
    }
    // impossible_to_survive:effects/launch/apply_2
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.launch.timer", "4"));
        Logic.step(() -> Native.effect(c, "give", "@s", "minecraft:levitation", "1", "50", "true"));
        return 1;
    }
    // impossible_to_survive:effects/launch/apply_3
    private static int f22(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.launch.timer", "5"));
        Logic.step(() -> Native.effect(c, "give", "@s", "minecraft:levitation", "1", "60", "true"));
        return 1;
    }
    // impossible_to_survive:effects/launch/apply_jumppad_1
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.launch.timer", "5"));
        Logic.step(() -> Native.effect(c, "give", "@s", "minecraft:levitation", "1", "70", "true"));
        return 1;
    }
}
