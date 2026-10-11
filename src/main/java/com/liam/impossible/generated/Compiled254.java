package com.liam.impossible.generated;
import com.liam.impossible.runtime.*;
public final class Compiled254 {
    public static void register() {
        Logic.register("impossible_to_survive:zzz/7", Compiled254::f0);
        Logic.register("impossible_to_survive:zzz/8", Compiled254::f1);
        Logic.register("impossible_to_survive:zzz/9", Compiled254::f2);
    }
    // impossible_to_survive:zzz/7
    private static int f0(Frame c) {
        Logic.step(() -> Logic.call(c, "impossible_to_survive:challenge/feature_encounter/cactus"));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/cactus/replace"), Control.positioned("~", "~1", "~"), Control.unless("entity", "@e[type=armor_stand,tag=cactus,distance=..0.1]"), Control.when("block", "~", "~", "~", "cactus")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/cactus/replace"), Control.positioned("~", "~-1", "~"), Control.unless("entity", "@e[type=armor_stand,tag=cactus,distance=..0.1]"), Control.when("block", "~", "~", "~", "cactus")));
        return 1;
    }
    // impossible_to_survive:zzz/8
    private static int f1(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/shulker/component_loop"), Control.when("entity", "@s[tag=shulker_shield_component]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_roots/loop"), Control.when("entity", "@s[tag=sculk_root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/loop"), Control.when("entity", "@s[tag=aj.crafting_table.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/tree/piece"), Control.when("entity", "@s[tag=tree_piece]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/scarecrow/loop"), Control.when("entity", "@s[tag=scarecrow]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/lava_wave/wave_loop"), Control.when("entity", "@s[tag=aj.lava_wave.root]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/flying_book/loop"), Control.when("entity", "@s[tag=aj.flying_book.root]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/baby_golem/loop"), Control.when("entity", "@s[tag=aj.baby_golem.root]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/vampire/loop"), Control.when("entity", "@s[tag=aj.vampire.root]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/sculk_hand/loop"), Control.when("entity", "@s[tag=aj.sculk_hand.root]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/land_shark/loop"), Control.when("entity", "@s[tag=aj.land_shark.root]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/walking_diamond/loop"), Control.when("entity", "@s[tag=aj.walking_diamond.root]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/mutant_spider/loop"), Control.when("entity", "@s[tag=aj.mutant_spider.root]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/crafting_table/loop"), Control.when("entity", "@s[tag=aj.crafting_table_table.root]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:features/enderpearl/laser_origin_loop"), Control.when("entity", "@s[tag=ender_pearl_laser_origin]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/impossible_dragon/loop"), Control.when("entity", "@s[tag=aj.impossible_dragon.root]"), Control.at("@s")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/9"), Control.when("entity", "@s[tag=mcm.vfx]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/17"), Control.when("entity", "@s[tag=mcm.its.dragon.component_item_display]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:mobs/slime/puddle_loop"), Control.when("entity", "@s[tag=slime_puddle]"), Control.at("@s")));
        return 1;
    }
    // impossible_to_survive:zzz/9
    private static int f2(Frame c) {
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_shield/loop"), Control.when("entity", "@s[tag=mcm.vfx.electric_shield]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/magic_circle_a/loop"), Control.when("entity", "@s[tag=mcm.vfx.magic_circle_a]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/10"), Control.when("entity", "@s[tag=mcm.vfx.impact]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:zzz/14"), Control.when("entity", "@s[tag=mcm.vfx.flash]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/target_indicator_a/loop"), Control.when("entity", "@s[tag=mcm.vfx.target_indicator_a]")));
        Logic.step(() -> Control.run(c, x0 -> Logic.call(x0, "impossible_to_survive:effects/electric_circle/loop"), Control.when("entity", "@s[tag=mcm.vfx.electric_circle]")));
        return 1;
    }
}
