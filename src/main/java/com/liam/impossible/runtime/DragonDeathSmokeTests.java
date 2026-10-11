package com.liam.impossible.runtime;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import java.util.*;
import org.slf4j.LoggerFactory;

final class DragonDeathSmokeTests {
    static int run(Frame origin,Entity root,net.minecraft.server.level.ServerPlayer player) throws Exception {
        var level=origin.source().getLevel();int passed=0;
        Map<BlockPos,BlockState> saved=new LinkedHashMap<>();
        net.minecraft.world.entity.projectile.arrow.Arrow friendlyArrow=null;Entity friendlyCloud=null;
        for(BlockPos pos:BlockPos.betweenClosed(new BlockPos(-3,97,-3),new BlockPos(3,101,3)))saved.put(pos.immutable(),level.getBlockState(pos));
        try {
            root.removeTag("mcm.its.dragon.invulnerable");root.removeTag("mcm.its.dragon.crystal_healing_interrupted");
            root.teleportTo(level,30,155,-25,Set.of(),0,0,true);
            Frame frame=context(origin,root);
            Native.setScore(frame,"@s","mcm.its.dragon.activity",1);
            Native.setScore(frame,"@s","mcm.its.dragon.sub_activity",0);
            Native.setScore(frame,"@s","mcm.its.dragon.attack_delay_timer",1000);
            Native.setScore(frame,"@s","mcm.its.dragon.health",1);
            Native.setScore(frame,"@s","mcm.its.dragon.head_count",1);
            Native.setScore(frame,"@s","mcm.its.dragon.damaged_cd",0);
            Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/state/set_fly");
            Logic.call(frame,"animated_java:impossible_dragon/animations/fly/apply_frame","{frame:3}");
            Logic.call(frame,"animated_java:impossible_dragon/variants/1_head/apply");DragonCombat.update(root);
            for(String tag:new String[]{"mcm.its.dragon.fireball","mcm.its.dragon.laser_main","mcm.its.dragon.forcefield_rotating","mcm.lightning_vfx.projectile.egg_attracted"})
                Native.summon(frame,"marker","~","~","~","{Tags:[native_death_attack,"+tag+"]}");
            Entity snapshot=Native.entity(frame,"@e[tag=native_death_attack,limit=1]");
            Frame snapshotFrame=frame.with(frame.source().withEntity(snapshot));
            Native.summon(snapshotFrame,"marker","~","~","~","{Tags:[native_death_chain]}");
            Logic.register("impossible_difficulty:smoke/death_player_chain",c->Control.run(c,p->Native.summon(p,"marker","~","~","~","{Tags:[native_death_player_chain]}"),Control.as(player.getUUID().toString())));
            Logic.call(frame,"impossible_difficulty:smoke/death_player_chain");
            check(Native.entity(frame,"@e[tag=native_death_player_chain,limit=1]").getTags().contains(DragonAttacks.OWNER+root.getUUID()),"attack ownership survives switching executor to a player");passed++;
            Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/ability/fireball_attack/summon_area_effect_cloud");
            Native.summon(origin,"item_display","0","155","0","{Tags:[native_death_legacy,mcm.its.dragon.fireball]}");
            friendlyArrow=new net.minecraft.world.entity.projectile.arrow.Arrow(EntityType.ARROW,level);friendlyArrow.setOwner(player);friendlyArrow.setPos(5,155,0);level.addFreshEntity(friendlyArrow);
            Native.summon(origin,"area_effect_cloud","5","155","0","{Tags:[native_death_friendly],Duration:600}");friendlyCloud=Native.entity(origin,"@e[tag=native_death_friendly,limit=1]");
            String owned="@e[tag="+DragonAttacks.OWNER+root.getUUID()+"]";
            check(Native.entities(frame,owned).size()>=6,"projectiles, effect chains and real breath cloud retain dragon ownership");passed++;
            Native.summon(frame,"end_crystal","~","~","~","{Tags:[native_death_healer,impossible.dragon.healing_beam],beam_target:[I;30,155,-25]}");
            var healer=(net.minecraft.world.entity.boss.enderdragon.EndCrystal)Native.entity(frame,"@e[tag=native_death_healer,limit=1]");
            Native.setScore(frame,"@s","mcm.its.dragon.activity",5);
            Native.setScore(frame,"@s","mcm.its.dragon.sub_activity",3);
            Native.setScore(frame,"@s","mcm.its.dragon.activity.timer",25);
            DragonPart body=DragonCombat.parts(root).stream().filter(p->p.bone.equals("body")).findFirst().orElseThrow();
            body.target.invulnerableTime=0;
            player.snapTo(body.getX()+1,body.getY(),body.getZ(),90,0);
            for(int tick=0;tick<30;tick++)player.doTick();
            player.attack(body);
            check(score(origin,root,"health")<=0,"real player hit exhausts the last heart");passed++;
            check(DragonDeath.isDying(root)&&Native.entities(frame,owned).isEmpty()&&snapshot.isRemoved(),"lethal hit immediately cancels all owned attacks before the next tick");passed++;
            check(healer.getBeamTarget()==null&&!healer.isRemoved(),"lethal hit during healing immediately clears the crystal beam");passed++;
            var visual=new DragonDeathVisualChecks(root);
            visual.checkModels();passed++;
            check(Native.entities(origin,"@e[tag=native_death_legacy]").isEmpty(),"legacy attacks without ownership are also removed");passed++;
            check(!friendlyArrow.isRemoved()&&!friendlyCloud.isRemoved(),"player arrows and unrelated potion clouds remain intact");passed++;
            float hp=player.getHealth();
            check(Native.damage(snapshotFrame,player.getUUID().toString(),"10")==0&&player.getHealth()==hp,"cancelled attack cannot damage players through an already-captured callback");passed++;
            check(Native.summon(snapshotFrame,"marker","~","~","~","{Tags:[native_death_late]}")==0&&Native.entities(frame,"@e[tag=native_death_late]").isEmpty(),"cancelled attack cannot spawn delayed projectiles");passed++;
            Logic.register("impossible_difficulty:smoke/death_late_effect",c->Control.run(c,p->Native.effect(p,"give","@s","minecraft:slowness","5"),Control.as(player.getUUID().toString())));
            check(Logic.call(snapshotFrame,"impossible_difficulty:smoke/death_late_effect")==0&&!player.hasEffect(net.minecraft.world.effect.MobEffects.SLOWNESS),"cancelled attack cannot apply an effect after switching executor");passed++;
            tick(origin,root);
            check(score(origin,root,"activity")==15,"last heart enters original death flight");passed++;
            check(DragonCombat.parts(root).isEmpty(),"attack volumes stop accepting further hits at zero health");passed++;
            check(score(origin,root,"sub_activity")==2,"death animation starts automatically without a second hit");passed++;
            // Recovery for a world already saved with the old infinite death flight.
            var oldData=AnimationData.customData(root);oldData.remove("impossible_death");root.setComponent(net.minecraft.core.component.DataComponents.CUSTOM_DATA,net.minecraft.world.item.component.CustomData.of(oldData));
            root.removeTag("impossible.dragon.dying");DragonDeath.remove(root);
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.sub_activity",1);
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.activity.timer",200);
            tick(origin,root);
            check(score(origin,root,"sub_activity")==2&&score(origin,root,"activity.timer")==1,"old saved death flight begins the new cinematic");passed++;
            Vec3 initial=root.position();visual.capture(0);
            int travel=DragonDeath.flightTicks(root);
            var data=AnimationData.customData(root).getCompoundOrEmpty("impossible_death");
            Vec3 target=new Vec3(data.getDoubleOr("target_x",0),data.getDoubleOr("target_y",0),data.getDoubleOr("target_z",0));
            var portal=Native.entity(frame,"@e[type=marker,tag=mcm.its.dragon_environment.exit_portal_center,limit=1]");
            check(target.distanceTo(portal.position().add(0,20,0))<.001,"death destination is twenty blocks above the exit portal");passed++;
            for(int i=0;i<25;i++){tick(origin,root);visual.checkMotion();passed++;if(i==13)visual.capture(14);}
            check(root.position().distanceTo(target)<initial.distanceTo(target)-1,"death flies toward the exit portal");passed++;
            int savedAge=score(origin,root,"activity.timer");var savedEntity=Native.entityData(root);DragonDeath.remove(root);Native.writeEntity(root,savedEntity);
            tick(origin,root);
            check(score(origin,root,"activity.timer")==savedAge+1,"saving and loading mid-flight preserves cinematic progress");passed++;
            visual.checkMotion();passed++;
            while(score(origin,root,"activity.timer")<travel+1){tick(origin,root);visual.checkMotion();passed++;}
            check(root.position().distanceTo(target)<.001,"death reaches the portal without landing on the ground");passed++;
            check(!root.getTags().contains("aj.impossible_dragon.animation.die.playing"),"folded death animation is never played");passed++;
            var bodyBone=(Display)root.getPassengers().stream().filter(e->e.getTags().contains("aj.impossible_dragon.bone.body")).findFirst().orElseThrow();
            var wing=(Display)root.getPassengers().stream().filter(e->e.getTags().contains("aj.impossible_dragon.bone.left_wing")).findFirst().orElseThrow();
            var bodyPose=new org.joml.Matrix4f(com.liam.impossible.mixin.DisplayAccessor.impossible$transform(bodyBone.getEntityData()).getMatrix());
            var wingPose=new org.joml.Matrix4f(com.liam.impossible.mixin.DisplayAccessor.impossible$transform(wing.getEntityData()).getMatrix());
            var received=new ArrayList<net.minecraft.network.protocol.Packet<?>>();
            var particleConnection=new net.minecraft.network.Connection(net.minecraft.network.protocol.PacketFlow.SERVERBOUND){
                @Override public void send(net.minecraft.network.protocol.Packet<?> packet,io.netty.channel.ChannelFutureListener listener,boolean flush){received.add(packet);}
            };
            new net.minecraft.server.network.ServerGamePacketListenerImpl(level.getServer(),particleConnection,player,
                net.minecraft.server.network.CommonListenerCookie.createInitial(player.getGameProfile(),false));
            player.snapTo(target.x,target.y-30,target.z-50,0,0);
            player.connection.handleAcceptPlayerLoad(new net.minecraft.network.protocol.game.ServerboundPlayerLoadedPacket());
            visual.capture(travel);
            int inspected=0;
            while(!root.isRemoved()){
                tick(origin,root);if(root.isRemoved())break;visual.checkMotion();passed++;
                int death=score(origin,root,"activity.timer")-1-travel;
                check(Math.abs(root.getX()-target.x)<.001&&Math.abs(root.getZ()-target.z)<.001&&root.getY()>=target.y,"entire death stays in the air above the portal");passed++;
                check(bodyPose.equals(com.liam.impossible.mixin.DisplayAccessor.impossible$transform(bodyBone.getEntityData()).getMatrix(),.0001f)
                    &&wingPose.equals(com.liam.impossible.mixin.DisplayAccessor.impossible$transform(wing.getEntityData()).getMatrix(),.0001f),"body and spread wings neither fold nor shrink");passed++;
                var effects=Native.entities(context(origin,root),"@e[type=impossible_difficulty:dragon_death_effect]");
                check(effects.size()==1&&((DragonDeathEffect)effects.getFirst()).deathAge()==death+1,"one synchronized vanilla effect follows the saved death clock");passed++;
                check(effects.getFirst().getBoundingBox().getSize()==0&&!effects.getFirst().isPickable()
                    &&effects.getFirst().shouldRenderAtSqrDistance(64*64)&&effects.getFirst().shouldRenderAtSqrDistance(256*256),"visual effect renders at arena distance despite its empty interaction volume");passed++;
                Vec3 center=DragonGeometry.boxes(root,root.position(),root.getRotationVector()).stream().filter(b->b.bone().equals("body")).map(b->b.bounds().getCenter()).findFirst().orElseThrow();
                check(effects.getFirst().position().distanceTo(center)<.001,"death rays originate in the visible body");passed++;
                if(death==60){
                    int before=score(origin,root,"activity.timer");var savedDeath=Native.entityData(root);DragonDeath.remove(root);Native.writeEntity(root,savedDeath);tick(origin,root);
                    check(score(origin,root,"activity.timer")==before+1&&Native.entities(context(origin,root),"@e[type=impossible_difficulty:dragon_death_effect]").size()==1,"loading the vanilla-effect stage restores progress without duplicate effects");passed++;
                }
                if(death==40||death==100||death==180)visual.capture(travel+death);
                if(++inspected>DragonDeath.DURATION)throw new IllegalStateException("death did not finish");
            }
            check(Native.entities(origin,"@e[type=impossible_difficulty:dragon_death_effect]").isEmpty(),"death cleans up its ray effect entity");passed++;
            long explosions=received.stream().filter(p->p instanceof net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket particle
                &&particle.getParticle().getType()==net.minecraft.core.particles.ParticleTypes.EXPLOSION_EMITTER).count();
            check(explosions==21,"all twenty-one final explosion emitters reach a viewer more than 32 blocks away; received="+explosions);passed++;
            visual.save();
            check(root.isRemoved()&&DragonCombat.parts(root).isEmpty(),"death finishes and removes the rig and attack volumes");passed++;
            check(Native.entities(origin,"@e[tag=mcm.its.dragon.hitbox]").isEmpty(),"death removes all legacy damage reservoirs");passed++;
            check(Native.entities(origin,"@e[type=item]").stream().anyMatch(e->((net.minecraft.world.entity.item.ItemEntity)e).getItem().is(Items.WARPED_FUNGUS_ON_A_STICK)),"death drops the original dragon staff");passed++;
            check(!Native.entities(origin,"@e[type=experience_orb]").isEmpty(),"death grants experience");passed++;
            check(level.getBlockState(new BlockPos(0,101,0)).is(Blocks.DRAGON_EGG)&&level.getBlockState(new BlockPos(1,97,0)).is(Blocks.END_PORTAL),"death creates dragon egg and exit portal");passed++;
            var bossbar=level.getServer().getCustomBossEvents().get(net.minecraft.resources.Identifier.withDefaultNamespace("impossible_dragon"));
            check(bossbar!=null&&!bossbar.isVisible(),"death hides the boss bar");passed++;
        }finally{Native.kill(origin,"@e[tag=native_death_healer]");if(friendlyArrow!=null)friendlyArrow.discard();if(friendlyCloud!=null)friendlyCloud.discard();for(var entry:saved.entrySet())level.setBlock(entry.getKey(),entry.getValue(),2|16);}
        LoggerFactory.getLogger("impossible_difficulty").info("DRAGON_DEATH_PASS: {} assertions",passed);return passed;
    }
    private static Frame context(Frame origin,Entity root){return origin.with(origin.source().withEntity(root).withPosition(root.position()).withRotation(root.getRotationVector()));}
    private static int score(Frame origin,Entity root,String name) throws Exception {var value=Native.scoreInfo(context(origin,root),"@s","mcm.its.dragon."+name);return value==null?Integer.MIN_VALUE:value.value();}
    private static void tick(Frame origin,Entity root){Logic.call(context(origin,root),"animated_java:impossible_dragon/root/on_tick");Logic.call(context(origin,root),"impossible_to_survive:mobs/impossible_dragon/loop");}
    private static void check(boolean condition,String message){if(!condition)throw new IllegalStateException(message);}
}
