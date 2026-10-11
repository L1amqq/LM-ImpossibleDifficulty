package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled003 {
    public static void register() {
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/46", Compiled003::f0, "bone_body", "bone_head", "bone_left_arm", "bone_left_leg", "bone_right_arm", "bone_right_leg");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/47", Compiled003::f1, "bone_body", "bone_head", "bone_left_arm", "bone_left_leg", "bone_right_arm", "bone_right_leg");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/48", Compiled003::f2, "bone_body", "bone_head", "bone_left_arm", "bone_left_leg", "bone_right_arm", "bone_right_leg");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/49", Compiled003::f3, "bone_body", "bone_head", "bone_left_arm", "bone_left_leg", "bone_right_arm", "bone_right_leg");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/5", Compiled003::f4, "bone_body", "bone_head", "bone_left_arm", "bone_left_leg", "bone_right_arm", "bone_right_leg");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/6", Compiled003::f5, "bone_body", "bone_head", "bone_left_arm", "bone_left_leg", "bone_right_arm", "bone_right_leg");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/7", Compiled003::f6, "bone_body", "bone_head", "bone_left_arm", "bone_left_leg", "bone_right_arm", "bone_right_leg");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/8", Compiled003::f7, "bone_body", "bone_head", "bone_left_arm", "bone_left_leg", "bone_right_arm", "bone_right_leg");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/9", Compiled003::f8, "bone_body", "bone_head", "bone_left_arm", "bone_left_leg", "bone_right_arm", "bone_right_leg");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/on_tick", Compiled003::f9);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/set_frame", Compiled003::f10, "frame");
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/zzz/0", Compiled003::f11);
        Logic.register("animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/zzz/1", Compiled003::f12);
        Logic.register("animated_java:baby_golem/animations/pause_all", Compiled003::f13);
        Logic.register("animated_java:baby_golem/apply_default_pose", Compiled003::f14);
        Logic.register("animated_java:baby_golem/as_own_locator_entities", Compiled003::f15, "command");
        Logic.register("animated_java:baby_golem/on_load", Compiled003::f16);
        Logic.register("animated_java:baby_golem/remove/all", Compiled003::f17);
        Logic.register("animated_java:baby_golem/remove/this", Compiled003::f18);
        Logic.register("animated_java:baby_golem/remove/zzz/0", Compiled003::f19);
        Logic.register("animated_java:baby_golem/root/on_load", Compiled003::f20);
        Logic.register("animated_java:baby_golem/root/on_tick", Compiled003::f21);
        Logic.register("animated_java:baby_golem/root/outdated_tellraw", Compiled003::f22, "x", "y", "z");
        Logic.register("animated_java:baby_golem/root/zzz/0", Compiled003::f23);
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/46
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_arm)", "{ transformation: [-0.9995110113779934f,0.02681389205681164f,-0.016085811353688983f,0.25490486424625225f,0.022107679935583123f,0.9697995702283387f,0.24289924675221855f,0.9125513367307072f,0.022113087120676552f,0.2424248518153512f,-0.9699181422162895f,0.02605960382462121f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_arm)", "{ transformation: [-0.9995110113779934f,0.01703811055446805f,-0.026219094623471273f,-0.21361592233718213f,0.022107679935583123f,0.9780471848549409f,-0.20720751599589948f,0.9229143117005117f,0.022113087120676552f,-0.2076858372303197f,-0.9779456040046065f,0.03642511341243834f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-0.9990222618658592f,0.044209954008260346f,-0.000016217589040894848f,0.021853569188279347f,0.044209956652312324f,0.9990221423255418f,-0.0004887495121341847f,0.9333349024068271f,-0.000005405862906024406f,-0.0004889886220066312f,-0.999999880430445f,0.07029530689169199f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.9995110113779934f,0.022113087120676674f,-0.022107679935583f,0.010970164313773194f,0.022107679935583123f,0.9997554757929528f,0.0004889886220066366f,0.5115974430691601f,0.022113087120676552f,2.708072136160325e-18f,-0.9997554757929528f,1.3434576612982862e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_leg)", "{ transformation: [-0.9997554757929528f,0.02151535889500716f,0.005106657774481547f,-0.10808902393014662f,0.022113087120676674f,0.9727315662235689f,0.23087726490548158f,0.4282723342651576f,-1.2243473433598788e-16f,0.23093373379361792f,-0.9729694808143462f,0.015624999999999986f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_leg)", "{ transformation: [-0.9997554757929528f,0.021368356228773297f,-0.005690516152940961f,0.14966043467272402f,0.022113087120676674f,0.9660854240670489f,-0.2572741043773811f,0.4225713039918581f,-1.2243473433598788e-16f,-0.257337029510466f,-0.9663217131177015f,0.015625000000000017f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/47
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_arm)", "{ transformation: [-0.9998046766120383f,0.015923048795385704f,-0.011707482297971097f,0.2473769113946218f,0.013974449425141216f,0.9884420177564426f,0.15095394097815631f,0.9145992558373204f,0.01397581439350534f,0.15076085052370955f,-0.9884714677528158f,0.027971366424542503f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_arm)", "{ transformation: [-0.9998046766120383f,0.011984058247201185f,-0.015715946443826727f,-0.22128153076727114f,0.013974449425141216f,0.9909690441994247f,-0.13336066962093004f,0.9211497790053553f,0.01397581439350534f,-0.13355424286186632f,-0.9909429553842299f,0.03452252942149813f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-0.9996093913753025f,0.027947534015229817f,-0.000004094505170743404f,0.013811939344243452f,0.027947534281840065f,0.9996093723006211f,-0.00019528523673582968f,0.9334903615630057f,-0.0000013648350527372538f,-0.00019532338796171106f,-0.9999999809234555f,0.07030563282679571f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.9998046766120383f,0.013975814393505464f,-0.013974449425141092f,0.006933314171778102f,0.013974449425141216f,0.9999023335366501f,0.0001953233879617145f,0.5116702982779475f,0.01397581439350534f,1.7115436362483973e-18f,-0.9999023335366501f,8.490861007951033e-19f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_leg)", "{ transformation: [-0.9999023335366501f,0.01382802244617845f,0.0020271120318570033f,-0.11144378708898997f,0.013975814393505464f,0.9893285301897152f,0.14503012088768297f,0.4273789822388806f,-1.224527192225628e-16f,0.14504428685020873f,-0.9894251638462175f,0.015624999999999986f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_leg)", "{ transformation: [-0.9999023335366501f,0.013789144081808062f,-0.0022765969017048584f,0.14634353327592764f,0.013975814393505464f,0.9865469701200466f,-0.16287956396980657f,0.42377584259055495f,-1.224527192225628e-16f,-0.16289547339458874f,-0.986643332084879f,0.015625000000000017f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/48
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_arm)", "{ transformation: [-0.999959691044875f,0.006757629862338375f,-0.00591191374106455f,0.24029287311711364f,0.006348805424105133f,0.9977573865586474f,0.06663250135890544f,0.9164613026237437f,0.006348933384829965f,0.06659228188237219f,-0.9977600708780511f,0.0297613389041596f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_arm)", "{ transformation: [-0.999959691044875f,0.0059439451906260175f,-0.006729472565438473f,-0.22843823206017153f,0.006348805424105133f,0.9980663699083693f,-0.061832143158854644f,0.919437305166293f,0.006348933384829965f,-0.06187237488169559f,-0.9980638758473197f,0.032737401428298646f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-0.9999193837145619f,0.01269748289006432f,-3.838744377683556e-7f,0.006274522824488128f,0.012697482895222285f,0.9999193829021641f,-0.00004030733031314676f,0.9335724144095733f,-1.2795814606850198e-7f,-0.00004030895512500847f,-0.999999999187586f,0.07031108287401552f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.999959691044875f,0.006348933384830087f,-0.0063488054241050106f,0.003149666171380551f,0.006348805424105133f,0.9999798453193319f,0.00004030895512501003f,0.5117087513888874f,0.006348933384829965f,7.775200947731937e-19f,-0.9999798453193319f,3.8572285951638905e-19f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_leg)", "{ transformation: [-0.9999798453193319f,0.006335498607819617f,0.0004128105077704958f,-0.1145810834147375f,0.006348933384830087f,0.9978638196150896f,0.06501913985942075f,0.426516999062792f,-1.2246221167821852e-16f,0.06502045032583396f,-0.9978839316470758f,0.015624999999999986f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_leg)", "{ transformation: [-0.9999798453193319f,0.0063316509766189475f,-0.000468135701789928f,0.14322622045665276f,0.006348933384830087f,0.9972578038609946f,-0.07373305692307235f,0.4248801646745155f,-1.2246221167821852e-16f,-0.07373454301924111f,-0.9972779036786805f,0.015625000000000017f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/49
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_arm)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0.234375f,0f,1f,0f,0.91796875f,-1.2246467991473532e-16f,0f,-1f,0.03125000000000003f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_arm)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-0.234375f,0f,1f,0f,0.91796875f,-1.2246467991473532e-16f,0f,-1f,0.031249999999999972f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-8.610797806504827e-18f,0f,1f,0f,0.93359375f,-1.2246467991473532e-16f,0f,-1f,0.0703125f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,0.51171875f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_leg)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-0.1171875f,0f,1f,0f,0.42578125f,-1.2246467991473532e-16f,0f,-1f,0.015624999999999986f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_leg)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0.140625f,0f,1f,0f,0.42578125f,-1.2246467991473532e-16f,0f,-1f,0.015625000000000017f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/5
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_arm)", "{ transformation: [-0.9986420919000731f,-0.023612959921476235f,0.04643705857602201f,0.19965477513427202f,-0.03682477678844969f,0.9504731383709738f,-0.30861748014283436f,0.9259442643662392f,-0.03684980461178864f,-0.30990844028354353f,-0.9500520251760398f,0.03986544843414143f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_arm)", "{ transformation: [-0.9986420919000731f,-0.04818693903904724f,0.01979876742358693f,-0.2684587054438873f,-0.03682477678844969f,0.9217649078909257f,0.3859966196682481f,0.9086826502466534f,-0.03684980461178864f,0.38474338654079615f,-0.9222877091305037f,0.0225921025223655f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-0.997286027714554f,-0.07362454275207514f,0.0000750324860179924f,-0.03641621119516562f,-0.07362457673755918f,0.997285106070546f,-0.0013560641855191432f,0.9328748017604196f,0.00002501082482412459f,-0.0013579080999269993f,-0.9999990777296003f,0.0702647448260703f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.9986420919000731f,-0.036849804611788516f,0.036824776788449816f,-0.018280957756629457f,-0.03682477678844969f,0.999320815304111f,0.0013579080999269902f,0.5113818107172738f,-0.03684980461178864f,-4.512799526703218e-18f,-0.999320815304111f,-2.2387716402004246e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_leg)", "{ transformation: [-0.999320815304111f,-0.03471629719886303f,0.012356650384598766f,-0.13222208571625438f,-0.036849804611788516f,0.9414627509316351f,-0.3350969717981811f,0.4211843416741328f,-1.2238150377835028e-16f,-0.3353247192156256f,-0.9421026126080756f,0.015624999999999984f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_leg)", "{ transformation: [-0.999320815304111f,-0.03378759639137455f,-0.0147073597229606f,0.12541531197933672f,-0.036849804611788516f,0.9162775414606418f,0.39884528192635654f,0.43068468192560955f,-1.2238150377835028e-16f,0.399116355646991f,-0.916900286102619f,0.015625000000000014f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/6
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_arm)", "{ transformation: [-0.9982430050185366f,-0.024918441990401163f,0.05375848007833721f,0.19483135074623328f,-0.04187968421679578f,0.9385367826875249f,-0.34262924509220033f,0.9269363396733309f,-0.04191652396684906f,-0.3442786353977264f,-0.9379313547521567f,0.04104672018882341f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_arm)", "{ transformation: [-0.9982430050185366f,-0.05601870299965089f,0.019308232591277473f,-0.27309505785620575f,-0.04187968421679578f,0.8975632927272311f,0.4388920454947348f,0.9073052376967079f,-0.04191652396684906f,0.4373122916896892f,-0.8983323241182234f,0.021398349579362912f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-0.996489097068438f,-0.08372256106139458f,0.000110422145047466f,-0.04142272440668682f,-0.08372262578865054f,0.9964875542313392f,-0.0017539079500985338f,0.9326634235106026f,0.00003680737219686342f,-0.0017569949814634318f,-0.999998455805734f,0.07025070348920963f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.9982430050185366f,-0.04191652396684894f,0.04187968421679591f,-0.020794525561678965f,-0.04187968421679578f,0.9991211162909813f,0.0017569949814634214f,0.511282741284979f,-0.04191652396684906f,-5.133293690738487e-18f,-0.9991211162909813f,-2.5465949168897963e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_leg)", "{ transformation: [-0.9991211162909813f,-0.03883965434434697f,0.015763128873262155f,-0.13427683009862726f,-0.04191652396684894f,0.9257809363097588f,-0.37572950773656705f,0.42050867770135775f,-1.2235704770262806e-16f,-0.3760600207624284f,-0.9265953058289049f,0.015624999999999984f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_leg)", "{ transformation: [-0.9991211162909813f,-0.037460111329218115f,-0.01880784518933539f,0.12330908269514138f,-0.04191652396684894f,0.8928981868160945f,0.448303282387122f,0.43131528153656096f,-1.2235704770262806e-16f,0.44869763542917596f,-0.8936836308002214f,0.015625000000000014f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/7
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_arm)", "{ transformation: [-0.9980261347433248f,-0.025653472352770046f,0.05732131999129547f,0.19243585323530266f,-0.04438433409012299f,0.9338749396288921f,-0.35483464884437266f,0.9274186526323447f,-0.0444282033923855f,-0.3566784216761347f,-0.9331702086189562f,0.04163200329110311f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_arm)", "{ transformation: [-0.9980261347433248f,-0.05998012136147034f,0.018606972100858273f,-0.2753888974256309f,-0.04438433409012299f,0.8833021318661141f,0.466698376607584f,0.9066134960275996f,-0.0444282033923855f,0.4649513188305215f,-0.88422079022215f,0.020806282950922402f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-0.9960561656307011f,-0.08872484219541563f,0.00013147799726366538f,-0.04390447582356554f,-0.08872492878750719f,0.9960542185209332f,-0.0019699691126236533f,0.9325485417788897f,0.000043825984830221654f,-0.0019738652566751746f,-0.9999980509657164f,0.0702430720222787f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.9980261347433248f,-0.044428203392385374f,0.044384334090123115f,-0.02204055402669118f,-0.04438433409012299f,0.9990125798724082f,0.0019738652566751633f,0.5112288970460774f,-0.0444282033923855f,-5.4408857076352324e-18f,-0.9990125798724082f,-2.699189394022166e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_leg)", "{ transformation: [-0.9990125798724082f,-0.04083830557095949f,0.017495658169045886f,-0.1352942920014559f,-0.044428203392385374f,0.918290137589819f,-0.39340736895563605f,0.42016982337824726f,-1.2234375582486843e-16f,-0.39379621126080433f,-0.9191977719711009f,0.015624999999999983f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_leg)", "{ transformation: [-0.9990125798724082f,-0.039174142768669144f,-0.020958334738597192f,0.12226363874689933f,-0.044428203392385374f,0.8808697728777762f,0.4712691141731863f,0.43162396956534665f,-1.2234375582486843e-16f,0.47173491472287143f,-0.8817404211168983f,0.015625000000000014f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/8
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_arm)", "{ transformation: [-0.9980973490458729f,-0.026084306617303703f,0.05586851327801487f,0.19320757613425438f,-0.04357787137382909f,0.9394489865817862f,-0.3399067088731567f,0.9272640244539293f,-0.043619387365336125f,-0.34169461593468137f,-0.9387982416297569f,0.04144355083818371f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_arm)", "{ transformation: [-0.9980973490458729f,-0.0588128908042506f,0.018512852369327974f,-0.2746505562309985f,-0.04357787137382909f,0.8852880489710058f,0.46299680287841743f,0.9068368972474469f,-0.043619387365336125f,0.4613091308703497f,-0.8861665954105443f,0.020996963010682396f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-0.9961983181723989f,-0.08711426627017599f,0.00012442947005528865f,-0.04310530357649565f,-0.08711434526061684f,0.996196508993861f,-0.0018990308734739927f,0.9325862670100089f,0.0000414764774820664f,-0.0019026509541272447f,-0.9999981890978847f,0.07024557807997438f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.9980973490458729f,-0.043619387365336f,0.043577871373829215f,-0.021639305450772157f,-0.04357787137382909f,0.9990482215818578f,0.001902650954127234f,0.5112465786753748f,-0.043619387365336125f,-5.341834311772723e-18f,-0.9990482215818578f,-2.6500506156059993e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_leg)", "{ transformation: [-0.9990482215818578f,-0.0402990592075153f,0.016692416874629322f,-0.13496672781568755f,-0.043619387365336f,0.9230002039112792f,-0.3823192025331841f,0.42027922517630856f,-1.223481206754078e-16f,-0.3826834323650897f,-0.9238795325112867f,0.015624999999999983f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_leg)", "{ transformation: [-0.9990482215818578f,-0.038690869129650335f,-0.02014119162610555f,0.12260039181088517f,-0.043619387365336f,0.8861665954105443f,0.4613091308703497f,0.43152484848143424f,-1.223481206754078e-16f,0.4617486132350339f,-0.8870108331782217f,0.015625000000000014f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/9
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_arm)", "{ transformation: [-0.9984466616328238f,-0.02584507561132986f,0.049358848658714864f,0.19721671000436294f,-0.03938179156784468f,0.9540412300868704f,-0.2970764308847774f,0.9264492206258803f,-0.039412413871470924f,-0.29855881055660666f,-0.9535771066210891f,0.04046300415657676f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_arm)", "{ transformation: [-0.9984466616328238f,-0.0524256668545207f,0.018863014847263587f,-0.2708051626360232f,-0.03938179156784468f,0.9035464439195503f,0.4266765732650925f,0.9079890058284531f,-0.039412413871470924f,0.42527094085440853f,-0.9042075472465545f,0.021988435154324765f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_head)", "{ transformation: [-0.9968957361257307f,-0.0787329846247059f,0.00009179555143670748f,-0.0389483965156908f,-0.07873303219150501f,0.9968945301645519f,-0.0015509255070931627f,0.9327712957749242f,0.00003059851098334565f,-0.0015533383671761138f,-0.9999987931010957f,0.07025786922476424f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.9984466616328238f,-0.0394124138714708f,0.039381791567844805f,-0.019552252194049966f,-0.03938179156784468f,0.9992230289744246f,0.0015533383671761038f,0.511333299530281f,-0.039412413871470924f,-4.8266286494367456e-18f,-0.9992230289744246f,-2.3944603065565105e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_right_leg)", "{ transformation: [-0.9992230289744246f,-0.03703878834511656f,0.013470951158020036f,-0.13326169658491083f,-0.0394124138714708f,0.9390444949767519f,-0.3415290589198534f,0.4208439282272284f,-1.223695284067852e-16f,-0.34179462343896294f,-0.9397746726679845f,0.015624999999999984f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_left_leg)", "{ transformation: [-0.9992230289744246f,-0.03581368291188176f,-0.016453524955561714f,0.12435049057255802f,-0.0394124138714708f,0.9079843938166929f,0.41714625998342164f,0.43100494117846694f,-1.223695284067852e-16f,0.4174706225611806f,-0.9086904199442075f,0.015625000000000014f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 3 }"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/on_tick
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "3"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/zzz/0"), Control.when("score", "@s", "aj.animation_baby_golem_walk.frame", "matches", "-1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.animation_baby_golem_walk.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/zzz/1")), Control.when("score", "@s", "aj.animation_baby_golem_walk.frame", "matches", "48..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.animation_baby_golem_walk.frame", "1"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/set_frame
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/zzz/0
    private static int f11(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/apply_frame", "{frame: 49}"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.animation_baby_golem_walk.frame", "1"));
        return 1;
    }
    // animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/zzz/1
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.animation_baby_golem_walk.frame", "-1"));
        return 1;
    }
    // animated_java:baby_golem/animations/pause_all
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/animations/pause_all'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.baby_golem.animation.animation_baby_golem_idle.playing"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.baby_golem.animation.animation_baby_golem_walk.playing"));
        return 1;
    }
    // animated_java:baby_golem/apply_default_pose
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/apply_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.234375f,0f,1f,0f,0.91796875f,-1.2246467991473532e-16f,0f,-1f,0.03125000000000003f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.left_arm]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.234375f,0f,1f,0f,0.91796875f,-1.2246467991473532e-16f,0f,-1f,0.031249999999999972f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.right_arm]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-8.610797806504827e-18f,0f,1f,0f,0.93359375f,-1.2246467991473532e-16f,0f,-1f,0.0703125f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.head]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0f,0f,1f,0f,0.51171875f,-1.2246467991473532e-16f,0f,-1f,0f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.body]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,-0.1171875f,0f,1f,0f,0.42578125f,-1.2246467991473532e-16f,0f,-1f,0.015624999999999986f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.right_leg]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1f,0f,1.2246467991473532e-16f,0.140625f,0f,1f,0f,0.42578125f,-1.2246467991473532e-16f,0f,-1f,0.015625000000000017f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.bone.left_leg]")));
        return 1;
    }
    // animated_java:baby_golem/as_own_locator_entities
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/as_all_locators'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Native.data(c, "modify", "storage", "aj:temp", "command", "set", "value", "'$(command)'"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/zzz/12"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        return 1;
    }
    // animated_java:baby_golem/on_load
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "aj.animation_baby_golem_idle.frame", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "aj.animation_baby_golem_walk.frame", "dummy"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/root/on_load"), Control.as("@e[type=item_display,tag=aj.baby_golem.root]"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1"), Control.at("@s")));
        return 1;
    }
    // animated_java:baby_golem/remove/all
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/remove/this"), Control.as("@e[type=item_display,tag=aj.baby_golem.root]")));
        return 1;
    }
    // animated_java:baby_golem/remove/this
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'baby_golem', 'function_path': 'animated_java:baby_golem/remove/this'}")), Control.unless("entity", "@s[type=item_display,tag=aj.baby_golem.root]")));
        Logic.step(() -> Logic.call(c, "#animated_java:baby_golem/as_root/on_remove"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/remove/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // animated_java:baby_golem/remove/zzz/0
    private static int f19(Frame c) {

        return 1;
    }
    // animated_java:baby_golem/root/on_load
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.baby_golem.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/root/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.data]"), Control.unless("data", "entity", "@s", "{data:{rigHash: 'a4d4b4ee6b14a349a1f30d627dfb07f1b041590f9ed230e92ed3a658fd6a1a7e'}}"), Control.on("vehicle")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.is_rig_loaded", "1"));
        return 1;
    }
    // animated_java:baby_golem/root/on_tick
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.baby_golem.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "#animated_java:global/root/on_load"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1")));
        Logic.step(() -> Logic.call(c, "#animated_java:baby_golem/as_root/pre_tick"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/zzz/on_tick"), Control.when("entity", "@s[tag=aj.baby_golem.animation.animation_baby_golem_idle.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_walk/zzz/on_tick"), Control.when("entity", "@s[tag=aj.baby_golem.animation.animation_baby_golem_walk.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/root/zzz/1"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.baby_golem.data]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:baby_golem/as_root/post_tick"));
        return 1;
    }
    // animated_java:baby_golem/root/outdated_tellraw
    private static int f22(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[{\"text\":\"[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},{\"text\":\"] \"}],{\"text\":\"Error: \",\"color\":\"red\"},{\"text\":\"The \",\"color\":\"red\"},{\"text\":\"baby_golem\",\"color\":\"yellow\"},{\"text\":\" rig instance at\",\"color\":\"red\"},[{\"text\":\" [\",\"color\":\"yellow\"},{\"score\":{\"name\":\"#this.x\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.y\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.z\",\"objective\":\"aj.i\"}},\"]\"],{\"text\":\" is outdated! It will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"},\"\\n \",{\"text\":\"[Click Here to Teleport to the Rig Instance]\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/tp @s $(x) $(y) $(z)\"},\"color\":\"aqua\",\"underlined\":true}]"));
        return 1;
    }
    // animated_java:baby_golem/root/zzz/0
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[0]", "1"), Control.store("result", "storage", "aj:temp", "x", "int", "1"), Control.store("result", "score", "#this.x", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[1]", "1"), Control.store("result", "storage", "aj:temp", "y", "int", "1"), Control.store("result", "score", "#this.y", "aj.i")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Pos[2]", "1"), Control.store("result", "storage", "aj:temp", "z", "int", "1"), Control.store("result", "score", "#this.z", "aj.i")));
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/root/outdated_tellraw", "with", "storage", "aj:temp"));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.rigHash", "set", "value", "'a4d4b4ee6b14a349a1f30d627dfb07f1b041590f9ed230e92ed3a658fd6a1a7e'"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{Glowing: 1b, glow_color_override: 16711680}"), Control.on("passengers")));
        Logic.step(() -> Native.summon(c, "minecraft:text_display", "~", "~", "~", "{Tags:['aj.rig_entity', 'aj.outdated_rig_text_display', 'aj.new'], text:'[\"\",{\"text\":\"This rig instance is outdated!\\\\nIt will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"}]', billboard: \"vertical\", transformation:{translation:[0f,3f,0f],left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],scale:[1f,1f,1f]}}"));
        Logic.step(() -> Native.ride(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "mount", "@s"));
        Logic.step(() -> Native.tag(c, "@e[type=minecraft:text_display,tag=aj.new,limit=1,distance=..0.01]", "remove", "aj.new"));
        return 1;
    }
}
