package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled111 {
    public static void register() {
        Logic.register("animated_java:impossible_dragon/variants/eyes_closed/zzz/2", Compiled111::f0);
        Logic.register("animated_java:impossible_dragon/variants/half_red/apply", Compiled111::f1);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/0", Compiled111::f2);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/1", Compiled111::f3);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/10", Compiled111::f4);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/11", Compiled111::f5);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/12", Compiled111::f6);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/13", Compiled111::f7);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/14", Compiled111::f8);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/15", Compiled111::f9);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/16", Compiled111::f10);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/17", Compiled111::f11);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/18", Compiled111::f12);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/19", Compiled111::f13);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/2", Compiled111::f14);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/20", Compiled111::f15);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/21", Compiled111::f16);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/22", Compiled111::f17);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/23", Compiled111::f18);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/24", Compiled111::f19);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/25", Compiled111::f20);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/26", Compiled111::f21);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/27", Compiled111::f22);
        Logic.register("animated_java:impossible_dragon/variants/half_red/zzz/28", Compiled111::f23);
    }
    // animated_java:impossible_dragon/variants/eyes_closed/zzz/2
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "238"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/apply
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/variants/half_red/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_wing_tip]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_wing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_wing_tip]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_wing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_left_foot]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_left_shin]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/6"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_left_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/7"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_right_foot]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/8"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_right_shin]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/9"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_right_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/10"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_left_foot]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/11"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_left_shin]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/12"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_left_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/13"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_right_foot]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/14"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_right_shin]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/15"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_right_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/16"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_left1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/17"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_left2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/18"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_right1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/19"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_right2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/20"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.jaw_middle]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/21"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.head_middle]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/22"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/23"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/24"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/25"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/26"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/27"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_left1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/28"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_left2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/29"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_right1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/30"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_right2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/31"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.jaw_right]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/32"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.head_right]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/33"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/34"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/35"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/36"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/37"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/38"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feathers_left1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/39"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feather_left2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/40"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feathers_right1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/41"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feathers_right2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/42"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.jaw_left]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/43"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.head_left]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/44"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/45"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/46"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/47"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/48"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/49"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail_end_hitbox]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/50"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail12]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/51"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail11]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/52"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail10]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/53"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail9]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/54"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail8]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/55"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail7]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/56"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail6]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/57"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/58"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/59"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/60"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/61"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/half_red/zzz/62"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.body]")));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/0
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "132"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/1
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "133"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/10
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "142"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/11
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "143"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/12
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "144"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/13
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "145"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/14
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "146"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/15
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "147"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/16
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "148"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/17
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "149"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/18
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "150"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/19
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "151"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/2
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "134"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/20
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "152"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/21
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "153"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/22
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "154"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/23
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "155"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/24
    private static int f19(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "156"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/25
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "157"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/26
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "158"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/27
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "159"));
        return 1;
    }
    // animated_java:impossible_dragon/variants/half_red/zzz/28
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "160"));
        return 1;
    }
}
