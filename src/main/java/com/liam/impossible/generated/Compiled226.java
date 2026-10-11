package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled226 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/state/zzz/4", Compiled226::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/summon", Compiled226::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/tick_1s", Compiled226::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/0", Compiled226::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/1", Compiled226::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/10", Compiled226::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/100", Compiled226::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/101", Compiled226::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/102", Compiled226::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/103", Compiled226::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/104", Compiled226::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/105", Compiled226::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/106", Compiled226::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/107", Compiled226::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/108", Compiled226::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/109", Compiled226::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/11", Compiled226::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/110", Compiled226::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/111", Compiled226::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/112", Compiled226::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/113", Compiled226::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/114", Compiled226::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/115", Compiled226::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/116", Compiled226::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/state/zzz/4
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "-1000", "~"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/summon
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/summon", "{args:{}}"), Control.positioned("~", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/23"), Control.as("@e[type=item_display,tag=aj.impossible_dragon.root,distance=..0.1,tag=!mcm.initialized]"), Control.at("@s")));
        Logic.step(() -> Native.effect(c, "give", "@e[tag=mcm.its.dragon.hitbox]", "resistance", "infinite", "3", "true"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{item:{components:{\"minecraft:enchantment_glint_override\":true}}}"), Control.as("@e[tag=aj.impossible_dragon.bone.tail_end]")));
        Logic.step(() -> Native.bossbar(c, "add", "impossible_dragon", "[{\"text\":\"\\uFFF1\",\"font\":\"minecraft:bossbar_1\",\"color\":\"#4e5c24\"},{\"text\":\" \",\"font\":\"minecraft:default\"},{\"text\":\" \",\"font\":\"minecraft:default\"},{\"text\":\" \",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "color", "blue"));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "visible", "false"));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "max", "1000000"));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "style", "notched_10"));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "name", "[{\"text\":\"\\uFFF1\",\"font\":\"minecraft:bossbar_1\",\"color\":\"#4e5c24\"},{\"text\":\" \",\"font\":\"minecraft:default\"},{\"text\":\" \",\"font\":\"minecraft:default\"},{\"text\":\" \",\"font\":\"minecraft:default\"}]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/tick_1s
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/0"), Control.when("score", "#global", "mcm.its.dragon.setup.state", "matches", "0..5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/15"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/19"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/0
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/1"), Control.when("score", "#global", "mcm.its.dragon.setup.state", "matches", "0..1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/10"), Control.when("score", "#global", "mcm.its.dragon.setup.state", "matches", "2..5")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/1
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@a[predicate=mcm:in_the_end]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/2"), Control.dimension("minecraft:the_end"), Control.positioned("0", "60", "0"), Control.as("@e[type=end_crystal,distance=..500]"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "bedrock"), Control.when("block", "~", "~-2", "~", "obsidian"), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon.temp_setup.crystal,distance=..1]")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#dragon_setup_detected_crystals", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "#dragon_setup_detected_crystals", "mcm.temp", "1"), Control.as("@e[type=marker,tag=mcm.its.dragon.temp_setup.crystal]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/3"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/4"), Control.when("score", "#global", "mcm.its.dragon.setup.state", "matches", "0"), Control.dimension("minecraft:the_end"), Control.positioned("0", "60", "0"), Control.when("entity", "@e[type=ender_dragon]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/6"), Control.when("score", "#global", "mcm.its.dragon.setup.state", "matches", "1"), Control.when("score", "#dragon_setup_detected_crystals", "mcm.temp", "matches", "10..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/10
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "#global", "mcm.its.dragon.setup.state", "1"), Control.when("score", "#global", "mcm.its.dragon.setup.state", "matches", "..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/11"), Control.when("score", "#global", "mcm.its.dragon.setup.state", "matches", "5")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/100
    private static int f6(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/remove_jumppads"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.health", "-=", "#healing_interrupt_damage", "mcm.its.dragon.settings"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "123"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/101"), Control.as("@n[type=item_display,tag=mcm.vfx.flash_d]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/101
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{interpolation_duration:2,start_interpolation:0,transformation:{scale:[0f,0f,0f]}}"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.animation", "57"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/102
    private static int f8(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/remove_jumppads"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_healing_interrupted"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Native.tag(c, "@n[type=marker,tag=mcm.its.dragon_environment.heal_point.active,distance=..5]", "remove", "mcm.its.dragon_environment.heal_point.active"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.flight_speed", "300"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "..299")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_seek_healing"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_stage_transition"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_death_flying"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/103
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.flight_speed", "50"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/104
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/105"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "83")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/109"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "91"), Control.unless("entity", "@s[tag=mcm.its.dragon.crystal_healing_interrupted]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/111"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "21..82"), Control.when("entity", "@s[tag=mcm.its.dragon.crystal_healing_interrupted]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/113"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "104")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/114"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "94..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/105
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/106"), Control.positioned("^", "^", "^-20"), Control.as("@n[tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/106
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/107"), Control.unless("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.destroyed]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/107
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/108"), Control.as("@e[type=end_crystal,distance=..1]"), Control.at("@s")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_invulnerable"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/activate"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/108
    private static int f14(Frame c) {
        Logic.step(() -> Native.summon(c, "end_crystal", "~", "~", "~", "{ShowBottom:1b}"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/109
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/110"), Control.positioned("^", "^-7", "^-2"), Control.at("@n[tag=aj.impossible_dragon.locator.tail_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/11
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/12"), Control.when("entity", "@a[predicate=mcm:in_the_end]"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.dragon_spawn_point]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/110
    private static int f17(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/shoot_lightning_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/111
    private static int f18(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/remove_jumppads"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.health", "-=", "#healing_interrupt_damage", "mcm.its.dragon.settings"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "103"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/112"), Control.as("@n[type=item_display,tag=mcm.vfx.flash_d]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/112
    private static int f19(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{interpolation_duration:2,start_interpolation:0,transformation:{scale:[0f,0f,0f]}}"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.animation", "57"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/113
    private static int f20(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/remove_jumppads"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_healing_interrupted"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Native.tag(c, "@n[type=marker,tag=mcm.its.dragon_environment.heal_point.active,distance=..5]", "remove", "mcm.its.dragon_environment.heal_point.active"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.flight_speed", "300"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "..299")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_seek_healing"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_stage_transition"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_death_flying"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/114
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.flight_speed", "50"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/115
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/116"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "63")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/120"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "71"), Control.unless("entity", "@s[tag=mcm.its.dragon.crystal_healing_interrupted]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/122"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "21..62"), Control.when("entity", "@s[tag=mcm.its.dragon.crystal_healing_interrupted]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/124"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "84")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/125"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "74..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/116
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/117"), Control.positioned("^", "^", "^-20"), Control.as("@n[tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s")));
        return 1;
    }
}
