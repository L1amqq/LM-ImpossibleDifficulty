package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled107 {
    public static void register() {
        Logic.register("animated_java:impossible_dragon/variants/1_head/zzz/2", Compiled107::f0);
        Logic.register("animated_java:impossible_dragon/variants/1_head/zzz/20", Compiled107::f1);
        Logic.register("animated_java:impossible_dragon/variants/1_head/zzz/21", Compiled107::f2);
        Logic.register("animated_java:impossible_dragon/variants/1_head/zzz/22", Compiled107::f3);
        Logic.register("animated_java:impossible_dragon/variants/1_head/zzz/23", Compiled107::f4);
        Logic.register("animated_java:impossible_dragon/variants/1_head/zzz/3", Compiled107::f5);
        Logic.register("animated_java:impossible_dragon/variants/1_head/zzz/4", Compiled107::f6);
        Logic.register("animated_java:impossible_dragon/variants/1_head/zzz/5", Compiled107::f7);
        Logic.register("animated_java:impossible_dragon/variants/1_head/zzz/6", Compiled107::f8);
        Logic.register("animated_java:impossible_dragon/variants/1_head/zzz/7", Compiled107::f9);
        Logic.register("animated_java:impossible_dragon/variants/1_head/zzz/8", Compiled107::f10);
        Logic.register("animated_java:impossible_dragon/variants/1_head/zzz/9", Compiled107::f11);
        Logic.register("animated_java:impossible_dragon/variants/2_heads/apply", Compiled107::f12);
        Logic.register("animated_java:impossible_dragon/variants/2_heads/zzz/0", Compiled107::f13);
        Logic.register("animated_java:impossible_dragon/variants/2_heads/zzz/1", Compiled107::f14);
        Logic.register("animated_java:impossible_dragon/variants/2_heads/zzz/10", Compiled107::f15);
        Logic.register("animated_java:impossible_dragon/variants/2_heads/zzz/11", Compiled107::f16);
        Logic.register("animated_java:impossible_dragon/variants/2_heads/zzz/2", Compiled107::f17);
        Logic.register("animated_java:impossible_dragon/variants/2_heads/zzz/3", Compiled107::f18);
        Logic.register("animated_java:impossible_dragon/variants/2_heads/zzz/4", Compiled107::f19);
        Logic.register("animated_java:impossible_dragon/variants/2_heads/zzz/5", Compiled107::f20);
        Logic.register("animated_java:impossible_dragon/variants/2_heads/zzz/6", Compiled107::f21);
        Logic.register("animated_java:impossible_dragon/variants/2_heads/zzz/7", Compiled107::f22);
        Logic.register("animated_java:impossible_dragon/variants/2_heads/zzz/8", Compiled107::f23);
    }
    // animated_java:impossible_dragon/variants/1_head/zzz/2
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "211"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/1_head/zzz/20
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "229"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/1_head/zzz/21
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "230"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/1_head/zzz/22
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "231"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/1_head/zzz/23
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "232"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/1_head/zzz/3
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "212"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/1_head/zzz/4
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "213"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/1_head/zzz/5
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "214"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/1_head/zzz/6
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "215"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/1_head/zzz/7
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "216"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/1_head/zzz/8
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "217"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/1_head/zzz/9
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "218"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/2_heads/apply
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/variants/2_heads/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_left1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_left2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_right1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_right2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.jaw_middle]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.stun_vfx_middle_head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/zzz/6"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.head_middle]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/zzz/7"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/zzz/8"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/zzz/9"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/zzz/10"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/2_heads/zzz/11"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_1]")));
        return 1;
    }
    // animated_java:impossible_dragon/variants/2_heads/zzz/0
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "196"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/2_heads/zzz/1
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "197"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/2_heads/zzz/10
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "206"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/2_heads/zzz/11
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "207"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/2_heads/zzz/2
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "198"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/2_heads/zzz/3
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "199"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/2_heads/zzz/4
    private static int f19(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "200"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/2_heads/zzz/5
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "201"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/2_heads/zzz/6
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "202"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/2_heads/zzz/7
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "203"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/2_heads/zzz/8
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "204"));
        return 1;
    }
}
