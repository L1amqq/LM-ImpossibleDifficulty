package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled119 {
    public static void register() {
        Logic.register("animated_java:land_shark/animations/idle/zzz/frames/8", Compiled119::f0, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/idle/zzz/frames/9", Compiled119::f1, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/idle/zzz/on_tick", Compiled119::f2);
        Logic.register("animated_java:land_shark/animations/idle/zzz/set_frame", Compiled119::f3, "frame");
        Logic.register("animated_java:land_shark/animations/idle/zzz/zzz/0", Compiled119::f4);
        Logic.register("animated_java:land_shark/animations/idle/zzz/zzz/1", Compiled119::f5);
        Logic.register("animated_java:land_shark/animations/pause_all", Compiled119::f6);
        Logic.register("animated_java:land_shark/animations/walk/apply_frame", Compiled119::f7, "frame");
        Logic.register("animated_java:land_shark/animations/walk/next_frame", Compiled119::f8);
        Logic.register("animated_java:land_shark/animations/walk/pause", Compiled119::f9);
        Logic.register("animated_java:land_shark/animations/walk/play", Compiled119::f10);
        Logic.register("animated_java:land_shark/animations/walk/resume", Compiled119::f11);
        Logic.register("animated_java:land_shark/animations/walk/set_frame", Compiled119::f12, "frame");
        Logic.register("animated_java:land_shark/animations/walk/stop", Compiled119::f13);
        Logic.register("animated_java:land_shark/animations/walk/tween", Compiled119::f14, "duration", "to_frame");
        Logic.register("animated_java:land_shark/animations/walk/zzz/apply_frame", Compiled119::f15, "frame");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/0", Compiled119::f16, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/1", Compiled119::f17, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/10", Compiled119::f18, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/11", Compiled119::f19, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/12", Compiled119::f20, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/13", Compiled119::f21, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/14", Compiled119::f22, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/15", Compiled119::f23, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
    }
    // animated_java:land_shark/animations/idle/zzz/frames/8
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [0.0036977493907906014f,-0.013463622442185555f,0.999902524009304f,0.0013089544067949876f,-0.2648145819059043f,0.9641982652598885f,0.013962180339145272f,0.5468841383741277f,-0.9642922606033109f,-0.26484039748602545f,-2.106141648388116e-16f,0.5624999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [0.0001552904816002253f,-0.013961316724762717f,0.999902524009304f,-0.00009817158050972286f,-0.011121138728709604f,0.9998406762047412f,0.013962180339145272f,0.6476555646219404f,-0.9999381461661729f,-0.011122222878403414f,-2.106141648388116e-16f,-0.5156249999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.0003898469552231412f,-0.013956736695027174f,0.999902524009304f,-0.17581696687726625f,0.027918917034172448f,0.9995126770540813f,0.013962180339145272f,0.4740914787818133f,-0.9996101150403541f,0.02792163872356887f,-2.106141648388116e-16f,-0.04687499999999995f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.0003898469552231412f,-0.013956736695027174f,0.999902524009304f,0.17571126421975464f,0.027918917034172448f,0.9995126770540813f,0.013962180339145272f,0.47900005780729404f,-0.9996101150403541f,0.02792163872356887f,-2.106141648388116e-16f,-0.04687500000000002f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-2.3692750590691314e-16f,-0.01570745288153843f,1.124890339510467f,0f,-2.927345865710862e-18f,1.1248903395104672f,0.01570745288153843f,0.640625f,-1.1249999999999998f,-2.899390144650345e-18f,-2.3694093544366305e-16f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/idle/zzz/frames/9
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [0.004097811217829146f,-0.015163369030570188f,0.9998766324816605f,0.0014725609979832441f,-0.26085330802766765f,0.9652506575361078f,0.015707317311820675f,0.5468865657048443f,-0.9653697528067914f,-0.260885492823488f,-9.959503317394131e-17f,0.5624999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [0.000257401911150754f,-0.01570520809764574f,0.9998766324816605f,-0.00011044207484878942f,-0.016385366832958357f,0.9997423667808698f,0.015707317311820675f,0.6476553825721366f,-0.999865717733139f,-0.016387388504410207f,-9.959503317394131e-17f,-0.5156249999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.0004933787598454124f,-0.01569956669891099f,0.9998766324816605f,-0.17552604341432518f,0.03140688401073167f,0.9993832537218154f,0.015707317311820675f,0.4737848740873095f,-0.9995065603657315f,0.031410759078128285f,-9.959503317394131e-17f,-0.04687499999999997f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.0004933787598454124f,-0.01569956669891099f,0.9998766324816605f,0.17599308519250853f,0.03140688401073167f,0.9993832537218154f,0.015707317311820675f,0.47930697782974646f,-0.9995065603657315f,0.031410759078128285f,-9.959503317394131e-17f,-0.04687500000000001f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-1.12027415636583e-16f,-0.01767073197579826f,1.1248612115418681f,0f,-3.903127820947816e-18f,1.1248612115418681f,0.01767073197579826f,0.640625f,-1.1249999999999998f,-2.1640405352752124e-18f,-1.1204441232068397e-16f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/idle/zzz/on_tick
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "2"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/idle/zzz/zzz/0"), Control.when("score", "@s", "aj.idle.frame", "matches", "-1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.idle.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/animations/idle/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:land_shark/animations/idle/zzz/zzz/1")), Control.when("score", "@s", "aj.idle.frame", "matches", "19..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.idle.frame", "1"));
        return 1;
    }
    // animated_java:land_shark/animations/idle/zzz/set_frame
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/idle/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:land_shark/animations/idle/zzz/zzz/0
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/animations/idle/zzz/apply_frame", "{frame: 20}"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.idle.frame", "1"));
        return 1;
    }
    // animated_java:land_shark/animations/idle/zzz/zzz/1
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.idle.frame", "-1"));
        return 1;
    }
    // animated_java:land_shark/animations/pause_all
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/animations/pause_all'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.land_shark.animation.walk.playing"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.land_shark.animation.idle.playing"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/apply_frame
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/animations/walk/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.walk.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/walk/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:land_shark/animations/walk/next_frame
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/animations/walk/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.walk.frame", "1"), Control.when("score", "@s", "aj.walk.frame", "matches", "21..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.walk.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/walk/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.walk.frame", "1"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/pause
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/animations/walk/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.land_shark.animation.walk.playing"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/play
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/animations/walk/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.land_shark.animation.walk.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.walk.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/walk/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/resume
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/animations/walk/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.land_shark.animation.walk.playing"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/set_frame
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/animations/walk/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.walk.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/walk/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:land_shark/animations/walk/stop
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/animations/walk/stop'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.land_shark.animation.walk.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.walk.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/walk/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/tween
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/animations/walk/tween'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/animations/pause_all"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.land_shark.animation.walk.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tween_duration", "$(duration)"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.walk.frame", "$(to_frame)"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.i", "=", "@s", "aj.tween_duration"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/walk/zzz/apply_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/walk/zzz/apply_frame", "{frame: $(to_frame)}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#this", "aj.i"), Control.on("passengers"), Control.store("result", "entity", "@s", "interpolation_duration", "int", "1")));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/apply_frame
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/walk/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/0
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [-0.031061806319097374f,0.03314010576808818f,0.9989679161904423f,0.014365381138734005f,0.000059634460375674464f,0.9994502448791466f,-0.033154252438338014f,0.5468929951586187f,-0.9995174638954167f,-0.0009702580552794835f,-0.031046706224334687f,0.5623195351338544f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-0.20405886587981178f,0.03314010576808818f,0.9783975228124429f,-0.015783227514602715f,0.005815903996751442f,0.9994502448791466f,-0.03264020943122879f,0.6476831335529376f,-0.9789413437568898f,-0.0009702580552794835f,-0.20413942314692812f,-0.5153830144480254f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.04215717084003452f,0.01690784932773331f,0.9989679161904423f,-0.18483423084520717f,-0.4223318780113271f,0.905834742301641f,-0.033154252438338014f,0.4825610907804241f,-0.9054604120347777f,-0.4232936856018882f,-0.031046706224334687f,-0.041163003611693755f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.014145943052809817f,0.04316242251393972f,0.9989679161904423f,0.16636542719049516f,0.4224399723629555f,0.9057843370776734f,-0.033154252438338014f,0.4709052989075708f,-0.9062805095803018f,0.4215349807400185f,-0.031046706224334687f,-0.052077861268686416f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.034944532108984544f,0.0372826189890992f,1.1238389057142477f,0f,0.00006708876792263377f,1.12438152548904f,-0.03729853399313027f,0.640625f,-1.1244571468823439f,-0.0010915403121894188f,-0.03492754450237652f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/1
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [-0.020945354693917912f,0.021945441668237604f,0.9995397389332411f,0.009508965029008144f,-0.01493690833831213f,0.9996406113286792f,-0.022260659283079784f,0.5468765531783446f,-0.9996690356743269f,-0.015396290865350817f,-0.02061003012008188f,0.562419879451824f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-0.17705122260284897f,0.022256723231789635f,0.9839499493601388f,-0.0104727458440992f,0.003527731556027062f,0.9997522000791221f,-0.021979389141275237f,0.6476743792156908f,-0.9841953158214607f,-0.00042036643361756984f,-0.17708586506877522f,-0.5155183866252694f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.027572952088502283f,0.012650794694137048f,0.9995397389332411f,-0.18266080405536472f,-0.3833232445178943f,0.9233459553496497f,-0.022260659283079784f,0.4805701411146708f,-0.9232025901855992f,-0.38376060784432986f,-0.02061003012008188f,-0.043124911191734394f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.010504099343388005f,0.02846004550685547f,0.9995397389332411f,0.16873988541335277f,0.3833944302735542f,0.9233163996612967f,-0.022260659283079784f,0.472744128085463f,-0.9235249724464417f,0.3829841405675283f,-0.02061003012008188f,-0.05037062490582568f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.023191065663976846f,0.025038813635763338f,1.1244822062998963f,0f,0.00004335612847549287f,1.1247212250890124f,-0.02504324169346476f,0.640625f,-1.1247609401973448f,-0.0004729122378197661f,-0.023186283885092116f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/10
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [0.039043125468451456f,-0.018370248210509074f,0.999068650461188f,-0.015094855406096454f,-0.3006344953112148f,0.9532899604378969f,0.029277150771279445f,0.5469491596392091f,-0.9529399427994538f,-0.3014975709835775f,0.03169668923368375f,0.5623097854145602f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [0.2047167236088853f,-0.029260511366951125f,0.9783838130045837f,0.016145788013970243f,0.005024446960969601f,0.9995713305188514f,0.028842852450990816f,0.6476220950319718f,-0.9788083663350964f,-0.0009887766773886144f,0.20477598568460748f,-0.5153726159703134f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [0.01637485176363438f,-0.03992112091838046f,0.999068650461188f,-0.17167204835502967f,0.42238236223385517f,0.905944804343214f,0.029277150771279445f,0.47141500511600415f,-0.9062698297435857f,0.42150956761164504f,0.03169668923368375f,-0.052335175562870435f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [0.0411069046667241f,-0.013116937690703967f,0.999068650461188f,0.1795630240727317f,-0.4224918341455751f,0.905893756752426f,0.029277150771279445f,0.48170775343403205f,-0.9054340795822903f,-0.42330183961636014f,0.03169668923368375f,-0.04119180825415349f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [0.035676056693496244f,-0.032918075287820016f,1.1239522317688364f,0f,-0.00006794375070287378f,1.1245177468337078f,0.03293679461768938f,0.640625f,-1.12443417520211f,-0.0011123737620621912f,0.03565877538789422f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/11
    private static int f19(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [0.0271143467067987f,-0.012245302785355851f,0.9995573344047648f,-0.01081246569857639f,-0.2863727186224551f,0.9579197675513077f,0.019503460288699058f,0.5469169054384002f,-0.9577345552038143f,-0.2867747748567571f,0.022466648045684667f,0.5624030548451454f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [0.1788884915533303f,-0.01949757372459785f,0.983676141933222f,0.011449907317068242f,0.003015172302833535f,0.9998097885124022f,0.019269030353645217f,0.6476328455566596f,-0.9838647347708722f,-0.0004810547155437272f,0.17891325345150472f,-0.5154981753844015f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [0.013277596716951584f,-0.02662406173113948f,0.9995573344047648f,-0.17379396589871876f,0.38334139463387384f,0.9234007744186289f,0.019503460288699058f,0.47311764661563965f,-0.9235112779958775f,0.38291274350694166f,0.022466648045684667f,-0.05078611164099894f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [0.02823043641964531f,-0.00939029803562661f,0.9995573344047648f,0.1776129094779563f,-0.38342044517132057f,0.9233679533432994f,0.019503460288699058f,0.47997433187338545f,-0.9231423534234485f,-0.3838013093273767f,0.022466648045684667f,-0.04288768068743793f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [0.025280726470514877f,-0.02193477044017258f,1.1245020012053604f,0f,-0.00004814622287595185f,1.1247860120764526f,0.02194139282478644f,0.640625f,-1.1247159119311263f,-0.0005411865549866931f,0.02527497905139525f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/12
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [0.014351874914549013f,-0.005432975419496823f,0.999882246299297f,-0.00616691130104939f,-0.2587930297070252f,0.9658912125538236f,0.008962883819564022f,0.5468921104701594f,-0.9658261704165485f,-0.2588911900575131f,0.01245633369449929f,0.562469045481964f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [0.13664426724488604f,-0.008961892854857236f,0.9905796427877802f,0.00636015138404052f,0.0010905326747271812f,0.9999598322686812f,0.008896324391350541f,0.6476437348874032f,-0.9906195813568363f,-0.00013537226024924937f,0.13664855179165886f,-0.5155859433077233f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [0.00911020687861573f,-0.012348994538039955f,0.999882246299297f,-0.1760497905125462f,0.30650134754636665f,0.9518280257829658f,0.008962883819564022f,0.4749714642759473f,-0.95182662711383f,0.3063836021525974f,0.01245633369449929f,-0.049067937788932675f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [0.014604496797979186f,-0.004711921980416662f,0.999882246299297f,0.17547131170205033f,-0.3065465113358638f,0.9518134812564109f,0.008962883819564022f,0.4781224781187628f,-0.9517436341058914f,-0.30664131275775997f,0.01245633369449929f,-0.04468875797446027f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [0.014014177512384512f,-0.010082129461714391f,1.1248675270867092f,0f,-0.000026689490696453944f,1.1249548113022665f,0.010083244297009525f,0.640625f,-1.1249127086651312f,-0.00015229379278040555f,0.014013375406311701f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/13
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [0.0015525611118811283f,0.002314417298360416f,0.9999961165057405f,-0.0013230620209058169f,-0.22561952245624647f,0.9742136337237604f,-0.0019044561854867333f,0.5468773497088296f,-0.974214258077046f,-0.22561568947951333f,0.0020347039280043224f,0.5624988356181488f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [0.08747590632382644f,0.0019044601277423937f,0.996164815100617f,0.0010625330455423254f,-0.00016659467784894434f,0.9999981865141666f,-0.0018971596114910787f,0.6476542391956059f,-0.9961666216346732f,3.416493172028986e-19f,0.0874760649604309f,-0.5156239326499698f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [0.0023925712468912306f,0.0014291872745112286f,0.9999961165057405f,-0.17834138216863193f,0.21225210400022948f,0.9772130869949058f,-0.0019044561854867333f,0.4769018471418483f,-0.9772120138180375f,0.2122558362675124f,0.0020347039280043224f,-0.047237334605354835f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [0.001584104019250032f,0.002292943063678509f,0.9999961165057405f,0.1732197525404174f,-0.21225967743344915f,0.9772114420034621f,-0.0019044561854867333f,0.4762323117641381f,-0.9772120138180375f,-0.2122558362675124f,0.0020347039280043224f,-0.04652200900566582f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [0.0022890377678599348f,0.002142517643710193f,1.1249956310689582f,0f,-0.0000043593890654759255f,1.1249979598284374f,-0.002142513208672575f,0.640625f,-1.1249976712362977f,3.8435548185326094e-19f,0.0022890419190048626f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/14
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [-0.010802328173126546f,0.010921344471199367f,0.9998820100096715f,0.003604327979803989f,-0.18953030824536107f,0.9817918081592675f,-0.012771362017210155f,0.5468735015008033f,-0.9818154469972744f,-0.1896459060098519f,-0.008535711525343591f,0.5624882024086985f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [0.034881025049843285f,0.012771035467523043f,0.999309869232041f,-0.004311681832179564f,-0.000538218178406994f,0.9999184426981729f,-0.012760026381371227f,0.6476640590051109f,-0.9993913269649001f,-0.00009276393763692579f,0.03488505385100089f,-0.5156068658868527f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.007102112305081807f,0.013620795124533883f,0.9998820100096715f,-0.1805993654189369f,0.10836402838006852f,0.9940292398443162f,-0.012771362017210155f,0.4788515413955001f,-0.9940859104494183f,0.1082605388620729f,-0.008535711525343591f,-0.04533764945015836f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.009869766937646282f,0.01177088610152459f,0.9998820100096715f,0.17092165372508816f,-0.10833170605414182f,0.9940327629286796f,-0.012771362017210155f,0.4743616094363247f,-0.9940658072602612f,-0.10844497436377837f,-0.008535711525343591f,-0.04833848553328697f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.009603225109768548f,0.014367414900963424f,1.1248672612608803f,0f,0.000018288992486117798f,1.1249082480354444f,-0.014367782269361425f,0.640625f,-1.12495901157909f,-0.00010435942984154152f,-0.00960267546601154f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/15
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [-0.02233379151141201f,0.02014411378050597f,0.9995476058881451f,0.008507780246374053f,-0.152046267972433f,0.98809844876968f,-0.023310682843003975f,0.5468801107336132f,-0.9881210118970143f,-0.15249809906667705f,-0.01900514742563363f,0.562436508338241f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-0.019009469112605693f,0.023307158714310928f,0.9995476058881451f,-0.009637879051477314f,0.00003620284162784981f,0.9997282684583582f,-0.023310682843003975f,0.6476730064778121f,-0.9998193030610135f,-0.0004069372418223644f,-0.01900514742563363f,-0.5155346894183167f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.019009469112605693f,0.023307158714310928f,0.9995476058881451f,-0.18275931689004585f,0.00003620284162784981f,0.9997282684583582f,-0.023310682843003975f,0.480760993345662f,-0.9998193030610135f,-0.0004069372418223644f,-0.01900514742563363f,-0.04341447480455754f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.019009469112605693f,0.023307158714310928f,0.9995476058881451f,0.16864413830500508f,0.00003620284162784981f,0.9997282684583582f,-0.023310682843003975f,0.4725658314086684f,-0.9998193030610135f,-0.0004069372418223644f,-0.01900514742563363f,-0.05009597194638186f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.021385652751681406f,0.026220553553599795f,1.1244910566241633f,0f,0.00004072819683133104f,1.124694302015653f,-0.02622451819837947f,0.640625f,-1.1247967159436403f,-0.0004578043970501599f,-0.021380790853837834f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
}
