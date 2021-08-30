
package net.mcreator.questnpc.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.questnpc.ElementsQuestNpcMod;

@ElementsQuestNpcMod.ModElement.Tag
public class ItemLeatherChainmail extends ElementsQuestNpcMod.ModElement {
	@GameRegistry.ObjectHolder("quest_npc:leather_chainmailhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("quest_npc:leather_chainmailbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("quest_npc:leather_chainmaillegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("quest_npc:leather_chainmailboots")
	public static final Item boots = null;
	public ItemLeatherChainmail(ElementsQuestNpcMod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("LEATHER_CHAINMAIL", "quest_npc:leatherchainmail", 25, new int[]{2, 4, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("leather_chainmailhelmet")
				.setRegistryName("leather_chainmailhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("leather_chainmailbody")
				.setRegistryName("leather_chainmailbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("leather_chainmaillegs")
				.setRegistryName("leather_chainmaillegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("leather_chainmailboots")
				.setRegistryName("leather_chainmailboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("quest_npc:leather_chainmailhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("quest_npc:leather_chainmailbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("quest_npc:leather_chainmaillegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("quest_npc:leather_chainmailboots", "inventory"));
	}
}
