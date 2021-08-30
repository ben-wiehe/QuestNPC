
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
public class ItemEmeralfArmorArmor extends ElementsQuestNpcMod.ModElement {
	@GameRegistry.ObjectHolder("quest_npc:emeralf_armor_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("quest_npc:emeralf_armor_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("quest_npc:emeralf_armor_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("quest_npc:emeralf_armor_armorboots")
	public static final Item boots = null;
	public ItemEmeralfArmorArmor(ElementsQuestNpcMod instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EMERALF_ARMOR_ARMOR", "quest_npc:emeralfarmor", 15, new int[]{2, 6, 5, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("emeralf_armor_armorhelmet")
				.setRegistryName("emeralf_armor_armorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("emeralf_armor_armorbody")
				.setRegistryName("emeralf_armor_armorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("emeralf_armor_armorlegs")
				.setRegistryName("emeralf_armor_armorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("emeralf_armor_armorboots")
				.setRegistryName("emeralf_armor_armorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("quest_npc:emeralf_armor_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("quest_npc:emeralf_armor_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("quest_npc:emeralf_armor_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("quest_npc:emeralf_armor_armorboots", "inventory"));
	}
}
