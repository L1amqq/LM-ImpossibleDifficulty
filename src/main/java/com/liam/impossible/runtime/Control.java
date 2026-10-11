package com.liam.impossible.runtime;

import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.*;
import java.util.*;

/** Compiled control-flow steps, using native game state rather than command execution. */
public final class Control {
    @FunctionalInterface public interface Step { int run(Frame c,Logic.Action continuation) throws Exception; }
    public static int run(Frame c,Logic.Action action,Step... steps) throws Exception {return next(c,action,steps,0);}
    private static int next(Frame c,Logic.Action action,Step[] steps,int i) throws Exception {
        if(i==steps.length){Logic.success(null);return action.run(c);}
        return steps[i].run(c,n -> next(n,action,steps,i+1));
    }
    public static Step as(String value){return (c,k) -> {int n=0;for(Entity e:Native.entities(c,value))n+=k.run(c.with(c.source().withEntity(e)));return n;};}
    public static Step at(String value){return(c,k) -> {int n=0;for(Entity e:Native.entities(c,value))n+=k.run(c.with(c.source().withLevel((net.minecraft.server.level.ServerLevel)e.level()).withPosition(e.position()).withRotation(e.getRotationVector())));return n;};}
    public static Step dimension(String value){return(c,k)-> {var level=c.source().getServer().getLevel(ResourceKey.create(Registries.DIMENSION,Identifier.parse(c.expand(value))));return level==null?0:k.run(c.with(c.source().withLevel(level)));};}
    public static Step anchored(String value){return(c,k)-> k.run(c.with(c.source().withAnchor(value.equals("eyes")?EntityAnchorArgument.Anchor.EYES:EntityAnchorArgument.Anchor.FEET)));}
    public static Step align(String value){return(c,k)-> {Vec3 p=c.source().getPosition();return k.run(c.with(c.source().withPosition(new Vec3(value.contains("x")?Math.floor(p.x):p.x,value.contains("y")?Math.floor(p.y):p.y,value.contains("z")?Math.floor(p.z):p.z))));};}
    public static Step positioned(String... args){return(c,k)-> {String[] a=c.expand(args);if(a[0].equals("as")){int n=0;for(Entity e:Native.entities(c,a[1]))n+=k.run(c.with(c.source().withPosition(e.position()).withAnchor(EntityAnchorArgument.Anchor.FEET)));return n;}if(a[0].equals("over")) {var type=net.minecraft.world.level.levelgen.Heightmap.Types.valueOf(a[1].toUpperCase(Locale.ROOT));BlockPos p=BlockPos.containing(c.source().getPosition());return k.run(c.with(c.source().withPosition(new Vec3(p.getX(),c.source().getLevel().getHeight(type,p.getX(),p.getZ()),p.getZ()))));}return k.run(c.with(c.source().withPosition(Native.position(c,a,0)).withAnchor(EntityAnchorArgument.Anchor.FEET)));};}
    public static Step rotated(String... args){return(c,k)-> {String[] a=c.expand(args);if(a[0].equals("as")){int n=0;for(Entity e:Native.entities(c,a[1]))n+=k.run(c.with(c.source().withRotation(e.getRotationVector())));return n;}return k.run(c.with(c.source().withRotation(Native.rotation(c,a,0))));};}
    public static Step facing(String... args){return(c,k)-> {String[] a=c.expand(args);if(a[0].equals("entity")){int n=0;for(Entity e:Native.entities(c,a[1]))n+=k.run(c.with(c.source().facing(e,a[2].equals("eyes")?EntityAnchorArgument.Anchor.EYES:EntityAnchorArgument.Anchor.FEET)));return n;}return k.run(c.with(c.source().facing(Native.position(c,a,0))));};}
    public static Step on(String relation){return(c,k)-> {Entity e=c.source().getEntity();if(e==null)return 0;List<Entity> list=switch(relation){case "passengers"->e.getPassengers();case "vehicle"->e.getVehicle()==null?List.of():List.of(e.getVehicle());case "origin"->Native.origin(e);case "attacker"->e instanceof LivingEntity l&&l.getLastHurtByMob()!=null?List.of(l.getLastHurtByMob()):List.of();case "target"->e instanceof net.minecraft.world.entity.Mob m&&m.getTarget()!=null?List.of(m.getTarget()):List.of();default->throw new IllegalArgumentException("relation "+relation);};int n=0;for(Entity target:list)n+=k.run(c.with(c.source().withEntity(target)));return n;};}
    public static Step when(String... args){return(c,k)->test(c,c.expand(args))?k.run(c):Logic.result(0,false);}
    public static Step unless(String... args){return(c,k)->!test(c,c.expand(args))?k.run(c):Logic.result(0,false);}
    private static boolean test(Frame c,String[] a) throws Exception {
        return switch(a[0]) {
            case "entity" -> !Native.entities(c,a[1]).isEmpty();
            case "predicate" -> Predicates.test(c,a[1]);
            case "dimension" -> c.source().getLevel().dimension().identifier().equals(Identifier.parse(a[1]));
            case "score" -> {
                var left=Native.scoreInfo(c,a[1],a[2]);if(left==null)yield false;
                if(a[3].equals("matches"))yield Native.matches(left.value(),a[4]);
                var right=Native.scoreInfo(c,a[4],a[5]);if(right==null)yield false;
                int l=left.value(),r=right.value();yield switch(a[3]){case "="->l==r;case ">"->l>r;case "<"->l<r;case ">="->l>=r;case "<="->l<=r;default->false;};
            }
            case "block" -> Native.blockMatches(c,Native.blockPos(c,a,1),a[4]);
            case "loaded" -> c.source().getLevel().hasChunkAt(Native.blockPos(c,a,1));
            case "data" -> {var target=Native.target(c,a,1);yield Native.path(a[target.next()]).countMatching(target.data())>0;}
            case "function" -> Logic.call(c,a[1])!=0;
            case "blocks" -> Native.compareBlocks(c,a);
            default -> throw new UnsupportedOperationException("condition "+a[0]);
        };
    }
    public static Step store(String... args){return(c,k)-> {int result;boolean successful;try{result=k.run(c);successful=Logic.successful();}catch(Exception error){result=0;successful=false;}String[] a=c.expand(args);int value=a[0].equals("success")?(successful?1:0):result;
        if(a[1].equals("score")) Native.setScore(c,a[2],a[3],value);
        else if(a[1].equals("bossbar")) Native.bossbar(c,"set",a[2],a[3],Integer.toString(value));
        else {var target=Native.target(c,a,1);var data=target.data();Native.path(a[target.next()]).set(data,Native.number(a[target.next()+1],value*Double.parseDouble(a[target.next()+2])));target.write(data);}
        return Logic.result(result,successful);};}
}
