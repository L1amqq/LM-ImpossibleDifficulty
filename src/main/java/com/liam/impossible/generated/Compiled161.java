package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled161 {
    public static void register() {
        Logic.register("impossible_to_survive:dragon_welcome_message", Compiled161::f3);
        Logic.register("impossible_to_survive:effects/electric_circle/init", Compiled161::f4);
        Logic.register("impossible_to_survive:effects/electric_circle/loop", Compiled161::f5);
        Logic.register("impossible_to_survive:effects/electric_circle/summon", Compiled161::f6);
        Logic.register("impossible_to_survive:effects/electric_circle/zzz/0", Compiled161::f7);
        Logic.register("impossible_to_survive:effects/electric_circle/zzz/1", Compiled161::f8);
        Logic.register("impossible_to_survive:effects/electric_circle/zzz/2", Compiled161::f9);
        Logic.register("impossible_to_survive:effects/electric_circle/zzz/3", Compiled161::f10);
        Logic.register("impossible_to_survive:effects/electric_circle/zzz/4", Compiled161::f11);
        Logic.register("impossible_to_survive:effects/electric_circle/zzz/5", Compiled161::f12);
        Logic.register("impossible_to_survive:effects/electric_shield/init", Compiled161::f13);
        Logic.register("impossible_to_survive:effects/electric_shield/loop", Compiled161::f14);
        Logic.register("impossible_to_survive:effects/electric_shield/summon", Compiled161::f15);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/0", Compiled161::f16);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/1", Compiled161::f17);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/10", Compiled161::f18);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/11", Compiled161::f19);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/12", Compiled161::f20);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/13", Compiled161::f21);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/14", Compiled161::f22);
        Logic.register("impossible_to_survive:effects/electric_shield/zzz/2", Compiled161::f23);
    }
    // impossible_to_survive:dragon_welcome_message
    private static int f3(Frame c) {
        Logic.step(() -> Native.tellraw(c, "@s", "{\"text\":\"\"}"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\"},{\"text\":\"I\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"m\",\"bold\":true,\"color\":\"#dba832\"},{\"text\":\"p\",\"bold\":true,\"color\":\"#ddad31\"},{\"text\":\"o\",\"bold\":true,\"color\":\"#dfb32f\"},{\"text\":\"s\",\"bold\":true,\"color\":\"#e2b82e\"},{\"text\":\"s\",\"bold\":true,\"color\":\"#e4be2d\"},{\"text\":\"i\",\"bold\":true,\"color\":\"#e6c32b\"},{\"text\":\"b\",\"bold\":true,\"color\":\"#e9c82a\"},{\"text\":\"l\",\"bold\":true,\"color\":\"#ebce28\"},{\"text\":\"e \",\"bold\":true,\"color\":\"#edd327\"},{\"text\":\"E\",\"bold\":true,\"color\":\"#f0d926\"},{\"text\":\"n\",\"bold\":true,\"color\":\"#edd327\"},{\"text\":\"d\",\"bold\":true,\"color\":\"#ebce28\"},{\"text\":\"e\",\"bold\":true,\"color\":\"#e9c82a\"},{\"text\":\"r\",\"bold\":true,\"color\":\"#e6c32b\"},{\"text\":\"d\",\"bold\":true,\"color\":\"#e4be2d\"},{\"text\":\"r\",\"bold\":true,\"color\":\"#e2b82e\"},{\"text\":\"a\",\"bold\":true,\"color\":\"#dfb32f\"},{\"text\":\"g\",\"bold\":true,\"color\":\"#ddad31\"},{\"text\":\"o\",\"bold\":true,\"color\":\"#dba832\"},{\"text\":\"n\",\"bold\":true,\"color\":\"gold\"}]"));
        Logic.step(() -> Native.tellraw(c, "@s", "{\"translate\":\"impossible_difficulty.author\",\"with\":[\"LIAM\"],\"color\":\"blue\"}"));
        Logic.step(() -> Native.tellraw(c, "@s", "{\"text\":\"\"}"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u0040\",\"font\":\"minecraft:icons\",\"color\":\"#4e5c24\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/trigger dragon_difficulty set 2\"},\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"Click and then run the command with a number between 1-3!\",\"color\":\"aqua\"}]}},{\"text\":\" Click to change: \",\"font\":\"minecraft:default\",\"color\":\"white\",\"bold\":false},{\"text\":\"[\",\"font\":\"minecraft:default\",\"color\":\"white\",\"bold\":true},{\"text\":\"Difficulty\",\"font\":\"minecraft:default\",\"color\":\"#9265E6\",\"bold\":false},{\"text\":\"]\",\"font\":\"minecraft:default\",\"color\":\"white\",\"bold\":true}]"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u0040\",\"font\":\"minecraft:icons\",\"color\":\"#4e5c24\",\"clickEvent\":{\"action\":\"suggest_command\",\"value\":\"/trigger toggle_flashbang\"},\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"Click and then run the function to enable/disable flashbang effects!\",\"color\":\"aqua\"}]}},{\"text\":\" Click to change: \",\"font\":\"minecraft:default\",\"color\":\"white\",\"bold\":false},{\"text\":\"[\",\"font\":\"minecraft:default\",\"color\":\"white\",\"bold\":true},{\"text\":\"Flashbang\",\"font\":\"minecraft:default\",\"color\":\"yellow\",\"bold\":false},{\"text\":\"]\",\"font\":\"minecraft:default\",\"color\":\"white\",\"bold\":true}]"));
        return 1;
    }
    // impossible_to_survive:effects/electric_circle/init
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/electric_circle/loop
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Native.tp(c, "@s", "@n[tag=aj.impossible_dragon.locator.tail_locator,distance=..10]"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "311"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "312"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "313"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "314"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "315"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "316"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "317"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "318"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "319"), Control.when("score", "@s", "mcm.animation", "matches", "9")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "320"), Control.when("score", "@s", "mcm.animation", "matches", "10")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "321"), Control.when("score", "@s", "mcm.animation", "matches", "11")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "322"), Control.when("score", "@s", "mcm.animation", "matches", "12")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "323"), Control.when("score", "@s", "mcm.animation", "matches", "13")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "324"), Control.when("score", "@s", "mcm.animation", "matches", "14")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "325"), Control.when("score", "@s", "mcm.animation", "matches", "15")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "326"), Control.when("score", "@s", "mcm.animation", "matches", "16")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "327"), Control.when("score", "@s", "mcm.animation", "matches", "17")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "328"), Control.when("score", "@s", "mcm.animation", "matches", "18")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "329"), Control.when("score", "@s", "mcm.animation", "matches", "19")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "330"), Control.when("score", "@s", "mcm.animation", "matches", "20")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "331"), Control.when("score", "@s", "mcm.animation", "matches", "21")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "332"), Control.when("score", "@s", "mcm.animation", "matches", "22")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "333"), Control.when("score", "@s", "mcm.animation", "matches", "23")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "334"), Control.when("score", "@s", "mcm.animation", "matches", "24")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "335"), Control.when("score", "@s", "mcm.animation", "matches", "25")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "336"), Control.when("score", "@s", "mcm.animation", "matches", "26")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "19..")));
        Logic.step(() -> Logic.returnValue(0));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:2,start_interpolation:0,transformation:{scale:[4f,4f,4f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{interpolation_duration:4,start_interpolation:0,transformation:{scale:[2f,2f,2f]}}"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_circle/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_circle/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "5..8")));
        return 1;
    }
    // impossible_to_survive:effects/electric_circle/summon
    private static int f6(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.electric_circle\",\"mcm.vfx\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0.0f,0f],scale:[10f,10f,10f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":311}}}"));
        return 1;
    }
    // impossible_to_survive:effects/electric_circle/zzz/0
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_circle/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_circle/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/electric_circle/zzz/1
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "232"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "233"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/electric_circle/zzz/2
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "234"), Control.when("score", "@s", "mcm.animation", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "235"), Control.when("score", "@s", "mcm.animation", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/electric_circle/zzz/3
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_circle/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_circle/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "7..8")));
        return 1;
    }
    // impossible_to_survive:effects/electric_circle/zzz/4
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "236"), Control.when("score", "@s", "mcm.animation", "matches", "5")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "237"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        return 1;
    }
    // impossible_to_survive:effects/electric_circle/zzz/5
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "238"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Native.kill(x0, "@s"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/init
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lifetime", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.animation", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.random", "dummy"));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/loop
    private static int f14(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "1..7")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/5"), Control.when("score", "@s", "mcm.animation", "matches", "8..15")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.animation", "0"), Control.when("score", "@s", "mcm.animation", "matches", "60..")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/summon
    private static int f15(Frame c) {
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.electric_shield\",\"mcm.vfx\",\"mcm.its.dragon.force_field.component\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[7f,7f,7f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":1}}}"));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/0
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "1..4")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/4"), Control.when("score", "@s", "mcm.animation", "matches", "5..7")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/1
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/3"), Control.when("score", "@s", "mcm.animation", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/10
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "13"), Control.when("score", "@s", "mcm.animation", "matches", "12")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "14"), Control.when("score", "@s", "mcm.animation", "matches", "13")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/11
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "15"), Control.when("score", "@s", "mcm.animation", "matches", "14")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/12"), Control.when("score", "@s", "mcm.animation", "matches", "15")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/12
    private static int f20(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..25"), Control.store("result", "score", "#temp", "mcm.animation")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@s", "mcm.animation", "+=", "#temp", "mcm.animation"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "1..4"), Control.store("result", "score", "#temp", "mcm.random")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/13"), Control.when("score", "#temp", "mcm.random", "matches", "1..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/zzz/14"), Control.when("score", "#temp", "mcm.random", "matches", "3..4")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/13
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation:{left_rotation:[0f,0f,0f,1f]}}"), Control.when("score", "#temp", "mcm.random", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation:{left_rotation:[0f,0f,1f,0f]}}"), Control.when("score", "#temp", "mcm.random", "matches", "2")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/14
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation:{left_rotation:[0f,0f,0.707f,0.707f]}}"), Control.when("score", "#temp", "mcm.random", "matches", "3")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{transformation:{left_rotation:[0f,0f,0.707f,-0.707f]}}"), Control.when("score", "#temp", "mcm.random", "matches", "4")));
        return 1;
    }
    // impossible_to_survive:effects/electric_shield/zzz/2
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "2"), Control.when("score", "@s", "mcm.animation", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "entity", "@s", "item.components.\"minecraft:custom_model_data\"", "set", "value", "3"), Control.when("score", "@s", "mcm.animation", "matches", "2")));
        return 1;
    }
}
