package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled236 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/311", Compiled236::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/312", Compiled236::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/313", Compiled236::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/314", Compiled236::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/315", Compiled236::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/316", Compiled236::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/317", Compiled236::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/318", Compiled236::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/319", Compiled236::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/32", Compiled236::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/320", Compiled236::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/321", Compiled236::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/322", Compiled236::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/323", Compiled236::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/324", Compiled236::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/325", Compiled236::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/326", Compiled236::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/327", Compiled236::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/328", Compiled236::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/329", Compiled236::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/33", Compiled236::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/330", Compiled236::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/331", Compiled236::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/332", Compiled236::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/311
    private static int f0(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_dash_bite"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#attack_dash_bite_sfx", "mcm.misc", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/312
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.player_dash_hit_cd", "25"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "12", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "14", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/313
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.dash_count", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/314"), Control.unless("score", "@s", "mcm.its.dragon.dash_count", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/315"), Control.when("score", "@s", "mcm.its.dragon.dash_count", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/314
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#attack_dash_bite_sfx"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/fly/tween", "{to_frame:0,duration:5}"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.flight_speed", "1000"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Native.tag(c, "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.high,distance=40..]", "add", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.player_dash_hit_cd", "0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/315
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#attack_dash_bite_sfx"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.flight_speed", "1000"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/316
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/317"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1..299")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/318"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "300..499")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/317
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.1"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1..99")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.2"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "100..199")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.3"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "200..299")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/318
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.4"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "300..399")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.5"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "400..499")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/319
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/320"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "500..799")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/321"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "800..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/32
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "60..330"), Control.store("result", "score", "@s", "mcm.its.dragon.attack_delay_timer")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.attack_delay_timer", "100"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.attack_delay_timer", "60"), Control.when("predicate", "mcm:random/10_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.attack_delay_timer", "45"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "3..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.attack_delay_timer", "90"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.attack_delay_timer", "20"), Control.when("predicate", "mcm:random/2_percent")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/320
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.6"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "500..599")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.7"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "600..699")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.8"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "700..799")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/321
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.9"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "800..899")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1.0"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "900..999")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/322
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/323"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1000..1299")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/324"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1300..1499")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/323
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1.1"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1000..1099")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1.2"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1100..1199")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1.3"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1200..1299")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/324
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1.4"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1300..1399")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1.5"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1400..1499")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/325
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/326"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1500..1799")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/327"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1800..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/326
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1.6"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1500..1599")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1.7"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1600..1699")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1.8"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1700..1799")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/327
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1.9"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1800..1899")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^2.0"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1900..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/328
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/329"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/334"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/329
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tag(x1, "@s", "add", "mcm.its.dragon_environment.waypoint.active"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.waypoint,sort=random,limit=1]"), Control.at("@s")), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "eyes"), Control.positioned("^", "^", "^0.085"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.915"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-0.01", "~"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/330"), Control.when("entity", "@s[x_rotation=50..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "59.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=60..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "-69.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-70]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=20..90]")), Control.at("@s"), Control.when("block", "~", "~-7", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-20..90]")), Control.at("@s"), Control.when("block", "~", "~-2", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/331"), Control.at("@s"), Control.when("block", "^", "^", "^10", "obsidian")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.flight_speed", "50"), Control.unless("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1000..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.flight_speed", "-1"), Control.unless("entity", "@a[distance=..300]")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/333"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=..11]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/33
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "40..230"), Control.store("result", "score", "@s", "mcm.its.dragon.attack_delay_timer")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.attack_delay_timer", "100"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.attack_delay_timer", "50"), Control.when("predicate", "mcm:random/10_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.attack_delay_timer", "45"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "3..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.attack_delay_timer", "90"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.attack_delay_timer", "20"), Control.when("predicate", "mcm:random/5_percent")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/330
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "eyes"), Control.positioned("^", "^", "^0.1"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.9"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/331
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/332"), Control.positioned("^-10", "^", "^-20")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/332
    private static int f23(Frame c) {
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Native.tag(c, "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.inner]", "add", "mcm.its.dragon_environment.waypoint.active"));
        return 1;
    }
}
