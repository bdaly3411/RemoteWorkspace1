
package net.mcreator.mysticalrealms.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mysticalrealms.block.CrusherBlock;
import net.mcreator.mysticalrealms.MysticalrealmsModElements;

@MysticalrealmsModElements.ModElement.Tag
public class MachinesItemGroup extends MysticalrealmsModElements.ModElement {
	public MachinesItemGroup(MysticalrealmsModElements instance) {
		super(instance, 197);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmachines") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CrusherBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
