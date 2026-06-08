package gay.xujun.forgewhimsy.item.armor;

import gay.xujun.forgewhimsy.client.model.armor.ModelSakura;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SakuraHelmet extends ItemArmor {
    @SideOnly(Side.CLIENT)
    private static ModelSakura modelSakura;

    private static final ArmorMaterial SAKURA_HELMET_MATERIAL = EnumHelper.addArmorMaterial(
            "sakura", "forgewhimsy:sakura", 30, new int[]{0, 8, 0, 0}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F
    );

    public SakuraHelmet(String name) {
        super(SAKURA_HELMET_MATERIAL, 1, EntityEquipmentSlot.HEAD);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return "forgewhimsy:texture/armor/sakura.png";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        // まだモデルが作られていなければ生成する
        if (modelSakura == null) {
            modelSakura = new ModelSakura();
        }

        // プレイヤーの現在のポーズ（腕や足の角度）を反映させる
        modelSakura.setModelAttributes(_default);

        // 部位ごとに表示・非表示を切り替える（今回のアイテムはHEADだけ表示）
        modelSakura.bipedHead.showModel = (armorSlot == EntityEquipmentSlot.HEAD);
        modelSakura.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST);
        modelSakura.bipedRightArm.showModel = (armorSlot == EntityEquipmentSlot.CHEST);
        modelSakura.bipedLeftArm.showModel = (armorSlot == EntityEquipmentSlot.CHEST);
        modelSakura.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
        modelSakura.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS);

        return modelSakura;
    }
}