package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled040 {
    public static void register() {
        Logic.register("animated_java:flying_book/root/outdated_tellraw", Compiled040::f0, "x", "y", "z");
        Logic.register("animated_java:flying_book/root/zzz/0", Compiled040::f1);
        Logic.register("animated_java:flying_book/set_default_pose", Compiled040::f2);
        Logic.register("animated_java:flying_book/summon/default", Compiled040::f3);
        Logic.register("animated_java:flying_book/summon/red", Compiled040::f4);
        Logic.register("animated_java:flying_book/summon", Compiled040::f5, "args");
        Logic.register("animated_java:flying_book/variants/default/apply", Compiled040::f6);
        Logic.register("animated_java:flying_book/variants/default/zzz/0", Compiled040::f7);
        Logic.register("animated_java:flying_book/variants/default/zzz/1", Compiled040::f8);
        Logic.register("animated_java:flying_book/variants/default/zzz/2", Compiled040::f9);
        Logic.register("animated_java:flying_book/variants/red/apply", Compiled040::f10);
        Logic.register("animated_java:flying_book/variants/red/zzz/0", Compiled040::f11);
        Logic.register("animated_java:flying_book/variants/red/zzz/1", Compiled040::f12);
        Logic.register("animated_java:flying_book/variants/red/zzz/2", Compiled040::f13);
        Logic.register("animated_java:flying_book/zzz/0", Compiled040::f14);
        Logic.register("animated_java:flying_book/zzz/1", Compiled040::f15);
        Logic.register("animated_java:flying_book/zzz/10", Compiled040::f16, "animation");
        Logic.register("animated_java:flying_book/zzz/11", Compiled040::f17, "animation");
        Logic.register("animated_java:flying_book/zzz/2", Compiled040::f18);
        Logic.register("animated_java:flying_book/zzz/3", Compiled040::f19);
        Logic.register("animated_java:flying_book/zzz/4", Compiled040::f20, "variant");
        Logic.register("animated_java:flying_book/zzz/5", Compiled040::f21, "variant");
        Logic.register("animated_java:flying_book/zzz/6", Compiled040::f22);
        Logic.register("animated_java:flying_book/zzz/7", Compiled040::f23);
    }
    // animated_java:flying_book/root/outdated_tellraw
    private static int f0(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"flying_book\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The \",\"color\":\"red\"},{\"text\":\"flying_book\",\"color\":\"yellow\"},{\"text\":\" rig instance at\",\"color\":\"red\"},[{\"text\":\" [\",\"color\":\"yellow\"},{\"score\":{\"name\":\"#this.x\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.y\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.z\",\"objective\":\"aj.i\"}},\"]\"],{\"text\":\" is outdated! It will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"},\"\\n \",{\"text\":\"[Click Here to Teleport to the Rig Instance]\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/tp @s $(x) $(y) $(z)\"},\"color\":\"aqua\",\"underlined\":true},[\"\\n\"]]"));
        return 1;
    }
    // animated_java:flying_book/root/zzz/0
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1"), Control.store("result", "storage", "aj:temp", "x", "int", "1"), Control.store("result", "score", "#this.x", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1"), Control.store("result", "storage", "aj:temp", "y", "int", "1"), Control.store("result", "score", "#this.y", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1"), Control.store("result", "storage", "aj:temp", "z", "int", "1"), Control.store("result", "score", "#this.z", "aj.i")));
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/root/outdated_tellraw", "with", "storage", "aj:temp"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.rigHash", "set", "value", "'bd54bbb4f724c7395361e72dcba4c644b3e9991cf94d60d99997946eeda74191'"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{Glowing: 1b, glow_color_override: 16711680}"), Control.on("passengers")));
        Logic.step(() -> Native.summon(c, "minecraft:text_display", "~", "~", "~", "{Tags:['aj.rig_entity', 'aj.outdated_rig_text_display', 'aj.new'], text:'[\"\",{\"text\":\"This rig instance is outdated!\\\\nIt will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"}]', billboard: \"vertical\", transformation:{translation:[0f,3f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[1f,1f,1f]}}"));
        Logic.step(() -> Native.ride(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "mount", "@s"));
        Logic.step(() -> Native.tag(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "remove", "aj.new"));
        return 1;
    }
    // animated_java:flying_book/set_default_pose
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/set_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.046875f,0f,1f,0f,0.078125f,-1.2246467991473532e-16f,0f,-1f,5.740531871003218e-18f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.right_half]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.046875f,0f,1f,0f,0.078125f,-1.2246467991473532e-16f,0f,-1f,-5.740531871003218e-18f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.left_half]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,0.0625f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.root]")));
        return 1;
    }
    // animated_java:flying_book/summon/default
    private static int f3(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/summon", "{args:{variant: 'default'}}"));
        return 1;
    }
    // animated_java:flying_book/summon/red
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/summon", "{args:{variant: 'red'}}"));
        return 1;
    }
    // animated_java:flying_book/summon
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "args", "set", "value", "{variant:'', animation:'', frame: 0}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "aj:temp", "args", "set", "value", "$(args)"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.summon(c, "minecraft:item_display", "~", "~", "~", "{ Tags:['aj.new','aj.rig_entity','aj.rig_root','aj.flying_book.root'], teleport_duration: 0, interpolation_duration: 2, Passengers:[{id:\"minecraft:marker\",Tags:[\"aj.rig_entity\",\"aj.data\",\"aj.flying_book.data\"],data:{rigHash:\"bd54bbb4f724c7395361e72dcba4c644b3e9991cf94d60d99997946eeda74191\",locators:{},cameras:{},bones:{data_data:\"\",bone_right_half:\"\",bone_left_half:\"\",bone_root:\"\"}}},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.flying_book.bone\",\"aj.flying_book.bone.right_half\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:light_gray_dye\",components:{\"minecraft:custom_model_data\":3},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.flying_book.bone\",\"aj.flying_book.bone.left_half\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:light_gray_dye\",components:{\"minecraft:custom_model_data\":4},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.flying_book.bone\",\"aj.flying_book.bone.root\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:light_gray_dye\",components:{\"minecraft:custom_model_data\":2},count:1},height:48f,width:48f}], }"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/zzz/0"), Control.as("@e[type=item_display,tag=aj.new,limit=1,distance=..0.01]")));
        return 1;
    }
    // animated_java:flying_book/variants/default/apply
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/variants/default/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/variants/default/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.right_half]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/variants/default/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.left_half]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/variants/default/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.root]")));
        return 1;
    }
    // animated_java:flying_book/variants/default/zzz/0
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "3"));
        return 1;
    }
    // animated_java:flying_book/variants/default/zzz/1
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "4"));
        return 1;
    }
    // animated_java:flying_book/variants/default/zzz/2
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "2"));
        return 1;
    }
    // animated_java:flying_book/variants/red/apply
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/variants/red/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/variants/red/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.right_half]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/variants/red/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.left_half]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/variants/red/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.root]")));
        return 1;
    }
    // animated_java:flying_book/variants/red/zzz/0
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "5"));
        return 1;
    }
    // animated_java:flying_book/variants/red/zzz/1
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "6"));
        return 1;
    }
    // animated_java:flying_book/variants/red/zzz/2
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "7"));
        return 1;
    }
    // animated_java:flying_book/zzz/0
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/zzz/2", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/zzz/6", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:flying_book/as_root/on_summon"));
        return 1;
    }
    // animated_java:flying_book/zzz/1
    private static int f15(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.right_half]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_right_half", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.left_half]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_left_half", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.root]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_root", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // animated_java:flying_book/zzz/10
    private static int f16(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"flying_book\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"flying\",\"color\":\"yellow\"}],[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/remove/this"));
        return 1;
    }
    // animated_java:flying_book/zzz/11
    private static int f17(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/animations/$(animation)/resume"));
        return 1;
    }
    // animated_java:flying_book/zzz/2
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:flying_book/zzz/3")), Control.when("data", "storage", "aj:temp", "{args:{variant:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/zzz/4", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:flying_book/zzz/5", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        return 1;
    }
    // animated_java:flying_book/zzz/3
    private static int f19(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"flying_book\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"variant\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/remove/this"));
        return 1;
    }
    // animated_java:flying_book/zzz/4
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/variants/$(variant)/apply"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:flying_book/zzz/5
    private static int f21(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"flying_book\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The variant \",\"color\":\"red\"},{\"text\":\"$(variant)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Variants:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"default\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"red\",\"color\":\"yellow\"}],[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/remove/this"));
        return 1;
    }
    // animated_java:flying_book/zzz/6
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:flying_book/zzz/7")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:flying_book/zzz/8")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/zzz/9", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:flying_book/zzz/10", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/zzz/11", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:flying_book/zzz/7
    private static int f23(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"flying_book\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/remove/this"));
        return 1;
    }
}
