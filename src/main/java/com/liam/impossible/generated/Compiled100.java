package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled100 {
    public static void register() {
        Logic.register("animated_java:impossible_dragon/animations/thumbnail2/zzz/on_tick", Compiled100::f0);
        Logic.register("animated_java:impossible_dragon/animations/thumbnail2/zzz/set_frame", Compiled100::f1, "frame");
        Logic.register("animated_java:impossible_dragon/animations/thumbnail3/apply_frame", Compiled100::f2, "frame");
        Logic.register("animated_java:impossible_dragon/animations/thumbnail3/next_frame", Compiled100::f3);
        Logic.register("animated_java:impossible_dragon/animations/thumbnail3/pause", Compiled100::f4);
        Logic.register("animated_java:impossible_dragon/animations/thumbnail3/play", Compiled100::f5);
        Logic.register("animated_java:impossible_dragon/animations/thumbnail3/resume", Compiled100::f6);
        Logic.register("animated_java:impossible_dragon/animations/thumbnail3/set_frame", Compiled100::f7, "frame");
        Logic.register("animated_java:impossible_dragon/animations/thumbnail3/stop", Compiled100::f8);
        Logic.register("animated_java:impossible_dragon/animations/thumbnail3/tween", Compiled100::f9, "duration", "to_frame");
        Logic.register("animated_java:impossible_dragon/animations/thumbnail3/zzz/apply_frame", Compiled100::f10, "frame");
        Logic.register("animated_java:impossible_dragon/animations/thumbnail3/zzz/frames/0", Compiled100::f11, "bone_back_left_foot", "bone_back_left_leg", "bone_back_left_shin", "bone_back_right_foot", "bone_back_right_leg", "bone_back_right_shin", "bone_body", "bone_front_left_foot", "bone_front_left_leg", "bone_front_left_shin", "bone_front_right_foot", "bone_front_right_leg", "bone_front_right_shin", "bone_head_left", "bone_head_middle", "bone_head_right", "bone_jaw_left", "bone_jaw_middle", "bone_jaw_right", "bone_left_feather_left2", "bone_left_feathers_left1", "bone_left_feathers_right1", "bone_left_feathers_right2", "bone_left_wing", "bone_left_wing_tip", "bone_middle_feathers_left1", "bone_middle_feathers_left2", "bone_middle_feathers_right1", "bone_middle_feathers_right2", "bone_right_feathers_left1", "bone_right_feathers_left2", "bone_right_feathers_right1", "bone_right_feathers_right2", "bone_right_wing", "bone_right_wing_tip", "bone_spine_left_1", "bone_spine_left_2", "bone_spine_left_3", "bone_spine_left_4", "bone_spine_left_5", "bone_spine_middle_1", "bone_spine_middle_2", "bone_spine_middle_3", "bone_spine_middle_4", "bone_spine_middle_5", "bone_spine_right_1", "bone_spine_right_2", "bone_spine_right_3", "bone_spine_right_4", "bone_spine_right_5", "bone_stun_vfx_left_head", "bone_stun_vfx_middle_head", "bone_stun_vfx_right_head", "bone_tail", "bone_tail10", "bone_tail11", "bone_tail12", "bone_tail2", "bone_tail3", "bone_tail4", "bone_tail5", "bone_tail6", "bone_tail7", "bone_tail8", "bone_tail9", "bone_tail_end", "bone_tail_end_hitbox");
        Logic.register("animated_java:impossible_dragon/animations/thumbnail3/zzz/frames/1", Compiled100::f12);
        Logic.register("animated_java:impossible_dragon/animations/thumbnail3/zzz/on_tick", Compiled100::f13);
        Logic.register("animated_java:impossible_dragon/animations/thumbnail3/zzz/set_frame", Compiled100::f14, "frame");
        Logic.register("animated_java:impossible_dragon/animations/tower_climb/apply_frame", Compiled100::f15, "frame");
        Logic.register("animated_java:impossible_dragon/animations/tower_climb/next_frame", Compiled100::f16);
        Logic.register("animated_java:impossible_dragon/animations/tower_climb/pause", Compiled100::f17);
        Logic.register("animated_java:impossible_dragon/animations/tower_climb/play", Compiled100::f18);
        Logic.register("animated_java:impossible_dragon/animations/tower_climb/resume", Compiled100::f19);
        Logic.register("animated_java:impossible_dragon/animations/tower_climb/set_frame", Compiled100::f20, "frame");
        Logic.register("animated_java:impossible_dragon/animations/tower_climb/stop", Compiled100::f21);
        Logic.register("animated_java:impossible_dragon/animations/tower_climb/tween", Compiled100::f22, "duration", "to_frame");
        Logic.register("animated_java:impossible_dragon/animations/tower_climb/zzz/apply_frame", Compiled100::f23, "frame");
    }
    // animated_java:impossible_dragon/animations/thumbnail2/zzz/on_tick
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "1"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.thumbnail2.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/thumbnail2/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail2/stop")), Control.when("score", "@s", "aj.thumbnail2.frame", "matches", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.thumbnail2.frame", "1"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail2/zzz/set_frame
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail2/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail3/apply_frame
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/thumbnail3/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.thumbnail3.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail3/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail3/next_frame
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/thumbnail3/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.thumbnail3.frame", "1"), Control.when("score", "@s", "aj.thumbnail3.frame", "matches", "2..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.thumbnail3.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail3/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.thumbnail3.frame", "1"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail3/pause
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/thumbnail3/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.impossible_dragon.animation.thumbnail3.playing"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail3/play
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/thumbnail3/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.impossible_dragon.animation.thumbnail3.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.thumbnail3.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail3/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail3/resume
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/thumbnail3/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.impossible_dragon.animation.thumbnail3.playing"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail3/set_frame
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/thumbnail3/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.thumbnail3.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail3/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail3/stop
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/thumbnail3/stop'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.impossible_dragon.animation.thumbnail3.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.thumbnail3.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail3/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail3/tween
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/thumbnail3/tween'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/pause_all"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.impossible_dragon.animation.thumbnail3.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tween_duration", "$(duration)"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.thumbnail3.frame", "$(to_frame)"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.i", "=", "@s", "aj.tween_duration"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail3/zzz/apply_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail3/zzz/apply_frame", "{frame: $(to_frame)}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#this", "aj.i"), Control.on("passengers"), Control.store("result", "entity", "@s", "interpolation_duration", "int", "1")));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail3/zzz/apply_frame
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail3/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail3/zzz/frames/0
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_wing_tip)", "{ transformation: [-3.4300952301383045f,-1.4985300013966907f,0.22661541672287674f,-5.474570691504585f,-1.2316296780694f,2.4293788052127723f,-2.5775389341155703f,5.434114859533094f,0.8831959285917901f,-2.432082740306546f,-2.714302580041858f,-2.3227881469895015f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_wing)", "{ transformation: [-3.210397415158146f,2.1573451723283483f,0.23416926394697266f,-1.125f,1.4334019312772532f,2.4221852226419043f,-2.6634568985860896f,3.4920864365122988f,-1.6292121838964193f,-2.12002489481769f,-2.80477933270992f,-0.11546841396854646f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_wing_tip)", "{ transformation: [-2.8793810807535336f,2.0106171449799453f,-1.3149461160486013f,5.402519136827751f,2.3728322352028957f,2.058908948750629f,-2.047696541076488f,5.820750847050467f,-0.3759411860659122f,-2.404332056324015f,-2.853130839543131f,-2.0757367877289594f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_wing)", "{ transformation: [-3.157216505753816f,-2.207846770623516f,-0.4159586196281699f,1.125f,-1.7187761125400767f,2.835620058108669f,-2.0051664671576312f,3.4920864365122988f,1.4468647520612574f,-1.4492399813347352f,-3.2896672880009636f,-0.11546841396854624f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_front_left_foot)", "{ transformation: [-1.477211636716294f,0.03399848100476961f,-0.25824384530775657f,1.3932577515382165f,0.02270168486822162f,1.498313089164796f,0.06739822209517343f,-1.6288216867847762f,0.2594810471963457f,0.06246591171843019f,-1.4760649023735621f,1.7022214724444602f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_front_left_shin)", "{ transformation: [-1.477211636716294f,-0.0996783744136651f,-0.24064497090988082f,1.3422958156133413f,0.02270168486822162f,1.3312763090870388f,-0.690787972078072f,0.28346915222357816f,0.2594810471963457f,-0.6839353847680644f,-1.3095426589493173f,0.702846791390596f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_front_left_leg)", "{ transformation: [-1.4772116238117892f,-0.022701573800640976f,-0.25948113037812837f,1.3125f,1.0256251274654016e-7f,1.4942920381956923f,-0.1307337163280876f,2.2447274523554244f,0.26047229886367324f,-0.12874759466466712f,-1.4715903772425043f,0.5338655733932205f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_front_right_foot)", "{ transformation: [-1.4942920534892403f,-7.988171658868115e-8f,0.13073354152206923f,-1.4436029225620388f,-7.269993314296119e-8f,1.499999999999996f,8.55759156870306e-8f,-1.5447226743899687f,-0.13073354152207342f,7.891406039739479e-8f,-1.4942920534892403f,2.032381781136f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_front_right_shin)", "{ transformation: [-1.4942920534892403f,0.06536670158143874f,0.11321860802567799f,-1.3496382890387206f,-7.269993314296119e-8f,1.2990381484646125f,-0.749999925889081f,0.3226446640279119f,-0.13073354152207342f,-0.7471459584030389f,-1.2940949184519275f,0.9583594659316315f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_front_right_leg)", "{ transformation: [-1.4942920534892403f,0.028295839267596653f,0.1276346518742121f,-1.3125f,-7.269993314296119e-8f,1.4644440292019143f,-0.3246593373597287f,2.2447274523554244f,-0.13073354152207342f,-0.3234239181245039f,-1.45887138237272f,0.53386557339322f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_back_left_foot)", "{ transformation: [-1.5f,1.232595164407831e-32f,1.8369701987210297e-16f,1.5000000000000002f,0f,1.5f,0f,-1.3999163698384507f,-1.8369701987210297e-16f,0f,-1.5f,-2.631922819245165f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_back_left_shin)", "{ transformation: [-2f,-1.6547187705836274e-16f,1.805808661216807e-16f,1.5f,0f,1.4745546736202482f,1.35118041523132f,0.16698348422827836f,-2.449293598294706e-16f,1.35118041523132f,-1.4745546736202482f,-0.17886735771852802f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_back_left_leg)", "{ transformation: [-2f,2.2198138608735084e-16f,1.0351162030039319e-16f,1.5000000000000004f,0f,0.8452365234813991f,-1.8126155740732997f,0.8457992151658803f,-2.449293598294706e-16f,-1.8126155740732997f,-0.8452365234813991f,-2.9655807809882493f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_back_right_foot)", "{ transformation: [-1.5f,1.232595164407831e-32f,1.8369701987210297e-16f,-1.4999999999999998f,0f,1.5000000000000004f,-2.220446049250313e-16f,-1.4325337962326339f,-1.8369701987210297e-16f,-2.220446049250313e-16f,-1.5000000000000004f,-2.257803577622814f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_back_right_shin)", "{ transformation: [-2f,-1.3160044910901284e-16f,2.0657132690860176e-16f,-1.5f,0f,1.6867828916257719f,1.0745992166936476f,0.5365299388559901f,-2.449293598294706e-16f,1.0745992166936476f,-1.6867828916257719f,-0.1141048447877071f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_back_right_leg)", "{ transformation: [-2f,2.33593282205278e-16f,7.365167896959075e-17f,-1.4999999999999996f,0f,0.6014115990085461f,-1.907433901496454f,0.8457992151658803f,-2.449293598294706e-16f,-1.907433901496454f,-0.6014115990085461f,-2.9655807809882493f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_middle_feathers_left1)", "{ transformation: [-1.5f,-8.482184418135201e-17f,1.6294124664911038e-16f,0.8109374999999993f,0f,1.3305162497673326f,0.6926229198525509f,4.689151738227611f,-1.8369701987210297e-16f,0.6926229198525509f,-1.3305162497673326f,6.502081402502508f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_middle_feathers_left2)", "{ transformation: [-1.5f,-1.5492849518145128e-16f,9.870033683175964e-17f,0.7171874999999993f,0f,0.805949412520236f,1.2650871687193286f,4.86230746819075f,-1.8369701987210297e-16f,1.2650871687193286f,-0.805949412520236f,6.169452340060675f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_middle_feathers_right1)", "{ transformation: [-1.4942920457050328f,-2.6661399446359018e-8f,-0.13073363049601047f,-0.4359375000000008f,-0.11025964124806165f,0.8059493884404109f,1.260273142927507f,4.945464733801208f,0.07024310396413905f,1.2650871840598683f,-0.8028825088846787f,6.21274127255146f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_middle_feathers_right2)", "{ transformation: [-1.5f,-8.482184418135201e-17f,1.6294124664911038e-16f,-0.5296875000000009f,0f,1.3305162497673326f,0.6926229198525509f,4.689151738227611f,-1.8369701987210297e-16f,0.6926229198525509f,-1.3305162497673326f,6.502081402502508f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw_middle)", "{ transformation: [-1.5f,-1.4573664431707827e-16f,1.1182766032198473e-16f,-8.107667801353795e-16f,0f,0.9131421435130809f,1.1900300104368529f,4.053576602226999f,-1.8369701987210297e-16f,1.1900300104368529f,-0.9131421435130809f,6.620413173005202f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_stun_vfx_middle_head)", "{ transformation: [0.000010606601717798215f,-9.887517569075095e-22f,-0.000010606601717798212f,-8.60573580522888e-16f,0.000004897583634329653f,-0.000013305162497673328f,0.000004897583634329654f,5.850009311279628f,-0.000009408170626893752f,-0.0000069262291985255095f,-0.000009408170626893752f,7.027116562277815f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head_middle)", "{ transformation: [-1.875f,-1.0602730522669001e-16f,2.0367655831138798e-16f,-7.505016178561623e-16f,0f,1.6631453122091657f,0.8657786498156885f,4.732517124595107f,-2.296212748401287e-16f,0.8657786498156885f,-1.6631453122091657f,6.128310778084674f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_middle_5)", "{ transformation: [-1.5f,1.601025020748445e-17f,1.8299799725184295e-16f,-6.256911353834881e-16f,0f,1.4942920471376182f,-0.13073361412148732f,4.549244511940484f,-1.8369701987210297e-16f,-0.13073361412148732f,-1.4942920471376182f,5.109155846560155f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_middle_4)", "{ transformation: [-1.5f,4.754428727147646e-17f,1.7743769570680044e-16f,-5.1479257556673775e-16f,0f,1.4488887394336023f,-0.38822856765378116f,4.306601657156871f,-1.8369701987210297e-16f,-0.38822856765378116f,-1.4488887394336023f,4.203600384414154f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_middle_3)", "{ transformation: [-1.5f,7.029780607989445e-17f,1.6971391684315505e-16f,-4.087213775397658e-16f,0f,1.38581929876693f,-0.5740251485476346f,3.947835939314599f,-1.8369701987210297e-16f,-0.5740251485476346f,-1.38581929876693f,3.3374633226848225f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_middle_2)", "{ transformation: [-1.5f,8.4821844181352e-17f,1.629412466491104e-16f,-3.068830983840718e-16f,0f,1.3305162497673324f,-0.6926229198525509f,3.514946614406755f,-1.8369701987210297e-16f,-0.6926229198525509f,-1.3305162497673324f,2.50589066658024f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_middle_1)", "{ transformation: [-1.5f,1.053642820265481e-16f,1.504757893580287e-16f,-2.1283573003530385e-16f,0f,1.2287280664334876f,-0.8603646545265691f,2.9772187053276493f,-1.8369701987210297e-16f,-0.8603646545265691f,-1.2287280664334876f,1.7379356250593099f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_feathers_left1)", "{ transformation: [-1.141772023037833f,0.21689435729757933f,0.9483214039451837f,-3.2991553733533263f,0.17636186146976013f,1.4841628751166986f,-0.12711040061401535f,5.850144832594449f,-0.956688633374002f,0.014744419208783416f,-1.1552183606899522f,4.612442947143173f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_feathers_left2)", "{ transformation: [-1.141772023037833f,-0.28632467861538935f,0.9297176054178431f,-3.133435773806895f,0.17636186146976013f,1.34887795351182f,0.6320006015413948f,5.829389848782806f,-0.956688633374002f,0.5903782219438297f,-0.9930762376713215f,4.26384531738481f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_feathers_right1)", "{ transformation: [-1.2184574677393674f,-0.28632471660590836f,0.8266677421858888f,-3.9976171191861307f,0.12060823630810336f,1.3488779446169452f,0.644966622284141f,6.057728209482477f,-0.8664958468710728f,0.5903782238417263f,-1.0726781904041265f,3.529312456679095f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_feathers_right2)", "{ transformation: [-1.141772023037833f,0.21689435729757933f,0.9483214039451837f,-4.31961411894339f,0.17636186146976013f,1.4841628751166986f,-0.12711040061401535f,6.007768246283048f,-0.956688633374002f,0.014744419208783416f,-1.1552183606899522f,3.757402481065159f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw_right)", "{ transformation: [-1.141772023037833f,-0.2042048983237076f,0.9511345892715176f,-4.241940944513252f,0.17636186146976013f,1.3988275475056262f,0.5120331885320676f,5.4755070218569015f,-0.956688633374002f,0.5015793574699811f,-1.040752135204625f,4.397083554737873f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_stun_vfx_right_head)", "{ transformation: [-0.00001141772023037833f,0.0000021689435729757936f,0.000009483214039451838f,-3.8658387197292288f,0.0000017636186146976014f,0.000014841628751166988f,-0.0000012711040061401536f,7.2220616359812295f,-0.00000956688633374002f,1.4744419208783418e-7f,-0.000011552183606899523f,4.270190257462059f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head_right)", "{ transformation: [-1.4272150287972911f,0.2711179466219742f,1.1854017549314797f,-3.7135566532162656f,0.22045232683720017f,1.8552035938958733f,-0.1588880007675192f,5.782992540329069f,-1.1958607917175026f,0.01843052401097927f,-1.4440229508624403f,3.8231604791950926f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_right_5)", "{ transformation: [-0.9299896133825365f,0.4519462302975191f,1.0866756295787912f,-2.9947137972744415f,0.04509413812482087f,1.3976595437730075f,-0.5426917342350144f,5.322538251556684f,-1.176046698778318f,-0.3037966501133445f,-0.8801259896586001f,3.237061151936889f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_right_4)", "{ transformation: [-0.9470888912477282f,0.5988314946215848f,0.9972078384792349f,-2.37145889822492f,-0.0106114618610126f,1.2814494556216258f,-0.7795990569287595f,4.835288840976209f,-1.1631466068180403f,-0.49928762625997253f,-0.8048613776988935f,2.7340227908750805f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_right_3)", "{ transformation: [-1.0121337901635286f,0.6107774102460349f,0.9233288395487045f,-1.7943783735069796f,-0.16597573695076745f,1.1531948523148903f,-0.9447717646808081f,4.2448064880507035f,-1.0945488776445116f,-0.73965707441191f,-0.7105421639280489f,2.2899339384200497f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_right_2)", "{ transformation: [-1.1040057853707377f,0.5927528748610311f,0.824509099532518f,-1.279060186299156f,-0.22066096334903076f,1.0487885702966788f,-1.0494528450906817f,3.5888984598690277f,-0.9912012737692677f,-0.8936926564311869f,-0.6847141525623301f,1.8619875930685934f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_right_1)", "{ transformation: [-1.1602956533459132f,0.6469983798969806f,0.6964962980786495f,-0.8437500000000001f,-0.2146493809324171f,0.8923026078234256f,-1.1864744832219714f,2.8473519078552956f,-0.9260883543657759f,-1.0174424565950628f,-0.5976380237450534f,1.488463828227935f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_feathers_left1)", "{ transformation: [-1.4648528030093766f,0.16941788770465072f,-0.2747796295966414f,3.292592211232408f,-0.042536753597171725f,1.1643808188982077f,0.9446734531971103f,4.45339477277366f,0.3199951407583976f,0.9303305261613387f,-1.132293346259431f,5.606460232901668f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_feather_left2)", "{ transformation: [-1.4648528030093766f,0.28411000940604747f,-0.15325719582084452f,3.1323440036451617f,-0.042536753597171725f,0.5360466422466207f,1.4003016181985712f,4.686904588973114f,0.3199951407583976f,1.371836542701578f,-0.5154295393160876f,5.34338659263421f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_feathers_right1)", "{ transformation: [-1.4505937957350319f,0.2841100613786882f,-0.25506687906984493f,2.0168270293132444f,-0.1401132878077028f,0.5360465488448818f,1.393923370939453f,4.726978260826426f,0.3551702498165476f,1.3718365684347713f,-0.49185213545369666f,5.647528514977312f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_feathers_right2)", "{ transformation: [-1.4648528030093766f,0.16941788770465072f,-0.2747796295966414f,1.983380018542778f,-0.042536753597171725f,1.1643808188982077f,0.9446734531971103f,4.4153775492461875f,0.3199951407583976f,0.9303305261613387f,-1.132293346259431f,5.892455889954486f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw_left)", "{ transformation: [-1.4648528030093766f,0.2531809072028134f,-0.2002640600395724f,2.516141531361798f,-0.042536753597171725f,0.7710627134448691f,1.2859443675868911f,3.784261138708371f,0.3199951407583976f,1.2614918629000331f,-0.745815922147025f,5.764454890437287f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_stun_vfx_left_head)", "{ transformation: [-0.000014648528030093766f,0.0000016941788770465073f,-0.0000027477962959664138f,2.6829778193114904f,-4.2536753597171726e-7f,0.000011643808188982077f,0.000009446734531971103f,5.2850475427996315f,0.000003199951407583976f,0.000009303305261613388f,-0.00001132293346259431f,6.727685721971448f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head_left)", "{ transformation: [-1.8310660037617208f,0.2117723596308134f,-0.3434745369958017f,2.42110618848964f,-0.05317094199646466f,1.4554760236227595f,1.1808418164963879f,4.547693070031478f,0.399993925947997f,1.1629131577016734f,-1.4153666828242886f,5.430890848847906f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_left_5)", "{ transformation: [-1.3875227519482112f,0.3481221063010108f,-0.4512112719454278f,2.089140807383345f,0.3060523592503251f,1.4570012461220996f,0.1829735560018425f,4.582424811900114f,0.48074168346771556f,0.07719046510545885f,-1.4187773137012831f,4.450657041609183f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_left_4)", "{ transformation: [-1.4095389537938805f,0.19632810743376028f,-0.47397807119014523f,1.7929045128895045f,0.29426195906860253f,1.4445879951336096f,-0.2767226477196377f,4.4094731570753405f,0.4202497319246744f,-0.35301671142785357f,-1.3959832965583443f,3.578167481260218f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_left_3)", "{ transformation: [-1.4095389537938805f,0.08908671662947182f,-0.5052360781435078f,1.4771319640498122f,0.29426195906860253f,1.3504517485419647f,-0.5828292840146747f,4.045204854566169f,0.4202497319246744f,-0.6467948915847515f,-1.2864861177008902f,2.774113657697162f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_left_2)", "{ transformation: [-1.4095389537938805f,-0.022378095968203685f,-0.5125418602987374f,1.1567933013631013f,0.29426195906860253f,1.1922933046856954f,-0.8613051579125554f,3.506889130870822f,0.4202497319246744f,-0.9099098287316725f,-1.115999223294863f,2.0766141431378724f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_spine_left_1)", "{ transformation: [-1.4095389537938805f,-0.11104008242603236f,-0.5008692821809624f,0.8437499999999999f,0.29426195906860253f,1.0246156192323768f,-1.055259556824842f,2.8473519078552956f,0.4202497319246744f,-1.089877485279824f,-0.9410405038558999f,1.488463828227935f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail_end_hitbox)", "{ transformation: [1.2904570302053686f,0.09561090955627284f,-0.7586693661716954f,-7.473174114618183f,-0.03871447686084491f,1.4944889340054253f,0.1224908789123455f,-1.9479824033818047f,0.7636896244384435f,-0.08579848547118965f,1.2881835185313926f,-4.296864196012758f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail_end)", "{ transformation: [1.8189217670724953f,0.13476525021048377f,-1.0693577483329126f,-7.336510670915851f,-0.05456873263870595f,2.1065083060369916f,0.17265303741733193f,-1.3094548546184743f,1.0764338902144135f,-0.12093446674513754f,1.8157172125815717f,-4.495423973222827f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail12)", "{ transformation: [1.350158114352108f,-0.013291778668745848f,-0.6533730901016517f,-6.928152489602319f,0.024411167647993438f,1.4996688465616013f,0.019936036382844288f,-1.321914877357752f,0.6530521886826668f,-0.028577600886316404f,1.3500763532424234f,-5.339221693999342f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail11)", "{ transformation: [1.2513319057425096f,0.01836064735656557f,-0.826940958170211f,-6.411314390745938f,0.048151102081706344f,1.4954702767133048f,0.10606659622779097f,-1.3882065000001214f,0.8257420499400134f,-0.11502842299049362f,1.2469637239571902f,-6.118574021472586f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail10)", "{ transformation: [1.1332876570770327f,-0.01795582559624894f,-0.982515483157394f,-5.7972422137725665f,0.09725819590672699f,1.4944355623712016f,0.08487162805814634f,-1.4412512675364628f,0.9778547589728337f,-0.1278277679044293f,1.1302478188905087f,-6.824978908279154f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail9)", "{ transformation: [0.9485846258029691f,-0.0040322895530295645f,-1.161968565982403f,-5.071011860033565f,0.01530706086543926f,1.4999041749990063f,0.007291070443570375f,-1.4458081865636943f,1.1618747357516226f,-0.016468347261091195f,0.9485651753889055f,-7.41783214289722f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail8)", "{ transformation: [0.6123702577857438f,-0.03133100073634745f,-1.3689488798973763f,-4.215418810097705f,0.13005848589701713f,1.4941585063762348f,0.023982244884810842f,-1.460797089616701f,1.3631168173071584f,-0.1284862880481749f,0.6127020614931895f,-7.800770931330463f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail7)", "{ transformation: [0.23305350982125872f,-0.08874259043891397f,-1.4791250164209193f,-3.2909656748346308f,0.1862668604112231f,1.4871850340909742f,-0.059877634291726343f,-1.423373568184372f,1.4700308562314393f,-0.1743715200886283f,0.2420823304362436f,-7.952072387853116f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail6)", "{ transformation: [-0.15312526904536444f,-0.038614134902237925f,-1.4916640374311965f,-2.358675651440133f,0.22676238059006612f,1.4814792420848777f,-0.061628548747654596f,-1.3848557252170879f,1.4748326938093388f,-0.2317934508508981f,-0.1453971162496745f,-7.86119919019707f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail5)", "{ transformation: [-0.5973466252336057f,-0.03662894719774555f,-1.3754400494202603f,-1.49902562055247f,0.28846619055473355f,1.4628103414372287f,-0.16423508118285357f,-1.2822087994778044f,1.3453491242903692f,-0.32991548192148096f,-0.575492405301455f,-7.50151643688366f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail4)", "{ transformation: [-0.9831734867888099f,-0.0063738936828304504f,-1.132841237047299f,-0.7909998473979079f,0.3906780131786227f,1.406051150467414f,-0.34697384957380417f,-1.0653501434941768f,1.0633628660501262f,-0.5224744354976432f,-0.9199347147254965f,-6.926557240180225f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail3)", "{ transformation: [-1.2994135194718812f,-0.0001616174207506038f,-0.7493493706499721f,-0.32265649074167535f,0.4303001282020745f,1.2278783532839215f,-0.7464291990577832f,-0.5988318940830623f,0.6134870048199702f,-0.8615768818953852f,-1.0636347923514196f,-6.261785494960588f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail2)", "{ transformation: [-1.4490829803659395f,-0.03393419446560277f,-0.3860142309031333f,-0.08139759642721706f,0.2224478111117662f,1.1506605071910059f,-0.9362143817110059f,-0.01369790551368355f,0.3172940077362805f,-0.9616802314890889f,-1.106569313246008f,-5.570179674181833f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-1.4942920449959454f,-0.011394225698473896f,-0.13023615428354823f,5.884798230688424e-16f,0.06536679120504055f,1.2289767680169676f,-0.857521595227855f,0.5222530915037258f,0.11321866837846391f,-0.8599338784437445f,-1.2238036026402712f,-4.805302422531663f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-4f,2.2619158448360533e-16f,4.345099910642944e-16f,1.798699986247675e-16f,0f,3.548043332712887f,-1.8469944529401356f,1.625f,-4.898587196589412e-16f,-1.8469944529401356f,-3.548043332712887f,-1.46875f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data", "merge", "value", "{\"locators\":{\"body_hitbox_locator\":{\"posx\":8.52832291349457e-17,\"posy\":0.5473761464351528,\"posz\":-0.6963904139081014,\"roty\":0,\"rotx\":-27.500000000000004},\"head_middle_locator\":{\"posx\":-7.86354466864205e-16,\"posy\":4.685807592733212,\"posz\":6.421071507406833,\"roty\":0,\"rotx\":27.500000000000004},\"head_hitbox_middle_locator\":{\"posx\":-7.691936632589026e-16,\"posy\":3.8075254047667344,\"posz\":6.280942911821148,\"roty\":0,\"rotx\":27.500000000000004},\"head_right_locator\":{\"posx\":-3.8778110191248887,\"posy\":5.89958592013899,\"posz\":4.040685448025007,\"roty\":39.3826512451875,\"rotx\":-4.861089382307051},\"head_hitbox_right_locator\":{\"posx\":-4.296164533837647,\"posy\":5.104466303077727,\"posz\":4.393397449935677,\"roty\":39.3826512451875,\"rotx\":-4.861089382307051},\"head_left_locator\":{\"posx\":2.4898010958888004,\"posy\":4.3115247067322,\"posz\":5.713964185412764,\"roty\":346.3594197291851,\"rotx\":39.03406300810186},\"head_hitbox_left_locator\":{\"posx\":2.4737870594356353,\"posy\":3.4931659339838195,\"posz\":5.531872258896953,\"roty\":346.3594197291851,\"rotx\":39.03406300810186},\"tail_locator\":{\"posx\":-7.472785495225777,\"posy\":-1.1930822564470704,\"posz\":-4.2592519688401405,\"roty\":210.4957495391881,\"rotx\":4.684022659631874},\"tail_end_hitbox_locator\":{\"posx\":-7.514615268156646,\"posy\":-1.8469211650744441,\"posz\":-4.221715131446496,\"roty\":210.4957495391881,\"rotx\":4.684022659631874}},\"cameras\":{}}"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail3/zzz/frames/1
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data", "merge", "value", "{\"locators\":{\"body_hitbox_locator\":{\"posx\":8.52832291349457e-17,\"posy\":0.5473761464351528,\"posz\":-0.6963904139081014,\"roty\":0,\"rotx\":-27.500000000000004},\"head_middle_locator\":{\"posx\":-7.86354466864205e-16,\"posy\":4.685807592733212,\"posz\":6.421071507406833,\"roty\":0,\"rotx\":27.500000000000004},\"head_hitbox_middle_locator\":{\"posx\":-7.691936632589026e-16,\"posy\":3.8075254047667344,\"posz\":6.280942911821148,\"roty\":0,\"rotx\":27.500000000000004},\"head_right_locator\":{\"posx\":-3.8778110191248887,\"posy\":5.89958592013899,\"posz\":4.040685448025007,\"roty\":39.3826512451875,\"rotx\":-4.861089382307051},\"head_hitbox_right_locator\":{\"posx\":-4.296164533837647,\"posy\":5.104466303077727,\"posz\":4.393397449935677,\"roty\":39.3826512451875,\"rotx\":-4.861089382307051},\"head_left_locator\":{\"posx\":2.4898010958888004,\"posy\":4.3115247067322,\"posz\":5.713964185412764,\"roty\":346.3594197291851,\"rotx\":39.03406300810186},\"head_hitbox_left_locator\":{\"posx\":2.4737870594356353,\"posy\":3.4931659339838195,\"posz\":5.531872258896953,\"roty\":346.3594197291851,\"rotx\":39.03406300810186},\"tail_locator\":{\"posx\":-7.472785495225777,\"posy\":-1.1930822564470704,\"posz\":-4.2592519688401405,\"roty\":210.4957495391881,\"rotx\":4.684022659631874},\"tail_end_hitbox_locator\":{\"posx\":-7.514615268156646,\"posy\":-1.8469211650744441,\"posz\":-4.221715131446496,\"roty\":210.4957495391881,\"rotx\":4.684022659631874}},\"cameras\":{}}"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail3/zzz/on_tick
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "1"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.thumbnail3.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/thumbnail3/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail3/stop")), Control.when("score", "@s", "aj.thumbnail3.frame", "matches", "1")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.thumbnail3.frame", "1"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/thumbnail3/zzz/set_frame
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/thumbnail3/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:impossible_dragon/animations/tower_climb/apply_frame
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/tower_climb/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.tower_climb.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/tower_climb/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:impossible_dragon/animations/tower_climb/next_frame
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/tower_climb/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.tower_climb.frame", "1"), Control.when("score", "@s", "aj.tower_climb.frame", "matches", "19..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.tower_climb.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/tower_climb/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.tower_climb.frame", "1"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/tower_climb/pause
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/tower_climb/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.impossible_dragon.animation.tower_climb.playing"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/tower_climb/play
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/tower_climb/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.impossible_dragon.animation.tower_climb.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tower_climb.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/tower_climb/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/tower_climb/resume
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/tower_climb/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.impossible_dragon.animation.tower_climb.playing"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/tower_climb/set_frame
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/tower_climb/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.tower_climb.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/tower_climb/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:impossible_dragon/animations/tower_climb/stop
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/tower_climb/stop'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.impossible_dragon.animation.tower_climb.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tower_climb.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/tower_climb/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:impossible_dragon/animations/tower_climb/tween
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'impossible_dragon', 'function_path': 'animated_java:impossible_dragon/animations/tower_climb/tween'}")), Control.unless("entity", "@s[type=item_display,tag=aj.impossible_dragon.root]")));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/animations/pause_all"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.impossible_dragon.animation.tower_climb.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tween_duration", "$(duration)"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tower_climb.frame", "$(to_frame)"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.i", "=", "@s", "aj.tween_duration"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/tower_climb/zzz/apply_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/tower_climb/zzz/apply_frame", "{frame: $(to_frame)}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#this", "aj.i"), Control.on("passengers"), Control.store("result", "entity", "@s", "interpolation_duration", "int", "1")));
        return 1;
    }
    // animated_java:impossible_dragon/animations/tower_climb/zzz/apply_frame
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:impossible_dragon/animations/tower_climb/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        return 1;
    }
}
