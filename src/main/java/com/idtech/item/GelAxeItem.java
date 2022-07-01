package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class GelAxeItem extends AxeItem {

    public static Item INSTANCE = new GelAxeItem(GelPickaxeItem.tier, 50, 100, GelPickaxeItem.properties).setRegistryName(BaseMod.MODID, "gelaxe");

    public GelAxeItem( Tier tier, int attackDamageIn, float attackSpeedIn, Properties properties){
        super(tier, attackDamageIn, attackSpeedIn, properties);

    }
}
