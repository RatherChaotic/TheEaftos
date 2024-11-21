package ratherchaotic.eaftos.effects;

import net.minecraft.client.render.DimensionEffects;
import net.minecraft.util.math.Vec3d;

public class EaftosDimEffect extends DimensionEffects {
    public EaftosDimEffect(float cloudsHeight, boolean alternateSkyColor, SkyType skyType, boolean brightenLighting, boolean darkened) {
        super(cloudsHeight, alternateSkyColor, skyType, brightenLighting, darkened);
    }

    @Override
    public Vec3d adjustFogColor(Vec3d color, float sunHeight) {
        return null;
    }

    @Override
    public boolean useThickFog(int camX, int camY) {
        return true;
    }
}
