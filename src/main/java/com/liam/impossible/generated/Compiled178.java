package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled178 {
    public static void register() {
        Logic.register("impossible_to_survive:features/cactus/destroy_block", Compiled178::f0);
        Logic.register("impossible_to_survive:features/cactus/loop", Compiled178::f1);
        Logic.register("impossible_to_survive:features/cactus/remove", Compiled178::f2);
        Logic.register("impossible_to_survive:features/cactus/replace", Compiled178::f3);
        Logic.register("impossible_to_survive:features/cactus/zzz/0", Compiled178::f4);
        Logic.register("impossible_to_survive:features/cactus/zzz/1", Compiled178::f5);
        Logic.register("impossible_to_survive:features/cactus/zzz/2", Compiled178::f6);
        Logic.register("impossible_to_survive:features/cactus/zzz/3", Compiled178::f7);
        Logic.register("impossible_to_survive:features/cactus/zzz/4", Compiled178::f8);
        Logic.register("impossible_to_survive:features/cactus/zzz/5", Compiled178::f9);
        Logic.register("impossible_to_survive:features/chest_mob/chest_check", Compiled178::f10);
        Logic.register("impossible_to_survive:features/chest_mob/chest_marker_loop", Compiled178::f11);
        Logic.register("impossible_to_survive:features/chest_mob/player_loop", Compiled178::f12);
        Logic.register("impossible_to_survive:features/chest_mob/player_loop_5t", Compiled178::f13);
        Logic.register("impossible_to_survive:features/chest_mob/raycast", Compiled178::f14);
        Logic.register("impossible_to_survive:features/chest_mob/shoot_player", Compiled178::f15);
        Logic.register("impossible_to_survive:features/chest_mob/summon_aj_chest", Compiled178::f16);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/0", Compiled178::f17);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/1", Compiled178::f18);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/10", Compiled178::f19);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/11", Compiled178::f20);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/12", Compiled178::f21);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/13", Compiled178::f22);
        Logic.register("impossible_to_survive:features/chest_mob/zzz/14", Compiled178::f23);
    }
    // impossible_to_survive:features/cactus/destroy_block
    private static int f0(Frame c) {
        Logic.step(() -> Native.summon(c, "item", "~", "~", "~", "{Item:{id:\"minecraft:cactus\",Count:1b}}"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.wool.break", "master", "@a"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:cactus\"}", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "10"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/cactus/loop
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s[scores={cactus_timer=1..10}]", "cactus_timer", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s[scores={cactus_timer=100..}]", "cactus_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/cactus/zzz/0"), Control.as("@s[tag=cactus_top,scores={cactus_timer=2}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/cactus/zzz/1"), Control.when("entity", "@s[tag=!cactus_top]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/cactus/zzz/2"), Control.when("entity", "@s[tag=cactus_top]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:features/cactus/zzz/3"), Control.as("@a[distance=..4,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")), Control.as("@s[scores={cactus_timer=5..}]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/cactus/zzz/5"), Control.as("@s[scores={cactus_timer=109}]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "destroy_cactus"), Control.when("entity", "@a[distance=..10]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "remove", "destroy_cactus"), Control.at("@s"), Control.unless("block", "~", "~-1", "~", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "remove", "destroy_cactus"), Control.at("@s"), Control.positioned("~", "~-1", "~"), Control.when("entity", "@e[type=armor_stand,tag=cactus,distance=..0.5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/cactus/destroy_block"), Control.when("entity", "@s[tag=destroy_cactus]")));
        return 1;
    }
    // impossible_to_survive:features/cactus/remove
    private static int f2(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "cactus_remove"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/cactus/remove"), Control.positioned("~", "~1", "~"), Control.as("@e[type=armor_stand,tag=cactus,distance=..0.1,tag=!cactus_remove]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/cactus/remove"), Control.positioned("~", "~-1", "~"), Control.as("@e[type=armor_stand,tag=cactus,distance=..0.1,tag=!cactus_remove]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/cactus/replace
    private static int f3(Frame c) {
        Logic.step(() -> Native.summon(c, "armor_stand", "~", "~", "~", "{NoGravity:1,Tags:[\"cactus\",\"cactus_init\",\"replace_cactus\"],ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}],Marker:1,Invisible:1}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/cactus/replace"), Control.positioned("~", "~1", "~"), Control.unless("entity", "@e[type=armor_stand,tag=cactus,distance=..0.1]"), Control.when("block", "~", "~", "~", "cactus")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/cactus/replace"), Control.positioned("~", "~-1", "~"), Control.unless("entity", "@e[type=armor_stand,tag=cactus,distance=..0.1]"), Control.when("block", "~", "~", "~", "cactus")));
        return 1;
    }
    // impossible_to_survive:features/cactus/zzz/0
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":12}}]}"));
        Logic.step(() -> Native.playsound(c, "minecraft:cactus", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
    // impossible_to_survive:features/cactus/zzz/1
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":13}}]}"), Control.as("@s[scores={cactus_timer=3}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":14}}]}"), Control.as("@s[scores={cactus_timer=4}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":15}}]}"), Control.as("@s[scores={cactus_timer=5}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":15}}]}"), Control.as("@s[scores={cactus_timer=104}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":14}}]}"), Control.as("@s[scores={cactus_timer=105}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":13}}]}"), Control.as("@s[scores={cactus_timer=106}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":12}}]}"), Control.as("@s[scores={cactus_timer=107}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":11}}]}"), Control.as("@s[scores={cactus_timer=108}]")));
        return 1;
    }
    // impossible_to_survive:features/cactus/zzz/2
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":17}}]}"), Control.as("@s[scores={cactus_timer=2}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":18}}]}"), Control.as("@s[scores={cactus_timer=3}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":19}}]}"), Control.as("@s[scores={cactus_timer=4}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":20}}]}"), Control.as("@s[scores={cactus_timer=5}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":20}}]}"), Control.as("@s[scores={cactus_timer=104}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":19}}]}"), Control.as("@s[scores={cactus_timer=105}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":18}}]}"), Control.as("@s[scores={cactus_timer=106}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":17}}]}"), Control.as("@s[scores={cactus_timer=107}]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{ArmorItems:[{},{},{},{id:\"minecraft:iron_nugget\",count:1,components:{\"minecraft:custom_model_data\":16}}]}"), Control.as("@s[scores={cactus_timer=108}]")));
        return 1;
    }
    // impossible_to_survive:features/cactus/zzz/3
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/cactus/zzz/4"), Control.unless("score", "@s", "player_dmg_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:cactus"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:cactus"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "100", "minecraft:cactus"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/cactus/zzz/4
    private static int f8(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "player_dmg_cd", "10"));
        return 1;
    }
    // impossible_to_survive:features/cactus/zzz/5
    private static int f9(Frame c) {
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "cactus"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/chest_check
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/3"), Control.anchored("eyes")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/chest_marker_loop
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/19"), Control.when("score", "@s", "lifetime", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/20"), Control.when("score", "@s", "lifetime", "matches", "15..70")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:item.bundle.drop_contents", "master", "@a", "~", "~", "~", "1.0", "1.0"), Control.when("score", "@s", "lifetime", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "water_gun_reload", "master", "@a", "~", "~", "~", "1.0", "1.0"), Control.when("score", "@s", "lifetime", "matches", "21")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "water_gun_shot_1", "master", "@a", "~", "~", "~", "1.0", "0.95"), Control.when("score", "@s", "lifetime", "matches", "40")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "water_gun_shot_2", "master", "@a", "~", "~", "~", "1.0", "1.0"), Control.when("score", "@s", "lifetime", "matches", "48")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "water_gun_shot_3", "master", "@a", "~", "~", "~", "1.0", "1.1"), Control.when("score", "@s", "lifetime", "matches", "56")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/shoot_player"), Control.when("score", "@s", "lifetime", "matches", "44"), Control.as("@e[type=item_display,tag=aj.chest_mob.root,limit=1,sort=nearest,distance=..0.5]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/shoot_player"), Control.when("score", "@s", "lifetime", "matches", "52"), Control.as("@e[type=item_display,tag=aj.chest_mob.root,limit=1,sort=nearest,distance=..0.5]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/shoot_player"), Control.when("score", "@s", "lifetime", "matches", "60"), Control.as("@e[type=item_display,tag=aj.chest_mob.root,limit=1,sort=nearest,distance=..0.5]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:block.chest.close", "block", "@a", "~", "~", "~", "1.0", "1.0"), Control.when("score", "@s", "lifetime", "matches", "70")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/22"), Control.when("score", "@s", "lifetime", "matches", "79")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "lifetime", "matches", "80..")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/player_loop
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/0"), Control.unless("score", "#global", "disabled_chest", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/player_loop_5t
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/2"), Control.when("score", "@s", "chest_check_timer", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/raycast
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "raycast_iterations", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/26"), Control.positioned("~", "~-1.6", "~"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..0.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "splash", "~", "~", "~", "0", "0", "0", "0.01", "1", "force"), Control.when("predicate", "mcm:random/25_percent")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/28"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:passable_and_liquids")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/raycast"), Control.when("score", "@s", "raycast_iterations", "matches", "..60"), Control.positioned("^", "^", "^0.2")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/shoot_player
    private static int f15(Frame c) {
        Logic.step(() -> Native.tag(c, "@a", "remove", "chest_shoot_target"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..10,limit=1,sort=nearest]", "add", "chest_shoot_target"), Control.positioned("^", "^", "^3")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "raycast_iterations", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/raycast"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,tag=chest_shoot_target,limit=1,sort=nearest]"), Control.positioned("~", "~0.9", "~"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,tag=chest_shoot_target,limit=1,sort=nearest]", "eyes")));
        Logic.step(() -> Native.tag(c, "@a", "remove", "chest_shoot_target"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/summon_aj_chest
    private static int f16(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/chest"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/13"), Control.anchored("eyes")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/0
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "chest_check_timer", "40"), Control.when("score", "@s", "chest_opened", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/1"), Control.when("score", "@s", "chest_check_timer", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/1
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "chest_check_timer", "1"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/chest_mob/chest_check"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/10
    private static int f19(Frame c) {
        Logic.step(() -> Native.summon(c, "area_effect_cloud", "~", "~", "~", "{Invulnerable:1,Tags:[\"chest_looked_aec\",\"init\"],Duration:25}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/11"), Control.as("@e[type=area_effect_cloud,tag=chest_looked_aec,tag=init,limit=1,sort=nearest]")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/11
    private static int f20(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "init"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@p", "Rotation[0]", "1"), Control.store("result", "score", "@s", "chest_look_x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@p", "Rotation[1]", "1"), Control.store("result", "score", "@s", "chest_look_y")));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/12
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "chest_look_timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "chest_check_timer", "0"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/13
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^-0.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^0"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^0"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^0"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^0"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^0"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^0"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^-0.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^-0.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^-0.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^-0.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^0"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^0.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^0.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^0.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^0.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^0.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^0.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^0.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^0.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^0.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^0.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^0.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^1"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^1"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^1"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^1"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^1"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^1"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^0.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^0.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^0.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^0.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^1"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^1.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^1.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^1.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^1.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^1.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^1.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^1.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^1.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^1.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^1.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^1.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^2"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^2"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^2"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^2"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^2"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^2"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^1.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^1.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^1.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^1.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^2"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^2.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^2.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^2.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^2.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^2.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^2.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^2.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^2.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^2.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^2.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^2.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^3"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^3"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^3"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^3"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^3"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^3"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^2.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^2.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^2.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^2.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^3"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^3.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^3.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^3.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^3.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^3.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^3.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^3.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^3.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^3.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^3.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^3.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^4"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^4"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^4"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^4"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^4"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^4"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^3.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^3.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^3.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^3.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^4"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^4.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^4.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^4.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^4.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^4.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^4.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^4.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^4.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^4.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^4.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^4.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^4.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^4.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^4.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^4.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^5.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^5.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^5.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^5.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^5.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^5.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^5.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^5.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^5.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^5.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^5.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^6"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^6"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^6"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^6"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^6"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^6"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^5.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^5.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^5.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^5.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^6"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^6.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^6.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^6.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^6.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^6.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^6.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^6.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^6.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^6.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^6.25"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^", "^6.5"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^7"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^1.5", "^", "^7"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.5", "^", "^7"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.5", "^", "^7"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^0.5", "^7"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^", "^-0.5", "^7"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^0.75", "^6.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^-0.75", "^6.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^-0.75", "^0.75", "^6.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~0.5", "~", "~0.5", "{Tags:[chest_summon_marker]}"), Control.positioned("^0.75", "^-0.75", "^6.75"), Control.when("block", "~", "~", "~", "minecraft:chest[type=single]"), Control.align("xyz")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/14"), Control.as("@e[type=marker,tag=chest_summon_marker,limit=1,sort=nearest]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=chest_summon_marker]"));
        return 1;
    }
    // impossible_to_survive:features/chest_mob/zzz/14
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/15"), Control.when("block", "~", "~", "~", "minecraft:chest[facing=east]"), Control.rotated("-90", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/16"), Control.when("block", "~", "~", "~", "minecraft:chest[facing=west]"), Control.rotated("90", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/17"), Control.when("block", "~", "~", "~", "minecraft:chest[facing=south]"), Control.rotated("0", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/chest_mob/zzz/18"), Control.when("block", "~", "~", "~", "minecraft:chest[facing=north]"), Control.rotated("180", "0")));
        Logic.step(() -> Native.cloneBlocks(c, "~", "~", "~", "~", "~", "~", "~", "-64", "~"));
        return 1;
    }
}
