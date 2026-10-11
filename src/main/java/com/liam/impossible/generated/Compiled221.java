package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled221 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/40", Compiled221::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/41", Compiled221::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/42", Compiled221::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/5", Compiled221::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/6", Compiled221::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/7", Compiled221::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/8", Compiled221::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/zzz/9", Compiled221::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/body", Compiled221::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/head_left", Compiled221::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/head_middle", Compiled221::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/head_right", Compiled221::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/tail", Compiled221::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/0", Compiled221::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/1", Compiled221::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/10", Compiled221::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/2", Compiled221::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/3", Compiled221::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/4", Compiled221::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/5", Compiled221::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/6", Compiled221::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/7", Compiled221::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/8", Compiled221::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/9", Compiled221::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/40
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~10", "~"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~-11", "~", "minecraft:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.unless("block", "~", "~-12", "~", "minecraft:end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~-11", "~", "minecraft:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.unless("block", "~", "~-12", "~", "minecraft:end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~-11", "~", "minecraft:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.unless("block", "~", "~-12", "~", "minecraft:end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~-11", "~", "minecraft:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.unless("block", "~", "~-12", "~", "minecraft:end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~-11", "~", "minecraft:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.unless("block", "~", "~-12", "~", "minecraft:end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~-11", "~", "minecraft:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.unless("block", "~", "~-12", "~", "minecraft:end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~-11", "~", "minecraft:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.unless("block", "~", "~-12", "~", "minecraft:end_stone")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/41
    private static int f1(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~20", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~10", "~"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.waypoint.outer]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/42
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.crystal_y_level"), Control.store("result", "entity", "@s", "Pos[1]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_invulnerable"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/summon"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.fill(x0, "~-2", "~-2", "~-2", "~2", "~1", "~2", "air", "replace", "iron_bars"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/5
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#global", "mcm.its.dragon.height_fog_limit_1", "9"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#global", "mcm.its.dragon.height_fog_limit_2", "15"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#global", "mcm.its.dragon.height_fog_limit_2"), Control.store("result", "storage", "mcm:impossible_dragon", "fog_y_limit", "int", "1")));
        Logic.step(() -> Native.setblock(c, "~", "~1", "~", "air"));
        Logic.step(() -> Native.fill(c, "~-2", "~-3", "~-2", "~2", "~-3", "~2", "air", "replace", "end_portal"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/6
    private static int f4(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/7"), Control.at("@s"), Control.positioned("^", "^", "^18")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/10"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/7
    private static int f5(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.init\",\"mcm.dragon_spawn_point_check\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/8"), Control.as("@e[type=marker,tag=mcm.dragon_spawn_point_check,tag=mcm.init]")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#highest", "mcm.its.dragon.spawnpoint_priority", "-1000"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "operation", "#highest", "mcm.its.dragon.spawnpoint_priority", ">", "@s", "mcm.its.dragon.spawnpoint_priority"), Control.as("@e[type=marker,tag=mcm.dragon_spawn_point_check]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "mcm.its.dragon.best_spawnpoint_candidate"), Control.as("@e[type=marker,tag=mcm.dragon_spawn_point_check]"), Control.when("score", "@s", "mcm.its.dragon.spawnpoint_priority", "=", "#highest", "mcm.its.dragon.spawnpoint_priority")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "@n[type=marker,tag=mcm.its.dragon.best_spawnpoint_candidate]"), Control.positioned("^", "^", "^4")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.dragon_spawn_point_check]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/8
    private static int f6(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.spreadplayers(c, "~", "~", "2", "12", "false", "@s"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/zzz/9"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/zzz/9
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.spawnpoint_priority", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~", "~", "~1", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~", "~", "~-1", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~-1", "~", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~1", "~", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~1", "~", "~1", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~-1", "~", "~-1", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~-1", "~", "~1", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~1", "~", "~-1", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "6"), Control.when("block", "~", "~", "~2", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "6"), Control.when("block", "~", "~", "~-2", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "6"), Control.when("block", "~-2", "~", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "6"), Control.when("block", "~2", "~", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~", "~-1", "~1", "air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~", "~-1", "~-1", "air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~-1", "~-1", "~", "air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~1", "~-1", "~", "air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~1", "~-1", "~1", "air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~-1", "~-1", "~-1", "air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~-1", "~-1", "~1", "air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "20"), Control.when("block", "~1", "~-1", "~-1", "air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "6"), Control.when("block", "~", "~-1", "~2", "air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "6"), Control.when("block", "~", "~-1", "~-2", "air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "6"), Control.when("block", "~-2", "~-1", "~", "air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "6"), Control.when("block", "~2", "~-1", "~", "air")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.spawnpoint_priority", "10"), Control.when("block", "~2", "~", "~2", "air"), Control.when("block", "~-2", "~", "~-2", "air"), Control.when("block", "~-2", "~", "~2", "air"), Control.when("block", "~2", "~", "~-2", "air"), Control.when("block", "~3", "~-1", "~", "end_stone"), Control.when("block", "~-3", "~-1", "~", "end_stone"), Control.when("block", "~", "~-1", "~3", "end_stone"), Control.when("block", "~", "~-1", "~-3", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.spawnpoint_priority", "5"), Control.when("block", "~3", "~", "~3", "air"), Control.when("block", "~-3", "~", "~-3", "air"), Control.when("block", "~-3", "~", "~3", "air"), Control.when("block", "~3", "~", "~-3", "air"), Control.when("block", "~4", "~-1", "~", "end_stone"), Control.when("block", "~-4", "~-1", "~", "end_stone"), Control.when("block", "~", "~-1", "~4", "end_stone"), Control.when("block", "~", "~-1", "~-4", "end_stone")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/body
    private static int f8(Frame c) {
        Logic.step(() -> Native.advancement(c, "revoke", "@s", "only", "impossible_to_survive:impossible_dragon/damaged_hitbox_body"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/0"), Control.as("@n[type=item_display,tag=aj.impossible_dragon.root,distance=..300]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("score", "#temp", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/1"), Control.as("@n[type=pig,tag=mcm.its.dragon.hitbox.big,distance=..300]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/head_left
    private static int f9(Frame c) {
        Logic.step(() -> Native.advancement(c, "revoke", "@s", "only", "impossible_to_survive:impossible_dragon/damaged_hitbox_head_left"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/5"), Control.as("@n[type=item_display,tag=aj.impossible_dragon.root,distance=..300]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("score", "#temp", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/6"), Control.as("@n[type=pig,tag=mcm.its.dragon.hitbox.head.left,distance=..300]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/head_middle
    private static int f10(Frame c) {
        Logic.step(() -> Native.advancement(c, "revoke", "@s", "only", "impossible_to_survive:impossible_dragon/damaged_hitbox_head_middle"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/7"), Control.as("@n[type=item_display,tag=aj.impossible_dragon.root,distance=..300]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("score", "#temp", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/8"), Control.as("@n[type=pig,tag=mcm.its.dragon.hitbox.head.middle,distance=..300]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/head_right
    private static int f11(Frame c) {
        Logic.step(() -> Native.advancement(c, "revoke", "@s", "only", "impossible_to_survive:impossible_dragon/damaged_hitbox_head_right"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/9"), Control.as("@n[type=item_display,tag=aj.impossible_dragon.root,distance=..300]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("score", "#temp", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/10"), Control.as("@n[type=pig,tag=mcm.its.dragon.hitbox.head.right,distance=..300]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/tail
    private static int f12(Frame c) {
        Logic.step(() -> Native.advancement(c, "revoke", "@s", "only", "impossible_to_survive:impossible_dragon/damaged_hitbox_tail"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/2"), Control.as("@n[type=item_display,tag=aj.impossible_dragon.root,distance=..300]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("score", "#temp", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/3"), Control.as("@n[type=pig,tag=mcm.its.dragon.hitbox.tail,distance=..300]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/0
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.when("entity", "@s[tag=mcm.its.dragon.invulnerable]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/1
    private static int f14(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/hitbox/process_hitbox_damage"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/hit_body"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/hurt_growl"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~2", "~", "0.5", "0.5", "0.5", "0.4", "5", "force"));
        Logic.step(() -> Native.particle(c, "crit", "~", "~2", "~", "1.3", "1.3", "1.3", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:obsidian\"}", "~", "~2", "~", "1.5", "1.5", "1.5", "0.1", "20", "force"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:black_dye\"}", "~", "~2", "~", "1.5", "1.5", "1.5", "0.1", "20", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#damage_dealt"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/10
    private static int f15(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/hitbox/process_hitbox_damage"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/hit_head"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/hurt_growl"));
        Logic.step(() -> Native.particle(c, "crit", "~", "~0.6", "~", "0.5", "0.5", "0.5", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "witch", "~", "~0.4", "~", "0.5", "0.5", "0.5", "1", "5", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_a/summon"), Control.positioned("~", "~0.6", "~")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#damage_dealt"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/2
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.when("entity", "@s[tag=mcm.its.dragon.invulnerable]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/3
    private static int f17(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/hitbox/process_hitbox_damage"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/hit_crystal_tail"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/hurt_growl"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:amethyst_shard\"}", "~", "~0.65", "~", "0.5", "0.5", "0.5", "0.1", "30", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:amethyst_block\"}", "~", "~0.65", "~", "0.5", "0.5", "0.5", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "crit", "~", "~0.65", "~", "0.5", "0.5", "0.5", "0.1", "5", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_a/summon"), Control.positioned("~", "~0.65", "~")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.tail_damage_received", "+=", "#damage_dealt", "mcm.temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.as("@n[type=item_display,tag=aj.impossible_dragon.root,distance=..300]"), Control.when("entity", "@s[tag=mcm.its.dragon.crystal_tail.protected]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/4"), Control.when("score", "@s", "mcm.its.dragon.tail_damage_received", ">=", "#tail_drop_damage_threshhold", "mcm.its.dragon.settings")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#damage_dealt"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/4
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.tail_damage_received", "0"));
        Logic.step(() -> Native.loot(c, "spawn", "~", "~", "~", "loot", "impossible_to_survive:crystal_tail"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/destroy_crystal_tail"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/set_tail_disabled"), Control.as("@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/5
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.when("entity", "@s[tag=mcm.its.dragon.invulnerable]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/6
    private static int f20(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/hitbox/process_hitbox_damage"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/hit_head"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/hurt_growl"));
        Logic.step(() -> Native.particle(c, "crit", "~", "~0.6", "~", "0.5", "0.5", "0.5", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "witch", "~", "~0.4", "~", "0.5", "0.5", "0.5", "1", "5", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_a/summon"), Control.positioned("~", "~0.6", "~")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#damage_dealt"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/7
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.when("entity", "@s[tag=mcm.its.dragon.invulnerable]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/8
    private static int f22(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/hitbox/process_hitbox_damage"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/hit_head"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/hurt_growl"));
        Logic.step(() -> Native.particle(c, "crit", "~", "~0.6", "~", "0.5", "0.5", "0.5", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "witch", "~", "~0.4", "~", "0.5", "0.5", "0.5", "1", "5", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_a/summon"), Control.positioned("~", "~0.6", "~")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#damage_dealt"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/zzz/9
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.when("entity", "@s[tag=mcm.its.dragon.invulnerable]")));
        return 1;
    }
}
