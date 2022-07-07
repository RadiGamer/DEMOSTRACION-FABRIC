package net.radi.pruebamod.painting;

import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.radi.pruebamod.pruebamod;
import net.minecraft.util.registry.Registry;

public class PinturasMod {

    public static final PaintingMotive ELDEDLOVE = registerPainting("eldedlove", new PaintingMotive(64, 64));
    public static final PaintingMotive ELDEDAWW = registerPainting("eldedaww", new PaintingMotive(16, 16));


    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive){
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(pruebamod.MOD_ID, name), paintingMotive);
    }


    public static void registerPainting(){
        pruebamod.LOGGER.info("Sacando las pinturas del sol para" + pruebamod.MOD_ID);
    }
}
