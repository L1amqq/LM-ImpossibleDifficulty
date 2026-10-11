package com.liam.impossible.runtime;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.cow.Cow;
import net.minecraft.world.entity.animal.pig.Pig;
import net.minecraft.world.entity.animal.chicken.Chicken;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.Identifier;

/** Copy the source animal's registered variant to every visual replacement part. */
public final class MobAppearance {
    private static final String PREFIX="impossible.skin.";
    public static void inherit(Entity source,Entity replacement) {
        String animal,variant;
        if(source instanceof Cow cow) {
            animal="cow";variant=cow.getVariant().unwrapKey().map(key->key.identifier().getPath()).orElse("temperate");
        } else if(source instanceof Pig pig) {
            animal="pig";variant=pig.getVariant().unwrapKey().map(key->key.identifier().getPath()).orElse("temperate");
        } else if(source instanceof Chicken chicken) {
            animal="chicken";variant=chicken.getVariant().unwrapKey().map(key->key.identifier().getPath()).orElse("temperate");
        } else return;
        if(!variant.equals("warm")&&!variant.equals("cold"))variant="temperate";
        if(!replacement.getTags().contains("aj.matrix_cow.root")&&!replacement.getTags().contains("aj.bouncing_pig.root")&&
           !replacement.getTags().contains("chicken_component"))return;
        copy(replacement,animal,variant);
    }
    private static void copy(Entity entity,String animal,String variant) {
        entity.addTag(PREFIX+animal+"."+variant);refresh(entity);
        for(Entity passenger:entity.getPassengers())copy(passenger,animal,variant);
    }
    public static void refresh(Entity entity) {
        String skin=entity.getTags().stream().filter(tag->tag.startsWith(PREFIX)).findFirst().orElse(null);
        if(skin==null)return;
        String[] parts=skin.substring(PREFIX.length()).split("\\.");
        if(parts.length!=2)return;
        String bone=null;
        String group=parts[0].equals("cow")?"matrix_cow":parts[0].equals("pig")?"bouncing_pig":null;
        if(group!=null) {
            String prefix="aj."+group+".bone.";
            bone=entity.getTags().stream().filter(tag->tag.startsWith(prefix)).map(tag->tag.substring(prefix.length())).findFirst().orElse(null);
        } else if(entity.getTags().contains("chicken_head"))bone="head";
        else if(entity.getTags().contains("chicken_body"))bone="body";
        if(bone==null)return;
        Identifier model=Identifier.fromNamespaceAndPath("impossible_difficulty","mob/"+parts[0]+"/"+parts[1]+"/"+bone);
        if(entity instanceof Display.ItemDisplay display) {
            ItemStack current=display.getItemStack();if(current.isEmpty()||model.equals(current.get(DataComponents.ITEM_MODEL)))return;
            ItemStack stack=current.copy();
            stack.set(DataComponents.ITEM_MODEL,model);display.setItemStack(stack);
        } else if(entity instanceof LivingEntity living) {
            ItemStack current=living.getItemBySlot(EquipmentSlot.HEAD);if(current.isEmpty()||model.equals(current.get(DataComponents.ITEM_MODEL)))return;
            ItemStack stack=current.copy();
            stack.set(DataComponents.ITEM_MODEL,model);living.setItemSlot(EquipmentSlot.HEAD,stack);
        }
    }
}
