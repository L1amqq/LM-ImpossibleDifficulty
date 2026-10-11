package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled251 {
    public static void register() {
        Logic.register("impossible_to_survive:player/tick/zzz/15", Compiled251::f0);
        Logic.register("impossible_to_survive:player/tick/zzz/16", Compiled251::f1);
        Logic.register("impossible_to_survive:player/tick/zzz/17", Compiled251::f2);
        Logic.register("impossible_to_survive:player/tick/zzz/18", Compiled251::f3);
        Logic.register("impossible_to_survive:player/tick/zzz/19", Compiled251::f4);
        Logic.register("impossible_to_survive:player/tick/zzz/2", Compiled251::f5);
        Logic.register("impossible_to_survive:player/tick/zzz/20", Compiled251::f6);
        Logic.register("impossible_to_survive:player/tick/zzz/21", Compiled251::f7);
        Logic.register("impossible_to_survive:player/tick/zzz/22", Compiled251::f8);
        Logic.register("impossible_to_survive:player/tick/zzz/23", Compiled251::f9);
        Logic.register("impossible_to_survive:player/tick/zzz/24", Compiled251::f10);
        Logic.register("impossible_to_survive:player/tick/zzz/25", Compiled251::f11);
        Logic.register("impossible_to_survive:player/tick/zzz/26", Compiled251::f12);
        Logic.register("impossible_to_survive:player/tick/zzz/27", Compiled251::f13);
        Logic.register("impossible_to_survive:player/tick/zzz/28", Compiled251::f14);
        Logic.register("impossible_to_survive:player/tick/zzz/29", Compiled251::f15);
        Logic.register("impossible_to_survive:player/tick/zzz/3", Compiled251::f16);
        Logic.register("impossible_to_survive:player/tick/zzz/30", Compiled251::f17);
        Logic.register("impossible_to_survive:player/tick/zzz/31", Compiled251::f18);
        Logic.register("impossible_to_survive:player/tick/zzz/32", Compiled251::f19);
        Logic.register("impossible_to_survive:player/tick/zzz/4", Compiled251::f20);
        Logic.register("impossible_to_survive:player/tick/zzz/5", Compiled251::f21);
        Logic.register("impossible_to_survive:player/tick/zzz/6", Compiled251::f22);
        Logic.register("impossible_to_survive:player/tick/zzz/7", Compiled251::f23);
    }
    // impossible_to_survive:player/tick/zzz/15
    private static int f0(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/player_loop_1s"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/vampire/player_loop_1s"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/shark/shark_spawn"), Control.when("block", "~", "~", "~", "water")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "deep_in_water"), Control.when("block", "~", "~1", "~", "water")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "poison_cooldown", "1"), Control.when("score", "@s", "poison_cooldown", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "chickenTimer", "1"), Control.as("@e[type=chicken,distance=..7]"), Control.unless("score", "@s", "chickenTimer", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "cowTimer", "1"), Control.as("@e[type=cow,distance=..9]"), Control.unless("score", "@s", "cowTimer", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "pigTimer", "1"), Control.as("@e[type=pig,distance=..5]"), Control.unless("score", "@s", "pigTimer", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/16"), Control.unless("score", "#global", "disable_armor_slowing", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/16
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "armorAmount", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/armor/test_head"), Control.when("entity", "@s[nbt={Inventory:[{Slot:103b,count:1}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/armor/test_chest"), Control.when("entity", "@s[nbt={Inventory:[{Slot:102b,count:1}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/armor/test_legs"), Control.when("entity", "@s[nbt={Inventory:[{Slot:101b,count:1}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/armor/test_boots"), Control.when("entity", "@s[nbt={Inventory:[{Slot:100b,count:1}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/armor/apply_slowness"), Control.when("entity", "@s[scores={armorAmount=1..}]")));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/17
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tellraw(x0, "@s", "{\"text\":\"Please enter a value between 1 and 3!\",\"bold\":true,\"color\":\"dark_red\"}"), Control.unless("score", "@s", "difficulty", "matches", "1..3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/18"), Control.when("score", "@s", "difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/19"), Control.when("score", "@s", "difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/20"), Control.when("score", "@s", "difficulty", "matches", "3")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s", "difficulty"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/18
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.its.overall_difficulty", "1"));
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",{\"text\":\"Difficulty set to: \",\"bold\":true,\"color\":\"blue\"},{\"text\":\"Easy\",\"color\":\"green\"}]"));
        Logic.step(() -> Native.difficulty(c, "easy"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/19
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.its.overall_difficulty", "2"));
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",{\"text\":\"Difficulty set to: \",\"bold\":true,\"color\":\"blue\"},{\"text\":\"Medium\",\"color\":\"gold\"}]"));
        Logic.step(() -> Native.difficulty(c, "normal"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/2
    private static int f5(Frame c) {
        Logic.step(() -> Native.tag(c, "@e[type=item,nbt={Item:{id:\"minecraft:coal\"},Age:0s},distance=..10]", "add", "coalExplosion"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedCoal2", "0"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/20
    private static int f6(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.its.overall_difficulty", "3"));
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",{\"text\":\"Difficulty set to: \",\"bold\":true,\"color\":\"blue\"},{\"text\":\"Hard\",\"color\":\"red\"}]"));
        Logic.step(() -> Native.difficulty(c, "hard"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/21
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tellraw(x0, "@s", "{\"text\":\"Please enter a value between 1 and 3!\",\"bold\":true,\"color\":\"dark_red\"}"), Control.unless("score", "@s", "dragon_difficulty", "matches", "1..3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/22"), Control.when("score", "@s", "dragon_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/23"), Control.when("score", "@s", "dragon_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/24"), Control.when("score", "@s", "dragon_difficulty", "matches", "3")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s", "dragon_difficulty"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/22
    private static int f8(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/settings/set_easy"));
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",{\"text\":\"Dragon Difficulty set to: \",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"Easy\",\"color\":\"green\"}]"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/23
    private static int f9(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/settings/set_medium"));
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",{\"text\":\"Dragon Difficulty set to: \",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"Medium\",\"color\":\"gold\"}]"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/24
    private static int f10(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/settings/set_hard"));
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",{\"text\":\"Dragon Difficulty set to: \",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"Hard\",\"color\":\"red\"}]"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/25
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#global", "disable_armor_slowing", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#global", "disable_armor_slowing", "0"), Control.when("score", "#global", "disable_armor_slowing", "matches", "2..")));
        Logic.step(() -> Control.run(c, x0 -> Native.tellraw(x0, "@s", "[\"\",{\"text\":\"Armor Slowdown: \",\"bold\":true,\"color\":\"blue\"},{\"text\":\"Enabled\",\"color\":\"green\"}]"), Control.when("score", "#global", "disable_armor_slowing", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.tellraw(x0, "@s", "[\"\",{\"text\":\"Armor Slowdown: \",\"bold\":true,\"color\":\"blue\"},{\"text\":\"Disabled\",\"color\":\"red\"}]"), Control.when("score", "#global", "disable_armor_slowing", "matches", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s", "toggle_armor_slowdown"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/26
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#global", "disabled_endermen", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#global", "disabled_endermen", "0"), Control.when("score", "#global", "disabled_endermen", "matches", "2..")));
        Logic.step(() -> Control.run(c, x0 -> Native.tellraw(x0, "@s", "[\"\",{\"text\":\"Endermen: \",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"Enabled\",\"color\":\"green\"}]"), Control.when("score", "#global", "disabled_endermen", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.tellraw(x0, "@s", "[\"\",{\"text\":\"Endermen: \",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\"Disabled\",\"color\":\"red\"}]"), Control.when("score", "#global", "disabled_endermen", "matches", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s", "toggle_endermen"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/27
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#global", "disabled_chest", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#global", "disabled_chest", "0"), Control.when("score", "#global", "disabled_chest", "matches", "2..")));
        Logic.step(() -> Control.run(c, x0 -> Native.tellraw(x0, "@s", "[\"\",{\"text\":\"Chest: \",\"bold\":true,\"color\":\"#CF9E4A\"},{\"text\":\"Enabled\",\"color\":\"green\"}]"), Control.when("score", "#global", "disabled_chest", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.tellraw(x0, "@s", "[\"\",{\"text\":\"Chest: \",\"bold\":true,\"color\":\"#CF9E4A\"},{\"text\":\"Disabled\",\"color\":\"red\"}]"), Control.when("score", "#global", "disabled_chest", "matches", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s", "toggle_chest"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/28
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#global", "disabled_flashbang", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#global", "disabled_flashbang", "0"), Control.when("score", "#global", "disabled_flashbang", "matches", "2..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/29"), Control.when("score", "#global", "disabled_flashbang", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tellraw(x0, "@s", "[\"\",{\"text\":\"Flashbang: \",\"bold\":true,\"color\":\"white\"},{\"text\":\"Disabled\",\"color\":\"red\"}]"), Control.when("score", "#global", "disabled_flashbang", "matches", "0")));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s", "toggle_flashbang"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/29
    private static int f15(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[\"\",{\"text\":\"Flashbang: \",\"bold\":true,\"color\":\"white\"},{\"text\":\"Enabled\",\"color\":\"green\"}]"));
        Logic.step(() -> Native.tellraw(c, "@a", "[{\"text\":\"\\u0026\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\" WARNING:\",\"font\":\"minecraft:default\",\"color\":\"aqua\",\"bold\":true},{\"text\":\" This datapack now contains flashing lights that may potentially trigger seizures for people with photosensitive epilepsy. Discretion is advised\",\"font\":\"minecraft:default\",\"color\":\"aqua\"}]"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/3
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:features/diamond/explosion"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:diamond\"},Age:0s},distance=..10]"), Control.at("@s")), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedDiamond", "0"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/30
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s", "count_features"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:count_features"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/31
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.temp", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "#temp", "mcm.temp", "1"), Control.at("@s"), Control.as("@e[type=marker,tag=mcm.lightning_vfx.projectile]"), Control.when("score", "@s", "mcm.lightning_vfx.target_id", "=", "#this", "mcm.lightning_vfx.target_id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/32"), Control.when("score", "#temp", "mcm.temp", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/32
    private static int f19(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.lightning_vfx.target"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/4
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:features/diamond/explosion"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:diamond\"},Age:0s},distance=..10]"), Control.at("@s")), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedDiamond2", "0"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/5
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.mined_obsidian", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/obsidian/mined"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/6
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/spawn"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:raw_iron\"},Age:0s},distance=..10,limit=1,sort=nearest]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedIron", "0"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/7
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/spawn"), Control.as("@e[type=item,nbt={Item:{id:\"minecraft:raw_iron\"},Age:0s},distance=..10,limit=1,sort=nearest]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedIron2", "0"));
        return 1;
    }
}
