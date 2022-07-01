package net.radi.pruebamod.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.radi.pruebamod.entity.custom.EntidadMapache;
import net.radi.pruebamod.pruebamod;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RenderMapache extends GeoEntityRenderer<EntidadMapache> {
    public RenderMapache(EntityRendererFactory.Context ctx) {
        super(ctx, new ModeloMapache());
    }

    @Override
    public Identifier getTextureLocation(EntidadMapache instance) {
        return new Identifier(pruebamod.MOD_ID, "textures/entity/raccoon/raccoon.png");
    }
}
