package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled238 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/355", Compiled238::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/356", Compiled238::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/357", Compiled238::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/358", Compiled238::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/359", Compiled238::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/36", Compiled238::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/360", Compiled238::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/361", Compiled238::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/362", Compiled238::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/363", Compiled238::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/364", Compiled238::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/365", Compiled238::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/366", Compiled238::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/367", Compiled238::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/368", Compiled238::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/369", Compiled238::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/37", Compiled238::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/370", Compiled238::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/371", Compiled238::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/372", Compiled238::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/373", Compiled238::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/374", Compiled238::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/375", Compiled238::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/376", Compiled238::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/355
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/tutorial/sleeping_z_loop"), Control.as("@e[type=item_display,tag=mcm.its.dragon.tutorial.z_particle]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/356"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/357"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "15")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/358"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "35..55")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/360"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "33..53")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/361"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "34..48")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/362"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "35..51")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/363"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "50")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/364"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "59")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/365"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "55")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/367"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "70")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/356
    private static int f1(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/wake_up/tween", "{to_frame:3,duration:3}"));
        Logic.step(() -> Native.tag(c, "@p", "add", "mcm.its.dragon.wakeup_target"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/357
    private static int f2(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.bossbar_invisible"));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "visible", "true"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/358
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/359"), Control.when("entity", "@a[tag=mcm.its.dragon.wakeup_target]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/359
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[tag=mcm.its.dragon.wakeup_target]", "eyes"), Control.positioned("^", "^", "^0.13"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.87"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/36
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tag(x1, "@s", "add", "mcm.its.dragon_environment.waypoint.active"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.waypoint,sort=random,limit=1]"), Control.at("@s")), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "eyes"), Control.positioned("^", "^", "^0.085"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.915"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~-0.01", "~"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/37"), Control.when("entity", "@s[x_rotation=50..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "59.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=60..90]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "-69.9"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-90..-70]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=20..90]")), Control.at("@s"), Control.when("block", "~", "~-7", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tp(x1, "@s", "~", "~", "~", "~", "~-5"), Control.at("@s"), Control.when("entity", "@s[x_rotation=-20..90]")), Control.at("@s"), Control.when("block", "~", "~-2", "~", "end_stone")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/38"), Control.at("@s"), Control.when("block", "^", "^", "^10", "obsidian")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.flight_speed", "50"), Control.unless("score", "@s", "mcm.its.dragon.flight_speed", "matches", "1000..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.flight_speed", "-1"), Control.unless("entity", "@a[distance=..300]")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/move_forward"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/40"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active,distance=..11]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/360
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.2", "~"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/361
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.4", "~"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/362
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.2", "~"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/363
    private static int f9(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_growl"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/attack_tail_slam_indicator"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/364
    private static int f10(Frame c) {
        Logic.step(() -> Native.tag(c, "@a", "remove", "mcm.its.dragon.wakeup_target"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/hover/tween", "{to_frame:3,duration:3}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/365
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/366"), Control.at("@n[type=marker,tag=aj.impossible_dragon.locator.tail_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/366
    private static int f12(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_m/summon"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/flash_g/summon"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/367
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.tutorial.stage", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity", "11"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "199"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/368
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "..9")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/369"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/371"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "10")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.activity.timer", "1"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "11..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/372"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "20")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/375"), Control.as("@e[type=item_display,tag=mcm.its.dragon.tutorial.red_arrow]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.health", "930001"), Control.when("score", "@s", "mcm.its.dragon.health", "matches", "..930000")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/378"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/369
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/370"), Control.dimension("minecraft:the_end"), Control.positioned("0", "65", "0"), Control.as("@a[distance=..300]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/37
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@n[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "eyes"), Control.positioned("^", "^", "^0.1"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.9"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/370
    private static int f17(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u002a\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\" Hint:\",\"bold\":true,\"color\":\"#d9d134\",\"font\":\"minecraft:default\"},{\"text\":\" Shooting the dragons heads or tail deals double damage!\",\"color\":\"aqua\",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/display_hint"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/371
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.activity.timer", "11"), Control.unless("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/372
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/373"), Control.dimension("minecraft:the_end"), Control.positioned("0", "65", "0"), Control.as("@a[distance=..300]"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/374"), Control.as("@n[tag=aj.impossible_dragon.locator.tail_locator]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/373
    private static int f20(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u002a\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\" Hint:\",\"bold\":true,\"color\":\"#d9d134\",\"font\":\"minecraft:default\"},{\"text\":\" The tail gets destroyed after taking enough damage!\",\"color\":\"aqua\",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/display_hint"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/374
    private static int f21(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:2,Tags:[\"mcm.its.dragon.tutorial.red_arrow\",\"mcm.its.dragon.tutorial.red_arrow.1\",\"mcm.its.dragon.tutorial.component\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.0f,0f,0f,1.0f],translation:[0f,0f,0f],scale:[0.75f,0.75f,0.75f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":370}}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:2,Tags:[\"mcm.its.dragon.tutorial.red_arrow\",\"mcm.its.dragon.tutorial.red_arrow.2\",\"mcm.its.dragon.tutorial.component\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.0f,0f,0f,1.0f],translation:[0f,0f,0f],scale:[0.75f,0.75f,0.75f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":371}}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:2,Tags:[\"mcm.its.dragon.tutorial.red_arrow\",\"mcm.its.dragon.tutorial.red_arrow.3\",\"mcm.its.dragon.tutorial.component\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.0f,0f,0f,1.0f],translation:[0f,0f,0f],scale:[0.75f,0.75f,0.75f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":372}}}"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{teleport_duration:2,Tags:[\"mcm.its.dragon.tutorial.red_arrow\",\"mcm.its.dragon.tutorial.red_arrow.4\",\"mcm.its.dragon.tutorial.component\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.0f,0f,0f,1.0f],translation:[0f,0f,0f],scale:[0.75f,0.75f,0.75f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":373}}}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/375
    private static int f22(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "@n[tag=aj.impossible_dragon.locator.tail_locator]"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/376"), Control.when("score", "@s", "mcm.animation", "matches", "10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/377"), Control.when("score", "@s", "mcm.animation", "matches", "20..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/376
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:0,transformation:{translation:[0f,-1.5f,0f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.tutorial.red_arrow.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:0,transformation:{translation:[0f,1.5f,0f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.tutorial.red_arrow.2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:0,transformation:{translation:[-1.5f,0f,0f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.tutorial.red_arrow.3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:0,transformation:{translation:[1.5f,0f,0f]}}"), Control.when("entity", "@s[tag=mcm.its.dragon.tutorial.red_arrow.4]")));
        return 1;
    }
}
