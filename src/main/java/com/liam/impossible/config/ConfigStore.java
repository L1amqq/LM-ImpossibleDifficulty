package com.liam.impossible.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.liam.impossible.runtime.*;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.Difficulty;
import java.nio.file.*;
import java.io.IOException;
import org.slf4j.LoggerFactory;

public final class ConfigStore {
    private static final Gson GSON=new GsonBuilder().setPrettyPrinting().create();
    private static final Path FILE=FabricLoader.getInstance().getConfigDir().resolve("impossible-difficulty.json");
    private static volatile Settings settings=read(FILE);
    public static Settings local() { return settings; }
    public static Settings read(Path file) {
        if(!Files.exists(file))return Settings.DEFAULT;
        try(var reader=Files.newBufferedReader(file)) {
            Settings result=GSON.fromJson(reader,Settings.class);
            if(result==null || !result.valid())throw new IOException("Difficulty must be between 1 and 3");
            return result;
        } catch(Exception error) {
            LoggerFactory.getLogger("impossible_difficulty").error("Cannot read settings {}",file,error);
            return Settings.DEFAULT;
        }
    }
    public static void write(Path file,Settings value) throws IOException {
        if(!value.valid())throw new IOException("Invalid difficulty");
        Files.createDirectories(file.toAbsolutePath().getParent());
        Path temporary=file.resolveSibling(file.getFileName()+".tmp");
        Files.writeString(temporary,GSON.toJson(value)+System.lineSeparator());
        try {Files.move(temporary,file,StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.ATOMIC_MOVE);}
        catch(AtomicMoveNotSupportedException error) {Files.move(temporary,file,StandardCopyOption.REPLACE_EXISTING);}
    }
    public static boolean save(Settings value) {
        try {write(FILE,value);settings=value;return true;}
        catch(IOException error) {LoggerFactory.getLogger("impossible_difficulty").error("Cannot save settings",error);return false;}
    }
    public static void start(MinecraftServer server) {
        // Adopt existing world options on the first upgrade, then persist menu choices.
        if(!Files.exists(FILE))save(capture(server));
        apply(server,settings);
    }
    private static int score(Frame frame,String holder,String objective,int fallback) throws Exception {
        var score=Native.scoreInfo(frame,holder,objective);return score==null?fallback:score.value();
    }
    public static Settings capture(MinecraftServer server) {
        Frame frame=new Frame(server.createCommandSourceStack());
        try {return new Settings(score(frame,"#global","mcm.its.overall_difficulty",2),
            score(frame,"#difficulty","mcm.its.dragon.settings",2),score(frame,"#global","disable_armor_slowing",0)!=1,
            score(frame,"#global","disabled_endermen",0)!=1,score(frame,"#global","disabled_chest",0)!=1,
            score(frame,"#global","disabled_flashbang",0)==1);}
        catch(Exception error) {Logic.warn("capture config",error);return settings;}
    }
    public static void apply(MinecraftServer server,Settings value) {
        Frame frame=new Frame(server.createCommandSourceStack());
        Logic.step(()-> {
            Native.setScore(frame,"#global","mcm.its.overall_difficulty",value.difficulty());
            Native.setScore(frame,"#global","disable_armor_slowing",value.armorSlowdown()?0:1);
            Native.setScore(frame,"#global","disabled_endermen",value.endermen()?0:1);
            Native.setScore(frame,"#global","disabled_chest",value.chests()?0:1);
            Native.setScore(frame,"#global","disabled_flashbang",value.flashbang()?1:0);
            Logic.call(frame,"impossible_to_survive:mobs/impossible_dragon/settings/set_"+
                switch(value.dragonDifficulty()){case 1->"easy";case 3->"hard";default->"medium";});
            server.setDifficulty(Difficulty.byId(value.difficulty()),true);
            return 1;
        });
    }
    public static void tick(MinecraftServer server) {
        if(server.getTickCount()%20==0) {
            Settings live=capture(server);
            if(live.valid()&&!live.equals(settings))save(live);
        }
    }
}
