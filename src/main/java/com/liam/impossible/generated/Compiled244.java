package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled244 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/land_shark/spawn", Compiled244::f0);
        Logic.register("impossible_to_survive:mobs/land_shark/zzz/0", Compiled244::f1);
        Logic.register("impossible_to_survive:mobs/land_shark/zzz/1", Compiled244::f2);
        Logic.register("impossible_to_survive:mobs/land_shark/zzz/2", Compiled244::f3);
        Logic.register("impossible_to_survive:mobs/land_shark/zzz/3", Compiled244::f4);
        Logic.register("impossible_to_survive:mobs/land_shark/zzz/4", Compiled244::f5);
        Logic.register("impossible_to_survive:mobs/land_shark/zzz/5", Compiled244::f6);
        Logic.register("impossible_to_survive:mobs/land_shark/zzz/6", Compiled244::f7);
        Logic.register("impossible_to_survive:mobs/land_shark/zzz/7", Compiled244::f8);
        Logic.register("impossible_to_survive:mobs/land_shark/zzz/8", Compiled244::f9);
        Logic.register("impossible_to_survive:mobs/land_shark/zzz/9", Compiled244::f10);
        Logic.register("impossible_to_survive:mobs/mutant_spider/ai_loop", Compiled244::f11);
        Logic.register("impossible_to_survive:mobs/mutant_spider/anim_start_idle", Compiled244::f12);
        Logic.register("impossible_to_survive:mobs/mutant_spider/anim_start_walk", Compiled244::f13);
        Logic.register("impossible_to_survive:mobs/mutant_spider/convert_spider", Compiled244::f14);
        Logic.register("impossible_to_survive:mobs/mutant_spider/damage", Compiled244::f15);
        Logic.register("impossible_to_survive:mobs/mutant_spider/damage_timer", Compiled244::f16);
        Logic.register("impossible_to_survive:mobs/mutant_spider/loop", Compiled244::f17);
        Logic.register("impossible_to_survive:mobs/mutant_spider/zzz/0", Compiled244::f18);
        Logic.register("impossible_to_survive:mobs/mutant_spider/zzz/1", Compiled244::f19);
        Logic.register("impossible_to_survive:mobs/mutant_spider/zzz/2", Compiled244::f20);
        Logic.register("impossible_to_survive:mobs/mutant_spider/zzz/3", Compiled244::f21);
        Logic.register("impossible_to_survive:mobs/mutant_spider/zzz/4", Compiled244::f22);
        Logic.register("impossible_to_survive:mobs/mutant_spider/zzz/5", Compiled244::f23);
    }
    // impossible_to_survive:mobs/land_shark/spawn
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/land_shark"), Control.as("@a[distance=..15]"), Control.at("@s")));
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/summon", "{args:{}}"));
        Logic.step(() -> Native.summon(c, "zoglin", "~", "~-2", "~", "{Tags:[\"invis\",\"land_shark_ai\",\"new\"],PersistenceRequired:1,Silent:1b,CustomNameVisible:0b,Health:9999f,CustomName:'{\"text\":\"Land Shark\"}',attributes:[{Name:generic.max_health,Base:9999}],active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],DeathLootTable:\"\",Rotation:[-20f]}"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@e[tag=new]", "aj.id", "=", "@e[tag=aj.land_shark.root,tag=!land_shark_init]", "aj.id"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@e[type=item_display,tag=aj.land_shark.root,tag=!land_shark_init]", "mobHealth", "3"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@e[type=item_display,tag=aj.land_shark.root,tag=!land_shark_init]", "mobHealth", "5"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@e[type=item_display,tag=aj.land_shark.root,tag=!land_shark_init]", "mobHealth", "7"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@e[type=item_display,tag=aj.land_shark.root,tag=!land_shark_init]", "damageTimer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@e[type=zoglin,tag=land_shark_ai,tag=new]", "moveTimer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~2", "~"), Control.as("@e[type=zoglin,tag=land_shark_ai,tag=new]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/walk/play"), Control.as("@e[type=item_display,tag=aj.land_shark.root,tag=!land_shark_init]"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@e[tag=aj.land_shark.root,tag=!land_shark_init]", "add", "land_shark_init"));
        Logic.step(() -> Native.tag(c, "@e[tag=new]", "remove", "new"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/zzz/0
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:water")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:water")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:water")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:water")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:water")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:water")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:water")));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/zzz/1
    private static int f2(Frame c) {
        Logic.step(() -> Native.particle(c, "cloud", "~", "~", "~", "0.2", "0.2", "0.2", "0.1", "5", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.dolphin.swim", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.player.splash.high_speed", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.illusioner.cast_spell", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/land_shark/spawn"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/zzz/2"), Control.as("@n[type=zoglin,tag=land_shark_ai]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/zzz/2
    private static int f3(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable]"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/land_shark/apply_spawn_motion"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/zzz/3
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/zzz/4
    private static int f5(Frame c) {
        Logic.step(() -> Native.tp(c, "@e[type=item_display,tag=aj.land_shark.root,tag=this,limit=1,sort=nearest]", "@s"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this_land_shark_ai"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/zzz/5
    private static int f6(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/remove/this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/zzz/6"), Control.as("@e[type=zoglin,tag=land_shark_ai,limit=1,sort=nearest,tag=this_land_shark_ai]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/zzz/6
    private static int f7(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "-100", "~"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/zzz/7
    private static int f8(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/remove/this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/zzz/8"), Control.as("@e[type=zoglin,tag=land_shark_ai,limit=1,sort=nearest,tag=this_land_shark_ai]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/zzz/8
    private static int f9(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "-100", "~"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/zzz/9
    private static int f10(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "this_land_shark_ai"));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/ai_loop
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s[nbt={Motion:[0.0,0.0,0.0]},scores={moveTimer=..6}]", "moveTimer", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s[scores={moveTimer=1..}]", "moveTimer", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/anim_start_idle
    private static int f12(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/animations/idle/tween", "{to_frame:0,duration:2}"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "isMoving"));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/anim_start_walk
    private static int f13(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/animations/walk/tween", "{to_frame:0,duration:2}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "isMoving"));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/convert_spider
    private static int f14(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/spider"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "0.5", "0.5", "0.5", "0.1", "15", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~1", "~", "0.5", "0.5", "0.5", "0.1", "20", "force"));
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/summon", "{args:{}}"));
        Logic.step(() -> Native.attribute(c, "@s", "minecraft:generic.scale", "base", "set", "1.75"));
        Logic.step(() -> Native.attribute(c, "@s", "minecraft:generic.max_health", "base", "set", "80"));
        Logic.step(() -> Native.attribute(c, "@s", "minecraft:generic.movement_speed", "base", "set", "0.5"));
        Logic.step(() -> Native.attribute(c, "@s", "minecraft:generic.attack_damage", "base", "set", "9"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{Tags:[\"invis\",\"mutant_spider_ai\",\"new\"],PersistenceRequired:1,Silent:0b,CustomNameVisible:0b,Health:80f,CustomName:'{\"text\":\"Mutant Spider\"}',attributes:[{Name:generic.max_health,Base:100},{Name:generic.follow_range,Base:20},{Name:generic.knockback_resistance,Base:0.05},{Name:generic.movement_speed,Base:0.5},{Name:generic.attack_damage,Base:9}],active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}]}"));
        Logic.step(() -> Native.effect(c, "give", "@s", "invisibility", "infinite", "99", "true"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "0.1", "minecraft:player_attack", "by", "@p"), Control.as("@n[type=spider,tag=mutant_spider_ai]")));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.illusioner.cast_spell", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.spider.ambient", "master", "@a", "~", "~", "~", "1.0", "0.7"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@e[tag=new]", "aj.id", "=", "@e[tag=aj.mutant_spider.root,tag=!mutant_spider_init]", "aj.id"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@e[type=item_display,tag=aj.mutant_spider.root,tag=!mutant_spider_init]", "damageTimer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@e[type=spider,tag=mutant_spider_ai,tag=new]", "moveTimer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/animations/walk/play"), Control.as("@e[type=item_display,tag=aj.mutant_spider.root,tag=!mutant_spider_init]"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@e[tag=aj.walking_diamond.root,tag=!mutant_spider_init]", "add", "mutant_spider_init"));
        Logic.step(() -> Native.tag(c, "@e[tag=new]", "remove", "new"));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/damage
    private static int f15(Frame c) {
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:cobweb\"}", "~", "~0.4", "~", "0.5", "0.5", "0.5", "0.1", "10", "force"));
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/variants/red/apply"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "damageTimer", "8"));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/damage_timer
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "damageTimer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/apply"), Control.when("score", "@s", "damageTimer", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/loop
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.id", "=", "@s", "aj.id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/zzz/0"), Control.as("@e[type=spider,tag=mutant_spider_ai,distance=..20]"), Control.when("score", "@s", "aj.id", "=", "#this", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/mutant_spider/ai_loop"), Control.as("@e[type=spider,tag=mutant_spider_ai,distance=..1,sort=nearest,tag=this_mutant_spider_ai]")), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/zzz/1"), Control.unless("entity", "@e[type=spider,tag=this_mutant_spider_ai,distance=..10]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/damage"), Control.when("entity", "@e[type=spider,tag=mutant_spider_ai,tag=this_mutant_spider_ai,distance=..2,nbt={HurtTime:10s},limit=1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/damage_timer"), Control.as("@s[scores={damageTimer=1..}]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "isMoving", "1"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "isMoving", "0"), Control.at("@e[type=spider,tag=mutant_spider_ai,distance=..0.1,tag=this_mutant_spider_ai,sort=nearest,limit=1,scores={moveTimer=3..}]")), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/anim_start_walk"), Control.when("entity", "@s[scores={isMoving=1},tag=!isMoving]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/anim_start_idle"), Control.when("entity", "@s[scores={isMoving=0},tag=isMoving]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/zzz/2"), Control.when("entity", "@a[distance=..2]"), Control.unless("score", "@s", "attack_cooldown", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "attack_cooldown", "1"), Control.when("score", "@s", "attack_cooldown", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/zzz/5"), Control.unless("entity", "@a[distance=..50]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/zzz/7"), Control.as("@e[type=spider,tag=mutant_spider_ai,distance=..1,sort=nearest,tag=this_mutant_spider_ai]")));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/zzz/0
    private static int f18(Frame c) {
        Logic.step(() -> Native.tp(c, "@e[type=item_display,tag=aj.mutant_spider.root,tag=this,limit=1,sort=nearest]", "@s"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this_mutant_spider_ai"));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/zzz/1
    private static int f19(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/remove/this"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "0.5", "0.5", "0.5", "0.1", "15", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~1", "~", "0.5", "0.5", "0.5", "0.1", "20", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/zzz/2
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/zzz/3"), Control.as("@a[distance=..2]"), Control.at("@s"), Control.unless("block", "~", "~-2", "~", "#mcm:passable"), Control.when("block", "~", "~-1", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/zzz/4"), Control.as("@a[distance=..2]"), Control.at("@s"), Control.unless("block", "~", "~-1", "~", "#mcm:passable"), Control.when("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "attack_cooldown", "100"));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/zzz/3
    private static int f21(Frame c) {
        Logic.step(() -> Native.setblock(c, "~", "~-1", "~", "cobweb"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.sweet_berry_bush.pick_berries", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.spider.ambient", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/zzz/4
    private static int f22(Frame c) {
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "cobweb"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.sweet_berry_bush.pick_berries", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.spider.ambient", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/zzz/5
    private static int f23(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/remove/this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/zzz/6"), Control.as("@e[type=spider,tag=mutant_spider_ai,limit=1,sort=nearest,tag=this_mutant_spider_ai]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
}
