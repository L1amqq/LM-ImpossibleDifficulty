package com.liam.impossible.runtime;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;

/** Trace the loaded vertical column to the world's bounds, without recursive calls or fixed ranges. */
public final class GlowstoneLasers {
    private static final String PREFIX="impossible_to_survive:features/glowstone/";
    private static final TagKey<Block> PASSABLE=TagKey.create(Registries.BLOCK,Identifier.parse("mcm:passable"));
    public static void register(){
        Logic.register(PREFIX+"scan_for_glowstone_above",GlowstoneLasers::scan);
        Logic.register(PREFIX+"zzz/11",GlowstoneLasers::bottom);
        Logic.register(PREFIX+"recursive_tp_down",GlowstoneLasers::trace);
    }
    public static int scan(Frame c) throws Exception {
        if(!(c.source().getEntity() instanceof ServerPlayer player)||!player.level().dimension().equals(Level.NETHER))return 0;
        if(score(c,"glowstone_laser_cd")>0)return 0;
        int offset=score(c,"glowstone_scan_offset")+1;
        Native.setScore(c,"@s","glowstone_scan_offset",offset%4);
        if(offset%4!=0)return 0;
        var level=c.source().getLevel();var column=player.blockPosition();
        for(int y=column.getY()+2;y<level.getMaxY();y++){
            var pos=new BlockPos(column.getX(),y,column.getZ());var block=level.getBlockState(pos);
            if(block.is(Blocks.GLOWSTONE)){
                return Logic.call(c.with(c.source().withPosition(Vec3.atCenterOf(pos))),PREFIX+"glowstone_found");
            }
            if(!block.is(PASSABLE))break;
        }
        return 0;
    }
    private static int score(Frame c,String objective) throws Exception {
        var score=Native.scoreInfo(c,"@s",objective);return score==null?0:score.value();
    }
    public static int bottom(Frame c){
        var marker=c.source().getEntity();if(marker==null)return 0;
        var level=c.source().getLevel();var pos=marker.blockPosition();
        while(pos.getY()>level.getMinY()&&level.getBlockState(pos.below()).is(Blocks.GLOWSTONE))pos=pos.below();
        marker.setPos(Vec3.atCenterOf(pos));
        try {
            if(level.getBlockState(pos.below()).isAir())
                return Logic.call(c.with(c.source().withPosition(marker.position())),PREFIX+"shoot_laser");
            return 0;
        } finally {marker.discard();}
    }
    public static int trace(Frame c) throws Exception {
        var marker=c.source().getEntity();if(marker==null)return 0;
        var level=c.source().getLevel();Vec3 start=marker.position();
        // Half-block samples retain the original hit radius; each player is tagged only once.
        for(double y=start.y-.5;y>=level.getMinY();y-=.5){
            var pos=new Vec3(start.x,y,start.z);
            if(!level.getBlockState(BlockPos.containing(pos)).is(PASSABLE))break;
            marker.setPos(pos);Frame point=c.with(c.source().withPosition(pos));
            Native.tag(point,"@a[tag=survivor,predicate=mcm:gm/vulnerable,distance=..1]","add","mcm.its.glowstone_hit");
            if((int)Math.floor(y*2)%2==0){
                Native.particle(point,"end_rod","~","~","~","0","0","0","0","1","force");
                Native.particle(point,"block{block_state:\"minecraft:glowstone\"}","~","~","~","0.1","0.5","0.1","0.1","2","force");
                Native.particle(point,"totem_of_undying","~","~","~","0","0.5","0","0.1","1","force");
            }
        }
        marker.discard();return 1;
    }
}
