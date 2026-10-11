package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled005 {
    public static void register() {
        Logic.register("animated_java:baby_golem/zzz/2", Compiled005::f0);
        Logic.register("animated_java:baby_golem/zzz/3", Compiled005::f1);
        Logic.register("animated_java:baby_golem/zzz/4", Compiled005::f2, "variant");
        Logic.register("animated_java:baby_golem/zzz/5", Compiled005::f3, "variant");
        Logic.register("animated_java:baby_golem/zzz/6", Compiled005::f4);
        Logic.register("animated_java:baby_golem/zzz/7", Compiled005::f5);
        Logic.register("animated_java:baby_golem/zzz/8", Compiled005::f6);
        Logic.register("animated_java:baby_golem/zzz/9", Compiled005::f7, "animation");
        Logic.register("animated_java:bouncing_pig/animations/jump/apply_frame", Compiled005::f8, "frame");
        Logic.register("animated_java:bouncing_pig/animations/jump/next_frame", Compiled005::f9);
        Logic.register("animated_java:bouncing_pig/animations/jump/pause", Compiled005::f10);
        Logic.register("animated_java:bouncing_pig/animations/jump/play", Compiled005::f11);
        Logic.register("animated_java:bouncing_pig/animations/jump/resume", Compiled005::f12);
        Logic.register("animated_java:bouncing_pig/animations/jump/set_frame", Compiled005::f13, "frame");
        Logic.register("animated_java:bouncing_pig/animations/jump/stop", Compiled005::f14);
        Logic.register("animated_java:bouncing_pig/animations/jump/tween", Compiled005::f15, "duration", "to_frame");
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/apply_frame", Compiled005::f16, "frame");
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/0", Compiled005::f17, "bone_body", "bone_head", "bone_leg1", "bone_leg2", "bone_leg3", "bone_leg4", "bone_tail");
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/1", Compiled005::f18);
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/10", Compiled005::f19, "bone_head");
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/11", Compiled005::f20, "bone_head");
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/12", Compiled005::f21, "bone_head");
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/13", Compiled005::f22, "bone_head");
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/14", Compiled005::f23, "bone_body", "bone_head", "bone_leg3", "bone_leg4", "bone_tail");
    }
    // animated_java:baby_golem/zzz/2
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:baby_golem/zzz/3")), Control.when("data", "storage", "aj:temp", "{args:{variant:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/zzz/4", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:baby_golem/zzz/5", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        return 1;
    }
    // animated_java:baby_golem/zzz/3
    private static int f1(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"variant\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/remove/this"));
        return 1;
    }
    // animated_java:baby_golem/zzz/4
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/$(variant)/apply"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:baby_golem/zzz/5
    private static int f3(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The variant \",\"color\":\"red\"},{\"text\":\"$(variant)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Variants:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"default\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"red\",\"color\":\"yellow\"}]]"));
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/remove/this"));
        return 1;
    }
    // animated_java:baby_golem/zzz/6
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:baby_golem/zzz/7")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:baby_golem/zzz/8")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/zzz/9", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:baby_golem/zzz/10", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/zzz/11", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:baby_golem/zzz/7
    private static int f5(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/remove/this"));
        return 1;
    }
    // animated_java:baby_golem/zzz/8
    private static int f6(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/remove/this"));
        return 1;
    }
    // animated_java:baby_golem/zzz/9
    private static int f7(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/apply_frame
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/animations/jump/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.jump.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/animations/jump/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/next_frame
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/animations/jump/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.jump.frame", "1"), Control.when("score", "@s", "aj.jump.frame", "matches", "64..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.jump.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/animations/jump/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.jump.frame", "1"));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/pause
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/animations/jump/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.bouncing_pig.animation.jump.playing"));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/play
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/animations/jump/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.bouncing_pig.animation.jump.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.jump.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/animations/jump/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/resume
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/animations/jump/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.bouncing_pig.animation.jump.playing"));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/set_frame
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/animations/jump/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.jump.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/animations/jump/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/stop
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/animations/jump/stop'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.bouncing_pig.animation.jump.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.jump.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/animations/jump/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/tween
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/animations/jump/tween_play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Logic.call(c, "animated_java:bouncing_pig/animations/pause_all"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.bouncing_pig.animation.jump.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tween_duration", "$(duration)"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.jump.frame", "$(to_frame)"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.i", "=", "@s", "aj.tween_duration"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/animations/jump/zzz/apply_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/animations/jump/zzz/apply_frame", "{frame: $(to_frame)}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#this", "aj.i"), Control.on("passengers"), Control.store("result", "entity", "@s", "interpolation_duration", "int", "1")));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/apply_frame
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/animations/jump/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/0
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg1)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-0.18749999999999994f,0f,1f,0f,0.3125f,-1.2246467991473532e-16f,0f,-1f,-0.375f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg2)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0.18750000000000006f,0f,1f,0f,0.375f,-1.2246467991473532e-16f,0f,-1f,-0.4375f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-1f,-1.224646799147353e-17f,2.719262146893782e-32f,5.357829746269671e-17f,0f,2.2204460492503126e-17f,1f,0.625f,-1.2246467991473532e-16f,0.09999999999999998f,-2.220446049250313e-16f,-0.43750000000000006f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg3)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-0.18750000000000003f,0f,1f,0f,0.37500000000000017f,-1.2246467991473532e-16f,0f,-1f,0.3125f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg4)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0.18749999999999997f,0f,1f,0f,0.37500000000000017f,-1.2246467991473532e-16f,0f,-1f,0.3125f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-4.592425496802573e-17f,0f,1f,0f,0.7500000000000002f,-1.2246467991473532e-16f,0f,-1f,0.3749999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-1f,-1.2246467991473532e-16f,2.719262146893782e-32f,4.592425496802574e-17f,0f,2.220446049250313e-16f,1f,0.375f,-1.2246467991473532e-16f,1f,-2.220446049250313e-16f,-0.375f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/1
    private static int f18(Frame c) {

        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/10
    private static int f19(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,-2.2754658985131554e-17f,1.203321375239755e-16f,-4.592425496802573e-17f,0f,0.9825864698928328f,0.18580589114326052f,0.7500000000000002f,-1.2246467991473532e-16f,0.18580589114326052f,-0.9825864698928328f,0.3749999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/11
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,-2.6506208041798622e-17f,1.1956177801397682e-16f,-4.592425496802573e-17f,0f,0.9762960071199335f,0.21643961393810263f,0.7500000000000002f,-1.2246467991473532e-16f,0.21643961393810263f,-0.9762960071199335f,0.3749999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/12
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,-2.2069028988784846e-17f,1.2045976832997294e-16f,-4.592425496802573e-17f,0f,0.9836286545136256f,0.18020729735422625f,0.7500000000000002f,-1.2246467991473532e-16f,0.18020729735422625f,-0.9836286545136256f,0.3749999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/13
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,-5.341834311772682e-18f,1.223481206754078e-16f,-4.592425496802573e-17f,0f,0.9990482215818578f,0.04361938736533566f,0.7500000000000002f,-1.2246467991473532e-16f,0.04361938736533566f,-0.9990482215818578f,0.3749999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/14
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-0.9999999999999999f,-2.0364908292406882e-17f,8.314125328135021e-18f,5.620491221174285e-17f,0f,0.011315675330540401f,0.9976928133879874f,0.6198657267060916f,-1.224646799147353e-16f,0.16629209586458502f,-0.06788998537311851f,-0.4589479370776529f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg3)", "{ transformation: [-1f,-4.622503087149536e-19f,1.2246380751581533e-16f,-0.18750000000000003f,0f,0.9999928763222131f,0.0037745602163561792f,0.421674364944019f,-1.2246467991473532e-16f,0.0037745602163561792f,-0.9999928763222131f,0.3109138092042414f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg4)", "{ transformation: [-1f,1.8489353769776833e-18f,1.2245072178060174e-16f,0.18749999999999997f,0f,0.9998860231852703f,-0.015097703095006527f,0.421674364944019f,-1.2246467991473532e-16f,-0.015097703095006527f,-0.9998860231852703f,0.3109138092042414f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,1.9737262674762237e-17f,1.2086371783428647e-16f,-4.259454631751736e-17f,0f,0.9869271525344001f,-0.16116698045921557f,0.8000522940503343f,-1.2246467991473532e-16f,-0.16116698045921557f,-0.9869271525344001f,0.3478108655260712f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-1f,-1.2218213104479165e-16f,8.314125328135022e-18f,4.592425496802574e-17f,0f,0.06788998537311852f,0.9976928133879875f,0.375f,-1.2246467991473532e-16f,0.9976928133879875f,-0.06788998537311852f,-0.375f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
}
