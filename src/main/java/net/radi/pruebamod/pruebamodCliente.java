package net.radi.pruebamod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.radi.pruebamod.entity.client.RenderMapache;
import net.radi.pruebamod.entity.EntidadesMod;

public class pruebamodCliente implements ClientModInitializer {
    @Override
    public void onInitializeClient(){

        EntityRendererRegistry.register(EntidadesMod.RACCOON, RenderMapache::new);
    }
}
