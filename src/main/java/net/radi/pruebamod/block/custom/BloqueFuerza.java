package net.radi.pruebamod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BloqueFuerza extends Block {
    public BloqueFuerza(Settings settings){
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {

        if(!world.isClient()){
            if(entity instanceof LivingEntity) {
                LivingEntity entidadviva = ((LivingEntity) entity);
                entidadviva.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 500, 2 ));
            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}
