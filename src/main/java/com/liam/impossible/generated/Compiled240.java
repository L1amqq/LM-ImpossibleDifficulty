package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled240 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/399", Compiled240::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/4", Compiled240::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/40", Compiled240::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/400", Compiled240::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/401", Compiled240::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/402", Compiled240::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/403", Compiled240::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/404", Compiled240::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/405", Compiled240::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/406", Compiled240::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/407", Compiled240::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/408", Compiled240::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/409", Compiled240::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/41", Compiled240::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/410", Compiled240::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/411", Compiled240::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/412", Compiled240::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/413", Compiled240::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/414", Compiled240::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/415", Compiled240::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/416", Compiled240::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/417", Compiled240::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/418", Compiled240::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/419", Compiled240::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/399
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/set_half_damaged"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/state/set_undamaged"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/4
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.its.dragon.setup.state", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.forceload(x0, "add", "0", "0"), Control.dimension("minecraft:the_end")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/5"), Control.as("@e[type=ender_dragon]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/40
    private static int f2(Frame c) {
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint.active]", "remove", "mcm.its.dragon_environment.waypoint.active"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.waypoint,sort=random,limit=1,distance=35..]", "add", "mcm.its.dragon_environment.waypoint.active"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/400
    private static int f3(Frame c) {
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "visible", "true"));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "players", "@a[distance=..300]"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "mcm.its.dragon.health"), Control.store("result", "bossbar", "minecraft:impossible_dragon", "value")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/401
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.safety_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/402"), Control.when("score", "@s", "mcm.its.dragon.safety_timer", "matches", "20..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/402
    private static int f5(Frame c) {
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.its.dragon.laser_target.marker]"));
        Logic.step(() -> Native.kill(c, "@e[type=item_display,tag=mcm.vfx.target_indicator_a]"));
        Logic.step(() -> Native.kill(c, "@e[type=item_display,tag=mcm.vfx.impact_m]"));
        Logic.step(() -> Native.kill(c, "@e[type=item_display,tag=mcm.vfx.flash_g]"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/403"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "5"), Control.positioned("^", "^", "^-20"), Control.as("@n[tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@e[type=item_display,tag=mcm.vfx.flash_d]"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_healing_interrupted"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Native.tag(c, "@e[type=marker,tag=mcm.its.dragon_environment.heal_point.active]", "remove", "mcm.its.dragon_environment.heal_point.active"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.sub_activity", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.activity.timer", "0"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_seek_healing"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_stage_transition"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.initiate_death_flying"));
        Logic.step(() -> Native.kill(c, "@e[tag=mcm.its.dragon.forcefield_rotating]"));
        Logic.step(() -> Native.stopsound(c, "@a", "master", "minecraft:dragon.attack_forcefield"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.crystal_tail.protected"));
        Logic.step(() -> Native.kill(c, "91bb5-0-0-0-ffff"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/activity/start_random_flying"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/403
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/404"), Control.unless("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.destroyed]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/404
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/405"), Control.as("@e[type=end_crystal,distance=..1]"), Control.at("@s")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_invulnerable"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/activate"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/405
    private static int f8(Frame c) {
        Logic.step(() -> Native.summon(c, "end_crystal", "~", "~", "~", "{ShowBottom:1b}"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/406
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "mcm.its.dragon.player.near_ground"), Control.positioned("~-300", "~-7", "~-300"), Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.exit_portal_center,dx=600,dy=20,dz=600]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/407
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.height_fog_level", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]"), Control.store("result", "score", "@s", "mcm.position.y")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/408"), Control.when("score", "@s", "mcm.position.y", ">=", "#global", "mcm.its.dragon.height_fog_limit_1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/408
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.height_fog_level", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/409"), Control.when("score", "@s", "mcm.position.y", ">=", "#global", "mcm.its.dragon.height_fog_limit_2")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/409
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.height_fog_level", "2"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/41
    private static int f13(Frame c) {

        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/410
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/411"), Control.unless("score", "@s", "mcm.its.dragon.fog_timer", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/412"), Control.when("score", "@s", "mcm.its.dragon.height_fog_level", "matches", "1.."), Control.when("entity", "@s[x=0,y=65,z=0,distance=..200]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/411
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "@s", "mcm.its.dragon.fog_timer", "1"), Control.when("score", "@s", "mcm.its.dragon.fog_timer", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.its.dragon.fog_timer", "0"), Control.unless("score", "@s", "mcm.its.dragon.height_fog_level", "matches", "1.."), Control.when("score", "@s", "mcm.its.dragon.fog_timer", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/412
    private static int f16(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/height_fog/y_limit_particles", "with", "storage", "mcm:impossible_dragon"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/413"), Control.when("score", "@s", "mcm.its.dragon.height_fog_level", "matches", "2..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/413
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.its.dragon.fog_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/414"), Control.when("score", "@s", "mcm.its.dragon.fog_timer", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/415"), Control.when("score", "@s", "mcm.its.dragon.fog_timer", "matches", "10..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/414
    private static int f18(Frame c) {
        Logic.step(() -> Native.title(c, "@s", "times", "10t", "2t", "5t"));
        Logic.step(() -> Native.title(c, "@s", "title", "{\"text\":\"\\uE002\",\"color\":\"#4e5c24\",\"font\":\"minecraft:height_fog\"}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/415
    private static int f19(Frame c) {
        Logic.step(() -> Native.title(c, "@s", "times", "0t", "2t", "5t"));
        Logic.step(() -> Native.title(c, "@s", "title", "{\"text\":\"\\uE002\",\"color\":\"#4e5c24\",\"font\":\"minecraft:height_fog\"}"));
        Logic.step(() -> Native.particle(c, "dust_color_transition{from_color: [0.8f, 0.0f, 0.8f], scale: 0.9f, to_color: [0.95f, 0.5f, 0.95f]}", "~", "~1.25", "~", "0.5", "1.0", "0.5", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "dust_color_transition{from_color: [0.9f, 0.0f, 0.9f], scale: 1.2f, to_color: [1.0f, 0.4f, 1.0f]}", "~", "~1.75", "~", "3.5", "2.5", "3.5", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "witch", "~", "~1", "~", "0.5", "1.0", "0.5", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "witch", "~", "~2", "~", "3.5", "3.0", "3.5", "0.1", "1", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/416"), Control.when("score", "@s", "mcm.its.dragon.fog_timer", "matches", "81..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/416
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/417"), Control.unless("score", "@s", "mcm.its.dragon.hint.height_fog", "matches", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mcm.its.dragon.fog_timer", "30"));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{CustomName:'\"Dragon Fog\"',Tags:[\"mcm.death_message_marker\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "6", "minecraft:mob_attack", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:mob_attack", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:mob_attack", "by", "@n[type=marker,tag=mcm.death_message_marker]"), Control.when("score", "#difficulty", "mcm.its.dragon.settings", "matches", "3")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=mcm.death_message_marker]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/417
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.hint.height_fog", "1"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u002a\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\" Hint:\",\"bold\":true,\"color\":\"#d9d134\",\"font\":\"minecraft:default\"},{\"text\":\" Staying at high altitudes for too long inflicts damage. Always return to the ground in time!\",\"color\":\"aqua\",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/display_hint"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/418
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "mcm.its.dragon.initiate_stage_transition"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "2..3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/419"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/419
    private static int f23(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.initiate_death_flying"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/420"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "15"), Control.when("score", "@s", "mcm.its.dragon.sub_activity", "matches", "1"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "20..")));
        return 1;
    }
}
