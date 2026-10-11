package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled039 {
    public static void register() {
        Logic.register("animated_java:flying_book/animations/flying/zzz/frames/0", Compiled039::f0, "bone_left_half", "bone_right_half", "bone_root");
        Logic.register("animated_java:flying_book/animations/flying/zzz/frames/1", Compiled039::f1, "bone_left_half", "bone_right_half", "bone_root");
        Logic.register("animated_java:flying_book/animations/flying/zzz/frames/10", Compiled039::f2, "bone_left_half", "bone_right_half", "bone_root");
        Logic.register("animated_java:flying_book/animations/flying/zzz/frames/11", Compiled039::f3, "bone_left_half", "bone_right_half", "bone_root");
        Logic.register("animated_java:flying_book/animations/flying/zzz/frames/12", Compiled039::f4, "bone_left_half", "bone_right_half", "bone_root");
        Logic.register("animated_java:flying_book/animations/flying/zzz/frames/2", Compiled039::f5, "bone_left_half", "bone_right_half", "bone_root");
        Logic.register("animated_java:flying_book/animations/flying/zzz/frames/3", Compiled039::f6, "bone_left_half", "bone_right_half", "bone_root");
        Logic.register("animated_java:flying_book/animations/flying/zzz/frames/4", Compiled039::f7, "bone_left_half", "bone_right_half", "bone_root");
        Logic.register("animated_java:flying_book/animations/flying/zzz/frames/5", Compiled039::f8, "bone_left_half", "bone_right_half", "bone_root");
        Logic.register("animated_java:flying_book/animations/flying/zzz/frames/6", Compiled039::f9, "bone_left_half", "bone_right_half", "bone_root");
        Logic.register("animated_java:flying_book/animations/flying/zzz/frames/7", Compiled039::f10, "bone_left_half", "bone_right_half", "bone_root");
        Logic.register("animated_java:flying_book/animations/flying/zzz/frames/8", Compiled039::f11, "bone_left_half", "bone_right_half", "bone_root");
        Logic.register("animated_java:flying_book/animations/flying/zzz/frames/9", Compiled039::f12, "bone_left_half", "bone_right_half", "bone_root");
        Logic.register("animated_java:flying_book/animations/flying/zzz/on_tick", Compiled039::f13);
        Logic.register("animated_java:flying_book/animations/flying/zzz/set_frame", Compiled039::f14, "frame");
        Logic.register("animated_java:flying_book/animations/flying/zzz/zzz/0", Compiled039::f15);
        Logic.register("animated_java:flying_book/animations/flying/zzz/zzz/1", Compiled039::f16);
        Logic.register("animated_java:flying_book/animations/pause_all", Compiled039::f17);
        Logic.register("animated_java:flying_book/apply_default_pose", Compiled039::f18);
        Logic.register("animated_java:flying_book/on_load", Compiled039::f19);
        Logic.register("animated_java:flying_book/remove/all", Compiled039::f20);
        Logic.register("animated_java:flying_book/remove/this", Compiled039::f21);
        Logic.register("animated_java:flying_book/root/on_load", Compiled039::f22);
        Logic.register("animated_java:flying_book/root/on_tick", Compiled039::f23);
    }
    // animated_java:flying_book/animations/flying/zzz/frames/0
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_half)", "{ transformation: [-0.4617486132350339f,-0.8870108331782217f,1.223481206754078e-16f,0.046875f,-0.8861665954105443f,0.4613091308703497f,0.043619387365336f,0.09998512846221654f,-0.038690869129650335f,0.02014119162610555f,-0.9990482215818578f,0.0006815529275833807f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_half)", "{ transformation: [-0.4617486132350339f,0.8870108331782217f,1.223481206754078e-16f,-0.046875f,0.8861665954105443f,0.4613091308703497f,0.043619387365336f,0.09998512846221654f,0.038690869129650224f,0.020141191626105764f,-0.9990482215818578f,0.0006815529275833693f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_root)", "{ transformation: [-1f,-5.341834311772723e-18f,1.223481206754078e-16f,0f,0f,0.9990482215818578f,0.043619387365336f,0.084375f,-1.2246467991473532e-16f,0.043619387365336f,-0.9990482215818578f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/frames/1
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_half)", "{ transformation: [-0.555885675831036f,-0.831258753581502f,1.2236741218209384e-16f,0.046875f,-0.8305985252262281f,0.5554441629039324f,0.039848108963470893f,0.08190783977351633f,-0.033124089389554766f,0.02215099298174768f,-0.9992057486884447f,0.0006226267025542385f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_half)", "{ transformation: [-0.555885675831036f,0.831258753581502f,1.2236741218209384e-16f,-0.046875f,0.8305985252262281f,0.5554441629039324f,0.039848108963470893f,0.08190783977351633f,0.03312408938955463f,0.022150992981747882f,-0.9992057486884447f,0.000622626702554227f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_root)", "{ transformation: [-1f,-4.879985909418958e-18f,1.2236741218209384e-16f,0f,0f,0.9992057486884447f,0.039848108963470893f,0.06629524995025939f,-1.2246467991473532e-16f,0.039848108963470893f,-0.9992057486884447f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/frames/10
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_half)", "{ transformation: [-0.6814809356768148f,-0.7318358656891948f,1.2239252532893295e-16f,0.046875f,-0.7314046775800936f,0.6810794160331085f,0.034322393126926996f,0.12741047717738319f,-0.02511835828656957f,0.023390056582805595f,-0.9994108130944155f,0.0005362873926082401f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_half)", "{ transformation: [-0.6814809356768148f,0.7318358656891948f,1.2239252532893295e-16f,-0.046875f,0.7314046775800936f,0.6810794160331085f,0.034322393126926996f,0.12741047717738319f,0.025118358286569404f,0.023390056582805775f,-0.9994108130944155f,0.0005362873926082286f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_root)", "{ transformation: [-1f,-4.203280888196826e-18f,1.2239252532893295e-16f,0f,0f,0.9994108130944155f,0.034322393126926996f,0.11179468322278294f,-1.2246467991473532e-16f,0.034322393126926996f,-0.9994108130944155f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/frames/11
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_half)", "{ transformation: [-0.5333356170392307f,-0.8459037295090872f,1.2236283480745876e-16f,0.046875f,-0.8452002519338592f,0.5328920799869998f,0.040774565823192534f,0.11612239320683473f,-0.03449135729895239f,0.021746528222819014f,-0.9991683715880573f,0.0006371025909873891f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_half)", "{ transformation: [-0.5333356170392307f,0.8459037295090872f,1.2236283480745876e-16f,-0.046875f,0.8452002519338592f,0.5328920799869998f,0.040774565823192534f,0.11612239320683473f,0.034491357298952266f,0.021746528222819222f,-0.9991683715880573f,0.0006371025909873776f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_root)", "{ transformation: [-1f,-4.99344415219958e-18f,1.2236283480745876e-16f,0f,0f,0.9991683715880573f,0.040774565823192534f,0.10051038740077134f,-1.2246467991473532e-16f,0.040774565823192534f,-0.9991683715880573f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/frames/12
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_half)", "{ transformation: [-0.4617486132350339f,-0.8870108331782217f,1.223481206754078e-16f,0.046875f,-0.8861665954105443f,0.4613091308703497f,0.043619387365336f,0.09998512846221654f,-0.038690869129650335f,0.02014119162610555f,-0.9990482215818578f,0.0006815529275833807f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_half)", "{ transformation: [-0.4617486132350339f,0.8870108331782217f,1.223481206754078e-16f,-0.046875f,0.8861665954105443f,0.4613091308703497f,0.043619387365336f,0.09998512846221654f,0.038690869129650224f,0.020141191626105764f,-0.9990482215818578f,0.0006815529275833693f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_root)", "{ transformation: [-1f,-5.341834311772723e-18f,1.223481206754078e-16f,0f,0f,0.9990482215818578f,0.043619387365336f,0.084375f,-1.2246467991473532e-16f,0.043619387365336f,-0.9990482215818578f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/frames/2
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_half)", "{ transformation: [-0.7872337188740866f,-0.6166547428404939f,1.2241342939193707e-16f,0.046875f,-0.6163966775927947f,0.786904267642231f,0.028927658374095964f,0.07811846105816567f,-0.017838377735655903f,0.0227728280801586f,-0.9995815077226027f,0.0004519946620952552f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_half)", "{ transformation: [-0.7872337188740866f,0.6166547428404939f,1.2241342939193707e-16f,-0.046875f,0.6163966775927947f,0.786904267642231f,0.028927658374095964f,0.07811846105816567f,0.01783837773565571f,0.022772828080158753f,-0.9995815077226027f,0.0004519946620952437f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_root)", "{ transformation: [-1f,-3.542616423466475e-18f,1.2241342939193707e-16f,0f,0f,0.9995815077226027f,0.028927658374095964f,0.0625f,-1.2246467991473532e-16f,0.028927658374095964f,-0.9995815077226027f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/frames/3
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_half)", "{ transformation: [-0.9684626237045768f,-0.2491588780020636f,1.2245144568981304e-16f,0.046875f,-0.2491319524865994f,0.9683579661641345f,0.014701007335410694f,0.0880605351183119f,-0.0036628864931911535f,0.01423737613515204f,-0.9998919343525701f,0.00022970323961579785f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_half)", "{ transformation: [-0.9684626237045768f,0.2491588780020636f,1.2245144568981304e-16f,-0.046875f,0.2491319524865994f,0.9683579661641345f,0.014701007335410694f,0.0880605351183119f,0.0036628864931909167f,0.014237376135152103f,-0.9998919343525701f,0.00022970323961578635f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_root)", "{ transformation: [-1f,-1.8003541577552465e-18f,1.2245144568981304e-16f,0f,0f,0.9998919343525701f,0.014701007335410694f,0.07243722364405299f,-1.2246467991473532e-16f,0.014701007335410694f,-0.9998919343525701f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/frames/4
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_half)", "{ transformation: [-0.9978836671845933f,0.06502450896568025f,1.2246380751581533e-16f,0.046875f,0.06502404575203014f,0.9978765585828795f,0.003774560216356162f,0.1070282027317191f,0.00024543892462982903f,0.0037665719907065665f,-0.9999928763222131f,0.00005897750338057077f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_half)", "{ transformation: [-0.9978836671845933f,-0.06502450896568025f,1.2246380751581533e-16f,-0.046875f,-0.06502404575203014f,0.9978765585828795f,0.003774560216356162f,0.1070282027317191f,-0.0002454389246300734f,0.003766571990706551f,-0.9999928763222131f,0.00005897750338055929f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_root)", "{ transformation: [-1f,-4.622503087149514e-19f,1.2246380751581533e-16f,0f,0f,0.9999928763222131f,0.003774560216356162f,0.09140331403918453f,-1.2246467991473532e-16f,0.003774560216356162f,-0.9999928763222131f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/frames/5
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_half)", "{ transformation: [-0.984807753012208f,0.17364817766693033f,1.2246467991473532e-16f,0.046875f,0.17364817766693033f,0.984807753012208f,0f,0.125689646064976f,-1.2060416625018976e-16f,2.1265768495757713e-17f,-1f,5.740531871003218e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_half)", "{ transformation: [-0.984807753012208f,-0.17364817766693033f,1.2246467991473532e-16f,-0.046875f,-0.17364817766693033f,0.984807753012208f,0f,0.125689646064976f,-1.2060416625018976e-16f,-2.1265768495757713e-17f,-1f,-5.740531871003218e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_root)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,0.11006464606497601f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/frames/6
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_half)", "{ transformation: [-0.9957747017408978f,0.09182996990539691f,1.2246418347686828e-16f,0.046875f,0.09182959765215278f,0.9957706651462704f,0.002847354772058566f,0.1392358681684173f,0.0002614725030280044f,0.0028353238488971516f,-0.9999959462771847f,0.00004448991831342083f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_half)", "{ transformation: [-0.9957747017408978f,-0.09182996990539691f,1.2246418347686828e-16f,-0.046875f,-0.09182959765215278f,0.9957706651462704f,0.002847354772058566f,0.1392358681684173f,-0.00026147250302824835f,0.002835323848897129f,-0.9999959462771847f,0.00004448991831340935f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_root)", "{ transformation: [-1f,-3.487003907638464e-19f,1.2246418347686828e-16f,0f,0f,0.9999959462771847f,0.002847354772058566f,0.12361093150783628f,-1.2246467991473532e-16f,0.002847354772058566f,-0.9999959462771847f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/frames/7
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_half)", "{ transformation: [-0.9954637368342681f,-0.09514172926720885f,1.2245937930205052e-16f,0.046875f,-0.09513761126798362f,0.9954206503891446f,0.009303961579580921f,0.14437432370644945f,-0.0008851949937171226f,0.00926175636137207f,-0.999956717212763f,0.00014537439968095764f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_half)", "{ transformation: [-0.9954637368342681f,0.09514172926720885f,1.2245937930205052e-16f,-0.046875f,0.09513761126798362f,0.9954206503891446f,0.009303961579580921f,0.14437432370644945f,0.0008851949937168789f,0.009261756361372095f,-0.999956717212763f,0.00014537439968094614f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_root)", "{ transformation: [-1f,-1.1394066767823728e-18f,1.2245937930205052e-16f,0f,0f,0.999956717212763f,0.009303961579580921f,0.12875000000000003f,-1.2246467991473532e-16f,0.009303961579580921f,-0.999956717212763f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/frames/8
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_half)", "{ transformation: [-0.9453216463924621f,-0.3261395174796286f,1.2244598338368742e-16f,0.046875f,-0.32608972616331805f,0.9451773253071962f,0.01747324285491343f,0.14203143068933874f,-0.00569871499350595f,0.01651783470342205f,-0.9998473312381911f,0.0002730194196080281f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_half)", "{ transformation: [-0.9453216463924621f,0.3261395174796286f,1.2244598338368742e-16f,-0.046875f,0.32608972616331805f,0.9451773253071962f,0.01747324285491343f,0.14203143068933874f,0.005698714993505719f,0.01651783470342213f,-0.9998473312381911f,0.0002730194196080166f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_root)", "{ transformation: [-1f,-2.1398550932994094e-18f,1.2244598338368742e-16f,0f,0f,0.9998473312381911f,0.01747324285491343f,0.126408816138742f,-1.2246467991473532e-16f,0.01747324285491343f,-0.9998473312381911f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/frames/9
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_half)", "{ transformation: [-0.8342192319241865f,-0.5514329270979567f,1.2242278110753494e-16f,0.046875f,-0.5512442655025276f,0.8339338207281944f,0.026156115848006926f,0.1360924686833785f,-0.014423343523579815f,0.021819934872844313f,-0.9996578702754986f,0.00040868931012511396f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_half)", "{ transformation: [-0.8342192319241865f,0.5514329270979567f,1.2242278110753494e-16f,-0.046875f,0.5512442655025276f,0.8339338207281944f,0.026156115848006926f,0.1360924686833785f,0.01442334352357961f,0.021819934872844445f,-0.9996578702754986f,0.00040868931012510247f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_root)", "{ transformation: [-1f,-3.203200355138904e-18f,1.2242278110753494e-16f,0f,0f,0.9996578702754986f,0.026156115848006926f,0.12047281446032382f,-1.2246467991473532e-16f,0.026156115848006926f,-0.9996578702754986f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/on_tick
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "2"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/animations/flying/zzz/zzz/0"), Control.when("score", "@s", "aj.flying.frame", "matches", "-1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.flying.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/animations/flying/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:flying_book/animations/flying/zzz/zzz/1")), Control.when("score", "@s", "aj.flying.frame", "matches", "11..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.flying.frame", "1"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/set_frame
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/animations/flying/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/zzz/0
    private static int f15(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/animations/flying/zzz/apply_frame", "{frame: 12}"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.flying.frame", "1"));
        return 1;
    }
    // animated_java:flying_book/animations/flying/zzz/zzz/1
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.flying.frame", "-1"));
        return 1;
    }
    // animated_java:flying_book/animations/pause_all
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/animations/pause_all'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.flying_book.animation.flying.playing"));
        return 1;
    }
    // animated_java:flying_book/apply_default_pose
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/apply_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.046875f,0f,1f,0f,0.078125f,-1.2246467991473532e-16f,0f,-1f,5.740531871003218e-18f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.right_half]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.046875f,0f,1f,0f,0.078125f,-1.2246467991473532e-16f,0f,-1f,-5.740531871003218e-18f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.left_half]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,0.0625f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.bone.root]")));
        return 1;
    }
    // animated_java:flying_book/on_load
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "aj.flying.frame", "dummy"));
        return 1;
    }
    // animated_java:flying_book/remove/all
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/remove/this"), Control.as("@e[type=item_display,tag=aj.flying_book.root]")));
        return 1;
    }
    // animated_java:flying_book/remove/this
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'flying_book', 'function_path': 'animated_java:flying_book/remove/this'}")), Control.unless("entity", "@s[type=item_display,tag=aj.flying_book.root]")));
        Logic.step(() -> Logic.call(c, "#animated_java:flying_book/as_root/on_remove"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // animated_java:flying_book/root/on_load
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.flying_book.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/root/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.flying_book.data]"), Control.unless("data", "entity", "@s", "{data:{rigHash: 'bd54bbb4f724c7395361e72dcba4c644b3e9991cf94d60d99997946eeda74191'}}"), Control.on("vehicle")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.is_rig_loaded", "1"));
        return 1;
    }
    // animated_java:flying_book/root/on_tick
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.flying_book.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "#animated_java:global/root/on_load"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1")));
        Logic.step(() -> Logic.call(c, "#animated_java:flying_book/as_root/pre_tick"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/animations/flying/zzz/on_tick"), Control.when("entity", "@s[tag=aj.flying_book.animation.flying.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:flying_book/as_root/post_tick"));
        return 1;
    }
}
