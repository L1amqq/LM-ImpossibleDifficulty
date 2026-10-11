package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled108 {
    public static void register() {
        Logic.register("animated_java:impossible_dragon/variants/2_heads/zzz/9", Compiled108::f0);
        Logic.register("animated_java:impossible_dragon/variants/default/apply", Compiled108::f1);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/0", Compiled108::f2);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/1", Compiled108::f3);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/10", Compiled108::f4);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/11", Compiled108::f5);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/12", Compiled108::f6);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/13", Compiled108::f7);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/14", Compiled108::f8);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/15", Compiled108::f9);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/16", Compiled108::f10);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/17", Compiled108::f11);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/18", Compiled108::f12);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/19", Compiled108::f13);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/2", Compiled108::f14);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/20", Compiled108::f15);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/21", Compiled108::f16);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/22", Compiled108::f17);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/23", Compiled108::f18);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/24", Compiled108::f19);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/25", Compiled108::f20);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/26", Compiled108::f21);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/27", Compiled108::f22);
        Logic.register("animated_java:impossible_dragon/variants/default/zzz/28", Compiled108::f23);
    }
    // animated_java:impossible_dragon/variants/2_heads/zzz/9
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "205"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/apply
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/variants/default/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_wing_tip]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_wing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_wing_tip]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_wing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_left_foot]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_left_shin]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/6"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_left_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/7"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_right_foot]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/8"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_right_shin]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/9"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_right_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/10"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_left_foot]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/11"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_left_shin]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/12"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_left_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/13"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_right_foot]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/14"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_right_shin]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/15"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_right_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/16"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_left1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/17"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_left2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/18"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_right1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/19"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_right2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/20"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.jaw_middle]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/21"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.stun_vfx_middle_head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/22"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.head_middle]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/23"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/24"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/25"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/26"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/27"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/28"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_left1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/29"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_left2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/30"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_right1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/31"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_right2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/32"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.jaw_right]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/33"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.stun_vfx_right_head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/34"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.head_right]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/35"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/36"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/37"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/38"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/39"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/40"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feathers_left1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/41"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feather_left2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/42"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feathers_right1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/43"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feathers_right2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/44"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.jaw_left]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/45"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.stun_vfx_left_head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/46"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.head_left]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/47"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/48"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/49"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/50"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/51"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/52"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail_end_hitbox]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/53"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail_end]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/54"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail12]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/55"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail11]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/56"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail10]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/57"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail9]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/58"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail8]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/59"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail7]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/60"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail6]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/61"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/62"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/63"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/64"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/65"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/default/zzz/66"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.body]")));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/0
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "4"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/1
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "3"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/10
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "15"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/11
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "14"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/12
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "13"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/13
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "18"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/14
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "17"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/15
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "16"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/16
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "25"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/17
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "26"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/18
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "27"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/19
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "28"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/2
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "6"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/20
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "29"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/21
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "30"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/22
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "24"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/23
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "23"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/24
    private static int f19(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "22"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/25
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "21"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/26
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "20"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/27
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "19"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/default/zzz/28
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "37"));
        return 1;
    }
}
