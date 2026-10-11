package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled150 {
    public static void register() {
        Logic.register("animated_java:vampire/root/zzz/0", Compiled150::f0);
        Logic.register("animated_java:vampire/set_default_pose", Compiled150::f1);
        Logic.register("animated_java:vampire/summon", Compiled150::f2, "args");
        Logic.register("animated_java:vampire/zzz/0", Compiled150::f3);
        Logic.register("animated_java:vampire/zzz/1", Compiled150::f4);
        Logic.register("animated_java:vampire/zzz/2", Compiled150::f5);
        Logic.register("animated_java:vampire/zzz/3", Compiled150::f6);
        Logic.register("animated_java:vampire/zzz/4", Compiled150::f7);
        Logic.register("animated_java:vampire/zzz/5", Compiled150::f8);
        Logic.register("animated_java:vampire/zzz/6", Compiled150::f9, "animation");
        Logic.register("animated_java:vampire/zzz/7", Compiled150::f10, "animation");
        Logic.register("animated_java:vampire/zzz/8", Compiled150::f11, "animation");
        Logic.register("animated_java:walking_diamond/animations/idle/apply_frame", Compiled150::f12, "frame");
        Logic.register("animated_java:walking_diamond/animations/idle/next_frame", Compiled150::f13);
        Logic.register("animated_java:walking_diamond/animations/idle/pause", Compiled150::f14);
        Logic.register("animated_java:walking_diamond/animations/idle/play", Compiled150::f15);
        Logic.register("animated_java:walking_diamond/animations/idle/resume", Compiled150::f16);
        Logic.register("animated_java:walking_diamond/animations/idle/set_frame", Compiled150::f17, "frame");
        Logic.register("animated_java:walking_diamond/animations/idle/stop", Compiled150::f18);
        Logic.register("animated_java:walking_diamond/animations/idle/tween", Compiled150::f19, "duration", "to_frame");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/apply_frame", Compiled150::f20, "frame");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/0", Compiled150::f21, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/1", Compiled150::f22, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/10", Compiled150::f23, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
    }
    // animated_java:vampire/root/zzz/0
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1"), Control.store("result", "storage", "aj:temp", "x", "int", "1"), Control.store("result", "score", "#this.x", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1"), Control.store("result", "storage", "aj:temp", "y", "int", "1"), Control.store("result", "score", "#this.y", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1"), Control.store("result", "storage", "aj:temp", "z", "int", "1"), Control.store("result", "score", "#this.z", "aj.i")));
        Logic.step(() -> Logic.call(c, "animated_java:vampire/root/outdated_tellraw", "with", "storage", "aj:temp"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.rigHash", "set", "value", "'2c1fe64539f9d275807da300fb650c024f0da82464633d0c7a3ba09549836013'"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{Glowing: 1b, glow_color_override: 16711680}"), Control.on("passengers")));
        Logic.step(() -> Native.summon(c, "minecraft:text_display", "~", "~", "~", "{Tags:['aj.rig_entity', 'aj.outdated_rig_text_display', 'aj.new'], text:'[\"\",{\"text\":\"This rig instance is outdated!\\\\nIt will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"}]', billboard: \"vertical\", transformation:{translation:[0f,3f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[1f,1f,1f]}}"));
        Logic.step(() -> Native.ride(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "mount", "@s"));
        Logic.step(() -> Native.tag(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "remove", "aj.new"));
        return 1;
    }
    // animated_java:vampire/set_default_pose
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'vampire', 'function_path': 'animated_java:vampire/set_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.vampire.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,1.40625f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.04361938736533588f,0.9990482215818578f,1.2246467991473532e-16f,-0.29296875f,0.9990482215818578f,0.04361938736533588f,0f,1.2890625f,-5.341834311772709e-18f,1.223481206754078e-16f,-1f,-3.587832419377011e-17f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.arm_right_1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.04361938736533588f,-0.9990482215818578f,1.2246467991473532e-16f,0.5203445009807349f,-0.9990482215818578f,0.04361938736533588f,0f,1.3385666259992222f,-5.341834311772709e-18f,-1.223481206754078e-16f,-1f,-0.10937499999999993f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.arm_left_2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.04361938736533588f,-0.9990482215818578f,1.2246467991473532e-16f,0.29296875f,-0.9990482215818578f,0.04361938736533588f,0f,1.2890625f,-5.341834311772709e-18f,-1.223481206754078e-16f,-1f,3.587832419377011e-17f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.arm_left_1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,0.703125f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.body]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.11132812500000001f,0f,1f,0f,0.359375f,-1.2246467991473532e-16f,0f,-1f,0.11914062499999999f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.leg_right_2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.111328125f,0f,1f,0f,0.703125f,-1.2246467991473532e-16f,0f,-1f,-0.005859375000000014f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.leg_right_1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.11132812499999999f,0f,1f,0f,0.359375f,-1.2246467991473532e-16f,0f,-1f,0.11914062500000001f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.leg_left_2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.111328125f,0f,1f,0f,0.703125f,-1.2246467991473532e-16f,0f,-1f,-0.005859374999999986f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.leg_left_1]")));
        return 1;
    }
    // animated_java:vampire/summon
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "args", "set", "value", "{variant:'', animation:'', frame: 0}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "aj:temp", "args", "set", "value", "$(args)"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.summon(c, "minecraft:item_display", "~", "~", "~", "{ Tags:['aj.new','aj.rig_entity','aj.rig_root','aj.vampire.root'], teleport_duration: 0, interpolation_duration: 2, Passengers:[{id:\"minecraft:marker\",Tags:[\"aj.rig_entity\",\"aj.data\",\"aj.vampire.data\"],data:{rigHash:\"2c1fe64539f9d275807da300fb650c024f0da82464633d0c7a3ba09549836013\",locators:{},cameras:{},bones:{data_data:\"\",bone_head:\"\",bone_arm_right_1:\"\",bone_arm_left_2:\"\",bone_arm_left_1:\"\",bone_body:\"\",bone_leg_right_2:\"\",bone_leg_right_1:\"\",bone_leg_left_2:\"\",bone_leg_left_1:\"\"}}},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.vampire.bone\",\"aj.vampire.bone.head\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:gray_candle\",components:{\"minecraft:custom_model_data\":3},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.vampire.bone\",\"aj.vampire.bone.arm_right_1\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:gray_candle\",components:{\"minecraft:custom_model_data\":4},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.vampire.bone\",\"aj.vampire.bone.arm_left_2\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:gray_candle\",components:{\"minecraft:custom_model_data\":6},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.vampire.bone\",\"aj.vampire.bone.arm_left_1\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:gray_candle\",components:{\"minecraft:custom_model_data\":5},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.vampire.bone\",\"aj.vampire.bone.body\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:gray_candle\",components:{\"minecraft:custom_model_data\":2},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.vampire.bone\",\"aj.vampire.bone.leg_right_2\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:gray_candle\",components:{\"minecraft:custom_model_data\":8},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.vampire.bone\",\"aj.vampire.bone.leg_right_1\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:gray_candle\",components:{\"minecraft:custom_model_data\":7},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.vampire.bone\",\"aj.vampire.bone.leg_left_2\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:gray_candle\",components:{\"minecraft:custom_model_data\":10},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.vampire.bone\",\"aj.vampire.bone.leg_left_1\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:gray_candle\",components:{\"minecraft:custom_model_data\":9},count:1},height:48f,width:48f}], }"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/zzz/0"), Control.as("@e[type=item_display,tag=aj.new,limit=1,distance=..0.01]")));
        return 1;
    }
    // animated_java:vampire/zzz/0
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/zzz/2"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/zzz/3", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:vampire/as_root/on_summon"));
        return 1;
    }
    // animated_java:vampire/zzz/1
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.head]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_head", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.arm_right_1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_arm_right_1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.arm_left_2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_arm_left_2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.arm_left_1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_arm_left_1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.body]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_body", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.leg_right_2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg_right_2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.leg_right_1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg_right_1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.leg_left_2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg_left_2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.vampire.bone.leg_left_1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg_left_1", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // animated_java:vampire/zzz/2
    private static int f5(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"vampire\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"No variants are available.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:vampire/remove/this"));
        return 1;
    }
    // animated_java:vampire/zzz/3
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:vampire/zzz/4")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:vampire/zzz/5")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/zzz/6", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:vampire/zzz/7", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/zzz/8", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:vampire/zzz/4
    private static int f7(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"vampire\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:vampire/remove/this"));
        return 1;
    }
    // animated_java:vampire/zzz/5
    private static int f8(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"vampire\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:vampire/remove/this"));
        return 1;
    }
    // animated_java:vampire/zzz/6
    private static int f9(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:vampire/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:vampire/zzz/7
    private static int f10(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"vampire\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"fly\",\"color\":\"yellow\"}],[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:vampire/remove/this"));
        return 1;
    }
    // animated_java:vampire/zzz/8
    private static int f11(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:vampire/animations/$(animation)/resume"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/apply_frame
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/idle/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.idle.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/idle/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/next_frame
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/idle/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.idle.frame", "1"), Control.when("score", "@s", "aj.idle.frame", "matches", "21..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.idle.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/idle/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.idle.frame", "1"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/pause
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/idle/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.walking_diamond.animation.idle.playing"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/play
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/idle/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.walking_diamond.animation.idle.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.idle.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/idle/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/resume
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/idle/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.walking_diamond.animation.idle.playing"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/set_frame
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/idle/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.idle.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/idle/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/stop
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/idle/stop'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.walking_diamond.animation.idle.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.idle.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/idle/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/tween
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/idle/tween'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/animations/pause_all"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.walking_diamond.animation.idle.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tween_duration", "$(duration)"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.idle.frame", "$(to_frame)"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.i", "=", "@s", "aj.tween_duration"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/idle/zzz/apply_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/idle/zzz/apply_frame", "{frame: $(to_frame)}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#this", "aj.i"), Control.on("passengers"), Control.store("result", "entity", "@s", "interpolation_duration", "int", "1")));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/apply_frame
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/idle/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/0
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,0f,9.184850993605148e-17f,0f,0f,0.5f,0f,0.390625f,-6.123233995736766e-17f,0f,-0.75f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-0.05625f,0f,1f,0f,0.171875f,-1.2246467991473532e-16f,0f,-1f,-6.888638245203862e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0.0546875f,0f,1f,0f,0.171875f,-1.2246467991473532e-16f,0f,-1f,6.697287182837088e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.573576436351046f,-0.8191520442889917f,1.2246467991473532e-16f,-0.19062500000000002f,-0.8191520442889917f,-0.573576436351046f,0f,0.421875f,7.024285468436541e-17f,-1.0031719290535246e-16f,-1f,-2.3344829608746423e-17f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6087614290087204f,0.7933533402912355f,1.2246467991473532e-16f,0.19375f,0.7933533402912355f,-0.6087614290087204f,0f,0.421875f,7.455177354798982e-17f,9.715776287805224e-17f,-1f,2.3727531733479968e-17f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/1
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,1.1394963647874738e-19f,9.184835089594004e-17f,1.4243704559843423e-20f,0f,0.4999991342259577f,-0.0013957040906580193f,0.3906248917782447f,-6.123233995736766e-17f,-0.0009304693937720129f,-0.7499987013389365f,-0.00011630867422150161f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-1.1394968580609814e-19f,1.2246462690135336e-16f,-0.05625f,0f,0.9999995671128852f,0.0009304697965603992f,0.17187527055438823f,-1.2246467991473532e-16f,0.0009304697965603992f,-0.9999995671128852f,0.0002907716855537471f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-1.1394968580609814e-19f,1.2246462690135336e-16f,0.0546875f,0f,0.9999995671128852f,0.0009304697965603992f,0.17187527055438823f,-1.2246467991473532e-16f,0.0009304697965603992f,-0.9999995671128852f,0.00029077168555376073f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5754408823675132f,-0.8178433779765524f,1.2246446786125339e-16f,-0.19062500000000002f,-0.8178419618414178f,-0.5754398859639556f,-0.0018609387875440258f,0.42187483766736705f,0.0015219564642126662f,0.0010708602579361643f,-0.9999982684519154f,-0.00017446301133227575f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6101187313203635f,0.7923099984804118f,1.2246446786125339e-16f,0.19375f,0.7923086265575515f,-0.610117674870443f,-0.0018609387875440258f,0.42187483766736705f,-0.0014744404079310718f,0.0011353936121213134f,-0.9999982684519154f,-0.0001744630113322287f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/10
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,2.0398210597025116e-18f,9.179753166655865e-17f,2.5497763246281395e-19f,0f,0.49972248722636686f,-0.024984604472767753f,0.3905903109032959f,-6.123233995736766e-17f,-0.01665640298184517f,-0.7495837308395503f,-0.002082050372730646f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-2.0401041568261727e-18f,1.2244768597914734e-16f,-0.05625f,0f,0.99986123398518f,0.01665871464528853f,0.17196172274176036f,-1.2246467991473532e-16f,0.01665871464528853f,-0.99986123398518f,0.005205125931826609f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-2.0401041568261727e-18f,1.2244768597914734e-16f,0.0546875f,0f,0.99986123398518f,0.01665871464528853f,0.17196172274176036f,-1.2246467991473532e-16f,0.01665871464528853f,-0.99986123398518f,0.0052051259318266225f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5965133384424888f,-0.8026031628770203f,1.2239670888874486e-16f,-0.19062500000000002f,-0.8021576976173068f,-0.5961822583003681f,-0.03331280596369034f,0.42182296635494376f,0.0267369634307664f,0.019871533098287673f,-0.9994449744527337f,-0.0031230755590959925f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6360782202777635f,0.7716245833877201f,1.2239670888874486e-16f,0.19375f,0.7711963120310412f,-0.6357251806154497f,-0.03331280596369034f,0.42182296635494376f,-0.025704980023208437f,0.02118955032984271f,-0.9994449744527337f,-0.0031230755590959452f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
}
