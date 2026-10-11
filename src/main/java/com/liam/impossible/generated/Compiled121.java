package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled121 {
    public static void register() {
        Logic.register("animated_java:land_shark/root/zzz/0", Compiled121::f0);
        Logic.register("animated_java:land_shark/set_default_pose", Compiled121::f1);
        Logic.register("animated_java:land_shark/summon", Compiled121::f2, "args");
        Logic.register("animated_java:land_shark/zzz/0", Compiled121::f3);
        Logic.register("animated_java:land_shark/zzz/1", Compiled121::f4);
        Logic.register("animated_java:land_shark/zzz/2", Compiled121::f5);
        Logic.register("animated_java:land_shark/zzz/3", Compiled121::f6);
        Logic.register("animated_java:land_shark/zzz/4", Compiled121::f7);
        Logic.register("animated_java:land_shark/zzz/5", Compiled121::f8);
        Logic.register("animated_java:land_shark/zzz/6", Compiled121::f9, "animation");
        Logic.register("animated_java:land_shark/zzz/7", Compiled121::f10, "animation");
        Logic.register("animated_java:land_shark/zzz/8", Compiled121::f11, "animation");
        Logic.register("animated_java:lava_wave/animations/crash/apply_frame", Compiled121::f12, "frame");
        Logic.register("animated_java:lava_wave/animations/crash/next_frame", Compiled121::f13);
        Logic.register("animated_java:lava_wave/animations/crash/pause", Compiled121::f14);
        Logic.register("animated_java:lava_wave/animations/crash/play", Compiled121::f15);
        Logic.register("animated_java:lava_wave/animations/crash/resume", Compiled121::f16);
        Logic.register("animated_java:lava_wave/animations/crash/set_frame", Compiled121::f17, "frame");
        Logic.register("animated_java:lava_wave/animations/crash/stop", Compiled121::f18);
        Logic.register("animated_java:lava_wave/animations/crash/tween", Compiled121::f19, "duration", "to_frame");
        Logic.register("animated_java:lava_wave/animations/crash/zzz/apply_frame", Compiled121::f20, "frame");
        Logic.register("animated_java:lava_wave/animations/crash/zzz/frames/0", Compiled121::f21, "bone_ground", "bone_wave_lower", "bone_wave_lowest", "bone_wave_upper");
        Logic.register("animated_java:lava_wave/animations/crash/zzz/frames/1", Compiled121::f22, "bone_ground");
        Logic.register("animated_java:lava_wave/animations/crash/zzz/frames/10", Compiled121::f23, "bone_ground", "bone_wave_lowest");
    }
    // animated_java:land_shark/root/zzz/0
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1"), Control.store("result", "storage", "aj:temp", "x", "int", "1"), Control.store("result", "score", "#this.x", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1"), Control.store("result", "storage", "aj:temp", "y", "int", "1"), Control.store("result", "score", "#this.y", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1"), Control.store("result", "storage", "aj:temp", "z", "int", "1"), Control.store("result", "score", "#this.z", "aj.i")));
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/root/outdated_tellraw", "with", "storage", "aj:temp"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.rigHash", "set", "value", "'6beb9df1900ac261d5a1869f73ce567e7d6ace1534895437745fc45bf3e1d244'"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{Glowing: 1b, glow_color_override: 16711680}"), Control.on("passengers")));
        Logic.step(() -> Native.summon(c, "minecraft:text_display", "~", "~", "~", "{Tags:['aj.rig_entity', 'aj.outdated_rig_text_display', 'aj.new'], text:'[\"\",{\"text\":\"This rig instance is outdated!\\\\nIt will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"}]', billboard: \"vertical\", transformation:{translation:[0f,3f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[1f,1f,1f]}}"));
        Logic.step(() -> Native.ride(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "mount", "@s"));
        Logic.step(() -> Native.tag(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "remove", "aj.new"));
        return 1;
    }
    // animated_java:land_shark/set_default_pose
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/set_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-9.957992501029599e-17f,0f,1f,5.601370781829149e-17f,0f,1f,0f,0.546875f,-1f,0f,-9.957992501029599e-17f,0.5625f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.jaw]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-9.957992501029599e-17f,0f,1f,-5.134589883343387e-17f,0f,1f,0f,0.6476562499999999f,-1f,0f,-9.957992501029599e-17f,-0.515625f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.tail]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-9.957992501029599e-17f,0f,1f,-0.17812499999999998f,0f,1f,0f,0.4765625f,-1f,0f,-9.957992501029599e-17f,-0.04687499999999998f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.leg_right]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-9.957992501029599e-17f,0f,1f,0.17343749999999997f,0f,1f,0f,0.4765625f,-1f,0f,-9.957992501029599e-17f,-0.046875000000000014f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.leg_left]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.1202741563658298e-16f,0f,1.125f,0f,0f,1.125f,0f,0.640625f,-1.125f,0f,-1.1202741563658298e-16f,0f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.body]")));
        return 1;
    }
    // animated_java:land_shark/summon
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "args", "set", "value", "{variant:'', animation:'', frame: 0}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "aj:temp", "args", "set", "value", "$(args)"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.summon(c, "minecraft:item_display", "~", "~", "~", "{ Tags:['aj.new','aj.rig_entity','aj.rig_root','aj.land_shark.root'], teleport_duration: 0, interpolation_duration: 2, Passengers:[{id:\"minecraft:marker\",Tags:[\"aj.rig_entity\",\"aj.data\",\"aj.land_shark.data\"],data:{rigHash:\"6beb9df1900ac261d5a1869f73ce567e7d6ace1534895437745fc45bf3e1d244\",locators:{},cameras:{},bones:{data_data:\"\",bone_jaw:\"\",bone_tail:\"\",bone_leg_right:\"\",bone_leg_left:\"\",bone_body:\"\"}}},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.land_shark.bone\",\"aj.land_shark.bone.jaw\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:light_gray_candle\",components:{\"minecraft:custom_model_data\":3},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.land_shark.bone\",\"aj.land_shark.bone.tail\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:light_gray_candle\",components:{\"minecraft:custom_model_data\":4},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.land_shark.bone\",\"aj.land_shark.bone.leg_right\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:light_gray_candle\",components:{\"minecraft:custom_model_data\":5},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.land_shark.bone\",\"aj.land_shark.bone.leg_left\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:light_gray_candle\",components:{\"minecraft:custom_model_data\":6},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.land_shark.bone\",\"aj.land_shark.bone.body\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:light_gray_candle\",components:{\"minecraft:custom_model_data\":2},count:1},height:48f,width:48f}], }"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/zzz/0"), Control.as("@e[type=item_display,tag=aj.new,limit=1,distance=..0.01]")));
        return 1;
    }
    // animated_java:land_shark/zzz/0
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/zzz/2"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/zzz/3", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:land_shark/as_root/on_summon"));
        return 1;
    }
    // animated_java:land_shark/zzz/1
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.jaw]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_jaw", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.tail]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_tail", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.leg_right]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg_right", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.leg_left]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg_left", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.body]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_body", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // animated_java:land_shark/zzz/2
    private static int f5(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"land_shark\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"No variants are available.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/remove/this"));
        return 1;
    }
    // animated_java:land_shark/zzz/3
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:land_shark/zzz/4")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:land_shark/zzz/5")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/zzz/6", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:land_shark/zzz/7", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/zzz/8", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:land_shark/zzz/4
    private static int f7(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"land_shark\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/remove/this"));
        return 1;
    }
    // animated_java:land_shark/zzz/5
    private static int f8(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"land_shark\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/remove/this"));
        return 1;
    }
    // animated_java:land_shark/zzz/6
    private static int f9(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:land_shark/zzz/7
    private static int f10(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"land_shark\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"walk\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"idle\",\"color\":\"yellow\"}],[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/remove/this"));
        return 1;
    }
    // animated_java:land_shark/zzz/8
    private static int f11(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/animations/$(animation)/resume"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/apply_frame
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'lava_wave', 'function_path': 'animated_java:lava_wave/animations/crash/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.lava_wave.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.crash.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/animations/crash/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/next_frame
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'lava_wave', 'function_path': 'animated_java:lava_wave/animations/crash/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.lava_wave.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.crash.frame", "1"), Control.when("score", "@s", "aj.crash.frame", "matches", "131..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.crash.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/animations/crash/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.crash.frame", "1"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/pause
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'lava_wave', 'function_path': 'animated_java:lava_wave/animations/crash/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.lava_wave.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.lava_wave.animation.crash.playing"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/play
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'lava_wave', 'function_path': 'animated_java:lava_wave/animations/crash/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.lava_wave.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.lava_wave.animation.crash.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.crash.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/animations/crash/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/resume
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'lava_wave', 'function_path': 'animated_java:lava_wave/animations/crash/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.lava_wave.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.lava_wave.animation.crash.playing"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/set_frame
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'lava_wave', 'function_path': 'animated_java:lava_wave/animations/crash/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.lava_wave.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.crash.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/animations/crash/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/stop
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'lava_wave', 'function_path': 'animated_java:lava_wave/animations/crash/stop'}")), Control.unless("entity", "@s[type=item_display,tag=aj.lava_wave.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.lava_wave.animation.crash.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.crash.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/animations/crash/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/tween
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'lava_wave', 'function_path': 'animated_java:lava_wave/animations/crash/tween'}")), Control.unless("entity", "@s[type=item_display,tag=aj.lava_wave.root]")));
        Logic.step(() -> Logic.call(c, "animated_java:lava_wave/animations/pause_all"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.lava_wave.animation.crash.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tween_duration", "$(duration)"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.crash.frame", "$(to_frame)"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.i", "=", "@s", "aj.tween_duration"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/animations/crash/zzz/apply_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/animations/crash/zzz/apply_frame", "{frame: $(to_frame)}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#this", "aj.i"), Control.on("passengers"), Control.store("result", "entity", "@s", "interpolation_duration", "int", "1")));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/zzz/apply_frame
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/animations/crash/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/zzz/frames/0
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lowest)", "{ transformation: [-0.000018333333333333336f,3.898724224222248e-22f,2.2110763812534794e-21f,3.061616997868383e-22f,0f,0.000018054808805223815f,-0.000003183549923893723f,-0.125f,-2.2451857984368145e-21f,-0.000003183549923893723f,-0.000018054808805223815f,-0.0000025f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_upper)", "{ transformation: [-0.000014583333333333333f,-1.1479821919040402e-21f,-1.3681119014358143e-21f,-1.823989620629715e-22f,0f,-0.000011171481462151757f,0.000009373985974595372f,-0.1249965802945456f,-1.785943248756557e-21f,0.000009373985974595372f,0.000011171481462151757f,0.0000014894005536123958f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lower)", "{ transformation: [-0.000016666666666666667f,-1.6719532150892076e-21f,1.170714244739424e-21f,1.0715659492539341e-21f,0f,0.00000955960727251744f,0.000013652534071483196f,-0.12500375f,-2.041077998578922e-21f,0.000013652534071483196f,-0.00000955960727251744f,-0.000008750000000000001f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_ground)", "{ transformation: [-2.916666666666667e-10f,1.5580350076003776e-27f,3.5684868530327274e-26f,-5.357829746269671e-22f,0f,2.913890646280419e-10f,-1.272232131488967e-11f,-0.125000625f,-3.571886497513114e-26f,-1.272232131488967e-11f,-2.913890646280419e-10f,0.0000043750000000000005f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/zzz/frames/1
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_ground)", "{ transformation: [-2.916666666666667e-10f,1.5580350076003776e-27f,3.5684868530327274e-26f,-5.8839177730308925e-22f,0f,2.913890646280419e-10f,-1.272232131488967e-11f,-0.12500051157860373f,-3.571886497513114e-26f,-1.272232131488967e-11f,-2.913890646280419e-10f,0.0000048045834742943885f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/zzz/frames/10
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lowest)", "{ transformation: [-0.000018333333333333336f,2.5677208161420966e-22f,2.2304545204074128e-21f,3.061616997868383e-22f,0f,0.000018213043319595022f,-0.0000020967031620299367f,-0.12499849583444964f,-2.2451857984368145e-21f,-0.0000020967031620299367f,-0.000018213043319595022f,-0.0000025f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_ground)", "{ transformation: [-2.916666666666667e-10f,1.5580350076003776e-27f,3.5684868530327274e-26f,-1.2099670260908317e-21f,0f,2.913890646280419e-10f,-1.272232131488967e-11f,-0.12499951802142856f,-3.571886497513114e-26f,-1.272232131488967e-11f,-2.913890646280419e-10f,0.000009880130556281679f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
}
