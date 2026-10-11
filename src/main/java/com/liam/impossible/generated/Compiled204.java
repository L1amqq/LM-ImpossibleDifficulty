package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled204 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/chicken/zzz/3", Compiled204::f0);
        Logic.register("impossible_to_survive:mobs/chicken/zzz/4", Compiled204::f1);
        Logic.register("impossible_to_survive:mobs/chicken/zzz/5", Compiled204::f2);
        Logic.register("impossible_to_survive:mobs/chicken/zzz/6", Compiled204::f3);
        Logic.register("impossible_to_survive:mobs/cow/cow_timer", Compiled204::f4);
        Logic.register("impossible_to_survive:mobs/cow/proj_motion", Compiled204::f5);
        Logic.register("impossible_to_survive:mobs/cow/proj_timer", Compiled204::f6);
        Logic.register("impossible_to_survive:mobs/cow/projectile_summon", Compiled204::f7);
        Logic.register("impossible_to_survive:mobs/cow/zzz/0", Compiled204::f8);
        Logic.register("impossible_to_survive:mobs/cow/zzz/1", Compiled204::f9);
        Logic.register("impossible_to_survive:mobs/cow/zzz/2", Compiled204::f10);
        Logic.register("impossible_to_survive:mobs/cow/zzz/3", Compiled204::f11);
        Logic.register("impossible_to_survive:mobs/cow/zzz/4", Compiled204::f12);
        Logic.register("impossible_to_survive:mobs/cow/zzz/5", Compiled204::f13);
        Logic.register("impossible_to_survive:mobs/cow/zzz/6", Compiled204::f14);
        Logic.register("impossible_to_survive:mobs/cow/zzz/7", Compiled204::f15);
        Logic.register("impossible_to_survive:mobs/cow/zzz/8", Compiled204::f16);
        Logic.register("impossible_to_survive:mobs/creeper/creeper_spawnpoint", Compiled204::f17);
        Logic.register("impossible_to_survive:mobs/creeper/dupe", Compiled204::f18);
        Logic.register("impossible_to_survive:mobs/creeper/summon_creeper", Compiled204::f19);
        Logic.register("impossible_to_survive:mobs/enderman/look_check", Compiled204::f20);
        Logic.register("impossible_to_survive:mobs/enderman/look_lock", Compiled204::f21);
        Logic.register("impossible_to_survive:mobs/enderman/particles", Compiled204::f22);
        Logic.register("impossible_to_survive:mobs/enderman/zzz/0", Compiled204::f23);
    }
    // impossible_to_survive:mobs/chicken/zzz/3
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/chicken/zzz/4"), Control.positioned("~", "~0.7", "~"), Control.when("entity", "@a[distance=..1,tag=survivor,predicate=mcm:gm/vulnerable]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/chicken/zzz/6"), Control.unless("block", "~", "~1", "~", "#impossible_to_survive:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/chicken/zzz/4
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=chicken,scores={chickenTimer=10..197},limit=1,sort=nearest]", "chickenTimer", "198"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/chicken/zzz/5"), Control.as("@a[distance=..1,tag=survivor,predicate=mcm:gm/vulnerable]")));
        Logic.step(() -> Native.particle(c, "minecraft:explosion", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.chicken.death", "master", "@a"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/chicken/zzz/5
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:mob_attack", "by", "@n[type=chicken]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "9", "minecraft:mob_attack", "by", "@n[type=chicken]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "13", "minecraft:mob_attack", "by", "@n[type=chicken]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/chicken/zzz/6
    private static int f3(Frame c) {
        Logic.step(() -> Native.particle(c, "cloud", "~", "~1.2", "~", "0.1", "0.1", "0.1", "0.07", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=chicken,scores={chickenTimer=10..197},limit=1,sort=nearest]", "chickenTimer", "198"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/cow/cow_timer
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "cowTimer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/zzz/0"), Control.when("score", "@s", "cowTimer", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/zzz/1"), Control.when("score", "@s", "cowTimer", "matches", "9")));
        Logic.step(() -> Native.effect(c, "give", "@s[scores={cowTimer=9}]", "invisibility", "9999", "9", "true"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/zzz/2"), Control.when("entity", "@s[scores={cowTimer=16..118}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/zzz/3"), Control.when("score", "@s", "cowTimer", "matches", "34..86")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/zzz/4"), Control.when("score", "@s", "cowTimer", "matches", "118")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s[scores={cowTimer=200}]", "cowTimer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@a[tag=survivor,predicate=mcm:gm/vulnerable]", "has_bucket", "0"), Control.when("entity", "@s[scores={cowTimer=33..126}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/zzz/5"), Control.when("entity", "@s[scores={cowTimer=33..125}]")));
        return 1;
    }
    // impossible_to_survive:mobs/cow/proj_motion
    private static int f5(Frame c) {
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
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "dy", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "dz", "-=", "@s", "z"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dx"), Control.store("result", "entity", "@s", "Motion[0]", "double", "-0.042")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dy"), Control.store("result", "entity", "@s", "Motion[1]", "double", "-0.042")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dz"), Control.store("result", "entity", "@s", "Motion[2]", "double", "-0.042")));
        return 1;
    }
    // impossible_to_survive:mobs/cow/proj_timer
    private static int f6(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "cow_proj_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":21}}]}"), Control.when("entity", "@s[scores={cow_proj_lt=12}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{NoGravity:0}"), Control.when("entity", "@s[scores={cow_proj_lt=10}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/proj_motion"), Control.when("entity", "@s[scores={cow_proj_lt=10}]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/cow/zzz/6"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable,scores={has_bucket=2},distance=..1.8]"), Control.at("@s")), Control.when("entity", "@s[scores={cow_proj_lt=9..},tag=can_hit]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/cow/zzz/7"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable,scores={has_bucket=1},distance=..1.8]"), Control.at("@s")), Control.when("entity", "@s[scores={cow_proj_lt=9..},tag=can_hit]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/cow/zzz/8"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable,scores={has_bucket=0},distance=..1.8]"), Control.at("@s")), Control.when("entity", "@s[scores={cow_proj_lt=9..},tag=can_hit]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "cow_proj_lt", "90"), Control.when("entity", "@s[scores={cow_proj_lt=15..89},nbt={OnGround:1b}]")));
        Logic.step(() -> Native.kill(c, "@s[scores={cow_proj_lt=100..}]"));
        return 1;
    }
    // impossible_to_survive:mobs/cow/projectile_summon
    private static int f7(Frame c) {
        Logic.step(() -> Native.summon(c, "armor_stand", "^", "^0.75", "^-0.5", "{Tags:[\"cow_proj\",\"cow_proj_init\",\"can_hit\"],Small:1,NoGravity:1,Invisible:1}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "entity", "@e[type=armor_stand,tag=cow_proj_init,limit=1,sort=nearest]", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "facing", "entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,sort=nearest]"), Control.as("@e[type=armor_stand,tag=cow_proj_init]"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@e[type=armor_stand,tag=cow_proj_init]", "remove", "cow_proj_init"));
        Logic.step(() -> Native.playsound(c, "minecraft:item.bucket.fill", "master", "@a", "~", "~", "~", "0.8", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/cow/zzz/0
    private static int f8(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "0"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{NoAI:1,NoGravity:1,Invulnerable:1}"));
        return 1;
    }
    // impossible_to_survive:mobs/cow/zzz/1
    private static int f9(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/cow"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.cow.ambient", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/summon", "{args:{animation:'squirt',start_animation:true}}"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/cow/zzz/2
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..22]", "eyes"), Control.positioned("^", "^", "^0.2"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.8"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "entity", "@e[type=item_display,tag=aj.matrix_cow.root,limit=1,sort=nearest]", "Rotation[0]", "float", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/cow/zzz/3
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/projectile_summon"), Control.when("entity", "@s[scores={cowTimer=34}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/projectile_summon"), Control.when("entity", "@s[scores={cowTimer=40}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/projectile_summon"), Control.when("entity", "@s[scores={cowTimer=46}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/projectile_summon"), Control.when("entity", "@s[scores={cowTimer=52}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/projectile_summon"), Control.when("entity", "@s[scores={cowTimer=58}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/projectile_summon"), Control.when("entity", "@s[scores={cowTimer=65}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/projectile_summon"), Control.when("entity", "@s[scores={cowTimer=72}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/projectile_summon"), Control.when("entity", "@s[scores={cowTimer=80}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/projectile_summon"), Control.when("entity", "@s[scores={cowTimer=86}]")));
        return 1;
    }
    // impossible_to_survive:mobs/cow/zzz/4
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{NoAI:0,NoGravity:0,Invulnerable:0}"));
        Logic.step(() -> Native.effect(c, "clear", "@s", "invisibility"));
        return 1;
    }
    // impossible_to_survive:mobs/cow/zzz/5
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a[tag=survivor,predicate=mcm:gm/vulnerable,nbt={SelectedItem:{id:\"minecraft:bucket\"}}]", "has_bucket", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a[tag=survivor,predicate=mcm:gm/vulnerable,nbt={SelectedItem:{id:\"minecraft:milk_bucket\"}}]", "has_bucket", "2"));
        return 1;
    }
    // impossible_to_survive:mobs/cow/zzz/6
    private static int f14(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:item.bucket.fill_powder_snow", "master", "@a"));
        Logic.step(() -> Native.particle(c, "minecraft:snowflake", "^", "^1", "^0.5", "0.5", "0.5", "0.5", "0.1", "2"));
        return 1;
    }
    // impossible_to_survive:mobs/cow/zzz/7
    private static int f15(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:item.bucket.fill_lava", "master", "@a"));
        Logic.step(() -> Native.item(c, "replace", "entity", "@s", "weapon.mainhand", "with", "minecraft:milk_bucket"));
        return 1;
    }
    // impossible_to_survive:mobs/cow/zzz/8
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "2.5", "minecraft:arrow", "by", "@n[type=cow]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:arrow", "by", "@n[type=cow]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:arrow", "by", "@n[type=cow]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "can_hit"));
        return 1;
    }
    // impossible_to_survive:mobs/creeper/creeper_spawnpoint
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "creeper", "~", "~", "~", "{ExplosionRadius:5b,Tags:[\"has_duped\",\"init\"],Fuse:40,ignited:1b}"), Control.at("@s"), Control.when("block", "~", "~", "~", "#impossible_to_survive:passable"), Control.unless("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "facing", "entity", "@p"), Control.as("@e[type=creeper,tag=has_duped,tag=init]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "remove", "init"), Control.as("@e[type=creeper,tag=has_duped,tag=init]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust{color:[0.4,1.0,0.4],scale:1.0}", "~", "~", "~", "0.5", "1", "0.5", "0.1", "10"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "minecraft:effect", "~", "~1", "~", "0", "0", "0", "1", "2", "force"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/creeper/dupe
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.positioned("~", "~1", "~"), Control.facing("entity", "@n[type=creeper]", "eyes"), Control.unless("block", "^", "^", "^1", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.positioned("~", "~1", "~"), Control.facing("entity", "@n[type=creeper]", "eyes"), Control.unless("block", "^", "^", "^2", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.positioned("~", "~1", "~"), Control.facing("entity", "@n[type=creeper]", "eyes"), Control.unless("block", "^", "^", "^3", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.positioned("~", "~1", "~"), Control.facing("entity", "@n[type=creeper]", "eyes"), Control.unless("block", "^", "^", "^4", "#mcm:passable")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/creeper"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "2", "1", "2", "0.2", "10", "force"));
        Logic.step(() -> Native.particle(c, "dust{color:[0.7,1.0,0.7],scale:1.0}", "~", "~1", "~", "2.5", "1", "2.5", "0.1", "50"));
        Logic.step(() -> Native.particle(c, "minecraft:mycelium", "~", "~1", "~", "1", "0.5", "1", "0.1", "100"));
        Logic.step(() -> Native.particle(c, "minecraft:effect", "~", "~1", "~", "0", "0", "0", "1", "5", "force"));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Tags:[\"creeper_aec\"]}"), Control.align("y")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ExplosionRadius:5b,Fuse:40,ignited:1b}"), Control.as("@e[type=creeper,limit=1,sort=nearest,tag=!has_duped]")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust{color:[0.4,1.0,0.4],scale:1.0}", "~", "~1", "~", "0.5", "1", "0.5", "0.1", "10"), Control.as("@e[type=creeper,limit=1,sort=nearest,tag=!has_duped]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "minecraft:effect", "~", "~1", "~", "0", "0", "0", "1", "5", "force"), Control.as("@e[type=creeper,limit=1,sort=nearest,tag=!has_duped]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "facing", "entity", "@e[type=creeper,limit=1,sort=nearest,tag=!has_duped]"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@e[type=creeper,distance=..5.5]", "add", "has_duped"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/summon_creeper"), Control.as("@e[type=area_effect_cloud,tag=creeper_aec]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@e[type=area_effect_cloud,tag=creeper_aec]"));
        return 1;
    }
    // impossible_to_survive:mobs/creeper/summon_creeper
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~22.5", "~"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "^", "^4", "^5.5", "{Tags:[creeper_spawn_point]}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/creeper_spawnpoint"), Control.as("@e[type=area_effect_cloud,tag=creeper_spawn_point]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/enderman/look_check
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "ender_look_cd", "3"), Control.positioned("^", "^", "^1"), Control.when("entity", "@e[type=enderman,tag=!mcm.its.dragon.minion,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "ender_look_cd", "3"), Control.positioned("^", "^", "^2"), Control.when("entity", "@e[type=enderman,tag=!mcm.its.dragon.minion,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "ender_look_cd", "3"), Control.positioned("^", "^", "^3.3"), Control.when("entity", "@e[type=enderman,tag=!mcm.its.dragon.minion,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "ender_look_cd", "3"), Control.positioned("^", "^", "^4.6"), Control.when("entity", "@e[type=enderman,tag=!mcm.its.dragon.minion,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "ender_look_cd", "3"), Control.positioned("^", "^", "^5.9"), Control.when("entity", "@e[type=enderman,tag=!mcm.its.dragon.minion,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "ender_look_cd", "3"), Control.positioned("^", "^", "^7"), Control.when("entity", "@e[type=enderman,tag=!mcm.its.dragon.minion,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "ender_look_cd", "3"), Control.positioned("^", "^", "^8"), Control.when("entity", "@e[type=enderman,tag=!mcm.its.dragon.minion,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "ender_look_cd", "3"), Control.positioned("^", "^", "^9"), Control.when("entity", "@e[type=enderman,tag=!mcm.its.dragon.minion,distance=..2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "ender_look_cd", "3"), Control.positioned("^", "^", "^11"), Control.when("entity", "@e[type=enderman,tag=!mcm.its.dragon.minion,distance=..2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "ender_look_cd", "3"), Control.positioned("^", "^", "^13"), Control.when("entity", "@e[type=enderman,tag=!mcm.its.dragon.minion,distance=..3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "ender_look_cd", "3"), Control.positioned("^", "^", "^15"), Control.when("entity", "@e[type=enderman,tag=!mcm.its.dragon.minion,distance=..3]")));
        return 1;
    }
    // impossible_to_survive:mobs/enderman/look_lock
    private static int f21(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/enderman"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@e[type=enderman,tag=!mcm.its.dragon.minion,limit=1,sort=nearest,distance=..15]", "feet"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/enderman/zzz/0"), Control.when("entity", "@e[type=enderman,tag=!mcm.its.dragon.minion,distance=..15]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/enderman/particles
    private static int f22(Frame c) {
        Logic.step(() -> Native.particle(c, "minecraft:portal", "~", "~", "~", "0.2", "1", "0.2", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "dust{color:[0.9,0.0,0.9],scale:1.0}", "~", "~", "~", "0.4", "0.8", "0.4", "0.5", "1"));
        Logic.step(() -> Native.effect(c, "give", "@p", "minecraft:slowness", "1", "3", "true"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust{color:[0.9,0.0,0.9],scale:0.5}", "^", "^", "^1", "0.1", "0.1", "0.1", "0.1", "1"), Control.anchored("eyes")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust{color:[0.9,0.0,0.9],scale:0.5}", "^", "^", "^2", "0.1", "0.1", "0.1", "0.1", "1"), Control.anchored("eyes")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust{color:[0.9,0.0,0.9],scale:0.5}", "^", "^", "^3.5", "0.1", "0.1", "0.1", "0.1", "1"), Control.anchored("eyes")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust{color:[0.9,0.0,0.9],scale:0.5}", "^", "^", "^5", "0.1", "0.1", "0.1", "0.1", "1"), Control.anchored("eyes")));
        return 1;
    }
    // impossible_to_survive:mobs/enderman/zzz/0
    private static int f23(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~-2"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/enderman/particles"));
        return 1;
    }
}
