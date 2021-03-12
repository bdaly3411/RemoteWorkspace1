
package net.mcreator.mysticalrealms.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mysticalrealms.item.Ak47Item;
import net.mcreator.mysticalrealms.MysticalrealmsModElements;

@MysticalrealmsModElements.ModElement.Tag
public class GunsItemGroup extends MysticalrealmsModElements.ModElement {
	public GunsItemGroup(MysticalrealmsModElements instance) {
		super(instance, 250);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabguns") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Ak47Item.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
