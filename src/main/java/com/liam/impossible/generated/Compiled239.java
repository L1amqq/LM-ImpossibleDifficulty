package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled239 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/377", Compiled239::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/378", Compiled239::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/379", Compiled239::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/38", Compiled239::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/380", Compiled239::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/381", Compiled239::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/382", Compiled239::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/383", Compiled239::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/384", Compiled239::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/385", Compiled239::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/386", Compiled239::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/387", Compiled239::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/388", Compiled239::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/389", Compiled239::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/39", Compiled239::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/390", Compiled239::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/391", Compiled239::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/392", Compiled239::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/393", Compiled239::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/394", Compiled239::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/395", Compiled239::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/396", Compiled239::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/397", Compiled239::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/398", Compiled239::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/377
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.animation", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:0,transformation:{translation:[0f,-0.75f,0f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.tutorial.red_arrow.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:0,transformation:{translation:[0f,0.75f,0f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.tutorial.red_arrow.2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:0,transformation:{translation:[-0.75f,0f,0f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.tutorial.red_arrow.3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:0,transformation:{translation:[0.75f,0f,0f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.tutorial.red_arrow.4]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/378
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "4"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/379
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.data(x1, "merge", "entity", "@s", "{interpolation_duration:5,start_interpolation:0,transformation:{scale:[0f,0f,0f]}}"), Control.as("@e[tag=mcm.its.dragon.tutorial.red_arrow]")), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/380"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^-0.25"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "5..35")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/382"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "15")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/384"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "15..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/387"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "35..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/389"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "50..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/390"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "1500..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.health", "930001"), Control.when("score", "@s", "mcm.its.dragon.health", "matches", "..930000")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/38
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/39"), Control.positioned("^-10", "^", "^-20")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/380
    private static int f4(Frame c) {
        Logic.step(() -> Native.kill(c, "@e[tag=mcm.its.dragon.tutorial.red_arrow]"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/381"), Control.dimension("minecraft:the_end"), Control.positioned("0", "65", "0"), Control.as("@a[distance=..300]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/381
    private static int f5(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u002a\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\" Hint:\",\"bold\":true,\"color\":\"#d9d134\",\"font\":\"minecraft:default\"},{\"text\":\" Place the tail item on the upcoming impact point of the tail slam attack to stun the dragon!\",\"color\":\"aqua\",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/display_hint"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/382
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/383"), Control.as("@n[tag=mcm.its.dragon_environment.dragon_spawn_point]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/383
    private static int f7(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~0.5", "~", "{teleport_duration:2,Tags:[\"mcm.its.dragon.tutorial.red_arrow\",\"mcm.its.dragon.tutorial.red_arrow.1\",\"mcm.its.dragon.tutorial.component\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.0f,0f,0f,1.0f],translation:[0f,0f,0f],scale:[0.0f,0.0f,0.0f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":371}}}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/384
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/385"), Control.as("@e[type=item_display,tag=mcm.its.dragon.tutorial.red_arrow.1]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/385
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:0,transformation:{translation:[0f,1.0f,0f],scale:[0.75f,0.75f,0.75f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/386"), Control.when("score", "@s", "mcm.animation", "matches", "20..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/386
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.animation", "0"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:0,transformation:{translation:[0f,0.25f,0f]}}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/387
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/388"), Control.at("@n[tag=mcm.its.dragon_environment.dragon_spawn_point]"), Control.when("entity", "@e[type=item_display,tag=mcm.crystal_tail,distance=..0.1]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/388
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "mcm.crystal_tail.unbreakable"), Control.as("@n[type=item_display,tag=mcm.crystal_tail,distance=..0.1]")));
        Logic.step(() -> Native.kill(c, "@e[type=item_display,tag=mcm.its.dragon.tutorial.red_arrow.1]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/389
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "50"), Control.unless("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/39
    private static int f14(Frame c) {
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Native.tag(c, "@n[type=marker,tag=mcm.its.dragon_environment.waypoint]", "add", "mcm.its.dragon_environment.waypoint.active"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/390
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "50"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/set_tail_enabled"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/391
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/392"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "15")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/393"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "20")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/395"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "23")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/396"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "30")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/392
    private static int f17(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_growl"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_indicator"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/393
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/394"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.tail_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/394
    private static int f19(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_m/summon"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/flash_g/summon"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/395
    private static int f20(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/state/set_tail_enabled"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.crystal_tail.protected"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/396
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.tutorial.stage", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "11"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "199"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/397
    private static int f22(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.damaged_cd", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/398"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "3..5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/399"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "0..1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/398
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.effect(x1, "clear", "@s", "glowing"), Control.as("@e[type=pig,tag=mcm.its.dragon.hitbox]")), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.bossbar(x0, "set", "minecraft:impossible_dragon", "color", "purple"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.bossbar(x0, "set", "minecraft:impossible_dragon", "color", "blue"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "3")));
        return 1;
    }
}
