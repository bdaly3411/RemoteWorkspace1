
package net.mcreator.mysticalrealms.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.IPlantable;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.mysticalrealms.itemgroup.MysticalRealmsItemGroup;
import net.mcreator.mysticalrealms.MysticalrealmsModElements;

import java.util.List;
import java.util.Collections;

@MysticalrealmsModElements.ModElement.Tag
public class CherryWoodBlock extends MysticalrealmsModElements.ModElement {
	@ObjectHolder("mysticalrealms:cherry_wood")
	public static final Block block = null;
	public CherryWoodBlock(MysticalrealmsModElements instance) {
		super(instance, 123);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(MysticalRealmsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(8f, 6.062866266041593f).setLightLevel(s -> 0)
					.harvestLevel(0).harvestTool(ToolType.AXE));
			setRegistryName("cherry_wood");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 20;
		}

		@Override
		public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction direction, IPlantable plantable) {
			return true;
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
