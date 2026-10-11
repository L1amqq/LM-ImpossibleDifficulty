package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled142 {
    public static void register() {
        Logic.register("animated_java:sculk_hand/animations/grab/zzz/frames/8", Compiled142::f0, "bone_finger_lower_1", "bone_finger_lower_2", "bone_finger_lower_3", "bone_finger_lower_4", "bone_finger_lower_5", "bone_finger_upper_1", "bone_finger_upper_2", "bone_finger_upper_3", "bone_finger_upper_4", "bone_finger_upper_5", "bone_hand", "bone_lower_arm", "bone_lower_arm_2");
        Logic.register("animated_java:sculk_hand/animations/grab/zzz/frames/9", Compiled142::f1, "bone_finger_lower_1", "bone_finger_lower_2", "bone_finger_lower_3", "bone_finger_lower_4", "bone_finger_lower_5", "bone_finger_upper_1", "bone_finger_upper_2", "bone_finger_upper_3", "bone_finger_upper_4", "bone_finger_upper_5", "bone_hand", "bone_lower_arm", "bone_lower_arm_2");
        Logic.register("animated_java:sculk_hand/animations/grab/zzz/on_tick", Compiled142::f2);
        Logic.register("animated_java:sculk_hand/animations/grab/zzz/set_frame", Compiled142::f3, "frame");
        Logic.register("animated_java:sculk_hand/animations/pause_all", Compiled142::f4);
        Logic.register("animated_java:sculk_hand/apply_default_pose", Compiled142::f5);
        Logic.register("animated_java:sculk_hand/as_own_locator_entities", Compiled142::f6, "command");
        Logic.register("animated_java:sculk_hand/on_load", Compiled142::f7);
        Logic.register("animated_java:sculk_hand/remove/all", Compiled142::f8);
        Logic.register("animated_java:sculk_hand/remove/this", Compiled142::f9);
        Logic.register("animated_java:sculk_hand/remove/zzz/0", Compiled142::f10);
        Logic.register("animated_java:sculk_hand/remove/zzz/kill", Compiled142::f11, "uuid");
        Logic.register("animated_java:sculk_hand/remove/zzz/kill_passengers", Compiled142::f12);
        Logic.register("animated_java:sculk_hand/root/on_load", Compiled142::f13);
        Logic.register("animated_java:sculk_hand/root/on_tick", Compiled142::f14);
        Logic.register("animated_java:sculk_hand/root/outdated_tellraw", Compiled142::f15, "x", "y", "z");
        Logic.register("animated_java:sculk_hand/root/zzz/0", Compiled142::f16);
        Logic.register("animated_java:sculk_hand/root/zzz/1", Compiled142::f17);
        Logic.register("animated_java:sculk_hand/root/zzz/2", Compiled142::f18, "posx", "posy", "posz", "rotx", "roty", "uuid");
        Logic.register("animated_java:sculk_hand/root/zzz/3", Compiled142::f19);
        Logic.register("animated_java:sculk_hand/set_default_pose", Compiled142::f20);
        Logic.register("animated_java:sculk_hand/summon/default", Compiled142::f21);
        Logic.register("animated_java:sculk_hand/summon/hand_only", Compiled142::f22);
        Logic.register("animated_java:sculk_hand/summon/lower_arm_only", Compiled142::f23);
    }
    // animated_java:sculk_hand/animations/grab/zzz/frames/8
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_upper_5)", "{ transformation: [-2.330599550690595f,0.46107630502295016f,0.7782765416400399f,0.9016229117647305f,0.47286404174840724f,2.4545761912633437f,-0.03814864747929636f,2.2822127599517463f,-0.7711714026999172f,0.11164390816127202f,-2.375464229456701f,0.21552693736642248f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_lower_5)", "{ transformation: [-2.228726995356164f,0.822837532507787f,0.7782765416400399f,0.46875f,0.8540286209450358f,2.3492934672582355f,-0.03814864747929636f,1.9484738124589565f,-0.7439160535822605f,0.2318590084389126f,-2.375464229456701f,0.07906386658634378f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_upper_4)", "{ transformation: [-2.46201938253052f,-0.24314657722938426f,-0.35963912749542604f,-0.5634707811749797f,-0.4231668700332827f,1.8064634488384903f,1.6755952996224308f,3.0644540038968744f,0.09690387066712555f,1.7110141875484797f,-1.820175840367503f,-0.18409074261771927f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_lower_4)", "{ transformation: [-2.46201938253052f,-0.3788831246999187f,-0.21191540260599767f,-0.46875f,-0.4231668700332827f,2.366946482224631f,0.6844663252422871f,2.472717383340717f,0.09690387066712555f,0.7099379748274292f,-2.395119561054867f,-0.36157523632457655f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_upper_3)", "{ transformation: [-2.4904867452293638f,-0.12764541765841814f,-0.17658544443882618f,-0.20128980737384888f,-0.21239164936526836f,1.8744426505811043f,1.640534832596487f,3.1884882731787156f,0.04863701385519762f,1.6492942117867542f,-1.8781541587020911f,-0.24217019648043775f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_lower_3)", "{ transformation: [-2.4904867452293638f,-0.19216984479508883f,-0.10269626375034903f,-0.15624999999999994f,-0.21239164936526836f,2.404110228484275f,0.6520305181333067f,2.6250249383777136f,0.04863701385519762f,0.6582740766950487f,-2.4112879713618884f,-0.3964531832058398f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_upper_2)", "{ transformation: [-2.5f,-2.0739723999013395e-16f,2.2521405653475736e-16f,0.15625000000000003f,0f,1.839012331486598f,1.69352698373549f,3.228097149275957f,-3.061616997868383e-16f,1.69352698373549f,-1.839012331486598f,-0.23235288326003092f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_lower_2)", "{ transformation: [-2.5f,-8.038596282710217e-17f,2.954201810925006e-16f,0.15625000000000006f,0f,2.4122888435929744f,0.6564011997832354f,2.6250249383777136f,-3.061616997868383e-16f,0.6564011997832354f,-2.4122888435929744f,-0.3964531832058398f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_upper_1)", "{ transformation: [-2.478612153434526f,0.184640244475815f,0.2690534760351051f,0.535300876394948f,0.31808200328520186f,1.8272157229057466f,1.676337239684218f,3.182222121351064f,-0.07283976958183265f,1.6962283696737126f,-1.8350759346363095f,-0.2278559292428028f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_lower_1)", "{ transformation: [-2.478612153434526f,0.2839504059517784f,0.16079166584895457f,0.46875000000000006f,0.31808200328520186f,2.377374647352963f,0.704921006432245f,2.6250249383777136f,-0.07283976958183265f,0.7193482835756242f,-2.3931636832619847f,-0.3964531832058397f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand)", "{ transformation: [-2.5f,6.834106561435282e-17f,2.9843673561922773e-16f,0f,0f,2.436920880591947f,-0.5580471501002128f,1.59375f,-3.061616997868383e-16f,-0.5580471501002128f,-2.436920880591947f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_lower_arm_2)", "{ transformation: [-2.5f,0f,3.061616997868383e-16f,-0.390625f,0f,2.5f,0f,0.5f,-3.061616997868383e-16f,0f,-2.5f,-4.7837765591693485e-17f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_lower_arm)", "{ transformation: [-2.5f,0f,3.061616997868383e-16f,0f,0f,2.5f,0f,-0.90625f,-3.061616997868383e-16f,0f,-2.5f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data", "merge", "value", "{\"locators\":{\"sculk_hand_locator\":{\"posx\":0,\"posy\":0.5,\"posz\":0,\"roty\":0,\"rotx\":0}},\"cameras\":{}}"));
        return 1;
    }
    // animated_java:sculk_hand/animations/grab/zzz/frames/9
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_upper_5)", "{ transformation: [-2.389906330749536f,0.11769173942796218f,0.7242212263622976f,0.8994895518651591f,0.16634445699220357f,2.4902860036530767f,0.1442398753381257f,2.1570385163951964f,-0.7146168566940322f,0.18607599114342982f,-2.388451061598025f,0.23634784232391537f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_lower_5)", "{ transformation: [-2.257931756175608f,0.7919897724971097f,0.7242212263622976f,0.46875f,0.8671619971434505f,2.3403471813114876f,0.1442398753381257f,1.826618669542224f,-0.6322770398835595f,0.3814803680235096f,-2.388451061598025f,0.08578564333406237f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_upper_4)", "{ transformation: [-2.46201938253052f,-0.08710611829270154f,-0.425291763616478f,-0.5513230286737621f,-0.4249307233568025f,0.9848107523749895f,2.258225334716195f,2.9005292283462496f,0.08885066342746616f,2.2962056323775935f,-0.9846548905306439f,-0.04365573297936337f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_lower_4)", "{ transformation: [-2.46201938253052f,-0.3302921146950487f,-0.2817226987913986f,-0.46875f,-0.4249307233568025f,2.16557597982119f,1.1746125131161158f,2.359135233390952f,0.08885066342746616f,1.2046525617752886f,-2.188816521551483f,-0.3448188734231855f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_upper_3)", "{ transformation: [-2.4904867452293638f,-0.049057587477034245f,-0.21229490089915712f,-0.19531910183526083f,-0.2132769448436013f,1.0473939977669409f,2.25997317644258f,3.026414142146437f,0.04459502926368872f,2.2694843393495185f,-1.0475934883399434f,-0.0988516676714935f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_lower_3)", "{ transformation: [-2.4904867452293638f,-0.16669483449711311f,-0.14031608599454973f,-0.15624999999999994f,-0.2132769448436013f,2.1945024088105924f,1.1784193322084833f,2.512077640081454f,0.04459502926368872f,1.1859055653282387f,-2.2003725306157778f,-0.37679828454529946f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_upper_2)", "{ transformation: [-2.5f,-2.824559155231912e-16f,1.1812553577580913e-16f,0.15625000000000003f,0f,0.9645681992395909f,2.3064275815675837f,3.0624842391506273f,-3.061616997868383e-16f,2.3064275815675837f,-0.9645681992395909f,-0.08069428980509585f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_lower_2)", "{ transformation: [-2.5f,-1.4504912374933397e-16f,2.696214719118573e-16f,0.15625000000000006f,0f,2.2016263962766924f,1.1844159789608142f,2.512077640081454f,-3.061616997868383e-16f,1.1844159789608142f,-2.2016263962766924f,-0.3767982845452994f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_upper_1)", "{ transformation: [-2.478612153434526f,0.0616210485826818f,0.32044444014248785f,0.5253927500001379f,0.31940783958850766f,0.9606148392680981f,2.2858691481769746f,3.0137934018946297f,-0.06678641221134594f,2.3072542072666153f,-0.9602695445521738f,-0.07948422983732462f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_finger_lower_1)", "{ transformation: [-2.478612153434526f,0.24167573333392173f,0.21925928204792805f,0.46875f,0.31940783958850766f,2.1406539170695495f,1.2512311694264158f,2.512077640081454f,-0.06678641221134594f,1.2685399667540258f,-2.1532175756043865f,-0.3767982845452994f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand)", "{ transformation: [-2.5f,6.266157355090262e-17f,2.99680686091865e-16f,0f,0f,2.447078507048027f,-0.5116705779538234f,1.4734602043700562f,-3.061616997868383e-16f,-0.5116705779538234f,-2.447078507048027f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_lower_arm_2)", "{ transformation: [-2.5f,0f,3.061616997868383e-16f,-0.390625f,0f,2.5f,0f,0.3797102043700562f,-3.061616997868383e-16f,0f,-2.5f,-4.7837765591693485e-17f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_lower_arm)", "{ transformation: [-2.5f,0f,3.061616997868383e-16f,0f,0f,2.5f,0f,-1.0265397956299438f,-3.061616997868383e-16f,0f,-2.5f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data", "merge", "value", "{\"locators\":{\"sculk_hand_locator\":{\"posx\":0,\"posy\":0.37971020437005665,\"posz\":0,\"roty\":0,\"rotx\":0}},\"cameras\":{}}"));
        return 1;
    }
    // animated_java:sculk_hand/animations/grab/zzz/on_tick
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "2"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.grab.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/animations/grab/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:sculk_hand/animations/grab/pause")), Control.when("score", "@s", "aj.grab.frame", "matches", "22..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.grab.frame", "1"));
        return 1;
    }
    // animated_java:sculk_hand/animations/grab/zzz/set_frame
    private static int f3(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/animations/grab/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:sculk_hand/animations/pause_all
    private static int f4(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/animations/pause_all'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.sculk_hand.animation.grab.playing"));
        return 1;
    }
    // animated_java:sculk_hand/apply_default_pose
    private static int f5(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/apply_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.3125f,0f,1f,0f,1.88125f,-1.2246467991473532e-16f,0f,-1f,0.06250000000000004f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.1875f,0f,1f,0f,1.69375f,-1.2246467991473532e-16f,0f,-1f,0.06250000000000003f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.1875f,0f,1f,0f,2.1875f,-1.2246467991473532e-16f,0f,-1f,-0.06250000000000003f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.1875f,0f,1f,0f,1.9375f,-1.2246467991473532e-16f,0f,-1f,-0.06250000000000003f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.06249999999999999f,0f,1f,0f,2.234375f,-1.2246467991473532e-16f,0f,-1f,-0.06250000000000001f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.06249999999999999f,0f,1f,0f,2f,-1.2246467991473532e-16f,0f,-1f,-0.06250000000000001f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.06250000000000001f,0f,1f,0f,2.25f,-1.2246467991473532e-16f,0f,-1f,-0.06249999999999999f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.06250000000000001f,0f,1f,0f,2f,-1.2246467991473532e-16f,0f,-1f,-0.06249999999999999f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.1875f,0f,1f,0f,2.234375f,-1.2246467991473532e-16f,0f,-1f,-0.06249999999999998f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.1875f,0f,1f,0f,2f,-1.2246467991473532e-16f,0f,-1f,-0.06249999999999998f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,1.5625f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.hand]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.15625f,0f,1f,0f,1.125f,-1.2246467991473532e-16f,0f,-1f,-1.9135106236677395e-17f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.lower_arm_2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.lower_arm]")));
        return 1;
    }
    // animated_java:sculk_hand/as_own_locator_entities
    private static int f6(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/as_all_locators'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "command", "set", "value", "'$(command)'"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/zzz/13"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        return 1;
    }
    // animated_java:sculk_hand/on_load
    private static int f7(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "aj.grab.frame", "dummy"));
        return 1;
    }
    // animated_java:sculk_hand/remove/all
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/remove/this"), Control.as("@e[type=item_display,tag=aj.sculk_hand.root]")));
        return 1;
    }
    // animated_java:sculk_hand/remove/this
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/remove/this'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Logic.call(c, "#animated_java:sculk_hand/as_root/on_remove"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/remove/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // animated_java:sculk_hand/remove/zzz/0
    private static int f10(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/remove/zzz/kill", "with", "entity", "@s", "data.locators.sculk_hand_locator"));
        return 1;
    }
    // animated_java:sculk_hand/remove/zzz/kill
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/remove/zzz/kill_passengers"), Control.as("$(uuid)")));
        return 1;
    }
    // animated_java:sculk_hand/remove/zzz/kill_passengers
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/remove/zzz/kill_passengers"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // animated_java:sculk_hand/root/on_load
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.sculk_hand.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/root/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.data]"), Control.unless("data", "entity", "@s", "{data:{rigHash: '27323460617811c22e953102532e07f8503fa3f2fd2443c42cbde11609430d9a'}}"), Control.on("vehicle")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.is_rig_loaded", "1"));
        return 1;
    }
    // animated_java:sculk_hand/root/on_tick
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.sculk_hand.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "#animated_java:global/root/on_load"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1")));
        Logic.step(() -> Logic.call(c, "#animated_java:sculk_hand/as_root/pre_tick"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/animations/grab/zzz/on_tick"), Control.when("entity", "@s[tag=aj.sculk_hand.animation.grab.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/root/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:sculk_hand/as_root/post_tick"));
        return 1;
    }
    // animated_java:sculk_hand/root/outdated_tellraw
    private static int f15(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"sculk_hand\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The \",\"color\":\"red\"},{\"text\":\"sculk_hand\",\"color\":\"yellow\"},{\"text\":\" rig instance at\",\"color\":\"red\"},[{\"text\":\" [\",\"color\":\"yellow\"},{\"score\":{\"name\":\"#this.x\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.y\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.z\",\"objective\":\"aj.i\"}},\"]\"],{\"text\":\" is outdated! It will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"},\"\\n \",{\"text\":\"[Click Here to Teleport to the Rig Instance]\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/tp @s $(x) $(y) $(z)\"},\"color\":\"aqua\",\"underlined\":true},[\"\\n\"]]"));
        return 1;
    }
    // animated_java:sculk_hand/root/zzz/0
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1"), Control.store("result", "storage", "aj:temp", "x", "int", "1"), Control.store("result", "score", "#this.x", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1"), Control.store("result", "storage", "aj:temp", "y", "int", "1"), Control.store("result", "score", "#this.y", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1"), Control.store("result", "storage", "aj:temp", "z", "int", "1"), Control.store("result", "score", "#this.z", "aj.i")));
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/root/outdated_tellraw", "with", "storage", "aj:temp"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.rigHash", "set", "value", "'27323460617811c22e953102532e07f8503fa3f2fd2443c42cbde11609430d9a'"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{Glowing: 1b, glow_color_override: 16711680}"), Control.on("passengers")));
        Logic.step(() -> Native.summon(c, "minecraft:text_display", "~", "~", "~", "{Tags:['aj.rig_entity', 'aj.outdated_rig_text_display', 'aj.new'], text:'[\"\",{\"text\":\"This rig instance is outdated!\\\\nIt will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"}]', billboard: \"vertical\", transformation:{translation:[0f,3f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[1f,1f,1f]}}"));
        Logic.step(() -> Native.ride(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "mount", "@s"));
        Logic.step(() -> Native.tag(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "remove", "aj.new"));
        return 1;
    }
    // animated_java:sculk_hand/root/zzz/1
    private static int f17(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/root/zzz/2", "with", "entity", "@s", "data.locators.sculk_hand_locator"));
        return 1;
    }
    // animated_java:sculk_hand/root/zzz/2
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:sculk_hand/root/zzz/3"), Control.as("$(uuid)"), Control.positioned("^$(posx)", "^$(posy)", "^$(posz)"), Control.rotated("~$(roty)", "~$(rotx)")));
        return 1;
    }
    // animated_java:sculk_hand/root/zzz/3
    private static int f19(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "~", "~"));
        return 1;
    }
    // animated_java:sculk_hand/set_default_pose
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'sculk_hand', 'function_path': 'animated_java:sculk_hand/set_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.sculk_hand.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.3125f,0f,1f,0f,1.88125f,-1.2246467991473532e-16f,0f,-1f,0.06250000000000004f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.1875f,0f,1f,0f,1.69375f,-1.2246467991473532e-16f,0f,-1f,0.06250000000000003f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_5]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.1875f,0f,1f,0f,2.1875f,-1.2246467991473532e-16f,0f,-1f,-0.06250000000000003f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.1875f,0f,1f,0f,1.9375f,-1.2246467991473532e-16f,0f,-1f,-0.06250000000000003f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_4]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.06249999999999999f,0f,1f,0f,2.234375f,-1.2246467991473532e-16f,0f,-1f,-0.06250000000000001f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.06249999999999999f,0f,1f,0f,2f,-1.2246467991473532e-16f,0f,-1f,-0.06250000000000001f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_3]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.06250000000000001f,0f,1f,0f,2.25f,-1.2246467991473532e-16f,0f,-1f,-0.06249999999999999f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.06250000000000001f,0f,1f,0f,2f,-1.2246467991473532e-16f,0f,-1f,-0.06249999999999999f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.1875f,0f,1f,0f,2.234375f,-1.2246467991473532e-16f,0f,-1f,-0.06249999999999998f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_upper_1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.1875f,0f,1f,0f,2f,-1.2246467991473532e-16f,0f,-1f,-0.06249999999999998f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.finger_lower_1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,1.5625f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.hand]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.15625f,0f,1f,0f,1.125f,-1.2246467991473532e-16f,0f,-1f,-1.9135106236677395e-17f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.lower_arm_2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,0.5625f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: -1}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.sculk_hand.bone.lower_arm]")));
        return 1;
    }
    // animated_java:sculk_hand/summon/default
    private static int f21(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/summon", "{args:{variant: 'default'}}"));
        return 1;
    }
    // animated_java:sculk_hand/summon/hand_only
    private static int f22(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/summon", "{args:{variant: 'hand_only'}}"));
        return 1;
    }
    // animated_java:sculk_hand/summon/lower_arm_only
    private static int f23(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:sculk_hand/summon", "{args:{variant: 'lower_arm_only'}}"));
        return 1;
    }
}
