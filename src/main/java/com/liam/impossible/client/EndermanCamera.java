package com.liam.impossible.client;

import com.liam.impossible.runtime.EndermanGazePayload;
import com.liam.impossible.runtime.ViewSmoothing;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;

/** Smooth the local view every rendered frame, following the target between server ticks. */
public final class EndermanCamera {
    private static int target=-1;
    private static ClientLevel level;
    private static long expires,lastFrame;
    public static void receive(EndermanGazePayload payload){
        var client=Minecraft.getInstance();
        if(level!=client.level||target!=payload.target())lastFrame=0;
        level=client.level;target=payload.target();expires=System.nanoTime()+750_000_000L;
    }
    public static boolean active(){
        var client=Minecraft.getInstance();
        if(target<0||client.player==null||!client.player.isAlive()||client.level!=level||System.nanoTime()>expires)return false;
        var entity=level.getEntity(target);
        return entity!=null&&entity.isAlive()&&client.player.distanceToSqr(entity)<=225;
    }
    public static void frame(float partialTick){
        if(!active()){lastFrame=0;return;}
        var player=Minecraft.getInstance().player;var entity=level.getEntity(target);long now=System.nanoTime();
        float seconds=lastFrame==0?1f/60:(now-lastFrame)/1_000_000_000f;lastFrame=now;
        var angles=ViewSmoothing.targetAngles(player,entity,partialTick);
        player.setYRot(ViewSmoothing.yaw(player.getYRot(),angles.y,seconds));
        player.setXRot(ViewSmoothing.pitch(player.getXRot(),angles.x,seconds));
        player.yRotO=player.getYRot();player.xRotO=player.getXRot();
    }
}
