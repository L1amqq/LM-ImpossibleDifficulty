package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled200 {
    public static void register() {
        Logic.register("impossible_to_survive:features/tree/jungle/piece", Compiled200::f0);
        Logic.register("impossible_to_survive:features/tree/jungle/summon_pieces_x_neg", Compiled200::f1);
        Logic.register("impossible_to_survive:features/tree/jungle/summon_pieces_x_pos", Compiled200::f2);
        Logic.register("impossible_to_survive:features/tree/jungle/summon_pieces_z_neg", Compiled200::f3);
        Logic.register("impossible_to_survive:features/tree/jungle/summon_pieces_z_pos", Compiled200::f4);
        Logic.register("impossible_to_survive:features/tree/jungle/zzz/0", Compiled200::f5);
        Logic.register("impossible_to_survive:features/tree/mangrove/center", Compiled200::f6);
        Logic.register("impossible_to_survive:features/tree/mangrove/mined_tree", Compiled200::f7);
        Logic.register("impossible_to_survive:features/tree/mangrove/piece", Compiled200::f8);
        Logic.register("impossible_to_survive:features/tree/mangrove/summon_pieces_x_neg", Compiled200::f9);
        Logic.register("impossible_to_survive:features/tree/mangrove/summon_pieces_x_pos", Compiled200::f10);
        Logic.register("impossible_to_survive:features/tree/mangrove/summon_pieces_z_neg", Compiled200::f11);
        Logic.register("impossible_to_survive:features/tree/mangrove/summon_pieces_z_pos", Compiled200::f12);
        Logic.register("impossible_to_survive:features/tree/mangrove/zzz/0", Compiled200::f13);
        Logic.register("impossible_to_survive:features/tree/oak/center", Compiled200::f14);
        Logic.register("impossible_to_survive:features/tree/oak/mined_tree", Compiled200::f15);
        Logic.register("impossible_to_survive:features/tree/oak/piece", Compiled200::f16);
        Logic.register("impossible_to_survive:features/tree/oak/summon_pieces_x_neg", Compiled200::f17);
        Logic.register("impossible_to_survive:features/tree/oak/summon_pieces_x_pos", Compiled200::f18);
        Logic.register("impossible_to_survive:features/tree/oak/summon_pieces_z_neg", Compiled200::f19);
        Logic.register("impossible_to_survive:features/tree/oak/summon_pieces_z_pos", Compiled200::f20);
        Logic.register("impossible_to_survive:features/tree/oak/zzz/0", Compiled200::f21);
        Logic.register("impossible_to_survive:features/tree/piece", Compiled200::f22);
        Logic.register("impossible_to_survive:features/tree/piece_hit", Compiled200::f23);
    }
    // impossible_to_survive:features/tree/jungle/piece
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece6]")));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:jungle_planks\"}", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "tree_piece_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/piece_hit"), Control.at("@s"), Control.positioned("~", "~-0.5", "~"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "tree_piece_lt", "matches", "60..")));
        return 1;
    }
    // impossible_to_survive:features/tree/jungle/summon_pieces_x_neg
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":48}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":49}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":50}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":51}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":52}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":53}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/jungle/summon_pieces_x_pos
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":48}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":49}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":50}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":51}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":52}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":53}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/jungle/summon_pieces_z_neg
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":48}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":49}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":50}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":51}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":52}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":53}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/jungle/summon_pieces_z_pos
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":48}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":49}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":50}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":51}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":52}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_d\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":53}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/jungle/zzz/0
    private static int f5(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.wither.break_block", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.summon(c, "area_effect_cloud", "~0.5", "~0.5", "~0.5", "{Duration:2,Tags:[\"tree_center_d\",\"tree_center\"]}"));
        return 1;
    }
    // impossible_to_survive:features/tree/mangrove/center
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "stripped_mangrove_log"), Control.when("block", "~", "~", "~", "mangrove_log")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_h\",\"tree_center\"]}"), Control.positioned("~", "~1", "~"), Control.when("block", "~", "~", "~", "mangrove_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_h\",\"tree_center\"]}"), Control.positioned("~", "~-1", "~"), Control.when("block", "~", "~", "~", "mangrove_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_h\",\"tree_center\"]}"), Control.positioned("~", "~", "~1"), Control.when("block", "~", "~", "~", "mangrove_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_h\",\"tree_center\"]}"), Control.positioned("~", "~", "~-1"), Control.when("block", "~", "~", "~", "mangrove_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_h\",\"tree_center\"]}"), Control.positioned("~1", "~", "~"), Control.when("block", "~", "~", "~", "mangrove_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_h\",\"tree_center\"]}"), Control.positioned("~-1", "~", "~"), Control.when("block", "~", "~", "~", "mangrove_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_h\",\"tree_center\"]}"), Control.positioned("~", "~1", "~1"), Control.when("block", "~", "~", "~", "mangrove_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_h\",\"tree_center\"]}"), Control.positioned("~", "~1", "~-1"), Control.when("block", "~", "~", "~", "mangrove_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_h\",\"tree_center\"]}"), Control.positioned("~1", "~1", "~"), Control.when("block", "~", "~", "~", "mangrove_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_h\",\"tree_center\"]}"), Control.positioned("~-1", "~1", "~"), Control.when("block", "~", "~", "~", "mangrove_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/mangrove/summon_pieces_x_pos"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/mangrove/summon_pieces_x_neg"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/mangrove/summon_pieces_z_neg"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/mangrove/summon_pieces_z_pos"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:passable")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/tree/mangrove/mined_tree
    private static int f7(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/tree"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/mangrove/zzz/0"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:mangrove_log\"},Age:0s}]"), Control.at("@s"), Control.align("xyz")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedMangrove", "0"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@e[type=item,nbt={Item:{id:\"minecraft:mangrove_log\"},Age:0s},limit=1,sort=nearest]", "{Item:{id:\"minecraft:stripped_mangrove_log\"}}"));
        return 1;
    }
    // impossible_to_survive:features/tree/mangrove/piece
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece6]")));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:mangrove_planks\"}", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "tree_piece_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/piece_hit"), Control.at("@s"), Control.positioned("~", "~-0.5", "~"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "tree_piece_lt", "matches", "60..")));
        return 1;
    }
    // impossible_to_survive:features/tree/mangrove/summon_pieces_x_neg
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":80}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":81}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":82}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":83}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":84}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":85}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/mangrove/summon_pieces_x_pos
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":80}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":81}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":82}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":83}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":84}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":85}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/mangrove/summon_pieces_z_neg
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":80}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":81}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":82}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":83}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":84}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":85}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/mangrove/summon_pieces_z_pos
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":80}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":81}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":82}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":83}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":84}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_h\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":85}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/mangrove/zzz/0
    private static int f13(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.wither.break_block", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.summon(c, "area_effect_cloud", "~0.5", "~0.5", "~0.5", "{Duration:2,Tags:[\"tree_center_h\",\"tree_center\"]}"));
        return 1;
    }
    // impossible_to_survive:features/tree/oak/center
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "stripped_oak_log"), Control.when("block", "~", "~", "~", "oak_log")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_a\",\"tree_center\"]}"), Control.positioned("~", "~1", "~"), Control.when("block", "~", "~", "~", "oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_a\",\"tree_center\"]}"), Control.positioned("~", "~-1", "~"), Control.when("block", "~", "~", "~", "oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_a\",\"tree_center\"]}"), Control.positioned("~", "~", "~1"), Control.when("block", "~", "~", "~", "oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_a\",\"tree_center\"]}"), Control.positioned("~", "~", "~-1"), Control.when("block", "~", "~", "~", "oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_a\",\"tree_center\"]}"), Control.positioned("~1", "~", "~"), Control.when("block", "~", "~", "~", "oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_a\",\"tree_center\"]}"), Control.positioned("~-1", "~", "~"), Control.when("block", "~", "~", "~", "oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_a\",\"tree_center\"]}"), Control.positioned("~", "~1", "~1"), Control.when("block", "~", "~", "~", "oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_a\",\"tree_center\"]}"), Control.positioned("~", "~1", "~-1"), Control.when("block", "~", "~", "~", "oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_a\",\"tree_center\"]}"), Control.positioned("~1", "~1", "~"), Control.when("block", "~", "~", "~", "oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_a\",\"tree_center\"]}"), Control.positioned("~-1", "~1", "~"), Control.when("block", "~", "~", "~", "oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/oak/summon_pieces_x_pos"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/oak/summon_pieces_x_neg"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/oak/summon_pieces_z_neg"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/oak/summon_pieces_z_pos"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:passable")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/tree/oak/mined_tree
    private static int f15(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/tree"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/oak/zzz/0"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:oak_log\"},Age:0s}]"), Control.at("@s"), Control.align("xyz")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedOak", "0"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@e[type=item,nbt={Item:{id:\"minecraft:oak_log\"},Age:0s},limit=1,sort=nearest]", "{Item:{id:\"minecraft:stripped_oak_log\"}}"));
        return 1;
    }
    // impossible_to_survive:features/tree/oak/piece
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece6]")));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:oak_planks\"}", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "tree_piece_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/piece_hit"), Control.at("@s"), Control.positioned("~", "~-0.5", "~"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "tree_piece_lt", "matches", "60..")));
        return 1;
    }
    // impossible_to_survive:features/tree/oak/summon_pieces_x_neg
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":30}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":31}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":32}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":33}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":34}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":35}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/oak/summon_pieces_x_pos
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":30}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":31}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":32}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":33}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":34}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":35}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/oak/summon_pieces_z_neg
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":30}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":31}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":32}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":33}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":34}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":35}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/oak/summon_pieces_z_pos
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":30}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":31}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":32}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":33}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":34}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_a\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":35}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/oak/zzz/0
    private static int f21(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.wither.break_block", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.summon(c, "area_effect_cloud", "~0.5", "~0.5", "~0.5", "{Duration:2,Tags:[\"tree_center_a\",\"tree_center\"]}"));
        return 1;
    }
    // impossible_to_survive:features/tree/piece
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/oak/piece"), Control.when("entity", "@s[tag=tree_piece_a]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/spruce/piece"), Control.when("entity", "@s[tag=tree_piece_b]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/birch/piece"), Control.when("entity", "@s[tag=tree_piece_c]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/jungle/piece"), Control.when("entity", "@s[tag=tree_piece_d]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/acacia/piece"), Control.when("entity", "@s[tag=tree_piece_e]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/dark_oak/piece"), Control.when("entity", "@s[tag=tree_piece_f]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/crimson/piece"), Control.when("entity", "@s[tag=tree_piece_g]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/mangrove/piece"), Control.when("entity", "@s[tag=tree_piece_h]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/cherry/piece"), Control.when("entity", "@s[tag=tree_piece_i]")));
        return 1;
    }
    // impossible_to_survive:features/tree/piece_hit
    private static int f23(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{CustomName:'\"Tree\"',Tags:[\"mcm.death_message_marker\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/zzz/0"), Control.positioned("~", "~-0.5", "~"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1.5]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.death_message_marker]"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
}
