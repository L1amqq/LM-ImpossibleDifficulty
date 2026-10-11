package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled134 {
    public static void register() {
        Logic.register("animated_java:matrix_cow/variants/default/apply", Compiled134::f0);
        Logic.register("animated_java:matrix_cow/variants/default/zzz/0", Compiled134::f1);
        Logic.register("animated_java:matrix_cow/variants/default/zzz/1", Compiled134::f2);
        Logic.register("animated_java:matrix_cow/variants/default/zzz/2", Compiled134::f3);
        Logic.register("animated_java:matrix_cow/variants/default/zzz/3", Compiled134::f4);
        Logic.register("animated_java:matrix_cow/variants/default/zzz/4", Compiled134::f5);
        Logic.register("animated_java:matrix_cow/variants/default/zzz/5", Compiled134::f6);
        Logic.register("animated_java:matrix_cow/variants/default/zzz/6", Compiled134::f7);
        Logic.register("animated_java:matrix_cow/variants/default/zzz/7", Compiled134::f8);
        Logic.register("animated_java:matrix_cow/variants/default/zzz/8", Compiled134::f9);
        Logic.register("animated_java:matrix_cow/variants/default/zzz/9", Compiled134::f10);
        Logic.register("animated_java:matrix_cow/zzz/0", Compiled134::f11);
        Logic.register("animated_java:matrix_cow/zzz/1", Compiled134::f12);
        Logic.register("animated_java:matrix_cow/zzz/10", Compiled134::f13, "animation");
        Logic.register("animated_java:matrix_cow/zzz/11", Compiled134::f14, "animation");
        Logic.register("animated_java:matrix_cow/zzz/12", Compiled134::f15);
        Logic.register("animated_java:matrix_cow/zzz/2", Compiled134::f16);
        Logic.register("animated_java:matrix_cow/zzz/3", Compiled134::f17);
        Logic.register("animated_java:matrix_cow/zzz/4", Compiled134::f18, "variant");
        Logic.register("animated_java:matrix_cow/zzz/5", Compiled134::f19, "variant");
        Logic.register("animated_java:matrix_cow/zzz/6", Compiled134::f20);
        Logic.register("animated_java:matrix_cow/zzz/7", Compiled134::f21);
        Logic.register("animated_java:matrix_cow/zzz/8", Compiled134::f22);
        Logic.register("animated_java:matrix_cow/zzz/9", Compiled134::f23, "animation");
    }
    // animated_java:matrix_cow/variants/default/apply
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'matrix_cow', 'function_path': 'animated_java:matrix_cow/variants/default/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.matrix_cow.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/variants/default/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.leg4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/variants/default/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.leg3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/variants/default/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/variants/default/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.tit1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/variants/default/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.tit2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/variants/default/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.tit3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/variants/default/zzz/6"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.tit4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/variants/default/zzz/7"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.body]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/variants/default/zzz/8"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.leg1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/variants/default/zzz/9"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.leg2]")));
        return 1;
    }
    // animated_java:matrix_cow/variants/default/zzz/0
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "28"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:matrix_cow/variants/default/zzz/1
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "29"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:matrix_cow/variants/default/zzz/2
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "30"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:matrix_cow/variants/default/zzz/3
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "31"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:matrix_cow/variants/default/zzz/4
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "32"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:matrix_cow/variants/default/zzz/5
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "33"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:matrix_cow/variants/default/zzz/6
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "34"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:matrix_cow/variants/default/zzz/7
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "35"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:matrix_cow/variants/default/zzz/8
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "36"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:matrix_cow/variants/default/zzz/9
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "37"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:matrix_cow/zzz/0
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/zzz/2", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/zzz/6", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:matrix_cow/as_root/on_summon"));
        return 1;
    }
    // animated_java:matrix_cow/zzz/1
    private static int f12(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.leg4]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg4", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.leg3]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg3", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.head]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_head", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.tit1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tit1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.tit2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tit2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.tit3]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tit3", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.tit4]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tit4", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.body]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_body", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.leg1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.matrix_cow.bone.leg2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg2", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // animated_java:matrix_cow/zzz/10
    private static int f13(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"squirt\",\"color\":\"yellow\"}]]"));
        Logic.step(() -> Logic.call(c, "animated_java:matrix_cow/remove/this"));
        return 1;
    }
    // animated_java:matrix_cow/zzz/11
    private static int f14(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:matrix_cow/animations/$(animation)/resume"));
        return 1;
    }
    // animated_java:matrix_cow/zzz/12
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.commands.uuid"));
        return 1;
    }
    // animated_java:matrix_cow/zzz/2
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:matrix_cow/zzz/3")), Control.when("data", "storage", "aj:temp", "{args:{variant:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/zzz/4", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:matrix_cow/zzz/5", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        return 1;
    }
    // animated_java:matrix_cow/zzz/3
    private static int f17(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"variant\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:matrix_cow/remove/this"));
        return 1;
    }
    // animated_java:matrix_cow/zzz/4
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/variants/$(variant)/apply"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:matrix_cow/zzz/5
    private static int f19(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The variant \",\"color\":\"red\"},{\"text\":\"$(variant)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Variants:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"default\",\"color\":\"yellow\"}]]"));
        Logic.step(() -> Logic.call(c, "animated_java:matrix_cow/remove/this"));
        return 1;
    }
    // animated_java:matrix_cow/zzz/6
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:matrix_cow/zzz/7")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:matrix_cow/zzz/8")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/zzz/9", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:matrix_cow/zzz/10", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/zzz/11", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:matrix_cow/zzz/7
    private static int f21(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:matrix_cow/remove/this"));
        return 1;
    }
    // animated_java:matrix_cow/zzz/8
    private static int f22(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:matrix_cow/remove/this"));
        return 1;
    }
    // animated_java:matrix_cow/zzz/9
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:matrix_cow/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
}
