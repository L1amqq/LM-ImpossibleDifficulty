package com.liam.impossible.runtime;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec2;

/** Frame-rate-independent damping with a bounded turn speed and shortest yaw arc. */
public final class ViewSmoothing {
    /** Aim from the player's interpolated eyes to the target's interpolated eyes. */
    public static Vec2 targetAngles(Entity player,Entity target,float partialTick){
        var direction=target.getEyePosition(partialTick).subtract(player.getEyePosition(partialTick));
        return new Vec2((float)(-Mth.atan2(direction.y,direction.horizontalDistance())*180/Math.PI),
            (float)(Mth.atan2(direction.z,direction.x)*180/Math.PI)-90);
    }
    public static float yaw(float current,float target,float seconds){return step(current,Mth.wrapDegrees(target-current),seconds,300);}
    public static float pitch(float current,float target,float seconds){return Mth.clamp(step(current,target-current,seconds,220),-90,90);}
    private static float step(float current,float distance,float seconds,float speed){
        float dt=Mth.clamp(seconds,0,1f/15),blend=(float)(1-Math.exp(-dt/0.12));
        return current+Mth.clamp(distance*blend,-speed*dt,speed*dt);
    }
}
