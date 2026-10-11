package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled210 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/6", Compiled210::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/7", Compiled210::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/8", Compiled210::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/9", Compiled210::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/jumppad_loop", Compiled210::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/jumppad_vfx_and_sfx", Compiled210::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/lightning_hit_end_crystal", Compiled210::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/remove_jumppads", Compiled210::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/set_beam_target", Compiled210::f8, "x", "y", "z");
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/shoot_lightning_forward", Compiled210::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/spawn_jumppads", Compiled210::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/tail_lightning", Compiled210::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/0", Compiled210::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/1", Compiled210::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/10", Compiled210::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/11", Compiled210::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/12", Compiled210::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/13", Compiled210::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/14", Compiled210::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/15", Compiled210::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/16", Compiled210::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/17", Compiled210::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/18", Compiled210::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/19", Compiled210::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/6
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.forcefield_damage_cooldown", "10"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield_hit"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "flash", "~", "~1", "~", "0.0", "0.0", "0.0", "0.1", "1", "force"), Control.when("score", "#global", "disabled_flashbang", "matches", "1")));
        Logic.step(() -> Native.particle(c, "electric_spark", "~", "~1", "~", "0.4", "0.8", "0.4", "0.1", "15", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~1", "~", "0.4", "0.8", "0.4", "0.3", "5", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~1", "~", "0.2", "0.6", "0.2", "0.5", "5", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/7"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/8"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/9"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/7
    private static int f1(Frame c) {
        Logic.step(() -> Native.damage(c, "@s", "8", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/8
    private static int f2(Frame c) {
        Logic.step(() -> Native.damage(c, "@s", "12", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/9
    private static int f3(Frame c) {
        Logic.step(() -> Native.damage(c, "@s", "15", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/jumppad_loop
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.lifetime", "matches", "600..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/12"), Control.when("score", "@s", "mcm.lifetime", "matches", "20..555"), Control.when("score", "@s", "mcm.animation", "matches", "15..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/13"), Control.when("score", "@s", "mcm.lifetime", "matches", "..580"), Control.when("entity", "@s[tag=mcm.its.jumppad.size_1]"), Control.as("@a[distance=..1.5]"), Control.unless("score", "@s", "mcm.launch.timer", "matches", "1.."), Control.unless("score", "@s", "mcm.its.dragon.jumppad_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/14"), Control.when("score", "@s", "mcm.lifetime", "matches", "..580"), Control.when("entity", "@s[tag=mcm.its.jumppad.size_2]"), Control.as("@a[distance=..1.5]"), Control.unless("score", "@s", "mcm.launch.timer", "matches", "1.."), Control.unless("score", "@s", "mcm.its.dragon.jumppad_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/15"), Control.when("score", "@s", "mcm.lifetime", "matches", "..580"), Control.when("entity", "@s[tag=mcm.its.jumppad.size_3]"), Control.as("@a[distance=..1.5]"), Control.unless("score", "@s", "mcm.launch.timer", "matches", "1.."), Control.unless("score", "@s", "mcm.its.dragon.jumppad_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/16"), Control.when("score", "@s", "mcm.lifetime", "matches", "..580"), Control.when("entity", "@s[tag=mcm.its.jumppad.size_4]"), Control.as("@a[distance=..1.5]"), Control.unless("score", "@s", "mcm.launch.timer", "matches", "1.."), Control.unless("score", "@s", "mcm.its.dragon.jumppad_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/17"), Control.when("score", "@s", "mcm.lifetime", "matches", "..560")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/18"), Control.when("score", "@s", "mcm.lifetime", "matches", "580")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/20"), Control.as("@e[type=item_display,distance=..1,tag=mcm.jumppad.component]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/jumppad_vfx_and_sfx
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_j/summon"), Control.positioned("~", "~", "~")));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_l\",\"mcm.vfx\",\"mcm.vfx.impact_k_to_p\",\"mcm.vfx.no_scaling\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.707f,0f,0f,0.707f],translation:[0f,0.0f,0f],scale:[3.5f,1f,3.5f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":355}}}"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.illusioner.cast_spell", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "jumppad", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        Logic.step(() -> Native.particle(c, "witch", "~", "~0.3", "~", "0.8", "0.3", "0.8", "0.1", "70", "force"));
        Logic.step(() -> Native.particle(c, "cloud", "~", "~0.3", "~", "0.8", "0.3", "0.8", "0.1", "15", "force"));
        Logic.step(() -> Native.particle(c, "cloud", "~", "~0.2", "~", "0.8", "0.3", "0.8", "0.2", "15", "force"));
        Logic.step(() -> Native.particle(c, "cloud", "~", "~0.1", "~", "0.4", "0.2", "0.4", "0.3", "10", "force"));
        Logic.step(() -> Native.particle(c, "dust{color:[0.9,0.2,0.9],scale:0.9}", "~", "~0.2", "~", "0.5", "0.2", "0.5", "0.1", "10", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/lightning_hit_end_crystal
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/3"), Control.as("@n[tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/4"), Control.as("@a[distance=..300]"), Control.at("@s"), Control.unless("score", "@s", "mcm.its.dragon.hint.end_crystal_recharge", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/remove_jumppads
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/11"), Control.as("@e[type=marker,tag=mcm.its.jumppad]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/set_beam_target
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{beam_target:[I;$(x),$(y),$(z)]}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/shoot_lightning_forward
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@e[type=marker,tag=mcm.its.dragon_environment.end_crystal.destroyed,limit=1,sort=nearest]", "add", "mcm.its.dragon.lightning_potential_target"), Control.positioned("^", "^", "^70")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@p[predicate=mcm:gm/vulnerable,distance=..300]", "add", "mcm.its.dragon.lightning_potential_target"), Control.positioned("^", "^", "^50"), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon.lightning_potential_target]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/0"), Control.as("@e[tag=mcm.its.dragon.lightning_potential_target,sort=random,limit=1,distance=1..]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@e[tag=mcm.its.dragon.lightning_potential_target]")));
        Logic.step(() -> Native.tag(c, "@e[tag=mcm.its.dragon.lightning_potential_target]", "remove", "mcm.its.dragon.lightning_potential_target"));
        Logic.step(() -> Native.particle(c, "flash", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.lightning_vfx\",\"mcm.lightning_vfx.main_zap\",\"mcm.lightning_vfx.projectile\",\"mcm.lightning_vfx.projectile.egg_attracted\",\"mcm.init\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/2"), Control.as("@e[type=marker,tag=mcm.lightning_vfx.projectile,tag=mcm.init,limit=1,sort=nearest]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/spawn_jumppads
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.jumppad_cd", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/5"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "0..1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/6"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/7"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/8"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/9"), Control.as("@e[type=marker,tag=mcm.its.jumppad,tag=mcm.init]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/tail_lightning
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "8..10"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.max_zap_changes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.lightning_vfx.max_secondary_zap_changes", "4"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "-90..90"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..360"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/random_lightning/zap"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#temp"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/0
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/1"), Control.unless("score", "@s", "mcm.lightning_vfx.target_id", "matches", "1..")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "mcm.lightning_vfx.target_id", "=", "@s", "mcm.lightning_vfx.target_id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.target"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.lightning_vfx.this_target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/1
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#last_id", "mcm.lightning_vfx.target_id", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.lightning_vfx.target_id", "=", "#last_id", "mcm.lightning_vfx.target_id"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/10
    private static int f14(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Rotation:[153f],teleport_duration:3,Tags:[\"mcm.jumppad.component\",\"mcm.jumppad.circle\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,0f],scale:[3f,0f,3f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":251}}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.jumppad.component\",\"mcm.jumppad.decal\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0.707f,0f,0f,0.707f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[0.0f,0.0f,0.0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":21}}}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/11
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.lifetime", "579"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/12
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.animation", "0"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.jumppad.component\",\"mcm.jumppad.ring\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.5f,0f],scale:[3.05f,1.0f,3.05f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":451}}}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/13
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/launch/apply_jumppad_1"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.jumppad_cd", "40"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/jumppad_vfx_and_sfx"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/14
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/launch/apply_jumppad_2"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.jumppad_cd", "40"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/jumppad_vfx_and_sfx"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/15
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/launch/apply_jumppad_3"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.jumppad_cd", "40"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/jumppad_vfx_and_sfx"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/16
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/launch/apply_jumppad_4"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.jumppad_cd", "40"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/jumppad_vfx_and_sfx"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/17
    private static int f21(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~63", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~20", "~"), Control.when("predicate", "mcm:random/50_percent"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "^", "^", "^0.1", "^0", "^1000000", "^", "0.00000025", "0", "force"), Control.when("predicate", "mcm:random/25_percent"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "^", "^", "^0.4", "^0", "^1000000", "^", "0.00000015", "0", "force"), Control.when("predicate", "mcm:random/50_percent"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "^", "^", "^1.2", "^0", "^1000000", "^", "0.0000001", "0", "force"), Control.when("predicate", "mcm:random/50_percent"), Control.at("@s")));
        Logic.step(() -> Native.particle(c, "portal", "~", "~0.1", "~", "0.9", "0", "0.9", "0.5", "4", "force"));
        Logic.step(() -> Native.particle(c, "portal", "~", "~0.1", "~", "0.7", "0", "0.7", "0.9", "3", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/18
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/19"), Control.as("@e[type=item_display,distance=..1,tag=mcm.jumppad.component]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/heal/zzz/19
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.animation", "99"), Control.when("entity", "@s[tag=mcm.jumppad.circle]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.animation", "99"), Control.when("entity", "@s[tag=mcm.jumppad.decal]")));
        return 1;
    }
}
