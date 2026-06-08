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

public class SakuraBoots extends ItemArmor {
    private static final ArmorMaterial SAKURA_BOOTS_MATERIAL = EnumHelper.addArmorMaterial(
            "sakura", "forgewhimsy:sakura", 30, new int[]{0, 8, 0, 0}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F
    );

    @SideOnly(Side.CLIENT)
    private static ModelSakura modelSakura;

    public SakuraBoots(String name) {
        super(SAKURA_BOOTS_MATERIAL, 1, EntityEquipmentSlot.FEET);
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
        // Boots only affect legs
        modelSakura.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.FEET);
        modelSakura.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.FEET);
        // Ensure other parts are hidden
        modelSakura.bipedHead.showModel = false;
        modelSakura.bipedBody.showModel = false;
        modelSakura.bipedRightArm.showModel = false;
        modelSakura.bipedLeftArm.showModel = false;
        return modelSakura;
    }
}
