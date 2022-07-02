package net.radi.pruebamod.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.radi.pruebamod.entity.custom.EntidadElDed;
import net.radi.pruebamod.pruebamod;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RenderElDed extends GeoEntityRenderer<EntidadElDed> {
    public RenderElDed(EntityRendererFactory.Context ctx) {
        super(ctx, new Modeloeelded());
    }

    @Override
    public Identifier getTextureLocation(EntidadElDed instance) {
        return new Identifier(pruebamod.MOD_ID, "textures/entity/elded/elded.png");
    }
}
