package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled194 {
    public static void register() {
        Logic.register("impossible_to_survive:features/nether_portal/zzz/25", Compiled194::f0);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/26", Compiled194::f1);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/27", Compiled194::f2);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/3", Compiled194::f3);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/4", Compiled194::f4);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/5", Compiled194::f5);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/6", Compiled194::f6);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/7", Compiled194::f7);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/8", Compiled194::f8);
        Logic.register("impossible_to_survive:features/nether_portal/zzz/9", Compiled194::f9);
        Logic.register("impossible_to_survive:features/obsidian/mined", Compiled194::f10);
        Logic.register("impossible_to_survive:features/obsidian/obsidian_loop", Compiled194::f11);
        Logic.register("impossible_to_survive:features/obsidian/zzz/0", Compiled194::f12);
        Logic.register("impossible_to_survive:features/obsidian/zzz/1", Compiled194::f13);
        Logic.register("impossible_to_survive:features/obsidian/zzz/2", Compiled194::f14);
        Logic.register("impossible_to_survive:features/obsidian/zzz/3", Compiled194::f15);
        Logic.register("impossible_to_survive:features/scarecrow/crow_loop", Compiled194::f16);
        Logic.register("impossible_to_survive:features/scarecrow/crow_summon", Compiled194::f17);
        Logic.register("impossible_to_survive:features/scarecrow/farmed_crop", Compiled194::f18);
        Logic.register("impossible_to_survive:features/scarecrow/loop", Compiled194::f19);
        Logic.register("impossible_to_survive:features/scarecrow/raycast", Compiled194::f20);
        Logic.register("impossible_to_survive:features/scarecrow/summon", Compiled194::f21);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/0", Compiled194::f22);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/1", Compiled194::f23);
    }
    // impossible_to_survive:features/nether_portal/zzz/25
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("score", "@s", "soul_hit_cd", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "soul_hit_cd", "10"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "2", "minecraft:mob_attack", "by", "@e[type=armor_stand,tag=soul_projectile,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:mob_attack", "by", "@e[type=armor_stand,tag=soul_projectile,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:mob_attack", "by", "@e[type=armor_stand,tag=soul_projectile,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.particle(c, "soul", "~", "~1", "~", "0.2", "0.6", "0.2", "0.1", "5", "force"));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:entity.vex.death", "master", "@a", "~", "~", "~", "1.5", "0.75"), Control.when("predicate", "impossible_to_survive:random/75_percent")));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.generic.hurt", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.bee.sting", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/26
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/27"), Control.unless("entity", "@a[distance=..3]")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/27
    private static int f2(Frame c) {
        Logic.step(() -> Native.particle(c, "smoke", "~", "~0.6", "~", "0.1", "0.1", "0.1", "0.1", "4", "force"));
        Logic.step(() -> Native.particle(c, "soul", "~", "~0.6", "~", "0.0", "0.0", "0.0", "0.01", "1", "force"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/3
    private static int f3(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/portal/pos_x"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/portal/neg_x"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/4
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/portal/pos_z"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/portal/neg_z"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/5
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/6"), Control.when("entity", "@s[tag=portal_axis_x]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/7"), Control.when("entity", "@s[tag=portal_axis_z]")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/6
    private static int f6(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/obsidian/pos_x"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/obsidian/neg_x"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/7
    private static int f7(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/obsidian/pos_z"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/obsidian/neg_z"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/8
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "portal_id", "=", "#portal_last_id", "portal_id"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "portal_id_init"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/zzz/9
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "spawn_souls_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/summon_soul"), Control.when("predicate", "impossible_to_survive:random/50_percent")));
        return 1;
    }
    // impossible_to_survive:features/obsidian/mined
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/obsidian/zzz/0"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:obsidian\"},Age:0s},distance=..15]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/obsidian/obsidian_loop
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:obsidian\"}", "~", "~", "~", "0.2", "0.2", "0.2", "0.1", "1", "force"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:20,start_interpolation:0,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-0.0f,-0.0f,-0.0f],scale:[0f,0f,0f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/obsidian/zzz/2"), Control.when("score", "@s", "mcm.lifetime", "matches", "20..")));
        return 1;
    }
    // impossible_to_survive:features/obsidian/zzz/0
    private static int f12(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/obsidian"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/obsidian/zzz/1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/obsidian/zzz/1
    private static int f13(Frame c) {
        Logic.step(() -> Native.summon(c, "block_display", "~", "~", "~", "{interpolation_duration:20,start_interpolation:0,Tags:[\"shrinking_obsidian_block\"],block_state:{Name:\"minecraft:obsidian\"},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-0.5f,-0.5f,-0.5f],scale:[1f,1f,1f]}}"));
        return 1;
    }
    // impossible_to_survive:features/obsidian/zzz/2
    private static int f14(Frame c) {
        Logic.step(() -> Native.kill(c, "@s"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:obsidian\"}", "~", "~0.5", "~", "0.9", "0.9", "0.9", "0.1", "20", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.generic.explode", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "0", "0", "0", "0.1", "20", "force"));
        Logic.step(() -> Native.particle(c, "explosion_emitter", "~", "~", "~", "0", "0", "0", "0.1", "3", "force"));
        Logic.step(() -> Native.summon(c, "item", "~", "~0.25", "~", "{PickupDelay:20,Invulnerable:1,Item:{id:\"minecraft:obsidian\",count:1}}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/obsidian/zzz/3"), Control.when("entity", "@a[distance=..7]")));
        return 1;
    }
    // impossible_to_survive:features/obsidian/zzz/3
    private static int f15(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{CustomName:'\"Obsidian\"',Tags:[\"mcm.death_message_marker\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.damage(x1, "@s", "3", "minecraft:explosion", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.as("@a[distance=..7]")), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.damage(x1, "@s", "6", "minecraft:explosion", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.as("@a[distance=..7]")), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.damage(x1, "@s", "9", "minecraft:explosion", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.as("@a[distance=..7]")), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.death_message_marker]"));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/crow_loop
    private static int f16(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~8", "~"), Control.when("entity", "@s[tag=crow1]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-8", "~"), Control.when("entity", "@s[tag=crow2]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~9", "~"), Control.when("entity", "@s[tag=crow3]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-9", "~"), Control.when("entity", "@s[tag=crow4]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~10", "~"), Control.when("entity", "@s[tag=crow5]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-10", "~"), Control.when("entity", "@s[tag=crow6]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/10"), Control.at("@s"), Control.positioned("^2", "^0.75", "^")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/11"), Control.when("score", "@s", "mcm.lifetime", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/12"), Control.when("score", "@s", "mcm.lifetime", "matches", "590")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/13"), Control.when("score", "@s", "mcm.lifetime", "matches", "600..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "blaze_rod_y_timer", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s[scores={blaze_rod_y_timer=30..}]", "blaze_rod_y_timer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/14"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "0..13"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/21"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "14..29"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/crow_summon
    private static int f17(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:2,teleportation_duration:2,Tags:[\"crow\",\"crow1\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":15}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[2f,0.75f,0f],scale:[0f,0f,0f]},brightness:{sky:15,block:15}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Rotation:[70.0f],teleport_duration:2,teleportation_duration:2,Tags:[\"crow\",\"crow2\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":15}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[2f,0.75f,0f],scale:[0f,0f,0f]},brightness:{sky:15,block:15}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Rotation:[221.0f],teleport_duration:2,teleportation_duration:2,Tags:[\"crow\",\"crow3\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":15}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[2f,0.75f,0f],scale:[0f,0f,0f]},brightness:{sky:15,block:15}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Rotation:[292.0f],teleport_duration:2,teleportation_duration:2,Tags:[\"crow\",\"crow4\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":15}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[2f,0.75f,0f],scale:[0f,0f,0f]},brightness:{sky:15,block:15}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Rotation:[125.0f],teleport_duration:2,teleportation_duration:2,Tags:[\"crow\",\"crow5\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":15}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[2f,0.75f,0f],scale:[0f,0f,0f]},brightness:{sky:15,block:15}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Rotation:[125.0f],teleport_duration:2,teleportation_duration:2,Tags:[\"crow\",\"crow6\"],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":15}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[2f,0.75f,0f],scale:[0f,0f,0f]},brightness:{sky:15,block:15}}"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@n[type=item_display,tag=crow1]", "blaze_rod_y_timer", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@n[type=item_display,tag=crow2]", "blaze_rod_y_timer", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@n[type=item_display,tag=crow3]", "blaze_rod_y_timer", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@n[type=item_display,tag=crow4]", "blaze_rod_y_timer", "15"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@n[type=item_display,tag=crow5]", "blaze_rod_y_timer", "20"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@n[type=item_display,tag=crow5]", "blaze_rod_y_timer", "25"));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/farmed_crop
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/1"), Control.when("predicate", "mcm:random/15_percent"), Control.unless("entity", "@e[type=item_display,tag=scarecrow,distance=..25]")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "farmed_wheat", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "farmed_carrot", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "farmed_potato", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "farmed_pumpkin", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "farmed_beetroot", "0"));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/loop
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/4"), Control.when("score", "@s", "mcm.lifetime", "matches", "10..590")));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~0.5", "~", "2", "1.0", "2", "0.05", "5", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/5"), Control.when("score", "@s", "mcm.lifetime", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/crow_loop"), Control.as("@e[type=item_display,tag=crow,distance=..2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/6"), Control.when("score", "@s", "mcm.lifetime", "matches", "600..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,0f],scale:[0f,0f,0f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "590")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "scarecrow_damage_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/7"), Control.when("score", "@s", "scarecrow_damage_timer", "matches", "10..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/9"), Control.as("@a[distance=..5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/raycast
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.iterations", "1"));
        Logic.step(() -> Native.tp(c, "@s", "^", "^", "^0.2"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/2"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/raycast"), Control.unless("score", "@s", "mcm.iterations", "matches", "40.."), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.iterations", "matches", "40..")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/summon
    private static int f21(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/scarecrow"));
        Logic.step(() -> Native.playsound(c, "minecraft:crow", "master", "@a", "~", "~", "~", "0.5", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.illusioner.cast_spell", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[scarecrow],item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":13}},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,0f],scale:[0f,0f,0f]},CustomNameVisible:0b,CustomName:'\"Scarecrow\"'}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/0"), Control.as("@e[type=item_display,tag=scarecrow,distance=..0.1]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/0
    private static int f22(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/1
    private static int f23(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~1.6", "~", "{Tags:[scarecrow_spawn_marker]}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@p", "Rotation[0]", "1"), Control.store("result", "entity", "@n[type=marker,tag=scarecrow_spawn_marker]", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@p", "Rotation[1]", "1"), Control.store("result", "entity", "@n[type=marker,tag=scarecrow_spawn_marker]", "Rotation[1]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/raycast"), Control.as("@e[type=marker,tag=scarecrow_spawn_marker]"), Control.at("@s")));
        return 1;
    }
}
