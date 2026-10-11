package com.liam.impossible.client;

import com.mojang.blaze3d.vertex.*;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.CameraRenderState;
import java.lang.reflect.*;

/** Executes the real vanilla custom-geometry callbacks, including the applied mixin invoker. */
final class DragonDeathRendererSmoke {
    static void verify(DragonDeathEffectRenderer renderer) throws Throwable {
        for(float progress:new float[]{0,.005f,.3f,.9f,.999f,1}){
            int[] counts={0,0};
            var consumer=(VertexConsumer)Proxy.newProxyInstance(VertexConsumer.class.getClassLoader(),new Class<?>[]{VertexConsumer.class},(proxy,method,args)->{
                if(method.isDefault())return InvocationHandler.invokeDefault(proxy,method,args);
                if(method.getName().equals("addVertex")){
                    for(Object value:args)if(value instanceof Float f&&!Float.isFinite(f))throw new IllegalStateException("Death-ray vertex is not finite");
                    counts[1]++;
                }
                return proxy;
            });
            var collector=(SubmitNodeCollector)Proxy.newProxyInstance(SubmitNodeCollector.class.getClassLoader(),new Class<?>[]{SubmitNodeCollector.class},(proxy,method,args)->{
                if(!method.getName().equals("submitCustomGeometry"))throw new IllegalStateException("Unexpected death render submission: "+method);
                if(args[1]!=(counts[0]==0?RenderTypes.dragonRays():RenderTypes.dragonRaysDepth()))throw new IllegalStateException("Wrong vanilla death-ray render pass");
                counts[0]++;
                PoseStack copy=new PoseStack();copy.mulPose(((PoseStack)args[0]).last().pose());
                ((SubmitNodeCollector.CustomGeometryRenderer)args[2]).render(copy.last(),consumer);return null;
            });
            var state=renderer.createRenderState();state.progress=progress;
            renderer.submit(state,new PoseStack(),collector,new CameraRenderState());
            int expected=(int)Math.floor((progress+progress*progress)/2*60)*18;
            if(counts[0]!=(progress>0?2:0)||counts[1]!=expected)throw new IllegalStateException("Vanilla death rays mismatch: "+progress+" / "+counts[1]+" / "+expected);
        }
        org.slf4j.LoggerFactory.getLogger("impossible_difficulty").info("CLIENT_DRAGON_DEATH_PASS: actual vanilla ray geometry, both render passes, six animation stages, finite vertices");
    }
}
