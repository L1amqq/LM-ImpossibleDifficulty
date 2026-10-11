package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled253 {
    public static void register() {
        Logic.register("impossible_to_survive:zzz/19", Compiled253::f0);
        Logic.register("impossible_to_survive:zzz/2", Compiled253::f1);
        Logic.register("impossible_to_survive:zzz/20", Compiled253::f2);
        Logic.register("impossible_to_survive:zzz/21", Compiled253::f3);
        Logic.register("impossible_to_survive:zzz/22", Compiled253::f4);
        Logic.register("impossible_to_survive:zzz/23", Compiled253::f5);
        Logic.register("impossible_to_survive:zzz/24", Compiled253::f6);
        Logic.register("impossible_to_survive:zzz/25", Compiled253::f7);
        Logic.register("impossible_to_survive:zzz/26", Compiled253::f8);
        Logic.register("impossible_to_survive:zzz/27", Compiled253::f9);
        Logic.register("impossible_to_survive:zzz/28", Compiled253::f10);
        Logic.register("impossible_to_survive:zzz/29", Compiled253::f11);
        Logic.register("impossible_to_survive:zzz/3", Compiled253::f12);
        Logic.register("impossible_to_survive:zzz/30", Compiled253::f13);
        Logic.register("impossible_to_survive:zzz/31", Compiled253::f14);
        Logic.register("impossible_to_survive:zzz/32", Compiled253::f15);
        Logic.register("impossible_to_survive:zzz/33", Compiled253::f16);
        Logic.register("impossible_to_survive:zzz/34", Compiled253::f17);
        Logic.register("impossible_to_survive:zzz/35", Compiled253::f18);
        Logic.register("impossible_to_survive:zzz/36", Compiled253::f19);
        Logic.register("impossible_to_survive:zzz/37", Compiled253::f20);
        Logic.register("impossible_to_survive:zzz/4", Compiled253::f21);
        Logic.register("impossible_to_survive:zzz/5", Compiled253::f22);
        Logic.register("impossible_to_survive:zzz/6", Compiled253::f23);
    }
    // impossible_to_survive:zzz/19
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/impact_point_loop"), Control.when("entity", "@s[tag=mcm.tail_slam_shockwave.impact_marker]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/shockwave_travel_loop"), Control.when("entity", "@s[tag=mcm.tail_slam_shockwave.travel_marker]")));
        return 1;
    }
    // impossible_to_survive:zzz/2
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "welcome_message", "1"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.experience_orb.pickup", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:welcome_message"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:settings_message"));
        return 1;
    }
    // impossible_to_survive:zzz/20
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/crystal_tail/place"), Control.when("entity", "@s[tag=mcm.sp_crystal_tail]")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:zzz/21
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/shockwave/crystal_spike_loop"), Control.when("entity", "@s[tag=mcm.tail_slam_shockwave.crystal_spike]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/obsidian/obsidian_loop"), Control.when("entity", "@s[tag=shrinking_obsidian_block]")));
        return 1;
    }
    // impossible_to_survive:zzz/22
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/timer_display_loop"), Control.when("entity", "@s[tag=coal_display]")));
        return 1;
    }
    // impossible_to_survive:zzz/23
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/timer"), Control.when("entity", "@s[tag=coalExplosion]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/gold_block/item_loop"), Control.when("entity", "@s[tag=gold_mined_item]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("entity", "@s[nbt={Item:{components:{\"minecraft:custom_data\":{ZombieKillPoint:1b}}}}]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:zzz/24
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/center"), Control.when("entity", "@s[tag=tree_center]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:zzz/25
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/26"), Control.unless("entity", "@s[tag=mcm.its.dragon.hitbox]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/loop"), Control.when("entity", "@s[tag=mcm.its.dragon.hitbox]")));
        return 1;
    }
    // impossible_to_survive:zzz/26
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/pig/pig_timer"), Control.when("entity", "@s[scores={pigTimer=1..}]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s[scores={pigTimer=..-1}]", "pigTimer", "1"));
        return 1;
    }
    // impossible_to_survive:zzz/27
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/villager/zombie_loop"), Control.when("entity", "@s[tag=villager_zombie]")));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{Fire:-100s}"));
        return 1;
    }
    // impossible_to_survive:zzz/28
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/smoker/trail_loop"), Control.when("entity", "@s[tag=smoker_trail]")));
        return 1;
    }
    // impossible_to_survive:zzz/29
    private static int f11(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "cactus_remove"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "cactus_timer", "100"));
        return 1;
    }
    // impossible_to_survive:zzz/3
    private static int f12(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/tick/1t"));
        return 1;
    }
    // impossible_to_survive:zzz/30
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "cactus_top"), Control.unless("block", "~", "~1", "~", "#impossible_to_survive:cactus")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "cactus_init"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "barrier"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "cactus_timer", "1"));
        return 1;
    }
    // impossible_to_survive:zzz/31
    private static int f14(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/tick/1s"));
        return 1;
    }
    // impossible_to_survive:zzz/32
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/turn_super"), Control.when("entity", "@s[type=blaze,tag=!super_blaze]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/zombie/convert"), Control.when("entity", "@s[type=zombie,tag=!is_mutant_zombie]"), Control.at("@s"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..40]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/33"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/fishing/proj_loop_2s"), Control.when("entity", "@s[type=trident,tag=fishing_trident]")));
        return 1;
    }
    // impossible_to_survive:zzz/33
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/origin_marker_loop_2s"), Control.when("entity", "@s[tag=nether_portal_marker_origin]")));
        return 1;
    }
    // impossible_to_survive:zzz/34
    private static int f17(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "survivor"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "remove", "survivor"), Control.when("predicate", "impossible_to_survive:scores_initialized")));
        return 1;
    }
    // impossible_to_survive:zzz/35
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "#global", "stormTimer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/storm/stop"), Control.when("score", "#global", "stormTimer", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/36"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:zzz/36
    private static int f19(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/storm"));
        Logic.step(() -> Native.summon(c, "lightning_bolt", "~1", "~", "~1"));
        return 1;
    }
    // impossible_to_survive:zzz/37
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/enchanting_table/block_loop_5s"), Control.when("entity", "@s[tag=enchanting_table_marker]")));
        return 1;
    }
    // impossible_to_survive:zzz/4
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/5"), Control.when("entity", "@s[type=armor_stand]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/8"), Control.when("entity", "@s[type=item_display]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/18"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/21"), Control.when("entity", "@s[type=block_display]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/22"), Control.when("entity", "@s[type=text_display]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/23"), Control.when("entity", "@s[type=item]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/24"), Control.when("entity", "@s[type=area_effect_cloud]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/cow_timer"), Control.when("entity", "@s[type=cow,scores={cowTimer=1..}]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/skeleton_arrow_init"), Control.when("entity", "@s[type=arrow,tag=!skeleton_shot,tag=!skelly_down,nbt={pickup:0b}]"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..30]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/chicken/chicken_timer"), Control.when("entity", "@s[type=chicken,scores={chickenTimer=1..}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/25"), Control.when("entity", "@s[type=pig]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/eye/loop"), Control.when("entity", "@s[type=eye_of_ender,tag=!custom_eye]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/sheep/sheep_explode"), Control.when("entity", "@s[type=sheep]"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..6]"), Control.when("entity", "@s[nbt={Sheared:0b}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/27"), Control.when("entity", "@s[type=zombie]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/villager/loop"), Control.when("entity", "@s[type=villager]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/wither_skeleton/loop"), Control.when("entity", "@s[type=wither_skeleton]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/28"), Control.when("entity", "@s[type=bat]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/loop"), Control.when("entity", "@s[type=slime]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/loop"), Control.when("entity", "@s[type=shulker]")));
        return 1;
    }
    // impossible_to_survive:zzz/5
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/6"), Control.when("entity", "@s[tag=cactus,tag=!cactus_init]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/7"), Control.when("entity", "@s[tag=cactus_init]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/cow/proj_timer"), Control.when("entity", "@s[tag=cow_proj]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/piece"), Control.when("entity", "@s[tag=tree_piece]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/chicken/projectile_timer"), Control.when("entity", "@s[tag=chicken_head]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/eye/dragon_loop"), Control.when("entity", "@s[tag=dragon_center]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sugarcane/sc_loop"), Control.when("entity", "@s[tag=sugarcane_as]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/sheep/sheep_projectile"), Control.when("entity", "@s[tag=wool_proj]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/shark/shark_loop"), Control.when("entity", "@s[tag=shark]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/spawn"), Control.when("entity", "@s[tag=sp_baby_golem]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/blaze_as_loop"), Control.when("entity", "@s[tag=super_blaze_as]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/skeleton/arrow_as_loop"), Control.when("entity", "@s[tag=giant_arrow_as]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/soul_projectile_loop"), Control.when("entity", "@s[tag=soul_projectile]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/enderpearl/armor_stand_loop"), Control.when("entity", "@s[tag=ender_pearl_marker]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/proj_loop"), Control.when("entity", "@s[tag=slime_ball_projectile]")));
        return 1;
    }
    // impossible_to_survive:zzz/6
    private static int f23(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/cactus/loop"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/cactus/remove"), Control.when("entity", "@s[scores={cactus_timer=11}]"), Control.at("@s"), Control.unless("entity", "@a[distance=..10]")));
        return 1;
    }
}
