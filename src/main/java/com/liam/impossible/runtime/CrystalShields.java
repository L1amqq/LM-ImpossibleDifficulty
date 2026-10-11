package com.liam.impossible.runtime;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import java.util.*;

/** Keep the crystal's physical cage and visual field in the same healing-window state. */
public final class CrystalShields {
    private static final Map<Entity,Entity> OPEN=new IdentityHashMap<>();
    private static final Set<Entity> FINISHED=Collections.newSetFromMap(new IdentityHashMap<>());
    private static Frame at(Entity entity){return new Frame(entity.level().getServer().createCommandSourceStack().withEntity(entity).withLevel((net.minecraft.server.level.ServerLevel)entity.level()).withPosition(entity.position()).withRotation(entity.getRotationVector()));}
    public static void hide(Frame marker) throws Exception {
        Native.fill(marker,"~-1","~-2","~-1","~1","~4","~1","air","replace","barrier");
        Logic.call(marker,"impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/deactivate");
    }
    public static void sync(Frame frame) throws Exception {
        Entity root=frame.source().getEntity();if(root==null||root.isRemoved()||!DragonCombat.isDragon(root))return;
        int activity=score(frame,"activity"),sub=score(frame,"sub_activity"),timer=score(frame,"activity.timer");
        if(activity==15){
            if(FINISHED.add(root)){
                OPEN.remove(root);
                for(Entity marker:Native.entities(frame,"@e[type=marker,tag=mcm.its.dragon_environment.end_crystal]")){
                    marker.removeTag("mcm.its.dragon_environment.end_crystal.invulnerable");hide(at(marker));
                }
                Native.kill(frame,"@e[tag=mcm.its.dragon.force_field.component]");
            }
            return;
        }
        int difficulty=score(frame,"attack_difficulty"),close=difficulty<=1?103:difficulty==2?83:63;
        if(activity==5&&sub==3&&timer>=20&&timer<close){
            Frame nearest=frame.with(frame.source().withPosition(Native.position(frame,new String[]{"^","^","^-20"},0)));
            var candidates=Native.entities(nearest,"@n[type=marker,tag=mcm.its.dragon_environment.end_crystal]");
            if(!candidates.isEmpty()){
                Entity marker=candidates.getFirst();
                if(OPEN.get(root)!=marker||marker.getTags().contains("mcm.its.dragon_environment.end_crystal.invulnerable")){
                    close(root);OPEN.put(root,marker);
                    marker.removeTag("mcm.its.dragon_environment.end_crystal.invulnerable");hide(at(marker));
                }
            }
        }else close(root);
    }
    private static void close(Entity root){
        Entity marker=OPEN.remove(root);
        if(marker!=null&&!marker.isRemoved()&&!marker.getTags().contains("mcm.its.dragon_environment.end_crystal.destroyed")&&!marker.getTags().contains("mcm.its.dragon_environment.end_crystal.invulnerable")){
            Logic.call(at(marker),"impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/make_invulnerable");
            Logic.call(at(marker),"impossible_to_survive:mobs/impossible_dragon/environment/end_crystal/force_field/activate");
        }
    }
    private static int score(Frame frame,String name) throws Exception {var value=Native.scoreInfo(frame,"@s","mcm.its.dragon."+name);return value==null?Integer.MIN_VALUE:value.value();}
    public static void remove(Entity root){close(root);FINISHED.remove(root);}
    public static void stopped(MinecraftServer server){OPEN.keySet().removeIf(e->e.level().getServer()==server);FINISHED.removeIf(e->e.level().getServer()==server);}
}
