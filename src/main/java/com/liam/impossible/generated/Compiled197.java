package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled197 {
    public static void register() {
        Logic.register("impossible_to_survive:features/shark/shark_spawn", Compiled197::f0);
        Logic.register("impossible_to_survive:features/shark/zzz/0", Compiled197::f1);
        Logic.register("impossible_to_survive:features/shark/zzz/1", Compiled197::f2);
        Logic.register("impossible_to_survive:features/shark/zzz/2", Compiled197::f3);
        Logic.register("impossible_to_survive:features/shark/zzz/3", Compiled197::f4);
        Logic.register("impossible_to_survive:features/shears/damage", Compiled197::f5);
        Logic.register("impossible_to_survive:features/shears/player_loop", Compiled197::f6);
        Logic.register("impossible_to_survive:features/shears/zzz/0", Compiled197::f7);
        Logic.register("impossible_to_survive:features/smoker/interact", Compiled197::f8);
        Logic.register("impossible_to_survive:features/smoker/loop_1t", Compiled197::f9);
        Logic.register("impossible_to_survive:features/smoker/place_block_marker", Compiled197::f10);
        Logic.register("impossible_to_survive:features/smoker/placed", Compiled197::f11);
        Logic.register("impossible_to_survive:features/smoker/trail_loop", Compiled197::f12);
        Logic.register("impossible_to_survive:features/smoker/zzz/0", Compiled197::f13);
        Logic.register("impossible_to_survive:features/smoker/zzz/1", Compiled197::f14);
        Logic.register("impossible_to_survive:features/smoker/zzz/2", Compiled197::f15);
        Logic.register("impossible_to_survive:features/smoker/zzz/3", Compiled197::f16);
        Logic.register("impossible_to_survive:features/smoker/zzz/4", Compiled197::f17);
        Logic.register("impossible_to_survive:features/smoker/zzz/5", Compiled197::f18);
        Logic.register("impossible_to_survive:features/storm/start", Compiled197::f19);
        Logic.register("impossible_to_survive:features/storm/stop", Compiled197::f20);
        Logic.register("impossible_to_survive:features/sugarcane/loop", Compiled197::f21);
        Logic.register("impossible_to_survive:features/sugarcane/sc_loop", Compiled197::f22);
        Logic.register("impossible_to_survive:features/sugarcane/summon_sc", Compiled197::f23);
    }
    // impossible_to_survive:features/shark/shark_spawn
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "shark_spawn_location", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s[scores={shark_spawn_location=8..}]", "shark_spawn_location", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~", "~", "{Small:1b,Marker:0b,Invisible:1b,DisabledSlots:4144959,Tags:[\"shark\",\"shark_init\",\"has_shark_bite\"],NoGravity:1,CustomName:'{\"text\":\"Shark\"}'}"), Control.when("entity", "@s[scores={shark_spawn_location=0}]"), Control.align("y"), Control.positioned("~", "~0.3", "~8"), Control.when("block", "~", "~", "~", "water")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~", "~", "{Small:1b,Marker:0b,Invisible:1b,DisabledSlots:4144959,Tags:[\"shark\",\"shark_init\",\"has_shark_bite\"],NoGravity:1,CustomName:'{\"text\":\"Shark\"}'}"), Control.when("entity", "@s[scores={shark_spawn_location=1}]"), Control.align("y"), Control.positioned("~5", "~0.3", "~-5"), Control.when("block", "~", "~", "~", "water")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~", "~", "{Small:1b,Marker:0b,Invisible:1b,DisabledSlots:4144959,Tags:[\"shark\",\"shark_init\",\"has_shark_bite\"],NoGravity:1,CustomName:'{\"text\":\"Shark\"}'}"), Control.when("entity", "@s[scores={shark_spawn_location=2}]"), Control.align("y"), Control.positioned("~-7", "~0.3", "~1"), Control.when("block", "~", "~", "~", "water")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~", "~", "{Small:1b,Marker:0b,Invisible:1b,DisabledSlots:4144959,Tags:[\"shark\",\"shark_init\",\"has_shark_bite\"],NoGravity:1,CustomName:'{\"text\":\"Shark\"}'}"), Control.when("entity", "@s[scores={shark_spawn_location=4}]"), Control.align("y"), Control.positioned("~-7", "~0.3", "~1"), Control.when("block", "~", "~", "~", "water")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~", "~", "{Small:1b,Marker:0b,Invisible:1b,DisabledSlots:4144959,Tags:[\"shark\",\"shark_init\",\"has_shark_bite\"],NoGravity:1,CustomName:'{\"text\":\"Shark\"}'}"), Control.when("entity", "@s[scores={shark_spawn_location=5}]"), Control.align("y"), Control.positioned("~8", "~0.3", "~"), Control.when("block", "~", "~", "~", "water")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~", "~", "{Small:1b,Marker:0b,Invisible:1b,DisabledSlots:4144959,Tags:[\"shark\",\"shark_init\",\"has_shark_bite\"],NoGravity:1,CustomName:'{\"text\":\"Shark\"}'}"), Control.when("entity", "@s[scores={shark_spawn_location=6}]"), Control.align("y"), Control.positioned("~-5", "~0.3", "~-5"), Control.when("block", "~", "~", "~", "water")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@e[type=armor_stand,tag=shark_init,limit=1,sort=nearest]", "~", "~", "~", "facing", "entity", "@s"), Control.at("@e[type=armor_stand,tag=shark_init,limit=1,sort=nearest]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.as("@e[type=armor_stand,tag=shark_init,limit=1,sort=nearest]"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@e[type=armor_stand,tag=shark_init]", "remove", "shark_init"));
        return 1;
    }
    // impossible_to_survive:features/shark/zzz/0
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.clear(x0, "@s", "cod", "1"), Control.when("entity", "@s[nbt={SelectedItem:{id:\"minecraft:cod\"}}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.clear(x0, "@s", "salmon", "1"), Control.when("entity", "@s[nbt={SelectedItem:{id:\"minecraft:salmon\"}}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.clear(x0, "@s", "tropical_fish", "1"), Control.when("entity", "@s[nbt={SelectedItem:{id:\"minecraft:tropical_fish\"}}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.clear(x0, "@s", "pufferfish", "1"), Control.when("entity", "@s[nbt={SelectedItem:{id:\"minecraft:pufferfish\"}}]")));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.horse.eat", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.dolphin.eat", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:salmon\"}", "~", "~0.15", "~", "0.2", "0.2", "0.2", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "happy_villager", "~", "~1", "~", "0.4", "0.4", "0.4", "0.1", "5", "force"));
        return 1;
    }
    // impossible_to_survive:features/shark/zzz/1
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.clear(x0, "@s", "cod", "1"), Control.when("entity", "@s[nbt={Inventory:[{Slot:-106b,id:\"minecraft:cod\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.clear(x0, "@s", "salmon", "1"), Control.when("entity", "@s[nbt={Inventory:[{Slot:-106b,id:\"minecraft:salmon\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.clear(x0, "@s", "tropical_fish", "1"), Control.when("entity", "@s[nbt={Inventory:[{Slot:-106b,id:\"minecraft:tropical_fish\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.clear(x0, "@s", "pufferfish", "1"), Control.when("entity", "@s[nbt={Inventory:[{Slot:-106b,id:\"minecraft:pufferfish\"}]}]")));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.horse.eat", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.dolphin.eat", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:salmon\"}", "~", "~0.15", "~", "0.2", "0.2", "0.2", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "happy_villager", "~", "~1", "~", "0.4", "0.4", "0.4", "0.1", "5", "force"));
        return 1;
    }
    // impossible_to_survive:features/shark/zzz/2
    private static int f3(Frame c) {

        return 1;
    }
    // impossible_to_survive:features/shark/zzz/3
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.phantom.bite", "master", "@a", "~", "~", "~", "1.0", "0.6"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "4", "minecraft:mob_attack", "by", "@n[type=armor_stand,tag=shark]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:mob_attack", "by", "@n[type=armor_stand,tag=shark]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "12", "minecraft:mob_attack", "by", "@n[type=armor_stand,tag=shark]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/shears/damage
    private static int f5(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/shears"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{CustomName:'\"Shears\"',Tags:[\"mcm.death_message_marker\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:mob_attack", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:mob_attack", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "15", "minecraft:mob_attack", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.death_message_marker]"));
        return 1;
    }
    // impossible_to_survive:features/shears/player_loop
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/shears/zzz/0"), Control.when("predicate", "impossible_to_survive:holding_shears")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "shears_sprint", "0"));
        return 1;
    }
    // impossible_to_survive:features/shears/zzz/0
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/shears/damage"), Control.when("score", "@s", "shears_sprint", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:features/smoker/interact
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/smoker/place_block_marker"), Control.anchored("eyes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.smoker_interact", "0"));
        return 1;
    }
    // impossible_to_survive:features/smoker/loop_1t
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/smoker/zzz/0"), Control.when("entity", "@a[distance=..20]")));
        return 1;
    }
    // impossible_to_survive:features/smoker/place_block_marker
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^0.1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^0.5", "^", "^0.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^0.3"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^-0.5", "^", "^0.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^0.5"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^0.5", "^0.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^0.7"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^-0.5", "^0.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^0.9"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^0.5", "^", "^1.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^1.1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^-0.5", "^", "^1.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^1.3"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^0.5", "^1.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^1.5"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^-0.5", "^1.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^1.7"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^0.5", "^", "^1.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^1.9"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^-0.5", "^", "^2.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^2.1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^0.5", "^2.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^2.3"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^-0.5", "^2.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^2.5"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^0.5", "^", "^2.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^2.7"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^-0.5", "^", "^2.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^2.9"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^0.5", "^3.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^3.1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^-0.5", "^3.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^3.3"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^3.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^0.5", "^", "^3.5"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^3.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^-0.5", "^", "^3.7"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^3.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^4.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^4.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^4.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^4.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^4.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^5.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^5.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Smoker\"',Tags:[smoker_marker]}"), Control.positioned("^", "^", "^5.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:smoker"), Control.unless("entity", "@e[type=marker,tag=smoker_marker,distance=..0.1]")));
        return 1;
    }
    // impossible_to_survive:features/smoker/placed
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/smoker/place_block_marker"), Control.anchored("eyes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.smoker_placed", "0"));
        return 1;
    }
    // impossible_to_survive:features/smoker/trail_loop
    private static int f12(Frame c) {
        Logic.step(() -> Native.particle(c, "dust{color:[0.0,0.0,0.0],scale:1.1}", "^", "^", "^", "0", "0", "0", "0.1", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/smoker/zzz/5"), Control.when("score", "@s", "mcm.lifetime", "matches", "40..")));
        return 1;
    }
    // impossible_to_survive:features/smoker/zzz/0
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "block", "~", "~", "~", "BurnTime"), Control.store("result", "score", "@s", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/smoker/zzz/1"), Control.when("score", "@s", "mcm.temp", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.unless("block", "~", "~", "~", "minecraft:smoker")));
        return 1;
    }
    // impossible_to_survive:features/smoker/zzz/1
    private static int f14(Frame c) {
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "3", "2", "3", "0.01", "2"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "3.5", "2", "3.5", "0.01", "2"));
        Logic.step(() -> Native.particle(c, "dust{color:[0.0,0.0,0.0],scale:1.5}", "^", "^", "^", "3", "2", "3", "0.1", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.misc", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/smoker/zzz/2"), Control.when("score", "@s", "mcm.misc", "matches", "10..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/smoker/zzz/4"), Control.as("@a[distance=..5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s"), Control.unless("entity", "@s[nbt={Inventory:[{id:\"minecraft:carved_pumpkin\",Slot:103b}]}]")));
        return 1;
    }
    // impossible_to_survive:features/smoker/zzz/2
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/smoker"), Control.as("@a[distance=..15]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.misc", "0"));
        Logic.step(() -> Native.summon(c, "bat", "~", "~-0.5", "~", "{Silent:1,Invulnerable:1,Tags:[\"smoker_trail\",\"mcm.init\"],active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/smoker/zzz/3"), Control.positioned("~", "~-0.5", "~"), Control.as("@e[type=bat,tag=smoker_trail,tag=mcm.init]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/smoker/zzz/3
    private static int f16(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~1", "~"));
        return 1;
    }
    // impossible_to_survive:features/smoker/zzz/4
    private static int f17(Frame c) {
        Logic.step(() -> Native.effect(c, "give", "@s", "wither", "2", "4", "true"));
        Logic.step(() -> Native.effect(c, "give", "@s", "minecraft:blindness", "2", "1", "true"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "1", "minecraft:mob_attack", "by", "@n[type=marker,tag=smoker_marker]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "2", "minecraft:mob_attack", "by", "@n[type=marker,tag=smoker_marker]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:mob_attack", "by", "@n[type=marker,tag=smoker_marker]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/smoker/zzz/5
    private static int f18(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "-100", "~"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/storm/start
    private static int f19(Frame c) {
        Logic.step(() -> Native.weather(c, "thunder", "99999"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "stormTimer", "3"));
        return 1;
    }
    // impossible_to_survive:features/storm/stop
    private static int f20(Frame c) {
        Logic.step(() -> Native.weather(c, "clear"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "stormTimer", "0"));
        return 1;
    }
    // impossible_to_survive:features/sugarcane/loop
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "sc_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "sc_timer", "0"), Control.when("score", "@s", "sc_timer", "matches", "61")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sugarcane/zzz/0"), Control.when("score", "@s", "sc_timer", "matches", "10..30")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sugarcane/zzz/1"), Control.when("score", "@s", "sc_timer", "matches", "40..60")));
        return 1;
    }
    // impossible_to_survive:features/sugarcane/sc_loop
    private static int f22(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "sc_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "sc_timer", "matches", "26")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.45", "~"), Control.when("score", "@s", "sc_timer", "matches", "1..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.45", "~"), Control.when("score", "@s", "sc_timer", "matches", "20..25")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sugarcane/zzz/2"), Control.when("entity", "@s[tag=sc_stung]"), Control.when("score", "@s", "sc_timer", "matches", "1..25")));
        return 1;
    }
    // impossible_to_survive:features/sugarcane/summon_sc
    private static int f23(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[sc_spread]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sugarcane/zzz/4"), Control.as("@e[type=marker,tag=sc_spread]"), Control.at("@s")));
        return 1;
    }
}
