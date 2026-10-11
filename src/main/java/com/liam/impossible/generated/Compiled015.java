package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled015 {
    public static void register() {
        Logic.register("animated_java:chest_mob/variants/default/apply", Compiled015::f0);
        Logic.register("animated_java:chest_mob/variants/default/zzz/0", Compiled015::f1);
        Logic.register("animated_java:chest_mob/variants/default/zzz/1", Compiled015::f2);
        Logic.register("animated_java:chest_mob/variants/default/zzz/2", Compiled015::f3);
        Logic.register("animated_java:chest_mob/variants/default/zzz/3", Compiled015::f4);
        Logic.register("animated_java:chest_mob/variants/default/zzz/4", Compiled015::f5);
        Logic.register("animated_java:chest_mob/variants/default/zzz/5", Compiled015::f6);
        Logic.register("animated_java:chest_mob/variants/default/zzz/6", Compiled015::f7);
        Logic.register("animated_java:chest_mob/variants/default/zzz/7", Compiled015::f8);
        Logic.register("animated_java:chest_mob/variants/default/zzz/8", Compiled015::f9);
        Logic.register("animated_java:chest_mob/variants/default/zzz/9", Compiled015::f10);
        Logic.register("animated_java:chest_mob/variants/shulker/apply", Compiled015::f11);
        Logic.register("animated_java:chest_mob/variants/shulker/zzz/0", Compiled015::f12);
        Logic.register("animated_java:chest_mob/variants/shulker/zzz/1", Compiled015::f13);
        Logic.register("animated_java:chest_mob/variants/shulker/zzz/2", Compiled015::f14);
        Logic.register("animated_java:chest_mob/variants/shulker/zzz/3", Compiled015::f15);
        Logic.register("animated_java:chest_mob/variants/shulker/zzz/4", Compiled015::f16);
        Logic.register("animated_java:chest_mob/variants/shulker/zzz/5", Compiled015::f17);
        Logic.register("animated_java:chest_mob/variants/shulker/zzz/6", Compiled015::f18);
        Logic.register("animated_java:chest_mob/variants/shulker/zzz/7", Compiled015::f19);
        Logic.register("animated_java:chest_mob/variants/shulker/zzz/8", Compiled015::f20);
        Logic.register("animated_java:chest_mob/variants/shulker/zzz/9", Compiled015::f21);
        Logic.register("animated_java:chest_mob/zzz/0", Compiled015::f22);
        Logic.register("animated_java:chest_mob/zzz/1", Compiled015::f23);
    }
    // animated_java:chest_mob/variants/default/apply
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'chest_mob', 'function_path': 'animated_java:chest_mob/variants/default/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.chest_mob.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/default/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.chest_lid]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/default/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.chest]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/default/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.hand_left]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/default/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.water_gun]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/default/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.hand_right]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/default/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.eyebrow_left]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/default/zzz/6"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.eyebrow_right]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/default/zzz/7"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/default/zzz/8"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.muzzle_flash_frame1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/default/zzz/9"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.muzzle_flash_frame2]")));
        return 1;
    }
    // animated_java:chest_mob/variants/default/zzz/0
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "39"));
        return 1;
    }
    // animated_java:chest_mob/variants/default/zzz/1
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "38"));
        return 1;
    }
    // animated_java:chest_mob/variants/default/zzz/2
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "40"));
        return 1;
    }
    // animated_java:chest_mob/variants/default/zzz/3
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "42"));
        return 1;
    }
    // animated_java:chest_mob/variants/default/zzz/4
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "41"));
        return 1;
    }
    // animated_java:chest_mob/variants/default/zzz/5
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "44"));
        return 1;
    }
    // animated_java:chest_mob/variants/default/zzz/6
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "45"));
        return 1;
    }
    // animated_java:chest_mob/variants/default/zzz/7
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "43"));
        return 1;
    }
    // animated_java:chest_mob/variants/default/zzz/8
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "46"));
        return 1;
    }
    // animated_java:chest_mob/variants/default/zzz/9
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "47"));
        return 1;
    }
    // animated_java:chest_mob/variants/shulker/apply
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'chest_mob', 'function_path': 'animated_java:chest_mob/variants/shulker/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.chest_mob.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/shulker/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.chest_lid]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/shulker/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.chest]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/shulker/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.hand_left]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/shulker/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.water_gun]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/shulker/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.hand_right]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/shulker/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.eyebrow_left]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/shulker/zzz/6"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.eyebrow_right]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/shulker/zzz/7"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/shulker/zzz/8"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.muzzle_flash_frame1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/shulker/zzz/9"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.muzzle_flash_frame2]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "shulker_variant"));
        return 1;
    }
    // animated_java:chest_mob/variants/shulker/zzz/0
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "48"));
        return 1;
    }
    // animated_java:chest_mob/variants/shulker/zzz/1
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "135"));
        return 1;
    }
    // animated_java:chest_mob/variants/shulker/zzz/2
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "136"));
        return 1;
    }
    // animated_java:chest_mob/variants/shulker/zzz/3
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "137"));
        return 1;
    }
    // animated_java:chest_mob/variants/shulker/zzz/4
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "138"));
        return 1;
    }
    // animated_java:chest_mob/variants/shulker/zzz/5
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "139"));
        return 1;
    }
    // animated_java:chest_mob/variants/shulker/zzz/6
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "140"));
        return 1;
    }
    // animated_java:chest_mob/variants/shulker/zzz/7
    private static int f19(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "141"));
        return 1;
    }
    // animated_java:chest_mob/variants/shulker/zzz/8
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "142"));
        return 1;
    }
    // animated_java:chest_mob/variants/shulker/zzz/9
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "143"));
        return 1;
    }
    // animated_java:chest_mob/zzz/0
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/zzz/2", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/zzz/6", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:chest_mob/as_root/on_summon"));
        return 1;
    }
    // animated_java:chest_mob/zzz/1
    private static int f23(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.chest_lid]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_chest_lid", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.chest]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_chest", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.hand_left]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_hand_left", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.water_gun]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_water_gun", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.hand_right]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_hand_right", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.eyebrow_left]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_eyebrow_left", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.eyebrow_right]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_eyebrow_right", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.head]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_head", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.muzzle_flash_frame1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_muzzle_flash_frame1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.muzzle_flash_frame2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_muzzle_flash_frame2", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
}
