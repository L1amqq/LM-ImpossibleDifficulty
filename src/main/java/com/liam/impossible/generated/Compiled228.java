package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled228 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/139", Compiled228::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/14", Compiled228::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/140", Compiled228::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/141", Compiled228::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/142", Compiled228::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/143", Compiled228::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/144", Compiled228::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/145", Compiled228::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/146", Compiled228::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/147", Compiled228::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/148", Compiled228::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/149", Compiled228::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/15", Compiled228::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/150", Compiled228::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/151", Compiled228::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/152", Compiled228::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/153", Compiled228::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/154", Compiled228::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/155", Compiled228::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/156", Compiled228::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/157", Compiled228::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/158", Compiled228::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/159", Compiled228::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/16", Compiled228::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/139
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_fireball_indicator"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/140"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1..20")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/143"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "22.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/144"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "25..199")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/145"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "25..260"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/147"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "200..250")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_fireball_roar"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "265")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/149"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "270")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/153"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "281")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/154"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "341")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/14
    private static int f1(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "0", "60", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~110", "0"), Control.at("@s")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/do_sleep"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/eyes_closed/apply"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/140
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-2"), Control.at("@s"), Control.when("entity", "@s[x_rotation=3..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~2"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=2..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-0.5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=1..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~0.5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/141"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "3..18")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/142"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "5..16")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "21"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-1..1]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/141
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=25..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-25]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/142
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-10"), Control.at("@s"), Control.when("entity", "@s[x_rotation=51..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~10"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-51]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/143
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[predicate=mcm:gm/vulnerable]", "eyes"), Control.positioned("^", "^", "^0.15"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.85"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.01", "0"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/144
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "mcm.its.dragon.activity.timer", "200"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "35..")), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "mcm.its.dragon.activity.timer", "200"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "75..")), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "mcm.its.dragon.activity.timer", "200"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "100..")), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "..1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/145
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/146"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.tail_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/146
    private static int f8(Frame c) {
        Logic.step(() -> Native.particle(c, "soul_fire_flame", "~", "~", "~", "0.6", "0.6", "0.6", "0.01", "2", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/147
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/148"), Control.when("score", "@s", "aj.hover.frame", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/148
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "251"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/shoot_fireball/tween", "{to_frame:2,duration:2}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_fireball"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/149
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@p[predicate=mcm:gm/vulnerable]", "add", "mcm.its.fireball_target"), Control.positioned("^", "^-5", "^20")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "#fireball_x_rotation", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/150"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/151"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/152"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "3")));
        Logic.step(() -> Native.tag(c, "@a", "remove", "mcm.its.fireball_target"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#fireball_x_rotation"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/15
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/16"), Control.when("entity", "@a[predicate=mcm:in_the_end]"), Control.dimension("minecraft:the_end"), Control.positioned("0", "60", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/18"), Control.when("score", "#ifelse", "mcb.internal", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/150
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#fireball_rot_offset", "mcm.temp", "5"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/shoot"), Control.as("@n[type=marker,tag=aj.impossible_dragon.locator.head_middle_locator]"), Control.at("@s"), Control.positioned("~", "~-0.5", "~")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#fireball_rot_offset"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/151
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#fireball_rot_offset", "mcm.temp", "-2"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/shoot"), Control.as("@n[type=marker,tag=aj.impossible_dragon.locator.head_right_locator]"), Control.at("@s"), Control.positioned("~", "~-0.5", "~")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#fireball_rot_offset", "mcm.temp", "2"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/shoot"), Control.as("@n[type=marker,tag=aj.impossible_dragon.locator.head_left_locator]"), Control.at("@s"), Control.positioned("~", "~-0.5", "~")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#fireball_rot_offset"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/152
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#fireball_rot_offset", "mcm.temp", "-1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/shoot"), Control.as("@n[type=marker,tag=aj.impossible_dragon.locator.head_right_locator]"), Control.at("@s"), Control.positioned("~", "~-0.5", "~")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#fireball_rot_offset", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/shoot"), Control.as("@n[type=marker,tag=aj.impossible_dragon.locator.head_middle_locator]"), Control.at("@s"), Control.positioned("~", "~-0.5", "~")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#fireball_rot_offset", "mcm.temp", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/shoot"), Control.as("@n[type=marker,tag=aj.impossible_dragon.locator.head_left_locator]"), Control.at("@s"), Control.positioned("~", "~-0.5", "~")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#fireball_rot_offset"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/153
    private static int f16(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/hover/tween", "{to_frame:12,duration:2}"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.activity.timer", "49"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.activity.timer", "29"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.activity.timer", "9"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/154
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/155
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/156"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/177"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/218"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "11")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/249"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "12")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/269"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "13")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/293"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "14")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/328"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "15")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/349"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "16")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/156
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_laser_wind_up"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/laser/select_target"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/157"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1..20")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/160"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "22.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/161"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "30..199")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/162"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "35..270"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/164"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "200..250")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:effects/target_indicator_a/summon"), Control.at("@n[type=marker,tag=mcm.its.dragon.laser_target.marker]")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "29"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/166"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "259")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_circle/summon"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "258"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "1"), Control.at("@n[tag=aj.impossible_dragon.locator.tail_locator,distance=..20]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/167"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "259..271")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/170"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "272..285")));
        Logic.step(() -> Control.run(c, x0 -> Native.stopsound(x0, "@a", "master", "minecraft:dragon.attack_laser_wind_up"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "260")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_laser_growl"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "268")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/173"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "281")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/174"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "290")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/175"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "359..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/176"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "361")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/157
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-2"), Control.at("@s"), Control.when("entity", "@s[x_rotation=3..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~2"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=2..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-0.5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=1..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~0.5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/158"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "3..18")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/159"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "5..16")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "22"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-1..1]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/158
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=25..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-25]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/159
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-10"), Control.at("@s"), Control.when("entity", "@s[x_rotation=51..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~10"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-51]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/16
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "1"));
        Logic.step(() -> Native.gamerule(c, "doMobSpawning", "false"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/17"), Control.as("@e[type=enderman,distance=..300]")));
        return 1;
    }
}
