package com.ZombieLand.project.common.material;

import java.util.function.Supplier;

import com.ZombieLand.project.core.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum DiamondStuddedFleshArmorMaterial implements IArmorMaterial{
	DIAMOND_STUDDED_FLESH_ARMOR("diamond_studded_flesh", 10, new int [] {3, 6, 8, 3}, 17, SoundEvents.ARMOR_EQUIP_DIAMOND, 4f, 0.2f, () -> Ingredient.of(ItemInit.DIAMOND_STUDDED_FLESH.get()));
	
	private final int[] baseDurability = { 128, 144, 160, 112 };
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorVal;
	private final int enchantmentValue;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Ingredient repairIngredient;
	
	DiamondStuddedFleshArmorMaterial(String name, int durabilityMultiplier, int[] armorVal, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorVal = armorVal;
		this.enchantmentValue= enchantmentValue;
		this.equipSound = equipSound;
		this.toughness= toughness;
		this.knockbackResistance= knockbackResistance;
		this.repairIngredient= repairIngredient.get();
	}
	
	
	
	@Override
	public int getDurabilityForSlot(EquipmentSlotType slot) {
		return this.baseDurability[slot.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType slotIn) {
		return this.armorVal[slotIn.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}

}
