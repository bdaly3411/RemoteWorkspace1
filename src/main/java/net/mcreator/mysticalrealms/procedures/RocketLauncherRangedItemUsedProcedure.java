package net.mcreator.mysticalrealms.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.mysticalrealms.MysticalrealmsModElements;
import net.mcreator.mysticalrealms.MysticalrealmsMod;

import java.util.Map;

@MysticalrealmsModElements.ModElement.Tag
public class RocketLauncherRangedItemUsedProcedure extends MysticalrealmsModElements.ModElement {
	public RocketLauncherRangedItemUsedProcedure(MysticalrealmsModElements instance) {
		super(instance, 219);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				MysticalrealmsMod.LOGGER.warn("Failed to load dependency itemstack for procedure RocketLauncherRangedItemUsed!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((!(((itemstack).getOrCreateTag().getDouble("ammo")) < 1))) {
			(itemstack).getOrCreateTag().putDouble("ammo", (((itemstack).getOrCreateTag().getDouble("ammo")) - 1));
		}
	}
}
