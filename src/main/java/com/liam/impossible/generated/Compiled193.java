package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled193 {
    public static void register() {
        Logic.register("impossible_to_survive:features/nether_portal/player_loop_5t", Compiled193::f0);
        Logic.register("impossible_to_survive:features/nether_portal/soul_portal_marker_loop", Compiled193::f1);
        Logic.register("impossible_to_survive:features/nether_portal/soul_projectile_loop", Compiled193::f2);
        Logic.register("impossible_to_survive:features/nether_portal/summon_portal_markers", Compiled193::f3);
        Logic.register("impossible_to_survive:features/nether_portal/summon_soul", Compiled193::f4);
        Logic.register("impossible_to_survive:features/nether_portal/summon_soul_spawn_spots", Compiled193::f5);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/0", Compiled193::f6);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/1", Compiled193::f7);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/10", Compiled193::f8);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/11", Compiled193::f9);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/12", Compiled193::f10);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/13", Compiled193::f11);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/14", Compiled193::f12);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/15", Compiled193::f13);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/16", Compiled193::f14);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/17", Compiled193::f15);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/18", Compiled193::f16);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/19", Compiled193::f17);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/2", Compiled193::f18);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/20", Compiled193::f19);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/21", Compiled193::f20);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/22", Compiled193::f21);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/23", Compiled193::f22);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/24", Compiled193::f23);
    }
    // impossible_to_survive:features/nether_portal/player_loop_5t
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/10"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("predicate", "impossible_to_survive:in_nether_portal")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/soul_portal_marker_loop
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/17"), Control.when("score", "@s", "lifetime", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/18"), Control.when("score", "@s", "lifetime", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/19"), Control.when("score", "@s", "lifetime", "matches", "30..")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/soul_projectile_loop
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":4}}]}"), Control.when("score", "@s", "lifetime", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "entity", "@s", "Pose.Head[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.when("score", "@s", "lifetime", "matches", "5..10"), Control.at("@s"), Control.anchored("feet"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..22]", "feet"), Control.positioned("^", "^", "^0.05"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.95"), Control.facing("entity", "@s", "feet"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.when("score", "@s", "lifetime", "matches", "11..15"), Control.at("@s"), Control.anchored("feet"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..22]", "feet"), Control.positioned("^", "^", "^0.1"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.9"), Control.facing("entity", "@s", "feet"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.when("score", "@s", "lifetime", "matches", "16.."), Control.at("@s"), Control.anchored("feet"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..22]", "feet"), Control.positioned("^", "^", "^0.15"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.85"), Control.facing("entity", "@s", "feet"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.12"), Control.when("score", "@s", "lifetime", "matches", "3..9"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.18"), Control.when("score", "@s", "lifetime", "matches", "10..14"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.2"), Control.when("score", "@s", "lifetime", "matches", "15.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/22"), Control.when("score", "@s", "lifetime", "matches", "10.."), Control.unless("block", "~", "~0.5", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/23"), Control.when("score", "@s", "lifetime", "matches", "5..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/24"), Control.when("score", "@s", "lifetime", "matches", "10..80"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..0.75]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/26"), Control.when("score", "@s", "lifetime", "matches", "85..")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/summon_portal_markers
    private static int f3(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"nether_portal_marker_origin\",\"portal_block\",\"init\",\"portal_id_init\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/0"), Control.as("@e[type=marker,tag=nether_portal_marker,tag=init,distance=..0.1]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[type=marker,tag=nether_portal_marker,tag=init]", "add", "portal_axis_x"), Control.when("block", "~", "~", "~", "nether_portal[axis=x]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[type=marker,tag=nether_portal_marker,tag=init]", "add", "portal_axis_z"), Control.when("block", "~", "~", "~", "nether_portal[axis=z]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/1"), Control.as("@e[type=marker,tag=nether_portal_marker,tag=init]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#portal_last_id", "portal_id", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/8"), Control.as("@e[type=marker,tag=portal_id_init]")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/summon_soul
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/13"), Control.as("@e[tag=nether_portal_marker,tag=obsidian_block,limit=1,sort=random,distance=..15]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/summon_soul_spawn_spots
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/15"), Control.as("@e[tag=nether_portal_marker,tag=obsidian_block,tag=!no_more_valid_spots,limit=1,sort=random,distance=..10]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/0
    private static int f6(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/pos_y"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/neg_y"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/1
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/2"), Control.when("entity", "@s[tag=portal_block]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/5"), Control.when("entity", "@s[tag=obsidian_block]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "init"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/10
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/11"), Control.unless("entity", "@e[type=marker,tag=nether_portal_marker,distance=..3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/12"), Control.when("entity", "@s[scores={spawn_souls_timer=0}]")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "spawn_souls_timer", "40"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/11
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "portal_scan_offset", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "portal_scan_offset", "1"), Control.when("entity", "@s[scores={portal_scan_offset=0}]"), Control.positioned("~1", "~", "~"), Control.when("block", "~", "~", "~", "nether_portal"), Control.unless("entity", "@e[type=marker,tag=nether_portal_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "portal_scan_offset", "2"), Control.when("entity", "@s[scores={portal_scan_offset=0}]"), Control.positioned("~-1", "~", "~"), Control.when("block", "~", "~", "~", "nether_portal"), Control.unless("entity", "@e[type=marker,tag=nether_portal_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "portal_scan_offset", "3"), Control.when("entity", "@s[scores={portal_scan_offset=0}]"), Control.positioned("~", "~", "~-1"), Control.when("block", "~", "~", "~", "nether_portal"), Control.unless("entity", "@e[type=marker,tag=nether_portal_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "portal_scan_offset", "4"), Control.when("entity", "@s[scores={portal_scan_offset=0}]"), Control.positioned("~", "~", "~1"), Control.when("block", "~", "~", "~", "nether_portal"), Control.unless("entity", "@e[type=marker,tag=nether_portal_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "portal_scan_offset", "5"), Control.when("block", "~", "~", "~", "nether_portal"), Control.unless("entity", "@e[type=marker,tag=nether_portal_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/summon_portal_markers"), Control.when("score", "@s", "portal_scan_offset", "matches", "1"), Control.positioned("~1", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/summon_portal_markers"), Control.when("score", "@s", "portal_scan_offset", "matches", "2"), Control.positioned("~-1", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/summon_portal_markers"), Control.when("score", "@s", "portal_scan_offset", "matches", "3"), Control.positioned("~", "~", "~-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/summon_portal_markers"), Control.when("score", "@s", "portal_scan_offset", "matches", "4"), Control.positioned("~", "~", "~1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/summon_portal_markers"), Control.when("score", "@s", "portal_scan_offset", "matches", "5"), Control.positioned("~", "~", "~")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/12
    private static int f10(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.evoker.prepare_attack", "master", "@a", "~", "~", "~", "1.5", "0.5"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.vex.charge", "master", "@a", "~", "~", "~", "1.5", "0.7"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.illusioner.cast_spell", "master", "@a", "~", "~", "~", "1.5", "0.75"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/nether_portal"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/13
    private static int f11(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/summon_soul_spawn_spots"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=marker,tag=r,limit=1,sort=random]", "rand", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/14"), Control.as("@e[type=marker,tag=r,scores={rand=1..}]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=r]"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/14
    private static int f12(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "r"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/15
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"soul_portal\",\"pos_x\",\"r\"]}"), Control.positioned("~1", "~", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:air"), Control.unless("entity", "@e[type=marker,tag=soul_portal,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"soul_portal\",\"neg_x\",\"r\"]}"), Control.positioned("~-1", "~", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:air"), Control.unless("entity", "@e[type=marker,tag=soul_portal,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"soul_portal\",\"pos_z\",\"r\"]}"), Control.positioned("~", "~", "~1"), Control.when("block", "~", "~", "~", "#impossible_to_survive:air"), Control.unless("entity", "@e[type=marker,tag=soul_portal,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"soul_portal\",\"neg_z\",\"r\"]}"), Control.positioned("~", "~", "~-1"), Control.when("block", "~", "~", "~", "#impossible_to_survive:air"), Control.unless("entity", "@e[type=marker,tag=soul_portal,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"soul_portal\",\"pos_y\",\"r\"]}"), Control.positioned("~", "~1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:air"), Control.unless("entity", "@e[type=marker,tag=soul_portal,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"soul_portal\",\"neg_y\",\"r\"]}"), Control.positioned("~", "~-1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:air"), Control.unless("entity", "@e[type=marker,tag=soul_portal,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/16"), Control.unless("entity", "@e[type=marker,tag=soul_portal,tag=r,distance=..2]")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/16
    private static int f14(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "no_more_valid_spots"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/summon_soul_spawn_spots"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/17
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#frame", "aj.i", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/summon", "{args:{animation:'portal_spin',start_animation:true}}"), Control.when("entity", "@s[tag=pos_x]"), Control.rotated("90", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/summon", "{args:{animation:'portal_spin',start_animation:true}}"), Control.when("entity", "@s[tag=neg_x]"), Control.rotated("-90", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/summon", "{args:{animation:'portal_spin',start_animation:true}}"), Control.when("entity", "@s[tag=pos_z]"), Control.rotated("180", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/summon", "{args:{animation:'portal_spin',start_animation:true}}"), Control.when("entity", "@s[tag=neg_z]"), Control.rotated("0", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/summon", "{args:{animation:'portal_spin',start_animation:true}}"), Control.when("entity", "@s[tag=pos_y]"), Control.rotated("0", "90")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/summon", "{args:{animation:'portal_spin',start_animation:true}}"), Control.when("entity", "@s[tag=neg_y]"), Control.rotated("0", "-90")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/18
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~-0.8", "~-0.5", "~", "{CustomNameVisible:0b,CustomName:'{\"text\":\"Nether Soul\"}',Tags:[\"soul_projectile\"],Invisible:1,Marker:1,Small:1,Pose:{Head:[0.01f,00.1f,0.01f]},Rotation:[-90.0f]}"), Control.when("entity", "@s[tag=pos_x]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.8", "~-0.5", "~", "{CustomNameVisible:0b,CustomName:'{\"text\":\"Nether Soul\"}',Tags:[\"soul_projectile\"],Invisible:1,Marker:1,Small:1,Pose:{Head:[0.01f,00.1f,0.01f]},Rotation:[90.0f]}"), Control.when("entity", "@s[tag=neg_x]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~-0.5", "~-0.8", "{CustomNameVisible:0b,CustomName:'{\"text\":\"Nether Soul\"}',Tags:[\"soul_projectile\"],Invisible:1,Marker:1,Small:1,Pose:{Head:[0.01f,00.1f,0.01f]},Rotation:[0.0f]}"), Control.when("entity", "@s[tag=pos_z]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~-0.5", "~0.8", "{CustomNameVisible:0b,CustomName:'{\"text\":\"Nether Soul\"}',Tags:[\"soul_projectile\"],Invisible:1,Marker:1,Small:1,Pose:{Head:[0.01f,00.1f,0.01f]},Rotation:[180.0f]}"), Control.when("entity", "@s[tag=neg_z]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~-1.3", "~", "{CustomNameVisible:0b,CustomName:'{\"text\":\"Nether Soul\"}',Tags:[\"soul_projectile\"],Invisible:1,Marker:1,Small:1,Pose:{Head:[0.01f,00.1f,0.01f]},Rotation:[180.0f,-90.0f]}"), Control.when("entity", "@s[tag=pos_y]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~0.3", "~", "{CustomNameVisible:0b,CustomName:'{\"text\":\"Nether Soul\"}',Tags:[\"soul_projectile\"],Invisible:1,Marker:1,Small:1,Pose:{Head:[0.01f,00.1f,0.01f]},Rotation:[180.0f,90.0f]}"), Control.when("entity", "@s[tag=neg_y]")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/19
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[tag=nether_portal_marker,tag=obsidian_block,tag=no_more_valid_spots,distance=..0.1]", "remove", "no_more_valid_spots"), Control.when("entity", "@s[tag=pos_x]"), Control.positioned("~-1", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[tag=nether_portal_marker,tag=obsidian_block,tag=no_more_valid_spots,distance=..0.1]", "remove", "no_more_valid_spots"), Control.when("entity", "@s[tag=neg_x]"), Control.positioned("~1", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[tag=nether_portal_marker,tag=obsidian_block,tag=no_more_valid_spots,distance=..0.1]", "remove", "no_more_valid_spots"), Control.when("entity", "@s[tag=pos_z]"), Control.positioned("~", "~", "~-1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[tag=nether_portal_marker,tag=obsidian_block,tag=no_more_valid_spots,distance=..0.1]", "remove", "no_more_valid_spots"), Control.when("entity", "@s[tag=neg_z]"), Control.positioned("~", "~", "~1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[tag=nether_portal_marker,tag=obsidian_block,tag=no_more_valid_spots,distance=..0.1]", "remove", "no_more_valid_spots"), Control.when("entity", "@s[tag=pos_y]"), Control.positioned("~", "~-1", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[tag=nether_portal_marker,tag=obsidian_block,tag=no_more_valid_spots,distance=..0.1]", "remove", "no_more_valid_spots"), Control.when("entity", "@s[tag=neg_y]"), Control.positioned("~", "~1", "~")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/2
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/3"), Control.when("entity", "@s[tag=portal_axis_x]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/4"), Control.when("entity", "@s[tag=portal_axis_z]")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/20
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this_portal_id", "portal_id", "=", "@s", "portal_id"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.as("@e[tag=nether_portal_marker,distance=..40]"), Control.when("score", "@s", "portal_id", "=", "#this_portal_id", "portal_id")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/21
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this_portal_id", "portal_id", "=", "@s", "portal_id"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.as("@e[tag=nether_portal_marker,distance=..40]"), Control.when("score", "@s", "portal_id", "=", "#this_portal_id", "portal_id")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/22
    private static int f21(Frame c) {
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:soul_sand\"}", "~", "~0.5", "~", "0.2", "0.2", "0.2", "0.1", "10"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/23
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "mycelium", "~", "~0.6", "~", "0", "0", "0", "0.01", "1"), Control.when("predicate", "impossible_to_survive:random/50_percent")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/24
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/25"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..0.75]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "lifetime", "81"));
        return 1;
    }
}
