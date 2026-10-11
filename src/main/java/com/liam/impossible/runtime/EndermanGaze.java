package com.liam.impossible.runtime;

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import java.util.*;

/** Retain the gaze mechanics without teleporting the player's camera twice per tick. */
public final class EndermanGaze {
    private static final Map<MinecraftServer,Map<UUID,Lock>> ACTIVE=new WeakHashMap<>();
    private static final class Lock {
        final ServerPlayer player;final Entity target;int touched,nextSync;
        Lock(ServerPlayer player,Entity target){this.player=player;this.target=target;}
    }
    public static void register(){PayloadTypeRegistry.playS2C().register(EndermanGazePayload.TYPE,EndermanGazePayload.CODEC);}
    public static int lock(Frame frame) throws Exception {
        if(!(frame.source().getEntity() instanceof ServerPlayer player))return 0;
        var server=player.level().getServer();var locks=ACTIVE.computeIfAbsent(server,s->new HashMap<>());
        if(!enabled(player)){release(locks,player.getUUID());return 0;}
        Lock lock=locks.get(player.getUUID());
        if(lock==null||!valid(lock)){
            var targets=Native.entities(frame,"@e[type=enderman,tag=!mcm.its.dragon.minion,limit=1,sort=nearest,distance=..15]");
            if(targets.isEmpty()){release(locks,player.getUUID());return 0;}
            lock=new Lock(player,targets.getFirst());locks.put(player.getUUID(),lock);
        }
        lock.touched=server.getTickCount();
        if(lock.touched>=lock.nextSync){ServerPlayNetworking.send(player,new EndermanGazePayload(lock.target.getId()));lock.nextSync=lock.touched+5;}
        Logic.call(frame,"impossible_to_survive:challenge/feature_encounter/enderman");
        Logic.call(frame,"impossible_to_survive:mobs/enderman/particles");
        return 1;
    }
    private static boolean enabled(ServerPlayer player){
        var board=player.level().getServer().getScoreboard();var objective=board.getObjective("disabled_endermen");
        var score=objective==null?null:board.getPlayerScoreInfo(net.minecraft.world.scores.ScoreHolder.forNameOnly("#global"),objective);
        return !player.isSpectator()&&!player.isCreative()&&(score==null||score.value()!=1);
    }
    private static boolean valid(Lock lock){return enabled(lock.player)&&lock.player.isAlive()&&lock.target.isAlive()&&!lock.target.isRemoved()&&lock.target.level()==lock.player.level()&&lock.player.distanceToSqr(lock.target)<=225;}
    public static void tick(MinecraftServer server){
        var locks=ACTIVE.get(server);if(locks==null)return;
        for(var id:List.copyOf(locks.keySet())){
            Lock lock=locks.get(id);
            if(!valid(lock)||lock.touched<server.getTickCount()-1)release(locks,id);
        }
    }
    private static void release(Map<UUID,Lock> locks,UUID id){
        Lock lock=locks.remove(id);if(lock!=null)ServerPlayNetworking.send(lock.player,new EndermanGazePayload(-1));
    }
    public static void stopped(MinecraftServer server){ACTIVE.remove(server);}
}
