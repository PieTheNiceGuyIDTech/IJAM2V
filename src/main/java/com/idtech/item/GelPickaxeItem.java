package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class GelPickaxeItem extends PickaxeItem {

    public static Tier tier = new ForgeTier(4, 1561, 8.0F, 10.0F, 3, null, ()->{return Ingredient.of(ItemMod.STRUCTURE_GEL);});
    private static Properties properties = new Item.Properties().tab(CreativeModeTab.TAB_MISC);
    public static Item INSTANCE = new GelPickaxeItem(tier, 50, 100, properties).setRegistryName(BaseMod.MODID, "gelpickaxe");


    public GelPickaxeItem( Tier tier, int attackDamageIn, float attackSpeedIn, Properties properties){
        super(tier, attackDamageIn, attackSpeedIn, properties);

    }
}
