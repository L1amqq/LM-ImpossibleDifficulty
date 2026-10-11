package com.liam.impossible.runtime;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

/** Only the captured player receives this target; -1 releases the camera. */
public record EndermanGazePayload(int target) implements CustomPacketPayload {
    public static final Type<EndermanGazePayload> TYPE=new Type<>(Identifier.fromNamespaceAndPath("impossible_difficulty","enderman_gaze"));
    public static final StreamCodec<RegistryFriendlyByteBuf,EndermanGazePayload> CODEC=StreamCodec.of(
        (buffer,value)->buffer.writeVarInt(value.target()),buffer->new EndermanGazePayload(buffer.readVarInt()));
    @Override public Type<EndermanGazePayload> type(){return TYPE;}
}
