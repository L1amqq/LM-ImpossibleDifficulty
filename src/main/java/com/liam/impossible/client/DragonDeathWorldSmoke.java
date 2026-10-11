package com.liam.impossible.client;

import com.liam.impossible.runtime.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Screenshot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.*;
import net.minecraft.world.phys.Vec3;
import java.nio.file.Path;
import java.util.*;

/** End-to-end preview in an isolated copy of the smoke world, through actual entity tracking and GPU rendering. */
final class DragonDeathWorldSmoke {
    private static int ticks,readyTicks,afterDeath;
    private static boolean prepared,started,sawEffect;
    private static volatile UUID rootId;
    private static volatile Throwable failure;
    private static final Set<Integer> captured=new HashSet<>();
    static void tick(Minecraft client) throws Exception {
        if(++ticks>1800)throw new IllegalStateException("World death preview timed out; prepared="+prepared+", started="+started+", ready="+readyTicks+", sawEffect="+sawEffect+", captures="+captured+", root="+rootId);
        if(failure!=null)throw new IllegalStateException("World death fixture failed",failure);
        if(client.player==null||client.level==null||client.getSingleplayerServer()==null)return;
        client.options.hideGui=true;
        if(!prepared){
            prepared=true;
            var server=client.getSingleplayerServer();var playerId=client.player.getUUID();
            server.execute(()->{
                try{
                    var level=server.getLevel(Level.END);var player=server.getPlayerList().getPlayer(playerId);
                    for(int x=-4;x<=4;x++)for(int z=-4;z<=4;z++)level.setChunkForced(x,z,true);
                    Frame frame=new Frame(server.createCommandSourceStack().withLevel(level).withPosition(new Vec3(0,135,0)));
                    for(Entity old:Native.entities(frame,"@e[tag=aj.impossible_dragon.root]"))Logic.call(frame.with(frame.source().withEntity(old)),"animated_java:impossible_dragon/remove/this");
                    for(Entity vanilla:Native.entities(frame,"@e[type=ender_dragon]"))vanilla.discard();
                    for(Entity center:Native.entities(frame,"@e[tag=mcm.its.dragon_environment.exit_portal_center]"))center.discard();
                    Native.summon(frame,"marker","0","97","0","{Tags:[mcm.its.dragon_environment,mcm.its.dragon_environment.exit_portal_center]}");
                    Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/summon");
                    Entity root=Native.entity(frame,"@e[tag=aj.impossible_dragon.root,sort=nearest,limit=1]");
                    frame=frame.with(frame.source().withEntity(root));
                    Native.setScore(frame,"@s","mcm.its.dragon.activity",-1);
                    Native.setScore(frame,"@s","mcm.its.dragon.health",1);
                    Native.setScore(frame,"@s","mcm.its.dragon.head_count",1);
                    Native.setScore(frame,"@s","mcm.its.dragon.attack_delay_timer",1000);
                    // This fixture creates its own arena; automatic world setup can replace its rig.
                    Native.setScore(frame,"#global","mcm.its.dragon.setup.state",6);
                    Logic.call(frame,"animated_java:impossible_dragon/variants/1_head/apply");
                    player.setGameMode(GameType.SPECTATOR);player.teleportTo(level,0,105,-50,Set.of(),0,-25,true);
                    rootId=root.getUUID();
                }catch(Throwable error){failure=error;}
            });return;
        }
        if(rootId==null||client.level.dimension()!=Level.END)return;
        Entity root=null;DragonDeathEffect effect=null;
        for(Entity entity:client.level.entitiesForRendering()){
            if(entity.getUUID().equals(rootId))root=entity;
            if(entity instanceof DragonDeathEffect dying)effect=dying;
        }
        if(root==null&&!started)return;
        if(root!=null){
            var angles=ViewSmoothing.targetAngles(client.player,root,1);
            if(effect!=null){
                Vec3 direction=effect.position().subtract(client.player.getEyePosition());
                angles=new net.minecraft.world.phys.Vec2((float)-Math.toDegrees(Math.atan2(direction.y,direction.horizontalDistance())),(float)Math.toDegrees(Math.atan2(direction.z,direction.x))-90);
            }
            client.player.setYRot(angles.y);client.player.yRotO=angles.y;client.player.setXRot(angles.x);client.player.xRotO=angles.x;
        }
        if(!started&&++readyTicks>=40){
            started=true;client.setScreen(null);var server=client.getSingleplayerServer();
            server.execute(()->{
                try{
                    var entity=server.getLevel(Level.END).getEntity(rootId);
                    Frame frame=new Frame(server.createCommandSourceStack().withLevel(server.getLevel(Level.END)).withEntity(entity).withPosition(entity.position()));
                    Native.setScore(frame,"@s","mcm.its.dragon.health",0);DragonDeath.beginIfDead(frame);
                }catch(Throwable error){failure=error;}
            });
        }
        if(effect!=null&&effect.deathAge()>0){
            sawEffect=true;
            var renderer=client.getEntityRenderDispatcher().getRenderer(effect);
            Vec3 camera=client.gameRenderer.getMainCamera().position();
            if(!renderer.shouldRender(effect,null,camera.x,camera.y,camera.z))throw new IllegalStateException("Death rays were culled before submission");
            for(int phase:new int[]{40,100,185})if(effect.deathAge()>=phase&&captured.add(phase)){
                Screenshot.takeScreenshot(client.getMainRenderTarget(),image->{
                    try(image){image.writeToFile(Path.of("dragon-death-world-"+phase+".png"));}
                    catch(Throwable error){failure=error;}
                });
            }
        }
        if(started&&sawEffect&&root==null&&effect==null&&++afterDeath>20){
            if(captured.size()!=3||DragonDeathEffectRenderer.worldSubmissions<30)throw new IllegalStateException("Death effects never reached the world renderer");
            org.slf4j.LoggerFactory.getLogger("impossible_difficulty").info("CLIENT_DRAGON_DEATH_WORLD_PASS: real End scene, tracked custom rig and effect, {} rendered frames, three GPU screenshots, cleanup after death",DragonDeathEffectRenderer.worldSubmissions);
            client.stop();
        }
    }
}
