package ratherchaotic.eaftos.render;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.*;
import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

public class EaftosRenderer extends WorldRenderer {

    public EaftosRenderer(MinecraftClient client, EntityRenderDispatcher entityRenderDispatcher, BlockEntityRenderDispatcher blockEntityRenderDispatcher, BufferBuilderStorage bufferBuilders) {
        super(client, entityRenderDispatcher, blockEntityRenderDispatcher, bufferBuilders);
    }

    @Override
    private void renderSky(FrameGraphBuilder frameGraphBuilder, Camera camera, float tickDelta, Fog fog) {

    }
}
