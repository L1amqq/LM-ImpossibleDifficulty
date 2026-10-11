package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled127 {
    public static void register() {
        Logic.register("animated_java:lava_wave/animations/crash/zzz/frames/92", Compiled127::f0, "bone_ground", "bone_wave_lower", "bone_wave_lowest", "bone_wave_upper");
        Logic.register("animated_java:lava_wave/animations/crash/zzz/frames/93", Compiled127::f1, "bone_ground", "bone_wave_lower", "bone_wave_lowest", "bone_wave_upper");
        Logic.register("animated_java:lava_wave/animations/crash/zzz/frames/94", Compiled127::f2, "bone_ground", "bone_wave_lower", "bone_wave_lowest", "bone_wave_upper");
        Logic.register("animated_java:lava_wave/animations/crash/zzz/frames/95", Compiled127::f3, "bone_ground", "bone_wave_lower", "bone_wave_lowest", "bone_wave_upper");
        Logic.register("animated_java:lava_wave/animations/crash/zzz/frames/96", Compiled127::f4, "bone_ground", "bone_wave_lower", "bone_wave_lowest", "bone_wave_upper");
        Logic.register("animated_java:lava_wave/animations/crash/zzz/frames/97", Compiled127::f5, "bone_ground", "bone_wave_lower", "bone_wave_lowest", "bone_wave_upper");
        Logic.register("animated_java:lava_wave/animations/crash/zzz/frames/98", Compiled127::f6, "bone_ground", "bone_wave_lower", "bone_wave_lowest", "bone_wave_upper");
        Logic.register("animated_java:lava_wave/animations/crash/zzz/frames/99", Compiled127::f7, "bone_ground", "bone_wave_lower", "bone_wave_lowest", "bone_wave_upper");
        Logic.register("animated_java:lava_wave/animations/crash/zzz/on_tick", Compiled127::f8);
        Logic.register("animated_java:lava_wave/animations/crash/zzz/set_frame", Compiled127::f9, "frame");
        Logic.register("animated_java:lava_wave/animations/pause_all", Compiled127::f10);
        Logic.register("animated_java:lava_wave/apply_default_pose", Compiled127::f11);
        Logic.register("animated_java:lava_wave/on_load", Compiled127::f12);
        Logic.register("animated_java:lava_wave/remove/all", Compiled127::f13);
        Logic.register("animated_java:lava_wave/remove/this", Compiled127::f14);
        Logic.register("animated_java:lava_wave/root/on_load", Compiled127::f15);
        Logic.register("animated_java:lava_wave/root/on_tick", Compiled127::f16);
        Logic.register("animated_java:lava_wave/root/outdated_tellraw", Compiled127::f17, "x", "y", "z");
        Logic.register("animated_java:lava_wave/root/zzz/0", Compiled127::f18);
        Logic.register("animated_java:lava_wave/set_default_pose", Compiled127::f19);
        Logic.register("animated_java:lava_wave/summon", Compiled127::f20, "args");
        Logic.register("animated_java:lava_wave/uninstall", Compiled127::f21);
        Logic.register("animated_java:lava_wave/zzz/0", Compiled127::f22);
        Logic.register("animated_java:lava_wave/zzz/1", Compiled127::f23);
    }
    // animated_java:lava_wave/animations/crash/zzz/frames/92
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lowest)", "{ transformation: [-0.1021830426545162f,2.7084849869445923e-18f,1.221718626265199e-17f,1.6978548396088726e-18f,0f,0.09976089653897001f,-0.02211645830316419f,-0.16660180814968012f,-1.2513813611399074e-17f,-0.02211645830316419f,-0.09976089653897001f,-0.013864036886316817f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_upper)", "{ transformation: [-0.0812819657479106f,-8.153978637659399e-18f,-5.709477308490052e-18f,-1.6041779549260312e-18f,0f,-0.04662142025329436f,0.06658228840622878f,-0.16578327925377542f,-9.954169918158353e-18f,0.06658228840622878f,0.04662142025329436f,0.01309910707350824f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lower)", "{ transformation: [-0.09289367514046928f,-1.0090807488803693e-17f,5.252941892132012e-18f,5.963927661676738e-18f,0f,0.04289352567441743f,0.08239769618333471f,-0.1979534235095885f,-1.1376194192180976e-17f,0.08239769618333471f,-0.04289352567441743f,-0.04869916506399279f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_ground)", "{ transformation: [-0.1625639314958212f,-8.683895871210483e-19f,1.9889391508119457e-17f,-9.683531050181033e-18f,0f,0.16240920665425515f,0.007090939099548171f,-0.1827565900952369f,-1.9908339836316705e-17f,0.007090939099548171f,-0.16240920665425515f,0.0790720316823029f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/zzz/frames/93
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lowest)", "{ transformation: [-0.000018333333333333336f,4.859471474329754e-22f,2.1919659302562414e-21f,-7.765244979406221e-21f,0f,0.000017898760130532117f,-0.00000396805958886522f,-0.16092494611492433f,-2.2451857984368145e-21f,-0.00000396805958886522f,-0.000017898760130532117f,0.00006340803719744082f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_upper)", "{ transformation: [-0.000014583333333333333f,-1.4629590632030568e-21f,-1.0243749641469956e-21f,-8.357684452015046e-21f,0f,-0.000008364656363452757f,0.000011945967312547797f,-0.1609247992572589f,-1.785943248756557e-21f,0.000011945967312547797f,0.000008364656363452757f,0.00006824567261216859f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lower)", "{ transformation: [-0.000016666666666666667f,-1.810458296101227e-21f,9.424649353483558e-22f,-6.999840729939125e-21f,0f,0.000007695810220583899f,0.000014783513886303697f,-0.16093057111492431f,-2.041077998578922e-21f,0.000014783513886303697f,-0.000007695810220583899f,0.000057158037197440824f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_ground)", "{ transformation: [-0.000029166666666666666f,-1.5580350076003777e-22f,3.568486853032727e-21f,-9.827111171079592e-21f,0f,0.000029138906462804186f,0.0000012722321314889668f,-0.16092824764274716f,-3.571886497513114e-21f,0.0000012722321314889668f,-0.000029138906462804186f,0.00008024445234268043f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/zzz/frames/94
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lowest)", "{ transformation: [-0.000018333333333333336f,4.859471474329754e-22f,2.1919659302562414e-21f,-7.099253469178543e-21f,0f,0.000017898760130532117f,-0.00000396805958886522f,-0.16570595831780274f,-2.2451857984368145e-21f,-0.00000396805958886522f,-0.000017898760130532117f,0.00005796980381707868f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_upper)", "{ transformation: [-0.000014583333333333333f,-1.4629590632030568e-21f,-1.0243749641469956e-21f,-7.691692941787367e-21f,0f,-0.000008364656363452757f,0.000011945967312547797f,-0.1657058114601373f,-1.785943248756557e-21f,0.000011945967312547797f,0.000008364656363452757f,0.00006280743923180645f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lower)", "{ transformation: [-0.000016666666666666667f,-1.810458296101227e-21f,9.424649353483558e-22f,-6.333849219711447e-21f,0f,0.000007695810220583899f,0.000014783513886303697f,-0.16571158331780272f,-2.041077998578922e-21f,0.000014783513886303697f,-0.000007695810220583899f,0.00005171980381707868f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_ground)", "{ transformation: [-0.000029166666666666666f,-1.5580350076003777e-22f,3.568486853032727e-21f,-9.179004654001675e-21f,0f,0.000029138906462804186f,0.0000012722321314889668f,-0.16570961954022997f,-3.571886497513114e-21f,0.0000012722321314889668f,-0.000029138906462804186f,0.00007495226101429779f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/zzz/frames/95
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lowest)", "{ transformation: [-0.000018333333333333336f,4.859471474329754e-22f,2.1919659302562414e-21f,-6.237850728404252e-21f,0f,0.000017898760130532117f,-0.00000396805958886522f,-0.17047926653578355f,-2.2451857984368145e-21f,-0.00000396805958886522f,-0.000017898760130532117f,0.000050935916647536954f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_upper)", "{ transformation: [-0.000014583333333333333f,-1.4629590632030568e-21f,-1.0243749641469956e-21f,-6.830290201013075e-21f,0f,-0.000008364656363452757f,0.000011945967312547797f,-0.1704791196781181f,-1.785943248756557e-21f,0.000011945967312547797f,0.000008364656363452757f,0.00005577355206226473f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lower)", "{ transformation: [-0.000016666666666666667f,-1.810458296101227e-21f,9.424649353483558e-22f,-5.4724464789371555e-21f,0f,0.000007695810220583899f,0.000014783513886303697f,-0.17048489153578353f,-2.041077998578922e-21f,0.000014783513886303697f,-0.000007695810220583899f,0.00004468591664753695f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_ground)", "{ transformation: [-0.000029166666666666666f,-1.5580350076003777e-22f,3.568486853032727e-21f,-8.328935137948357e-21f,0f,0.000029138906462804186f,0.0000012722321314889668f,-0.17048315403578354f,-3.571886497513114e-21f,0.0000012722321314889668f,-0.000029138906462804186f,0.00006801091664753695f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/zzz/frames/96
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lowest)", "{ transformation: [-0.000018333333333333336f,4.859471474329754e-22f,2.1919659302562414e-21f,-5.139104885964979e-21f,0f,0.000017898760130532117f,-0.00000396805958886522f,-0.17521569408757517f,-2.2451857984368145e-21f,-0.00000396805958886522f,-0.000017898760130532117f,0.000041963975976934935f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_upper)", "{ transformation: [-0.000014583333333333333f,-1.4629590632030568e-21f,-1.0243749641469956e-21f,-5.7315443585738035e-21f,0f,-0.000008364656363452757f,0.000011945967312547797f,-0.17521554722990973f,-1.785943248756557e-21f,0.000011945967312547797f,0.000008364656363452757f,0.00004680161139166271f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lower)", "{ transformation: [-0.000016666666666666667f,-1.810458296101227e-21f,9.424649353483558e-22f,-4.373700636497883e-21f,0f,0.000007695810220583899f,0.000014783513886303697f,-0.17522131908757516f,-2.041077998578922e-21f,0.000014783513886303697f,-0.000007695810220583899f,0.00003571397597693493f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_ground)", "{ transformation: [-0.000029166666666666666f,-1.5580350076003777e-22f,3.568486853032727e-21f,-7.230189295509085e-21f,0f,0.000029138906462804186f,0.0000012722321314889668f,-0.17521958158757517f,-3.571886497513114e-21f,0.0000012722321314889668f,-0.000029138906462804186f,0.000059038975976934936f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/zzz/frames/97
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lowest)", "{ transformation: [-0.000018333333333333336f,4.859471474329754e-22f,2.1919659302562414e-21f,-3.747604778664844e-21f,0f,0.000017898760130532117f,-0.00000396805958886522f,-0.17985792506793985f,-2.2451857984368145e-21f,-0.00000396805958886522f,-0.000017898760130532117f,0.00003060151532077716f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_upper)", "{ transformation: [-0.000014583333333333333f,-1.4629590632030568e-21f,-1.0243749641469956e-21f,-4.340044251273668e-21f,0f,-0.000008364656363452757f,0.000011945967312547797f,-0.1798577782102744f,-1.785943248756557e-21f,0.000011945967312547797f,0.000008364656363452757f,0.000035439150735504926f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lower)", "{ transformation: [-0.000016666666666666667f,-1.810458296101227e-21f,9.424649353483558e-22f,-2.982200529197748e-21f,0f,0.000007695810220583899f,0.000014783513886303697f,-0.17986355006793983f,-2.041077998578922e-21f,0.000014783513886303697f,-0.000007695810220583899f,0.000024351515320777157f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_ground)", "{ transformation: [-0.000029166666666666666f,-1.5580350076003777e-22f,3.568486853032727e-21f,-5.83868918820895e-21f,0f,0.000029138906462804186f,0.0000012722321314889668f,-0.17986181256793984f,-3.571886497513114e-21f,0.0000012722321314889668f,-0.000029138906462804186f,0.00004767651532077716f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/zzz/frames/98
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lowest)", "{ transformation: [-0.000018333333333333336f,4.859471474329754e-22f,2.1919659302562414e-21f,-1.9752851414348126e-21f,0f,0.000017898760130532117f,-0.00000396805958886522f,-0.18425835734752752f,-2.2451857984368145e-21f,-0.00000396805958886522f,-0.000017898760130532117f,0.000016129427217791147f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_upper)", "{ transformation: [-0.000014583333333333333f,-1.4629590632030568e-21f,-1.0243749641469956e-21f,-2.5677246140436368e-21f,0f,-0.000008364656363452757f,0.000011945967312547797f,-0.18425821048986207f,-1.785943248756557e-21f,0.000011945967312547797f,0.000008364656363452757f,0.00002096706263251892f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lower)", "{ transformation: [-0.000016666666666666667f,-1.810458296101227e-21f,9.424649353483558e-22f,-1.2098808919677166e-21f,0f,0.000007695810220583899f,0.000014783513886303697f,-0.1842639823475275f,-2.041077998578922e-21f,0.000014783513886303697f,-0.000007695810220583899f,0.000009879427217791145f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_ground)", "{ transformation: [-0.000029166666666666666f,-1.5580350076003777e-22f,3.568486853032727e-21f,-4.0663695509789184e-21f,0f,0.000029138906462804186f,0.0000012722321314889668f,-0.1842622448475275f,-3.571886497513114e-21f,0.0000012722321314889668f,-0.000029138906462804186f,0.00003320442721779115f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/zzz/frames/99
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lowest)", "{ transformation: [-0.000018333333333333336f,4.859471474329754e-22f,2.1919659302562414e-21f,3.061616997868383e-22f,0f,0.000017898760130532117f,-0.00000396805958886522f,-0.187501875f,-2.2451857984368145e-21f,-0.00000396805958886522f,-0.000017898760130532117f,-0.0000025f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_upper)", "{ transformation: [-0.000014583333333333333f,-1.4629590632030568e-21f,-1.0243749641469956e-21f,-2.862777728219859e-22f,0f,-0.000008364656363452757f,0.000011945967312547797f,-0.18750172814233457f,-1.785943248756557e-21f,0.000011945967312547797f,0.000008364656363452757f,0.0000023376354147277718f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_wave_lower)", "{ transformation: [-0.000016666666666666667f,-1.810458296101227e-21f,9.424649353483558e-22f,1.0715659492539341e-21f,0f,0.000007695810220583899f,0.000014783513886303697f,-0.1875075f,-2.041077998578922e-21f,0.000014783513886303697f,-0.000007695810220583899f,-0.000008750000000000001f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_ground)", "{ transformation: [-0.000029166666666666666f,-1.5580350076003777e-22f,3.568486853032727e-21f,-1.7849227097572673e-21f,0f,0.000029138906462804186f,0.0000012722321314889668f,-0.1875057625f,-3.571886497513114e-21f,0.0000012722321314889668f,-0.000029138906462804186f,0.000014575000000000002f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/zzz/on_tick
    private static int f8(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "2"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.crash.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:lava_wave/animations/crash/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:lava_wave/animations/crash/pause")), Control.when("score", "@s", "aj.crash.frame", "matches", "130..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.crash.frame", "1"));
        return 1;
    }
    // animated_java:lava_wave/animations/crash/zzz/set_frame
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/animations/crash/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:lava_wave/animations/pause_all
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'lava_wave', 'function_path': 'animated_java:lava_wave/animations/pause_all'}")), Control.unless("entity", "@s[type=item_display,tag=aj.lava_wave.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.lava_wave.animation.crash.playing"));
        return 1;
    }
    // animated_java:lava_wave/apply_default_pose
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'lava_wave', 'function_path': 'animated_java:lava_wave/apply_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.lava_wave.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.8333333333333335f,-3.8987242242222477e-17f,2.2110763812534793e-16f,3.061616997868383e-17f,0f,1.8054808805223814f,0.3183549923893723f,0.25f,-2.2451857984368145e-16f,0.3183549923893723f,-1.8054808805223814f,-0.25f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.lava_wave.bone.wave_lowest]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.4583333333333333f,-8.929716243782781e-17f,1.546672223140489e-16f,1.071565949253934e-16f,0f,1.2629537138523064f,0.7291666666666665f,1.25f,-1.7859432487565567e-16f,0.7291666666666665f,-1.2629537138523064f,-0.875f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.lava_wave.bone.wave_upper]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.6666666666666667f,0f,2.041077998578922e-16f,1.071565949253934e-16f,0f,1.6666666666666667f,0f,0f,-2.041077998578922e-16f,0f,-1.6666666666666667f,-0.875f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.lava_wave.bone.wave_lower]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-2.9166666666666665f,0f,3.5718864975131134e-16f,-1.9900510486144489e-16f,0f,2.9166666666666665f,0f,0f,-3.5718864975131134e-16f,0f,-2.9166666666666665f,1.625f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.lava_wave.bone.ground]")));
        return 1;
    }
    // animated_java:lava_wave/on_load
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "aj.crash.frame", "dummy"));
        return 1;
    }
    // animated_java:lava_wave/remove/all
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/remove/this"), Control.as("@e[type=item_display,tag=aj.lava_wave.root]")));
        return 1;
    }
    // animated_java:lava_wave/remove/this
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'lava_wave', 'function_path': 'animated_java:lava_wave/remove/this'}")), Control.unless("entity", "@s[type=item_display,tag=aj.lava_wave.root]")));
        Logic.step(() -> Logic.call(c, "#animated_java:lava_wave/as_root/on_remove"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // animated_java:lava_wave/root/on_load
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.lava_wave.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/root/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.lava_wave.data]"), Control.unless("data", "entity", "@s", "{data:{rigHash: '00aa5c935084e148e66ca730ae9f0c728c0e305fdc1ec63287c88622a2ed3899'}}"), Control.on("vehicle")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.is_rig_loaded", "1"));
        return 1;
    }
    // animated_java:lava_wave/root/on_tick
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.lava_wave.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "#animated_java:global/root/on_load"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1")));
        Logic.step(() -> Logic.call(c, "#animated_java:lava_wave/as_root/pre_tick"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/animations/crash/zzz/on_tick"), Control.when("entity", "@s[tag=aj.lava_wave.animation.crash.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:lava_wave/as_root/post_tick"));
        return 1;
    }
    // animated_java:lava_wave/root/outdated_tellraw
    private static int f17(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The \",\"color\":\"red\"},{\"text\":\"lava_wave\",\"color\":\"yellow\"},{\"text\":\" rig instance at\",\"color\":\"red\"},[{\"text\":\" [\",\"color\":\"yellow\"},{\"score\":{\"name\":\"#this.x\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.y\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.z\",\"objective\":\"aj.i\"}},\"]\"],{\"text\":\" is outdated! It will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"},\"\\n \",{\"text\":\"[Click Here to Teleport to the Rig Instance]\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/tp @s $(x) $(y) $(z)\"},\"color\":\"aqua\",\"underlined\":true}]"));
        return 1;
    }
    // animated_java:lava_wave/root/zzz/0
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1"), Control.store("result", "storage", "aj:temp", "x", "int", "1"), Control.store("result", "score", "#this.x", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1"), Control.store("result", "storage", "aj:temp", "y", "int", "1"), Control.store("result", "score", "#this.y", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1"), Control.store("result", "storage", "aj:temp", "z", "int", "1"), Control.store("result", "score", "#this.z", "aj.i")));
        Logic.step(() -> Logic.call(c, "animated_java:lava_wave/root/outdated_tellraw", "with", "storage", "aj:temp"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.rigHash", "set", "value", "'00aa5c935084e148e66ca730ae9f0c728c0e305fdc1ec63287c88622a2ed3899'"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{Glowing: 1b, glow_color_override: 16711680}"), Control.on("passengers")));
        Logic.step(() -> Native.summon(c, "minecraft:text_display", "~", "~", "~", "{Tags:['aj.rig_entity', 'aj.outdated_rig_text_display', 'aj.new'], text:'[\"\",{\"text\":\"This rig instance is outdated!\\\\nIt will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"}]', billboard: \"vertical\", transformation:{translation:[0f,3f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[1f,1f,1f]}}"));
        Logic.step(() -> Native.ride(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "mount", "@s"));
        Logic.step(() -> Native.tag(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "remove", "aj.new"));
        return 1;
    }
    // animated_java:lava_wave/set_default_pose
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'lava_wave', 'function_path': 'animated_java:lava_wave/set_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.lava_wave.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.8333333333333335f,-3.8987242242222477e-17f,2.2110763812534793e-16f,3.061616997868383e-17f,0f,1.8054808805223814f,0.3183549923893723f,0.25f,-2.2451857984368145e-16f,0.3183549923893723f,-1.8054808805223814f,-0.25f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.lava_wave.bone.wave_lowest]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.4583333333333333f,-8.929716243782781e-17f,1.546672223140489e-16f,1.071565949253934e-16f,0f,1.2629537138523064f,0.7291666666666665f,1.25f,-1.7859432487565567e-16f,0.7291666666666665f,-1.2629537138523064f,-0.875f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.lava_wave.bone.wave_upper]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.6666666666666667f,0f,2.041077998578922e-16f,1.071565949253934e-16f,0f,1.6666666666666667f,0f,0f,-2.041077998578922e-16f,0f,-1.6666666666666667f,-0.875f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.lava_wave.bone.wave_lower]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-2.9166666666666665f,0f,3.5718864975131134e-16f,-1.9900510486144489e-16f,0f,2.9166666666666665f,0f,0f,-3.5718864975131134e-16f,0f,-2.9166666666666665f,1.625f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.lava_wave.bone.ground]")));
        return 1;
    }
    // animated_java:lava_wave/summon
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "args", "set", "value", "{variant:'', animation:'', frame: 0}"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "aj:temp", "args", "set", "value", "$(args)"), Control.store("success", "score", "#success", "aj.i")));
        Logic.step(() -> Native.summon(c, "minecraft:item_display", "~", "~", "~", "{ Tags:['aj.new','aj.rig_entity','aj.rig_root','aj.lava_wave.root'], teleport_duration: 0, interpolation_duration: 2, Passengers:[{id:\"minecraft:marker\",Tags:[\"aj.rig_entity\",\"aj.data\",\"aj.lava_wave.data\"],data:{rigHash:\"00aa5c935084e148e66ca730ae9f0c728c0e305fdc1ec63287c88622a2ed3899\",locators:{},cameras:{},bones:{data_data:\"\",bone_wave_lowest:\"\",bone_wave_upper:\"\",bone_wave_lower:\"\",bone_ground:\"\"}}},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.lava_wave.bone\",\"aj.lava_wave.bone.wave_lowest\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":12},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.lava_wave.bone\",\"aj.lava_wave.bone.wave_upper\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":14},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.lava_wave.bone\",\"aj.lava_wave.bone.wave_lower\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":13},count:1},height:48f,width:48f},{Tags:[\"aj.rig_entity\",\"aj.bone\",\"aj.lava_wave.bone\",\"aj.lava_wave.bone.ground\"],id:\"minecraft:item_display\",transformation:{translation:[0f,0f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[0f,0f,0f]},interpolation_duration:2,teleport_duration:0,item_display:\"head\",item:{id:\"minecraft:green_dye\",components:{\"minecraft:custom_model_data\":15},count:1},height:48f,width:48f}], }"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/zzz/0"), Control.as("@e[type=item_display,tag=aj.new,limit=1,distance=..0.01]")));
        return 1;
    }
    // animated_java:lava_wave/uninstall
    private static int f21(Frame c) {

        return 1;
    }
    // animated_java:lava_wave/zzz/0
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "add", "aj.last_id", "aj.id", "1"), Control.store("result", "score", "@s", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/zzz/2"), Control.when("data", "storage", "aj:temp", "args.variant")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/set_default_pose"), Control.unless("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:lava_wave/zzz/3", "with", "storage", "aj:temp", "args"), Control.when("data", "storage", "aj:temp", "args.animation")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "teleport_duration", "set", "value", "2"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:lava_wave/as_root/on_summon"));
        return 1;
    }
    // animated_java:lava_wave/zzz/1
    private static int f23(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.data_data", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.lava_wave.bone.wave_lowest]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_wave_lowest", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.lava_wave.bone.wave_upper]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_wave_upper", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.lava_wave.bone.wave_lower]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_wave_lower", "set", "from", "storage", "aj:uuid", "main.out"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"), Control.on("vehicle"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.lava_wave.bone.ground]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.bones.bone_ground", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
}
