
package net.mcreator.questnpc.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.Block;

import net.mcreator.questnpc.ElementsQuestNpcMod;

@ElementsQuestNpcMod.ModElement.Tag
public class BlockWormWoodStairs extends ElementsQuestNpcMod.ModElement {
	@GameRegistry.ObjectHolder("quest_npc:worm_wood_stairs")
	public static final Block block = null;
	public BlockWormWoodStairs(ElementsQuestNpcMod instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("worm_wood_stairs"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("quest_npc:worm_wood_stairs", "inventory"));
	}
	public static class BlockCustom extends BlockStairs {
		public BlockCustom() {
			super(new Block(Material.WOOD).getDefaultState());
			setUnlocalizedName("worm_wood_stairs");
			setSoundType(SoundType.WOOD);
			setHardness(3F);
			setResistance(2F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 5;
		}
	}
}
