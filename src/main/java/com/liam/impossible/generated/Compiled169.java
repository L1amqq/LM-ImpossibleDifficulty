package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled169 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/impact_m/summon", Compiled169::f0);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/0", Compiled169::f1);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/1", Compiled169::f2);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/10", Compiled169::f3);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/11", Compiled169::f4);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/12", Compiled169::f5);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/13", Compiled169::f6);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/2", Compiled169::f7);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/3", Compiled169::f8);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/4", Compiled169::f9);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/5", Compiled169::f10);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/6", Compiled169::f11);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/7", Compiled169::f12);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/8", Compiled169::f13);
        Logic.register("impossible_to_survive:effects/impact_m/zzz/9", Compiled169::f14);
        Logic.register("impossible_to_survive:effects/impact_n/init", Compiled169::f15);
        Logic.register("impossible_to_survive:effects/impact_n/loop", Compiled169::f16);
        Logic.register("impossible_to_survive:effects/impact_n/summon", Compiled169::f17);
        Logic.register("impossible_to_survive:effects/impact_n/zzz/0", Compiled169::f18);
        Logic.register("impossible_to_survive:effects/impact_n/zzz/1", Compiled169::f19);
        Logic.register("impossible_to_survive:effects/impact_n/zzz/2", Compiled169::f20);
        Logic.register("impossible_to_survive:effects/impact_n/zzz/3", Compiled169::f21);
        Logic.register("impossible_to_survive:effects/impact_n/zzz/4", Compiled169::f22);
        Logic.register("impossible_to_survive:effects/impact_n/zzz/5", Compiled169::f23);
    }
    // impossible_to_survive:effects/impact_m/summon
    private static int f0(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:1,Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_m\",\"mcm.vfx\",\"mcm.vfx.impact_k_to_p\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,0f],scale:[2.8f,2.8f,2.8f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":391}}}"));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/0
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..10")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/1
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/10
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "402"), Control.when("score", "@s", "mcm.animation", "matches", "13")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "403"), Control.when("score", "@s", "mcm.animation", "matches", "14")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/11
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/12"), Control.when("score", "@s", "mcm.animation", "matches", "15..16")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/13"), Control.when("score", "@s", "mcm.animation", "matches", "17..19")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/12
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "404"), Control.when("score", "@s", "mcm.animation", "matches", "15")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "405"), Control.when("score", "@s", "mcm.animation", "matches", "16")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/13
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "406"), Control.when("score", "@s", "mcm.animation", "matches", "17")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "407"), Control.when("score", "@s", "mcm.animation", "matches", "18")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "19")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/2
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "392"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "393"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/3
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "394"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "395"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/4
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/6"), Control.when("score", "@s", "mcm.animation", "matches", "9..10")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/5
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "396"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "397"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/6
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "398"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "399"), Control.when("score", "@s", "mcm.animation", "matches", "10")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/7
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/8"), Control.when("score", "@s", "mcm.animation", "matches", "11..14")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/11"), Control.when("score", "@s", "mcm.animation", "matches", "15..19")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/8
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/9"), Control.when("score", "@s", "mcm.animation", "matches", "11..12")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_m/zzz/10"), Control.when("score", "@s", "mcm.animation", "matches", "13..14")));
        return 1;
    }
    // impossible_to_survive:effects/impact_m/zzz/9
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "400"), Control.when("score", "@s", "mcm.animation", "matches", "11")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "401"), Control.when("score", "@s", "mcm.animation", "matches", "12")));
        return 1;
    }
    // impossible_to_survive:effects/impact_n/init
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.random", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_n/loop
    private static int f16(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "@n[tag=aj.impossible_dragon.locator.tail_locator]"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_n/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_n/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "5..10")));
        return 1;
    }
    // impossible_to_survive:effects/impact_n/summon
    private static int f17(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:1,Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_n\",\"mcm.vfx\",\"mcm.vfx.impact_k_to_p\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[3.75f,3.75f,3.75f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":381}}}"));
        return 1;
    }
    // impossible_to_survive:effects/impact_n/zzz/0
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_n/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_n/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_n/zzz/1
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "382"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "383"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_n/zzz/2
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "384"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "385"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_n/zzz/3
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_n/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_n/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "7..10")));
        return 1;
    }
    // impossible_to_survive:effects/impact_n/zzz/4
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "386"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "387"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_n/zzz/5
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "388"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "389"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "390"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "10")));
        return 1;
    }
}
