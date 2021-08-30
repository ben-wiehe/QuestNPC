
package net.mcreator.questnpc.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.questnpc.ElementsQuestNpcMod;

import java.util.Set;
import java.util.HashMap;

@ElementsQuestNpcMod.ModElement.Tag
public class ItemEmeraldToolsHoe extends ElementsQuestNpcMod.ModElement {
	@GameRegistry.ObjectHolder("quest_npc:emerald_tools_hoe")
	public static final Item block = null;
	public ItemEmeraldToolsHoe(ElementsQuestNpcMod instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("EMERALD_TOOLS_HOE", 2, 286, 6f, 0f, 15)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("emerald_tools_hoe").setRegistryName("emerald_tools_hoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("quest_npc:emerald_tools_hoe", "inventory"));
	}
}
