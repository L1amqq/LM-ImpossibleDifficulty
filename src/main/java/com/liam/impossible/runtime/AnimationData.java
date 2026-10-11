package com.liam.impossible.runtime;

import com.mojang.math.Transformation;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.component.*;
import java.util.*;

/** Apply animation-only fields directly; unrelated entity data continues through the normal codec. */
public final class AnimationData {
    private record Pose(Transformation transform,Integer delay,Integer duration){}
    private static final Map<String,Pose> POSES=new LinkedHashMap<>(256,.75f,true){
        @Override protected boolean removeEldestEntry(Map.Entry<String,Pose> entry){return size()>8192;}
    };
    private static final Set<String> POSE_KEYS=Set.of("transformation","start_interpolation","interpolation_duration");
    static long poseApplications,modelApplications,dataAccesses;
    public static Integer apply(Frame frame,String[] args) throws Exception {
        if(args[0].equals("merge")&&args.length==4&&args[1].equals("entity")){
            if(!args[3].contains("transformation"))return null;
            Pose pose=POSES.get(args[3]);
            if(pose==null){
                CompoundTag tag=Native.compound(args[3]);
                if(!POSE_KEYS.containsAll(tag.keySet())||!(tag.get("transformation") instanceof ListTag matrix)||matrix.size()!=16)return null;
                var transform=Transformation.EXTENDED_CODEC.parse(NbtOps.INSTANCE,matrix).getOrThrow();
                // Decompose once, rather than performing matrix SVD on every bone of every tick.
                transform.getTranslation();transform.getLeftRotation();transform.getScale();transform.getRightRotation();
                pose=new Pose(transform,tag.contains("start_interpolation")?tag.getIntOr("start_interpolation",0):null,
                    tag.contains("interpolation_duration")?tag.getIntOr("interpolation_duration",0):null);
                POSES.put(args[3],pose);
            }
            Entity entity=Native.entity(frame,args[2]);if(!(entity instanceof Display display))return null;
            display.setTransformation(pose.transform());
            if(pose.duration()!=null)display.setTransformationInterpolationDuration(pose.duration());
            display.setTransformationInterpolationDelay(pose.delay()==null?0:pose.delay());
            poseApplications++;return Logic.result(1,true);
        }
        if(args.length==7&&args[0].equals("modify")&&args[1].equals("entity")&&args[3].equals("item.components.minecraft:custom_model_data")&&args[4].equals("set")&&args[5].equals("value")){
            Entity entity=Native.entity(frame,args[2]);
            if(!(entity instanceof Display.ItemDisplay display)||display.getItemStack().isEmpty())return null;
            Tag value=Native.tagValue(args[6]);if(!(value instanceof NumericTag number))return null;
            var item=display.getItemStack().copy();
            item.set(DataComponents.CUSTOM_MODEL_DATA,new CustomModelData(List.of(number.floatValue()),List.of(),List.of(),List.of()));
            display.setItemStack(item);modelApplications++;return Logic.result(1,true);
        }
        return null;
    }
    public static Native.Target target(Entity entity,String field,int next){
        if(entity instanceof Marker&&entity.getTags().contains("aj.rig_entity")&&(field.equals("data")||field.startsWith("data.")||field.startsWith("data["))){
            CompoundTag tag=new CompoundTag();tag.put("data",customData(entity));dataAccesses++;
            return new Native.Target(tag,value->entity.setComponent(DataComponents.CUSTOM_DATA,CustomData.of(value.getCompoundOrEmpty("data"))),next);
        }
        if(entity instanceof Display display&&(field.equals("interpolation_duration")||field.equals("start_interpolation"))){
            CompoundTag tag=new CompoundTag();tag.putInt(field,field.equals("interpolation_duration")?display.getTransformationInterpolationDuration():display.getTransformationInterpolationDelay());
            return new Native.Target(tag,value->{int n=value.getIntOr(field,0);if(field.equals("interpolation_duration"))display.setTransformationInterpolationDuration(n);else display.setTransformationInterpolationDelay(n);},next);
        }
        return null;
    }
    public static CompoundTag customData(Entity entity){var data=entity.get(DataComponents.CUSTOM_DATA);return data==null?new CompoundTag():data.copyTag();}
}
