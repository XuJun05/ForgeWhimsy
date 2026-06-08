package gay.xujun.forgewhimsy.item.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import gay.xujun.forgewhimsy.client.model.armor.ModelSakura;

public class SakuraChestplate extends ItemArmor {
    private static final ArmorMaterial SAKURA_CHESTPLATE_MATERIAL = EnumHelper.addArmorMaterial(
            "sakura", "forgewhimsy:sakura", 30, new int[]{0, 8, 0, 0}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F
    );

    @SideOnly(Side.CLIENT)
    private static ModelSakura modelSakura;

    public SakuraChestplate(String name) {
        super(SAKURA_CHESTPLATE_MATERIAL, 1, EntityEquipmentSlot.CHEST);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public String getArmorTexture(ItemStack stack, net.minecraft.entity.Entity entity, EntityEquipmentSlot slot, String type) {
        return "forgewhimsy:texture/armor/sakura.png";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        if (modelSakura == null) {
            modelSakura = new ModelSakura();
        }
        modelSakura.setModelAttributes(_default);
        modelSakura.bipedHead.showModel = (armorSlot == EntityEquipmentSlot.HEAD);
        modelSakura.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST);
        modelSakura.bipedRightArm.showModel = (armorSlot == EntityEquipmentSlot.CHEST);
        modelSakura.bipedLeftArm.showModel = (armorSlot == EntityEquipmentSlot.CHEST);
        modelSakura.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
        modelSakura.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
        return modelSakura;
    }
}
