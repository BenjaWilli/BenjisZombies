package com.ZombieLand.project.core.init;

import com.ZombieLand.project.ZombieMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PotionInit {
		
	public static final DeferredRegister<Effect> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, ZombieMod.MOD_ID);
	
	//Potions
	//public static final RegistryObject<Potion> ZOMBIFY_POTION = POTIONS.register("zombify_potion", () -> new Potion.)
 
}
