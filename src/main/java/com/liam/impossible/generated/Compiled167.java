package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled167 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/impact_h/zzz/2", Compiled167::f0);
        Logic.register("impossible_to_survive:effects/impact_h/zzz/3", Compiled167::f1);
        Logic.register("impossible_to_survive:effects/impact_h/zzz/4", Compiled167::f2);
        Logic.register("impossible_to_survive:effects/impact_h/zzz/5", Compiled167::f3);
        Logic.register("impossible_to_survive:effects/impact_i/init", Compiled167::f4);
        Logic.register("impossible_to_survive:effects/impact_i/loop", Compiled167::f5);
        Logic.register("impossible_to_survive:effects/impact_i/summon", Compiled167::f6);
        Logic.register("impossible_to_survive:effects/impact_j/init", Compiled167::f7);
        Logic.register("impossible_to_survive:effects/impact_j/loop", Compiled167::f8);
        Logic.register("impossible_to_survive:effects/impact_j/summon", Compiled167::f9);
        Logic.register("impossible_to_survive:effects/impact_j/zzz/0", Compiled167::f10);
        Logic.register("impossible_to_survive:effects/impact_j/zzz/1", Compiled167::f11);
        Logic.register("impossible_to_survive:effects/impact_j/zzz/2", Compiled167::f12);
        Logic.register("impossible_to_survive:effects/impact_j/zzz/3", Compiled167::f13);
        Logic.register("impossible_to_survive:effects/impact_j/zzz/4", Compiled167::f14);
        Logic.register("impossible_to_survive:effects/impact_j/zzz/5", Compiled167::f15);
        Logic.register("impossible_to_survive:effects/impact_j_shoot/init", Compiled167::f16);
        Logic.register("impossible_to_survive:effects/impact_j_shoot/loop", Compiled167::f17);
        Logic.register("impossible_to_survive:effects/impact_j_shoot/summon", Compiled167::f18);
        Logic.register("impossible_to_survive:effects/impact_j_shoot/zzz/0", Compiled167::f19);
        Logic.register("impossible_to_survive:effects/impact_j_shoot/zzz/1", Compiled167::f20);
        Logic.register("impossible_to_survive:effects/impact_j_shoot/zzz/2", Compiled167::f21);
        Logic.register("impossible_to_survive:effects/impact_j_shoot/zzz/3", Compiled167::f22);
        Logic.register("impossible_to_survive:effects/impact_j_shoot/zzz/4", Compiled167::f23);
    }
    // impossible_to_survive:effects/impact_h/zzz/2
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "188"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "189"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_h/zzz/3
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_h/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_h/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "7..9")));
        return 1;
    }
    // impossible_to_survive:effects/impact_h/zzz/4
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "190"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "191"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_h/zzz/5
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "192"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "193"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        return 1;
    }
    // impossible_to_survive:effects/impact_i/init
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_i/loop
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "212"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "213"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "214"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_i/summon
    private static int f6(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_i\",\"mcm.vfx\",\"mcm.vfx.impact_f_to_j\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,0f],scale:[2f,2f,2f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":211}}}"));
        return 1;
    }
    // impossible_to_survive:effects/impact_j/init
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_j/loop
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_j/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_j/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "5..8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_j/summon
    private static int f9(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_j\",\"mcm.vfx\",\"mcm.vfx.impact_f_to_j\"],billboard:\"vertical\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,2.5f,0f],scale:[5f,5f,5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":221}}}"));
        return 1;
    }
    // impossible_to_survive:effects/impact_j/zzz/0
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_j/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_j/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_j/zzz/1
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "222"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "223"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_j/zzz/2
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "224"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "225"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_j/zzz/3
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_j/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..7")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_j/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "7..8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_j/zzz/4
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "226"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "227"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_j/zzz/5
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "228"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_j_shoot/init
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_j_shoot/loop
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_j_shoot/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_j_shoot/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "5..8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_j_shoot/summon
    private static int f18(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_j_shoot\",\"mcm.vfx\",\"mcm.vfx.impact_f_to_j\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,5f],scale:[10f,10f,10f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":241}}}"));
        return 1;
    }
    // impossible_to_survive:effects/impact_j_shoot/zzz/0
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_j_shoot/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_j_shoot/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_j_shoot/zzz/1
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "242"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "243"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_j_shoot/zzz/2
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "244"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "245"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_j_shoot/zzz/3
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_j_shoot/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_j_shoot/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "7..8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_j_shoot/zzz/4
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "246"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "247"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
}
