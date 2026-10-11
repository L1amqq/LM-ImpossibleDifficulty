package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled243 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/85", Compiled243::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/86", Compiled243::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/87", Compiled243::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/88", Compiled243::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/89", Compiled243::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/9", Compiled243::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/90", Compiled243::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/91", Compiled243::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/92", Compiled243::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/93", Compiled243::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/94", Compiled243::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/95", Compiled243::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/96", Compiled243::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/97", Compiled243::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/98", Compiled243::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/zzz/99", Compiled243::f15);
        Logic.register("impossible_to_survive:mobs/land_shark/ai_loop", Compiled243::f16);
        Logic.register("impossible_to_survive:mobs/land_shark/anim_start_idle", Compiled243::f17);
        Logic.register("impossible_to_survive:mobs/land_shark/anim_start_walk", Compiled243::f18);
        Logic.register("impossible_to_survive:mobs/land_shark/apply_spawn_motion", Compiled243::f19);
        Logic.register("impossible_to_survive:mobs/land_shark/attempt_summon", Compiled243::f20);
        Logic.register("impossible_to_survive:mobs/land_shark/damage", Compiled243::f21);
        Logic.register("impossible_to_survive:mobs/land_shark/kill", Compiled243::f22);
        Logic.register("impossible_to_survive:mobs/land_shark/loop", Compiled243::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/85
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/86"), Control.positioned("^", "^0.5", "^-8.5"), Control.at("@n[tag=aj.impossible_dragon.locator.tail_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/86
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~0.5", "~", "0.4", "0.4", "0.4", "0.05", "1", "force"), Control.when("predicate", "mcm:random/25_percent")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/tail_lightning"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/87
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/88"), Control.positioned("^", "^", "^-20"), Control.as("@n[tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/88
    private static int f3(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/deactivate"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/89
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/90"), Control.positioned("^", "^0.5", "^-8.5"), Control.as("@n[tag=aj.impossible_dragon.locator.tail_locator]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/91"), Control.positioned("^", "^", "^-20"), Control.as("@n[tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/9
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.forceload(x0, "add", "~", "~"), Control.dimension("minecraft:the_end")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/90
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]"), Control.store("result", "score", "#temp", "mcm.position.y")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "#temp", "mcm.position.y", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]"), Control.store("result", "storage", "mcm:temp", "position.x", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#temp", "mcm.position.y"), Control.store("result", "storage", "mcm:temp", "position.y", "double", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]"), Control.store("result", "storage", "mcm:temp", "position.z", "double", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/91
    private static int f7(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_vulnerable"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/92"), Control.as("@n[type=end_crystal]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/92
    private static int f8(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/set_beam_target", "with", "storage", "mcm:temp", "position"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/93
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/94"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "103")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/98"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "111"), Control.unless("entity", "@s[tag=mcm.its.dragon.crystal_healing_interrupted]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/100"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "21..102"), Control.when("entity", "@s[tag=mcm.its.dragon.crystal_healing_interrupted]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/102"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "124")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/103"), Control.when("score", "@s", "mcm.its.dragon.activity.timer", "matches", "114..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/94
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/95"), Control.positioned("^", "^", "^-20"), Control.as("@n[tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/95
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/96"), Control.unless("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.destroyed]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/96
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/97"), Control.as("@e[type=end_crystal,distance=..1]"), Control.at("@s")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_invulnerable"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/activate"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/97
    private static int f13(Frame c) {
        Logic.step(() -> Native.summon(c, "end_crystal", "~", "~", "~", "{ShowBottom:1b}"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/98
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/99"), Control.positioned("^", "^-7", "^-2"), Control.at("@n[tag=aj.impossible_dragon.locator.tail_locator]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/zzz/99
    private static int f15(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/ability/heal/shoot_lightning_forward"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/ai_loop
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s[nbt={Motion:[0.0,0.0,0.0]},scores={moveTimer=..6}]", "moveTimer", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s[scores={moveTimer=1..}]", "moveTimer", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/anim_start_idle
    private static int f17(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/animations/idle/tween", "{to_frame:0,duration:2}"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "isMoving"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/anim_start_walk
    private static int f18(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/animations/walk/tween", "{to_frame:0,duration:2}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "isMoving"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/apply_spawn_motion
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "^", "^", "^-0.1", "{Tags:[\"land_shark_motion\"]}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1000"), Control.store("result", "score", "@s", "x")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1000"), Control.store("result", "score", "@s", "y")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1000"), Control.store("result", "score", "@s", "z")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@e[type=marker,tag=land_shark_motion,limit=1,sort=nearest]", "Pos[0]", "1000"), Control.store("result", "score", "@s", "dx")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@e[type=marker,tag=land_shark_motion,limit=1,sort=nearest]", "Pos[1]", "1000"), Control.store("result", "score", "@s", "dy")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@e[type=marker,tag=land_shark_motion,limit=1,sort=nearest]", "Pos[2]", "1000"), Control.store("result", "score", "@s", "dz")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=land_shark_motion,distance=..10]"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "dx", "-=", "@s", "x"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "dy", "-=", "@s", "y"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "dy", "70"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "dz", "-=", "@s", "z"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dx"), Control.store("result", "entity", "@s", "Motion[0]", "double", "-0.015")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dy"), Control.store("result", "entity", "@s", "Motion[1]", "double", "-0.01")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "dz"), Control.store("result", "entity", "@s", "Motion[2]", "double", "-0.015")));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/attempt_summon
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"land_shark_spawn_point\"]}"), Control.positioned("~", "~", "~3"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"land_shark_spawn_point\"]}"), Control.positioned("~", "~", "~-3"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"land_shark_spawn_point\"]}"), Control.positioned("~-3", "~", "~"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"land_shark_spawn_point\"]}"), Control.positioned("~3", "~", "~"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"land_shark_spawn_point\"]}"), Control.positioned("~2", "~", "~2"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"land_shark_spawn_point\"]}"), Control.positioned("~-2", "~", "~-2"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"land_shark_spawn_point\"]}"), Control.positioned("~2", "~", "~-2"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"land_shark_spawn_point\"]}"), Control.positioned("~-2", "~", "~2"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/zzz/0"), Control.as("@e[type=marker,tag=land_shark_spawn_point]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/zzz/1"), Control.as("@e[type=marker,tag=land_shark_spawn_point,sort=nearest,limit=1]"), Control.at("@s"), Control.positioned("~", "~1.3", "~")));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=land_shark_spawn_point,sort=random,limit=1]"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/damage
    private static int f21(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.armadillo.hurt", "master", "@a", "~", "~", "~", "0.2", "0.3"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:cyan_dye\"}", "~", "~0.15", "~", "0.2", "0.2", "0.2", "0.1", "10", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mobHealth", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/kill"), Control.when("entity", "@s[scores={mobHealth=..0}]")));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/kill
    private static int f22(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.phantom.death", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/remove/this"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/zzz/3"), Control.as("@e[type=zoglin,tag=land_shark_ai,limit=1,sort=nearest,tag=this_land_shark_ai]"), Control.at("@s")));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~0.75", "~", "0.2", "0.2", "0.2", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:cyan_dye\"}", "~", "~0.15", "~", "0.2", "0.2", "0.2", "0.1", "20", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~0.3", "~", "0.2", "0.2", "0.2", "0.05", "2", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/land_shark/loop
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.id", "=", "@s", "aj.id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/zzz/4"), Control.as("@e[type=zoglin,tag=land_shark_ai,distance=..20]"), Control.when("score", "@s", "aj.id", "=", "#this", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/land_shark/ai_loop"), Control.as("@e[type=zoglin,tag=land_shark_ai,distance=..1,sort=nearest,tag=this_land_shark_ai]")), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/kill"), Control.unless("entity", "@e[type=zoglin,tag=land_shark_ai,distance=..10,sort=nearest,tag=this_land_shark_ai]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/damage"), Control.when("entity", "@e[type=zoglin,tag=land_shark_ai,tag=this_land_shark_ai,distance=..2,nbt={HurtTime:10s},limit=1]")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "isMoving", "1"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "isMoving", "0"), Control.at("@e[type=zoglin,tag=land_shark_ai,distance=..0.1,tag=this_land_shark_ai,sort=nearest,limit=1,scores={moveTimer=3..}]")), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/anim_start_walk"), Control.when("entity", "@s[scores={isMoving=1},tag=!isMoving]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/anim_start_idle"), Control.when("entity", "@s[scores={isMoving=0},tag=isMoving]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/zzz/5"), Control.unless("entity", "@a[distance=..50]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/zzz/7"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:water")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/zzz/9"), Control.as("@e[type=zoglin,tag=land_shark_ai,distance=..1,sort=nearest,tag=this_land_shark_ai]")));
        return 1;
    }
}
