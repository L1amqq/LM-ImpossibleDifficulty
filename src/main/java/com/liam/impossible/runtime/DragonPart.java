package com.liam.impossible.runtime;

import net.minecraft.world.entity.*;
import net.minecraft.world.level.Level;
import net.minecraft.network.syncher.*;
import net.minecraft.world.phys.*;

/** Invisible, synchronized attack volume. Health and weak points belong to the original rig. */
public final class DragonPart extends Interaction {
    private static final EntityDataAccessor<Float> DEPTH=SynchedEntityData.defineId(DragonPart.class,EntityDataSerializers.FLOAT);
    Entity owner;
    net.minecraft.world.entity.animal.pig.Pig target;
    String bone;
    public DragonPart(EntityType<? extends DragonPart> type,Level level){super(type,level);setResponse(true);}
    @Override protected void defineSynchedData(SynchedEntityData.Builder builder){super.defineSynchedData(builder);builder.define(DEPTH,1f);}
    public void setSize(float width,float height,float depth){setWidth(width);setHeight(height);getEntityData().set(DEPTH,depth);}
    @Override public void onSyncedDataUpdated(EntityDataAccessor<?> accessor){super.onSyncedDataUpdated(accessor);if(DEPTH.equals(accessor))refreshDimensions();}
    @Override protected AABB makeBoundingBox(Vec3 pos){
        double halfWidth=getWidth()/2.0,halfDepth=getEntityData().get(DEPTH)/2.0;
        return new AABB(pos.x-halfWidth,pos.y,pos.z-halfDepth,pos.x+halfWidth,pos.y+getHeight(),pos.z+halfDepth);
    }
    public Entity damageTarget(){return owner!=null&&!owner.isRemoved()&&target!=null&&!target.isRemoved()?target:null;}
    @Override public void tick(){
        if(!level().isClientSide()&&(owner==null||owner.isRemoved()||target==null||target.isRemoved()))discard();
    }
}
