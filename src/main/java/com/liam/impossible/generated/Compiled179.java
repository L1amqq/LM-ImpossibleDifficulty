package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled179 {
    public static void register() {
        Logic.register("impossible_to_survive:features/chest_mob/zzz/15", Compiled179::f0);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/16", Compiled179::f1);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/17", Compiled179::f2);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/18", Compiled179::f3);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/19", Compiled179::f4);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/2", Compiled179::f5);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/20", Compiled179::f6);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/21", Compiled179::f7);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/22", Compiled179::f8);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/23", Compiled179::f9);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/24", Compiled179::f10);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/25", Compiled179::f11);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/26", Compiled179::f12);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/27", Compiled179::f13);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/28", Compiled179::f14);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/3", Compiled179::f15);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/4", Compiled179::f16);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/5", Compiled179::f17);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/6", Compiled179::f18);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/7", Compiled179::f19);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/8", Compiled179::f20);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/9", Compiled179::f21);
        Logic.register("impossible_to_survive:features/coal/timer", Compiled179::f22);
        Logic.register("impossible_to_survive:features/coal/timer_display_loop", Compiled179::f23);
    }
    // impossible_to_survive:features/chest_mob/zzz/15
    private static int f0(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"deadly_chest_marker\",\"chest_east\"],Rotation:[-90.0f]}"));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/summon", "{args:{variant:'shulker',animation:'shoot',start_animation:true}}"));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/summon", "{args:{variant:'chest',animation:'shoot',start_animation:true}}"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/16
    private static int f1(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"deadly_chest_marker\",\"chest_west\"],Rotation:[90.0f]}"));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/summon", "{args:{variant:'shulker',animation:'shoot',start_animation:true}}"));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/summon", "{args:{variant:'chest',animation:'shoot',start_animation:true}}"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/17
    private static int f2(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"deadly_chest_marker\",\"chest_south\"],Rotation:[0.0f]}"));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/summon", "{args:{variant:'shulker',animation:'shoot',start_animation:true}}"));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/summon", "{args:{variant:'chest',animation:'shoot',start_animation:true}}"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/18
    private static int f3(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"deadly_chest_marker\",\"chest_north\"],Rotation:[180.0f]}"));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/summon", "{args:{variant:'shulker',animation:'shoot',start_animation:true}}"));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/summon", "{args:{variant:'chest',animation:'shoot',start_animation:true}}"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/19
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.cloneBlocks(x1, "~", "~", "~", "~", "~", "~", "~", "-64", "~"), Control.when("block", "~", "~", "~", "chest")), Control.when("predicate", "mcm:in_overworld")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.cloneBlocks(x1, "~", "~", "~", "~", "~", "~", "~", "0", "~"), Control.when("block", "~", "~", "~", "chest")), Control.when("predicate", "mcm:in_the_nether")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.cloneBlocks(x1, "~", "~", "~", "~", "~", "~", "~", "0", "~"), Control.when("block", "~", "~", "~", "chest")), Control.when("predicate", "mcm:in_the_end")));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/2
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "chest_check_timer", "1"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/chest_mob/chest_check"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/20
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/21"), Control.as("@n[type=item_display,tag=aj.chest_mob.root,tag=shulker_variant,distance=..0.1]")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/21
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.anchored("feet"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable]", "feet"), Control.positioned("^", "^", "^0.1"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.9"), Control.facing("entity", "@s", "feet"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..30]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/22
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "chest[facing=south]"), Control.when("entity", "@s[tag=chest_south]")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "chest[facing=west]"), Control.when("entity", "@s[tag=chest_west]")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "chest[facing=east]"), Control.when("entity", "@s[tag=chest_east]")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "chest[facing=north]"), Control.when("entity", "@s[tag=chest_north]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/23"), Control.when("predicate", "mcm:in_overworld")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/24"), Control.when("predicate", "mcm:in_the_nether")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/25"), Control.when("predicate", "mcm:in_the_end")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/23
    private static int f9(Frame c) {
        Logic.step(() -> Native.cloneBlocks(c, "~", "-64", "~", "~", "-64", "~", "~", "~", "~"));
        Logic.step(() -> Native.setblock(c, "~", "-64", "~", "bedrock"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/24
    private static int f10(Frame c) {
        Logic.step(() -> Native.cloneBlocks(c, "~", "0", "~", "~", "0", "~", "~", "~", "~"));
        Logic.step(() -> Native.setblock(c, "~", "0", "~", "bedrock"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/25
    private static int f11(Frame c) {
        Logic.step(() -> Native.cloneBlocks(c, "~", "0", "~", "~", "0", "~", "~", "~", "~"));
        Logic.step(() -> Native.setblock(c, "~", "0", "~", "air"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/26
    private static int f12(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{CustomName:'\"Chest\"',Tags:[\"mcm.death_message_marker\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/27"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..0.5]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.death_message_marker]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "raycast_iterations", "101"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/27
    private static int f13(Frame c) {
        Logic.step(() -> Native.particle(c, "minecraft:splash", "~", "~1", "~", "0.4", "0.9", "0.4", "0.1", "30", "force"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:arrow", "by", "@e[type=marker,tag=mcm.death_message_marker,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:arrow", "by", "@e[type=marker,tag=mcm.death_message_marker,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "15", "minecraft:arrow", "by", "@e[type=marker,tag=mcm.death_message_marker,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/28
    private static int f14(Frame c) {
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:stone\"}", "^", "^", "^-0.2", "0.1", "0.1", "0.1", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:gray_wool\"}", "^", "^", "^-0.2", "0.1", "0.1", "0.1", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:dirt\"}", "^", "^", "^-0.2", "0.1", "0.1", "0.1", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "^", "^", "^-0.2", "0.05", "0.05", "0.05", "0.1", "4", "force"));
        Logic.step(() -> Native.particle(c, "explosion", "^", "^", "^-0.2", "0.05", "0.05", "0.05", "0.1", "1", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "raycast_iterations", "101"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/3
    private static int f15(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "chest_looking"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^-0.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^0", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^0", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^0", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^0", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^0", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^0", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^-0.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^-0.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^-0.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^-0.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^0", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^0.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^0.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^0.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^0.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^0.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^0.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^0.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^0.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^0.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^0.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^0.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^1", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^1", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^1", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^1", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^1", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^1", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^0.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^0.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^0.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^0.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^1", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^1.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^1.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^1.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^1.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^1.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^1.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^1.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^1.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^1.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^1.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^1.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^2", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^2", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^2", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^2", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^2", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^2", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^1.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^1.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^1.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^1.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^2", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^2.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^2.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^2.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^2.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^2.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^2.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^2.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^2.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^2.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^2.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^2.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^3", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^3", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^3", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^3", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^3", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^3", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^2.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^2.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^2.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^2.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^3", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^3.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^3.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^3.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^3.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^3.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^3.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^3.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^3.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^3.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^3.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^3.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^4", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^4", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^4", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^4", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^4", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^4", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^3.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^3.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^3.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^3.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^4", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^4.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^4.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^4.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^4.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^4.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^4.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^4.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^4.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^4.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^4.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^4.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^4.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^4.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^4.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^4.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^5.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^5.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^5.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^5.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^5.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^5.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^5.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^5.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^5.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^5.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^5.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^6", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^6", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^6", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^6", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^6", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^6", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^5.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^5.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^5.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^5.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^6", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^6.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^6.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^6.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^6.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^6.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^6.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^6.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^6.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^6.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^6.25", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^", "^6.5", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^7", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^1.5", "^", "^7", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.5", "^", "^7", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.5", "^", "^7", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^0.5", "^7", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^", "^-0.5", "^7", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^0.75", "^6.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^-0.75", "^6.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^-0.75", "^0.75", "^6.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "chest_looking"), Control.when("block", "^0.75", "^-0.75", "^6.75", "minecraft:chest[type=single]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/4"), Control.when("entity", "@s[tag=chest_looking]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/12"), Control.unless("entity", "@s[tag=chest_looking]"), Control.when("score", "@s", "chest_check_timer", "matches", "..20")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "chest_looking"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/4
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/5"), Control.when("entity", "@e[type=area_effect_cloud,tag=chest_looked_aec,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/9"), Control.unless("entity", "@s[tag=unchanged_position]"), Control.when("score", "@s", "chest_check_timer", "matches", "..18")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "unchanged_position"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/10")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/5
    private static int f17(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "unchanged_position"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]", "1"), Control.store("result", "score", "@s", "chest_look_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]", "1"), Control.store("result", "score", "@s", "chest_look_y")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/6"), Control.when("score", "@e[type=area_effect_cloud,tag=chest_looked_aec,limit=1,sort=nearest]", "chest_look_x", "=", "@s", "chest_look_x"), Control.when("score", "@e[type=area_effect_cloud,tag=chest_looked_aec,limit=1,sort=nearest]", "chest_look_y", "=", "@s", "chest_look_y")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/8"), Control.when("score", "#ifelse", "mcb.internal", "matches", "0"), Control.when("score", "@s", "chest_check_timer", "matches", "..30")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/6
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "chest_look_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/7"), Control.when("score", "@s", "chest_look_timer", "matches", "20..")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/7
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "chest_look_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "chest_check_timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/chest_mob/summon_aj_chest"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/8
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "chest_look_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "chest_check_timer", "0"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/9
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "chest_look_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "chest_check_timer", "0"));
        return 1;
    }
    // impossible_to_survive:features/coal/timer
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/0"), Control.unless("score", "@s", "coalTimer", "matches", "1.."), Control.when("entity", "@s[nbt={OnGround:1b}]")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s[scores={coalTimer=1..}]", "coalTimer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/1"), Control.when("entity", "@s[scores={coalTimer=3}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/2"), Control.when("score", "@s", "coalTimer", "matches", "3..19")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/5"), Control.when("score", "@s", "coalTimer", "matches", "21..35")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/8"), Control.when("score", "@s", "coalTimer", "matches", "37..51")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/11"), Control.when("entity", "@s[scores={coalTimer=2}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/12"), Control.when("entity", "@s[scores={coalTimer=18}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/13"), Control.when("entity", "@s[scores={coalTimer=34}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/14"), Control.when("entity", "@s[scores={coalTimer=52}]")));
        return 1;
    }
    // impossible_to_survive:features/coal/timer_display_loop
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.positioned("~", "~-0.7", "~"), Control.unless("entity", "@e[type=item,distance=..0.1]")));
        return 1;
    }
}
