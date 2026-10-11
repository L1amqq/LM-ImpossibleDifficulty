package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled016 {
    public static void register() {
        Logic.register("animated_java:chest_mob/zzz/10", Compiled016::f0, "animation");
        Logic.register("animated_java:chest_mob/zzz/11", Compiled016::f1, "animation");
        Logic.register("animated_java:chest_mob/zzz/2", Compiled016::f2);
        Logic.register("animated_java:chest_mob/zzz/3", Compiled016::f3);
        Logic.register("animated_java:chest_mob/zzz/4", Compiled016::f4, "variant");
        Logic.register("animated_java:chest_mob/zzz/5", Compiled016::f5, "variant");
        Logic.register("animated_java:chest_mob/zzz/6", Compiled016::f6);
        Logic.register("animated_java:chest_mob/zzz/7", Compiled016::f7);
        Logic.register("animated_java:chest_mob/zzz/8", Compiled016::f8);
        Logic.register("animated_java:chest_mob/zzz/9", Compiled016::f9, "animation");
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/pause_all", Compiled016::f10);
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/apply_frame", Compiled016::f11, "frame");
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/next_frame", Compiled016::f12);
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/pause", Compiled016::f13);
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/play", Compiled016::f14);
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/resume", Compiled016::f15);
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/set_frame", Compiled016::f16, "frame");
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/stop", Compiled016::f17);
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/tween", Compiled016::f18, "duration", "to_frame");
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/apply_frame", Compiled016::f19, "frame");
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/0", Compiled016::f20, "bone_rocket_launcher_arm2", "bone_rocket_launcher_arm3", "bone_rocket_launcher_arm4", "bone_rocket_launcher_arm5", "bone_rocketlauncher");
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/1", Compiled016::f21);
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/10", Compiled016::f22);
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/100", Compiled016::f23, "bone_rocket_launcher_arm2", "bone_rocket_launcher_arm3", "bone_rocket_launcher_arm4", "bone_rocket_launcher_arm5", "bone_rocketlauncher");
    }
    // animated_java:chest_mob/zzz/10
    private static int f0(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"chest_mob\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"shoot\",\"color\":\"yellow\"}],[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/remove/this"));
        return 1;
    }
    // animated_java:chest_mob/zzz/11
    private static int f1(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/animations/$(animation)/resume"));
        return 1;
    }
    // animated_java:chest_mob/zzz/2
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:chest_mob/zzz/3")), Control.when("data", "storage", "aj:temp", "{args:{variant:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/zzz/4", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:chest_mob/zzz/5", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        return 1;
    }
    // animated_java:chest_mob/zzz/3
    private static int f3(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"chest_mob\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"variant\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/remove/this"));
        return 1;
    }
    // animated_java:chest_mob/zzz/4
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/$(variant)/apply"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:chest_mob/zzz/5
    private static int f5(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"chest_mob\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The variant \",\"color\":\"red\"},{\"text\":\"$(variant)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Variants:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"default\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"shulker\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"chest\",\"color\":\"yellow\"}],[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/remove/this"));
        return 1;
    }
    // animated_java:chest_mob/zzz/6
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:chest_mob/zzz/7")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:chest_mob/zzz/8")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/zzz/9", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:chest_mob/zzz/10", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/zzz/11", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:chest_mob/zzz/7
    private static int f7(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"chest_mob\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/remove/this"));
        return 1;
    }
    // animated_java:chest_mob/zzz/8
    private static int f8(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"chest_mob\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/remove/this"));
        return 1;
    }
    // animated_java:chest_mob/zzz/9
    private static int f9(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/pause_all
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/animations/pause_all'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.crafting_table_rocket_launcher.animation.transform.playing"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/apply_frame
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/animations/transform/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.transform.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/animations/transform/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/next_frame
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/animations/transform/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.transform.frame", "1"), Control.when("score", "@s", "aj.transform.frame", "matches", "178..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.transform.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/animations/transform/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.transform.frame", "1"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/pause
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/animations/transform/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.crafting_table_rocket_launcher.animation.transform.playing"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/play
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/animations/transform/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.crafting_table_rocket_launcher.animation.transform.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.transform.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/animations/transform/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/resume
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/animations/transform/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.crafting_table_rocket_launcher.animation.transform.playing"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/set_frame
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/animations/transform/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.transform.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/animations/transform/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/stop
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/animations/transform/stop'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.crafting_table_rocket_launcher.animation.transform.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.transform.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/animations/transform/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/tween
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/animations/transform/tween_play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_rocket_launcher/animations/pause_all"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.crafting_table_rocket_launcher.animation.transform.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tween_duration", "$(duration)"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.transform.frame", "$(to_frame)"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.i", "=", "@s", "aj.tween_duration"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/animations/transform/zzz/apply_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/animations/transform/zzz/apply_frame", "{frame: $(to_frame)}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#this", "aj.i"), Control.on("passengers"), Control.store("result", "entity", "@s", "interpolation_duration", "int", "1")));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/apply_frame
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/0
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocketlauncher)", "{ transformation: [-0.18229166666666666f,2.230304283145454e-17f,9.73771879750236e-19f,8.85240452757497e-18f,0f,0.007951450821806042f,-0.18211816539252612f,0.8203125f,-2.232429060945696e-17f,-0.18211816539252612f,-0.007951450821806042f,-0.06250000000000001f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm5)", "{ transformation: [-0.25f,3.749399456654644e-33f,-3.061616997868383e-17f,6.938893903907228e-18f,0f,-0.25f,-3.061616997868383e-17f,0.9140625f,-3.061616997868383e-17f,-3.061616997868383e-17f,0.25f,-0.046875f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm4)", "{ transformation: [-0.25f,0f,3.061616997868383e-17f,0.015625000000000007f,0f,0.25f,0f,0.9140625f,-3.061616997868383e-17f,0f,-0.25f,-0.046875f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm3)", "{ transformation: [-0.25f,0f,3.061616997868383e-17f,0.015624999999999998f,0f,0.25f,0f,0.77109375f,-3.061616997868383e-17f,0f,-0.25f,0.012109375000000002f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm2)", "{ transformation: [-0.25f,0f,3.061616997868383e-17f,0.015625000000000003f,0f,0.25f,0f,0.7421875f,-3.061616997868383e-17f,0f,-0.25f,-0.031249999999999997f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/1
    private static int f21(Frame c) {

        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/10
    private static int f22(Frame c) {

        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/100
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocketlauncher)", "{ transformation: [-0.6518058317836128f,7.882018818995433e-17f,1.5541099827214558e-17f,2.690951220825158e-17f,0f,0.12775281164311283f,-0.6393328901311436f,1.55100334419198f,-7.982319255593795e-17f,-0.6436156795970236f,-0.12690271054507207f,-0.20162880100079522f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm5)", "{ transformation: [-0.8574973215872452f,1.7493632830119003e-17f,-1.0354579342627993e-16f,1.3877787807814457e-17f,0f,-0.8455155682305506f,-0.14284635245279498f,1.859143785250137f,-1.0501313501592484e-16f,-0.14284635245279498f,0.8455155682305506f,-0.09521669581658768f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm4)", "{ transformation: [-0.8574973215872452f,-1.1328004258958878e-17f,1.0440035845427864e-16f,0.05359358259920284f,0f,0.8524936212381091f,0.09250017447353699f,1.859143785250137f,-1.0501313501592484e-16f,0.09250017447353699f,-0.8524936212381091f,-0.09521669581658768f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm3)", "{ transformation: [-0.8574973215872452f,-1.1328004258958878e-17f,1.0440035845427864e-16f,0.05359358259920283f,0f,0.8524936212381091f,0.09250017447353699f,1.0098513365089237f,-1.0501313501592484e-16f,0.09250017447353699f,-0.8524936212381091f,0.01613373840941614f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm2)", "{ transformation: [-0.8574973215872452f,0f,1.0501313501592484e-16f,0.053593582599202834f,0f,0.8574973215872452f,0f,0.9107032087003986f,-1.0501313501592484e-16f,0f,-0.8574973215872452f,-0.06249999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
}
