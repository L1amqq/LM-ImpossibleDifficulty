package com.liam.impossible.runtime;

/** Show the tail target as soon as the first slam enters its teaching stage. */
public final class DragonTutorial {
    public static void showTailHint(Frame frame) throws Exception {
        if(DragonLifecycle.score(frame,"activity",-1)!=16||DragonLifecycle.score(frame,"sub_activity",-1)!=3
            ||DragonLifecycle.score(frame,"has_tail",0)!=1||DragonLifecycle.score(frame,"activity.timer",21)>20)return;
        if(Native.entities(frame,"@e[type=item_display,tag=mcm.its.dragon.tutorial.red_arrow]").isEmpty()){
            // Keep the authored hints, arrow models and tail-vulnerability rules.
            Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/zzz/369");
            Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/zzz/372");
        }
        // The original timer pauses at ten until another hit and spawns arrows at twenty.
        // Continue after that sequence so neither messages nor arrows are repeated.
        Native.setScore(frame,"@s","mcm.its.dragon.activity.timer",21);
    }
}
