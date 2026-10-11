package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled192 {
    public static void register() {
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/obsidian/pos_z", Compiled192::f0);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/obsidian/zzz/0", Compiled192::f1);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/obsidian/zzz/1", Compiled192::f2);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/obsidian/zzz/2", Compiled192::f3);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/obsidian/zzz/3", Compiled192::f4);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/portal/neg_x", Compiled192::f5);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/portal/neg_z", Compiled192::f6);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/portal/pos_x", Compiled192::f7);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/portal/pos_z", Compiled192::f8);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/0", Compiled192::f9);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/1", Compiled192::f10);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/2", Compiled192::f11);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/3", Compiled192::f12);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/4", Compiled192::f13);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/5", Compiled192::f14);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/6", Compiled192::f15);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/7", Compiled192::f16);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/pos_y", Compiled192::f17);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/zzz/0", Compiled192::f18);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/zzz/1", Compiled192::f19);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/zzz/2", Compiled192::f20);
        Logic.register("impossible_to_survive:features/nether_portal/edge_scan/zzz/3", Compiled192::f21);
        Logic.register("impossible_to_survive:features/nether_portal/origin_marker_loop_2s", Compiled192::f22);
        Logic.register("impossible_to_survive:features/nether_portal/player_loop", Compiled192::f23);
    }
    // impossible_to_survive:features/nether_portal/edge_scan/obsidian/pos_z
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/obsidian/zzz/0"), Control.positioned("~", "~", "~1"), Control.when("block", "~", "~", "~", "obsidian")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/obsidian/zzz/0
    private static int f1(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "not_in_corner"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "not_in_corner"), Control.when("block", "~", "~1", "~", "nether_portal")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "not_in_corner"), Control.when("block", "~", "~-1", "~", "nether_portal")));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"obsidian_block\",\"portal_axis_z\",\"portal_id_init\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/obsidian/pos_z"), Control.when("entity", "@s[tag=not_in_corner]")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/obsidian/zzz/1
    private static int f2(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "not_in_corner"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "not_in_corner"), Control.when("block", "~", "~1", "~", "nether_portal")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "not_in_corner"), Control.when("block", "~", "~-1", "~", "nether_portal")));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"obsidian_block\",\"portal_axis_z\",\"portal_id_init\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/obsidian/neg_z"), Control.when("entity", "@s[tag=not_in_corner]")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/obsidian/zzz/2
    private static int f3(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "not_in_corner"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "not_in_corner"), Control.when("block", "~", "~1", "~", "nether_portal")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "not_in_corner"), Control.when("block", "~", "~-1", "~", "nether_portal")));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"obsidian_block\",\"portal_axis_x\",\"portal_id_init\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/obsidian/pos_x"), Control.when("entity", "@s[tag=not_in_corner]")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/obsidian/zzz/3
    private static int f4(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "not_in_corner"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "not_in_corner"), Control.when("block", "~", "~1", "~", "nether_portal")));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "not_in_corner"), Control.when("block", "~", "~-1", "~", "nether_portal")));
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"obsidian_block\",\"portal_axis_x\",\"portal_id_init\"]}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/obsidian/neg_x"), Control.when("entity", "@s[tag=not_in_corner]")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/portal/neg_x
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/6"), Control.positioned("~-1", "~", "~")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/portal/neg_z
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/2"), Control.positioned("~", "~", "~-1")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/portal/pos_x
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/4"), Control.positioned("~1", "~", "~")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/portal/pos_z
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/0"), Control.positioned("~", "~", "~1")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/0
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"obsidian_block\",\"portal_axis_z\",\"portal_id_init\"]}"), Control.when("block", "~", "~", "~", "obsidian")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/1"), Control.when("block", "~", "~", "~", "nether_portal")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/1
    private static int f10(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"portal_block\",\"portal_axis_z\",\"portal_id_init\"]}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/portal/pos_z"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/2
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"obsidian_block\",\"portal_axis_z\",\"portal_id_init\"]}"), Control.when("block", "~", "~", "~", "obsidian")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/3"), Control.when("block", "~", "~", "~", "nether_portal")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/3
    private static int f12(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"portal_block\",\"portal_axis_z\",\"portal_id_init\"]}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/portal/neg_z"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/4
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"obsidian_block\",\"portal_axis_x\",\"portal_id_init\"]}"), Control.when("block", "~", "~", "~", "obsidian")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/5"), Control.when("block", "~", "~", "~", "nether_portal")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/5
    private static int f14(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"portal_block\",\"portal_axis_x\",\"portal_id_init\"]}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/portal/pos_x"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/6
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"obsidian_block\",\"portal_axis_x\",\"portal_id_init\"]}"), Control.when("block", "~", "~", "~", "obsidian")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/7"), Control.when("block", "~", "~", "~", "nether_portal")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/portal/zzz/7
    private static int f16(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"portal_block\",\"portal_axis_x\",\"portal_id_init\"]}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/portal/neg_x"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/pos_y
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/zzz/0"), Control.positioned("~", "~1", "~")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/zzz/0
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"obsidian_block\",\"init\",\"portal_id_init\"]}"), Control.when("block", "~", "~", "~", "obsidian")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/zzz/1"), Control.when("block", "~", "~", "~", "nether_portal")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/zzz/1
    private static int f19(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"portal_block\",\"init\",\"portal_id_init\"]}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/pos_y"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/zzz/2
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"obsidian_block\",\"init\",\"portal_id_init\"]}"), Control.when("block", "~", "~", "~", "obsidian")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/edge_scan/zzz/3"), Control.when("block", "~", "~", "~", "nether_portal")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/edge_scan/zzz/3
    private static int f21(Frame c) {
        Logic.step(() -> Native.summon(c, "marker", "~", "~", "~", "{Tags:[\"nether_portal_marker\",\"portal_block\",\"init\",\"portal_id_init\"]}"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/nether_portal/edge_scan/neg_y"));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/origin_marker_loop_2s
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/20"), Control.unless("entity", "@a[distance=..35]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/21"), Control.unless("block", "~", "~", "~", "nether_portal")));
        return 1;
    }
    // impossible_to_survive:features/nether_portal/player_loop
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s[scores={soul_hit_cd=1..}]", "soul_hit_cd", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/nether_portal/zzz/9"), Control.when("entity", "@s[scores={spawn_souls_timer=1..}]")));
        return 1;
    }
}
