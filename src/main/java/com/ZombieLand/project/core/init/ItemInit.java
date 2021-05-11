package com.ZombieLand.project.core.init;

import com.ZombieLand.project.ZombieMod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ZombieMod.MOD_ID);
	
	//Items
	public static final RegistryObject<Item> CONTAMINANT = ITEMS.register("contaminant", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	// Block Items
	public static final RegistryObject<BlockItem> CONTAMINATED_STONE = ITEMS.register("contaminated_stone", () -> new BlockItem(BlockInit.CONTAMINATED_STONE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
}
 