package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled208 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/21", Compiled208::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/22", Compiled208::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/23", Compiled208::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/24", Compiled208::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/25", Compiled208::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/26", Compiled208::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/27", Compiled208::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/28", Compiled208::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/29", Compiled208::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/3", Compiled208::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/30", Compiled208::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/31", Compiled208::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/32", Compiled208::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/33", Compiled208::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/34", Compiled208::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/35", Compiled208::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/36", Compiled208::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/37", Compiled208::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/38", Compiled208::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/39", Compiled208::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/4", Compiled208::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/40", Compiled208::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/41", Compiled208::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/42", Compiled208::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/21
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/22"), Control.when("score", "@s", "mcm.animation", "matches", "6..8")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/26"), Control.when("score", "@s", "mcm.animation", "matches", "9..10")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/22
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/23"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/24"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/25"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/23
    private static int f2(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1364899.1934043868", "^-222520.56984033753", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1364899.1934043868", "^222520.56984033753", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/24
    private static int f3(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1212435.8703066693", "^-499999.6226497094", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1212435.8703066693", "^499999.6226497094", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/25
    private static int f4(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^952242.3439354054", "^-733051.533121957", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-952242.3439354054", "^733051.533121957", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/26
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/27"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/28"), Control.when("score", "@s", "mcm.animation", "matches", "10")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/27
    private static int f6(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^607437.9414013532", "^-900968.6248320064", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-607437.9414013532", "^900968.6248320064", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/28
    private static int f7(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^208660.03436625082", "^-988830.7334511237", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-208660.03436625082", "^988830.7334511237", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/29
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/30"), Control.when("score", "@s", "mcm.animation", "matches", "11..15")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/38"), Control.when("score", "@s", "mcm.animation", "matches", "16..20")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/3
    private static int f9(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/impact_f/summon"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/4"), Control.as("@e[type=item_display,tag=mcm.vfx.impact_f,distance=..0.1]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/30
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/31"), Control.when("score", "@s", "mcm.animation", "matches", "11..13")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/35"), Control.when("score", "@s", "mcm.animation", "matches", "14..15")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/31
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/32"), Control.when("score", "@s", "mcm.animation", "matches", "11")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/33"), Control.when("score", "@s", "mcm.animation", "matches", "12")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/34"), Control.when("score", "@s", "mcm.animation", "matches", "13")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/32
    private static int f12(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-208658.22475498405", "^-988830.9282760913", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^208658.22475498405", "^988830.9282760913", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/33
    private static int f13(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-607436.2925819224", "^-900969.1919958629", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^607436.2925819224", "^900969.1919958629", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/34
    private static int f14(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-952241.0024125922", "^-733052.4222297258", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^952241.0024125922", "^733052.4222297258", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/35
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/36"), Control.when("score", "@s", "mcm.animation", "matches", "14")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/37"), Control.when("score", "@s", "mcm.animation", "matches", "15")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/36
    private static int f16(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1212434.9552806134", "^-500000.7547002964", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1212434.9552806134", "^500000.7547002964", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/37
    private static int f17(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1364898.7861791358", "^-222521.8442461208", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1364898.7861791358", "^222521.8442461208", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/38
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/39"), Control.when("score", "@s", "mcm.animation", "matches", "16..18")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/43"), Control.when("score", "@s", "mcm.animation", "matches", "19..20")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/39
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/40"), Control.when("score", "@s", "mcm.animation", "matches", "16")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/41"), Control.when("score", "@s", "mcm.animation", "matches", "17")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/42"), Control.when("score", "@s", "mcm.animation", "matches", "18")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/4
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#fireball_x_rotation", "mcm.temp"), Control.store("result", "entity", "@s", "Rotation[0]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#fireball_y_rotation", "mcm.temp"), Control.store("result", "entity", "@s", "Rotation[1]", "float", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~-8"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/40
    private static int f21(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1396085.4202509895", "^74729.10042490324", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1396085.4202509895", "^-74729.10042490324", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/41
    private static int f22(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1303223.789342996", "^365340.03932210704", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1303223.789342996", "^-365340.03932210704", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/fireball/zzz/42
    private static int f23(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1094565.053470324", "^623488.9258633533", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1094565.053470324", "^-623488.9258633533", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
}
