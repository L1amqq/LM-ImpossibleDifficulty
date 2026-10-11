package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled183 {
    public static void register() {
        Logic.register("impossible_to_survive:features/enderpearl/zzz/13", Compiled183::f0);
        Logic.register("impossible_to_survive:features/enderpearl/zzz/14", Compiled183::f1);
        Logic.register("impossible_to_survive:features/enderpearl/zzz/2", Compiled183::f2);
        Logic.register("impossible_to_survive:features/enderpearl/zzz/3", Compiled183::f3);
        Logic.register("impossible_to_survive:features/enderpearl/zzz/4", Compiled183::f4);
        Logic.register("impossible_to_survive:features/enderpearl/zzz/5", Compiled183::f5);
        Logic.register("impossible_to_survive:features/enderpearl/zzz/6", Compiled183::f6);
        Logic.register("impossible_to_survive:features/enderpearl/zzz/7", Compiled183::f7);
        Logic.register("impossible_to_survive:features/enderpearl/zzz/8", Compiled183::f8);
        Logic.register("impossible_to_survive:features/enderpearl/zzz/9", Compiled183::f9);
        Logic.register("impossible_to_survive:features/eye/dragon_explode", Compiled183::f10);
        Logic.register("impossible_to_survive:features/eye/dragon_loop", Compiled183::f11);
        Logic.register("impossible_to_survive:features/eye/face_dragon", Compiled183::f12);
        Logic.register("impossible_to_survive:features/eye/loop", Compiled183::f13);
        Logic.register("impossible_to_survive:features/eye/summon_dragon", Compiled183::f14);
        Logic.register("impossible_to_survive:features/eye/zzz/0", Compiled183::f15);
        Logic.register("impossible_to_survive:features/eye/zzz/1", Compiled183::f16);
        Logic.register("impossible_to_survive:features/eye/zzz/2", Compiled183::f17);
        Logic.register("impossible_to_survive:features/fishing/caught_fish", Compiled183::f18);
        Logic.register("impossible_to_survive:features/fishing/proj_loop_2s", Compiled183::f19);
        Logic.register("impossible_to_survive:features/fishing/proj_motion_macro", Compiled183::f20, "x", "y", "z");
        Logic.register("impossible_to_survive:features/fishing/projectile_summon", Compiled183::f21);
        Logic.register("impossible_to_survive:features/fishing/zzz/0", Compiled183::f22);
        Logic.register("impossible_to_survive:features/furnace/furnace_lit_loop", Compiled183::f23);
    }
    // impossible_to_survive:features/enderpearl/zzz/13
    private static int f0(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~-0.5", "~"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this_entity"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.id", "=", "@s", "mcm.id"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/enderpearl/zzz/14"), Control.as("@e[type=item_display,tag=ender_pearl_laser_origin]"), Control.when("score", "@s", "mcm.id", "=", "#this", "mcm.id")));
        Logic.step(() -> Native.particle(c, "minecraft:dragon_breath", "~", "~", "~", "0.4", "0.2", "0.5", "0.2", "20", "force"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this_entity"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/enderpearl/zzz/14
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "lifetime", "195"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "facing", "entity", "@n[tag=this_entity]", "feet"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/enderpearl/zzz/2
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{start_interpolation:0,interpolation_duration:10,transformation:{left_rotation:[0f,0.0f,-0.707f,0.707f],right_rotation:[0f,0f,0f,1f],translation:[0.075f,-0.05f,0f],scale:[2f,2f,2f]}}"));
        return 1;
    }
    // impossible_to_survive:features/enderpearl/zzz/3
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:0,interpolation_duration:10,transformation:{left_rotation:[0f,0.0f,1.0f,0.0f],right_rotation:[0f,0f,0f,1f],translation:[-0.05f,-0.05f,0f]}}"), Control.when("score", "@s", "eye_rot_timer", "matches", "10")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:0,interpolation_duration:10,transformation:{left_rotation:[0f,0.0f,0.707f,0.707f],right_rotation:[0f,0f,0f,1f],translation:[-0.05f,0.075f,0f]}}"), Control.when("score", "@s", "eye_rot_timer", "matches", "20")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:0,interpolation_duration:10,transformation:{left_rotation:[0f,0.0f,0.0f,1.0f],right_rotation:[0f,0f,0f,1f],translation:[0.075f,0.075f,0f],}}"), Control.when("score", "@s", "eye_rot_timer", "matches", "30")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:0,interpolation_duration:10,transformation:{left_rotation:[0f,0.0f,-0.707f,0.707f],right_rotation:[0f,0f,0f,1f],translation:[0.075f,-0.05f,0f]}}"), Control.when("score", "@s", "eye_rot_timer", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:features/enderpearl/zzz/4
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.id", "=", "@s", "mcm.id"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "corresponding_pearl"), Control.as("@e[type=armor_stand,tag=ender_pearl_marker]"), Control.when("score", "@s", "mcm.id", "=", "#this", "mcm.id")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.anchored("feet"), Control.facing("entity", "@n[type=armor_stand,tag=corresponding_pearl]", "feet"), Control.positioned("^", "^", "^0.3"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.7"), Control.facing("entity", "@s", "feet"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Native.tag(c, "@e[tag=corresponding_pearl]", "remove", "corresponding_pearl"));
        return 1;
    }
    // impossible_to_survive:features/enderpearl/zzz/5
    private static int f5(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "this_entity"));
        Logic.step(() -> Native.playsound(c, "minecraft:laser_shoot_1", "master", "@a", "~", "~", "~", "10.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.illusioner.cast_spell", "master", "@a", "~", "~", "~", "10.0", "1.0"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.rf.rainbow_laser_raycast\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/enderpearl/zzz/6"), Control.as("@e[type=marker,tag=mcm.rf.rainbow_laser_raycast,distance=..0.1]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/enderpearl/zzz/7"), Control.as("@e[type=#mcm:mobs_and_player,tag=mcm.rf.rainbow_laser_hit]"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this_entity"));
        return 1;
    }
    // impossible_to_survive:features/enderpearl/zzz/6
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@n[tag=this_entity]", "Rotation[0]", "1"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@n[tag=this_entity]", "Rotation[1]", "1"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/enderpearl/laser_raycast"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/enderpearl/zzz/7
    private static int f7(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.rf.rainbow_laser_hit"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~1", "~", "0.2", "0.5", "0.2", "0.2", "10", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~1", "~", "0.2", "0.5", "0.2", "0.2", "10", "force"));
        Logic.step(() -> Native.particle(c, "electric_spark", "~", "~1", "~", "0.4", "0.8", "0.4", "0.1", "10", "force"));
        return 1;
    }
    // impossible_to_survive:features/enderpearl/zzz/8
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.iterations", "101"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{CustomName:'\"Enderpearl\"',Tags:[\"mcm.death_message_marker\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/enderpearl/zzz/9"), Control.as("@a[distance=..2.5,tag=survivor,predicate=mcm:gm/vulnerable]")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.death_message_marker]"));
        return 1;
    }
    // impossible_to_survive:features/enderpearl/zzz/9
    private static int f9(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.bee.sting", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.generic.explode", "master", "@a", "~", "~", "~", "0.1", "1.0"));
        Logic.step(() -> Native.particle(c, "minecraft:explosion_emitter", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/enderpearl/zzz/10"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/enderpearl/zzz/11"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/enderpearl/zzz/12"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/eye/dragon_explode
    private static int f10(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/ender_eye"));
        Logic.step(() -> Native.particle(c, "explosion_emitter", "~", "~", "~", "0", "0", "0", "0.1", "3", "force"));
        Logic.step(() -> Native.summon(c, "dragon_fireball", "~", "~", "~", "{life:2,acceleration_power:1d,Motion:[0.0,-1.0,0.0]}"));
        Logic.step(() -> Native.particle(c, "minecraft:dragon_breath", "~", "~", "~", "0", "0", "0", "1", "300", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/eye/zzz/0"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..3]")));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.ender_dragon.hurt", "master", "@a", "~", "~", "~", "0.5", "1.0"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/eye/dragon_loop
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "dragon_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.7", "~-2", "~1.5"), Control.when("score", "@s", "dragon_lt", "matches", "10..20"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.7", "~-4", "~"), Control.when("score", "@s", "dragon_lt", "matches", "21..30"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.7", "~-6", "~"), Control.when("score", "@s", "dragon_lt", "matches", "31..40"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/eye/zzz/1"), Control.when("score", "@s", "dragon_lt", "matches", "41..150")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.when("score", "@s", "dragon_lt", "matches", "10..150"), Control.at("@s"), Control.store("result", "entity", "@s", "Pose.Head[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":22}}]}"), Control.when("score", "@s", "dragon_lt", "matches", "10"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/eye/zzz/2"), Control.when("score", "@s", "dragon_lt", "matches", "10.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.fill(x0, "~0.7", "~0.7", "~0.7", "~-0.7", "~-0.7", "~-0.7", "air", "destroy"), Control.when("score", "@s", "dragon_lt", "matches", "14.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "dragon_lt", "matches", "150.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/eye/dragon_explode"), Control.when("score", "@s", "dragon_lt", "matches", "20.."), Control.at("@s"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..2]")));
        return 1;
    }
    // impossible_to_survive:features/eye/face_dragon
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "facing", "entity", "@e[type=eye_of_ender,limit=1,sort=nearest]"), Control.as("@e[type=armor_stand,tag=dragon_center,limit=1,sort=nearest]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/eye/loop
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "eye_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/eye/summon_dragon"), Control.when("score", "@s", "eye_lt", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/eye/face_dragon"), Control.when("score", "@s", "eye_lt", "matches", "3"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/eye/summon_dragon
    private static int f14(Frame c) {
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{CustomName:'\"Baby Dragon\"',Invisible:1,Marker:1,Small:1,Tags:[\"dragon_center\"],NoGravity:1,Pose:{Head:[0.1f,0.1f,0.1f]}}"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "0.2", "0.2", "0.2", "0.1", "50", "force"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:ender_eye\"}", "~", "~", "~", "1", "1", "1", "0.1", "40"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.ender_dragon.growl", "master", "@a", "~", "~", "~", "0.5", "1.3"));
        return 1;
    }
    // impossible_to_survive:features/eye/zzz/0
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:mob_attack", "by", "@n[type=armor_stand,tag=dragon_center]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "12", "minecraft:mob_attack", "by", "@n[type=armor_stand,tag=dragon_center]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "16", "minecraft:mob_attack", "by", "@n[type=armor_stand,tag=dragon_center]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/eye/zzz/1
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable]", "eyes"), Control.positioned("^", "^", "^1.5"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^6"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.7"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/eye/zzz/2
    private static int f17(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~0.5", "~", "0.5", "0.5", "0.5", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~0.5", "~", "0", "0", "0", "0.01", "1", "force"));
        return 1;
    }
    // impossible_to_survive:features/fishing/caught_fish
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.fished", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/fishing/projectile_summon"), Control.as("@e[type=item,nbt={Age:0s},distance=..25]"), Control.at("@s"), Control.positioned("~", "~0.5", "~")));
        return 1;
    }
    // impossible_to_survive:features/fishing/proj_loop_2s
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("entity", "@s[nbt={inGround:1b}]")));
        return 1;
    }
    // impossible_to_survive:features/fishing/proj_motion_macro
    private static int f20(Frame c) {
        Logic.step(() -> Native.summon(c, "trident", "~", "~", "~", "{Tags:[\"fishing_trident\"],Motion:[$(x),$(y),$(z)]}"));
        return 1;
    }
    // impossible_to_survive:features/fishing/projectile_summon
    private static int f21(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/trident"));
        Logic.step(() -> Native.playsound(c, "minecraft:item.trident.throw", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.particle(c, "cloud", "~", "~", "~", "0.1", "0.1", "0.1", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "splash", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "25", "force"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~1", "~", "{Tags:[\"imps_trident_motion\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/fishing/zzz/0"), Control.as("@e[type=marker,tag=imps_trident_motion]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/fishing/zzz/0
    private static int f22(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,sort=nearest]"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1000"), Control.store("result", "score", "@s", "x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1000"), Control.store("result", "score", "@s", "y")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1000"), Control.store("result", "score", "@s", "z")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1000"), Control.store("result", "score", "@s", "dx")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1000"), Control.store("result", "score", "@s", "dy")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1000"), Control.store("result", "score", "@s", "dz")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "dx", "-=", "@s", "x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "dy", "-=", "@s", "y"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "dy", "50"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "dz", "-=", "@s", "z"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dx"), Control.store("result", "storage", "mcm:temp", "position.x", "float", "0.0075")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dy"), Control.store("result", "storage", "mcm:temp", "position.y", "float", "0.0075")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dz"), Control.store("result", "storage", "mcm:temp", "position.z", "float", "0.0075")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/fishing/proj_motion_macro", "with", "storage", "mcm:temp", "position"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/furnace/furnace_lit_loop
    private static int f23(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "furnace_lit"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@a[distance=..30,tag=survivor,predicate=mcm:gm/vulnerable]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/2"), Control.when("score", "@s", "furnace_lit_timer", "matches", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "furnace_lit_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "flame", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/25_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "flame", "~", "~", "~", "0.5", "0.5", "0.5", "0.01", "1"), Control.when("predicate", "impossible_to_survive:random/50_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/25_percent")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "misc", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s[scores={misc=10..}]", "misc", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/3"), Control.when("block", "~", "~", "~", "furnace[facing=north]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/38"), Control.when("block", "~", "~", "~", "furnace[facing=south]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/73"), Control.when("block", "~", "~", "~", "furnace[facing=west]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/108"), Control.when("block", "~", "~", "~", "furnace[facing=east]")));
        return 1;
    }
}
