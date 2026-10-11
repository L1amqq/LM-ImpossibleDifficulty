package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled190 {
    public static void register() {
        Logic.register("impossible_to_survive:features/furnace/zzz/99", Compiled190::f0);
        Logic.register("impossible_to_survive:features/glowstone/glowstone_found", Compiled190::f1);
        Logic.register("impossible_to_survive:features/glowstone/shoot_laser", Compiled190::f4);
        Logic.register("impossible_to_survive:features/glowstone/zzz/0", Compiled190::f5);
        Logic.register("impossible_to_survive:features/glowstone/zzz/1", Compiled190::f6);
        Logic.register("impossible_to_survive:features/glowstone/zzz/10", Compiled190::f7);
        Logic.register("impossible_to_survive:features/gold_block/item_loop", Compiled190::f17);
        Logic.register("impossible_to_survive:features/gold_block/mined", Compiled190::f18);
        Logic.register("impossible_to_survive:features/gold_block/zzz/0", Compiled190::f19);
        Logic.register("impossible_to_survive:features/gold_block/zzz/1", Compiled190::f20);
        Logic.register("impossible_to_survive:features/gold_block/zzz/2", Compiled190::f21);
        Logic.register("impossible_to_survive:features/gold_block/zzz/3", Compiled190::f22);
        Logic.register("impossible_to_survive:features/gold_block/zzz/4", Compiled190::f23);
    }
    // impossible_to_survive:features/furnace/zzz/99
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/100"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/101"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/glowstone/glowstone_found
    private static int f1(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "this.glowstone_triggerer"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/glowstone/zzz/10"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this.glowstone_triggerer"));
        return 1;
    }
    // impossible_to_survive:features/glowstone/shoot_laser
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:glowstone_laser", "master", "@a", "~", "~", "~", "3.0", "1.0"), Control.positioned("~", "~-5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/glowstone/zzz/0"), Control.as("@p[tag=this.glowstone_triggerer]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~0.1", "~", "~", "^", "^-10000000", "^", "0.00000001", "0", "force"), Control.positioned("~", "~-0.6", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~0.1", "^", "^-10000000", "^", "0.00000002", "0", "force"), Control.positioned("~", "~-0.6", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~-0.1", "~", "~", "^", "^-10000000", "^", "0.00000003", "0", "force"), Control.positioned("~", "~-0.6", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~-0.1", "^", "^-10000000", "^", "0.00000004", "0", "force"), Control.positioned("~", "~-0.6", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~0.1", "~", "~0.1", "^", "^-10000000", "^", "0.00000005", "0", "force"), Control.positioned("~", "~-0.6", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~-0.1", "~", "~-0.1", "^", "^-10000000", "^", "0.00000006", "0", "force"), Control.positioned("~", "~-0.6", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~-0.1", "~", "~0.1", "^", "^-10000000", "^", "0.00000007", "0", "force"), Control.positioned("~", "~-0.6", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~0.1", "~", "~-0.1", "^", "^-10000000", "^", "0.00000008", "0", "force"), Control.positioned("~", "~-0.6", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~", "^", "^-10000000", "^", "0.00000009", "0", "force"), Control.positioned("~", "~-0.6", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~0.2", "~", "~", "^", "^-10000000", "^", "0.00000010", "0", "force"), Control.positioned("~", "~-0.6", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~0.2", "^", "^-10000000", "^", "0.00000011", "0", "force"), Control.positioned("~", "~-0.6", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~-0.2", "~", "~", "^", "^-10000000", "^", "0.00000012", "0", "force"), Control.positioned("~", "~-0.6", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "end_rod", "~", "~", "~-0.2", "^", "^-10000000", "^", "0.00000013", "0", "force"), Control.positioned("~", "~-0.6", "~")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.1", "~"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/glowstone/recursive_tp_down"), Control.at("@s")));
        Logic.step(() -> Native.particle(c, "totem_of_undying", "~", "~", "~", "0.2", "0.1", "0.2", "0.4", "20", "force"));
        Logic.step(() -> Native.particle(c, "flash", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:glowstone\"}", "~", "~", "~", "0.4", "0.2", "0.4", "0.1", "20", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/glowstone/zzz/1"), Control.as("@a[tag=mcm.its.glowstone_hit]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/glowstone/zzz/0
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "glowstone_laser_cd", "3"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/glowstone"));
        return 1;
    }
    // impossible_to_survive:features/glowstone/zzz/1
    private static int f6(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.glowstone_hit"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this.glowstone_triggerer"));
        Logic.step(() -> Native.particle(c, "flash", "~", "~1", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~1", "~", "0", "0", "0", "0.2", "5", "force"));
        Logic.step(() -> Native.effect(c, "give", "@s", "minecraft:unluck", "59", "3", "false"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{CustomName:'\"Glowstone\"',Tags:[\"mcm.death_message_marker\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:arrow", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:arrow", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "15", "minecraft:arrow", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.death_message_marker]"));
        return 1;
    }
    // impossible_to_survive:features/glowstone/zzz/10
    private static int f7(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[mcm.its.glowstone_laser]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/glowstone/zzz/11"), Control.as("@e[type=marker,tag=mcm.its.glowstone_laser,distance=..0.1]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/gold_block/item_loop
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:gold_ingot\"}", "~", "~0.2", "~", "0.0", "0.0", "0.0", "0.01", "1", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/gold_block/zzz/3"), Control.when("score", "@s", "mcm.lifetime", "matches", "3.."), Control.when("entity", "@s[nbt={OnGround:1b}]")));
        return 1;
    }
    // impossible_to_survive:features/gold_block/mined
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s", "mined_gold_block"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/gold_block/zzz/0"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:gold_block\"},Age:0s},distance=..15]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/gold_block/zzz/0
    private static int f19(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/gold_block"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/gold_block/zzz/1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/gold_block/zzz/1
    private static int f20(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.generic.explode", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.generic.burn", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.item.break", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.particle(c, "explosion", "~", "~", "~", "0.2", "0.2", "0.2", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.2", "0.2", "0.2", "0.2", "3", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.2", "0.2", "0.2", "0.2", "3", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~", "~", "0.2", "0.2", "0.2", "0.4", "5", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:gold_block\"}", "~", "~0.5", "~", "0.4", "0.4", "0.4", "0.01", "10", "force"));
        Logic.step(() -> Native.summon(c, "item", "~", "~0.25", "~", "{PickupDelay:40,Motion:[0.0,0.5,0.0],Item:{id:\"minecraft:gold_ingot\",count:1},Tags:[\"gold_mined_item\"]}"));
        Logic.step(() -> Native.summon(c, "item", "~0.25", "~", "~0.25", "{PickupDelay:40,Motion:[0.2,0.4,0.2],Item:{id:\"minecraft:gold_ingot\",count:1},Tags:[\"gold_mined_item\"]}"));
        Logic.step(() -> Native.summon(c, "item", "~-0.25", "~", "~-0.25", "{PickupDelay:40,Motion:[-0.2,0.4,-0.2],Item:{id:\"minecraft:gold_ingot\",count:1},Tags:[\"gold_mined_item\"]}"));
        Logic.step(() -> Native.summon(c, "item", "~-0.25", "~", "~0.25", "{PickupDelay:40,Motion:[-.2,0.4,0.2],Item:{id:\"minecraft:gold_ingot\",count:1},Tags:[\"gold_mined_item\"]}"));
        Logic.step(() -> Native.summon(c, "item", "~0.25", "~", "~-0.25", "{PickupDelay:40,Motion:[0.2,0.4,-0.2],Item:{id:\"minecraft:gold_ingot\",count:1},Tags:[\"gold_mined_item\"]}"));
        Logic.step(() -> Native.summon(c, "item", "~0.5", "~", "~", "{PickupDelay:40,Motion:[0.5,0.25,0.0],Item:{id:\"minecraft:gold_ingot\",count:1},Tags:[\"gold_mined_item\"]}"));
        Logic.step(() -> Native.summon(c, "item", "~-0.5", "~", "~", "{PickupDelay:40,Motion:[-0.5,0.25,0.0],Item:{id:\"minecraft:gold_ingot\",count:1},Tags:[\"gold_mined_item\"]}"));
        Logic.step(() -> Native.summon(c, "item", "~", "~", "~-0.5", "{PickupDelay:40,Motion:[0.0,0.25,-0.5],Item:{id:\"minecraft:gold_ingot\",count:1},Tags:[\"gold_mined_item\"]}"));
        Logic.step(() -> Native.summon(c, "item", "~", "~", "~0.5", "{PickupDelay:40,Motion:[0.0,0.25,0.5],Item:{id:\"minecraft:gold_ingot\",count:1},Tags:[\"gold_mined_item\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/gold_block/zzz/2"), Control.when("entity", "@a[distance=..4]")));
        return 1;
    }
    // impossible_to_survive:features/gold_block/zzz/2
    private static int f21(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{CustomName:'\"Gold Block\"',Tags:[\"mcm.death_message_marker\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.damage(x1, "@s", "5", "minecraft:mob_attack", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.as("@a[distance=..4]")), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.damage(x1, "@s", "10", "minecraft:mob_attack", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.as("@a[distance=..4]")), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.damage(x1, "@s", "15", "minecraft:mob_attack", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.as("@a[distance=..4]")), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.death_message_marker]"));
        return 1;
    }
    // impossible_to_survive:features/gold_block/zzz/3
    private static int f22(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "gold_mined_item"));
        Logic.step(() -> Native.particle(c, "explosion", "~", "~0.4", "~", "0.0", "0.0", "0.0", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~0.4", "~", "0", "0", "0", "0.05", "5", "force"));
        Logic.step(() -> Native.particle(c, "cloud", "~", "~0.4", "~", "0", "0", "0", "0.05", "5", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:gold_block\"}", "~", "~0.4", "~", "0.2", "0.2", "0.2", "0.01", "10", "force"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..3"), Control.store("result", "score", "@s", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:entity.item.break", "master", "@a", "~", "~", "~", "1.0", "1.05"), Control.when("score", "@s", "mcm.temp", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:entity.item.break", "master", "@a", "~", "~", "~", "1.0", "1.0"), Control.when("score", "@s", "mcm.temp", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:entity.item.break", "master", "@a", "~", "~", "~", "1.0", "0.95"), Control.when("score", "@s", "mcm.temp", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/gold_block/zzz/4"), Control.when("entity", "@a[distance=..3]")));
        return 1;
    }
    // impossible_to_survive:features/gold_block/zzz/4
    private static int f23(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{CustomName:'\"Gold Block\"',Tags:[\"mcm.death_message_marker\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.damage(x1, "@s", "3", "minecraft:mob_attack", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.as("@a[distance=..3]")), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.damage(x1, "@s", "6", "minecraft:mob_attack", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.as("@a[distance=..3]")), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.damage(x1, "@s", "9", "minecraft:mob_attack", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.as("@a[distance=..3]")), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.death_message_marker]"));
        return 1;
    }
}
