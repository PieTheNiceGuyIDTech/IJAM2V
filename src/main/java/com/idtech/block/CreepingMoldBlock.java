package com.idtech.block;

import com.idtech.BaseMod;
import com.idtech.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

import java.util.Random;

public class CreepingMoldBlock extends Block {

    private static Properties properties = Properties.of(Material.STONE).randomTicks();
    public static Block INSTANCE = new CreepingMoldBlock(properties).setRegistryName(BaseMod.MODID, "creepingmold");
    public static Item ITEM = BlockUtils.createBlockItem(INSTANCE, CreativeModeTab.TAB_MISC);

    public CreepingMoldBlock(Properties properties){
        super(properties);
    }

    @Override
    public void randomTick ( BlockState blockState, ServerLevel serverLevel, BlockPos pos, Random random){
        super.randomTick(blockState, serverLevel, pos, random);

        // Find a random neighboring block position
        BlockPos blockPos = Utils.findNeightborBlock(pos);

        // Check if the block at that position is not air. (Otherwise our mold will fly away!)
        if (!serverLevel.isEmptyBlock(blockPos)) {

            // Set the block at the position to this block
            serverLevel.setBlockAndUpdate(blockPos, this.defaultBlockState());
        }
    }
}
