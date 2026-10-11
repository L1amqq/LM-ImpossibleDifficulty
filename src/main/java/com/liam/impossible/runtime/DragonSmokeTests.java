package com.liam.impossible.runtime;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.slf4j.LoggerFactory;

/** The live locator/AI path supplements the static animation matrix samples. */
public final class DragonSmokeTests {
    public static int run(MinecraftServer server) throws Exception {
        var level=server.getLevel(Level.END);level.setChunkForced(0,0,true);
        level.getChunk(0,0);
        Frame origin=new Frame(server.createCommandSourceStack().withLevel(level).withPosition(new Vec3(0,100,0)));
        Entity root=null;net.minecraft.server.level.ServerPlayer player=null;int passed=0;
        try {
            Native.kill(origin,"@e[tag=mcm.its.dragon.hitbox]");
            Native.kill(origin,"@e[tag=aj.impossible_dragon.locator]");
            Logic.call(origin,"impossible_to_survive:mobs/impossible_dragon/summon");
            var roots=Native.entities(origin,"@e[tag=aj.impossible_dragon.root,type=item_display,limit=1]");
            check(!roots.isEmpty(),"native dragon summon creates an accessible root in the loaded End chunk");
            root=roots.getFirst();
            Frame context=new Frame(origin.source().withEntity(root).withPosition(root.position()));
            var bar=server.getCustomBossEvents().get(net.minecraft.resources.Identifier.withDefaultNamespace("impossible_dragon"));
            check(bar!=null&&DragonBossBar.matches(bar.getName())&&bar.getColor()==net.minecraft.world.BossEvent.BossBarColor.BLUE,"new dragon uses the original bitmap boss bar and health texture");passed++;
            bar.setName(net.minecraft.network.chat.Component.literal("\uFFF1").withStyle(style->style.withFont(new net.minecraft.network.chat.FontDescription.Resource(net.minecraft.resources.Identifier.withDefaultNamespace("bossbar_2")))));
            bar.setColor(net.minecraft.world.BossEvent.BossBarColor.BLUE);
            Native.bossbar(context,"set","impossible_dragon","value","1000000");
            check(DragonBossBar.matches(bar.getName())&&DragonBossBar.hearts(bar.getName())==2&&bar.getColor()==net.minecraft.world.BossEvent.BossBarColor.BLUE&&bar.getName().getStyle().getColor().getValue()==0xFFFFFF,"saved bitmap boss title loses dark tint without a phase change and retains two hearts");passed++;
            bar.setName(DragonBossBar.title(3));
            for(String tag:java.util.List.copyOf(root.getTags()))if(tag.endsWith(".playing"))root.removeTag(tag);
            Native.setScore(context,"@s","aj.is_rig_loaded",1);
            Logic.call(context,"animated_java:impossible_dragon/animations/hover/apply_frame","{frame:3}");
            Entity data=root.getPassengers().stream().filter(e->e.getTags().contains("aj.data")).findFirst().orElseThrow();
            var locators=Native.entityData(data).getCompoundOrEmpty("data").getCompoundOrEmpty("locators").copy();
            Logic.call(context,"animated_java:impossible_dragon/root/on_tick");
            for(String key:locators.keySet()){
                var locator=locators.getCompoundOrEmpty(key);
                if(!locator.contains("uuid"))continue;
                var matches=Native.entities(context,locator.getStringOr("uuid",""));
                check(!matches.isEmpty(),"accessible dragon locator "+key+" "+locator);
                Entity entity=matches.getFirst();
                var expected=new Vec3(locator.getDoubleOr("posx",0),locator.getDoubleOr("posy",0),locator.getDoubleOr("posz",0)).add(root.position());
                check(entity.position().distanceTo(expected)<0.0001,"dragon locator follows hover pose: "+key+"; expected "+expected+", got "+entity.position());passed++;
            }
            // Run the original state machine and real player damage callback, rather than skipping stages.
            var profile=new com.mojang.authlib.GameProfile(java.util.UUID.randomUUID(),"DragonSmoke");
            player=new net.minecraft.server.level.ServerPlayer(server,level,profile,net.minecraft.server.level.ClientInformation.createDefault());
            var connection=new net.minecraft.network.Connection(net.minecraft.network.protocol.PacketFlow.SERVERBOUND);
            new net.minecraft.server.network.ServerGamePacketListenerImpl(server,connection,player,net.minecraft.server.network.CommonListenerCookie.createInitial(profile,false));
            player.snapTo(4,90,4,180,0);player.addTag("survivor");player.setInvulnerable(true);
            server.getPlayerList().getPlayers().add(player);level.addNewPlayer(player);
            player.connection.handleAcceptPlayerLoad(new net.minecraft.network.protocol.game.ServerboundPlayerLoadedPacket());
            Native.summon(origin,"marker","~","~","~","{Tags:[\"native_dragon_fixture\",\"mcm.its.dragon_environment.dragon_spawn_point\",\"mcm.its.dragon_environment.exit_portal_center\"]}");
            for(int i=0;i<8;i++) {
                double angle=i*Math.PI/4;
                Native.summon(origin,"marker",String.format(java.util.Locale.ROOT,"%.6f",25*Math.cos(angle)),"105",String.format(java.util.Locale.ROOT,"%.6f",25*Math.sin(angle)),"{Tags:[\"native_dragon_fixture\",\"mcm.its.dragon_environment.waypoint\"]}");
            }
            Logic.call(context,"impossible_to_survive:mobs/impossible_dragon/settings/set_player_count");
            Logic.call(context,"impossible_to_survive:mobs/impossible_dragon/activity/do_sleep");
            tick(origin,root);
            var body=(net.minecraft.world.entity.animal.pig.Pig)Native.entities(origin,"@e[tag=mcm.its.dragon.hitbox.body,limit=1]").getFirst();
            check(body.hurtServer(level,body.damageSources().playerAttack(player),50),"real player hit reaches dragon body");passed++;
            tick(origin,root);
            check(score(origin,root,"sub_activity")==2,"damage wakes the sleeping dragon; health="+score(origin,root,"health")+", body="+body.getHealth()+", activity="+score(origin,root,"activity")+", sub="+score(origin,root,"sub_activity")+", cooldown="+score(origin,root,"damaged_cd"));passed++;
            for(int i=0;i<250&&score(origin,root,"sub_activity")!=3;i++)tick(origin,root);
            check(score(origin,root,"activity")==16&&score(origin,root,"sub_activity")==3,"wake-up and first slam enter tail tutorial");passed++;
            check(Native.entities(origin,"@e[type=item_display,tag=mcm.its.dragon.tutorial.red_arrow]").size()==4,"four tail arrows appear on the first tutorial tick without another player hit");passed++;
            check(!root.getTags().contains("mcm.its.dragon.crystal_tail.protected"),"tail is vulnerable when immediate arrows appear");passed++;
            check(score(origin,root,"health")==1000000,"tail hint does not require or simulate damage");passed++;
            for(int i=0;i<30;i++)tick(origin,root);
            var arrows=Native.entities(origin,"@e[type=item_display,tag=mcm.its.dragon.tutorial.red_arrow]");
            var tailMarker=Native.entities(origin,"@e[tag=aj.impossible_dragon.locator.tail_locator,limit=1]").getFirst();
            check(arrows.size()==4,"four tutorial arrows appear; count="+arrows.size()+", timer="+score(origin,root,"activity.timer")+", root="+root.position()+", tail="+tailMarker.position());passed++;
            for(var arrow:arrows) {check(arrow.position().distanceTo(tailMarker.position())<0.0001,"tutorial arrow follows visible tail");passed++;}
            var tail=(net.minecraft.world.entity.animal.pig.Pig)Native.entities(origin,"@e[tag=mcm.its.dragon.hitbox.tail,limit=1]").getFirst();
            check(tail.position().distanceTo(tailMarker.position())<2,"tail damage zone follows the tail instead of spawn point");passed++;
            for(int i=0;i<20&&score(origin,root,"has_tail")==1;i++) {
                player.snapTo(tail.getX()+2,tail.getY(),tail.getZ(),180,0);tail.invulnerableTime=0;
                check(tail.hurtServer(level,tail.damageSources().playerAttack(player),100),"real player damage reaches animated tail");passed++;
                for(int j=0;j<10;j++)tick(origin,root);
            }
            check(score(origin,root,"has_tail")==0&&score(origin,root,"sub_activity")==4,"destroying tail advances tutorial");passed++;
            check(!Native.entities(origin,"@e[type=item,distance=..300]").isEmpty(),"destroyed tail drops its item");passed++;
            Logic.call(origin,"impossible_to_survive:mobs/impossible_dragon/crystal_tail/place");
            for(int i=0;i<80&&score(origin,root,"tutorial.stage")!=2;i++)tick(origin,root);
            check(score(origin,root,"tutorial.stage")==2,"placing tail starts second slam");passed++;
            for(int i=0;i<160&&score(origin,root,"tutorial.stage")!=3;i++)tick(origin,root);
            check(score(origin,root,"tutorial.stage")==3,"blocked slam completes tutorial");passed++;
            check(Native.entities(origin,"@e[tag=mcm.its.dragon.tutorial.red_arrow]").isEmpty(),"tutorial arrows are removed after use");passed++;
            for(int i=0;i<350&&score(origin,root,"activity")!=1;i++)tick(origin,root);
            check(score(origin,root,"activity")==1,"dragon resumes flying after tutorial stun");passed++;
            Vec3 before=root.position();
            for(int i=0;i<15;i++)tick(origin,root);
            check(root.position().distanceTo(before)>0.5,"dragon moves along its flight path");passed++;
            context=context(origin,root);
            Native.setScore(context,"@s","mcm.its.dragon.attack_delay_timer",0);
            tick(origin,root);
            check(score(origin,root,"activity")>1,"dragon selects next attack after flight");passed++;
            passed+=DragonHitboxSmokeTests.run(origin,root,player);
            passed+=DragonAnimationSmokeTests.run(origin,root);
            passed+=DragonHealingSmokeTests.run(origin,root,player);
            passed+=DragonCrystalSmokeTests.run(origin,root,player);
            passed+=DragonLifecycleSmokeTests.run(origin,root,player);
            passed+=DragonDeathSmokeTests.run(origin,root,player);
            passed+=DragonGroundDeathSmokeTests.run(origin);
        } finally {
            if(player!=null){server.getPlayerList().getPlayers().remove(player);player.discard();}
            if(root!=null)Logic.call(context(origin,root),"animated_java:impossible_dragon/remove/this");
            Native.kill(origin,"@e[tag=aj.impossible_dragon.locator]");
            Native.kill(origin,"@e[tag=aj.rig_entity]");
            Native.kill(origin,"@e[tag=native_dragon_fixture]");
            Native.kill(origin,"@e[tag=mcm.its.dragon.component_item_display]");
            Native.kill(origin,"@e[tag=mcm.its.dragon.tutorial.red_arrow]");
            level.removeBlock(net.minecraft.core.BlockPos.containing(origin.source().getPosition()),false);
            for(int x=-2;x<=2;x++)for(int z=-2;z<=2;z++)level.setChunkForced(x,z,false);
        }
        LoggerFactory.getLogger("impossible_difficulty").info("DRAGON_EVENT_PASS: {} assertions",passed);
        return passed;
    }
    private static Frame context(Frame origin,Entity root){return new Frame(origin.source().withEntity(root).withPosition(root.position()).withRotation(root.getRotationVector()));}
    private static int score(Frame origin,Entity root,String name) throws Exception {var value=Native.scoreInfo(context(origin,root),"@s","mcm.its.dragon."+name);return value==null?Integer.MIN_VALUE:value.value();}
    private static void tick(Frame origin,Entity root){
        Logic.call(context(origin,root),"animated_java:impossible_dragon/root/on_tick");
        Logic.call(context(origin,root),"impossible_to_survive:mobs/impossible_dragon/loop");
    }
    private static void check(boolean condition,String message){if(!condition)throw new IllegalStateException(message);}
}
