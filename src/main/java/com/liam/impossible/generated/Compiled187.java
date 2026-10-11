package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled187 {
    public static void register() {
        Logic.register("impossible_to_survive:features/furnace/zzz/33", Compiled187::f0);
        Logic.register("impossible_to_survive:features/furnace/zzz/34", Compiled187::f1);
        Logic.register("impossible_to_survive:features/furnace/zzz/35", Compiled187::f2);
        Logic.register("impossible_to_survive:features/furnace/zzz/36", Compiled187::f3);
        Logic.register("impossible_to_survive:features/furnace/zzz/37", Compiled187::f4);
        Logic.register("impossible_to_survive:features/furnace/zzz/38", Compiled187::f5);
        Logic.register("impossible_to_survive:features/furnace/zzz/39", Compiled187::f6);
        Logic.register("impossible_to_survive:features/furnace/zzz/4", Compiled187::f7);
        Logic.register("impossible_to_survive:features/furnace/zzz/40", Compiled187::f8);
        Logic.register("impossible_to_survive:features/furnace/zzz/41", Compiled187::f9);
        Logic.register("impossible_to_survive:features/furnace/zzz/42", Compiled187::f10);
        Logic.register("impossible_to_survive:features/furnace/zzz/43", Compiled187::f11);
        Logic.register("impossible_to_survive:features/furnace/zzz/44", Compiled187::f12);
        Logic.register("impossible_to_survive:features/furnace/zzz/45", Compiled187::f13);
        Logic.register("impossible_to_survive:features/furnace/zzz/46", Compiled187::f14);
        Logic.register("impossible_to_survive:features/furnace/zzz/47", Compiled187::f15);
        Logic.register("impossible_to_survive:features/furnace/zzz/48", Compiled187::f16);
        Logic.register("impossible_to_survive:features/furnace/zzz/49", Compiled187::f17);
        Logic.register("impossible_to_survive:features/furnace/zzz/5", Compiled187::f18);
        Logic.register("impossible_to_survive:features/furnace/zzz/50", Compiled187::f19);
        Logic.register("impossible_to_survive:features/furnace/zzz/51", Compiled187::f20);
        Logic.register("impossible_to_survive:features/furnace/zzz/52", Compiled187::f21);
        Logic.register("impossible_to_survive:features/furnace/zzz/53", Compiled187::f22);
        Logic.register("impossible_to_survive:features/furnace/zzz/54", Compiled187::f23);
    }
    // impossible_to_survive:features/furnace/zzz/33
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.when("block", "~", "~", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/34
    private static int f1(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/35
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/36"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/37"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/36
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.when("block", "~", "~", "~", "#mcm:passable")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/37
    private static int f4(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/38
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/39"), Control.when("score", "@s", "misc", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/40"), Control.when("score", "@s", "misc", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/41"), Control.when("score", "@s", "misc", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/42"), Control.when("score", "@s", "misc", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/43"), Control.when("score", "@s", "misc", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/44"), Control.when("score", "@s", "misc", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/45"), Control.when("score", "@s", "misc", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/46"), Control.when("score", "@s", "misc", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/47"), Control.when("score", "@s", "misc", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/48"), Control.when("score", "@s", "misc", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/49"), Control.positioned("~", "~", "~1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/52"), Control.positioned("~", "~", "~2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/55"), Control.positioned("~", "~", "~3")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/58"), Control.positioned("~", "~", "~4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/61"), Control.positioned("~", "~", "~5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/64"), Control.positioned("~", "~", "~6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/67"), Control.positioned("~", "~", "~7")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/70"), Control.positioned("~", "~", "~8")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/39
    private static int f6(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.10756139944150829", "~0.09293512299186375", "~0.09669394875371241", "-0.07627277341084722", "0.019318350069703574", "1.0847215162394321", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.05747228304192657", "~-0.10649169991351594", "~0.07268731732976337", "-0.0067186865795831885", "-0.010380131393905812", "1.6368245938475274", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/4
    private static int f7(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.04732629902937715", "~0.001304231346071516", "~-0.1480433521094611", "0.07302125373402739", "-0.0419337847678543", "-1.2403624309701897", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.013312868104580766", "~0.13079947384768267", "~-0.1277378989973116", "-0.08405711864653359", "0.0805147381121084", "-1.6440716522379402", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/40
    private static int f8(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.1053545031733881", "~0.0779955934817262", "~-0.13155662722470798", "0.0734733122607326", "0.09177019938418121", "1.062754186654029", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.1407804135421199", "~-0.09187168166097867", "~0.04755161835467076", "0.048216441715432184", "-0.011250701105366545", "1.7357056859189117", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/41
    private static int f9(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.03603533841204478", "~0.10952197083641665", "~-0.010584612180661757", "-0.048431899257705795", "-0.0697957498605859", "0.8587920859237493", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.046699787876144906", "~-0.09999070392585585", "~0.13165095488512785", "0.02105112672188665", "0.03473603192975285", "1.667775445474915", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/42
    private static int f10(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.11345470900433169", "~-0.13708034430460164", "~-0.11410699935556902", "0.007014718405927267", "-0.02546363387291466", "0.9971635139362225", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.08733851621691997", "~-0.04151436955607446", "~-0.10005758058376335", "-0.06362158426878316", "-0.023805155834303184", "1.2839842658592933", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/43
    private static int f11(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.11352769956067119", "~0.03020422722948486", "~-0.06311222794334599", "-0.02511004095676657", "0.04480106054379403", "0.9816232063064733", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.12985350354667086", "~0.024881599463525084", "~0.03500801685753376", "-0.0669662443293678", "-0.03225956250592726", "1.3133909917754398", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/44
    private static int f12(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.13081192728799598", "~-0.043562027769341635", "~-0.007689313778933049", "-0.0945304121226127", "-0.0066939107030336235", "1.1445972757413294", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.0948131714326519", "~-0.13383764897026235", "~-0.0016366253063456958", "0.02914044466898167", "0.016443999005047782", "1.6066994385052604", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/45
    private static int f13(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.08252227093503425", "~-0.10145639211761483", "~0.13822120051491196", "-0.07252488139018985", "-0.07678101552814276", "1.225659120153888", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.10740280900009781", "~-0.09426019300006468", "~-0.06402539276796013", "0.054639998380172375", "-0.07628904404527576", "1.3976489045173628", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/46
    private static int f14(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.12217489744101939", "~-0.030664273251630902", "~-0.06961087756037822", "0.0644216525578305", "-0.028280215232549245", "1.1533065009343497", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.10299615594295404", "~-0.023362632065035683", "~0.0864969293916191", "0.001419595261789075", "-0.02589647557879764", "1.3429953420040024", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/47
    private static int f15(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.0463658036910505", "~0.0014289008625660404", "~0.10335681457972012", "-0.009286399456452444", "-0.02872624480332644", "1.2254282152977947", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.14375010695983306", "~-0.08941736596846606", "~0.10734164973339326", "-0.07468560260742851", "-0.0770270132832287", "1.5804073559520118", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/48
    private static int f16(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~0.040235319840528125", "~-0.13214052855990147", "~0.09228059256110933", "-0.09577086522045351", "-0.050179172672549614", "0.9018098393195182", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~-0.07598986737245635", "~0.08395216612754768", "~-0.07827123025991505", "0.021045979894880953", "-0.06390882637671838", "1.5420315343139421", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/49
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/50"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/51"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/5
    private static int f18(Frame c) {
        Logic.step(() -> Native.particle(c, "flame", "~-0.1463205520904634", "~-0.001480604572474986", "~0.05201221061721295", "-0.08551514741675428", "0.08219037874228544", "-0.9487679373658792", "0.3", "0", "force"));
        Logic.step(() -> Native.particle(c, "flame", "~0.0612502734122307", "~0.1414146008191095", "~-0.04502716956432753", "0.002002671704297088", "0.07662761743074174", "-1.404329609010404", "0.3", "0", "force"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/50
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/51
    private static int f20(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/52
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/53"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/furnace/zzz/54"), Control.unless("block", "~", "~", "~", "#impossible_to_survive:air_or_fire_or_non_destructible_or_water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/53
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "lava", "~", "~", "~", "0.3", "0.3", "0.3", "0.05", "1"), Control.when("predicate", "impossible_to_survive:random/5_percent")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "3", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "5", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "8", "minecraft:on_fire"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.setblock(x0, "~", "~", "~", "fire"), Control.unless("block", "~", "~", "~", "water")));
        return 1;
    }
    // impossible_to_survive:features/furnace/zzz/54
    private static int f23(Frame c) {
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~", "~", "0.3", "0.3", "0.3", "0.1", "5", "force"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air", "destroy"));
        return 1;
    }
}
