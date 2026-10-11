package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled038 {
    public static void register() {
        Logic.register("animated_java:crafting_table_table/zzz/10", Compiled038::f0);
        Logic.register("animated_java:crafting_table_table/zzz/11", Compiled038::f1);
        Logic.register("animated_java:crafting_table_table/zzz/12", Compiled038::f2, "animation");
        Logic.register("animated_java:crafting_table_table/zzz/13", Compiled038::f3, "animation");
        Logic.register("animated_java:crafting_table_table/zzz/14", Compiled038::f4, "animation");
        Logic.register("animated_java:crafting_table_table/zzz/15", Compiled038::f5);
        Logic.register("animated_java:crafting_table_table/zzz/2", Compiled038::f6);
        Logic.register("animated_java:crafting_table_table/zzz/3", Compiled038::f7);
        Logic.register("animated_java:crafting_table_table/zzz/4", Compiled038::f8);
        Logic.register("animated_java:crafting_table_table/zzz/5", Compiled038::f9);
        Logic.register("animated_java:crafting_table_table/zzz/6", Compiled038::f10);
        Logic.register("animated_java:crafting_table_table/zzz/7", Compiled038::f11, "variant");
        Logic.register("animated_java:crafting_table_table/zzz/8", Compiled038::f12, "variant");
        Logic.register("animated_java:crafting_table_table/zzz/9", Compiled038::f13);
        Logic.register("animated_java:flying_book/animations/flying/apply_frame", Compiled038::f15, "frame");
        Logic.register("animated_java:flying_book/animations/flying/next_frame", Compiled038::f16);
        Logic.register("animated_java:flying_book/animations/flying/pause", Compiled038::f17);
        Logic.register("animated_java:flying_book/animations/flying/play", Compiled038::f18);
        Logic.register("animated_java:flying_book/animations/flying/resume", Compiled038::f19);
        Logic.register("animated_java:flying_book/animations/flying/set_frame", Compiled038::f20, "frame");
        Logic.register("animated_java:flying_book/animations/flying/stop", Compiled038::f21);
        Logic.register("animated_java:flying_book/animations/flying/tween", Compiled038::f22, "duration", "to_frame");
        Logic.register("animated_java:flying_book/animations/flying/zzz/apply_frame", Compiled038::f23, "frame");
    }
    // animated_java:crafting_table_table/zzz/10
    private static int f0(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_table/remove/this"));
        return 1;
    }
    // animated_java:crafting_table_table/zzz/11
    private static int f1(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_table/remove/this"));
        return 1;
    }
    // animated_java:crafting_table_table/zzz/12
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_table/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:crafting_table_table/zzz/13
    private static int f3(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"transform\",\"color\":\"yellow\"}]]"));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_table/remove/this"));
        return 1;
    }
    // animated_java:crafting_table_table/zzz/14
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_table/animations/$(animation)/resume"));
        return 1;
    }
    // animated_java:crafting_table_table/zzz/15
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.commands.uuid"));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.sawblade_locator_1.uuid"));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.sawblade_locator_2.uuid"));
        return 1;
    }
    // animated_java:crafting_table_table/zzz/2
    private static int f6(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        return 1;
    }
    // animated_java:crafting_table_table/zzz/3
    private static int f7(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.sawblade_locator"));
        return 1;
    }
    // animated_java:crafting_table_table/zzz/4
    private static int f8(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.sawblade_locator"));
        return 1;
    }
    // animated_java:crafting_table_table/zzz/5
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:crafting_table_table/zzz/6")), Control.when("data", "storage", "aj:temp", "{args:{variant:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_table/zzz/7", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:crafting_table_table/zzz/8", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        return 1;
    }
    // animated_java:crafting_table_table/zzz/6
    private static int f10(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"variant\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"}]"));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_table/remove/this"));
        return 1;
    }
    // animated_java:crafting_table_table/zzz/7
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_table/variants/$(variant)/apply"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:crafting_table_table/zzz/8
    private static int f12(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The variant \",\"color\":\"red\"},{\"text\":\"$(variant)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Variants:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"default\",\"color\":\"yellow\"}]]"));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_table/remove/this"));
        return 1;
    }
    // animated_java:crafting_table_table/zzz/9
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:crafting_table_table/zzz/10")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:crafting_table_table/zzz/11")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_table/zzz/12", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:crafting_table_table/zzz/13", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_table/zzz/14", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:flying_book/animations/flying/apply_frame
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/animations/flying/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.flying.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/animations/flying/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:flying_book/animations/flying/next_frame
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/animations/flying/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.flying.frame", "1"), Control.when("score", "@s", "aj.flying.frame", "matches", "13..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.flying.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/animations/flying/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.flying.frame", "1"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/pause
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/animations/flying/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.flying_book.animation.flying.playing"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/play
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/animations/flying/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.flying_book.animation.flying.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.flying.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/animations/flying/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/resume
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/animations/flying/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.flying_book.animation.flying.playing"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/set_frame
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/animations/flying/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.flying.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/animations/flying/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:flying_book/animations/flying/stop
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/animations/flying/stop'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.flying_book.animation.flying.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.flying.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/animations/flying/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/tween
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/animations/flying/tween'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/animations/pause_all"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.flying_book.animation.flying.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tween_duration", "$(duration)"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.flying.frame", "$(to_frame)"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.i", "=", "@s", "aj.tween_duration"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/animations/flying/zzz/apply_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/animations/flying/zzz/apply_frame", "{frame: $(to_frame)}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#this", "aj.i"), Control.on("passengers"), Control.store("result", "entity", "@s", "interpolation_duration", "int", "1")));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/apply_frame
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/animations/flying/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        return 1;
    }
}
