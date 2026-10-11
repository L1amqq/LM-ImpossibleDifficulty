package com.liam.impossible.client;

import com.liam.impossible.config.ConfigPayload;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import com.liam.impossible.runtime.UtilityParticles;

public final class ImpossibleDifficultyClient implements ClientModInitializer {
    @Override public void onInitializeClient() {
        ClientPlayNetworking.registerGlobalReceiver(com.liam.impossible.runtime.EndermanGazePayload.TYPE,(payload,context)->EndermanCamera.receive(payload));
        net.minecraft.client.renderer.entity.EntityRenderers.register(com.liam.impossible.runtime.DragonCombat.TYPE,net.minecraft.client.renderer.entity.NoopRenderer::new);
        net.minecraft.client.renderer.entity.EntityRenderers.register(com.liam.impossible.runtime.DragonDeathEffect.TYPE,DragonDeathEffectRenderer::new);
        ParticleFactoryRegistry.getInstance().register(UtilityParticles.INVISIBLE,(options,level,x,y,z,dx,dy,dz,random)->null);
        ClientPlayNetworking.registerGlobalReceiver(ConfigPayload.TYPE,(payload,context)-> {
            if(context.client().screen instanceof SettingsScreen screen)screen.receive(payload);
        });
        if(Boolean.getBoolean("impossible.clientSmoke"))ClientSmoke.register();
    }
}
