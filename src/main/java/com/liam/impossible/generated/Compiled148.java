package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled148 {
    public static void register() {
        Logic.register("animated_java:spinning_portal/zzz/10", Compiled148::f0, "animation");
        Logic.register("animated_java:spinning_portal/zzz/11", Compiled148::f1, "animation");
        Logic.register("animated_java:spinning_portal/zzz/12", Compiled148::f2);
        Logic.register("animated_java:spinning_portal/zzz/2", Compiled148::f3);
        Logic.register("animated_java:spinning_portal/zzz/3", Compiled148::f4);
        Logic.register("animated_java:spinning_portal/zzz/4", Compiled148::f5, "variant");
        Logic.register("animated_java:spinning_portal/zzz/5", Compiled148::f6, "variant");
        Logic.register("animated_java:spinning_portal/zzz/6", Compiled148::f7);
        Logic.register("animated_java:spinning_portal/zzz/7", Compiled148::f8);
        Logic.register("animated_java:spinning_portal/zzz/8", Compiled148::f9);
        Logic.register("animated_java:spinning_portal/zzz/9", Compiled148::f10, "animation");
        Logic.register("animated_java:vampire/animations/fly/apply_frame", Compiled148::f12, "frame");
        Logic.register("animated_java:vampire/animations/fly/next_frame", Compiled148::f13);
        Logic.register("animated_java:vampire/animations/fly/pause", Compiled148::f14);
        Logic.register("animated_java:vampire/animations/fly/play", Compiled148::f15);
        Logic.register("animated_java:vampire/animations/fly/resume", Compiled148::f16);
        Logic.register("animated_java:vampire/animations/fly/set_frame", Compiled148::f17, "frame");
        Logic.register("animated_java:vampire/animations/fly/stop", Compiled148::f18);
        Logic.register("animated_java:vampire/animations/fly/tween", Compiled148::f19, "duration", "to_frame");
        Logic.register("animated_java:vampire/animations/fly/zzz/apply_frame", Compiled148::f20, "frame");
        Logic.register("animated_java:vampire/animations/fly/zzz/frames/0", Compiled148::f21, "bone_arm_left_1", "bone_arm_left_2", "bone_arm_right_1", "bone_body", "bone_head", "bone_leg_left_1", "bone_leg_left_2", "bone_leg_right_1", "bone_leg_right_2");
        Logic.register("animated_java:vampire/animations/fly/zzz/frames/1", Compiled148::f22, "bone_arm_left_1", "bone_arm_left_2", "bone_arm_right_1", "bone_body", "bone_head", "bone_leg_left_1", "bone_leg_left_2", "bone_leg_right_1", "bone_leg_right_2");
        Logic.register("animated_java:vampire/animations/fly/zzz/frames/10", Compiled148::f23, "bone_arm_left_1", "bone_arm_left_2", "bone_arm_right_1", "bone_body", "bone_head", "bone_leg_left_1", "bone_leg_left_2", "bone_leg_right_1", "bone_leg_right_2");
    }
    // animated_java:spinning_portal/zzz/10
    private static int f0(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"portal_spin\",\"color\":\"yellow\"}]]"));
        Logic.step(() -> Logic.call(c, "animated_java:spinning_portal/remove/this"));
        return 1;
    }
    // animated_java:spinning_portal/zzz/11
    private static int f1(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:spinning_portal/animations/$(animation)/resume"));
        return 1;
    }
    // animated_java:spinning_portal/zzz/12
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.commands.uuid"));
        return 1;
    }
    // animated_java:spinning_portal/zzz/2
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:spinning_portal/zzz/3")), Control.when("data", "storage", "aj:temp", "{args:{variant:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/zzz/4", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:spinning_portal/zzz/5", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        return 1;
    }
    // animated_java:spinning_portal/zzz/3
    private static int f4(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"variant\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:spinning_portal/remove/this"));
        return 1;
    }
    // animated_java:spinning_portal/zzz/4
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/variants/$(variant)/apply"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:spinning_portal/zzz/5
    private static int f6(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The variant \",\"color\":\"red\"},{\"text\":\"$(variant)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Variants:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"default\",\"color\":\"yellow\"}]]"));
        Logic.step(() -> Logic.call(c, "animated_java:spinning_portal/remove/this"));
        return 1;
    }
    // animated_java:spinning_portal/zzz/6
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:spinning_portal/zzz/7")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:spinning_portal/zzz/8")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/zzz/9", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:spinning_portal/zzz/10", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/zzz/11", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:spinning_portal/zzz/7
    private static int f8(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:spinning_portal/remove/this"));
        return 1;
    }
    // animated_java:spinning_portal/zzz/8
    private static int f9(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:spinning_portal/remove/this"));
        return 1;
    }
    // animated_java:spinning_portal/zzz/9
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:vampire/animations/fly/apply_frame
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'vampire', 'function_path': 'animated_java:vampire/animations/fly/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.vampire.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.fly.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/animations/fly/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:vampire/animations/fly/next_frame
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'vampire', 'function_path': 'animated_java:vampire/animations/fly/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.vampire.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.fly.frame", "1"), Control.when("score", "@s", "aj.fly.frame", "matches", "15..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.fly.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/animations/fly/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.fly.frame", "1"));
        return 1;
    }
    // animated_java:vampire/animations/fly/pause
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'vampire', 'function_path': 'animated_java:vampire/animations/fly/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.vampire.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.vampire.animation.fly.playing"));
        return 1;
    }
    // animated_java:vampire/animations/fly/play
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'vampire', 'function_path': 'animated_java:vampire/animations/fly/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.vampire.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.vampire.animation.fly.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.fly.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/animations/fly/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:vampire/animations/fly/resume
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'vampire', 'function_path': 'animated_java:vampire/animations/fly/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.vampire.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.vampire.animation.fly.playing"));
        return 1;
    }
    // animated_java:vampire/animations/fly/set_frame
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'vampire', 'function_path': 'animated_java:vampire/animations/fly/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.vampire.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.fly.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/animations/fly/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:vampire/animations/fly/stop
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'vampire', 'function_path': 'animated_java:vampire/animations/fly/stop'}")), Control.unless("entity", "@s[type=item_display,tag=aj.vampire.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.vampire.animation.fly.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.fly.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/animations/fly/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:vampire/animations/fly/tween
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'vampire', 'function_path': 'animated_java:vampire/animations/fly/tween'}")), Control.unless("entity", "@s[type=item_display,tag=aj.vampire.root]")));
        Logic.step(() -> Logic.call(c, "animated_java:vampire/animations/pause_all"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.vampire.animation.fly.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tween_duration", "$(duration)"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.fly.frame", "$(to_frame)"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.i", "=", "@s", "aj.tween_duration"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/animations/fly/zzz/apply_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/animations/fly/zzz/apply_frame", "{frame: $(to_frame)}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#this", "aj.i"), Control.on("passengers"), Control.store("result", "entity", "@s", "interpolation_duration", "int", "1")));
        return 1;
    }
    // animated_java:vampire/animations/fly/zzz/apply_frame
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/animations/fly/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        return 1;
    }
    // animated_java:vampire/animations/fly/zzz/frames/0
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,-6.307397298776128e-17f,1.0497271911386184e-16f,-4.0591690136038744e-17f,0f,0.8571673007021122f,0.5150380749100543f,1.2689563036811942f,-1.2246467991473532e-16f,0.5150380749100543f,-0.8571673007021122f,0.33145630368119416f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_arm_right_1)", "{ transformation: [-8.659560562354934e-17f,0.8660254037844387f,0.5000000000000001f,-0.29296875000000006f,0.7071067811865475f,-0.3535533905932738f,0.6123724356957947f,1.1860922277608956f,0.7071067811865476f,0.35355339059327384f,-0.6123724356957944f,0.24859222776089557f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_arm_left_2)", "{ transformation: [-0.04361938736533569f,-0.8425887240367154f,-0.5367882181755231f,0.4264299026701299f,-0.7064337722128922f,-0.353914998051233f,0.6129400457071309f,1.374707925046781f,-0.7064337722128923f,0.40594139513059757f,-0.5797955753509055f,0.13578477802764638f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_arm_left_1)", "{ transformation: [-0.04361938736533569f,-0.8425887240367154f,-0.5367882181755231f,0.29296874999999994f,-0.7064337722128922f,-0.353914998051233f,0.6129400457071309f,1.1860922277608956f,-0.7064337722128923f,0.40594139513059757f,-0.5797955753509055f,0.24859222776089568f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-1f,-8.659560562354934e-17f,8.659560562354932e-17f,2.0295845068019384e-17f,0f,0.7071067811865475f,0.7071067811865476f,0.7717718481594029f,-1.2246467991473532e-16f,0.7071067811865476f,-0.7071067811865475f,-0.16572815184059708f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right_2)", "{ transformation: [-0.9914448682873245f,0.1294094774345942f,0.01703702722998214f,-0.15619647887086124f,0.08390054144786945f,0.5318474977514932f,0.8426736843406406f,0.4610915870329588f,0.09998886083701645f,0.8368939157895584f,-0.5381549975824205f,-0.3505978873222956f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right_1)", "{ transformation: [-0.9914448682873245f,0.1305261397066774f,-5.322647279111129e-8f,-0.11132812499999999f,0.08390054144786945f,0.6372884559812627f,0.7660444654311998f,0.7759150519554179f,0.09998886083701645f,0.7594908496659397f,-0.6427875830958657f,-0.16987135563661201f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left_2)", "{ transformation: [-0.9961946908430672f,-0.08682416975107826f,-0.0075961492298194f,0.14128794237332815f,-0.05888163463561947f,0.6062003646696956f,0.7931292902024017f,0.4524049775434783f,-0.06425800369388358f,0.7905584617353507f,-0.609005933911906f,-0.33789725720222813f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left_1)", "{ transformation: [-0.9961946908430672f,-0.08715582560038883f,-1.8585555801276276e-8f,0.11132812500000001f,-0.05888163463561947f,0.6730193616477467f,0.7372773507642134f,0.7759150519554179f,-0.06425800369388358f,0.734471783604499f,-0.6755901923874433f,-0.169871355636612f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:vampire/animations/fly/zzz/frames/1
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,-6.217499781552063e-17f,1.0550766547155984e-16f,-4.0475946645963564e-17f,0f,0.8615354692064551f,0.5076973855548332f,1.2698987337372292f,-1.2246467991473532e-16f,0.5076973855548332f,-0.8615354692064551f,0.33051118636119814f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_arm_right_1)", "{ transformation: [-0.001578841059292599f,0.896903152419254f,0.44222419929410756f,-0.29296875000000006f,0.7112499086485106f,-0.30984955052066254f,0.6309649938702061f,1.186799050302922f,0.7029374614490221f,0.31552811478939313f,-0.6374330820321895f,0.24788338977089858f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_arm_left_2)", "{ transformation: [-0.045814509378902774f,-0.8838696023623605f,-0.4654842175092228f,0.44364731073583225f,-0.7102154540943927f,-0.29886675915850214f,0.6373952220056168f,1.3659282161073039f,-0.7024920209481857f,0.3597960342887298f,-0.6140454170615045f,0.14147852830863095f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_arm_left_1)", "{ transformation: [-0.045814509378902774f,-0.8838696023623605f,-0.4654842175092228f,0.29296874999999994f,-0.7102154540943927f,-0.29886675915850214f,0.6373952220056168f,1.186799050302922f,-0.7024920209481857f,0.3597960342887298f,-0.6140454170615045f,0.2478833897708987f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-1f,-8.634868617805558e-17f,8.684182299987863e-17f,2.023797332298177e-17f,0f,0.7091172986394223f,0.7050905309038892f,0.7713006331313854f,-1.2246467991473532e-16f,0.7050905309038892f,-0.7091172986394223f,-0.16525559318059896f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right_2)", "{ transformation: [-0.9917753070401222f,0.1268962043561786f,0.016706096655601403f,-0.1553250776064085f,0.08255034432649469f,0.5344433900104942f,0.8411633037203107f,0.46002115885845046f,0.09781196755534831f,0.8356240878493664f,-0.5405230825865496f,-0.34932532790794635f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right_1)", "{ transformation: [-0.9917753070401222f,0.12799117292009002f,-1.0467897930405089e-7f,-0.11132812499999999f,0.08255034432649469f,0.6396649957909547f,0.7642081743944741f,0.7754320229609004f,0.09781196755534831f,0.757922788161365f,-0.644969662998698f,-0.16941057735231435f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left_2)", "{ transformation: [-0.9964388162527986f,-0.08397682729955562f,-0.007588013008828191f,0.14034265629987064f,-0.057141984836267444f,0.6063598436983142f,0.793134625091559f,0.4518682495264815f,-0.06200386305459781f,0.790743721079628f,-0.6089990874701292f,-0.3374989588494567f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left_1)", "{ transformation: [-0.9964388162527986f,-0.08431860902814678f,-0.00024007557156124893f,0.11132812500000001f,-0.057141984836267444f,0.6731786987767404f,0.7372687658393149f,0.7754320229609004f,-0.06200386305459781f,0.7346569346877583f,-0.675599518414196f,-0.1694105773523143f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:vampire/animations/fly/zzz/frames/10
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,-5.4650324178911737e-17f,1.0959443368054069e-16f,-3.951608156261084e-17f,0f,0.894906464107403f,0.446253762447764f,1.2775125121049689f,-1.2246467991473532e-16f,0.446253762447764f,-0.894906464107403f,0.32267329314969395f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_arm_right_1)", "{ transformation: [-0.01449898603615049f,0.9968552430654101f,-0.07790637828140493f,-0.29296875000000006f,0.7441652975560522f,0.06279776407572839f,0.6650371799684597f,1.1925093840787266f,0.6678381460483039f,-0.048332858389412495f,-0.7427355824805173f,0.24200496986227038f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_arm_left_2)", "{ transformation: [-0.0637600277057834f,-0.9799588765710738f,0.1887200548339176f,0.5378865048709822f,-0.7402224476919674f,0.17327151892657777f,0.6496519904239417f,1.2685296866045759f,-0.6693320452509878f,-0.09827299200917688f,-0.7364353551002926f,0.2233103662870182f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_arm_left_1)", "{ transformation: [-0.0637600277057834f,-0.9799588765710738f,0.1887200548339176f,0.29296874999999994f,-0.7402224476919674f,0.17327151892657777f,0.6496519904239417f,1.1925093840787266f,-0.6693320452509878f,-0.09827299200917688f,-0.7364353551002926f,0.2420049698622705f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-1f,-8.430097400023644e-17f,8.88309833854722e-17f,1.9758040781305412e-17f,0f,0.7253600258239338f,0.6883696920526805f,0.7674937439475155f,-1.2246467991473532e-16f,0.6883696920526805f,-0.7253600258239338f,-0.16133664657484703f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right_2)", "{ transformation: [-0.9951450078534355f,0.09757757042530422f,0.012846442864874777f,-0.14515986883759444f,0.06521450112525634f,0.555999290302031f,0.828620454747903f,0.4512387688881356f,0.07371215766323519f,0.8254352833102864f,-0.5596633906904198f,-0.33896448913042987f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right_1)", "{ transformation: [-0.9951450078534355f,0.09841957805423353f,1.1105161346887749e-7f,-0.11132812499999999f,0.06521450112525634f,0.6593993120513254f,0.7489590216488634f,0.7715271601118866f,0.07371215766323519f,0.7453228387228352f,-0.6626163172536312f,-0.16558680297615916f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left_2)", "{ transformation: [-0.9981335246406094f,-0.06067693507021184f,-0.006912057508379973f,0.13251321182844641f,-0.04242192041940792f,0.6074811352707019f,0.7932005111938271f,0.44758144694836155f,-0.04393003137311963f,0.7920132447381827f,-0.6089213188112668f,-0.33410810584035583f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left_1)", "{ transformation: [-0.9981335246406094f,-0.061048466519459506f,-0.0015974116990576286f,0.11132812500000001f,-0.04242192041940792f,0.6743014658483478f,0.7372366742252441f,0.7715271601118866f,-0.04393003137311963f,0.7359284054107381f,-0.6756326919659564f,-0.16558680297615913f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
}
