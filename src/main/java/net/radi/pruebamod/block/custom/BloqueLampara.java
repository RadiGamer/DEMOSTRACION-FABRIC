package net.radi.pruebamod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.checkerframework.framework.qual.IgnoreInWholeProgramInference;

public class BloqueLampara extends Block {
    public static final BooleanProperty CLICKED = BooleanProperty.of("clicked");
    public static final BooleanProperty POWERED = Properties.POWERED;


    public BloqueLampara(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(!world.isClient() && hand == Hand.MAIN_HAND){
            boolean currentState = state.get(CLICKED);
            world.setBlockState(pos, state.with(CLICKED, !currentState), Block.NOTIFY_ALL);
        }
        return ActionResult.SUCCESS;
    }
    /*
    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify){
        boolean bl = false;
        boolean bl2 = world.isReceivingRedstonePower(pos) ? true : (bl = false);
        boolean currentState = state.get(CLICKED);
        if(!this.getDefaultState().isOf(block) && bl != state.get(POWERED)){
            if (bl != state.get(CLICKED)){
                world.setBlockState(pos, state.with(CLICKED, !currentState), Block.NOTIFY_ALL);
            }
        }
    }
*/
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CLICKED);
    }
}
