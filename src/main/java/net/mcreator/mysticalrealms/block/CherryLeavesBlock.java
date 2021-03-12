
package net.mcreator.mysticalrealms.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.mysticalrealms.itemgroup.MysticalRealmsItemGroup;
import net.mcreator.mysticalrealms.MysticalrealmsModElements;

import java.util.List;
import java.util.Collections;

@MysticalrealmsModElements.ModElement.Tag
public class CherryLeavesBlock extends MysticalrealmsModElements.ModElement {
	@ObjectHolder("mysticalrealms:cherry_leaves")
	public static final Block block = null;
	public CherryLeavesBlock(MysticalrealmsModElements instance) {
		super(instance, 126);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(MysticalRealmsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends LeavesBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.8f, 0.8f).setLightLevel(s -> 0).notSolid());
			setRegistryName("cherry_leaves");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 120;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
