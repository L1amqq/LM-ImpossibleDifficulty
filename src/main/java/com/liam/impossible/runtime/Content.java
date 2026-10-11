package com.liam.impossible.runtime;

import com.google.gson.*;
import com.mojang.serialization.JsonOps;
import net.minecraft.nbt.*;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import java.util.*;

/** Original static content compiled into the mod, with schema upgrades. */
public final class Content {
    private static final Map<String,JsonElement> LOOT=new HashMap<>();
    private static final Map<String,LootTable> TABLES=new HashMap<>();
    public static void registerLoot(String id,String json){LOOT.put(id,upgradeJson(JsonParser.parseString(json)));}
    public static LootTable loot(Frame c,String id){return TABLES.computeIfAbsent(id,key->{var definition=LOOT.get(key);if(definition==null)return c.source().getServer().reloadableRegistries().getLootTable(net.minecraft.resources.ResourceKey.create(net.minecraft.core.registries.Registries.LOOT_TABLE,Identifier.parse(key)));return LootTable.DIRECT_CODEC.parse(c.source().registryAccess().createSerializationContext(JsonOps.INSTANCE),definition).getOrThrow();});}
    public static StructureTemplate structure(Frame c,Identifier id) throws Exception {
        String path="/impossible_difficulty/structures/"+id.getNamespace()+"/"+id.getPath()+".nbt";
        try(var stream=Content.class.getResourceAsStream(path)){if(stream==null)throw new IllegalArgumentException("Missing structure "+id);CompoundTag tag=NbtIo.readCompressed(stream,NbtAccounter.unlimitedHeap());StructureTemplate template=new StructureTemplate();template.load(c.source().registryAccess().lookupOrThrow(net.minecraft.core.registries.Registries.BLOCK),Schema.upgrade(tag));return template;}
    }
    private static JsonElement upgradeJson(JsonElement value){
        if(value.isJsonArray()){JsonArray a=new JsonArray();for(var entry:value.getAsJsonArray())a.add(upgradeJson(entry));return a;}
        if(!value.isJsonObject())return value;
        JsonObject obj=value.getAsJsonObject().deepCopy();
        if(obj.has("function")&&obj.get("function").getAsString().equals("minecraft:set_custom_model_data")&&obj.has("value")){JsonElement number=obj.remove("value");JsonObject floats=new JsonObject();JsonArray values=new JsonArray();values.add(number);floats.add("values",values);floats.addProperty("mode","replace_all");obj.add("floats",floats);}
        for(var entry:List.copyOf(obj.entrySet())){
            String key=entry.getKey();JsonElement child=entry.getValue();
            if(key.equals("minecraft:custom_model_data")&&child.isJsonPrimitive()){JsonObject cmd=new JsonObject();JsonArray floats=new JsonArray();floats.add(child);cmd.add("floats",floats);obj.add(key,cmd);}
            else if(key.equals("minecraft:hide_additional_tooltip")||key.equals("minecraft:hide_tooltip"))obj.remove(key);
            else obj.add(key,upgradeJson(child));
        }
        return Schema.modernJson(obj);
    }
    public static void clear(){TABLES.clear();}
    public static boolean hasLoot(String id){return LOOT.containsKey(id);}
    public static int validate(Frame c){int count=0;for(String id:LOOT.keySet()){var table=loot(c,id);var params=new net.minecraft.world.level.storage.loot.LootParams.Builder(c.source().getLevel()).withParameter(net.minecraft.world.level.storage.loot.parameters.LootContextParams.ORIGIN,c.source().getPosition()).create(net.minecraft.world.level.storage.loot.parameters.LootContextParamSets.COMMAND);table.getRandomItems(params);count++;}return count;}
}
