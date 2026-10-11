package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled145 {
    public static void register() {
        Logic.register("animated_java:sculk_hand/zzz/13", Compiled145::f0);
        Logic.register("animated_java:sculk_hand/zzz/2", Compiled145::f1);
        Logic.register("animated_java:sculk_hand/zzz/3", Compiled145::f2);
        Logic.register("animated_java:sculk_hand/zzz/4", Compiled145::f3);
        Logic.register("animated_java:sculk_hand/zzz/5", Compiled145::f4, "variant");
        Logic.register("animated_java:sculk_hand/zzz/6", Compiled145::f5, "variant");
        Logic.register("animated_java:sculk_hand/zzz/7", Compiled145::f6);
        Logic.register("animated_java:sculk_hand/zzz/8", Compiled145::f7);
        Logic.register("animated_java:sculk_hand/zzz/9", Compiled145::f8);
        Logic.register("animated_java:spinning_portal/animations/pause_all", Compiled145::f10);
        Logic.register("animated_java:spinning_portal/animations/portal_spin/apply_frame", Compiled145::f11, "frame");
        Logic.register("animated_java:spinning_portal/animations/portal_spin/next_frame", Compiled145::f12);
        Logic.register("animated_java:spinning_portal/animations/portal_spin/pause", Compiled145::f13);
        Logic.register("animated_java:spinning_portal/animations/portal_spin/play", Compiled145::f14);
        Logic.register("animated_java:spinning_portal/animations/portal_spin/resume", Compiled145::f15);
        Logic.register("animated_java:spinning_portal/animations/portal_spin/set_frame", Compiled145::f16, "frame");
        Logic.register("animated_java:spinning_portal/animations/portal_spin/stop", Compiled145::f17);
        Logic.register("animated_java:spinning_portal/animations/portal_spin/tween", Compiled145::f18, "duration", "to_frame");
        Logic.register("animated_java:spinning_portal/animations/portal_spin/zzz/apply_frame", Compiled145::f19, "frame");
        Logic.register("animated_java:spinning_portal/animations/portal_spin/zzz/frames/0", Compiled145::f20, "bone_portal");
        Logic.register("animated_java:spinning_portal/animations/portal_spin/zzz/frames/1", Compiled145::f21, "bone_portal");
        Logic.register("animated_java:spinning_portal/animations/portal_spin/zzz/frames/10", Compiled145::f22, "bone_portal");
        Logic.register("animated_java:spinning_portal/animations/portal_spin/zzz/frames/11", Compiled145::f23, "bone_portal");
    }
    // animated_java:sculk_hand/zzz/13
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.sculk_hand_locator.uuid"));
        return 1;
    }
    // animated_java:sculk_hand/zzz/2
    private static int f1(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.sculk_hand_locator"));
        return 1;
    }
    // animated_java:sculk_hand/zzz/3
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:sculk_hand/zzz/4")), Control.when("data", "storage", "aj:temp", "{args:{variant:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/zzz/5", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:sculk_hand/zzz/6", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        return 1;
    }
    // animated_java:sculk_hand/zzz/4
    private static int f3(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"sculk_hand\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"variant\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/remove/this"));
        return 1;
    }
    // animated_java:sculk_hand/zzz/5
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/$(variant)/apply"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:sculk_hand/zzz/6
    private static int f5(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"sculk_hand\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The variant \",\"color\":\"red\"},{\"text\":\"$(variant)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Variants:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"default\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"hand_only\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"lower_arm_only\",\"color\":\"yellow\"}],[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/remove/this"));
        return 1;
    }
    // animated_java:sculk_hand/zzz/7
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:sculk_hand/zzz/8")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:sculk_hand/zzz/9")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/zzz/10", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:sculk_hand/zzz/11", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/zzz/12", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:sculk_hand/zzz/8
    private static int f7(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"sculk_hand\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/remove/this"));
        return 1;
    }
    // animated_java:sculk_hand/zzz/9
    private static int f8(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"sculk_hand\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/remove/this"));
        return 1;
    }
    // animated_java:spinning_portal/animations/pause_all
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/animations/pause_all'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.spinning_portal.animation.portal_spin.playing"));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/apply_frame
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/animations/portal_spin/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.portal_spin.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/animations/portal_spin/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/next_frame
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/animations/portal_spin/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.portal_spin.frame", "1"), Control.when("score", "@s", "aj.portal_spin.frame", "matches", "30..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.portal_spin.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/animations/portal_spin/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.portal_spin.frame", "1"));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/pause
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/animations/portal_spin/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.spinning_portal.animation.portal_spin.playing"));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/play
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/animations/portal_spin/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.spinning_portal.animation.portal_spin.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.portal_spin.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/animations/portal_spin/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/resume
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/animations/portal_spin/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.spinning_portal.animation.portal_spin.playing"));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/set_frame
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/animations/portal_spin/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.portal_spin.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/animations/portal_spin/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/stop
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/animations/portal_spin/stop'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.spinning_portal.animation.portal_spin.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.portal_spin.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/animations/portal_spin/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/tween
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/animations/portal_spin/tween_play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Logic.call(c, "animated_java:spinning_portal/animations/pause_all"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.spinning_portal.animation.portal_spin.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tween_duration", "$(duration)"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.portal_spin.frame", "$(to_frame)"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.i", "=", "@s", "aj.tween_duration"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/animations/portal_spin/zzz/apply_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/animations/portal_spin/zzz/apply_frame", "{frame: $(to_frame)}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#this", "aj.i"), Control.on("passengers"), Control.store("result", "entity", "@s", "interpolation_duration", "int", "1")));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/zzz/apply_frame
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/animations/portal_spin/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/zzz/frames/0
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_portal)", "{ transformation: [-3.445092848397666e-21f,0f,-0.00001f,-5.931882933369992e-17f,0f,0.00001f,0f,0f,0.00001f,0f,-3.445092848397666e-21f,0.484375f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/zzz/frames/1
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_portal)", "{ transformation: [-1.2246467991473532e-21f,-0.0000016135776063280666f,-0.000009868959788567212f,-5.931882933369992e-17f,1.3877787807814458e-22f,0.000009868959788567212f,-0.0000016135776063280664f,0f,0.00001f,-4.751620212328406e-22f,-1.2085990015982777e-21f,0.484375f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/zzz/frames/10
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_portal)", "{ transformation: [-2.0968211220434203e-14f,-89.6929921692686f,4.476391139075956f,-5.931882933369992e-17f,-9.970316394134766e-15f,-4.476391139075956f,-89.6929921692686f,0f,89.80462639478256f,-2.095453997073911e-14f,-9.422116586114672e-15f,0.484375f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/zzz/frames/11
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_portal)", "{ transformation: [-4.382682949286069e-14f,-94.05770446507589f,20.237824932512254f,-5.931882933369992e-17f,5.340744369391728e-15f,-20.237824932512236f,-94.05770446507589f,0f,96.21029740749462f,-2.7540979779005476e-14f,-8.203069986252894e-15f,0.484375f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
}
