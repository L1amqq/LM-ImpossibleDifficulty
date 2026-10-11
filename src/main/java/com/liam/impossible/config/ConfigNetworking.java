package com.liam.impossible.config;

import net.fabricmc.fabric.api.networking.v1.*;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.permissions.Permissions;

public final class ConfigNetworking {
    public static boolean canEdit(ServerPlayer player) {
        return player.level().getServer().isSingleplayerOwner(player.nameAndId()) ||
            player.createCommandSourceStack().permissions().hasPermission(Permissions.COMMANDS_GAMEMASTER);
    }
    public static void register() {
        PayloadTypeRegistry.playC2S().register(ConfigPayload.TYPE,ConfigPayload.CODEC);
        PayloadTypeRegistry.playS2C().register(ConfigPayload.TYPE,ConfigPayload.CODEC);
        ServerPlayNetworking.registerGlobalReceiver(ConfigPayload.TYPE,(payload,context)-> {
            var player=context.player();var server=context.server();boolean editable=canEdit(player);
            int reply=ConfigPayload.SNAPSHOT;
            if(payload.action()==ConfigPayload.SAVE) {
                if(editable&&payload.settings().valid()&&ConfigStore.save(payload.settings())) {
                    ConfigStore.apply(server,payload.settings());reply=ConfigPayload.SAVED;
                } else reply=ConfigPayload.ERROR;
            } else if(payload.action()!=ConfigPayload.REQUEST)return;
            ServerPlayNetworking.send(player,new ConfigPayload(reply,ConfigStore.capture(server),editable));
        });
    }
}
