package com.liam.impossible.runtime;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.*;
import net.minecraft.resources.*;
import net.minecraft.network.syncher.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.Level;

/** Synchronized visual clock only: no second dragon, collision, damage or saved duplicate. */
public final class DragonDeathEffect extends Interaction {
    private static final ResourceKey<EntityType<?>> KEY=ResourceKey.create(Registries.ENTITY_TYPE,Identifier.fromNamespaceAndPath("impossible_difficulty","dragon_death_effect"));
    public static final EntityType<DragonDeathEffect> TYPE=Registry.register(BuiltInRegistries.ENTITY_TYPE,KEY,
        EntityType.Builder.of(DragonDeathEffect::new,MobCategory.MISC).sized(1,1).clientTrackingRange(32).updateInterval(1).noSave().noSummon().noLootTable().build(KEY));
    private static final EntityDataAccessor<Integer> AGE=SynchedEntityData.defineId(DragonDeathEffect.class,EntityDataSerializers.INT);
    Entity owner;
    public static void register(){}
    public DragonDeathEffect(EntityType<? extends DragonDeathEffect> type,Level level){super(type,level);setWidth(0);setHeight(0);}
    @Override protected void defineSynchedData(SynchedEntityData.Builder builder){super.defineSynchedData(builder);builder.define(AGE,0);}
    public int deathAge(){return getEntityData().get(AGE);}
    void deathAge(int age){getEntityData().set(AGE,age);}
    @Override public boolean isPickable(){return false;}
    // The interaction volume is deliberately empty. Entity's default range calculation
    // derives a zero viewing distance from that box and would hide every death ray.
    @Override public boolean shouldRenderAtSqrDistance(double distance){return distance<512.0*512.0;}
    @Override public void tick(){if(!level().isClientSide()&&(owner==null||owner.isRemoved()))discard();}
}
