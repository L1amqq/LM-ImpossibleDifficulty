package com.liam.impossible.runtime;

import net.minecraft.world.entity.*;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import java.util.*;

/** Persist ownership through projectile/effect chains and cancel their damage at death. */
public final class DragonAttacks {
    static final String ATTACK="impossible.dragon.attack",OWNER="impossible.dragon.owner.";
    static Entity owner(Entity source){
        if(source==null)return null;if(DragonCombat.isDragon(source))return source;
        for(String tag:source.getTags())if(tag.startsWith(OWNER))return ((ServerLevel)source.level()).getEntity(UUID.fromString(tag.substring(OWNER.length())));
        if(legacy(source))return source.level().getEntitiesOfClass(Entity.class,source.getBoundingBox().inflate(400),e->DragonCombat.isDragon(e)&&!e.isRemoved()).stream().min(Comparator.comparingDouble(e->e.distanceToSqr(source))).orElse(null);
        return null;
    }
    public static boolean blocked(Entity source){
        if(source==null)return false;
        if(DragonCombat.isDragon(source))return DragonDeath.isDying(source);
        if(!source.getTags().contains(ATTACK))return false;
        Entity root=owner(source);return root==null||root.isRemoved()||DragonDeath.isDying(root);
    }
    static boolean blockedContext(Entity source){return blocked(source)||blocked(Logic.attackOwner());}
    public static boolean mark(Entity source,Entity created){
        if(created instanceof net.minecraft.world.entity.item.ItemEntity||created instanceof ExperienceOrb||created instanceof net.minecraft.world.entity.player.Player||created instanceof net.minecraft.world.entity.boss.enderdragon.EndCrystal||created.getTags().contains("aj.rig_entity")||created.getTags().contains("mcm.its.dragon.hitbox")||created.getTags().stream().anyMatch(t->t.startsWith("mcm.its.dragon_environment")||t.startsWith("aj.impossible_dragon.locator")))return true;
        Entity root=owner(source);if(root==null)root=Logic.attackOwner();if(root==null)return !blocked(source);
        if(DragonDeath.isDying(root))return false;
        created.addTag(ATTACK);created.addTag(OWNER+root.getUUID());
        for(Entity passenger:created.getPassengers())mark(created,passenger);
        return true;
    }
    private static boolean legacy(Entity entity){
        return entity.getTags().stream().anyMatch(t->t.startsWith("mcm.its.dragon.fireball")||t.startsWith("mcm.its.dragon.laser")||t.startsWith("mcm.its.dragon.lightning_attack")||t.startsWith("mcm.its.dragon.forcefield")||t.equals("mcm.its.dragon.component_item_display")||t.equals("mcm.its.dragon.tutorial.component")||t.equals("mcm.lightning_vfx.projectile.egg_attracted")||t.equals("mcm.lightning_vfx.projectile.stage_transition")||t.equals("mcm.vfx.target_indicator_a"));
    }
    public static int cancel(Frame frame) throws Exception {
        DragonHealing.stop(frame);
        Entity root=frame.source().getEntity();int removed=0;String owned=OWNER+root.getUUID();
        for(Entity entity:Native.entities(frame,"@e"))if(entity!=root&&!entity.getTags().contains("aj.rig_entity")&&
            (entity.getTags().contains(owned)||(entity.level()==root.level()&&entity.distanceToSqr(root)<160000&&(legacy(entity)||entity instanceof AreaEffectCloud cloud&&cloud.getParticle()==ParticleTypes.DRAGON_BREATH)))){
            entity.discard();removed++;
        }
        for(String tag:List.of("mcm.its.fireball_target","mcm.lightning_vfx.target"))Native.tag(frame,"@a","remove",tag);
        Native.setScore(frame,"@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]","mcm.its.dragon.crystal_reactivation_timer",0);
        for(String sound:List.of("attack_forcefield","healing","healing_short","healing_long"))Native.stopsound(frame,"@a","master","minecraft:dragon."+sound);
        return removed;
    }
}
