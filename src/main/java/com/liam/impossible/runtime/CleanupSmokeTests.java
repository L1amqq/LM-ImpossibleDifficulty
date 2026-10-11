package com.liam.impossible.runtime;

import com.mojang.authlib.GameProfile;
import net.minecraft.core.BlockPos;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.protocol.game.*;
import net.minecraft.server.level.*;
import net.minecraft.server.network.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import java.util.*;

/** Regression cases for the vertical glowstone beam and the surviving administrative actions. */
final class CleanupSmokeTests {
    static int run(Frame source) throws Exception {
        var server=source.source().getServer();var level=server.getLevel(Level.NETHER);
        level.setChunkForced(0,0,true);
        var profile=new GameProfile(UUID.randomUUID(),"CleanupSmoke");
        var player=new ServerPlayer(server,level,profile,ClientInformation.createDefault());
        var packets=new ArrayList<Packet<?>>();
        var connection=new Connection(PacketFlow.SERVERBOUND){
            @Override public void send(Packet<?> packet,io.netty.channel.ChannelFutureListener listener,boolean flush){packets.add(packet);}
        };
        new ServerGamePacketListenerImpl(server,connection,player,CommonListenerCookie.createInitial(profile,false));
        player.setGameMode(GameType.SURVIVAL);player.addTag("survivor");player.snapTo(6.5,4,6.5,0,0);
        server.getPlayerList().getPlayers().add(player);level.addNewPlayer(player);
        player.connection.handleAcceptPlayerLoad(new ServerboundPlayerLoadedPacket());
        Frame c=new Frame(source.source().withLevel(level).withEntity(player).withPosition(player.position()));
        var blocks=new HashMap<BlockPos,BlockState>();
        for(int y=0;y<level.getMaxY();y++){
            var pos=new BlockPos(6,y,6);blocks.put(pos,level.getBlockState(pos));level.setBlock(pos,Blocks.AIR.defaultBlockState(),2);
        }
        int difficulty=Native.scoreInfo(c,"#global","mcm.its.overall_difficulty").value(),passed=0;
        try {
            Native.setScore(c,"#global","mcm.its.overall_difficulty",2);
            for(int height:new int[]{7,25,35,80,126}){
                player.snapTo(6.5,4,6.5,0,0);player.setHealth(20);player.invulnerableTime=0;player.removeAllEffects();
                c=new Frame(source.source().withLevel(level).withEntity(player).withPosition(player.position()));
                Native.setScore(c,"@s","glowstone_laser_cd",0);Native.setScore(c,"@s","glowstone_scan_offset",0);
                var glow=new BlockPos(6,height,6);level.setBlock(glow,Blocks.GLOWSTONE.defaultBlockState(),2);packets.clear();
                for(int tick=0;tick<4;tick++)Logic.call(c,"impossible_to_survive:features/glowstone/scan_for_glowstone_above");
                check(player.getHealth()==10,"beam reaches player from height "+height+", health="+player.getHealth()+", cooldown="+Native.scoreInfo(c,"@s","glowstone_laser_cd").value()+", particles="+packets.size());passed++;
                check(Native.scoreInfo(c,"@s","glowstone_laser_cd").value()==3,"beam preserves cooldown");passed++;
                check(!player.getTags().contains("mcm.its.glowstone_hit")&&!player.getTags().contains("this.glowstone_triggerer"),"beam cleans temporary hit tags");passed++;
                check(packets.stream().anyMatch(p->p instanceof ClientboundLevelParticlesPacket particles&&particles.getY()<8),"visible beam particles reach low player");passed++;
                check(Native.entities(c,"@e[tag=mcm.its.glowstone_laser,distance=0..]").isEmpty(),"beam leaves no markers");passed++;
                player.invulnerableTime=0;Logic.call(c,"impossible_to_survive:features/glowstone/scan_for_glowstone_above");
                check(player.getHealth()==10,"cooldown prevents second hit");passed++;
                level.setBlock(glow,Blocks.AIR.defaultBlockState(),2);
            }
            var glow=new BlockPos(6,100,6);var wall=new BlockPos(6,40,6);
            level.setBlock(glow,Blocks.GLOWSTONE.defaultBlockState(),2);level.setBlock(wall,Blocks.NETHERRACK.defaultBlockState(),2);
            player.setHealth(20);player.invulnerableTime=0;Native.setScore(c,"@s","glowstone_laser_cd",0);
            for(int tick=0;tick<4;tick++)Logic.call(c,"impossible_to_survive:features/glowstone/scan_for_glowstone_above");
            check(player.getHealth()==20,"solid roof blocks detection and damage");passed++;
            Frame origin=c.with(c.source().withPosition(Vec3.atCenterOf(glow)));
            Logic.call(origin,"impossible_to_survive:features/glowstone/glowstone_found");
            check(player.getHealth()==20,"directly fired beam stops at obstacle");passed++;
            level.setBlock(wall,Blocks.AIR.defaultBlockState(),2);
            for(int y=90;y<=100;y++)level.setBlock(new BlockPos(6,y,6),Blocks.GLOWSTONE.defaultBlockState(),2);
            player.invulnerableTime=0;Native.setScore(c,"@s","glowstone_laser_cd",0);
            Logic.call(origin,"impossible_to_survive:features/glowstone/glowstone_found");
            check(player.getHealth()==10,"beam exits glowstone cluster thicker than four blocks");passed++;
            player.setGameMode(GameType.SPECTATOR);player.setHealth(20);player.invulnerableTime=0;
            Logic.call(origin,"impossible_to_survive:features/glowstone/glowstone_found");
            check(player.getHealth()==20,"spectator is not hit");passed++;
            player.setGameMode(GameType.SURVIVAL);player.getInventory().clearContent();player.setItemInHand(net.minecraft.world.InteractionHand.MAIN_HAND,new net.minecraft.world.item.ItemStack(Items.DIAMOND));
            Logic.call(c,"impossible_to_survive:challenge/book/give");
            check(player.getMainHandItem().is(Items.DIAMOND),"administrative book does not overwrite inventory slot");passed++;
            check(!Logic.hasAction("impossible_to_survive:challenge/start")&&!Logic.hasAction("impossible_to_survive:dragon_staff/teleport_timer"),"incomplete entry points removed");passed++;
            int unavailable=server.getCommands().getDispatcher().execute("impossible action impossible_to_survive:challenge/start",c.source());
            check(unavailable==0&&player.getMainHandItem().is(Items.DIAMOND),"old challenge command fails safely without clearing inventory");passed++;
            var book=player.getInventory().getNonEquipmentItems().stream().filter(stack->stack.is(Items.WRITTEN_BOOK)).findFirst().orElseThrow();
            var content=book.get(net.minecraft.core.component.DataComponents.WRITTEN_BOOK_CONTENT);
            String text=content.pages().getFirst().raw().getString();
            check(text.contains("Посох")||text.contains("посох"),"administrative book keeps useful actions");passed++;
            check(!text.contains("Start")&&!text.contains("Time")&&!text.contains("Switch"),"administrative book removes broken challenge buttons");passed++;
            packets.clear();
            for(var objective:server.getScoreboard().getObjectives())if(objective.getName().startsWith("mcm.itsv.feature_encountered."))Native.setScore(c,"@s",objective.getName(),1);
            Logic.call(c,"impossible_to_survive:count_features");
            check(Native.scoreInfo(c,"@s","hermit_feature_counter").value()==48,"all 48 categories counted");passed++;
            check(packets.stream().anyMatch(p->p instanceof ClientboundSystemChatPacket chat&&chat.content().getString().endsWith("/48")),"counter displays correct denominator");passed++;
            Logic.call(c,"impossible_to_survive:count_features");
            check(Native.scoreInfo(c,"@s","hermit_feature_counter").value()==48,"counter remains stable on repeat");passed++;
        } finally {
            Native.setScore(c,"#global","mcm.its.overall_difficulty",difficulty);
            Native.kill(c,"@e[tag=mcm.its.glowstone_laser,distance=0..]");
            server.getPlayerList().getPlayers().remove(player);player.discard();
            blocks.forEach((pos,state)->level.setBlock(pos,state,2));level.setChunkForced(0,0,false);
        }
        org.slf4j.LoggerFactory.getLogger("impossible_difficulty").info("CLEANUP_SMOKE_PASS: {} assertions",passed);
        return passed;
    }
    private static void check(boolean value,String description){if(!value)throw new IllegalStateException(description);}
}
