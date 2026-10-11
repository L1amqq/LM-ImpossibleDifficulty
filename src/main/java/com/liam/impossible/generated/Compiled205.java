package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled205 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/flying_book/damage", Compiled205::f0);
        Logic.register("impossible_to_survive:mobs/flying_book/damage_timer", Compiled205::f1);
        Logic.register("impossible_to_survive:mobs/flying_book/kill", Compiled205::f2);
        Logic.register("impossible_to_survive:mobs/flying_book/loop", Compiled205::f3);
        Logic.register("impossible_to_survive:mobs/flying_book/spawn", Compiled205::f4);
        Logic.register("impossible_to_survive:mobs/flying_book/zzz/0", Compiled205::f5);
        Logic.register("impossible_to_survive:mobs/flying_book/zzz/1", Compiled205::f6);
        Logic.register("impossible_to_survive:mobs/flying_book/zzz/2", Compiled205::f7);
        Logic.register("impossible_to_survive:mobs/flying_book/zzz/3", Compiled205::f8);
        Logic.register("impossible_to_survive:mobs/flying_book/zzz/4", Compiled205::f9);
        Logic.register("impossible_to_survive:mobs/flying_book/zzz/5", Compiled205::f10);
        Logic.register("impossible_to_survive:mobs/flying_book/zzz/6", Compiled205::f11);
        Logic.register("impossible_to_survive:mobs/flying_book/zzz/7", Compiled205::f12);
        Logic.register("impossible_to_survive:mobs/flying_book/zzz/8", Compiled205::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/particle_ring", Compiled205::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/particle_ring2", Compiled205::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/spiral_particles", Compiled205::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/0", Compiled205::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/1", Compiled205::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/10", Compiled205::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/11", Compiled205::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/12", Compiled205::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/13", Compiled205::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/14", Compiled205::f23);
    }
    // impossible_to_survive:mobs/flying_book/damage
    private static int f0(Frame c) {
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:book\"}", "~", "~0.15", "~", "0.2", "0.2", "0.2", "0.1", "10", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:item.book.page_turn", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.bee.sting", "master", "@a", "~", "~", "~", "1.5", "1.5"));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "mobHealth", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnFromAction(Logic.call(x0, "impossible_to_survive:mobs/flying_book/kill")), Control.when("entity", "@s[scores={mobHealth=..0}]")));
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/variants/red/apply"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "damageTimer", "8"));
        return 1;
    }
    // impossible_to_survive:mobs/flying_book/damage_timer
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "damageTimer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "animated_java:flying_book/variants/default/apply"), Control.when("score", "@s", "damageTimer", "matches", "1")));
        return 1;
    }
    // impossible_to_survive:mobs/flying_book/kill
    private static int f2(Frame c) {
        Logic.step(() -> Native.playsound(c, "minecraft:entity.vex.hurt", "master", "@a", "~", "~", "~", "1.0", "1.2"));
        Logic.step(() -> Native.playsound(c, "minecraft:entity.allay.item_given", "master", "@a", "~", "~", "~", "1.0", "0.5"));
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/remove/this"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/flying_book/zzz/0"), Control.as("@e[type=vex,tag=flying_book_ai,limit=1,sort=nearest,tag=this_flying_book_ai]"), Control.at("@s")));
        Logic.step(() -> Native.particle(c, "large_smoke", "~", "~0.75", "~", "0.2", "0.2", "0.2", "0.1", "2", "force"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:book\"}", "~", "~0.15", "~", "0.2", "0.2", "0.2", "0.1", "30", "force"));
        Logic.step(() -> Native.particle(c, "smoke", "~", "~0.3", "~", "0.2", "0.2", "0.2", "0.05", "10", "force"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/flying_book/loop
    private static int f3(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#this", "aj.id", "=", "@s", "aj.id"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/flying_book/zzz/1"), Control.as("@e[type=vex,tag=flying_book_ai,distance=..20]"), Control.when("score", "@s", "aj.id", "=", "#this", "aj.id")));
        Logic.step(() -> Native.tag(c, "@s", "remove", "this"));
        Logic.step(() -> Native.particle(c, "enchant", "~", "~0.3", "~", "0.3", "0.3", "0.3", "0.1", "1", "force"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/flying_book/kill"), Control.unless("entity", "@e[type=vex,tag=flying_book_ai,distance=..1,sort=nearest,tag=this_flying_book_ai]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/flying_book/damage"), Control.when("entity", "@e[type=vex,tag=flying_book_ai,tag=this_flying_book_ai,distance=..2,nbt={HurtTime:10s},limit=1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/flying_book/damage_timer"), Control.as("@s[scores={damageTimer=1..}]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/flying_book/zzz/5"), Control.unless("entity", "@a[distance=..50]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/flying_book/zzz/7"), Control.as("@e[type=vex,tag=flying_book_ai,distance=..1,sort=nearest,tag=this_flying_book_ai]")));
        return 1;
    }
    // impossible_to_survive:mobs/flying_book/spawn
    private static int f4(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/summon", "{args:{start_animation:true,animation:'flying'}}"));
        Logic.step(() -> Native.summon(c, "vex", "~", "~-2", "~", "{Tags:[\"invis\",\"flying_book_ai\",\"new\"],PersistenceRequired:1,Silent:1b,CustomNameVisible:0b,Health:9999f,CustomName:'{\"text\":\"Book\"}',attributes:[{Name:generic.max_health,Base:9999},{Name:generic.follow_range,Base:20},{Name:generic.knockback_resistance,Base:0.03},{Name:generic.movement_speed,Base:0.175},{Name:generic.attack_damage,Base:2},{id:\"minecraft:generic.scale\",base:1.5}],active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],DeathLootTable:\"\",Rotation:[-20f]}"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "@e[tag=new]", "aj.id", "=", "@e[tag=aj.flying_book.root,tag=!flying_book_init]", "aj.id"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@e[type=item_display,tag=aj.flying_book.root,tag=!flying_book_init]", "mobHealth", "2"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@e[type=item_display,tag=aj.flying_book.root,tag=!flying_book_init]", "mobHealth", "4"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@e[type=item_display,tag=aj.flying_book.root,tag=!flying_book_init]", "mobHealth", "6"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@e[type=item_display,tag=aj.flying_book.root,tag=!flying_book_init]", "damageTimer", "0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/flying_book/zzz/8"), Control.as("@e[type=vex,tag=flying_book_ai,tag=new]"), Control.at("@s")));
        Logic.step(() -> Native.tag(c, "@e[tag=aj.flying_book.root,tag=!flying_book_init]", "add", "flying_book_init"));
        Logic.step(() -> Native.tag(c, "@e[tag=new]", "remove", "new"));
        return 1;
    }
    // impossible_to_survive:mobs/flying_book/zzz/0
    private static int f5(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@s"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/flying_book/zzz/1
    private static int f6(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "@s", "book_attack_timer", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/flying_book/zzz/2"), Control.when("score", "@s", "book_attack_timer", "matches", "..0"), Control.when("entity", "@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..25]")));
        Logic.step(() -> Native.tp(c, "@e[type=item_display,tag=aj.flying_book.root,tag=this,limit=1,sort=nearest]", "@s"));
        Logic.step(() -> Native.tag(c, "@s", "add", "this_flying_book_ai"));
        return 1;
    }
    // impossible_to_survive:mobs/flying_book/zzz/2
    private static int f7(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.playsound(x0, "minecraft:entity.illusioner.prepare_mirror", "master", "@a", "~", "~", "~", "1.0", "1.0"), Control.when("score", "@s", "book_attack_timer", "matches", "0")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "firework", "~", "~", "~", "0", "0", "0", "0.05", "1", "force"), Control.when("predicate", "mcm:random/50_percent")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.randomValue(x1, "value", "100..200"), Control.store("result", "score", "@s", "book_attack_timer")), Control.unless("entity", "@a[distance=..20]")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.randomValue(x1, "value", "100..200"), Control.store("result", "score", "@s", "book_attack_timer")), Control.when("score", "@s", "book_attack_timer", "matches", "..-80")));
        Logic.step(() -> Native.tp(c, "@s", "~", "~", "~", "facing", "entity", "@p[tag=survivor,predicate=mcm:gm/vulnerable]"));
        Logic.step(() -> Control.run(c, x0 -> Native.tp(x0, "@s", "^", "^", "^0.45"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/flying_book/zzz/3"), Control.when("entity", "@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]")));
        return 1;
    }
    // impossible_to_survive:mobs/flying_book/zzz/3
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/flying_book/zzz/4"), Control.as("@a[distance=..1.5,tag=survivor,predicate=mcm:gm/vulnerable]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "60..200"), Control.store("result", "score", "@s", "book_attack_timer")));
        return 1;
    }
    // impossible_to_survive:mobs/flying_book/zzz/4
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "2", "minecraft:mob_attack", "by", "@n[type=vex]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "1")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "4", "minecraft:mob_attack", "by", "@n[type=vex]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Native.damage(x0, "@s", "6", "minecraft:mob_attack", "by", "@n[type=vex]"), Control.when("score", "#global", "mcm.its.overall_difficulty", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/flying_book/zzz/5
    private static int f10(Frame c) {
        Logic.step(() -> Logic.call(c, "animated_java:flying_book/remove/this"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/flying_book/zzz/6"), Control.as("@e[type=vex,tag=flying_book_ai,limit=1,sort=nearest,tag=this_flying_book_ai]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/flying_book/zzz/6
    private static int f11(Frame c) {
        Logic.step(() -> Native.tp(c, "@s", "~", "-100", "~"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/flying_book/zzz/7
    private static int f12(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "this_flying_book_ai"));
        return 1;
    }
    // impossible_to_survive:mobs/flying_book/zzz/8
    private static int f13(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "moveTimer", "0"));
        Logic.step(() -> Native.tp(c, "@s", "~", "~2", "~"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "10..80"), Control.store("result", "score", "@s", "book_attack_timer")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/particle_ring
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^1.225", "^0.2125", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^1.175", "^0.425", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^1.0875", "^0.625", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^0.9625", "^0.8", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^0.8", "^0.9625", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^0.625", "^1.0875", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^0.425", "^1.175", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^0.2125", "^1.225", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^0", "^1.25", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-0.2125", "^1.225", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-0.425", "^1.175", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-0.625", "^1.0875", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-0.8", "^0.9625", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-0.9625", "^0.8", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-1.0875", "^0.625", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-1.175", "^0.425", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-1.225", "^0.2125", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-1.25", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-1.225", "^-0.2125", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-1.175", "^-0.425", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-1.0875", "^-0.625", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-0.9625", "^-0.8", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-0.8", "^-0.9625", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-0.625", "^-1.0875", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-0.425", "^-1.175", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^-0.2125", "^-1.225", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^0", "^-1.25", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^0.2125", "^-1.225", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^0.425", "^-1.175", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^0.625", "^-1.0875", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^0.8", "^-0.9625", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^0.9625", "^-0.8", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^1.0875", "^-0.625", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^1.175", "^-0.425", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^1.225", "^-0.2125", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.00000005", "0", "force"), Control.positioned("^1.25", "^0", "^")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/particle_ring2
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^0.6266666666666667", "^0.22666666666666666", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^0.5133333333333333", "^0.4266666666666667", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^0.3333333333333333", "^0.58", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^0.11333333333333333", "^0.6533333333333333", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^-0.11333333333333333", "^0.6533333333333333", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^-0.3333333333333333", "^0.58", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^-0.5133333333333333", "^0.4266666666666667", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^-0.6266666666666667", "^0.22666666666666666", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^-0.6666666666666666", "^0", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^-0.6266666666666667", "^-0.22666666666666666", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^-0.5133333333333333", "^-0.4266666666666667", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^-0.3333333333333333", "^-0.58", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^-0.11333333333333333", "^-0.6533333333333333", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^0.11333333333333333", "^-0.6533333333333333", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^0.3333333333333333", "^-0.58", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^0.5133333333333333", "^-0.4266666666666667", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^0.6266666666666667", "^-0.22666666666666666", "^")));
        Logic.step(() -> Control.run(c, x0 -> Native.particle(x0, "dragon_breath", "~", "~", "~", "^", "^", "^-10000000", "0.0000001", "0", "force"), Control.positioned("^0.6666666666666666", "^0", "^")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/spiral_particles
    private static int f16(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.animation", "1"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "set", "@s", "mcm.animation", "0"), Control.when("score", "@s", "mcm.animation", "matches", "21..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/0"), Control.when("score", "@s", "mcm.animation", "matches", "0..10")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/18"), Control.when("score", "@s", "mcm.animation", "matches", "11..20")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/0
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/1"), Control.when("score", "@s", "mcm.animation", "matches", "0..5")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/10"), Control.when("score", "@s", "mcm.animation", "matches", "6..10")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/1
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/2"), Control.when("score", "@s", "mcm.animation", "matches", "0..2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/6"), Control.when("score", "@s", "mcm.animation", "matches", "3..5")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/10
    private static int f19(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/11"), Control.when("score", "@s", "mcm.animation", "matches", "6..8")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/15"), Control.when("score", "@s", "mcm.animation", "matches", "9..10")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/11
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/12"), Control.when("score", "@s", "mcm.animation", "matches", "6")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/13"), Control.when("score", "@s", "mcm.animation", "matches", "7")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/14"), Control.when("score", "@s", "mcm.animation", "matches", "8")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/12
    private static int f21(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1364899.1934043868", "^-222520.56984033753", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1364899.1934043868", "^222520.56984033753", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/13
    private static int f22(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^1212435.8703066693", "^-499999.6226497094", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-1212435.8703066693", "^499999.6226497094", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/ability/dash/zzz/14
    private static int f23(Frame c) {
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^952242.3439354054", "^-733051.533121957", "^1000000", "0.00000007", "0", "force"));
        Logic.step(() -> Native.particle(c, "dragon_breath", "~", "~", "~", "^-952242.3439354054", "^733051.533121957", "^1000000", "0.00000007", "0", "force"));
        return 1;
    }
}
