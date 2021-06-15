/*
package com.ZombieLand.project.common.material;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

public enum CustomArmorMaterial implements IArmorMaterial{
	;
	
	private static final int[] baseDurability = { 128, 144, 160, 112 };
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorVal;
	private final int enchantmentValue;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private Ingredient repairIngredient;
	
	
	
	
	
	@Override
	public int getDurabilityForSlot(EquipmentSlotType slot) {
		return this.baseDurability[slot.getIndex()] * this.getDurabilityForSlot(slot);
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType slotIn) {
		return this.getDefenseForSlot(slotIn.getIndex());
	}

	@Override
	public int getEnchantmentValue() {
		return 0;
	}

	@Override
	public SoundEvent getEquipSound() {
		return null;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public float getToughness() {
		return 0;
	}

	@Override
	public float getKnockbackResistance() {
		return 0;
	}

}
*/