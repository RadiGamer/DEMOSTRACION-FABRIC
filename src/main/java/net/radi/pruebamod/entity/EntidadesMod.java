package net.radi.pruebamod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.radi.pruebamod.entity.custom.EntidadElDed;
import net.radi.pruebamod.entity.custom.EntidadMapache;
import net.radi.pruebamod.pruebamod;

public class EntidadesMod {
    public static final EntityType<EntidadMapache> RACCOON = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(pruebamod.MOD_ID, "raccoon"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntidadMapache::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build()); //HITBOX

    public static final EntityType<EntidadElDed> ELDED = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(pruebamod.MOD_ID, "elded"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntidadElDed::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build()); //HITBOX
}
