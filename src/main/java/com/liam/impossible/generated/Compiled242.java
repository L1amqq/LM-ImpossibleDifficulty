package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled242 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/63", Compiled242::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/64", Compiled242::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/65", Compiled242::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/66", Compiled242::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/67", Compiled242::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/68", Compiled242::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/69", Compiled242::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/7", Compiled242::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/70", Compiled242::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/71", Compiled242::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/72", Compiled242::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/73", Compiled242::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/74", Compiled242::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/75", Compiled242::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/76", Compiled242::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/77", Compiled242::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/78", Compiled242::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/79", Compiled242::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/8", Compiled242::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/80", Compiled242::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/81", Compiled242::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/82", Compiled242::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/83", Compiled242::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/84", Compiled242::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/63
    private static int f0(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/healing_arrive"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#healing_arrive_sfx", "mcm.misc", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/64
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#spawned_jumppads", "mcm.temp"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~"), Control.at("@n[type=marker,tag=mcm.its.dragon_environment.heal_point.active]")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "2"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_hover"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.flight_speed", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#healing_arrive_sfx"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/65
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/66"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1..15")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/67"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1..5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/68"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "6..10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/69"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "11..15")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/70"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "16..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/66
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=1..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=5..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=20..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-20]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "@s", "mcm.temp")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/67
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.exit_portal_center]", "eyes"), Control.positioned("^", "^", "^0.3"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.7"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.temp"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/68
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.exit_portal_center]", "eyes"), Control.positioned("^", "^", "^0.4"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.6"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.temp"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/69
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.exit_portal_center]", "eyes"), Control.positioned("^", "^", "^0.5"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.5"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.temp"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/7
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/8"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s"), Control.when("dimension", "minecraft:the_end")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/70
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.exit_portal_center]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/71"), Control.when("score", "@s", "aj.hover.frame", "matches", "19")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/71
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/72"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/73"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/74"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/75"), Control.as("@a[distance=..300]"), Control.at("@s"), Control.when("score", "@s", "mcm.its.dragon.hint.healing", "matches", "1"), Control.unless("score", "@s", "mcm.its.dragon.hint.jumppad", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/76"), Control.as("@a[distance=..300]"), Control.at("@s"), Control.unless("score", "@s", "mcm.its.dragon.hint.healing", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/72
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.attack_difficulty", "1"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/heal_super_long/tween", "{to_frame:2,duration:2}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/healing_long"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/73
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.attack_difficulty", "2"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/heal_long/tween", "{to_frame:2,duration:2}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/healing"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/74
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.attack_difficulty", "3"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/heal/tween", "{to_frame:2,duration:2}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/healing_short"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/75
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.hint.jumppad", "1"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u002a\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\" Hint:\",\"bold\":true,\"color\":\"#d9d134\",\"font\":\"minecraft:default\"},{\"text\":\" Use the jumppads at the base of the tower if you struggle to shoot the end crystal from the ground!\",\"color\":\"aqua\",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/display_hint"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/76
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.hint.healing", "1"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u002a\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\" Hint:\",\"bold\":true,\"color\":\"#d9d134\",\"font\":\"minecraft:default\"},{\"text\":\" Destroy the end crystal while the dragon uses it to heal!\",\"color\":\"aqua\",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/display_hint"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/77
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/78"), Control.when("score", "@s", "mcm.its.dragon.attack_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/81"), Control.when("score", "@s", "mcm.its.dragon.attack_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/84"), Control.when("score", "@s", "mcm.its.dragon.attack_difficulty", "matches", "3..")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:effects/flash_d/summon"), Control.positioned("^", "^0.5", "^-8.5"), Control.at("@n[tag=aj.impossible_dragon.locator.tail_locator]")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "12")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/87"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "15")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/impossible_dragon/state/set_tail_enabled"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/89"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "20")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/93"), Control.when("score", "@s", "mcm.its.dragon.attack_difficulty", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/104"), Control.when("score", "@s", "mcm.its.dragon.attack_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/115"), Control.when("score", "@s", "mcm.its.dragon.attack_difficulty", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/78
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/79"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "16..103")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "operation", "@s", "mcm.its.dragon.health", "+=", "#healing_rate", "mcm.its.dragon.settings"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "16..105")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/79
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/80"), Control.positioned("^", "^0.5", "^-8.5"), Control.at("@n[tag=aj.impossible_dragon.locator.tail_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/8
    private static int f18(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.temp_setup.crystal\",\"mcm.its.dragon.temp_setup\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_1_level_1"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "1"), Control.positioned("~-3", "~-8", "~-3")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_2_level_1"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "2"), Control.positioned("~-4", "~-8", "~-4")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_3_level_1"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "3"), Control.positioned("~-5", "~-8", "~-5")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_4_level_1"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "4"), Control.positioned("~-6", "~-8", "~-6")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/80
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~0.5", "~", "0.4", "0.4", "0.4", "0.05", "1", "force"), Control.when("predicate", "mcm:random/25_percent")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/tail_lightning"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/81
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/82"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "16..83")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "operation", "@s", "mcm.its.dragon.health", "+=", "#healing_rate", "mcm.its.dragon.settings"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "16..85")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/82
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/83"), Control.positioned("^", "^0.5", "^-8.5"), Control.at("@n[tag=aj.impossible_dragon.locator.tail_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/83
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~0.5", "~", "0.4", "0.4", "0.4", "0.05", "1", "force"), Control.when("predicate", "mcm:random/25_percent")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/tail_lightning"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/84
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/85"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "16..63")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "operation", "@s", "mcm.its.dragon.health", "+=", "#healing_rate", "mcm.its.dragon.settings"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "16..65")));
        return 1;
    }
}
