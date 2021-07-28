package com.ZombieLand.project.core.init;

import com.ZombieLand.project.ZombieMod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

		public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ZombieMod.MOD_ID);
		
		public static final RegistryObject<Block> CONTAMINATED_STONE = BLOCKS.register("contaminated_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE)
					.strength(1.5f, 6f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.sound(SoundType.STONE)));
		
		public static final RegistryObject<Block> PACKED_FLESH = BLOCKS.register("packed_flesh", () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
					.strength(1f, 3f)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.HARD_CROP)));
		
		public static final RegistryObject<Block> DIAMOND_STUDDED_FLESH = BLOCKS.register("diamond_studded_flesh", () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
				.strength(1f, 3f)
				.harvestTool(ToolType.AXE)
				.sound(SoundType.HARD_CROP)));
}
