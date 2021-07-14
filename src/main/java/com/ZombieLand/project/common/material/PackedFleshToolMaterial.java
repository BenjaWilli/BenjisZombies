package com.ZombieLand.project.common.material;

import java.util.function.Supplier;
import com.ZombieLand.project.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum CustomToolMaterial implements IItemTier {
	
	PACKED_FLESH_TOOl(4, 2000, 15f, 2f, 17,  () -> Ingredient.of(ItemInit.CONTAMINANT.get()));
	
	private final int level;
	private final int Uses;
	private final float speed;
	private final float attackDamageBonus;
	private final int enchantmentValue;
	private final Ingredient repairIngredient;
	
	CustomToolMaterial(int level, int Uses, float speed, float attackDamageBonus, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
		this.level = level;
		this.Uses = Uses;
		this.speed= speed;
		this.attackDamageBonus = attackDamageBonus;
		this.enchantmentValue = enchantmentValue;
		this.repairIngredient = repairIngredient.get();

	} 

	@Override
	public int getUses() {
		return this.Uses;
	}

	@Override
	public float getAttackDamageBonus() {
		return this.attackDamageBonus;
	}
	@Override
	public int getLevel() {
		return this.level;
	}
	@Override
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}
	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient;
	}

	@Override
	public float getSpeed() {
		return this.speed;
	}


}
