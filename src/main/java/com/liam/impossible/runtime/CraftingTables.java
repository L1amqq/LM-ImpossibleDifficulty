package com.liam.impossible.runtime;

import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.phys.Vec3;
import java.util.*;

/** Per-player gaze tracking without client-visible area effect clouds. */
public final class CraftingTables {
    private record Look(Vec3 position,int yaw,int pitch,int ticks) {}
    private static final Map<MinecraftServer,Map<UUID,Look>> LOOKS=new WeakHashMap<>();
    public static int check(Frame context) throws Exception {
        if(!(context.source().getEntity() instanceof ServerPlayer player))return 0;
        var server=context.source().getServer();
        var looks=LOOKS.computeIfAbsent(server,key->new HashMap<>());
        looks.keySet().removeIf(id->server.getPlayerList().getPlayer(id)==null&&!id.equals(player.getUUID()));
        Frame eyes=context.with(context.source().withAnchor(EntityAnchorArgument.Anchor.EYES));
        boolean found=table(eyes,0,0,-0.5);
        for(int z=0;z<=6&&!found;z++) {
            found=table(eyes,0.5,0,z)||table(eyes,-0.5,0,z)||table(eyes,0,0.5,z)||table(eyes,0,-0.5,z);
            if(z<6&&!found)found=table(eyes,0,0,z+0.5);
        }
        if(!found) {
            player.removeTag("crafting_table_looking");looks.remove(player.getUUID());
            Native.setScore(context,"@s","crafting_table_look_timer",0);return 0;
        }
        player.addTag("crafting_table_looking");
        Look previous=looks.get(player.getUUID());int yaw=(int)Math.floor(player.getYRot()),pitch=(int)Math.floor(player.getXRot());
        int ticks=previous!=null&&previous.position().distanceToSqr(player.position())<=0.01&&previous.yaw()==yaw&&previous.pitch()==pitch?previous.ticks()+1:0;
        var difficulty=Native.scoreInfo(context,"#global","mcm.its.overall_difficulty");
        int threshold=switch(difficulty==null?2:difficulty.value()){case 1->21;case 3->11;default->17;};
        if(ticks>=threshold) {
            Logic.call(context,"impossible_to_survive:features/crafting_table/summon_aj_crafting_table");
            ticks=0;
        }
        looks.put(player.getUUID(),new Look(player.position(),yaw,pitch,ticks));
        Native.setScore(context,"@s","crafting_table_look_timer",ticks);return 1;
    }
    private static boolean table(Frame context,double x,double y,double z) throws Exception {
        String[] coordinates={"^"+x,"^"+y,"^"+z};
        return Native.blockMatches(context,Native.blockPos(context,coordinates,0),"minecraft:crafting_table");
    }
    public static void stopped(MinecraftServer server) {LOOKS.remove(server);}
}
