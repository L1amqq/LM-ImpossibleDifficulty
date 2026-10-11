package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled225 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/wing_flap_far", Compiled225::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/zzz/0", Compiled225::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/zzz/1", Compiled225::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/zzz/2", Compiled225::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/zzz/3", Compiled225::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/zzz/4", Compiled225::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/sfx/zzz/5", Compiled225::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/internal/set_fly", Compiled225::f7, "value");
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/internal/set_hover", Compiled225::f8, "value");
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/internal/set_recharge_crystals", Compiled225::f9, "value");
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/set_1_head", Compiled225::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/set_2_heads", Compiled225::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/set_3_heads", Compiled225::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/set_damaged", Compiled225::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/set_fly", Compiled225::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/set_half_damaged", Compiled225::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/set_hover", Compiled225::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/set_tail_disabled", Compiled225::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/set_tail_enabled", Compiled225::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/set_undamaged", Compiled225::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/zzz/0", Compiled225::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/zzz/1", Compiled225::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/zzz/2", Compiled225::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/zzz/3", Compiled225::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/wing_flap_far
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..6"), Control.store("result", "score", "#sfx", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/zzz/4"), Control.when("score", "#sfx", "mcm.temp", "matches", "1..3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/zzz/5"), Control.when("score", "#sfx", "mcm.temp", "matches", "4..6")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/zzz/0
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.lightning_hit", "master", "@a", "~", "~", "~", "0.6", "1.05"), Control.when("score", "#sfx", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.lightning_hit", "master", "@a", "~", "~", "~", "0.6", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.lightning_hit", "master", "@a", "~", "~", "~", "0.6", "0.95"), Control.when("score", "#sfx", "mcm.temp", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/zzz/1
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.lightning_hit", "master", "@a", "~", "~", "~", "0.6", "0.9"), Control.when("score", "#sfx", "mcm.temp", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.lightning_hit", "master", "@a", "~", "~", "~", "0.6", "0.85"), Control.when("score", "#sfx", "mcm.temp", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.lightning_hit", "master", "@a", "~", "~", "~", "0.6", "0.8"), Control.when("score", "#sfx", "mcm.temp", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/zzz/2
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.wings1_medium", "master", "@s", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.wings2_medium", "master", "@s", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.wings3_medium", "master", "@s", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/zzz/3
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.wings4_medium", "master", "@s", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.wings5_medium", "master", "@s", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.wings6_medium", "master", "@s", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/zzz/4
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.wings1_quiet", "master", "@s", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.wings2_quiet", "master", "@s", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.wings3_quiet", "master", "@s", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/sfx/zzz/5
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.wings4_quiet", "master", "@s", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.wings5_quiet", "master", "@s", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:dragon.wings6_quiet", "master", "@s", "~", "~", "~", "10", "1.0"), Control.when("score", "#sfx", "mcm.temp", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/internal/set_fly
    private static int f7(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/fly/tween", "{to_frame:$(value),duration:7}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/internal/set_hover
    private static int f8(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/hover/tween", "{to_frame:$(value),duration:7}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/internal/set_recharge_crystals
    private static int f9(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/recharge_crystals/tween", "{to_frame:$(value),duration:4}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/set_1_head
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.tower_level", "3"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]")));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "name", "[{\"text\":\"\\uFFF1\",\"font\":\"minecraft:bossbar_3\",\"color\":\"#4e5c24\"},{\"text\":\" \",\"font\":\"minecraft:default\"},{\"text\":\" \",\"font\":\"minecraft:default\"},{\"text\":\" \",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.head_count", "1"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/default/apply"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/apply"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/red/apply"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "2..")));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/1_head/apply"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/tail_disabled/apply"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "remove", "entity", "@s", "data.locators.head_hitbox_middle_locator.uuid"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "remove", "entity", "@s", "data.locators.head_hitbox_left_locator.uuid"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "remove", "entity", "@s", "data.locators.head_hitbox_right_locator.uuid"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/zzz/2"), Control.as("@e[type=pig,tag=mcm.its.dragon.hitbox.head,distance=..50]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_middle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/set_2_heads
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.tower_level", "2"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]")));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "name", "[{\"text\":\"\\uFFF1\",\"font\":\"minecraft:bossbar_2\",\"color\":\"#4e5c24\"},{\"text\":\" \",\"font\":\"minecraft:default\"},{\"text\":\" \",\"font\":\"minecraft:default\"},{\"text\":\" \",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.head_count", "2"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/default/apply"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/apply"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/red/apply"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "2..")));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/2_heads/apply"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/tail_disabled/apply"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "remove", "entity", "@s", "data.locators.head_hitbox_middle_locator.uuid"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "remove", "entity", "@s", "data.locators.head_hitbox_left_locator.uuid"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "remove", "entity", "@s", "data.locators.head_hitbox_right_locator.uuid"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/zzz/1"), Control.as("@e[type=pig,tag=mcm.its.dragon.hitbox.head,distance=..50]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_left"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_right"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/set_3_heads
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.tower_level", "1"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]")));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "name", "[{\"text\":\"\\uFFF1\",\"font\":\"minecraft:bossbar_1\",\"color\":\"#4e5c24\"},{\"text\":\" \",\"font\":\"minecraft:default\"},{\"text\":\" \",\"font\":\"minecraft:default\"},{\"text\":\" \",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.head_count", "3"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/default/apply"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/apply"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/red/apply"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "2..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/tail_disabled/apply"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "remove", "entity", "@s", "data.locators.head_hitbox_middle_locator.uuid"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "remove", "entity", "@s", "data.locators.head_hitbox_left_locator.uuid"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "remove", "entity", "@s", "data.locators.head_hitbox_right_locator.uuid"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/zzz/0"), Control.as("@e[type=pig,tag=mcm.its.dragon.hitbox.head,distance=..50]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_middle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_left"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_right"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/set_damaged
    private static int f13(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/red/apply"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/tail_disabled/apply"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/apply"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/1_head/apply"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/set_fly
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.state", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "operation", "#temp", "mcm.its.dragon.transition_frame", "=", "@s", "aj.hover.frame"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.hover.playing]")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#temp", "mcm.its.dragon.transition_frame", "8"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "#temp", "mcm.its.dragon.transition_frame", "21"), Control.when("score", "#temp", "mcm.its.dragon.transition_frame", "matches", "20..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.its.dragon.transition_frame", "1"), Control.when("score", "#temp", "mcm.its.dragon.transition_frame", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#temp", "mcm.its.dragon.transition_frame"), Control.store("result", "storage", "mcm:temp", "value", "int", "1")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/internal/set_fly", "with", "storage", "mcm:temp"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/set_half_damaged
    private static int f15(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/half_red/apply"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/tail_disabled/apply"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/apply"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/1_head/apply"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/set_hover
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.state", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "operation", "#temp", "mcm.its.dragon.transition_frame", "=", "@s", "aj.fly.frame"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.fly.playing]")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#temp", "mcm.its.dragon.transition_frame", "8"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "#temp", "mcm.its.dragon.transition_frame", "21"), Control.when("score", "#temp", "mcm.its.dragon.transition_frame", "matches", "20..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.its.dragon.transition_frame", "1"), Control.when("score", "#temp", "mcm.its.dragon.transition_frame", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#temp", "mcm.its.dragon.transition_frame"), Control.store("result", "storage", "mcm:temp", "value", "int", "1")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/internal/set_hover", "with", "storage", "mcm:temp"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/set_tail_disabled
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.has_tail", "0"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/tail_disabled/apply"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "remove", "entity", "@s", "data.locators.tail_end_hitbox_locator.uuid"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/zzz/4"), Control.as("@e[type=pig,tag=mcm.its.dragon.hitbox.tail,distance=..20]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@e[type=item_display,tag=mcm.vfx.electric_circle,distance=..20]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/set_tail_enabled
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/tail"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.has_tail", "1"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/tail_enabled/apply"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/zzz/3"), Control.as("@n[type=marker,tag=aj.impossible_dragon.locator.tail_locator]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/set_undamaged
    private static int f19(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/default/apply"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/tail_disabled/apply"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/apply"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/1_head/apply"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/zzz/0
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "-1000", "~"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/zzz/1
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "-1000", "~"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/zzz/2
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "-1000", "~"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/state/zzz/3
    private static int f23(Frame c) {
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:amethyst_shard\"}", "~", "~", "~", "0.5", "0.5", "0.5", "0.1", "30", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:amethyst_block\"}", "~", "~", "~", "0.5", "0.5", "0.5", "0.1", "2", "force"));
        return 1;
    }
}
