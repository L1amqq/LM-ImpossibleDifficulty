package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled220 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/19", Compiled220::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/2", Compiled220::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/20", Compiled220::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/21", Compiled220::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/22", Compiled220::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/23", Compiled220::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/24", Compiled220::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/25", Compiled220::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/26", Compiled220::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/27", Compiled220::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/28", Compiled220::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/29", Compiled220::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/3", Compiled220::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/30", Compiled220::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/31", Compiled220::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/32", Compiled220::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/33", Compiled220::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/34", Compiled220::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/35", Compiled220::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/36", Compiled220::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/37", Compiled220::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/38", Compiled220::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/39", Compiled220::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/4", Compiled220::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/19
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.1", "mcm.position.x", "=", "#result", "mcm.position.x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.1", "mcm.position.z", "=", "#result", "mcm.position.z"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/2
    private static int f1(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon_environment.heal_point.destroyed"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon_environment.heal_point.active"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/20
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.2", "mcm.position.x", "=", "#result", "mcm.position.x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.2", "mcm.position.z", "=", "#result", "mcm.position.z"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/21
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.3", "mcm.position.x", "=", "#result", "mcm.position.x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.3", "mcm.position.z", "=", "#result", "mcm.position.z"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/22
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.4", "mcm.position.x", "=", "#result", "mcm.position.x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.4", "mcm.position.z", "=", "#result", "mcm.position.z"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/23
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.5", "mcm.position.x", "=", "#result", "mcm.position.x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.5", "mcm.position.z", "=", "#result", "mcm.position.z"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/24
    private static int f6(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.6", "mcm.position.x", "=", "#result", "mcm.position.x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.6", "mcm.position.z", "=", "#result", "mcm.position.z"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/25
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.7", "mcm.position.x", "=", "#result", "mcm.position.x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.7", "mcm.position.z", "=", "#result", "mcm.position.z"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/26
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.8", "mcm.position.x", "=", "#result", "mcm.position.x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.8", "mcm.position.z", "=", "#result", "mcm.position.z"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/27
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.9", "mcm.position.x", "=", "#result", "mcm.position.x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.9", "mcm.position.z", "=", "#result", "mcm.position.z"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/28
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.10", "mcm.position.x", "=", "#result", "mcm.position.x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#crystal.10", "mcm.position.z", "=", "#result", "mcm.position.z"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/29
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/30"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/31"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/32"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/33"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/34"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/35"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.6]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/36"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.7]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/37"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.8]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/38"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.9]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/39"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.10]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "facing", "0", "80", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^17"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.inner]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^-20"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.outer]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#exit_portal_top", "mcm.position.y"), Control.store("result", "entity", "@s", "Pos[1]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/40"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.low]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/41"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.high]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.unless("block", "~", "~", "~", "minecraft:air")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/3
    private static int f12(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/4"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.exit_portal_center]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/6"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.dragon_spawn_point]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/11"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/30
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.1", "mcm.position.x"), Control.store("result", "entity", "@s", "Pos[0]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.1", "mcm.position.z"), Control.store("result", "entity", "@s", "Pos[2]", "double", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/31
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.2", "mcm.position.x"), Control.store("result", "entity", "@s", "Pos[0]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.2", "mcm.position.z"), Control.store("result", "entity", "@s", "Pos[2]", "double", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/32
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.3", "mcm.position.x"), Control.store("result", "entity", "@s", "Pos[0]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.3", "mcm.position.z"), Control.store("result", "entity", "@s", "Pos[2]", "double", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/33
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.4", "mcm.position.x"), Control.store("result", "entity", "@s", "Pos[0]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.4", "mcm.position.z"), Control.store("result", "entity", "@s", "Pos[2]", "double", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/34
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.5", "mcm.position.x"), Control.store("result", "entity", "@s", "Pos[0]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.5", "mcm.position.z"), Control.store("result", "entity", "@s", "Pos[2]", "double", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/35
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.6", "mcm.position.x"), Control.store("result", "entity", "@s", "Pos[0]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.6", "mcm.position.z"), Control.store("result", "entity", "@s", "Pos[2]", "double", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/36
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.7", "mcm.position.x"), Control.store("result", "entity", "@s", "Pos[0]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.7", "mcm.position.z"), Control.store("result", "entity", "@s", "Pos[2]", "double", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/37
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.8", "mcm.position.x"), Control.store("result", "entity", "@s", "Pos[0]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.8", "mcm.position.z"), Control.store("result", "entity", "@s", "Pos[2]", "double", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/38
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.9", "mcm.position.x"), Control.store("result", "entity", "@s", "Pos[0]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.9", "mcm.position.z"), Control.store("result", "entity", "@s", "Pos[2]", "double", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/39
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.10", "mcm.position.x"), Control.store("result", "entity", "@s", "Pos[0]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#crystal.10", "mcm.position.z"), Control.store("result", "entity", "@s", "Pos[2]", "double", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/4
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~20", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~10", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~10", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/recursive_tp_to_exit_portal"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]"), Control.store("result", "score", "#exit_portal_top", "mcm.position.y")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]"), Control.store("result", "score", "#global", "mcm.its.dragon.height_fog_limit_1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]"), Control.store("result", "score", "#global", "mcm.its.dragon.height_fog_limit_2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/5"), Control.at("@s")));
        return 1;
    }
}
