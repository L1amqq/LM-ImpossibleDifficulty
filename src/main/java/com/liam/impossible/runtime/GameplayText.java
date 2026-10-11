package com.liam.impossible.runtime;

import com.google.gson.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

/** Convert authored display text to client-language components without changing commands or identifiers. */
public final class GameplayText {
    private static final Map<String,String> KEYS=load();
    private static Map<String,String> load() {
        try(var stream=GameplayText.class.getResourceAsStream("/impossible_difficulty/text-keys.json")) {
            if(stream==null)throw new IOException("Missing gameplay text catalog");
            var catalog=JsonParser.parseReader(new InputStreamReader(stream,StandardCharsets.UTF_8)).getAsJsonObject();
            Map<String,String> keys=new HashMap<>();
            catalog.entrySet().forEach(entry->keys.put(entry.getKey(),entry.getValue().getAsString()));
            return Map.copyOf(keys);
        } catch(IOException error) {throw new IllegalStateException("Unable to load gameplay translations",error);}
    }
    public static JsonElement literal(JsonElement value) {
        if(!value.isJsonPrimitive()||!value.getAsJsonPrimitive().isString())return value;
        String text=value.getAsString(),key=KEYS.get(text);
        if(key==null)return value;
        JsonObject component=new JsonObject();component.addProperty("translate",key);component.addProperty("fallback",text);
        return component;
    }
    public static JsonObject component(JsonObject value) {
        if(!value.has("text")||!value.get("text").isJsonPrimitive()||!value.get("text").getAsJsonPrimitive().isString())return value;
        if(value.has("font")&&value.get("font").getAsString().equals("minecraft:icons"))return value;
        String text=value.get("text").getAsString(),key=KEYS.get(text);
        if(key!=null) {value.remove("text");value.addProperty("translate",key);value.addProperty("fallback",text);}
        return value;
    }
    // Old gradient headings consist of one- or two-letter components; translate them as complete phrases.
    public static JsonArray joinGradient(JsonArray array) {
        JsonArray result=new JsonArray();
        for(int i=0;i<array.size();) {
            int end=i;StringBuilder text=new StringBuilder();
            while(end<array.size()&&shortText(array.get(end))) {text.append(array.get(end).getAsJsonObject().get("text").getAsString());end++;}
            if(end>i+1&&KEYS.containsKey(text.toString())) {
                JsonObject style=array.get(i).getAsJsonObject().deepCopy();
                for(int j=i;j<end;j++)if(!array.get(j).getAsJsonObject().get("text").getAsString().isBlank()) {style=array.get(j).getAsJsonObject().deepCopy();break;}
                style.addProperty("text",text.toString());result.add(style);i=end;
            } else {result.add(array.get(i));i++;}
        }
        return result;
    }
    private static boolean shortText(JsonElement element) {
        if(!element.isJsonObject())return false;
        var value=element.getAsJsonObject();
        return value.has("text")&&value.get("text").isJsonPrimitive()&&value.get("text").getAsJsonPrimitive().isString()
            &&value.get("text").getAsString().length()<=3
            &&(!value.has("font")||value.get("font").getAsString().equals("minecraft:default"))
            &&Collections.disjoint(value.keySet(),Set.of("clickEvent","click_event","hoverEvent","hover_event","extra"));
    }
}
