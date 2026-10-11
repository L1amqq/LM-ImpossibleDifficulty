package com.liam.impossible.runtime;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;

/** Damage and disposal regressions, including the original public rig diagnostic. */
public final class RigLifecycleSmokeTests {
    public static int run(Frame c) throws Exception {
        var errors=new ArrayList<String>();
        Logic.wrap("animated_java:global/errors/function_not_executed_as_root_entity",original->frame->{
            errors.add(frame.arguments().getStringOr("function_path",""));
            return original.run(frame);
        });
        int saved=Native.scoreInfo(c,"#global","mcm.its.overall_difficulty").value();
        int passed=0;
        try {
            for(int difficulty=1;difficulty<=3;difficulty++) {
                Native.setScore(c,"#global","mcm.its.overall_difficulty",difficulty);
                Logic.call(c,"impossible_to_survive:mobs/flying_book/spawn");
                Entity root=Native.entity(c,"@e[type=item_display,tag=aj.flying_book.root,limit=1]");
                Frame context=new Frame(c.source().withEntity(root).withPosition(root.position()));
                var parts=new ArrayList<>(root.getPassengers());
                Entity ai=Native.entity(c,"@e[type=vex,tag=flying_book_ai,limit=1]");
                ai.addTag("this_flying_book_ai");
                int health=Native.scoreInfo(context,"@s","mobHealth").value();
                check(health==difficulty*2,"book health follows difficulty");passed++;
                for(int hit=1;hit<health;hit++) {
                    Logic.call(context,"impossible_to_survive:mobs/flying_book/damage");
                    check(!root.isRemoved()&&Native.scoreInfo(context,"@s","mobHealth").value()==health-hit,"nonfatal hit keeps rig and reduces health");passed++;
                    Entity cover=parts.stream().filter(e->e.getTags().contains("aj.flying_book.bone.right_half")).findFirst().orElseThrow();
                    check(model(cover)==5,"nonfatal hit applies red cover");passed++;
                    for(int tick=0;tick<8;tick++)Logic.call(context,"impossible_to_survive:mobs/flying_book/damage_timer");
                    check(model(cover)==3,"red cover returns to default");passed++;
                }
                Logic.call(context,"impossible_to_survive:mobs/flying_book/damage");
                check(root.isRemoved()&&parts.stream().allMatch(Entity::isRemoved),"fatal hit removes entire book rig");passed++;
                check(!ai.isAlive(),"fatal hit kills the linked vex");passed++;
                check(Logic.call(context,"animated_java:flying_book/variants/red/apply")==0&&!Logic.successful(),"stale variant operation fails without diagnostic");passed++;
                check(errors.isEmpty(),"book lifecycle has no root executor error: "+errors);passed++;
                Native.kill(c,"@e[tag=flying_book_ai]");
            }
            for(int cycle=0;cycle<3;cycle++) {
                Logic.call(c,"impossible_to_survive:features/sculk_hand/summon");
                Entity root=Native.entity(c,"@e[type=item_display,tag=aj.sculk_hand.root,limit=1]");
                Frame context=new Frame(c.source().withEntity(root).withPosition(root.position()));
                var parts=new ArrayList<>(root.getPassengers());
                Entity data=parts.stream().filter(e->e.getType()==EntityType.MARKER).findFirst().orElseThrow();
                String locatorId=Native.entityData(data).getCompoundOrEmpty("data").getCompoundOrEmpty("locators").getCompoundOrEmpty("sculk_hand_locator").getStringOr("uuid","");
                Entity locator=Native.entity(context,locatorId);
                for(int tick=1;tick<=24;tick++) {
                    Logic.call(context,"impossible_to_survive:features/sculk_hand/loop");
                    Logic.call(context,"animated_java:sculk_hand/root/on_tick");
                    if(tick<24){check(!root.isRemoved(),"hand remains present through grab animation");passed++;}
                }
                check(root.isRemoved()&&parts.stream().allMatch(Entity::isRemoved),"hand lifetime cleans up all passengers");passed++;
                check(locator.isRemoved(),"hand locator is removed");passed++;
                check(Logic.call(context,"animated_java:sculk_hand/remove/this")==0,"repeated removal uses no stale rig");passed++;
                check(errors.isEmpty(),"hand lifecycle has no root executor error: "+errors);passed++;
            }
            // The fix must retain diagnostics for genuinely incorrect, live executors.
            Logic.call(c,"animated_java:flying_book/variants/red/apply");
            check(errors.size()==1&&errors.getFirst().equals("animated_java:flying_book/variants/red/apply"),"real executor errors remain observable");passed++;
        } finally {
            Native.setScore(c,"#global","mcm.its.overall_difficulty",saved);
            Native.kill(c,"@e[tag=aj.rig_entity]");Native.kill(c,"@e[tag=aj.sculk_hand_locator]");Native.kill(c,"@e[tag=flying_book_ai]");
        }
        LoggerFactory.getLogger("impossible_difficulty").info("RIG_LIFECYCLE_PASS: {} assertions; book hits/death across difficulties, red reset, three hand lifetimes, stale callbacks, real diagnostic preserved",passed);
        return passed;
    }
    private static float model(Entity entity){
        return ((net.minecraft.world.entity.Display.ItemDisplay)entity).getItemStack().get(net.minecraft.core.component.DataComponents.CUSTOM_MODEL_DATA).getFloat(0);
    }
    private static void check(boolean condition,String message){if(!condition)throw new IllegalStateException(message);}
}
