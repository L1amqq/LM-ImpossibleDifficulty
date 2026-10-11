package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled191 {
    public static void register() {
        Logic.register("impossible_to_survive:features/lava_wave/collide", Compiled191::f0);
        Logic.register("impossible_to_survive:features/lava_wave/spawn_check_3t", Compiled191::f1);
        Logic.register("impossible_to_survive:features/lava_wave/wave_init", Compiled191::f2);
        Logic.register("impossible_to_survive:features/lava_wave/wave_loop", Compiled191::f3);
        Logic.register("impossible_to_survive:features/lava_wave/wave_particles", Compiled191::f4);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/0", Compiled191::f5);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/1", Compiled191::f6);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/10", Compiled191::f7);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/11", Compiled191::f8);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/12", Compiled191::f9);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/13", Compiled191::f10);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/14", Compiled191::f11);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/2", Compiled191::f12);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/3", Compiled191::f13);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/4", Compiled191::f14);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/5", Compiled191::f15);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/6", Compiled191::f16);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/7", Compiled191::f17);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/8", Compiled191::f18);
        Logic.register("impossible_to_survive:features/lava_wave/zzz/9", Compiled191::f19);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/neg_y", Compiled191::f20);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/obsidian/neg_x", Compiled191::f21);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/obsidian/neg_z", Compiled191::f22);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/obsidian/pos_x", Compiled191::f23);
    }
    // impossible_to_survive:features/lava_wave/collide
    private static int f0(Frame c) {
        Logic.step(() -> Native.particle(c, "lava", "~", "~1", "~", "1", "1", "1", "0.1", "20", "force"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "1", "1", "1", "0.1", "20", "force"));
        Logic.step(() -> Logic.call(c, "animated_java:lava_wave/remove/this"));
        Logic.step(() -> Native.fill(c, "^-2", "^-2", "^-2", "^2", "^2", "^2", "magma_block", "replace", "#impossible_to_survive:lava_wave_magma_replace_finish"));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/spawn_check_3t
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s[scores={wave_spawn_cooldown=1..}]", "wave_spawn_cooldown", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("score", "@s", "wave_spawn_cooldown", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/0"), Control.rotated("~", "0"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5")));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/wave_init
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@p", "wave_spawn_cooldown", "15"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/lava_wave"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable]"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/6"), Control.at("@s"), Control.positioned("~", "~1", "~")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/wave_loop
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/7"), Control.when("score", "@s", "lifetime", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/8"), Control.when("score", "@s", "lifetime", "matches", "10")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.1"), Control.when("score", "@s", "lifetime", "matches", "10..18")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.3"), Control.when("score", "@s", "lifetime", "matches", "19..35")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.35"), Control.when("score", "@s", "lifetime", "matches", "36..45")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.3"), Control.when("score", "@s", "lifetime", "matches", "46..55")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.25"), Control.when("score", "@s", "lifetime", "matches", "56..65")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.2"), Control.when("score", "@s", "lifetime", "matches", "66..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/9"), Control.when("score", "@s", "lifetime", "matches", "20..32")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/10"), Control.when("score", "@s", "lifetime", "matches", "10..86")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/13"), Control.when("score", "@s", "lifetime", "matches", "10..86")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/remove/this"), Control.when("score", "@s", "lifetime", "matches", "90..")));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/wave_particles
    private static int f4(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "^4", "^2", "^2", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "flame", "^4", "^1.5", "^", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "flame", "^4", "^0", "^-1", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "flame", "^4", "^-1", "^-2.5", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "lava", "^4", "^2", "^2", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "lava", "^4", "^2", "^", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "lava", "^4", "^0.5", "^-1", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "lava", "^4", "^-0.5", "^-2.5", "0.2", "0.2", "0.2", "0.01", "2", "force"));
        Logic.step(() -> Native.particle(c, "flame", "^-4", "^2", "^2", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "flame", "^-4", "^1.5", "^", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "flame", "^-4", "^0", "^-1", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "flame", "^-4", "^-1", "^-2.5", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "lava", "^-4", "^2", "^2", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "lava", "^-4", "^2", "^", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "lava", "^-4", "^0.5", "^-1", "0.2", "0.2", "0.2", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "lava", "^-4", "^-0.5", "^-2.5", "0.2", "0.2", "0.2", "0.01", "2", "force"));
        Logic.step(() -> Native.particle(c, "lava", "^", "^1", "^2", "1.7", "1.7", "1.7", "0.01", "5", "force"));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/0
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/1"), Control.rotated("~0", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/2"), Control.rotated("~90", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/3"), Control.rotated("~180", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/4"), Control.rotated("~270", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/5"), Control.as("@e[type=marker,tag=lava_wave_init,limit=1,sort=nearest]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@e[type=marker,tag=lava_wave_init,distance=..14]"), Control.as("@e[type=item_display,tag=aj.lava_wave.root]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/1
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^-3", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-3", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^-3", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-3", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^-3", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^-2", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-2", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^-2", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-2", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^-2", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^-1", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-1", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^-1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-1", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^-1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^0", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^0", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^0", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^0", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^0", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^1", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^1", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^1", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/10
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/collide"), Control.unless("block", "^", "^2", "^1.25", "#impossible_to_survive:passable"), Control.unless("block", "^", "^1", "^1.25", "#impossible_to_survive:passable"), Control.unless("block", "^", "^", "^1.25", "#impossible_to_survive:passable")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/collide"), Control.when("block", "^", "^-3", "^1.25", "#impossible_to_survive:passable"), Control.when("block", "^", "^-2", "^1.25", "#impossible_to_survive:passable"), Control.when("block", "^", "^-1", "^1.25", "#impossible_to_survive:passable")));
        Logic.step(() -> Native.fill(c, "^-2", "^-1", "^-0.5", "^-2", "^-2", "^0.5", "magma_block", "replace", "#impossible_to_survive:lava_wave_magma_replace"));
        Logic.step(() -> Native.fill(c, "^-1", "^-1", "^-0.5", "^-1", "^-2", "^0.5", "magma_block", "replace", "#impossible_to_survive:lava_wave_magma_replace"));
        Logic.step(() -> Native.fill(c, "^", "^-1", "^-0.5", "^", "^-2", "^1", "magma_block", "replace", "#impossible_to_survive:lava_wave_magma_replace"));
        Logic.step(() -> Native.fill(c, "^1", "^-1", "^-0.5", "^1", "^-2", "^0.5", "magma_block", "replace", "#impossible_to_survive:lava_wave_magma_replace"));
        Logic.step(() -> Native.fill(c, "^2", "^-1", "^-0.5", "^2", "^-2", "^0.5", "magma_block", "replace", "#impossible_to_survive:lava_wave_magma_replace"));
        Logic.step(() -> Native.fill(c, "^-1", "^", "^1", "^-1", "^2", "^1", "air", "replace", "#impossible_to_survive:not_fire_block"));
        Logic.step(() -> Native.fill(c, "^", "^", "^1", "^", "^2", "^1", "air", "replace", "#impossible_to_survive:not_fire_block"));
        Logic.step(() -> Native.fill(c, "^1", "^", "^1", "^1", "^2", "^1", "air", "replace", "#impossible_to_survive:not_fire_block"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/11"), Control.as("@a[distance=..2,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/11
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "lava_wave_hit_cd", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/12"), Control.when("entity", "@s[scores={lava_wave_hit_cd=0},tag=survivor,predicate=mcm:gm/vulnerable]")));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/12
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~-1", "~", "#impossible_to_survive:passable"), Control.when("block", "~", "~", "~", "#mcm:air")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "lava_wave_hit_cd", "20"));
        Logic.step(() -> Native.particle(c, "lava", "~", "~1", "~", "0.3", "0.6", "0.3", "0.1", "10", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~", "~1", "~", "0.3", "0.6", "0.3", "0.1", "10", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.blaze.hurt", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:generic"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "10", "minecraft:generic"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "15", "minecraft:generic"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/13
    private static int f10(Frame c) {
        Logic.step(() -> Native.particle(c, "lava", "^", "^0.25", "^0.5", "0.7", "0.2", "0.7", "0.01", "1", "force"));
        Logic.step(() -> Native.particle(c, "flame", "^", "^0.25", "^-0.5", "0.8", "0.2", "0.8", "0.01", "1", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/zzz/14"), Control.as("@e[type=#impossible_to_survive:mobs,distance=..2]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/14
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{Fire:100s}"));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/2
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^-3", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-3", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^-3", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-3", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^-3", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^-2", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-2", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^-2", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-2", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^-2", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^-1", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-1", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^-1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-1", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^-1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^0", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^0", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^0", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^0", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^0", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^1", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^1", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^1", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/3
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^-3", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-3", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^-3", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-3", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^-3", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^-2", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-2", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^-2", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-2", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^-2", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^-1", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-1", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^-1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-1", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^-1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^0", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^0", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^0", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^0", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^0", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^1", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^1", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^1", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/4
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^-3", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-3", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^-3", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-3", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^-3", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^-2", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-2", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^-2", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-2", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^-2", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^-1", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-1", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^-1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^-1", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^-1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^0", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^0", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^0", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^0", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^0", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^-1", "^1", "^2"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^1", "^3"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^1", "^1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^", "^1", "^6"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[lava_wave_init]}"), Control.positioned("^4", "^1", "^4"), Control.when("block", "~", "~", "~", "lava"), Control.when("block", "~", "~1", "~", "#impossible_to_survive:air")));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/5
    private static int f15(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "dont_kill"));
        Logic.step(() -> Native.kill(c, "@e[type=marker,tag=lava_wave_init,tag=!dont_kill]"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "dont_kill"));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/6
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/summon", "{args:{}}"), Control.positioned("~", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/animations/crash/play"), Control.positioned("~", "~", "~"), Control.as("@n[type=item_display,tag=aj.lava_wave.root,distance=..0.1]")));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/7
    private static int f17(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:block.lava.ambient", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~"));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/8
    private static int f18(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.illusioner.cast_spell", "master", "@a", "~", "~", "~", "2.0", "0.8"));
        return 1;
    }
    // impossible_to_survive:features/lava_wave/zzz/9
    private static int f19(Frame c) {
        Logic.step(() -> Native.fill(c, "^-1.5", "^-1", "^-0.5", "^-1", "^-1", "^-0.5", "lava", "replace", "#impossible_to_survive:lava_wave_magma_replace"));
        Logic.step(() -> Native.fill(c, "^-1", "^-1", "^-0.5", "^-1", "^-1", "^-0.5", "lava", "replace", "#impossible_to_survive:lava_wave_magma_replace"));
        Logic.step(() -> Native.fill(c, "^", "^-1", "^-0.5", "^-1", "^-1", "^0.5", "lava", "replace", "#impossible_to_survive:lava_wave_magma_replace"));
        Logic.step(() -> Native.fill(c, "^1", "^-1", "^-0.5", "^-1", "^-1", "^-0.5", "lava", "replace", "#impossible_to_survive:lava_wave_magma_replace"));
        Logic.step(() -> Native.fill(c, "^1.5", "^-1", "^-0.5", "^-1", "^-1", "^-0.5", "lava", "replace", "#impossible_to_survive:lava_wave_magma_replace"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/neg_y
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/zzz/2"), Control.positioned("~", "~-1", "~")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/obsidian/neg_x
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/obsidian/zzz/3"), Control.positioned("~-1", "~", "~"), Control.when("block", "~", "~", "~", "obsidian")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/obsidian/neg_z
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/obsidian/zzz/1"), Control.positioned("~", "~", "~-1"), Control.when("block", "~", "~", "~", "obsidian")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/obsidian/pos_x
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/obsidian/zzz/2"), Control.positioned("~1", "~", "~"), Control.when("block", "~", "~", "~", "obsidian")));
        return 1;
    }
}
