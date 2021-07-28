package com.ZombieLand.project.core.init;

import com.ZombieLand.project.ZombieMod;
import com.ZombieLand.project.common.material.DiamondStuddedFleshArmorMaterial;
import com.ZombieLand.project.common.material.DiamondStuddedFleshToolMaterial;
import com.ZombieLand.project.common.material.PackedFleshArmorMaterial;
import com.ZombieLand.project.common.material.PackedFleshToolMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
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
	
	public static final RegistryObject<BlockItem> PACKED_FLESH = ITEMS.register("packed_flesh", () -> new BlockItem(BlockInit.PACKED_FLESH.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> DIAMOND_STUDDED_FLESH = ITEMS.register("diamond_studded_flesh", () -> new BlockItem(BlockInit.DIAMOND_STUDDED_FLESH.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	//Tools & Weapons
	//Numbers are damage, then speed
	public static final RegistryObject<Item> PACKED_FLESH_SWORD = ITEMS.register("packed_flesh_sword", () -> new SwordItem(PackedFleshToolMaterial.PACKED_FLESH_TOOl, 5, -1f, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> PACKED_FLESH_AXE = ITEMS.register("packed_flesh_axe", () -> new AxeItem(PackedFleshToolMaterial.PACKED_FLESH_TOOl, 6, -2f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<Item> PACKED_FLESH_PICKAXE = ITEMS.register("packed_flesh_pickaxe", () -> new PickaxeItem(PackedFleshToolMaterial.PACKED_FLESH_TOOl, 3, -1f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<Item> PACKED_FLESH_SHOVEL = ITEMS.register("packed_flesh_shovel", () -> new ShovelItem(PackedFleshToolMaterial.PACKED_FLESH_TOOl, 3, -1f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<Item> PACKED_FLESH_HOE = ITEMS.register("packed_flesh_hoe", () -> new HoeItem(PackedFleshToolMaterial.PACKED_FLESH_TOOl, 3, -1f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<Item> DIAMOND_STUDDED_FLESH_SWORD = ITEMS.register("diamond_studded_flesh_sword", () -> new SwordItem(DiamondStuddedFleshToolMaterial.DIAMOND_STUDDED_FLESH_TOOl, 7, -1f, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> DIAMOND_STUDDED_FLESH_AXE = ITEMS.register("diamond_studded_flesh_axe", () -> new AxeItem(DiamondStuddedFleshToolMaterial.DIAMOND_STUDDED_FLESH_TOOl, 9, -2f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<Item> DIAMOND_STUDDED_FLESH_PICKAXE = ITEMS.register("diamond_studded_flesh_pickaxe", () -> new PickaxeItem(DiamondStuddedFleshToolMaterial.DIAMOND_STUDDED_FLESH_TOOl, 5, -1f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<Item> DIAMOND_STUDDED_FLESH_SHOVEL = ITEMS.register("diamond_studded_flesh_shovel", () -> new ShovelItem(DiamondStuddedFleshToolMaterial.DIAMOND_STUDDED_FLESH_TOOl, 5, -1f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	public static final RegistryObject<Item> DIAMOND_STUDDED_FLESH_HOE = ITEMS.register("diamond_studded_flesh_hoe", () -> new HoeItem(DiamondStuddedFleshToolMaterial.DIAMOND_STUDDED_FLESH_TOOl, 5, -1f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
	
	//Armor
	public static final RegistryObject<Item> PACKED_FLESH_HELMET = ITEMS.register("packed_flesh_helmet", () -> new ArmorItem(PackedFleshArmorMaterial.PACKED_FLESH_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> PACKED_FLESH_CHESTPLATE = ITEMS.register("packed_flesh_chestplate", () -> new ArmorItem(PackedFleshArmorMaterial.PACKED_FLESH_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> PACKED_FLESH_LEGGINGS = ITEMS.register("packed_flesh_leggings", () -> new ArmorItem(PackedFleshArmorMaterial.PACKED_FLESH_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> PACKED_FLESH_BOOTS = ITEMS.register("packed_flesh_boots", () -> new ArmorItem(PackedFleshArmorMaterial.PACKED_FLESH_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> DIAMOND_STUDDED_FLESH_HELMET = ITEMS.register("diamond_studded_flesh_helmet", () -> new ArmorItem(DiamondStuddedFleshArmorMaterial.DIAMOND_STUDDED_FLESH_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> DIAMOND_STUDDED_FLESH_CHESTPLATE = ITEMS.register("diamond_studded_flesh_chestplate", () -> new ArmorItem(DiamondStuddedFleshArmorMaterial.DIAMOND_STUDDED_FLESH_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> DIAMOND_STUDDED_FLESH_LEGGINGS = ITEMS.register("diamond_studded_flesh_leggings", () -> new ArmorItem(DiamondStuddedFleshArmorMaterial.DIAMOND_STUDDED_FLESH_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	public static final RegistryObject<Item> DIAMOND_STUDDED_FLESH_BOOTS = ITEMS.register("diamond_studded_flesh_boots", () -> new ArmorItem(DiamondStuddedFleshArmorMaterial.DIAMOND_STUDDED_FLESH_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
	
	
}

  