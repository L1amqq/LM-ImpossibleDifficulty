package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled233 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/247", Compiled233::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/248", Compiled233::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/249", Compiled233::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/25", Compiled233::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/250", Compiled233::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/251", Compiled233::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/252", Compiled233::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/253", Compiled233::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/254", Compiled233::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/255", Compiled233::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/256", Compiled233::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/257", Compiled233::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/258", Compiled233::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/259", Compiled233::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/26", Compiled233::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/260", Compiled233::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/261", Compiled233::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/262", Compiled233::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/263", Compiled233::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/264", Compiled233::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/265", Compiled233::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/266", Compiled233::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/267", Compiled233::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/268", Compiled233::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/247
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying_forward"), Control.unless("score", "@s", "mcm.its.dragon.tutorial.stage", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/248
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s[scores={mcm.its.dragon.flight_speed=..-1}]", "mcm.its.dragon.flight_speed", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.flight_speed", "30"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/249
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/250"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/251"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "29"), Control.when("score", "@s", "mcm.its.dragon.tutorial.stage", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/254"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "5..279")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/263"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "280")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/264"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "280..283")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/265"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "284..287")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/266"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "288..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/267"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "50")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/unstun"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "265")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/268"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "290..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/25
    private static int f3(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "0", "-100", "0"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/250
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/stun_loop_heads_up/tween", "{to_frame:0,duration:5}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/251
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/252"), Control.dimension("minecraft:the_end"), Control.positioned("0", "65", "0"), Control.as("@a[distance=..300]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/253"), Control.as("@e[type=item_display,tag=mcm.crystal_tail,tag=mcm.crystal_tail.unbreakable]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.tutorial.stage", "3"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/252
    private static int f6(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u002a\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\" Hint:\",\"bold\":true,\"color\":\"#d9d134\",\"font\":\"minecraft:default\"},{\"text\":\" Deal some melee damage before the dragon wakes up again!\",\"color\":\"aqua\",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/display_hint"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/253
    private static int f7(Frame c) {
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/254
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/255"), Control.unless("entity", "@s[tag=mcm.its.dragon.stun_landed]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/256"), Control.when("entity", "@s[tag=mcm.its.dragon.stun_landed,tag=!mcm.its.dragon.stun_pose_set]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/255
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.5", "~"), Control.at("@s"), Control.when("block", "~", "~-0.5", "~", "#mcm:passable"), Control.when("block", "~1", "~-0.5", "~", "#mcm:passable"), Control.when("block", "~-1", "~-0.5", "~", "#mcm:passable"), Control.when("block", "~", "~-0.5", "~1", "#mcm:passable"), Control.when("block", "~", "~-0.5", "~-1", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.5", "~"), Control.at("@s"), Control.when("block", "~", "~-0.5", "~", "#mcm:passable"), Control.when("block", "~1", "~-0.5", "~", "#mcm:passable"), Control.when("block", "~-1", "~-0.5", "~", "#mcm:passable"), Control.when("block", "~", "~-0.5", "~1", "#mcm:passable"), Control.when("block", "~", "~-0.5", "~-1", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.25", "~"), Control.at("@s"), Control.when("block", "~", "~-0.25", "~", "#mcm:passable"), Control.when("block", "~1", "~-0.25", "~", "#mcm:passable"), Control.when("block", "~-1", "~-0.25", "~", "#mcm:passable"), Control.when("block", "~", "~-0.25", "~1", "#mcm:passable"), Control.when("block", "~", "~-0.25", "~-1", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.125", "~"), Control.at("@s"), Control.when("block", "~", "~-0.125", "~", "#mcm:passable"), Control.when("block", "~1", "~-0.125", "~", "#mcm:passable"), Control.when("block", "~-1", "~-0.125", "~", "#mcm:passable"), Control.when("block", "~", "~-0.125", "~1", "#mcm:passable"), Control.when("block", "~", "~-0.125", "~-1", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "mcm.its.dragon.stun_landed"), Control.at("@s"), Control.unless("block", "~", "~-0.125", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "mcm.its.dragon.stun_landed"), Control.at("@s"), Control.unless("block", "~1", "~-0.125", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "mcm.its.dragon.stun_landed"), Control.at("@s"), Control.unless("block", "~-1", "~-0.125", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "mcm.its.dragon.stun_landed"), Control.at("@s"), Control.unless("block", "~", "~-0.125", "~1", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "mcm.its.dragon.stun_landed"), Control.at("@s"), Control.unless("block", "~", "~-0.125", "~-1", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/256
    private static int f10(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.stun_pose_set"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#stun_pose", "mcm.temp", "4"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/257"), Control.unless("score", "@s", "mcm.its.dragon.head_count", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/260"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/stun_loop_heads_super_up/tween", "{to_frame:0,duration:4}"), Control.when("score", "#stun_pose", "mcm.temp", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/stun_loop_heads_up/tween", "{to_frame:0,duration:4}"), Control.when("score", "#stun_pose", "mcm.temp", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/stun_loop/tween", "{to_frame:0,duration:4}"), Control.when("score", "#stun_pose", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/stun_loop_heads_down/tween", "{to_frame:0,duration:4}"), Control.when("score", "#stun_pose", "mcm.temp", "matches", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#stun_pose"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/257
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#stun_pose", "mcm.temp", "2"), Control.when("block", "^", "^-0.0", "^3.75", "#mcm:passable"), Control.when("block", "^1", "^-0.0", "^3.75", "#mcm:passable"), Control.when("block", "^-1", "^-0.0", "^3.75", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/258"), Control.when("score", "#stun_pose", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/259"), Control.when("score", "#stun_pose", "mcm.temp", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/258
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#stun_pose", "mcm.temp", "1"), Control.when("block", "^", "^-0.9", "^3.75", "#mcm:passable"), Control.when("block", "^1", "^-0.9", "^3.75", "#mcm:passable"), Control.when("block", "^-1", "^-0.9", "^3.75", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/259
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#stun_pose", "mcm.temp", "3"), Control.when("block", "^", "^1.5", "^3.75", "#mcm:passable"), Control.when("block", "^1", "^1.5", "^3.75", "#mcm:passable"), Control.when("block", "^-1", "^1.5", "^3.75", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/26
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.attack_delay_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/27"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/260
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#stun_pose", "mcm.temp", "2"), Control.when("block", "^", "^-0.0", "^3.75", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/261"), Control.when("score", "#stun_pose", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/262"), Control.when("score", "#stun_pose", "mcm.temp", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/261
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#stun_pose", "mcm.temp", "1"), Control.when("block", "^", "^-0.9", "^3.75", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/262
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#stun_pose", "mcm.temp", "3"), Control.when("block", "^", "^1.5", "^3.75", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/263
    private static int f18(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/not_stunned/apply"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/fly/tween", "{to_frame:0,duration:8}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/264
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^0.1", "^0.07"), Control.at("@s"), Control.when("block", "~", "~1.5", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/265
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^0.3", "^0.15"), Control.at("@s"), Control.when("block", "~", "~1.5", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/266
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^0.5", "^0.15"), Control.at("@s"), Control.when("block", "~", "~1.5", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/267
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "160"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "200"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "230"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/268
    private static int f23(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.stun_landed"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.stun_pose_set"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.flight_speed", "200"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying_forward"));
        return 1;
    }
}
