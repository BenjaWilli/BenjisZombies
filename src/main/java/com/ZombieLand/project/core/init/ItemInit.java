package com.ZombieLand.project.core.init;

import com.ZombieLand.project.ZombieMod;
import com.ZombieLand.project.common.material.CustomArmorMaterial;
import com.ZombieLand.project.common.material.CustomToolMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ZombieMod.MOD_ID);
	
	//Items
	public static final RegistryObject<Item> CONTAMINANT = ITEMS.register("contaminant", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	//Block Items
	public static final RegistryObject<BlockItem> CONTAMINATED_STONE = ITEMS.register("contaminated_stone", () -> new BlockItem(BlockInit.CONTAMINATED_STONE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	//Tools & Weapons
	public static final RegistryObject<Item> PACKED_FLESH_SWORD = ITEMS.register("packed_flesh_sword", () -> new SwordItem(CustomToolMaterial.PACKED_FLESH_TOOl, 5, -1f, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> PACKED_FLESH_AXE = ITEMS.register("packed_flesh_axe", () -> new SwordItem(CustomToolMaterial.PACKED_FLESH_TOOl, 5, -1f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<Item> PACKED_FLESH_PICKAXE = ITEMS.register("packed_flesh_pickaxe", () -> new SwordItem(CustomToolMaterial.PACKED_FLESH_TOOl, 5, -1f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<Item> PACKED_FLESH_SHOVEL = ITEMS.register("packed_flesh_shovel", () -> new SwordItem(CustomToolMaterial.PACKED_FLESH_TOOl, 5, -1f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<Item> PACKED_FLESH_HOE = ITEMS.register("packed_flesh_hoe", () -> new SwordItem(CustomToolMaterial.PACKED_FLESH_TOOl, 5, -1f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	//Armor
	public static final RegistryObject<Item> PACKED_FLESH_HELMET = ITEMS.register("packed_flesh_helmet", () -> new ArmorItem(CustomArmorMaterial.PACKED_FLESH_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> PACKED_FLESH_CHESTPLATE = ITEMS.register("packed_flesh_chestplate", () -> new ArmorItem(CustomArmorMaterial.PACKED_FLESH_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> PACKED_FLESH_LEGGINGS = ITEMS.register("packed_flesh_leggings", () -> new ArmorItem(CustomArmorMaterial.PACKED_FLESH_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> PACKED_FLESH_BOOTS = ITEMS.register("packed_flesh_boots", () -> new ArmorItem(CustomArmorMaterial.PACKED_FLESH_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	
}

  