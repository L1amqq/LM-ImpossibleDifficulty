package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled025 {
    public static void register() {
        Logic.register("animated_java:crafting_table_rocket_launcher/variants/default/zzz/0", Compiled025::f0);
        Logic.register("animated_java:crafting_table_rocket_launcher/variants/default/zzz/1", Compiled025::f1);
        Logic.register("animated_java:crafting_table_rocket_launcher/variants/default/zzz/2", Compiled025::f2);
        Logic.register("animated_java:crafting_table_rocket_launcher/variants/default/zzz/3", Compiled025::f3);
        Logic.register("animated_java:crafting_table_rocket_launcher/variants/default/zzz/4", Compiled025::f4);
        Logic.register("animated_java:crafting_table_rocket_launcher/zzz/0", Compiled025::f5);
        Logic.register("animated_java:crafting_table_rocket_launcher/zzz/1", Compiled025::f6);
        Logic.register("animated_java:crafting_table_rocket_launcher/zzz/10", Compiled025::f7, "animation");
        Logic.register("animated_java:crafting_table_rocket_launcher/zzz/11", Compiled025::f8, "animation");
        Logic.register("animated_java:crafting_table_rocket_launcher/zzz/12", Compiled025::f9);
        Logic.register("animated_java:crafting_table_rocket_launcher/zzz/2", Compiled025::f10);
        Logic.register("animated_java:crafting_table_rocket_launcher/zzz/3", Compiled025::f11);
        Logic.register("animated_java:crafting_table_rocket_launcher/zzz/4", Compiled025::f12, "variant");
        Logic.register("animated_java:crafting_table_rocket_launcher/zzz/5", Compiled025::f13, "variant");
        Logic.register("animated_java:crafting_table_rocket_launcher/zzz/6", Compiled025::f14);
        Logic.register("animated_java:crafting_table_rocket_launcher/zzz/7", Compiled025::f15);
        Logic.register("animated_java:crafting_table_rocket_launcher/zzz/8", Compiled025::f16);
        Logic.register("animated_java:crafting_table_rocket_launcher/zzz/9", Compiled025::f17, "animation");
        Logic.register("animated_java:crafting_table_table/animations/pause_all", Compiled025::f19);
        Logic.register("animated_java:crafting_table_table/animations/transform/apply_frame", Compiled025::f20, "frame");
        Logic.register("animated_java:crafting_table_table/animations/transform/next_frame", Compiled025::f21);
        Logic.register("animated_java:crafting_table_table/animations/transform/pause", Compiled025::f22);
        Logic.register("animated_java:crafting_table_table/animations/transform/play", Compiled025::f23);
    }
    // animated_java:crafting_table_rocket_launcher/variants/default/zzz/0
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "130"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/variants/default/zzz/1
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "131"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/variants/default/zzz/2
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "132"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/variants/default/zzz/3
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "133"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/variants/default/zzz/4
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "134"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/zzz/0
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/zzz/2", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/zzz/6", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "1"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:crafting_table_rocket_launcher/as_root/on_summon"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/zzz/1
    private static int f6(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocketlauncher]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_rocketlauncher", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm5]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_rocket_launcher_arm5", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm4]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_rocket_launcher_arm4", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm3]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_rocket_launcher_arm3", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_rocket_launcher_arm2", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/zzz/10
    private static int f7(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"transform\",\"color\":\"yellow\"}]]"));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_rocket_launcher/remove/this"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/zzz/11
    private static int f8(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_rocket_launcher/animations/$(animation)/resume"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/zzz/12
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.commands.uuid"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/zzz/2
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:crafting_table_rocket_launcher/zzz/3")), Control.when("data", "storage", "aj:temp", "{args:{variant:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/zzz/4", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:crafting_table_rocket_launcher/zzz/5", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/zzz/3
    private static int f11(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"variant\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_rocket_launcher/remove/this"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/zzz/4
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/variants/$(variant)/apply"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/zzz/5
    private static int f13(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The variant \",\"color\":\"red\"},{\"text\":\"$(variant)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Variants:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"default\",\"color\":\"yellow\"}]]"));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_rocket_launcher/remove/this"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/zzz/6
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:crafting_table_rocket_launcher/zzz/7")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:crafting_table_rocket_launcher/zzz/8")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/zzz/9", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:crafting_table_rocket_launcher/zzz/10", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/zzz/11", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/zzz/7
    private static int f15(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_rocket_launcher/remove/this"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/zzz/8
    private static int f16(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_rocket_launcher/remove/this"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/zzz/9
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:crafting_table_table/animations/pause_all
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_table', 'function_path': 'animated_java:crafting_table_table/animations/pause_all'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_table.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.crafting_table_table.animation.transform.playing"));
        return 1;
    }
    // animated_java:crafting_table_table/animations/transform/apply_frame
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_table', 'function_path': 'animated_java:crafting_table_table/animations/transform/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_table.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.transform.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_table/animations/transform/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:crafting_table_table/animations/transform/next_frame
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_table', 'function_path': 'animated_java:crafting_table_table/animations/transform/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_table.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.transform.frame", "1"), Control.when("score", "@s", "aj.transform.frame", "matches", "178..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.transform.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_table/animations/transform/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.transform.frame", "1"));
        return 1;
    }
    // animated_java:crafting_table_table/animations/transform/pause
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_table', 'function_path': 'animated_java:crafting_table_table/animations/transform/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_table.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.crafting_table_table.animation.transform.playing"));
        return 1;
    }
    // animated_java:crafting_table_table/animations/transform/play
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_table', 'function_path': 'animated_java:crafting_table_table/animations/transform/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_table.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.crafting_table_table.animation.transform.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.transform.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_table/animations/transform/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
}
