package com.liam.impossible.runtime;

import com.google.gson.*;
import com.liam.impossible.mixin.DisplayAccessor;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.*;
import net.minecraft.world.phys.*;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

/** Bounds come from the same models, variants and bone matrices used by the client renderer. */
public final class DragonGeometry {
    public record Box(String bone,String part,AABB bounds){}
    private record Model(List<Vector3f> points,Matrix4f context){}
    private static final Map<String,Model> MODELS=new HashMap<>();
    private static final TreeMap<Integer,String> MODELS_BY_NUMBER=new TreeMap<>();
    public static void preload(){
        if(!MODELS_BY_NUMBER.isEmpty())return;
        for(JsonElement element:json("minecraft/items/tripwire_hook.json").getAsJsonObject("model").getAsJsonArray("entries")){
            JsonObject entry=element.getAsJsonObject(),m=entry.getAsJsonObject("model");
            if(m.has("model"))MODELS_BY_NUMBER.put(entry.get("threshold").getAsInt(),m.get("model").getAsString());
        }
        for(String id:MODELS_BY_NUMBER.values())if(id.contains("impossible_dragon/"))model(id);
    }
    private static JsonObject json(String path){
        try(var stream=DragonGeometry.class.getResourceAsStream("/assets/"+path)){
            if(stream==null)throw new IllegalArgumentException("Missing dragon geometry: "+path);
            return JsonParser.parseReader(new InputStreamReader(stream,StandardCharsets.UTF_8)).getAsJsonObject();
        }catch(IOException error){throw new UncheckedIOException(error);}
    }
    private static Model model(String id){
        Model cached=MODELS.get(id);if(cached!=null)return cached;
        String[] name=id.split(":",2);JsonObject file=json(name[0]+"/models/"+name[1]+".json");
        Model parent=file.has("parent")?model(file.get("parent").getAsString()):new Model(List.of(),new Matrix4f().rotateY((float)Math.PI));
        Matrix4f context=new Matrix4f(parent.context());
        if(file.has("display")&&file.getAsJsonObject("display").has("head")){
            JsonObject head=file.getAsJsonObject("display").getAsJsonObject("head");
            Vector3f translate=vector(head,"translation",new Vector3f()).div(16);
            Vector3f rotate=vector(head,"rotation",new Vector3f()).mul((float)Math.PI/180);
            context=new Matrix4f().rotateY((float)Math.PI).translate(translate).rotateXYZ(rotate.x,rotate.y,rotate.z).scale(vector(head,"scale",new Vector3f(1)));
        }
        boolean transparent=file.has("textures")&&file.getAsJsonObject("textures").entrySet().stream().anyMatch(e->e.getValue().getAsString().endsWith("impossible_dragon/transparent"));
        List<Vector3f> points=new ArrayList<>();
        if(!transparent){
            if(file.has("elements"))for(JsonElement element:file.getAsJsonArray("elements")){
                JsonObject cube=element.getAsJsonObject();Vector3f from=vector(cube,"from",new Vector3f()).div(16),to=vector(cube,"to",new Vector3f()).div(16);
                Matrix4f rotation=new Matrix4f();
                if(cube.has("rotation")){
                    JsonObject r=cube.getAsJsonObject("rotation");Vector3f pivot=vector(r,"origin",new Vector3f()).div(16);
                    float angle=r.get("angle").getAsFloat()*(float)Math.PI/180;
                    String axis=r.get("axis").getAsString();rotation.translate(pivot);
                    switch(axis){case "x"->rotation.rotateX(angle);case "y"->rotation.rotateY(angle);case "z"->rotation.rotateZ(angle);default->throw new IllegalArgumentException(axis);}
                    if(r.has("rescale")&&r.get("rescale").getAsBoolean()){
                        float scale=1/(float)Math.cos(angle);rotation.scale(axis.equals("x")?1:scale,axis.equals("y")?1:scale,axis.equals("z")?1:scale);
                    }
                    rotation.translate(new Vector3f(pivot).negate());
                }
                for(int corner=0;corner<8;corner++){
                    Vector3f point=new Vector3f((corner&1)==0?from.x:to.x,(corner&2)==0?from.y:to.y,(corner&4)==0?from.z:to.z);
                    rotation.transformPosition(point);point.sub(.5f,.5f,.5f);points.add(point);
                }
            }else points.addAll(parent.points());
        }
        Model result=new Model(List.copyOf(points),context);MODELS.put(id,result);return result;
    }
    private static Vector3f vector(JsonObject object,String key,Vector3f fallback){
        if(!object.has(key))return fallback;JsonArray a=object.getAsJsonArray(key);return new Vector3f(a.get(0).getAsFloat(),a.get(1).getAsFloat(),a.get(2).getAsFloat());
    }
    public static List<Box> boxes(Entity root,Vec3 position,Vec2 angles){
        preload();
        List<Box> result=new ArrayList<>();
        Matrix4f orientation=new Matrix4f().rotateY(-angles.y*(float)Math.PI/180).rotateX(angles.x*(float)Math.PI/180);
        for(Entity passenger:root.getPassengers())if(passenger instanceof Display.ItemDisplay display){
            String bone=display.getTags().stream().filter(t->t.startsWith("aj.impossible_dragon.bone.")).map(t->t.substring("aj.impossible_dragon.bone.".length())).findFirst().orElse(null);
            if(bone==null||bone.startsWith("stun_vfx")||bone.equals("tail_end_hitbox"))continue;
            var cmd=display.getItemStack().get(DataComponents.CUSTOM_MODEL_DATA);Float number=cmd==null?null:cmd.getFloat(0);
            if(number==null)continue;
            var entry=MODELS_BY_NUMBER.floorEntry(number.intValue());
            if(entry==null||!entry.getValue().contains("impossible_dragon/"))continue;
            Model model=model(entry.getValue());if(model.points().isEmpty())continue;
            Matrix4f matrix=new Matrix4f(orientation).mul(DisplayAccessor.impossible$transform(display.getEntityData()).getMatrix()).mul(model.context());
            double minX=Double.POSITIVE_INFINITY,minY=minX,minZ=minX,maxX=-minX,maxY=maxX,maxZ=maxX;
            Vector3f point=new Vector3f();
            for(Vector3f vertex:model.points()){
                matrix.transformPosition(vertex,point);
                minX=Math.min(minX,point.x);minY=Math.min(minY,point.y);minZ=Math.min(minZ,point.z);
                maxX=Math.max(maxX,point.x);maxY=Math.max(maxY,point.y);maxZ=Math.max(maxZ,point.z);
            }
            if(Math.max(Math.max(maxX-minX,maxY-minY),maxZ-minZ)<.025)continue;
            String part=bone.equals("tail_end")?"tail":bone.contains("left")&&(bone.startsWith("head_")||bone.startsWith("jaw_")||bone.startsWith("spine_")||bone.contains("feather"))?"head.left":bone.contains("right")&&(bone.startsWith("head_")||bone.startsWith("jaw_")||bone.startsWith("spine_")||bone.contains("feather"))?"head.right":bone.contains("middle")?"head.middle":"body";
            // Neck and feathers are named by the head first (spine_left, left_feathers, etc.).
            if(bone.startsWith("middle_feather"))part="head.middle";
            if(bone.startsWith("left_feather"))part="head.left";
            if(bone.startsWith("right_feather"))part="head.right";
            result.add(new Box(bone,part,new AABB(minX,minY,minZ,maxX,maxY,maxZ).inflate(.08).move(position)));
        }
        return result;
    }
}
