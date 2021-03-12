package net.mcreator.mysticalrealms.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.mysticalrealms.MysticalrealmsModElements;
import net.mcreator.mysticalrealms.MysticalrealmsMod;

import java.util.Map;

@MysticalrealmsModElements.ModElement.Tag
public class RocketLauncherCanUseRangedItemProcedure extends MysticalrealmsModElements.ModElement {
	public RocketLauncherCanUseRangedItemProcedure(MysticalrealmsModElements instance) {
		super(instance, 218);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				MysticalrealmsMod.LOGGER.warn("Failed to load dependency itemstack for procedure RocketLauncherCanUseRangedItem!");
			return false;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		return (((itemstack).getOrCreateTag().getDouble("ammo")) > 0);
	}
}
