package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled120 {
    public static void register() {
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/16", Compiled120::f0, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/17", Compiled120::f1, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/18", Compiled120::f2, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/19", Compiled120::f3, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/2", Compiled120::f4, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/20", Compiled120::f5, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/3", Compiled120::f6, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/4", Compiled120::f7, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/5", Compiled120::f8, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/6", Compiled120::f9, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/7", Compiled120::f10, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/8", Compiled120::f11, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/frames/9", Compiled120::f12, "bone_body", "bone_jaw", "bone_leg_left", "bone_leg_right", "bone_tail");
        Logic.register("animated_java:land_shark/animations/walk/zzz/on_tick", Compiled120::f13);
        Logic.register("animated_java:land_shark/animations/walk/zzz/set_frame", Compiled120::f14, "frame");
        Logic.register("animated_java:land_shark/animations/walk/zzz/zzz/0", Compiled120::f15);
        Logic.register("animated_java:land_shark/animations/walk/zzz/zzz/1", Compiled120::f16);
        Logic.register("animated_java:land_shark/apply_default_pose", Compiled120::f17);
        Logic.register("animated_java:land_shark/on_load", Compiled120::f18);
        Logic.register("animated_java:land_shark/remove/all", Compiled120::f19);
        Logic.register("animated_java:land_shark/remove/this", Compiled120::f20);
        Logic.register("animated_java:land_shark/root/on_load", Compiled120::f21);
        Logic.register("animated_java:land_shark/root/on_tick", Compiled120::f22);
        Logic.register("animated_java:land_shark/root/outdated_tellraw", Compiled120::f23, "x", "y", "z");
    }
    // animated_java:land_shark/animations/walk/zzz/frames/16
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [-0.03265352716422162f,0.029526465480623102f,0.9990304975324612f,0.013245447306834112f,-0.11434777449386267f,0.9928897911914369f,-0.03308245783077987f,0.5468951865648048f,-0.9929039901380374f,-0.11531717297976987f,-0.02904506815136886f,0.5623473950317947f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-0.07240395499833406f,0.03307009427077114f,0.9968269840677075f,-0.014751097157317641f,0.0014915416282851924f,0.9994526241504039f,-0.033048863557503076f,0.6476809370245611f,-0.9973742740837916f,-0.0009060594868285672f,-0.07241364824420896f,-0.5154136183560959f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.03247141272921219f,0.029726627043984374f,0.9990304975324612f,-0.18474001710132792f,-0.10824237642226396f,0.993573922227398f,-0.03308245783077987f,0.48254771081152326f,-0.9935940797437502f,-0.10921166931355031f,-0.02904506815136886f,-0.041532901180554985f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.025304679864003442f,0.03602413325846002f,0.9990304975324612f,0.16648164218742792f,0.10835240888648683f,0.9935619288561586f,-0.03308245783077987f,0.47091715923038974f,-0.9937904349838932f,0.10741021995418532f,-0.02904506815136886f,-0.0517440579525206f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.032691537289437814f,0.03720385605461753f,1.123909309724019f,0f,0.00006225984218968545f,1.1243842021692043f,-0.03721776505962736f,0.640625f,-1.1245249039098089f,-0.001019316922682138f,-0.032675701670289964f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/17
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [-0.04114531774703611f,0.038170369796284354f,0.998423800646354f,0.017536507031949443f,-0.07763997812165178f,0.9961264084971834f,-0.04128210377115163f,0.5469141558099023f,-0.9961320678628739f,-0.07921616731524948f,-0.03802239091795155f,0.5622331021047211f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-0.12322696169027536f,0.04125496119994665f,0.9915206221198702f,-0.01933040572813695f,0.0035997169417707835f,0.9991475279740061f,-0.04112492408955782f,0.6476876225450572f,-0.9923719856739823f,-0.0014985058637394194f,-0.12327042033534966f,-0.5152621021176836f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.04594141596715631f,0.032238185461070476f,0.998423800646354f,-0.1863963115323684f,-0.21200451602196999f,0.9763963708937667f,-0.04128210377115163f,0.48405913037954557f,-0.9761882356826592f,-0.2135669129421959f,-0.03802239091795155f,-0.03982246443113642f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.028428167135160984f,0.04839166887207977f,0.998423800646354f,0.16461205588236538f,0.2121461501845567f,0.9763656071728967f,-0.04128210377115163f,0.4695458907725001f,-0.976824370229985f,0.21063819101405998f,-0.03802239091795155f,-0.053189711238228764f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.04280831928888888f,0.04641183134993998f,1.1232267757271484f,0f,0.00008152688506920603f,1.124040968970757f,-0.04644236674254558f,0.640625f,-1.124185234359991f,-0.0016858190967068468f,-0.0427751897826955f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/18
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [-0.045523694151766485f,0.04357597272737489f,0.9980123886363536f,0.020244825165034615f,-0.04353099305640293f,0.998012620822559f,-0.045561621156518996f,0.546925673694461f,-0.998014351557281f,-0.04551860366652124f,-0.043536315943707646f,0.5621440169600006f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-0.16729124720825203f,0.045521952315468225f,0.9848560252467852f,-0.022149722951174147f,0.005745588189909601f,0.9989615266815158f,-0.045197969273929314f,0.6476917411486973f,-0.9858907783440617f,-0.0019026475036966555f,-0.16737907010321562f,-0.5151485514337453f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.055434041506721994f,0.029972306727903367f,0.9980123886363536f,-0.18728211104382442f,-0.3061389156135071f,0.950895947527686f,-0.045561621156518996f,0.48485242856224764f,-0.9503715228210582f,-0.3080560952242833f,-0.043536315943707646f,-0.03876341092949592f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.02752578509624013f,0.05668865215540146f,0.9980123886363536f,0.16358161933614357f,0.3062969095819967f,0.9508450672207897f,-0.045561621156518996f,0.46883467112440896f,-0.9515379836534924f,0.30443399097127105f,-0.043536315943707646f,-0.05406914700345564f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.04902501638921952f,0.051212196354901755f,1.1227639372158977f,0f,0.00009336635829375458f,1.1238317175167054f,-0.05125682380108387f,0.640625f,-1.123931287513058f,-0.0021404784416587373f,-0.0489783554366711f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/19
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [-0.04161771483762899f,0.042091010336924084f,0.9982466191580669f,0.019048655703351014f,-0.014884742384901886f,0.9989752454899078f,-0.04274228986043504f,0.5469152636495764f,-0.9990227275972399f,-0.01663748019368596f,-0.04094855305106403f,0.5621840859798766f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-0.19696495384074889f,0.0427096861710939f,0.9794798056446484f,-0.020831328902509643f,0.00678018502980027f,0.9990861274884103f,-0.04220117239098385f,0.6476914519074225f,-0.9803870848034838f,-0.001671097656792098f,-0.197074532558492f,-0.515203552098739f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.0542270464764032f,0.02373003940020456f,0.9982466191580669f,-0.18674079432346666f,-0.38302886819919374f,0.9227469765778326f,-0.04274228986043504f,0.4843296869151881f,-0.9221433259295925f,-0.3846750608585557f,-0.04094855305106403f,-0.03926749290967446f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.021472658669522672f,0.05515987916186389f,0.9982466191580669f,0.1642052827242912f,0.3831779903840456f,0.9226850623819217f,-0.04274228986043504f,0.4693031006361289f,-0.9234249036142065f,0.3815883428357289f,-0.04094855305106403f,-0.05366346859168916f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.046105377563782135f,0.048048396942480635f,1.1230274465528252f,0f,0.00009082379677011242f,1.1239718934244616f,-0.04808507609298942f,0.640625f,-1.1240548411491047f,-0.0018799848638911102f,-0.04606712218244703f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/2
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [-0.009721565651665482f,0.010310484386296895f,0.9998995874951645f,0.0042044811136306365f,-0.04363961143602951f,0.9989897648666852f,-0.010725390683660784f,0.5468707517678427f,-0.9990000377752708f,-0.043739497063006144f,-0.00926179905215817f,0.5624835782287232f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-0.13347630087358706f,0.010725089357469658f,0.9909939704979935f,-0.004700384269607592f,0.0013501555442486035f,0.9999424811962644f,-0.010640083602336045f,0.647664682805918f,-0.9910510855577073f,-0.00008220299664072346f,-0.13348310401529237f,-0.5156034603794593f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.012103887392316763f,0.007369588658387216f,0.9998995874951645f,-0.18030086218202712f,-0.3065022969115995f,0.9518094914333416f,-0.010725390683660784f,0.4784832002792656f,-0.9517929595757199f,-0.30660133916930243f,-0.00926179905215817f,-0.04520974492284697f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.0055286302122356315f,0.01304795673567588f,0.9998995874951645f,0.17122633654674158f,0.3065349245055536f,0.9517989840575883f,-0.010725390683660784f,0.4747125551170411f,-0.9518433559711129f,0.3064448478469928f,-0.00926179905215817f,-0.04846584615212133f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.010419916481786834f,0.012065725527153365f,1.12488703593206f,0f,0.00001928124001507271f,1.1249352913457975f,-0.012066064519118382f,0.640625f,-1.1249517433955762f,-0.0000924783712208139f,-0.01041952393367794f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/20
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [-0.031061806319097374f,0.03314010576808818f,0.9989679161904423f,0.014365381138734005f,0.000059634460375674464f,0.9994502448791466f,-0.033154252438338014f,0.5468929951586187f,-0.9995174638954167f,-0.0009702580552794835f,-0.031046706224334687f,0.5623195351338544f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-0.20405886587981178f,0.03314010576808818f,0.9783975228124429f,-0.015783227514602715f,0.005815903996751442f,0.9994502448791466f,-0.03264020943122879f,0.6476831335529376f,-0.9789413437568898f,-0.0009702580552794835f,-0.20413942314692812f,-0.5153830144480254f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-0.04215717084003452f,0.01690784932773331f,0.9989679161904423f,-0.18483423084520717f,-0.4223318780113271f,0.905834742301641f,-0.033154252438338014f,0.4825610907804241f,-0.9054604120347777f,-0.4232936856018882f,-0.031046706224334687f,-0.041163003611693755f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-0.014145943052809817f,0.04316242251393972f,0.9989679161904423f,0.16636542719049516f,0.4224399723629555f,0.9057843370776734f,-0.033154252438338014f,0.4709052989075708f,-0.9062805095803018f,0.4215349807400185f,-0.031046706224334687f,-0.052077861268686416f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [-0.034944532108984544f,0.0372826189890992f,1.1238389057142477f,0f,0.00006708876792263377f,1.12438152548904f,-0.03729853399313027f,0.640625f,-1.1244571468823439f,-0.0010915403121894188f,-0.03492754450237652f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/3
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [0.0022636662811930984f,-0.0006172619377220453f,0.9999972473975455f,-0.0011682504543266924f,-0.07778257514910591f,0.9969700319378574f,0.0007914676249898979f,0.5468773248809975f,-0.9969677762185402f,-0.07778415266317398f,0.002208795221600235f,0.5624991743110899f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-0.08324802397360254f,-0.0007914566803637754f,0.9965285445489325f,0.0011333471284844224f,-0.00007169609391822124f,0.9999996867811233f,0.0007882241593740073f,0.6476541435740126f,-0.9965288562626576f,-0.000005829100406028479f,-0.08324805464310242f,-0.5156237831660452f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [0.0023264611743147364f,-0.000304591097665483f,0.9999972473975455f,-0.177891123871223f,-0.21226019708888122f,0.9772128643805237f,0.0007914676249898979f,0.47642137992371003f,-0.9772104155759872f,-0.21226145413964195f,0.002208795221600235f,-0.04726737096480608f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [0.001990477879704979f,-0.0012422540572588753f,0.9999972473975455f,0.1736704084169765f,0.21225222122695137f,0.9772145967817017f,0.0007914676249898979f,0.4766996302606205f,-0.9772128901022722f,0.21225006158216617f,0.002208795221600235f,-0.04649084139471225f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [0.0024848990362215926f,-0.0008903887654092473f,1.1249969033222387f,0f,-0.000004591033455534042f,1.1249996476287636f,0.0008904010781136351f,0.640625f,-1.1249972556658536f,-0.000006557737956782038f,0.0024848946243002643f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/4
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [0.014635069934112566f,-0.010297435326580996f,0.9998398759570049f,-0.006399009329120034f,-0.11448190713026042f,0.9933539810341809f,0.011906355586937103f,0.5468955814047247f,-0.993317526105244f,-0.11463782617111615f,0.013358934947026791f,0.5624670312732983f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [-0.0300597672791089f,-0.011904961956414883f,0.9994772044783926f,0.006805134456066727f,-0.0005416579777713591f,0.9999291165291789f,0.011894054136871255f,0.6476429768612051f,-0.9995479563271396f,-0.0001838423020468621f,-0.030064084956090906f,-0.5155802723605443f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [0.014571495682862314f,-0.010387201733181502f,0.9998398759570049f,-0.17551706179115598f,-0.10837365317566888f,0.9940389278061484f,0.011906355586937103f,0.4744521483905638f,-0.994003431991522f,-0.1085297933572019f,0.013358934947026791f,-0.04922021499788304f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [0.011991530793330455f,-0.013282531216379326f,0.9998398759570049f,0.17598914459997847f,0.10832439442084602f,0.9940442969355009f,0.011906355586937103f,0.47863797652659634f,-0.9940432730835161f,0.10816427365119922f,0.013358934947026791f,-0.044523714430568934f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [0.015030199025067859f,-0.013393082200966744f,1.1248198604516304f,0f,-0.000027872158670562983f,1.1249202560953262f,0.013394650035304241f,0.640625f,-1.124899592114963f,-0.00020682258980271988f,0.01502880181540514f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/5
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [0.026909099889377956f,-0.018373575696088468f,0.9994690150571369f,-0.01130174718205797f,-0.1521296096608734f,0.988109835733497f,0.02226060176975428f,0.5469232267621931f,-0.9879941711404847f,-0.15264784388539981f,0.02379398137270895f,0.5623944885067095f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [0.023800868060687718f,-0.022253238422174623f,0.9994690150571369f,0.012115854511136191f,-0.00004443665194975993f,0.9997522011149724f,0.02226060176975428f,0.647631595015428f,-0.9997167182281895f,-0.0005742347024300993f,0.02379398137270895f,-0.5154829704241617f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [0.023800868060687718f,-0.022253238422174623f,0.9994690150571369f,-0.17326383068806972f,-0.00004443665194975993f,0.9997522011149724f,0.02226060176975428f,0.47263590184627724f,-0.9997167182281895f,-0.0005742347024300993f,0.02379398137270895f,-0.05100581371809272f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [0.023800868060687718f,-0.022253238422174623f,0.9994690150571369f,0.17811199491795493f,-0.00004443665194975993f,0.9997522011149724f,0.02226060176975428f,0.48046189465595646f,-0.9997167182281895f,-0.0005742347024300993f,0.02379398137270895f,-0.04264074214174973f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [0.02677597656827368f,-0.025034893224946453f,1.124402641939279f,0f,-0.00004999123344347992f,1.124721226254344f,0.025043176990973564f,0.640625f,-1.1246813080067133f,-0.0006460140402338617f,0.026768229044297567f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/6
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [0.03838648990076143f,-0.024536874234345522f,0.9989616705339134f,-0.015643768774427153f,-0.1895293920234573f,0.9813732298000517f,0.03138779047709095f,0.5469561743462278f,-0.9811243993257521f,-0.19053746517318595f,0.03302101471880582f,0.562295950633806f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [0.07637731467427313f,-0.03136860083801804f,0.9965854286937034f,0.016815300036433087f,0.0013005476189490617f,0.9995072799841814f,0.03136089658338896f,0.6476207188713726f,-0.9970781385523596f,-0.0010991542604499049f,0.07638047840170836f,-0.5153512246067918f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [0.029445713936762326f,-0.0347639286451878f,0.9989616705339134f,-0.17124492189695f,0.10824149120371415f,0.9936289982639206f,0.03138779047709095f,0.47104947154513466f,-0.9936884469051409f,0.10720486497444873f,0.03302101471880582f,-0.052550946994422955f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [0.036243710359776325f,-0.027603881311329938f,0.9989616705339134f,0.17995254040012884f,-0.1083651387570955f,0.9936155208686717f,0.03138779047709095f,0.48208424163473695f,-0.9934502454383473f,-0.10939023002731246f,0.03302101471880582f,-0.04094199650734279f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [0.03716915020598269f,-0.0352896759427703f,1.1238318793506525f,0f,-0.0000699636894895949f,1.1244456899822042f,0.03531126428672732f,0.640625f,-1.1243858098437776f,-0.001236548543006143f,0.03714864155865655f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/7
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [0.047894639596299374f,-0.028387026300143336f,0.9984489372200138f,-0.019037820569234077f,-0.2255233145187323f,0.9734769414745045f,0.03849518185343906f,0.5469874401140522f,-0.9730597813631109f,-0.22701722656062767f,0.040222391006690464f,0.5621964792370894f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [0.1254243772536901f,-0.03846090751544662f,0.9913573947793055f,0.020486141505438617f,0.0032132959400611666f,0.9992587828703965f,0.03836091220989794f,0.6476116665595849f,-0.992097979193449f,-0.001625868833015976f,0.1254549968347703f,-0.5152184814213934f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [0.031174343883455323f,-0.04612895021199277f,0.9984489372200138f,-0.16965176341566138f,0.2120243301811204f,0.9765059162059992f,0.03849518185343906f,0.46982357241700246f,-0.9767670365520547f,0.21049540509716969f,0.040222391006690464f,-0.053734873795482904f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [0.047501481857426954f,-0.029040127161790694f,0.9984489372200138f,0.18136544107574967f,-0.21217356512531524f,0.9764735015534647f,0.03849518185343906f,0.4833570347873521f,-0.9760768348257025f,-0.2136730487879619f,0.040222391006690464f,-0.039594189457193285f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [0.045287061297614395f,-0.043268520954877446f,1.1232550543725155f,0f,-0.00008590201630367207f,1.1241661307291961f,0.04330707958511894f,0.640625f,-1.1240881080679883f,-0.001829102437142973f,0.04525018988252677f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/8
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [0.052888824597606694f,-0.029018550810693277f,0.9981786893845864f,-0.020601570925023065f,-0.25863493160900725f,0.9650720589153358f,0.04175994794679244f,0.5470034641682484f,-0.9645261761011402f,-0.2603725116247141f,0.04353631594370823f,0.5621440169600005f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [0.16731191813567434f,-0.04171666420892757f,0.9850210363119363f,0.022176478883173506f,0.005108348647270808f,0.9991276694495835f,0.04144641015023699f,0.6476073235115993f,-0.9858907783440615f,-0.0019026475036966629f,0.16737907010321618f,-0.5151485514337452f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [0.0286922438133133f,-0.05306655447102797f,0.9981786893845864f,-0.16891372980863475f,0.306189844393317f,0.9510540920146853f,0.04175994794679244f,0.46926323573797635f,-0.9515379836534923f,0.304433990971271f,0.04353631594370823f,-0.05427322348444187f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [0.054267582789649715f,-0.026350209043529593f,0.9981786893845864f,0.18200846567813386f,-0.30634783836180657f,0.9510032117077889f,0.04175994794679244f,0.4839444674380206f,-0.9503715228210581f,-0.30805609522428323f,0.04353631594370823f,-0.03896748741048195f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [0.04902501638922005f,-0.046931247235043515f,1.1229510255576598f,0f,-0.00009336635829375458f,1.1240186281307816f,0.0469799414401415f,0.640625f,-1.1239312875130578f,-0.0021404784416587455f,0.048978355436671756f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/frames/9
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_jaw)", "{ transformation: [0.04854363405045106f,-0.024573894202604283f,0.9985187225670308f,-0.01869276769925174f,-0.28625700281399913f,0.9574195804031359f,0.037478999461422635f,0.5469831531442106f,-0.9569223813523863f,-0.2876523436101337f,0.03944217644192051f,0.5622073438271494f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_tail)", "{ transformation: [0.1955164439698289f,-0.03744682499343619f,0.9799852322536823f,0.020089825592285754f,0.005801111730030207f,0.9992974126596073f,0.03702739734994041f,0.6476125481501347f,-0.9806832655042546f,-0.0015544612332350053f,0.19559630980717896f,-0.5152340751348687f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [0.022096301378302652f,-0.04972035949693164f,0.9985187225670308f,-0.1698672437699012f,0.3831150193650658f,0.9229399799208375f,0.037478999461422635f,0.46999829765804657f,-0.923436319083403f,0.38171937246519194f,0.03944217644192051f,-0.05360907663985061f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [0.050814560347892765f,-0.019448422551848907f,0.9985187225670308f,0.18117449463257052f,-0.3832538754459162f,0.9228823281193854f,0.037478999461422635f,0.4831745084062029f,-0.9222441907718022f,-0.3845906490090313f,0.03944217644192051f,-0.03974268648448793f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_body)", "{ transformation: [0.04440681508477276f,-0.04212767811761572f,1.1233335628879095f,0f,-0.00008457116209757958f,1.1242095892420583f,0.042163874394100465f,0.640625f,-1.1241232261730674f,-0.001748768887389381f,0.04437244849716057f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/on_tick
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "2"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/walk/zzz/zzz/0"), Control.when("score", "@s", "aj.walk.frame", "matches", "-1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.walk.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/animations/walk/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:land_shark/animations/walk/zzz/zzz/1")), Control.when("score", "@s", "aj.walk.frame", "matches", "19..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.walk.frame", "1"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/set_frame
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/walk/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/zzz/0
    private static int f15(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:land_shark/animations/walk/zzz/apply_frame", "{frame: 20}"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.walk.frame", "1"));
        return 1;
    }
    // animated_java:land_shark/animations/walk/zzz/zzz/1
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.walk.frame", "-1"));
        return 1;
    }
    // animated_java:land_shark/apply_default_pose
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/apply_default_pose'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-9.957992501029599e-17f,0f,1f,5.601370781829149e-17f,0f,1f,0f,0.546875f,-1f,0f,-9.957992501029599e-17f,0.5625f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.jaw]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-9.957992501029599e-17f,0f,1f,-5.134589883343387e-17f,0f,1f,0f,0.6476562499999999f,-1f,0f,-9.957992501029599e-17f,-0.515625f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.tail]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-9.957992501029599e-17f,0f,1f,-0.17812499999999998f,0f,1f,0f,0.4765625f,-1f,0f,-9.957992501029599e-17f,-0.04687499999999998f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.leg_right]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-9.957992501029599e-17f,0f,1f,0.17343749999999997f,0f,1f,0f,0.4765625f,-1f,0f,-9.957992501029599e-17f,-0.046875000000000014f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.leg_left]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation: [-1.1202741563658298e-16f,0f,1.125f,0f,0f,1.125f,0f,0.640625f,-1.125f,0f,-1.1202741563658298e-16f,0f,0f,0f,0f,1f], start_interpolation: 0}"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.bone.body]")));
        return 1;
    }
    // animated_java:land_shark/on_load
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "aj.walk.frame", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "aj.idle.frame", "dummy"));
        return 1;
    }
    // animated_java:land_shark/remove/all
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/remove/this"), Control.as("@e[type=item_display,tag=aj.land_shark.root]")));
        return 1;
    }
    // animated_java:land_shark/remove/this
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'land_shark', 'function_path': 'animated_java:land_shark/remove/this'}")), Control.unless("entity", "@s[type=item_display,tag=aj.land_shark.root]")));
        Logic.step(() -> Logic.call(c, "#animated_java:land_shark/as_root/on_remove"));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.on("passengers")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // animated_java:land_shark/root/on_load
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.land_shark.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/root/zzz/0"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.land_shark.data]"), Control.unless("data", "entity", "@s", "{data:{rigHash: '6beb9df1900ac261d5a1869f73ce567e7d6ace1534895437745fc45bf3e1d244'}}"), Control.on("vehicle")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.is_rig_loaded", "1"));
        return 1;
    }
    // animated_java:land_shark/root/on_tick
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=aj.land_shark.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "#animated_java:global/root/on_load"), Control.unless("score", "@s", "aj.is_rig_loaded", "matches", "1")));
        Logic.step(() -> Logic.call(c, "#animated_java:land_shark/as_root/pre_tick"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/walk/zzz/on_tick"), Control.when("entity", "@s[tag=aj.land_shark.animation.walk.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:land_shark/animations/idle/zzz/on_tick"), Control.when("entity", "@s[tag=aj.land_shark.animation.idle.playing]")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "~"), Control.at("@s"), Control.on("passengers")));
        Logic.step(() -> Logic.call(c, "#animated_java:land_shark/as_root/post_tick"));
        return 1;
    }
    // animated_java:land_shark/root/outdated_tellraw
    private static int f23(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",[[{\"text\":\"\\n[\",\"color\":\"gray\"},{\"text\":\"AJ\",\"color\":\"aqua\"},\"] \",[{\"text\":\"(from \",\"color\":\"gray\",\"italic\":true},\"land_shark\",\")\"],\" -> \"],{\"text\":\"ERROR: \",\"color\":\"red\"},\"\\n \"],{\"text\":\"The \",\"color\":\"red\"},{\"text\":\"land_shark\",\"color\":\"yellow\"},{\"text\":\" rig instance at\",\"color\":\"red\"},[{\"text\":\" [\",\"color\":\"yellow\"},{\"score\":{\"name\":\"#this.x\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.y\",\"objective\":\"aj.i\"}},\", \",{\"score\":{\"name\":\"#this.z\",\"objective\":\"aj.i\"}},\"]\"],{\"text\":\" is outdated! It will not function correctly and should be removed or re-summoned.\",\"color\":\"red\"},\"\\n \",{\"text\":\"[Click Here to Teleport to the Rig Instance]\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/tp @s $(x) $(y) $(z)\"},\"color\":\"aqua\",\"underlined\":true},[\"\\n\"]]"));
        return 1;
    }
}
