package net.radi.pruebamod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.radi.pruebamod.block.custom.BloqueFuerza;
import net.radi.pruebamod.block.custom.BloqueVelocidad;
import net.radi.pruebamod.item.PruebaModGrupo;
import net.radi.pruebamod.pruebamod;

public class PruebaBloques {

    public static final Block BLOQUE_ESCAMA_DRAGON = registerBlock("bloque_escama_dragon",
        new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), PruebaModGrupo.BLOQUES); //BLOQUE QUE SE ROMPE INSTA EN LA CATEGORIA MISC

    public static final Block ORE_ESCAMA_DRAGON = registerBlock("ore_escama_dragon",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()), PruebaModGrupo.BLOQUES); //BLOQUE CON DURACION EN LA CATEGORIA DE MISC
    public static final Block KOMANCHE = registerBlock("komanche",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(1f)), PruebaModGrupo.BLOQUES); //BLOQUE LANA DE KOMANCHE
    public static final Block BLOQUE_VELOCIDAD = registerBlock("bloque_velocidad",
            new BloqueVelocidad(FabricBlockSettings.of(Material.DECORATION).breakInstantly()), PruebaModGrupo.BLOQUES); //BLOQUE CON VELOCIDAD
    public static final Block BLOQUE_FUERZA = registerBlock("bloque_fuerza",
            new BloqueFuerza(FabricBlockSettings.of(Material.DECORATION).breakInstantly()), PruebaModGrupo.BLOQUES); //BLOQUE CON FUERZA



    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(pruebamod.MOD_ID, name), block);      //REGISTRA EL BLOQUE COMO **BLOQUE**
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(pruebamod.MOD_ID, name),             //REGISTRA EL BLOQUE COMO **ITEM**
         new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlock(){
        pruebamod.LOGGER.info("Checando que todo ande chevere con los bloques de" + pruebamod.MOD_ID);     //PARA DARLE UN LOG
    }


}
