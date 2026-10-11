package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled227 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/117", Compiled227::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/118", Compiled227::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/119", Compiled227::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/12", Compiled227::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/120", Compiled227::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/121", Compiled227::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/122", Compiled227::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/123", Compiled227::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/124", Compiled227::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/125", Compiled227::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/126", Compiled227::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/127", Compiled227::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/128", Compiled227::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/129", Compiled227::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/13", Compiled227::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/130", Compiled227::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/131", Compiled227::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/132", Compiled227::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/133", Compiled227::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/134", Compiled227::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/135", Compiled227::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/136", Compiled227::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/137", Compiled227::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/138", Compiled227::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/117
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/118"), Control.unless("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.destroyed]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/118
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/119"), Control.as("@e[type=end_crystal,distance=..1]"), Control.at("@s")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_invulnerable"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/activate"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/119
    private static int f2(Frame c) {
        Logic.step(() -> Native.summon(c, "end_crystal", "~", "~", "~", "{ShowBottom:1b}"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/12
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/13"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.dragon_spawn_point]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/120
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/121"), Control.positioned("^", "^-7", "^-2"), Control.at("@n[tag=aj.impossible_dragon.locator.tail_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/121
    private static int f5(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/shoot_lightning_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/122
    private static int f6(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/remove_jumppads"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.health", "-=", "#healing_interrupt_damage", "mcm.its.dragon.settings"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "83"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/123"), Control.as("@n[type=item_display,tag=mcm.vfx.flash_d]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/123
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{interpolation_duration:2,start_interpolation:0,transformation:{scale:[0f,0f,0f]}}"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.animation", "57"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/124
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
    // impossible_to_survive:mobs/impossible_dragon/zzz/125
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.flight_speed", "50"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/126
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/127"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.exit_portal_center]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/128"), Control.when("score", "#ifelse", "mcb.internal", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.flight_speed", "50"), Control.unless("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1000..")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.exit_portal_center,distance=..20]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/127
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.exit_portal_center]", "eyes"), Control.positioned("^", "^", "^0.1"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.9"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-0.01", "~"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/128
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "1"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "0", "80", "0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/129
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/130"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1..40")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/131"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "41")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/133"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "44")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "50"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1..")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "41..46")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "100"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1..")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "47..65")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~5", "~"), Control.at("@s")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "46..48")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~10", "~"), Control.at("@s")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "49..51")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~15", "~"), Control.at("@s")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "52..54")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~25", "~"), Control.at("@s")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "55..60")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~15", "~"), Control.at("@s")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "60..63")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~10", "~"), Control.at("@s")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "64..66")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~5", "~"), Control.at("@s")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "67..69")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/134"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "42..72")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/135"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "69")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/137"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "72")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/138"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "67..")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/13
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.its.dragon.setup.state", "6"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/summon"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/14"), Control.as("@e[type=item_display,tag=aj.impossible_dragon.root]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/130
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=1..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=5..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=20..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-20]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "50"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "41"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "5")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/131
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/lightning/tween", "{to_frame:5,duration:3}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_lightning_growl"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/132"), Control.as("@a[distance=..500]"), Control.at("@s"), Control.unless("score", "@s", "mcm.its.dragon.hint.lightning_counter", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/132
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.hint.lightning_counter", "1"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u002a\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\" Hint:\",\"bold\":true,\"color\":\"#d9d134\",\"font\":\"minecraft:default\"},{\"text\":\" Lightning bolts not only attack players but also target and destroy dragon tails. Place them nearby to protect yourself!\",\"color\":\"aqua\",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/display_hint"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/133
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/set_tail_enabled"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/134
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.2", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "42"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.5", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "43"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.8", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "44"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1.1", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "45"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1.5", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "46..59"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1.1", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "60"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.8", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "61"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.5", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "62"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.2", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "63"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.2", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "64"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.5", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "65"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.8", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "66"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1.2", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "67"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1.5", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "68"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1.2", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "69"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.8", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "70"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.5", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "71"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.2", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "72"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/135
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/136"), Control.as("@n[tag=aj.impossible_dragon.locator.tail_locator]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/136
    private static int f21(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.lightning_attack.shoot_point\"]}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/lightning/shoot_lightning_bolts"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/lightning/random_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/lightning/random_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/lightning/random_lightning_short"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/lightning/random_lightning_short"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/137
    private static int f22(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying_forward_high_waypoint"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_tail.protected"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/138
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.flight_speed", "50"));
        return 1;
    }
}
