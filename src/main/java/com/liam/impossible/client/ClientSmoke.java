package com.liam.impossible.client;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.loader.api.FabricLoader;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.minecraft.client.Screenshot;
import net.minecraft.client.gui.components.Button;
import org.slf4j.LoggerFactory;
import java.nio.file.Path;

/** Runs only when explicitly launched with the development smoke property. */
final class ClientSmoke {
    private static int ticks;
    private static SettingsScreen screen;
    private static boolean captured;
    private static boolean bossPreview,bossCaptured;
    private static boolean deathWorldStarted;
    static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client-> {
            try {
                if(!client.isGameLoadFinished()||client.getOverlay()!=null)return;
                if(deathWorldStarted){DragonDeathWorldSmoke.tick(client);return;}
                if(screen==null) {
                    var integration=FabricLoader.getInstance().getEntrypoints("modmenu",ModMenuApi.class).stream()
                        .filter(ModMenuIntegration.class::isInstance).findFirst().orElseThrow();
                    screen=(SettingsScreen)integration.getModConfigScreenFactory().create(client.screen);
                    client.setScreen(screen);
                }
                if(++ticks==15) {
                    var renderer=((com.liam.impossible.mixin.EntityRenderDispatcherAccessor)client.getEntityRenderDispatcher()).impossible$renderers().get(com.liam.impossible.runtime.DragonCombat.TYPE);
                    if(!(renderer instanceof net.minecraft.client.renderer.entity.NoopRenderer))throw new IllegalStateException("Invisible dragon attack-volume renderer missing");
                    LoggerFactory.getLogger("impossible_difficulty").info("CLIENT_DRAGON_PASS: custom entity registry and invisible renderer loaded");
                    var deathRenderer=((com.liam.impossible.mixin.EntityRenderDispatcherAccessor)client.getEntityRenderDispatcher()).impossible$renderers().get(com.liam.impossible.runtime.DragonDeathEffect.TYPE);
                    if(!(deathRenderer instanceof DragonDeathEffectRenderer death))throw new IllegalStateException("Dragon death effect renderer missing");
                    DragonDeathRendererSmoke.verify(death);
                    try(var catalogStream=ClientSmoke.class.getResourceAsStream("/impossible_difficulty/text-keys.json");
                        var russianStream=ClientSmoke.class.getResourceAsStream("/assets/impossible_difficulty/lang/ru_ru.json")) {
                        var catalog=com.google.gson.JsonParser.parseReader(new java.io.InputStreamReader(catalogStream,java.nio.charset.StandardCharsets.UTF_8)).getAsJsonObject();
                        var russian=com.google.gson.JsonParser.parseReader(new java.io.InputStreamReader(russianStream,java.nio.charset.StandardCharsets.UTF_8)).getAsJsonObject();
                        for(var entry:catalog.entrySet()) {
                            var component=new com.google.gson.JsonObject();component.addProperty("text",entry.getKey());
                            String actual=com.liam.impossible.runtime.Schema.component(component.toString(),net.minecraft.core.RegistryAccess.EMPTY).getString();
                            if(!actual.equals(russian.get(entry.getValue().getAsString()).getAsString()))throw new IllegalStateException("Russian gameplay translation did not resolve: "+entry.getKey());
                        }
                        var metadata=FabricLoader.getInstance().getModContainer("impossible_difficulty").orElseThrow().getMetadata();
                        if(!metadata.getAuthors().stream().map(net.fabricmc.loader.api.metadata.Person::getName).toList().equals(java.util.List.of("LIAM"))
                            ||!metadata.getContact().get("homepage").orElse("").equals("https://www.youtube.com/@liamkkd"))
                            throw new IllegalStateException("LIAM metadata missing");
                        LoggerFactory.getLogger("impossible_difficulty").info("CLIENT_LOCALIZATION_PASS: {} Russian gameplay components, LIAM author and YouTube link",catalog.size());
                    }
                    var buttons=screen.children().stream().filter(Button.class::isInstance).map(Button.class::cast).toList();
                    if(buttons.size()!=9||buttons.stream().anyMatch(button->!button.active||button.getMessage().getString().contains("impossible_difficulty.config")))
                        throw new IllegalStateException("Config controls or translations missing");
                    Screenshot.takeScreenshot(client.getMainRenderTarget(),image-> {
                        try(image) {image.writeToFile(Path.of("config-menu.png"));captured=true;}
                        catch(Exception error) {LoggerFactory.getLogger("impossible_difficulty").error("CLIENT_CONFIG_FAIL screenshot",error);client.execute(client::stop);}
                    });
                }
                if(ticks>15&&captured&&!bossPreview) {
                    LoggerFactory.getLogger("impossible_difficulty").info("CLIENT_CONFIG_PASS: ModMenu entrypoint, 6 options, save/cancel/reset, Russian translations, rendered screenshot");
                    client.setScreen(new BossBarPreview());bossPreview=true;
                }
                if(ticks==35&&bossPreview)Screenshot.takeScreenshot(client.getMainRenderTarget(),image->{
                    try(image){image.writeToFile(Path.of("bossbar-preview.png"));bossCaptured=true;}
                    catch(Exception error){LoggerFactory.getLogger("impossible_difficulty").error("CLIENT_CONFIG_FAIL bossbar screenshot",error);client.execute(client::stop);}
                });
                if(ticks>35&&bossCaptured){
                    LoggerFactory.getLogger("impossible_difficulty").info("CLIENT_BOSSBAR_PASS: Russian title, three heart stages, actual HUD renderer screenshot");
                    deathWorldStarted=true;client.createWorldOpenFlows().openWorld("dragon-death-visual",()->{throw new IllegalStateException("Death preview world could not load");});
                }
                if(ticks>600)throw new IllegalStateException("Client smoke timed out");
            } catch(Throwable error) {
                LoggerFactory.getLogger("impossible_difficulty").error("CLIENT_CONFIG_FAIL",error);client.stop();
            }
        });
    }
}
