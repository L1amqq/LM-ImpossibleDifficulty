package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled153 {
    public static void register() {
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/on_tick", Compiled153::f0);
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/set_frame", Compiled153::f1, "frame");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/zzz/0", Compiled153::f2);
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/zzz/1", Compiled153::f3);
        Logic.register("animated_java:walking_diamond/apply_default_pose", Compiled153::f4);
        Logic.register("animated_java:walking_diamond/on_load", Compiled153::f5);
        Logic.register("animated_java:walking_diamond/remove/all", Compiled153::f6);
        Logic.register("animated_java:walking_diamond/remove/this", Compiled153::f7);
        Logic.register("animated_java:walking_diamond/root/on_load", Compiled153::f8);
        Logic.register("animated_java:walking_diamond/root/on_tick", Compiled153::f9);
        Logic.register("animated_java:walking_diamond/root/outdated_tellraw", Compiled153::f10, "x", "y", "z");
        Logic.register("animated_java:walking_diamond/root/zzz/0", Compiled153::f11);
        Logic.register("animated_java:walking_diamond/set_default_pose", Compiled153::f12);
        Logic.register("animated_java:walking_diamond/summon", Compiled153::f13, "args");
        Logic.register("animated_java:walking_diamond/zzz/0", Compiled153::f14);
        Logic.register("animated_java:walking_diamond/zzz/1", Compiled153::f15);
        Logic.register("animated_java:walking_diamond/zzz/2", Compiled153::f16);
        Logic.register("animated_java:walking_diamond/zzz/3", Compiled153::f17);
        Logic.register("animated_java:walking_diamond/zzz/4", Compiled153::f18);
        Logic.register("animated_java:walking_diamond/zzz/5", Compiled153::f19);
        Logic.register("animated_java:walking_diamond/zzz/6", Compiled153::f20, "animation");
        Logic.register("animated_java:walking_diamond/zzz/7", Compiled153::f21, "animation");
        Logic.register("animated_java:walking_diamond/zzz/8", Compiled153::f22, "animation");
    }
    // animated_java:walking_diamond/animations/walk/zzz/on_tick
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "2"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/walk/zzz/zzz/0"), Control.when("score", "@s", "aj.walk.frame", "matches", "-1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.walk.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/animations/walk/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:walking_diamond/animations/walk/zzz/zzz/1")), Control.when("score", "@s", "aj.walk.frame", "matches", "14..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.walk.frame", "1"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/set_frame
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/walk/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/zzz/0
    private static int f2(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/animations/walk/zzz/apply_frame", "{frame: 15}"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.walk.frame", "1"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/zzz/1
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.walk.frame", "-1"));
        return 1;
    }
    // animated_java:walking_diamond/apply_default_pose
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/apply_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.5f,0f,9.184850993605148e-17f,0f,0f,0.5f,0f,0.390625f,-6.123233995736766e-17f,0f,-0.75f,0f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.diamond]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.05625f,0f,1f,0f,0.171875f,-1.2246467991473532e-16f,0f,-1f,-6.888638245203862e-18f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.leg_right]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.0546875f,0f,1f,0f,0.171875f,-1.2246467991473532e-16f,0f,-1f,6.697287182837088e-18f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.leg_left]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.14375000000000002f,0f,1f,0f,0.421875f,-1.2246467991473532e-16f,0f,-1f,-1.7604297737743203e-17f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.hand_right]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.1375f,0f,1f,0f,0.421875f,-1.2246467991473532e-16f,0f,-1f,1.683889348827611e-17f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.hand_left]")));
        return 1;
    }
    // animated_java:walking_diamond/on_load
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "aj.walk.frame", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "aj.idle.frame", "dummy"));
        return 1;
    }
    // animated_java:walking_diamond/remove/all
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/remove/this"), Control.as("@e[type=item_display,tag=aj.walking_diamond.root]")));
        return 1;
    }
    // animated_java:walking_diamond/remove/this
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/remove/this'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Logic.call(c, "#animated_java:walking_diamond/as_root/on_remove"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // animated_java:walking_diamond/root/on_load
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.walking_diamond.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/root/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.data]"), Control.unless("data", "entity", "@s", "{data:{rigHash: '4d651185a4db8c57ef7d76b9736703ea172cdfbf27b825d6f9ffe1ba11f9a775'}}"), Control.on("vehicle")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.is_rig_loaded", "1"));
        return 1;
    }
    // animated_java:walking_diamond/root/on_tick
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.walking_diamond.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "#animated_java:global/root/on_load"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1")));
        Logic.step(() -> Logic.call(c, "#animated_java:walking_diamond/as_root/pre_tick"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/walk/zzz/on_tick"), Control.when("entity", "@s[tag=aj.walking_diamond.animation.walk.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/idle/zzz/on_tick"), Control.when("entity", "@s[tag=aj.walking_diamond.animation.idle.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:walking_diamond/as_root/post_tick"));
        return 1;
    }
    // animated_java:walking_diamond/root/outdated_tellraw
    private static int f10(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"walking_diamond\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The \",\"color\":\"red\"},{\"text\":\"walking_diamond\",\"color\":\"yellow\"},{\"text\":\" rig instance at\",\"color\":\"red\"},[{\"text\":\" [\",\"color\":\"yellow\"},{\"score\":{\"name\":\"#this.x\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.y\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.z\",\"objective\":\"aj.i\"}},\"]\"],{\"text\":\" is outdated! It will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"},\"\\n \",{\"text\":\"[Click Here to Teleport to the Rig Instance]\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/tp @s $(x) $(y) $(z)\"},\"color\":\"aqua\",\"underlined\":true},[\"\\n\"]]"));
        return 1;
    }
    // animated_java:walking_diamond/root/zzz/0
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1"), Control.store("result", "storage", "aj:temp", "x", "int", "1"), Control.store("result", "score", "#this.x", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1"), Control.store("result", "storage", "aj:temp", "y", "int", "1"), Control.store("result", "score", "#this.y", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1"), Control.store("result", "storage", "aj:temp", "z", "int", "1"), Control.store("result", "score", "#this.z", "aj.i")));
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/root/outdated_tellraw", "with", "storage", "aj:temp"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.rigHash", "set", "value", "'4d651185a4db8c57ef7d76b9736703ea172cdfbf27b825d6f9ffe1ba11f9a775'"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{Glowing: 1b, glow_color_override: 16711680}"), Control.on("passengers")));
        Logic.step(() -> Native.summon(c, "minecraft:text_display", "~", "~", "~", "{Tags:['aj.rig_entity', 'aj.outdated_rig_text_display', 'aj.new'], text:'[\"\",{\"text\":\"This rig instance is outdated!\\\\nIt will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"}]', billboard: \"vertical\", transformation:{translation:[0f,3f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[1f,1f,1f]}}"));
        Logic.step(() -> Native.ride(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "mount", "@s"));
        Logic.step(() -> Native.tag(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "remove", "aj.new"));
        return 1;
    }
    // animated_java:walking_diamond/set_default_pose
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/set_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.5f,0f,9.184850993605148e-17f,0f,0f,0.5f,0f,0.390625f,-6.123233995736766e-17f,0f,-0.75f,0f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.diamond]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.05625f,0f,1f,0f,0.171875f,-1.2246467991473532e-16f,0f,-1f,-6.888638245203862e-18f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.leg_right]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.0546875f,0f,1f,0f,0.171875f,-1.2246467991473532e-16f,0f,-1f,6.697287182837088e-18f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.leg_left]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.14375000000000002f,0f,1f,0f,0.421875f,-1.2246467991473532e-16f,0f,-1f,-1.7604297737743203e-17f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.hand_right]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.1375f,0f,1f,0f,0.421875f,-1.2246467991473532e-16f,0f,-1f,1.683889348827611e-17f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.hand_left]")));
        return 1;
    }
    // animated_java:walking_diamond/summon
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "args", "set", "value", "{variant:'', animation:'', frame: 0}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "aj:temp", "args", "set", "value", "$(args)"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.summon(c, "minecraft:item_display", "~", "~", "~", "{ Tags:['aj.new','aj.rig_entity','aj.rig_root','aj.walking_diamond.root'], teleport_duration: 0, interpolation_duration: 2, Passengers:[{id:\"minecraft:marker\",Tags:[\"aj.rig_entity\",\"aj.data\",\"aj.walking_diamond.data\"],data:{rigHash:\"4d651185a4db8c57ef7d76b9736703ea172cdfbf27b825d6f9ffe1ba11f9a775\",locators:{},cameras:{},bones:{data_data:\"\",item_display_diamond:\"\",bone_leg_right:\"\",bone_leg_left:\"\",bone_hand_right:\"\",bone_hand_left:\"\"}}},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.walking_diamond.bone\",\"aj.walking_diamond.bone.diamond\"],id:\"minecraft:item_display\",item:{id:\"minecraft:diamond\",count:1}},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.walking_diamond.bone\",\"aj.walking_diamond.bone.leg_right\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:cyan_dye\",components:{\"minecraft:custom_model_data\":2},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.walking_diamond.bone\",\"aj.walking_diamond.bone.leg_left\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:cyan_dye\",components:{\"minecraft:custom_model_data\":3},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.walking_diamond.bone\",\"aj.walking_diamond.bone.hand_right\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:cyan_dye\",components:{\"minecraft:custom_model_data\":4},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.walking_diamond.bone\",\"aj.walking_diamond.bone.hand_left\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:cyan_dye\",components:{\"minecraft:custom_model_data\":5},count:1},height:48f,width:48f}], }"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/zzz/0"), Control.as("@e[type=item_display,tag=aj.new,limit=1,distance=..0.01]")));
        return 1;
    }
    // animated_java:walking_diamond/zzz/0
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/zzz/2"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/zzz/3", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:walking_diamond/as_root/on_summon"));
        return 1;
    }
    // animated_java:walking_diamond/zzz/1
    private static int f15(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.diamond]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.item_display_diamond", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.leg_right]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg_right", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.leg_left]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg_left", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.hand_right]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_hand_right", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.walking_diamond.bone.hand_left]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_hand_left", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // animated_java:walking_diamond/zzz/2
    private static int f16(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"walking_diamond\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"No variants are available.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/remove/this"));
        return 1;
    }
    // animated_java:walking_diamond/zzz/3
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:walking_diamond/zzz/4")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:walking_diamond/zzz/5")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/zzz/6", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:walking_diamond/zzz/7", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/zzz/8", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:walking_diamond/zzz/4
    private static int f18(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"walking_diamond\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/remove/this"));
        return 1;
    }
    // animated_java:walking_diamond/zzz/5
    private static int f19(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"walking_diamond\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/remove/this"));
        return 1;
    }
    // animated_java:walking_diamond/zzz/6
    private static int f20(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:walking_diamond/zzz/7
    private static int f21(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"walking_diamond\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"walk\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"idle\",\"color\":\"yellow\"}],[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/remove/this"));
        return 1;
    }
    // animated_java:walking_diamond/zzz/8
    private static int f22(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/animations/$(animation)/resume"));
        return 1;
    }
}
