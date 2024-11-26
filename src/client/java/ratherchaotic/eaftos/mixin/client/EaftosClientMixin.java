package ratherchaotic.eaftos.mixin.client;

import net.minecraft.client.render.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ratherchaotic.eaftos.Eaftos;

import static net.minecraft.client.render.DimensionEffects.*;

@Mixin(WorldRenderer.class)


public class EaftosClientMixin {


    @Inject(method="renderSky", at= @At(value = "INVOKE", target = "Lnet/minecraft/client/render/SkyRendering;renderEndSky(Lnet/minecraft/client/util/math/MatrixStack;)V"))
    private void EaftosCheck(CallbackInfo ci) {
        DimensionEffects dimensionEffects = (DimensionEffects) (Object) this;
        DimensionEffects.SkyType skyType = dimensionEffects.getSkyType();
        Eaftos.LOGGER.info("Eaftos SkyType: " + skyType);
    }

	/*
	@Final @Shadow
    private SkyRendering skyRendering;
	@Shadow @Final
	private MinecraftClient client;
	@Shadow
	private ClientWorld world;
	float tickDelta;




	@Inject(method="renderSky", at=@At(value="INVOKE", target="Lnet/minecraft/client/render/WorldRenderer;renderSky(Lnet/minecraft/client/render/FrameGraphBuilder;Lnet/minecraft/client/render/Camera;FLnet/minecraft/client/render/Fog;)V", shift = At.Shift.BY))
	private void EaftosCheck(CallbackInfo info) {
		DimensionEffects dimensionEffects = this.world.getDimensionEffects();
		DimensionEffects.SkyType skyType = dimensionEffects.getSkyType();
		MatrixStack matrixStack = new MatrixStack();
		if (skyType == SkyType.valueOf("EAFTOS")) {
			{
				Tessellator tessellator = Tessellator.getInstance();
				float g = this.world.getSkyAngleRadians(tickDelta);
				float h = this.world.getSkyAngle(tickDelta);
				int k = dimensionEffects.getSkyColor(h);
				int m = this.world.getSkyColor(this.client.gameRenderer.getCamera().getPos(), tickDelta);
				float n = ColorHelper.floatFromChannel(ColorHelper.getRed(m));
				float o = ColorHelper.floatFromChannel(ColorHelper.getGreen(m));
				float p = ColorHelper.floatFromChannel(ColorHelper.getBlue(m));
				this.skyRendering.renderSky(n, o, p);
				if (dimensionEffects.isSunRisingOrSetting(h)) {
					this.skyRendering.renderGlowingSky(matrixStack, tessellator, g, k);
				}
				if (this.isSkyDark(tickDelta)) {
					this.skyRendering.renderSkyDark(matrixStack);
				}
			}
		}
	}*/
}