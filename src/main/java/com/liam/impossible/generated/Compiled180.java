package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled180 {
    public static void register() {
        Logic.register("impossible_to_survive:features/coal/zzz/0", Compiled180::f0);
        Logic.register("impossible_to_survive:features/coal/zzz/1", Compiled180::f1);
        Logic.register("impossible_to_survive:features/coal/zzz/10", Compiled180::f2);
        Logic.register("impossible_to_survive:features/coal/zzz/11", Compiled180::f3);
        Logic.register("impossible_to_survive:features/coal/zzz/12", Compiled180::f4);
        Logic.register("impossible_to_survive:features/coal/zzz/13", Compiled180::f5);
        Logic.register("impossible_to_survive:features/coal/zzz/14", Compiled180::f6);
        Logic.register("impossible_to_survive:features/coal/zzz/2", Compiled180::f7);
        Logic.register("impossible_to_survive:features/coal/zzz/3", Compiled180::f8);
        Logic.register("impossible_to_survive:features/coal/zzz/4", Compiled180::f9);
        Logic.register("impossible_to_survive:features/coal/zzz/5", Compiled180::f10);
        Logic.register("impossible_to_survive:features/coal/zzz/6", Compiled180::f11);
        Logic.register("impossible_to_survive:features/coal/zzz/7", Compiled180::f12);
        Logic.register("impossible_to_survive:features/coal/zzz/8", Compiled180::f13);
        Logic.register("impossible_to_survive:features/coal/zzz/9", Compiled180::f14);
        Logic.register("impossible_to_survive:features/crafting_table/crafting_table_check", Compiled180::f15);
        Logic.register("impossible_to_survive:features/crafting_table/loop", Compiled180::f16);
        Logic.register("impossible_to_survive:features/crafting_table/projectile_loop", Compiled180::f17);
        Logic.register("impossible_to_survive:features/crafting_table/remove", Compiled180::f18);
        Logic.register("impossible_to_survive:features/crafting_table/remove_crafting_table_rocket_launcher", Compiled180::f19);
        Logic.register("impossible_to_survive:features/crafting_table/remove_crafting_table_table", Compiled180::f20);
        Logic.register("impossible_to_survive:features/crafting_table/shoot_projectile", Compiled180::f21);
        Logic.register("impossible_to_survive:features/crafting_table/start_blade_damage", Compiled180::f22);
        Logic.register("impossible_to_survive:features/crafting_table/stop_blade_damage", Compiled180::f23);
    }
    // impossible_to_survive:features/coal/zzz/0
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "coalTimer", "1"));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/1
    private static int f1(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/coal"));
        Logic.step(() -> Native.summon(c, "text_display", "~", "~0.7", "~", "{billboard:\"center\",Tags:[\"coal_display\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[1f,1f,1f]},text:'\"2.5\"'}"));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/10
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"0.4\"'}"), Control.when("score", "@s", "coalTimer", "matches", "45"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"0.3\"'}"), Control.when("score", "@s", "coalTimer", "matches", "47"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"0.2\"'}"), Control.when("score", "@s", "coalTimer", "matches", "49"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"0.1\"'}"), Control.when("score", "@s", "coalTimer", "matches", "51"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/11
    private static int f3(Frame c) {
        Logic.step(() -> Native.particle(c, "smoke", "~", "~0.4", "~", "0", "0", "0", "0.1", "10", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.tripwire.attach", "master", "@a", "~", "~", "~", "1", "1.0"));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/12
    private static int f4(Frame c) {
        Logic.step(() -> Native.particle(c, "smoke", "~", "~0.4", "~", "0", "0", "0", "0.1", "10", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.tripwire.attach", "master", "@a", "~", "~", "~", "1", "1.1"));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/13
    private static int f5(Frame c) {
        Logic.step(() -> Native.particle(c, "smoke", "~", "~0.4", "~", "0", "0", "0", "0.1", "10", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.tripwire.attach", "master", "@a", "~", "~", "~", "1", "1.2"));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/14
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "creeper", "~", "~-1", "~", "{ExplosionRadius:2,Fuse:0}"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "creeper", "~", "~-1", "~", "{ExplosionRadius:3,Fuse:0}"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "creeper", "~", "~-1", "~", "{ExplosionRadius:4,Fuse:0}"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/2
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/3"), Control.when("score", "@s", "coalTimer", "matches", "3..9")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/4"), Control.when("score", "@s", "coalTimer", "matches", "11..19")));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/3
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"2.5\"'}"), Control.when("score", "@s", "coalTimer", "matches", "3"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"2.4\"'}"), Control.when("score", "@s", "coalTimer", "matches", "5"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"2.3\"'}"), Control.when("score", "@s", "coalTimer", "matches", "7"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"2.2\"'}"), Control.when("score", "@s", "coalTimer", "matches", "9"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/4
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"2.1\"'}"), Control.when("score", "@s", "coalTimer", "matches", "11"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"2.0\"'}"), Control.when("score", "@s", "coalTimer", "matches", "13"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"1.9\"'}"), Control.when("score", "@s", "coalTimer", "matches", "15"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"1.8\"'}"), Control.when("score", "@s", "coalTimer", "matches", "17"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"1.7\"'}"), Control.when("score", "@s", "coalTimer", "matches", "19"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/5
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/6"), Control.when("score", "@s", "coalTimer", "matches", "21..27")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/7"), Control.when("score", "@s", "coalTimer", "matches", "29..35")));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/6
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"1.6\"'}"), Control.when("score", "@s", "coalTimer", "matches", "21"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"1.5\"'}"), Control.when("score", "@s", "coalTimer", "matches", "23"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"1.4\"'}"), Control.when("score", "@s", "coalTimer", "matches", "25"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"1.3\"'}"), Control.when("score", "@s", "coalTimer", "matches", "27"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/7
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"1.2\"'}"), Control.when("score", "@s", "coalTimer", "matches", "29"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"1.1\"'}"), Control.when("score", "@s", "coalTimer", "matches", "31"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"1.0\"'}"), Control.when("score", "@s", "coalTimer", "matches", "33"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"0.9\"'}"), Control.when("score", "@s", "coalTimer", "matches", "35"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/8
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/9"), Control.when("score", "@s", "coalTimer", "matches", "37..43")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/coal/zzz/10"), Control.when("score", "@s", "coalTimer", "matches", "45..51")));
        return 1;
    }
    // impossible_to_survive:features/coal/zzz/9
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"0.8\"'}"), Control.when("score", "@s", "coalTimer", "matches", "37"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"0.7\"'}"), Control.when("score", "@s", "coalTimer", "matches", "39"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"0.6\"'}"), Control.when("score", "@s", "coalTimer", "matches", "41"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{text:'\"0.5\"'}"), Control.when("score", "@s", "coalTimer", "matches", "43"), Control.positioned("~", "~0.7", "~"), Control.as("@e[type=text_display,tag=coal_display,limit=1,sort=nearest,distance=..1]")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/crafting_table_check
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/0"), Control.anchored("eyes")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/loop
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/13"), Control.when("entity", "@s[tag=do_blade_damage]")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/projectile_loop
    private static int f17(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.when("score", "@s", "lifetime", "matches", "3..7"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..22]", "eyes"), Control.positioned("^", "^", "^0.1"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.9"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.when("score", "@s", "lifetime", "matches", "8..12"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..22]", "eyes"), Control.positioned("^", "^", "^0.2"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.8"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.when("score", "@s", "lifetime", "matches", "13..17"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..22]", "eyes"), Control.positioned("^", "^", "^0.3"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.7"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.when("score", "@s", "lifetime", "matches", "18..22"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..22]", "eyes"), Control.positioned("^", "^", "^0.4"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.6"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.when("score", "@s", "lifetime", "matches", "23..26"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..22]", "eyes"), Control.positioned("^", "^", "^0.5"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.5"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.when("score", "@s", "lifetime", "matches", "27.."), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable,distance=..22]", "eyes"), Control.positioned("^", "^", "^0.2"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.8"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.35"), Control.at("@s")));
        Logic.step(() -> Native.particle(c, "dust{color:[0.0,0.0,0.0],scale:0.4}", "^", "^", "^-0.05", "0.08", "0.08", "0.08", "0.03", "1", "force"));
        Logic.step(() -> Native.particle(c, "dust{color:[0.4,0.25,0.15],scale:0.9}", "^", "^", "^0.25", "0.05", "0.05", "0.05", "0.03", "3", "force"));
        Logic.step(() -> Native.particle(c, "dust_color_transition{from_color: [0.4f, 0.20f, 0.10f], scale: 0.8f, to_color: [0.1f, 0.05f, 0.05f]}", "^", "^", "^0.1", "0.02", "0.02", "0.02", "0.03", "2", "force"));
        Logic.step(() -> Native.particle(c, "mycelium", "^", "^", "^", "0.05", "0.05", "0.05", "0.03", "1", "force"));
        Logic.step(() -> Native.particle(c, "mycelium", "^", "^", "^0.2", "0.05", "0.05", "0.05", "0.01", "1", "force"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "lifetime", "matches", "100..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/21"), Control.at("@s"), Control.unless("block", "~", "~", "~", "#mcm:passable_and_liquids")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/22"), Control.at("@s"), Control.positioned("~", "~-1.5", "~"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1]")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/remove
    private static int f18(Frame c) {

        return 1;
    }
    // impossible_to_survive:features/crafting_table/remove_crafting_table_rocket_launcher
    private static int f19(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_rocket_launcher/remove/this"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/remove_crafting_table_table
    private static int f20(Frame c) {
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "crafting_table"));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_table/remove/this"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/shoot_projectile
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/19"), Control.rotated("as", "@n[type=item_display,tag=aj.crafting_table_rocket_launcher.root,distance=..0.1]")));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.blaze.shoot", "master", "@a", "~", "~", "~", "2.0", "1.0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/zzz/20"), Control.as("@e[type=marker,tag=crafting_table_projectile,tag=init]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/start_blade_damage
    private static int f22(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "do_blade_damage"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/crafting_table"));
        return 1;
    }
    // impossible_to_survive:features/crafting_table/stop_blade_damage
    private static int f23(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "do_blade_damage"));
        return 1;
    }
}
