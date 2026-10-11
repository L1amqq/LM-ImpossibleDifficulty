package com.liam.impossible.runtime;

import com.liam.impossible.mixin.ChestBlockEntityAccessor;
import net.minecraft.core.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraft.world.phys.*;
import java.util.*;

/** Keep the real container open and animate only its visitor. No block replacement or underground clones. */
public final class ChestEncounters {
    private static final Map<MinecraftServer,Map<ChestBlockEntity,Encounter>> ACTIVE=new IdentityHashMap<>();
    private static final class Encounter {
        final ChestBlockEntity chest;
        final ContainerOpenersCounter counter;
        final ServerPlayer owner;
        final ServerLevel level;
        final BlockPos position;
        final ContainerUser visitor;
        int age;
        Entity root;
        Encounter(ChestBlockEntity chest,ServerPlayer owner,ServerLevel level) {
            this.chest=chest;this.owner=owner;this.level=level;position=chest.getBlockPos().immutable();
            counter=((ChestBlockEntityAccessor)chest).impossible$getOpeners();
            visitor=new ContainerUser() {
                @Override public boolean hasContainerOpen(ContainerOpenersCounter value,BlockPos pos) {return value==counter&&pos.equals(position);}
                @Override public double getContainerInteractionRange() {return owner.getContainerInteractionRange();}
                @Override public LivingEntity getLivingEntity() {return owner;}
            };
        }
    }
    public static void open(ChestBlockEntity chest,ServerPlayer player) {
        if(!(chest.getLevel() instanceof ServerLevel level)||chest.isRemoved())return;
        var state=chest.getBlockState();
        if(!state.is(Blocks.CHEST)||state.getValue(ChestBlock.TYPE)!=ChestType.SINGLE)return;
        Frame context=new Frame(player.createCommandSourceStack());
        if(!Predicates.test(context,"mcm:gm/vulnerable"))return;
        if(disabled(context))return;
        var encounters=ACTIVE.computeIfAbsent(level.getServer(),server->new IdentityHashMap<>());
        if(encounters.containsKey(chest))return;
        Encounter encounter=new Encounter(chest,player,level);encounters.put(chest,encounter);
        // Count one virtual visitor before a real player can close the menu.
        encounter.counter.incrementOpeners(player,level,encounter.position,state,player.getContainerInteractionRange());
        Logic.call(context,"impossible_to_survive:challenge/feature_encounter/chest");
    }
    private static boolean disabled(Frame context) {
            try {var score=Native.scoreInfo(context,"#global","disabled_chest");return score!=null&&score.value()==1;}
            catch(Exception error){Logic.warn("chest settings",error);return true;}
    }
    public static ContainerUser holder(Level level,BlockPos position,ContainerOpenersCounter counter) {
        if(!(level instanceof ServerLevel serverLevel))return null;
        var encounters=ACTIVE.get(serverLevel.getServer());if(encounters==null)return null;
        var blockEntity=level.getBlockEntity(position);
        if(!(blockEntity instanceof ChestBlockEntity chest))return null;
        var encounter=encounters.get(chest);
        return encounter!=null&&encounter.counter==counter?encounter.visitor:null;
    }
    public static boolean active(ChestBlockEntity chest) {
        if(!(chest.getLevel() instanceof ServerLevel level))return false;
        return ACTIVE.getOrDefault(level.getServer(),Map.of()).containsKey(chest);
    }
    /** The original shot starts inside the container. Exempt only this visitor's own, still-present chest. */
    public static boolean insideSourceChest(Frame frame) {
        var encounters=ACTIVE.get(frame.source().getServer());
        if(encounters==null||frame.source().getEntity()==null)return false;
        BlockPos position=BlockPos.containing(frame.source().getPosition());
        for(Encounter encounter:encounters.values())
            if(encounter.root==frame.source().getEntity()&&encounter.level==frame.source().getLevel()
                &&encounter.position.equals(position)&&!encounter.chest.isRemoved()
                &&encounter.level.getBlockEntity(position)==encounter.chest)return true;
        return false;
    }
    public static int request(Frame frame) {
        if(!(frame.source().getEntity() instanceof ServerPlayer player))return 0;
        if(player.pick(7,1,false) instanceof BlockHitResult hit&&player.level().getBlockEntity(hit.getBlockPos()) instanceof ChestBlockEntity chest) {
            open(chest,player);return active(chest)?1:0;
        }
        return 0;
    }
    public static void tick(MinecraftServer server) {
        if(!server.tickRateManager().runsNormally())return;
        var encounters=ACTIVE.get(server);if(encounters==null)return;
        var iterator=encounters.values().iterator();
        while(iterator.hasNext()) {
            Encounter encounter=iterator.next();
            boolean present=!encounter.chest.isRemoved()&&encounter.level.getBlockEntity(encounter.position)==encounter.chest;
            if(!present||!encounter.level.hasChunkAt(encounter.position)) {
                finish(encounter,present);iterator.remove();continue;
            }
            try {
                int frame=++encounter.age-10;
                if(frame==0)spawn(encounter);
                if(frame>0&&frame<80)animate(encounter,frame);
                if(frame>=80) {finish(encounter,true);iterator.remove();}
            } catch(Exception error) {
                Logic.warn("chest encounter",error);finish(encounter,true);iterator.remove();
            }
        }
        if(encounters.isEmpty())ACTIVE.remove(server);
    }
    private static Frame context(Encounter encounter) {
        return new Frame(encounter.level.getServer().createCommandSourceStack().withLevel(encounter.level)
            .withPosition(Vec3.atBottomCenterOf(encounter.position)));
    }
    private static void spawn(Encounter encounter) throws Exception {
        float yaw=switch(encounter.chest.getBlockState().getValue(ChestBlock.FACING)) {
            case EAST->-90;case WEST->90;case NORTH->180;default->0;
        };
        Frame frame=context(encounter);frame=frame.with(frame.source().withRotation(new Vec2(0,yaw)));
        Logic.call(frame,"animated_java:chest_mob/summon","{args:{variant:'shulker',animation:'shoot',start_animation:true}}");
        encounter.root=Native.entity(frame,"@e[type=item_display,tag=aj.chest_mob.root,distance=..0.01,sort=nearest,limit=1]");
        encounter.root.addTag("impossible.chest_visitor");
        for(Entity bone:encounter.root.getPassengers())
            if(bone instanceof Display.ItemDisplay display&&(bone.getTags().contains("aj.chest_mob.bone.chest")||bone.getTags().contains("aj.chest_mob.bone.chest_lid")))
                display.setItemStack(net.minecraft.world.item.ItemStack.EMPTY);
    }
    private static void animate(Encounter encounter,int frame) throws Exception {
        Frame source=context(encounter);
        switch(frame) {
            case 5 -> Native.playsound(source,"minecraft:item.bundle.drop_contents","master","@a","~","~","~","1.0","1.0");
            case 21 -> Native.playsound(source,"minecraft:water_gun_reload","master","@a","~","~","~","1.0","1.0");
            case 40 -> Native.playsound(source,"minecraft:water_gun_shot_1","master","@a","~","~","~","1.0","0.95");
            case 48 -> Native.playsound(source,"minecraft:water_gun_shot_2","master","@a","~","~","~","1.0","1.0");
            case 56 -> Native.playsound(source,"minecraft:water_gun_shot_3","master","@a","~","~","~","1.0","1.1");
        }
        if(encounter.root==null||encounter.root.isRemoved())return;
        Frame root=source.with(source.source().withEntity(encounter.root).withPosition(encounter.root.position()).withRotation(encounter.root.getRotationVector()));
        if(frame>=15&&frame<=70)Logic.call(root,"impossible_to_survive:features/chest_mob/zzz/21");
        if(frame==44||frame==52||frame==60)Logic.call(root,"impossible_to_survive:features/chest_mob/shoot_player");
    }
    private static void finish(Encounter encounter,boolean release) {
        if(encounter.root!=null&&!encounter.root.isRemoved()) {
            Frame frame=context(encounter);
            Logic.call(frame.with(frame.source().withEntity(encounter.root)),"animated_java:chest_mob/remove/this");
        }
        if(release&&!encounter.chest.isRemoved())encounter.counter.decrementOpeners(encounter.owner,encounter.level,encounter.position,encounter.chest.getBlockState());
    }
    public static void stopped(MinecraftServer server) {ACTIVE.remove(server);}
}
