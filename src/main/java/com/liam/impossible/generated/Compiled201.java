package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled201 {
    public static void register() {
        Logic.register("impossible_to_survive:features/tree/spruce/center", Compiled201::f0);
        Logic.register("impossible_to_survive:features/tree/spruce/mined_tree", Compiled201::f1);
        Logic.register("impossible_to_survive:features/tree/spruce/piece", Compiled201::f2);
        Logic.register("impossible_to_survive:features/tree/spruce/summon_pieces_x_neg", Compiled201::f3);
        Logic.register("impossible_to_survive:features/tree/spruce/summon_pieces_x_pos", Compiled201::f4);
        Logic.register("impossible_to_survive:features/tree/spruce/summon_pieces_z_neg", Compiled201::f5);
        Logic.register("impossible_to_survive:features/tree/spruce/summon_pieces_z_pos", Compiled201::f6);
        Logic.register("impossible_to_survive:features/tree/spruce/zzz/0", Compiled201::f7);
        Logic.register("impossible_to_survive:features/tree/zzz/0", Compiled201::f8);
        Logic.register("impossible_to_survive:features/villager/loop", Compiled201::f9);
        Logic.register("impossible_to_survive:features/villager/zombie_loop", Compiled201::f10);
        Logic.register("impossible_to_survive:features/villager/zzz/0", Compiled201::f11);
        Logic.register("impossible_to_survive:features/villager/zzz/1", Compiled201::f12);
        Logic.register("impossible_to_survive:features/villager/zzz/2", Compiled201::f13);
        Logic.register("impossible_to_survive:features/villager/zzz/3", Compiled201::f14);
        Logic.register("impossible_to_survive:features/villager/zzz/4", Compiled201::f15);
        Logic.register("impossible_to_survive:features/villager/zzz/5", Compiled201::f16);
        Logic.register("impossible_to_survive:gear_everyone_up", Compiled201::f17);
        Logic.register("impossible_to_survive:hermit_complete_message", Compiled201::f18);
        Logic.register("impossible_to_survive:load", Compiled201::f19);
        Logic.register("impossible_to_survive:math/cos", Compiled201::f20, "x");
        Logic.register("impossible_to_survive:math/internal/convert_to_double", Compiled201::f21, "var2");
        Logic.register("impossible_to_survive:math/internal/cos_handling", Compiled201::f22);
        Logic.register("impossible_to_survive:math/internal/sin_handling", Compiled201::f23);
    }
    // impossible_to_survive:features/tree/spruce/center
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "stripped_spruce_log"), Control.when("block", "~", "~", "~", "spruce_log")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_b\",\"tree_center\"]}"), Control.positioned("~", "~1", "~"), Control.when("block", "~", "~", "~", "spruce_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_b\",\"tree_center\"]}"), Control.positioned("~", "~-1", "~"), Control.when("block", "~", "~", "~", "spruce_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_b\",\"tree_center\"]}"), Control.positioned("~", "~", "~1"), Control.when("block", "~", "~", "~", "spruce_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_b\",\"tree_center\"]}"), Control.positioned("~", "~", "~-1"), Control.when("block", "~", "~", "~", "spruce_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_b\",\"tree_center\"]}"), Control.positioned("~1", "~", "~"), Control.when("block", "~", "~", "~", "spruce_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_b\",\"tree_center\"]}"), Control.positioned("~-1", "~", "~"), Control.when("block", "~", "~", "~", "spruce_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_b\",\"tree_center\"]}"), Control.positioned("~", "~1", "~1"), Control.when("block", "~", "~", "~", "spruce_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_b\",\"tree_center\"]}"), Control.positioned("~", "~1", "~-1"), Control.when("block", "~", "~", "~", "spruce_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_b\",\"tree_center\"]}"), Control.positioned("~1", "~1", "~"), Control.when("block", "~", "~", "~", "spruce_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "area_effect_cloud", "~", "~", "~", "{Duration:2,Tags:[\"tree_center_b\",\"tree_center\"]}"), Control.positioned("~-1", "~1", "~"), Control.when("block", "~", "~", "~", "spruce_log"), Control.unless("entity", "@e[type=area_effect_cloud,tag=tree_center,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/spruce/summon_pieces_x_pos"), Control.when("block", "~1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/spruce/summon_pieces_x_neg"), Control.when("block", "~-1", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/spruce/summon_pieces_z_neg"), Control.when("block", "~", "~", "~-1", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/spruce/summon_pieces_z_pos"), Control.when("block", "~", "~", "~1", "#impossible_to_survive:passable")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/tree/spruce/mined_tree
    private static int f1(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/tree"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/spruce/zzz/0"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:spruce_log\"},Age:0s}]"), Control.at("@s"), Control.align("xyz")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedSpruce", "0"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@e[type=item,nbt={Item:{id:\"minecraft:spruce_log\"},Age:0s},limit=1,sort=nearest]", "{Item:{id:\"minecraft:stripped_spruce_log\"}}"));
        return 1;
    }
    // impossible_to_survive:features/tree/spruce/piece
    private static int f2(Frame c) {
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
    // impossible_to_survive:features/tree/spruce/summon_pieces_x_neg
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":36}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":37}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":38}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":39}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":40}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":41}},Rotation:[90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/spruce/summon_pieces_x_pos
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":36}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":37}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":38}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":39}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":40}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":41}},Rotation:[-90f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/spruce/summon_pieces_z_neg
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":36}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":37}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":38}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":39}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":40}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":41}},Rotation:[180f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/spruce/summon_pieces_z_pos
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece1\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":36}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece2\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":37}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece3\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":38}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece4\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":39}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece5\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":40}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~-0.4", "~", "~", "{teleport_duration:2,Tags:[\"tree_piece\",\"tree_piece6\",\"tree_piece_b\"],NoGravity:1,item:{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":41}},Rotation:[0f]}"), Control.when("score", "world", "piece_type", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/tree/spruce/zzz/0
    private static int f7(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.wither.break_block", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.summon(c, "area_effect_cloud", "~0.5", "~0.5", "~0.5", "{Duration:2,Tags:[\"tree_center_b\",\"tree_center\"]}"));
        return 1;
    }
    // impossible_to_survive:features/tree/zzz/0
    private static int f8(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:mob_projectile", "by", "@e[type=marker,tag=mcm.death_message_marker,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:mob_projectile", "by", "@e[type=marker,tag=mcm.death_message_marker,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "20", "minecraft:mob_projectile", "by", "@e[type=marker,tag=mcm.death_message_marker,limit=1,sort=nearest]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/villager/loop
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/villager/zzz/0"), Control.unless("entity", "@s[tag=evil_villager]"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..12]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/villager/zzz/2"), Control.when("entity", "@s[tag=evil_villager]")));
        return 1;
    }
    // impossible_to_survive:features/villager/zombie_loop
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/villager/zzz/5"), Control.unless("entity", "@e[type=villager,tag=evil_villager,distance=..2]")));
        return 1;
    }
    // impossible_to_survive:features/villager/zzz/0
    private static int f11(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/villager"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{PersistenceRequired:1,DeathLootTable:\"\",ArmorItems:[{},{},{},{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":2}}],HandItems:[{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":3}},{}],HandDropChances:[0.000F,0.000F],ArmorDropChances:[0.000F,0.000F,0.000F,0.000F],attributes:[{id:\"minecraft:generic.max_health\",base:40}],Health:40f}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "evil_villager"));
        Logic.step(() -> Native.team(c, "join", "enemy", "@s"));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "zombie", "~", "~-10", "~", "{DeathLootTable:\"\",Team:\"enemy\",Invulnerable:1b,Health:1000f,IsBaby:1b,Tags:[\"villager_zombie\",\"init\"],ArmorItems:[{},{},{},{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":1}}],ArmorDropChances:[0.00F,0.00F,0.00F,0.000F],active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],attributes:[{id:\"minecraft:generic.attack_damage\",base:3},{id:\"minecraft:generic.follow_range\",base:20},{id:\"minecraft:generic.knockback_resistance\",base:0.2},{id:\"minecraft:generic.max_health\",base:1000},{id:\"minecraft:generic.movement_speed\",base:0.3}],Silent:1,CustomName:'{\"text\":\"Killager\"}',CustomNameVisible:0b}"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "zombie", "~", "~-10", "~", "{DeathLootTable:\"\",Team:\"enemy\",Invulnerable:1b,Health:1000f,IsBaby:1b,Tags:[\"villager_zombie\",\"init\"],ArmorItems:[{},{},{},{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":1}}],ArmorDropChances:[0.00F,0.00F,0.00F,0.000F],active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],attributes:[{id:\"minecraft:generic.attack_damage\",base:6},{id:\"minecraft:generic.follow_range\",base:20},{id:\"minecraft:generic.knockback_resistance\",base:0.4},{id:\"minecraft:generic.max_health\",base:1000},{id:\"minecraft:generic.movement_speed\",base:0.32}],Silent:1,CustomName:'{\"text\":\"Killager\"}',CustomNameVisible:0b}"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "zombie", "~", "~-10", "~", "{DeathLootTable:\"\",Team:\"enemy\",Invulnerable:1b,Health:1000f,IsBaby:1b,Tags:[\"villager_zombie\",\"init\"],ArmorItems:[{},{},{},{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":1}}],ArmorDropChances:[0.00F,0.00F,0.00F,0.000F],active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],attributes:[{id:\"minecraft:generic.attack_damage\",base:9},{id:\"minecraft:generic.follow_range\",base:20},{id:\"minecraft:generic.knockback_resistance\",base:1},{id:\"minecraft:generic.max_health\",base:1000},{id:\"minecraft:generic.movement_speed\",base:0.34}],Silent:1,CustomName:'{\"text\":\"Killager\"}',CustomNameVisible:0b}"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/villager/zzz/1"), Control.as("@e[type=zombie,tag=villager_zombie,tag=init]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/villager/zzz/1
    private static int f12(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "init"));
        Logic.step(() -> Native.effect(c, "give", "@s", "minecraft:invisibility", "infinite", "9", "true"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~10", "~"));
        return 1;
    }
    // impossible_to_survive:features/villager/zzz/2
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{DeathLootTable:\"\",ArmorItems:[{},{},{},{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":2}}],HandItems:[{id:\"minecraft:brick\",count:1,components:{\"minecraft:custom_model_data\":3}},{}],HandDropChances:[0.000F,0.000F],ArmorDropChances:[0.000F,0.000F,0.000F,0.000F]}"));
        Logic.step(() -> Native.tp(c, "@s", "@e[type=zombie,tag=villager_zombie,limit=1,sort=nearest,distance=..1]"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/villager/zzz/3"), Control.unless("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..15]"), Control.when("entity", "@a[distance=..30]")));
        return 1;
    }
    // impossible_to_survive:features/villager/zzz/3
    private static int f14(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "evil_villager"));
        Logic.step(() -> Native.team(c, "leave", "@s"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/villager/zzz/4"), Control.as("@e[type=zombie,tag=villager_zombie,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{DeathLootTable:\"\",ArmorItems:[{},{},{},{}],HandItems:[{},{}],HandDropChances:[0.000F,0.000F],ArmorDropChances:[0.000F,0.000F,0.000F,0.000F]}"));
        return 1;
    }
    // impossible_to_survive:features/villager/zzz/4
    private static int f15(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~-1000", "~"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/villager/zzz/5
    private static int f16(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~-1000", "~"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:gear_everyone_up
    private static int f17(Frame c) {
        Logic.step(() -> Native.give(c, "@a", "netherite_chestplate"));
        Logic.step(() -> Native.give(c, "@a", "netherite_leggings"));
        Logic.step(() -> Native.give(c, "@a", "netherite_boots"));
        Logic.step(() -> Native.give(c, "@a", "netherite_helmet"));
        Logic.step(() -> Native.give(c, "@a", "bow[enchantments={levels:{\"minecraft:power\":3,\"minecraft:infinity\":1,\"minecraft:unbreaking\":3}}]", "1"));
        Logic.step(() -> Native.give(c, "@a", "bow[enchantments={levels:{\"minecraft:power\":3,\"minecraft:infinity\":1,\"minecraft:unbreaking\":3}}]", "1"));
        Logic.step(() -> Native.give(c, "@a", "bow[enchantments={levels:{\"minecraft:power\":3,\"minecraft:infinity\":1,\"minecraft:unbreaking\":3}}]", "1"));
        Logic.step(() -> Native.give(c, "@a", "bow[enchantments={levels:{\"minecraft:power\":3,\"minecraft:infinity\":1,\"minecraft:unbreaking\":3}}]", "1"));
        Logic.step(() -> Native.give(c, "@a", "bow[enchantments={levels:{\"minecraft:power\":3,\"minecraft:infinity\":1,\"minecraft:unbreaking\":3}}]", "1"));
        Logic.step(() -> Native.give(c, "@a", "water_bucket"));
        Logic.step(() -> Native.give(c, "@a", "water_bucket"));
        Logic.step(() -> Native.give(c, "@a", "water_bucket"));
        Logic.step(() -> Native.give(c, "@a", "water_bucket"));
        Logic.step(() -> Native.give(c, "@a", "golden_apple", "64"));
        Logic.step(() -> Native.give(c, "@a", "golden_carrot", "64"));
        Logic.step(() -> Native.give(c, "@a", "arrow", "256"));
        Logic.step(() -> Native.give(c, "@a", "netherite_axe"));
        Logic.step(() -> Native.give(c, "@a", "netherite_axe"));
        Logic.step(() -> Native.give(c, "@a", "netherite_axe"));
        Logic.step(() -> Native.give(c, "@a", "netherite_pickaxe"));
        Logic.step(() -> Native.give(c, "@a", "netherite_pickaxe"));
        Logic.step(() -> Native.give(c, "@a", "dirt", "256"));
        return 1;
    }
    // impossible_to_survive:hermit_complete_message
    private static int f18(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "{\"text\":\"\"}"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\"},{\"text\":\"D\",\"bold\":true,\"color\":\"dark_green\"},{\"text\":\"i\",\"bold\":true,\"color\":\"#0ac40a\"},{\"text\":\"f\",\"bold\":true,\"color\":\"#14cb14\"},{\"text\":\"f\",\"bold\":true,\"color\":\"#1ed21e\"},{\"text\":\"i\",\"bold\":true,\"color\":\"#28d928\"},{\"text\":\"c\",\"bold\":true,\"color\":\"#32df32\"},{\"text\":\"u\",\"bold\":true,\"color\":\"#3ce63c\"},{\"text\":\"l\",\"bold\":true,\"color\":\"#46ed46\"},{\"text\":\"t\",\"bold\":true,\"color\":\"#50f450\"},{\"text\":\"y \",\"bold\":true,\"color\":\"#5afb5a\"},{\"text\":\"c\",\"bold\":true,\"color\":\"#50f450\"},{\"text\":\"o\",\"bold\":true,\"color\":\"#45ed45\"},{\"text\":\"m\",\"bold\":true,\"color\":\"#3ce63c\"},{\"text\":\"p\",\"bold\":true,\"color\":\"#32df32\"},{\"text\":\"l\",\"bold\":true,\"color\":\"#28d928\"},{\"text\":\"e\",\"bold\":true,\"color\":\"#1dd21d\"},{\"text\":\"t\",\"bold\":true,\"color\":\"#14cb14\"},{\"text\":\"e\",\"bold\":true,\"color\":\"#0ac40a\"},{\"text\":\"d \",\"bold\":true,\"color\":\"dark_green\"},{\"text\":\"\\u0022\",\"font\":\"minecraft:icons\",\"color\":\"#4e5c24\"}]"));
        Logic.step(() -> Native.tellraw(c, "@s", "{\"translate\":\"impossible_difficulty.author\",\"with\":[\"LIAM\"],\"color\":\"blue\"}"));
        return 1;
    }
    // impossible_to_survive:load
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "LANG_MC_INTERNAL", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcb.internal", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "x", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "y", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "z", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "dx", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "dy", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "dz", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "timeSinceDeath", "minecraft.custom:minecraft.time_since_death"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "deathCount", "deathCount"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "r", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "rand", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "launchTimer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "p_rot", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "rc", "minecraft.used:minecraft.carrot_on_a_stick"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "talk", "minecraft.custom:minecraft.talked_to_villager"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "fungus", "minecraft.used:minecraft.warped_fungus_on_a_stick"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "walk", "minecraft.custom:minecraft.walk_one_cm"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "sneak", "minecraft.custom:minecraft.crouch_one_cm"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "sprint", "minecraft.custom:minecraft.sprint_one_cm"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "crossbow", "minecraft.used:minecraft.crossbow"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "constant", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "deathTimer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "damageTimer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mobHealth", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "attackTimer1", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "attackTimer2", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "attackTimer3", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "attackTimer4", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "attack1_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "attack2_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "attack3_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "attack4_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "moveTimer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "isMoving", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "cactus_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "lava_wave_lt", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "sheep_wool_lt", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedCoal", "minecraft.mined:minecraft.coal_ore"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedCoal2", "minecraft.mined:minecraft.deepslate_coal_ore"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedDiamond", "minecraft.mined:minecraft.diamond_ore"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedDiamond2", "minecraft.mined:minecraft.deepslate_diamond_ore"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedIron", "minecraft.mined:minecraft.iron_ore"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedIron2", "minecraft.mined:minecraft.deepslate_iron_ore"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "coalTimer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "inventory_weight", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "glowstone_scan_offset", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "glowstone_laser_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "shark_spawn_location", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "shark_lt", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "stormTimer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "chickenTimer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "chicken_lt", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "cowTimer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "pigTimer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "cow_proj_lt", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mined_gold_block", "minecraft.mined:minecraft.gold_block"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "killIronGolem", "minecraft.killed:minecraft.iron_golem"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "pig_shockwave_lt", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "enderEye", "minecraft.used:minecraft.ender_eye"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "eye_lt", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "dragon_lt", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "sugarcane_mined", "minecraft.mined:minecraft.sugar_cane"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "has_bucket", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "sc_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "enderpearl_use", "minecraft.used:minecraft.ender_pearl"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedOak", "minecraft.mined:minecraft.oak_log"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedSpruce", "minecraft.mined:minecraft.spruce_log"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedBirch", "minecraft.mined:minecraft.birch_log"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedJungle", "minecraft.mined:minecraft.jungle_log"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedAcacia", "minecraft.mined:minecraft.acacia_log"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedDarkOak", "minecraft.mined:minecraft.dark_oak_log"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedCrimson", "minecraft.mined:minecraft.crimson_stem"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedMangrove", "minecraft.mined:minecraft.mangrove_log"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "minedCherry", "minecraft.mined:minecraft.cherry_log"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "tree_piece_lt", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "piece_type", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "blazed_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "killBlaze", "minecraft.killed:minecraft.blaze"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "ender_look_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "killedZombie", "minecraft.killed:minecraft.zombie"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "chest_opened", "minecraft.custom:minecraft.open_chest"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "nightVision", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "item_eye_of_ender", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "r", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "crafted_item", "minecraft.used:minecraft.crafting_table"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "bedLaunchTimer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "toolDamage", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "placed_furnace", "minecraft.used:minecraft.furnace"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "armorAmount", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "lifetime", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "lava_wave_hit_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "sawblade_damage_cooldown", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "crafting_table_look_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "crafting_table_look_x", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "crafting_table_look_y", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "blaze_id", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "blaze_rod_y_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "misc", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "temp", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "raycast_iterations", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "furnace_lit_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "giant_arrow_hit_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "portal_id", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "soul_hit_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "spawn_souls_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "wither_skeleton_invis_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "portal_scan_offset", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "chest_check_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "chest_look_x", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "chest_look_y", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "chest_look_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "wave_spawn_cooldown", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.id", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "eye_rot_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.iterations", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.enchantment_t_placed", "minecraft.used:minecraft.enchanting_table"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.use_wfoas", "minecraft.used:minecraft.warped_fungus_on_a_stick"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.use_carrot_on_a_stick", "minecraft.used:minecraft.carrot_on_a_stick"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.crafting_table_interact", "minecraft.custom:minecraft.interact_with_crafting_table"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.anvil_interact", "minecraft.custom:minecraft.interact_with_anvil"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.brewing_stand_interact", "minecraft.custom:minecraft.interact_with_brewingstand"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.smoker_interact", "minecraft.custom:minecraft.interact_with_smoker"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.smoker_placed", "minecraft.used:minecraft.smoker"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.brewing_stand_placed", "minecraft.used:minecraft.brewing_stand"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "wfoas_click_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "display_override_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "infinite_saturation", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "activate_contestant_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "cactus_check_offset", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "r", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "hermitcraft_started", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lifetime", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.misc", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.temp", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "look_lock_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "anvil_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "sleeping", "minecraft.custom:minecraft.sleep_in_bed"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "awake", "minecraft.custom:minecraft.time_since_rest"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "slime_launch_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "hand_spawn_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "item_cake", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "item_e_table", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "item_green_wool", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "item_chorusfruit", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "item_sea_lantern", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "round_min", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "round_10sec", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "round_1sec", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "round_sec", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "total_hrs", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "total_min", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "display_min", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "total_1sec", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "total_10sec", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "total_10min", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "total_sec", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "timer_is_going", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "player_dmg_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "toggle_armor_settings_message", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "toggle_enderman_settings_message", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "disabled_endermen", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "disabled_chest", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "disabled_flashbang", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "dev_showcase_stage", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "hermit_feature_counter", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "book_attack_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "attack_cooldown", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "scarecrow_damage_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.mined_obsidian", "minecraft.mined:minecraft.obsidian"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.fished", "minecraft.custom:minecraft.fish_caught"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "anvil_check_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "anvil_xp", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "poison_cooldown", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "vampire_done_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "blood_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "blood_10_sec", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "blood_sec", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "root_scan", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "root_hit_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mob_kills", "minecraft.custom:minecraft.mob_kills"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "shears_sprint", "minecraft.custom:minecraft.sprint_one_cm"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "death_message", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "welcome_message", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "disable_armor_slowing", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#global", "stormTimer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@a", "sc_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@a", "ender_look_cd", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#global", "nightVision", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "-1", "constant", "-1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "minus1", "constant", "-1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "0", "constant", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "2", "constant", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "3", "constant", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "8", "constant", "8"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "10", "constant", "10"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "14", "constant", "14"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "16", "constant", "16"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "20", "constant", "20"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "60", "constant", "60"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "59", "constant", "59"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "1000", "constant", "1000"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "10000", "constant", "10000"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "100000", "constant", "100000"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "5", "constant", "5"));
        Logic.step(() -> Native.gamerule(c, "logAdminCommands", "false"));
        Logic.step(() -> Native.gamerule(c, "commandBlockOutput", "false"));
        Logic.step(() -> Native.gamerule(c, "maxCommandChainLength", "150000"));
        Logic.step(() -> Native.gamerule(c, "disableElytraMovementCheck", "true"));
        Logic.step(() -> Native.team(c, "add", "nocoll"));
        Logic.step(() -> Native.team(c, "modify", "nocoll", "collisionRule", "never"));
        Logic.step(() -> Native.team(c, "modify", "nocoll", "seeFriendlyInvisibles", "false"));
        Logic.step(() -> Native.team(c, "add", "hitbox"));
        Logic.step(() -> Native.team(c, "modify", "hitbox", "collisionRule", "never"));
        Logic.step(() -> Native.team(c, "modify", "hitbox", "seeFriendlyInvisibles", "false"));
        Logic.step(() -> Native.team(c, "add", "enemy"));
        Logic.step(() -> Native.team(c, "modify", "enemy", "collisionRule", "never"));
        Logic.step(() -> Native.team(c, "modify", "enemy", "seeFriendlyInvisibles", "false"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:zzz/0"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.overall_difficulty", "dummy"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#global", "mcm.its.overall_difficulty", "2"), Control.unless("score", "#global", "mcm.its.overall_difficulty", "matches", "1..")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/load"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/lightning_projectile/init"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/1"), Control.unless("score", "#global", "welcome_message", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:math/cos
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:math_io", "out", "set", "value", "\"fail\""));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "impossible_to_survive:math/internal/cos_handling")), Control.rotated("$(x)", "0"), Control.positioned("0.0", "0.0", "0.0"), Control.positioned("^", "^", "^1"), Control.as("91bb5-0-0-0-ffff")));
        Logic.step(() -> Logic.returnFailed());
        Logic.step(() -> Native.tp(c, "invalid-input", "$(x)", "0", "0"));
        return 1;
    }
    // impossible_to_survive:math/internal/convert_to_double
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm._temp_:std", "var2", "set", "value", "$(var2)d"));
        return 1;
    }
    // impossible_to_survive:math/internal/cos_handling
    private static int f22(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~"));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:math_io", "out", "set", "from", "entity", "@s", "Pos[2]"));
        Logic.step(() -> Native.tp(c, "@s", "0", "0", "0"));
        Logic.step(() -> Logic.returnFromAction(Native.data(c, "get", "storage", "mcm:math_io", "out")));
        return 1;
    }
    // impossible_to_survive:math/internal/sin_handling
    private static int f23(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~"));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:math_io", "out", "set", "from", "entity", "@s", "Pos[0]"));
        Logic.step(() -> Native.tp(c, "@s", "0", "0", "0"));
        Logic.step(() -> Logic.returnFromAction(Native.data(c, "get", "storage", "mcm:math_io", "out")));
        return 1;
    }
}
