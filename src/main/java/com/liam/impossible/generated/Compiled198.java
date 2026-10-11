package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled198 {
    public static void register() {
        Logic.register("impossible_to_survive:features/sugarcane/zzz/0", Compiled198::f0);
        Logic.register("impossible_to_survive:features/sugarcane/zzz/1", Compiled198::f1);
        Logic.register("impossible_to_survive:features/sugarcane/zzz/2", Compiled198::f2);
        Logic.register("impossible_to_survive:features/sugarcane/zzz/3", Compiled198::f3);
        Logic.register("impossible_to_survive:features/sugarcane/zzz/4", Compiled198::f4);
        Logic.register("impossible_to_survive:features/tree/acacia/center", Compiled198::f5);
        Logic.register("impossible_to_survive:features/tree/acacia/mined_tree", Compiled198::f6);
        Logic.register("impossible_to_survive:features/tree/acacia/piece", Compiled198::f7);
        Logic.register("impossible_to_survive:features/tree/acacia/summon_pieces_x_neg", Compiled198::f8);
        Logic.register("impossible_to_survive:features/tree/acacia/summon_pieces_x_pos", Compiled198::f9);
        Logic.register("impossible_to_survive:features/tree/acacia/summon_pieces_z_neg", Compiled198::f10);
        Logic.register("impossible_to_survive:features/tree/acacia/summon_pieces_z_pos", Compiled198::f11);
        Logic.register("impossible_to_survive:features/tree/acacia/zzz/0", Compiled198::f12);
        Logic.register("impossible_to_survive:features/tree/birch/center", Compiled198::f13);
        Logic.register("impossible_to_survive:features/tree/birch/mined_tree", Compiled198::f14);
        Logic.register("impossible_to_survive:features/tree/birch/piece", Compiled198::f15);
        Logic.register("impossible_to_survive:features/tree/birch/summon_pieces_x_neg", Compiled198::f16);
        Logic.register("impossible_to_survive:features/tree/birch/summon_pieces_x_pos", Compiled198::f17);
        Logic.register("impossible_to_survive:features/tree/birch/summon_pieces_z_neg", Compiled198::f18);
        Logic.register("impossible_to_survive:features/tree/birch/summon_pieces_z_pos", Compiled198::f19);
        Logic.register("impossible_to_survive:features/tree/birch/zzz/0", Compiled198::f20);
        Logic.register("impossible_to_survive:features/tree/center", Compiled198::f21);
        Logic.register("impossible_to_survive:features/tree/cherry/center", Compiled198::f22);
        Logic.register("impossible_to_survive:features/tree/cherry/mined_tree", Compiled198::f23);
    }
    // impossible_to_survive:features/sugarcane/zzz/0
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sugarcane/summon_sc"), Control.when("score", "@s", "sc_timer", "matches", "10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sugarcane/summon_sc"), Control.when("score", "@s", "sc_timer", "matches", "20")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sugarcane/summon_sc"), Control.when("score", "@s", "sc_timer", "matches", "30")));
        return 1;
    }
    // impossible_to_survive:features/sugarcane/zzz/1
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sugarcane/summon_sc"), Control.when("score", "@s", "sc_timer", "matches", "40")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sugarcane/summon_sc"), Control.when("score", "@s", "sc_timer", "matches", "50")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sugarcane/summon_sc"), Control.when("score", "@s", "sc_timer", "matches", "60")));
        return 1;
    }
    // impossible_to_survive:features/sugarcane/zzz/2
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sugarcane/zzz/3"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1.5]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "remove", "sc_stung"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1.5]")));
        return 1;
    }
    // impossible_to_survive:features/sugarcane/zzz/3
    private static int f3(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:cactus"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "6", "minecraft:cactus"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "9", "minecraft:cactus"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/sugarcane/zzz/4
    private static int f4(Frame c) {
        Logic.step(() -> Native.spreadplayers(c, "~", "~", "1", "2", "false", "@s"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1", "~"), Control.at("@s"), Control.when("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.positioned("~", "~1", "~"), Control.when("entity", "@e[type=armor_stand,tag=sugarcane_as,distance=..0.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~-1.0", "~", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":23}}],NoGravity:1,Tags:[\"sugarcane_as\",\"sc_stung\"],Invisible:1,Marker:1}"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/tree/acacia/center
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "stripped_acacia_log"), Control.when("block", "~", "~", "~", "acacia_log")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_e\",\"tree_center\"]}"), Control.positioned("~", "~1", "~"), Control.when("block", "~", "~", "~", "acacia_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_e\",\"tree_center\"]}"), Control.positioned("~", "~-1", "~"), Control.when("block", "~", "~", "~", "acacia_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_e\",\"tree_center\"]}"), Control.positioned("~", "~", "~1"), Control.when("block", "~", "~", "~", "acacia_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_e\",\"tree_center\"]}"), Control.positioned("~", "~", "~-1"), Control.when("block", "~", "~", "~", "acacia_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_e\",\"tree_center\"]}"), Control.positioned("~1", "~", "~"), Control.when("block", "~", "~", "~", "acacia_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_e\",\"tree_center\"]}"), Control.positioned("~-1", "~", "~"), Control.when("block", "~", "~", "~", "acacia_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_e\",\"tree_center\"]}"), Control.positioned("~", "~1", "~1"), Control.when("block", "~", "~", "~", "acacia_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_e\",\"tree_center\"]}"), Control.positioned("~", "~1", "~-1"), Control.when("block", "~", "~", "~", "acacia_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_e\",\"tree_center\"]}"), Control.positioned("~1", "~1", "~"), Control.when("block", "~", "~", "~", "acacia_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_e\",\"tree_center\"]}"), Control.positioned("~-1", "~1", "~"), Control.when("block", "~", "~", "~", "acacia_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/acacia/summon_pieces_x_pos"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/acacia/summon_pieces_x_neg"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/acacia/summon_pieces_z_neg"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/acacia/summon_pieces_z_pos"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:passable")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/tree/acacia/mined_tree
    private static int f6(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/tree"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/acacia/zzz/0"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:acacia_log\"},Age:0s}]"), Control.at("@s"), Control.align("xyz")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedAcacia", "0"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@e[type=item,nbt={Item:{id:\"minecraft:acacia_log\"},Age:0s},limit=1,sort=nearest]", "{Item:{id:\"minecraft:stripped_acacia_log\"}}"));
        return 1;
    }
    // impossible_to_survive:features/tree/acacia/piece
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece6]")));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:acacia_planks\"}", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "tree_piece_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/piece_hit"), Control.at("@s"), Control.positioned("~", "~-0.5", "~"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "tree_piece_lt", "matches", "60..")));
        return 1;
    }
    // impossible_to_survive:features/tree/acacia/summon_pieces_x_neg
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":54}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":55}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":56}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":57}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":58}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":59}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/acacia/summon_pieces_x_pos
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":54}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":55}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":56}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":57}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":58}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":59}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/acacia/summon_pieces_z_neg
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":54}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":55}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":56}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":57}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":58}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":59}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/acacia/summon_pieces_z_pos
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":54}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":55}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":56}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":57}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":58}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":59}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/acacia/zzz/0
    private static int f12(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.wither.break_block", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.summon(c, "area_effect_cloud", "~0.5", "~0.5", "~0.5", "{Duration:2,Tags:[\"tree_center_e\",\"tree_center\"]}"));
        return 1;
    }
    // impossible_to_survive:features/tree/birch/center
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "stripped_birch_log"), Control.when("block", "~", "~", "~", "birch_log")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_c\",\"tree_center\"]}"), Control.positioned("~", "~1", "~"), Control.when("block", "~", "~", "~", "birch_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_c\",\"tree_center\"]}"), Control.positioned("~", "~-1", "~"), Control.when("block", "~", "~", "~", "birch_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_c\",\"tree_center\"]}"), Control.positioned("~", "~", "~1"), Control.when("block", "~", "~", "~", "birch_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_c\",\"tree_center\"]}"), Control.positioned("~", "~", "~-1"), Control.when("block", "~", "~", "~", "birch_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_c\",\"tree_center\"]}"), Control.positioned("~1", "~", "~"), Control.when("block", "~", "~", "~", "birch_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_c\",\"tree_center\"]}"), Control.positioned("~-1", "~", "~"), Control.when("block", "~", "~", "~", "birch_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_c\",\"tree_center\"]}"), Control.positioned("~", "~1", "~1"), Control.when("block", "~", "~", "~", "birch_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_c\",\"tree_center\"]}"), Control.positioned("~", "~1", "~-1"), Control.when("block", "~", "~", "~", "birch_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_c\",\"tree_center\"]}"), Control.positioned("~1", "~1", "~"), Control.when("block", "~", "~", "~", "birch_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_c\",\"tree_center\"]}"), Control.positioned("~-1", "~1", "~"), Control.when("block", "~", "~", "~", "birch_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/birch/summon_pieces_x_pos"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/birch/summon_pieces_x_neg"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/birch/summon_pieces_z_neg"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/birch/summon_pieces_z_pos"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:passable")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/tree/birch/mined_tree
    private static int f14(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/tree"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/birch/zzz/0"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:birch_log\"},Age:0s}]"), Control.at("@s"), Control.align("xyz")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedBirch", "0"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@e[type=item,nbt={Item:{id:\"minecraft:birch_log\"},Age:0s},limit=1,sort=nearest]", "{Item:{id:\"minecraft:stripped_birch_log\"}}"));
        return 1;
    }
    // impossible_to_survive:features/tree/birch/piece
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece6]")));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:birch_planks\"}", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "tree_piece_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/piece_hit"), Control.at("@s"), Control.positioned("~", "~-0.5", "~"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "tree_piece_lt", "matches", "60..")));
        return 1;
    }
    // impossible_to_survive:features/tree/birch/summon_pieces_x_neg
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":42}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":43}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":44}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":45}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":46}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":47}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/birch/summon_pieces_x_pos
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":42}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":43}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":44}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":45}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":46}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":47}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/birch/summon_pieces_z_neg
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":42}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":43}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":44}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":45}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":46}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_c\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":47}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/birch/summon_pieces_z_pos
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":42}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":43}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":44}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":45}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":46}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_e\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":47}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/birch/zzz/0
    private static int f20(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.wither.break_block", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.summon(c, "area_effect_cloud", "~0.5", "~0.5", "~0.5", "{Duration:2,Tags:[\"tree_center_c\",\"tree_center\"]}"));
        return 1;
    }
    // impossible_to_survive:features/tree/center
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/oak/center"), Control.when("entity", "@s[tag=tree_center_a]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/spruce/center"), Control.when("entity", "@s[tag=tree_center_b]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/birch/center"), Control.when("entity", "@s[tag=tree_center_c]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/jungle/center"), Control.when("entity", "@s[tag=tree_center_d]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/acacia/center"), Control.when("entity", "@s[tag=tree_center_e]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/dark_oak/center"), Control.when("entity", "@s[tag=tree_center_f]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/crimson/center"), Control.when("entity", "@s[tag=tree_center_g]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/mangrove/center"), Control.when("entity", "@s[tag=tree_center_h]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/cherry/center"), Control.when("entity", "@s[tag=tree_center_i]")));
        return 1;
    }
    // impossible_to_survive:features/tree/cherry/center
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "stripped_cherry_log"), Control.when("block", "~", "~", "~", "cherry_log")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_i\",\"tree_center\"]}"), Control.positioned("~", "~1", "~"), Control.when("block", "~", "~", "~", "cherry_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_i\",\"tree_center\"]}"), Control.positioned("~", "~-1", "~"), Control.when("block", "~", "~", "~", "cherry_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_i\",\"tree_center\"]}"), Control.positioned("~", "~", "~1"), Control.when("block", "~", "~", "~", "cherry_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_i\",\"tree_center\"]}"), Control.positioned("~", "~", "~-1"), Control.when("block", "~", "~", "~", "cherry_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_i\",\"tree_center\"]}"), Control.positioned("~1", "~", "~"), Control.when("block", "~", "~", "~", "cherry_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_i\",\"tree_center\"]}"), Control.positioned("~-1", "~", "~"), Control.when("block", "~", "~", "~", "cherry_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_i\",\"tree_center\"]}"), Control.positioned("~", "~1", "~1"), Control.when("block", "~", "~", "~", "cherry_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_i\",\"tree_center\"]}"), Control.positioned("~", "~1", "~-1"), Control.when("block", "~", "~", "~", "cherry_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_i\",\"tree_center\"]}"), Control.positioned("~1", "~1", "~"), Control.when("block", "~", "~", "~", "cherry_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_i\",\"tree_center\"]}"), Control.positioned("~-1", "~1", "~"), Control.when("block", "~", "~", "~", "cherry_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/cherry/summon_pieces_x_pos"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/cherry/summon_pieces_x_neg"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/cherry/summon_pieces_z_neg"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/cherry/summon_pieces_z_pos"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:passable")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/tree/cherry/mined_tree
    private static int f23(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/tree"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/cherry/zzz/0"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:cherry_log\"},Age:0s}]"), Control.at("@s"), Control.align("xyz")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedCherry", "0"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@e[type=item,nbt={Item:{id:\"minecraft:cherry_log\"},Age:0s},limit=1,sort=nearest]", "{Item:{id:\"minecraft:stripped_cherry_log\"}}"));
        return 1;
    }
}
