package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled144 {
    public static void register() {
        Logic.register("animated_java:sculk_hand/variants/hand_only/zzz/5", Compiled144::f0);
        Logic.register("animated_java:sculk_hand/variants/hand_only/zzz/6", Compiled144::f1);
        Logic.register("animated_java:sculk_hand/variants/hand_only/zzz/7", Compiled144::f2);
        Logic.register("animated_java:sculk_hand/variants/hand_only/zzz/8", Compiled144::f3);
        Logic.register("animated_java:sculk_hand/variants/hand_only/zzz/9", Compiled144::f4);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/apply", Compiled144::f5);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/zzz/0", Compiled144::f6);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/zzz/1", Compiled144::f7);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/zzz/10", Compiled144::f8);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/zzz/11", Compiled144::f9);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/zzz/12", Compiled144::f10);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/zzz/2", Compiled144::f11);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/zzz/3", Compiled144::f12);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/zzz/4", Compiled144::f13);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/zzz/5", Compiled144::f14);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/zzz/6", Compiled144::f15);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/zzz/7", Compiled144::f16);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/zzz/8", Compiled144::f17);
        Logic.register("animated_java:sculk_hand/variants/lower_arm_only/zzz/9", Compiled144::f18);
        Logic.register("animated_java:sculk_hand/zzz/0", Compiled144::f19);
        Logic.register("animated_java:sculk_hand/zzz/1", Compiled144::f20);
        Logic.register("animated_java:sculk_hand/zzz/10", Compiled144::f21, "animation");
        Logic.register("animated_java:sculk_hand/zzz/11", Compiled144::f22, "animation");
        Logic.register("animated_java:sculk_hand/zzz/12", Compiled144::f23, "animation");
    }
    // animated_java:sculk_hand/variants/hand_only/zzz/5
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "20"));
        return 1;
    }
    // animated_java:sculk_hand/variants/hand_only/zzz/6
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "21"));
        return 1;
    }
    // animated_java:sculk_hand/variants/hand_only/zzz/7
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "22"));
        return 1;
    }
    // animated_java:sculk_hand/variants/hand_only/zzz/8
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "23"));
        return 1;
    }
    // animated_java:sculk_hand/variants/hand_only/zzz/9
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "24"));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/apply
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/variants/lower_arm_only/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/lower_arm_only/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/lower_arm_only/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/lower_arm_only/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/lower_arm_only/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/lower_arm_only/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/lower_arm_only/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/lower_arm_only/zzz/6"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/lower_arm_only/zzz/7"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/lower_arm_only/zzz/8"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/lower_arm_only/zzz/9"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/lower_arm_only/zzz/10"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.hand]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/lower_arm_only/zzz/11"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.lower_arm_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/lower_arm_only/zzz/12"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.lower_arm]")));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/zzz/0
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "28"));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/zzz/1
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "29"));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/zzz/10
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "38"));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/zzz/11
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "39"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/zzz/12
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "40"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/zzz/2
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "30"));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/zzz/3
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "31"));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/zzz/4
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "32"));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/zzz/5
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "33"));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/zzz/6
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "34"));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/zzz/7
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "35"));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/zzz/8
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "36"));
        return 1;
    }
    // animated_java:sculk_hand/variants/lower_arm_only/zzz/9
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "37"));
        return 1;
    }
    // animated_java:sculk_hand/zzz/0
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/zzz/3", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/zzz/7", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:sculk_hand/as_root/on_summon"));
        return 1;
    }
    // animated_java:sculk_hand/zzz/1
    private static int f20(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Native.summon(c, "minecraft:marker", "~", "~", "~", "{Tags:['aj.new', 'aj.locator', 'aj.sculk_hand.locator', 'aj.sculk_hand.locator.sculk_hand_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/zzz/2"), Control.as("@e[type=minecraft:marker,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.sculk_hand_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_5]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_finger_upper_5", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_5]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_finger_lower_5", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_4]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_finger_upper_4", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_4]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_finger_lower_4", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_3]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_finger_upper_3", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_3]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_finger_lower_3", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_finger_upper_2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_finger_lower_2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_finger_upper_1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_finger_lower_1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.hand]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_hand", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.lower_arm_2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_lower_arm_2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.lower_arm]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_lower_arm", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // animated_java:sculk_hand/zzz/10
    private static int f21(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:sculk_hand/zzz/11
    private static int f22(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"sculk_hand\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"grab\",\"color\":\"yellow\"}],[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/remove/this"));
        return 1;
    }
    // animated_java:sculk_hand/zzz/12
    private static int f23(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/animations/$(animation)/resume"));
        return 1;
    }
}
