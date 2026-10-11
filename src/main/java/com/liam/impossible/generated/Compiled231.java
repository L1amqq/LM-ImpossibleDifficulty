package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled231 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/203", Compiled231::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/204", Compiled231::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/205", Compiled231::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/206", Compiled231::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/207", Compiled231::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/208", Compiled231::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/209", Compiled231::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/21", Compiled231::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/210", Compiled231::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/211", Compiled231::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/212", Compiled231::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/213", Compiled231::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/214", Compiled231::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/215", Compiled231::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/216", Compiled231::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/217", Compiled231::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/218", Compiled231::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/219", Compiled231::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/22", Compiled231::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/220", Compiled231::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/221", Compiled231::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/222", Compiled231::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/223", Compiled231::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/224", Compiled231::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/203
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@p[predicate=mcm:gm/vulnerable,distance=..10]", "add", "mcm.its.dragon.perch_bite_target"), Control.positioned("^", "^-4", "^5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/204"), Control.when("entity", "@a[tag=mcm.its.dragon.perch_bite_target]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/204
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[tag=mcm.its.dragon.perch_bite_target]", "eyes"), Control.positioned("^", "^", "^0.15"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.85"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@a", "remove", "mcm.its.dragon.perch_bite_target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/205
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@p[predicate=mcm:gm/vulnerable,distance=..4]", "add", "mcm.its.dragon.perch_bite_damage_target"), Control.positioned("^", "^-5", "^4.5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/206"), Control.as("@a[tag=mcm.its.dragon.perch_bite_damage_target]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/206
    private static int f3(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.perch_bite_damage_target"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~1", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/207"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/208"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/209"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/207
    private static int f4(Frame c) {
        Logic.step(() -> Native.damage(c, "@s", "9", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/208
    private static int f5(Frame c) {
        Logic.step(() -> Native.damage(c, "@s", "13", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/209
    private static int f6(Frame c) {
        Logic.step(() -> Native.damage(c, "@s", "19", "minecraft:mob_attack", "by", "@n[type=item_display,tag=aj.impossible_dragon.root]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/21
    private static int f7(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "0", "-100", "0"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/210
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity.timer", "0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/211
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "270"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "290"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "320"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/212
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/213"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/215"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/217"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "10..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/213
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/214"), Control.as("@e[type=item_display,tag=mcm.its.dragon.forcefield_rotating]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/214
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:6,start_interpolation:0,transformation:{scale:[0f,100f,1f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.forcefield.glint]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:6,start_interpolation:0,transformation:{scale:[0f,1f,1f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.forcefield.line]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/215
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/216"), Control.as("@e[type=item_display,tag=mcm.its.dragon.forcefield_rotating]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/216
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:5,start_interpolation:0,transformation:{scale:[0f,0f,0f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.forcefield.electric_laser]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/217
    private static int f15(Frame c) {
        Logic.step(() -> Native.kill(c, "@e[tag=mcm.its.dragon.forcefield_rotating]"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.flight_speed", "800"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying_forward"));
        Logic.step(() -> Native.stopsound(c, "@a", "master", "minecraft:dragon.attack_forcefield"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/218
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/219"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1..20")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/222"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "22..24"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/223"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "25..270"), Control.at("@s"), Control.unless("score", "@s", "mcm.its.dragon.tutorial.stage", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/224"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "28")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/226"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "22")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/227"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "25..200")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/228"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "252")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/230"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "25..201")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/232"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "200..250")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/234"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "23")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/235"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "22..285")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "remove", "@s", "mcm.its.dragon.flight_speed", "50"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "286..290")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/236"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "22..290"), Control.unless("score", "@s", "mcm.its.dragon.tutorial.stage", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/237"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "272")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/241"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "274"), Control.when("score", "@s", "mcm.its.dragon.tutorial.stage", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/242"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "274")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/245"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "280")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/247"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "285..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/248"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "277.."), Control.unless("score", "@s", "mcm.its.dragon.tutorial.stage", "matches", "1")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/219
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-2"), Control.at("@s"), Control.when("entity", "@s[x_rotation=3..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~2"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=2..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~1"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-0.5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=1..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~0.5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/220"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "3..18")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/221"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "5..16")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "22"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-1..1]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/22
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_1_level_1"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "1"), Control.positioned("~-3", "~-8", "~-3")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_2_level_1"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "2"), Control.positioned("~-4", "~-8", "~-4")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_3_level_1"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "3"), Control.positioned("~-5", "~-8", "~-5")));
        Logic.step(() -> Control.run(c, x0 -> Native.place(x0, "template", "impossible_to_survive:end_pillar_size_4_level_1"), Control.when("score", "@s", "mcm.its.dragon.tower_size", "matches", "4"), Control.positioned("~-6", "~-8", "~-6")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/220
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=25..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~3"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-25]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/221
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-10"), Control.at("@s"), Control.when("entity", "@s[x_rotation=51..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~10"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-51]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/222
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[predicate=mcm:gm/vulnerable]", "eyes"), Control.positioned("^", "^", "^0.15"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.85"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.02", "0"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/223
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[predicate=mcm:gm/vulnerable]", "eyes"), Control.positioned("^", "^", "^0.2"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.8"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~0.02", "0"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/224
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/225"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.tail_locator]")));
        return 1;
    }
}
