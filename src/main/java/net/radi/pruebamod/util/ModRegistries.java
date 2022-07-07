
package net.radi.pruebamod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.radi.pruebamod.entity.custom.EntidadElDed;
import net.radi.pruebamod.entity.custom.EntidadMapache;
import net.radi.pruebamod.entity.EntidadesMod;

public class ModRegistries  {
    public static void registerModStuffs(){
        registerAttributes();
    }
    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(EntidadesMod.RACCOON, EntidadMapache.setAttributes());
        FabricDefaultAttributeRegistry.register(EntidadesMod.ELDED_ENTIDAD, EntidadElDed.setAttributes());
    }
}
