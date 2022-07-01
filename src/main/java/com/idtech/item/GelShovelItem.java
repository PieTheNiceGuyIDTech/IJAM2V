package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class GelShovelItem extends ShovelItem {

    public static Item INSTANCE = new GelShovelItem(GelPickaxeItem.tier, 50, 100, GelPickaxeItem.properties).setRegistryName(BaseMod.MODID, "gelshovel");

    public GelShovelItem( Tier tier, int attackDamageIn, float attackSpeedIn, Properties properties){
        super(tier, attackDamageIn, attackSpeedIn, properties);

    }
}
