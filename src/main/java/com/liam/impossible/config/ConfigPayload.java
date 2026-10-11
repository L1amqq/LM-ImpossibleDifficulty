package com.liam.impossible.config;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

public record ConfigPayload(int action,Settings settings,boolean editable) implements CustomPacketPayload {
    public static final int REQUEST=0, SAVE=1, SNAPSHOT=2, SAVED=3, ERROR=4;
    public static final Type<ConfigPayload> TYPE=new Type<>(Identifier.fromNamespaceAndPath("impossible_difficulty","config"));
    public static final StreamCodec<RegistryFriendlyByteBuf,ConfigPayload> CODEC=StreamCodec.of((buffer,value)-> {
        buffer.writeVarInt(value.action());
        buffer.writeVarInt(value.settings().difficulty());buffer.writeVarInt(value.settings().dragonDifficulty());
        buffer.writeBoolean(value.settings().armorSlowdown());buffer.writeBoolean(value.settings().endermen());
        buffer.writeBoolean(value.settings().chests());buffer.writeBoolean(value.settings().flashbang());buffer.writeBoolean(value.editable());
    },buffer->new ConfigPayload(buffer.readVarInt(),new Settings(buffer.readVarInt(),buffer.readVarInt(),
        buffer.readBoolean(),buffer.readBoolean(),buffer.readBoolean(),buffer.readBoolean()),buffer.readBoolean()));
    @Override public Type<ConfigPayload> type() {return TYPE;}
}
