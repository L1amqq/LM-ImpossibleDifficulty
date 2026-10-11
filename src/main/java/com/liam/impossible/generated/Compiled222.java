package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled222 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/loop", Compiled222::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/process_hitbox_damage", Compiled222::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/body", Compiled222::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_left", Compiled222::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_middle", Compiled222::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_right", Compiled222::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/tail", Compiled222::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/0", Compiled222::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/1", Compiled222::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/2", Compiled222::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/3", Compiled222::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/4", Compiled222::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/init", Compiled222::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/kill", Compiled222::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/loop", Compiled222::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/loop_5s", Compiled222::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/player_loop_1s", Compiled222::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/player_loop_1t", Compiled222::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/player_loop_5t", Compiled222::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/reset_setup", Compiled222::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/settings/set_crystal_count", Compiled222::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/settings/set_easy", Compiled222::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/settings/set_hard", Compiled222::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/settings/set_medium", Compiled222::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/loop
    private static int f0(Frame c) {
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{HurtTime:0,Health:1024.0f}"));
        Logic.step(() -> Native.effect(c, "clear", "@s", "minecraft:glowing"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/process_hitbox_damage
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "get", "entity", "@s", "Health", "100"), Control.store("result", "score", "#temp", "mcm.temp")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#damage_dealt", "mcm.temp", "102400"));
        Logic.step(() -> Native.scoreboard(c, "players", "operation", "#damage_dealt", "mcm.temp", "-=", "#temp", "mcm.temp"));
        Logic.step(() -> Control.run(c, x0 -> Native.scoreboard(x0, "players", "operation", "#damage_dealt", "mcm.temp", "*=", "#weakpoint_multiplier", "mcm.its.dragon.settings"), Control.when("entity", "@s[tag=mcm.its.dragon.hitbox.weakpoint]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/apply_damage"), Control.as("@n[type=item_display,tag=aj.impossible_dragon.root]"), Control.at("@s")));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{HurtTime:0s,Health:1024.0f}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/body
    private static int f2(Frame c) {
        Logic.step(() -> Native.summon(c, "minecraft:pig", "~", "0", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.body_hitbox_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/0"), Control.positioned("~", "0", "~"), Control.as("@e[type=minecraft:pig,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.body_hitbox_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_left
    private static int f3(Frame c) {
        Logic.step(() -> Native.summon(c, "minecraft:pig", "~", "0", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.head_hitbox_left_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/2"), Control.positioned("~", "0", "~"), Control.as("@e[type=minecraft:pig,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.head_hitbox_left_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_middle
    private static int f4(Frame c) {
        Logic.step(() -> Native.summon(c, "minecraft:pig", "~", "0", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.head_hitbox_middle_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/3"), Control.positioned("~", "0", "~"), Control.as("@e[type=minecraft:pig,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.head_hitbox_middle_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_right
    private static int f5(Frame c) {
        Logic.step(() -> Native.summon(c, "minecraft:pig", "~", "0", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.head_hitbox_right_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/4"), Control.positioned("~", "0", "~"), Control.as("@e[type=minecraft:pig,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.head_hitbox_right_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/tail
    private static int f6(Frame c) {
        Logic.step(() -> Native.summon(c, "minecraft:pig", "~", "0", "~", "{Tags:['aj.new', 'aj.locator', 'aj.impossible_dragon.locator', 'aj.impossible_dragon.locator.tail_end_hitbox_locator']}"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/1"), Control.positioned("~", "0", "~"), Control.as("@e[type=minecraft:pig,tag=aj.new,tag=aj.locator,limit=1,distance=..0.01]")));
        Logic.step(() -> Native.data(c, "modify", "entity", "@s", "data.locators.tail_end_hitbox_locator.uuid", "set", "from", "storage", "aj:uuid", "main.out"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/0
    private static int f7(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{PersistenceRequired:1,Invulnerable:0,NoGravity:1,Silent:1,NoAI:1,Health:1024,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b},{id:\"minecraft:resistance\",amplifier:3,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],attributes:[{id:\"minecraft:generic.max_health\",base:1024},{id:\"minecraft:generic.scale\",base:5f}],DeathLootTable:\"\"}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.big"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.body"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/1
    private static int f8(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{PersistenceRequired:1,Invulnerable:0,NoGravity:1,Silent:1,NoAI:1,Health:1024,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b},{id:\"minecraft:resistance\",amplifier:3,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],attributes:[{id:\"minecraft:generic.max_health\",base:1024},{id:\"minecraft:generic.scale\",base:1.4f}],DeathLootTable:\"\"}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.small"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.tail"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.weakpoint"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/2
    private static int f9(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{PersistenceRequired:1,Invulnerable:0,NoGravity:1,Silent:1,NoAI:1,Health:1024,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b},{id:\"minecraft:resistance\",amplifier:3,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],attributes:[{id:\"minecraft:generic.max_health\",base:1024},{id:\"minecraft:generic.scale\",base:1.4f}],DeathLootTable:\"\"}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.small"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.head"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.head.left"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.weakpoint"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/3
    private static int f10(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{PersistenceRequired:1,Invulnerable:0,NoGravity:1,Silent:1,NoAI:1,Health:1024,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b},{id:\"minecraft:resistance\",amplifier:3,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],attributes:[{id:\"minecraft:generic.max_health\",base:1024},{id:\"minecraft:generic.scale\",base:1.4f}],DeathLootTable:\"\"}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.small"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.head"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.head.middle"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.weakpoint"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/zzz/4
    private static int f11(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "aj.new"));
        Logic.step(() -> Logic.call(c, "animated_java:global/internal/gu/convert_uuid_array_to_string", "with", "entity", "@s"));
        Logic.step(() -> Native.data(c, "merge", "entity", "@s", "{PersistenceRequired:1,Invulnerable:0,NoGravity:1,Silent:1,NoAI:1,Health:1024,active_effects:[{id:\"minecraft:invisibility\",amplifier:1,duration:-1,show_particles:0b,show_icon:0b,ambient:0b},{id:\"minecraft:resistance\",amplifier:3,duration:-1,show_particles:0b,show_icon:0b,ambient:0b}],attributes:[{id:\"minecraft:generic.max_health\",base:1024},{id:\"minecraft:generic.scale\",base:1.4f}],DeathLootTable:\"\"}"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.small"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.head"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.head.right"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon.hitbox.weakpoint"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/init
    private static int f12(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.temp", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.random", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.misc", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.lifetime", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.id", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.position.x", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.position.y", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.position.z", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.rotation.y", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.rotation.x", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.transition_frame", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.state", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.activity", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.activity.timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.sub_activity", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.sub_activity.timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.spawnpoint_priority", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.crystal_y_level", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.flight_speed", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.health", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.crystal_reactivation_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.damaged_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.has_tail", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.crystal_count", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.head_count", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.settings", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.tail_damage_received", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.next_activity", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.forcefield_damage_cooldown", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.homing_rotation_x", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.homing_rotation_y", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.tweened_rotation_x", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.tweened_rotation_y", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.attack_delay_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.dash_count", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.player_dash_hit_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.tutorial.stage", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.dash_ring_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.tower_size", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.tower_level", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.setup.state", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.hint.wisp", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.hint.jumppad", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.hint.tail_placed_wrong", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.hint.height_fog", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.hint.healing", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.hint.lightning_hit", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.hint.lightning_counter", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.hint.end_crystal_recharge", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.wisp.target_id", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.safety_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.attack_difficulty", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.height_fog_limit_1", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.height_fog_limit_2", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.height_fog_level", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.fog_timer", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.jumppad_cd", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.guide_unlocked", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.last_attack", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "farmed_wheat", "minecraft.used:minecraft.wheat_seeds"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "farmed_carrot", "minecraft.used:minecraft.carrot"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "farmed_potato", "minecraft.used:minecraft.potato"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "farmed_pumpkin", "minecraft.used:minecraft.pumpkin_seeds"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "farmed_beetroot", "minecraft.used:minecraft.beetroot_seeds"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#global", "mcm.its.dragon.setup.state", "0"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.decision.laser", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.decision.fireball", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.decision.lightning", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.decision.tail_slam", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.decision.forcefield", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.decision.dash", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.its.dragon.decision_range", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "objectives", "add", "mcm.constant", "dummy"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#2", "mcm.constant", "2"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/settings/set_medium"), Control.unless("score", "#difficulty", "mcm.its.dragon.settings", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/kill
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/25"), Control.as("@e[type=pig,tag=mcm.its.dragon.hitbox]"), Control.at("@s")));
        Logic.step(() -> Native.kill(c, "@e[tag=aj.impossible_dragon.locator]"));
        Logic.step(() -> Native.kill(c, "@e[tag=aj.impossible_dragon.data]"));
        Logic.step(() -> Logic.call(c, "animated_java:impossible_dragon/remove/this"));
        Logic.step(() -> Native.bossbar(c, "set", "minecraft:impossible_dragon", "visible", "false"));
        Logic.step(() -> Native.forceload(c, "remove", "all"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/loop
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/26"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "0..1")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/31"), Control.when("score", "@s", "mcm.its.dragon.attack_delay_timer", "matches", "..0")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/35"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "1..8")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/155"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "9..16")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/397"), Control.when("score", "@s", "mcm.its.dragon.damaged_cd", "matches", "1..")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/400"), Control.unless("entity", "@s[tag=mcm.its.dragon.bossbar_invisible]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/loop_5s
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/activity/fly_to_center"), Control.unless("entity", "@e[type=marker,tag=mcm.its.dragon_environment.exit_portal_center,distance=..200]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@a[distance=..300]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/body"), Control.unless("entity", "@e[type=pig,tag=mcm.its.dragon.hitbox.body]"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/tail"), Control.when("score", "@s", "mcm.its.dragon.has_tail", "matches", "1"), Control.unless("entity", "@e[type=pig,tag=mcm.its.dragon.hitbox.tail]"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_left"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "2.."), Control.unless("entity", "@e[type=pig,tag=mcm.its.dragon.hitbox.head.left]"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_middle"), Control.unless("score", "@s", "mcm.its.dragon.head_count", "matches", "2"), Control.unless("entity", "@e[type=pig,tag=mcm.its.dragon.hitbox.head.middle]"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/hitbox/resummon/head_right"), Control.when("score", "@s", "mcm.its.dragon.head_count", "matches", "2.."), Control.unless("entity", "@e[type=pig,tag=mcm.its.dragon.hitbox.head.right]"), Control.on("passengers"), Control.when("entity", "@s[tag=aj.data]")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/settings/set_player_count"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/settings/set_crystal_count"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/401"), Control.when("score", "@s", "mcm.its.dragon.activity", "matches", "2..14"), Control.when("score", "@s", "mcm.its.dragon.tutorial.stage", "matches", "3..")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Logic.call(x1, "impossible_to_survive:dragon_book/attempt_give"), Control.as("@a[distance=..200,predicate=mcm:gm/vulnerable]"), Control.at("@s")), Control.when("score", "@s", "mcm.its.dragon.tutorial.stage", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/player_loop_1s
    private static int f16(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon.player.near_ground"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/406"), Control.when("predicate", "mcm:in_the_end"), Control.when("entity", "@s[predicate=mcm:gm/vulnerable]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/player_loop_1t
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/410"), Control.when("predicate", "mcm:in_the_end")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/player_loop_5t
    private static int f18(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/407"), Control.when("predicate", "mcm:in_the_end")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/reset_setup
    private static int f19(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "@a", "mcm.its.dragon.guide_unlocked"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/21"), Control.as("@e[type=pig,tag=mcm.its.dragon.hitbox]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/zzz/22"), Control.as("@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/kill"), Control.as("@e[type=item_display,tag=aj.impossible_dragon.root]"), Control.at("@s")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.its.dragon.setup.state", "0"));
        Logic.step(() -> Native.kill(c, "@e[tag=mcm.its.dragon.force_field.component]"));
        Logic.step(() -> Native.kill(c, "@e[tag=mcm.its.dragon.temp_setup]"));
        Logic.step(() -> Native.kill(c, "@e[tag=mcm.its.dragon_environment]"));
        Logic.step(() -> Native.kill(c, "@e[tag=mcm.its.dragon.tutorial.component]"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.wisp", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.healing", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.jumppad", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.height_fog", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.tail_placed_wrong", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.lightning_hit", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.lightning_hit", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.lightning_counter", "0"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@a", "mcm.its.dragon.hint.end_crystal_recharge", "0"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/settings/set_crystal_count
    private static int f20(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global", "mcm.its.dragon.crystal_count", "10"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> 1, Control.when("entity", "@e[type=marker,tag=mcm.its.dragon_environment.end_crystal,tag=!mcm.its.dragon_environment.end_crystal.destroyed]")), Control.store("result", "score", "#global", "mcm.its.dragon.crystal_count")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/settings/set_easy
    private static int f21(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#difficulty", "mcm.its.dragon.settings", "1"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#impact_damage_cap", "mcm.its.dragon.settings", "3000"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#weakpoint_multiplier", "mcm.its.dragon.settings", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global_health_multiplier", "mcm.its.dragon.settings", "33"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#tail_drop_damage_threshhold", "mcm.its.dragon.settings", "15000"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#healing_rate", "mcm.its.dragon.settings", "1000"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#healing_interrupt_damage", "mcm.its.dragon.settings", "55000"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/settings/set_hard
    private static int f22(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#difficulty", "mcm.its.dragon.settings", "3"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#impact_damage_cap", "mcm.its.dragon.settings", "2000"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#weakpoint_multiplier", "mcm.its.dragon.settings", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global_health_multiplier", "mcm.its.dragon.settings", "16"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#tail_drop_damage_threshhold", "mcm.its.dragon.settings", "22500"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#healing_rate", "mcm.its.dragon.settings", "2000"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#healing_interrupt_damage", "mcm.its.dragon.settings", "25000"));
        Logic.step(() -> Native.gamerule(c, "doMobSpawning", "true"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/settings/set_medium
    private static int f23(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#difficulty", "mcm.its.dragon.settings", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#impact_damage_cap", "mcm.its.dragon.settings", "2500"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#weakpoint_multiplier", "mcm.its.dragon.settings", "2"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#global_health_multiplier", "mcm.its.dragon.settings", "23"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#tail_drop_damage_threshhold", "mcm.its.dragon.settings", "20000"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#healing_rate", "mcm.its.dragon.settings", "1429"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#healing_interrupt_damage", "mcm.its.dragon.settings", "45000"));
        return 1;
    }
}
