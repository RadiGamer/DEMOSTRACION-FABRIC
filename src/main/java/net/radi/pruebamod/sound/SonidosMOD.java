package net.radi.pruebamod.sound;

import net.minecraft.client.sound.Sound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.radi.pruebamod.pruebamod;
import net.minecraft.util.registry.Registry;


public class SonidosMOD {
    public static SoundEvent ELDED = registerSoundEvent("elded");

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(pruebamod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
