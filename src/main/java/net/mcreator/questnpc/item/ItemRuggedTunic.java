
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
public class ItemRuggedTunic extends ElementsQuestNpcMod.ModElement {
	@GameRegistry.ObjectHolder("quest_npc:rugged_tunichelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("quest_npc:rugged_tunicbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("quest_npc:rugged_tuniclegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("quest_npc:rugged_tunicboots")
	public static final Item boots = null;
	public ItemRuggedTunic(ElementsQuestNpcMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("RUGGED_TUNIC", "quest_npc:rugged_tunic", 4, new int[]{1, 2, 2, 1}, 0,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("rugged_tunichelmet")
				.setRegistryName("rugged_tunichelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("rugged_tunicbody")
				.setRegistryName("rugged_tunicbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("rugged_tuniclegs")
				.setRegistryName("rugged_tuniclegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("rugged_tunicboots")
				.setRegistryName("rugged_tunicboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("quest_npc:rugged_tunichelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("quest_npc:rugged_tunicbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("quest_npc:rugged_tuniclegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("quest_npc:rugged_tunicboots", "inventory"));
	}
}
