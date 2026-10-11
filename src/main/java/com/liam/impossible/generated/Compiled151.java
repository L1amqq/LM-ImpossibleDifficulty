package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled151 {
    public static void register() {
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/11", Compiled151::f0, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/12", Compiled151::f1, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/13", Compiled151::f2, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/14", Compiled151::f3, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/15", Compiled151::f4, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/16", Compiled151::f5, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/17", Compiled151::f6, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/18", Compiled151::f7, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/19", Compiled151::f8, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/2", Compiled151::f9, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/20", Compiled151::f10, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/3", Compiled151::f11, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/4", Compiled151::f12, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/5", Compiled151::f13, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/6", Compiled151::f14, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/7", Compiled151::f15, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/8", Compiled151::f16, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/frames/9", Compiled151::f17, "bone_hand_left", "bone_hand_right", "bone_leg_left", "bone_leg_right", "item_display_diamond");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/on_tick", Compiled151::f18);
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/set_frame", Compiled151::f19, "frame");
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/zzz/0", Compiled151::f20);
        Logic.register("animated_java:walking_diamond/animations/idle/zzz/zzz/1", Compiled151::f21);
        Logic.register("animated_java:walking_diamond/animations/pause_all", Compiled151::f22);
        Logic.register("animated_java:walking_diamond/animations/walk/apply_frame", Compiled151::f23, "frame");
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/11
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,1.86029308692594e-18f,9.180611212845311e-17f,2.325366358657425e-19f,0f,0.49976919708535333f,-0.022785668752261658f,0.3905961496356692f,-6.123233995736766e-17f,-0.015190445834841105f,-0.74965379562803f,-0.001898805729355138f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-1.8605078046280383e-18f,1.2245054649664695e-16f,-0.05625f,0f,0.9998845918831599f,0.015192199137934265f,0.1719471259108271f,-1.2246467991473532e-16f,0.015192199137934265f,-0.9998845918831599f,0.004747014323387838f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-1.8605078046280383e-18f,1.2245054649664695e-16f,0.0546875f,0f,0.9998845918831599f,0.015192199137934265f,0.1719471259108271f,-1.2246467991473532e-16f,0.015192199137934265f,-0.9998845918831599f,0.004747014323387852f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5941093260994867f,-0.8043843040746218f,1.2240814950460414e-16f,-0.19062500000000002f,-0.8040129955908689f,-0.5938350817713217f,-0.03038089166968221f,0.42183172445350375f,0.02443791240288387f,0.018049571076176312f,-0.9995383941707067f,-0.0028482085940327306f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6347562926638914f,0.7727123972886626f,1.2240814950460414e-16f,0.19375f,0.7723557087417069f,-0.6344632854590172f,-0.03038089166968221f,0.42183172445350375f,-0.02347569163384722f,0.019284462164070877f,-0.9995383941707067f,-0.0028482085940326834f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/12
    private static int f1(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,1.6491392555142868e-18f,9.181519232585517e-17f,2.0614240693928586e-19f,0f,0.4998186273777358f,-0.020199365931415674f,0.390602328422217f,-6.123233995736766e-17f,-0.013466243954277117f,-0.7497279410666037f,-0.0016832804942846396f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-1.6492888302167874e-18f,1.22453573541049e-16f,-0.05625f,0f,0.9999093095764915f,0.013467465324410982f,0.17193167894445757f,-1.2246467991473532e-16f,0.013467465324410982f,-0.9999093095764915f,0.004208201235711592f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-1.6492888302167874e-18f,1.22453573541049e-16f,0.0546875f,0f,0.9999093095764915f,0.013467465324410982f,0.17193167894445757f,-1.2246467991473532e-16f,0.013467465324410982f,-0.9999093095764915f,0.004208201235711606f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5916137496385201f,-0.806221539800724f,1.2242025643447355e-16f,-0.19062500000000002f,-0.8059290867711248f,-0.5913991445642411f,-0.026932487908554233f,0.4218409926333255f,0.021713551872299047f,0.015933630158673776f,-0.9996372547554716f,-0.0025249207414269827f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6322189693912839f,0.7747897616397774f,1.2242025643447355e-16f,0.19375000000000003f,0.7745087103382333f,-0.6319896349666365f,-0.026932487908554233f,0.4218409926333255f,-0.020867015887034844f,0.017027229748689466f,-0.9996372547554716f,-0.0025249207414269354f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/13
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,1.4221288974478042e-18f,9.182373475099344e-17f,1.7776611218097553e-19f,0f,0.4998651301742657f,-0.017418845561486943f,0.3906081412717832f,-6.123233995736766e-17f,-0.011612563707657961f,-0.7497976952613985f,-0.0014515704634572451f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-1.4222248082878074e-18f,1.2245642124124512e-16f,-0.05625f,0f,0.9999325628132457f,0.01161334687910029f,0.17191714682054196f,-1.2246467991473532e-16f,0.01161334687910029f,-0.9999325628132457f,0.003628926158643106f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-1.4222248082878074e-18f,1.2245642124124512e-16f,0.0546875f,0f,0.9999325628132457f,0.01161334687910029f,0.17191714682054196f,-1.2246467991473532e-16f,0.01161334687910029f,-0.9999325628132457f,0.0036289261586431192f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5890675739971456f,-0.8080837786177357f,1.2243164633465791e-16f,-0.19062500000000002f,-0.807865806380934f,-0.5889086791150442f,-0.023225127415315922f,0.42184971190767484f,0.018767848720646928f,0.013681169462314648f,-0.9997302603485314f,-0.0021773556951858912f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.629187244665641f,0.777253762390417f,1.2243164633465791e-16f,0.19375f,0.7770441062314472f,-0.6290175279175564f,-0.023225127415315922f,0.42184971190767484f,-0.018051817665551046f,0.014612953925451162f,-0.9997302603485314f,-0.002177355695185844f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/14
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,1.1872785198710254e-18f,9.183124255575833e-17f,1.4840981498387817e-19f,0f,0.4999060007598099f,-0.014542297265190931f,0.3906132500949762f,-6.123233995736766e-17f,-0.00969486484346062f,-0.7498590011397148f,-0.0012118581054325775f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-1.1873343254446995e-18f,1.2245892398603785e-16f,-0.05625f,0f,0.9999529992753708f,0.009695320530551079f,0.1719043747625594f,-1.2246467991473532e-16f,0.009695320530551079f,-0.9999529992753708f,0.0030296452635814367f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-1.1873343254446995e-18f,1.2245892398603785e-16f,0.0546875f,0f,0.9999529992753708f,0.009695320530551079f,0.1719043747625594f,-1.2246467991473532e-16f,0.009695320530551079f,-0.9999529992753708f,0.00302964526358145f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.586501452166468f,-0.8099481752597657f,1.224416567410111e-16f,-0.19062500000000002f,-0.8097959062336302f,-0.5863911907847199f,-0.01938972968692124f,0.42185737514246435f,0.01570467617870204f,0.011372104618494482f,-0.9998120015196198f,-0.0018177871581488898f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.625907462384943f,0.7798973320449564f,1.224416567410111e-16f,0.19375f,0.7797507125316794f,-0.625789792733156f,-0.01938972968692124f,0.42185737514246435f,-0.015121998451902686f,0.012136176504670963f,-0.9998120015196198f,-0.0018177871581488427f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/15
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,9.500208359649246e-19f,9.183745457817428e-17f,1.1875260449561558e-19f,0f,0.49993981743479066f,-0.011636263246999455f,0.3906174771793488f,-6.123233995736766e-17f,-0.00775750883133297f,-0.749909726152186f,-0.0009696886039166213f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-9.500494246007899e-19f,1.2246099473999627e-16f,-0.05625f,0f,0.999969908264639f,0.007757742275260517f,0.17189380705162793f,-1.2246467991473532e-16f,0.007757742275260517f,-0.999969908264639f,0.002424221509791546f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-9.500494246007899e-19f,1.2246099473999627e-16f,0.0546875f,0f,0.999969908264639f,0.007757742275260517f,0.17189380705162793f,-1.2246467991473532e-16f,0.007757742275260517f,-0.999969908264639f,0.0024242215097915595f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5839435462608025f,-0.8117942687530864f,1.224499394375657e-16f,-0.19062500000000002f,-0.8116965570300547f,-0.5838732598196996f,-0.01551501766266594f,0.42186371576902326f,0.012595002418155187f,0.009059894434236037f,-0.9998796348695813f,-0.0014545329058749553f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6225146366376195f,0.782608156852414f,1.224499394375657e-16f,0.19375000000000003f,0.7825139581195477f,-0.6224397075821931f,-0.01551501766266594f,0.42186371576902326f,-0.012142179376511564f,0.009658325582700833f,-0.9998796348695813f,-0.0014545329058749082f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/16
    private static int f5(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,7.151388438209631e-19f,9.184224558692792e-17f,8.939235547762039e-20f,0f,0.4999658984716903f,-0.008759327721905663f,0.3906207373089613f,-6.123233995736766e-17f,-0.005839551814603775f,-0.7499488477075354f,-0.0007299439768254719f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-7.151510377966027e-19f,1.2246259178055848e-16f,-0.05625f,0f,0.9999829490904784f,0.0058396513859711955f,0.1718856567275968f,-1.2246467991473532e-16f,0.0058396513859711955f,-0.9999829490904784f,0.0018248599420636728f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-7.151510377966027e-19f,1.2246259178055848e-16f,0.0546875f,0f,0.9999829490904784f,0.0058396513859711955f,0.1718856567275968f,-1.2246467991473532e-16f,0.0058396513859711955f,-0.9999829490904784f,0.0018248599420636865f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5814250557143228f,-0.8135999659461626f,1.2245632744923721e-16f,-0.19062500000000002f,-0.8135444759416196f,-0.581385400748328f,-0.01167910362920755f,0.42186860596344194f,0.009502118315005038f,0.00679052347830525f,-0.9999317969433806f,-0.0010949159652382313f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6191100703652901f,0.7853042217970596f,1.2245632744923721e-16f,0.19375f,0.785250661648757f,-0.6190678451661074f,-0.01167910362920755f,0.42186860596344194f,-0.009171649386821974f,0.007230650669682297f,-0.9999317969433806f,-0.0010949159652381842f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/17
    private static int f6(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,4.880680234390374e-19f,9.184559218646841e-17f,6.100850292987967e-20f,0f,0.499984116511062f,-0.005978066783567916f,0.39062301456388276f,-6.123233995736766e-17f,-0.003985377855711944f,-0.749976174766593f,-0.000498172231963993f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-4.880718995967387e-19f,1.2246370732767895e-16f,-0.05625f,0f,0.9999920582239952f,0.003985409506941538f,0.17187996359029312f,-1.2246467991473532e-16f,0.003985409506941538f,-0.9999920582239952f,0.0012454305799099756f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-4.880718995967387e-19f,1.2246370732767895e-16f,0.0546875f,0f,0.9999920582239952f,0.003985409506941538f,0.17187996359029312f,-1.2246467991473532e-16f,0.003985409506941538f,-0.9999920582239952f,0.0012454305799099892f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5789882091032275f,-0.8153359146507885f,1.2246078958195788e-16f,-0.19062500000000002f,-0.8153100138928263f,-0.5789698163975984f,-0.007970755711423888f,0.4218720218458241f,0.006498843398431863f,0.004614973574556539f,-0.999968233022124f,-0.0007472583479460128f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6157964647476708f,0.787905269689365f,1.2246078958195788e-16f,0.19375f,0.7878802403200944f,-0.6157769027549991f,-0.007970755711423888f,0.4218720218458241f,-0.006280200428437409f,0.004908363188462233f,-0.999968233022124f,-0.0007472583479459658f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/18
    private static int f7(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,2.7683155835676775e-19f,9.184757126414188e-17f,3.460394479459597e-20f,0f,0.4999948901081233f,-0.003390751830031834f,0.3906243612635154f,-6.123233995736766e-17f,-0.002260501220021223f,-0.749992335162185f,-0.00028256265250265286f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-2.7683226564914414e-19f,1.2246436702369907e-16f,-0.05625f,0f,0.9999974450507978f,0.0022605069955017676f,0.17187659684121145f,-1.2246467991473532e-16f,0.0022605069955017676f,-0.9999974450507978f,0.0007064066312566252f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-2.7683226564914414e-19f,1.2246436702369907e-16f,0.0546875f,0f,0.9999974450507978f,0.0022605069955017676f,0.17187659684121145f,-1.2246467991473532e-16f,0.0022605069955017676f,-0.9999974450507978f,0.0007064066312566389f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5767022033403255f,-0.8169544471158804f,1.2246342835218918e-16f,-0.19062500000000002f,-0.8169460980180945f,-0.5766963095685173f,-0.004521002440042446f,0.4218740418952731f,0.003693453048814493f,0.002607272068479366f,-0.9999897802162466f,-0.0004238439787540026f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6127136265031261f,0.7903050119399394f,1.2246342835218918e-16f,0.19375f,0.7902969351936182f,-0.6127073647023605f,-0.004521002440042446f,0.4218740418952731f,-0.003572970887358165f,0.0027700798004679857f,-0.9999897802162466f,-0.0004238439787539555f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/19
    private static int f8(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,9.721331330279993e-20f,9.184839418307384e-17f,1.2151664162849992e-20f,0f,0.4999993698701387f,-0.001190710415898898f,0.39062492123376735f,-6.123233995736766e-17f,-0.0007938069439325986f,-0.749999054805208f,-0.00009922586799157483f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-9.721334393132034e-20f,1.2246464133040337e-16f,-0.05625f,0f,0.9999996849350198f,0.0007938071940334478f,0.17187519691558165f,-1.2246467991473532e-16f,0.0007938071940334478f,-0.9999996849350198f,0.0002480646699789302f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-9.721334393132034e-20f,1.2246464133040337e-16f,0.0546875f,0f,0.9999996849350198f,0.0007938071940334478f,0.17187519691558165f,-1.2246467991473532e-16f,0.0007938071940334478f,-0.9999996849350198f,0.0002480646699789438f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.574715455934699f,-0.8183533128849487f,1.2246452557743178e-16f,-0.19062500000000002f,-0.8183522815472296f,-0.5747147316439579f,-0.0015876138878651973f,0.42187488185065103f,0.001299229084716708f,0.0009124262394126067f,-0.9999987397402774f,-0.00014883880198738559f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6101187313203635f,0.7923099984804118f,1.2246452557743178e-16f,0.19375000000000003f,0.7923089999640329f,-0.6101179624123004f,-0.0015876138878651973f,0.42187488185065103f,-0.0012578823570818804f,0.0009686329710910011f,-0.9999987397402774f,-0.00014883880198733853f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/2
    private static int f9(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,3.42018012468812e-19f,9.184707714865526e-17f,4.27522515586015e-20f,0f,0.4999922002686966f,-0.004189183518549245f,0.39062402503358706f,-6.123233995736766e-17f,-0.0027927890123661636f,-0.749988300403045f,-0.00034909862654577045f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-3.42019346300914e-19f,1.2246420231800528e-16f,-0.05625f,0f,0.9999961001267438f,0.0027927999039318203f,0.1718774374160323f,-1.2246467991473532e-16f,0.0027927999039318203f,-0.9999961001267438f,0.0008727465663644192f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-3.42019346300914e-19f,1.2246420231800528e-16f,0.0546875f,0f,0.9999961001267438f,0.0027927999039318203f,0.1718774374160323f,-1.2246467991473532e-16f,0.0027927999039318203f,-0.9999961001267438f,0.0008727465663644329f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5796576666648463f,-0.8148601042367127f,1.2246276953154034e-16f,-0.19062500000000002f,-0.8148473928569869f,-0.5796486243167505f,-0.005585578024732327f,0.4218735375503806f,0.0045514646914557476f,0.003237723124790682f,-0.9999844005373932f,-0.000523647939818679f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6127136265031266f,0.7903050119399392f,1.2246276953154034e-16f,0.19375000000000003f,0.7902926836064574f,-0.6127040684998213f,-0.005585578024732327f,0.4218735375503806f,-0.004414310307527468f,0.003422359767650011f,-0.9999844005373932f,-0.0005236479398186319f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/20
    private static int f10(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,0f,9.184850993605148e-17f,0f,0f,0.5f,0f,0.390625f,-6.123233995736766e-17f,0f,-0.75f,0f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,-0.05625f,0f,1f,0f,0.171875f,-1.2246467991473532e-16f,0f,-1f,-6.888638245203862e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,0f,1.2246467991473532e-16f,0.0546875f,0f,1f,0f,0.171875f,-1.2246467991473532e-16f,0f,-1f,6.697287182837088e-18f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.573576436351046f,-0.8191520442889917f,1.2246467991473532e-16f,-0.19062500000000002f,-0.8191520442889917f,-0.573576436351046f,0f,0.421875f,7.024285468436541e-17f,-1.0031719290535246e-16f,-1f,-2.3344829608746423e-17f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6087614290087204f,0.7933533402912355f,1.2246467991473532e-16f,0.19375f,0.7933533402912355f,-0.6087614290087204f,0f,0.421875f,7.455177354798982e-17f,9.715776287805224e-17f,-1f,2.3727531733479968e-17f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/3
    private static int f11(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,6.180638634910527e-19f,9.184383088079136e-17f,7.725798293638159e-20f,0f,0.4999745284095333f,-0.0075703116676747876f,0.3906218160511917f,-6.123233995736766e-17f,-0.005046874445116525f,-0.7499617926143f,-0.0006308593056395656f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-6.180717351762375e-19f,1.2246312021971657e-16f,-0.05625f,0f,0.9999872641236655f,0.005046938722303959f,0.17188295987202085f,-1.2246467991473532e-16f,0.005046938722303959f,-0.9999872641236655f,0.0015771482640989072f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-6.180717351762375e-19f,1.2246312021971657e-16f,0.0546875f,0f,0.9999872641236655f,0.005046938722303959f,0.17188295987202085f,-1.2246467991473532e-16f,0.005046938722303959f,-0.9999872641236655f,0.001577148264098921f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5849711966993818f,-0.8110540666515968f,1.2245844117438848e-16f,-0.19062500000000002f,-0.8110127489775327f,-0.5849413964058675f,-0.01009374889023305f,0.4218702240767875f,0.008186576085183628f,0.005904552367502584f,-0.9999490568190667f,-0.0009462889584593718f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6157964647476708f,0.787905269689365f,1.2245844117438848e-16f,0.19375f,0.7878651312886529f,-0.615765094116949f,-0.01009374889023305f,0.4218702240767875f,-0.007952917941535726f,0.006215694882656334f,-0.9999490568190667f,-0.0009462889584593247f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/4
    private static int f12(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,9.162664401747325e-19f,9.183822626252545e-17f,1.1453330502184156e-19f,0f,0.49994401828873875f,-0.011222824909345366f,0.39061800228609234f,-6.123233995736766e-17f,-0.007481883272896911f,-0.7499160274331081f,-0.0009352354091121138f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-9.162920883332545e-19f,1.2246125197558383e-16f,-0.05625f,0f,0.9999720087526145f,0.007482092706004809f,0.17189249428476913f,-1.2246467991473532e-16f,0.007482092706004809f,-0.9999720087526145f,0.0023380885227802777f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-9.162920883332545e-19f,1.2246125197558383e-16f,0.0546875f,0f,0.9999720087526145f,0.007482092706004809f,0.17189249428476913f,-1.2246467991473532e-16f,0.007482092706004809f,-0.9999720087526145f,0.002338088522780291f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5905922141567259f,-0.8069701584181761f,1.2245096835003393e-16f,-0.19062500000000002f,-0.8068798072773661f,-0.5905260894311137f,-0.014963766545793821f,0.4218645034291385f,0.012075313059991917f,0.008837484016404617f,-0.9998880365774775f,-0.0014028531136681941f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6191100703652896f,0.7853042217970603f,1.2245096835003393e-16f,0.19375f,0.7852162964486665f,-0.6190407526828934f,-0.014963766545793821f,0.4218645034291385f,-0.011751109042397425f,0.009264218559096276f,-0.9998880365774775f,-0.001402853113668147f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/5
    private static int f13(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,1.2210303076589613e-18f,9.183024675288338e-17f,1.5262878845737017e-19f,0f,0.4999005798614435f,-0.01495570365891321f,0.39061257248268044f,-6.123233995736766e-17f,-0.00997046910594214f,-0.7498508697921652f,-0.0012463086382427675f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-1.221091009686436e-18f,1.224585920356944e-16f,-0.05625f,0f,0.9999502886951148f,0.009970964775612101f,0.17190606879329892f,-1.2246467991473532e-16f,0.009970964775612101f,-0.9999502886951148f,0.0031157715956069117f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-1.221091009686436e-18f,1.224585920356944e-16f,0.0546875f,0f,0.9999502886951148f,0.009970964775612101f,0.17190606879329892f,-1.2246467991473532e-16f,0.009970964775612101f,-0.9999502886951148f,0.003115771595606925f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5958539420841071f,-0.8030928213493315f,1.224403290038445e-16f,-0.19062500000000002f,-0.8029331341501869f,-0.5957354623211443f,-0.01994093821188428f,0.42185635872402066f,0.01601442432893491f,0.011881886642406756f,-0.999801159722887f,-0.0018694629573641746f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6225146366376195f,0.782608156852414f,1.224403290038445e-16f,0.19375000000000003f,0.7824525428296346f,-0.6223908556547636f,-0.01994093821188428f,0.42185635872402066f,-0.015605940899910553f,0.01241352590518446f,-0.999801159722887f,-0.0018694629573641275f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/6
    private static int f14(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,1.5191816262945488e-18f,9.18202372772048e-17f,1.898977032868186e-19f,0f,0.49984609081374115f,-0.018607589069994657f,0.39060576135171765f,-6.123233995736766e-17f,-0.012405059379996438f,-0.7497691362206117f,-0.0015506324224995548f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-1.5192985477951336e-18f,1.2245525533247338e-16f,-0.05625f,0f,0.999923042445638f,0.012406014116502224f,0.1719230966207059f,-1.2246467991473532e-16f,0.012406014116502224f,-0.999923042445638f,0.00387658105624888f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-1.5192985477951336e-18f,1.2245525533247338e-16f,0.0546875f,0f,0.999923042445638f,0.012406014116502224f,0.1719230966207059f,-1.2246467991473532e-16f,0.012406014116502224f,-0.999923042445638f,0.0038765810562488936f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5999942620237633f,-0.800004303450025f,1.2242698303627307e-16f,-0.19062500000000002f,-0.7997580474273299f,-0.5998095727665071f,-0.024810118759992877f,0.4218461420275765f,0.019848201777100574f,0.014885928896123753f,-0.9996921816274823f,-0.0023259486337493555f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.625907462384943f,0.7798973320449564f,1.2242698303627307e-16f,0.19375f,0.7796572653174754f,-0.625714796568525f,-0.024810118759992877f,0.4218461420275765f,-0.01934934542863689f,0.015528838474536306f,-0.9996921816274823f,-0.0023259486337493082f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/7
    private static int f15(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,1.7951348463859302e-18f,9.18090307756288e-17f,2.243918557982413e-19f,0f,0.4997850854605579f,-0.02198758263569267f,0.39059813568256974f,-6.123233995736766e-17f,-0.014658388423795115f,-0.7496776281908368f,-0.0018322985529743894f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-1.795327777773684e-18f,1.2245151948746464e-16f,-0.05625f,0f,0.9998925369561261f,0.01465996382813118f,0.17194216079357566f,-1.2246467991473532e-16f,0.01465996382813118f,-0.9998925369561261f,0.004580746382435967f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-1.795327777773684e-18f,1.2245151948746464e-16f,0.0546875f,0f,0.9998925369561261f,0.01465996382813118f,0.17194216079357566f,-1.2246467991473532e-16f,0.01465996382813118f,-0.9998925369561261f,0.004580746382435981f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.6018150231520485f,-0.7986355100472927f,1.2241204103417173e-16f,-0.19062500000000002f,-0.7982922332816449f,-0.6015563455549884f,-0.02931677684759023f,0.4218347035238546f,0.023413419030617957f,0.017643276737275858f,-0.9995701709211158f,-0.0027484478294616073f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6291872446656415f,0.7772537623904168f,1.2241204103417173e-16f,0.19375f,0.7769196761216692f,-0.6289168016918212f,-0.02931677684759023f,0.4218347035238546f,-0.022786575105949693f,0.01844574204721286f,-0.9995701709211158f,-0.00274844782946156f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/8
    private static int f16(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,2.0230939247096537e-18f,9.179836453967743e-17f,2.528867405887067e-19f,0f,0.49972702117645146f,-0.024779723338821575f,0.3905908776470564f,-6.123233995736766e-17f,-0.016519815559214383f,-0.7495905317646772f,-0.002064976944901798f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-2.0233701121556817e-18f,1.2244796364173566e-16f,-0.05625f,0f,0.9998635012722744f,0.016522070800858095f,0.17196030588235892f,-1.2246467991473532e-16f,0.016522070800858095f,-0.9998635012722744f,0.005162442362254488f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-2.0233701121556817e-18f,1.2244796364173566e-16f,0.0546875f,0f,0.9998635012722744f,0.016522070800858095f,0.17196030588235892f,-1.2246467991473532e-16f,0.016522070800858095f,-0.9998635012722744f,0.005162442362254502f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.6007034080371887f,-0.7994719604667236f,1.2239781938623658e-16f,-0.19062500000000002f,-0.7990354826362671f,-0.6003754494179335f,-0.03303963111842877f,0.42182381647058464f,0.02641425866334769f,0.019847019013131614f,-0.9994540423529029f,-0.0030974654173527203f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6322189693912839f,0.7747897616397774f,1.2239781938623658e-16f,0.19375f,0.7743667592445177f,-0.6318738046103048f,-0.03303963111842877f,0.42182381647058464f,-0.02559876791891352f,0.02088828153476132f,-0.9994540423529029f,-0.003097465417352673f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/frames/9
    private static int f17(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "$(item_display_diamond)", "{ transformation: [-0.5f,2.136977846428571e-18f,9.179255830546213e-17f,2.6712223080357136e-19f,0f,0.4996954135095479f,-0.026174622526875725f,0.3905869266886935f,-6.123233995736766e-17f,-0.017449748351250485f,-0.7495431202643218f,-0.0021812185439063106f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_right)", "{ transformation: [-1f,-2.137303368083792e-18f,1.224460279508133e-16f,-0.05625f,0f,0.9998476951563913f,0.01745240643728352f,0.1719701832782663f,-1.2246467991473532e-16f,0.01745240643728352f,-0.9998476951563913f,0.00545304635976577f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_leg_left)", "{ transformation: [-1f,-2.137303368083792e-18f,1.224460279508133e-16f,0.0546875f,0f,0.9998476951563913f,0.01745240643728352f,0.1719701832782663f,-1.2246467991473532e-16f,0.01745240643728352f,-0.9998476951563913f,0.005453046359765784f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_right)", "{ transformation: [0.5987590689202256f,-0.8009291962375855f,1.2239007774061617e-16f,-0.19062500000000002f,-0.8004412918116203f,-0.598394321073368f,-0.03489949670250097f,0.4218178900330402f,0.02795202584303044f,0.020896390151373866f,-0.9993908270190958f,-0.003271827815859489f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        Logic.step(() -> Native.data(c, "merge", "entity", "$(bone_hand_left)", "{ transformation: [0.6347562926638914f,0.7727123972886626f,1.2239007774061617e-16f,0.19375000000000003f,0.7722416817742246f,-0.6343696162809417f,-0.03489949670250097f,0.4218178900330402f,-0.026967273761157224f,0.022152675142715312f,-0.9993908270190958f,-0.003271827815859442f,0f,0f,0f,1f], start_interpolation: 0, interpolation_duration: 2 }"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/on_tick
    private static int f18(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "aj.tween_duration", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(1), Control.when("score", "@s", "aj.tween_duration", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "interpolation_duration", "set", "value", "2"), Control.when("score", "@s", "aj.tween_duration", "matches", "0"), Control.on("passengers")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/idle/zzz/zzz/0"), Control.when("score", "@s", "aj.idle.frame", "matches", "-1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "get", "@s", "aj.idle.frame"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/animations/idle/zzz/apply_frame", "with", "storage", "aj:temp"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:walking_diamond/animations/idle/zzz/zzz/1")), Control.when("score", "@s", "aj.idle.frame", "matches", "19..")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.idle.frame", "1"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/set_frame
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/idle/zzz/frames/$(frame)", "with", "entity", "@s", "data.bones"), Control.on("passengers"), Control.when("entity", "@s[type=marker]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s[type=!marker]", "start_interpolation", "set", "value", "-1"), Control.on("passengers")));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/zzz/0
    private static int f20(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/animations/idle/zzz/apply_frame", "{frame: 20}"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "aj.idle.frame", "1"));
        return 1;
    }
    // animated_java:walking_diamond/animations/idle/zzz/zzz/1
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "aj.idle.frame", "-1"));
        return 1;
    }
    // animated_java:walking_diamond/animations/pause_all
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/pause_all'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.walking_diamond.animation.walk.playing"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.walking_diamond.animation.idle.playing"));
        return 1;
    }
    // animated_java:walking_diamond/animations/walk/apply_frame
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "animated_java:global/errors/function_not_executed_as_root_entity", "{'export_namespace': 'walking_diamond', 'function_path': 'animated_java:walking_diamond/animations/walk/apply_frame'}")), Control.unless("entity", "@s[type=item_display,tag=aj.walking_diamond.root]")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "aj.walk.frame", "$(frame)"), Control.store("result", "storage", "aj:temp", "frame", "int", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/walk/zzz/apply_frame", "with", "storage", "aj:temp"), Control.at("@s")));
        return 1;
    }
}
