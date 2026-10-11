package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled246 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/shulker/zzz/10", Compiled246::f0);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/11", Compiled246::f1);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/12", Compiled246::f2);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/13", Compiled246::f3);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/14", Compiled246::f4);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/15", Compiled246::f5);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/16", Compiled246::f6);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/17", Compiled246::f7);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/2", Compiled246::f8);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/3", Compiled246::f9);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/4", Compiled246::f10);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/5", Compiled246::f11);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/6", Compiled246::f12);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/7", Compiled246::f13);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/8", Compiled246::f14);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/9", Compiled246::f15);
        Logic.register("impossible_to_survive:mobs/skeleton/arrow_as_loop", Compiled246::f16);
        Logic.register("impossible_to_survive:mobs/skeleton/skeleton_arrow_init", Compiled246::f17);
        Logic.register("impossible_to_survive:mobs/skeleton/zzz/0", Compiled246::f18);
        Logic.register("impossible_to_survive:mobs/skeleton/zzz/1", Compiled246::f19);
        Logic.register("impossible_to_survive:mobs/skeleton/zzz/10", Compiled246::f20);
        Logic.register("impossible_to_survive:mobs/skeleton/zzz/11", Compiled246::f21);
        Logic.register("impossible_to_survive:mobs/skeleton/zzz/2", Compiled246::f22);
        Logic.register("impossible_to_survive:mobs/skeleton/zzz/3", Compiled246::f23);
    }
    // impossible_to_survive:mobs/shulker/zzz/10
    private static int f0(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/shulker"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:shulker_box\"}", "~", "~0.0", "~", "0.6", "0.6", "0.6", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:shulker_box\"}", "~", "~0.0", "~", "0.6", "0.6", "0.6", "0.1", "10", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:item.shield.block", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.data(c, "remove", "entity", "@s", "attack"));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/11
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.as("@e[tag=shulker_shield_component]"), Control.when("score", "@s", "mcm.id", "=", "#this", "mcm.id")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "shulker_has_shield"));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/12
    private static int f2(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "shulker_has_shield"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/shulker/despawn_shield"));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/13
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:3,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,3f],scale:[1f,1f,1f]}}"));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/14
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/15"), Control.when("entity", "@s[tag=shulker_shield_inner]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/17"), Control.when("entity", "@s[tag=shulker_shield_outer]")));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/15
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#global", "mcm.vfx.magic_circle_a.game_time"), Control.store("result", "storage", "mcm:shulker_rotation", "rotation_1.angle", "float", "0.15")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "transformation.left_rotation", "set", "from", "storage", "mcm:shulker_rotation", "rotation_1"), Control.store("success", "entity", "@s", "start_interpolation", "int", "0")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.id", "=", "@s", "mcm.id"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.as("@e[type=shulker,distance=..3]"), Control.when("score", "@s", "mcm.id", "=", "#this", "mcm.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/16"), Control.when("score", "#temp", "mcm.temp", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/16
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.as("@e[tag=shulker_shield_component]"), Control.when("score", "@s", "mcm.id", "=", "#this", "mcm.id")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/17
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#global", "mcm.vfx.magic_circle_a.game_time"), Control.store("result", "storage", "mcm:shulker_rotation", "rotation_1.angle", "float", "-0.15")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "transformation.left_rotation", "set", "from", "storage", "mcm:shulker_rotation", "rotation_1"), Control.store("success", "entity", "@s", "start_interpolation", "int", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/2
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.id", "=", "@s", "mcm.id"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/3"), Control.as("@e[type=item_display,tag=shulker_shield_component,tag=shulker_shield_inner]"), Control.when("score", "@s", "mcm.id", "=", "#this", "mcm.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/8"), Control.as("@e[type=item_display,tag=shulker_shield_component,tag=shulker_shield_outer]"), Control.when("score", "@s", "mcm.id", "=", "#this", "mcm.id")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/9"), Control.as("@e[type=interaction,tag=shulker_shield_component,tag=shulker_interaction]"), Control.when("score", "@s", "mcm.id", "=", "#this", "mcm.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/11"), Control.when("score", "#temp", "mcm.temp", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/12"), Control.unless("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..30]")));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/3
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/4"), Control.positioned("~", "~1", "~")));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/4
    private static int f10(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/5"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "10"), Control.store("result", "score", "#temp", "mcm.rotation.x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "10"), Control.store("result", "score", "#temp", "mcm.rotation.y")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/6"), Control.at("@s"), Control.positioned("^", "^", "^2.75")));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/5
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..26]", "eyes"), Control.positioned("^", "^", "^0.3"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.7"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/6
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/7"), Control.when("entity", "@e[type=#impossible_to_survive:projectiles,distance=..1.75]")));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/7
    private static int f13(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/shulker"));
        Logic.step(() -> Native.particle(c, "electric_spark", "~", "~", "~", "1", "1", "1", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~", "~", "1", "1", "1", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:shulker_box\"}", "~", "~0.15", "~", "0.4", "0.4", "0.4", "0.1", "10", "force"));
        Logic.step(() -> Native.kill(c, "@e[type=#impossible_to_survive:projectiles,distance=..2]"));
        Logic.step(() -> Native.playsound(c, "minecraft:item.shield.block", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/8
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~"), Control.positioned("~", "~1", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#temp", "mcm.rotation.x"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "0.1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#temp", "mcm.rotation.y"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "0.1")));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/9
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.temp", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~"), Control.positioned("~", "~0.4", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#temp", "mcm.rotation.x"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "0.1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#temp", "mcm.rotation.y"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "0.1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^3"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/10"), Control.when("data", "entity", "@s", "attack"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/skeleton/arrow_as_loop
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":78}}}"), Control.when("score", "@s", "lifetime", "matches", "3"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:10,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[10f,10f,10f]}}"), Control.when("score", "@s", "lifetime", "matches", "2"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1.0"), Control.when("score", "@s", "lifetime", "matches", "..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1.8"), Control.when("score", "@s", "lifetime", "matches", "6..")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "minecraft:crit", "^", "^", "^-1", "0.1", "0.1", "0.1", "0.1", "1", "force"), Control.when("score", "@s", "lifetime", "matches", "3..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/zzz/2"), Control.when("score", "@s", "lifetime", "matches", "..35"), Control.unless("block", "^", "^", "^1", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/zzz/5"), Control.when("score", "@s", "lifetime", "matches", "36.."), Control.when("entity", "@s[tag=giant_arrow_collided]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/zzz/7"), Control.when("score", "@s", "lifetime", "matches", "40")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/zzz/8"), Control.when("score", "@s", "lifetime", "matches", "45..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/zzz/9"), Control.when("score", "@s", "lifetime", "matches", "..39")));
        return 1;
    }
    // impossible_to_survive:mobs/skeleton/skeleton_arrow_init
    private static int f17(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/skeleton"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "facing", "entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable]"), Control.as("@e[type=#impossible_to_survive:arrow_shooter,limit=1,sort=nearest]"), Control.at("@s")));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{Invisible:1,Marker:1,Tags:[\"giant_arrow_as\",\"init\"],NoGravity:1,Passengers:[{id:\"minecraft:item_display\",Tags:[\"giant_arrow_di\",\"init\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[1f,1f,1f]}}]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/zzz/0"), Control.as("@e[type=item_display,tag=giant_arrow_di,tag=init]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/zzz/1"), Control.as("@e[type=armor_stand,tag=giant_arrow_as,tag=init]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.as("@e[type=#impossible_to_survive:arrow_shooter,limit=1,sort=nearest]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/skeleton/zzz/0
    private static int f18(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "init"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@e[type=#impossible_to_survive:arrow_shooter,limit=1,sort=nearest]", "Rotation[0]", "1"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@e[type=#impossible_to_survive:arrow_shooter,limit=1,sort=nearest]", "Rotation[1]", "1"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/skeleton/zzz/1
    private static int f19(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "init"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@e[type=#impossible_to_survive:arrow_shooter,limit=1,sort=nearest]", "Rotation[0]", "1"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@e[type=#impossible_to_survive:arrow_shooter,limit=1,sort=nearest]", "Rotation[1]", "1"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/skeleton/zzz/10
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/zzz/11"), Control.as("@a[distance=..4,tag=giant_arrow_hit]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "lifetime", "41"));
        return 1;
    }
    // impossible_to_survive:mobs/skeleton/zzz/11
    private static int f21(Frame c) {
        Logic.step(() -> Native.particle(c, "smoke", "~", "~1", "~", "0.4", "0.8", "0.4", "0.2", "10", "force"));
        Logic.step(() -> Native.particle(c, "explosion", "~", "~1", "~", "0.2", "0.8", "0.2", "0.2", "1", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "0.4", "0.8", "0.4", "0.2", "10", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.ravager.step", "master", "@a", "~", "~", "~", "0.8", "1"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.iron_golem.damage", "master", "@a", "~", "~", "~", "0.7", "0.8"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.player.hurt_sweet_berry_bush", "master", "@a", "~", "~", "~", "1.5", "0.9"));
        Logic.step(() -> Native.playsound(c, "minecraft:item.trident.hit", "master", "@a", "~", "~", "~", "1.5", "0.9"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "giant_arrow_hit"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "giant_arrow_hit_cd", "30"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:arrow", "by", "@n[type=#impossible_to_survive:arrow_shooter]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:arrow", "by", "@n[type=#impossible_to_survive:arrow_shooter]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:arrow", "by", "@n[type=#impossible_to_survive:arrow_shooter]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/skeleton/zzz/2
    private static int f22(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "lifetime", "37"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.wither.break_block", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "giant_arrow_collided"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@a[distance=..5,tag=survivor,predicate=mcm:gm/vulnerable]", "giant_arrow_hit_cd", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/zzz/3"), Control.when("entity", "@a[distance=..4.5,scores={giant_arrow_hit_cd=0},tag=survivor,predicate=mcm:gm/vulnerable]")));
        return 1;
    }
    // impossible_to_survive:mobs/skeleton/zzz/3
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/zzz/4"), Control.as("@a[distance=..4.5,scores={giant_arrow_hit_cd=0},tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        return 1;
    }
}
