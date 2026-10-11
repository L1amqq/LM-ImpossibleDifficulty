package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled116 {
    public static void register() {
        Logic.register("animated_java:impossible_dragon/variants/red/zzz/54", Compiled116::f0);
        Logic.register("animated_java:impossible_dragon/variants/red/zzz/55", Compiled116::f1);
        Logic.register("animated_java:impossible_dragon/variants/red/zzz/56", Compiled116::f2);
        Logic.register("animated_java:impossible_dragon/variants/red/zzz/57", Compiled116::f3);
        Logic.register("animated_java:impossible_dragon/variants/red/zzz/58", Compiled116::f4);
        Logic.register("animated_java:impossible_dragon/variants/red/zzz/59", Compiled116::f5);
        Logic.register("animated_java:impossible_dragon/variants/red/zzz/6", Compiled116::f6);
        Logic.register("animated_java:impossible_dragon/variants/red/zzz/60", Compiled116::f7);
        Logic.register("animated_java:impossible_dragon/variants/red/zzz/61", Compiled116::f8);
        Logic.register("animated_java:impossible_dragon/variants/red/zzz/62", Compiled116::f9);
        Logic.register("animated_java:impossible_dragon/variants/red/zzz/7", Compiled116::f10);
        Logic.register("animated_java:impossible_dragon/variants/red/zzz/8", Compiled116::f11);
        Logic.register("animated_java:impossible_dragon/variants/red/zzz/9", Compiled116::f12);
        Logic.register("animated_java:impossible_dragon/variants/stunned/apply", Compiled116::f13);
        Logic.register("animated_java:impossible_dragon/variants/stunned/zzz/0", Compiled116::f14);
        Logic.register("animated_java:impossible_dragon/variants/stunned/zzz/1", Compiled116::f15);
        Logic.register("animated_java:impossible_dragon/variants/stunned/zzz/2", Compiled116::f16);
        Logic.register("animated_java:impossible_dragon/variants/tail_disabled/apply", Compiled116::f17);
        Logic.register("animated_java:impossible_dragon/variants/tail_disabled/zzz/0", Compiled116::f18);
        Logic.register("animated_java:impossible_dragon/variants/tail_enabled/apply", Compiled116::f19);
        Logic.register("animated_java:impossible_dragon/variants/tail_enabled/zzz/0", Compiled116::f20);
        Logic.register("animated_java:impossible_dragon/zzz/0", Compiled116::f21);
        Logic.register("animated_java:impossible_dragon/zzz/1", Compiled116::f22);
        Logic.register("animated_java:impossible_dragon/zzz/10", Compiled116::f23);
    }
    // animated_java:impossible_dragon/variants/red/zzz/54
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "123"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/red/zzz/55
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "124"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/red/zzz/56
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "125"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/red/zzz/57
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "126"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/red/zzz/58
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "127"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/red/zzz/59
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "128"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/red/zzz/6
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "75"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/red/zzz/60
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "129"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/red/zzz/61
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "130"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/red/zzz/62
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "131"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/red/zzz/7
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "76"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/red/zzz/8
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "77"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/red/zzz/9
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "78"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/stunned/apply
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/variants/stunned/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/stunned/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.stun_vfx_middle_head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/stunned/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.stun_vfx_right_head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/stunned/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.stun_vfx_left_head]")));
        return 1;
    }
    // animated_java:impossible_dragon/variants/stunned/zzz/0
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "233"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/stunned/zzz/1
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "234"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/stunned/zzz/2
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "235"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/tail_disabled/apply
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/variants/tail_disabled/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/tail_disabled/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail_end]")));
        return 1;
    }
    // animated_java:impossible_dragon/variants/tail_disabled/zzz/0
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "195"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/tail_enabled/apply
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/variants/tail_enabled/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/tail_enabled/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail_end]")));
        return 1;
    }
    // animated_java:impossible_dragon/variants/tail_enabled/zzz/0
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "208"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/0
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/11", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/15", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "1"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:impossible_dragon/as_root/on_summon"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/1
    private static int f22(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Native.summon(c, "minecraft:pig", "~", "~", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.body_hitbox_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/2"), Control.as("@e[type=minecraft:pig,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.body_hitbox_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Native.summon(c, "minecraft:marker", "~", "~", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.head_middle_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/3"), Control.as("@e[type=minecraft:marker,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.head_middle_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Native.summon(c, "minecraft:pig", "~", "~", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.head_hitbox_middle_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/4"), Control.as("@e[type=minecraft:pig,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.head_hitbox_middle_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Native.summon(c, "minecraft:marker", "~", "~", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.head_right_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/5"), Control.as("@e[type=minecraft:marker,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.head_right_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Native.summon(c, "minecraft:pig", "~", "~", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.head_hitbox_right_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/6"), Control.as("@e[type=minecraft:pig,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.head_hitbox_right_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Native.summon(c, "minecraft:marker", "~", "~", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.head_left_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/7"), Control.as("@e[type=minecraft:marker,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.head_left_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Native.summon(c, "minecraft:pig", "~", "~", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.head_hitbox_left_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/8"), Control.as("@e[type=minecraft:pig,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.head_hitbox_left_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Native.summon(c, "minecraft:marker", "~", "~", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.tail_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/9"), Control.as("@e[type=minecraft:marker,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.tail_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Native.summon(c, "minecraft:pig", "~", "~", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.tail_end_hitbox_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/10"), Control.as("@e[type=minecraft:pig,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.tail_end_hitbox_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_wing_tip]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_right_wing_tip", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_wing]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_right_wing", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_wing_tip]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_left_wing_tip", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_wing]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_left_wing", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_left_foot]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_front_left_foot", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_left_shin]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_front_left_shin", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_left_leg]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_front_left_leg", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_right_foot]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_front_right_foot", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_right_shin]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_front_right_shin", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_right_leg]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_front_right_leg", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_left_foot]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_back_left_foot", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_left_shin]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_back_left_shin", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_left_leg]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_back_left_leg", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_right_foot]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_back_right_foot", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_right_shin]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_back_right_shin", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_right_leg]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_back_right_leg", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_left1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_middle_feathers_left1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_left2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_middle_feathers_left2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_right1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_middle_feathers_right1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_right2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_middle_feathers_right2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.jaw_middle]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_jaw_middle", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.stun_vfx_middle_head]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_stun_vfx_middle_head", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.head_middle]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_head_middle", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_5]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_middle_5", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_4]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_middle_4", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_3]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_middle_3", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_middle_2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_middle_1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_left1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_right_feathers_left1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_left2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_right_feathers_left2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_right1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_right_feathers_right1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_right2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_right_feathers_right2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.jaw_right]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_jaw_right", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.stun_vfx_right_head]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_stun_vfx_right_head", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.head_right]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_head_right", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_5]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_right_5", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_4]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_right_4", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_3]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_right_3", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_right_2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_right_1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feathers_left1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_left_feathers_left1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feather_left2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_left_feather_left2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feathers_right1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_left_feathers_right1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feathers_right2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_left_feathers_right2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.jaw_left]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_jaw_left", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.stun_vfx_left_head]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_stun_vfx_left_head", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.head_left]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_head_left", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_5]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_left_5", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_4]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_left_4", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_3]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_left_3", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_left_2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_spine_left_1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail_end_hitbox]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail_end_hitbox", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail_end]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail_end", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail12]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail12", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail11]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail11", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail10]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail10", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail9]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail9", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail8]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail8", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail7]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail7", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail6]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail6", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail5]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail5", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail4]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail4", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail3]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail3", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.body]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_body", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/10
    private static int f23(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{PersistenceRequired:0,Invulnerable:0,NoGravity:1,Silent:1,NoAI:1,Health:1024,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b},{id:\"minecraft:resistance\",amplifier:3,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],attributes:[{id:\"minecraft:generic.max_health\",base:1024},{id:\"minecraft:generic.scale\",base:1.4f}],DeathLootTable:\"\"}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.small"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.tail"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.weakpoint"));
        return 1;
    }
}
