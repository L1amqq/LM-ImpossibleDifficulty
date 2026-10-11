package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled014 {
    public static void register() {
        Logic.register("animated_java:chest_mob/on_load", Compiled014::f0);
        Logic.register("animated_java:chest_mob/remove/all", Compiled014::f1);
        Logic.register("animated_java:chest_mob/remove/this", Compiled014::f2);
        Logic.register("animated_java:chest_mob/root/on_load", Compiled014::f3);
        Logic.register("animated_java:chest_mob/root/on_tick", Compiled014::f4);
        Logic.register("animated_java:chest_mob/root/outdated_tellraw", Compiled014::f5, "x", "y", "z");
        Logic.register("animated_java:chest_mob/root/zzz/0", Compiled014::f6);
        Logic.register("animated_java:chest_mob/root/zzz/1", Compiled014::f7);
        Logic.register("animated_java:chest_mob/set_default_pose", Compiled014::f8);
        Logic.register("animated_java:chest_mob/summon/chest", Compiled014::f9);
        Logic.register("animated_java:chest_mob/summon/default", Compiled014::f10);
        Logic.register("animated_java:chest_mob/summon/shulker", Compiled014::f11);
        Logic.register("animated_java:chest_mob/summon", Compiled014::f12, "args");
        Logic.register("animated_java:chest_mob/variants/chest/apply", Compiled014::f13);
        Logic.register("animated_java:chest_mob/variants/chest/zzz/0", Compiled014::f14);
        Logic.register("animated_java:chest_mob/variants/chest/zzz/1", Compiled014::f15);
        Logic.register("animated_java:chest_mob/variants/chest/zzz/2", Compiled014::f16);
        Logic.register("animated_java:chest_mob/variants/chest/zzz/3", Compiled014::f17);
        Logic.register("animated_java:chest_mob/variants/chest/zzz/4", Compiled014::f18);
        Logic.register("animated_java:chest_mob/variants/chest/zzz/5", Compiled014::f19);
        Logic.register("animated_java:chest_mob/variants/chest/zzz/6", Compiled014::f20);
        Logic.register("animated_java:chest_mob/variants/chest/zzz/7", Compiled014::f21);
        Logic.register("animated_java:chest_mob/variants/chest/zzz/8", Compiled014::f22);
        Logic.register("animated_java:chest_mob/variants/chest/zzz/9", Compiled014::f23);
    }
    // animated_java:chest_mob/on_load
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "aj.shoot.frame", "dummy"));
        return 1;
    }
    // animated_java:chest_mob/remove/all
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/remove/this"), Control.as("@e[type=item_display,tag=aj.chest_mob.root]")));
        return 1;
    }
    // animated_java:chest_mob/remove/this
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'chest_mob', 'function_path': 'animated_java:chest_mob/remove/this'}")), Control.unless("entity", "@s[type=item_display,tag=aj.chest_mob.root]")));
        Logic.step(() -> Logic.call(c, "#animated_java:chest_mob/as_root/on_remove"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // animated_java:chest_mob/root/on_load
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.chest_mob.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/root/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.data]"), Control.unless("data", "entity", "@s", "{data:{rigHash: '8b9e8dbe660f38f6c6fe48c922b430042f818c4cbd658952742a4c7931848f4a'}}"), Control.on("vehicle")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.is_rig_loaded", "1"));
        return 1;
    }
    // animated_java:chest_mob/root/on_tick
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.chest_mob.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "#animated_java:global/root/on_load"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1")));
        Logic.step(() -> Logic.call(c, "#animated_java:chest_mob/as_root/pre_tick"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/animations/shoot/zzz/on_tick"), Control.when("entity", "@s[tag=aj.chest_mob.animation.shoot.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/root/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:chest_mob/as_root/post_tick"));
        return 1;
    }
    // animated_java:chest_mob/root/outdated_tellraw
    private static int f5(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"chest_mob\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The \",\"color\":\"red\"},{\"text\":\"chest_mob\",\"color\":\"yellow\"},{\"text\":\" rig instance at\",\"color\":\"red\"},[{\"text\":\" [\",\"color\":\"yellow\"},{\"score\":{\"name\":\"#this.x\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.y\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.z\",\"objective\":\"aj.i\"}},\"]\"],{\"text\":\" is outdated! It will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"},\"\\n \",{\"text\":\"[Click Here to Teleport to the Rig Instance]\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/tp @s $(x) $(y) $(z)\"},\"color\":\"aqua\",\"underlined\":true},[\"\\n\"]]"));
        return 1;
    }
    // animated_java:chest_mob/root/zzz/0
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1"), Control.store("result", "storage", "aj:temp", "x", "int", "1"), Control.store("result", "score", "#this.x", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1"), Control.store("result", "storage", "aj:temp", "y", "int", "1"), Control.store("result", "score", "#this.y", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1"), Control.store("result", "storage", "aj:temp", "z", "int", "1"), Control.store("result", "score", "#this.z", "aj.i")));
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/root/outdated_tellraw", "with", "storage", "aj:temp"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.rigHash", "set", "value", "'8b9e8dbe660f38f6c6fe48c922b430042f818c4cbd658952742a4c7931848f4a'"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{Glowing: 1b, glow_color_override: 16711680}"), Control.on("passengers")));
        Logic.step(() -> Native.summon(c, "minecraft:text_display", "~", "~", "~", "{Tags:['aj.rig_entity', 'aj.outdated_rig_text_display', 'aj.new'], text:'[\"\",{\"text\":\"This rig instance is outdated!\\\\nIt will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"}]', billboard: \"vertical\", transformation:{translation:[0f,3f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[1f,1f,1f]}}"));
        Logic.step(() -> Native.ride(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "mount", "@s"));
        Logic.step(() -> Native.tag(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "remove", "aj.new"));
        return 1;
    }
    // animated_java:chest_mob/root/zzz/1
    private static int f7(Frame c) {

        return 1;
    }
    // animated_java:chest_mob/set_default_pose
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'chest_mob', 'function_path': 'animated_java:chest_mob/set_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.chest_mob.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,5.35782974626967e-17f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,-0.4375f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.chest_lid]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,0f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.chest]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.21875f,0f,1f,0f,0.671875f,-1.2246467991473532e-16f,0f,-1f,0.04687500000000003f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.hand_left]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473535e-16f,-0.21874999999999994f,0f,1f,0f,0.6625f,-1.2246467991473535e-16f,0f,-1f,0.1968750000000001f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.water_gun]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.21875f,0f,1f,0f,0.671875f,-1.2246467991473532e-16f,0f,-1f,0.04687499999999997f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.hand_right]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.125f,0f,1f,0f,0.890625f,-1.2246467991473532e-16f,0f,-1f,0.06250000000000003f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.eyebrow_left]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.12500000000000003f,0f,1f,0f,0.890625f,-1.2246467991473532e-16f,0f,-1f,0.062499999999999986f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.eyebrow_right]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,7.654042494670958e-18f,0f,1f,0f,0.875f,-1.2246467991473532e-16f,0f,-1f,-0.0625f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.21562500000000007f,0f,1f,0f,0.775f,-1.2246467991473532e-16f,0f,-1f,0.3687499999999998f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.muzzle_flash_frame1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.21562500000000007f,0f,1f,0f,0.775f,-1.2246467991473532e-16f,0f,-1f,0.3687499999999998f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.muzzle_flash_frame2]")));
        return 1;
    }
    // animated_java:chest_mob/summon/chest
    private static int f9(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/summon", "{args:{variant: 'chest'}}"));
        return 1;
    }
    // animated_java:chest_mob/summon/default
    private static int f10(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/summon", "{args:{variant: 'default'}}"));
        return 1;
    }
    // animated_java:chest_mob/summon/shulker
    private static int f11(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:chest_mob/summon", "{args:{variant: 'shulker'}}"));
        return 1;
    }
    // animated_java:chest_mob/summon
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "args", "set", "value", "{variant:'', animation:'', frame: 0}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "aj:temp", "args", "set", "value", "$(args)"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.summon(c, "minecraft:item_display", "~", "~", "~", "{ Tags:['aj.new','aj.rig_entity','aj.rig_root','aj.chest_mob.root'], teleport_duration: 0, interpolation_duration: 2, Passengers:[{id:\"minecraft:marker\",Tags:[\"aj.rig_entity\",\"aj.data\",\"aj.chest_mob.data\"],data:{rigHash:\"8b9e8dbe660f38f6c6fe48c922b430042f818c4cbd658952742a4c7931848f4a\",locators:{commands:{posx:0f,posy:0f,posz:0f,rotx:0f,roty:0f}},cameras:{},bones:{data_data:\"\",bone_chest_lid:\"\",bone_chest:\"\",bone_hand_left:\"\",bone_water_gun:\"\",bone_hand_right:\"\",bone_eyebrow_left:\"\",bone_eyebrow_right:\"\",bone_head:\"\",bone_muzzle_flash_frame1:\"\",bone_muzzle_flash_frame2:\"\"}}},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.chest_mob.bone\",\"aj.chest_mob.bone.chest_lid\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":39},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.chest_mob.bone\",\"aj.chest_mob.bone.chest\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":38},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.chest_mob.bone\",\"aj.chest_mob.bone.hand_left\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":40},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.chest_mob.bone\",\"aj.chest_mob.bone.water_gun\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":42},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.chest_mob.bone\",\"aj.chest_mob.bone.hand_right\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":41},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.chest_mob.bone\",\"aj.chest_mob.bone.eyebrow_left\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":44},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.chest_mob.bone\",\"aj.chest_mob.bone.eyebrow_right\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":45},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.chest_mob.bone\",\"aj.chest_mob.bone.head\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":43},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.chest_mob.bone\",\"aj.chest_mob.bone.muzzle_flash_frame1\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":46},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.chest_mob.bone\",\"aj.chest_mob.bone.muzzle_flash_frame2\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":47},count:1},height:48f,width:48f}], }"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/zzz/0"), Control.as("@e[type=item_display,tag=aj.new,limit=1,distance=..0.01]")));
        return 1;
    }
    // animated_java:chest_mob/variants/chest/apply
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'chest_mob', 'function_path': 'animated_java:chest_mob/variants/chest/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.chest_mob.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/chest/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.chest_lid]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/chest/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.chest]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/chest/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.hand_left]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/chest/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.water_gun]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/chest/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.hand_right]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/chest/zzz/5"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.eyebrow_left]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/chest/zzz/6"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.eyebrow_right]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/chest/zzz/7"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/chest/zzz/8"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.muzzle_flash_frame1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:chest_mob/variants/chest/zzz/9"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.chest_mob.bone.muzzle_flash_frame2]")));
        return 1;
    }
    // animated_java:chest_mob/variants/chest/zzz/0
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "144"));
        return 1;
    }
    // animated_java:chest_mob/variants/chest/zzz/1
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "145"));
        return 1;
    }
    // animated_java:chest_mob/variants/chest/zzz/2
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "146"));
        return 1;
    }
    // animated_java:chest_mob/variants/chest/zzz/3
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "147"));
        return 1;
    }
    // animated_java:chest_mob/variants/chest/zzz/4
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "148"));
        return 1;
    }
    // animated_java:chest_mob/variants/chest/zzz/5
    private static int f19(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "149"));
        return 1;
    }
    // animated_java:chest_mob/variants/chest/zzz/6
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "150"));
        return 1;
    }
    // animated_java:chest_mob/variants/chest/zzz/7
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "151"));
        return 1;
    }
    // animated_java:chest_mob/variants/chest/zzz/8
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "152"));
        return 1;
    }
    // animated_java:chest_mob/variants/chest/zzz/9
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "153"));
        return 1;
    }
}
