package com.liam.impossible.runtime;

import com.google.gson.*;
import com.liam.impossible.mixin.DisplayAccessor;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.*;
import net.minecraft.world.phys.Vec3;
import java.io.*;
import java.nio.file.*;
import java.util.*;

/** Live server geometry/model checks and pose samples for visual inspection. */
final class DragonDeathVisualChecks {
    private final Entity root;private float yaw;private Vec3 previous;
    private final NavigableMap<Integer,String> models=new TreeMap<>();
    private final JsonArray samples=new JsonArray();
    DragonDeathVisualChecks(Entity root) throws Exception {
        this.root=root;yaw=root.getYRot();previous=root.position();
        try(var stream=getClass().getResourceAsStream("/assets/minecraft/items/tripwire_hook.json")){
            for(var value:JsonParser.parseReader(new InputStreamReader(stream,java.nio.charset.StandardCharsets.UTF_8)).getAsJsonObject().getAsJsonObject("model").getAsJsonArray("entries")){
                var entry=value.getAsJsonObject();if(entry.getAsJsonObject("model").has("model"))models.put(entry.get("threshold").getAsInt(),entry.getAsJsonObject("model").get("model").getAsString());
            }
        }
    }
    private String model(Display.ItemDisplay display){
        var custom=display.getItemStack().get(DataComponents.CUSTOM_MODEL_DATA);Float id=custom==null?null:custom.getFloat(0);
        var entry=id==null?null:models.floorEntry(id.intValue());return entry==null?"":entry.getValue();
    }
    void checkModels(){
        boolean closed=false;
        for(Entity e:root.getPassengers())if(e instanceof Display.ItemDisplay display&&e.getTags().stream().anyMatch(tag->tag.startsWith("aj.impossible_dragon.bone."))){
            String model=model(display);
            check(!model.contains("/red/")&&!model.contains("/half_red/"),"death cannot retain a damage model: "+model);
            if(e.getTags().contains("aj.impossible_dragon.bone.head_middle"))closed=model.contains("/eyes_closed/");
        }
        check(closed,"visible head has closed eyes and the original body color");
    }
    void checkMotion(){
        check(root.position().distanceTo(previous)<3,"death movement has no teleport jump");
        check(Math.abs(net.minecraft.util.Mth.wrapDegrees(root.getYRot()-yaw))<6,"death turns smoothly toward the portal");
        for(Entity e:root.getPassengers())if(e instanceof Display display&&e.getTags().stream().anyMatch(t->t.startsWith("aj.impossible_dragon.bone."))){
            check(DisplayAccessor.impossible$transform(display.getEntityData()).getMatrix().isFinite(),"all death bone matrices remain finite");
            check(display.getTransformationInterpolationDuration()==2&&display.getPosRotInterpolationDuration()==2,"root and poses use consistent interpolation");
        }
        checkModels();previous=root.position();yaw=root.getYRot();
    }
    void capture(int age){
        var sample=new JsonObject();sample.addProperty("age",age);sample.addProperty("yaw",root.getYRot());sample.addProperty("pitch",root.getXRot());
        sample.add("position",new Gson().toJsonTree(new double[]{root.getX(),root.getY(),root.getZ()}));
        var bones=new JsonArray();
        for(Entity e:root.getPassengers())if(e instanceof Display.ItemDisplay display){
            String name=e.getTags().stream().filter(t->t.startsWith("aj.impossible_dragon.bone.")).findFirst().orElse(null);if(name==null)continue;
            var bone=new JsonObject();bone.addProperty("name",name.substring("aj.impossible_dragon.bone.".length()));bone.addProperty("model",model(display));
            bone.add("matrix",new Gson().toJsonTree(DisplayAccessor.impossible$transform(display.getEntityData()).getMatrix().get(new float[16])));bones.add(bone);
        }
        sample.add("bones",bones);samples.add(sample);
    }
    void save() throws Exception {
        Path project=Path.of(System.getProperty("impossible.smoke.resources")).getParent().getParent().getParent();
        Files.writeString(project.resolve("work/death-preview.json"),new GsonBuilder().setPrettyPrinting().create().toJson(samples));
    }
    private static void check(boolean condition,String message){if(!condition)throw new IllegalStateException(message);}
}
