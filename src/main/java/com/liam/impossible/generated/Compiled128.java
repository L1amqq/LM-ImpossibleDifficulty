package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled128 {
    public static void register() {
        Logic.register("animated_java:lava_wave/zzz/2", Compiled128::f0);
        Logic.register("animated_java:lava_wave/zzz/3", Compiled128::f1);
        Logic.register("animated_java:lava_wave/zzz/4", Compiled128::f2);
        Logic.register("animated_java:lava_wave/zzz/5", Compiled128::f3);
        Logic.register("animated_java:lava_wave/zzz/6", Compiled128::f4, "animation");
        Logic.register("animated_java:lava_wave/zzz/7", Compiled128::f5, "animation");
        Logic.register("animated_java:lava_wave/zzz/8", Compiled128::f6, "animation");
        Logic.register("animated_java:matrix_cow/animations/pause_all", Compiled128::f7);
        Logic.register("animated_java:matrix_cow/animations/squirt/apply_frame", Compiled128::f8, "frame");
        Logic.register("animated_java:matrix_cow/animations/squirt/next_frame", Compiled128::f9);
        Logic.register("animated_java:matrix_cow/animations/squirt/pause", Compiled128::f10);
        Logic.register("animated_java:matrix_cow/animations/squirt/play", Compiled128::f11);
        Logic.register("animated_java:matrix_cow/animations/squirt/resume", Compiled128::f12);
        Logic.register("animated_java:matrix_cow/animations/squirt/set_frame", Compiled128::f13, "frame");
        Logic.register("animated_java:matrix_cow/animations/squirt/stop", Compiled128::f14);
        Logic.register("animated_java:matrix_cow/animations/squirt/tween", Compiled128::f15, "duration", "to_frame");
        Logic.register("animated_java:matrix_cow/animations/squirt/zzz/apply_frame", Compiled128::f16, "frame");
        Logic.register("animated_java:matrix_cow/animations/squirt/zzz/frames/0", Compiled128::f17, "bone_body", "bone_head", "bone_leg1", "bone_leg2", "bone_leg3", "bone_leg4", "bone_tit1", "bone_tit2", "bone_tit3", "bone_tit4");
        Logic.register("animated_java:matrix_cow/animations/squirt/zzz/frames/1", Compiled128::f18);
        Logic.register("animated_java:matrix_cow/animations/squirt/zzz/frames/10", Compiled128::f19, "bone_head");
        Logic.register("animated_java:matrix_cow/animations/squirt/zzz/frames/100", Compiled128::f20, "bone_body", "bone_head", "bone_leg1", "bone_leg2", "bone_leg3", "bone_leg4", "bone_tit1", "bone_tit2", "bone_tit3", "bone_tit4");
        Logic.register("animated_java:matrix_cow/animations/squirt/zzz/frames/101", Compiled128::f21, "bone_body", "bone_head", "bone_leg1", "bone_leg2", "bone_leg3", "bone_leg4", "bone_tit1", "bone_tit2", "bone_tit3", "bone_tit4");
        Logic.register("animated_java:matrix_cow/animations/squirt/zzz/frames/102", Compiled128::f22, "bone_body", "bone_head", "bone_leg1", "bone_leg2", "bone_leg3", "bone_leg4", "bone_tit1", "bone_tit2", "bone_tit3", "bone_tit4");
        Logic.register("animated_java:matrix_cow/animations/squirt/zzz/frames/103", Compiled128::f23, "bone_body", "bone_head", "bone_leg1", "bone_leg2", "bone_leg3", "bone_leg4", "bone_tit1", "bone_tit2", "bone_tit3", "bone_tit4");
    }
    // animated_java:lava_wave/zzz/2
    private static int f0(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"No variants are available.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:lava_wave/remove/this"));
        return 1;
    }
    // animated_java:lava_wave/zzz/3
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:lava_wave/zzz/4")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:lava_wave/zzz/5")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/zzz/6", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:lava_wave/zzz/7", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/zzz/8", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:lava_wave/zzz/4
    private static int f2(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:lava_wave/remove/this"));
        return 1;
    }
    // animated_java:lava_wave/zzz/5
    private static int f3(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:lava_wave/remove/this"));
        return 1;
    }
    // animated_java:lava_wave/zzz/6
    private static int f4(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:lava_wave/zzz/7
    private static int f5(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"crash\",\"color\":\"yellow\"}]]"));
        Logic.step(() -> Logic.call(c, "animated_java:lava_wave/remove/this"));
        return 1;
    }
    // animated_java:lava_wave/zzz/8
    private static int f6(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:lava_wave/animations/$(animation)/resume"));
        return 1;
    }
    // animated_java:matrix_cow/animations/pause_all
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'matrix_cow', 'function_path': 'animated_java:matrix_cow/animations/pause_all'}")), Control.unless("entity", "@s[type=item_display,tag=aj.matrix_cow.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.matrix_cow.animation.squirt.playing"));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/apply_frame
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'matrix_cow', 'function_path': 'animated_java:matrix_cow/animations/squirt/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.matrix_cow.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.squirt.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/animations/squirt/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/next_frame
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'matrix_cow', 'function_path': 'animated_java:matrix_cow/animations/squirt/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.matrix_cow.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.squirt.frame", "1"), Control.when("score", "@s", "aj.squirt.frame", "matches", "110..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.squirt.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/animations/squirt/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.squirt.frame", "1"));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/pause
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'matrix_cow', 'function_path': 'animated_java:matrix_cow/animations/squirt/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.matrix_cow.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.matrix_cow.animation.squirt.playing"));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/play
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'matrix_cow', 'function_path': 'animated_java:matrix_cow/animations/squirt/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.matrix_cow.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.matrix_cow.animation.squirt.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.squirt.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/animations/squirt/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/resume
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'matrix_cow', 'function_path': 'animated_java:matrix_cow/animations/squirt/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.matrix_cow.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.matrix_cow.animation.squirt.playing"));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/set_frame
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'matrix_cow', 'function_path': 'animated_java:matrix_cow/animations/squirt/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.matrix_cow.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.squirt.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/animations/squirt/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/stop
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'matrix_cow', 'function_path': 'animated_java:matrix_cow/animations/squirt/stop'}")), Control.unless("entity", "@s[type=item_display,tag=aj.matrix_cow.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.matrix_cow.animation.squirt.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.squirt.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/animations/squirt/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/tween
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'matrix_cow', 'function_path': 'animated_java:matrix_cow/animations/squirt/tween_play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.matrix_cow.root]")));
        Logic.step(() -> Logic.call(c, "animated_java:matrix_cow/animations/pause_all"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.matrix_cow.animation.squirt.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tween_duration", "$(duration)"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.squirt.frame", "$(to_frame)"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.i", "=", "@s", "aj.tween_duration"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/animations/squirt/zzz/apply_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/animations/squirt/zzz/apply_frame", "{frame: $(to_frame)}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#this", "aj.i"), Control.on("passengers"), Control.store("result", "entity", "@s", "interpolation_duration", "int", "1")));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/zzz/apply_frame
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/animations/squirt/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/zzz/frames/0
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg4)", "{ transformation: [-1f,-1.2246467991473532e-16f,2.719262146893782e-32f,0.24999999999999994f,0f,2.220446049250313e-16f,1f,0.7500000000000002f,-1.2246467991473532e-16f,1f,-2.220446049250313e-16f,0.4375f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg3)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-0.25000000000000006f,0f,1f,0f,0.7500000000000002f,-1.2246467991473532e-16f,0f,-1f,0.4375f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-6.123233995736766e-17f,0f,1f,0f,1.1250000000000002f,-1.2246467991473532e-16f,0f,-1f,0.5f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit1)", "{ transformation: [-0.00001f,-1.2246467991473532e-21f,2.719262146893782e-37f,0.06250000000000006f,0f,2.2204460492503133e-21f,0.00001f,0.8125f,-1.2246467991473532e-21f,0.00001f,-2.2204460492503133e-21f,-0.49999999999999994f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit2)", "{ transformation: [-0.00001f,-1.2246467991473532e-21f,2.719262146893782e-37f,0.06250000000000004f,0f,2.2204460492503133e-21f,0.00001f,0.8125f,-1.2246467991473532e-21f,0.00001f,-2.2204460492503133e-21f,-0.31249999999999994f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit3)", "{ transformation: [-0.00001f,-1.2246467991473532e-21f,2.719262146893782e-37f,-0.12499999999999996f,0f,2.2204460492503133e-21f,0.00001f,0.8125f,-1.2246467991473532e-21f,0.00001f,-2.2204460492503133e-21f,-0.3125f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit4)", "{ transformation: [-0.00001f,-1.2246467991473532e-21f,2.719262146893782e-37f,-0.12499999999999994f,0f,2.2204460492503133e-21f,0.00001f,0.8125f,-1.2246467991473532e-21f,0.00001f,-2.2204460492503133e-21f,-0.5f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-1f,-1.2246467991473532e-16f,2.719262146893782e-32f,4.592425496802574e-17f,0f,2.220446049250313e-16f,1f,0.9375f,-1.2246467991473532e-16f,1f,-2.220446049250313e-16f,-0.375f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg1)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-0.24999999999999994f,0f,1f,0f,0.75f,-1.2246467991473532e-16f,0f,-1f,-0.43750000000000006f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg2)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0.25000000000000006f,0f,1f,0f,0.75f,-1.2246467991473532e-16f,0f,-1f,-0.43749999999999994f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/zzz/frames/1
    private static int f18(Frame c) {

        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/zzz/frames/10
    private static int f19(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,-2.126576849575771e-17f,1.2060416625018976e-16f,-6.123233995736766e-17f,0f,0.9848077530122079f,0.1736481776669303f,1.1250000000000002f,-1.2246467991473532e-16f,0.1736481776669303f,-0.9848077530122079f,0.5f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/zzz/frames/100
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg4)", "{ transformation: [-0.9997900611634026f,0.01834849809610852f,-0.009119551331985847f,0.24999999999999997f,-0.009228018367748758f,-0.005835534977785495f,0.9999403933277861f,1.012789121092843f,0.018294186942417377f,0.9998146223921411f,0.006003630149812866f,0.4344619625861565f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg3)", "{ transformation: [-0.9994054576297797f,-0.003611820490391918f,0.034288278063438225f,-0.25000000000000006f,-0.0002288183581526798f,0.9951707392986592f,0.09815878608621503f,1.0129352261634217f,-0.034477222944567995f,0.09809258074138699f,-0.9945798945793772f,0.43490541602003935f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,2.3466461475834685e-17f,1.2019535353923518e-16f,-4.644943420625868e-17f,0f,0.9814695438955942f,-0.19161819956719733f,1.3904233039535074f,-1.2246467991473532e-16f,-0.19161819956719733f,-0.9814695438955942f,0.37928841392145557f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit1)", "{ transformation: [-0.00001f,-1.1631426434351288e-21f,3.832218335176093e-22f,0.06250000000000006f,0f,0.0000031292437442732333f,0.000009497780455923733f,0.7806932902785674f,-1.2246467991473532e-21f,0.000009497780455923733f,-0.0000031292437442732333f,-0.4727007646623792f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit2)", "{ transformation: [-0.00001f,-1.1631426434351288e-21f,3.832218335176093e-22f,0.06250000000000003f,0f,0.0000031292437442732333f,0.000009497780455923733f,0.8393666104836904f,-1.2246467991473532e-21f,0.000009497780455923733f,-0.0000031292437442732333f,-0.29461738111380925f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit3)", "{ transformation: [-0.00001f,-1.1631426434351288e-21f,3.832218335176093e-22f,-0.12499999999999996f,0f,0.0000031292437442732333f,0.000009497780455923733f,0.8393666104836904f,-1.2246467991473532e-21f,0.000009497780455923733f,-0.0000031292437442732333f,-0.2946173811138093f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit4)", "{ transformation: [-0.00001f,-1.1631426434351288e-21f,3.832218335176093e-22f,-0.12499999999999994f,0f,0.0000031292437442732333f,0.000009497780455923733f,0.7806932902785674f,-1.2246467991473532e-21f,0.000009497780455923733f,-0.0000031292437442732333f,-0.47270076466237926f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-1f,-1.1631426434351287e-16f,3.832218335176093e-17f,4.814013771585991e-17f,0f,0.3129243744273233f,0.9497780455923732f,0.9385310927810294f,-1.2246467991473532e-16f,0.9497780455923732f,-0.3129243744273233f,-0.393094055766748f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg1)", "{ transformation: [-1f,2.362089463002027e-18f,1.224418978944191e-16f,-0.24999999999999994f,0f,0.9998139706866331f,-0.019287924196973408f,0.7498604780149749f,-1.2246467991473532e-16f,-0.019287924196973408f,-0.9998139706866331f,-0.4519659431477301f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg2)", "{ transformation: [-1f,2.362089463002027e-18f,1.224418978944191e-16f,0.25000000000000006f,0f,0.9998139706866331f,-0.019287924196973408f,0.7498604780149749f,-1.2246467991473532e-16f,-0.019287924196973408f,-0.9998139706866331f,-0.45196594314773003f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/zzz/frames/101
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg4)", "{ transformation: [-0.999901338068065f,0.011880221934659017f,-0.007494962073045324f,0.24999999999999997f,-0.00753938933209531f,-0.0036992331262934164f,0.9999647360196141f,0.9304531575181547f,0.011852077378764809f,0.9999225850039895f,0.003788437771323594f,0.4442177357454081f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg3)", "{ transformation: [-0.9997192955400537f,0.0006471680455392953f,0.023683565998801667f,-0.25000000000000006f,0.0021962214133873243f,0.9978541637013801f,0.0654388615069246f,0.9305267694632293f,-0.02359039500309693f,0.06547250688143774f,-0.9975754829115729f,0.44454868420162597f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,1.3415462438232607e-17f,1.2172765993884443e-16f,-5.216698553352665e-17f,0f,0.9939817751828197f,-0.10954556405628933f,1.311254659263842f,-1.2246467991473532e-16f,-0.10954556405628933f,-0.9939817751828197f,0.4259757635413519f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit1)", "{ transformation: [-0.00001f,-1.1954324405489896e-21f,2.6589671443051796e-22f,0.06250000000000006f,0f,0.000002171211443296513f,0.000009761446658590021f,0.7890883068532526f,-1.2246467991473532e-21f,0.000009761446658590021f,-0.000002171211443296513f,-0.48231854471463415f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit2)", "{ transformation: [-0.00001f,-1.1954324405489896e-21f,2.6589671443051796e-22f,0.06250000000000004f,0f,0.000002171211443296513f,0.000009761446658590021f,0.8297985214150622f,-1.2246467991473532e-21f,0.000009761446658590021f,-0.000002171211443296513f,-0.2992914198660712f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit3)", "{ transformation: [-0.00001f,-1.1954324405489896e-21f,2.6589671443051796e-22f,-0.12499999999999996f,0f,0.000002171211443296513f,0.000009761446658590021f,0.8297985214150622f,-1.2246467991473532e-21f,0.000009761446658590021f,-0.000002171211443296513f,-0.2992914198660713f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit4)", "{ transformation: [-0.00001f,-1.1954324405489896e-21f,2.6589671443051796e-22f,-0.12499999999999994f,0f,0.000002171211443296513f,0.000009761446658590021f,0.7890883068532526f,-1.2246467991473532e-21f,0.000009761446658590021f,-0.000002171211443296513f,-0.48231854471463415f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-1f,-1.1954324405489895e-16f,2.6589671443051793e-17f,4.744778961893773e-17f,0f,0.21712114432965127f,0.9761446658590021f,0.9382465331268343f,-1.2246467991473532e-16f,0.9761446658590021f,-0.21712114432965127f,-0.3874406045234653f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg1)", "{ transformation: [-1f,1.624385394980765e-18f,1.2245390642485502e-16f,-0.24999999999999994f,0f,0.9999120277790478f,-0.013264113343632837f,0.7499340208342858f,-1.2246467991473532e-16f,-0.013264113343632837f,-0.9999120277790478f,-0.44744808500772465f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg2)", "{ transformation: [-1f,1.624385394980765e-18f,1.2245390642485502e-16f,0.25000000000000006f,0f,0.9999120277790478f,-0.013264113343632837f,0.7499340208342858f,-1.2246467991473532e-16f,-0.013264113343632837f,-0.9999120277790478f,-0.4474480850077246f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/zzz/frames/102
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg4)", "{ transformation: [-0.9999655666149779f,0.006589335828516367f,-0.005044426402003935f,0.24999999999999994f,-0.00505137037011595f,-0.0010376016747996597f,0.9999867034316748f,0.857554689296688f,0.006584014107679182f,0.99997775177056f,0.001070851122424582f,0.4461259596187536f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg3)", "{ transformation: [-0.9999009876561331f,0.0020403032170672967f,0.013923076063567854f,-0.25000000000000006f,0.002531933492171312f,0.9993705581495758f,0.035384697491954054f,0.8575832208998606f,-0.013842116784679016f,0.0354164462727177f,-0.9992767740402713f,0.44634254883244445f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,3.8199707676214175e-18f,1.224050883335864e-16f,-5.640398991048112e-17f,0f,0.999513397812411f,-0.03119242846411739f,1.2381383076394101f,-1.2246467991473532e-16f,-0.03119242846411739f,-0.999513397812411f,0.4605735298516422f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit1)", "{ transformation: [-0.00001f,-1.2141573728825559e-21f,1.5994266640514648e-22f,0.06250000000000006f,0f,0.0000013060309839253637f,0.000009914347334495951f,0.7977118550438753f,-1.2246467991473532e-21f,0.000009914347334495951f,-0.0000013060309839253637f,-0.4900477353502853f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit2)", "{ transformation: [-0.00001f,-1.2141573728825559e-21f,1.5994266640514648e-22f,0.06250000000000004f,0f,0.0000013060309839253637f,0.000009914347334495951f,0.8221999359924759f,-1.2246467991473532e-21f,0.000009914347334495951f,-0.0000013060309839253637f,-0.3041537228284862f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit3)", "{ transformation: [-0.00001f,-1.2141573728825559e-21f,1.5994266640514648e-22f,-0.12499999999999996f,0f,0.0000013060309839253637f,0.000009914347334495951f,0.8221999359924759f,-1.2246467991473532e-21f,0.000009914347334495951f,-0.0000013060309839253637f,-0.30415372282848624f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit4)", "{ transformation: [-0.00001f,-1.2141573728825559e-21f,1.5994266640514648e-22f,-0.12499999999999994f,0f,0.0000013060309839253637f,0.000009914347334495951f,0.7977118550438753f,-1.2246467991473532e-21f,0.000009914347334495951f,-0.0000013060309839253637f,-0.49004773535028534f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-1f,-1.2141573728825557e-16f,1.5994266640514647e-17f,4.6835855221645997e-17f,0f,0.13060309839253637f,0.9914347334495951f,0.9379665840241417f,-1.2246467991473532e-16f,0.9914347334495951f,-0.13060309839253637f,-0.38244378096815296f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg1)", "{ transformation: [-1f,9.721163799981307e-19f,1.2246082155678327e-16f,-0.24999999999999994f,0f,0.9999684941163874f,-0.007937932640455649f,0.7499763705872906f,-1.2246467991473532e-16f,-0.007937932640455649f,-0.9999684941163874f,-0.44345344948034177f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg2)", "{ transformation: [-1f,9.721163799981307e-19f,1.2246082155678327e-16f,0.25000000000000006f,0f,0.9999684941163874f,-0.007937932640455649f,0.7499763705872906f,-1.2246467991473532e-16f,-0.007937932640455649f,-0.9999684941163874f,-0.4434534494803417f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:matrix_cow/animations/squirt/zzz/frames/103
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg4)", "{ transformation: [-0.9999937926686685f,0.0026281299336045846f,-0.00234681852388849f,0.24999999999999994f,-0.0023450249739452936f,0.000685317118280182f,0.9999970155947061f,0.7966893809276427f,0.0026297304051076157f,0.9999963116299477f,-0.0006791498339606752f,0.44291296706339534f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg3)", "{ transformation: [-0.9999817897140065f,0.0014517437940980958f,0.005857702649385408f,-0.25000000000000006f,0.0015229908497357146f,0.9999246990093089f,0.012176896567477204f,0.7966954021308185f,-0.005839583824549523f,0.012185596050243691f,-0.9999087010870826f,0.4430181747438374f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,-3.3007141525282734e-18f,1.2242019078853732e-16f,-5.93474231568219e-17f,0f,0.9996367187157229f,0.0269523764307093f,1.1749004322730148f,-1.2246467991473532e-16f,0.0269523764307093f,-0.9996367187157229f,0.4846084862847141f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit1)", "{ transformation: [-0.00001f,-1.2226460748653125e-21f,6.997398286722343e-23f,0.06250000000000006f,0f,5.713809313505089e-7f,0.000009983662846435122f,0.8057728751868662f,-1.2246467991473532e-21f,0.000009983662846435122f,-5.713809313505089e-7f,-0.4959021442540946f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit2)", "{ transformation: [-0.00001f,-1.2226460748653125e-21f,6.997398286722343e-23f,0.06250000000000004f,0f,5.713809313505089e-7f,0.000009983662846435122f,0.8164862676496883f,-1.2246467991473532e-21f,0.000009983662846435122f,-5.713809313505089e-7f,-0.3087084658834361f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit3)", "{ transformation: [-0.00001f,-1.2226460748653125e-21f,6.997398286722343e-23f,-0.12499999999999996f,0f,5.713809313505089e-7f,0.000009983662846435122f,0.8164862676496883f,-1.2246467991473532e-21f,0.000009983662846435122f,-5.713809313505089e-7f,-0.30870846588343615f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tit4)", "{ transformation: [-0.00001f,-1.2226460748653125e-21f,6.997398286722343e-23f,-0.12499999999999994f,0f,5.713809313505089e-7f,0.000009983662846435122f,0.8057728751868662f,-1.2246467991473532e-21f,0.000009983662846435122f,-5.713809313505089e-7f,-0.4959021442540946f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-1f,-1.2226460748653123e-16f,6.997398286722342e-18f,4.632209621513249e-17f,0f,0.05713809313505089f,0.9983662846435121f,0.9377109224091866f,-1.2246467991473532e-16f,0.9983662846435121f,-0.05713809313505089f,-0.37824862031553697f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg1)", "{ transformation: [-1f,4.2431499128701178e-19f,1.2246394483033259e-16f,-0.24999999999999994f,0f,0.9999939975803371f,-0.0034647948419285987f,0.7499954981852528f,-1.2246467991473532e-16f,-0.0034647948419285987f,-0.9999939975803371f,-0.4400985961314465f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg2)", "{ transformation: [-1f,4.2431499128701178e-19f,1.2246394483033259e-16f,0.25000000000000006f,0f,0.9999939975803371f,-0.0034647948419285987f,0.7499954981852528f,-1.2246467991473532e-16f,-0.0034647948419285987f,-0.9999939975803371f,-0.4400985961314464f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
}
