package com.liam.impossible;

import com.liam.impossible.generated.CompiledLogic;
import com.liam.impossible.generated.CompiledContent;
import com.liam.impossible.runtime.*;
import com.liam.impossible.config.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;

public final class ImpossibleDifficulty implements ModInitializer {
    @Override public void onInitialize() {
        DragonCombat.register();
        DragonDeathEffect.register();
        UtilityParticles.register();
        ServerEntityEvents.ENTITY_LOAD.register((entity,level)->UtilityParticles.hide(entity));
        CompiledContent.register();
        CompiledLogic.register();
        GlowstoneLasers.register();
        EndermanGaze.register();
        Smokers.register();
        Logic.register("impossible_to_survive:mobs/enderman/look_lock",EndermanGaze::lock);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/settings/set_crystal_count",DragonHealing::crystals);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/settings/set_player_count",DragonHealing::players);
        Logic.register("impossible_to_survive:mobs/impossible_dragon/ability/heal/set_beam_target",DragonHealing::beam,"x","y","z");
        Logic.wrap("impossible_to_survive:mobs/impossible_dragon/apply_damage",original->frame->{DragonHealing.crystals(frame);int result=original.run(frame);DragonDeath.beginIfDead(frame);return result;});
        Logic.wrap("animated_java:impossible_dragon/root/on_tick",original->frame->DragonDeath.isDying(frame.source().getEntity())?1:original.run(frame));
        Logic.wrap("impossible_to_survive:mobs/impossible_dragon/loop",original->frame->{DragonLifecycle.beforeLoop(frame);if(DragonDeath.handle(frame))return 1;int result=original.run(frame);DragonCombat.afterLoop(frame);DragonHealing.sync(frame);return result;});
        Logic.wrap("impossible_to_survive:mobs/impossible_dragon/zzz/31",original->frame->DragonLifecycle.canSelectAttack(frame)?original.run(frame):1);
        Logic.wrap("impossible_to_survive:mobs/impossible_dragon/loop_5s",original->frame->DragonDeath.isDying(frame.source().getEntity())?1:original.run(frame));
        Logic.wrap("animated_java:impossible_dragon/remove/this",original->frame->{if(frame.source().getEntity()!=null){DragonHealing.stop(frame);DragonCombat.remove(frame.source().getEntity());CrystalShields.remove(frame.source().getEntity());DragonDeath.remove(frame.source().getEntity());}return original.run(frame);});
        Logic.wrap("impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_vulnerable",original->frame->{int result=original.run(frame);CrystalShields.hide(frame);return result;});
        Logic.register("impossible_to_survive:dragon_book/zzz/0",GuideBook::turnPage);
        Logic.register("impossible_to_survive:features/coal/zzz/14",CoalExplosions::explode);
        Logic.register("animated_java:global/internal/gu/convert_uuid_array_to_string",Native::uuidString,"UUID");
        Logic.register("impossible_to_survive:features/crafting_table/crafting_table_check",CraftingTables::check);
        for(String action:new String[]{"player_loop","player_loop_5t","chest_check"})
            Logic.register("impossible_to_survive:features/chest_mob/"+action,frame->1);
        Logic.register("impossible_to_survive:features/chest_mob/summon_aj_chest",ChestEncounters::request);
        Logic.wrap("impossible_to_survive:features/chest_mob/zzz/28",collision ->
            frame -> ChestEncounters.insideSourceChest(frame)?1:collision.run(frame));
        NativeCommands.register();
        ConfigNetworking.register();
        ServerLifecycleEvents.SERVER_STARTED.register(server -> {
            DragonGeometry.preload();
            Logic.call(new Frame(server.createCommandSourceStack()),"#minecraft:load");
            Logic.step(()->Native.scoreboard(new Frame(server.createCommandSourceStack()),"objectives","add","piece_count","dummy"));
            ConfigStore.start(server);
            if(Boolean.getBoolean("impossible.smoke")) {
                server.overworld().setChunkForced(0,0,true);
                server.getLevel(net.minecraft.world.level.Level.NETHER).setChunkForced(0,0,true);
                for(int x=-2;x<=2;x++)for(int z=-2;z<=2;z++)
                    server.getLevel(net.minecraft.world.level.Level.END).setChunkForced(x,z,true);
            }
        });
        ServerTickEvents.START_SERVER_TICK.register(Logic::tick);
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            ChestEncounters.tick(server);
            EndermanGaze.tick(server);
            DragonCombat.tick(server);
            DragonHealing.tick(server);
            ConfigStore.tick(server);
            if(Boolean.getBoolean("impossible.smoke") && server.getTickCount()==40) SmokeTests.run(server);
        });
        ServerLifecycleEvents.END_DATA_PACK_RELOAD.register((server,resources,success) -> {
            if(success){Content.clear();Logic.call(new Frame(server.createCommandSourceStack()),"#minecraft:load");ConfigStore.apply(server,ConfigStore.local());}
        });
        ServerLifecycleEvents.SERVER_STOPPED.register(server -> { Logic.stopped(server); CraftingTables.stopped(server); ChestEncounters.stopped(server); EndermanGaze.stopped(server); DragonCombat.stopped(server); CrystalShields.stopped(server); DragonDeath.stopped(server); Content.clear(); });
    }
}
