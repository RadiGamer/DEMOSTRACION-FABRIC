package net.radi.pruebamod.item.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.radi.pruebamod.sound.SonidosMOD;

public class ElDedSonido extends Item {
    public ElDedSonido(Settings settings) { super(settings); }

    public ActionResult onUse(BlockState blockState, World world, BlockPos blockPos, PlayerEntity placedBy, Hand hand, BlockHitResult blockHitResult) {
        if (!world.isClient) {
            world.playSound(null, blockPos, SonidosMOD.ELDED, SoundCategory.BLOCKS, 1f, 1f);
        }

        return ActionResult.SUCCESS;
    }
}
