package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled140 {
    public static void register() {
        Logic.register("animated_java:mutant_spider/variants/red/zzz/4", Compiled140::f0);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/5", Compiled140::f1);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/6", Compiled140::f2);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/7", Compiled140::f3);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/8", Compiled140::f4);
        Logic.register("animated_java:mutant_spider/variants/red/zzz/9", Compiled140::f5);
        Logic.register("animated_java:mutant_spider/zzz/0", Compiled140::f6);
        Logic.register("animated_java:mutant_spider/zzz/1", Compiled140::f7);
        Logic.register("animated_java:mutant_spider/zzz/10", Compiled140::f8, "animation");
        Logic.register("animated_java:mutant_spider/zzz/11", Compiled140::f9, "animation");
        Logic.register("animated_java:mutant_spider/zzz/2", Compiled140::f10);
        Logic.register("animated_java:mutant_spider/zzz/3", Compiled140::f11);
        Logic.register("animated_java:mutant_spider/zzz/4", Compiled140::f12, "variant");
        Logic.register("animated_java:mutant_spider/zzz/5", Compiled140::f13, "variant");
        Logic.register("animated_java:mutant_spider/zzz/6", Compiled140::f14);
        Logic.register("animated_java:mutant_spider/zzz/7", Compiled140::f15);
        Logic.register("animated_java:mutant_spider/zzz/8", Compiled140::f16);
        Logic.register("animated_java:mutant_spider/zzz/9", Compiled140::f17, "animation");
        Logic.register("animated_java:sculk_hand/animations/grab/apply_frame", Compiled140::f18, "frame");
        Logic.register("animated_java:sculk_hand/animations/grab/next_frame", Compiled140::f19);
        Logic.register("animated_java:sculk_hand/animations/grab/pause", Compiled140::f20);
        Logic.register("animated_java:sculk_hand/animations/grab/play", Compiled140::f21);
        Logic.register("animated_java:sculk_hand/animations/grab/resume", Compiled140::f22);
        Logic.register("animated_java:sculk_hand/animations/grab/set_frame", Compiled140::f23, "frame");
    }
    // animated_java:mutant_spider/variants/red/zzz/4
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "27"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/5
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "28"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/6
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "29"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/7
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "30"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/8
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "31"));
        return 1;
    }
    // animated_java:mutant_spider/variants/red/zzz/9
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.minecraft:custom_model_data", "set", "value", "32"));
        return 1;
    }
    // animated_java:mutant_spider/zzz/0
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/zzz/2", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/zzz/6", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:mutant_spider/as_root/on_summon"));
        return 1;
    }
    // animated_java:mutant_spider/zzz/1
    private static int f7(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.pincer_left]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_pincer_left", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.pincer_right]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_pincer_right", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.head]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_head", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.neck]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_neck", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.body]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_body", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg1]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg1", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg12]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg12", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg13]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg13", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg14]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg14", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg15]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg15", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg2]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg2", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg9]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg9", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg10]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg10", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg11]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg11", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg16]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg16", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg3]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg3", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg4]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg4", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg5]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg5", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg6]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg6", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg7]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg7", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.mutant_spider.bone.leg8]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_leg8", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // animated_java:mutant_spider/zzz/10
    private static int f8(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"mutant_spider\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"walk\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"idle\",\"color\":\"yellow\"}],[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/remove/this"));
        return 1;
    }
    // animated_java:mutant_spider/zzz/11
    private static int f9(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/animations/$(animation)/resume"));
        return 1;
    }
    // animated_java:mutant_spider/zzz/2
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:mutant_spider/zzz/3")), Control.when("data", "storage", "aj:temp", "{args:{variant:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/zzz/4", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:mutant_spider/zzz/5", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        return 1;
    }
    // animated_java:mutant_spider/zzz/3
    private static int f11(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"mutant_spider\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"variant\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/remove/this"));
        return 1;
    }
    // animated_java:mutant_spider/zzz/4
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/variants/$(variant)/apply"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:mutant_spider/zzz/5
    private static int f13(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"mutant_spider\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The variant \",\"color\":\"red\"},{\"text\":\"$(variant)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Variants:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"default\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"red\",\"color\":\"yellow\"}],[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/remove/this"));
        return 1;
    }
    // animated_java:mutant_spider/zzz/6
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:mutant_spider/zzz/7")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:mutant_spider/zzz/8")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/zzz/9", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:mutant_spider/zzz/10", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/zzz/11", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:mutant_spider/zzz/7
    private static int f15(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"mutant_spider\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/remove/this"));
        return 1;
    }
    // animated_java:mutant_spider/zzz/8
    private static int f16(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"mutant_spider\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:mutant_spider/remove/this"));
        return 1;
    }
    // animated_java:mutant_spider/zzz/9
    private static int f17(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:mutant_spider/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:sculk_hand/animations/grab/apply_frame
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/animations/grab/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.grab.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/animations/grab/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:sculk_hand/animations/grab/next_frame
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/animations/grab/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.grab.frame", "1"), Control.when("score", "@s", "aj.grab.frame", "matches", "23..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.grab.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/animations/grab/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.grab.frame", "1"));
        return 1;
    }
    // animated_java:sculk_hand/animations/grab/pause
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/animations/grab/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.sculk_hand.animation.grab.playing"));
        return 1;
    }
    // animated_java:sculk_hand/animations/grab/play
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/animations/grab/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.sculk_hand.animation.grab.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.grab.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/animations/grab/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:sculk_hand/animations/grab/resume
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/animations/grab/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.sculk_hand.animation.grab.playing"));
        return 1;
    }
    // animated_java:sculk_hand/animations/grab/set_frame
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/animations/grab/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.grab.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/animations/grab/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
}
