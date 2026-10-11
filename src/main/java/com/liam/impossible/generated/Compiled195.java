package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled195 {
    public static void register() {
        Logic.register("impossible_to_survive:features/scarecrow/zzz/10", Compiled195::f0);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/11", Compiled195::f1);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/12", Compiled195::f2);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/13", Compiled195::f3);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/14", Compiled195::f4);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/15", Compiled195::f5);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/16", Compiled195::f6);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/17", Compiled195::f7);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/18", Compiled195::f8);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/19", Compiled195::f9);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/2", Compiled195::f10);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/20", Compiled195::f11);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/21", Compiled195::f12);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/22", Compiled195::f13);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/23", Compiled195::f14);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/24", Compiled195::f15);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/25", Compiled195::f16);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/26", Compiled195::f17);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/27", Compiled195::f18);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/3", Compiled195::f19);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/4", Compiled195::f20);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/5", Compiled195::f21);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/6", Compiled195::f22);
        Logic.register("impossible_to_survive:features/scarecrow/zzz/7", Compiled195::f23);
    }
    // impossible_to_survive:features/scarecrow/zzz/10
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "smoke", "~", "~", "~", "0", "0", "0", "0.01", "1", "force"), Control.when("predicate", "mcm:random/25_percent")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/11
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[1.5f,0.75f,0f],scale:[1f,1f,1f]}}"), Control.when("entity", "@s[tag=crow1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-2f,1.25f,0f],scale:[1f,1f,1f]}}"), Control.when("entity", "@s[tag=crow2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[2.5f,1.85f,0f],scale:[1f,1f,1f]}}"), Control.when("entity", "@s[tag=crow3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-3.0f,1.85f,0f],scale:[1f,1f,1f]}}"), Control.when("entity", "@s[tag=crow4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[3.5f,1.85f,0f],scale:[1f,1f,1f]}}"), Control.when("entity", "@s[tag=crow5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-4.0f,1.85f,0f],scale:[1f,1f,1f]}}"), Control.when("entity", "@s[tag=crow6]")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/12
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[1.5f,0.75f,0f],scale:[0f,0f,0f]}}"), Control.when("entity", "@s[tag=crow1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-2f,1.25f,0f],scale:[0f,0f,0f]}}"), Control.when("entity", "@s[tag=crow2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[2.5f,1.85f,0f],scale:[0f,0f,0f]}}"), Control.when("entity", "@s[tag=crow3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-3.0f,1.85f,0f],scale:[0f,0f,0f]}}"), Control.when("entity", "@s[tag=crow4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[3.5f,1.85f,0f],scale:[0f,0f,0f]}}"), Control.when("entity", "@s[tag=crow5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:10,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[-4.0f,1.85f,0f],scale:[0f,0f,0f]}}"), Control.when("entity", "@s[tag=crow6]")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/13
    private static int f3(Frame c) {
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/14
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/15"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "0..6"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/18"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "7..13"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/15
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/16"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "0..3"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/17"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "4..6"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/16
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.104", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "1"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.2035", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "2"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.294", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "3"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/17
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.3715", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "4"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.433", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "5"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.4755", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "6"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/18
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/19"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "7..10"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/20"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "11..13"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/19
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.4975", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "7"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.4975", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "8"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.4755", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "9"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.433", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "10"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/2
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.iterations", "40"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/3"), Control.when("block", "~", "~", "~", "#impossible_to_survive:farmable_block")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/20
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.3715", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "11"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.294", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "12"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.2035", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "13"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/21
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/22"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "14..21"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/25"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "22..29"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/22
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/23"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "14..17"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/24"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "18..21"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/23
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0.104", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "14"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~0", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "15"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.104", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "16"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.2035", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "17"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/24
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.294", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "18"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.3715", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "19"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.433", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "20"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.4755", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "21"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/25
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/26"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "22..25"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/27"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "26..29"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/26
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.4975", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "22"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.4975", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "23"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.4755", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "24"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.433", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "25"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/27
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.3715", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "26"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.294", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "27"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.2035", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "28"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~-0.104", "~"), Control.when("score", "@s", "blaze_rod_y_timer", "matches", "29"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/3
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/summon"), Control.align("xyz"), Control.positioned("~0.5", "~", "~0.5")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/4
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0", "~", "~"), Control.at("@s"), Control.anchored("eyes"), Control.facing("entity", "@p[distance=..15,tag=survivor,predicate=mcm:gm/vulnerable]", "eyes"), Control.positioned("^", "^", "^0.2"), Control.rotated("as", "@s"), Control.positioned("^", "^", "^0.8"), Control.facing("entity", "@s", "eyes"), Control.facing("^", "^", "^-1"), Control.positioned("as", "@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/5
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{interpolation_duration:5,start_interpolation:1,transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.7f,0f],scale:[1f,1f,1f]}}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/scarecrow/crow_summon"));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/6
    private static int f22(Frame c) {
        Logic.step(() -> Native.kill(c, "@e[type=item_display,tag=crow,distance=..1]"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:features/scarecrow/zzz/7
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "scarecrow_damage_timer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/zzz/8"), Control.as("@a[distance=..5,tag=survivor,predicate=mcm:gm/vulnerable]")));
        return 1;
    }
}
