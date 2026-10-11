package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled250 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/wither_skeleton/zzz/4", Compiled250::f0);
        Logic.register("impossible_to_survive:mobs/wither_skeleton/zzz/5", Compiled250::f1);
        Logic.register("impossible_to_survive:mobs/zombie/convert", Compiled250::f2);
        Logic.register("impossible_to_survive:mobs/zombie/kill_test", Compiled250::f3);
        Logic.register("impossible_to_survive:mobs/zombie/summon_babies", Compiled250::f4);
        Logic.register("impossible_to_survive:mobs/zombie/zzz/0", Compiled250::f5);
        Logic.register("impossible_to_survive:mobs/zombie/zzz/1", Compiled250::f6);
        Logic.register("impossible_to_survive:mobs/zombie/zzz/2", Compiled250::f7);
        Logic.register("impossible_to_survive:player/particle/blood", Compiled250::f8);
        Logic.register("impossible_to_survive:player/respawn", Compiled250::f9);
        Logic.register("impossible_to_survive:player/tick/10s", Compiled250::f10);
        Logic.register("impossible_to_survive:player/tick/1s", Compiled250::f11);
        Logic.register("impossible_to_survive:player/tick/1t", Compiled250::f12);
        Logic.register("impossible_to_survive:player/tick/2s", Compiled250::f13);
        Logic.register("impossible_to_survive:player/tick/2t", Compiled250::f14);
        Logic.register("impossible_to_survive:player/tick/3t", Compiled250::f15);
        Logic.register("impossible_to_survive:player/tick/5t", Compiled250::f16);
        Logic.register("impossible_to_survive:player/tick/zzz/0", Compiled250::f17);
        Logic.register("impossible_to_survive:player/tick/zzz/1", Compiled250::f18);
        Logic.register("impossible_to_survive:player/tick/zzz/10", Compiled250::f19);
        Logic.register("impossible_to_survive:player/tick/zzz/11", Compiled250::f20);
        Logic.register("impossible_to_survive:player/tick/zzz/13", Compiled250::f22);
        Logic.register("impossible_to_survive:player/tick/zzz/14", Compiled250::f23);
    }
    // impossible_to_survive:mobs/wither_skeleton/zzz/4
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "wither_skeleton_invis_timer", "60"));
        Logic.step(() -> Native.effect(c, "give", "@s", "invisibility", "3", "9", "true"));
        Logic.step(() -> Native.effect(c, "give", "@s", "speed", "3", "2", "true"));
        return 1;
    }
    // impossible_to_survive:mobs/wither_skeleton/zzz/5
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "wither_skeleton_invis_timer", "100"));
        Logic.step(() -> Native.effect(c, "give", "@s", "invisibility", "5", "9", "true"));
        Logic.step(() -> Native.effect(c, "give", "@s", "speed", "5", "4", "true"));
        return 1;
    }
    // impossible_to_survive:mobs/zombie/convert
    private static int f2(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "is_mutant_zombie"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{DeathLootTable:\"impossible_to_survive:zombie_kill\"}"), Control.when("entity", "@s[nbt={IsBaby:0b}]")));
        return 1;
    }
    // impossible_to_survive:mobs/zombie/kill_test
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/zombie/summon_babies"), Control.as("@e[type=item,nbt={Item:{components:{\"minecraft:custom_data\":{ZombieKillPoint:1b}}}},limit=1,sort=nearest,distance=..30]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "killedZombie", "0"));
        return 1;
    }
    // impossible_to_survive:mobs/zombie/summon_babies
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/zombie"));
        Logic.step(() -> Native.kill(c, "@s"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/zombie/zzz/0"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/zombie/zzz/1"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/zombie/zzz/2"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.particle(c, "minecraft:campfire_cosy_smoke", "~", "~1", "~", "0", "0", "0", "0.2", "20", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "0", "0.5", "0", "0.1", "20", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:green_shulker_box\"}", "~", "~1", "~", "0.5", "1", "0.5", "0.1", "40", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.zombie.infect", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.fire.extinguish", "master", "@a", "~", "~", "~", "0.5", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.zombie.destroy_egg", "master", "@a", "~", "~", "~", "0.5", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.zombie.death", "master", "@a", "~", "~", "~", "0.5", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/zombie/zzz/0
    private static int f5(Frame c) {
        Logic.step(() -> Native.summon(c, "zombie", "~0.1", "~", "~", "{ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],IsBaby:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":73}}],Attributes:[{Name:generic.movement_speed,Base:0.4}]}"));
        Logic.step(() -> Native.summon(c, "zombie", "~-0.1", "~", "~", "{ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],IsBaby:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":73}}],Attributes:[{Name:generic.movement_speed,Base:0.35}]}"));
        Logic.step(() -> Native.summon(c, "zombie", "~", "~", "~", "{ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],IsBaby:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":73}}],Attributes:[{Name:generic.movement_speed,Base:0.3}]}"));
        return 1;
    }
    // impossible_to_survive:mobs/zombie/zzz/1
    private static int f6(Frame c) {
        Logic.step(() -> Native.summon(c, "zombie", "~", "~", "~0.1", "{ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],IsBaby:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":73}}],Attributes:[{Name:generic.movement_speed,Base:0.45}]}"));
        Logic.step(() -> Native.summon(c, "zombie", "~0.1", "~", "~", "{ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],IsBaby:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":73}}],Attributes:[{Name:generic.movement_speed,Base:0.4}]}"));
        Logic.step(() -> Native.summon(c, "zombie", "~-0.1", "~", "~", "{ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],IsBaby:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":73}}],Attributes:[{Name:generic.movement_speed,Base:0.35}]}"));
        Logic.step(() -> Native.summon(c, "zombie", "~", "~", "~", "{ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],IsBaby:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":73}}],Attributes:[{Name:generic.movement_speed,Base:0.3}]}"));
        return 1;
    }
    // impossible_to_survive:mobs/zombie/zzz/2
    private static int f7(Frame c) {
        Logic.step(() -> Native.summon(c, "zombie", "~", "~", "~0.1", "{ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],IsBaby:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":73}}],Attributes:[{Name:generic.movement_speed,Base:0.45}]}"));
        Logic.step(() -> Native.summon(c, "zombie", "~", "~", "~-0.1", "{ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],IsBaby:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":73}}],Attributes:[{Name:generic.movement_speed,Base:0.5}]}"));
        Logic.step(() -> Native.summon(c, "zombie", "~0.1", "~", "~", "{ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],IsBaby:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":73}}],Attributes:[{Name:generic.movement_speed,Base:0.4}]}"));
        Logic.step(() -> Native.summon(c, "zombie", "~-0.1", "~", "~", "{ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],IsBaby:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":73}}],Attributes:[{Name:generic.movement_speed,Base:0.35}]}"));
        Logic.step(() -> Native.summon(c, "zombie", "~", "~", "~", "{ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],IsBaby:1,ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":73}}],Attributes:[{Name:generic.movement_speed,Base:0.3}]}"));
        return 1;
    }
    // impossible_to_survive:player/particle/blood
    private static int f8(Frame c) {
        Logic.step(() -> Native.particle(c, "dust{color:[0.6,0.0,0.0],scale:0.9}", "~", "~0.8", "~", "0.2", "0.6", "0.2", "0.1", "3", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:redstone_block\"}", "~", "~0.8", "~", "0.2", "0.6", "0.2", "0.1", "3", "force"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:redstone\"}", "~", "~0.8", "~", "0.2", "0.6", "0.2", "0.1", "3", "force"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:red_dye\"}", "~", "~0.8", "~", "0.2", "0.6", "0.2", "0.1", "3", "force"));
        return 1;
    }
    // impossible_to_survive:player/respawn
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "blood_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "blood_sec", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "blood_10_sec", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "sc_timer", "0"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.lightning_vfx.target"));
        return 1;
    }
    // impossible_to_survive:player/tick/10s
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/31"), Control.when("entity", "@s[tag=mcm.lightning_vfx.target]")));
        Logic.step(() -> Native.clear(c, "@s", "brick[custom_data~{ZombieKillPoint:1b}]"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "vampire_done_timer", "1"), Control.when("score", "@s", "vampire_done_timer", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "remove", "survivor"), Control.when("predicate", "impossible_to_survive:scores_initialized")));
        return 1;
    }
    // impossible_to_survive:player/tick/1s
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/15"), Control.when("entity", "@s[tag=survivor,predicate=mcm:gm/vulnerable]")));
        Logic.step(() -> Native.scoreboard(c, "players", "enable", "@s", "difficulty"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/17"), Control.when("entity", "@s[scores={difficulty=1..}]")));
        Logic.step(() -> Native.scoreboard(c, "players", "enable", "@s", "dragon_difficulty"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/21"), Control.when("entity", "@s[scores={dragon_difficulty=1..}]")));
        Logic.step(() -> Native.scoreboard(c, "players", "enable", "@s", "toggle_armor_slowdown"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/25"), Control.when("entity", "@s[scores={toggle_armor_slowdown=1..}]")));
        Logic.step(() -> Native.scoreboard(c, "players", "enable", "@s", "toggle_endermen"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/26"), Control.when("entity", "@s[scores={toggle_endermen=1..}]")));
        Logic.step(() -> Native.scoreboard(c, "players", "enable", "@s", "toggle_chest"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/27"), Control.when("entity", "@s[scores={toggle_chest=1..}]")));
        Logic.step(() -> Native.scoreboard(c, "players", "enable", "@s", "toggle_flashbang"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/28"), Control.when("entity", "@s[scores={toggle_flashbang=1..}]")));
        Logic.step(() -> Native.scoreboard(c, "players", "enable", "@s", "count_features"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/30"), Control.when("entity", "@s[scores={count_features=1..}]")));
        return 1;
    }
    // impossible_to_survive:player/tick/1t
    private static int f12(Frame c) {
        Logic.step(() -> Native.tag(c, "@s[scores={timeSinceDeath=2}]", "remove", "cactus_death"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/respawn"), Control.when("entity", "@s[scores={timeSinceDeath=1}]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/0"), Control.when("entity", "@s[tag=survivor,predicate=mcm:gm/vulnerable]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "wfoas_click_cd", "1"), Control.when("score", "@s", "wfoas_click_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/11"), Control.when("score", "@s", "mcm.use_wfoas", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/fishing/caught_fish"), Control.when("score", "@s", "mcm.fished", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/13"), Control.when("entity", "@s[tag=deep_in_water]"), Control.unless("block", "~", "~-0.1", "~", "#mcm:passable"), Control.when("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/launch/player_loop"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/screen_shake/player_loop"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.brewing_stand_interact", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "enderpearl_use", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "chest_opened", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "deathCount", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "rc", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "fungus", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "talk", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "walk", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "sneak", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "sprint", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "crossbow", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "placed_furnace", "0"));
        return 1;
    }
    // impossible_to_survive:player/tick/2s
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/storm/start"), Control.when("predicate", "impossible_to_survive:in_boat"), Control.unless("score", "#global", "stormTimer", "matches", "2..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/convert_spider"), Control.as("@e[type=spider,distance=..20]"), Control.unless("entity", "@e[type=item_display,tag=aj.mutant_spider.root,distance=..40]"), Control.as("@n[type=spider,distance=..20]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:player/tick/2t
    private static int f14(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/sculk_roots/player_loop_2t"));
        return 1;
    }
    // impossible_to_survive:player/tick/3t
    private static int f15(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/cactus/check_3t"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/lava_wave/spawn_check_3t"));
        return 1;
    }
    // impossible_to_survive:player/tick/5t
    private static int f16(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/sculk_hand/player_loop_5t"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/player_loop_5t"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/electrocute"), Control.when("entity", "@s[scores={timeSinceDeath=1..}]"), Control.when("block", "~", "~", "~", "redstone_wire"), Control.unless("block", "~", "~", "~", "redstone_wire[power=0]")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s[scores={ender_look_cd=1..}]", "ender_look_cd", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/enderman/look_check"), Control.when("entity", "@e[type=enderman,distance=..25]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "glowstone_laser_cd", "1"), Control.when("score", "@s", "glowstone_laser_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/creeper/dupe"), Control.at("@s"), Control.when("entity", "@e[type=creeper,distance=..5.0,tag=!has_duped]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.when("predicate", "impossible_to_survive:random/50_percent"), Control.when("entity", "@e[type=marker,tag=furnace_marker,tag=furnace_lit,distance=..4]"), Control.unless("block", "~", "~-1", "~", "#impossible_to_survive:passable"), Control.when("block", "~", "~", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/crafting_table/crafting_table_check"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/player_loop_5t"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/chest_mob/player_loop_5t"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/14"), Control.when("block", "~", "~-0.5", "~", "#minecraft:beds"), Control.unless("score", "@s", "sleeping", "matches", "1.."), Control.unless("score", "@s", "bedLaunchTimer", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "sleeping", "0"), Control.when("score", "@s", "awake", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/0
    private static int f17(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/shears/player_loop"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/player_loop_1t"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/vampire/player_loop"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "player_dmg_cd", "1"), Control.when("score", "@s", "player_dmg_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/1"), Control.when("entity", "@s[scores={minedCoal=1..}]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/2"), Control.when("entity", "@s[scores={minedCoal2=1..}]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/3"), Control.when("entity", "@s[scores={minedDiamond=1..}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/4"), Control.when("entity", "@s[scores={minedDiamond2=1..}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/5"), Control.when("score", "@s", "mcm.mined_obsidian", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/brewing_stand/placed"), Control.when("score", "@s", "mcm.brewing_stand_placed", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/brewing_stand/interact"), Control.when("score", "@s", "mcm.brewing_stand_interact", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/6"), Control.when("entity", "@s[scores={minedIron=1..}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/7"), Control.when("entity", "@s[scores={minedIron2=1..}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/8"), Control.when("entity", "@s[scores={killIronGolem=1..}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/farmed_crop"), Control.when("score", "@s", "farmed_wheat", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/farmed_crop"), Control.when("score", "@s", "farmed_carrot", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/farmed_crop"), Control.when("score", "@s", "farmed_potato", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/farmed_crop"), Control.when("score", "@s", "farmed_pumpkin", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/farmed_crop"), Control.when("score", "@s", "farmed_beetroot", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/9"), Control.when("entity", "@s[scores={sugarcane_mined=1..}]"), Control.unless("score", "@s", "sc_timer", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sugarcane/loop"), Control.as("@s[scores={sc_timer=1..}]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "sugarcane_mined", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/acacia/mined_tree"), Control.when("predicate", "impossible_to_survive:mined_tree_acacia"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/birch/mined_tree"), Control.when("predicate", "impossible_to_survive:mined_tree_birch"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/cherry/mined_tree"), Control.when("predicate", "impossible_to_survive:mined_tree_cherry"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/crimson/mined_tree"), Control.when("predicate", "impossible_to_survive:mined_tree_crimson"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/dark_oak/mined_tree"), Control.when("predicate", "impossible_to_survive:mined_tree_dark_oak"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/jungle/mined_tree"), Control.when("predicate", "impossible_to_survive:mined_tree_jungle"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/mangrove/mined_tree"), Control.when("predicate", "impossible_to_survive:mined_tree_mangrove"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/oak/mined_tree"), Control.when("predicate", "impossible_to_survive:mined_tree_oak"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/spruce/mined_tree"), Control.when("predicate", "impossible_to_survive:mined_tree_spruce"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/gold_block/mined"), Control.when("score", "@s", "mined_gold_block", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:player/tick/zzz/10"), Control.when("block", "~", "~-0.5", "~", "soul_sand")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/enderman/look_lock"), Control.when("entity", "@s[scores={ender_look_cd=1..}]")), Control.unless("score", "#global", "disabled_endermen", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/zombie/kill_test"), Control.as("@s[scores={killedZombie=1..}]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/bed/launch_loop"), Control.when("entity", "@s[scores={bedLaunchTimer=1..}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/place_furnace_marker"), Control.when("entity", "@s[scores={placed_furnace=1..}]"), Control.anchored("eyes")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/enchanting_table/place_block_marker"), Control.when("entity", "@s[scores={mcm.enchantment_t_placed=1..}]"), Control.anchored("eyes")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s[scores={lava_wave_hit_cd=1..}]", "lava_wave_hit_cd", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s[scores={sawblade_damage_cooldown=1..}]", "sawblade_damage_cooldown", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "giant_arrow_hit_cd", "1"), Control.when("score", "@s", "giant_arrow_hit_cd", "matches", "1..")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/player_loop"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/chest_mob/player_loop"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/enderpearl/throw"), Control.when("score", "@s", "enderpearl_use", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/glowstone/scan_for_glowstone_above"), Control.when("predicate", "mcm:in_the_nether")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/anvil/player_loop_1t"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/smoker/placed"), Control.when("score", "@s", "mcm.smoker_placed", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/smoker/interact"), Control.when("score", "@s", "mcm.smoker_interact", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/1
    private static int f18(Frame c) {
        Logic.step(() -> Native.tag(c, "@e[type=item,nbt={Item:{id:\"minecraft:coal\"},Age:0s},distance=..10]", "add", "coalExplosion"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "minedCoal", "0"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/10
    private static int f19(Frame c) {
        Logic.step(() -> Native.effect(c, "give", "@s", "wither", "1", "3", "true"));
        Logic.step(() -> Native.effect(c, "give", "@s", "slowness", "1", "9", "true"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/soul_sand"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/11
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:dragon_book/click"), Control.when("predicate", "impossible_to_survive:holding_dragon_guide")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:dragon_staff/click"), Control.when("predicate", "impossible_to_survive:holding_dragon_staff")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:totem_of_nutrition/click"), Control.when("predicate", "impossible_to_survive:holding_totem_of_nutrition")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:totem_of_preservation/click"), Control.when("predicate", "impossible_to_survive:holding_totem_of_preservation")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.use_wfoas", "0"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/13
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("block", "~", "~-1", "~1", "#impossible_to_survive:water")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("block", "~", "~-1", "~-1", "#impossible_to_survive:water")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("block", "~1", "~-1", "~", "#impossible_to_survive:water")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("block", "~2", "~-1", "~", "#impossible_to_survive:water")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "deep_in_water"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/land_shark/attempt_summon"));
        return 1;
    }
    // impossible_to_survive:player/tick/zzz/14
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "bedLaunchTimer", "1"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/bed"));
        return 1;
    }
}
