package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled177 {
    public static void register() {
        Logic.register("impossible_to_survive:features/anvil/zzz/9", Compiled177::f0);
        Logic.register("impossible_to_survive:features/armor/apply_slowness", Compiled177::f1);
        Logic.register("impossible_to_survive:features/armor/test_boots", Compiled177::f2);
        Logic.register("impossible_to_survive:features/armor/test_chest", Compiled177::f3);
        Logic.register("impossible_to_survive:features/armor/test_head", Compiled177::f4);
        Logic.register("impossible_to_survive:features/armor/test_legs", Compiled177::f5);
        Logic.register("impossible_to_survive:features/armor/zzz/0", Compiled177::f6);
        Logic.register("impossible_to_survive:features/armor/zzz/1", Compiled177::f7);
        Logic.register("impossible_to_survive:features/armor/zzz/2", Compiled177::f8);
        Logic.register("impossible_to_survive:features/bed/launch_loop", Compiled177::f9);
        Logic.register("impossible_to_survive:features/bed/zzz/0", Compiled177::f10);
        Logic.register("impossible_to_survive:features/bed/zzz/1", Compiled177::f11);
        Logic.register("impossible_to_survive:features/brewing_stand/interact", Compiled177::f12);
        Logic.register("impossible_to_survive:features/brewing_stand/loop_1t", Compiled177::f13);
        Logic.register("impossible_to_survive:features/brewing_stand/place_block_marker", Compiled177::f14);
        Logic.register("impossible_to_survive:features/brewing_stand/placed", Compiled177::f15);
        Logic.register("impossible_to_survive:features/brewing_stand/zzz/0", Compiled177::f16);
        Logic.register("impossible_to_survive:features/brewing_stand/zzz/1", Compiled177::f17);
        Logic.register("impossible_to_survive:features/brewing_stand/zzz/2", Compiled177::f18);
        Logic.register("impossible_to_survive:features/brewing_stand/zzz/3", Compiled177::f19);
        Logic.register("impossible_to_survive:features/brewing_stand/zzz/4", Compiled177::f20);
        Logic.register("impossible_to_survive:features/brewing_stand/zzz/5", Compiled177::f21);
        Logic.register("impossible_to_survive:features/brewing_stand/zzz/6", Compiled177::f22);
        Logic.register("impossible_to_survive:features/cactus/check_3t", Compiled177::f23);
    }
    // impossible_to_survive:features/anvil/zzz/9
    private static int f0(Frame c) {
        Logic.step(() -> Native.kill(c, "@e[type=item_display,tag=anvil_spike,distance=..1]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "anvil_timer", "0"));
        return 1;
    }
    // impossible_to_survive:features/armor/apply_slowness
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/armor/zzz/0"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/armor/zzz/1"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/armor/zzz/2"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/armor/test_boots
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "1"), Control.when("entity", "@s[nbt={Inventory:[{Slot:100b,id:\"minecraft:leather_boots\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "1"), Control.when("entity", "@s[nbt={Inventory:[{Slot:100b,id:\"minecraft:golden_boots\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "1"), Control.when("entity", "@s[nbt={Inventory:[{Slot:100b,id:\"minecraft:chainmail_boots\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "2"), Control.when("entity", "@s[nbt={Inventory:[{Slot:100b,id:\"minecraft:iron_boots\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "3"), Control.when("entity", "@s[nbt={Inventory:[{Slot:100b,id:\"minecraft:diamond_boots\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "3"), Control.when("entity", "@s[nbt={Inventory:[{Slot:100b,id:\"minecraft:netherite_boots\"}]}]")));
        return 1;
    }
    // impossible_to_survive:features/armor/test_chest
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "3"), Control.when("entity", "@s[nbt={Inventory:[{Slot:102b,id:\"minecraft:leather_chestplate\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "5"), Control.when("entity", "@s[nbt={Inventory:[{Slot:102b,id:\"minecraft:golden_chestplate\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "5"), Control.when("entity", "@s[nbt={Inventory:[{Slot:102b,id:\"minecraft:chainmail_chestplate\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "6"), Control.when("entity", "@s[nbt={Inventory:[{Slot:102b,id:\"minecraft:iron_chestplate\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "8"), Control.when("entity", "@s[nbt={Inventory:[{Slot:102b,id:\"minecraft:diamond_chestplate\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "8"), Control.when("entity", "@s[nbt={Inventory:[{Slot:102b,id:\"minecraft:netherite_chestplate\"}]}]")));
        return 1;
    }
    // impossible_to_survive:features/armor/test_head
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "1"), Control.when("entity", "@s[nbt={Inventory:[{Slot:103b,id:\"minecraft:turtle_helmet\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "1"), Control.when("entity", "@s[nbt={Inventory:[{Slot:103b,id:\"minecraft:leather_helmet\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "2"), Control.when("entity", "@s[nbt={Inventory:[{Slot:103b,id:\"minecraft:golden_helmet\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "2"), Control.when("entity", "@s[nbt={Inventory:[{Slot:103b,id:\"minecraft:chainmail_helmet\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "2"), Control.when("entity", "@s[nbt={Inventory:[{Slot:103b,id:\"minecraft:iron_helmet\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "3"), Control.when("entity", "@s[nbt={Inventory:[{Slot:103b,id:\"minecraft:diamond_helmet\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "3"), Control.when("entity", "@s[nbt={Inventory:[{Slot:103b,id:\"minecraft:netherite_helmet\"}]}]")));
        return 1;
    }
    // impossible_to_survive:features/armor/test_legs
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "2"), Control.when("entity", "@s[nbt={Inventory:[{Slot:101b,id:\"minecraft:leather_leggings\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "3"), Control.when("entity", "@s[nbt={Inventory:[{Slot:101b,id:\"minecraft:golden_leggings\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "4"), Control.when("entity", "@s[nbt={Inventory:[{Slot:101b,id:\"minecraft:chainmail_leggings\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "5"), Control.when("entity", "@s[nbt={Inventory:[{Slot:101b,id:\"minecraft:iron_leggings\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "6"), Control.when("entity", "@s[nbt={Inventory:[{Slot:101b,id:\"minecraft:diamond_leggings\"}]}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "armorAmount", "6"), Control.when("entity", "@s[nbt={Inventory:[{Slot:101b,id:\"minecraft:netherite_leggings\"}]}]")));
        return 1;
    }
    // impossible_to_survive:features/armor/zzz/0
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/armor"), Control.when("entity", "@s[scores={armorAmount=8..}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@s", "slowness", "2", "0", "true"), Control.when("entity", "@s[scores={armorAmount=8..16}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@s", "slowness", "1", "1", "true"), Control.when("entity", "@s[scores={armorAmount=17..}]")));
        return 1;
    }
    // impossible_to_survive:features/armor/zzz/1
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/armor"), Control.when("entity", "@s[scores={armorAmount=6..}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@s", "slowness", "2", "0", "true"), Control.when("entity", "@s[scores={armorAmount=6..9}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@s", "slowness", "1", "1", "true"), Control.when("entity", "@s[scores={armorAmount=10..13}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@s", "slowness", "1", "2", "true"), Control.when("entity", "@s[scores={armorAmount=14..17}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@s", "slowness", "1", "3", "true"), Control.when("entity", "@s[scores={armorAmount=18..}]")));
        return 1;
    }
    // impossible_to_survive:features/armor/zzz/2
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:challenge/feature_encounter/armor"), Control.when("entity", "@s[scores={armorAmount=1..}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@s", "slowness", "2", "0", "true"), Control.when("entity", "@s[scores={armorAmount=1..2}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@s", "slowness", "1", "1", "true"), Control.when("entity", "@s[scores={armorAmount=2..5}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@s", "slowness", "1", "2", "true"), Control.when("entity", "@s[scores={armorAmount=6..10}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@s", "slowness", "1", "3", "true"), Control.when("entity", "@s[scores={armorAmount=11..15}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@s", "slowness", "1", "4", "true"), Control.when("entity", "@s[scores={armorAmount=16..19}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@s", "slowness", "1", "5", "true"), Control.when("entity", "@s[scores={armorAmount=20..}]")));
        return 1;
    }
    // impossible_to_survive:features/bed/launch_loop
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "bedLaunchTimer", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s[scores={bedLaunchTimer=40..}]", "bedLaunchTimer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/bed/zzz/0"), Control.when("entity", "@s[scores={bedLaunchTimer=1..39}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "cloud", "~", "~", "~", "0.2", "0.4", "0.2", "0.1", "1", "force"), Control.when("entity", "@s[scores={bedLaunchTimer=1..17}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "give", "@s", "minecraft:levitation", "1", "80", "true"), Control.when("entity", "@s[scores={bedLaunchTimer=1..5}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.effect(x0, "clear", "@s", "minecraft:levitation"), Control.when("entity", "@s[scores={bedLaunchTimer=6..15}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/bed/zzz/1"), Control.when("entity", "@s[scores={bedLaunchTimer=2}]")));
        return 1;
    }
    // impossible_to_survive:features/bed/zzz/0
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~-1", "~1", "~-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~-1", "~2", "~-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~-1", "~3", "~-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~-1", "~4", "~-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~-1", "~1", "~0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~-1", "~2", "~0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~-1", "~3", "~0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~-1", "~4", "~0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~-1", "~1", "~1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~-1", "~2", "~1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~-1", "~3", "~1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~-1", "~4", "~1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~0", "~1", "~-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~0", "~2", "~-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~0", "~3", "~-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~0", "~4", "~-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~0", "~1", "~0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~0", "~2", "~0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~0", "~3", "~0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~0", "~4", "~0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~0", "~1", "~1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~0", "~2", "~1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~0", "~3", "~1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~0", "~4", "~1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~1", "~1", "~-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~1", "~2", "~-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~1", "~3", "~-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~1", "~4", "~-1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~1", "~1", "~0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~1", "~2", "~0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~1", "~3", "~0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~1", "~4", "~0"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~1", "~1", "~1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~1", "~2", "~1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~1", "~3", "~1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "air", "destroy"), Control.positioned("~1", "~4", "~1"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:non_destructible")));
        return 1;
    }
    // impossible_to_survive:features/bed/zzz/1
    private static int f11(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.illusioner.cast_spell", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:item.bundle.drop_contents", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:features/brewing_stand/interact
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/brewing_stand/place_block_marker"), Control.anchored("eyes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.brewing_stand_interact", "0"));
        return 1;
    }
    // impossible_to_survive:features/brewing_stand/loop_1t
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/brewing_stand/zzz/0"), Control.when("entity", "@a[distance=..20]")));
        return 1;
    }
    // impossible_to_survive:features/brewing_stand/place_block_marker
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^0.1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^0.5", "^", "^0.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^0.3"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^-0.5", "^", "^0.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^0.5"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^0.5", "^0.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^0.7"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^-0.5", "^0.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^0.9"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^0.5", "^", "^1.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^1.1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^-0.5", "^", "^1.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^1.3"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^0.5", "^1.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^1.5"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^-0.5", "^1.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^1.7"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^0.5", "^", "^1.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^1.9"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^-0.5", "^", "^2.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^2.1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^0.5", "^2.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^2.3"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^-0.5", "^2.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^2.5"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^0.5", "^", "^2.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^2.7"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^-0.5", "^", "^2.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^2.9"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^0.5", "^3.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^3.1"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^-0.5", "^3.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^3.3"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^3.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^0.5", "^", "^3.5"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^3.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^-0.5", "^", "^3.7"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^3.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^4.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^4.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^4.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^4.6"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^4.8"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^5.0"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^5.2"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{CustomName:'\"Brewing Stand\"',Tags:[brewing_stand_marker]}"), Control.positioned("^", "^", "^5.4"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.when("block", "~", "~", "~", "minecraft:brewing_stand"), Control.unless("entity", "@e[type=marker,tag=brewing_stand_marker,distance=..0.1]")));
        return 1;
    }
    // impossible_to_survive:features/brewing_stand/placed
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/brewing_stand/place_block_marker"), Control.anchored("eyes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.brewing_stand_placed", "0"));
        return 1;
    }
    // impossible_to_survive:features/brewing_stand/zzz/0
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "block", "~", "~", "~", "Items[{Slot:4b}].count"), Control.store("result", "score", "@s", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/brewing_stand/zzz/1"), Control.when("score", "@s", "mcm.temp", "matches", "1..19")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/brewing_stand/zzz/4"), Control.when("score", "@s", "mcm.temp", "matches", "26..")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.unless("block", "~", "~", "~", "minecraft:brewing_stand")));
        return 1;
    }
    // impossible_to_survive:features/brewing_stand/zzz/1
    private static int f17(Frame c) {
        Logic.step(() -> Native.title(c, "@a[distance=..10]", "actionbar", "[{\"text\":\"\\u0026\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"font\":\"minecraft:default\",\"text\":\" Brewing stand is underheating \",\"color\":\"#B8B8FF\"},{\"text\":\"\\u0026\",\"font\":\"minecraft:icons\",\"color\":\"white\"}]"));
        Logic.step(() -> Native.particle(c, "snowflake", "~", "~0.25", "~", "0.0", "0.0", "0.0", "0.3", "1", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:ice\"}", "~", "~1", "~", "3", "2.5", "3", "0.2", "5", "force"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:blue_ice\"}", "~", "~1", "~", "3", "2.5", "3", "0.2", "5", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/brewing_stand/zzz/2"), Control.as("@a[distance=..5.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/brewing_stand/zzz/2
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "misc", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s[scores={misc=10..}]", "misc", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/brewing_stand/zzz/3"), Control.when("score", "@s", "misc", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:features/brewing_stand/zzz/3
    private static int f19(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/brewing_stand"));
        Logic.step(() -> Native.effect(c, "give", "@s", "slowness", "3", "4", "true"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "snowflake", "~", "~1", "~", "0.3", "0.8", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "1", "minecraft:freeze"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:freeze"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:freeze"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/brewing_stand/zzz/4
    private static int f20(Frame c) {
        Logic.step(() -> Native.title(c, "@a[distance=..10]", "actionbar", "[{\"text\":\"\\u0026\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"font\":\"minecraft:default\",\"text\":\" Brewing stand is overheating \",\"color\":\"red\"},{\"text\":\"\\u0026\",\"font\":\"minecraft:icons\",\"color\":\"white\"}]"));
        Logic.step(() -> Native.particle(c, "flame", "~", "~0.25", "~", "0.0", "0.0", "0.0", "0.3", "3", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~1", "~", "3", "2.5", "3", "0.2", "5", "force"));
        Logic.step(() -> Native.particle(c, "lava", "~", "~1", "~", "3", "2.5", "3", "0.2", "1", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/brewing_stand/zzz/5"), Control.as("@a[distance=..5.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/brewing_stand/zzz/5
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "misc", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s[scores={misc=10..}]", "misc", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/brewing_stand/zzz/6"), Control.when("score", "@s", "misc", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:features/brewing_stand/zzz/6
    private static int f22(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/brewing_stand"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "1", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.when("block", "~", "~", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:features/cactus/check_3t
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~", "~-2", "~"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~1", "~", "~1"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~1", "~", "~-1"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~-1", "~", "~1"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~-1", "~", "~-1"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~3", "~", "~"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~3", "~", "~1"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~3", "~", "~-1"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~", "~", "~3"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~-1", "~", "~3"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~1", "~", "~3"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~-3", "~", "~"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~-3", "~", "~1"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~-3", "~", "~-1"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~", "~", "~-3"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~-1", "~", "~-3"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("~1", "~", "~-3"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.rotated("~", "0"), Control.positioned("~2", "~", "~2"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.rotated("~", "0"), Control.positioned("~-2", "~", "~2"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.rotated("~", "0"), Control.positioned("~2", "~", "~-2"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~0.5", "~0.5", "~0.5", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.rotated("~", "0"), Control.positioned("~-2", "~", "~-2"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~", "~", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("^", "^", "^4"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.unless("entity", "@e[type=armor_stand,tag=cactus,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~", "~", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("^", "^1", "^4"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.unless("entity", "@e[type=armor_stand,tag=cactus,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~", "~", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("^", "^-1", "^4"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.unless("entity", "@e[type=armor_stand,tag=cactus,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~", "~", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("^2", "^", "^4"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.unless("entity", "@e[type=armor_stand,tag=cactus,distance=..0.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "armor_stand", "~", "~", "~", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"), Control.positioned("^-2", "^", "^4"), Control.when("block", "~", "~", "~", "cactus"), Control.align("xyz"), Control.positioned("~0.5", "~0.5", "~0.5"), Control.unless("entity", "@e[type=armor_stand,tag=cactus,distance=..0.1]")));
        return 1;
    }
}
