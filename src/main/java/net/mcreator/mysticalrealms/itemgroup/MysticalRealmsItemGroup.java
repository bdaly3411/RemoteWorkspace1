
package net.mcreator.mysticalrealms.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mysticalrealms.item.BlackDiamondGemItem;
import net.mcreator.mysticalrealms.MysticalrealmsModElements;

@MysticalrealmsModElements.ModElement.Tag
public class MysticalRealmsItemGroup extends MysticalrealmsModElements.ModElement {
	public MysticalRealmsItemGroup(MysticalrealmsModElements instance) {
		super(instance, 115);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmystical_realms") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BlackDiamondGemItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
