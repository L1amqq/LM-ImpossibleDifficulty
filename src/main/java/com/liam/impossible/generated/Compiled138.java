package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled138 {
    public static void register() {
        Logic.register("animated_java:mutant_spider/remove/all", Compiled138::f0);
        Logic.register("animated_java:mutant_spider/remove/this", Compiled138::f1);
        Logic.register("animated_java:mutant_spider/root/on_load", Compiled138::f2);
        Logic.register("animated_java:mutant_spider/root/on_tick", Compiled138::f3);
        Logic.register("animated_java:mutant_spider/root/outdated_tellraw", Compiled138::f4, "x", "y", "z");
        Logic.register("animated_java:mutant_spider/root/zzz/0", Compiled138::f5);
        Logic.register("animated_java:mutant_spider/set_default_pose", Compiled138::f6);
        Logic.register("animated_java:mutant_spider/summon/default", Compiled138::f7);
        Logic.register("animated_java:mutant_spider/summon/red", Compiled138::f8);
        Logic.register("animated_java:mutant_spider/summon", Compiled138::f9, "args");
        Logic.register("animated_java:mutant_spider/variants/default/apply", Compiled138::f10);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/0", Compiled138::f11);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/1", Compiled138::f12);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/10", Compiled138::f13);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/11", Compiled138::f14);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/12", Compiled138::f15);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/13", Compiled138::f16);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/14", Compiled138::f17);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/15", Compiled138::f18);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/16", Compiled138::f19);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/17", Compiled138::f20);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/18", Compiled138::f21);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/19", Compiled138::f22);
        Logic.register("animated_java:mutant_spider/variants/default/zzz/2", Compiled138::f23);
    }
    // animated_java:mutant_spider/remove/all
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/remove/this"), Control.as("@e[type=item_display,tag=aj.mutant_spider.root]")));
        return 1;
    }
    // animated_java:mutant_spider/remove/this
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'mutant_spider', 'function_path': 'animated_java:mutant_spider/remove/this'}")), Control.unless("entity", "@s[type=item_display,tag=aj.mutant_spider.root]")));
        Logic.step(() -> Logic.call(c, "#animated_java:mutant_spider/as_root/on_remove"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // animated_java:mutant_spider/root/on_load
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.mutant_spider.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/root/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.data]"), Control.unless("data", "entity", "@s", "{data:{rigHash: '04be5f6301ed19f376485097b974a25ae437766915f57cb234f0cfe17ef9da3b'}}"), Control.on("vehicle")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.is_rig_loaded", "1"));
        return 1;
    }
    // animated_java:mutant_spider/root/on_tick
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.mutant_spider.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "#animated_java:global/root/on_load"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1")));
        Logic.step(() -> Logic.call(c, "#animated_java:mutant_spider/as_root/pre_tick"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/animations/walk/zzz/on_tick"), Control.when("entity", "@s[tag=aj.mutant_spider.animation.walk.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/animations/idle/zzz/on_tick"), Control.when("entity", "@s[tag=aj.mutant_spider.animation.idle.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:mutant_spider/as_root/post_tick"));
        return 1;
    }
    // animated_java:mutant_spider/root/outdated_tellraw
    private static int f4(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"mutant_spider\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The \",\"color\":\"red\"},{\"text\":\"mutant_spider\",\"color\":\"yellow\"},{\"text\":\" rig instance at\",\"color\":\"red\"},[{\"text\":\" [\",\"color\":\"yellow\"},{\"score\":{\"name\":\"#this.x\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.y\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.z\",\"objective\":\"aj.i\"}},\"]\"],{\"text\":\" is outdated! It will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"},\"\\n \",{\"text\":\"[Click Here to Teleport to the Rig Instance]\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/tp @s $(x) $(y) $(z)\"},\"color\":\"aqua\",\"underlined\":true},[\"\\n\"]]"));
        return 1;
    }
    // animated_java:mutant_spider/root/zzz/0
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1"), Control.store("result", "storage", "aj:temp", "x", "int", "1"), Control.store("result", "score", "#this.x", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1"), Control.store("result", "storage", "aj:temp", "y", "int", "1"), Control.store("result", "score", "#this.y", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1"), Control.store("result", "storage", "aj:temp", "z", "int", "1"), Control.store("result", "score", "#this.z", "aj.i")));
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/root/outdated_tellraw", "with", "storage", "aj:temp"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.rigHash", "set", "value", "'04be5f6301ed19f376485097b974a25ae437766915f57cb234f0cfe17ef9da3b'"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{Glowing: 1b, glow_color_override: 16711680}"), Control.on("passengers")));
        Logic.step(() -> Native.summon(c, "minecraft:text_display", "~", "~", "~", "{Tags:['aj.rig_entity', 'aj.outdated_rig_text_display', 'aj.new'], text:'[\"\",{\"text\":\"This rig instance is outdated!\\\\nIt will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"}]', billboard: \"vertical\", transformation:{translation:[0f,3f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[1f,1f,1f]}}"));
        Logic.step(() -> Native.ride(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "mount", "@s"));
        Logic.step(() -> Native.tag(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "remove", "aj.new"));
        return 1;
    }
    // animated_java:mutant_spider/set_default_pose
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'mutant_spider', 'function_path': 'animated_java:mutant_spider/set_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.mutant_spider.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.9063077925108699f,1.1733024164601126e-8f,-0.42261825000119646f,0.14062499999999994f,-0.09147131628997343f,0.9762960093240962f,0.19616090455038176f,0.390625f,0.4126005132452619f,0.21643960399576645f,-0.8848246799744581f,0.75f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.pincer_left]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.9063077925108699f,-1.173302421761354e-8f,0.4226182500011967f,-0.14062500000000006f,0.09147131628997343f,0.9762960093240962f,0.19616090455038176f,0.390625f,-0.41260051324526215f,0.21643960399576645f,-0.8848246799744581f,0.75f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.pincer_right]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,0.18750000000000006f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.neck]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.0833333333333333f,0f,1.3267006990762992e-16f,1.1102230246251565e-16f,0f,1.0833333333333333f,0f,0.5625f,-1.3267006990762992e-16f,0f,-1.0833333333333333f,-0.8125f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.body]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.24999999999999994f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,-0.25f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.24999999999999994f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,-0.4375f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg12]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.24999999999999994f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,-0.625f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg13]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.2499999999999999f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,-0.8125f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg14]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.2499999999999999f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,-1f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg15]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.25000000000000006f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,-0.24999999999999994f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.25000000000000006f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,-0.43749999999999994f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg9]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.25000000000000006f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,-0.625f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg10]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.2500000000000001f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,-0.8125f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg11]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.2500000000000001f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,-1f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg16]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.24999999999999994f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,-0.0625f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.25f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,-0.062499999999999944f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.25000000000000006f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,0.12499999999999994f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.25f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,0.12500000000000006f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg6]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.25000000000000006f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,0.31249999999999994f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg7]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.24999999999999997f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,0.31250000000000006f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg8]")));
        return 1;
    }
    // animated_java:mutant_spider/summon/default
    private static int f7(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/summon", "{args:{variant: 'default'}}"));
        return 1;
    }
    // animated_java:mutant_spider/summon/red
    private static int f8(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/summon", "{args:{variant: 'red'}}"));
        return 1;
    }
    // animated_java:mutant_spider/summon
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "args", "set", "value", "{variant:'', animation:'', frame: 0}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "aj:temp", "args", "set", "value", "$(args)"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.summon(c, "minecraft:item_display", "~", "~", "~", "{ Tags:['aj.new','aj.rig_entity','aj.rig_root','aj.mutant_spider.root'], teleport_duration: 0, interpolation_duration: 2, Passengers:[{id:\"minecraft:marker\",Tags:[\"aj.rig_entity\",\"aj.data\",\"aj.mutant_spider.data\"],data:{rigHash:\"04be5f6301ed19f376485097b974a25ae437766915f57cb234f0cfe17ef9da3b\",locators:{},cameras:{},bones:{data_data:\"\",bone_pincer_left:\"\",bone_pincer_right:\"\",bone_head:\"\",bone_neck:\"\",bone_body:\"\",bone_leg1:\"\",bone_leg12:\"\",bone_leg13:\"\",bone_leg14:\"\",bone_leg15:\"\",bone_leg2:\"\",bone_leg9:\"\",bone_leg10:\"\",bone_leg11:\"\",bone_leg16:\"\",bone_leg3:\"\",bone_leg4:\"\",bone_leg5:\"\",bone_leg6:\"\",bone_leg7:\"\",bone_leg8:\"\"}}},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.pincer_left\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":3},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.pincer_right\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":4},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.head\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":2},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.neck\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":5},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.body\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":6},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg1\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":7},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg12\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":8},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg13\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":9},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg14\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":10},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg15\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":11},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg2\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":12},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg9\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":13},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg10\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":14},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg11\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":15},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg16\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":16},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg3\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":17},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg4\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":18},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg5\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":19},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg6\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":20},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg7\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":21},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.mutant_spider.bone\",\"aj.mutant_spider.bone.leg8\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:white_candle\",components:{\"minecraft:custom_model_data\":22},count:1},height:48f,width:48f}], }"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/zzz/0"), Control.as("@e[type=item_display,tag=aj.new,limit=1,distance=..0.01]")));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/apply
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'mutant_spider', 'function_path': 'animated_java:mutant_spider/variants/default/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.mutant_spider.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.pincer_left]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.pincer_right]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.neck]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.body]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/6"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg12]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/7"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg13]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/8"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg14]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/9"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg15]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/10"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg2]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/11"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg9]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/12"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg10]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/13"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg11]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/14"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg16]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/15"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/16"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/17"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/18"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg6]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/19"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg7]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/default/zzz/20"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg8]")));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/0
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "3"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/1
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "4"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/10
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "12"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/11
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "13"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/12
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "14"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/13
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "15"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/14
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "16"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/15
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "17"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/16
    private static int f19(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "18"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/17
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "19"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/18
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "20"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/19
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "21"));
        return 1;
    }
    // animated_java:mutant_spider/variants/default/zzz/2
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "2"));
        return 1;
    }
}
