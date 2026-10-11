package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled166 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/impact_e_shoot/zzz/3", Compiled166::f0);
        Logic.register("impossible_to_survive:effects/impact_e_shoot/zzz/4", Compiled166::f1);
        Logic.register("impossible_to_survive:effects/impact_f/init", Compiled166::f2);
        Logic.register("impossible_to_survive:effects/impact_f/loop", Compiled166::f3);
        Logic.register("impossible_to_survive:effects/impact_f/summon", Compiled166::f4);
        Logic.register("impossible_to_survive:effects/impact_f/zzz/0", Compiled166::f5);
        Logic.register("impossible_to_survive:effects/impact_f/zzz/1", Compiled166::f6);
        Logic.register("impossible_to_survive:effects/impact_f/zzz/2", Compiled166::f7);
        Logic.register("impossible_to_survive:effects/impact_f/zzz/3", Compiled166::f8);
        Logic.register("impossible_to_survive:effects/impact_f/zzz/4", Compiled166::f9);
        Logic.register("impossible_to_survive:effects/impact_f/zzz/5", Compiled166::f10);
        Logic.register("impossible_to_survive:effects/impact_f/zzz/6", Compiled166::f11);
        Logic.register("impossible_to_survive:effects/impact_g/init", Compiled166::f12);
        Logic.register("impossible_to_survive:effects/impact_g/loop", Compiled166::f13);
        Logic.register("impossible_to_survive:effects/impact_g/summon", Compiled166::f14);
        Logic.register("impossible_to_survive:effects/impact_g/zzz/0", Compiled166::f15);
        Logic.register("impossible_to_survive:effects/impact_g/zzz/1", Compiled166::f16);
        Logic.register("impossible_to_survive:effects/impact_g/zzz/2", Compiled166::f17);
        Logic.register("impossible_to_survive:effects/impact_g/zzz/3", Compiled166::f18);
        Logic.register("impossible_to_survive:effects/impact_h/init", Compiled166::f19);
        Logic.register("impossible_to_survive:effects/impact_h/loop", Compiled166::f20);
        Logic.register("impossible_to_survive:effects/impact_h/summon", Compiled166::f21);
        Logic.register("impossible_to_survive:effects/impact_h/zzz/0", Compiled166::f22);
        Logic.register("impossible_to_survive:effects/impact_h/zzz/1", Compiled166::f23);
    }
    // impossible_to_survive:effects/impact_e_shoot/zzz/3
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_e_shoot/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        return 1;
    }
    // impossible_to_survive:effects/impact_e_shoot/zzz/4
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "136"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "137"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_f/init
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_f/loop
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_f/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_f/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "5..7")));
        return 1;
    }
    // impossible_to_survive:effects/impact_f/summon
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..4"), Control.store("result", "score", "#temp", "mcm.random")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_f/zzz/0"), Control.when("score", "#temp", "mcm.random", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_f/zzz/1"), Control.when("score", "#temp", "mcm.random", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_f/zzz/0
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_f\",\"mcm.vfx\",\"mcm.vfx.impact_f_to_j\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[2.5f,2.5f,2.5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":141}}}"), Control.when("score", "#temp", "mcm.random", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_f\",\"mcm.vfx\",\"mcm.vfx.impact_f_to_j\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0.707f,0.707f],translation:[0f,0f,0f],scale:[2.5f,2.5f,2.5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":141}}}"), Control.when("score", "#temp", "mcm.random", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_f/zzz/1
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_f\",\"mcm.vfx\",\"mcm.vfx.impact_f_to_j\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,1f,0f],translation:[0f,0f,0f],scale:[2.5f,2.5f,2.5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":141}}}"), Control.when("score", "#temp", "mcm.random", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_f\",\"mcm.vfx\",\"mcm.vfx.impact_f_to_j\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,-0.707f,0.707f],translation:[0f,0f,0f],scale:[2.5f,2.5f,2.5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":141}}}"), Control.when("score", "#temp", "mcm.random", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_f/zzz/2
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_f/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_f/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_f/zzz/3
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "142"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "143"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_f/zzz/4
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "144"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "145"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_f/zzz/5
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_f/zzz/6"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        return 1;
    }
    // impossible_to_survive:effects/impact_f/zzz/6
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "146"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "147"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_g/init
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_g/loop
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_g/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_g/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "6..10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_g/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "11..15")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_g/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "16..20")));
        return 1;
    }
    // impossible_to_survive:effects/impact_g/summon
    private static int f14(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:1,Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_g\",\"mcm.vfx\",\"mcm.vfx.impact_f_to_j\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,0f],scale:[2.5f,2.5f,2.5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":151}}}"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#root_x_rotation", "mcm.temp"), Control.store("result", "entity", "@n[type=item_display,tag=mcm.vfx.impact_g,distance=..0.1]", "Rotation[0]", "float", "1")));
        return 1;
    }
    // impossible_to_survive:effects/impact_g/zzz/0
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "152"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "153"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "154"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "155"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "156"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        return 1;
    }
    // impossible_to_survive:effects/impact_g/zzz/1
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "157"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "158"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "159"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "160"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "161"), Control.when("score", "@s", "mcm.animation", "matches", "10")));
        return 1;
    }
    // impossible_to_survive:effects/impact_g/zzz/2
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "162"), Control.when("score", "@s", "mcm.animation", "matches", "11")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "163"), Control.when("score", "@s", "mcm.animation", "matches", "12")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "164"), Control.when("score", "@s", "mcm.animation", "matches", "13")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "165"), Control.when("score", "@s", "mcm.animation", "matches", "14")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "166"), Control.when("score", "@s", "mcm.animation", "matches", "15")));
        return 1;
    }
    // impossible_to_survive:effects/impact_g/zzz/3
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "167"), Control.when("score", "@s", "mcm.animation", "matches", "16")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "168"), Control.when("score", "@s", "mcm.animation", "matches", "17")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "169"), Control.when("score", "@s", "mcm.animation", "matches", "18")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "170"), Control.when("score", "@s", "mcm.animation", "matches", "19")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "20")));
        return 1;
    }
    // impossible_to_survive:effects/impact_h/init
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_h/loop
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_h/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_h/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "5..9")));
        return 1;
    }
    // impossible_to_survive:effects/impact_h/summon
    private static int f21(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_h\",\"mcm.vfx\",\"mcm.vfx.impact_f_to_j\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,4.5f,0.1f],scale:[10f,10f,10f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":185}}}"));
        return 1;
    }
    // impossible_to_survive:effects/impact_h/zzz/0
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_h/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_h/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_h/zzz/1
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "186"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "187"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
}
