package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled152 {
    public static void register() {
        Logic.register("animated_java:walking_diamond/animations/walk/next_frame", Compiled152::f0);
        Logic.register("animated_java:walking_diamond/animations/walk/pause", Compiled152::f1);
        Logic.register("animated_java:walking_diamond/animations/walk/play", Compiled152::f2);
        Logic.register("animated_java:walking_diamond/animations/walk/resume", Compiled152::f3);
        Logic.register("animated_java:walking_diamond/animations/walk/set_frame", Compiled152::f4, "frame");
        Logic.register("animated_java:walking_diamond/animations/walk/stop", Compiled152::f5);
        Logic.register("animated_java:walking_diamond/animations/walk/tween", Compiled152::f6, "duration", "to_frame");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/apply_frame", Compiled152::f7, "frame");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/0", Compiled152::f8, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/1", Compiled152::f9, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/10", Compiled152::f10, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/11", Compiled152::f11, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/12", Compiled152::f12, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/13", Compiled152::f13, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/14", Compiled152::f14, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/15", Compiled152::f15, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/2", Compiled152::f16, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/3", Compiled152::f17, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/4", Compiled152::f18, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/5", Compiled152::f19, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/6", Compiled152::f20, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/7", Compiled152::f21, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/8", Compiled152::f22, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/walk/zzz/frames/9", Compiled152::f23, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
    }
    // animated_java:walking_diamond/animations/walk/next_frame
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/walk/next_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.walk.frame", "1"), Control.when("score", "@s", "aj.walk.frame", "matches", "16..")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.walk.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/walk/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.walk.frame", "1"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/pause
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/walk/pause'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.walking_diamond.animation.walk.playing"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/play
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/walk/play'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.walking_diamond.animation.walk.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.walk.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/walk/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/resume
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/walk/resume'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.walking_diamond.animation.walk.playing"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/set_frame
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/walk/set_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.walk.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/walk/zzz/set_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/stop
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/walk/stop'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.walking_diamond.animation.walk.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.walk.frame", "0"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/walk/zzz/set_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/tween
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/walk/tween'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/animations/pause_all"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.walking_diamond.animation.walk.playing"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.tween_duration", "$(duration)"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.walk.frame", "$(to_frame)"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.i", "=", "@s", "aj.tween_duration"));
        Logic.step(() -> Native.tag(c, "@s", "add", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/walk/zzz/apply_frame", "{frame: 0}"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/walk/zzz/apply_frame", "{frame: $(to_frame)}"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.transforms_only"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "#this", "aj.i"), Control.on("passengers"), Control.store("result", "entity", "@s", "interpolation_duration", "int", "1")));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/apply_frame
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/walk/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/0
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,0f,9.184850993605148e-17f,0f,0f,0.5f,0f,0.390625f,-6.123233995736766e-17f,0f,-0.75f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-0.05625f,0f,1f,0f,0.171875f,-1.2246467991473532e-16f,0f,-1f,-6.888638245203862e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0.0546875f,0f,1f,0f,0.171875f,-1.2246467991473532e-16f,0f,-1f,6.697287182837088e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.96386463825654f,-0.12725410637805254f,0.2340328001125324f,-0.14375000000000002f,-0.174055625746606f,0.9659080367217209f,-0.19164108051863038f,0.421875f,-0.20166704803846042f,-0.22545078621799933f,-0.9531538935183234f,-1.7604297737743203e-17f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.95008776981561f,-0.006957978106525098f,-0.31190513972595796f,0.1375f,0.08312190921349344f,0.9579687387678043f,-0.2745662829852311f,0.421875f,0.30070579950427295f,-0.286788218175523f,-0.909576022144496f,1.683889348827611e-17f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/1
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.49984544680966414f,-0.01243097470459935f,0.000019646040410787707f,-0.0015538718380749188f,-0.012430981604331778f,0.49984516937382295f,-0.0007899604520131423f,0.3906056461717279f,-6.121341265038338e-17f,-0.0005268031395538904f,-0.7499995837175627f,-0.0000658503924442363f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.9996908936193283f,-0.024264045119210476f,-0.005419716693874181f,-0.05234793317089992f,-0.024861963208663556f,0.9756488151985764f,0.21792492328098959f,0.170524899140193f,-1.2242682530076676e-16f,0.2179923060937405f,-0.9759504877215509f,0.00016462598111058386f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.9996908936193283f,-0.02416830901601699f,0.005831813945527766f,0.058555275339994314f,-0.024861963208663556f,0.9717992997862245f,-0.23449521044237695f,0.1732830231836541f,-1.2242682530076676e-16f,-0.23456771682034575f,-0.9720997820315002f,0.00016462598111059744f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.9612862711335765f,-0.13791834002922154f,0.2385523766674481f,-0.14603637371489084f,-0.18475150762340953f,0.9649018052113688f,-0.18663168737038976f,0.4182720620463464f,-0.20443968636490634f,-0.22347939006410789f,-0.95302747959101f,-0.00009877558866637207f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.9524069369505898f,-0.01315416765481944f,-0.3045455537710319f,0.13512669011554526f,0.07722963104273932f,0.9560601243462267f,-0.28281552772802265f,0.425264489198783f,0.2948840628745439f,-0.29287541123895416f,-0.9095424030545335f,-0.00009877558866633763f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/10
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.499586566558007f,0.020319614491717583f,-0.0009195155260398075f,0.002539951811464698f,0.02032885916085987f,0.4993593766070503f,-0.02259731354898236f,0.3905449220758813f,-6.123591907185221e-17f,-0.015077342654661223f,-0.7496589330566044f,-0.001884667831832653f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.999173133116014f,0.03748345870840959f,-0.01574929783778494f,-0.06255336826643754f,0.04065771832171974f,0.9211649453948538f,-0.3870427538613373f,0.1743621914658935f,-1.2247183814370442e-16f,-0.38736305154073614f,-0.9219272565127082f,0.004711669579581626f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.999173133116014f,0.03888911242567547f,0.011861154828745736f,0.04829240118862027f,0.04065771832171974f,0.9557092210387358f,0.2914907112798013f,0.16985172583957772f,-1.2247183814370442e-16f,0.29173193475565196f,-0.9565001193119236f,0.0047116695795816396f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.9723868777427576f,-0.0670140544351299f,0.22354613953691352f,-0.13982121016823f,-0.11912450025338797f,0.966223809165245f,-0.22851893584905542f,0.4275994301225692f,-0.20068162206109544f,-0.24883863669126943f,-0.9475263687394446f,-0.0028270017477489973f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.9420965363236222f,0.0935128359728322f,-0.32203954067063306f,0.14119623352064897f,0.19145975906339344f,0.9384177042157116f,-0.2876028043568085f,0.4161644468445855f,0.275313052553673f,-0.3326072186871949f,-0.9019840138110802f,-0.0028270017477489626f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/11
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.4995241107909289f,0.021806371960682507f,-0.0005709474576337729f,0.0027257964950853134f,0.021809693682668f,0.4994480308493561f,-0.013076846710118897f,0.3905560038561695f,-6.114695528339176e-17f,-0.008726203218641754f,-0.7498857713672935f,-0.0010907754023302193f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.9990482215818578f,0.04000159862188862f,-0.017393190099017266f,-0.06301095370169278f,0.043619387365336f,0.9161872363981844f,-0.39836954816718884f,0.17450108089887637f,-1.2229391056678352e-16f,-0.39874906892524614f,-0.917060074385124f,0.002726938505825541f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.9990482215818578f,0.04124294101018729f,0.014201083443084373f,0.04782095838004456f,0.043619387365336f,0.9446186514251088f,0.32525828571410986f,0.16966205511303442f,-1.2229391056678352e-16f,0.32556815445715664f,-0.945518575599317f,0.0027269385058255546f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.974331843725238f,0.019745111977345527f,0.22424894393503983f,-0.13952448710976412f,-0.03035971122993457f,0.9755203475409341f,-0.21780344227686202f,0.42804179271802134f,-0.22305996108000542f,-0.219020962664804f,-0.949881082913208f,-0.0016361631034953466f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.9295391543962981f,0.1768790511673606f,-0.323528610330446f,0.14145782521013342f,0.2715238583351156f,0.9219922483160925f,-0.27605269134686783f,0.41577384002152057f,0.24946293271551861f,-0.34444752184211064f,-0.9050547772912982f,-0.001636163103495312f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/12
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.49958083038019013f,0.02046843122298305f,-0.0002894646729278175f,0.0025585539028728814f,0.020469340894120377f,0.4995586286754792f,-0.007064761020643963f,0.3905698285844349f,-6.11674539568916e-17f,-0.0047137924375971665f,-0.749966669500668f,-0.0005892240546996458f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.9991616607603803f,0.03808370595613085f,-0.01502021994532036f,-0.06259922817495359f,0.040938681788240755f,0.9294822702856945f,-0.36658796155628515f,0.1743157293895013f,-1.223349079137832e-16f,-0.3668955444880711f,-0.9302621455454381f,0.0014730601367491077f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.9991616607603803f,0.03887879786466685f,0.012822431249853192f,0.04824526856565109f,0.040938681788240755f,0.9488875202128734f,0.3129480760728605f,0.16977409437861835f,-1.223349079137832e-16f,0.31321065285341443f,-0.9496836773047843f,0.0014730601367491214f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.9734052701033634f,0.03970134064976962f,0.2256235441739387f,-0.13979165787999534f,-0.008808042769501877f,0.9776549834972016f,-0.2100313110601776f,0.42767717838371194f,-0.22892050698347f,-0.20643288689958636f,-0.951304822172543f,-0.0008838360820494863f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.9258206768294797f,0.19589658547066996f,-0.32323459306815633f,0.14122255920886162f,0.28866383653532707f,0.9185351595623126f,-0.27012284265597186f,0.41616317413076925f,0.2439861959859822f,-0.3433914507508442f,-0.9069471030437886f,-0.0008838360820494519f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/13
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.4997267868442183f,0.016526778183630814f,-0.00009620161190168428f,0.002065847272953852f,0.0165269026243037f,0.499723024110267f,-0.0029088646250152723f,0.3905903780137834f,-6.120565725927439e-17f,-0.0019403033161278587f,-0.7499943528133016f,-0.00024253791451598234f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.9994535736884366f,0.031632538114376094f,-0.00958835616022945f,-0.061383881702359186f,0.0330538052486074f,0.9564784757900399f,-0.28992476836060277f,0.17382083151077574f,-1.2241131451854878e-16f,-0.2900832774959711f,-0.9570014065387759f,0.0006063447862899489f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.9994535736884366f,0.0319261088812683f,0.008560234407670588f,0.049492999128701747f,0.0330538052486074f,0.9653552253773905f,0.25883727474062684f,0.17015392499100837f,-1.2241131451854878e-16f,0.25897878756428877f,-0.9658830092675463f,0.0006063447862899626f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.973747115066395f,0.01375473900994586f,0.22721655541496322f,-0.140572680308282f,-0.03348876764040376f,0.9786553679973671f,-0.20276136992007385f,0.4265745515251624f,-0.22515563137927466f,-0.2050475014349267f,-0.9525022119730189f,-0.0003638068717739911f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.9327442551852854f,0.16547827207703603f,-0.32032030202477907f,0.1405236372915908f,0.25655854304192943f,0.9288524147936789f,-0.2672281899877967f,0.41727816879899154f,0.2533098269137021f,-0.33143646902890744f,-0.908836618202964f,-0.00036380687177395667f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/14
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.4999009806986009f,0.009950347602451932f,-0.000013346410359455039f,0.0012437934503064915f,0.009950351580573903f,0.49990078083962525f,-0.0006705173755436934f,0.39061259760495315f,-6.121936655736919e-17f,-0.0004471001267802128f,-0.749999700152155f,-0.0000558875158475266f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.9998019613972018f,0.019616123181193323f,-0.0033534605482051297f,-0.059348343954358826f,0.019900703161147806f,0.9855047971297419f,-0.16847627977836574f,0.17302542054043166f,-1.2243873311473838e-16f,-0.16850965119424624f,-0.9857000037812689f,0.00013971878961880962f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.9998019613972018f,0.019644501916284064f,0.0031830065612923207f,0.05156718613814325f,0.019900703161147806f,0.9869305314254593f,0.15991275169276759f,0.17081768628349184f,-1.2243873311473838e-16f,0.159944426863589f,-0.9871260204833414f,0.0001397187896188232f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.9690556563239603f,-0.08985186558326713f,0.2299081929765551f,-0.14185584177538804f,-0.13673733835617766f,0.9708365119406556f,-0.19692477594799912f,0.42471712248684473f,-0.20550920963744326f,-0.22226810237662972f,-0.9530807182081094f,-0.00008383127377130751f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.9478267818507681f,0.035845039345939855f,-0.3167641468990836f,0.13933845986757498f,0.125899645128248f,0.9549734232251328f,-0.26865412762556395f,0.41912004972277195f,0.29287142394401927f,-0.29451807090221066f,-0.9096622642217511f,-0.00008383127377127307f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/15
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,0f,9.184850993605148e-17f,0f,0f,0.5f,0f,0.390625f,-6.123233995736766e-17f,0f,-0.75f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-0.05625f,0f,1f,0f,0.171875f,-1.2246467991473532e-16f,0f,-1f,-6.888638245203862e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0.0546875f,0f,1f,0f,0.171875f,-1.2246467991473532e-16f,0f,-1f,6.697287182837088e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.96386463825654f,-0.12725410637805254f,0.2340328001125324f,-0.14375000000000002f,-0.174055625746606f,0.9659080367217209f,-0.19164108051863038f,0.421875f,-0.20166704803846042f,-0.22545078621799933f,-0.9531538935183234f,-1.7604297737743203e-17f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.95008776981561f,-0.006957978106525098f,-0.31190513972595796f,0.1375f,0.08312190921349344f,0.9579687387678043f,-0.2745662829852311f,0.421875f,0.30070579950427295f,-0.286788218175523f,-0.909576022144496f,1.683889348827611e-17f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/2
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.4995999322646797f,-0.019997343444418694f,0.00017707811913350634f,-0.0024996679305523367f,-0.019997691895003566f,0.49959122696561253f,-0.004423921359980278f,0.3905739033707016f,-6.118334579021744e-17f,-0.0029516426206109268f,-0.7499869315949048f,-0.00036895532757636585f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.9991998645293594f,-0.03801072638064374f,-0.012442483856762646f,-0.049955822553395625f,-0.03999538379000713f,0.9496174070891436f,0.3108490782176809f,0.16975300123505818f,-1.2236669158043488e-16f,0.3110979987613352f,-0.9503778381079244f,0.0009223883189409078f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.9991998645293594f,-0.037338398892675435f,0.014334388464159138f,0.06089291241783019f,-0.03999538379000713f,0.9328207302920313f,-0.35811430355813956f,0.1741899891242621f,-1.2236669158043488e-16f,-0.358401072969338f,-0.9335677109317926f,0.0009223883189409213f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.9650036783150697f,-0.10285958385364555f,0.24122148919165667f,-0.14738448242192395f,-0.15030792198398563f,0.9707196178229669f,-0.18737916683155845f,0.41604901863623883f,-0.21488468867567503f,-0.2170790860103473f,-0.9522086121169407f,-0.0005534329913645664f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.9533895405060401f,0.038058822826167876f,-0.29933244070559467f,0.13364047947695842f,0.12927296796197232f,0.947880848021973f,-0.2912222479609825f,0.42729772032717833f,0.27264791179832065f,-0.31634383818597045f,-0.9086196631340221f,-0.000553432991364532f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/3
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.4995241107909289f,-0.021806371960682507f,0.0005709474576339566f,-0.0027257964950853134f,-0.021809693682668f,0.4994480308493561f,-0.013076846710118897f,0.3905560038561695f,-6.120116539201603e-17f,-0.008726203218641761f,-0.7498857713672935f,-0.0010907754023302201f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.9990482215818578f,-0.04124294101018738f,-0.014201083443084142f,-0.04938197122626622f,-0.043619387365336f,0.9446186514251088f,0.32525828571410986f,0.1695938998202761f,-1.2240233078403207e-16f,0.3255681544571566f,-0.945518575599317f,0.0027269385058255433f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.9990482215818578f,-0.040001598621888526f,0.01739319009901749f,0.06144994085547113f,-0.043619387365336f,0.9161872363981844f,-0.39836954816718884f,0.17443292560611803f,-1.2240233078403207e-16f,-0.39874906892524614f,-0.917060074385124f,0.0027269385058255567f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.9684597648342751f,-0.056395879167787995f,0.24270391160843047f,-0.14770187659502004f,-0.10629086557941085f,0.9744837603771382f,-0.197695858974365f,0.4155012188504872f,-0.22536178866773354f,-0.21725769393539243f,-0.9497426802215194f,-0.0016361631034953479f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.9491338898868562f,0.10022174456007721f,-0.2984970033108871f,0.1332804357248775f,0.19392353338628607f,0.9329256655087903f,-0.30338649580025545f,0.42776917154698796f,0.24806959158111885f,-0.345839998485304f,-0.9049067207068703f,-0.0016361631034953134f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/4
    private static int f18(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.499586566558007f,-0.020318849551534082f,0.0009567927097589939f,-0.0025398561939417603f,-0.02032885916085986f,0.49934057801944304f,-0.023513409237272874f,0.3905425722524304f,-6.118170896322793e-17f,-0.015688578524220412f,-0.7496307118400041f,-0.0019610723155275515f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.999173133116014f,-0.038888659883363354f,-0.011862638475667611f,-0.049853848252921384f,-0.04065771832171972f,0.9556980997033881f,0.2915271722570721f,0.16979407271332733f,-1.2236341792645587e-16f,0.2917684259062467f,-0.956488988773102f,0.004902680788818872f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.999173133116014f,-0.03748514350424277f,0.015745287409083073f,0.060991921202136416f,-0.04065771832171972f,0.9212063496546323f,-0.38694419661865836f,0.1743045383396431f,-1.2236341792645587e-16f,-0.3872644127368969f,-0.92196869503663f,0.004902680788818886f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.9692428644054106f,-0.03994369485705935f,0.24284309963505443f,-0.14744092217633967f,-0.093148538267776f,0.9728735295847916f,-0.21175562625773703f,0.4159068113698984f,-0.22779732135776204f,-0.22786310950743188f,-0.9466714233079144f,-0.002941608473291345f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.9464882673721161f,0.12067325303809882f,-0.2993291260938917f,0.1335765215125393f,0.21751357326133003f,0.9236934165606829f,-0.3154018352031908f,0.427341794647882f,0.23842777768963483f,-0.36363228432532746f,-0.9005130518889365f,-0.0029416084732913103f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/5
    private static int f19(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.4997455747015544f,-0.015933937373173033f,0.0010285735277915076f,-0.001991742171646629f,-0.015948685407052264f,0.4992834510544584f,-0.03222993341768672f,0.3905354313818073f,-6.12011818446313e-17f,-0.021497561325369938f,-0.7493064616219384f,-0.002687195165671242f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.9994911494031088f,-0.031121738728497494f,-0.006991397812142197f,-0.051242021724808295f,-0.03189737081410453f,0.9751870332652817f,0.21907260870863338f,0.17030469443718835f,-1.224023636892626e-16f,0.21918414068945227f,-0.9756835104019265f,0.006717987914178099f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.9994911494031088f,-0.03016557093583752f,0.010367284840663061f,0.05963902766209909f,-0.03189737081410453f,0.9452259041277888f,-0.32485465657883345f,0.17384330901187808f,-1.224023636892626e-16f,-0.32502004322182854f,-0.9457071277642358f,0.0067179879141781125f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.9690814294770933f,-0.05373938410480559f,0.24081790140824208f,-0.14666446598416685f,-0.10947334521444568f,0.9683167321494777f,-0.224451092505507f,0.4171554000181834f,-0.22112613986182733f,-0.24387452682761476f,-0.9442607931257203f,-0.004030792748506881f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.9475798380139199f,0.10708768834137307f,-0.30103932898412844f,0.13444241978545754f,0.206898494557137f,0.9236111634766273f,-0.32270021947829775f,0.4261265355596503f,0.2434860643640694f,-0.3680688056696086f,-0.8973515981784643f,-0.004030792748506847f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/6
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.4999221306614421f,-0.008812969297694892f,0.000662122295562296f,-0.0011016211622118615f,-0.008824016938107913f,0.4992962297851411f,-0.037512347389813475f,0.39053702872314267f,-6.124990876805814e-17f,-0.025012126948771838f,-0.7490610024473119f,-0.0031265158685964797f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.9998442613228842f,-0.017544565571588844f,-0.0019082239387138754f,-0.053487186793882584f,-0.017648033876215826f,0.993982294412818f,0.10810987602496877f,0.17110222628660626f,-1.2249981753611627e-16f,0.1081267155366073f,-0.9941371200127606f,0.007816289671491193f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.9998442613228842f,-0.01725891303011835f,0.0036855149863855375f,0.057433035946624876f,-0.017648033876215826f,0.9777987321913941f,-0.2088017869301082f,0.17306005504474894f,-1.2249981753611627e-16f,-0.20883431050936332f,-0.9779510369921792f,0.007816289671491207f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.9637207930123701f,-0.12312563581832625f,0.23681704102522094f,-0.1453800443084824f,-0.17955589103466799f,0.9555377279661759f,-0.2338959863443257f,0.41920613821500796f,-0.1974890252909126f,-0.2679323202556411f,-0.9429795101973711f,-0.004689773802894737f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.951750246010282f,0.03877835421883916f,-0.30441371267314127f,0.1358261541885788f,0.14166772646732584f,0.9354739347150978f,-0.3237572744298293f,0.4241696477426936f,0.27221631930680895f,-0.35126166416609017f,-0.8958311887796284f,-0.004689773802894703f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/7
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,3.2046530646618547e-18f,9.172263474533996e-17f,4.0058163308273184e-19f,0f,0.4993147673772869f,-0.03925196718220787f,0.3905393459221609f,-6.123233995736766e-17f,-0.026167978121471914f,-0.7489721510659304f,-0.0032709972651839892f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,6.4093061293237094e-18f,1.2229684632711994e-16f,-0.05625f,0f,0.9986295347545738f,-0.05233595624294383f,0.17208913519459784f,-1.2246467991473532e-16f,-0.05233595624294383f,-0.9986295347545738f,0.008177493162959966f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,6.4093061293237094e-18f,1.2229684632711994e-16f,0.0546875f,0f,0.9986295347545738f,-0.05233595624294383f,0.17208913519459784f,-1.2246467991473532e-16f,-0.05233595624294383f,-0.9986295347545738f,0.00817749316295998f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.9538507168760617f,-0.1888202996347353f,0.23348598322141756f,-0.14375000000000002f,-0.244878179021846f,0.9391496074163408f,-0.240899755767161f,0.42174651888324133f,-0.17379150541372274f,-0.28695802713216073f,-0.9420464974248617f,-0.004906495897776001f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.9499597175086606f,-0.02644356168464591f,-0.3112511416144463f,0.1375f,0.07898002733542728f,0.9437025387279847f,-0.3212283824328907f,0.42174651888324133f,0.3022229150692596f,-0.3297366471046048f,-0.8943908838775428f,-0.004906495897775968f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/8
    private static int f22(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.4999221306614421f,0.008813002208553508f,-0.0006611359475208905f,0.0011016252760691885f,0.008824016938107915f,0.49929809434032857f,-0.037456466126461405f,0.39053726179254106f,-6.124990876805814e-17f,-0.024974866970384042f,-0.7490637997157359f,-0.0031218583712980053f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.9998442613228842f,0.017208572135384657f,-0.00391384015479993f,-0.058995302889585204f,0.01764803387621583f,0.9749466833420752f,-0.22173748339103883f,0.17308704742418446f,-1.2249981753611627e-16f,-0.22177202187234651f,-0.9750985438993597f,0.007804645928245006f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.9998442613228842f,0.017566627286627275f,0.0016931348052602515f,0.051924919850922256f,0.01764803387621583f,0.9952321945054202f,0.09592406330128672f,0.17112921866604178f,-1.2249981753611627e-16f,0.09593900471496483f,-0.9953872147934701f,0.00780464592824502f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.9536579445465857f,-0.1942639262022195f,0.2297782665520827f,-0.14207517465106084f,-0.24951827498465015f,0.9373583969951004f,-0.24310464008624005f,0.42428029755851765f,-0.16815812573844263f,-0.28917254807341997f,-0.9423916819395529f,-0.004682787556947026f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.9477291728425248f,-0.03169407290194793f,-0.3174978750891253f,0.13913102384600035f,0.07357302761737738f,0.9465340628870424f,-0.31410233587441083f,0.41931678803083194f,0.3104777359979882f,-0.32104322689855114f,-0.8947261155862888f,-0.004682787556946992f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/zzz/frames/9
    private static int f23(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.4997455747015544f,0.015934305026309405f,-0.0010156778370716373f,0.0019917881282886757f,0.015948685407052264f,0.4992949713160496f,-0.0318258521905886f,0.3905368714145062f,-6.114697173600703e-17f,-0.021228036692867727f,-0.7493237508119398f,-0.002653504586608466f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.9994911494031088f,0.0301054735079158f,-0.010540527961950824f,-0.06120084747464656f,0.03189737081410453f,0.9433427756511568f,-0.3302831593677139f,0.17388954857202787f,-1.2229394347201406e-16f,-0.3304513097139053f,-0.9438230405687099f,0.006633761466521158f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.9994911494031088f,0.031158365418582776f,0.006826311543912446f,0.04968020191226082f,0.03189737081410453f,0.9763347157117621f,0.2138996975948779f,0.17035093399733814f,-1.2229394347201406e-16f,0.21400859599669061f,-0.9768317771446244f,0.006633761466521172f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [-0.9611211073656921f,-0.15867874713131683f,0.22598068984977746f,-0.1406891705342639f,-0.2125981943773301f,0.9474854982482322f,-0.2389000593486699f,0.42632805417628683f,-0.17620506440975148f,-0.2776549762171293f,-0.9443831264154505f,-0.003980256879912716f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [-0.9470525471664244f,0.003774081108345857f,-0.3210564268432811f,0.14041771523536048f,0.10624946538385413f,0.9472794019815065f,-0.3022793173328351f,0.41735691863481994f,0.3029893133614331f,-0.32038647114593843f,-0.8975243646249499f,-0.003980256879912682f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
}
