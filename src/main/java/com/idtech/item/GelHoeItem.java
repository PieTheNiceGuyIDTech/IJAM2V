package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class GelHoeItem extends HoeItem {

    public static Item INSTANCE = new GelHoeItem(GelPickaxeItem.tier, 50, 100, GelPickaxeItem.properties).setRegistryName(BaseMod.MODID, "gelhoe");

    public GelHoeItem( Tier tier, int attackDamageIn, float attackSpeedIn, Properties properties){
        super(tier, attackDamageIn, attackSpeedIn, properties);

    }
}
