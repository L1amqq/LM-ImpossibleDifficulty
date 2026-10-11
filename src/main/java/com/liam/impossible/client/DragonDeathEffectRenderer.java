package com.liam.impossible.client;

import com.liam.impossible.mixin.EnderDragonDeathRaysInvoker;
import com.liam.impossible.runtime.DragonDeathEffect;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.CameraRenderState;

/** Uses Minecraft's actual death-ray geometry and both vanilla render passes. */
public final class DragonDeathEffectRenderer extends EntityRenderer<DragonDeathEffect,DragonDeathEffectRenderer.State> {
    static int worldSubmissions;
    public static final class State extends EntityRenderState {public float progress;}
    public DragonDeathEffectRenderer(EntityRendererProvider.Context context){super(context);}
    @Override public State createRenderState(){return new State();}
    @Override public void extractRenderState(DragonDeathEffect entity,State state,float partial){
        super.extractRenderState(entity,state,partial);state.progress=entity.deathAge()>0?Math.min(1,(entity.deathAge()+partial)/200f):0;
    }
    @Override protected boolean affectedByCulling(DragonDeathEffect entity){return false;}
    @Override public void submit(State state,PoseStack poses,SubmitNodeCollector collector,CameraRenderState camera){
        if(state.progress<=0)return;
        if(Boolean.getBoolean("impossible.clientSmoke")&&net.minecraft.client.Minecraft.getInstance().level!=null)worldSubmissions++;
        EnderDragonDeathRaysInvoker.impossible$submitRays(poses,state.progress,collector,RenderTypes.dragonRays());
        EnderDragonDeathRaysInvoker.impossible$submitRays(poses,state.progress,collector,RenderTypes.dragonRaysDepth());
    }
}
