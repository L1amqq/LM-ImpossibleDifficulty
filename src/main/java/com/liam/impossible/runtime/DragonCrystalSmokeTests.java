package com.liam.impossible.runtime;

import com.liam.impossible.mixin.DisplayAccessor;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import java.util.*;
import org.slf4j.LoggerFactory;

final class DragonCrystalSmokeTests {
    static int run(Frame origin,Entity root,net.minecraft.server.level.ServerPlayer player) throws Exception {
        var level=origin.source().getLevel();int passed=0;
        Map<BlockPos,BlockState> saved=new LinkedHashMap<>();
        int difficulty=Native.scoreInfo(origin,"#difficulty","mcm.its.dragon.settings").value();
        for(BlockPos pos:BlockPos.betweenClosed(new BlockPos(-1,153,-21),new BlockPos(1,159,-19)))saved.put(pos.immutable(),level.getBlockState(pos));
        Frame tower=origin.with(origin.source().withPosition(new net.minecraft.world.phys.Vec3(0,155,-20)));
        Entity marker=null,crystal=null;
        try {
            Native.summon(tower,"marker","~","~","~","{Tags:[native_crystal_fixture,mcm.its.dragon_environment.end_crystal]}");
            marker=Native.entity(tower,"@e[tag=native_crystal_fixture,limit=1]");
            tower=tower.with(tower.source().withEntity(marker));
            Logic.call(tower,"impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/summon");
            Native.summon(tower,"end_crystal","~","~-1","~","{Tags:[native_crystal_entity],ShowBottom:1b}");
            crystal=Native.entity(tower,"@e[tag=native_crystal_entity,limit=1]");
            root.teleportTo(level,0,155,0,Set.of(),0,0,true);root.removeTag("mcm.its.dragon.invulnerable");
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.head_count",3);
            for(int mode=1;mode<=3;mode++){
                Native.setScore(origin,"#difficulty","mcm.its.dragon.settings",mode);
                Native.setScore(context(origin,root),"@s","mcm.its.dragon.health",700000);
                Native.setScore(context(origin,root),"@s","mcm.its.dragon.activity",5);
                Native.setScore(context(origin,root),"@s","mcm.its.dragon.attack_delay_timer",1000);
                Native.setScore(context(origin,root),"@s","mcm.its.dragon.has_tail",1);
                root.removeTag("mcm.its.dragon.crystal_healing_interrupted");
                marker.removeTag("mcm.its.dragon_environment.end_crystal.destroyed");
                Logic.call(tower,"impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_invulnerable");
                Logic.call(tower,"impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/activate");
                Logic.call(context(origin,root),"impossible_to_survive:mobs/impossible_dragon/zzz/71");
                check(barriers(level)>0&&!fieldsHidden(tower),"crystal starts with physical and visual protection, difficulty="+mode);passed++;
                for(int tick=0;tick<20;tick++)tick(origin,root);
                check(!marker.getTags().contains("mcm.its.dragon_environment.end_crystal.invulnerable")&&barriers(level)==0,"healing opens the physical cage, difficulty="+mode);passed++;
                check(fieldsHidden(tower),"healing hides all five force-field components, difficulty="+mode);passed++;
                // Reproduce a stale protected crystal loaded in the middle of its healing window.
                Logic.call(tower,"impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_invulnerable");
                Logic.call(tower,"impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/activate");
                tick(origin,root);
                check(barriers(level)==0&&fieldsHidden(tower),"an already-running healing window repairs stale protection, difficulty="+mode);passed++;
                int close=mode==1?103:mode==2?83:63;
                for(int tick=21;tick<close;tick++)tick(origin,root);
                check(marker.getTags().contains("mcm.its.dragon_environment.end_crystal.invulnerable")&&barriers(level)>0&&!fieldsHidden(tower),"protection returns at the original difficulty-dependent time, difficulty="+mode);passed++;
            }
            // The player can actually destroy the exposed crystal and interrupt healing.
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.activity",5);
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.sub_activity",3);
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.activity.timer",25);
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.attack_difficulty",3);
            Native.setScore(origin,"#global","mcm.its.dragon.crystal_count",1);
            root.removeTag("mcm.its.dragon.crystal_healing_interrupted");
            tick(origin,root);
            crystal=Native.entity(tower,"@e[type=end_crystal,distance=..2,limit=1]");
            check(crystal.hurtServer(level,crystal.damageSources().playerAttack(player),1)&&crystal.isRemoved(),"player damage destroys the exposed End crystal");passed++;
            Logic.call(tower,"impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/loop");
            check(marker.getTags().contains("mcm.its.dragon_environment.end_crystal.destroyed")&&root.getTags().contains("mcm.its.dragon.crystal_healing_interrupted"),"destroyed crystal interrupts dragon healing");passed++;
            check(barriers(level)==0&&fieldsHidden(tower),"destroyed crystal leaves no physical or visual protection");passed++;
            // Final cleanup must include the lowest barrier row, missed by the source's death helper.
            Logic.call(tower,"impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_invulnerable");
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.activity",15);
            CrystalShields.sync(context(origin,root));
            check(barriers(level)==0&&Native.entities(tower,"@e[tag=mcm.its.dragon.force_field.component,distance=..2]").isEmpty(),"death removes every barrier row and all force-field entities");passed++;
        }finally{
            CrystalShields.remove(root);
            if(marker!=null)marker.discard();if(crystal!=null&&!crystal.isRemoved())crystal.discard();
            Native.kill(tower,"@e[tag=mcm.its.dragon.force_field.component,distance=..2]");
            for(var entry:saved.entrySet())level.setBlock(entry.getKey(),entry.getValue(),2|16);
            Native.setScore(origin,"#difficulty","mcm.its.dragon.settings",difficulty);
        }
        LoggerFactory.getLogger("impossible_difficulty").info("DRAGON_CRYSTAL_PASS: {} assertions",passed);return passed;
    }
    private static boolean fieldsHidden(Frame tower) throws Exception {
        var fields=Native.entities(tower,"@e[type=item_display,tag=mcm.its.dragon.force_field.component,distance=..2]");
        return fields.size()==5&&fields.stream().allMatch(e->DisplayAccessor.impossible$transform(e.getEntityData()).getScale().lengthSquared()<.000001);
    }
    private static long barriers(net.minecraft.server.level.ServerLevel level){return java.util.stream.StreamSupport.stream(BlockPos.betweenClosed(new BlockPos(-1,153,-21),new BlockPos(1,159,-19)).spliterator(),false).filter(p->level.getBlockState(p).is(Blocks.BARRIER)).count();}
    private static Frame context(Frame origin,Entity root){return origin.with(origin.source().withEntity(root).withPosition(root.position()).withRotation(root.getRotationVector()));}
    private static void tick(Frame origin,Entity root){Logic.call(context(origin,root),"animated_java:impossible_dragon/root/on_tick");Logic.call(context(origin,root),"impossible_to_survive:mobs/impossible_dragon/loop");}
    private static void check(boolean condition,String message){if(!condition)throw new IllegalStateException(message);}
}
