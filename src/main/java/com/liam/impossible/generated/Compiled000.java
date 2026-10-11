package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled000 {
    public static void register() {
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/apply_frame", Compiled000::f0, "frame");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/next_frame", Compiled000::f1);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/pause", Compiled000::f2);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/play", Compiled000::f3);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/resume", Compiled000::f4);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/set_frame", Compiled000::f5, "frame");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/stop", Compiled000::f6);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/tween", Compiled000::f7, "duration", "to_frame");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/apply_frame", Compiled000::f8, "frame");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/0", Compiled000::f9, "bone_body", "bone_head", "bone_left_arm", "bone_left_leg", "bone_right_arm", "bone_right_leg");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/1", Compiled000::f10);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/2", Compiled000::f11);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/3", Compiled000::f12);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/4", Compiled000::f13);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/5", Compiled000::f14);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/6", Compiled000::f15);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/7", Compiled000::f16);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/8", Compiled000::f17);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/on_tick", Compiled000::f18);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/set_frame", Compiled000::f19, "frame");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/zzz/0", Compiled000::f20);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/zzz/1", Compiled000::f21);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/apply_frame", Compiled000::f22, "frame");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/next_frame", Compiled000::f23);
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/apply_frame
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/animations/animation_baby_golem_idle/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.animation_baby_golem_idle.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/next_frame
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/animations/animation_baby_golem_idle/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.animation_baby_golem_idle.frame", "1"), Control.when("score", "@s", "aj.animation_baby_golem_idle.frame", "matches", "9..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.animation_baby_golem_idle.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.animation_baby_golem_idle.frame", "1"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/pause
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/animations/animation_baby_golem_idle/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.baby_golem.animation.animation_baby_golem_idle.playing"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/play
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/animations/animation_baby_golem_idle/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.baby_golem.animation.animation_baby_golem_idle.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.animation_baby_golem_idle.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/resume
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/animations/animation_baby_golem_idle/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.baby_golem.animation.animation_baby_golem_idle.playing"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/set_frame
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/animations/animation_baby_golem_idle/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.animation_baby_golem_idle.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/stop
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/animations/animation_baby_golem_idle/stop'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.baby_golem.animation.animation_baby_golem_idle.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.animation_baby_golem_idle.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/tween
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/animations/animation_baby_golem_idle/tween'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/animations/pause_all"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.baby_golem.animation.animation_baby_golem_idle.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tween_duration", "$(duration)"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.animation_baby_golem_idle.frame", "$(to_frame)"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.i", "=", "@s", "aj.tween_duration"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/apply_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/apply_frame", "{frame: $(to_frame)}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#this", "aj.i"), Control.on("passengers"), Control.store("result", "entity", "@s", "interpolation_duration", "int", "1")));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/apply_frame
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/0
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_arm)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0.234375f,0f,1f,0f,0.91796875f,-1.2246467991473532e-16f,0f,-1f,0.03125000000000003f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_arm)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-0.234375f,0f,1f,0f,0.91796875f,-1.2246467991473532e-16f,0f,-1f,0.031249999999999972f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-8.610797806504827e-18f,0f,1f,0f,0.93359375f,-1.2246467991473532e-16f,0f,-1f,0.0703125f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,0.51171875f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_leg)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-0.1171875f,0f,1f,0f,0.42578125f,-1.2246467991473532e-16f,0f,-1f,0.015624999999999986f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_leg)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0.140625f,0f,1f,0f,0.42578125f,-1.2246467991473532e-16f,0f,-1f,0.015625000000000017f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/1
    private static int f10(Frame c) {

        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/2
    private static int f11(Frame c) {

        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/3
    private static int f12(Frame c) {

        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/4
    private static int f13(Frame c) {

        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/5
    private static int f14(Frame c) {

        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/6
    private static int f15(Frame c) {

        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/7
    private static int f16(Frame c) {

        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/8
    private static int f17(Frame c) {

        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/on_tick
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "3"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/zzz/0"), Control.when("score", "@s", "aj.animation_baby_golem_idle.frame", "matches", "-1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.animation_baby_golem_idle.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/zzz/1")), Control.when("score", "@s", "aj.animation_baby_golem_idle.frame", "matches", "7..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.animation_baby_golem_idle.frame", "1"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/set_frame
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/zzz/0
    private static int f20(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/apply_frame", "{frame: 8}"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.animation_baby_golem_idle.frame", "1"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/zzz/1
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.animation_baby_golem_idle.frame", "-1"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/apply_frame
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/animations/animation_baby_golem_walk/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.animation_baby_golem_walk.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/next_frame
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/animations/animation_baby_golem_walk/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.animation_baby_golem_walk.frame", "1"), Control.when("score", "@s", "aj.animation_baby_golem_walk.frame", "matches", "50..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.animation_baby_golem_walk.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.animation_baby_golem_walk.frame", "1"));
        return 1;
    }
}
