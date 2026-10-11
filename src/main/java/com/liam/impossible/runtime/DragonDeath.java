package com.liam.impossible.runtime;

import com.liam.impossible.mixin.DisplayAccessor;
import com.mojang.math.Transformation;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.*;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.*;
import org.joml.Matrix4f;
import java.util.*;

/** Saved flight to the exit portal, followed by 200 ticks of vanilla death effects in the air. */
public final class DragonDeath {
    private static final String DATA="impossible_death",TAG="impossible.dragon.dying",BONE="aj.impossible_dragon.bone.";
    static final int DURATION=200;
    private record Pose(Transformation start,Transformation open,Transformation flap){}
    private static final Map<Entity,Map<Display,Pose>> POSES=new IdentityHashMap<>();
    private static final Map<Entity,DragonDeathEffect> EFFECTS=new IdentityHashMap<>();
    private static final Map<Entity,Vec3> CENTERS=new IdentityHashMap<>();
    private static final Set<Entity> ACTIVE=Collections.newSetFromMap(new IdentityHashMap<>());
    public static boolean isDying(Entity entity){return entity!=null&&entity.getTags().contains(TAG);}
    static int flightTicks(Entity root){return AnimationData.customData(root).getCompoundOrEmpty(DATA).getIntOr("flight_ticks",60);}
    public static boolean handle(Frame frame) throws Exception {
        Entity root=frame.source().getEntity();if(root==null||!DragonCombat.isDragon(root)||root.isRemoved())return false;
        var health=Native.scoreInfo(frame,"@s","mcm.its.dragon.health");var heads=Native.scoreInfo(frame,"@s","mcm.its.dragon.head_count");
        var activity=Native.scoreInfo(frame,"@s","mcm.its.dragon.activity");
        if(!isDying(root)&&DragonLifecycle.transitioning(frame))return false;
        if(!isDying(root)&&(activity==null||activity.value()!=15)&&(health==null||health.value()>0||heads==null||heads.value()!=1))return false;
        begin(frame);tick(frame);return true;
    }
    public static void beginIfDead(Frame frame) throws Exception {
        Entity root=frame.source().getEntity();if(root==null||!DragonCombat.isDragon(root))return;
        var health=Native.scoreInfo(frame,"@s","mcm.its.dragon.health");var heads=Native.scoreInfo(frame,"@s","mcm.its.dragon.head_count");
        if(health!=null&&health.value()<=0&&heads!=null&&heads.value()==1&&!DragonLifecycle.transitioning(frame))begin(frame);
    }
    private static Frame at(Frame frame,Entity root){return frame.with(frame.source().withPosition(root.position()).withRotation(root.getRotationVector()));}
    private static String bone(Entity entity){return entity.getTags().stream().filter(t->t.startsWith(BONE)).map(t->t.substring(BONE.length())).findFirst().orElse(null);}
    private static Transformation snapshot(Display display){
        var result=new Transformation(new Matrix4f(DisplayAccessor.impossible$transform(display.getEntityData()).getMatrix()));
        result.getTranslation();result.getLeftRotation();result.getScale();result.getRightRotation();return result;
    }
    private static void begin(Frame frame) throws Exception {
        Entity root=frame.source().getEntity();frame=at(frame,root);
        if(!ACTIVE.add(root))return;
        root.addTag(TAG);root.addTag("mcm.its.dragon.invulnerable");
        DragonCombat.remove(root);DragonAttacks.cancel(frame);
        for(String tag:List.copyOf(root.getTags()))if(tag.startsWith("mcm.its.dragon.initiate_")||tag.endsWith(".playing"))root.removeTag(tag);
        CompoundTag all=AnimationData.customData(root),data=all.getCompoundOrEmpty(DATA).copy();
        boolean fresh=data.getIntOr("version",0)!=3;
        if(fresh&&data.getIntOr("version",0)==2)applyFly(frame,3);
        if(fresh){
            data=new CompoundTag();data.putInt("version",3);
            data.putDouble("x",root.getX());data.putDouble("y",root.getY());data.putDouble("z",root.getZ());
            data.putFloat("yaw",root.getYRot());data.putFloat("pitch",root.getXRot());
            var centers=Native.entities(frame,"@e[type=marker,tag=mcm.its.dragon_environment.exit_portal_center,sort=nearest,limit=1]");
            ServerLevel level=(ServerLevel)root.level();
            Vec3 portal=centers.isEmpty()?new Vec3(0,level.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,0,0),0):centers.getFirst().position();
            Vec3 end=portal.add(0,20,0);level.getChunk(net.minecraft.core.BlockPos.containing(end));
            data.putDouble("target_x",end.x);data.putDouble("target_y",end.y);data.putDouble("target_z",end.z);
            data.putDouble("portal_y",portal.y);
            data.putInt("flight_ticks",Math.max(60,(int)Math.ceil(root.position().distanceTo(end)*1.875/1.2)));
            Vec3 direction=end.subtract(root.position());
            data.putFloat("target_yaw",direction.horizontalDistance()<1?root.getYRot():(float)Math.toDegrees(Math.atan2(-direction.x,direction.z)));
            CompoundTag saved=new CompoundTag();
            for(Entity passenger:root.getPassengers())if(passenger instanceof Display display&&bone(display)!=null)
                saved.put(bone(display),Transformation.CODEC.encodeStart(NbtOps.INSTANCE,snapshot(display)).getOrThrow());
            data.put("poses",saved);Native.setScore(frame,"@s","mcm.its.dragon.activity.timer",0);
        }
        Native.setScore(frame,"@s","mcm.its.dragon.damaged_cd",0);
        Logic.call(frame,"animated_java:impossible_dragon/variants/default/apply");
        Logic.call(frame,"animated_java:impossible_dragon/variants/eyes_closed/apply");
        Logic.call(frame,"animated_java:impossible_dragon/variants/1_head/apply");
        if(DragonLifecycle.score(frame,"has_tail",1)==0)Logic.call(frame,"animated_java:impossible_dragon/variants/tail_disabled/apply");
        applyFly(frame,3);Map<Display,Transformation> open=new LinkedHashMap<>();
        for(Entity passenger:root.getPassengers())if(passenger instanceof Display display&&bone(display)!=null)open.put(display,snapshot(display));
        CENTERS.put(root,DragonGeometry.boxes(root,Vec3.ZERO,Vec2.ZERO).stream().filter(b->b.bone().equals("body")).map(b->b.bounds().getCenter()).findFirst().orElse(new Vec3(0,2,0)));
        applyFly(frame,13);Map<Display,Pose> poses=new LinkedHashMap<>();var saved=data.getCompoundOrEmpty("poses");
        for(var entry:open.entrySet()){
            Display display=entry.getKey();Transformation start=Transformation.CODEC.parse(NbtOps.INSTANCE,saved.getCompoundOrEmpty(bone(display))).result().orElse(entry.getValue());
            poses.put(display,new Pose(start,entry.getValue(),snapshot(display)));
            display.setPosRotInterpolationDuration(2);display.setTransformationInterpolationDuration(2);display.setTransformationInterpolationDelay(0);
        }
        POSES.put(root,poses);all.put(DATA,data);root.setComponent(DataComponents.CUSTOM_DATA,CustomData.of(all));
        Native.setScore(frame,"@s","mcm.its.dragon.activity",15);Native.setScore(frame,"@s","mcm.its.dragon.sub_activity",2);
        Native.setScore(frame,"@s","mcm.its.dragon.flight_speed",-1);
        if(root instanceof Display display)display.setPosRotInterpolationDuration(2);
        CrystalShields.sync(frame);Native.bossbar(frame,"set","minecraft:impossible_dragon","value","0");
        pose(root,DragonLifecycle.score(frame,"activity.timer",0));
        DragonDeathEffect effect=new DragonDeathEffect(DragonDeathEffect.TYPE,root.level());effect.owner=root;
        effect.setPos(root.position());((ServerLevel)root.level()).addFreshEntity(effect);EFFECTS.put(root,effect);
    }
    private static void applyFly(Frame frame,int index){
        Logic.call(frame,"animated_java:impossible_dragon/animations/fly/apply_frame","{frame:0}");
        Logic.call(frame,"animated_java:impossible_dragon/animations/fly/apply_frame","{frame:"+index+"}");
    }
    private static void pose(Entity root,int age){
        int travel=flightTicks(root);
        float flap=(float)((1-Math.cos(age*Math.PI/20))/2*(1-smooth((age-travel+20)/20.0)));
        for(var entry:POSES.get(root).entrySet()){
            var pose=entry.getValue();Transformation flying=pose.open().slerp(pose.flap(),flap);
            entry.getKey().setTransformation(pose.start().slerp(flying,(float)smooth(age/20.0)));
            entry.getKey().setTransformationInterpolationDuration(2);entry.getKey().setTransformationInterpolationDelay(0);
        }
    }
    private static void tick(Frame frame) throws Exception {
        Entity root=frame.source().getEntity();ServerLevel level=(ServerLevel)root.level();
        int age=DragonLifecycle.score(frame,"activity.timer",0),travel=flightTicks(root),death=age-travel;
        CompoundTag data=AnimationData.customData(root).getCompoundOrEmpty(DATA);
        Vec3 start=new Vec3(data.getDoubleOr("x",root.getX()),data.getDoubleOr("y",root.getY()),data.getDoubleOr("z",root.getZ()));
        Vec3 end=new Vec3(data.getDoubleOr("target_x",root.getX()),data.getDoubleOr("target_y",root.getY()),data.getDoubleOr("target_z",root.getZ()));
        Vec3 position=age<travel?start.lerp(end,smooth(age/(double)travel)):end.add(0,Math.max(0,death)*.1,0);
        float yaw=Mth.rotLerp((float)smooth(age/(double)travel),data.getFloatOr("yaw",0),data.getFloatOr("target_yaw",0));
        float pitch=(float)(data.getFloatOr("pitch",0)*(1-smooth(age/40.0)));
        root.teleportTo(level,position.x,position.y,position.z,Set.of(),yaw,pitch,true);frame=at(frame,root);pose(root,age);
        Control.run(frame,c->Native.tp(c,"@s","~","~","~","~","~"),Control.on("passengers"));
        DragonDeathEffect effect=EFFECTS.get(root);effect.setPos(root.position().add(CENTERS.get(root).yRot(-yaw*(float)Math.PI/180)));effect.deathAge(Math.max(0,death+1));
        if(death==0)Native.playsound(frame,"minecraft:entity.ender_dragon.death","master","@a","~","~","~","2","1");
        if(death>=179){
            var random=level.getRandom();level.sendParticles(ParticleTypes.EXPLOSION_EMITTER,true,true,
                effect.getX()+(random.nextFloat()-.5)*8,effect.getY()+(random.nextFloat()-.5)*4,effect.getZ()+(random.nextFloat()-.5)*8,1,0,0,0,0);
        }
        Native.setScore(frame,"@s","mcm.its.dragon.activity.timer",age+1);
        if(death+1>=DURATION){
            DragonAttacks.cancel(frame);Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/zzz/345");
            Native.bossbar(frame,"set","minecraft:impossible_dragon","visible","false");
        }
    }
    private static double smooth(double t){t=Math.clamp(t,0,1);return t*t*t*(10+t*(-15+6*t));}
    public static void remove(Entity root){POSES.remove(root);CENTERS.remove(root);ACTIVE.remove(root);DragonDeathEffect effect=EFFECTS.remove(root);if(effect!=null)effect.discard();}
    public static void stopped(MinecraftServer server){for(Entity root:List.copyOf(ACTIVE))if(root.level().getServer()==server)remove(root);}
}
