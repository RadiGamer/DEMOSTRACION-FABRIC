package net.radi.pruebamod.sound;

import net.minecraft.client.sound.Sound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.radi.pruebamod.pruebamod;
import net.minecraft.util.registry.Registry;


public class SonidosMOD {

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(pruebamod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
    public static SoundEvent ELDED_HIT = registerSoundEvent("elded_hit");
}
