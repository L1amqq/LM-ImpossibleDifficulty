package com.liam.impossible;

import com.liam.impossible.runtime.*;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import java.util.Collection;
import java.util.List;
import net.minecraft.server.permissions.Permissions;

public final class NativeCommands {
    public static void register(){
        CommandRegistrationCallback.EVENT.register((dispatcher,registries,environment)->dispatcher.register(
            Commands.literal("impossible").requires(source->source.permissions().hasPermission(Permissions.COMMANDS_GAMEMASTER))
                .then(Commands.literal("guide")
                    .executes(context -> giveGuide(context.getSource(),List.of(context.getSource().getPlayerOrException())))
                    .then(Commands.argument("players",EntityArgument.players()).executes(context ->
                        giveGuide(context.getSource(),EntityArgument.getPlayers(context,"players")))))
                .then(Commands.literal("action").then(Commands.argument("name",StringArgumentType.greedyString()).executes(context ->
                    action(context.getSource(),StringArgumentType.getString(context,"name")))))));
    }
    private static int action(CommandSourceStack source,String name){
        if(!Logic.hasAction(name)){
            source.sendFailure(Component.translatableWithFallback("impossible_difficulty.command.action_unavailable","Action is unavailable: %s",name));
            return 0;
        }
        return Logic.call(new Frame(source),name);
    }
    private static int giveGuide(CommandSourceStack source,Collection<ServerPlayer> players){
        for(var player:players) GuideBook.give(player);
        source.sendSuccess(()->Component.translatableWithFallback("impossible_difficulty.command.guide_given",
            "Gave the Crystalspine Guide to %s player(s).",players.size()),true);
        return players.size();
    }
}
