package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled008 {
    public static void register() {
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/59", Compiled008::f0);
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/6", Compiled008::f1);
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/60", Compiled008::f2);
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/61", Compiled008::f3);
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/62", Compiled008::f4);
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/63", Compiled008::f5);
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/7", Compiled008::f6);
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/8", Compiled008::f7);
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/9", Compiled008::f8, "bone_head");
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/frames/zzz/0", Compiled008::f9);
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/on_tick", Compiled008::f10);
        Logic.register("animated_java:bouncing_pig/animations/jump/zzz/set_frame", Compiled008::f11, "frame");
        Logic.register("animated_java:bouncing_pig/animations/pause_all", Compiled008::f12);
        Logic.register("animated_java:bouncing_pig/apply_default_pose", Compiled008::f13);
        Logic.register("animated_java:bouncing_pig/as_own_locator_entities", Compiled008::f14, "command");
        Logic.register("animated_java:bouncing_pig/on_load", Compiled008::f15);
        Logic.register("animated_java:bouncing_pig/remove/all", Compiled008::f16);
        Logic.register("animated_java:bouncing_pig/remove/this", Compiled008::f17);
        Logic.register("animated_java:bouncing_pig/remove/zzz/0", Compiled008::f18);
        Logic.register("animated_java:bouncing_pig/root/on_load", Compiled008::f19);
        Logic.register("animated_java:bouncing_pig/root/on_tick", Compiled008::f20);
        Logic.register("animated_java:bouncing_pig/root/outdated_tellraw", Compiled008::f21, "x", "y", "z");
        Logic.register("animated_java:bouncing_pig/root/zzz/0", Compiled008::f22);
        Logic.register("animated_java:bouncing_pig/root/zzz/1", Compiled008::f23);
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/59
    private static int f0(Frame c) {

        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/6
    private static int f1(Frame c) {

        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/60
    private static int f2(Frame c) {

        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/61
    private static int f3(Frame c) {

        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/62
    private static int f4(Frame c) {

        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/63
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/animations/jump/zzz/frames/zzz/0"), Control.on("vehicle"), Control.unless("entity", "@s[tag=aj.transforms_only]"), Control.positioned("^0", "^1.0262760437", "^0.3367142076"), Control.rotated("~180", "~-50")));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/7
    private static int f6(Frame c) {

        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/8
    private static int f7(Frame c) {

        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/9
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,-3.829358679476255e-18f,1.2240479499889902e-16f,-4.592425496802573e-17f,0f,0.9995110025529157f,0.03126908658188143f,0.7500000000000002f,-1.2246467991473532e-16f,0.03126908658188143f,-0.9995110025529157f,0.3749999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/frames/zzz/0
    private static int f9(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:bouncing_pig/remove/this"));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/on_tick
    private static int f10(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "1"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.jump.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:bouncing_pig/animations/jump/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:bouncing_pig/animations/jump/pause")), Control.when("score", "@s", "aj.jump.frame", "matches", "63..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.jump.frame", "1"));
        return 1;
    }
    // animated_java:bouncing_pig/animations/jump/zzz/set_frame
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/animations/jump/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:bouncing_pig/animations/pause_all
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/animations/pause_all'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.bouncing_pig.animation.jump.playing"));
        return 1;
    }
    // animated_java:bouncing_pig/apply_default_pose
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/apply_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.18749999999999994f,0f,1f,0f,0.3125f,-1.2246467991473532e-16f,0f,-1f,-0.375f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.18750000000000006f,0f,1f,0f,0.375f,-1.2246467991473532e-16f,0f,-1f,-0.4375f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.2246467991473532e-16f,2.719262146893782e-32f,6.123233995736766e-17f,0f,2.220446049250313e-16f,1f,0.625f,-1.2246467991473532e-16f,1f,-2.220446049250313e-16f,-0.5f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.tail]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.18750000000000003f,0f,1f,0f,0.37500000000000017f,-1.2246467991473532e-16f,0f,-1f,0.3125f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.18749999999999997f,0f,1f,0f,0.37500000000000017f,-1.2246467991473532e-16f,0f,-1f,0.3125f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-4.592425496802573e-17f,0f,1f,0f,0.7500000000000002f,-1.2246467991473532e-16f,0f,-1f,0.3749999999999999f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.2246467991473532e-16f,2.719262146893782e-32f,4.592425496802574e-17f,0f,2.220446049250313e-16f,1f,0.375f,-1.2246467991473532e-16f,1f,-2.220446049250313e-16f,-0.375f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.body]")));
        return 1;
    }
    // animated_java:bouncing_pig/as_own_locator_entities
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/as_all_locators'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "command", "set", "value", "'$(command)'"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/zzz/12"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        return 1;
    }
    // animated_java:bouncing_pig/on_load
    private static int f15(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "aj.jump.frame", "dummy"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/root/on_load"), Control.as("@e[type=item_display,tag=aj.bouncing_pig.root]"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1"), Control.at("@s")));
        return 1;
    }
    // animated_java:bouncing_pig/remove/all
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/remove/this"), Control.as("@e[type=item_display,tag=aj.bouncing_pig.root]")));
        return 1;
    }
    // animated_java:bouncing_pig/remove/this
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/remove/this'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Logic.call(c, "#animated_java:bouncing_pig/as_root/on_remove"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/remove/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // animated_java:bouncing_pig/remove/zzz/0
    private static int f18(Frame c) {

        return 1;
    }
    // animated_java:bouncing_pig/root/on_load
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/root/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.data]"), Control.unless("data", "entity", "@s", "{data:{rigHash: '9875e9a6ca03f1a76cfdcc6306f61b18f40adbddd7c620aae8b6b872031bc6a3'}}"), Control.on("vehicle")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.is_rig_loaded", "1"));
        return 1;
    }
    // animated_java:bouncing_pig/root/on_tick
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "#animated_java:global/root/on_load"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1")));
        Logic.step(() -> Logic.call(c, "#animated_java:bouncing_pig/as_root/pre_tick"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/animations/jump/zzz/on_tick"), Control.when("entity", "@s[tag=aj.bouncing_pig.animation.jump.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/root/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:bouncing_pig/as_root/post_tick"));
        return 1;
    }
    // animated_java:bouncing_pig/root/outdated_tellraw
    private static int f21(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The \",\"color\":\"red\"},{\"text\":\"bouncing_pig\",\"color\":\"yellow\"},{\"text\":\" rig instance at\",\"color\":\"red\"},[{\"text\":\" [\",\"color\":\"yellow\"},{\"score\":{\"name\":\"#this.x\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.y\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.z\",\"objective\":\"aj.i\"}},\"]\"],{\"text\":\" is outdated! It will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"},\"\\n \",{\"text\":\"[Click Here to Teleport to the Rig Instance]\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/tp @s $(x) $(y) $(z)\"},\"color\":\"aqua\",\"underlined\":true}]"));
        return 1;
    }
    // animated_java:bouncing_pig/root/zzz/0
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1"), Control.store("result", "storage", "aj:temp", "x", "int", "1"), Control.store("result", "score", "#this.x", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1"), Control.store("result", "storage", "aj:temp", "y", "int", "1"), Control.store("result", "score", "#this.y", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1"), Control.store("result", "storage", "aj:temp", "z", "int", "1"), Control.store("result", "score", "#this.z", "aj.i")));
        Logic.step(() -> Logic.call(c, "animated_java:bouncing_pig/root/outdated_tellraw", "with", "storage", "aj:temp"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.rigHash", "set", "value", "'9875e9a6ca03f1a76cfdcc6306f61b18f40adbddd7c620aae8b6b872031bc6a3'"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{Glowing: 1b, glow_color_override: 16711680}"), Control.on("passengers")));
        Logic.step(() -> Native.summon(c, "minecraft:text_display", "~", "~", "~", "{Tags:['aj.rig_entity', 'aj.outdated_rig_text_display', 'aj.new'], text:'[\"\",{\"text\":\"This rig instance is outdated!\\\\nIt will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"}]', billboard: \"vertical\", transformation:{translation:[0f,3f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[1f,1f,1f]}}"));
        Logic.step(() -> Native.ride(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "mount", "@s"));
        Logic.step(() -> Native.tag(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "remove", "aj.new"));
        return 1;
    }
    // animated_java:bouncing_pig/root/zzz/1
    private static int f23(Frame c) {

        return 1;
    }
}
