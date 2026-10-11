package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled212 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/1", Compiled212::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/10", Compiled212::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/11", Compiled212::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/12", Compiled212::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/13", Compiled212::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/14", Compiled212::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/15", Compiled212::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/16", Compiled212::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/17", Compiled212::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/18", Compiled212::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/19", Compiled212::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/2", Compiled212::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/20", Compiled212::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/21", Compiled212::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/22", Compiled212::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/23", Compiled212::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/3", Compiled212::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/4", Compiled212::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/5", Compiled212::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/6", Compiled212::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/7", Compiled212::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/8", Compiled212::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/9", Compiled212::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/lightning/random_lightning", Compiled212::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/1
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/2"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/10
    private static int f1(Frame c) {
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.low,limit=7,sort=nearest]", "add", "mcm.exclude"));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.laser_target.marker\"]}"), Control.as("@n[type=marker,tag=mcm.its.dragon_environment.waypoint.low,tag=!mcm.exclude]"), Control.at("@s"), Control.positioned("over", "world_surface")));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.low,tag=mcm.exclude]", "remove", "mcm.exclude"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/11
    private static int f2(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.this.target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/12
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=mcm.this.target]", "eyes"), Control.positioned("^", "^", "^0.175"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.825"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/13
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=mcm.this.target]", "eyes"), Control.positioned("^", "^", "^0.2"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.8"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/14
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=mcm.this.target]", "eyes"), Control.positioned("^", "^", "^0.3"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.7"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/15
    private static int f6(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p[tag=mcm.this.target]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/16
    private static int f7(Frame c) {
        Logic.step(() -> Native.particle(c, "dust{color:[0.99,0.2,0.99],scale:0.9}", "^", "^", "^", "0.05", "0.05", "0.05", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "dust{color:[0.99,0.2,0.99],scale:1.5}", "^", "^", "^-0.4", "0.05", "0.05", "0.05", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "end_rod", "^", "^", "^", "0.05", "0.05", "0.05", "0.05", "1", "force"));
        Logic.step(() -> Native.particle(c, "firework", "^", "^", "^-0.4", "0.05", "0.05", "0.05", "0.01", "1", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/17
    private static int f8(Frame c) {
        Logic.step(() -> Native.kill(c, "@s"));
        Logic.step(() -> Native.particle(c, "explosion", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "flash", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"), Control.when("score", "#global", "disabled_flashbang", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/18"), Control.as("@a[predicate=mcm:gm/vulnerable,distance=..1.5]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/18
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/flashbang/apply_weak"), Control.unless("entity", "@s[nbt={Inventory:[{id:\"minecraft:carved_pumpkin\",Slot:103b}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "12", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "14", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/19"), Control.unless("score", "@s", "mcm.its.dragon.hint.wisp", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/19
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.hint.wisp", "1"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u002a\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\" Hint:\",\"bold\":true,\"color\":\"#d9d134\",\"font\":\"minecraft:default\"},{\"text\":\" Laser wisps collide with blocks! Take or build cover before you get hit!\",\"color\":\"aqua\",\"font\":\"minecraft:default\"}]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/2
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/laser/spiral_raycast"), Control.positioned("^", "^", "^1.75")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/20
    private static int f12(Frame c) {
        Logic.step(() -> Native.particle(c, "explosion", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0", "0", "0", "0.2", "5", "force"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_laser_wisp_break"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lifetime", "200"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/21
    private static int f13(Frame c) {
        Logic.step(() -> Native.particle(c, "explosion", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0", "0", "0", "0.2", "5", "force"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_laser_wisp_break"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lifetime", "200"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/22
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#last_id", "mcm.its.dragon.wisp.target_id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.wisp.target_id", "=", "#last_id", "mcm.its.dragon.wisp.target_id"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/23
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.its.dragon.wisp.target_id", "=", "#this", "mcm.its.dragon.wisp.target_id"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p[tag=mcm.this.player]"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "-70"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/3
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/flashbang/apply"), Control.unless("entity", "@s[nbt={Inventory:[{id:\"minecraft:carved_pumpkin\",Slot:103b}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/4"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/5"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/6"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/4
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "13", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "14", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "2..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "15", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "4..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "16", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/5
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "24", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "25", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "2..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "26", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "4..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "27", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/6
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "28", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "30", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "2..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "32", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "4..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "34", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/7
    private static int f20(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.laser_target.potential\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.laser_target.potential\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.laser_target.potential\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.laser_target.potential\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.laser_target.potential\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.laser_target.potential\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.laser_target.potential\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.laser_target.potential\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.laser_target.potential\"]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.laser_target.potential\"]}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/8
    private static int f21(Frame c) {
        Logic.step(() -> Native.spreadplayers(c, "~", "~", "2", "7", "false", "@s"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.spawnpoint_priority", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.spawnpoint_priority", "30"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "10"), Control.at("@s"), Control.when("block", "~", "~-1", "~2", "#mcm:passable"), Control.when("block", "~", "~-1", "~-2", "#mcm:passable"), Control.when("block", "~-2", "~-1", "~", "#mcm:passable"), Control.when("block", "~2", "~-1", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.spawnpoint_priority", "5"), Control.at("@s"), Control.when("block", "~", "~", "~1", "#mcm:passable"), Control.when("block", "~", "~", "~-1", "#mcm:passable"), Control.when("block", "~1", "~", "~", "#mcm:passable"), Control.when("block", "~-1", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.spawnpoint_priority", "9"), Control.at("@s"), Control.when("block", "~1", "~", "~1", "#mcm:passable"), Control.when("block", "~-1", "~", "~-1", "#mcm:passable"), Control.when("block", "~-1", "~", "~1", "#mcm:passable"), Control.when("block", "~1", "~", "~-1", "#mcm:passable"), Control.when("block", "~1", "~-1", "~1", "end_stone"), Control.when("block", "~-1", "~-1", "~-1", "end_stone"), Control.when("block", "~-1", "~-1", "~1", "end_stone"), Control.when("block", "~1", "~-1", "~-1", "end_stone"), Control.when("block", "~", "~-1", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "15"), Control.at("@s"), Control.when("block", "~", "~-3", "~4", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "15"), Control.at("@s"), Control.when("block", "~", "~-3", "~-4", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "15"), Control.at("@s"), Control.when("block", "~4", "~-3", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.spawnpoint_priority", "15"), Control.at("@s"), Control.when("block", "~-4", "~-3", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/laser/zzz/9
    private static int f22(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.best_spawnpoint_candidate"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.laser_target.potential"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.laser_target.marker"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/lightning/random_lightning
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "5..18"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.max_zap_changes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.lightning_vfx.max_secondary_zap_changes", "3"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "-85..-40"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..360"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/random_lightning/zap"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#temp"));
        return 1;
    }
}
