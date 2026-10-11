package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled230 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/182", Compiled230::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/183", Compiled230::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/184", Compiled230::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/185", Compiled230::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/186", Compiled230::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/187", Compiled230::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/188", Compiled230::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/189", Compiled230::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/19", Compiled230::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/190", Compiled230::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/191", Compiled230::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/192", Compiled230::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/193", Compiled230::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/194", Compiled230::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/195", Compiled230::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/196", Compiled230::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/197", Compiled230::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/198", Compiled230::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/199", Compiled230::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/2", Compiled230::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/20", Compiled230::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/200", Compiled230::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/201", Compiled230::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/202", Compiled230::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/182
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.perch_point]", "eyes"), Control.positioned("^", "^", "^0.4"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.6"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield_land"), Control.unless("score", "#attack_forcefield_land_sfx", "mcm.misc", "matches", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#attack_forcefield_land_sfx", "mcm.misc", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/183
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.perch_point]", "eyes"), Control.positioned("^", "^", "^0.4"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.6"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield_land"), Control.unless("score", "#attack_forcefield_land_sfx", "mcm.misc", "matches", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#attack_forcefield_land_sfx", "mcm.misc", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/184
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "59.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=60..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "-69.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-70]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/185
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.flight_speed", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#attack_forcefield_land_sfx"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/forcefield_land/tween", "{to_frame:1,duration:3}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/set_tail_enabled"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/186
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/187"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1..20")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/190"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "16")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/191"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "20..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/187
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-2"), Control.at("@s"), Control.when("entity", "@s[x_rotation=3..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~2"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=2..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-0.5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=1..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~0.5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/188"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "3..18")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/189"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "5..16")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-1..1]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[0]"), Control.store("result", "score", "#x_rotation", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Rotation[1]"), Control.store("result", "score", "#y_rotation", "mcm.temp")));
        Logic.step(() -> Native.tp(c, "@s", "^", "^", "^0.1", "facing", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.perch_point]"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.1"), Control.at("@s"), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.perch_point,distance=..1.0]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.1"), Control.at("@s"), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.perch_point,distance=..0.5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.1"), Control.at("@s"), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.perch_point,distance=..0.11]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "0", "~", "0", "~", "~"), Control.at("@s"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.perch_point,distance=..0.11]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#x_rotation", "mcm.temp"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#y_rotation", "mcm.temp"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/188
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=25..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-25]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/189
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-10"), Control.at("@s"), Control.when("entity", "@s[x_rotation=51..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~10"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-51]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/19
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/impossible_dragon/zzz/20"), Control.as("@e[type=enderman,tag=!mcm.its.dragon.minion,distance=..300]")), Control.when("entity", "@a[predicate=mcm:in_the_end]"), Control.dimension("minecraft:the_end"), Control.positioned("0", "60", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/190
    private static int f9(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/forcefield_loop/tween", "{to_frame:4,duration:4}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/191
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@n[type=marker,tag=mcm.its.dragon_environment.perch_point]", "Pos[1]"), Control.store("result", "score", "#perch_point_y", "mcm.temp")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#perch_point_y", "mcm.temp"), Control.store("result", "entity", "@s", "Pos[1]", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "0", "~", "0"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity.timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#perch_point_y"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/192
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/193"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/194"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "2..380")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/196"), Control.positioned("~", "~8", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/198"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "10.."), Control.as("@e[type=item_display,tag=mcm.its.dragon.forcefield.glint]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "remove", "@s", "mcm.its.dragon.forcefield_damage_cooldown", "1"), Control.when("score", "@s", "mcm.its.dragon.forcefield_damage_cooldown", "matches", "1..")), Control.as("@a")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/199"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "7..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/211"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "100")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield_end"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "355")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/end_attack"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "400")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/193
    private static int f12(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/summon_forcefield"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.forcefield_damage_cooldown", "15"));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "0", "0", "0", "{UUID:[I;596917,0,0,65535],CustomName:'\"gm.math_entity\"'}"), Control.dimension("minecraft:the_end")));
        Logic.step(() -> Native.data(c, "merge", "storage", "mcm:distance_calc", "{input_angle:0.0f,sin_angle:0.0d,cos_angle:0.0d,element_a:0.0f,element_b:0.0f,input_position_x:0.0d,input_position_z:0.0d,out_distance:0.0d}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]"), Control.store("result", "score", "#forcefield_y_position", "mcm.temp")));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.crystal_tail.protected"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/194
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/195"), Control.at("@n[type=marker,tag=mcm.its.dragon_environment.perch_point]"), Control.positioned("~", "~8", "~")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/195
    private static int f14(Frame c) {
        Logic.step(() -> Native.particle(c, "reverse_portal", "~", "~", "~", "0", "0", "0", "0.5", "5", "force"));
        Logic.step(() -> Native.particle(c, "reverse_portal", "~", "~", "~", "0", "0", "0", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "reverse_portal", "~", "~", "~", "0", "0", "0", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~", "~", "0", "0", "0", "0.05", "1", "force"));
        Logic.step(() -> Native.particle(c, "end_rod", "~", "~", "~", "0.4", "0.4", "0.4", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "witch", "~", "~", "~", "0.0", "0.0", "0.0", "0.5", "1", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/196
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/197"), Control.as("@e[type=#mcm:projectile,distance=..4.0]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/197
    private static int f16(Frame c) {
        Logic.step(() -> Native.particle(c, "electric_spark", "~", "~", "~", "0.05", "0.05", "0.05", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~", "~", "0", "0", "0", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "firework", "~", "~", "~", "0", "0", "0", "0.2", "5", "force"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/198
    private static int f17(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/forcefield/calculate_player_distance"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/199
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/200"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "..360"), Control.when("score", "@s", "mcm.its.dragon.sub_activity.timer", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/202"), Control.when("score", "@s", "mcm.its.dragon.sub_activity.timer", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/2
    private static int f19(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"mcm.its.dragon.temp_setup.crystal\",\"mcm.its.dragon.temp_setup\"]}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/20
    private static int f20(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.minion"));
        Logic.step(() -> Native.attribute(c, "@s", "minecraft:generic.scale", "base", "set", "0.5"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{Health:10.0f}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/200
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@a[predicate=mcm:gm/vulnerable,distance=..4]", "add", "mcm.its.dragon.potential_perch_bite_target"), Control.positioned("^", "^-5", "^4")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@a[predicate=mcm:gm/vulnerable,distance=..4]", "add", "mcm.its.dragon.potential_perch_bite_target"), Control.positioned("^", "^-3", "^4")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@a[predicate=mcm:gm/vulnerable,distance=..3]", "add", "mcm.its.dragon.potential_perch_bite_target"), Control.positioned("^-2", "^-5", "^3")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@a[predicate=mcm:gm/vulnerable,distance=..3]", "add", "mcm.its.dragon.potential_perch_bite_target"), Control.positioned("^-2", "^-5", "^3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/201"), Control.when("entity", "@a[tag=mcm.its.dragon.potential_perch_bite_target]")));
        Logic.step(() -> Native.tag(c, "@a", "remove", "mcm.its.dragon.potential_perch_bite_target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/201
    private static int f22(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity.timer", "1"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/forcefield_bite/tween", "{to_frame:2,duration:2}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_forcefield_bite"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/202
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.sub_activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/203"), Control.when("score", "@s", "mcm.its.dragon.sub_activity.timer", "matches", "1..15")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/205"), Control.when("score", "@s", "mcm.its.dragon.sub_activity.timer", "matches", "15")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/forcefield_loop/tween", "{to_frame:3,duration:3}"), Control.when("score", "@s", "mcm.its.dragon.sub_activity.timer", "matches", "20")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/210"), Control.when("score", "@s", "mcm.its.dragon.sub_activity.timer", "matches", "60..")));
        return 1;
    }
}
