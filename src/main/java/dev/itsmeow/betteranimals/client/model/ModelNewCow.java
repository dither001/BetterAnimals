package dev.itsmeow.betteranimals.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

/**
 * cow2 - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelNewCow<T extends LivingEntity> extends Model<T> {

    public ModelRenderer chest;
    public ModelRenderer stomach;
    public ModelRenderer neck;
    public ModelRenderer lArm01;
    public ModelRenderer rArm01;
    public ModelRenderer ass;
    public ModelRenderer lLeg01;
    public ModelRenderer rLeg01;
    public ModelRenderer udder;
    public ModelRenderer tail01;
    public ModelRenderer lLeg02;
    public ModelRenderer lLeg03;
    public ModelRenderer lHindHoof;
    public ModelRenderer rLeg02;
    public ModelRenderer rLeg03;
    public ModelRenderer rHindHoof;
    public ModelRenderer udderTeat1;
    public ModelRenderer udderTeat2;
    public ModelRenderer udderTeat3;
    public ModelRenderer udderTeat4;
    public ModelRenderer tail02;
    public ModelRenderer tail03;
    public ModelRenderer neck02;
    public ModelRenderer head;
    public ModelRenderer upperJaw;
    public ModelRenderer snoot;
    public ModelRenderer lowerJaw;
    public ModelRenderer lEar01;
    public ModelRenderer rEar01;
    public ModelRenderer lHorn01a;
    public ModelRenderer rHorn01a;
    public ModelRenderer lEar02;
    public ModelRenderer rEar02;
    public ModelRenderer lHorn01b;
    public ModelRenderer lHorn01c;
    public ModelRenderer lHorn01d;
    public ModelRenderer lHorn02;
    public ModelRenderer rHorn01b;
    public ModelRenderer rHorn01c;
    public ModelRenderer rHorn01d;
    public ModelRenderer rHorn02;
    public ModelRenderer lArm02;
    public ModelRenderer lArm03;
    public ModelRenderer lForeHoof;
    public ModelRenderer rArm02;
    public ModelRenderer rArm03;
    public ModelRenderer rForeHoof;

    public ModelNewCow() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.lLeg03 = new ModelRenderer(this, 106, 34);
        this.lLeg03.setRotationPoint(0.0F, 5.6F, -0.2F);
        this.lLeg03.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.setRotateAngle(lLeg03, -0.18203784098300857F, 0.0F, 0.045553093477052F);
        this.udder = new ModelRenderer(this, 0, 81);
        this.udder.setRotationPoint(0.0F, 5.0F, 6.3F);
        this.udder.addBox(-3.5F, -0.5F, -4.2F, 7, 5, 8, 0.0F);
        this.setRotateAngle(udder, 0.136659280431156F, 0.0F, 0.0F);
        this.udderTeat3 = new ModelRenderer(this, 0, 80);
        this.udderTeat3.setRotationPoint(2.0F, 3.7F, 1.4F);
        this.udderTeat3.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.rEar01 = new ModelRenderer(this, 46, 34);
        this.rEar01.mirror = true;
        this.rEar01.setRotationPoint(-3.4F, -1.1F, -1.9F);
        this.rEar01.addBox(-5.0F, -0.5F, -1.5F, 5, 1, 3, 0.0F);
        this.setRotateAngle(rEar01, 0.4553564018453205F, 0.091106186954104F, -0.091106186954104F);
        this.lLeg02 = new ModelRenderer(this, 103, 21);
        this.lLeg02.setRotationPoint(1.1F, 9.4F, 0.1F);
        this.lLeg02.addBox(-2.0F, 0.0F, -2.5F, 4, 6, 5, 0.0F);
        this.setRotateAngle(lLeg02, 0.31869712141416456F, 0.0F, 0.091106186954104F);
        this.udderTeat4 = new ModelRenderer(this, 0, 80);
        this.udderTeat4.mirror = true;
        this.udderTeat4.setRotationPoint(-2.0F, 3.7F, 1.4F);
        this.udderTeat4.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.rHorn01a = new ModelRenderer(this, 0, 59);
        this.rHorn01a.mirror = true;
        this.rHorn01a.setRotationPoint(-3.1F, -2.6F, -3.2F);
        this.rHorn01a.addBox(-2.0F, 0.2F, -0.8F, 2, 1, 1, 0.0F);
        this.setRotateAngle(rHorn01a, 0.0F, -0.7285004297824331F, 0.5009094953223726F);
        this.lEar02 = new ModelRenderer(this, 59, 40);
        this.lEar02.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.lEar02.addBox(0.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(lEar02, 0.0F, 0.0F, 0.22759093446006054F);
        this.rEar02 = new ModelRenderer(this, 59, 40);
        this.rEar02.mirror = true;
        this.rEar02.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.rEar02.addBox(-4.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(rEar02, 0.0F, 0.0F, -0.22759093446006054F);
        this.rHorn01b = new ModelRenderer(this, 0, 59);
        this.rHorn01b.mirror = true;
        this.rHorn01b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn01b.addBox(-2.0F, 0.2F, -0.2F, 2, 1, 1, 0.0F);
        this.chest = new ModelRenderer(this, 0, 0);
        this.chest.setRotationPoint(0.0F, 0.5F, -7.5F);
        this.chest.addBox(-5.5F, -4.5F, -7.5F, 11, 15, 9, 0.0F);
        this.setRotateAngle(chest, -0.045553093477052F, 0.0F, 0.0F);
        this.lHorn01b = new ModelRenderer(this, 0, 59);
        this.lHorn01b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn01b.addBox(0.0F, 0.2F, -0.2F, 2, 1, 1, 0.0F);
        this.neck = new ModelRenderer(this, 45, 14);
        this.neck.setRotationPoint(0.0F, -0.2F, -5.7F);
        this.neck.addBox(-4.0F, -4.5F, -4.0F, 8, 9, 4, 0.0F);
        this.setRotateAngle(neck, -0.27314402793711257F, 0.0F, 0.0F);
        this.lArm02 = new ModelRenderer(this, 77, 20);
        this.lArm02.setRotationPoint(1.3F, 10.3F, 0.4F);
        this.lArm02.addBox(-2.1F, 0.0F, -2.5F, 4, 4, 5, 0.0F);
        this.lForeHoof = new ModelRenderer(this, 89, 41);
        this.lForeHoof.setRotationPoint(0.0F, 8.0F, -0.4F);
        this.lForeHoof.addBox(-2.0F, 0.0F, -2.5F, 4, 3, 4, 0.0F);
        this.lHindHoof = new ModelRenderer(this, 89, 41);
        this.lHindHoof.setRotationPoint(0.0F, 7.1F, -0.4F);
        this.lHindHoof.addBox(-2.0F, 0.0F, -2.5F, 4, 3, 4, 0.0F);
        this.rHorn02 = new ModelRenderer(this, 0, 62);
        this.rHorn02.mirror = true;
        this.rHorn02.setRotationPoint(-1.8F, 0.1F, 0.0F);
        this.rHorn02.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(rHorn02, 0.0F, -0.18203784098300857F, 0.0F);
        this.rArm02 = new ModelRenderer(this, 77, 20);
        this.rArm02.mirror = true;
        this.rArm02.setRotationPoint(-1.3F, 10.3F, 0.4F);
        this.rArm02.addBox(-1.9F, 0.0F, -2.5F, 4, 4, 5, 0.0F);
        this.lowerJaw = new ModelRenderer(this, 74, 73);
        this.lowerJaw.setRotationPoint(0.0F, 1.8F, 1.8F);
        this.lowerJaw.addBox(-2.5F, -0.1F, -0.6F, 5, 6, 1, 0.0F);
        this.setRotateAngle(lowerJaw, -0.091106186954104F, 0.0F, 0.0F);
        this.lHorn01c = new ModelRenderer(this, 0, 59);
        this.lHorn01c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn01c.addBox(0.0F, -0.8F, -0.8F, 2, 1, 1, 0.0F);
        this.rHorn01d = new ModelRenderer(this, 0, 59);
        this.rHorn01d.mirror = true;
        this.rHorn01d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn01d.addBox(-2.0F, -0.8F, -0.2F, 2, 1, 1, 0.0F);
        this.snoot = new ModelRenderer(this, 65, 63);
        this.snoot.setRotationPoint(0.0F, 3.5F, -2.5F);
        this.snoot.addBox(-2.5F, -2.5F, -0.7F, 5, 7, 3, 0.0F);
        this.setRotateAngle(snoot, 0.36425021489121656F, 0.0F, 0.0F);
        this.rHorn01c = new ModelRenderer(this, 0, 59);
        this.rHorn01c.mirror = true;
        this.rHorn01c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn01c.addBox(-2.0F, -0.8F, -0.8F, 2, 1, 1, 0.0F);
        this.neck02 = new ModelRenderer(this, 45, 0);
        this.neck02.setRotationPoint(0.0F, 0.0F, -3.3F);
        this.neck02.addBox(-3.5F, -4.0F, -4.6F, 7, 7, 5, 0.0F);
        this.setRotateAngle(neck02, -0.136659280431156F, 0.0F, 0.0F);
        this.stomach = new ModelRenderer(this, 0, 25);
        this.stomach.setRotationPoint(0.0F, 3.7F, 1.2F);
        this.stomach.addBox(-7.0F, -8.0F, 0.0F, 14, 15, 15, 0.0F);
        this.setRotateAngle(stomach, 0.045553093477052F, 0.0F, 0.0F);
        this.rArm03 = new ModelRenderer(this, 77, 30);
        this.rArm03.mirror = true;
        this.rArm03.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.rArm03.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(rArm03, -0.045553093477052F, 0.0F, -0.091106186954104F);
        this.rLeg03 = new ModelRenderer(this, 106, 34);
        this.rLeg03.mirror = true;
        this.rLeg03.setRotationPoint(0.0F, 5.6F, -0.2F);
        this.rLeg03.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.setRotateAngle(rLeg03, -0.18203784098300857F, 0.0F, -0.045553093477052F);
        this.rHindHoof = new ModelRenderer(this, 89, 41);
        this.rHindHoof.mirror = true;
        this.rHindHoof.setRotationPoint(0.0F, 7.1F, -0.4F);
        this.rHindHoof.addBox(-2.0F, 0.0F, -2.5F, 4, 3, 4, 0.0F);
        this.ass = new ModelRenderer(this, 0, 58);
        this.ass.setRotationPoint(0.0F, -1.2F, 13.9F);
        this.ass.addBox(-5.5F, -7.0F, 0.0F, 11, 12, 10, 0.0F);
        this.setRotateAngle(ass, -0.136659280431156F, 0.0F, 0.0F);
        this.lEar01 = new ModelRenderer(this, 46, 34);
        this.lEar01.setRotationPoint(3.4F, -1.1F, -1.9F);
        this.lEar01.addBox(0.0F, -0.5F, -1.5F, 5, 1, 3, 0.0F);
        this.setRotateAngle(lEar01, 0.4553564018453205F, -0.091106186954104F, 0.091106186954104F);
        this.rLeg01 = new ModelRenderer(this, 103, 0);
        this.rLeg01.mirror = true;
        this.rLeg01.setRotationPoint(-3.0F, -4.4F, 4.4F);
        this.rLeg01.addBox(-3.7F, -1.5F, -3.0F, 4, 12, 7, 0.0F);
        this.setRotateAngle(rLeg01, 0.0F, 0.0F, 0.136659280431156F);
        this.upperJaw = new ModelRenderer(this, 82, 63);
        this.upperJaw.setRotationPoint(0.0F, 2.3F, -0.1F);
        this.upperJaw.addBox(-3.0F, -1.3F, -1.5F, 6, 7, 3, 0.0F);
        this.lArm01 = new ModelRenderer(this, 77, 0);
        this.lArm01.setRotationPoint(3.5F, -1.0F, -3.2F);
        this.lArm01.addBox(-0.7F, -1.0F, -3.0F, 4, 12, 7, 0.0F);
        this.setRotateAngle(lArm01, 0.091106186954104F, 0.0F, -0.091106186954104F);
        this.tail02 = new ModelRenderer(this, 10, 96);
        this.tail02.setRotationPoint(0.0F, 3.7F, 0.2F);
        this.tail02.addBox(-0.5F, 0.0F, -0.5F, 1, 12, 1, 0.0F);
        this.setRotateAngle(tail02, -0.27314402793711257F, 0.0F, 0.0F);
        this.rForeHoof = new ModelRenderer(this, 89, 41);
        this.rForeHoof.mirror = true;
        this.rForeHoof.setRotationPoint(0.0F, 8.0F, -0.4F);
        this.rForeHoof.addBox(-2.0F, 0.0F, -2.5F, 4, 3, 4, 0.0F);
        this.rLeg02 = new ModelRenderer(this, 103, 21);
        this.rLeg02.mirror = true;
        this.rLeg02.setRotationPoint(-1.1F, 9.4F, 0.1F);
        this.rLeg02.addBox(-2.0F, 0.0F, -2.5F, 4, 6, 5, 0.0F);
        this.setRotateAngle(rLeg02, 0.31869712141416456F, 0.0F, -0.091106186954104F);
        this.udderTeat1 = new ModelRenderer(this, 0, 80);
        this.udderTeat1.setRotationPoint(2.0F, 3.7F, -1.7F);
        this.udderTeat1.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.rArm01 = new ModelRenderer(this, 77, 0);
        this.rArm01.mirror = true;
        this.rArm01.setRotationPoint(-3.5F, -1.0F, -3.2F);
        this.rArm01.addBox(-3.3F, -1.0F, -3.0F, 4, 12, 7, 0.0F);
        this.setRotateAngle(rArm01, 0.091106186954104F, 0.0F, 0.091106186954104F);
        this.udderTeat2 = new ModelRenderer(this, 0, 80);
        this.udderTeat2.mirror = true;
        this.udderTeat2.setRotationPoint(-2.0F, 3.7F, -1.7F);
        this.udderTeat2.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.lLeg01 = new ModelRenderer(this, 103, 0);
        this.lLeg01.setRotationPoint(3.0F, -4.4F, 4.4F);
        this.lLeg01.addBox(-0.7F, -1.5F, -3.0F, 4, 12, 7, 0.0F);
        this.setRotateAngle(lLeg01, 0.0F, 0.0F, -0.136659280431156F);
        this.lHorn02 = new ModelRenderer(this, 0, 62);
        this.lHorn02.setRotationPoint(1.8F, 0.1F, 0.0F);
        this.lHorn02.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(lHorn02, 0.0F, 0.18203784098300857F, 0.0F);
        this.lArm03 = new ModelRenderer(this, 77, 30);
        this.lArm03.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.lArm03.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(lArm03, -0.045553093477052F, 0.0F, 0.091106186954104F);
        this.lHorn01a = new ModelRenderer(this, 0, 59);
        this.lHorn01a.setRotationPoint(3.1F, -2.6F, -3.2F);
        this.lHorn01a.addBox(0.0F, 0.2F, -0.8F, 2, 1, 1, 0.0F);
        this.setRotateAngle(lHorn01a, 0.0F, 0.7285004297824331F, -0.5009094953223726F);
        this.tail03 = new ModelRenderer(this, 15, 96);
        this.tail03.setRotationPoint(0.0F, 11.8F, 0.0F);
        this.tail03.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tail03, -0.045553093477052F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 66, 46);
        this.head.setRotationPoint(0.0F, -0.2F, -5.1F);
        this.head.addBox(-4.0F, -3.5F, -4.0F, 8, 5, 6, 0.0F);
        this.setRotateAngle(head, -0.5009094953223726F, 0.0F, 0.0F);
        this.lHorn01d = new ModelRenderer(this, 0, 59);
        this.lHorn01d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn01d.addBox(0.0F, -0.8F, -0.2F, 2, 1, 1, 0.0F);
        this.tail01 = new ModelRenderer(this, 0, 96);
        this.tail01.setRotationPoint(0.0F, -6.4F, 9.1F);
        this.tail01.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(tail01, 0.4553564018453205F, 0.0F, 0.0F);
        this.lLeg02.addChild(this.lLeg03);
        this.ass.addChild(this.udder);
        this.udder.addChild(this.udderTeat3);
        this.head.addChild(this.rEar01);
        this.lLeg01.addChild(this.lLeg02);
        this.udder.addChild(this.udderTeat4);
        this.head.addChild(this.rHorn01a);
        this.lEar01.addChild(this.lEar02);
        this.rEar01.addChild(this.rEar02);
        this.rHorn01a.addChild(this.rHorn01b);
        this.lHorn01a.addChild(this.lHorn01b);
        this.chest.addChild(this.neck);
        this.lArm01.addChild(this.lArm02);
        this.lArm03.addChild(this.lForeHoof);
        this.lLeg03.addChild(this.lHindHoof);
        this.rHorn01a.addChild(this.rHorn02);
        this.rArm01.addChild(this.rArm02);
        this.head.addChild(this.lowerJaw);
        this.lHorn01a.addChild(this.lHorn01c);
        this.rHorn01a.addChild(this.rHorn01d);
        this.head.addChild(this.snoot);
        this.rHorn01a.addChild(this.rHorn01c);
        this.neck.addChild(this.neck02);
        this.chest.addChild(this.stomach);
        this.rArm02.addChild(this.rArm03);
        this.rLeg02.addChild(this.rLeg03);
        this.rLeg03.addChild(this.rHindHoof);
        this.stomach.addChild(this.ass);
        this.head.addChild(this.lEar01);
        this.ass.addChild(this.rLeg01);
        this.head.addChild(this.upperJaw);
        this.chest.addChild(this.lArm01);
        this.tail01.addChild(this.tail02);
        this.rArm03.addChild(this.rForeHoof);
        this.rLeg01.addChild(this.rLeg02);
        this.udder.addChild(this.udderTeat1);
        this.chest.addChild(this.rArm01);
        this.udder.addChild(this.udderTeat2);
        this.ass.addChild(this.lLeg01);
        this.lHorn01a.addChild(this.lHorn02);
        this.lArm02.addChild(this.lArm03);
        this.head.addChild(this.lHorn01a);
        this.tail02.addChild(this.tail03);
        this.neck02.addChild(this.head);
        this.lHorn01a.addChild(this.lHorn01d);
        this.ass.addChild(this.tail01);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.chest.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.neck.rotateAngleX = rad(headPitch) - 0.27314402793711257F;
        this.neck.rotateAngleY = rad(netHeadYaw);
        lLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * 0.7F * limbSwingAmount;
        lArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * 0.7F * limbSwingAmount + 0.091106186954104F;
        rLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F) * 0.7F * limbSwingAmount;
        rArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * 0.7F * limbSwingAmount + 0.091106186954104F;
    }

}
