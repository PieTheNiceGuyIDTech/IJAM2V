package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class CustomArmorItem extends ArmorItem {

    private static Properties properties = new Properties().tab(CreativeModeTab.TAB_MISC);
    private static ArmorMaterial customMaterial = ItemUtils.buildArmorMaterial("gel", 22, new int[]{5,8,6,4} , 5, SoundEvents.ARMOR_EQUIP_IRON, 4.0f, 0.3f, "examplemod:gelore");

    public static final Item HELM = new CustomArmorItem(customMaterial, EquipmentSlot.HEAD, (properties)).setRegistryName(BaseMod.MODID, "customhelm");
    public static final Item CHEST = new CustomArmorItem(customMaterial, EquipmentSlot.CHEST, (properties)).setRegistryName(BaseMod.MODID, "customchest");
    public static final Item LEGS = new CustomArmorItem(customMaterial, EquipmentSlot.LEGS, (properties)).setRegistryName(BaseMod.MODID, "customlegs");
    public static final Item BOOTS = new CustomArmorItem(customMaterial, EquipmentSlot.FEET, (properties)).setRegistryName(BaseMod.MODID, "customboots");

    public CustomArmorItem( ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);

    }

    @Override
    public String getArmorTexture( ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        if(slot == EquipmentSlot.LEGS){
            return "examplemod:textures/models/armor/custom_armor_layer_2.png";
        }else{
            return "examplemod:textures/models/armor/custom_armor_layer_1.png";
        }
    }
}
