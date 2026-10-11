package com.liam.impossible.runtime;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import java.util.Set;

/** Source bookkeeping clouds carry no visible potion effect. Actual potion clouds retain their renderer. */
public final class UtilityParticles {
    public static final SimpleParticleType INVISIBLE=FabricParticleTypes.simple();
    private static final Set<String> HELPERS=Set.of("tree_center","creeper_aec","creeper_spawn_point","chest_looked_aec","crafting_table_looked_aec");
    public static void register() {
        Registry.register(BuiltInRegistries.PARTICLE_TYPE,Identifier.fromNamespaceAndPath("impossible_difficulty","invisible_helper"),INVISIBLE);
    }
    public static void hide(Entity entity) {
        if(entity instanceof AreaEffectCloud cloud&&cloud.getTags().stream().anyMatch(HELPERS::contains))cloud.setCustomParticle(INVISIBLE);
    }
}
