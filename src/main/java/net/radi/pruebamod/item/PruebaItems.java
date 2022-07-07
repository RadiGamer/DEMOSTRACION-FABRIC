package net.radi.pruebamod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.radi.pruebamod.entity.EntidadesMod;
import net.radi.pruebamod.item.custom.*;
import net.radi.pruebamod.pruebamod;
import net.minecraft.util.registry.Registry;

public class PruebaItems {
    public static final Item RUEDITA_CULERA = registerItem("ruedita_culera",                     //ITEM DE LA RUEDITA CULERA
            new Item(new FabricItemSettings().group(PruebaModGrupo.RANDOM)));

    public static final Item ALE_CUATRO = registerItem("ale_cuatro",                             //ITEM DE Ale Cuatro
            new Item(new FabricItemSettings().group(PruebaModGrupo.RANDOM)));

    public static final Item ELDED = registerItem("elded",                                       //ITEM DE ELDED
            new Item(new FabricItemSettings().group(PruebaModGrupo.RANDOM)));

    public static final Item LINGOTE_ESCAMA_DRAGON = registerItem("lingote_escama_dragon",       //ITEM LINGOTE ESCAMA
            new Item(new FabricItemSettings().group(PruebaModGrupo.RANDOM)));



    public static final Item SPAWN_MAPACHE_HUEVO = registerItem("spawn_mapache_huevo",       //SPAWN MAPACHE
            new SpawnEggItem(EntidadesMod.RACCOON,0x648e8d,0x3b35, new FabricItemSettings().group(PruebaModGrupo.RANDOM)));

    public static final Item SPAWN_ELDED_ENTIDAD = registerItem("spawn_elded_huevo",       //SPAWN ELDED
            new SpawnEggItem(EntidadesMod.ELDED_ENTIDAD,0x648e8d,0x3b35, new FabricItemSettings().group(PruebaModGrupo.RANDOM)));


    //HERRAMIENTAS DEL MOD
    public static final Item ESPADA_ESCAMA = registerItem("espada_escama",
            new EspadaItemMod(MaterialHerramientasMod.ESCAMA, 1, 2f,new FabricItemSettings().group(PruebaModGrupo.HERRAMIENTAS)));

    public static final Item AZADA_ESCAMA = registerItem("azada_escama",
            new AzadaItemMod(MaterialHerramientasMod.ESCAMA, 0, 0f,new FabricItemSettings().group(PruebaModGrupo.HERRAMIENTAS)));

    public static final Item HACHA_ESCAMA = registerItem("hacha_escama",
            new HachaItemMod(MaterialHerramientasMod.ESCAMA, 3, 1f,new FabricItemSettings().group(PruebaModGrupo.HERRAMIENTAS)));

    public static final Item PICO_ESCAMA = registerItem("pico_escama",
            new PicoItemMod(MaterialHerramientasMod.ESCAMA, 1, 1f,new FabricItemSettings().group(PruebaModGrupo.HERRAMIENTAS)));

    public static final Item PALA_ESCAMA = registerItem("pala_escama",
            new PalaItemMod(MaterialHerramientasMod.ESCAMA, 1, 0f,new FabricItemSettings().group(PruebaModGrupo.HERRAMIENTAS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(pruebamod.MOD_ID, name), item); // REGISTRA EL OBJETO EN EL MC CON LA ID
    }
    public static void registerModItems(){
        pruebamod.LOGGER.info("Checando que todo ande chevere con" + pruebamod.MOD_ID);
    }

}
