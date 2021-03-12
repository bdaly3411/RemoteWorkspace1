package net.mcreator.mysticalrealms.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.mysticalrealms.MysticalrealmsModElements;
import net.mcreator.mysticalrealms.MysticalrealmsMod;

import java.util.Map;

@MysticalrealmsModElements.ModElement.Tag
public class Ak47CanUseRangedItemProcedure extends MysticalrealmsModElements.ModElement {
	public Ak47CanUseRangedItemProcedure(MysticalrealmsModElements instance) {
		super(instance, 212);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				MysticalrealmsMod.LOGGER.warn("Failed to load dependency itemstack for procedure Ak47CanUseRangedItem!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((!(((itemstack).getOrCreateTag().getDouble("ammo")) < 1))) {
			(itemstack).getOrCreateTag().putDouble("ammo", (((itemstack).getOrCreateTag().getDouble("ammo")) - 1));
		}
	}
}
