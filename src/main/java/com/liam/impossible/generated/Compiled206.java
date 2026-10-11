package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled206 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/15", Compiled206::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/16", Compiled206::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/17", Compiled206::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/18", Compiled206::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/19", Compiled206::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/2", Compiled206::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/20", Compiled206::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/21", Compiled206::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/22", Compiled206::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/23", Compiled206::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/24", Compiled206::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/25", Compiled206::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/26", Compiled206::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/27", Compiled206::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/28", Compiled206::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/29", Compiled206::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/3", Compiled206::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/30", Compiled206::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/31", Compiled206::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/32", Compiled206::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/33", Compiled206::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/34", Compiled206::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/4", Compiled206::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/5", Compiled206::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/15
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/16"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/17"), Control.when("score", "@s", "mcm.animation", "matches", "10")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/16
    private static int f1(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^607437.9414013532", "^-900968.6248320064", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-607437.9414013532", "^900968.6248320064", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/17
    private static int f2(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^208660.03436625082", "^-988830.7334511237", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-208660.03436625082", "^988830.7334511237", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/18
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/19"), Control.when("score", "@s", "mcm.animation", "matches", "11..15")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/27"), Control.when("score", "@s", "mcm.animation", "matches", "16..20")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/19
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/20"), Control.when("score", "@s", "mcm.animation", "matches", "11..13")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/24"), Control.when("score", "@s", "mcm.animation", "matches", "14..15")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/2
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/20
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/21"), Control.when("score", "@s", "mcm.animation", "matches", "11")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/22"), Control.when("score", "@s", "mcm.animation", "matches", "12")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/23"), Control.when("score", "@s", "mcm.animation", "matches", "13")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/21
    private static int f7(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-208658.22475498405", "^-988830.9282760913", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^208658.22475498405", "^988830.9282760913", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/22
    private static int f8(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-607436.2925819224", "^-900969.1919958629", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^607436.2925819224", "^900969.1919958629", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/23
    private static int f9(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-952241.0024125922", "^-733052.4222297258", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^952241.0024125922", "^733052.4222297258", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/24
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/25"), Control.when("score", "@s", "mcm.animation", "matches", "14")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/26"), Control.when("score", "@s", "mcm.animation", "matches", "15")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/25
    private static int f11(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1212434.9552806134", "^-500000.7547002964", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1212434.9552806134", "^500000.7547002964", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/26
    private static int f12(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1364898.7861791358", "^-222521.8442461208", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1364898.7861791358", "^222521.8442461208", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/27
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/28"), Control.when("score", "@s", "mcm.animation", "matches", "16..18")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/32"), Control.when("score", "@s", "mcm.animation", "matches", "19..20")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/28
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/29"), Control.when("score", "@s", "mcm.animation", "matches", "16")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/30"), Control.when("score", "@s", "mcm.animation", "matches", "17")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/31"), Control.when("score", "@s", "mcm.animation", "matches", "18")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/29
    private static int f15(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1396085.4202509895", "^74729.10042490324", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1396085.4202509895", "^-74729.10042490324", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/3
    private static int f16(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^0", "^1000000", "^10000000", "0.00000005", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^0", "^-1000000", "^10000000", "0.00000005", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/30
    private static int f17(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1303223.789342996", "^365340.03932210704", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1303223.789342996", "^-365340.03932210704", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/31
    private static int f18(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1094565.053470324", "^623488.9258633533", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1094565.053470324", "^-623488.9258633533", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/32
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/33"), Control.when("score", "@s", "mcm.animation", "matches", "19")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/34"), Control.when("score", "@s", "mcm.animation", "matches", "20")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/33
    private static int f20(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-788649.4493423004", "^826238.1080845064", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^788649.4493423004", "^-826238.1080845064", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/34
    private static int f21(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-412658.9096486329", "^955572.4388349745", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^412658.9096486329", "^-955572.4388349745", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/4
    private static int f22(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^412657.1609015807", "^955572.8241336602", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-412657.1609015807", "^-955572.8241336602", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/5
    private static int f23(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^788647.9372834035", "^826238.844445558", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-788647.9372834035", "^-826238.844445558", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
}
