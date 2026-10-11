package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled207 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/6", Compiled207::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/7", Compiled207::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/8", Compiled207::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/9", Compiled207::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/loop", Compiled207::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/projectile_iteration", Compiled207::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/shoot", Compiled207::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/spiral_particles", Compiled207::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/summon_with_motion", Compiled207::f8, "x", "y", "z");
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/test_shoot_dragon_fireball", Compiled207::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/0", Compiled207::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/1", Compiled207::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/10", Compiled207::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/11", Compiled207::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/12", Compiled207::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/13", Compiled207::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/14", Compiled207::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/15", Compiled207::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/16", Compiled207::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/17", Compiled207::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/18", Compiled207::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/19", Compiled207::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/2", Compiled207::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/20", Compiled207::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/6
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/7"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/8"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/9"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/7
    private static int f1(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1094563.9124525944", "^623489.9478578875", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1094563.9124525944", "^-623489.9478578875", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/8
    private static int f2(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1303223.1207508245", "^365341.25614146225", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1303223.1207508245", "^-365341.25614146225", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/9
    private static int f3(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1396085.2834917002", "^74730.40394938426", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1396085.2834917002", "^-74730.40394938426", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/loop
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/projectile_iteration"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/projectile_iteration"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/projectile_iteration"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/projectile_iteration
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:4,start_interpolation:0,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[2.5f,2.5f,2.5f]}}"), Control.when("score", "@s", "mcm.lifetime", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.rotation.x"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "witch", "^", "^", "^-1.75", "0.2", "0.2", "0.2", "0.01", "1", "force"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "witch", "^", "^", "^-2.25", "0.2", "0.2", "0.2", "0.01", "1", "force"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/5"), Control.unless("block", "~", "~", "~", "#mcm:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/spiral_particles"), Control.at("@s"), Control.positioned("^", "^", "^-1.75"), Control.rotated("~", "~-10")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.lifetime", "matches", "200..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/shoot
    private static int f6(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.its.dragon.fireball\",\"mcm.init\",\"mcm.its.dragon.component_item_display\"],brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[0.0f,0.0f,0.0f]},Invulnerable:1,billboard:\"center\",teleport_duration:2,item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":70,\"minecraft:enchantment_glint_override\":false}}}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/0"), Control.as("@e[type=item_display,distance=..0.1,tag=mcm.its.dragon.fireball,tag=mcm.init]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/1"), Control.positioned("^", "^0.1", "^1.5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/3"), Control.positioned("^", "^0.1", "^1.5")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/spiral_particles
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.animation", "0"), Control.when("score", "@s", "mcm.animation", "matches", "21..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/11"), Control.when("score", "@s", "mcm.animation", "matches", "0..10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/29"), Control.when("score", "@s", "mcm.animation", "matches", "11..20")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/summon_with_motion
    private static int f8(Frame c) {
        Logic.step(() -> Native.say(c, "$(x)", "$(y)", "$(z)"));
        Logic.step(() -> Native.summon(c, "dragon_fireball", "~", "~", "~", "{Motion:[0.0,0.0,0.0]}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/test_shoot_dragon_fireball
    private static int f9(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.temp\",\"mcm.relative_motion\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/46"), Control.as("@e[type=marker,tag=mcm.temp,tag=mcm.relative_motion]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/0
    private static int f10(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.init"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "30"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "facing", "entity", "@p[tag=mcm.its.fireball_target]", "feet"), Control.when("entity", "@p[tag=mcm.its.fireball_target]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "70"), Control.at("@s"), Control.when("entity", "@s[x_rotation=71..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "-20"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-21]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~4"), Control.when("score", "#fireball_rot_offset", "mcm.temp", "matches", "5"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~5"), Control.when("score", "#fireball_rot_offset", "mcm.temp", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~5"), Control.when("score", "#fireball_rot_offset", "mcm.temp", "matches", "-1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~2"), Control.when("score", "#fireball_rot_offset", "mcm.temp", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~2"), Control.when("score", "#fireball_rot_offset", "mcm.temp", "matches", "-2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#fireball_x_rotation", "mcm.temp"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "@s", "mcm.rotation.x")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-10", "~"), Control.when("score", "#fireball_rot_offset", "mcm.temp", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~10", "~"), Control.when("score", "#fireball_rot_offset", "mcm.temp", "matches", "-1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-3", "~"), Control.when("score", "#fireball_rot_offset", "mcm.temp", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~3", "~"), Control.when("score", "#fireball_rot_offset", "mcm.temp", "matches", "-2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..20"), Control.store("result", "score", "@s", "mcm.animation")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "#fireball_y_rotation", "mcm.temp")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/1
    private static int f11(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_e_shoot/summon"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/2"), Control.as("@e[type=item_display,tag=mcm.vfx.impact_e_shoot,distance=..0.1]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/10
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "20", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "..1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "21", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "2..3")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "22", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "4..5")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "23", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.when("score", "#player_count", "mcm.its.dragon.settings", "matches", "6..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/11
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/12"), Control.when("score", "@s", "mcm.animation", "matches", "0..5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/21"), Control.when("score", "@s", "mcm.animation", "matches", "6..10")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/12
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/13"), Control.when("score", "@s", "mcm.animation", "matches", "0..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/17"), Control.when("score", "@s", "mcm.animation", "matches", "3..5")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/13
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/14"), Control.when("score", "@s", "mcm.animation", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/15"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/16"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/14
    private static int f16(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^0", "^1000000", "^10000000", "0.00000005", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^0", "^-1000000", "^10000000", "0.00000005", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/15
    private static int f17(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^412657.1609015807", "^955572.8241336602", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-412657.1609015807", "^-955572.8241336602", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/16
    private static int f18(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^788647.9372834035", "^826238.844445558", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-788647.9372834035", "^-826238.844445558", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/17
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/18"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/19"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/20"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/18
    private static int f20(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1094563.9124525944", "^623489.9478578875", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1094563.9124525944", "^-623489.9478578875", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/19
    private static int f21(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1303223.1207508245", "^365341.25614146225", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1303223.1207508245", "^-365341.25614146225", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/2
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#fireball_x_rotation", "mcm.temp"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#fireball_y_rotation", "mcm.temp"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/20
    private static int f23(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1396085.2834917002", "^74730.40394938426", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1396085.2834917002", "^-74730.40394938426", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
}
