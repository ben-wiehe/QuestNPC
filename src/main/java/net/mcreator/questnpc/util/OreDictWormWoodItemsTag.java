
package net.mcreator.questnpc.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.questnpc.block.BlockWormWoodWood;
import net.mcreator.questnpc.block.BlockWormWoodLog;
import net.mcreator.questnpc.ElementsQuestNpcMod;

@ElementsQuestNpcMod.ModElement.Tag
public class OreDictWormWoodItemsTag extends ElementsQuestNpcMod.ModElement {
	public OreDictWormWoodItemsTag(ElementsQuestNpcMod instance) {
		super(instance, 29);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("wormwood_log", new ItemStack(BlockWormWoodWood.block, (int) (1)));
		OreDictionary.registerOre("wormwood_log", new ItemStack(BlockWormWoodLog.block, (int) (1)));
	}
}
