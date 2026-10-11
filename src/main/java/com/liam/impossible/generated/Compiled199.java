package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled199 {
    public static void register() {
        Logic.register("impossible_to_survive:features/tree/cherry/piece", Compiled199::f0);
        Logic.register("impossible_to_survive:features/tree/cherry/summon_pieces_x_neg", Compiled199::f1);
        Logic.register("impossible_to_survive:features/tree/cherry/summon_pieces_x_pos", Compiled199::f2);
        Logic.register("impossible_to_survive:features/tree/cherry/summon_pieces_z_neg", Compiled199::f3);
        Logic.register("impossible_to_survive:features/tree/cherry/summon_pieces_z_pos", Compiled199::f4);
        Logic.register("impossible_to_survive:features/tree/cherry/zzz/0", Compiled199::f5);
        Logic.register("impossible_to_survive:features/tree/crimson/center", Compiled199::f6);
        Logic.register("impossible_to_survive:features/tree/crimson/mined_tree", Compiled199::f7);
        Logic.register("impossible_to_survive:features/tree/crimson/piece", Compiled199::f8);
        Logic.register("impossible_to_survive:features/tree/crimson/summon_pieces_x_neg", Compiled199::f9);
        Logic.register("impossible_to_survive:features/tree/crimson/summon_pieces_x_pos", Compiled199::f10);
        Logic.register("impossible_to_survive:features/tree/crimson/summon_pieces_z_neg", Compiled199::f11);
        Logic.register("impossible_to_survive:features/tree/crimson/summon_pieces_z_pos", Compiled199::f12);
        Logic.register("impossible_to_survive:features/tree/crimson/zzz/0", Compiled199::f13);
        Logic.register("impossible_to_survive:features/tree/dark_oak/center", Compiled199::f14);
        Logic.register("impossible_to_survive:features/tree/dark_oak/mined_tree", Compiled199::f15);
        Logic.register("impossible_to_survive:features/tree/dark_oak/piece", Compiled199::f16);
        Logic.register("impossible_to_survive:features/tree/dark_oak/summon_pieces_x_neg", Compiled199::f17);
        Logic.register("impossible_to_survive:features/tree/dark_oak/summon_pieces_x_pos", Compiled199::f18);
        Logic.register("impossible_to_survive:features/tree/dark_oak/summon_pieces_z_neg", Compiled199::f19);
        Logic.register("impossible_to_survive:features/tree/dark_oak/summon_pieces_z_pos", Compiled199::f20);
        Logic.register("impossible_to_survive:features/tree/dark_oak/zzz/0", Compiled199::f21);
        Logic.register("impossible_to_survive:features/tree/jungle/center", Compiled199::f22);
        Logic.register("impossible_to_survive:features/tree/jungle/mined_tree", Compiled199::f23);
    }
    // impossible_to_survive:features/tree/cherry/piece
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece6]")));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:cherry_planks\"}", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "tree_piece_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/piece_hit"), Control.at("@s"), Control.positioned("~", "~-0.5", "~"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "tree_piece_lt", "matches", "60..")));
        return 1;
    }
    // impossible_to_survive:features/tree/cherry/summon_pieces_x_neg
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":86}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":87}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":88}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":89}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":90}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":91}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/cherry/summon_pieces_x_pos
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":86}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":87}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":88}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":89}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":90}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":91}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/cherry/summon_pieces_z_neg
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":86}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":87}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":88}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":89}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":90}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":91}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/cherry/summon_pieces_z_pos
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":86}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":87}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":88}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":89}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":90}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_i\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":91}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/cherry/zzz/0
    private static int f5(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.wither.break_block", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.summon(c, "area_effect_cloud", "~0.5", "~0.5", "~0.5", "{Duration:2,Tags:[\"tree_center_i\",\"tree_center\"]}"));
        return 1;
    }
    // impossible_to_survive:features/tree/crimson/center
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "stripped_crimson_stem"), Control.when("block", "~", "~", "~", "crimson_stem")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_g\",\"tree_center\"]}"), Control.positioned("~", "~1", "~"), Control.when("block", "~", "~", "~", "crimson_stem"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_g\",\"tree_center\"]}"), Control.positioned("~", "~-1", "~"), Control.when("block", "~", "~", "~", "crimson_stem"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_g\",\"tree_center\"]}"), Control.positioned("~", "~", "~1"), Control.when("block", "~", "~", "~", "crimson_stem"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_g\",\"tree_center\"]}"), Control.positioned("~", "~", "~-1"), Control.when("block", "~", "~", "~", "crimson_stem"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_g\",\"tree_center\"]}"), Control.positioned("~1", "~", "~"), Control.when("block", "~", "~", "~", "crimson_stem"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_g\",\"tree_center\"]}"), Control.positioned("~-1", "~", "~"), Control.when("block", "~", "~", "~", "crimson_stem"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_g\",\"tree_center\"]}"), Control.positioned("~", "~1", "~1"), Control.when("block", "~", "~", "~", "crimson_stem"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_g\",\"tree_center\"]}"), Control.positioned("~", "~1", "~-1"), Control.when("block", "~", "~", "~", "crimson_stem"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_g\",\"tree_center\"]}"), Control.positioned("~1", "~1", "~"), Control.when("block", "~", "~", "~", "crimson_stem"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_g\",\"tree_center\"]}"), Control.positioned("~-1", "~1", "~"), Control.when("block", "~", "~", "~", "crimson_stem"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/crimson/summon_pieces_x_pos"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/crimson/summon_pieces_x_neg"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/crimson/summon_pieces_z_neg"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/crimson/summon_pieces_z_pos"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:passable")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/tree/crimson/mined_tree
    private static int f7(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/tree"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/crimson/zzz/0"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:crimson_stem\"},Age:0s}]"), Control.at("@s"), Control.align("xyz")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedCrimson", "0"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@e[type=item,nbt={Item:{id:\"minecraft:crimson_stem\"},Age:0s},limit=1,sort=nearest]", "{Item:{id:\"minecraft:stripped_crimson_stem\"}}"));
        return 1;
    }
    // impossible_to_survive:features/tree/crimson/piece
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece6]")));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:crimson_planks\"}", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "tree_piece_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/piece_hit"), Control.at("@s"), Control.positioned("~", "~-0.5", "~"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "tree_piece_lt", "matches", "60..")));
        return 1;
    }
    // impossible_to_survive:features/tree/crimson/summon_pieces_x_neg
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":66}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":67}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":68}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":69}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":70}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":71}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/crimson/summon_pieces_x_pos
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":66}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":67}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":68}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":69}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":70}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":71}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/crimson/summon_pieces_z_neg
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":66}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":67}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":68}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":69}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":70}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":71}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/crimson/summon_pieces_z_pos
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":66}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":67}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":67}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":68}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":69}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_g\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":70}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/crimson/zzz/0
    private static int f13(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.wither.break_block", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.summon(c, "area_effect_cloud", "~0.5", "~0.5", "~0.5", "{Duration:2,Tags:[\"tree_center_g\",\"tree_center\"]}"));
        return 1;
    }
    // impossible_to_survive:features/tree/dark_oak/center
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "stripped_dark_oak_log"), Control.when("block", "~", "~", "~", "dark_oak_log")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_f\",\"tree_center\"]}"), Control.positioned("~", "~1", "~"), Control.when("block", "~", "~", "~", "dark_oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_f\",\"tree_center\"]}"), Control.positioned("~", "~-1", "~"), Control.when("block", "~", "~", "~", "dark_oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_f\",\"tree_center\"]}"), Control.positioned("~", "~", "~1"), Control.when("block", "~", "~", "~", "dark_oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_f\",\"tree_center\"]}"), Control.positioned("~", "~", "~-1"), Control.when("block", "~", "~", "~", "dark_oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_f\",\"tree_center\"]}"), Control.positioned("~1", "~", "~"), Control.when("block", "~", "~", "~", "dark_oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_f\",\"tree_center\"]}"), Control.positioned("~-1", "~", "~"), Control.when("block", "~", "~", "~", "dark_oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_f\",\"tree_center\"]}"), Control.positioned("~", "~1", "~1"), Control.when("block", "~", "~", "~", "dark_oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_f\",\"tree_center\"]}"), Control.positioned("~", "~1", "~-1"), Control.when("block", "~", "~", "~", "dark_oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_f\",\"tree_center\"]}"), Control.positioned("~1", "~1", "~"), Control.when("block", "~", "~", "~", "dark_oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_f\",\"tree_center\"]}"), Control.positioned("~-1", "~1", "~"), Control.when("block", "~", "~", "~", "dark_oak_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/dark_oak/summon_pieces_x_pos"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/dark_oak/summon_pieces_x_neg"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/dark_oak/summon_pieces_z_neg"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/dark_oak/summon_pieces_z_pos"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:passable")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/tree/dark_oak/mined_tree
    private static int f15(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/tree"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/dark_oak/zzz/0"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:dark_oak_log\"},Age:0s}]"), Control.at("@s"), Control.align("xyz")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedDarkOak", "0"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@e[type=item,nbt={Item:{id:\"minecraft:dark_oak_log\"},Age:0s},limit=1,sort=nearest]", "{Item:{id:\"minecraft:stripped_dark_oak_log\"}}"));
        return 1;
    }
    // impossible_to_survive:features/tree/dark_oak/piece
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.3", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^-0.1", "^", "^0.6"), Control.when("entity", "@s[tag=tree_piece5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^0.2", "^", "^0.45"), Control.when("entity", "@s[tag=tree_piece6]")));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:dark_oak_planks\"}", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "tree_piece_lt", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/piece_hit"), Control.at("@s"), Control.positioned("~", "~-0.5", "~"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "tree_piece_lt", "matches", "60..")));
        return 1;
    }
    // impossible_to_survive:features/tree/dark_oak/summon_pieces_x_neg
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":60}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":61}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":62}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":63}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":64}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":65}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/dark_oak/summon_pieces_x_pos
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":60}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":61}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":62}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":63}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":64}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":65}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/dark_oak/summon_pieces_z_neg
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":60}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":61}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":62}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":63}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":64}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":65}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/dark_oak/summon_pieces_z_pos
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":60}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":61}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":62}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":63}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":64}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_f\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":65}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/dark_oak/zzz/0
    private static int f21(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.wither.break_block", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.summon(c, "area_effect_cloud", "~0.5", "~0.5", "~0.5", "{Duration:2,Tags:[\"tree_center_f\",\"tree_center\"]}"));
        return 1;
    }
    // impossible_to_survive:features/tree/jungle/center
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "stripped_jungle_log"), Control.when("block", "~", "~", "~", "jungle_log")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_d\",\"tree_center\"]}"), Control.positioned("~", "~1", "~"), Control.when("block", "~", "~", "~", "jungle_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_d\",\"tree_center\"]}"), Control.positioned("~", "~-1", "~"), Control.when("block", "~", "~", "~", "jungle_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_d\",\"tree_center\"]}"), Control.positioned("~", "~", "~1"), Control.when("block", "~", "~", "~", "jungle_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_d\",\"tree_center\"]}"), Control.positioned("~", "~", "~-1"), Control.when("block", "~", "~", "~", "jungle_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_d\",\"tree_center\"]}"), Control.positioned("~1", "~", "~"), Control.when("block", "~", "~", "~", "jungle_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_d\",\"tree_center\"]}"), Control.positioned("~-1", "~", "~"), Control.when("block", "~", "~", "~", "jungle_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_d\",\"tree_center\"]}"), Control.positioned("~", "~1", "~1"), Control.when("block", "~", "~", "~", "jungle_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_d\",\"tree_center\"]}"), Control.positioned("~", "~1", "~-1"), Control.when("block", "~", "~", "~", "jungle_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_d\",\"tree_center\"]}"), Control.positioned("~1", "~1", "~"), Control.when("block", "~", "~", "~", "jungle_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_d\",\"tree_center\"]}"), Control.positioned("~-1", "~1", "~"), Control.when("block", "~", "~", "~", "jungle_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/jungle/summon_pieces_x_pos"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/jungle/summon_pieces_x_neg"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/jungle/summon_pieces_z_neg"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/jungle/summon_pieces_z_pos"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:passable")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/tree/jungle/mined_tree
    private static int f23(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/tree"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/jungle/zzz/0"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:jungle_log\"},Age:0s}]"), Control.at("@s"), Control.align("xyz")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedJungle", "0"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@e[type=item,nbt={Item:{id:\"minecraft:jungle_log\"},Age:0s},limit=1,sort=nearest]", "{Item:{id:\"minecraft:stripped_jungle_log\"}}"));
        return 1;
    }
}
