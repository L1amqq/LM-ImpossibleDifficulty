package com.liam.impossible.runtime;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.*;
import java.util.*;
import org.slf4j.LoggerFactory;

/** Start with a real hit and let the unmodified navigation and healing phases run. */
final class DragonHealingSmokeTests {
    static int run(Frame origin,Entity root,ServerPlayer player) throws Exception {
        var level=origin.source().getLevel();int passed=0;ServerPlayer second=null;
        try {
            for(int i=0;i<10;i++)Native.summon(origin,"marker",Integer.toString(i==0?0:15+i),"155",Integer.toString(i==0?-20:20),"{Tags:[native_healing_fixture,mcm.its.dragon_environment.end_crystal]}");
            Native.summon(origin,"marker","0","155","0","{Tags:[native_healing_fixture,mcm.its.dragon_environment.heal_point]}");
            Native.summon(origin,"end_crystal","0","154","-20","{Tags:[native_healing_crystal],ShowBottom:1b}");
            root.teleportTo(level,0,150,-3,Set.of(),0,0,true);
            Frame frame=context(origin,root);
            Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/settings/set_crystal_count");
            check(Native.scoreInfo(frame,"#global","mcm.its.dragon.crystal_count").value()==10,"ten living crystals are counted as ten");passed++;
            var crystals=Native.entities(frame,"@e[tag=native_healing_fixture,tag=mcm.its.dragon_environment.end_crystal]");
            crystals.get(8).addTag("mcm.its.dragon_environment.end_crystal.destroyed");crystals.get(9).addTag("mcm.its.dragon_environment.end_crystal.destroyed");
            DragonHealing.crystals(frame);
            check(Native.scoreInfo(frame,"#global","mcm.its.dragon.crystal_count").value()==8,"destroyed crystals are excluded from the actual count");passed++;
            crystals.get(8).removeTag("mcm.its.dragon_environment.end_crystal.destroyed");crystals.get(9).removeTag("mcm.its.dragon_environment.end_crystal.destroyed");
            var profile=new com.mojang.authlib.GameProfile(UUID.randomUUID(),"HealingSmoke");
            second=new ServerPlayer(level.getServer(),level,profile,net.minecraft.server.level.ClientInformation.createDefault());
            var connection=new net.minecraft.network.Connection(net.minecraft.network.protocol.PacketFlow.SERVERBOUND);
            new net.minecraft.server.network.ServerGamePacketListenerImpl(level.getServer(),connection,second,net.minecraft.server.network.CommonListenerCookie.createInitial(profile,false));
            second.setGameMode(net.minecraft.world.level.GameType.SURVIVAL);second.snapTo(4,150,0,0,0);
            level.getServer().getPlayerList().getPlayers().add(second);level.addNewPlayer(second);
            player.snapTo(2,150,-3,0,0);
            DragonHealing.players(frame);
            check(Native.scoreInfo(frame,"#player_count","mcm.its.dragon.settings").value()==2,"two nearby survival players are counted as two");passed++;
            root.removeTag("mcm.its.dragon.invulnerable");root.removeTag("mcm.its.dragon.crystal_healing_interrupted");
            for(String tag:List.copyOf(root.getTags()))if(tag.startsWith("mcm.its.dragon.initiate_"))root.removeTag(tag);
            Native.setScore(frame,"@s","mcm.its.dragon.health",900000);Native.setScore(frame,"@s","mcm.its.dragon.head_count",3);
            Native.setScore(frame,"@s","mcm.its.dragon.activity",1);Native.setScore(frame,"@s","mcm.its.dragon.attack_delay_timer",1000);
            Native.setScore(frame,"@s","mcm.its.dragon.damaged_cd",0);Native.setScore(frame,"@s","mcm.its.dragon.tutorial.stage",3);
            Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/state/set_fly");DragonCombat.update(root);
            DragonPart body=DragonCombat.parts(root).stream().filter(p->p.bone.equals("body")).findFirst().orElseThrow();body.target.invulnerableTime=0;
            player.snapTo(body.getX()+1,body.getY(),body.getZ(),90,0);for(int i=0;i<30;i++)player.doTick();
            player.attack(body);
            check(score(origin,root,"health")<900000&&root.getTags().contains("mcm.its.dragon.initiate_seek_healing"),"real damage requests healing at the original ten-crystal threshold");passed++;
            tick(origin,root);check(score(origin,root,"activity")==5,"damage-triggered healing enters navigation");passed++;
            for(int i=0;i<600&&score(origin,root,"sub_activity")!=3;i++)tick(origin,root);
            check(score(origin,root,"activity")==5&&score(origin,root,"sub_activity")==3,"dragon reaches the actual heal point and starts its healing animation; position="+root.position()+", activity="+score(origin,root,"activity")+", sub="+score(origin,root,"sub_activity"));passed++;
            int before=score(origin,root,"health");for(int i=0;i<25;i++)tick(origin,root);
            check(score(origin,root,"health")>before,"healing restores health through the normal ability tick");passed++;
            Entity crystal=Native.entity(origin,"@e[tag=native_healing_crystal,limit=1]");
            check(((net.minecraft.world.entity.boss.enderdragon.EndCrystal)crystal).getBeamTarget()!=null,"healing crystal beam is attached to the animated dragon; root="+root.position()+", rotation="+root.getRotationVector()+", activity="+score(origin,root,"activity")+", sub="+score(origin,root,"sub_activity")+", timer="+score(origin,root,"activity.timer")+", difficulty="+score(origin,root,"attack_difficulty")+", tags="+root.getTags()+", crystals="+crystals.stream().map(e->e.position()+" "+e.getTags()).toList());passed++;
            DragonHealing.sync(context(origin,root));
            check(((net.minecraft.world.entity.boss.enderdragon.EndCrystal)crystal).getBeamTarget()!=null,"beam stays visible throughout active healing");passed++;
            root.addTag("mcm.its.dragon.crystal_healing_interrupted");DragonHealing.sync(context(origin,root));
            check(((net.minecraft.world.entity.boss.enderdragon.EndCrystal)crystal).getBeamTarget()==null,"interrupting healing clears its beam immediately");passed++;
            root.removeTag("mcm.its.dragon.crystal_healing_interrupted");
            ((net.minecraft.world.entity.boss.enderdragon.EndCrystal)crystal).setBeamTarget(new net.minecraft.core.BlockPos(0,155,0));
            int timer=score(origin,root,"activity.timer");
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.activity.timer",103);DragonHealing.sync(context(origin,root));
            check(((net.minecraft.world.entity.boss.enderdragon.EndCrystal)crystal).getBeamTarget()==null,"completed healing leaves no frozen beam");passed++;
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.activity.timer",timer);
            var marker=crystals.getFirst();
            Frame tower=origin.with(origin.source().withEntity(marker).withPosition(marker.position()));
            check(!marker.getTags().contains("mcm.its.dragon_environment.end_crystal.invulnerable"),"damage-triggered healing opens the chosen crystal");passed++;
            crystal.hurtServer(level,crystal.damageSources().playerAttack(player),1);
            Logic.call(tower,"impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/loop");
            check(root.getTags().contains("mcm.its.dragon.crystal_healing_interrupted"),"destroying the crystal interrupts naturally triggered healing");passed++;
            tick(origin,root);int stopped=score(origin,root,"health");for(int i=0;i<15;i++)tick(origin,root);
            check(score(origin,root,"health")==stopped,"interrupted healing stops restoring health");passed++;
            for(Entity entity:crystals)entity.addTag("mcm.its.dragon_environment.end_crystal.destroyed");
            DragonHealing.crystals(context(origin,root));
            check(Native.scoreInfo(frame,"#global","mcm.its.dragon.crystal_count").value()==0,"zero remaining crystals are counted as zero");passed++;
        }finally{
            CrystalShields.remove(root);
            if(second!=null){level.getServer().getPlayerList().getPlayers().remove(second);second.discard();}
            Native.kill(origin,"@e[tag=native_healing_fixture]");Native.kill(origin,"@e[tag=native_healing_crystal]");
        }
        LoggerFactory.getLogger("impossible_difficulty").info("DRAGON_HEALING_PASS: {} assertions",passed);return passed;
    }
    private static Frame context(Frame origin,Entity root){return origin.with(origin.source().withEntity(root).withPosition(root.position()).withRotation(root.getRotationVector()));}
    private static int score(Frame origin,Entity root,String name) throws Exception {return Native.scoreInfo(context(origin,root),"@s","mcm.its.dragon."+name).value();}
    private static void tick(Frame origin,Entity root){Logic.call(context(origin,root),"animated_java:impossible_dragon/root/on_tick");Logic.call(context(origin,root),"impossible_to_survive:mobs/impossible_dragon/loop");}
    private static void check(boolean condition,String message){if(!condition)throw new IllegalStateException(message);}
}
