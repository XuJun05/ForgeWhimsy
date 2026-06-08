package gay.xujun.forgewhimsy.client.model.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSakura extends ModelBiped {
    private final ModelRenderer armorBody, armorBody_r1, armor_back;
    private final ModelRenderer armorLeftArm, shoulder, armorRightArm, shoulder2;
    private final ModelRenderer armorLeftLeg, armorLeftLeg_r1, armorLeftLeg_r2, leg_armor3;
    private final ModelRenderer armorRightLeg, armorRightLeg_r1, armorRightLeg_r2, leg_armor;
    private final ModelRenderer armorHead, bone, bone_r1, crown, crown_r1;
    private final ModelRenderer helmet_thing2, helmet_thing2_r1, helmet_thing, helmet_thing_r1;
    private final ModelRenderer armorRightBoot, armorLeftBoot;

    public ModelSakura() {
        super();
        this.textureWidth = 128;
        this.textureHeight = 128;

        armorBody = new ModelRenderer(this);
        armorBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 47, -4.0F, 0.0F, -2.5F, 8, 12, 5, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 26, 47, -4.0F, 0.0F, -2.5F, 8, 12, 5, 0.4F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 52, 53, -1.5F, 9.0F, -4.0F, 3, 3, 2, 0.0F, false));

        armorBody_r1 = new ModelRenderer(this);
        armorBody_r1.setRotationPoint(0.0F, 11.0F, -3.0F);
        armorBody.addChild(armorBody_r1);
        setRotationAngle(armorBody_r1, -0.1309F, 0.0F, 0.0F);
        armorBody_r1.cubeList.add(new ModelBox(armorBody_r1, 52, 58, -4.0F, -1.0F, -0.4F, 8, 5, 1, 0.0F, false));

        armor_back = new ModelRenderer(this);
        armor_back.setRotationPoint(0.0F, 1.0F, 3.0F);
        armorBody.addChild(armor_back);
        setRotationAngle(armor_back, 0.1745F, 0.0F, 0.0F);
        armor_back.cubeList.add(new ModelBox(armor_back, 52, 38, -4.0F, -3.0F, -1.6F, 8, 11, 3, 0.01F, false));

        armorLeftArm = new ModelRenderer(this);
        armorLeftArm.setRotationPoint(4.0F, 2.0F, 0.0F);
        armorLeftArm.cubeList.add(new ModelBox(armorLeftArm, 88, 48, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        armorLeftArm.cubeList.add(new ModelBox(armorLeftArm, 72, 48, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.2F, false));

        shoulder = new ModelRenderer(this);
        shoulder.setRotationPoint(0.0F, -2.0F, 0.0F);
        armorLeftArm.addChild(shoulder);
        setRotationAngle(shoulder, 0.0F, 0.0F, -0.1745F);
        shoulder.cubeList.add(new ModelBox(shoulder, 56, 13, 0.5F, -1.5F, -2.5F, 4, 9, 5, 0.0F, false));

        armorRightArm = new ModelRenderer(this);
        armorRightArm.setRotationPoint(-4.0F, 2.0F, 0.0F);
        armorRightArm.cubeList.add(new ModelBox(armorRightArm, 88, 48, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        armorRightArm.cubeList.add(new ModelBox(armorRightArm, 72, 48, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.2F, true));

        shoulder2 = new ModelRenderer(this);
        shoulder2.setRotationPoint(0.0F, -2.0F, 0.0F);
        armorRightArm.addChild(shoulder2);
        setRotationAngle(shoulder2, 0.0F, 0.0F, 0.1745F);
        shoulder2.cubeList.add(new ModelBox(shoulder2, 56, 13, -4.5F, -1.5F, -2.5F, 4, 9, 5, 0.0F, true));

        armorLeftLeg = new ModelRenderer(this);
        armorLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        armorLeftLeg_r1 = new ModelRenderer(this);
        armorLeftLeg_r1.setRotationPoint(-1.8F, 0.0F, -2.0F);
        armorLeftLeg.addChild(armorLeftLeg_r1);
        setRotationAngle(armorLeftLeg_r1, -0.1745F, 0.0F, 0.0F);
        armorLeftLeg_r1.cubeList.add(new ModelBox(armorLeftLeg_r1, 0, 18, -0.2F, -1.0F, -1.2F, 3, 8, 2, 0.0F, false));
        armorLeftLeg_r2 = new ModelRenderer(this);
        armorLeftLeg_r2.setRotationPoint(-2.0F, -1.0F, 1.0F);
        armorLeftLeg.addChild(armorLeftLeg_r2);
        setRotationAngle(armorLeftLeg_r2, 0.1745F, 0.0F, 0.0F);
        armorLeftLeg_r2.cubeList.add(new ModelBox(armorLeftLeg_r2, 0, 30, 0.0F, 0.0F, -0.5F, 4, 9, 2, -0.001F, false));
        leg_armor3 = new ModelRenderer(this);
        leg_armor3.setRotationPoint(1.0F, 0.0F, 0.0F);
        armorLeftLeg.addChild(leg_armor3);
        setRotationAngle(leg_armor3, 0.0F, 0.0F, -0.0873F);
        leg_armor3.cubeList.add(new ModelBox(leg_armor3, 20, 34, -2.0F, 0.0F, -2.5F, 4, 8, 5, 0.0F, false));

        armorRightLeg = new ModelRenderer(this);
        armorRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        armorRightLeg_r1 = new ModelRenderer(this);
        armorRightLeg_r1.setRotationPoint(2.0F, -1.0F, 1.0F);
        armorRightLeg.addChild(armorRightLeg_r1);
        setRotationAngle(armorRightLeg_r1, 0.1745F, 0.0F, 0.0F);
        armorRightLeg_r1.cubeList.add(new ModelBox(armorRightLeg_r1, 0, 30, -4.0F, 0.0F, -0.5F, 4, 9, 2, -0.001F, true));
        armorRightLeg_r2 = new ModelRenderer(this);
        armorRightLeg_r2.setRotationPoint(2.2F, 0.0F, -2.0F);
        armorRightLeg.addChild(armorRightLeg_r2);
        setRotationAngle(armorRightLeg_r2, -0.1745F, 0.0F, 0.0F);
        armorRightLeg_r2.cubeList.add(new ModelBox(armorRightLeg_r2, 0, 18, -3.2F, -1.0F, -1.2F, 3, 8, 2, 0.0F, true));
        leg_armor = new ModelRenderer(this);
        leg_armor.setRotationPoint(-1.0F, 0.0F, 0.0F);
        armorRightLeg.addChild(leg_armor);
        setRotationAngle(leg_armor, 0.0F, 0.0F, 0.0873F);
        leg_armor.cubeList.add(new ModelBox(leg_armor, 20, 34, -2.0F, 0.0F, -2.5F, 4, 8, 5, 0.0F, true));

        armorHead = new ModelRenderer(this);
        armorHead.setRotationPoint(0.0F, 1.0F, 0.0F);
        armorHead.cubeList.add(new ModelBox(armorHead, 42, 0, -4.5F, -10.0F, -4.5F, 9, 4, 9, 0.0F, false));
        armorHead.cubeList.add(new ModelBox(armorHead, 0, 0, -4.0F, -7.0F, -6.5F, 8, 1, 2, 0.0F, false));
        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, -6.0F, 4.5F);
        armorHead.addChild(bone);
        bone_r1 = new ModelRenderer(this);
        bone_r1.setRotationPoint(0.0F, 0.0F, -0.5F);
        bone.addChild(bone_r1);
        setRotationAngle(bone_r1, 0.2618F, 0.0F, 0.0F);
        bone_r1.cubeList.add(new ModelBox(bone_r1, 98, 27, -6.5F, 2.3F, 0.19F, 13, 3, 2, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 108, 20, -4.5F, -0.5F, 0.2F, 9, 4, 1, 0.0F, false));
        crown = new ModelRenderer(this);
        crown.setRotationPoint(0.0F, -8.0F, -5.0F);
        armorHead.addChild(crown);
        crown_r1 = new ModelRenderer(this);
        crown_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        crown.addChild(crown_r1);
        setRotationAngle(crown_r1, 0.0F, 0.0F, -0.7854F);
        crown_r1.cubeList.add(new ModelBox(crown_r1, 104, 52, -2.7F, -8.3F, 0.0F, 11, 11, 1, 0.0F, false));
        crown_r1.cubeList.add(new ModelBox(crown_r1, 118, 43, -0.2F, -1.8F, -1.0F, 2, 2, 1, 0.0F, false));
        crown_r1.cubeList.add(new ModelBox(crown_r1, 118, 46, -0.7F, -2.3F, -0.5F, 3, 3, 1, 0.0F, false));
        helmet_thing2 = new ModelRenderer(this);
        helmet_thing2.setRotationPoint(-5.0F, -6.0F, -5.0F);
        armorHead.addChild(helmet_thing2);
        helmet_thing2_r1 = new ModelRenderer(this);
        helmet_thing2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        helmet_thing2.addChild(helmet_thing2_r1);
        setRotationAngle(helmet_thing2_r1, 0.0F, 0.0F, 0.3054F);
        helmet_thing2_r1.cubeList.add(new ModelBox(helmet_thing2_r1, 88, 7, -1.0F, 2.2F, 1.0F, 1, 3, 10, 0.0F, true));
        helmet_thing2_r1.cubeList.add(new ModelBox(helmet_thing2_r1, 106, 0, 0.0F, -0.8F, 0.0F, 1, 4, 10, 0.0F, true));
        helmet_thing2_r1.cubeList.add(new ModelBox(helmet_thing2_r1, 82, 0, -3.0F, -0.8F, -1.0F, 4, 4, 1, 0.0F, true));
        helmet_thing = new ModelRenderer(this);
        helmet_thing.setRotationPoint(5.0F, -6.0F, -5.0F);
        armorHead.addChild(helmet_thing);
        helmet_thing_r1 = new ModelRenderer(this);
        helmet_thing_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        helmet_thing.addChild(helmet_thing_r1);
        setRotationAngle(helmet_thing_r1, 0.0F, 0.0F, -0.2618F);
        helmet_thing_r1.cubeList.add(new ModelBox(helmet_thing_r1, 88, 7, 0.0F, 2.2F, 1.0F, 1, 3, 10, 0.0F, false));
        helmet_thing_r1.cubeList.add(new ModelBox(helmet_thing_r1, 106, 0, -1.0F, -0.8F, 0.0F, 1, 4, 10, 0.0F, false));
        helmet_thing_r1.cubeList.add(new ModelBox(helmet_thing_r1, 82, 0, -1.0F, -0.8F, -1.0F, 4, 4, 1, 0.0F, false));
        armorRightBoot = new ModelRenderer(this);
        armorRightBoot.setRotationPoint(-2.0F, 12.0F, 0.0F);
        armorRightBoot.cubeList.add(new ModelBox(armorRightBoot, 20, 17, -2.0F, 10.0F, -3.4F, 4, 2, 1, 0.21F, true));
        armorRightBoot.cubeList.add(new ModelBox(armorRightBoot, 26, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.2F, true));
        armorLeftBoot = new ModelRenderer(this);
        armorLeftBoot.setRotationPoint(2.0F, 12.0F, 0.0F);
        armorLeftBoot.cubeList.add(new ModelBox(armorLeftBoot, 20, 17, -2.0F, 10.0F, -3.4F, 4, 2, 1, 0.21F, false));
        armorLeftBoot.cubeList.add(new ModelBox(armorLeftBoot, 26, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.21F, false));

        this.bipedHead = armorHead;
        this.bipedBody = armorBody;
        this.bipedRightArm = armorRightArm;
        this.bipedLeftArm = armorLeftArm;
        this.bipedRightLeg = armorRightLeg;
        this.bipedLeftLeg = armorLeftLeg;
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}