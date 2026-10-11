package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled176 {
    public static void register() {
        Logic.register("impossible_to_survive:effects/target_indicator_a/init", Compiled176::f0);
        Logic.register("impossible_to_survive:effects/target_indicator_a/loop", Compiled176::f1);
        Logic.register("impossible_to_survive:effects/target_indicator_a/summon", Compiled176::f2);
        Logic.register("impossible_to_survive:effects/target_indicator_a/zzz/0", Compiled176::f3);
        Logic.register("impossible_to_survive:effects/target_indicator_a/zzz/1", Compiled176::f4);
        Logic.register("impossible_to_survive:effects/target_indicator_a/zzz/2", Compiled176::f5);
        Logic.register("impossible_to_survive:effects/target_indicator_a/zzz/3", Compiled176::f6);
        Logic.register("impossible_to_survive:effects/target_indicator_a/zzz/4", Compiled176::f7);
        Logic.register("impossible_to_survive:effects/target_indicator_a/zzz/5", Compiled176::f8);
        Logic.register("impossible_to_survive:features/anvil/anvil_impact_point", Compiled176::f9);
        Logic.register("impossible_to_survive:features/anvil/anvil_loop", Compiled176::f10);
        Logic.register("impossible_to_survive:features/anvil/anvil_used", Compiled176::f11);
        Logic.register("impossible_to_survive:features/anvil/interacted", Compiled176::f12);
        Logic.register("impossible_to_survive:features/anvil/place_block_marker", Compiled176::f13);
        Logic.register("impossible_to_survive:features/anvil/player_loop_1t", Compiled176::f14);
        Logic.register("impossible_to_survive:features/anvil/zzz/0", Compiled176::f15);
        Logic.register("impossible_to_survive:features/anvil/zzz/1", Compiled176::f16);
        Logic.register("impossible_to_survive:features/anvil/zzz/2", Compiled176::f17);
        Logic.register("impossible_to_survive:features/anvil/zzz/3", Compiled176::f18);
        Logic.register("impossible_to_survive:features/anvil/zzz/4", Compiled176::f19);
        Logic.register("impossible_to_survive:features/anvil/zzz/5", Compiled176::f20);
        Logic.register("impossible_to_survive:features/anvil/zzz/6", Compiled176::f21);
        Logic.register("impossible_to_survive:features/anvil/zzz/7", Compiled176::f22);
        Logic.register("impossible_to_survive:features/anvil/zzz/8", Compiled176::f23);
    }
    // impossible_to_survive:effects/target_indicator_a/init
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/target_indicator_a/loop
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/target_indicator_a/zzz/0"), Control.when("entity", "@s[tag=mcm.vfx.target_indicator_a.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/target_indicator_a/zzz/1"), Control.when("entity", "@s[tag=mcm.vfx.target_indicator_a.3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/target_indicator_a/zzz/2"), Control.when("entity", "@s[tag=mcm.vfx.target_indicator_a.4]")));
        return 1;
    }
    // impossible_to_survive:effects/target_indicator_a/summon
    private static int f2(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Rotation:[153f],teleport_duration:3,Tags:[\"mcm.vfx.target_indicator_a\",\"mcm.vfx.target_indicator_a.1\",\"mcm.vfx\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,0f],scale:[3f,0f,3f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":251}}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Rotation:[153f],teleport_duration:3,Tags:[\"mcm.vfx.target_indicator_a\",\"mcm.vfx.target_indicator_a.3\",\"mcm.vfx\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,0f],scale:[0.0f,0f,0.0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":251}}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Rotation:[153f],teleport_duration:1,Tags:[\"mcm.vfx.target_indicator_a\",\"mcm.vfx.target_indicator_a.4\",\"mcm.vfx\"],billboard:\"fixed\",item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":1}}}"));
        return 1;
    }
    // impossible_to_survive:effects/target_indicator_a/zzz/0
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:8,start_interpolation:0,transformation:{translation:[0f,2.0f,0f],scale:[4f,4f,4f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "202")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:28,start_interpolation:0,transformation:{scale:[6f,4f,6f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "210")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:3,start_interpolation:0,transformation:{translation:[0f,0.0f,0f],scale:[6f,0f,6f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "236")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "260")));
        return 1;
    }
    // impossible_to_survive:effects/target_indicator_a/zzz/1
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:25,start_interpolation:0,transformation:{translation:[0f,13.0f,0f],scale:[0.2f,26f,0.2f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:25,start_interpolation:0,transformation:{translation:[0f,12.0f,0f],scale:[0.2f,24f,0.2f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "26")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:3,start_interpolation:0,transformation:{translation:[0f,1.5f,0f],scale:[0.5f,3f,0.5f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "201")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:30,start_interpolation:0,transformation:{scale:[6f,3f,6f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "204")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:3,start_interpolation:0,transformation:{translation:[0f,0.0f,0f],scale:[6f,0f,6f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "234")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "260")));
        return 1;
    }
    // impossible_to_survive:effects/target_indicator_a/zzz/2
    private static int f5(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~8", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust_color_transition{from_color: [0.9f, 0.0f, 0.9f], scale: 1.2f, to_color: [0.95f, 0.2f, 0.95f]}", "^", "^0.3", "^11", "0.15", "0.9", "0.15", "0.01", "2", "force"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust_color_transition{from_color: [0.95f, 0.0f, 0.95f], scale: 1.3f, to_color: [0.95f, 0.3f, 0.95f]}", "^", "^0.3", "^-11", "0.15", "0.9", "0.15", "0.01", "2", "force"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust_color_transition{from_color: [1.0f, 0.2f, 1.0f], scale: 1.0f, to_color: [0.95f, 0.4f, 0.95f]}", "^11", "^0.3", "^", "0.15", "0.9", "0.15", "0.01", "2", "force"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust_color_transition{from_color: [0.8f, 0.2f, 0.8f], scale: 1.1f, to_color: [0.95f, 0.5f, 0.95f]}", "^-11", "^0.3", "^", "0.15", "0.9", "0.15", "0.01", "2", "force"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/target_indicator_a/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "..0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/target_indicator_a/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "1..205")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~8", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust_color_transition{from_color: [0.9f, 0.0f, 0.9f], scale: 1.2f, to_color: [0.95f, 0.2f, 0.95f]}", "^", "^0.3", "^11", "0.15", "0.5", "0.15", "0.01", "1", "force"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust_color_transition{from_color: [0.95f, 0.0f, 0.95f], scale: 1.3f, to_color: [0.95f, 0.3f, 0.95f]}", "^", "^0.3", "^-11", "0.15", "0.5", "0.15", "0.01", "1", "force"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust_color_transition{from_color: [1.0f, 0.2f, 1.0f], scale: 1.0f, to_color: [0.95f, 0.4f, 0.95f]}", "^11", "^0.3", "^", "0.15", "0.5", "0.15", "0.01", "1", "force"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dust_color_transition{from_color: [0.8f, 0.2f, 0.8f], scale: 1.1f, to_color: [0.95f, 0.5f, 0.95f]}", "^-11", "^0.3", "^", "0.15", "0.5", "0.15", "0.01", "1", "force"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "240..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/target_indicator_a/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "..205")));
        return 1;
    }
    // impossible_to_survive:effects/target_indicator_a/zzz/3
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.5", "~", "^", "^", "^-10000000", "0.00000004", "0", "force"), Control.when("predicate", "mcm:random/50_percent"), Control.at("@s"), Control.positioned("^", "^0", "^10")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.5", "~", "^", "^", "^-10000000", "0.00000004", "0", "force"), Control.when("predicate", "mcm:random/50_percent"), Control.at("@s"), Control.rotated("~180", "~"), Control.positioned("^", "^0", "^10")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.25", "~", "^", "^", "^-10000000", "0.00000004", "0", "force"), Control.when("predicate", "mcm:random/50_percent"), Control.at("@s"), Control.rotated("~90", "~"), Control.positioned("^", "^0", "^10")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.25", "~", "^", "^", "^-10000000", "0.00000004", "0", "force"), Control.when("predicate", "mcm:random/50_percent"), Control.at("@s"), Control.rotated("~-90", "~"), Control.positioned("^", "^0", "^10")));
        return 1;
    }
    // impossible_to_survive:effects/target_indicator_a/zzz/4
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.5", "~", "^", "^", "^-10000000", "0.00000004", "0", "force"), Control.at("@s"), Control.positioned("^", "^0", "^10")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.5", "~", "^", "^", "^-10000000", "0.00000004", "0", "force"), Control.at("@s"), Control.rotated("~180", "~"), Control.positioned("^", "^0", "^10")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.25", "~", "^", "^", "^-10000000", "0.00000004", "0", "force"), Control.at("@s"), Control.rotated("~90", "~"), Control.positioned("^", "^0", "^10")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.25", "~", "^", "^", "^-10000000", "0.00000004", "0", "force"), Control.at("@s"), Control.rotated("~-90", "~"), Control.positioned("^", "^0", "^10")));
        return 1;
    }
    // impossible_to_survive:effects/target_indicator_a/zzz/5
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~0.5", "~", "^", "^", "^-10000000", "0.00000003", "0", "force"), Control.at("@s"), Control.rotated("~", "~"), Control.positioned("^25", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~0.5", "~", "^", "^", "^10000000", "0.00000003", "0", "force"), Control.at("@s"), Control.rotated("~90", "~"), Control.positioned("^25", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~0.5", "~", "^", "^", "^-10000000", "0.00000003", "0", "force"), Control.at("@s"), Control.rotated("~180", "~"), Control.positioned("^25", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~0.5", "~", "^", "^", "^10000000", "0.00000003", "0", "force"), Control.at("@s"), Control.rotated("~270", "~"), Control.positioned("^25", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.25", "~", "^", "^10000000", "^", "0.00000001", "0", "force"), Control.at("@s"), Control.rotated("~", "~"), Control.positioned("^11", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.25", "~", "^", "^10000000", "^", "0.00000001", "0", "force"), Control.at("@s"), Control.rotated("~90", "~"), Control.positioned("^11", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.25", "~", "^", "^10000000", "^", "0.00000001", "0", "force"), Control.at("@s"), Control.rotated("~180", "~"), Control.positioned("^11", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.25", "~", "^", "^10000000", "^", "0.00000001", "0", "force"), Control.at("@s"), Control.rotated("~270", "~"), Control.positioned("^11", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~1", "~", "^", "^10000000", "^", "0.000000005", "0", "force"), Control.at("@s"), Control.rotated("~", "~"), Control.positioned("^25", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~1", "~", "^", "^10000000", "^", "0.000000005", "0", "force"), Control.at("@s"), Control.rotated("~90", "~"), Control.positioned("^25", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~1", "~", "^", "^10000000", "^", "0.000000005", "0", "force"), Control.at("@s"), Control.rotated("~180", "~"), Control.positioned("^25", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~1", "~", "^", "^10000000", "^", "0.000000005", "0", "force"), Control.at("@s"), Control.rotated("~270", "~"), Control.positioned("^25", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.25", "~", "^", "^-10000000", "^", "0.00000001", "0", "force"), Control.at("@s"), Control.rotated("~", "~"), Control.positioned("^11", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.25", "~", "^", "^-10000000", "^", "0.00000001", "0", "force"), Control.at("@s"), Control.rotated("~90", "~"), Control.positioned("^11", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.25", "~", "^", "^-10000000", "^", "0.00000001", "0", "force"), Control.at("@s"), Control.rotated("~180", "~"), Control.positioned("^11", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~0.25", "~", "^", "^-10000000", "^", "0.00000001", "0", "force"), Control.at("@s"), Control.rotated("~270", "~"), Control.positioned("^11", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~1", "~", "^", "^-10000000", "^", "0.000000005", "0", "force"), Control.at("@s"), Control.rotated("~", "~"), Control.positioned("^25", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~1", "~", "^", "^-10000000", "^", "0.000000005", "0", "force"), Control.at("@s"), Control.rotated("~90", "~"), Control.positioned("^25", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~1", "~", "^", "^-10000000", "^", "0.000000005", "0", "force"), Control.at("@s"), Control.rotated("~180", "~"), Control.positioned("^25", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~1", "~", "^", "^-10000000", "^", "0.000000005", "0", "force"), Control.at("@s"), Control.rotated("~270", "~"), Control.positioned("^25", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "^-25", "^1", "^", "0.15", "0.25", "0.15", "0.01", "2", "force"), Control.at("@s"), Control.rotated("~45", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "^25", "^1", "^", "0.15", "0.25", "0.15", "0.01", "2", "force"), Control.at("@s"), Control.rotated("~45", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "^", "^1", "^25", "0.15", "0.25", "0.15", "0.01", "2", "force"), Control.at("@s"), Control.rotated("~45", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "^", "^1", "^-25", "0.15", "0.25", "0.15", "0.01", "2", "force"), Control.at("@s"), Control.rotated("~45", "~")));
        return 1;
    }
    // impossible_to_survive:features/anvil/anvil_impact_point
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Native.tag(c, "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1.5]", "add", "anvil_hit"));
        return 1;
    }
    // impossible_to_survive:features/anvil/anvil_loop
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/zzz/2"), Control.when("score", "@s", "anvil_timer", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:features/anvil/anvil_used
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "anvil_timer", "1"), Control.unless("score", "@s", "anvil_timer", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:features/anvil/interacted
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.anvil_interact", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "anvil_check_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "XpLevel", "1"), Control.store("result", "score", "@s", "anvil_xp")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/place_block_marker"), Control.anchored("eyes")));
        return 1;
    }
    // impossible_to_survive:features/anvil/place_block_marker
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^0.1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^0.5", "^", "^0.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^0.3"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^-0.5", "^", "^0.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^0.5"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^0.5", "^0.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^0.7"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^-0.5", "^0.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^0.9"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^0.5", "^", "^1.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^1.1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^-0.5", "^", "^1.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^1.3"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^0.5", "^1.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^1.5"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^-0.5", "^1.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^1.7"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^0.5", "^", "^1.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^1.9"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^-0.5", "^", "^2.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^2.1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^0.5", "^2.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^2.3"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^-0.5", "^2.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^2.5"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^0.5", "^", "^2.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^2.7"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^-0.5", "^", "^2.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^2.9"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^0.5", "^3.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^3.1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^-0.5", "^3.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^3.3"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^3.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^0.5", "^", "^3.5"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^3.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^-0.5", "^", "^3.7"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^3.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^4.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^4.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^4.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^4.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^4.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^5.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^5.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Anvil\"',Tags:[anvil_marker]}"), Control.positioned("^", "^", "^5.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "#minecraft:anvil"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..0.1]")));
        return 1;
    }
    // impossible_to_survive:features/anvil/player_loop_1t
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/interacted"), Control.when("score", "@s", "mcm.anvil_interact", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/zzz/0"), Control.when("score", "@s", "anvil_check_timer", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:features/anvil/zzz/0
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "anvil_check_timer", "0"), Control.unless("entity", "@e[type=marker,tag=anvil_marker,distance=..6]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "XpLevel", "1"), Control.store("result", "score", "@s", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/zzz/1"), Control.when("score", "@s", "mcm.temp", "<", "@s", "anvil_xp")));
        return 1;
    }
    // impossible_to_survive:features/anvil/zzz/1
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "anvil_check_timer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[type=marker,tag=anvil_marker,distance=..1.5]", "add", "anvil_used"), Control.anchored("eyes"), Control.positioned("^", "^", "^1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[type=marker,tag=anvil_marker,distance=..1.5]", "add", "anvil_used"), Control.anchored("eyes"), Control.positioned("^", "^", "^2")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[type=marker,tag=anvil_marker,distance=..1.5]", "add", "anvil_used"), Control.anchored("eyes"), Control.positioned("^", "^", "^3")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[type=marker,tag=anvil_marker,distance=..1.5]", "add", "anvil_used"), Control.anchored("eyes"), Control.positioned("^", "^", "^4")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[type=marker,tag=anvil_marker,distance=..1.5]", "add", "anvil_used"), Control.anchored("eyes"), Control.positioned("^", "^", "^5")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[type=marker,tag=anvil_marker,distance=..1.5]", "add", "anvil_used"), Control.anchored("eyes"), Control.positioned("^", "^", "^6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_used"), Control.as("@n[type=marker,tag=anvil_used]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/anvil/zzz/2
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "anvil_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/zzz/3"), Control.when("score", "@s", "anvil_timer", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/zzz/4"), Control.when("score", "@s", "anvil_timer", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/zzz/5"), Control.when("score", "@s", "anvil_timer", "matches", "30")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/zzz/7"), Control.when("score", "@s", "anvil_timer", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/zzz/9"), Control.when("score", "@s", "anvil_timer", "matches", "42..")));
        return 1;
    }
    // impossible_to_survive:features/anvil/zzz/3
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/anvil"), Control.as("@a[distance=..15]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.unless("block", "~", "~", "~", "#minecraft:anvil")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("block", "~", "~", "~", "#minecraft:anvil")));
        Logic.step(() -> Native.playsound(c, "minecraft:anvil_spike", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{brightness:{sky:15,block:15},Tags:[\"anvil_spike\",\"anvil_spike1\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[1.5f,1.5f,0f]},item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":16}}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{brightness:{sky:15,block:15},Tags:[\"anvil_spike\",\"anvil_spike1\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[1.5f,1.5f,0f]},item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":16}},Rotation:[90.0f]}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{brightness:{sky:15,block:15},Tags:[\"anvil_spike\",\"anvil_spike1\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[1.5f,1.5f,0f]},item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":16}},Rotation:[180.0f]}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{brightness:{sky:15,block:15},Tags:[\"anvil_spike\",\"anvil_spike1\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[1.5f,1.5f,0f]},item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":16}},Rotation:[-90.0f]}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{brightness:{sky:15,block:15},Tags:[\"anvil_spike\",\"anvil_spike1\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[1.5f,1.5f,0f]},item:{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":16}},Rotation:[0.0f,-90.0f]}"));
        return 1;
    }
    // impossible_to_survive:features/anvil/zzz/4
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:2,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[2f,2f,3f]}}"), Control.as("@e[type=item_display,tag=anvil_spike,distance=..1]")));
        return 1;
    }
    // impossible_to_survive:features/anvil/zzz/5
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/zzz/6"), Control.as("@e[type=item_display,tag=anvil_spike,distance=..1]")));
        return 1;
    }
    // impossible_to_survive:features/anvil/zzz/6
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:10,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[1.5f,1.5f,0f]}}"));
        return 1;
    }
    // impossible_to_survive:features/anvil/zzz/7
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~1", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~2", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~3", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~-1", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~-2", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~-3", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~", "~", "~1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~", "~", "~2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~", "~", "~3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~", "~", "~-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~", "~", "~-2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~", "~", "~-3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~", "~1", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~", "~2", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/anvil_impact_point"), Control.positioned("~", "~3", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/anvil/zzz/8"), Control.as("@a[tag=anvil_hit]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/anvil/zzz/8
    private static int f23(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "anvil_hit"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:mob_attack", "by", "@n[type=marker,tag=anvil_marker]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "18", "minecraft:mob_attack", "by", "@n[type=marker,tag=anvil_marker]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "25", "minecraft:mob_attack", "by", "@n[type=marker,tag=anvil_marker]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
}
