package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class GelSwordItem extends SwordItem {

    public static Item INSTANCE = new GelSwordItem(GelPickaxeItem.tier, 50, 100, GelPickaxeItem.properties).setRegistryName(BaseMod.MODID, "gelsword");

    public GelSwordItem( Tier tier, int attackDamageIn, float attackSpeedIn, Properties properties){
        super(tier, attackDamageIn, attackSpeedIn, properties);

    }
}
