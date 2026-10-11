package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled105 {
    public static void register() {
        Logic.register("animated_java:impossible_dragon/root/on_load", Compiled105::f0);
        Logic.register("animated_java:impossible_dragon/root/on_tick", Compiled105::f1);
        Logic.register("animated_java:impossible_dragon/root/outdated_tellraw", Compiled105::f2, "x", "y", "z");
        Logic.register("animated_java:impossible_dragon/root/zzz/0", Compiled105::f3);
        Logic.register("animated_java:impossible_dragon/root/zzz/1", Compiled105::f4);
        Logic.register("animated_java:impossible_dragon/root/zzz/10", Compiled105::f5, "posx", "posy", "posz", "rotx", "roty", "uuid");
        Logic.register("animated_java:impossible_dragon/root/zzz/11", Compiled105::f6);
        Logic.register("animated_java:impossible_dragon/root/zzz/12", Compiled105::f7, "posx", "posy", "posz", "rotx", "roty", "uuid");
        Logic.register("animated_java:impossible_dragon/root/zzz/13", Compiled105::f8);
        Logic.register("animated_java:impossible_dragon/root/zzz/14", Compiled105::f9, "posx", "posy", "posz", "rotx", "roty", "uuid");
        Logic.register("animated_java:impossible_dragon/root/zzz/15", Compiled105::f10);
        Logic.register("animated_java:impossible_dragon/root/zzz/16", Compiled105::f11, "posx", "posy", "posz", "rotx", "roty", "uuid");
        Logic.register("animated_java:impossible_dragon/root/zzz/17", Compiled105::f12);
        Logic.register("animated_java:impossible_dragon/root/zzz/18", Compiled105::f13, "posx", "posy", "posz", "rotx", "roty", "uuid");
        Logic.register("animated_java:impossible_dragon/root/zzz/19", Compiled105::f14);
        Logic.register("animated_java:impossible_dragon/root/zzz/2", Compiled105::f15, "posx", "posy", "posz", "rotx", "roty", "uuid");
        Logic.register("animated_java:impossible_dragon/root/zzz/3", Compiled105::f16);
        Logic.register("animated_java:impossible_dragon/root/zzz/4", Compiled105::f17, "posx", "posy", "posz", "rotx", "roty", "uuid");
        Logic.register("animated_java:impossible_dragon/root/zzz/5", Compiled105::f18);
        Logic.register("animated_java:impossible_dragon/root/zzz/6", Compiled105::f19, "posx", "posy", "posz", "rotx", "roty", "uuid");
        Logic.register("animated_java:impossible_dragon/root/zzz/7", Compiled105::f20);
        Logic.register("animated_java:impossible_dragon/root/zzz/8", Compiled105::f21, "posx", "posy", "posz", "rotx", "roty", "uuid");
        Logic.register("animated_java:impossible_dragon/root/zzz/9", Compiled105::f22);
        Logic.register("animated_java:impossible_dragon/set_default_pose", Compiled105::f23);
    }
    // animated_java:impossible_dragon/root/on_load
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/root/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.data]"), Control.unless("data", "entity", "@s", "{data:{rigHash: '642e98eb46bfb59b0774029a93648c5bc1fa5c7d756e8193a23b4d94e29072fe'}}"), Control.on("vehicle")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.is_rig_loaded", "1"));
        return 1;
    }
    // animated_java:impossible_dragon/root/on_tick
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "#animated_java:global/root/on_load"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1")));
        Logic.step(() -> Logic.call(c, "#animated_java:impossible_dragon/as_root/pre_tick"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/fly/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.fly.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/die/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.die.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/hover/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.hover.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/recharge_crystals/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.recharge_crystals.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/laser/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.laser.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/shoot_fireball/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.shoot_fireball.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/tail_slam/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.tail_slam.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/stun_activate/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.stun_activate.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/stun_loop/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.stun_loop.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/sleeping/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.sleeping.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/wake_up/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.wake_up.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/stun_loop_heads_up/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.stun_loop_heads_up.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/stun_loop_heads_super_up/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.stun_loop_heads_super_up.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/stun_loop_heads_down/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.stun_loop_heads_down.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/heal/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.heal.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/heal_long/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.heal_long.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/heal_super_long/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.heal_super_long.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.thumbnail.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail2/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.thumbnail2.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/dash/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.dash.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/lightning/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.lightning.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/tower_climb/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.tower_climb.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/forcefield_loop/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.forcefield_loop.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/forcefield_bite/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.forcefield_bite.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/forcefield_land/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.forcefield_land.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail3/zzz/on_tick"), Control.when("entity", "@s[tag=aj.impossible_dragon.animation.thumbnail3.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/root/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:impossible_dragon/as_root/post_tick"));
        return 1;
    }
    // animated_java:impossible_dragon/root/outdated_tellraw
    private static int f2(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"impossible_dragon\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The \",\"color\":\"red\"},{\"text\":\"impossible_dragon\",\"color\":\"yellow\"},{\"text\":\" rig instance at\",\"color\":\"red\"},[{\"text\":\" [\",\"color\":\"yellow\"},{\"score\":{\"name\":\"#this.x\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.y\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.z\",\"objective\":\"aj.i\"}},\"]\"],{\"text\":\" is outdated! It will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"},\"\\n \",{\"text\":\"[Click Here to Teleport to the Rig Instance]\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/tp @s $(x) $(y) $(z)\"},\"color\":\"aqua\",\"underlined\":true},[\"\\n\"]]"));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/0
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1"), Control.store("result", "storage", "aj:temp", "x", "int", "1"), Control.store("result", "score", "#this.x", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1"), Control.store("result", "storage", "aj:temp", "y", "int", "1"), Control.store("result", "score", "#this.y", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1"), Control.store("result", "storage", "aj:temp", "z", "int", "1"), Control.store("result", "score", "#this.z", "aj.i")));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/root/outdated_tellraw", "with", "storage", "aj:temp"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.rigHash", "set", "value", "'642e98eb46bfb59b0774029a93648c5bc1fa5c7d756e8193a23b4d94e29072fe'"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{Glowing: 1b, glow_color_override: 16711680}"), Control.on("passengers")));
        Logic.step(() -> Native.summon(c, "minecraft:text_display", "~", "~", "~", "{Tags:['aj.rig_entity', 'aj.outdated_rig_text_display', 'aj.new'], text:'[\"\",{\"text\":\"This rig instance is outdated!\\\\nIt will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"}]', billboard: \"vertical\", transformation:{translation:[0f,3f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[1f,1f,1f]}}"));
        Logic.step(() -> Native.ride(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "mount", "@s"));
        Logic.step(() -> Native.tag(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "remove", "aj.new"));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/1
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/root/zzz/2", "with", "entity", "@s", "data.locators.body_hitbox_locator"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/root/zzz/4", "with", "entity", "@s", "data.locators.head_middle_locator"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/root/zzz/6", "with", "entity", "@s", "data.locators.head_hitbox_middle_locator"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/root/zzz/8", "with", "entity", "@s", "data.locators.head_right_locator"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/root/zzz/10", "with", "entity", "@s", "data.locators.head_hitbox_right_locator"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/root/zzz/12", "with", "entity", "@s", "data.locators.head_left_locator"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/root/zzz/14", "with", "entity", "@s", "data.locators.head_hitbox_left_locator"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/root/zzz/16", "with", "entity", "@s", "data.locators.tail_locator"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/root/zzz/18", "with", "entity", "@s", "data.locators.tail_end_hitbox_locator"));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/10
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/root/zzz/11"), Control.as("$(uuid)"), Control.positioned("^$(posx)", "^$(posy)", "^$(posz)"), Control.rotated("~$(roty)", "~$(rotx)")));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/11
    private static int f6(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/12
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/root/zzz/13"), Control.as("$(uuid)"), Control.positioned("^$(posx)", "^$(posy)", "^$(posz)"), Control.rotated("~$(roty)", "~$(rotx)")));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/13
    private static int f8(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/14
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/root/zzz/15"), Control.as("$(uuid)"), Control.positioned("^$(posx)", "^$(posy)", "^$(posz)"), Control.rotated("~$(roty)", "~$(rotx)")));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/15
    private static int f10(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/16
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/root/zzz/17"), Control.as("$(uuid)"), Control.positioned("^$(posx)", "^$(posy)", "^$(posz)"), Control.rotated("~$(roty)", "~$(rotx)")));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/17
    private static int f12(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/18
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/root/zzz/19"), Control.as("$(uuid)"), Control.positioned("^$(posx)", "^$(posy)", "^$(posz)"), Control.rotated("~$(roty)", "~$(rotx)")));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/19
    private static int f14(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/2
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/root/zzz/3"), Control.as("$(uuid)"), Control.positioned("^$(posx)", "^$(posy)", "^$(posz)"), Control.rotated("~$(roty)", "~$(rotx)")));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/3
    private static int f16(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/4
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/root/zzz/5"), Control.as("$(uuid)"), Control.positioned("^$(posx)", "^$(posy)", "^$(posz)"), Control.rotated("~$(roty)", "~$(rotx)")));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/5
    private static int f18(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/6
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/root/zzz/7"), Control.as("$(uuid)"), Control.positioned("^$(posx)", "^$(posy)", "^$(posz)"), Control.rotated("~$(roty)", "~$(rotx)")));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/7
    private static int f20(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/8
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/root/zzz/9"), Control.as("$(uuid)"), Control.positioned("^$(posx)", "^$(posy)", "^$(posz)"), Control.rotated("~$(roty)", "~$(rotx)")));
        return 1;
    }
    // animated_java:impossible_dragon/root/zzz/9
    private static int f22(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        return 1;
    }
    // animated_java:impossible_dragon/set_default_pose
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/set_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-2.481009666057066f,0.21706045933308776f,0.21788940755693953f,-4.236681437112642f,0.2522714725275923f,2.4493530257298675f,0.4324683335190039f,1.2404708496843042f,-0.17592652182137122f,0.4511701589667174f,-2.4526506776501584f,-0.4254107940434931f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_wing_tip]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-2.573502965487903f,2.464951132737692e-7f,0.2251523878088375f,-0.75f,0.03909753190984351f,2.544086719067565f,0.44688394463630404f,1.1875f,-0.22173177655591156f,0.44859099074221687f,-2.5344057002384974f,-0.125f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_wing]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-2.4526506096860983f,-0.432468718962304f,-0.2178894075569389f,4.236681437112642f,-0.46478668562049524f,2.4180455904248808f,0.4324683335190039f,1.2404708496843042f,0.1359349979818479f,0.4647863269782074f,-2.4526506776501584f,-0.4254107940434922f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_wing_tip]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-2.573502965487903f,-2.464951133836423e-7f,-0.22515238780883687f,0.75f,-0.03909753190984351f,2.544086719067565f,0.44688394463630404f,1.1875f,0.22173177655591092f,0.44859099074221687f,-2.5344057002384974f,-0.125f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_wing]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.2246467991473532e-16f,2.465190328815662e-32f,0.8125000000000002f,0f,2.7755575615628914e-16f,0.9999999999999999f,-0.7528269932937603f,-1.2246467991473532e-16f,0.9999999999999999f,-2.7755575615628914e-16f,-2.6513000272850427f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_left_foot]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.0605752387249068e-16f,6.123233995736767e-17f,0.8750000000000001f,0f,0.5000000000000001f,0.8660254037844385f,-0.034076993293760294f,-1.2246467991473532e-16f,0.8660254037844385f,-0.5000000000000001f,-1.4063885093449124f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_left_shin]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.195617780139768e-16f,2.6506208041798677e-17f,0.875f,0f,0.21643961393810307f,0.9762960071199333f,0.25f,-1.2246467991473532e-16f,0.9762960071199333f,-0.21643961393810307f,-0.125f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_left_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.2246467991473532e-16f,2.465190328815662e-32f,-0.8749999999999998f,0f,2.7755575615628914e-16f,0.9999999999999999f,-0.7528269932937603f,-1.2246467991473532e-16f,0.9999999999999999f,-2.7755575615628914e-16f,-2.6513000272850427f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_right_foot]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.0605752387249068e-16f,6.123233995736767e-17f,-0.8749999999999999f,0f,0.5000000000000001f,0.8660254037844385f,-0.034076993293760294f,-1.2246467991473532e-16f,0.8660254037844385f,-0.5000000000000001f,-1.4063885093449124f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_right_shin]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.195617780139768e-16f,2.6506208041798677e-17f,-0.875f,0f,0.21643961393810307f,0.9762960071199333f,0.25f,-1.2246467991473532e-16f,0.9762960071199333f,-0.21643961393810307f,-0.125f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.front_right_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-7.024285468436546e-17f,-1.0031719290535245e-16f,1.0000000000000009f,0f,-0.8191520442889916f,0.5735764363510465f,-0.26225952641916517f,-1.2246467991473532e-16f,0.5735764363510465f,0.8191520442889916f,-5.9362976320958225f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_left_foot]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.3333333333333333f,-1.6328623988631375e-16f,3.2869204384208823e-32f,1.0000000000000007f,0f,2.9605947323337506e-16f,1.3333333333333333f,-0.7622595264191647f,-1.6328623988631375e-16f,1.3333333333333333f,-2.9605947323337506e-16f,-4.0612976320958225f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_left_shin]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.3333333333333333f,-1.4141003182998756e-16f,8.164311994315689e-17f,1.0000000000000004f,0f,0.6666666666666667f,1.1547005383792515f,0.5f,-1.6328623988631375e-16f,1.1547005383792515f,-0.6666666666666667f,-2.625f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_left_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-7.024285468436546e-17f,-1.0031719290535245e-16f,-0.9999999999999992f,0f,-0.8191520442889916f,0.5735764363510465f,-0.26225952641916517f,-1.2246467991473532e-16f,0.5735764363510465f,0.8191520442889916f,-5.9362976320958225f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_right_foot]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.3333333333333333f,-1.6328623988631375e-16f,3.2869204384208823e-32f,-0.9999999999999994f,0f,2.9605947323337506e-16f,1.3333333333333333f,-0.7622595264191647f,-1.6328623988631375e-16f,1.3333333333333333f,-2.9605947323337506e-16f,-4.0612976320958225f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_right_shin]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.3333333333333333f,-1.4141003182998756e-16f,8.164311994315689e-17f,-0.9999999999999997f,0f,0.6666666666666667f,1.1547005383792515f,0.5f,-1.6328623988631375e-16f,1.1547005383792515f,-0.6666666666666667f,-2.625f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.back_right_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-7.024285468436542e-17f,1.0031719290535251e-16f,0.5406249999999996f,0f,0.8191520442889918f,0.573576436351046f,-0.06220811398978836f,-1.2246467991473532e-16f,0.573576436351046f,-0.8191520442889918f,4.19231971967682f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_left1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.1099069304367547e-16f,5.175581015019664e-17f,0.4781249999999995f,0f,0.42261826174069955f,0.9063077870366498f,0.08118599509797314f,-1.2246467991473532e-16f,0.9063077870366498f,-0.42261826174069955f,3.987531708604572f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_left2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.9961946971366885f,-1.7774266305277708e-8f,-0.08715575366400699f,-0.2906250000000005f,-0.07898994641497789f,0.4226182444899256f,0.9028590187784649f,0.13238299786603513f,0.036833595563022375f,0.9063077950808176f,-0.42101005547806863f,4.0233802358765125f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_right1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-7.024285468436542e-17f,1.0031719290535251e-16f,-0.3531250000000005f,0f,0.8191520442889918f,0.573576436351046f,-0.06220811398978836f,-1.2246467991473532e-16f,0.573576436351046f,-0.8191520442889918f,4.19231971967682f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.middle_feathers_right2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.0605752387249072e-16f,6.12323399573677e-17f,-5.162163684132449e-16f,0f,0.5f,0.8660254037844386f,-0.49259684600788317f,-1.2246467991473532e-16f,0.8660254037844386f,-0.5f,4.215226535296993f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.jaw_middle]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [0.7071067811865476f,-5.222182523036987e-17f,-0.7071067811865475f,-5.682806355680063e-16f,0.4055797876726388f,-0.8191520442889918f,0.40557978767263886f,0.6593888429449966f,-0.5792279653395692f,-0.573576436351046f,-0.5792279653395691f,4.64036353962355f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.stun_vfx_middle_head]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.25f,-8.780356835545678e-17f,1.2539649113169065e-16f,-4.836184856316601e-16f,0f,1.0239400553612397f,0.7169705454388076f,-0.0010206167601121696f,-1.5308084989341916e-16f,0.7169705454388076f,-1.0239400553612397f,3.9490446222402587f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.head_middle]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-4.686520405326298e-17f,1.1314261122877008e-16f,-4.0290386515855177e-16f,0f,0.9238795325112867f,0.3826834323650897f,0.20433177220893156f,-1.2246467991473532e-16f,0.3826834323650897f,-0.9238795325112867f,3.289959729115931f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-2.6506208041798652e-17f,1.1956177801397682e-16f,-3.2817775389981627e-16f,0f,0.9762960071199334f,0.21643961393810285f,0.33960653092024584f,-1.2246467991473532e-16f,0.21643961393810285f,-0.9762960071199334f,2.679774724665972f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.067350013832297e-17f,1.2199866483456202e-16f,-2.51928588378215e-16f,0f,0.9961946980917455f,0.08715574274765818f,0.39407887013753223f,-1.2246467991473532e-16f,0.08715574274765818f,-0.9961946980917455f,2.0571530383586314f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,3.0814879110195774e-33f,1.2246467991473532e-16f,-1.7538816343150546e-16f,0f,1f,0f,0.39407887013753223f,-1.2246467991473532e-16f,0f,-1f,1.4321530383586314f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,1.5984848350717833e-17f,1.2141697760125282e-16f,-9.950255243072243e-17f,0f,0.9914448613738104f,-0.13052619222005157f,0.3125f,-1.2246467991473532e-16f,-0.13052619222005157f,-0.9914448613738104f,0.8125f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_middle_1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,-0.23106541443336356f,0.25216368564557734f,-1.1838275832979817f,-0.044642543038322456f,0.8138339861879753f,0.5793800879185118f,-0.06406565864670156f,-0.3390940775901211f,0.5331819737933088f,-0.7750691513440434f,3.9907114014413274f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_left1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,-0.32619036165806103f,0.10284745046430163f,-1.1795174516279991f,-0.044642543038322456f,0.41511086254268476f,0.9086748676782803f,0.07798920439303124f,-0.3390940775901211f,0.8492837098169559f,-0.40463858785693313f,3.7757507337559337f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_left2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.9450805615254841f,-0.32619038031801895f,0.020556459195634286f,-1.9163477538494482f,-0.1236689156083709f,0.415110844453367f,0.9013262373466462f,0.0945348735690693f,-0.3025371572863823f,0.8492837114917479f,-0.4326528005871171f,3.54839603497061f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_right1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,-0.23106541443336356f,0.25216368564557734f,-2.023677876600169f,-0.044642543038322456f,0.8138339861879753f,0.5793800879185118f,-0.10396493148720226f,-0.3390940775901211f,0.5331819737933088f,-0.7750691513440434f,3.6876460695951563f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.right_feathers_right2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,-0.31598536291747015f,0.13088544811222624f,-1.6804028259208992f,-0.044642543038322456f,0.49272747339394435f,0.8690377899227927f,-0.518325831752141f,-0.3390940775901211f,0.8107853522263055f,-0.47711876839899103f,3.8322964494348737f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.jaw_right]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,-0.23106541443336356f,0.25216368564557734f,-1.9232725448548211f,-0.044642543038322456f,0.8138339861879753f,0.5793800879185118f,0.5205245378358937f,-0.3390940775901211f,0.5331819737933088f,-0.7750691513440434f,4.368566399396422f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.stun_vfx_right_head]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.1746157948282336f,-0.28883176804170446f,0.3152046070569717f,-1.6120873367064514f,-0.05580317879790307f,1.0172924827349692f,0.7242251098981398f,-0.02517729124589127f,-0.4238675969876514f,0.666477467241636f,-0.9688364391800542f,3.578057367211179f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.head_right]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,-0.17101003072446758f,0.2961981085308282f,-1.3977630101712277f,-0.044642543038322456f,0.919943673726326f,0.3895005526594063f,0.18510785909955516f,-0.3390940775901211f,0.35278776419049457f,-0.8720986182656044f,2.9564403318916703f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,-0.11697774232554162f,0.3213937739067806f,-1.1968919014794899f,-0.044642543038322456f,0.9736037233897871f,0.22383662156272552f,0.3250057475762586f,-0.3390940775901211f,0.19598978953497154f,-0.9201104330140715f,2.3813713112578756f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,-0.0740266760124837f,0.33391286489766514f,-0.9881963609184492f,-0.044642543038322456f,0.9944909504611963f,0.09484088149030521f,0.3842812985076994f,-0.3390940775901211f,0.07421455847291256f,-0.937820561650242f,1.7952334602264743f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,-0.04464255840783722f,0.3390940755666876f,-0.7762625636892695f,-0.044642543038322456f,0.9989725396187946f,0.007804385859719515f,0.3891590396700241f,-0.3390940775901211f,-0.007804297942717475f,-0.9407200962437903f,1.2072834000741053f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,2.3356067741673165e-8f,0.34202010190283116f,-0.5625f,-0.044642543038322456f,0.9914448678274843f,-0.12265446347203854f,0.3125f,-0.3390940775901211f,-0.13052614319951986f,-0.9316534401185687f,0.625f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_right_1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,0.23106541443336343f,-0.2521636856455771f,2.199870245824403f,0.044642543038322456f,0.8138339861879753f,0.5793800879185118f,-0.11233540830688772f,0.3390940775901209f,0.5331819737933088f,-0.7750691513440434f,3.624065930047009f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feathers_left1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,0.32619036165806076f,-0.10284745046430151f,2.078098534671597f,0.044642543038322456f,0.41511086254268476f,0.9086748676782803f,0.035299772612635394f,0.3390940775901209f,0.8492837098169559f,-0.40463858785693313f,3.4514920220603806f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feather_left2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.9302293012617058f,0.3261903953044786f,-0.1681465821397113f,1.3701514092543183f,-0.018852188632597987f,0.4151107998804596f,0.9095755157249816f,0.12048335171009422f,0.36649425924278756f,0.8492837275220293f,-0.37999882645656563f,3.7454944675698676f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feathers_right1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,0.23106541443336343f,-0.2521636856455771f,1.3600199525222159f,0.044642543038322456f,0.8138339861879753f,0.5793800879185118f,-0.07243613546638702f,0.3390940775901209f,0.5331819737933088f,-0.7750691513440434f,3.9271312618931793f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.left_feathers_right2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,0.31598536291747f,-0.13088544811222608f,1.6804028259208983f,0.044642543038322456f,0.49272747339394435f,0.8690377899227927f,-0.518325831752141f,0.3390940775901209f,0.8107853522263055f,-0.47711876839899103f,3.8322964494348737f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.jaw_left]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,0.23106541443336343f,-0.2521636856455771f,1.9232725448548202f,0.044642543038322456f,0.8138339861879753f,0.5793800879185118f,0.5205245378358937f,0.3390940775901209f,0.5331819737933088f,-0.7750691513440434f,4.368566399396422f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.stun_vfx_left_head]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.1746157948282336f,0.2888317680417043f,-0.3152046070569714f,1.6120873367064505f,0.05580317879790307f,1.0172924827349692f,0.7242251098981398f,-0.02517729124589127f,0.4238675969876511f,0.666477467241636f,-0.9688364391800542f,3.578057367211179f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.head_left]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,0.1710100307244675f,-0.2961981085308279f,1.397763010171227f,0.044642543038322456f,0.919943673726326f,0.3895005526594063f,0.18510785909955516f,0.3390940775901209f,0.35278776419049457f,-0.8720986182656044f,2.9564403318916703f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,0.11697774232554158f,-0.3213937739067803f,1.1968919014794894f,0.044642543038322456f,0.9736037233897871f,0.22383662156272552f,0.3250057475762586f,0.3390940775901209f,0.19598978953497154f,-0.9201104330140715f,2.3813713112578756f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,0.07402667601248368f,-0.33391286489766486f,0.9881963609184489f,0.044642543038322456f,0.9944909504611963f,0.09484088149030521f,0.3842812985076994f,0.3390940775901209f,0.07421455847291256f,-0.937820561650242f,1.7952334602264743f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,0.04464255840783723f,-0.3390940755666873f,0.7762625636892693f,0.044642543038322456f,0.9989725396187946f,0.007804385859719515f,0.3891590396700241f,0.3390940775901209f,-0.007804297942717475f,-0.9407200962437903f,1.2072834000741053f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-0.939692635862587f,-2.335606770970348e-8f,-0.34202010190283094f,0.5625f,0.044642543038322456f,0.9914448678274843f,-0.12265446347203854f,0.3125f,0.3390940775901209f,-0.13052614319951986f,-0.9316534401185687f,0.625f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.spine_left_1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-2.137303368083796e-18f,1.2244602795081337e-16f,1.3966270827595927e-15f,0f,0.9998476951563917f,0.017452406437283536f,1.0868870094011043f,-1.2246467991473532e-16f,0.017452406437283536f,-0.9998476951563917f,-11.404325587850952f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail_end_hitbox]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.4095174999999998f,-3.0125665001230514e-18f,1.7258981920216057e-16f,1.3803862590422044e-15f,0f,1.409302823657599f,0.024599472290463793f,1.522138825227365f,-1.7261610947171791e-16f,0.024599472290463793f,-1.409302823657599f,-11.271709198140092f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail_end]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-4.273955692857147e-18f,1.2239007774061622e-16f,1.3038924604543193e-15f,0f,0.9993908270190962f,0.034899496702501004f,1.500326639788302f,-1.2246467991473532e-16f,0.034899496702501004f,-0.9993908270190962f,-10.647089931253158f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail12]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-6.409306129323716e-18f,1.2229684632712e-16f,1.2274569314998693e-15f,0f,0.9986295347545744f,0.052335956242943876f,1.467616667136462f,-1.2246467991473532e-16f,0.052335956242943876f,-0.9986295347545744f,-10.022946472031549f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail11]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.067350013832298e-17f,1.2199866483456204e-16f,1.151207765978268e-15f,0f,0.996194698091746f,0.08715574274765822f,1.4131443279191758f,-1.2246467991473532e-16f,0.08715574274765822f,-0.996194698091746f,-9.400324785724209f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail10]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.4924690131530354e-17f,1.2155184676135688e-16f,1.07523786175242e-15f,0f,0.9925461516413224f,0.12186934340514755f,1.3369759882909587f,-1.2246467991473532e-16f,0.12186934340514755f,-0.9925461516413224f,-8.779983440948381f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail9]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.9157696688784732e-17f,1.2095693648649964e-16f,9.996397764483577e-16f,0f,0.9876883405951381f,0.15643446504023092f,1.2392044476408144f,-1.2246467991473532e-16f,0.15643446504023092f,-0.9876883405951381f,-8.16267822807642f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail8]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-2.126576849575772e-17f,1.2060416625018979e-16f,9.24262172541989e-16f,0f,0.9848077530122084f,0.1736481776669304f,1.1306743365989829f,-1.2246467991473532e-16f,0.1736481776669304f,-0.9848077530122084f,-7.547173382443789f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail7]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.915769668878473e-17f,1.2095693648649962e-16f,8.486640872379268e-16f,0f,0.987688340595138f,0.1564344650402309f,1.0329027959488386f,-1.2246467991473532e-16f,0.1564344650402309f,-0.987688340595138f,-6.9298681695718285f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail6]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.4924690131530348e-17f,1.2155184676135686e-16f,7.726941830120788e-16f,0f,0.9925461516413222f,0.12186934340514749f,0.9567344563206214f,-1.2246467991473532e-16f,0.12186934340514749f,-0.9925461516413222f,-6.309526824796002f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-1.0673500138322974e-17f,1.2199866483456202e-16f,6.964450174904775e-16f,0f,0.9961946980917457f,0.08715574274765818f,0.902262117103335f,-1.2246467991473532e-16f,0.08715574274765818f,-0.9961946980917457f,-5.686905138488661f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,-5.341834311772723e-18f,1.223481206754078e-16f,6.199774420683476e-16f,0f,0.9990482215818578f,0.043619387365336f,0.875f,-1.2246467991473532e-16f,0.043619387365336f,-0.9990482215818578f,-5.0625f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,5.43437017121638e-16f,0f,1f,0f,0.875f,-1.2246467991473532e-16f,0f,-1f,-4.4375f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,4.668965921749284e-16f,0f,1f,0f,0.875f,-1.2246467991473532e-16f,0f,-1f,-3.8125f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.tail]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-2.6666666666666665f,0f,3.265724797726275e-16f,1.83697019872103e-16f,0f,2.6666666666666665f,0f,0.5f,-3.265724797726275e-16f,0f,-2.6666666666666665f,-1.5f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.impossible_dragon.bone.body]")));
        return 1;
    }
}
