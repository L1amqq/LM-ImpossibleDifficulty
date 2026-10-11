package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled162 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/3", Compiled162::f0);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/4", Compiled162::f1);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/5", Compiled162::f2);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/6", Compiled162::f3);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/7", Compiled162::f4);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/8", Compiled162::f5);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/9", Compiled162::f6);
        Logic.register("impossible_to_survive:effects/flash_a/init", Compiled162::f7);
        Logic.register("impossible_to_survive:effects/flash_a/loop", Compiled162::f8);
        Logic.register("impossible_to_survive:effects/flash_a/summon", Compiled162::f9);
        Logic.register("impossible_to_survive:effects/flash_b/init", Compiled162::f10);
        Logic.register("impossible_to_survive:effects/flash_b/loop", Compiled162::f11);
        Logic.register("impossible_to_survive:effects/flash_b/summon", Compiled162::f12);
        Logic.register("impossible_to_survive:effects/flash_c/init", Compiled162::f13);
        Logic.register("impossible_to_survive:effects/flash_c/loop", Compiled162::f14);
        Logic.register("impossible_to_survive:effects/flash_c/summon", Compiled162::f15);
        Logic.register("impossible_to_survive:effects/flash_d/init", Compiled162::f16);
        Logic.register("impossible_to_survive:effects/flash_d/loop", Compiled162::f17);
        Logic.register("impossible_to_survive:effects/flash_d/summon", Compiled162::f18);
        Logic.register("impossible_to_survive:effects/flash_e/init", Compiled162::f19);
        Logic.register("impossible_to_survive:effects/flash_e/loop", Compiled162::f20);
        Logic.register("impossible_to_survive:effects/flash_e/summon", Compiled162::f21);
        Logic.register("impossible_to_survive:effects/flash_f/init", Compiled162::f22);
        Logic.register("impossible_to_survive:effects/flash_f/loop", Compiled162::f23);
    }
    // impossible_to_survive:effects/electric_shield/zzz/3
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "4"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "5"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/4
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "6"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "7"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "8"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/5
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/6"), Control.when("score", "@s", "mcm.animation", "matches", "8..11")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/9"), Control.when("score", "@s", "mcm.animation", "matches", "12..15")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/6
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/7"), Control.when("score", "@s", "mcm.animation", "matches", "8..9")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/8"), Control.when("score", "@s", "mcm.animation", "matches", "10..11")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/7
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "9"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "10"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/8
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "11"), Control.when("score", "@s", "mcm.animation", "matches", "10")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "12"), Control.when("score", "@s", "mcm.animation", "matches", "11")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/9
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/10"), Control.when("score", "@s", "mcm.animation", "matches", "12..13")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/11"), Control.when("score", "@s", "mcm.animation", "matches", "14..15")));
        return 1;
    }
    // impossible_to_survive:effects/flash_a/init
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/flash_a/loop
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:3,start_interpolation:0,transformation:{scale:[6f,6f,6f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:12,start_interpolation:0,transformation:{scale:[15f,15f,15f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:3,start_interpolation:0,transformation:{scale:[0f,0f,0f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "17")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "21")));
        return 1;
    }
    // impossible_to_survive:effects/flash_a/summon
    private static int f9(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:1,Tags:[\"mcm.vfx.flash\",\"mcm.vfx.flash_a\",\"mcm.vfx\",\"mcm.vfx.flash_a_to_d\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,-0.25f],scale:[0f,0f,0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":201}}}"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#root_x_rotation", "mcm.temp"), Control.store("result", "entity", "@n[type=item_display,tag=mcm.vfx.flash_a,distance=..0.1]", "Rotation[0]", "float", "1")));
        return 1;
    }
    // impossible_to_survive:effects/flash_b/init
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/flash_b/loop
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:2,start_interpolation:0,transformation:{scale:[15f,15f,15f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:4,start_interpolation:0,transformation:{scale:[3f,3f,3f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:12,start_interpolation:0,transformation:{scale:[0f,0f,0f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "11")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "25")));
        return 1;
    }
    // impossible_to_survive:effects/flash_b/summon
    private static int f12(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:3,Tags:[\"mcm.vfx.flash\",\"mcm.vfx.flash_b\",\"mcm.vfx\",\"mcm.vfx.flash_a_to_d\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,-0.25f],scale:[0f,0f,0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":201}}}"));
        return 1;
    }
    // impossible_to_survive:effects/flash_c/init
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/flash_c/loop
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:3,start_interpolation:0,transformation:{scale:[25f,25f,25f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:4,start_interpolation:0,transformation:{scale:[0f,0f,0f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        return 1;
    }
    // impossible_to_survive:effects/flash_c/summon
    private static int f15(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:3,Tags:[\"mcm.vfx.flash\",\"mcm.vfx.flash_c\",\"mcm.vfx\",\"mcm.vfx.flash_a_to_d\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,-0.5f],scale:[0f,0f,0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":201}}}"));
        return 1;
    }
    // impossible_to_survive:effects/flash_d/init
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/flash_d/loop
    private static int f17(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "@n[tag=aj.impossible_dragon.locator.tail_locator,distance=..3]"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:8,start_interpolation:0,transformation:{scale:[10f,10f,10f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:5,start_interpolation:0,transformation:{scale:[8f,8f,8f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:40,start_interpolation:0,transformation:{scale:[5f,5f,5f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "14")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:0,transformation:{scale:[0f,0f,0f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "50")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "61")));
        return 1;
    }
    // impossible_to_survive:effects/flash_d/summon
    private static int f18(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:2,Tags:[\"mcm.vfx.flash\",\"mcm.vfx.flash_d\",\"mcm.vfx\",\"mcm.vfx.flash_a_to_d\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,-0.5f],scale:[0f,0f,0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":201}}}"));
        return 1;
    }
    // impossible_to_survive:effects/flash_e/init
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/flash_e/loop
    private static int f20(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "@n[tag=aj.impossible_dragon.locator.tail_locator,distance=..5]"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:4,start_interpolation:0,transformation:{scale:[10f,10f,10f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:5,start_interpolation:0,transformation:{scale:[8f,8f,8f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "13")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:60,start_interpolation:0,transformation:{scale:[5f,5f,5f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "18")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:0,transformation:{scale:[0f,0f,0f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "75")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "86")));
        return 1;
    }
    // impossible_to_survive:effects/flash_e/summon
    private static int f21(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:2,Tags:[\"mcm.vfx.flash\",\"mcm.vfx.flash_e\",\"mcm.vfx\",\"mcm.vfx.flash_e_to_g\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,-0.5f],scale:[0f,0f,0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":201}}}"));
        return 1;
    }
    // impossible_to_survive:effects/flash_f/init
    private static int f22(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/flash_f/loop
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:3,start_interpolation:0,transformation:{scale:[45f,45f,45f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:7,start_interpolation:0,transformation:{scale:[0f,0f,0f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "12")));
        return 1;
    }
}
