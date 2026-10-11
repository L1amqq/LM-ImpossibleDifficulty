package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled147 {
    public static void register() {
        Logic.register("animated_java:spinning_portal/animations/portal_spin/zzz/frames/8", Compiled147::f0, "bone_portal");
        Logic.register("animated_java:spinning_portal/animations/portal_spin/zzz/frames/9", Compiled147::f1, "bone_portal");
        Logic.register("animated_java:spinning_portal/animations/portal_spin/zzz/frames/zzz/0", Compiled147::f2);
        Logic.register("animated_java:spinning_portal/animations/portal_spin/zzz/on_tick", Compiled147::f3);
        Logic.register("animated_java:spinning_portal/animations/portal_spin/zzz/set_frame", Compiled147::f4, "frame");
        Logic.register("animated_java:spinning_portal/apply_default_pose", Compiled147::f5);
        Logic.register("animated_java:spinning_portal/as_own_locator_entities", Compiled147::f6, "command");
        Logic.register("animated_java:spinning_portal/on_load", Compiled147::f7);
        Logic.register("animated_java:spinning_portal/remove/all", Compiled147::f8);
        Logic.register("animated_java:spinning_portal/remove/this", Compiled147::f9);
        Logic.register("animated_java:spinning_portal/remove/zzz/0", Compiled147::f10);
        Logic.register("animated_java:spinning_portal/root/on_load", Compiled147::f11);
        Logic.register("animated_java:spinning_portal/root/on_tick", Compiled147::f12);
        Logic.register("animated_java:spinning_portal/root/outdated_tellraw", Compiled147::f13, "x", "y", "z");
        Logic.register("animated_java:spinning_portal/root/zzz/0", Compiled147::f14);
        Logic.register("animated_java:spinning_portal/root/zzz/1", Compiled147::f15);
        Logic.register("animated_java:spinning_portal/set_default_pose", Compiled147::f16);
        Logic.register("animated_java:spinning_portal/summon/default", Compiled147::f17);
        Logic.register("animated_java:spinning_portal/summon", Compiled147::f18, "args");
        Logic.register("animated_java:spinning_portal/uninstall", Compiled147::f19);
        Logic.register("animated_java:spinning_portal/variants/default/apply", Compiled147::f20);
        Logic.register("animated_java:spinning_portal/variants/default/zzz/0", Compiled147::f21);
        Logic.register("animated_java:spinning_portal/zzz/0", Compiled147::f22);
        Logic.register("animated_java:spinning_portal/zzz/1", Compiled147::f23);
    }
    // animated_java:spinning_portal/animations/portal_spin/zzz/frames/8
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_portal)", "{ transformation: [-8.85198069624369e-15f,-69.58031701606022f,-19.5768657333094f,-5.931882933369992e-17f,1.2037355737200608e-14f,19.576865733309397f,-69.58031701606022f,0f,72.28190775011035f,-2.0558486988938236e-14f,1.3652333053837326e-14f,0.484375f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/zzz/frames/9
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_portal)", "{ transformation: [-4.6272445600065346e-14f,-81.15996554801659f,-9.14453192048675f,-5.931882933369992e-17f,4.533790645426043e-15f,9.144531920486765f,-81.15996554801659f,0f,81.67351144526626f,-2.807439178443297e-14f,-1.925504475631666e-14f,0.484375f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/zzz/frames/zzz/0
    private static int f2(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:spinning_portal/remove/this"));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/zzz/on_tick
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "1"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.portal_spin.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:spinning_portal/animations/portal_spin/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:spinning_portal/animations/portal_spin/pause")), Control.when("score", "@s", "aj.portal_spin.frame", "matches", "29..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.portal_spin.frame", "1"));
        return 1;
    }
    // animated_java:spinning_portal/animations/portal_spin/zzz/set_frame
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/animations/portal_spin/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:spinning_portal/apply_default_pose
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/apply_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-3.4450928483976665e-16f,0f,-1f,-5.931882933369992e-17f,0f,1f,0f,0f,1f,0f,-3.4450928483976665e-16f,0.484375f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.spinning_portal.bone.portal]")));
        return 1;
    }
    // animated_java:spinning_portal/as_own_locator_entities
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/as_all_locators'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "command", "set", "value", "'$(command)'"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/zzz/12"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        return 1;
    }
    // animated_java:spinning_portal/on_load
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "aj.portal_spin.frame", "dummy"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/root/on_load"), Control.as("@e[type=item_display,tag=aj.spinning_portal.root]"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1"), Control.at("@s")));
        return 1;
    }
    // animated_java:spinning_portal/remove/all
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/remove/this"), Control.as("@e[type=item_display,tag=aj.spinning_portal.root]")));
        return 1;
    }
    // animated_java:spinning_portal/remove/this
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/remove/this'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Logic.call(c, "#animated_java:spinning_portal/as_root/on_remove"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/remove/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // animated_java:spinning_portal/remove/zzz/0
    private static int f10(Frame c) {

        return 1;
    }
    // animated_java:spinning_portal/root/on_load
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.spinning_portal.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/root/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.spinning_portal.data]"), Control.unless("data", "entity", "@s", "{data:{rigHash: '9fd911e5b66805fc413b9893b2191d474bf9e323d76ab5c98dc836eed1bdefe0'}}"), Control.on("vehicle")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.is_rig_loaded", "1"));
        return 1;
    }
    // animated_java:spinning_portal/root/on_tick
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.spinning_portal.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "#animated_java:global/root/on_load"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1")));
        Logic.step(() -> Logic.call(c, "#animated_java:spinning_portal/as_root/pre_tick"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/animations/portal_spin/zzz/on_tick"), Control.when("entity", "@s[tag=aj.spinning_portal.animation.portal_spin.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/root/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.spinning_portal.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:spinning_portal/as_root/post_tick"));
        return 1;
    }
    // animated_java:spinning_portal/root/outdated_tellraw
    private static int f13(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The \",\"color\":\"red\"},{\"text\":\"spinning_portal\",\"color\":\"yellow\"},{\"text\":\" rig instance at\",\"color\":\"red\"},[{\"text\":\" [\",\"color\":\"yellow\"},{\"score\":{\"name\":\"#this.x\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.y\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.z\",\"objective\":\"aj.i\"}},\"]\"],{\"text\":\" is outdated! It will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"},\"\\n \",{\"text\":\"[Click Here to Teleport to the Rig Instance]\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/tp @s $(x) $(y) $(z)\"},\"color\":\"aqua\",\"underlined\":true}]"));
        return 1;
    }
    // animated_java:spinning_portal/root/zzz/0
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1"), Control.store("result", "storage", "aj:temp", "x", "int", "1"), Control.store("result", "score", "#this.x", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1"), Control.store("result", "storage", "aj:temp", "y", "int", "1"), Control.store("result", "score", "#this.y", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1"), Control.store("result", "storage", "aj:temp", "z", "int", "1"), Control.store("result", "score", "#this.z", "aj.i")));
        Logic.step(() -> Logic.call(c, "animated_java:spinning_portal/root/outdated_tellraw", "with", "storage", "aj:temp"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.rigHash", "set", "value", "'9fd911e5b66805fc413b9893b2191d474bf9e323d76ab5c98dc836eed1bdefe0'"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{Glowing: 1b, glow_color_override: 16711680}"), Control.on("passengers")));
        Logic.step(() -> Native.summon(c, "minecraft:text_display", "~", "~", "~", "{Tags:['aj.rig_entity', 'aj.outdated_rig_text_display', 'aj.new'], text:'[\"\",{\"text\":\"This rig instance is outdated!\\\\nIt will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"}]', billboard: \"vertical\", transformation:{translation:[0,3,0],left_rotation:[0,0,0,1],right_rotation:[0,0,0,1],scale:[1,1,1]}}"));
        Logic.step(() -> Native.ride(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "mount", "@s"));
        Logic.step(() -> Native.tag(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "remove", "aj.new"));
        return 1;
    }
    // animated_java:spinning_portal/root/zzz/1
    private static int f15(Frame c) {

        return 1;
    }
    // animated_java:spinning_portal/set_default_pose
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/set_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-3.4450928483976665e-16f,0f,-1f,-5.931882933369992e-17f,0f,1f,0f,0f,1f,0f,-3.4450928483976665e-16f,0.484375f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.spinning_portal.bone.portal]")));
        return 1;
    }
    // animated_java:spinning_portal/summon/default
    private static int f17(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:spinning_portal/summon", "{args:{variant: 'default'}}"));
        return 1;
    }
    // animated_java:spinning_portal/summon
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "args", "set", "value", "{variant:'', animation:'', frame: 0}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "aj:temp", "args", "set", "value", "$(args)"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.summon(c, "minecraft:item_display", "~", "~", "~", "{ Tags:['aj.new','aj.rig_entity','aj.rig_root','aj.spinning_portal.root'], teleport_duration: 0, interpolation_duration: 1, Passengers:[{id:\"minecraft:marker\",Tags:[\"aj.rig_entity\",\"aj.data\",\"aj.spinning_portal.data\"],data:{rigHash:\"9fd911e5b66805fc413b9893b2191d474bf9e323d76ab5c98dc836eed1bdefe0\",locators:{commands:{posx:-0.48437500000000006f,posy:0f,posz:0.48437499999999983f,rotx:0f,roty:15469.860468532228f}},cameras:{},bones:{data_data:\"\",bone_portal:\"\"}}},{Tags:[\"aj.rig_entity\"]},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.spinning_portal.bone\",\"aj.spinning_portal.bone.portal\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:1,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":11}},height:48f,width:48f}], }"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/zzz/0"), Control.as("@e[type=item_display,tag=aj.new,limit=1,distance=..0.01]")));
        return 1;
    }
    // animated_java:spinning_portal/uninstall
    private static int f19(Frame c) {

        return 1;
    }
    // animated_java:spinning_portal/variants/default/apply
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'spinning_portal', 'function_path': 'animated_java:spinning_portal/variants/default/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.spinning_portal.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/variants/default/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.spinning_portal.bone.portal]")));
        return 1;
    }
    // animated_java:spinning_portal/variants/default/zzz/0
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "11"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        return 1;
    }
    // animated_java:spinning_portal/zzz/0
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/zzz/2", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:spinning_portal/zzz/6", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "1"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:spinning_portal/as_root/on_summon"));
        return 1;
    }
    // animated_java:spinning_portal/zzz/1
    private static int f23(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.spinning_portal.bone.portal]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_portal", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
}
