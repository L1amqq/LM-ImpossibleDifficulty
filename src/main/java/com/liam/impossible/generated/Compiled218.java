package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled218 {
    public static void register() {
        Logic.register("impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/0", Compiled218::f0);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/1", Compiled218::f1);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/2", Compiled218::f2);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/3", Compiled218::f3);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/4", Compiled218::f4);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/5", Compiled218::f5);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/6", Compiled218::f6);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/destroy", Compiled218::f7);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/dev_deactivate", Compiled218::f8);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/activate", Compiled218::f9);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/deactivate", Compiled218::f10);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/summon", Compiled218::f11);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/zzz/0", Compiled218::f12);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/zzz/1", Compiled218::f13);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/zzz/2", Compiled218::f14);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/zzz/3", Compiled218::f15);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/loop", Compiled218::f16);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/loop_10t", Compiled218::f17);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_invulnerable", Compiled218::f18);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_vulnerable", Compiled218::f19);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivate", Compiled218::f20);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivate_and_upgrade", Compiled218::f21);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_impact_lightning", Compiled218::f22);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_linger_lightning", Compiled218::f23);
    }
    // impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/0
    private static int f0(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "1"));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.crystal_tail\",\"mcm.its.dragon.component_item_display\"],transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0.707f,0f,0f,0.707f],translation:[0.0f,0.46f,-0.135f],scale:[0.75f,0.75f,0.75f]},item:{id:\"minecraft:polar_bear_spawn_egg\",count:1,components:{\"minecraft:custom_model_data\":101,\"minecraft:enchantment_glint_override\":true}}}"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "skeleton_skull"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.amethyst_cluster.place", "master", "@a", "~", "~", "~", "1.0", "0.3"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.trial_spawner.place", "master", "@a", "~", "~", "~", "1.0", "1.0"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/1"), Control.as("@a[distance=..10]"), Control.at("@s"), Control.unless("score", "@s", "mcm.its.dragon.hint.tail_placed_wrong", "matches", "1"), Control.when("entity", "@e[type=item_display,tag=aj.impossible_dragon.root,scores={mcm.its.dragon.activity=8,mcm.its.dragon.has_tail=1},distance=..25]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/1
    private static int f1(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.hint.tail_placed_wrong", "1"));
        Logic.step(() -> Native.tellraw(c, "@s", "[{\"text\":\"\\u002a\",\"font\":\"minecraft:icons\",\"color\":\"white\"},{\"text\":\" Hint:\",\"bold\":true,\"color\":\"#d9d134\",\"font\":\"minecraft:default\"},{\"text\":\" Soul fire particles indicate an incoming fireball attack! A ground slam is shown by blue spikes around the tail! Check your guide book to see a reference!\",\"color\":\"aqua\",\"font\":\"minecraft:default\"}]"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/display_hint"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/2
    private static int f2(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#ifelse", "mcb.internal", "1"));
        Logic.step(() -> Native.loot(c, "spawn", "~", "~", "~", "loot", "impossible_to_survive:crystal_tail"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/3
    private static int f3(Frame c) {
        Logic.step(() -> Native.kill(c, "@e[type=item,nbt={Item:{id:\"minecraft:skeleton_skull\"},Age:0s},distance=..3]"));
        Logic.step(() -> Native.kill(c, "@e[type=item,nbt={Item:{id:\"minecraft:skeleton_skull\"},Age:1s},distance=..3]"));
        Logic.step(() -> Native.loot(c, "spawn", "~", "~", "~", "loot", "impossible_to_survive:crystal_tail"));
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:amethyst_shard\"}", "~", "~0.5", "~", "0.3", "0.3", "0.3", "0.1", "15", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:amethyst_block\"}", "~", "~0.5", "~", "0.3", "0.3", "0.3", "0.1", "10", "force"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.amethyst_block.break", "master", "@a", "~", "~", "~", "1", "0.3"));
        Logic.step(() -> Native.playsound(c, "minecraft:block.trial_spawner.break", "master", "@a", "~", "~", "~", "1", "1.0"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/4
    private static int f4(Frame c) {
        Logic.step(() -> Native.scoreboard(c, "players", "add", "@s", "mcm.lifetime", "1"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/crystal_tail/destroy_lightning"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/5"), Control.when("score", "@s", "mcm.lifetime", "matches", "3..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/5
    private static int f5(Frame c) {
        Logic.step(() -> Native.particle(c, "item{item:\"minecraft:amethyst_shard\"}", "~", "~0.5", "~", "0.3", "0.3", "0.3", "0.1", "15", "force"));
        Logic.step(() -> Native.particle(c, "block{block_state:\"minecraft:amethyst_block\"}", "~", "~0.5", "~", "0.3", "0.3", "0.3", "0.1", "10", "force"));
        Logic.step(() -> Native.kill(c, "@s"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/crystal_tail/zzz/6
    private static int f6(Frame c) {
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "skeleton_skull"));
        Logic.step(() -> Native.kill(c, "@e[type=item,nbt={Item:{id:\"minecraft:skeleton_skull\"},Age:0s},distance=..3]"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/destroy
    private static int f7(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/sfx/end_crystal_destroy"));
        Logic.step(() -> Native.stopsound(c, "@a", "master", "minecraft:dragon.healing_long"));
        Logic.step(() -> Native.stopsound(c, "@a", "master", "minecraft:dragon.healing_short"));
        Logic.step(() -> Native.stopsound(c, "@a", "master", "minecraft:dragon.healing"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_p/summon"), Control.positioned("~", "~1.5", "~")));
        Logic.step(() -> Native.scoreboard(c, "players", "remove", "#global", "mcm.its.dragon.crystal_count", "1"));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon_environment.end_crystal.destroyed"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tag(x1, "@s", "add", "mcm.its.dragon.crystal_healing_interrupted"), Control.as("@n[type=item_display,tag=aj.impossible_dragon.root]")), Control.positioned("^", "^", "^10")));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tag(x1, "@s", "add", "mcm.its.dragon_environment.heal_point.destroyed"), Control.as("@n[tag=mcm.its.dragon_environment.heal_point]"), Control.at("@s")), Control.positioned("^", "^", "^10")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/dev_deactivate
    private static int f8(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.destroyed]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.returnValue(0), Control.unless("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.invulnerable]")));
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon_environment.end_crystal.destroyed"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon_environment.end_crystal.invulnerable"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/deactivate"));
        Logic.step(() -> Native.kill(c, "@e[type=end_crystal,distance=..5]"));
        Logic.step(() -> Native.fill(c, "~-1", "~1", "~-1", "~1", "~-2", "~1", "air", "replace", "barrier"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tag(x1, "@s", "add", "mcm.its.dragon_environment.heal_point.destroyed"), Control.as("@n[tag=mcm.its.dragon_environment.heal_point]"), Control.at("@s")), Control.positioned("^", "^", "^10")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/activate
    private static int f9(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/zzz/0"), Control.positioned("~", "~", "~"), Control.as("@e[tag=mcm.its.dragon.force_field.component,distance=..2]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/deactivate
    private static int f10(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/zzz/2"), Control.positioned("~", "~", "~"), Control.as("@e[tag=mcm.its.dragon.force_field.component,distance=..2]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/summon
    private static int f11(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/magic_circle_a/summon"), Control.positioned("~", "~", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/summon"), Control.positioned("~", "~", "~")));
        Logic.step(() -> Native.summon(c, "item_display", "~", "~", "~", "{Tags:[\"mcm.vfx.circle_glow\",\"mcm.vfx\",\"mcm.its.dragon.force_field.component\"],billboard:\"center\",brightness:{sky:15,block:15},transformation:{left_rotation:[0f,0f,0f,1f],right_rotation:[0f,0f,0f,1f],translation:[0f,0f,0f],scale:[7.05f,7.05f,7.05f]},item:{id:\"minecraft:white_stained_glass\",count:1,components:{\"minecraft:custom_model_data\":21}}}"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/zzz/0
    private static int f12(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:4,transformation:{scale:[7f,7f,7f]}}"), Control.when("entity", "@s[tag=mcm.vfx.electric_shield]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:4,transformation:{scale:[7.05f,7.05f,7.05f]}}"), Control.when("entity", "@s[tag=mcm.vfx.circle_glow]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/zzz/1"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_a]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/zzz/1
    private static int f13(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:8,transformation:{scale:[5.25f,5.25f,5.25f]}}"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_a.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:5,transformation:{scale:[4.5f,4.5f,4.5f]}}"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_a.2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:10,transformation:{scale:[5.27f,5.27f,5.27f]}}"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_a.3]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/zzz/2
    private static int f14(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:9,transformation:{scale:[0.0f,0.0f,0.0f]}}"), Control.when("entity", "@s[tag=mcm.vfx.electric_shield]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:9,transformation:{scale:[0.0f,0.0f,0.0f]}}"), Control.when("entity", "@s[tag=mcm.vfx.circle_glow]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/zzz/3"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_a]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/zzz/3
    private static int f15(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:6,transformation:{scale:[0.0f,0.0f,0.0f]}}"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_a.1]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:8,transformation:{scale:[0.0f,0.0f,0.0f]}}"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_a.2]")));
        Logic.step(() -> Control.run(c, x0 -> Native.data(x0, "merge", "entity", "@s", "{start_interpolation:1,interpolation_duration:7,transformation:{scale:[0.0f,0.0f,0.0f]}}"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_a.3]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/loop
    private static int f16(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/0"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.invulnerable]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/destroy"), Control.when("entity", "@s[tag=!mcm.its.dragon_environment.end_crystal.invulnerable,tag=!mcm.its.dragon_environment.end_crystal.destroyed]"), Control.positioned("~", "~-1", "~"), Control.unless("entity", "@e[type=end_crystal,distance=..1]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/1"), Control.when("score", "@s", "mcm.its.dragon.crystal_reactivation_timer", "matches", "1..")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/loop_10t
    private static int f17(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/2"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.invulnerable]")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_invulnerable
    private static int f18(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "add", "mcm.its.dragon_environment.end_crystal.invulnerable"));
        Logic.step(() -> Native.fill(c, "~-1", "~1", "~-1", "~1", "~-2", "~1", "barrier"));
        Logic.step(() -> Native.setblock(c, "~", "~-1", "~", "air"));
        Logic.step(() -> Native.setblock(c, "~", "~", "~", "air"));
        Logic.step(() -> Native.setblock(c, "~", "~-2", "~", "bedrock"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_vulnerable
    private static int f19(Frame c) {
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon_environment.end_crystal.invulnerable"));
        Logic.step(() -> Native.fill(c, "~-1", "~1", "~-1", "~1", "~-2", "~1", "air", "replace", "barrier"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivate
    private static int f20(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_o/summon"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_invulnerable"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/activate"));
        Logic.step(() -> Native.tag(c, "@s", "remove", "mcm.its.dragon_environment.end_crystal.destroyed"));
        Logic.step(() -> Control.run(c, x0 -> Control.run(x0, x1 -> Native.tag(x1, "@s", "remove", "mcm.its.dragon_environment.heal_point.destroyed"), Control.as("@n[tag=mcm.its.dragon_environment.heal_point]"), Control.at("@s")), Control.positioned("^", "^", "^10")));
        Logic.step(() -> Native.summon(c, "end_crystal", "~", "~-1", "~", "{ShowBottom:1b}"));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "@s", "mcm.its.dragon.crystal_reactivation_timer", "12"));
        Logic.step(() -> Native.scoreboard(c, "players", "add", "#global", "mcm.its.dragon.crystal_count", "1"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_impact_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_impact_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_impact_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_impact_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_impact_lightning"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/6"), Control.when("score", "@s", "mcm.its.dragon.tower_level", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/7"), Control.when("score", "@s", "mcm.its.dragon.tower_level", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivate_and_upgrade
    private static int f21(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/impact_o/summon"), Control.positioned("~", "~0.5", "~")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/3"), Control.when("entity", "@s[tag=mcm.its.dragon_environment.end_crystal.destroyed]")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_impact_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_impact_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_impact_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_impact_lightning"));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_impact_lightning"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/4"), Control.when("score", "@s", "mcm.its.dragon.tower_level", "matches", "2")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/zzz/5"), Control.when("score", "@s", "mcm.its.dragon.tower_level", "matches", "3")));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_impact_lightning
    private static int f22(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "15..20"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.max_zap_changes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.lightning_vfx.max_secondary_zap_changes", "2"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "-80..50"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..360"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/random_lightning/zap"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#temp"));
        return 1;
    }
    // impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/reactivation_linger_lightning
    private static int f23(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "6..9"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.max_zap_changes")));
        Logic.step(() -> Native.scoreboard(c, "players", "set", "#temp", "mcm.lightning_vfx.max_secondary_zap_changes", "3"));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "-90..50"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_y")));
        Logic.step(() -> Control.run(c, x0 -> Native.randomValue(x0, "value", "0..360"), Control.store("result", "score", "#temp", "mcm.lightning_vfx.zap_init_dir_x")));
        Logic.step(() -> Logic.call(c, "impossible_to_survive:effects/random_lightning/zap"));
        Logic.step(() -> Native.scoreboard(c, "players", "reset", "#temp"));
        return 1;
    }
}
