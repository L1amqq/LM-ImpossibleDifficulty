package com.liam.impossible.runtime;

import com.mojang.authlib.GameProfile;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.protocol.game.*;
import net.minecraft.network.protocol.common.ClientboundCustomPayloadPacket;
import net.minecraft.server.level.*;
import net.minecraft.server.network.*;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.*;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.phys.*;
import org.slf4j.LoggerFactory;
import java.util.*;

/** Exercise real furnace cooking and player packets, rather than a synthetic marker alone. */
final class MechanicsFixSmokeTests {
    private record Fixture(ServerPlayer player,List<Packet<?>> packets){}
    private static Fixture player(Frame c,String name,Vec3 position){
        var profile=new GameProfile(UUID.randomUUID(),name);var server=c.source().getServer();var level=c.source().getLevel();
        var player=new ServerPlayer(server,level,profile,ClientInformation.createDefault());
        var packets=new ArrayList<Packet<?>>();
        var connection=new Connection(PacketFlow.SERVERBOUND){
            @Override public void send(Packet<?> packet,io.netty.channel.ChannelFutureListener listener,boolean flush){packets.add(packet);}
        };
        new ServerGamePacketListenerImpl(server,connection,player,CommonListenerCookie.createInitial(profile,false));
        player.setGameMode(GameType.SURVIVAL);player.addTag("survivor");player.snapTo(position.x,position.y,position.z,25,10);
        server.getPlayerList().getPlayers().add(player);level.addNewPlayer(player);
        player.connection.handleAcceptPlayerLoad(new ServerboundPlayerLoadedPacket());
        return new Fixture(player,packets);
    }
    private static Frame context(Frame c,Entity entity){return new Frame(c.source().withEntity(entity).withPosition(entity.position()).withRotation(entity.getRotationVector()));}
    static int run(Frame c) throws Exception {
        int passed=smoothing()+gaze(c)+smokers(c)+bossBars(c);
        LoggerFactory.getLogger("impossible_difficulty").info("MECHANICS_FIX_PASS: {} assertions; frame damping, gaze target packets/no teleports, real smoker cooking and smoke attacks, restored bitmap boss phases",passed);
        return passed;
    }
    private static int smoothing(){
        int passed=0;float previous=0;
        for(int fps:new int[]{30,60,144}){
            float yaw=0,pitch=0;
            for(int i=0;i<fps;i++){
                float next=ViewSmoothing.yaw(yaw,170,1f/fps);
                check(next>=yaw&&next-yaw<=300f/fps+.001,"yaw moves smoothly at "+fps+" FPS");passed++;
                yaw=next;pitch=ViewSmoothing.pitch(pitch,-65,1f/fps);
            }
            check(Math.abs(yaw-170)<.5&&Math.abs(pitch+65)<.1,"view converges within half a degree without snapping at "+fps+" FPS");passed++;
            if(previous!=0){check(Math.abs(previous-yaw)<.1,"turn response remains consistent across FPS");passed++;}previous=yaw;
        }
        check(ViewSmoothing.yaw(179,-179,1f/60)>179,"yaw takes short arc across 180 degrees");passed++;
        check(ViewSmoothing.yaw(0,170,1)<=20.001,"lag spike does not jump camera");passed++;
        check(ViewSmoothing.pitch(89,160,1)==90,"pitch stays in legal range");passed++;
        return passed;
    }
    private static int gaze(Frame c) throws Exception {
        var server=c.source().getServer();var level=c.source().getLevel();int passed=0;
        int disabled=Native.scoreInfo(c,"#global","disabled_endermen").value();
        var a=player(c,"GazeA",new Vec3(2,104,2));var b=player(c,"GazeB",new Vec3(14,104,2));
        var targets=new ArrayList<Entity>();
        try {
            Native.setScore(c,"#global","disabled_endermen",0);
            for(Vec3 point:List.of(new Vec3(8,104,2),new Vec3(14,104,6))){
                Entity target=EntityType.ENDERMAN.create(level,EntitySpawnReason.COMMAND);target.snapTo(point.x,point.y,point.z,0,0);
                target.addTag("native_gaze_test");((net.minecraft.world.entity.Mob)target).setNoAi(true);level.addFreshEntity(target);targets.add(target);
            }
            // A ray following the camera target must reach the eyes, at different heights,
            // while crouching and between movement ticks (the old target was the feet).
            Entity eyeTarget=targets.getFirst();
            for(Pose pose:new Pose[]{Pose.STANDING,Pose.CROUCHING})for(double height:new double[]{102,104,108}){
                a.player.setPose(pose);a.player.snapTo(2,height,2,25,10);
                a.player.setOldPosAndRot();eyeTarget.setOldPosAndRot();
                a.player.setPos(3,height,3);eyeTarget.setPos(8.5,104,2.5);
                for(float partial:new float[]{0,.5f,1}){
                    Vec2 angles=ViewSmoothing.targetAngles(a.player,eyeTarget,partial);
                    Vec3 eyes=a.player.getEyePosition(partial),targetEyes=eyeTarget.getEyePosition(partial);
                    Vec3 aimed=eyes.add(Vec3.directionFromRotation(angles.x,angles.y).scale(eyes.distanceTo(targetEyes)));
                    check(aimed.distanceTo(targetEyes)<.002,"gaze points to enderman eyes at height "+height+", pose "+pose+", partial "+partial);passed++;
                    float smoothedYaw=25,smoothedPitch=10;
                    for(int i=0;i<180;i++){smoothedYaw=ViewSmoothing.yaw(smoothedYaw,angles.y,1f/60);smoothedPitch=ViewSmoothing.pitch(smoothedPitch,angles.x,1f/60);}
                    Vec3 smoothed=eyes.add(Vec3.directionFromRotation(smoothedPitch,smoothedYaw).scale(eyes.distanceTo(targetEyes)));
                    check(smoothed.distanceTo(targetEyes)<.002,"smooth camera converges to the eyes without a pitch offset");passed++;
                }
            }
            a.player.setPose(Pose.STANDING);a.player.snapTo(2,104,2,25,10);eyeTarget.snapTo(8,104,2,0,0);
            check(ViewSmoothing.targetAngles(a.player,eyeTarget,1).x<0,"same-floor capture looks up at enderman eyes rather than down at its feet");passed++;
            Native.setScore(context(c,a.player),"@s","ender_look_cd",3);Native.setScore(context(c,b.player),"@s","ender_look_cd",3);
            a.packets.clear();b.packets.clear();Vec3 position=a.player.position();float yaw=a.player.getYRot(),pitch=a.player.getXRot();
            for(int tick=0;tick<20;tick++)Logic.call(context(c,a.player),"impossible_to_survive:mobs/enderman/look_lock");
            check(a.player.position().equals(position)&&a.player.getYRot()==yaw&&a.player.getXRot()==pitch,"server gaze leaves position and rotation untouched");passed++;
            check(a.packets.stream().noneMatch(packet->packet instanceof ClientboundPlayerPositionPacket||packet instanceof ClientboundPlayerRotationPacket),"gaze sends no camera teleport or snap packets");passed++;
            check(gazePackets(a).equals(List.of(targets.get(0).getId())),"gaze sends one throttled target sync");passed++;
            check(a.player.hasEffect(MobEffects.SLOWNESS)&&a.player.getEffect(MobEffects.SLOWNESS).getAmplifier()==3,"gaze retains slowness");passed++;
            check(b.packets.stream().noneMatch(packet->packet instanceof ClientboundCustomPayloadPacket custom&&custom.payload() instanceof EndermanGazePayload),"gaze does not capture another player's camera");passed++;
            Entity closer=EntityType.ENDERMAN.create(level,EntitySpawnReason.COMMAND);closer.snapTo(3,104,2,0,0);level.addFreshEntity(closer);targets.add(closer);
            Logic.call(context(c,a.player),"impossible_to_survive:mobs/enderman/look_lock");
            check(gazePackets(a).equals(List.of(targets.get(0).getId())),"another closer enderman does not change the captured target");passed++;
            Logic.call(context(c,b.player),"impossible_to_survive:mobs/enderman/look_lock");
            check(gazePackets(b).equals(List.of(targets.get(1).getId())),"second player gets their own target");passed++;
            targets.get(0).discard();EndermanGaze.tick(server);
            check(gazePackets(a).getLast()==-1,"target deletion releases camera");passed++;
            Native.setScore(c,"#global","disabled_endermen",1);EndermanGaze.tick(server);
            check(gazePackets(b).getLast()==-1,"config toggle releases camera immediately");passed++;
            int count=gazePackets(a).size();Logic.call(context(c,a.player),"impossible_to_survive:mobs/enderman/look_lock");
            check(gazePackets(a).size()==count,"disabled gaze cannot reactivate");passed++;
        }finally{
            Native.setScore(c,"#global","disabled_endermen",disabled);EndermanGaze.stopped(server);
            for(Entity target:targets)target.discard();
            for(var fixture:List.of(a,b)){server.getPlayerList().getPlayers().remove(fixture.player);fixture.player.discard();}
        }
        return passed;
    }
    private static List<Integer> gazePackets(Fixture fixture){
        return fixture.packets.stream().filter(packet->packet instanceof ClientboundCustomPayloadPacket custom&&custom.payload() instanceof EndermanGazePayload)
            .map(packet->((EndermanGazePayload)((ClientboundCustomPayloadPacket)packet).payload()).target()).toList();
    }
    private static int smokers(Frame c) throws Exception {
        var level=c.source().getLevel();var server=c.source().getServer();var pos=new BlockPos(8,99,8);var saved=level.getBlockState(pos);
        var fixture=player(c,"SmokerCheck",new Vec3(8.5,100,10.5));var player=fixture.player;
        int difficulty=Native.scoreInfo(c,"#global","mcm.its.overall_difficulty").value(),passed=0;
        try {
            for(int d=1;d<=3;d++)for(Direction facing:Direction.Plane.HORIZONTAL){
                Native.setScore(c,"#global","mcm.its.overall_difficulty",d);
                level.setBlock(pos,Blocks.SMOKER.defaultBlockState().setValue(SmokerBlock.FACING,facing),3);
                player.snapTo(8.5,100,10.5,0,0);player.setHealth(20);player.invulnerableTime=0;player.removeAllEffects();player.setItemSlot(EquipmentSlot.HEAD,ItemStack.EMPTY);
                net.fabricmc.fabric.api.event.player.UseBlockCallback.EVENT.invoker().interact(player,level,InteractionHand.MAIN_HAND,new BlockHitResult(Vec3.atCenterOf(pos),Direction.UP,pos,false));
                Frame origin=new Frame(c.source().withPosition(Vec3.atCenterOf(pos)));
                Entity marker=Native.entity(origin,"@e[type=marker,tag=smoker_marker,distance=..0.1,limit=1]");Frame context=context(c,marker);
                check(Smokers.track(level,pos)==0,"interacting with smoker does not duplicate marker");passed++;
                Logic.call(context,"impossible_to_survive:features/smoker/loop_1t");
                check(player.getHealth()==20&&!player.hasEffect(MobEffects.WITHER),"unlit smoker causes no damage");passed++;
                var smoker=(SmokerBlockEntity)level.getBlockEntity(pos);
                smoker.setItem(0,new ItemStack(Items.BEEF));smoker.setItem(1,new ItemStack(Items.COAL));
                AbstractFurnaceBlockEntity.serverTick(level,pos,level.getBlockState(pos),smoker);
                check(level.getBlockState(pos).getValue(SmokerBlock.LIT)&&Native.data(context,"get","block","~","~","~","BurnTime")>0,"real cooking exposes old BurnTime from new lit_time_remaining");passed++;
                check(Native.data(context,"get","block","~","~","~","CookTime")>0,"real cooking progress exposes compatible timer");passed++;
                fixture.packets.clear();Logic.call(context,"impossible_to_survive:features/smoker/loop_1t");
                check(player.hasEffect(MobEffects.WITHER)&&player.getEffect(MobEffects.WITHER).getAmplifier()==4&&player.hasEffect(MobEffects.BLINDNESS),"burning smoker applies original effects");passed++;
                check(Math.abs(player.getHealth()-(20-d))<.01,"smoker damage follows difficulty "+d+", actual health="+player.getHealth());passed++;
                check(fixture.packets.stream().anyMatch(packet->packet instanceof ClientboundLevelParticlesPacket particles&&particles.getParticle().getType()==net.minecraft.core.particles.ParticleTypes.LARGE_SMOKE),"smoker sends smoke to nearby players");passed++;
                player.removeAllEffects();player.setHealth(20);player.invulnerableTime=0;player.setItemSlot(EquipmentSlot.HEAD,new ItemStack(Items.CARVED_PUMPKIN));
                for(int tick=0;tick<10;tick++)Logic.call(context,"impossible_to_survive:features/smoker/loop_1t");
                check(player.getHealth()==20&&!player.hasEffect(MobEffects.WITHER)&&!player.hasEffect(MobEffects.BLINDNESS),"pumpkin protects from smoker damage and debuffs");passed++;
                check(!Native.entities(context,"@e[type=bat,tag=smoker_trail,distance=..2]").isEmpty(),"smoker emits moving smoke trails");passed++;
                player.setItemSlot(EquipmentSlot.HEAD,ItemStack.EMPTY);player.snapTo(8.5,100,15.5,0,0);
                Logic.call(context,"impossible_to_survive:features/smoker/loop_1t");
                check(player.getHealth()==20&&!player.hasEffect(MobEffects.WITHER),"player outside five blocks is not harmed");passed++;
                Native.data(context,"modify","block","~","~","~","lit_time_remaining","set","value","0s");
                check(Native.data(context,"get","block","~","~","~","BurnTime")==0,"modern timer writes are not overwritten by compatibility view");passed++;
                player.snapTo(8.5,100,10.5,0,0);Logic.call(context,"impossible_to_survive:features/smoker/loop_1t");
                check(player.getHealth()==20&&!player.hasEffect(MobEffects.WITHER),"expired fuel stops attack");passed++;
                Native.data(context,"modify","block","~","~","~","BurnTime","set","value","30s");
                check(Native.data(context,"get","block","~","~","~","lit_time_remaining")==30,"legacy timer writes reach modern furnace field");passed++;
                level.setBlock(pos,Blocks.AIR.defaultBlockState(),3);Logic.call(context,"impossible_to_survive:features/smoker/loop_1t");
                check(marker.isRemoved(),"broken smoker removes its marker");passed++;
                for(Entity trail:Native.entities(c,"@e[type=bat,tag=smoker_trail]")){
                    for(int tick=0;tick<40;tick++)Logic.call(context(c,trail),"impossible_to_survive:features/smoker/trail_loop");
                    check(!trail.isAlive(),"smoke trail has bounded lifetime");passed++;trail.discard();
                }
            }
        }finally{
            Native.setScore(c,"#global","mcm.its.overall_difficulty",difficulty);level.setBlock(pos,saved,3);
            Native.kill(c,"@e[tag=smoker_marker]");Native.kill(c,"@e[tag=smoker_trail]");server.getPlayerList().getPlayers().remove(player);player.discard();
        }
        return passed;
    }
    private static int bossBars(Frame c){
        int passed=0;
        for(int hearts=1;hearts<=3;hearts++){
            var name=net.minecraft.network.chat.Component.translatableWithFallback(DragonBossBar.NAME_KEY,"Crystalspine").append(net.minecraft.network.chat.Component.literal("♥".repeat(hearts)));
            var bar=new net.minecraft.server.bossevents.CustomBossEvent(net.minecraft.resources.Identifier.withDefaultNamespace("impossible_dragon"),name);
            bar.setColor(net.minecraft.world.BossEvent.BossBarColor.PINK);DragonBossBar.refresh(bar.getTextId(),bar);
            check(bar.getName().equals(DragonBossBar.title(hearts))&&DragonBossBar.hearts(bar.getName())==hearts,"previous text title restores original bitmap and preserves hearts");passed++;
            check(bar.getColor()==net.minecraft.world.BossEvent.BossBarColor.BLUE,"old pink health bar restores authored texture");passed++;
            check(bar.getName().getStyle().getColor().getValue()==0xFFFFFF,"bitmap no longer uses dark shader marker tint");passed++;
        }
        return passed;
    }
    private static void check(boolean condition,String message){if(!condition)throw new IllegalStateException(message);}
}
