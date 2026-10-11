package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled234 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/269", Compiled234::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/27", Compiled234::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/270", Compiled234::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/271", Compiled234::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/272", Compiled234::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/273", Compiled234::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/274", Compiled234::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/275", Compiled234::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/276", Compiled234::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/277", Compiled234::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/278", Compiled234::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/279", Compiled234::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/28", Compiled234::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/280", Compiled234::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/281", Compiled234::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/282", Compiled234::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/283", Compiled234::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/284", Compiled234::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/285", Compiled234::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/286", Compiled234::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/287", Compiled234::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/288", Compiled234::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/289", Compiled234::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/29", Compiled234::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/269
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/270"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/285"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/27
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/28"), Control.when("entity", "@s[tag=mcm.its.dragon.initiate_seek_healing]"), Control.when("entity", "@a[distance=..300]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/29"), Control.when("entity", "@s[tag=mcm.its.dragon.initiate_stage_transition]"), Control.when("entity", "@a[distance=..300]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/30"), Control.when("entity", "@s[tag=mcm.its.dragon.initiate_death_flying]"), Control.when("entity", "@a[distance=..300]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/270
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.sub_activity.timer", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/271"), Control.when("score", "@s", "mcm.its.dragon.sub_activity.timer", "matches", "1..25")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/stage_transition"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "21")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/impossible_dragon/state/set_tail_enabled"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "22")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/274"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "25")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/explosion"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "107"), Control.positioned("~", "~1", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/276"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "108..109")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/277"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "109")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/278"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "25..100")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/283"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "115..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/end_crystal_reactivate"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "115")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/end_crystal_reactivate_quiet"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "117")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/end_crystal_reactivate_quiet"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "120")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/284"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "127..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/271
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=3..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-0.5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=2..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~0.5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-0.25"), Control.at("@s"), Control.when("entity", "@s[x_rotation=1..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~0.25"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/272"), Control.when("score", "@s", "mcm.its.dragon.sub_activity.timer", "matches", "3..18")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/273"), Control.when("score", "@s", "mcm.its.dragon.sub_activity.timer", "matches", "5..16")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "100"), Control.when("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1..")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/272
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-2"), Control.at("@s"), Control.when("entity", "@s[x_rotation=25..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~2"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-25]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/273
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=51..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-51]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/274
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/275"), Control.at("@s"), Control.positioned("^", "^-1.5", "^2.75")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/275
    private static int f7(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[mcm.its.dragon.charge_tail_marker]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/flash_e/summon"), Control.positioned("~", "~", "~")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/276
    private static int f8(Frame c) {
        Logic.step(() -> Native.particle(c, "explosion_emitter", "~", "~1", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/random_lightning_long"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/277
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/set_1_head"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/set_2_heads"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/screen_shake/apply_recharge_explosion"), Control.as("@a[distance=..150]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/278
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/279"), Control.as("@e[type=marker,tag=mcm.its.dragon.charge_tail_marker,distance=..15]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.health", "13158"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/279
    private static int f11(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "@n[tag=aj.impossible_dragon.locator.tail_locator,distance=..5]"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/280"), Control.when("score", "@s", "mcm.lifetime", "matches", "5..30"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/281"), Control.when("score", "@s", "mcm.lifetime", "matches", "5..60"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/282"), Control.when("score", "@s", "mcm.lifetime", "matches", "15..83"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/28
    private static int f12(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_seek_healing"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..125"), Control.store("result", "score", "@s", "mcm.its.dragon.attack_delay_timer")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.attack_delay_timer", "100"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/seek_healing"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/280
    private static int f13(Frame c) {
        Logic.step(() -> Native.particle(c, "portal", "~", "~", "~", "0", "0", "0", "1.9", "15", "force"));
        Logic.step(() -> Native.particle(c, "portal", "~", "~", "~", "0", "0", "0", "5", "40", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/281
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "-90..90"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..360"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "soul_fire_flame", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.at("@s"), Control.positioned("^", "^", "^20")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "soul_fire_flame", "~", "~", "~", "^", "^", "^10000000", "0.00000002", "0", "force"), Control.at("@s"), Control.positioned("^", "^", "^-4")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "soul_fire_flame", "~", "~", "~", "^", "^", "^10000000", "0.00000006", "0", "force"), Control.at("@s"), Control.positioned("^", "^", "^-9")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "-90..90"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..360"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "soul_fire_flame", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.at("@s"), Control.positioned("^", "^", "^20")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "soul_fire_flame", "~", "~", "~", "^", "^", "^10000000", "0.00000002", "0", "force"), Control.at("@s"), Control.positioned("^", "^", "^-4")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/282
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/random_lightning_short"), Control.when("predicate", "mcm:random/100_percent")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/stage_transition/random_lightning_long"), Control.when("predicate", "mcm:random/50_percent")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/283
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s[scores={mcm.its.dragon.flight_speed=..950}]", "mcm.its.dragon.flight_speed", "50"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.health", "1000000"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/284
    private static int f17(Frame c) {
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.its.dragon.charge_tail_marker]"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.invulnerable"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying_forward"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_seek_healing"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_stage_transition"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_death_flying"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/285
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/286"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=20..90]")), Control.at("@s"), Control.when("block", "~", "~-7", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-20..90]")), Control.at("@s"), Control.when("block", "~", "~-2", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "add", "@s", "mcm.its.dragon.flight_speed", "100"), Control.unless("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1000..")), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.stage_transition_point,distance=20..]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.flight_speed", "50"), Control.unless("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1000..")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/291"), Control.unless("score", "#stage_transition_arrive_sfx", "mcm.misc", "matches", "1"), Control.at("@s"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.stage_transition_point,distance=..8]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/292"), Control.at("@s"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.stage_transition_point,distance=..5]")));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "2", "2", "2", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~1", "~", "2", "2", "2", "0.1", "1", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/286
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/287"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.stage_transition_point,distance=20..]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/288"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.stage_transition_point,distance=10..20]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/289"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.stage_transition_point,distance=3..10]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/290"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.stage_transition_point,distance=..3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-0.02", "~"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/287
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.stage_transition_point]", "eyes"), Control.positioned("^", "^", "^0.15"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.85"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "59.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=60..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "-69.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-70]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/288
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.stage_transition_point]", "eyes"), Control.positioned("^", "^", "^0.25"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.75"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/289
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.stage_transition_point]", "eyes"), Control.positioned("^", "^", "^0.5"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.5"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/29
    private static int f23(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_stage_transition"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..125"), Control.store("result", "score", "@s", "mcm.its.dragon.attack_delay_timer")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.attack_delay_timer", "100"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/do_stage_transition"));
        return 1;
    }
}
