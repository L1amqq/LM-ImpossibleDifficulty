package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled196 {
    public static void register() {
        Logic.register("impossible_to_survive:features/scarecrow/zzz/8", Compiled196::f0);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/9", Compiled196::f1);
        Logic.register("impossible_to_survive:features/sculk_hand/loop", Compiled196::f2);
        Logic.register("impossible_to_survive:features/sculk_hand/player_loop_5t", Compiled196::f3);
        Logic.register("impossible_to_survive:features/sculk_hand/summon", Compiled196::f4);
        Logic.register("impossible_to_survive:features/sculk_hand/zzz/0", Compiled196::f5);
        Logic.register("impossible_to_survive:features/sculk_hand/zzz/1", Compiled196::f6);
        Logic.register("impossible_to_survive:features/sculk_hand/zzz/2", Compiled196::f7);
        Logic.register("impossible_to_survive:features/sculk_hand/zzz/3", Compiled196::f8);
        Logic.register("impossible_to_survive:features/sculk_hand/zzz/4", Compiled196::f9);
        Logic.register("impossible_to_survive:features/sculk_roots/damage_player", Compiled196::f10);
        Logic.register("impossible_to_survive:features/sculk_roots/found_spawn_block_x_neg", Compiled196::f11);
        Logic.register("impossible_to_survive:features/sculk_roots/found_spawn_block_x_pos", Compiled196::f12);
        Logic.register("impossible_to_survive:features/sculk_roots/found_spawn_block_z_neg", Compiled196::f13);
        Logic.register("impossible_to_survive:features/sculk_roots/found_spawn_block_z_pos", Compiled196::f14);
        Logic.register("impossible_to_survive:features/sculk_roots/loop", Compiled196::f15);
        Logic.register("impossible_to_survive:features/sculk_roots/player_loop_2t", Compiled196::f16);
        Logic.register("impossible_to_survive:features/sculk_roots/zzz/0", Compiled196::f17);
        Logic.register("impossible_to_survive:features/sculk_roots/zzz/1", Compiled196::f18);
        Logic.register("impossible_to_survive:features/sculk_roots/zzz/2", Compiled196::f19);
        Logic.register("impossible_to_survive:features/sculk_roots/zzz/3", Compiled196::f20);
        Logic.register("impossible_to_survive:features/shark/reduce_fish_count", Compiled196::f21);
        Logic.register("impossible_to_survive:features/shark/shark_bite", Compiled196::f22);
        Logic.register("impossible_to_survive:features/shark/shark_loop", Compiled196::f23);
    }
    // impossible_to_survive:features/scarecrow/zzz/8
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "2", "minecraft:mob_attack", "by", "@n[type=item_display,tag=scarecrow]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "4", "minecraft:mob_attack", "by", "@n[type=item_display,tag=scarecrow]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "6", "minecraft:mob_attack", "by", "@n[type=item_display,tag=scarecrow]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/9
    private static int f1(Frame c) {
        Logic.step(() -> Native.particle(c, "smoke", "~", "~1.2", "~", "0.4", "0.9", "0.4", "0.05", "2", "force"));
        return 1;
    }
    // impossible_to_survive:features/sculk_hand/loop
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_hand/zzz/0"), Control.when("score", "@s", "mcm.lifetime", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_hand/zzz/1"), Control.when("score", "@s", "mcm.lifetime", "matches", "10..23")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_hand/zzz/3"), Control.when("score", "@s", "mcm.lifetime", "matches", "24..")));
        return 1;
    }
    // impossible_to_survive:features/sculk_hand/player_loop_5t
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "hand_spawn_cd", "1"), Control.when("score", "@s", "hand_spawn_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_hand/zzz/4"), Control.unless("score", "@s", "hand_spawn_cd", "matches", "1.."), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5"), Control.when("block", "~", "~-1", "~", "sculk"), Control.unless("entity", "@e[type=item_display,distance=..2]"), Control.rotated("0", "0"), Control.unless("block", "~", "~-2", "~", "#mcm:passable"), Control.unless("block", "~", "~-3", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:features/sculk_hand/summon
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/summon", "{args:{animation:'grab',start_animation:true}}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/sculk_hand"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.illusioner.prepare_blindness", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        return 1;
    }
    // impossible_to_survive:features/sculk_hand/zzz/0
    private static int f5(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/sculk_hand/zzz/1
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_hand/zzz/2"), Control.as("@n[type=marker,tag=aj.sculk_hand_locator,distance=..3.5]"), Control.at("@s"), Control.positioned("~", "~0.5", "~")));
        return 1;
    }
    // impossible_to_survive:features/sculk_hand/zzz/2
    private static int f7(Frame c) {
        Logic.step(() -> Native.tp(c, "@p[distance=..1.85]", "~", "~-0.35", "~"));
        Logic.step(() -> Native.effect(c, "give", "@a[distance=..1.85]", "mining_fatigue", "60", "4", "false"));
        return 1;
    }
    // impossible_to_survive:features/sculk_hand/zzz/3
    private static int f8(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/remove/this"));
        return 1;
    }
    // impossible_to_survive:features/sculk_hand/zzz/4
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "hand_spawn_cd", "6"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/sculk_hand/summon"));
        return 1;
    }
    // impossible_to_survive:features/sculk_roots/damage_player
    private static int f10(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.bee.sting", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "root_hit_cd", "5"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:mob_attack", "by", "@n[type=item_display,tag=sculk_root]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "15", "minecraft:mob_attack", "by", "@n[type=item_display,tag=sculk_root]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "20", "minecraft:mob_attack", "by", "@n[type=item_display,tag=sculk_root]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/sculk_roots/found_spawn_block_x_neg
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~0.26", "~", "{CustomName:'\"Sculk Root\"',item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":21}},Tags:[\"sculk_root\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[1f,1f,0f]},Rotation:[180.0f],brightness:{sky:10,block:10}}"), Control.align("xyz"), Control.positioned("~0.5", "~0.25", "~0.5"), Control.unless("entity", "@e[type=item_display,tag=sculk_root,distance=..1]")));
        return 1;
    }
    // impossible_to_survive:features/sculk_roots/found_spawn_block_x_pos
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.01", "~0.24", "~-0.01", "{CustomName:'\"Sculk Root\"',item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":21}},Tags:[\"sculk_root\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[1f,1f,0f]},Rotation:[0.0f],brightness:{sky:10,block:10}}"), Control.align("xyz"), Control.positioned("~0.5", "~0.25", "~0.5"), Control.unless("entity", "@e[type=item_display,tag=sculk_root,distance=..1]")));
        return 1;
    }
    // impossible_to_survive:features/sculk_roots/found_spawn_block_z_neg
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.01", "~0.24", "~-0.01", "{CustomName:'\"Sculk Root\"',item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":21}},Tags:[\"sculk_root\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[1f,1f,0f]},Rotation:[90.0f],brightness:{sky:10,block:10}}"), Control.align("xyz"), Control.positioned("~0.5", "~0.25", "~0.5"), Control.unless("entity", "@e[type=item_display,tag=sculk_root,distance=..1]")));
        return 1;
    }
    // impossible_to_survive:features/sculk_roots/found_spawn_block_z_pos
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~0.26", "~", "{CustomName:'\"Sculk Root\"',item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":21}},Tags:[\"sculk_root\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[1f,1f,0f]},Rotation:[-90.0f],brightness:{sky:10,block:10}}"), Control.align("xyz"), Control.positioned("~0.5", "~0.25", "~0.5"), Control.unless("entity", "@e[type=item_display,tag=sculk_root,distance=..1]")));
        return 1;
    }
    // impossible_to_survive:features/sculk_roots/loop
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.lifetime", "matches", "41..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/zzz/2"), Control.when("score", "@s", "mcm.lifetime", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,0.0f],scale:[1f,1f,0f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "30")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/zzz/3"), Control.when("score", "@s", "mcm.lifetime", "matches", "3..35")));
        return 1;
    }
    // impossible_to_survive:features/sculk_roots/player_loop_2t
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "root_scan", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "root_hit_cd", "1"), Control.when("score", "@s", "root_hit_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/zzz/0"), Control.when("score", "@s", "root_scan", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/zzz/1"), Control.when("score", "@s", "root_scan", "matches", "2..")));
        return 1;
    }
    // impossible_to_survive:features/sculk_roots/zzz/0
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_x_pos"), Control.positioned("~", "~1", "~1"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_x_pos"), Control.positioned("~", "~1", "~3"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_x_pos"), Control.positioned("~", "~1", "~5"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_x_neg"), Control.positioned("~", "~1", "~-1"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_x_neg"), Control.positioned("~", "~1", "~-3"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_x_neg"), Control.positioned("~", "~1", "~-5"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_z_pos"), Control.positioned("~1", "~1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_z_pos"), Control.positioned("~3", "~1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_z_pos"), Control.positioned("~5", "~1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_z_neg"), Control.positioned("~-1", "~1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_z_neg"), Control.positioned("~-3", "~1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_z_neg"), Control.positioned("~-5", "~1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:root_air")));
        return 1;
    }
    // impossible_to_survive:features/sculk_roots/zzz/1
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "root_scan", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_x_pos"), Control.positioned("~", "~1", "~2"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_x_pos"), Control.positioned("~", "~1", "~4"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_x_pos"), Control.positioned("~", "~1", "~6"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_x_neg"), Control.positioned("~", "~1", "~-2"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_x_neg"), Control.positioned("~", "~1", "~-4"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_x_neg"), Control.positioned("~", "~1", "~-6"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_z_pos"), Control.positioned("~2", "~1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_z_pos"), Control.positioned("~4", "~1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_z_pos"), Control.positioned("~6", "~1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_z_neg"), Control.positioned("~-2", "~1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_z_neg"), Control.positioned("~-4", "~1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:root_air")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/found_spawn_block_z_neg"), Control.positioned("~-6", "~1", "~"), Control.when("block", "~", "~", "~", "#impossible_to_survive:root_spawn_point"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:root_air")));
        return 1;
    }
    // impossible_to_survive:features/sculk_roots/zzz/2
    private static int f19(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/sculk_root"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.composter.ready", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.sweet_berry_bush.pick_berries", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{interpolation_duration:4,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,-3.5f],scale:[2f,2f,2f]}}"));
        return 1;
    }
    // impossible_to_survive:features/sculk_roots/zzz/3
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/damage_player"), Control.positioned("^", "^-1", "^-1"), Control.as("@a[distance=..0.85,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s"), Control.unless("score", "@s", "root_hit_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/damage_player"), Control.positioned("^", "^-1", "^-2"), Control.as("@a[distance=..0.85,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s"), Control.unless("score", "@s", "root_hit_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/damage_player"), Control.positioned("^", "^-1", "^-3"), Control.as("@a[distance=..0.85,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s"), Control.unless("score", "@s", "root_hit_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/damage_player"), Control.positioned("^", "^-1", "^-4"), Control.as("@a[distance=..0.85,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s"), Control.unless("score", "@s", "root_hit_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/damage_player"), Control.positioned("^", "^-1", "^-5"), Control.as("@a[distance=..0.85,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s"), Control.unless("score", "@s", "root_hit_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/damage_player"), Control.positioned("^", "^-1", "^-6"), Control.as("@a[distance=..0.85,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s"), Control.unless("score", "@s", "root_hit_cd", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:features/shark/reduce_fish_count
    private static int f21(Frame c) {

        return 1;
    }
    // impossible_to_survive:features/shark/shark_bite
    private static int f22(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/shark"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "holding_fish"), Control.when("entity", "@s[nbt={SelectedItem:{id:\"minecraft:cod\"}}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "holding_fish"), Control.when("entity", "@s[nbt={SelectedItem:{id:\"minecraft:salmon\"}}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "holding_fish"), Control.when("entity", "@s[nbt={SelectedItem:{id:\"minecraft:tropical_fish\"}}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "holding_fish"), Control.when("entity", "@s[nbt={SelectedItem:{id:\"minecraft:pufferfish\"}}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "holding_offhand_fish"), Control.when("entity", "@s[nbt={Inventory:[{Slot:-106b,id:\"minecraft:cod\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "holding_offhand_fish"), Control.when("entity", "@s[nbt={Inventory:[{Slot:-106b,id:\"minecraft:salmon\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "holding_offhand_fish"), Control.when("entity", "@s[nbt={Inventory:[{Slot:-106b,id:\"minecraft:tropical_fish\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "holding_offhand_fish"), Control.when("entity", "@s[nbt={Inventory:[{Slot:-106b,id:\"minecraft:pufferfish\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/shark/zzz/0"), Control.when("entity", "@s[tag=holding_fish]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/shark/zzz/1"), Control.when("entity", "@s[tag=holding_offhand_fish]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/shark/zzz/2"), Control.unless("entity", "@s[tag=holding_fish]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/shark/zzz/3"), Control.when("entity", "@s[tag=!holding_fish,tag=!holding_offhand_fish]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "holding_fish"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "holding_offhand_fish"));
        return 1;
    }
    // impossible_to_survive:features/shark/shark_loop
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "shark_lt", "1"));
        Logic.step(() -> Native.tp(c, "@s[scores={shark_lt=1..99}]", "^", "^", "^0.3"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "cloud", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "10"), Control.at("@s[scores={shark_lt=3}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "bubble", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "20"), Control.at("@s[scores={shark_lt=3}]")));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s[scores={shark_lt=6..}]", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":7}}]}"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "2"), Control.at("@s[scores={shark_lt=100}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "bubble", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "10"), Control.at("@s[scores={shark_lt=100}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "bubble", "~", "~", "~", "0.15", "0.15", "0.15", "0.1", "1"), Control.at("@s[scores={shark_lt=1..}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.unless("block", "~", "~", "~", "water")));
        Logic.step(() -> Native.kill(c, "@s[scores={shark_lt=100..}]"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:features/shark/shark_bite"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..2]"), Control.at("@s")), Control.when("entity", "@s[tag=has_shark_bite]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "remove", "has_shark_bite"), Control.when("entity", "@s[tag=has_shark_bite]"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..2]")));
        return 1;
    }
}
