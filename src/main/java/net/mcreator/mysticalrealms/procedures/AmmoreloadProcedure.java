package net.mcreator.mysticalrealms.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.mysticalrealms.item.RocketLauncherItem;
import net.mcreator.mysticalrealms.item.RocketItem;
import net.mcreator.mysticalrealms.item.Mm9bulletItem;
import net.mcreator.mysticalrealms.item.Ak47Item;
import net.mcreator.mysticalrealms.MysticalrealmsModElements;
import net.mcreator.mysticalrealms.MysticalrealmsMod;

import java.util.Map;

@MysticalrealmsModElements.ModElement.Tag
public class AmmoreloadProcedure extends MysticalrealmsModElements.ModElement {
	public AmmoreloadProcedure(MysticalrealmsModElements instance) {
		super(instance, 214);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MysticalrealmsMod.LOGGER.warn("Failed to load dependency entity for procedure Ammoreload!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Ak47Item.block, (int) (1)).getItem())) {
			if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
					.getDouble("ammo")) < 36)) {
				if (((entity instanceof PlayerEntity)
						? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(Mm9bulletItem.block, (int) (1)))
						: false)) {
					for (int index0 = 0; index0 < (int) (36); index0++) {
						if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
								.getDouble("ammo")) < 36)) {
							if (((entity instanceof PlayerEntity)
									? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(Mm9bulletItem.block, (int) (1)))
									: false)) {
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
										.putDouble("ammo",
												((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
														.getOrCreateTag().getDouble("ammo")) + 1));
								if (entity instanceof PlayerEntity) {
									ItemStack _stktoremove = new ItemStack(Mm9bulletItem.block, (int) (1));
									((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
											((PlayerEntity) entity).container.func_234641_j_());
								}
								if (entity instanceof PlayerEntity)
									((PlayerEntity) entity).getCooldownTracker().setCooldown(
											(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
													.getItem(),
											(int) 60);
							}
						}
					}
				}
			}
		}
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(RocketLauncherItem.block, (int) (1)).getItem())) {
			if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
					.getDouble("ammo")) < 1)) {
				if (((entity instanceof PlayerEntity)
						? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(RocketItem.block, (int) (1)))
						: false)) {
					for (int index1 = 0; index1 < (int) (1); index1++) {
						if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
								.getDouble("ammo")) < 1)) {
							if (((entity instanceof PlayerEntity)
									? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(RocketItem.block, (int) (1)))
									: false)) {
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
										.putDouble("ammo",
												((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
														.getOrCreateTag().getDouble("ammo")) + 1));
								if (entity instanceof PlayerEntity) {
									ItemStack _stktoremove = new ItemStack(RocketItem.block, (int) (1));
									((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
											((PlayerEntity) entity).container.func_234641_j_());
								}
								if (entity instanceof PlayerEntity)
									((PlayerEntity) entity).getCooldownTracker().setCooldown(
											(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
													.getItem(),
											(int) 60);
							}
						}
					}
				}
			}
		}
	}
}
