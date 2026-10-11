package com.liam.impossible.runtime;

import com.google.gson.*;
import net.minecraft.core.*;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.*;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import java.util.*;

/** The source predicates are Java conditions, independent of loot predicate resources. */
public final class Predicates {
    private static final Map<String,JsonElement> DEFINITIONS=new HashMap<>();
    public static void register(String name,String json){DEFINITIONS.put(name,JsonParser.parseString(json));}
    public static boolean test(Frame c,String name){try{boolean invert=name.startsWith("!");String key=invert?name.substring(1):name;var definition=DEFINITIONS.get(key);if(definition==null){Logic.missing("predicate "+key);return false;}return evaluate(c,definition)!=invert;}catch(Exception e){Logic.warn("predicate "+name,e);return false;}}
    private static boolean evaluate(Frame c,JsonElement definition) throws Exception {
        if(definition.isJsonArray()){for(var term:definition.getAsJsonArray())if(!evaluate(c,term))return false;return true;}
        JsonObject d=definition.getAsJsonObject();String condition=d.get("condition").getAsString().replace("minecraft:","");Entity e=c.source().getEntity();
        return switch(condition){
            case "reference"->test(c,d.get("name").getAsString());
            case "random_chance"->c.source().getLevel().random.nextFloat()<d.get("chance").getAsFloat();
            case "any_of"->{boolean match=false;for(var term:d.getAsJsonArray("terms"))if(evaluate(c,term)){match=true;break;}yield match;}
            case "entity_properties"->e!=null&&entity(c,e,d.getAsJsonObject("predicate"));
            case "entity_scores"->{if(e==null)yield false;boolean match=true;for(var entry:d.getAsJsonObject("scores").entrySet()){var value=Native.scoreInfo(c,"@s",entry.getKey());if(value==null||!range(value.value(),entry.getValue())){match=false;break;}}yield match;}
            case "location_check"->{var p=BlockPos.containing(c.source().getPosition()).offset(integer(d,"offsetX",0),integer(d,"offsetY",0),integer(d,"offsetZ",0));yield location(c,p,d.getAsJsonObject("predicate"));}
            default->throw new UnsupportedOperationException(condition);
        };
    }
    private static boolean entity(Frame c,Entity e,JsonObject d) throws Exception {
        if(d==null)return true;
        if(d.has("type")){String type=d.get("type").getAsString();String actual=BuiltInRegistries.ENTITY_TYPE.getKey(e.getType()).toString();if(type.equals("minecraft:boat")||type.equals("minecraft:chest_boat")){if(!actual.endsWith(type.endsWith("chest_boat")?"_chest_boat":"_boat"))return false;}else if(!actual.equals(type))return false;}
        if(d.has("nbt")&&!NbtUtils.compareNbt(Native.compound(d.get("nbt").getAsString()),Native.entityData(e),true))return false;
        if(d.has("vehicle")&&(e.getVehicle()==null||!entity(c,e.getVehicle(),d.getAsJsonObject("vehicle"))))return false;
        if(d.has("location")&&!location(c,e.blockPosition(),d.getAsJsonObject("location")))return false;
        if(d.has("flags")){var flags=d.getAsJsonObject("flags");if(flags.has("is_sneaking")&&flags.get("is_sneaking").getAsBoolean()!=e.isShiftKeyDown())return false;}
        if(d.has("type_specific")){var specific=d.getAsJsonObject("type_specific");if(!(e instanceof ServerPlayer p))return false;if(specific.has("gamemode")){boolean match=false;for(var value:specific.getAsJsonArray("gamemode"))if(value.getAsString().equals(p.gameMode.getGameModeForPlayer().getName()))match=true;if(!match)return false;}}
        if(d.has("equipment")){if(!(e instanceof LivingEntity l))return false;for(var entry:d.getAsJsonObject("equipment").entrySet()){var slot=EquipmentSlot.byName(entry.getKey());if(!item(c,l.getItemBySlot(slot),entry.getValue().getAsJsonObject()))return false;}}
        if(d.has("slots")){if(!(e instanceof Player p))return false;for(var entry:d.getAsJsonObject("slots").entrySet()){int start=entry.getKey().startsWith("hotbar")?0:9,end=entry.getKey().startsWith("hotbar")?9:36;boolean match=false;for(int i=start;i<end;i++)if(item(c,p.getInventory().getItem(i),entry.getValue().getAsJsonObject())){match=true;break;}if(!match)return false;}}
        return true;
    }
    private static boolean location(Frame c,BlockPos p,JsonObject d) throws Exception {
        if(d.has("dimension")&&!c.source().getLevel().dimension().identifier().equals(Identifier.parse(d.get("dimension").getAsString())))return false;
        if(d.has("block")){var block=d.getAsJsonObject("block");if(block.has("blocks")){var defs=block.get("blocks");boolean match=false;if(defs.isJsonArray()){for(var value:defs.getAsJsonArray())if(Native.blockMatches(c,p,value.getAsString())){match=true;break;}}else match=Native.blockMatches(c,p,defs.getAsString());if(!match)return false;}}
        return true;
    }
    private static boolean item(Frame c,ItemStack stack,JsonObject d) throws Exception {
        if(stack.isEmpty())return false;
        if(d.has("items")){var items=d.get("items");String id=BuiltInRegistries.ITEM.getKey(stack.getItem()).toString();if(items.isJsonArray()){boolean match=false;for(var value:items.getAsJsonArray())if(value.getAsString().equals(id))match=true;if(!match)return false;}else if(!items.getAsString().equals(id))return false;}
        if(d.has("components")){var components=d.getAsJsonObject("components");if(components.has("minecraft:custom_data")){var custom=stack.get(DataComponents.CUSTOM_DATA);if(custom==null||!NbtUtils.compareNbt(Native.compound(components.get("minecraft:custom_data").getAsString()),custom.copyTag(),true))return false;}}
        return true;
    }
    private static boolean range(int value,JsonElement range){if(range.isJsonPrimitive())return value==range.getAsInt();JsonObject r=range.getAsJsonObject();return(!r.has("min")||value>=r.get("min").getAsInt())&&(!r.has("max")||value<=r.get("max").getAsInt());}
    private static int integer(JsonObject obj,String key,int fallback){return obj.has(key)?obj.get(key).getAsInt():fallback;}
}
