package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled209 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/43", Compiled209::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/44", Compiled209::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/45", Compiled209::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/46", Compiled209::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/5", Compiled209::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/6", Compiled209::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/7", Compiled209::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/8", Compiled209::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/9", Compiled209::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/summon_area_effect_cloud", Compiled209::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/apply_forcefield_player_damage", Compiled209::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/calculate_distance_per_player", Compiled209::f11, "cos_angle", "input_position_x", "input_position_z", "sin_angle");
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/calculate_distance_per_player_2", Compiled209::f12, "element_a", "element_b");
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/calculate_formula", Compiled209::f13, "input_angle");
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/calculate_player_distance", Compiled209::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/end_attack", Compiled209::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/rotating_component_loop", Compiled209::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/summon_forcefield", Compiled209::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/0", Compiled209::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/1", Compiled209::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/2", Compiled209::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/3", Compiled209::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/4", Compiled209::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/5", Compiled209::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/43
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/44"), Control.when("score", "@s", "mcm.animation", "matches", "19")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/45"), Control.when("score", "@s", "mcm.animation", "matches", "20")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/44
    private static int f1(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-788649.4493423004", "^826238.1080845064", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^788649.4493423004", "^-826238.1080845064", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/45
    private static int f2(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-412658.9096486329", "^955572.4388349745", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^412658.9096486329", "^-955572.4388349745", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/46
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1000"), Control.store("result", "score", "#x", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1000"), Control.store("result", "score", "#y", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1000"), Control.store("result", "score", "#z", "mcm.temp")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p[tag=mcm.its.fireball_target]", "feet"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "60"), Control.at("@s"), Control.when("entity", "@s[x_rotation=61..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "-20"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-21]")));
        Logic.step(() -> Native.tp(c, "@s", "^", "^", "^1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1000"), Control.store("result", "score", "#dx", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1000"), Control.store("result", "score", "#dy", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1000"), Control.store("result", "score", "#dz", "mcm.temp")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#dx", "mcm.temp", "-=", "#x", "mcm.temp"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#dy", "mcm.temp", "-=", "#y", "mcm.temp"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#dz", "mcm.temp", "-=", "#z", "mcm.temp"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/5
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^-1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.5", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.25", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.125", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.0625", "~"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.5", "~"), Control.at("@s"), Control.when("block", "~", "~-0.5", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.25", "~"), Control.at("@s"), Control.when("block", "~", "~-0.25", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.125", "~"), Control.at("@s"), Control.when("block", "~", "~-0.125", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.0675", "~"), Control.at("@s"), Control.when("block", "~", "~-0.0675", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/6"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/6
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/summon_area_effect_cloud"), Control.positioned("~", "~0.125", "~")));
        Logic.step(() -> Native.particle(c, "witch", "~", "~", "~", "0.2", "0.2", "0.2", "0.5", "30", "force"));
        Logic.step(() -> Native.particle(c, "minecraft:dragon_breath", "~", "~0.25", "~", "1", "0.3", "1", "0.1", "25", "force"));
        Logic.step(() -> Native.particle(c, "minecraft:dragon_breath", "~", "~0.25", "~", "1", "0.5", "1", "0.2", "25", "force"));
        Logic.step(() -> Native.particle(c, "minecraft:dragon_breath", "~", "~0.25", "~", "1", "0.1", "1", "0.4", "15", "force"));
        Logic.step(() -> Native.particle(c, "minecraft:firework", "~", "~0.25", "~", "1", "0.1", "1", "0.3", "5", "force"));
        Logic.step(() -> Native.particle(c, "entity_effect{color:[1f,0.2f,1f,1f]}", "~", "~0.5", "~", "2", "0.7", "2", "0.5", "30", "force"));
        Logic.step(() -> Native.particle(c, "dust_color_transition{from_color: [0.9f, 0.2f, 0.9f], scale: 1.5f, to_color: [0.99f, 0.8f, 0.99f]}", "~", "~1", "~", "1", "0.5", "1", "0.2", "15", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_fireball_impact"), Control.unless("entity", "@e[type=item_display,tag=mcm.vfx.impact_c]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_c/summon"), Control.positioned("~", "~0.125", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_d/summon"), Control.positioned("~", "~0.125", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/7"), Control.as("@a[distance=..3.5,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/7
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/8"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/9"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/10"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/8
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "9", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "2..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "4..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "11", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/9
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "16", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "17", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "2..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "18", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "4..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "29", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/summon_area_effect_cloud
    private static int f9(Frame c) {
        Logic.step(() -> Native.summon(c, "area_effect_cloud", "~", "~", "~", "{Particle:{type:\"dragon_breath\"},ReapplicationDelay:10,Radius:3f,RadiusPerTick:0.006f,Duration:600,Age:0,WaitTime:7,potion_contents:{custom_effects:[{id:\"minecraft:instant_damage\",amplifier:0,duration:1,show_icon:1b}]}}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/apply_forcefield_player_damage
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/6"), Control.unless("score", "@s", "mcm.its.dragon.forcefield_damage_cooldown", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/calculate_distance_per_player
    private static int f11(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:math/multiply", "{x:$(sin_angle),y:$(input_position_x)}"));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:distance_calc", "element_a", "set", "from", "storage", "mcm:math_io", "out"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:math/multiply", "{x:$(cos_angle),y:$(input_position_z)}"));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:distance_calc", "element_b", "set", "from", "storage", "mcm:math_io", "out"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/calculate_distance_per_player_2", "with", "storage", "mcm:distance_calc"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/calculate_distance_per_player_2
    private static int f12(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:math/subtract", "{x:$(element_a),y:$(element_b)}"));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:distance_calc", "out_distance", "set", "from", "storage", "mcm:math_io", "out"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "mcm:distance_calc", "out_distance", "10"), Control.store("result", "score", "@s", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/4"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/5"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/calculate_formula
    private static int f13(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:math/sin", "{x:$(input_angle)}"));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:distance_calc", "sin_angle", "set", "from", "storage", "mcm:math_io", "out"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:math/cos", "{x:$(input_angle)}"));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:distance_calc", "cos_angle", "set", "from", "storage", "mcm:math_io", "out"));
        Logic.step(() -> Native.tag(c, "@a", "remove", "mcm.its.dragon.forcefield.close_player"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "mcm.its.dragon.forcefield.close_player"), Control.as("@a[distance=..30,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/3"), Control.as("@a[distance=..75,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/calculate_player_distance
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:distance_calc", "input_angle", "set", "from", "entity", "@s", "Rotation[0]"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/calculate_formula", "with", "storage", "mcm:distance_calc"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/end_attack
    private static int f15(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "4"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.kill(c, "91bb5-0-0-0-ffff"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/rotating_component_loop
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~1.25", "~"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~2", "~"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~4", "~"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/1"), Control.when("score", "@s", "mcm.lifetime", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/2"), Control.when("entity", "@s[tag=mcm.its.dragon.forcefield.electric_laser]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/summon_forcefield
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/0"), Control.at("@n[type=marker,tag=mcm.its.dragon_environment.perch_point]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/0
    private static int f18(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~-2.1", "~", "{transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,10f,0f],scale:[0f,100f,1f]},Tags:[\"mcm.its.dragon.forcefield.glint\",\"mcm.its.dragon.forcefield_rotating\",\"mcm.its.dragon.component_item_display\"],item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":254,\"minecraft:enchantment_glint_override\":true}},teleport_duration:2}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~7.9", "~", "{transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[0f,1f,1f]},Tags:[\"mcm.its.dragon.forcefield.line\",\"mcm.its.dragon.forcefield_rotating\",\"mcm.its.dragon.component_item_display\"],item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":256,\"minecraft:enchantment_glint_override\":false}},teleport_duration:2}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~7.9", "~", "{teleport_duration:2,Tags:[\"mcm.its.dragon.forcefield.electric_laser\",\"mcm.its.dragon.forcefield_rotating\",\"mcm.its.dragon.component_item_display\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0.0f,0f,-0.3f],scale:[0f,0f,0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":281}},Rotation:[-90.0f]}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~7.9", "~", "{teleport_duration:2,Tags:[\"mcm.its.dragon.forcefield.electric_laser\",\"mcm.its.dragon.forcefield_rotating\",\"mcm.its.dragon.component_item_display\"],billboard:\"fixed\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0.0f,0f,-0.3f],scale:[0f,0f,0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":281}},Rotation:[90.0f]}"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@n[type=item_display,tag=mcm.its.dragon.forcefield.electric_laser]", "mcm.animation", "6"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/1
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:8,start_interpolation:0,transformation:{scale:[50f,100f,1f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.forcefield.glint]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:8,start_interpolation:0,transformation:{scale:[50f,1f,1f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.forcefield.line]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:8,start_interpolation:0,transformation:{scale:[7f,7f,7f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.forcefield.electric_laser]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/2
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.animation", "1"), Control.when("predicate", "mcm:random/10_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.animation", "1"), Control.when("score", "@s", "mcm.animation", "matches", "16..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "281"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "282"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "283"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "284"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "285"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "286"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "287"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "288"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "289"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "290"), Control.when("score", "@s", "mcm.animation", "matches", "10")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "291"), Control.when("score", "@s", "mcm.animation", "matches", "11")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "292"), Control.when("score", "@s", "mcm.animation", "matches", "12")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "293"), Control.when("score", "@s", "mcm.animation", "matches", "13")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "294"), Control.when("score", "@s", "mcm.animation", "matches", "14")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "295"), Control.when("score", "@s", "mcm.animation", "matches", "15")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/3
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]"), Control.store("result", "score", "#player_y_position", "mcm.temp")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#y_level_difference", "mcm.temp", "=", "#forcefield_y_position", "mcm.temp"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#y_level_difference", "mcm.temp", "-=", "#player_y_position", "mcm.temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("score", "#y_level_difference", "mcm.temp", "matches", "-7..18")));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:distance_calc", "input_position_x", "set", "from", "entity", "@s", "Pos[0]"));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:distance_calc", "input_position_z", "set", "from", "entity", "@s", "Pos[2]"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/calculate_distance_per_player", "with", "storage", "mcm:distance_calc"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.forcefield.close_player"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/4
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/apply_forcefield_player_damage"), Control.when("entity", "@s[tag=mcm.its.dragon.forcefield.close_player]"), Control.when("score", "@s", "mcm.temp", "matches", "-10..10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/apply_forcefield_player_damage"), Control.unless("entity", "@s[tag=mcm.its.dragon.forcefield.close_player]"), Control.when("score", "@s", "mcm.temp", "matches", "-18..18")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/forcefield/zzz/5
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/apply_forcefield_player_damage"), Control.when("entity", "@s[tag=mcm.its.dragon.forcefield.close_player]"), Control.when("score", "@s", "mcm.temp", "matches", "-12..12")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/apply_forcefield_player_damage"), Control.unless("entity", "@s[tag=mcm.its.dragon.forcefield.close_player]"), Control.when("score", "@s", "mcm.temp", "matches", "-25..25")));
        return 1;
    }
}
