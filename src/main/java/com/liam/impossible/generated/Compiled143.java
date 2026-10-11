package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled143 {
    public static void register() {
        Logic.register("animated_java:sculk_hand/summon", Compiled143::f0, "args");
        Logic.register("animated_java:sculk_hand/variants/default/apply", Compiled143::f1);
        Logic.register("animated_java:sculk_hand/variants/default/zzz/0", Compiled143::f2);
        Logic.register("animated_java:sculk_hand/variants/default/zzz/1", Compiled143::f3);
        Logic.register("animated_java:sculk_hand/variants/default/zzz/10", Compiled143::f4);
        Logic.register("animated_java:sculk_hand/variants/default/zzz/11", Compiled143::f5);
        Logic.register("animated_java:sculk_hand/variants/default/zzz/12", Compiled143::f6);
        Logic.register("animated_java:sculk_hand/variants/default/zzz/2", Compiled143::f7);
        Logic.register("animated_java:sculk_hand/variants/default/zzz/3", Compiled143::f8);
        Logic.register("animated_java:sculk_hand/variants/default/zzz/4", Compiled143::f9);
        Logic.register("animated_java:sculk_hand/variants/default/zzz/5", Compiled143::f10);
        Logic.register("animated_java:sculk_hand/variants/default/zzz/6", Compiled143::f11);
        Logic.register("animated_java:sculk_hand/variants/default/zzz/7", Compiled143::f12);
        Logic.register("animated_java:sculk_hand/variants/default/zzz/8", Compiled143::f13);
        Logic.register("animated_java:sculk_hand/variants/default/zzz/9", Compiled143::f14);
        Logic.register("animated_java:sculk_hand/variants/hand_only/apply", Compiled143::f15);
        Logic.register("animated_java:sculk_hand/variants/hand_only/zzz/0", Compiled143::f16);
        Logic.register("animated_java:sculk_hand/variants/hand_only/zzz/1", Compiled143::f17);
        Logic.register("animated_java:sculk_hand/variants/hand_only/zzz/10", Compiled143::f18);
        Logic.register("animated_java:sculk_hand/variants/hand_only/zzz/11", Compiled143::f19);
        Logic.register("animated_java:sculk_hand/variants/hand_only/zzz/12", Compiled143::f20);
        Logic.register("animated_java:sculk_hand/variants/hand_only/zzz/2", Compiled143::f21);
        Logic.register("animated_java:sculk_hand/variants/hand_only/zzz/3", Compiled143::f22);
        Logic.register("animated_java:sculk_hand/variants/hand_only/zzz/4", Compiled143::f23);
    }
    // animated_java:sculk_hand/summon
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "args", "set", "value", "{variant:'', animation:'', frame: 0}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "aj:temp", "args", "set", "value", "$(args)"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.summon(c, "minecraft:item_display", "~", "~", "~", "{ Tags:['aj.new','aj.rig_entity','aj.rig_root','aj.sculk_hand.root'], teleport_duration: 0, interpolation_duration: 2, Passengers:[{id:\"minecraft:marker\",Tags:[\"aj.rig_entity\",\"aj.data\",\"aj.sculk_hand.data\"],data:{rigHash:\"27323460617811c22e953102532e07f8503fa3f2fd2443c42cbde11609430d9a\",locators:{sculk_hand_locator:{posx:0f,posy:1.125f,posz:0f,rotx:0f,roty:0f,uuid:\"\"}},cameras:{},bones:{data_data:\"\",bone_finger_upper_5:\"\",bone_finger_lower_5:\"\",bone_finger_upper_4:\"\",bone_finger_lower_4:\"\",bone_finger_upper_3:\"\",bone_finger_lower_3:\"\",bone_finger_upper_2:\"\",bone_finger_lower_2:\"\",bone_finger_upper_1:\"\",bone_finger_lower_1:\"\",bone_hand:\"\",bone_lower_arm_2:\"\",bone_lower_arm:\"\"}}},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.sculk_hand.bone\",\"aj.sculk_hand.bone.finger_upper_5\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:black_candle\",components:{\"minecraft:custom_model_data\":6},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.sculk_hand.bone\",\"aj.sculk_hand.bone.finger_lower_5\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:black_candle\",components:{\"minecraft:custom_model_data\":5},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.sculk_hand.bone\",\"aj.sculk_hand.bone.finger_upper_4\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:black_candle\",components:{\"minecraft:custom_model_data\":8},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.sculk_hand.bone\",\"aj.sculk_hand.bone.finger_lower_4\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:black_candle\",components:{\"minecraft:custom_model_data\":7},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.sculk_hand.bone\",\"aj.sculk_hand.bone.finger_upper_3\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:black_candle\",components:{\"minecraft:custom_model_data\":10},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.sculk_hand.bone\",\"aj.sculk_hand.bone.finger_lower_3\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:black_candle\",components:{\"minecraft:custom_model_data\":9},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.sculk_hand.bone\",\"aj.sculk_hand.bone.finger_upper_2\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:black_candle\",components:{\"minecraft:custom_model_data\":12},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.sculk_hand.bone\",\"aj.sculk_hand.bone.finger_lower_2\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:black_candle\",components:{\"minecraft:custom_model_data\":11},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.sculk_hand.bone\",\"aj.sculk_hand.bone.finger_upper_1\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:black_candle\",components:{\"minecraft:custom_model_data\":14},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.sculk_hand.bone\",\"aj.sculk_hand.bone.finger_lower_1\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:black_candle\",components:{\"minecraft:custom_model_data\":13},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.sculk_hand.bone\",\"aj.sculk_hand.bone.hand\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:black_candle\",components:{\"minecraft:custom_model_data\":4},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.sculk_hand.bone\",\"aj.sculk_hand.bone.lower_arm_2\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:black_candle\",components:{\"minecraft:custom_model_data\":3},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.sculk_hand.bone\",\"aj.sculk_hand.bone.lower_arm\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:black_candle\",components:{\"minecraft:custom_model_data\":2},count:1},height:48f,width:48f}], }"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/zzz/0"), Control.as("@e[type=item_display,tag=aj.new,limit=1,distance=..0.01]")));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/apply
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/variants/default/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/default/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/default/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/default/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/default/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/default/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/default/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/default/zzz/6"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/default/zzz/7"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/default/zzz/8"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/default/zzz/9"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/default/zzz/10"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.hand]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/default/zzz/11"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.lower_arm_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/default/zzz/12"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.lower_arm]")));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/zzz/0
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "6"));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/zzz/1
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "5"));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/zzz/10
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "4"));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/zzz/11
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "3"));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/zzz/12
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "2"));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/zzz/2
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "8"));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/zzz/3
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "7"));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/zzz/4
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "10"));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/zzz/5
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "9"));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/zzz/6
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "12"));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/zzz/7
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "11"));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/zzz/8
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "14"));
        return 1;
    }
    // animated_java:sculk_hand/variants/default/zzz/9
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "13"));
        return 1;
    }
    // animated_java:sculk_hand/variants/hand_only/apply
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/variants/hand_only/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/hand_only/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/hand_only/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/hand_only/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/hand_only/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/hand_only/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/hand_only/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/hand_only/zzz/6"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/hand_only/zzz/7"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/hand_only/zzz/8"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/hand_only/zzz/9"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/hand_only/zzz/10"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.hand]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/hand_only/zzz/11"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.lower_arm_2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/variants/hand_only/zzz/12"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.lower_arm]")));
        return 1;
    }
    // animated_java:sculk_hand/variants/hand_only/zzz/0
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "15"));
        return 1;
    }
    // animated_java:sculk_hand/variants/hand_only/zzz/1
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "16"));
        return 1;
    }
    // animated_java:sculk_hand/variants/hand_only/zzz/10
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "25"));
        return 1;
    }
    // animated_java:sculk_hand/variants/hand_only/zzz/11
    private static int f19(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "26"));
        return 1;
    }
    // animated_java:sculk_hand/variants/hand_only/zzz/12
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "27"));
        return 1;
    }
    // animated_java:sculk_hand/variants/hand_only/zzz/2
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "17"));
        return 1;
    }
    // animated_java:sculk_hand/variants/hand_only/zzz/3
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "18"));
        return 1;
    }
    // animated_java:sculk_hand/variants/hand_only/zzz/4
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "19"));
        return 1;
    }
}
