package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled237 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/333", Compiled237::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/334", Compiled237::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/335", Compiled237::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/336", Compiled237::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/337", Compiled237::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/338", Compiled237::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/339", Compiled237::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/34", Compiled237::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/340", Compiled237::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/341", Compiled237::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/342", Compiled237::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/343", Compiled237::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/344", Compiled237::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/345", Compiled237::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/346", Compiled237::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/347", Compiled237::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/348", Compiled237::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/349", Compiled237::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/35", Compiled237::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/350", Compiled237::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/351", Compiled237::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/352", Compiled237::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/353", Compiled237::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/354", Compiled237::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/333
    private static int f0(Frame c) {
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.inner,sort=random,limit=1,distance=25..]", "add", "mcm.its.dragon_environment.waypoint.active"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/334
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/335"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/336"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1..60")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/338"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1..70")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/339"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "5..60")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/340"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "61")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/341"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "63")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/342"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "61..62")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/343"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "63..66")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"), Control.at("@s"), Control.rotated("~", "0"), Control.when("block", "^", "^", "^2", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/344"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "61..90")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/345"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "100..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/335
    private static int f2(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.invulnerable"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/death"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~1", "~", "{Tags:[\"mcm.vfx.impact\",\"mcm.vfx.impact_o\",\"mcm.vfx.impact_k_to_p\",\"mcm.vfx\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,1f],scale:[30f,30f,30f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":411}}}"));
        Logic.step(() -> Native.particle(c, "explosion_emitter", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "witch", "~", "~", "~", "1", "1", "1", "0.5", "100", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~", "~", "1", "1", "1", "0.5", "20", "force"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/die/tween", "{to_frame:0,duration:15}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/336
    private static int f3(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "2", "1", "2", "0.1", "2", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/337"), Control.unless("score", "#death_land_sfx", "mcm.misc", "matches", "1"), Control.unless("block", "~", "~-6", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/337
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/death_land"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#death_land_sfx", "mcm.misc", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/338
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "100"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/339
    private static int f6(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~1.5"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.125", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1.."), Control.at("@s"), Control.when("block", "~", "~-0.125", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.25", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "5.."), Control.at("@s"), Control.when("block", "~", "~-0.25", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.5", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "10.."), Control.at("@s"), Control.when("block", "~", "~-0.5", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.5", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "15.."), Control.at("@s"), Control.when("block", "~", "~-0.5", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.5", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "20.."), Control.at("@s"), Control.when("block", "~", "~-0.5", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1.5", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "30.."), Control.at("@s"), Control.when("block", "~", "~-1.5", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-1.5", "~"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "40.."), Control.at("@s"), Control.when("block", "~", "~-1.5", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "61"), Control.at("@s"), Control.unless("block", "~", "~-0.15", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/34
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "20..130"), Control.store("result", "score", "@s", "mcm.its.dragon.attack_delay_timer")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.attack_delay_timer", "100"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.attack_delay_timer", "40"), Control.when("predicate", "mcm:random/10_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.attack_delay_timer", "45"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "3..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.attack_delay_timer", "90"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.attack_delay_timer", "20"), Control.when("predicate", "mcm:random/5_percent")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/340
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.flight_speed", "-1"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/eyes_closed/apply"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/variants/1_head/apply"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#death_land_sfx"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/341
    private static int f9(Frame c) {
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:end_stone\"}", "~", "~0.5", "~", "3", "1", "3", "0.1", "120", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:obsidian\"}", "~", "~0.5", "~", "3", "1", "3", "0.1", "20", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "1", "0.5", "1", "0.4", "10", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "3", "1", "3", "0.05", "30", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/342
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.4", "~"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/343
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.2", "~"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/344
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-15"), Control.at("@s"), Control.when("entity", "@s[x_rotation=16..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~15"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-16]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=20..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-20]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=5..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=1..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-1]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/345
    private static int f13(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.bossbar_invisible"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/346"), Control.as("@e[type=pig,tag=mcm.its.dragon.hitbox]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@e[tag=aj.impossible_dragon.locator]"));
        Logic.step(() -> Native.kill(c, "@e[tag=aj.impossible_dragon.data]"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/remove/this"));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "visible", "false"));
        Logic.step(() -> Native.forceload(c, "remove", "all"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.fire.extinguish", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.ravager.step", "master", "@a", "~", "~", "~", "0.8", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.amethyst_cluster.hit", "master", "@a", "~", "~", "~", "1", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.player.levelup", "master", "@a", "~", "~", "~", "1", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.end_portal.spawn", "master", "@a", "0", "60", "0", "0.3", "1.0"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "2", "1", "2", "0.05", "150", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "2", "1", "2", "0.1", "30", "force"));
        Logic.step(() -> Native.particle(c, "minecraft:sculk_soul", "~", "~0.5", "~", "1", "0.5", "1", "0.2", "20", "force"));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "visible", "false"));
        Logic.step(() -> Native.loot(c, "spawn", "~", "~", "~", "loot", "impossible_to_survive:dragon_staff"));
        Logic.step(() -> Native.particle(c, "enchant", "~", "~", "~", "1", "1", "1", "0.1", "20", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~", "~", "0", "0", "0", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "end_rod", "~", "~", "~", "0", "0", "0", "0.1", "10", "force"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~", "~0.5", "~0.1", "{Value:5,Motion:[-0.3,0.6,-0.1]}"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~0.1", "~0.4", "~-0.1", "{Value:10,Motion:[0.0,0.2,-0.1]}"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~0.1", "~0.2", "~0.2", "{Value:10,Motion:[0.0,0.1,0.1]}"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~0.3", "~0.5", "~", "{Value:200,Motion:[0.0,0.2,0.2]}"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~", "~0.5", "~-0.3", "{Value:400,Motion:[0.2,0.5,0.0]}"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~", "~0.4", "~", "{Value:600,Motion:[0.5,0.2,-0.1]}"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~-0.3", "~", "~0.3", "{Value:700,Motion:[0.1,0.6,0.0]}"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~", "~0.3", "~", "{Value:800,Motion:[0.6,0.2,0.3]}"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~0.3", "~", "~0.3", "{Value:900,Motion:[-0.1,0.4,0.0]}"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~0.3", "~0.1", "~", "{Value:1000,Motion:[0.2,0.2,-0.2]}"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~", "~", "~-0.3", "{Value:1100,Motion:[0.0,0.21,-0.1]}"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~-0.6", "~0.8", "~-0.6", "{Value:1200,Motion:[-0.1,0.2,-0.1]}"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~0.6", "~0.3", "~-0.6", "{Value:1300,Motion:[0.0,0.5,0.0]}"));
        Logic.step(() -> Native.summon(c, "experience_orb", "~0.6", "~", "~", "{Value:1400,Motion:[0.0,0.4,-0.8]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:complete_message"), Control.as("@a")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/347"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@e[tag=mcm.its.dragon.force_field.component]"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/348"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.exit_portal_center]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.its.dragon.setup.state", "0"));
        Logic.step(() -> Native.kill(c, "@e[tag=mcm.its.dragon.force_field.component]"));
        Logic.step(() -> Native.kill(c, "@e[tag=mcm.its.dragon.temp_setup]"));
        Logic.step(() -> Native.kill(c, "@e[tag=mcm.its.dragon_environment,tag=!mcm.its.dragon_environment.end_crystal]"));
        Logic.step(() -> Native.kill(c, "@e[tag=mcm.its.dragon.tutorial.component]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.wisp", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.healing", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.lightning_hit", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.lightning_counter", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.end_crystal_recharge", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.its.dragon.setup.state", "0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/346
    private static int f14(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "0", "-100", "0"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/347
    private static int f15(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon_environment.end_crystal.invulnerable"));
        Logic.step(() -> Native.fill(c, "~-1", "~-1", "~-1", "~1", "~4", "~1", "air", "replace", "barrier"));
        Logic.step(() -> Native.forceload(c, "remove", "~", "~"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/348
    private static int f16(Frame c) {
        Logic.step(() -> Native.setblock(c, "~", "~1", "~", "dragon_egg"));
        Logic.step(() -> Native.fill(c, "~-2", "~-3", "~-2", "~2", "~-3", "~2", "end_portal"));
        Logic.step(() -> Native.fill(c, "~3", "~-3", "~1", "~3", "~-3", "~-1", "bedrock"));
        Logic.step(() -> Native.fill(c, "~-3", "~-3", "~1", "~-3", "~-3", "~-1", "bedrock"));
        Logic.step(() -> Native.fill(c, "~1", "~-3", "~-3", "~-1", "~-3", "~-3", "bedrock"));
        Logic.step(() -> Native.fill(c, "~1", "~-3", "~3", "~-1", "~-3", "~3", "bedrock"));
        Logic.step(() -> Native.setblock(c, "~2", "~-3", "~2", "bedrock"));
        Logic.step(() -> Native.setblock(c, "~-2", "~-3", "~-2", "bedrock"));
        Logic.step(() -> Native.setblock(c, "~-2", "~-3", "~2", "bedrock"));
        Logic.step(() -> Native.setblock(c, "~2", "~-3", "~-2", "bedrock"));
        Logic.step(() -> Native.setblock(c, "~", "~-3", "~", "bedrock"));
        Logic.step(() -> Native.forceload(c, "remove", "~", "~"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/349
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:dragon_book/unlock"), Control.as("@a[distance=..40,predicate=mcm:gm/vulnerable]"), Control.at("@s"), Control.unless("score", "@s", "mcm.its.dragon.guide_unlocked", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/350"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/355"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/368"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/379"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/391"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "5")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/35
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/36"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/41"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/42"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/43"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/55"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/126"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/129"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/139"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "8")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/350
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/351"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/352"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "12")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/353"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "20")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "40..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tutorial/sleeping_z_loop"), Control.as("@e[type=item_display,tag=mcm.its.dragon.tutorial.z_particle]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/354"), Control.when("score", "@s", "mcm.its.dragon.health", "matches", "..999999")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/351
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~0", "~", "{teleport_duration:2,Tags:[\"mcm.its.dragon.tutorial.z_particle\",\"mcm.its.dragon.tutorial.z_particle.1\",\"mcm.its.dragon.tutorial.component\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.0f,0f,0.110f,0.994f],translation:[0f,0f,0f],scale:[0.0f,0.0f,0.0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":375}}}"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.head_middle_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/352
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~-0.4", "~", "{teleport_duration:2,Tags:[\"mcm.its.dragon.tutorial.z_particle\",\"mcm.its.dragon.tutorial.z_particle.2\",\"mcm.its.dragon.tutorial.component\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.0f,0f,-0.110f,0.994f],translation:[0f,0f,0f],scale:[0.0f,0.0f,0.0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":375}}}"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.head_right_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/353
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "~", "~-0.2", "~", "{teleport_duration:2,Tags:[\"mcm.its.dragon.tutorial.z_particle\",\"mcm.its.dragon.tutorial.z_particle.3\",\"mcm.its.dragon.tutorial.component\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.0f,0f,-0.110f,0.994f],translation:[0f,0f,0f],scale:[0.0f,0.0f,0.0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":375}}}"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.head_left_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/354
    private static int f23(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/dragon"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.health", "1000000"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/wake_up"));
        return 1;
    }
}
