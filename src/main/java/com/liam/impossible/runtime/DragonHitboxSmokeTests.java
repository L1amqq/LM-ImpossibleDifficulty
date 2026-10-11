package com.liam.impossible.runtime;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.*;
import java.util.*;
import org.slf4j.LoggerFactory;

/** Real attacks and original flight/stun regression cases in the disposable End fixture. */
final class DragonHitboxSmokeTests {
    static int run(Frame origin,Entity root,ServerPlayer player) throws Exception {
        var level=origin.source().getLevel();int passed=0;
        Map<BlockPos,BlockState> saved=new LinkedHashMap<>();
        try {
            player.setNoGravity(true);player.setDeltaMovement(Vec3.ZERO);
            for(String tag:List.copyOf(root.getTags()))if(tag.endsWith(".playing"))root.removeTag(tag);
            Logic.call(context(origin,root),"animated_java:impossible_dragon/variants/not_stunned/apply");
            Logic.call(context(origin,root),"impossible_to_survive:mobs/impossible_dragon/state/set_tail_enabled");
            Logic.call(context(origin,root),"animated_java:impossible_dragon/animations/hover/apply_frame","{frame:3}");
            reset(origin,root);
            var boxes=DragonGeometry.boxes(root,root.position(),root.getRotationVector());
            check(boxes.size()>40,"visible dragon geometry covers limbs, wings, necks and tail");passed++;
            var parts=DragonCombat.parts(root);
            check(parts.size()>=boxes.size(),"synchronized attack volumes cover every visible bone");passed++;
            LoggerFactory.getLogger("impossible_difficulty").info("DRAGON_GEOMETRY: {} bones, {} attack volumes",boxes.size(),parts.size());
            for(DragonPart part:parts){
                AABB model=boxes.stream().filter(b->b.bone().equals(part.bone)).findFirst().orElseThrow().bounds(),hit=part.getBoundingBox();
                check(hit.minX>=model.minX-.0001&&hit.maxX<=model.maxX+.0001&&hit.minZ>=model.minZ-.0001&&hit.maxZ<=model.maxZ+.0001,"attack volume fits the rendered bone in both horizontal axes: "+part.bone);passed++;
            }
            DragonPart original=parts.stream().filter(p->p.bone.equals("body")).findFirst().orElseThrow();
            var mirror=new DragonPart(DragonCombat.TYPE,level);
            mirror.getEntityData().assignValues(original.getEntityData().getNonDefaultValues());
            check(Math.abs(mirror.getBoundingBox().getXsize()-original.getBoundingBox().getXsize())<.0001&&Math.abs(mirror.getBoundingBox().getYsize()-original.getBoundingBox().getYsize())<.0001&&Math.abs(mirror.getBoundingBox().getZsize()-original.getBoundingBox().getZsize())<.0001,"all three hitbox dimensions survive metadata synchronization");passed++;
            for(String bone:new String[]{"body","right_wing_tip","left_wing","back_left_shin","spine_middle_2","head_left","jaw_right","tail_end"}) {
                DragonPart part=parts.stream().filter(p->p.bone.equals(bone)).findFirst().orElseThrow();
                check(part.isPickable()&&part.canBeHitByProjectile()&&!part.skipAttackInteraction(player),"melee and projectiles can select "+bone);passed++;
                Native.setScore(context(origin,root),"@s","mcm.its.dragon.health",1000000);
                Native.setScore(context(origin,root),"@s","mcm.its.dragon.damaged_cd",0);
                part.target.invulnerableTime=0;
                player.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).setBaseValue(7);
                player.snapTo(part.getX()+1,part.getY(),part.getZ(),90,0);
                for(int tick=0;tick<30;tick++)player.doTick();
                player.attack(part);
                check(health(origin,root)<1000000,"real melee damage reaches dragon through "+bone);passed++;
            }
            DragonPart body=parts.stream().filter(p->p.bone.equals("body")).findFirst().orElseThrow();
            var sword=new net.minecraft.world.item.ItemStack(net.minecraft.world.item.Items.DIAMOND_SWORD);
            player.setItemInHand(net.minecraft.world.InteractionHand.MAIN_HAND,sword);
            int normalDamage=0;
            for(boolean critical:new boolean[]{false,true}){
                Native.setScore(context(origin,root),"@s","mcm.its.dragon.health",1000000);
                Native.setScore(context(origin,root),"@s","mcm.its.dragon.damaged_cd",0);body.target.invulnerableTime=0;
                for(int tick=0;tick<30;tick++)player.doTick();
                player.snapTo(body.getX()+1,body.getY()+1,body.getZ(),90,0);
                player.setOnGround(!critical);player.fallDistance=critical?1:0;
                int wear=sword.getDamageValue();player.attack(body);
                check(sword.getDamageValue()>wear,"weapon durability is consumed through attack volume");passed++;
                int damage=1000000-health(origin,root);
                if(!critical)normalDamage=damage;else {check(damage>normalDamage*1.3,"vanilla critical hit bonus is retained; normal="+normalDamage+", critical="+damage+", fall="+player.fallDistance+", onGround="+player.onGround()+", restricted="+player.isMobilityRestricted());passed++;}
            }
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.health",1000000);
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.damaged_cd",0);body.target.invulnerableTime=0;
            for(int tick=0;tick<30;tick++)player.doTick();
            check(player.stabAttack(EquipmentSlot.MAINHAND,body,10,true,false,false)&&health(origin,root)<1000000,"vanilla stabbing attack reaches dragon");passed++;
            DragonPart wing=parts.stream().filter(p->p.bone.equals("right_wing_tip")).findFirst().orElseThrow();
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.health",1000000);
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.damaged_cd",0);
            for(DragonPart part:parts)part.target.invulnerableTime=0;
            Vec3 aim=wing.getBoundingBox().getCenter();player.snapTo(aim.x+10,aim.y,aim.z,0,0);
            var arrow=new net.minecraft.world.entity.projectile.arrow.Arrow(EntityType.ARROW,level);
            arrow.setOwner(player);arrow.setNoGravity(true);arrow.setPos(aim.add(0,0,-5));arrow.setDeltaMovement(0,0,2);
            level.addFreshEntity(arrow);
            for(int tick=0;tick<8&&!arrow.isRemoved();tick++)arrow.tick();
            check(health(origin,root)<1000000,"real arrow hits extended wing geometry");passed++;
            arrow.discard();
            // Terrain must not clamp original scripted moves or raise the rig during stun descent.
            for(int x=-32;x<=32;x++)for(int z=-32;z<=32;z++)set(level,saved,new BlockPos(x,130,z),Blocks.END_STONE.defaultBlockState());
            reset(origin,root);
            move(origin,root,new Vec3(0,120,0),new Vec2(0,0));
            check(root.position().distanceToSqr(new Vec3(0,120,0))<.000001,"original scripted movement is not clamped by a floor");passed++;
            reset(origin,root);
            for(int z=-32;z<=32;z++)for(int y=131;y<=195;y++)set(level,saved,new BlockPos(23,y,z),Blocks.OBSIDIAN.defaultBlockState());
            move(origin,root,new Vec3(35,160,0),new Vec2(0,0));
            check(root.position().distanceToSqr(new Vec3(35,160,0))<.000001,"original flight proceeds past a wall without stopping");passed++;
            move(origin,root,root.position(),new Vec2(0,90));
            check(root.getYRot()==90&&root.getXRot()==0,"terrain does not clamp original animation rotation");passed++;
            reset(origin,root);
            for(int x=-32;x<=32;x++)for(int z=-32;z<=32;z++)set(level,saved,new BlockPos(x,185,z),Blocks.END_STONE.defaultBlockState());
            move(origin,root,new Vec3(0,200,0),new Vec2(0,0));
            check(root.position().distanceToSqr(new Vec3(0,200,0))<.000001,"original ascent is not clamped by a ceiling");passed++;
            root.teleportTo(level,0,130,0,Set.of(),0,0,true);DragonCombat.update(root);
            check(root.getY()==130,"hitbox synchronization never raises an embedded rig");passed++;
            // Tight floating indicators and the oversized legacy body cube must not remain attackable.
            for(DragonPart part:DragonCombat.parts(root)){
                check(part.target.getBoundingBox().getXsize()<.07,"legacy damage reservoir has no giant stray hitbox");passed++;
            }
            DragonPart removed=DragonCombat.parts(root).getFirst();
            DragonCombat.remove(root);
            check(removed.isRemoved()&&DragonCombat.parts(root).isEmpty(),"all attack volumes are removed with their owner");passed++;
            DragonCombat.update(root);
            check(!DragonCombat.parts(root).isEmpty(),"volumes are rebuilt after loading the rig");passed++;

            // Use the original stun activation, animation tick and activity on a real End-stone floor.
            root.teleportTo(level,0,145,0,Set.of(),0,0,true);
            Native.setScore(context(origin,root),"@s","mcm.its.dragon.head_count",3);
            Logic.call(context(origin,root),"impossible_to_survive:mobs/impossible_dragon/ability/tail_slam/zzz/0");
            boolean noLift=true,noRootCorrection=true;
            for(int tick=0;tick<35;tick++){
                double previousY=root.getY();
                Logic.call(context(origin,root),"animated_java:impossible_dragon/root/on_tick");
                Logic.call(context(origin,root),"impossible_to_survive:mobs/impossible_dragon/loop");
                Vec3 position=root.position();Vec2 rotation=root.getRotationVector();
                DragonCombat.update(root);
                noRootCorrection&=position.equals(root.position())&&rotation.x==root.getXRot()&&rotation.y==root.getYRot();
                noLift&=root.getY()<=previousY+.000001;
            }
            check(noRootCorrection,"hitbox refresh leaves the stunned rig position and rotation unchanged");passed++;
            check(noLift,"stun descent is not reversed by terrain recovery");passed++;
            check(root.getTags().contains("mcm.its.dragon.stun_landed"),"original stun reaches the ground");passed++;
            check(root.getTags().contains("mcm.its.dragon.stun_pose_set"),"grounded stun selects its original pose");passed++;
            check(root.getY()>=131&&root.getY()<=131.125,"stunned dragon rests at the original floor height; y="+root.getY());passed++;
            check(root.getTags().stream().anyMatch(t->t.contains(".animation.stun_loop")&&t.endsWith(".playing")),"grounded stun loop is playing");passed++;
        } finally {
            for(var entry:saved.entrySet())level.setBlock(entry.getKey(),entry.getValue(),2|16);
        }
        LoggerFactory.getLogger("impossible_difficulty").info("DRAGON_HITBOX_PASS: {} assertions",passed);return passed;
    }
    private static void set(net.minecraft.server.level.ServerLevel level,Map<BlockPos,BlockState> saved,BlockPos pos,BlockState state){saved.putIfAbsent(pos,level.getBlockState(pos));level.setBlock(pos,state,2|16);}
    private static Frame context(Frame origin,Entity root){return origin.with(origin.source().withEntity(root).withPosition(root.position()).withRotation(root.getRotationVector()));}
    private static void reset(Frame origin,Entity root) throws Exception {root.teleportTo(origin.source().getLevel(),0,160,0,Set.of(),0,0,true);Native.setScore(context(origin,root),"@s","mcm.its.dragon.health",1000000);DragonCombat.update(root);}
    private static void move(Frame origin,Entity root,Vec3 pos,Vec2 rot) throws Exception {Native.tp(context(origin,root),"@s",Double.toString(pos.x),Double.toString(pos.y),Double.toString(pos.z),Float.toString(rot.y),Float.toString(rot.x));DragonCombat.update(root);}
    private static int health(Frame origin,Entity root) throws Exception {return Native.scoreInfo(context(origin,root),"@s","mcm.its.dragon.health").value();}
    private static void check(boolean condition,String message){if(!condition)throw new IllegalStateException(message);}
}
