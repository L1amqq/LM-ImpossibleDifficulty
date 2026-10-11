package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled202 {
    public static void register() {
        Logic.register("impossible_to_survive:math/internal/subtract_handling", Compiled202::f0, "v2p", "var1", "var2");
        Logic.register("impossible_to_survive:math/load", Compiled202::f1);
        Logic.register("impossible_to_survive:math/multiply", Compiled202::f2, "x", "y");
        Logic.register("impossible_to_survive:math/sin", Compiled202::f3, "x");
        Logic.register("impossible_to_survive:math/subtract", Compiled202::f4, "x", "y");
        Logic.register("impossible_to_survive:mobs/baby_golem/ai_loop", Compiled202::f5);
        Logic.register("impossible_to_survive:mobs/baby_golem/anim_start_idle", Compiled202::f6);
        Logic.register("impossible_to_survive:mobs/baby_golem/anim_start_walk", Compiled202::f7);
        Logic.register("impossible_to_survive:mobs/baby_golem/damage", Compiled202::f8);
        Logic.register("impossible_to_survive:mobs/baby_golem/damage_timer", Compiled202::f9);
        Logic.register("impossible_to_survive:mobs/baby_golem/kill", Compiled202::f10);
        Logic.register("impossible_to_survive:mobs/baby_golem/loop", Compiled202::f11);
        Logic.register("impossible_to_survive:mobs/baby_golem/spawn", Compiled202::f12);
        Logic.register("impossible_to_survive:mobs/baby_golem/spawn2", Compiled202::f13);
        Logic.register("impossible_to_survive:mobs/baby_golem/spawn3", Compiled202::f14);
        Logic.register("impossible_to_survive:mobs/baby_golem/spawn_many", Compiled202::f15);
        Logic.register("impossible_to_survive:mobs/baby_golem/zzz/0", Compiled202::f16);
        Logic.register("impossible_to_survive:mobs/baby_golem/zzz/1", Compiled202::f17);
        Logic.register("impossible_to_survive:mobs/baby_golem/zzz/2", Compiled202::f18);
        Logic.register("impossible_to_survive:mobs/baby_golem/zzz/3", Compiled202::f19);
        Logic.register("impossible_to_survive:mobs/baby_golem/zzz/4", Compiled202::f20);
        Logic.register("impossible_to_survive:mobs/baby_golem/zzz/5", Compiled202::f21);
        Logic.register("impossible_to_survive:mobs/blaze/blaze_as_loop", Compiled202::f22);
        Logic.register("impossible_to_survive:mobs/blaze/blaze_hit", Compiled202::f23);
    }
    // impossible_to_survive:math/internal/subtract_handling
    private static int f0(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "91bb5-0-0-0-ffff", "0", "~$(v2p)$(var2)", "0"), Control.positioned("~", "$(var1)", "~")));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:math_io", "out", "set", "from", "entity", "91bb5-0-0-0-ffff", "Pos[1]"));
        Logic.step(() -> Native.tp(c, "91bb5-0-0-0-ffff", "0", "0", "0"));
        Logic.step(() -> Logic.returnFromAction(Native.data(c, "get", "storage", "mcm:math_io", "out")));
        return 1;
    }
    // impossible_to_survive:math/load
    private static int f1(Frame c) {
        Logic.step(() -> Native.forceload(c, "add", "29999999", "91665"));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "item_display", "29999999", "0", "91665", "{UUID:[I;596917,0,0,65535],CustomName:'\"mcm.math.math_entity\"'}"), Control.unless("entity", "91bb5-0-0-0-ffff")));
        return 1;
    }
    // impossible_to_survive:math/multiply
    private static int f2(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:math_io", "out", "set", "value", "\"fail\""));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm._temp_:std", "var1", "set", "value", "[0f,0f,0f,$(x)f,0f,1f,0f,0f,0f,0f,1f,0f,0f,0f,0f,1f]"));
        Logic.step(() -> Native.data(c, "modify", "entity", "91bb5-0-0-0-ffff", "transformation", "set", "value", "[0f,0f,0f,1f,0f,1f,0f,0f,0f,0f,1f,0f,0f,0f,0f,$(y)f]"));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm._temp_:std", "var1[-1]", "set", "from", "entity", "91bb5-0-0-0-ffff", "transformation.translation[0]"));
        Logic.step(() -> Native.data(c, "modify", "entity", "91bb5-0-0-0-ffff", "transformation", "set", "from", "storage", "mcm._temp_:std", "var1"));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:math_io", "out", "set", "from", "entity", "91bb5-0-0-0-ffff", "transformation.translation[0]"));
        Logic.step(() -> Logic.returnFromAction(Native.data(c, "get", "storage", "mcm:math_io", "out")));
        Logic.step(() -> Logic.returnFailed());
        Logic.step(() -> Native.tp(c, "invalid-input", "$(x)", "$(y)", "0"));
        return 1;
    }
    // impossible_to_survive:math/sin
    private static int f3(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:math_io", "out", "set", "value", "\"fail\""));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "impossible_to_survive:math/internal/sin_handling")), Control.rotated("$(x)", "0"), Control.positioned("0.0", "0.0", "0.0"), Control.positioned("^", "^", "^-1"), Control.as("91bb5-0-0-0-ffff")));
        Logic.step(() -> Logic.returnFailed());
        Logic.step(() -> Native.tp(c, "invalid-input", "$(x)", "0", "0"));
        return 1;
    }
    // impossible_to_survive:math/subtract
    private static int f4(Frame c) {
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm:math_io", "out", "set", "value", "\"fail\""));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm._temp_:std", "var1", "set", "value", "$(x)"));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm._temp_:std", "var2", "set", "value", "$(y)"));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm._temp_:std", "tv2p", "set", "value", "$(y)"));
        Logic.step(() -> Native.data(c, "modify", "storage", "mcm._temp_:std", "tv2p", "set", "string", "storage", "mcm._temp_:std", "tv2p", "0", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "mcm._temp_:std", "var2", "set", "string", "storage", "mcm._temp_:std", "var2", "1"), Control.when("data", "storage", "mcm._temp_:std", "{tv2p:\"-\"}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "mcm._temp_:std", "v2dt", "set", "string", "storage", "mcm._temp_:std", "var2", "-1"), Control.when("data", "storage", "mcm._temp_:std", "{tv2p:\"-\"}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "mcm._temp_:std", "var2", "set", "string", "storage", "mcm._temp_:std", "var2", "0", "-1"), Control.when("data", "storage", "mcm._temp_:std", "{tv2p:\"-\"}"), Control.when("data", "storage", "mcm._temp_:std", "{v2dt:\"d\"}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "mcm._temp_:std", "v2p", "set", "value", "\"\""), Control.when("data", "storage", "mcm._temp_:std", "{tv2p:\"-\"}")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "modify", "storage", "mcm._temp_:std", "v2p", "set", "value", "\"-\""), Control.unless("data", "storage", "mcm._temp_:std", "{tv2p:\"-\"}")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:math/internal/convert_to_double", "with", "storage", "mcm._temp_:std"));
        Logic.step(() -> Logic.returnFromAction(Logic.call(c, "impossible_to_survive:math/internal/subtract_handling", "with", "storage", "mcm._temp_:std")));
        Logic.step(() -> Logic.returnFailed());
        Logic.step(() -> Native.tp(c, "invalid-input", "$(x)", "$(y)", "0"));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/ai_loop
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s[nbt={Motion:[0.0,0.0,0.0]},scores={moveTimer=..6}]", "moveTimer", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s[scores={moveTimer=1..}]", "moveTimer", "1"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{Fire:-99s}"));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/anim_start_idle
    private static int f6(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/animations/animation_baby_golem_walk/stop"));
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/animations/animation_baby_golem_idle/play"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "isMoving"));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/anim_start_walk
    private static int f7(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/animations/animation_baby_golem_idle/stop"));
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/animations/animation_baby_golem_walk/play"));
        Logic.step(() -> Native.tag(c, "@s", "add", "isMoving"));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/damage
    private static int f8(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/variants/red/apply"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.iron_golem.hurt", "master", "@a", "~", "~", "~", "0.8", "2.0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "damageTimer", "8"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mobHealth", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/kill"), Control.when("entity", "@s[scores={mobHealth=..0}]")));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/damage_timer
    private static int f9(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "damageTimer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/variants/default/apply"), Control.when("score", "@s", "damageTimer", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/kill
    private static int f10(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.iron_golem.death", "master", "@a", "~", "~", "~", "1.0", "1.8"));
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/remove/this"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/zzz/0"), Control.as("@e[type=zombie,tag=baby_golem_ai,limit=1,sort=nearest,tag=this_baby_golem_ai]"), Control.at("@s")));
        Logic.step(() -> Native.summon(c, "item", "~", "~0.3", "~", "{Item:{id:\"minecraft:raw_iron\",Count:1b},Motion:[0.0,0.3,0.0]}"));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~0.75", "~", "0.2", "0.2", "0.2", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~0.75", "~", "0.2", "0.2", "0.2", "0.05", "10", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/loop
    private static int f11(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.id", "=", "@s", "aj.id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/zzz/1"), Control.as("@e[type=zombie,tag=baby_golem_ai,distance=..20]"), Control.when("score", "@s", "aj.id", "=", "#this", "aj.id")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~", "~", "0"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:mobs/baby_golem/ai_loop"), Control.as("@e[type=zombie,tag=baby_golem_ai,distance=..1,sort=nearest,tag=this_baby_golem_ai]")), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/damage"), Control.when("entity", "@e[type=zombie,tag=baby_golem_ai,tag=this_baby_golem_ai,distance=..2,nbt={HurtTime:10s},limit=1]")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "isMoving", "1"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.scoreboard(x1, "players", "set", "@s", "isMoving", "0"), Control.at("@e[type=zombie,tag=baby_golem_ai,distance=..0.1,tag=this_baby_golem_ai,sort=nearest,limit=1,scores={moveTimer=3..}]")), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/damage_timer"), Control.as("@s[scores={damageTimer=1..}]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/anim_start_walk"), Control.when("entity", "@s[scores={isMoving=1},tag=!isMoving]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/anim_start_idle"), Control.when("entity", "@s[scores={isMoving=0},tag=isMoving]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/kill"), Control.unless("entity", "@e[type=zombie,tag=baby_golem_ai,distance=..1,sort=nearest,tag=this_baby_golem_ai]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/zzz/2"), Control.unless("entity", "@a[distance=..50]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/zzz/4"), Control.as("@e[type=zombie,tag=baby_golem_ai,distance=..1,sort=nearest,tag=this_baby_golem_ai]")));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/spawn
    private static int f12(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/iron"));
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/summon", "{args:{}}"));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "zombie", "~", "~-2", "~", "{Tags:[\"invis\",\"baby_golem_ai\",\"new\"],PersistenceRequired:1,Silent:1b,CustomNameVisible:0b,Health:9999f,IsBaby:1b,CustomName:'{\"text\":\"Baby Iron Golem\"}',Attributes:[{Name:generic.max_health,Base:9999},{Name:generic.follow_range,Base:20},{Name:generic.knockback_resistance,Base:0.03},{Name:generic.movement_speed,Base:0.175},{Name:generic.attack_damage,Base:5}],IsBaby:1b,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],DeathLootTable:\"\",Rotation:[-20f]}"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "zombie", "~", "~-2", "~", "{Tags:[\"invis\",\"baby_golem_ai\",\"new\"],PersistenceRequired:1,Silent:1b,CustomNameVisible:0b,Health:9999f,IsBaby:1b,CustomName:'{\"text\":\"Baby Iron Golem\"}',Attributes:[{Name:generic.max_health,Base:9999},{Name:generic.follow_range,Base:20},{Name:generic.knockback_resistance,Base:0.03},{Name:generic.movement_speed,Base:0.20},{Name:generic.attack_damage,Base:8}],IsBaby:1b,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],DeathLootTable:\"\",Rotation:[-20f]}"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.summon(x0, "zombie", "~", "~-2", "~", "{Tags:[\"invis\",\"baby_golem_ai\",\"new\"],PersistenceRequired:1,Silent:1b,CustomNameVisible:0b,Health:9999f,IsBaby:1b,CustomName:'{\"text\":\"Baby Iron Golem\"}',Attributes:[{Name:generic.max_health,Base:9999},{Name:generic.follow_range,Base:20},{Name:generic.knockback_resistance,Base:0.03},{Name:generic.movement_speed,Base:0.21},{Name:generic.attack_damage,Base:11}],IsBaby:1b,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],DeathLootTable:\"\",Rotation:[-20f]}"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@e[tag=new]", "aj.id", "=", "@e[tag=aj.baby_golem.root,tag=!baby_golem_init]", "aj.id"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@e[type=item_display,tag=aj.baby_golem.root,tag=!baby_golem_init]", "mobHealth", "3"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@e[type=item_display,tag=aj.baby_golem.root,tag=!baby_golem_init]", "mobHealth", "5"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@e[type=item_display,tag=aj.baby_golem.root,tag=!baby_golem_init]", "mobHealth", "7"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@e[type=item_display,tag=aj.baby_golem.root,tag=!baby_golem_init]", "damageTimer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@e[type=zombie,tag=baby_golem_ai,tag=new]", "moveTimer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/zzz/5"), Control.as("@e[type=zombie,tag=baby_golem_ai,tag=new]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/play"), Control.as("@e[type=item_display,tag=aj.baby_golem.root,tag=!baby_golem_init]"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@e[tag=aj.baby_golem.root,tag=!baby_golem_init]", "add", "baby_golem_init"));
        Logic.step(() -> Native.tag(c, "@e[tag=new]", "remove", "new"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.iron_golem.repair", "master", "@a", "~", "~", "~", "1.0", "1.5"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/spawn2
    private static int f13(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/summon", "{args:{}}"));
        Logic.step(() -> Native.summon(c, "zombie", "~", "~-2", "~", "{Tags:[\"invis\",\"baby_golem_ai\",\"new\"],PersistenceRequired:1,Silent:1b,CustomNameVisible:0b,Health:9999f,IsBaby:1b,CustomName:'{\"text\":\"Baby Iron Golem\"}',Attributes:[{Name:generic.max_health,Base:9999},{Name:generic.follow_range,Base:20},{Name:generic.knockback_resistance,Base:0.03},{Name:generic.movement_speed,Base:0.225},{Name:generic.attack_damage,Base:8}],IsBaby:1b,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],DeathLootTable:\"\",Rotation:[60f]}"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@e[tag=new]", "aj.id", "=", "@e[tag=aj.baby_golem.root,tag=!baby_golem_init]", "aj.id"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=item_display,tag=aj.baby_golem.root,tag=!baby_golem_init]", "mobHealth", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@e[type=item_display,tag=aj.baby_golem.root,tag=!baby_golem_init]", "damageTimer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@e[type=zombie,tag=baby_golem_ai,tag=new]", "moveTimer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~2", "~"), Control.as("@e[type=zombie,tag=baby_golem_ai,tag=new]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/play"), Control.as("@e[type=item_display,tag=aj.baby_golem.root,tag=!baby_golem_init]"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@e[tag=aj.baby_golem.root,tag=!baby_golem_init]", "add", "baby_golem_init"));
        Logic.step(() -> Native.tag(c, "@e[tag=new]", "remove", "new"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/spawn3
    private static int f14(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/summon", "{args:{}}"));
        Logic.step(() -> Native.summon(c, "zombie", "~", "~-2", "~", "{Tags:[\"invis\",\"baby_golem_ai\",\"new\"],PersistenceRequired:1,Silent:1b,CustomNameVisible:0b,Health:9999f,IsBaby:1b,CustomName:'{\"text\":\"Baby Iron Golem\"}',Attributes:[{Name:generic.max_health,Base:9999},{Name:generic.follow_range,Base:20},{Name:generic.knockback_resistance,Base:0.03},{Name:generic.movement_speed,Base:0.225},{Name:generic.attack_damage,Base:8}],IsBaby:1b,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],DeathLootTable:\"\",Rotation:[210f]}"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@e[tag=new]", "aj.id", "=", "@e[tag=aj.baby_golem.root,tag=!baby_golem_init]", "aj.id"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@e[type=item_display,tag=aj.baby_golem.root,tag=!baby_golem_init]", "mobHealth", "5"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@e[type=item_display,tag=aj.baby_golem.root,tag=!baby_golem_init]", "damageTimer", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@e[type=zombie,tag=baby_golem_ai,tag=new]", "moveTimer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~2", "~"), Control.as("@e[type=zombie,tag=baby_golem_ai,tag=new]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:baby_golem/animations/animation_baby_golem_idle/play"), Control.as("@e[type=item_display,tag=aj.baby_golem.root,tag=!baby_golem_init]"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@e[tag=aj.baby_golem.root,tag=!baby_golem_init]", "add", "baby_golem_init"));
        Logic.step(() -> Native.tag(c, "@e[tag=new]", "remove", "new"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/spawn_many
    private static int f15(Frame c) {
        Logic.step(() -> Native.kill(c, "@e[type=item,nbt={Item:{id:\"minecraft:iron_ingot\"}},distance=..3]"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/spawn"), Control.rotated("~", "~45"), Control.positioned("~", "~", "~0.1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/spawn2"), Control.rotated("~", "~-90"), Control.positioned("~0.1", "~", "~-0.1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/spawn3"), Control.rotated("~", "~180"), Control.positioned("~", "~", "~")));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/zzz/0
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/zzz/1
    private static int f17(Frame c) {
        Logic.step(() -> Native.tp(c, "@e[type=item_display,tag=aj.baby_golem.root,tag=this,limit=1,sort=nearest]", "@s"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this_baby_golem_ai"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{Fire:-100s}"));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/zzz/2
    private static int f18(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:baby_golem/remove/this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/zzz/3"), Control.as("@e[type=zombie,tag=baby_golem_ai,limit=1,sort=nearest,tag=this_baby_golem_ai]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/zzz/3
    private static int f19(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "-100", "~"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/zzz/4
    private static int f20(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "this_baby_golem_ai"));
        return 1;
    }
    // impossible_to_survive:mobs/baby_golem/zzz/5
    private static int f21(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "~2", "~"));
        Logic.step(() -> Native.attribute(c, "@s", "minecraft:generic.scale", "base", "set", "1.0"));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/blaze_as_loop
    private static int f22(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this_blaze_id", "blaze_id", "=", "@s", "blaze_id"));
        Logic.step(() -> Control.run(c, x0 -> Native.tag(x0, "@s", "add", "parent_blaze"), Control.as("@e[type=blaze,tag=super_blaze,distance=..5]"), Control.when("score", "@s", "blaze_id", "=", "#this_blaze_id", "blaze_id"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "~", "~", "~"), Control.at("@e[type=blaze,tag=parent_blaze,limit=1,sort=nearest]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/0"), Control.unless("entity", "@e[type=blaze,tag=parent_blaze,distance=..5]")));
        Logic.step(() -> Native.tag(c, "@e[tag=parent_blaze]", "remove", "parent_blaze"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/1"), Control.when("entity", "@s[tag=super_blaze_fireball]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/2"), Control.when("entity", "@s[tag=super_blaze_rod]")));
        return 1;
    }
    // impossible_to_survive:mobs/blaze/blaze_hit
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/blaze/zzz/17"), Control.as("@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..3]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "blazed_cd", "20"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.blaze.hurt", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.generic.explode", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        return 1;
    }
}
