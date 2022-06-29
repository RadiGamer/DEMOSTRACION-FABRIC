package net.radi.pruebamod.util;

import net.minecraft.item.Item;

import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.radi.pruebamod.pruebamod;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;

public class ModTags {
    public static class Blocks{

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(pruebamod.MOD_ID, name));
        }
        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }
    public static class Items {
        public static final TagKey<Item> ELDED = createCommonTag("elded");
        public static final TagKey<Item> ALE_CUATRO = createCommonTag("ale_cuatro");
        public static final TagKey<Item> RUEDITA_CULERA = createCommonTag("ruedita_culera");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(pruebamod.MOD_ID, name));
        }
        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }

}

