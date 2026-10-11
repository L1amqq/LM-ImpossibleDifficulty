package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled139 {
    public static void register() {
        Logic.register("animated_java:mutant_spider/variants/default/zzz/20", Compiled139::f0);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/3", Compiled139::f1);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/4", Compiled139::f2);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/5", Compiled139::f3);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/6", Compiled139::f4);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/7", Compiled139::f5);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/8", Compiled139::f6);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/9", Compiled139::f7);
        Logic.register("animated_java:mutant_spider/variants/red/apply", Compiled139::f8);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/0", Compiled139::f9);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/1", Compiled139::f10);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/10", Compiled139::f11);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/11", Compiled139::f12);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/12", Compiled139::f13);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/13", Compiled139::f14);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/14", Compiled139::f15);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/15", Compiled139::f16);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/16", Compiled139::f17);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/17", Compiled139::f18);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/18", Compiled139::f19);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/19", Compiled139::f20);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/2", Compiled139::f21);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/20", Compiled139::f22);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/3", Compiled139::f23);
    }
    // animated_java:mutant_spider/variants/default/zzz/20
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "22"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/3
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "5"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/4
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "6"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/5
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "7"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/6
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "8"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/7
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "9"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/8
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "10"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/9
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "11"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/apply
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'mutant_spider', 'function_path': 'animated_java:mutant_spider/variants/red/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.mutant_spider.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.pincer_left]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.pincer_right]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.neck]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.body]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/6"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg12]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/7"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg13]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/8"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg14]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/9"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg15]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/10"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/11"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg9]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/12"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg10]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/13"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg11]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/14"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg16]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/15"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/16"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/17"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/18"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg6]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/19"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg7]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/red/zzz/20"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg8]")));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/0
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "23"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/1
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "24"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/10
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "33"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/11
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "34"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/12
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "35"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/13
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "36"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/14
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "37"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/15
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "38"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/16
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "39"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/17
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "40"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/18
    private static int f19(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "41"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/19
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "42"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/2
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "25"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/20
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "43"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/3
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "26"));
        return 1;
    }
}
