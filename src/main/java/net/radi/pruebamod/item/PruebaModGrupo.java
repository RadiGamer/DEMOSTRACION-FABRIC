package net.radi.pruebamod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.radi.pruebamod.block.PruebaBloques;
import net.radi.pruebamod.pruebamod;

public class PruebaModGrupo {
    public static final ItemGroup RANDOM = FabricItemGroupBuilder.build(new Identifier(pruebamod.MOD_ID,"random"),
    ()-> new ItemStack(PruebaItems.ELDED));

    public static final ItemGroup BLOQUES = FabricItemGroupBuilder.build(new Identifier(pruebamod.MOD_ID,"bloques"),
            ()-> new ItemStack(PruebaBloques.BLOQUE_ESCAMA_DRAGON));
}
