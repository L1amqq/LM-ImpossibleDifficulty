package com.liam.impossible.runtime;

import com.google.gson.*;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.*;
import net.minecraft.network.chat.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import java.util.*;

/** Explicit migrations for the 1.21.1 entity/item schema used by the source. */
public final class Schema {
    private static final String[] ARMOR={"feet","legs","chest","head"},HANDS={"mainhand","offhand"};
    public static CompoundTag upgrade(CompoundTag input) {
        CompoundTag t=input.copy();
        if(t.contains("Particle")&&!t.contains("custom_particle")) {
            Tag particle=t.get("Particle");
            if(particle instanceof StringTag value) {
                CompoundTag migrated=new CompoundTag();migrated.putString("type",value.value());particle=migrated;
            }
            t.put("custom_particle",particle.copy());t.remove("Particle");
        }
        if(t.get("Rotation") instanceof ListTag rotation&&rotation.size()==1)rotation.add(FloatTag.valueOf(0));
        if(t.get("transformation") instanceof CompoundTag transform){
            try {
                if(!transform.contains("translation"))transform.put("translation",Native.tagValue("[0f,0f,0f]"));
                if(!transform.contains("scale"))transform.put("scale",Native.tagValue("[1f,1f,1f]"));
                if(!transform.contains("left_rotation"))transform.put("left_rotation",Native.tagValue("[0f,0f,0f,1f]"));
                if(!transform.contains("right_rotation"))transform.put("right_rotation",Native.tagValue("[0f,0f,0f,1f]"));
            }catch(Exception error){throw new IllegalArgumentException(error);}
        }
        if(t.contains("ArmorItems")||t.contains("HandItems")){
            CompoundTag equipment=t.getCompoundOrEmpty("equipment").copy();
            equipment(t,"ArmorItems",ARMOR,equipment);equipment(t,"HandItems",HANDS,equipment);t.put("equipment",equipment);
        }
        if(t.contains("ArmorDropChances")||t.contains("HandDropChances")){
            CompoundTag chances=t.getCompoundOrEmpty("drop_chances").copy();
            dropChances(t,"ArmorDropChances",ARMOR,chances);dropChances(t,"HandDropChances",HANDS,chances);t.put("drop_chances",chances);
        }
        rename(t,"FallDistance","fall_distance");rename(t,"Attributes","attributes");rename(t,"active_effects","active_effects");
        if(t.get("attributes") instanceof ListTag list)for(Tag entry:list)if(entry instanceof CompoundTag a){rename(a,"Name","id");rename(a,"Base","base");String id=a.getStringOr("id","").replace("generic.","").replace("player.","");a.putString("id",id);}
        for(String key:List.copyOf(t.keySet())){
            Tag value=t.get(key);
            if(key.equals("Passengers")&&value instanceof ListTag list){ListTag valid=new ListTag();for(Tag passenger:list)if(passenger instanceof CompoundTag object&&object.contains("id"))valid.add(upgrade(object));t.put(key,valid);continue;}
            if(key.equals("minecraft:custom_model_data")&&value instanceof NumericTag n){CompoundTag cmd=new CompoundTag();ListTag floats=new ListTag();floats.add(FloatTag.valueOf(n.floatValue()));cmd.put("floats",floats);t.put(key,cmd);continue;}
            if(Set.of("CustomName","text","minecraft:custom_name","minecraft:item_name").contains(key)) {
                try {
                    JsonElement component=value instanceof StringTag s?JsonParser.parseString(s.value()):NbtOps.INSTANCE.convertTo(JsonOps.INSTANCE,value);
                    t.put(key,JsonOps.INSTANCE.convertTo(NbtOps.INSTANCE,modernJson(GameplayText.literal(component))));
                }catch(Exception ignored){}
                continue;
            }
            if(key.equals("minecraft:enchantments")&&value instanceof CompoundTag enchantments&&enchantments.contains("levels")){t.put(key,enchantments.getCompoundOrEmpty("levels").copy());continue;}
            if(value instanceof CompoundTag object)t.put(key,upgrade(object));
            else if(value instanceof ListTag list){ListTag converted=new ListTag();for(Tag item:list)converted.add(item instanceof CompoundTag object?upgrade(object):item.copy());t.put(key,converted);}
        }
        if(t.get("block_state") instanceof StringTag s){CompoundTag state=new CompoundTag();state.putString("Name",s.value());t.put("block_state",state);}
        return t;
    }
    private static void equipment(CompoundTag t,String key,String[] slots,CompoundTag out){if(t.get(key) instanceof ListTag list){for(int i=0;i<Math.min(list.size(),slots.length);i++){Tag item=list.get(i);if(item instanceof CompoundTag object&&!object.contains("id"))out.remove(slots[i]);else out.put(slots[i],item.copy());}t.remove(key);}}
    private static void dropChances(CompoundTag t,String key,String[] slots,CompoundTag out){if(t.get(key) instanceof ListTag list){for(int i=0;i<Math.min(list.size(),slots.length);i++)out.put(slots[i],list.get(i).copy());t.remove(key);}}
    private static void rename(CompoundTag t,String from,String to){if(!from.equals(to)&&t.contains(from)){t.put(to,t.get(from));t.remove(from);}}
    public static CompoundTag legacyView(CompoundTag tag,Entity e){
        if(tag.contains("fall_distance"))tag.put("FallDistance",tag.get("fall_distance"));
        if(tag.get("equipment") instanceof CompoundTag eq){ListTag armor=new ListTag(),hands=new ListTag();for(String slot:ARMOR)armor.add(eq.getCompoundOrEmpty(slot).copy());for(String slot:HANDS)hands.add(eq.getCompoundOrEmpty(slot).copy());tag.put("ArmorItems",armor);tag.put("HandItems",hands);}
        if(e instanceof Player p){tag.putInt("playerGameType",p instanceof net.minecraft.server.level.ServerPlayer s?s.gameMode.getGameModeForPlayer().getId():0);ListTag inventory=tag.getListOrEmpty("Inventory").copy();EquipmentSlot[] slots={EquipmentSlot.FEET,EquipmentSlot.LEGS,EquipmentSlot.CHEST,EquipmentSlot.HEAD,EquipmentSlot.OFFHAND};for(int i=0;i<slots.length;i++){var item=p.getItemBySlot(slots[i]);if(!item.isEmpty()){Tag itemTag=net.minecraft.world.item.ItemStack.CODEC.encodeStart(e.registryAccess().createSerializationContext(NbtOps.INSTANCE),item).getOrThrow();CompoundTag value=(CompoundTag)itemTag;value.putByte("Slot",(byte)(i==4?-106:100+i));inventory.add(value);}}tag.put("Inventory",inventory);}
        return tag;
    }
    public static Component component(String json,HolderLookup.Provider registries) {
        JsonElement value;
        try{value=modernJson(GameplayText.literal(JsonParser.parseString(json)));}catch(Exception error){return Component.literal(json);}
        return ComponentSerialization.CODEC.parse(registries.createSerializationContext(JsonOps.INSTANCE),value).getOrThrow();
    }
    private static final Map<String,String> FURNACE_FIELDS=Map.of("BurnTime","lit_time_remaining","CookTime","cooking_time_spent","CookTimeTotal","cooking_total_time");
    public static CompoundTag blockView(CompoundTag tag,net.minecraft.world.level.block.entity.BlockEntity entity){
        if(entity instanceof net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity)
            FURNACE_FIELDS.forEach((legacy,current)->{if(tag.contains(current))tag.put(legacy,tag.get(current).copy());});
        return tag;
    }
    public static CompoundTag blockInput(CompoundTag tag,CompoundTag baseline){
        CompoundTag result=tag.copy();
        FURNACE_FIELDS.forEach((legacy,current)->{
            if(baseline.contains(current)){
                if(tag.contains(legacy)&&!java.util.Objects.equals(tag.get(legacy),baseline.get(legacy)))result.put(current,tag.get(legacy).copy());
                result.remove(legacy);
            }
        });
        return upgrade(result);
    }
    public static JsonElement modernJson(JsonElement element){
        if(element.isJsonArray()){JsonArray result=new JsonArray();for(JsonElement e:GameplayText.joinGradient(element.getAsJsonArray()))result.add(modernJson(GameplayText.literal(e)));return result;}
        if(!element.isJsonObject())return element;
        JsonObject result=new JsonObject();for(var entry:element.getAsJsonObject().entrySet()){String k=entry.getKey();JsonElement value=entry.getValue();
            if(k.equals("hoverEvent")){k="hover_event";JsonObject event=value.getAsJsonObject().deepCopy();if(event.has("contents")){var contents=event.remove("contents");if(event.get("action").getAsString().equals("show_text"))event.add("value",contents);else event.add("value",contents);}value=event;}
            if(k.equals("clickEvent")){k="click_event";JsonObject event=value.getAsJsonObject().deepCopy();if(event.has("value")){var v=event.remove("value");String action=event.get("action").getAsString();event.add(action.equals("open_url")?"url":action.equals("change_page")?"page":"command",v);}value=event;}
            if(k.equals("command")&&value.isJsonPrimitive()&&value.getAsString().startsWith("/function "))value=new JsonPrimitive(value.getAsString().replaceFirst("/function ","/impossible action "));
            result.add(k,modernJson(value));
        }return GameplayText.component(result);
    }
    public static String itemSpec(String spec) throws Exception {
        int bracket=spec.indexOf('[');if(bracket<0)return spec;
        List<String> components=new ArrayList<>();
        for(String option:Native.splitOptions(spec.substring(bracket+1,spec.length()-1))){
            int equals=option.indexOf('=');if(equals<0){components.add(option);continue;}
            String key=option.substring(0,equals).trim(),id=key.replace("minecraft:","");
            if(id.equals("hide_additional_tooltip"))continue;
            if(id.equals("hide_tooltip")){components.add("tooltip_display={hide_tooltip:true}");continue;}
            Tag tag=Native.tagValue(option.substring(equals+1));
            if(id.equals("custom_model_data")&&tag instanceof NumericTag n){tag=Native.tagValue("{floats:["+n.floatValue()+"f]}");}
            if((id.equals("enchantments")||id.equals("stored_enchantments"))&&tag instanceof CompoundTag enchantments&&enchantments.contains("levels"))tag=enchantments.getCompoundOrEmpty("levels").copy();
            if(id.equals("custom_name")||id.equals("item_name"))tag=componentTag(tag);
            if(id.equals("lore")&&tag instanceof ListTag list){ListTag migrated=new ListTag();for(Tag line:list)migrated.add(componentTag(line));tag=migrated;}
            if(id.equals("written_book_content")&&tag instanceof CompoundTag book&&book.get("pages") instanceof ListTag pages){ListTag migrated=new ListTag();for(Tag page:pages)migrated.add(componentTag(page));book.put("pages",migrated);tag=book;}
            components.add(key+"="+tag);
        }
        return spec.substring(0,bracket)+"["+String.join(",",components)+"]";
    }
    private static Tag componentTag(Tag tag){
        try {
            JsonElement value=tag instanceof StringTag s?JsonParser.parseString(s.value()):NbtOps.INSTANCE.convertTo(JsonOps.INSTANCE,tag);
            return JsonOps.INSTANCE.convertTo(NbtOps.INSTANCE,modernJson(GameplayText.literal(value)));
        } catch(Exception error){return tag.copy();}
    }
    public static String particleSpec(String value){return value.equals("flash")||value.equals("minecraft:flash")?value+"{color:[1f,1f,1f,1f]}":value;}
}
