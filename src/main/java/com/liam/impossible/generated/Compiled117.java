package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled117 {
    public static void register() {
        Logic.register("animated_java:impossible_dragon/zzz/11", Compiled117::f0);
        Logic.register("animated_java:impossible_dragon/zzz/12", Compiled117::f1);
        Logic.register("animated_java:impossible_dragon/zzz/13", Compiled117::f2, "variant");
        Logic.register("animated_java:impossible_dragon/zzz/14", Compiled117::f3, "variant");
        Logic.register("animated_java:impossible_dragon/zzz/15", Compiled117::f4);
        Logic.register("animated_java:impossible_dragon/zzz/16", Compiled117::f5);
        Logic.register("animated_java:impossible_dragon/zzz/17", Compiled117::f6);
        Logic.register("animated_java:impossible_dragon/zzz/18", Compiled117::f7, "animation");
        Logic.register("animated_java:impossible_dragon/zzz/19", Compiled117::f8, "animation");
        Logic.register("animated_java:impossible_dragon/zzz/2", Compiled117::f9);
        Logic.register("animated_java:impossible_dragon/zzz/20", Compiled117::f10, "animation");
        Logic.register("animated_java:impossible_dragon/zzz/21", Compiled117::f11);
        Logic.register("animated_java:impossible_dragon/zzz/3", Compiled117::f12);
        Logic.register("animated_java:impossible_dragon/zzz/4", Compiled117::f13);
        Logic.register("animated_java:impossible_dragon/zzz/5", Compiled117::f14);
        Logic.register("animated_java:impossible_dragon/zzz/6", Compiled117::f15);
        Logic.register("animated_java:impossible_dragon/zzz/7", Compiled117::f16);
        Logic.register("animated_java:impossible_dragon/zzz/8", Compiled117::f17);
        Logic.register("animated_java:impossible_dragon/zzz/9", Compiled117::f18);
        Logic.register("animated_java:land_shark/animations/idle/apply_frame", Compiled117::f20, "frame");
        Logic.register("animated_java:land_shark/animations/idle/next_frame", Compiled117::f21);
        Logic.register("animated_java:land_shark/animations/idle/pause", Compiled117::f22);
        Logic.register("animated_java:land_shark/animations/idle/play", Compiled117::f23);
    }
    // animated_java:impossible_dragon/zzz/11
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:impossible_dragon/zzz/12")), Control.when("data", "storage", "aj:temp", "{args:{variant:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/13", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:impossible_dragon/zzz/14", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/12
    private static int f1(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"impossible_dragon\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"variant\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/remove/this"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/13
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/variants/$(variant)/apply"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:impossible_dragon/zzz/14
    private static int f3(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"impossible_dragon\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The variant \",\"color\":\"red\"},{\"text\":\"$(variant)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Variants:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"default\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"red\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"half_red\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"tail_disabled\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"2_heads\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"tail_enabled\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"1_head\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"stunned\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"not_stunned\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"eyes_closed\",\"color\":\"yellow\"}],[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/remove/this"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/15
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:impossible_dragon/zzz/16")), Control.when("data", "storage", "aj:temp", "{args:{animation:''}}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "storage", "aj:temp", "args.frame"), Control.store("result", "storage", "aj:temp", "args.frame", "int", "1"), Control.store("result", "score", "#frame", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:impossible_dragon/zzz/17")), Control.when("score", "#frame", "aj.i", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/18", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:impossible_dragon/zzz/19", "with", "storage", "aj:temp", "args")), Control.unless("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/zzz/20", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "{args:{start_animation: 1b}}")));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/16
    private static int f5(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"impossible_dragon\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"animation\",\"color\":\"yellow\"},{\"text\":\" cannot be an empty string.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/remove/this"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/17
    private static int f6(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"impossible_dragon\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"frame\",\"color\":\"yellow\"},{\"text\":\" must be a non-negative integer.\",\"color\":\"red\"},[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/remove/this"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/18
    private static int f7(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/$(animation)/set_frame", "with", "storage", "aj:temp", "args"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "#success", "aj.i", "matches", "1")));
        Logic.step(() -> Logic.returnFailed());
        return 1;
    }
    // animated_java:impossible_dragon/zzz/19
    private static int f8(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"impossible_dragon\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The animation \",\"color\":\"red\"},{\"text\":\"$(animation)\",\"color\":\"yellow\"},{\"text\":\" does not exist.\",\"color\":\"red\"},\"\\n \",{\"text\":\" \u2261 \",\"color\":\"white\"},{\"text\":\"Available Animations:\",\"color\":\"green\"},[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"fly\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"die\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"hover\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"recharge_crystals\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"laser\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"shoot_fireball\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"tail_slam\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"stun_activate\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"stun_loop\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"sleeping\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"wake_up\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"stun_loop_heads_up\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"stun_loop_heads_super_up\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"stun_loop_heads_down\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"heal\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"heal_long\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"heal_super_long\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"thumbnail\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"thumbnail2\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"dash\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"lightning\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"tower_climb\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"forcefield_loop\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"forcefield_bite\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"forcefield_land\",\"color\":\"yellow\"}],[\"\\n \",\" \",\" \",{\"text\":\" \u25cf \",\"color\":\"gray\"},{\"text\":\"thumbnail3\",\"color\":\"yellow\"}],[\"\\n\"]]"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/remove/this"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/2
    private static int f9(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{PersistenceRequired:1,Invulnerable:0,NoGravity:1,Silent:1,NoAI:1,Health:1024,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b},{id:\"minecraft:resistance\",amplifier:3,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],attributes:[{id:\"minecraft:generic.max_health\",base:1024},{id:\"minecraft:generic.scale\",base:5f}],DeathLootTable:\"\"}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.big"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.body"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/20
    private static int f10(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/$(animation)/resume"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/21
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.commands.uuid"));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.body_hitbox_locator.uuid"));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.head_middle_locator.uuid"));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.head_hitbox_middle_locator.uuid"));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.head_right_locator.uuid"));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.head_hitbox_right_locator.uuid"));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.head_left_locator.uuid"));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.head_hitbox_left_locator.uuid"));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.tail_locator.uuid"));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "uuid", "set", "from", "entity", "@s", "data.locators.tail_end_hitbox_locator.uuid"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/3
    private static int f12(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/4
    private static int f13(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{PersistenceRequired:1,Invulnerable:0,NoGravity:1,Silent:1,NoAI:1,Health:1024,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b},{id:\"minecraft:resistance\",amplifier:3,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],attributes:[{id:\"minecraft:generic.max_health\",base:1024},{id:\"minecraft:generic.scale\",base:1.4f}],DeathLootTable:\"\"}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.small"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.head"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.head.middle"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.weakpoint"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/5
    private static int f14(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/6
    private static int f15(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{PersistenceRequired:1,Invulnerable:0,NoGravity:1,Silent:1,NoAI:1,Health:1024,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b},{id:\"minecraft:resistance\",amplifier:3,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],attributes:[{id:\"minecraft:generic.max_health\",base:1024},{id:\"minecraft:generic.scale\",base:1.4f}],DeathLootTable:\"\"}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.small"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.head"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.head.right"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.weakpoint"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/7
    private static int f16(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/8
    private static int f17(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{PersistenceRequired:1,Invulnerable:0,NoGravity:1,Silent:1,NoAI:1,Health:1024,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b},{id:\"minecraft:resistance\",amplifier:3,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],attributes:[{id:\"minecraft:generic.max_health\",base:1024},{id:\"minecraft:generic.scale\",base:1.4f}],DeathLootTable:\"\"}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.small"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.head"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.head.left"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.weakpoint"));
        return 1;
    }
    // animated_java:impossible_dragon/zzz/9
    private static int f18(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        return 1;
    }
    // animated_java:land_shark/animations/idle/apply_frame
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/animations/idle/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.idle.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/idle/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:land_shark/animations/idle/next_frame
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/animations/idle/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.idle.frame", "1"), Control.when("score", "@s", "aj.idle.frame", "matches", "21..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.idle.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/idle/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.idle.frame", "1"));
        return 1;
    }
    // animated_java:land_shark/animations/idle/pause
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/animations/idle/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.land_shark.animation.idle.playing"));
        return 1;
    }
    // animated_java:land_shark/animations/idle/play
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/animations/idle/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.land_shark.animation.idle.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.idle.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/idle/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
}
