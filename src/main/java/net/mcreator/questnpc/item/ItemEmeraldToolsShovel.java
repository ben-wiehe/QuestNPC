
package net.mcreator.questnpc.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.questnpc.ElementsQuestNpcMod;

import java.util.Set;
import java.util.HashMap;

@ElementsQuestNpcMod.ModElement.Tag
public class ItemEmeraldToolsShovel extends ElementsQuestNpcMod.ModElement {
	@GameRegistry.ObjectHolder("quest_npc:emerald_tools_shovel")
	public static final Item block = null;
	public ItemEmeraldToolsShovel(ElementsQuestNpcMod instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("EMERALD_TOOLS_SHOVEL", 2, 286, 6f, -2f, 15)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("emerald_tools_shovel").setRegistryName("emerald_tools_shovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("quest_npc:emerald_tools_shovel", "inventory"));
	}
}
