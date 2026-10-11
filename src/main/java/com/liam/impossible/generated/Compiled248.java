package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled248 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/slime/zzz/17", Compiled248::f0);
        Logic.register("impossible_to_survive:mobs/slime/zzz/2", Compiled248::f1);
        Logic.register("impossible_to_survive:mobs/slime/zzz/3", Compiled248::f2);
        Logic.register("impossible_to_survive:mobs/slime/zzz/4", Compiled248::f3);
        Logic.register("impossible_to_survive:mobs/slime/zzz/5", Compiled248::f4);
        Logic.register("impossible_to_survive:mobs/slime/zzz/6", Compiled248::f5);
        Logic.register("impossible_to_survive:mobs/slime/zzz/7", Compiled248::f6);
        Logic.register("impossible_to_survive:mobs/slime/zzz/8", Compiled248::f7);
        Logic.register("impossible_to_survive:mobs/slime/zzz/9", Compiled248::f8);
        Logic.register("impossible_to_survive:mobs/vampire/ai_loop", Compiled248::f9);
        Logic.register("impossible_to_survive:mobs/vampire/convert", Compiled248::f10);
        Logic.register("impossible_to_survive:mobs/vampire/kill", Compiled248::f11);
        Logic.register("impossible_to_survive:mobs/vampire/line_of_sight", Compiled248::f12);
        Logic.register("impossible_to_survive:mobs/vampire/loop", Compiled248::f13);
        Logic.register("impossible_to_survive:mobs/vampire/player_loop", Compiled248::f14);
        Logic.register("impossible_to_survive:mobs/vampire/player_loop_1s", Compiled248::f15);
        Logic.register("impossible_to_survive:mobs/vampire/zzz/0", Compiled248::f16);
        Logic.register("impossible_to_survive:mobs/vampire/zzz/1", Compiled248::f17);
        Logic.register("impossible_to_survive:mobs/vampire/zzz/10", Compiled248::f18);
        Logic.register("impossible_to_survive:mobs/vampire/zzz/11", Compiled248::f19);
        Logic.register("impossible_to_survive:mobs/vampire/zzz/12", Compiled248::f20);
        Logic.register("impossible_to_survive:mobs/vampire/zzz/13", Compiled248::f21);
        Logic.register("impossible_to_survive:mobs/vampire/zzz/2", Compiled248::f22);
        Logic.register("impossible_to_survive:mobs/vampire/zzz/3", Compiled248::f23);
    }
    // impossible_to_survive:mobs/slime/zzz/17
    private static int f0(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/slime/apply_poison"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "4", "minecraft:arrow", "by", "@n[type=armor_stand,tag=slime_ball_projectile]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:arrow", "by", "@n[type=armor_stand,tag=slime_ball_projectile]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "12", "minecraft:arrow", "by", "@n[type=armor_stand,tag=slime_ball_projectile]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/2
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "slime_launch_cd", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "-40..0"), Control.store("result", "score", "@s", "slime_launch_cd")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..40]", "eyes"), Control.positioned("^", "^", "^1"), Control.unless("block", "^", "^", "^1", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..40]", "eyes"), Control.positioned("^", "^", "^1"), Control.unless("block", "^", "^", "^2", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..40]", "eyes"), Control.positioned("^", "^", "^1"), Control.unless("block", "^", "^", "^3", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..40]", "eyes"), Control.positioned("^", "^", "^1"), Control.unless("block", "^", "^", "^4", "#mcm:passable")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/slime/shoot_slime_projectile"));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/3
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..8"), Control.store("result", "score", "#temp", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/4"), Control.when("score", "#temp", "mcm.temp", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/5"), Control.when("score", "#temp", "mcm.temp", "matches", "5..8")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/4
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_1\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":19}},transformation:{left_rotation:[0.001f,0f,0.001f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[0.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_1\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":19}},transformation:{left_rotation:[0.001f,0f,0.001f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[90.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_1\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":19}},transformation:{left_rotation:[0.001f,0f,0.001f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[-90.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_1\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":19}},transformation:{left_rotation:[0.001f,0f,0.001f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[180.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/5
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_1\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":20}},transformation:{left_rotation:[0.001f,0f,0.001f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[0.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_1\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":20}},transformation:{left_rotation:[0.001f,0f,0.001f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[90.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_1\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":20}},transformation:{left_rotation:[0.001f,0f,0.001f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[-90.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_1\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":20}},transformation:{left_rotation:[0.001f,0f,0.001f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[180.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "8")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/6
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..8"), Control.store("result", "score", "#temp", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/7"), Control.when("score", "#temp", "mcm.temp", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/zzz/8"), Control.when("score", "#temp", "mcm.temp", "matches", "5..8")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/7
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_2\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":19}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[0.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_2\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":19}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[90.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_2\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":19}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[-90.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_2\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":19}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[180.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/8
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_2\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":20}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[0.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_2\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":20}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[90.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_2\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":20}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[-90.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~", "~", "{Tags:[\"slime_puddle\",\"puddle_size_2\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":20}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.01f,0f],scale:[0f,0f,0f]},Rotation:[180.0f]}"), Control.when("score", "#temp", "mcm.temp", "matches", "8")));
        return 1;
    }
    // impossible_to_survive:mobs/slime/zzz/9
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:10,transformation:{translation:[0f,0.51f,0f],scale:[1f,1f,1f]}}"), Control.when("entity", "@s[tag=puddle_size_1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:10,transformation:{translation:[0f,0.51f,0f],scale:[2.5f,1f,2.5f]}}"), Control.when("entity", "@s[tag=puddle_size_2]")));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/ai_loop
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.id", "=", "@s", "aj.id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "facing", "entity", "@p[predicate=mcm:gm/vulnerable,tag=survivor,distance=..15]", "feet"), Control.unless("entity", "@s[tag=vampire_already_bit]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.35"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/10"), Control.as("@e[type=item_display,tag=aj.vampire.root,distance=..20]"), Control.when("score", "@s", "aj.id", "=", "#this", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/11"), Control.unless("entity", "@s[tag=vampire_already_bit]"), Control.when("entity", "@p[predicate=mcm:gm/vulnerable,tag=survivor,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/13"), Control.when("entity", "@s[tag=vampire_already_bit]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this"));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/convert
    private static int f10(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "vampire_bat"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this_bat"));
        Logic.step(() -> Native.attribute(c, "@s", "minecraft:generic.scale", "base", "set", "2"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{Silent:1b}"));
        Logic.step(() -> Native.effect(c, "give", "@s", "minecraft:resistance", "infinite", "2", "true"));
        Logic.step(() -> Native.effect(c, "give", "@s", "minecraft:invisibility", "infinite", "9", "true"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.illusioner.cast_spell", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~0.75", "~", "0.5", "0.5", "0.5", "0.1", "10", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/8"), Control.as("@a[tag=this_player]"), Control.at("@s")));
        Logic.step(() -> Logic.call(c, "animated_java:vampire/summon", "{args:{animation:'fly',start_animation:true}}"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "aj.id", "=", "@e[tag=aj.vampire.root,tag=!vampire_init]", "aj.id"));
        Logic.step(() -> Native.tag(c, "@e[tag=aj.vampire.root,tag=!vampire_init]", "add", "vampire_init"));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/kill
    private static int f11(Frame c) {
        Logic.step(() -> Native.particle(c, "smoke", "~", "~0.75", "~", "1", "1", "1", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~0.75", "~", "1", "1", "1", "0.1", "5", "force"));
        Logic.step(() -> Logic.call(c, "animated_java:vampire/remove/this"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~-1000", "~"));
        Logic.step(() -> Native.kill(c, "@n[tag=vampire_bat,distance=..2]"));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/line_of_sight
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.facing("entity", "@p[tag=this_player]", "eyes"), Control.positioned("^", "^", "^1"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.facing("entity", "@p[tag=this_player]", "eyes"), Control.positioned("^", "^", "^2"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.facing("entity", "@p[tag=this_player]", "eyes"), Control.positioned("^", "^", "^4"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.as("@p[tag=this_player]"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=bat,tag=this_bat]", "eyes"), Control.positioned("^", "^", "^1"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.as("@p[tag=this_player]"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=bat,tag=this_bat]", "eyes"), Control.positioned("^", "^", "^2"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.as("@p[tag=this_player]"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=bat,tag=this_bat]", "eyes"), Control.positioned("^", "^", "^4"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/loop
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.id", "=", "@s", "aj.id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/9"), Control.as("@e[type=bat,tag=vampire_bat,distance=..20]"), Control.when("score", "@s", "aj.id", "=", "#this", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/vampire/ai_loop"), Control.as("@e[type=bat,tag=vampire_bat,distance=..1,sort=nearest,tag=this_vampire_ai]")), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/kill"), Control.unless("entity", "@e[type=bat,tag=vampire_bat,distance=..10,sort=nearest,tag=this_vampire_ai]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "remove", "this_vampire_ai"), Control.as("@e[type=bat,tag=vampire_bat,distance=..1,sort=nearest,tag=this_vampire_ai]")));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/player_loop
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/0"), Control.when("score", "@s", "blood_timer", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mob_kills", "0"));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/player_loop_1s
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/2"), Control.unless("score", "@s", "vampire_done_timer", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/5"), Control.when("score", "@s", "blood_timer", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/zzz/0
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.title(x0, "@s", "actionbar", "[{\"score\":{\"name\":\"@s\",\"objective\":\"blood_sec\"},\"color\":\"red\"}]"), Control.unless("score", "@s", "blood_10_sec", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.title(x0, "@s", "actionbar", "[{\"score\":{\"name\":\"@s\",\"objective\":\"blood_10_sec\"},\"color\":\"red\"},{\"score\":{\"name\":\"@s\",\"objective\":\"blood_sec\"},\"color\":\"red\"}]"), Control.when("score", "@s", "blood_10_sec", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/1"), Control.when("score", "@s", "mob_kills", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/zzz/1
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "blood_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "blood_sec", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "blood_10_sec", "0"));
        Logic.step(() -> Native.title(c, "@s", "actionbar", "{\"text\":\"\"}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Native.particle(c, "happy_villager", "~", "~1", "~", "0.5", "1.0", "0.5", "0.1", "5", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.strider.eat", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.cow.milk", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.experience_orb.pickup", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.title(c, "@s", "times", "5", "50", "10"));
        Logic.step(() -> Native.title(c, "@s", "title", "{\"text\":\"\",\"color\":\"green\"}"));
        Logic.step(() -> Native.title(c, "@s", "subtitle", "{\"text\":\"Blood thirst satisfied!\",\"color\":\"green\"}"));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/zzz/10
    private static int f18(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "@n[type=bat,tag=vampire_bat,tag=this]"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "0"), Control.at("@s")), Control.unless("entity", "@s[tag=vampire_already_bit]")));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/zzz/11
    private static int f19(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "vampire_already_bit"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{NoAI:1}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/12"), Control.as("@p[predicate=mcm:gm/vulnerable,tag=survivor,distance=..1.5]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/zzz/12
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "blood_timer", "60"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "blood_sec", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "blood_10_sec", "6"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/vampire"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.phantom.bite", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.title(c, "@s", "times", "5", "50", "10"));
        Logic.step(() -> Native.title(c, "@s", "title", "{\"text\":\"\",\"color\":\"green\"}"));
        Logic.step(() -> Native.title(c, "@s", "subtitle", "{\"text\":\"Infected\",\"color\":\"dark_red\"}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/vampire"));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/zzz/13
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "-49.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-50]")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.misc", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/kill"), Control.when("score", "@s", "mcm.misc", "matches", "70.."), Control.as("@e[type=item_display,tag=aj.vampire.root,tag=this,limit=1,sort=nearest]")));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/zzz/2
    private static int f22(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "this_player"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/3"), Control.when("entity", "@e[type=bat,tag=!vampire_bat,tag=!smoker_trail,distance=..15]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this_player"));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/zzz/3
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/4"), Control.as("@e[type=bat,tag=!vampire_bat,tag=!smoker_trail,distance=..15]"), Control.at("@s")));
        return 1;
    }
}
