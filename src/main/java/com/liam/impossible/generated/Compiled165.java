package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled165 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/impact_d/zzz/1", Compiled165::f0);
        Logic.register("impossible_to_survive:effects/impact_d/zzz/10", Compiled165::f1);
        Logic.register("impossible_to_survive:effects/impact_d/zzz/2", Compiled165::f2);
        Logic.register("impossible_to_survive:effects/impact_d/zzz/3", Compiled165::f3);
        Logic.register("impossible_to_survive:effects/impact_d/zzz/4", Compiled165::f4);
        Logic.register("impossible_to_survive:effects/impact_d/zzz/5", Compiled165::f5);
        Logic.register("impossible_to_survive:effects/impact_d/zzz/6", Compiled165::f6);
        Logic.register("impossible_to_survive:effects/impact_d/zzz/7", Compiled165::f7);
        Logic.register("impossible_to_survive:effects/impact_d/zzz/8", Compiled165::f8);
        Logic.register("impossible_to_survive:effects/impact_d/zzz/9", Compiled165::f9);
        Logic.register("impossible_to_survive:effects/impact_e/init", Compiled165::f10);
        Logic.register("impossible_to_survive:effects/impact_e/loop", Compiled165::f11);
        Logic.register("impossible_to_survive:effects/impact_e/summon", Compiled165::f12);
        Logic.register("impossible_to_survive:effects/impact_e/zzz/0", Compiled165::f13);
        Logic.register("impossible_to_survive:effects/impact_e/zzz/1", Compiled165::f14);
        Logic.register("impossible_to_survive:effects/impact_e/zzz/2", Compiled165::f15);
        Logic.register("impossible_to_survive:effects/impact_e/zzz/3", Compiled165::f16);
        Logic.register("impossible_to_survive:effects/impact_e/zzz/4", Compiled165::f17);
        Logic.register("impossible_to_survive:effects/impact_e_shoot/init", Compiled165::f18);
        Logic.register("impossible_to_survive:effects/impact_e_shoot/loop", Compiled165::f19);
        Logic.register("impossible_to_survive:effects/impact_e_shoot/summon", Compiled165::f20);
        Logic.register("impossible_to_survive:effects/impact_e_shoot/zzz/0", Compiled165::f21);
        Logic.register("impossible_to_survive:effects/impact_e_shoot/zzz/1", Compiled165::f22);
        Logic.register("impossible_to_survive:effects/impact_e_shoot/zzz/2", Compiled165::f23);
    }
    // impossible_to_survive:effects/impact_d/zzz/1
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_d\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.5f,-0.5f,0.5f,0.5f],translation:[0f,0f,0f],scale:[7f,7f,7f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":101}}}"), Control.when("score", "#temp", "mcm.random", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_d\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.5f,0.5f,-0.5f,0.5f],translation:[0f,0f,0f],scale:[7f,7f,7f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":101}}}"), Control.when("score", "#temp", "mcm.random", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_d/zzz/10
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "113"), Control.when("score", "@s", "mcm.animation", "matches", "12")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "114"), Control.when("score", "@s", "mcm.animation", "matches", "13")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "14")));
        return 1;
    }
    // impossible_to_survive:effects/impact_d/zzz/2
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_d/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_d/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_d/zzz/3
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "102"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "103"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_d/zzz/4
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "104"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "105"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_d/zzz/5
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_d/zzz/6"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_d/zzz/7"), Control.when("score", "@s", "mcm.animation", "matches", "7..8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_d/zzz/6
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "106"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "107"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_d/zzz/7
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "108"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "109"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_d/zzz/8
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_d/zzz/9"), Control.when("score", "@s", "mcm.animation", "matches", "9..10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_d/zzz/10"), Control.when("score", "@s", "mcm.animation", "matches", "12..14")));
        return 1;
    }
    // impossible_to_survive:effects/impact_d/zzz/9
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "110"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "111"), Control.when("score", "@s", "mcm.animation", "matches", "10")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "112"), Control.when("score", "@s", "mcm.animation", "matches", "11")));
        return 1;
    }
    // impossible_to_survive:effects/impact_e/init
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_e/loop
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_e/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_e/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "5..7")));
        return 1;
    }
    // impossible_to_survive:effects/impact_e/summon
    private static int f12(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_e\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"vertical\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,0f],scale:[2f,2f,2f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":121}}}"));
        return 1;
    }
    // impossible_to_survive:effects/impact_e/zzz/0
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_e/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_e/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_e/zzz/1
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "122"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "123"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_e/zzz/2
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "124"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "125"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_e/zzz/3
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_e/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        return 1;
    }
    // impossible_to_survive:effects/impact_e/zzz/4
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "126"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "127"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_e_shoot/init
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_e_shoot/loop
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_e_shoot/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_e_shoot/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "5..7")));
        return 1;
    }
    // impossible_to_survive:effects/impact_e_shoot/summon
    private static int f20(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_e_shoot\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,2f],scale:[4f,4f,4f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":131}}}"));
        return 1;
    }
    // impossible_to_survive:effects/impact_e_shoot/zzz/0
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_e_shoot/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_e_shoot/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_e_shoot/zzz/1
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "132"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "133"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_e_shoot/zzz/2
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "134"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "135"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
}
