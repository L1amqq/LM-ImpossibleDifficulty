package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled229 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/160", Compiled229::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/161", Compiled229::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/162", Compiled229::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/163", Compiled229::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/164", Compiled229::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/165", Compiled229::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/166", Compiled229::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/167", Compiled229::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/168", Compiled229::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/169", Compiled229::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/17", Compiled229::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/170", Compiled229::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/171", Compiled229::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/172", Compiled229::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/173", Compiled229::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/174", Compiled229::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/175", Compiled229::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/176", Compiled229::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/177", Compiled229::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/178", Compiled229::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/179", Compiled229::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/18", Compiled229::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/180", Compiled229::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/181", Compiled229::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/160
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon.laser_target.marker]", "eyes"), Control.positioned("^", "^", "^0.15"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.85"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.01", "0"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/161
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "mcm.its.dragon.activity.timer", "200"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "30..")), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "mcm.its.dragon.activity.timer", "200"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "50..")), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "mcm.its.dragon.activity.timer", "200"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "70..")), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "..1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/162
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/163"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.tail_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/163
    private static int f3(Frame c) {
        Logic.step(() -> Native.particle(c, "minecraft:trial_spawner_detection_ominous", "~", "~", "~", "0.6", "0.6", "0.6", "0.01", "3", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/164
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/165"), Control.when("score", "@s", "aj.hover.frame", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/165
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "251"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/laser/tween", "{to_frame:3,duration:3}"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.animation", "200"), Control.as("@e[type=item_display,tag=mcm.vfx.target_indicator_a]")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_laser"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/166
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "#root_x_rotation", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_g/summon"), Control.positioned("^", "^7.0", "^0.2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/flash_a/summon"), Control.positioned("^", "^7.0", "^0.2")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/167
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/168"), Control.as("@n[type=item_display,tag=mcm.vfx.impact_g]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/169"), Control.as("@n[type=item_display,tag=mcm.vfx.flash_a]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/168
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.head_middle_locator]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^0.9", "^0.3"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/169
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.head_middle_locator]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^0.9", "^0.3"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/17
    private static int f10(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "-100", "~"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/170
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/171"), Control.as("@n[type=item_display,tag=mcm.vfx.impact_g]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/172"), Control.as("@n[type=item_display,tag=mcm.vfx.flash_a]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/171
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.head_middle_locator]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^0.9", "^0.6"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/172
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.head_middle_locator]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^0.9", "^0.6"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/173
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "#laser_x_rotation", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/laser/shoot_main"), Control.at("@s"), Control.positioned("^", "^2.5", "^3.2")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#laser_x_rotation"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/174
    private static int f15(Frame c) {
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.its.dragon.laser_target.marker]"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/hover/tween", "{to_frame:5,duration:5}"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.activity.timer", "49"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.activity.timer", "29"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.activity.timer", "9"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/175
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.flight_speed", "20"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/176
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/177
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/178"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/186"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/192"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/212"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/178
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/179"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/184"), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.perch_point,distance=..2]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=20..90]")), Control.at("@s"), Control.when("block", "~", "~-7", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-20..90]")), Control.at("@s"), Control.when("block", "~", "~-2", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "add", "@s", "mcm.its.dragon.flight_speed", "20"), Control.unless("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1000..")), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.perch_point,distance=..3]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "40"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "800..")), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.perch_point,distance=..10]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "50"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "500..")), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.perch_point,distance=..4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/185"), Control.at("@s"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.perch_point,distance=..1.5]")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/179
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/180"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.perch_point,distance=20..]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/181"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.perch_point,distance=10..20]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/182"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.perch_point,distance=4..10]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/183"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.perch_point,distance=..4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-0.01", "~"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/18
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "1"));
        Logic.step(() -> Native.gamerule(c, "doMobSpawning", "true"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/180
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.perch_point]", "eyes"), Control.positioned("^", "^", "^0.1"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.9"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/181
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.perch_point]", "eyes"), Control.positioned("^", "^", "^0.25"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.75"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
}
