package com.liam.impossible.runtime;

import net.minecraft.nbt.*;
import net.minecraft.server.MinecraftServer;
import org.slf4j.LoggerFactory;
import java.util.*;

/** Compiled Java programs. This registry has no connection to Minecraft's function manager. */
public final class Logic {
    @FunctionalInterface public interface Action { int run(Frame frame) throws Exception; }
    @FunctionalInterface public interface Statement { int run() throws Exception; }
    private static final Map<String,Action> PROGRAMS=new HashMap<>();
    private static final Map<String,List<String>> MACROS=new HashMap<>();
    private static final Map<String,List<String>> TAGS=new HashMap<>();
    private static final Set<String> WARNED=new HashSet<>();
    private static final Map<MinecraftServer,Map<String,Long>> SCHEDULES=new WeakHashMap<>();
    private static final ThreadLocal<Integer> DEPTH=ThreadLocal.withInitial(() -> 0);
    private static final ThreadLocal<Boolean> SUCCESS=new ThreadLocal<>();
    private static final ThreadLocal<net.minecraft.world.entity.Entity> ATTACK_OWNER=new ThreadLocal<>();
    static net.minecraft.world.entity.Entity attackOwner(){return ATTACK_OWNER.get();}
    public static void success(Boolean value){SUCCESS.set(value);}
    public static boolean successful(){return SUCCESS.get()==null||SUCCESS.get();}
    public static int result(int value,boolean success){SUCCESS.set(success);return value;}
    public static void register(String name,Action code,String... required) { PROGRAMS.put(name,code);MACROS.put(name,List.of(required)); }
    public static boolean hasAction(String name){return PROGRAMS.containsKey(name);}
    public static void wrap(String name,java.util.function.UnaryOperator<Action> wrapper) {
        PROGRAMS.put(name,wrapper.apply(Objects.requireNonNull(PROGRAMS.get(name),"Missing native action: "+name)));
    }
    public static void functionTag(String name,String... values) { TAGS.put(name,List.of(values)); }
    public static int call(Frame c,String... args) {
        String[] a=c.expand(args);String name=a[0];CompoundTag parameters=new CompoundTag();
        // A rig can disappear during a damage or animation callback in this tick.
        // Do not start another rig operation using its stale executor.
        if(name.startsWith("animated_java:")&&c.source().getEntity()!=null&&c.source().getEntity().isRemoved())
            return result(0,false);
        try {
            if(a.length>1) {
                if(a[1].equals("with")) {
                    var target=Native.target(c,a,2);
                    Tag value=target.data();
                    if(a.length>target.next()) value=Native.path(a[target.next()]).get(value).getFirst();
                    if(value instanceof CompoundTag t) parameters=t.copy();
                } else parameters=Native.compound(a[1]);
            }
            Frame next=new Frame(c.source(),parameters);
            if(name.startsWith("#")) {int n=0;for(String member:TAGS.getOrDefault(name.substring(1),List.of())) n+=call(next,member);return n;}
            Action code=PROGRAMS.get(name);
            if(code==null) {missing(name);return result(0,false);}
            for(String key:MACROS.getOrDefault(name,List.of()))if(!parameters.contains(key)){if(Boolean.getBoolean("impossible.smoke"))LoggerFactory.getLogger("impossible_difficulty").info("SMOKE missing macro {} in {}",key,name);return result(0,false);}
            int depth=DEPTH.get();if(depth>256) throw new IllegalStateException("Native logic recursion exceeded: "+name);
            DEPTH.set(depth+1);
            var previousOwner=ATTACK_OWNER.get();var owner=DragonAttacks.owner(next.source().getEntity());
            if(owner!=null)ATTACK_OWNER.set(owner);
            try{return result(code.run(next),true);}catch(ReturnValue r){return result(r.value,r.success);}finally{DEPTH.set(depth);if(previousOwner==null)ATTACK_OWNER.remove();else ATTACK_OWNER.set(previousOwner);}
        } catch(Native.NoTarget | com.mojang.brigadier.exceptions.CommandSyntaxException e){return result(0,false);}
        catch(Exception e) {warn("function "+name,e);return result(0,false);}
    }
    public static void step(Statement code) {
        try {code.run();} catch(ReturnValue r) {throw r;} catch(Native.NoTarget | com.mojang.brigadier.exceptions.CommandSyntaxException e){success(false);}catch(Exception e) {warn(e.getClass().getName()+": "+e.getMessage(),e);}
    }
    public static int returnValue(int value) {throw new ReturnValue(value,true);}
    public static int returnFromAction(int value) {throw new ReturnValue(value,successful());}
    public static int returnFailed() {throw new ReturnValue(0,false);}
    private static class ReturnValue extends RuntimeException {
        final int value;final boolean success;ReturnValue(int value,boolean success){super(null,null,false,false);this.value=value;this.success=success;}
    }
    public static void missing(String name){if(WARNED.add(name))LoggerFactory.getLogger("impossible_difficulty").warn("Original source references absent logic: {}",name);}
    public static void warn(String key,Exception error){if(WARNED.add(key))LoggerFactory.getLogger("impossible_difficulty").error("Native mechanic failed: {}",key,error);}
    public static void schedule(MinecraftServer server,String name,long ticks,boolean append) {
        var map=SCHEDULES.computeIfAbsent(server,s -> new LinkedHashMap<>());
        String key=append?name+"|"+UUID.randomUUID():name;
        map.put(key,server.overworld().getGameTime()+ticks);
    }
    public static void tick(MinecraftServer server) {
        if(server.tickRateManager().runsNormally())call(new Frame(server.createCommandSourceStack()),"#minecraft:tick");
    }
    public static void scheduledTick(MinecraftServer server) {
        var map=SCHEDULES.computeIfAbsent(server,s -> new LinkedHashMap<>());long now=server.overworld().getGameTime();
        List<String> due=new ArrayList<>();var it=map.entrySet().iterator();
        while(it.hasNext()){var entry=it.next();if(entry.getValue()<=now){due.add(entry.getKey().split("\\|",2)[0]);it.remove();}}
        Frame c=new Frame(server.createCommandSourceStack());for(String name:due)call(c,name);
    }
    public static void stopped(MinecraftServer server){SCHEDULES.remove(server);}
}
