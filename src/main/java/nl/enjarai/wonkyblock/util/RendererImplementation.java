package nl.enjarai.wonkyblock.util;

import net.minecraft.block.BlockState;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockRenderView;

public interface RendererImplementation {
    void renderBlock(BlockRenderView world, BakedModel model, BlockState state, BlockPos pos, MatrixStack matrices,
                     VertexConsumer vertexConsumer, boolean cull, Random random, long seed);

    void markBlockForRender(BlockPos pos);
}
