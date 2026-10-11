package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled247 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/skeleton/zzz/4", Compiled247::f0);
        Logic.register("impossible_to_survive:mobs/skeleton/zzz/5", Compiled247::f1);
        Logic.register("impossible_to_survive:mobs/skeleton/zzz/6", Compiled247::f2);
        Logic.register("impossible_to_survive:mobs/skeleton/zzz/7", Compiled247::f3);
        Logic.register("impossible_to_survive:mobs/skeleton/zzz/8", Compiled247::f4);
        Logic.register("impossible_to_survive:mobs/skeleton/zzz/9", Compiled247::f5);
        Logic.register("impossible_to_survive:mobs/slime/apply_poison", Compiled247::f6);
        Logic.register("impossible_to_survive:mobs/slime/kill_proj", Compiled247::f7);
        Logic.register("impossible_to_survive:mobs/slime/loop", Compiled247::f8);
        Logic.register("impossible_to_survive:mobs/slime/proj_loop", Compiled247::f9);
        Logic.register("impossible_to_survive:mobs/slime/proj_motion", Compiled247::f10);
        Logic.register("impossible_to_survive:mobs/slime/puddle_loop", Compiled247::f11);
        Logic.register("impossible_to_survive:mobs/slime/shoot_slime_projectile", Compiled247::f12);
        Logic.register("impossible_to_survive:mobs/slime/summon_puddle", Compiled247::f13);
        Logic.register("impossible_to_survive:mobs/slime/summon_puddle_big", Compiled247::f14);
        Logic.register("impossible_to_survive:mobs/slime/zzz/0", Compiled247::f15);
        Logic.register("impossible_to_survive:mobs/slime/zzz/1", Compiled247::f16);
        Logic.register("impossible_to_survive:mobs/slime/zzz/10", Compiled247::f17);
        Logic.register("impossible_to_survive:mobs/slime/zzz/11", Compiled247::f18);
        Logic.register("impossible_to_survive:mobs/slime/zzz/12", Compiled247::f19);
        Logic.register("impossible_to_survive:mobs/slime/zzz/13", Compiled247::f20);
        Logic.register("impossible_to_survive:mobs/slime/zzz/14", Compiled247::f21);
        Logic.register("impossible_to_survive:mobs/slime/zzz/15", Compiled247::f22);
        Logic.register("impossible_to_survive:mobs/slime/zzz/16", Compiled247::f23);
    }
    // impossible_to_survive:mobs/skeleton/zzz/4
    private static int f0(Frame c) {
        Logic.step(() -> Native.particle(c, "smoke", "~", "~1", "~", "0.4", "0.8", "0.4", "0.2", "10", "force"));
        Logic.step(() -> Native.particle(c, "explosion", "~", "~1", "~", "0.2", "0.8", "0.2", "0.2", "1", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "0.4", "0.8", "0.4", "0.2", "10", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "giant_arrow_hit_cd", "30"));
        Logic.step(() -> Native.damage(c, "@s", "15", "minecraft:mob_projectile", "by", "@n[type=skeleton]"));
        return 1;
    }
    // impossible_to_survive:mobs/skeleton/zzz/5
    private static int f1(Frame c) {
        Logic.step(() -> Native.particle(c, "explosion", "^", "^", "^-2", "0.4", "0.4", "0.4", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "^", "^", "^-1", "0.4", "0.4", "0.4", "0.2", "1", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/zzz/6"), Control.positioned("^", "^", "^")));
        return 1;
    }
    // impossible_to_survive:mobs/skeleton/zzz/6
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^-1", "^-1", "^-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^-1", "^-1", "^0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^-1", "^-1", "^1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^-1", "^0", "^-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^-1", "^0", "^0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^-1", "^0", "^1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^-1", "^1", "^-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^-1", "^1", "^0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^-1", "^1", "^1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^0", "^-1", "^-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^0", "^-1", "^0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^0", "^-1", "^1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^0", "^0", "^-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^0", "^0", "^0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^0", "^0", "^1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^0", "^1", "^-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^0", "^1", "^0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^0", "^1", "^1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^1", "^-1", "^-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^1", "^-1", "^0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^1", "^-1", "^1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^1", "^0", "^-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^1", "^0", "^0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^1", "^0", "^1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^1", "^1", "^-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^1", "^1", "^0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("^1", "^1", "^1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:arrow_non_destructible")));
        return 1;
    }
    // impossible_to_survive:mobs/skeleton/zzz/7
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/skeleton/zzz/8
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/skeleton/zzz/9
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@a[distance=..4]", "giant_arrow_hit_cd", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@a[tag=survivor,predicate=mcm:gm/vulnerable,scores={giant_arrow_hit_cd=0},distance=..2.5]", "add", "giant_arrow_hit"), Control.positioned("^", "^-0.5", "^1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@a[tag=survivor,predicate=mcm:gm/vulnerable,scores={giant_arrow_hit_cd=0},distance=..2.5]", "add", "giant_arrow_hit"), Control.positioned("^", "^-0.5", "^")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/zzz/10"), Control.when("entity", "@a[distance=..4,tag=giant_arrow_hit]")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/apply_poison
    private static int f6(Frame c) {
        Logic.step(() -> Native.effect(c, "give", "@s", "poison", "5", "1", "true"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "poison_cooldown", "4"));
        return 1;
    }
    // impossible_to_survive:mobs/slime/kill_proj
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/slime/loop
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/0"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..40]")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/proj_loop
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/15"), Control.when("score", "@s", "mcm.lifetime", "matches", "5..90")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/kill_proj"), Control.when("score", "@s", "mcm.lifetime", "matches", "90")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/kill_proj"), Control.when("score", "@s", "mcm.lifetime", "matches", "100..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/16"), Control.when("score", "@s", "mcm.lifetime", "matches", "97")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/proj_motion
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "^", "^", "^-0.1", "{Tags:[\"imps_cow_dir\"]}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1000"), Control.store("result", "score", "@s", "x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1000"), Control.store("result", "score", "@s", "y")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1000"), Control.store("result", "score", "@s", "z")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@e[type=marker,tag=imps_cow_dir,limit=1,sort=nearest]", "Pos[0]", "1000"), Control.store("result", "score", "@s", "dx")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@e[type=marker,tag=imps_cow_dir,limit=1,sort=nearest]", "Pos[1]", "1000"), Control.store("result", "score", "@s", "dy")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@e[type=marker,tag=imps_cow_dir,limit=1,sort=nearest]", "Pos[2]", "1000"), Control.store("result", "score", "@s", "dz")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=imps_cow_dir,distance=..10]"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "dx", "-=", "@s", "x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "dy", "-=", "@s", "y"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "dy", "30"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "dz", "-=", "@s", "z"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/13"), Control.when("entity", "@a[distance=..7.5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/14"), Control.unless("entity", "@a[distance=..7.5]")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/puddle_loop
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/apply_poison"), Control.when("entity", "@s[tag=puddle_size_1]"), Control.as("@a[distance=..1.25]"), Control.unless("score", "@s", "poison_cooldown", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/apply_poison"), Control.when("entity", "@s[tag=puddle_size_2]"), Control.as("@a[distance=..2.0]"), Control.unless("score", "@s", "poison_cooldown", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/9"), Control.when("score", "@s", "mcm.lifetime", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/10"), Control.when("score", "@s", "mcm.lifetime", "matches", "12")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/11"), Control.when("score", "@s", "mcm.lifetime", "matches", "412")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.lifetime", "matches", "420..")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/shoot_slime_projectile
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/slime"), Control.as("@a[distance=..20]"), Control.at("@s")));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.witch.throw", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:slime_ball\"}", "~", "~0.5", "~", "0.5", "0.5", "0.5", "0.1", "20", "force"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.2", "~", "{CustomNameVisible:0b,CustomName:'{\"text\":\"Slimeball\"}',Invisible:1,Tags:[\"slime_ball_projectile\",\"mcm.init\"],Small:1b,Passengers:[{id:\"minecraft:item_display\",billboard:\"center\",transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[0.5f,0.5f,0.5f]},item:{id:\"minecraft:slime_ball\",count:1}}]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/12"), Control.as("@e[type=armor_stand,tag=slime_ball_projectile,tag=mcm.init]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/summon_puddle
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/3"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5"), Control.unless("entity", "@e[type=item_display,tag=slime_puddle,tag=puddle_size_1,distance=..0.1]"), Control.unless("entity", "@e[type=item_display,tag=slime_puddle,tag=puddle_size_2,distance=..1.5]")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/summon_puddle_big
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/6"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5"), Control.unless("entity", "@e[type=item_display,tag=slime_puddle,tag=puddle_size_1,distance=..0.1]"), Control.unless("entity", "@e[type=item_display,tag=slime_puddle,tag=puddle_size_2,distance=..1.5]")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/0
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/summon_puddle"), Control.unless("block", "~", "~-0.9", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/summon_puddle"), Control.positioned("~", "~-1", "~"), Control.when("block", "~", "~", "~", "#mcm:passable"), Control.unless("block", "~", "~-0.9", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/1"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..15]")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/1
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "slime_launch_cd", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/2"), Control.when("score", "@s", "slime_launch_cd", "matches", "150..")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/10
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:400,transformation:{translation:[0f,0.52f,0f],scale:[2.0f,1.0f,2.0f]}}"), Control.when("entity", "@s[tag=puddle_size_1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:400,transformation:{translation:[0f,0.52f,0f],scale:[3.5f,1.0f,3.5f]}}"), Control.when("entity", "@s[tag=puddle_size_2]")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/11
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:5,transformation:{translation:[0f,0.01f,0f],scale:[0f,0f,0f]}}"));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/12
    private static int f19(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,sort=nearest]"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/slime/proj_motion"));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/13
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dx"), Control.store("result", "entity", "@s", "Motion[0]", "double", "-0.013")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dy"), Control.store("result", "entity", "@s", "Motion[1]", "double", "-0.013")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dz"), Control.store("result", "entity", "@s", "Motion[2]", "double", "-0.013")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/14
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dx"), Control.store("result", "entity", "@s", "Motion[0]", "double", "-0.02")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dy"), Control.store("result", "entity", "@s", "Motion[1]", "double", "-0.02")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dz"), Control.store("result", "entity", "@s", "Motion[2]", "double", "-0.02")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/15
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.lifetime", "97"), Control.unless("predicate", "mcm:in_air")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/16
    private static int f23(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/slime/summon_puddle_big"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/17"), Control.as("@a[distance=..2]"), Control.at("@s")));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.slime.squish", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:slime_block\"}", "~", "~0.25", "~", "0.4", "0.3", "0.4", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:slime_ball\"}", "~", "~0.25", "~", "0.8", "0.5", "0.8", "0.1", "40", "force"));
        return 1;
    }
}
