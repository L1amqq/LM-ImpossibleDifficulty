package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled249 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/vampire/zzz/4", Compiled249::f0);
        Logic.register("impossible_to_survive:mobs/vampire/zzz/5", Compiled249::f1);
        Logic.register("impossible_to_survive:mobs/vampire/zzz/6", Compiled249::f2);
        Logic.register("impossible_to_survive:mobs/vampire/zzz/7", Compiled249::f3);
        Logic.register("impossible_to_survive:mobs/vampire/zzz/8", Compiled249::f4);
        Logic.register("impossible_to_survive:mobs/vampire/zzz/9", Compiled249::f5);
        Logic.register("impossible_to_survive:mobs/walking_diamond/ai_loop", Compiled249::f6);
        Logic.register("impossible_to_survive:mobs/walking_diamond/anim_start_idle", Compiled249::f7);
        Logic.register("impossible_to_survive:mobs/walking_diamond/anim_start_walk", Compiled249::f8);
        Logic.register("impossible_to_survive:mobs/walking_diamond/damage", Compiled249::f9);
        Logic.register("impossible_to_survive:mobs/walking_diamond/kill", Compiled249::f10);
        Logic.register("impossible_to_survive:mobs/walking_diamond/loop", Compiled249::f11);
        Logic.register("impossible_to_survive:mobs/walking_diamond/spawn", Compiled249::f12);
        Logic.register("impossible_to_survive:mobs/walking_diamond/zzz/0", Compiled249::f13);
        Logic.register("impossible_to_survive:mobs/walking_diamond/zzz/1", Compiled249::f14);
        Logic.register("impossible_to_survive:mobs/walking_diamond/zzz/2", Compiled249::f15);
        Logic.register("impossible_to_survive:mobs/walking_diamond/zzz/3", Compiled249::f16);
        Logic.register("impossible_to_survive:mobs/walking_diamond/zzz/4", Compiled249::f17);
        Logic.register("impossible_to_survive:mobs/wither_skeleton/hit", Compiled249::f18);
        Logic.register("impossible_to_survive:mobs/wither_skeleton/loop", Compiled249::f19);
        Logic.register("impossible_to_survive:mobs/wither_skeleton/zzz/0", Compiled249::f20);
        Logic.register("impossible_to_survive:mobs/wither_skeleton/zzz/1", Compiled249::f21);
        Logic.register("impossible_to_survive:mobs/wither_skeleton/zzz/2", Compiled249::f22);
        Logic.register("impossible_to_survive:mobs/wither_skeleton/zzz/3", Compiled249::f23);
    }
    // impossible_to_survive:mobs/vampire/zzz/4
    private static int f0(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "this_bat"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/convert"), Control.unless("function", "impossible_to_survive:mobs/vampire/line_of_sight")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this_bat"));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/zzz/5
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "blood_timer", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "vampire_done_timer", "10"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:player/particle/blood"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "blood_sec", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/6"), Control.when("score", "@s", "blood_sec", "matches", "..-1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/zzz/7"), Control.when("score", "@s", "blood_timer", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/zzz/6
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "blood_sec", "9"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "blood_10_sec", "1"));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/zzz/7
    private static int f3(Frame c) {
        Logic.step(() -> Native.title(c, "@s", "actionbar", "{\"text\":\"\"}"));
        Logic.step(() -> Native.gamerule(c, "showDeathMessages", "false"));
        Logic.step(() -> Native.kill(c, "@s"));
        Logic.step(() -> Native.tellraw(c, "@a", "[\"\",{\"selector\":\"@s\"},\" died to blood thirst\"]"));
        Logic.step(() -> Native.gamerule(c, "showDeathMessages", "true"));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/zzz/8
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "vampire_done_timer", "10"));
        return 1;
    }
    // impossible_to_survive:mobs/vampire/zzz/9
    private static int f5(Frame c) {
        Logic.step(() -> Native.tp(c, "@e[type=item_display,tag=aj.vampire.root,tag=this,limit=1,sort=nearest]", "@s"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this_vampire_ai"));
        return 1;
    }
    // impossible_to_survive:mobs/walking_diamond/ai_loop
    private static int f6(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s[nbt={Motion:[0.0,0.0,0.0]},scores={moveTimer=..6}]", "moveTimer", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s[scores={moveTimer=1..}]", "moveTimer", "1"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{Fire:-99s}"));
        return 1;
    }
    // impossible_to_survive:mobs/walking_diamond/anim_start_idle
    private static int f7(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/animations/idle/tween", "{to_frame:0,duration:2}"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "isMoving"));
        return 1;
    }
    // impossible_to_survive:mobs/walking_diamond/anim_start_walk
    private static int f8(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/animations/walk/tween", "{to_frame:0,duration:2}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "isMoving"));
        return 1;
    }
    // impossible_to_survive:mobs/walking_diamond/damage
    private static int f9(Frame c) {
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:diamond\"}", "~", "~0.15", "~", "0.2", "0.2", "0.2", "0.1", "10", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.glass.break", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.amethyst_block.hit", "master", "@a", "~", "~", "~", "1.5", "1.5"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mobHealth", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/walking_diamond/kill"), Control.when("entity", "@s[scores={mobHealth=..0}]")));
        return 1;
    }
    // impossible_to_survive:mobs/walking_diamond/kill
    private static int f10(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.allay.hurt", "master", "@a", "~", "~", "~", "1.0", "1.2"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.bee.sting", "master", "@a", "~", "~", "~", "1.5", "1.5"));
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/remove/this"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/walking_diamond/zzz/0"), Control.as("@e[type=cat,tag=walking_diamond_ai,limit=1,sort=nearest,tag=this_walking_diamond_ai]"), Control.at("@s")));
        Logic.step(() -> Native.summon(c, "item", "~", "~0.3", "~", "{Item:{id:\"minecraft:diamond\",Count:1b},Motion:[0.0,0.3,0.0]}"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~0.75", "~", "0.2", "0.2", "0.2", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:diamond\"}", "~", "~0.15", "~", "0.2", "0.2", "0.2", "0.1", "20", "force"));
        Logic.step(() -> Native.particle(c, "flash", "~", "~0.3", "~", "0", "0", "0", "0.1", "1", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~0.3", "~", "0.2", "0.2", "0.2", "0.05", "2", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/walking_diamond/loop
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.id", "=", "@s", "aj.id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/walking_diamond/zzz/1"), Control.as("@e[type=cat,tag=walking_diamond_ai,distance=..20]"), Control.when("score", "@s", "aj.id", "=", "#this", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/walking_diamond/ai_loop"), Control.as("@e[type=cat,tag=walking_diamond_ai,distance=..1,sort=nearest,tag=this_walking_diamond_ai]")), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/walking_diamond/kill"), Control.unless("entity", "@e[type=cat,tag=walking_diamond_ai,distance=..1,sort=nearest,tag=this_walking_diamond_ai]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/walking_diamond/damage"), Control.when("entity", "@e[type=cat,tag=walking_diamond_ai,tag=this_walking_diamond_ai,distance=..2,nbt={HurtTime:10s},limit=1]")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "isMoving", "1"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "isMoving", "0"), Control.at("@e[type=cat,tag=walking_diamond_ai,distance=..0.1,tag=this_walking_diamond_ai,sort=nearest,limit=1,scores={moveTimer=3..}]")), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/walking_diamond/anim_start_walk"), Control.when("entity", "@s[scores={isMoving=1},tag=!isMoving]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/walking_diamond/anim_start_idle"), Control.when("entity", "@s[scores={isMoving=0},tag=isMoving]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/walking_diamond/zzz/2"), Control.unless("entity", "@a[distance=..50]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/walking_diamond/zzz/4"), Control.as("@e[type=cat,tag=walking_diamond_ai,distance=..1,sort=nearest,tag=this_walking_diamond_ai]")));
        return 1;
    }
    // impossible_to_survive:mobs/walking_diamond/spawn
    private static int f12(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/summon", "{args:{}}"));
        Logic.step(() -> Native.summon(c, "cat", "~", "~-2", "~", "{Tags:[\"invis\",\"walking_diamond_ai\",\"new\"],PersistenceRequired:1,Silent:1b,CustomNameVisible:0b,Health:9999f,CustomName:'{\"text\":\"Diamond\"}',Attributes:[{Name:generic.max_health,Base:9999},{Name:generic.follow_range,Base:20},{Name:generic.knockback_resistance,Base:0.03},{Name:generic.movement_speed,Base:0.175},{Name:generic.attack_damage,Base:5}],active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],DeathLootTable:\"\",Rotation:[-20f]}"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@e[tag=new]", "aj.id", "=", "@e[tag=aj.walking_diamond.root,tag=!walking_diamond_init]", "aj.id"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@e[type=item_display,tag=aj.walking_diamond.root,tag=!walking_diamond_init]", "mobHealth", "1"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@e[type=item_display,tag=aj.walking_diamond.root,tag=!walking_diamond_init]", "mobHealth", "2"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@e[type=item_display,tag=aj.walking_diamond.root,tag=!walking_diamond_init]", "mobHealth", "3"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@e[type=item_display,tag=aj.walking_diamond.root,tag=!walking_diamond_init]", "damageTimer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@e[type=cat,tag=walking_diamond_ai,tag=new]", "moveTimer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~2", "~"), Control.as("@e[type=cat,tag=walking_diamond_ai,tag=new]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:walking_diamond/animations/walk/play"), Control.as("@e[type=item_display,tag=aj.walking_diamond.root,tag=!walking_diamond_init]"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@e[tag=aj.walking_diamond.root,tag=!walking_diamond_init]", "add", "walking_diamond_init"));
        Logic.step(() -> Native.tag(c, "@e[tag=new]", "remove", "new"));
        return 1;
    }
    // impossible_to_survive:mobs/walking_diamond/zzz/0
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/walking_diamond/zzz/1
    private static int f14(Frame c) {
        Logic.step(() -> Native.tp(c, "@e[type=item_display,tag=aj.walking_diamond.root,tag=this,limit=1,sort=nearest]", "@s"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this_walking_diamond_ai"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{Fire:-100s}"));
        return 1;
    }
    // impossible_to_survive:mobs/walking_diamond/zzz/2
    private static int f15(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:walking_diamond/remove/this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/walking_diamond/zzz/3"), Control.as("@e[type=cat,tag=walking_diamond_ai,limit=1,sort=nearest,tag=this_walking_diamond_ai]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/walking_diamond/zzz/3
    private static int f16(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "-100", "~"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/walking_diamond/zzz/4
    private static int f17(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "this_walking_diamond_ai"));
        return 1;
    }
    // impossible_to_survive:mobs/wither_skeleton/hit
    private static int f18(Frame c) {
        Logic.step(() -> Native.advancement(c, "revoke", "@s", "only", "impossible_to_survive:impossible_dragon/damaged_wither_skeleton"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/wither_skeleton/zzz/2"), Control.at("@s"), Control.as("@e[type=wither_skeleton,distance=..50]"), Control.unless("score", "@s", "wither_skeleton_invis_timer", "matches", "1.."), Control.when("entity", "@s[nbt={HurtTime:10s}]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:mobs/wither_skeleton/loop
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/wither_skeleton/zzz/0"), Control.when("score", "@s", "wither_skeleton_invis_timer", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:mobs/wither_skeleton/zzz/0
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "wither_skeleton_invis_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "smoke", "~", "~1", "~", "0.3", "0.8", "0.3", "0.01", "1"), Control.when("predicate", "mcm:random/50_percent")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/wither_skeleton/zzz/1"), Control.when("score", "@s", "wither_skeleton_invis_timer", "matches", "0")));
        return 1;
    }
    // impossible_to_survive:mobs/wither_skeleton/zzz/1
    private static int f21(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{HandItems:[{count:1,id:\"minecraft:stone_sword\"},{}],HandDropChances:[0.085F,0.085F]}"));
        return 1;
    }
    // impossible_to_survive:mobs/wither_skeleton/zzz/2
    private static int f22(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/wither_skeleton"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~1", "~", "0.5", "1", "0.5", "0.1", "10"));
        Logic.step(() -> Native.particle(c, "sculk_soul", "~", "~1", "~", "0.5", "1", "0.5", "0.1", "10"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.wither.hurt", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.fire.extinguish", "master", "@a", "~", "~", "~", "0.8", "1.0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/wither_skeleton/zzz/3"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/wither_skeleton/zzz/4"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/wither_skeleton/zzz/5"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3..")));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{HandItems:[{count:1,id:\"minecraft:netherite_sword\",components:{\"minecraft:custom_model_data\":1}},{}],HandDropChances:[0.0F,0.0F]}"));
        return 1;
    }
    // impossible_to_survive:mobs/wither_skeleton/zzz/3
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "wither_skeleton_invis_timer", "40"));
        Logic.step(() -> Native.effect(c, "give", "@s", "invisibility", "2", "9", "true"));
        Logic.step(() -> Native.effect(c, "give", "@s", "speed", "2", "0", "true"));
        return 1;
    }
}
