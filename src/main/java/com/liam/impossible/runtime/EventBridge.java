package com.liam.impossible.runtime;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.*;
public final class EventBridge {
    public static void hit(ServerPlayer player,Entity target){
        Frame c=new Frame(player.level().getServer().createCommandSourceStack().withEntity(player).withLevel(player.level()).withPosition(player.position()).withRotation(player.getRotationVector()));
        if(target.getType()==EntityType.WITHER_SKELETON)Logic.call(c,"impossible_to_survive:mobs/wither_skeleton/hit");
        if(target.getType()==EntityType.PIG)for(String part:new String[]{"body","tail","head.left","head.middle","head.right"})
            if(target.getTags().contains("mcm.its.dragon.hitbox."+part))Logic.step(()->{
                if(!DragonCombat.hit(player,target,part))Logic.call(c,"impossible_to_survive:mobs/impossible_dragon/hitbox/damaged_by_player/"+part.replace('.','_'));
                return 1;
            });
    }
}
