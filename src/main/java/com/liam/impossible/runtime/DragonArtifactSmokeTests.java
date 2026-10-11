package com.liam.impossible.runtime;

import net.minecraft.core.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import java.util.*;
import org.slf4j.LoggerFactory;

/** Reproduce an arena reset from the Overworld and an old saved healing beam. */
final class DragonArtifactSmokeTests {
    static int run(MinecraftServer server) throws Exception {
        var end=server.getLevel(Level.END);var overworld=server.overworld();int passed=0;
        Frame source=new Frame(server.createCommandSourceStack().withPosition(new Vec3(0,180,0)));
        Frame tower=source.with(source.source().withLevel(end).withPosition(new Vec3(20,170,20)));
        Map<BlockPos,BlockState> oldEnd=save(end,new BlockPos(14,162,14),new BlockPos(26,177,26));
        Map<BlockPos,BlockState> oldOverworld=save(overworld,new BlockPos(-6,172,-6),new BlockPos(6,187,6));
        var others=Native.entities(tower,"@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]");
        Entity marker=null;
        try {
            for(Entity other:others)other.removeTag("mcm.its.dragon_environment.end_crystal");
            Native.summon(tower,"marker","~","~","~","{Tags:[native_artifact_fixture,mcm.its.dragon_environment.end_crystal]}");
            marker=Native.entity(tower,"@e[tag=native_artifact_fixture,limit=1]");
            Native.setScore(tower.with(tower.source().withEntity(marker)),"@s","mcm.its.dragon.tower_size",4);
            check(Native.place(source,"template","impossible_to_survive:end_pillar_size_4_level_1")==0,"arena template rejects the Overworld");passed++;
            check(unchanged(overworld,oldOverworld),"rejected template preserves every Overworld block");passed++;
            Logic.call(source,"impossible_to_survive:mobs/impossible_dragon/zzz/7");
            check(unchanged(overworld,oldOverworld),"reset invoked by the Overworld clock does not build an Overworld pillar");passed++;
            check(oldEnd.keySet().stream().filter(p->end.getBlockState(p).is(Blocks.OBSIDIAN)).count()>200,"reset rebuilds the actual End pillar at the arena marker");passed++;
            check(marker.isRemoved(),"reset removes the old End arena marker");passed++;
            check(Native.entities(tower,"@e[type=marker,tag=mcm.its.dragon.temp_setup.crystal,distance=..1]").size()==1,"replacement setup marker retains the End pillar coordinates");passed++;
            Native.summon(tower,"marker","~","~","~","{Tags:[native_artifact_fixture,mcm.its.dragon_environment.end_crystal]}");
            Entity arena=Native.entity(tower,"@e[type=marker,tag=native_artifact_fixture,limit=1]");
            // The old reset also left a temporary marker near the Overworld spawn.
            Native.summon(source,"marker","0","80","0","{Tags:[native_artifact_fixture,mcm.its.dragon.temp_setup.crystal]}");
            var oldHeals=Native.entities(tower,"@e[type=marker,tag=mcm.its.dragon_environment.heal_point]");
            Logic.call(tower.with(tower.source().withEntity(arena).withPosition(new Vec3(0,80,0))),"impossible_to_survive:mobs/impossible_dragon/environment/zzz/11");
            check(arena.level()==end&&Math.abs(arena.getX()-20)<.01&&Math.abs(arena.getZ()-20)<.01,"old Overworld setup marker cannot pull the rebuilt End arena into another dimension");passed++;
            for(Entity heal:Native.entities(tower,"@e[type=marker,tag=mcm.its.dragon_environment.heal_point]"))if(!oldHeals.contains(heal))heal.discard();
            arena.teleportTo(end,20,170,20,Set.of(),0,0,true);
            Native.summon(tower,"end_crystal","~","~-1","~","{Tags:[native_artifact_fixture],beam_target:[I;0,100,0]}");
            EndCrystal stale=(EndCrystal)Native.entity(tower,"@e[type=end_crystal,tag=native_artifact_fixture,limit=1]");
            check(stale.getBeamTarget()!=null,"fixture restores an untagged healing beam from an older save");passed++;
            Native.summon(tower,"end_crystal","~8","~-1","~","{Tags:[native_artifact_fixture,native_unmanaged_crystal],beam_target:[I;8,100,0]}");
            EndCrystal unrelated=(EndCrystal)Native.entity(tower,"@e[tag=native_unmanaged_crystal,limit=1]");
            DragonHealing.sync(tower);
            check(stale.getBeamTarget()==null,"old arena beam clears when its dragon is already gone");passed++;
            check(unrelated.getBeamTarget()!=null,"cleanup preserves crystals outside the mod arena");passed++;
            stale.setBeamTarget(new BlockPos(0,100,0));DragonHealing.stop(tower);
            check(stale.getBeamTarget()==null&&!stale.isRemoved(),"cancelling dragon healing clears the beam without destroying the crystal");passed++;
            // A newly tagged beam remains identifiable after its marker disappears and after saving.
            Frame beam=tower.with(tower.source().withEntity(stale));
            Logic.call(beam,"impossible_to_survive:mobs/impossible_dragon/ability/heal/set_beam_target","{x:3,y:110,z:4}");
            check(new BlockPos(3,110,4).equals(stale.getBeamTarget()),"native healing writes the exact requested beam target");passed++;
            Native.kill(tower,"@e[type=marker,tag=native_artifact_fixture]");
            var saved=Native.entityData(stale);stale.setBeamTarget(null);Native.writeEntity(stale,saved);
            check(stale.getBeamTarget()!=null&&stale.getTags().contains("impossible.dragon.healing_beam"),"beam ownership survives entity save and load");passed++;
            DragonHealing.sync(tower);
            check(stale.getBeamTarget()==null,"saved owned beam clears even without its arena marker");passed++;
        }finally{
            Native.kill(tower,"@e[tag=native_artifact_fixture]");
            Native.kill(tower,"@e[type=marker,tag=mcm.its.dragon.temp_setup.crystal,distance=..1]");
            for(Entity other:others)if(!other.isRemoved())other.addTag("mcm.its.dragon_environment.end_crystal");
            restore(end,oldEnd);restore(overworld,oldOverworld);
        }
        LoggerFactory.getLogger("impossible_difficulty").info("DRAGON_ARTIFACT_PASS: {} assertions",passed);return passed;
    }
    private static Map<BlockPos,BlockState> save(net.minecraft.server.level.ServerLevel level,BlockPos from,BlockPos to){
        Map<BlockPos,BlockState> result=new LinkedHashMap<>();for(BlockPos pos:BlockPos.betweenClosed(from,to))result.put(pos.immutable(),level.getBlockState(pos));return result;
    }
    private static boolean unchanged(net.minecraft.server.level.ServerLevel level,Map<BlockPos,BlockState> saved){return saved.entrySet().stream().allMatch(e->level.getBlockState(e.getKey()).equals(e.getValue()));}
    private static void restore(net.minecraft.server.level.ServerLevel level,Map<BlockPos,BlockState> saved){for(var entry:saved.entrySet())level.setBlock(entry.getKey(),entry.getValue(),2|16);}
    private static void check(boolean condition,String message){if(!condition)throw new IllegalStateException(message);}
}
