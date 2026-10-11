package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled203 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/blaze/turn_super", Compiled203::f0);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/0", Compiled203::f1);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/1", Compiled203::f2);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/10", Compiled203::f3);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/11", Compiled203::f4);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/12", Compiled203::f5);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/13", Compiled203::f6);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/14", Compiled203::f7);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/15", Compiled203::f8);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/16", Compiled203::f9);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/17", Compiled203::f10);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/2", Compiled203::f11);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/3", Compiled203::f12);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/4", Compiled203::f13);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/5", Compiled203::f14);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/6", Compiled203::f15);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/7", Compiled203::f16);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/8", Compiled203::f17);
        Logic.register("impossible_to_survive:mobs/blaze/zzz/9", Compiled203::f18);
        Logic.register("impossible_to_survive:mobs/chicken/chicken_timer", Compiled203::f19);
        Logic.register("impossible_to_survive:mobs/chicken/projectile_timer", Compiled203::f20);
        Logic.register("impossible_to_survive:mobs/chicken/zzz/0", Compiled203::f21);
        Logic.register("impossible_to_survive:mobs/chicken/zzz/1", Compiled203::f22);
        Logic.register("impossible_to_survive:mobs/chicken/zzz/2", Compiled203::f23);
    }
    // impossible_to_survive:mobs/blaze/turn_super
    private static int f0(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/blaze"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Tags:[\"super_blaze_as\",\"super_blaze_fireball\",\"init\"],Marker:1,Invisible:1}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_1\",\"super_blaze_rod_ring_1\",\"super_blaze_spin_right\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":74}}]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_2\",\"super_blaze_rod_ring_1\",\"super_blaze_spin_right\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":74}}],Rotation:[180.0f]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_3\",\"super_blaze_rod_ring_1\",\"super_blaze_spin_right\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":74}}],Rotation:[90.0f]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_4\",\"super_blaze_rod_ring_1\",\"super_blaze_spin_right\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":74}}],Rotation:[-90.0f]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_5\",\"super_blaze_rod_ring_2\",\"super_blaze_spin_right\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":75}}],Rotation:[45.0f]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_6\",\"super_blaze_rod_ring_2\",\"super_blaze_spin_right\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":75}}],Rotation:[225.0f]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_7\",\"super_blaze_rod_ring_2\",\"super_blaze_spin_right\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":75}}],Rotation:[135.0f]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_8\",\"super_blaze_rod_ring_2\",\"super_blaze_spin_right\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":75}}],Rotation:[-45.0f]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_9\",\"super_blaze_rod_ring_3\",\"super_blaze_spin_left\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":76}}],Rotation:[45.0f]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_10\",\"super_blaze_rod_ring_3\",\"super_blaze_spin_left\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":76}}],Rotation:[225.0f]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_11\",\"super_blaze_rod_ring_3\",\"super_blaze_spin_left\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":76}}],Rotation:[135.0f]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_12\",\"super_blaze_rod_ring_3\",\"super_blaze_spin_left\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":76}}],Rotation:[-45.0f]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_13\",\"super_blaze_rod_ring_4\",\"super_blaze_spin_left\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":77}}]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_14\",\"super_blaze_rod_ring_4\",\"super_blaze_spin_left\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":77}}],Rotation:[180.0f]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_15\",\"super_blaze_rod_ring_4\",\"super_blaze_spin_left\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":77}}],Rotation:[90.0f]}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Small:1,Tags:[\"super_blaze_as\",\"super_blaze_rod\",\"init\",\"super_blaze_rod_16\",\"super_blaze_rod_ring_4\",\"super_blaze_spin_left\"],DisabledSlots:2096896,Invisible:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":77}}],Rotation:[-90.0f]}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "super_blaze"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#blaze_last_id", "blaze_id", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "operation", "@s", "blaze_id", "=", "#blaze_last_id", "blaze_id"), Control.as("@e[type=armor_stand,tag=super_blaze_as,tag=init]")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "blaze_id", "=", "#blaze_last_id", "blaze_id"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_1,tag=init]", "blaze_rod_y_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_2,tag=init]", "blaze_rod_y_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_3,tag=init]", "blaze_rod_y_timer", "15"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_4,tag=init]", "blaze_rod_y_timer", "15"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_5,tag=init]", "blaze_rod_y_timer", "25"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_6,tag=init]", "blaze_rod_y_timer", "25"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_7,tag=init]", "blaze_rod_y_timer", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_8,tag=init]", "blaze_rod_y_timer", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_9,tag=init]", "blaze_rod_y_timer", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_10,tag=init]", "blaze_rod_y_timer", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_11,tag=init]", "blaze_rod_y_timer", "25"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_12,tag=init]", "blaze_rod_y_timer", "25"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_13,tag=init]", "blaze_rod_y_timer", "25"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_14,tag=init]", "blaze_rod_y_timer", "25"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_15,tag=init]", "blaze_rod_y_timer", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=armor_stand,tag=super_blaze_rod_16,tag=init]", "blaze_rod_y_timer", "10"));
        Logic.step(() -> Native.tag(c, "@e[type=armor_stand,tag=super_blaze_as,tag=init]", "remove", "init"));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/0
    private static int f1(Frame c) {
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/1
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "blazed_cd", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.5", "~", "~8", "~"), Control.at("@s")));
        Logic.step(() -> Native.particle(c, "flame", "^", "^0.75", "^6", "0", "0", "0", "0.05", "5", "force"));
        Logic.step(() -> Native.particle(c, "lava", "^", "^0.75", "^6", "0", "0", "0", "0.05", "1", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "^", "^0.75", "^6", "0", "0", "0", "0.05", "1", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/blaze_hit"), Control.at("@s"), Control.when("score", "@s", "blazed_cd", "matches", "..0"), Control.positioned("^", "^", "^6"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..3]")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/10
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/11"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "14..21"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/14"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "22..29"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/11
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/12"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "14..17"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/13"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "18..21"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/12
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.104", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "14"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "15"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.104", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "16"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.2035", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "17"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/13
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.294", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "18"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.3715", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "19"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.433", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "20"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.4755", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "21"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/14
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/15"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "22..25"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/16"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "26..29"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/15
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.4975", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "22"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.4975", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "23"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.4755", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "24"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.433", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "25"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/16
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.3715", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "26"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.294", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "27"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.2035", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "28"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.104", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "29"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/17
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:mob_attack", "by", "@n[type=blaze]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:mob_attack", "by", "@n[type=blaze]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "15", "minecraft:mob_attack", "by", "@n[type=blaze]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.particle(c, "explosion", "~", "~1", "~", "0.5", "0.7", "0.5", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "lava", "~", "~1", "~", "0.3", "0.8", "0.3", "0.2", "10", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~", "~1", "~", "0.2", "0.5", "0.2", "0.2", "10", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/2
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "blaze_rod_y_timer", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s[scores={blaze_rod_y_timer=30..}]", "blaze_rod_y_timer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.3", "~", "~8", "~"), Control.when("entity", "@s[tag=super_blaze_spin_right]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.3", "~", "~-8", "~"), Control.when("entity", "@s[tag=super_blaze_spin_left]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/3"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "0..13"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/10"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "14..29"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/3
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/4"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "0..6"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/7"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "7..13"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/4
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/5"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "0..3"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/6"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "4..6"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/5
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.104", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.2035", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.294", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "3"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/6
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.3715", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "4"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.433", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "5"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.4755", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "6"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/7
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/8"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "7..10"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/9"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "11..13"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/8
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.4975", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "7"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.4975", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "8"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.4755", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "9"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.433", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "10"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/zzz/9
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.3715", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "11"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.294", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "12"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.2035", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "13"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/chicken/chicken_timer
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "chickenTimer", "1"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s[scores={chickenTimer=2}]", "{NoAI:1,NoGravity:1,Invulnerable:1}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/chicken/zzz/0"), Control.when("entity", "@s[scores={chickenTimer=2}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "cloud", "~", "~0.5", "~", "0.15", "0.15", "0.15", "0.06", "10"), Control.when("entity", "@s[scores={chickenTimer=8}]")));
        Logic.step(() -> Native.effect(c, "give", "@s[scores={chickenTimer=10}]", "invisibility", "9999", "9", "true"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@e[type=armor_stand,tag=chicken_body,limit=1,sort=nearest]", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":10}}]}"), Control.when("entity", "@s[scores={chickenTimer=10}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@e[type=armor_stand,tag=chicken_head,limit=1,sort=nearest]", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":9}}]}"), Control.when("entity", "@s[scores={chickenTimer=10}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@e[type=armor_stand,tag=chicken_body,limit=1,sort=nearest,distance=..2]"), Control.when("entity", "@s[scores={chickenTimer=200}]")));
        Logic.step(() -> Native.kill(c, "@s[scores={chickenTimer=200..}]"));
        return 1;
    }
    // impossible_to_survive:mobs/chicken/projectile_timer
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "chicken_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/chicken/zzz/1"), Control.when("entity", "@s[scores={chicken_lt=2}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/chicken/zzz/2"), Control.when("entity", "@s[scores={chicken_lt=30}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.5", "~"), Control.when("entity", "@s[scores={chicken_lt=9}]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.33", "~"), Control.when("entity", "@s[scores={chicken_lt=10..30}]"), Control.at("@s"), Control.when("block", "~", "~0.33", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust{color:[1.0,1.0,1.0],scale:1.5}", "~", "~0.6", "~", "0", "0", "0", "0.1", "1", "force"), Control.when("entity", "@s[scores={chicken_lt=10..28}]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust{color:[1.0,1.0,1.0],scale:0.8}", "^", "^", "^-0.7", "0", "0", "0", "0.1", "2", "force"), Control.when("entity", "@s[scores={chicken_lt=32..}]"), Control.at("@s"), Control.positioned("~", "~1.3", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.3", "~", "~"), Control.when("entity", "@s[scores={chicken_lt=31..40}]"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable]", "feet"), Control.positioned("^", "^", "^0.05"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.95"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.3", "~", "~"), Control.when("entity", "@s[scores={chicken_lt=41..50}]"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable]", "feet"), Control.positioned("^", "^", "^0.15"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.85"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.3", "~", "~"), Control.when("entity", "@s[scores={chicken_lt=51..}]"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable]", "feet"), Control.positioned("^", "^", "^0.2"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.8"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.at("@s[scores={chicken_lt=31..}]"), Control.store("result", "entity", "@s", "Pose.Head[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/chicken/zzz/3"), Control.when("entity", "@s[scores={chicken_lt=30..}]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s[scores={chicken_lt=200..}]"));
        return 1;
    }
    // impossible_to_survive:mobs/chicken/zzz/0
    private static int f21(Frame c) {
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{Invisible:1,Tags:[\"chicken_body\",\"chicken_component\"],Marker:1}"));
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{Invisible:1,Tags:[\"chicken_head\",\"chicken_component\"],Marker:1,Pose:{Head:[0.1f,0.1f,0.1f]}}"));
        Logic.step(() -> Native.tp(c, "@e[type=armor_stand,tag=chicken_component,limit=2,sort=nearest]", "@s"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^-0.6", "^0.3"), Control.as("@e[type=armor_stand,tag=chicken_head,limit=1,sort=nearest]"), Control.at("@s")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/chicken"));
        return 1;
    }
    // impossible_to_survive:mobs/chicken/zzz/1
    private static int f22(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.chicken.hurt", "master", "@a"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.firework_rocket.launch", "master", "@a"));
        return 1;
    }
    // impossible_to_survive:mobs/chicken/zzz/2
    private static int f23(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.firework_rocket.twinkle", "master", "@a", "~", "~", "~", "0.5", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.chicken.ambient", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        return 1;
    }
}
