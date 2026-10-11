package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled004 {
    public static void register() {
        Logic.register("animated_java:baby_golem/root/zzz/1", Compiled004::f0);
        Logic.register("animated_java:baby_golem/set_default_pose", Compiled004::f1);
        Logic.register("animated_java:baby_golem/summon/default", Compiled004::f2);
        Logic.register("animated_java:baby_golem/summon/red", Compiled004::f3);
        Logic.register("animated_java:baby_golem/summon", Compiled004::f4, "args");
        Logic.register("animated_java:baby_golem/variants/default/apply", Compiled004::f5);
        Logic.register("animated_java:baby_golem/variants/default/zzz/0", Compiled004::f6);
        Logic.register("animated_java:baby_golem/variants/default/zzz/1", Compiled004::f7);
        Logic.register("animated_java:baby_golem/variants/default/zzz/2", Compiled004::f8);
        Logic.register("animated_java:baby_golem/variants/default/zzz/3", Compiled004::f9);
        Logic.register("animated_java:baby_golem/variants/default/zzz/4", Compiled004::f10);
        Logic.register("animated_java:baby_golem/variants/default/zzz/5", Compiled004::f11);
        Logic.register("animated_java:baby_golem/variants/red/apply", Compiled004::f12);
        Logic.register("animated_java:baby_golem/variants/red/zzz/0", Compiled004::f13);
        Logic.register("animated_java:baby_golem/variants/red/zzz/1", Compiled004::f14);
        Logic.register("animated_java:baby_golem/variants/red/zzz/2", Compiled004::f15);
        Logic.register("animated_java:baby_golem/variants/red/zzz/3", Compiled004::f16);
        Logic.register("animated_java:baby_golem/variants/red/zzz/4", Compiled004::f17);
        Logic.register("animated_java:baby_golem/variants/red/zzz/5", Compiled004::f18);
        Logic.register("animated_java:baby_golem/zzz/0", Compiled004::f19);
        Logic.register("animated_java:baby_golem/zzz/1", Compiled004::f20);
        Logic.register("animated_java:baby_golem/zzz/10", Compiled004::f21, "animation");
        Logic.register("animated_java:baby_golem/zzz/11", Compiled004::f22, "animation");
        Logic.register("animated_java:baby_golem/zzz/12", Compiled004::f23);
    }
    // animated_java:baby_golem/root/zzz/1
    private static int f0(Frame c) {

        return 1;
    }
    // animated_java:baby_golem/set_default_pose
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/set_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.234375f,0f,1f,0f,0.91796875f,-1.2246467991473532e-16f,0f,-1f,0.03125000000000003f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.left_arm]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.234375f,0f,1f,0f,0.91796875f,-1.2246467991473532e-16f,0f,-1f,0.031249999999999972f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.right_arm]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-8.610797806504827e-18f,0f,1f,0f,0.93359375f,-1.2246467991473532e-16f,0f,-1f,0.0703125f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,0.51171875f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.body]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.1171875f,0f,1f,0f,0.42578125f,-1.2246467991473532e-16f,0f,-1f,0.015624999999999986f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.right_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.140625f,0f,1f,0f,0.42578125f,-1.2246467991473532e-16f,0f,-1f,0.015625000000000017f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.left_leg]")));
        return 1;
    }
    // animated_java:baby_golem/summon/default
    private static int f2(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/summon", "{args:{variant: 'default'}}"));
        return 1;
    }
    // animated_java:baby_golem/summon/red
    private static int f3(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/summon", "{args:{variant: 'red'}}"));
        return 1;
    }
    // animated_java:baby_golem/summon
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "args", "set", "value", "{variant:'', animation:'', frame: 0}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "aj:temp", "args", "set", "value", "$(args)"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.summon(c, "minecraft:item_display", "~", "~", "~", "{ Tags:['aj.new','aj.rig_entity','aj.rig_root','aj.baby_golem.root'], teleport_duration: 0, interpolation_duration: 3, Passengers:[{id:\"minecraft:marker\",Tags:[\"aj.rig_entity\",\"aj.data\",\"aj.baby_golem.data\"],data:{rigHash:\"a4d4b4ee6b14a349a1f30d627dfb07f1b041590f9ed230e92ed3a658fd6a1a7e\",locators:{},cameras:{},bones:{data_data:\"\",bone_left_arm:\"\",bone_right_arm:\"\",bone_head:\"\",bone_body:\"\",bone_right_leg:\"\",bone_left_leg:\"\"}}},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.baby_golem.bone\",\"aj.baby_golem.bone.left_arm\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:3,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":17}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.baby_golem.bone\",\"aj.baby_golem.bone.right_arm\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:3,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":18}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.baby_golem.bone\",\"aj.baby_golem.bone.head\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:3,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":19}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.baby_golem.bone\",\"aj.baby_golem.bone.body\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:3,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":16}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.baby_golem.bone\",\"aj.baby_golem.bone.right_leg\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:3,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":20}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.baby_golem.bone\",\"aj.baby_golem.bone.left_leg\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:3,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":21}},height:48f,width:48f},{Tags:[\"aj.rig_entity\"]}], }"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/zzz/0"), Control.as("@e[type=item_display,tag=aj.new,limit=1,distance=..0.01]")));
        return 1;
    }
    // animated_java:baby_golem/variants/default/apply
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/variants/default/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/default/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.left_arm]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/default/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.right_arm]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/default/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/default/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.body]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/default/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.right_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/default/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.left_leg]")));
        return 1;
    }
    // animated_java:baby_golem/variants/default/zzz/0
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "17"));
        return 1;
    }
    // animated_java:baby_golem/variants/default/zzz/1
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "18"));
        return 1;
    }
    // animated_java:baby_golem/variants/default/zzz/2
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "19"));
        return 1;
    }
    // animated_java:baby_golem/variants/default/zzz/3
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "16"));
        return 1;
    }
    // animated_java:baby_golem/variants/default/zzz/4
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "20"));
        return 1;
    }
    // animated_java:baby_golem/variants/default/zzz/5
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "21"));
        return 1;
    }
    // animated_java:baby_golem/variants/red/apply
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/variants/red/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/red/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.left_arm]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/red/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.right_arm]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/red/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/red/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.body]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/red/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.right_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/red/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.left_leg]")));
        return 1;
    }
    // animated_java:baby_golem/variants/red/zzz/0
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "22"));
        return 1;
    }
    // animated_java:baby_golem/variants/red/zzz/1
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "23"));
        return 1;
    }
    // animated_java:baby_golem/variants/red/zzz/2
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "24"));
        return 1;
    }
    // animated_java:baby_golem/variants/red/zzz/3
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "25"));
        return 1;
    }
    // animated_java:baby_golem/variants/red/zzz/4
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "26"));
        return 1;
    }
    // animated_java:baby_golem/variants/red/zzz/5
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "27"));
        return 1;
    }
    // animated_java:baby_golem/zzz/0
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/zzz/2", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/zzz/6", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:baby_golem/as_root/on_summon"));
        return 1;
    }
    // animated_java:baby_golem/zzz/1
    private static int f20(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.left_arm]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_left_arm", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.right_arm]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_right_arm", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.head]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_head", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.body]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_body", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.right_leg]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_right_leg", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.left_leg]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_left_leg", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // animated_java:baby_golem/zzz/10
    private static int f21(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"animation_baby_golem_idle\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"animation_baby_golem_walk\",\"color\":\"yellow\"}]]"));
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/remove/this"));
        return 1;
    }
    // animated_java:baby_golem/zzz/11
    private static int f22(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/animations/$(animation)/resume"));
        return 1;
    }
    // animated_java:baby_golem/zzz/12
    private static int f23(Frame c) {

        return 1;
    }
}
