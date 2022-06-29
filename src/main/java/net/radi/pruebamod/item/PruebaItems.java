package net.radi.pruebamod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.radi.pruebamod.pruebamod;
import net.minecraft.util.registry.Registry;

public class PruebaItems {
    public static final Item RUEDITA_CULERA = registerItem("ruedita_culera",                     //ITEM DE LA RUEDITA CULERA
            new Item(new FabricItemSettings().group(PruebaModGrupo.RANDOM)));

    public static final Item ALE_CUATRO = registerItem("ale_cuatro",                             //ITEM DE Ale Cuatro
            new Item(new FabricItemSettings().group(PruebaModGrupo.RANDOM)));

    public static final Item ELDED = registerItem("elded",                                       //ITEM DE ELDED
            new Item(new FabricItemSettings().group(PruebaModGrupo.RANDOM)));
    public static final Item LINGOTE_ESCAMA_DRAGON = registerItem("lingote_escama_dragon",       //ITEM DE ELDED
            new Item(new FabricItemSettings().group(PruebaModGrupo.RANDOM)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(pruebamod.MOD_ID, name), item); // REGISTRA EL OBJETO EN EL MC CON LA ID
    }
    public static void registerModItems(){
        pruebamod.LOGGER.info("Checando que todo ande chevere con" + pruebamod.MOD_ID);
    }

}
