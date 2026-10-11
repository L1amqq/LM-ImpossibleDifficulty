package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled245 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/mutant_spider/zzz/6", Compiled245::f0);
        Logic.register("impossible_to_survive:mobs/mutant_spider/zzz/7", Compiled245::f1);
        Logic.register("impossible_to_survive:mobs/pig/pig_timer", Compiled245::f2);
        Logic.register("impossible_to_survive:mobs/pig/shockwave_hit", Compiled245::f3);
        Logic.register("impossible_to_survive:mobs/pig/shockwave_tick", Compiled245::f4);
        Logic.register("impossible_to_survive:mobs/pig/summon_shockwave", Compiled245::f5);
        Logic.register("impossible_to_survive:mobs/pig/zzz/0", Compiled245::f6);
        Logic.register("impossible_to_survive:mobs/pig/zzz/1", Compiled245::f7);
        Logic.register("impossible_to_survive:mobs/pig/zzz/2", Compiled245::f8);
        Logic.register("impossible_to_survive:mobs/pig/zzz/3", Compiled245::f9);
        Logic.register("impossible_to_survive:mobs/pig/zzz/4", Compiled245::f10);
        Logic.register("impossible_to_survive:mobs/pig/zzz/5", Compiled245::f11);
        Logic.register("impossible_to_survive:mobs/pig/zzz/6", Compiled245::f12);
        Logic.register("impossible_to_survive:mobs/pig/zzz/7", Compiled245::f13);
        Logic.register("impossible_to_survive:mobs/pig/zzz/8", Compiled245::f14);
        Logic.register("impossible_to_survive:mobs/sheep/sheep_dmg", Compiled245::f15);
        Logic.register("impossible_to_survive:mobs/sheep/sheep_explode", Compiled245::f16);
        Logic.register("impossible_to_survive:mobs/sheep/sheep_projectile", Compiled245::f17);
        Logic.register("impossible_to_survive:mobs/shulker/component_loop", Compiled245::f18);
        Logic.register("impossible_to_survive:mobs/shulker/despawn_shield", Compiled245::f19);
        Logic.register("impossible_to_survive:mobs/shulker/loop", Compiled245::f20);
        Logic.register("impossible_to_survive:mobs/shulker/spawn_shield", Compiled245::f21);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/0", Compiled245::f22);
        Logic.register("impossible_to_survive:mobs/shulker/zzz/1", Compiled245::f23);
    }
    // impossible_to_survive:mobs/mutant_spider/zzz/6
    private static int f0(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "-100", "~"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/mutant_spider/zzz/7
    private static int f1(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "this_mutant_spider_ai"));
        return 1;
    }
    // impossible_to_survive:mobs/pig/pig_timer
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "pigTimer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/pig/zzz/0"), Control.when("entity", "@s[scores={pigTimer=2}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/pig/zzz/1"), Control.when("entity", "@s[scores={pigTimer=8}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/pig/zzz/2"), Control.when("entity", "@s[scores={pigTimer=8..30}]")));
        Logic.step(() -> Native.effect(c, "give", "@s[scores={pigTimer=8}]", "invisibility", "9999", "9", "true"));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:entity.pig.ambient", "master", "@a", "~", "~", "~", "1.0", "1.0"), Control.when("entity", "@s[scores={pigTimer=15}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:entity.pig.saddle", "master", "@a", "~", "~", "~", "1.0", "1.0"), Control.when("entity", "@s[scores={pigTimer=33}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/pig/zzz/5"), Control.when("entity", "@s[scores={pigTimer=62}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/pig/zzz/6"), Control.when("entity", "@s[scores={pigTimer=64}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/pig/zzz/7"), Control.when("entity", "@s[scores={pigTimer=66}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/pig/zzz/8"), Control.when("entity", "@s[scores={pigTimer=71}]")));
        return 1;
    }
    // impossible_to_survive:mobs/pig/shockwave_hit
    private static int f3(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "pig_shockwave_hit"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:mob_attack", "by", "@n[type=pig]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:mob_attack", "by", "@n[type=pig]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "13", "minecraft:mob_attack", "by", "@n[type=pig]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/pig/shockwave_tick
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~1", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:passable"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:porkchop\"}", "~", "~", "~", "0.5", "0.5", "0.5", "0.1", "3", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~0.1", "~", "0.4", "0.1", "0.4", "0.05", "1", "force"));
        Logic.step(() -> Native.particle(c, "dust{color:[0.9,0.4,0.4],scale:0.5}", "^0.75", "^-0.1", "^", "0.4", "0.1", "0.4", "0.8", "1", "force"));
        Logic.step(() -> Native.particle(c, "dust{color:[0.9,0.45,0.45],scale:2}", "^-0.75", "^", "^", "0.3", "0.1", "0.3", "0.5", "1", "force"));
        Logic.step(() -> Native.particle(c, "dust{color:[0.9,0.5,0.5],scale:1.5}", "^1.5", "^-0.1", "^", "0.3", "0.1", "0.3", "0.5", "1", "force"));
        Logic.step(() -> Native.particle(c, "dust{color:[0.9,0.4,0.4],scale:3.0}", "^-1.5", "^-0.1", "^", "0.6", "0.1", "0.6", "0.2", "1", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:dirt\"}", "^-0.5", "^-0.1", "^", "0.1", "0.1", "0.1", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:stone\"}", "^0.5", "^-0.1", "^", "0.4", "0.1", "0.4", "0.1", "3", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/pig/shockwave_hit"), Control.at("@s"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable,tag=!pig_shockwave_hit,distance=..2]"), Control.at("@s"), Control.unless("block", "~", "~-0.5", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "pig_shockwave_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@a[tag=pig_shockwave_hit]", "remove", "pig_shockwave_hit"), Control.when("score", "@s", "pig_shockwave_lt", "matches", "22..")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "pig_shockwave_lt", "matches", "22..")));
        return 1;
    }
    // impossible_to_survive:mobs/pig/summon_shockwave
    private static int f5(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[0.0f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[11.25f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[22.5f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[33.75f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[45.0f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[56.25f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[67.5f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[78.75f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[90.0f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[101.25f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[112.5f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[123.75f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[135.0f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[146.25f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[157.5f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[168.75f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[180.0f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[191.25f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[202.5f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[213.75f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[225.0f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[236.25f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[247.5f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[258.75f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[270.0f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[281.25f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[292.5f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[303.75f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[315.0f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[326.25f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[337.5f]}"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"pig_shockwave\"],Rotation:[348.75f]}"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1"), Control.as("@e[type=marker,tag=pig_shockwave]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/pig/zzz/0
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{NoAI:1,NoGravity:1,Invulnerable:1}"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "0"));
        return 1;
    }
    // impossible_to_survive:mobs/pig/zzz/1
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/summon", "{args:{animation:'jump',start_animation:true}}"), Control.at("@s")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/pig"));
        return 1;
    }
    // impossible_to_survive:mobs/pig/zzz/2
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/pig/zzz/3"), Control.at("@s"), Control.when("block", "~", "~-0.1", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/pig/zzz/4"), Control.at("@s"), Control.when("block", "~", "~-0.1", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/pig/zzz/3
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.2", "~"), Control.as("@n[type=item_display,tag=aj.bouncing_pig.root,distance=..0.1]"), Control.at("@s")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~-0.1", "~"));
        return 1;
    }
    // impossible_to_survive:mobs/pig/zzz/4
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.1", "~"), Control.as("@n[type=item_display,tag=aj.bouncing_pig.root,distance=..0.1]"), Control.at("@s")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~-0.1", "~"));
        return 1;
    }
    // impossible_to_survive:mobs/pig/zzz/5
    private static int f11(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.illusioner.cast_spell", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/pig/zzz/6
    private static int f12(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.pig.hurt", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.wither.break_block", "master", "@a", "~", "~", "~", "0.15", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/pig/zzz/7
    private static int f13(Frame c) {
        Logic.step(() -> Native.particle(c, "explosion_emitter", "~", "~", "~", "0", "0", "0", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:porkchop\"}", "~", "~", "~", "1", "1", "1", "0.1", "100", "force"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:porkchop\"}", "~", "~", "~", "1.5", "0.5", "1.5", "0.1", "100", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/pig/summon_shockwave"), Control.align("y")));
        return 1;
    }
    // impossible_to_survive:mobs/pig/zzz/8
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{NoAI:0,NoGravity:0,Invulnerable:0}"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "pigTimer", "-60"));
        Logic.step(() -> Native.effect(c, "clear", "@s", "invisibility"));
        return 1;
    }
    // impossible_to_survive:mobs/sheep/sheep_dmg
    private static int f15(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.bee.sting", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:item.mace.smash_air", "master", "@a", "~", "~", "~", "0.7", "1.0"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:arrow", "by", "@n[type=sheep]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:arrow", "by", "@n[type=sheep]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "9", "minecraft:arrow", "by", "@n[type=sheep]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~1", "~", "0.2", "0.5", "0.2", "0.1", "5", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/sheep/sheep_explode
    private static int f16(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/sheep"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{Invisible:1,Sheared:1b}"));
        Logic.step(() -> Native.particle(c, "cloud", "~", "~0.5", "~", "0", "0", "0", "0.5", "10", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~0.5", "~", "0", "0", "0", "0.1", "5", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.sheep.shear", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.illusioner.cast_spell", "master", "@a", "~", "~", "~", "1.5", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.trial_spawner.ominous_activate", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[7.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.1828,0.2,1.4888]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[22.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.5619,0.2,1.3908]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[37.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.9027,0.2,1.198]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[52.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-1.182,0.2,0.9235]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[67.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-1.3808,0.2,0.5861]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[82.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-1.4854,0.2,0.2088]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[97.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-1.4888,0.2,-0.1828]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[112.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-1.3908,0.2,-0.5619]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[127.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-1.198,0.2,-0.9027]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[142.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.9235,0.2,-1.182]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[157.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.5861,0.2,-1.3808]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[172.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.2088,0.2,-1.4854]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[187.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.1828,0.2,-1.4888]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[202.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.5619,0.2,-1.3908]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[217.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.9027,0.2,-1.198]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[232.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[1.182,0.2,-0.9235]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[247.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[1.3808,0.2,-0.5861]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[262.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[1.4854,0.2,-0.2088]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[277.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[1.4888,0.2,0.1828]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[292.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[1.3908,0.2,0.5619]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[307.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[1.198,0.2,0.9027]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[322.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.9235,0.2,1.182]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[337.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.5861,0.2,1.3808]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[352.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.2088,0.2,1.4854]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[10.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.17364818,0.6,0.9848077]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[30.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.5,0.6,0.8660254]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[50.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.76604444,0.6,0.64278764]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[70.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.9396926,0.6,0.34202015]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[90.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-1.0,0.6,1.2246469E-16]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[110.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.9396926,0.6,-0.34202015]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[130.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.76604444,0.6,-0.64278764]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[150.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.5,0.6,-0.8660254]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[170.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.17364818,0.6,-0.9848077]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[190.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.17364818,0.6,-0.9848077]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[210.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.5,0.6,-0.8660254]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[230.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.76604444,0.6,-0.64278764]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[250.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.9396926,0.6,-0.34202015]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[270.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[1.0,0.6,-2.4492937E-16]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[290.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.9396926,0.6,0.34202015]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[310.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.76604444,0.6,0.64278764]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[330.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.5,0.6,0.8660254]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[350.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.17364818,0.6,0.9848077]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[15.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.15529142,0.9,0.5795555]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[45.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.42426407,0.9,0.42426407]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[75.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.5795555,0.9,0.15529142]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[105.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.5795555,0.9,-0.15529142]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[135.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.42426407,0.9,-0.42426407]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[165.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.15529142,0.9,-0.5795555]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[195.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.15529142,0.9,-0.5795555]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[225.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.42426407,0.9,-0.42426407]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[255.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.5795555,0.9,-0.15529142]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[285.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.5795555,0.9,0.15529142]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[315.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.42426407,0.9,0.42426407]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[345.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.15529142,0.9,0.5795555]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[25.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.10565457,1.0,0.22657695]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[75.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.24148145,1.0,0.06470476]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[125.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.20478801,1.0,-0.14339411]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[175.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.021788936,1.0,-0.24904868]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[225.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.17677669,1.0,-0.17677669]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[275.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.24904868,1.0,0.021788936]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[325.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.14339411,1.0,0.20478801]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[375.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[-0.06470476,1.0,0.24148145]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~0.5", "~", "{Silent:1,Rotation:[0.0f],DisabledSlots:4144959,Invisible:1,Small:1b,Tags:[\"wool_proj\",\"wool_proj_init\"],Motion:[0.0,1.1,0.0]}"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[type=armor_stand,tag=wool_proj_init]", "add", "wool_color_brown"), Control.when("entity", "@s[nbt={Color:12b}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[type=armor_stand,tag=wool_proj_init]", "add", "wool_color_gray"), Control.when("entity", "@s[nbt={Color:7b}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[type=armor_stand,tag=wool_proj_init]", "add", "wool_color_light_gray"), Control.when("entity", "@s[nbt={Color:8b}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[type=armor_stand,tag=wool_proj_init]", "add", "wool_color_black"), Control.when("entity", "@s[nbt={Color:15b}]")));
        Logic.step(() -> Native.tag(c, "@e[type=armor_stand,tag=wool_proj_init]", "remove", "wool_proj_init"));
        return 1;
    }
    // impossible_to_survive:mobs/sheep/sheep_projectile
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "sheep_wool_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "sheep_wool_lt", "100"), Control.when("entity", "@s[nbt={OnGround:1b},scores={sheep_wool_lt=3..99}]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/sheep/sheep_dmg"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..2]"), Control.at("@s")), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "sheep_wool_lt", "110"), Control.at("@s"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..2]")));
        Logic.step(() -> Native.kill(c, "@s[scores={sheep_wool_lt=110..}]"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s[scores={sheep_wool_lt=4}]", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":2}}]}"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s[scores={sheep_wool_lt=4},tag=wool_color_brown]", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":6}}]}"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s[scores={sheep_wool_lt=4},tag=wool_color_black]", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":5}}]}"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s[scores={sheep_wool_lt=4},tag=wool_color_gray]", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":4}}]}"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s[scores={sheep_wool_lt=4},tag=wool_color_light_gray]", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":3}}]}"));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/component_loop
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.misc", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/13"), Control.when("score", "@s", "mcm.misc", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/14"), Control.when("score", "@s", "mcm.misc", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/despawn_shield
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.id", "=", "@s", "mcm.id"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.as("@e[tag=shulker_shield_component]"), Control.when("score", "@s", "mcm.id", "=", "#this", "mcm.id")));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/loop
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/1"), Control.when("entity", "@s[tag=!shulker_has_shield]"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..25]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/2"), Control.when("entity", "@s[tag=shulker_has_shield]")));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/spawn_shield
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "storage", "mcm:shulker_rotation", "{rotation_1:{angle:0f,axis:[-0.0d,0.0d,1.0d]}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~1", "~", "{brightness:{sky:15,block:15},teleport_duration:3,item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":22}},Tags:[\"shulker_shield_inner\",\"shulker_shield_component\",\"mcm.init\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,3f],scale:[0f,0f,0f]}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~1", "~", "{brightness:{sky:15,block:15},teleport_duration:3,item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":23}},Tags:[\"shulker_shield_outer\",\"shulker_shield_component\",\"mcm.init\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,3f],scale:[0f,0f,0f]}}"));
        Logic.step(() -> Native.summon(c, "interaction", "~", "~1", "~", "{width:1.25f,height:1.25f,Tags:[\"shulker_interaction\",\"shulker_shield_component\",\"mcm.init\"]}"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#shulker_id", "mcm.id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.id", "=", "#shulker_id", "mcm.id"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@n[type=shulker]", "mcm.id", "=", "#shulker_id", "mcm.id"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/zzz/0"), Control.as("@e[tag=shulker_shield_component,tag=mcm.init]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/0
    private static int f22(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..26]", "feet"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.id", "=", "#shulker_id", "mcm.id"));
        return 1;
    }
    // impossible_to_survive:mobs/shulker/zzz/1
    private static int f23(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "shulker_has_shield"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/shulker/spawn_shield"));
        return 1;
    }
}
