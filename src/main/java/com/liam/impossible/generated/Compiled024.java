package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled024 {
    public static void register() {
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/94", Compiled024::f0, "bone_rocket_launcher_arm2", "bone_rocket_launcher_arm3", "bone_rocket_launcher_arm4", "bone_rocket_launcher_arm5", "bone_rocketlauncher");
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/95", Compiled024::f1, "bone_rocket_launcher_arm2", "bone_rocket_launcher_arm3", "bone_rocket_launcher_arm4", "bone_rocket_launcher_arm5", "bone_rocketlauncher");
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/96", Compiled024::f2, "bone_rocket_launcher_arm2", "bone_rocket_launcher_arm3", "bone_rocket_launcher_arm4", "bone_rocket_launcher_arm5", "bone_rocketlauncher");
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/97", Compiled024::f3, "bone_rocket_launcher_arm2", "bone_rocket_launcher_arm3", "bone_rocket_launcher_arm4", "bone_rocket_launcher_arm5", "bone_rocketlauncher");
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/98", Compiled024::f4, "bone_rocket_launcher_arm2", "bone_rocket_launcher_arm3", "bone_rocket_launcher_arm4", "bone_rocket_launcher_arm5", "bone_rocketlauncher");
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/99", Compiled024::f5, "bone_rocket_launcher_arm2", "bone_rocket_launcher_arm3", "bone_rocket_launcher_arm4", "bone_rocket_launcher_arm5", "bone_rocketlauncher");
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/zzz/0", Compiled024::f6);
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/on_tick", Compiled024::f7);
        Logic.register("animated_java:crafting_table_rocket_launcher/animations/transform/zzz/set_frame", Compiled024::f8, "frame");
        Logic.register("animated_java:crafting_table_rocket_launcher/apply_default_pose", Compiled024::f9);
        Logic.register("animated_java:crafting_table_rocket_launcher/as_own_locator_entities", Compiled024::f10, "command");
        Logic.register("animated_java:crafting_table_rocket_launcher/on_load", Compiled024::f11);
        Logic.register("animated_java:crafting_table_rocket_launcher/remove/all", Compiled024::f12);
        Logic.register("animated_java:crafting_table_rocket_launcher/remove/this", Compiled024::f13);
        Logic.register("animated_java:crafting_table_rocket_launcher/remove/zzz/0", Compiled024::f14);
        Logic.register("animated_java:crafting_table_rocket_launcher/root/on_load", Compiled024::f15);
        Logic.register("animated_java:crafting_table_rocket_launcher/root/on_tick", Compiled024::f16);
        Logic.register("animated_java:crafting_table_rocket_launcher/root/outdated_tellraw", Compiled024::f17, "x", "y", "z");
        Logic.register("animated_java:crafting_table_rocket_launcher/root/zzz/0", Compiled024::f18);
        Logic.register("animated_java:crafting_table_rocket_launcher/root/zzz/1", Compiled024::f19);
        Logic.register("animated_java:crafting_table_rocket_launcher/set_default_pose", Compiled024::f20);
        Logic.register("animated_java:crafting_table_rocket_launcher/summon/default", Compiled024::f21);
        Logic.register("animated_java:crafting_table_rocket_launcher/summon", Compiled024::f22, "args");
        Logic.register("animated_java:crafting_table_rocket_launcher/variants/default/apply", Compiled024::f23);
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/94
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocketlauncher)", "{ transformation: [-1.0994211318085094f,6.753984896494812e-17f,1.1676402931537472e-16f,4.3118044291043444e-17f,0f,0.9605810814326815f,-0.5474108813148206f,1.7962755809745132f,-1.3464025699842516e-16f,-0.551504719662616f,-0.9534506552964529f,-0.34666898095576926f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm5)", "{ transformation: [-0.9425026784127548f,1.0835125895485946e-16f,-3.9781154927538354e-17f,0f,0f,-0.32483778143408815f,-0.8847551721059315f,1.8627925507556755f,-1.1542328883059874e-16f,-0.8847551721059315f,0.32483778143408815f,0.005416569923585517f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm4)", "{ transformation: [-0.9425026784127548f,-4.297396906341777e-17f,1.0712503716409266e-16f,0.058906417400797176f,0f,0.8747423113233732f,0.3509090873657443f,1.8627925507556755f,-1.1542328883059874e-16f,0.3509090873657443f,-0.8747423113233732f,0.005416569923585524f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm3)", "{ transformation: [-0.9425026784127548f,-4.297396906341777e-17f,1.0712503716409266e-16f,0.05890641740079719f,0f,0.8747423113233732f,0.3509090873657443f,1.017023663491076f,-1.1542328883059874e-16f,0.3509090873657443f,-0.8747423113233732f,-0.09427226433003705f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm2)", "{ transformation: [-0.9425026784127548f,0f,1.1542328883059874e-16f,0.05890641740079718f,0f,0.9425026784127548f,0f,0.9080467912996014f,-1.1542328883059874e-16f,0f,-0.9425026784127548f,-0.06249999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/95
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocketlauncher)", "{ transformation: [-1.0155139626520473f,7.804029745022573e-17f,9.742050975343841e-17f,4.027938490916516e-17f,0f,0.803083265178948f,-0.6312291324606729f,1.7402810758255314f,-1.2436459238512743e-16f,-0.6372473884270994f,-0.7954988313468534f,-0.3459561193628454f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm5)", "{ transformation: [-0.9284699087104433f,9.772371263653334e-17f,-5.812788272744251e-17f,0f,0f,-0.4746501829581673f,-0.7979746707750546f,1.8684014775114033f,-1.1370477018068796e-16f,-0.7979746707750546f,0.4746501829581673f,-0.017049981387314485f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm4)", "{ transformation: [-0.9284699087104433f,-3.749682423165995e-17f,1.0734413320896053e-16f,0.05802936929440271f,0f,0.8765313662984111f,0.3061848057559674f,1.8684014775114033f,-1.1370477018068796e-16f,0.3061848057559674f,-0.8765313662984111f,-0.017049981387314478f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm3)", "{ transformation: [-0.9284699087104433f,-3.749682423165995e-17f,1.0734413320896053e-16f,0.058029369294402715f,0f,0.8765313662984111f,0.3061848057559674f,1.0158396485474437f,-1.1370477018068796e-16f,0.3061848057559674f,-0.8765313662984111f,-0.08282064869051181f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm2)", "{ transformation: [-0.9284699087104433f,0f,1.1370477018068796e-16f,0.058029369294402715f,0f,0.9284699087104433f,0f,0.9084853153527986f,-1.1370477018068796e-16f,0f,-0.9284699087104433f,-0.06249999999999998f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/96
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocketlauncher)", "{ transformation: [-0.9334809240051285f,8.471036810145236e-17f,7.780322569484485e-17f,3.610428885437037e-17f,0f,0.6425370921920522f,-0.683934111672457f,1.6877570421619212f,-1.1431844256479944e-16f,-0.6917126485810522f,-0.6353115506365957f,-0.3348033205486809f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm5)", "{ transformation: [-0.9142731913058066f,8.39257645314623e-17f,-7.411403448115213e-17f,0f,0f,-0.605187018271335f,-0.6853058742316127f,1.871870556874196f,-1.1196617372788919e-16f,-0.6853058742316127f,0.605187018271335f,-0.03998942906986767f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm4)", "{ transformation: [-0.9142731913058066f,-3.186257838678782e-17f,1.0733685367947798e-16f,0.057142074456612915f,0f,0.8764719244292319f,0.2601776970222907f,1.871870556874196f,-1.1196617372788919e-16f,0.2601776970222907f,-0.8764719244292319f,-0.03998942906986766f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm3)", "{ transformation: [-0.9142731913058066f,-3.186257838678782e-17f,1.0733685367947798e-16f,0.05714207445661292f,0f,0.8764719244292319f,0.2601776970222907f,1.0146418005164275f,-1.1196617372788919e-16f,0.2601776970222907f,-0.8764719244292319f,-0.06944013464228904f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm2)", "{ transformation: [-0.9142731913058066f,0f,1.1196617372788919e-16f,0.05714207445661292f,0f,0.9142731913058066f,0f,0.9089289627716935f,-1.1196617372788919e-16f,0f,-0.9142731913058066f,-0.06249999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/97
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocketlauncher)", "{ transformation: [-0.8544261067230935f,8.758373938291514e-17f,5.890008050368311e-17f,3.7773798856778303e-17f,0f,0.4870648906257438f,-0.7062050895522436f,1.6411700291197608f,-1.0463701967063712e-16f,-0.7151755056551355f,-0.48095565631406234f,-0.31379725881178444f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm5)", "{ transformation: [-0.9f,6.773501545153364e-17f,-8.694838653673535e-17f,6.938893903907228e-18f,0f,-0.7099874559527874f,-0.5530983749656913f,1.8728466766667005f,-1.1021821192326179e-16f,-0.5530983749656913f,0.7099874559527874f,-0.062011152202600985f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm4)", "{ transformation: [-0.9f,-2.621766390038382e-17f,1.0705460447438754e-16f,0.05625000000000001f,0f,0.8741671847664415f,0.2140834722193989f,1.8728466766667005f,-1.1021821192326179e-16f,0.2140834722193989f,-0.8741671847664415f,-0.06201115220260098f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm3)", "{ transformation: [-0.9f,-2.621766390038382e-17f,1.0705460447438754e-16f,0.05625000000000001f,0f,0.8741671847664415f,0.2140834722193989f,1.0134375f,-1.1021821192326179e-16f,0.2140834722193989f,-0.8741671847664415f,-0.05386159622964218f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm2)", "{ transformation: [-0.9f,0f,1.1021821192326179e-16f,0.05625000000000001f,0f,0.9f,0f,0.909375f,-1.1021821192326179e-16f,0f,-0.9f,-0.06249999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/98
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocketlauncher)", "{ transformation: [-0.7796030036998903f,8.703272517009373e-17f,4.1643026962561275e-17f,3.872317491445732e-17f,0f,0.34447138697792345f,-0.7015360859165936f,1.6023514925225593f,-9.547383230867329e-17f,-0.710676133156836f,-0.3400411203585783f,-0.28409203608042516f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm5)", "{ transformation: [-0.8857268086941935f,5.023128013985288e-17f,-9.613851286716856e-17f,1.3877787807814457e-17f,0f,-0.7850305323469913f,-0.4101695294906732f,1.8711023465595138f,-1.0847025011863442e-16f,-0.4101695294906732f,0.7850305323469913f,-0.08121405424973575f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm4)", "{ transformation: [-0.8857268086941935f,-2.0730071517911455e-17f,1.0647093169340347e-16f,0.05535792554338711f,0f,0.8694011348213434f,0.169273879883935f,1.8711023465595138f,-1.0847025011863442e-16f,0.169273879883935f,-0.8694011348213434f,-0.08121405424973575f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm3)", "{ transformation: [-0.8857268086941935f,-2.0730071517911455e-17f,1.0647093169340347e-16f,0.0553579255433871f,0f,0.8694011348213434f,0.169273879883935f,1.0122331994835725f,-1.0847025011863442e-16f,0.169273879883935f,-0.8694011348213434f,-0.03553700050833687f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm2)", "{ transformation: [-0.8857268086941935f,0f,1.0847025011863442e-16f,0.0553579255433871f,0f,0.8857268086941935f,0f,0.9098210372283064f,-1.0847025011863442e-16f,0f,-0.8857268086941935f,-0.06249999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/99
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocketlauncher)", "{ transformation: [-0.7108378499687386f,8.375052874811238e-17f,2.6884658655623468e-17f,2.5592292905644616e-17f,0f,0.22205786543396638f,-0.6760895450726591f,1.572294060910402f,-8.705252976770023e-17f,-0.6838749654710465f,-0.21952989771697126f,-0.246814183581567f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm5)", "{ transformation: [-0.8715300912895569f,3.281543571430185e-17f,-1.0156176974198713e-16f,6.938893903907228e-18f,0f,-0.8293147853952535f,-0.2679583675648296f,1.86653970746082f,-1.0673165366583565e-16f,-0.2679583675648296f,0.8293147853952535f,-0.09449762165755257f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm4)", "{ transformation: [-0.8715300912895569f,-1.5630090369236482e-17f,1.0558099340929403e-16f,0.054470630705597316f,0f,0.8621342372576618f,0.12762937346603737f,1.86653970746082f,-1.0673165366583565e-16f,0.12762937346603737f,-0.8621342372576618f,-0.09449762165755257f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm3)", "{ transformation: [-0.8715300912895569f,-1.5630090369236482e-17f,1.0558099340929403e-16f,0.05447063070559731f,0f,0.8621342372576618f,0.12762937346603737f,1.0110353514525563f,-1.0673165366583565e-16f,0.12762937346603737f,-0.8621342372576618f,-0.013277889937291308f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_rocket_launcher_arm2)", "{ transformation: [-0.8715300912895569f,0f,1.0673165366583565e-16f,0.054470630705597316f,0f,0.8715300912895569f,0f,0.9102646846472013f,-1.0673165366583565e-16f,0f,-0.8715300912895569f,-0.06249999999999999f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 1 }"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/zzz/0
    private static int f6(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:features/crafting_table/remove_crafting_table_rocket_launcher"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/on_tick
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "1"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.transform.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_rocket_launcher/animations/transform/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:crafting_table_rocket_launcher/animations/transform/pause")), Control.when("score", "@s", "aj.transform.frame", "matches", "177..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.transform.frame", "1"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/animations/transform/zzz/set_frame
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/animations/transform/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/apply_default_pose
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/apply_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.4583333333333333f,0f,1.7859432487565567e-16f,2.0101533120957954e-17f,0f,1.4583333333333333f,0f,1.78125f,-1.7859432487565567e-16f,0f,-1.4583333333333333f,-0.1875f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocketlauncher]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,2.7755575615628914e-17f,0f,1f,0f,1.40625f,-1.2246467991473532e-16f,0f,-1f,-0.25f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.06250000000000003f,0f,1f,0f,1.40625f,-1.2246467991473532e-16f,0f,-1f,-0.25f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.0625f,0f,1f,0f,0.709375f,-1.2246467991473532e-16f,0f,-1f,-0.014062499999999993f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.0625f,0f,1f,0f,0.59375f,-1.2246467991473532e-16f,0f,-1f,7.654042494670958e-18f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm2]")));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/as_own_locator_entities
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/as_all_locators'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "command", "set", "value", "'$(command)'"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/zzz/12"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/on_load
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "aj.transform.frame", "dummy"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/root/on_load"), Control.as("@e[type=item_display,tag=aj.crafting_table_rocket_launcher.root]"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1"), Control.at("@s")));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/remove/all
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/remove/this"), Control.as("@e[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/remove/this
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/remove/this'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Logic.call(c, "#animated_java:crafting_table_rocket_launcher/as_root/on_remove"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/remove/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/remove/zzz/0
    private static int f14(Frame c) {

        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/root/on_load
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/root/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.data]"), Control.unless("data", "entity", "@s", "{data:{rigHash: 'e6ece77cf69b2ce330d885af974c46367b863abd19454d2238be29c36edce53c'}}"), Control.on("vehicle")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.is_rig_loaded", "1"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/root/on_tick
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "#animated_java:global/root/on_load"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1")));
        Logic.step(() -> Logic.call(c, "#animated_java:crafting_table_rocket_launcher/as_root/pre_tick"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/animations/transform/zzz/on_tick"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.animation.transform.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/root/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:crafting_table_rocket_launcher/as_root/post_tick"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/root/outdated_tellraw
    private static int f17(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The \",\"color\":\"red\"},{\"text\":\"crafting_table_rocket_launcher\",\"color\":\"yellow\"},{\"text\":\" rig instance at\",\"color\":\"red\"},[{\"text\":\" [\",\"color\":\"yellow\"},{\"score\":{\"name\":\"#this.x\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.y\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.z\",\"objective\":\"aj.i\"}},\"]\"],{\"text\":\" is outdated! It will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"},\"\\n \",{\"text\":\"[Click Here to Teleport to the Rig Instance]\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/tp @s $(x) $(y) $(z)\"},\"color\":\"aqua\",\"underlined\":true}]"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/root/zzz/0
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1"), Control.store("result", "storage", "aj:temp", "x", "int", "1"), Control.store("result", "score", "#this.x", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1"), Control.store("result", "storage", "aj:temp", "y", "int", "1"), Control.store("result", "score", "#this.y", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1"), Control.store("result", "storage", "aj:temp", "z", "int", "1"), Control.store("result", "score", "#this.z", "aj.i")));
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_rocket_launcher/root/outdated_tellraw", "with", "storage", "aj:temp"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.rigHash", "set", "value", "'e6ece77cf69b2ce330d885af974c46367b863abd19454d2238be29c36edce53c'"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{Glowing: 1b, glow_color_override: 16711680}"), Control.on("passengers")));
        Logic.step(() -> Native.summon(c, "minecraft:text_display", "~", "~", "~", "{Tags:['aj.rig_entity', 'aj.outdated_rig_text_display', 'aj.new'], text:'[\"\",{\"text\":\"This rig instance is outdated!\\\\nIt will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"}]', billboard: \"vertical\", transformation:{translation:[0,3,0],left_rotation:[0,0,0,1],right_rotation:[0,0,0,1],scale:[1,1,1]}}"));
        Logic.step(() -> Native.ride(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "mount", "@s"));
        Logic.step(() -> Native.tag(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "remove", "aj.new"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/root/zzz/1
    private static int f19(Frame c) {

        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/set_default_pose
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/set_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.4583333333333333f,0f,1.7859432487565567e-16f,2.0101533120957954e-17f,0f,1.4583333333333333f,0f,1.78125f,-1.7859432487565567e-16f,0f,-1.4583333333333333f,-0.1875f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocketlauncher]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,2.7755575615628914e-17f,0f,1f,0f,1.40625f,-1.2246467991473532e-16f,0f,-1f,-0.25f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.06250000000000003f,0f,1f,0f,1.40625f,-1.2246467991473532e-16f,0f,-1f,-0.25f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.0625f,0f,1f,0f,0.709375f,-1.2246467991473532e-16f,0f,-1f,-0.014062499999999993f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.0625f,0f,1f,0f,0.59375f,-1.2246467991473532e-16f,0f,-1f,7.654042494670958e-18f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm2]")));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/summon/default
    private static int f21(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:crafting_table_rocket_launcher/summon", "{args:{variant: 'default'}}"));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/summon
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "args", "set", "value", "{variant:'', animation:'', frame: 0}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "aj:temp", "args", "set", "value", "$(args)"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.summon(c, "minecraft:item_display", "~", "~", "~", "{ Tags:['aj.new','aj.rig_entity','aj.rig_root','aj.crafting_table_rocket_launcher.root'], teleport_duration: 0, interpolation_duration: 1, Passengers:[{id:\"minecraft:marker\",Tags:[\"aj.rig_entity\",\"aj.data\",\"aj.crafting_table_rocket_launcher.data\"],data:{rigHash:\"e6ece77cf69b2ce330d885af974c46367b863abd19454d2238be29c36edce53c\",locators:{commands:{posx:0f,posy:0f,posz:0f,rotx:0f,roty:0f}},cameras:{},bones:{data_data:\"\",bone_rocketlauncher:\"\",bone_rocket_launcher_arm5:\"\",bone_rocket_launcher_arm4:\"\",bone_rocket_launcher_arm3:\"\",bone_rocket_launcher_arm2:\"\"}}},{Tags:[\"aj.rig_entity\"]},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.crafting_table_rocket_launcher.bone\",\"aj.crafting_table_rocket_launcher.bone.rocketlauncher\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:1,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":130}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.crafting_table_rocket_launcher.bone\",\"aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm5\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:1,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":131}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.crafting_table_rocket_launcher.bone\",\"aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm4\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:1,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":132}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.crafting_table_rocket_launcher.bone\",\"aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm3\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:1,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":133}},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.crafting_table_rocket_launcher.bone\",\"aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm2\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:1,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",count:1,components:{\"minecraft:custom_model_data\":134}},height:48f,width:48f}], }"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/zzz/0"), Control.as("@e[type=item_display,tag=aj.new,limit=1,distance=..0.01]")));
        return 1;
    }
    // animated_java:crafting_table_rocket_launcher/variants/default/apply
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'crafting_table_rocket_launcher', 'function_path': 'animated_java:crafting_table_rocket_launcher/variants/default/apply'}")), Control.unless("entity", "@s[type=item_display,tag=aj.crafting_table_rocket_launcher.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/variants/default/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocketlauncher]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/variants/default/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm5]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/variants/default/zzz/2"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm4]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/variants/default/zzz/3"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm3]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:crafting_table_rocket_launcher/variants/default/zzz/4"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.crafting_table_rocket_launcher.bone.rocket_launcher_arm2]")));
        return 1;
    }
}
