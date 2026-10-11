package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled164 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/impact_b/init", Compiled164::f0);
        Logic.register("impossible_to_survive:effects/impact_b/loop", Compiled164::f1);
        Logic.register("impossible_to_survive:effects/impact_b/summon", Compiled164::f2);
        Logic.register("impossible_to_survive:effects/impact_b/zzz/0", Compiled164::f3);
        Logic.register("impossible_to_survive:effects/impact_b/zzz/1", Compiled164::f4);
        Logic.register("impossible_to_survive:effects/impact_b/zzz/2", Compiled164::f5);
        Logic.register("impossible_to_survive:effects/impact_b/zzz/3", Compiled164::f6);
        Logic.register("impossible_to_survive:effects/impact_b/zzz/4", Compiled164::f7);
        Logic.register("impossible_to_survive:effects/impact_b/zzz/5", Compiled164::f8);
        Logic.register("impossible_to_survive:effects/impact_b/zzz/6", Compiled164::f9);
        Logic.register("impossible_to_survive:effects/impact_b/zzz/7", Compiled164::f10);
        Logic.register("impossible_to_survive:effects/impact_c/init", Compiled164::f11);
        Logic.register("impossible_to_survive:effects/impact_c/loop", Compiled164::f12);
        Logic.register("impossible_to_survive:effects/impact_c/summon", Compiled164::f13);
        Logic.register("impossible_to_survive:effects/impact_c/zzz/0", Compiled164::f14);
        Logic.register("impossible_to_survive:effects/impact_c/zzz/1", Compiled164::f15);
        Logic.register("impossible_to_survive:effects/impact_c/zzz/2", Compiled164::f16);
        Logic.register("impossible_to_survive:effects/impact_c/zzz/3", Compiled164::f17);
        Logic.register("impossible_to_survive:effects/impact_c/zzz/4", Compiled164::f18);
        Logic.register("impossible_to_survive:effects/impact_c/zzz/5", Compiled164::f19);
        Logic.register("impossible_to_survive:effects/impact_d/init", Compiled164::f20);
        Logic.register("impossible_to_survive:effects/impact_d/loop", Compiled164::f21);
        Logic.register("impossible_to_survive:effects/impact_d/summon", Compiled164::f22);
        Logic.register("impossible_to_survive:effects/impact_d/zzz/0", Compiled164::f23);
    }
    // impossible_to_survive:effects/impact_b/init
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.random", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_b/loop
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_b/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_b/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "5..9")));
        return 1;
    }
    // impossible_to_survive:effects/impact_b/summon
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..4"), Control.store("result", "score", "#temp", "mcm.random")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_b/zzz/0"), Control.when("score", "#temp", "mcm.random", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_b/zzz/1"), Control.when("score", "#temp", "mcm.random", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_b/zzz/0
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_b\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[2.5f,2.5f,2.5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":56}}}"), Control.when("score", "#temp", "mcm.random", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_b\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,1f,0f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[2.5f,2.5f,2.5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":56}}}"), Control.when("score", "#temp", "mcm.random", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_b/zzz/1
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_b\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0.707f,0.707f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[2.5f,2.5f,2.5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":56}}}"), Control.when("score", "#temp", "mcm.random", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_b\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0.707f,-0.707f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[2.5f,2.5f,2.5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":56}}}"), Control.when("score", "#temp", "mcm.random", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_b/zzz/2
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_b/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_b/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_b/zzz/3
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "57"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "58"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_b/zzz/4
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "59"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "60"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_b/zzz/5
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_b/zzz/6"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_b/zzz/7"), Control.when("score", "@s", "mcm.animation", "matches", "7..8")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        return 1;
    }
    // impossible_to_survive:effects/impact_b/zzz/6
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "61"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "62"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_b/zzz/7
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "63"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "64"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_c/init
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_c/loop
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_c/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_c/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..7")));
        return 1;
    }
    // impossible_to_survive:effects/impact_c/summon
    private static int f13(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_c\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"vertical\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,2.5f,0f],scale:[5f,5f,5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":81}}}"));
        return 1;
    }
    // impossible_to_survive:effects/impact_c/zzz/0
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_c/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_c/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_c/zzz/1
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "82"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_c/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_c/zzz/2
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "83"));
        Logic.step(() -> Native.particle(c, "flash", "~", "~0.25", "~", "0", "0", "0", "0.1", "1", "force"));
        return 1;
    }
    // impossible_to_survive:effects/impact_c/zzz/3
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "84"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "85"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_c/zzz/4
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_c/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        return 1;
    }
    // impossible_to_survive:effects/impact_c/zzz/5
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "86"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "87"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_d/init
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.random", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_d/loop
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_d/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_d/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "5..9")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_d/zzz/8"), Control.when("score", "@s", "mcm.animation", "matches", "9..14")));
        return 1;
    }
    // impossible_to_survive:effects/impact_d/summon
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..4"), Control.store("result", "score", "#temp", "mcm.random")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_d/zzz/0"), Control.when("score", "#temp", "mcm.random", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_d/zzz/1"), Control.when("score", "#temp", "mcm.random", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_d/zzz/0
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_d\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.707f,0f,0f,0.707f],translation:[0f,0f,0f],scale:[7f,7f,7f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":101}}}"), Control.when("score", "#temp", "mcm.random", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_d\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[-0.707f,0f,0f,0.707f],translation:[0f,0f,0f],scale:[7f,7f,7f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":101}}}"), Control.when("score", "#temp", "mcm.random", "matches", "2")));
        return 1;
    }
}
