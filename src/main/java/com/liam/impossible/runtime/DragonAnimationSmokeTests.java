package com.liam.impossible.runtime;

import net.minecraft.world.entity.*;
import net.minecraft.nbt.*;
import com.liam.impossible.mixin.DisplayAccessor;
import org.slf4j.LoggerFactory;

final class DragonAnimationSmokeTests {
    static int run(Frame origin,Entity root) throws Exception {
        int passed=0;
        Display.ItemDisplay bone=(Display.ItemDisplay)root.getPassengers().stream().filter(e->e.getTags().contains("aj.impossible_dragon.bone.body")).findFirst().orElseThrow();
        Frame frame=origin.with(origin.source().withEntity(bone).withPosition(bone.position()));
        CompoundTag saved=Native.entityData(bone);
        String pose="{transformation:[1f,0f,0f,2f,0f,0.8f,-0.6f,3f,0f,0.6f,0.8f,4f,0f,0f,0f,1f],start_interpolation:0,interpolation_duration:7}";
        try {
            CompoundTag legacy=saved.copy().merge(Native.compound(pose));Native.writeEntity(bone,legacy);
            CompoundTag expected=Native.entityData(bone);
            Native.writeEntity(bone,saved);
            Native.data(frame,"merge","entity","@s",pose);
            check(expected.equals(Native.entityData(bone)),"fast bone pose matches complete vanilla NBT load including unrelated fields");passed++;
            check(bone.getTransformationInterpolationDuration()==7&&bone.getTransformationInterpolationDelay()==0,"pose retains interpolation timing");passed++;
            var transform=DisplayAccessor.impossible$transform(bone.getEntityData()).getMatrix();
            Native.data(frame,"modify","entity","@s","item.components.minecraft:custom_model_data","set","value","209");
            check(transform.equals(DisplayAccessor.impossible$transform(bone.getEntityData()).getMatrix()),"variant change preserves the animated transform");passed++;
            Native.data(frame,"modify","entity","@s","interpolation_duration","set","value","4");
            check(bone.getTransformationInterpolationDuration()==4,"direct tween duration update reaches synchronized metadata");passed++;
            Entity marker=root.getPassengers().stream().filter(e->e.getTags().contains("aj.impossible_dragon.data")).findFirst().orElseThrow();
            Frame data=frame.with(frame.source().withEntity(marker));
            CompoundTag markerBefore=Native.entityData(marker);
            Native.data(data,"modify","entity","@s","data.native_animation_test","set","value","{frame:7}");
            check(AnimationData.customData(marker).getCompoundOrEmpty("native_animation_test").getIntOr("frame",0)==7,"direct marker writes retain custom animation data");passed++;
            Native.data(data,"remove","entity","@s","data.native_animation_test");
            check(markerBefore.equals(Native.entityData(marker)),"marker update preserves UUID, position, passengers and all other custom data");passed++;
            long models=AnimationData.modelApplications,poses=AnimationData.poseApplications,reads=AnimationData.dataAccesses;
            Frame context=origin.with(origin.source().withEntity(root).withPosition(root.position()));
            for(String variant:new String[]{"not_stunned","2_heads","1_head","not_stunned"})Logic.call(context,"animated_java:impossible_dragon/variants/"+variant+"/apply");
            for(String animation:new String[]{"fly","hover","stun_loop","recharge_crystals"})Logic.call(context,"animated_java:impossible_dragon/animations/"+animation+"/tween","{to_frame:3,duration:5}");
            check(AnimationData.modelApplications>models,"real phase variants use direct item component updates");passed++;
            check(AnimationData.poseApplications>poses+200,"real animation transitions use cached bone transforms");passed++;
            check(AnimationData.dataAccesses>reads,"real animation transitions read marker data without serializing entities");passed++;
            // Same pose and same bone; report timing, without making a noisy hardware-dependent assertion.
            for(int i=0;i<50;i++)Native.data(frame,"merge","entity","@s",pose);
            long start=System.nanoTime();for(int i=0;i<300;i++)Native.data(frame,"merge","entity","@s",pose);long direct=System.nanoTime()-start;
            start=System.nanoTime();for(int i=0;i<300;i++){var tag=Native.entityData(bone);tag.merge(Native.compound(pose));Native.writeEntity(bone,tag);}long old=System.nanoTime()-start;
            LoggerFactory.getLogger("impossible_difficulty").info("DRAGON_ANIMATION_TIMING: 300 bone poses, direct={} ms, full NBT={} ms",direct/1000000.0,old/1000000.0);
        }finally{Native.writeEntity(bone,saved);}
        LoggerFactory.getLogger("impossible_difficulty").info("DRAGON_ANIMATION_PASS: {} assertions",passed);return passed;
    }
    private static void check(boolean condition,String message){if(!condition)throw new IllegalStateException(message);}
}
