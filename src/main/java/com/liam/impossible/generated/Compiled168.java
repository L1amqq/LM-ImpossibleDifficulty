package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled168 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/impact_j_shoot/zzz/5", Compiled168::f0);
        Logic.register("impossible_to_survive:effects/impact_k/init", Compiled168::f1);
        Logic.register("impossible_to_survive:effects/impact_k/loop", Compiled168::f2);
        Logic.register("impossible_to_survive:effects/impact_k/summon", Compiled168::f3);
        Logic.register("impossible_to_survive:effects/impact_k/zzz/0", Compiled168::f4);
        Logic.register("impossible_to_survive:effects/impact_k/zzz/1", Compiled168::f5);
        Logic.register("impossible_to_survive:effects/impact_k/zzz/2", Compiled168::f6);
        Logic.register("impossible_to_survive:effects/impact_k/zzz/3", Compiled168::f7);
        Logic.register("impossible_to_survive:effects/impact_k/zzz/4", Compiled168::f8);
        Logic.register("impossible_to_survive:effects/impact_k/zzz/5", Compiled168::f9);
        Logic.register("impossible_to_survive:effects/impact_k/zzz/6", Compiled168::f10);
        Logic.register("impossible_to_survive:effects/impact_k/zzz/7", Compiled168::f11);
        Logic.register("impossible_to_survive:effects/impact_l/init", Compiled168::f12);
        Logic.register("impossible_to_survive:effects/impact_l/loop", Compiled168::f13);
        Logic.register("impossible_to_survive:effects/impact_l/summon", Compiled168::f14);
        Logic.register("impossible_to_survive:effects/impact_l/zzz/0", Compiled168::f15);
        Logic.register("impossible_to_survive:effects/impact_l/zzz/1", Compiled168::f16);
        Logic.register("impossible_to_survive:effects/impact_l/zzz/2", Compiled168::f17);
        Logic.register("impossible_to_survive:effects/impact_l/zzz/3", Compiled168::f18);
        Logic.register("impossible_to_survive:effects/impact_l/zzz/4", Compiled168::f19);
        Logic.register("impossible_to_survive:effects/impact_l/zzz/5", Compiled168::f20);
        Logic.register("impossible_to_survive:effects/impact_l/zzz/6", Compiled168::f21);
        Logic.register("impossible_to_survive:effects/impact_m/init", Compiled168::f22);
        Logic.register("impossible_to_survive:effects/impact_m/loop", Compiled168::f23);
    }
    // impossible_to_survive:effects/impact_j_shoot/zzz/5
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "248"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_k/init
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_k/loop
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_k/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_k/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_k/summon
    private static int f3(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_k\",\"mcm.vfx\",\"mcm.vfx.impact_k_to_p\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,0f],scale:[0f,0f,0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":231}}}"));
        return 1;
    }
    // impossible_to_survive:effects/impact_k/zzz/0
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_k/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_k/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_k/zzz/1
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_k/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "233"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_k/zzz/2
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{interpolation_duration:2,start_interpolation:0,transformation:{scale:[4f,4f,4f]}}"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "232"));
        return 1;
    }
    // impossible_to_survive:effects/impact_k/zzz/3
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "234"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "235"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_k/zzz/4
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_k/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_k/zzz/7"), Control.when("score", "@s", "mcm.animation", "matches", "7..8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_k/zzz/5
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_k/zzz/6"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "237"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_k/zzz/6
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{interpolation_duration:4,start_interpolation:0,transformation:{scale:[2f,2f,2f]}}"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "236"));
        return 1;
    }
    // impossible_to_survive:effects/impact_k/zzz/7
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "238"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_l/init
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_l/loop
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_l/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_l/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..9")));
        return 1;
    }
    // impossible_to_survive:effects/impact_l/summon
    private static int f14(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_l\",\"mcm.vfx\",\"mcm.vfx.impact_k_to_p\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.707f,0f,0f,0.707f],translation:[0f,0.0f,0f],scale:[5f,5f,5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":355}}}"));
        return 1;
    }
    // impossible_to_survive:effects/impact_l/zzz/0
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_l/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_l/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_l/zzz/1
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_l/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "357"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_l/zzz/2
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s[tag=!mcm.vfx.no_scaling]", "{interpolation_duration:10,start_interpolation:0,transformation:{scale:[15f,15f,15f]}}"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "356"));
        return 1;
    }
    // impossible_to_survive:effects/impact_l/zzz/3
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "358"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "359"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_l/zzz/4
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_l/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_l/zzz/6"), Control.when("score", "@s", "mcm.animation", "matches", "7..9")));
        return 1;
    }
    // impossible_to_survive:effects/impact_l/zzz/5
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "360"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "361"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_l/zzz/6
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "362"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "363"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/init
    private static int f22(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/loop
    private static int f23(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "@n[tag=aj.impossible_dragon.locator.tail_locator]"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.animation", "1"), Control.unless("score", "@s", "mcm.animation", "matches", "6..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.animation", "1"), Control.when("score", "@s", "mcm.animation", "matches", "8..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/7"), Control.when("score", "@s", "mcm.animation", "matches", "11..19")));
        return 1;
    }
}
