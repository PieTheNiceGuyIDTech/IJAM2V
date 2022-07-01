package com.idtech.item;

import com.idtech.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class TeleportRodItem extends Item {
    private static Properties properties = new Item.Properties().tab(CreativeModeTab.TAB_MISC);
    public static Item INSTANCE = new TeleportRodItem(properties).setRegistryName("teleportrod");

    public TeleportRodItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use( Level level, Player playerIn, InteractionHand handIn) {
        ItemStack itemstack = playerIn.getItemInHand(handIn);

        BlockPos blockPos = Utils.getBlockAtCursor(playerIn, 1000.0d, true);

        if(blockPos != null){
            playerIn.teleportTo(blockPos.getX(), blockPos.getY(), blockPos.getZ());
            playerIn.fallDistance = 0.0F;
        }

        return InteractionResultHolder.pass(itemstack);
    }
}
