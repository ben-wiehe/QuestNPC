
package net.mcreator.questnpc.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.questnpc.item.ItemTingleStone;
import net.mcreator.questnpc.block.BlockTingleStoneOre;
import net.mcreator.questnpc.ElementsQuestNpcMod;

@ElementsQuestNpcMod.ModElement.Tag
public class RecipeTingleStoneOreSmelting extends ElementsQuestNpcMod.ModElement {
	public RecipeTingleStoneOreSmelting(ElementsQuestNpcMod instance) {
		super(instance, 42);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTingleStoneOre.block, (int) (1)), new ItemStack(ItemTingleStone.block, (int) (1)), 0.7F);
	}
}
