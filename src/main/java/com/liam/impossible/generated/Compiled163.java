package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled163 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/flash_f/summon", Compiled163::f0);
        Logic.register("impossible_to_survive:effects/flash_g/init", Compiled163::f1);
        Logic.register("impossible_to_survive:effects/flash_g/loop", Compiled163::f2);
        Logic.register("impossible_to_survive:effects/flash_g/summon", Compiled163::f3);
        Logic.register("impossible_to_survive:effects/flashbang/apply", Compiled163::f4);
        Logic.register("impossible_to_survive:effects/flashbang/apply_weak", Compiled163::f5);
        Logic.register("impossible_to_survive:effects/flashbang/zzz/0", Compiled163::f6);
        Logic.register("impossible_to_survive:effects/flashbang/zzz/1", Compiled163::f7);
        Logic.register("impossible_to_survive:effects/flashbang/zzz/2", Compiled163::f8);
        Logic.register("impossible_to_survive:effects/flashbang/zzz/3", Compiled163::f9);
        Logic.register("impossible_to_survive:effects/flashbang/zzz/4", Compiled163::f10);
        Logic.register("impossible_to_survive:effects/flashbang/zzz/5", Compiled163::f11);
        Logic.register("impossible_to_survive:effects/impact_a/init", Compiled163::f12);
        Logic.register("impossible_to_survive:effects/impact_a/loop", Compiled163::f13);
        Logic.register("impossible_to_survive:effects/impact_a/summon", Compiled163::f14);
        Logic.register("impossible_to_survive:effects/impact_a/zzz/0", Compiled163::f15);
        Logic.register("impossible_to_survive:effects/impact_a/zzz/1", Compiled163::f16);
        Logic.register("impossible_to_survive:effects/impact_a/zzz/2", Compiled163::f17);
        Logic.register("impossible_to_survive:effects/impact_a/zzz/3", Compiled163::f18);
        Logic.register("impossible_to_survive:effects/impact_a/zzz/4", Compiled163::f19);
        Logic.register("impossible_to_survive:effects/impact_a/zzz/5", Compiled163::f20);
        Logic.register("impossible_to_survive:effects/impact_a/zzz/6", Compiled163::f21);
        Logic.register("impossible_to_survive:effects/impact_a/zzz/7", Compiled163::f22);
        Logic.register("impossible_to_survive:effects/impact_a/zzz/8", Compiled163::f23);
    }
    // impossible_to_survive:effects/flash_f/summon
    private static int f0(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:3,Tags:[\"mcm.vfx.flash\",\"mcm.vfx.flash_f\",\"mcm.vfx\",\"mcm.vfx.flash_e_to_g\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,-0.5f],scale:[0f,0f,0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":201}}}"));
        return 1;
    }
    // impossible_to_survive:effects/flash_g/init
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/flash_g/loop
    private static int f2(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "@n[tag=aj.impossible_dragon.locator.tail_locator]"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:3,start_interpolation:0,transformation:{scale:[3.1f,3.1f,3.1f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.animation", "3"), Control.when("score", "@s", "mcm.animation", "matches", "24")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:5,start_interpolation:0,transformation:{scale:[0f,0f,0f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "26")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "32")));
        return 1;
    }
    // impossible_to_survive:effects/flash_g/summon
    private static int f3(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:1,Tags:[\"mcm.vfx.flash\",\"mcm.vfx.flash_g\",\"mcm.vfx\",\"mcm.vfx.flash_e_to_g\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,-0.05f],scale:[0f,0f,0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":21}}}"));
        return 1;
    }
    // impossible_to_survive:effects/flashbang/apply
    private static int f4(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:flashbang", "master", "@s", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/flashbang/zzz/0"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/flashbang/zzz/1"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/flashbang/zzz/2"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.title(x0, "@s", "title", "{\"text\":\"\\uE002\",\"color\":\"#4e5c24\",\"font\":\"minecraft:flashbang\"}"), Control.when("score", "#global", "disabled_flashbang", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:effects/flashbang/apply_weak
    private static int f5(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:flashbang", "master", "@s", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/flashbang/zzz/3"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/flashbang/zzz/4"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/flashbang/zzz/5"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.title(x0, "@s", "title", "{\"text\":\"\\uE002\",\"color\":\"#4e5c24\",\"font\":\"minecraft:flashbang\"}"), Control.when("score", "#global", "disabled_flashbang", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:effects/flashbang/zzz/0
    private static int f6(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.fog_timer", "-37"));
        Logic.step(() -> Native.title(c, "@s", "times", "1", "4", "20"));
        return 1;
    }
    // impossible_to_survive:effects/flashbang/zzz/1
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.fog_timer", "-65"));
        Logic.step(() -> Native.title(c, "@s", "times", "1", "10", "30"));
        return 1;
    }
    // impossible_to_survive:effects/flashbang/zzz/2
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.fog_timer", "-105"));
        Logic.step(() -> Native.title(c, "@s", "times", "1", "20", "40"));
        return 1;
    }
    // impossible_to_survive:effects/flashbang/zzz/3
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.fog_timer", "-18"));
        Logic.step(() -> Native.title(c, "@s", "times", "1", "2", "10"));
        return 1;
    }
    // impossible_to_survive:effects/flashbang/zzz/4
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.fog_timer", "-30"));
        Logic.step(() -> Native.title(c, "@s", "times", "1", "5", "20"));
        return 1;
    }
    // impossible_to_survive:effects/flashbang/zzz/5
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.fog_timer", "-65"));
        Logic.step(() -> Native.title(c, "@s", "times", "1", "10", "30"));
        return 1;
    }
    // impossible_to_survive:effects/impact_a/init
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.random", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/impact_a/loop
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_a/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "1..8")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_a/summon
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..4"), Control.store("result", "score", "#temp", "mcm.random")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_a/zzz/0"), Control.when("score", "#temp", "mcm.random", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_a/zzz/1"), Control.when("score", "#temp", "mcm.random", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_a/zzz/0
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_a\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[5f,5f,5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":32}}}"), Control.when("score", "#temp", "mcm.random", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_a\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,1f,0f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[5f,5f,5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":32}}}"), Control.when("score", "#temp", "mcm.random", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_a/zzz/1
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_a\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0.707f,0.707f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[5f,5f,5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":32}}}"), Control.when("score", "#temp", "mcm.random", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_a\",\"mcm.vfx\",\"mcm.vfx.impact_a_to_e\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0.707f,-0.707f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[5f,5f,5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":32}}}"), Control.when("score", "#temp", "mcm.random", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_a/zzz/2
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_a/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_a/zzz/6"), Control.when("score", "@s", "mcm.animation", "matches", "5..8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_a/zzz/3
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_a/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_a/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_a/zzz/4
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "33"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "34"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/impact_a/zzz/5
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "35"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "36"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/impact_a/zzz/6
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_a/zzz/7"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_a/zzz/8"), Control.when("score", "@s", "mcm.animation", "matches", "7..8")));
        return 1;
    }
    // impossible_to_survive:effects/impact_a/zzz/7
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "37"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "38"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/impact_a/zzz/8
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "39"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "39"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        return 1;
    }
}
