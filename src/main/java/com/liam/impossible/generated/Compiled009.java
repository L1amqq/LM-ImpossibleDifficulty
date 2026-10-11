package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled009 {
    public static void register() {
        Logic.register("animated_java:bouncing_pig/set_default_pose", Compiled009::f0);
        Logic.register("animated_java:bouncing_pig/summon/default", Compiled009::f1);
        Logic.register("animated_java:bouncing_pig/summon", Compiled009::f2, "args");
        Logic.register("animated_java:bouncing_pig/variants/default/apply", Compiled009::f3);
        Logic.register("animated_java:bouncing_pig/variants/default/zzz/0", Compiled009::f4);
        Logic.register("animated_java:bouncing_pig/variants/default/zzz/1", Compiled009::f5);
        Logic.register("animated_java:bouncing_pig/variants/default/zzz/2", Compiled009::f6);
        Logic.register("animated_java:bouncing_pig/variants/default/zzz/3", Compiled009::f7);
        Logic.register("animated_java:bouncing_pig/variants/default/zzz/4", Compiled009::f8);
        Logic.register("animated_java:bouncing_pig/variants/default/zzz/5", Compiled009::f9);
        Logic.register("animated_java:bouncing_pig/variants/default/zzz/6", Compiled009::f10);
        Logic.register("animated_java:bouncing_pig/zzz/0", Compiled009::f11);
        Logic.register("animated_java:bouncing_pig/zzz/1", Compiled009::f12);
        Logic.register("animated_java:bouncing_pig/zzz/10", Compiled009::f13, "animation");
        Logic.register("animated_java:bouncing_pig/zzz/11", Compiled009::f14, "animation");
        Logic.register("animated_java:bouncing_pig/zzz/12", Compiled009::f15);
        Logic.register("animated_java:bouncing_pig/zzz/2", Compiled009::f16);
        Logic.register("animated_java:bouncing_pig/zzz/3", Compiled009::f17);
        Logic.register("animated_java:bouncing_pig/zzz/4", Compiled009::f18, "variant");
        Logic.register("animated_java:bouncing_pig/zzz/5", Compiled009::f19, "variant");
        Logic.register("animated_java:bouncing_pig/zzz/6", Compiled009::f20);
        Logic.register("animated_java:bouncing_pig/zzz/7", Compiled009::f21);
        Logic.register("animated_java:bouncing_pig/zzz/8", Compiled009::f22);
        Logic.register("animated_java:bouncing_pig/zzz/9", Compiled009::f23, "animation");
    }
    // animated_java:bouncing_pig/set_default_pose
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/set_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.18749999999999994f,0f,1f,0f,0.3125f,-1.2246467991473532e-16f,0f,-1f,-0.375f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.18750000000000006f,0f,1f,0f,0.375f,-1.2246467991473532e-16f,0f,-1f,-0.4375f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.2246467991473532e-16f,2.719262146893782e-32f,6.123233995736766e-17f,0f,2.220446049250313e-16f,1f,0.625f,-1.2246467991473532e-16f,1f,-2.220446049250313e-16f,-0.5f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.tail]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.18750000000000003f,0f,1f,0f,0.37500000000000017f,-1.2246467991473532e-16f,0f,-1f,0.3125f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.18749999999999997f,0f,1f,0f,0.37500000000000017f,-1.2246467991473532e-16f,0f,-1f,0.3125f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-4.592425496802573e-17f,0f,1f,0f,0.7500000000000002f,-1.2246467991473532e-16f,0f,-1f,0.3749999999999999f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.2246467991473532e-16f,2.719262146893782e-32f,4.592425496802574e-17f,0f,2.220446049250313e-16f,1f,0.375f,-1.2246467991473532e-16f,1f,-2.220446049250313e-16f,-0.375f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.body]")));
        return 1;
    }
    // animated_java:bouncing_pig/summon/default
    private static int f1(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:bouncing_pig/summon", "{args:{variant: 'default'}}"));
        return 1;
    }
    // animated_java:bouncing_pig/summon
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "args", "set", "value", "{variant:'', animation:'', frame: 0}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "aj:temp", "args", "set", "value", "$(args)"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.summon(c, "minecraft:item_display", "~", "~", "~", "{ Tags:['aj.new','aj.rig_entity','aj.rig_root','aj.bouncing_pig.root'], teleport_duration: 0, interpolation_duration: 1, Passengers:[{id:\"minecraft:marker\",Tags:[\"aj.rig_entity\",\"aj.data\",\"aj.bouncing_pig.data\"],data:{rigHash:\"9875e9a6ca03f1a76cfdcc6306f61b18f40adbddd7c620aae8b6b872031bc6a3\",locators:{commands:{posx:0f,posy:0f,posz:0f,rotx:0f,roty:0f}},cameras:{},bones:{data_data:\"\",bone_leg1:\"\",bone_leg2:\"\",bone_tail:\"\",bone_leg3:\"\",bone_leg4:\"\",bone_head:\"\",bone_body:\"\"}}},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.bouncing_pig.bone\",\"aj.bouncing_pig.bone.leg1\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:1,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":49}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.bouncing_pig.bone\",\"aj.bouncing_pig.bone.leg2\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:1,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":50}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.bouncing_pig.bone\",\"aj.bouncing_pig.bone.tail\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:1,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":51}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.bouncing_pig.bone\",\"aj.bouncing_pig.bone.leg3\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:1,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":52}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.bouncing_pig.bone\",\"aj.bouncing_pig.bone.leg4\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:1,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":53}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.bouncing_pig.bone\",\"aj.bouncing_pig.bone.head\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:1,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":54}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.bouncing_pig.bone\",\"aj.bouncing_pig.bone.body\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:1,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":55}},height:48f,width:48f},{Tags:[\"aj.rig_entity\"]}], }"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/zzz/0"), Control.as("@e[type=item_display,tag=aj.new,limit=1,distance=..0.01]")));
        return 1;
    }
    // animated_java:bouncing_pig/variants/default/apply
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'bouncing_pig', 'function_path': 'animated_java:bouncing_pig/variants/default/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.bouncing_pig.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/variants/default/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/variants/default/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/variants/default/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.tail]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/variants/default/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/variants/default/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/variants/default/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/variants/default/zzz/6"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.body]")));
        return 1;
    }
    // animated_java:bouncing_pig/variants/default/zzz/0
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "49"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:bouncing_pig/variants/default/zzz/1
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "50"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:bouncing_pig/variants/default/zzz/2
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "51"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:bouncing_pig/variants/default/zzz/3
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "52"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:bouncing_pig/variants/default/zzz/4
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "53"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:bouncing_pig/variants/default/zzz/5
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "54"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:bouncing_pig/variants/default/zzz/6
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "55"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:bouncing_pig/zzz/0
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/zzz/2", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/zzz/6", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "1"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:bouncing_pig/as_root/on_summon"));
        return 1;
    }
    // animated_java:bouncing_pig/zzz/1
    private static int f12(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.tail]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg3]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg3", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.leg4]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg4", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.head]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_head", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.bouncing_pig.bone.body]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_body", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // animated_java:bouncing_pig/zzz/10
    private static int f13(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"jump\",\"color\":\"yellow\"}]]"));
        Logic.step(() -> Logic.call(c, "animated_java:bouncing_pig/remove/this"));
        return 1;
    }
    // animated_java:bouncing_pig/zzz/11
    private static int f14(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:bouncing_pig/animations/$(animation)/resume"));
        return 1;
    }
    // animated_java:bouncing_pig/zzz/12
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.commands.uuid"));
        return 1;
    }
    // animated_java:bouncing_pig/zzz/2
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:bouncing_pig/zzz/3")), Control.when("data", "storage", "aj:temp", "{args:{variant:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/zzz/4", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:bouncing_pig/zzz/5", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        return 1;
    }
    // animated_java:bouncing_pig/zzz/3
    private static int f17(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"variant\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:bouncing_pig/remove/this"));
        return 1;
    }
    // animated_java:bouncing_pig/zzz/4
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/variants/$(variant)/apply"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:bouncing_pig/zzz/5
    private static int f19(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The variant \",\"color\":\"red\"},{\"text\":\"$(variant)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Variants:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"default\",\"color\":\"yellow\"}]]"));
        Logic.step(() -> Logic.call(c, "animated_java:bouncing_pig/remove/this"));
        return 1;
    }
    // animated_java:bouncing_pig/zzz/6
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:bouncing_pig/zzz/7")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:bouncing_pig/zzz/8")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/zzz/9", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:bouncing_pig/zzz/10", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/zzz/11", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:bouncing_pig/zzz/7
    private static int f21(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:bouncing_pig/remove/this"));
        return 1;
    }
    // animated_java:bouncing_pig/zzz/8
    private static int f22(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:bouncing_pig/remove/this"));
        return 1;
    }
    // animated_java:bouncing_pig/zzz/9
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:bouncing_pig/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
}
