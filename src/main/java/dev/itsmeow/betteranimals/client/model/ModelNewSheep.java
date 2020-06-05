package dev.itsmeow.betteranimals.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.util.math.MathHelper;

/**
 * sheep3 - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelNewSheep<T extends LivingEntity> extends Model<T> {

    public ModelRenderer body;
    public ModelRenderer flank;
    public ModelRenderer neck;
    public ModelRenderer lArm01;
    public ModelRenderer rArm01;
    public ModelRenderer wool01;
    public ModelRenderer lLeg01;
    public ModelRenderer rLeg01;
    public ModelRenderer tail;
    public ModelRenderer wool02;
    public ModelRenderer lLeg02;
    public ModelRenderer lLegWool01;
    public ModelRenderer lLeg03;
    public ModelRenderer lLegWool02;
    public ModelRenderer lHindHoof;
    public ModelRenderer lLegWool03;
    public ModelRenderer rLeg02;
    public ModelRenderer rLegWool01;
    public ModelRenderer rLeg03;
    public ModelRenderer rLegWool02;
    public ModelRenderer rHindHoof;
    public ModelRenderer rLegWool03;
    public ModelRenderer wool07;
    public ModelRenderer neck02;
    public ModelRenderer wool03;
    public ModelRenderer head;
    public ModelRenderer wool04;
    public ModelRenderer lEar;
    public ModelRenderer rEar;
    public ModelRenderer lowerJaw;
    public ModelRenderer upperJaw01;
    public ModelRenderer snoot;
    public ModelRenderer wool05;
    public ModelRenderer wool06;
    public ModelRenderer upperJaw02;
    public ModelRenderer wool08;
    public ModelRenderer woolFur02;
    public ModelRenderer woolFur01;
    public ModelRenderer woolFur03;
    public ModelRenderer lArm02;
    public ModelRenderer lArmWool01;
    public ModelRenderer lForeHoof;
    public ModelRenderer lArmWool02;
    public ModelRenderer rArm02;
    public ModelRenderer rArmWool01;
    public ModelRenderer rForeHoof;
    public ModelRenderer rArmWool02;
    public ModelRenderer woolFur04;

    private boolean sheared;

    public ModelNewSheep() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.rArm01 = new ModelRenderer(this, 48, 0);
        this.rArm01.mirror = true;
        this.rArm01.setRotationPoint(-2.1F, -0.8F, -3.6F);
        this.rArm01.addBox(-3.0F, -1.5F, -2.0F, 3, 9, 4, 0.0F);
        this.setRotateAngle(rArm01, 0.091106186954104F, 0.0F, -0.06981317007977318F);
        this.rArmWool02 = new ModelRenderer(this, 64, 47);
        this.rArmWool02.mirror = true;
        this.rArmWool02.setRotationPoint(0.0F, 1.3F, 0.0F);
        this.rArmWool02.addBox(-1.5F, -2.0F, -1.5F, 3, 5, 3, 0.0F);
        this.lLeg02 = new ModelRenderer(this, 28, 15);
        this.lLeg02.setRotationPoint(1.4F, 6.1F, -0.4F);
        this.lLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(lLeg02, 0.6373942428283291F, 0.0F, 0.0F);
        this.wool07 = new ModelRenderer(this, 29, 54);
        this.wool07.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wool07.addBox(-2.0F, 0.0F, -1.5F, 4, 5, 3, 0.0F);
        this.rArm02 = new ModelRenderer(this, 51, 16);
        this.rArm02.mirror = true;
        this.rArm02.setRotationPoint(-1.5F, 7.4F, 0.0F);
        this.rArm02.addBox(-1.0F, -0.3F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(rArm02, -0.091106186954104F, 0.0F, 0.06981317007977318F);
        this.lLegWool02 = new ModelRenderer(this, 105, 24);
        this.lLegWool02.setRotationPoint(0.0F, 3.2F, 0.0F);
        this.lLegWool02.addBox(-1.9F, -3.0F, -2.0F, 4, 5, 4, 0.0F);
        this.rForeHoof = new ModelRenderer(this, 51, 29);
        this.rForeHoof.mirror = true;
        this.rForeHoof.setRotationPoint(-0.1F, 6.5F, 0.0F);
        this.rForeHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 2, 0.0F);
        this.neck = new ModelRenderer(this, 0, 12);
        this.neck.setRotationPoint(0.0F, -0.6F, -4.5F);
        this.neck.addBox(-3.0F, -3.0F, -5.0F, 6, 6, 5, 0.0F);
        this.setRotateAngle(neck, -0.5918411493512771F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 24);
        this.body.setRotationPoint(0.0F, 9.0F, -2.6F);
        this.body.addBox(-3.5F, -4.5F, -7.0F, 7, 9, 12, 0.0F);
        this.rLegWool03 = new ModelRenderer(this, 105, 35);
        this.rLegWool03.mirror = true;
        this.rLegWool03.setRotationPoint(0.0F, 1.4F, 0.5F);
        this.rLegWool03.addBox(-1.5F, -1.5F, -2.0F, 3, 3, 3, 0.0F);
        this.upperJaw01 = new ModelRenderer(this, 68, 10);
        this.upperJaw01.setRotationPoint(0.0F, 3.6F, 0.6F);
        this.upperJaw01.addBox(-1.4F, -0.2F, -0.5F, 3, 3, 1, 0.0F);
        this.lLegWool03 = new ModelRenderer(this, 105, 35);
        this.lLegWool03.setRotationPoint(0.0F, 1.4F, 0.5F);
        this.lLegWool03.addBox(-1.5F, -1.5F, -2.0F, 3, 3, 3, 0.0F);
        this.rLegWool02 = new ModelRenderer(this, 105, 24);
        this.rLegWool02.mirror = true;
        this.rLegWool02.setRotationPoint(0.0F, 3.2F, 0.0F);
        this.rLegWool02.addBox(-1.9F, -3.0F, -2.0F, 4, 5, 4, 0.0F);
        this.wool03 = new ModelRenderer(this, 79, 43);
        this.wool03.setRotationPoint(0.0F, -0.1F, -2.8F);
        this.wool03.addBox(-3.5F, -3.5F, -2.4F, 7, 7, 4, 0.0F);
        this.upperJaw02 = new ModelRenderer(this, 77, 10);
        this.upperJaw02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperJaw02.addBox(-1.6F, -0.2F, -0.5F, 1, 3, 1, 0.0F);
        this.rLegWool01 = new ModelRenderer(this, 84, 24);
        this.rLegWool01.mirror = true;
        this.rLegWool01.setRotationPoint(-1.6F, 3.1F, 0.0F);
        this.rLegWool01.addBox(-2.0F, -4.5F, -3.0F, 4, 9, 6, 0.0F);
        this.wool08 = new ModelRenderer(this, 76, 57);
        this.wool08.setRotationPoint(0.0F, 1.8F, -1.9F);
        this.wool08.addBox(-2.0F, -1.0F, -0.8F, 4, 2, 1, 0.0F);
        this.tail = new ModelRenderer(this, 29, 47);
        this.tail.setRotationPoint(0.0F, -3.3F, 5.9F);
        this.tail.addBox(-1.5F, 0.0F, -1.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(tail, 0.5918411493512771F, 0.0F, 0.0F);
        this.neck02 = new ModelRenderer(this, 0, 0);
        this.neck02.setRotationPoint(0.0F, 0.3F, -3.7F);
        this.neck02.addBox(-2.0F, -2.5F, -5.0F, 4, 5, 5, 0.0F);
        this.setRotateAngle(neck02, -0.31869712141416456F, 0.0F, 0.0F);
        this.wool05 = new ModelRenderer(this, 72, 55);
        this.wool05.setRotationPoint(0.0F, 0.2F, 0.4F);
        this.wool05.addBox(-3.0F, -1.6F, -2.7F, 6, 3, 4, 0.0F);
        this.lLeg01 = new ModelRenderer(this, 28, 0);
        this.lLeg01.setRotationPoint(2.3F, -2.3F, 4.5F);
        this.lLeg01.addBox(0.0F, -1.0F, -2.5F, 3, 8, 5, 0.0F);
        this.setRotateAngle(lLeg01, -0.18203784098300857F, 0.0F, 0.0F);
        this.lHindHoof = new ModelRenderer(this, 51, 29);
        this.lHindHoof.setRotationPoint(0.1F, 5.1F, 0.0F);
        this.lHindHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 2, 0.0F);
        this.woolFur01 = new ModelRenderer(this, 46, 56);
        this.woolFur01.setRotationPoint(0.0F, 2.0F, -0.6F);
        this.woolFur01.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 5, 0.0F);
        this.setRotateAngle(woolFur01, -0.8651597102135892F, 0.0F, 0.0F);
        this.flank = new ModelRenderer(this, 0, 47);
        this.flank.setRotationPoint(0.0F, -0.2F, 5.2F);
        this.flank.addBox(-3.0F, -4.2F, -1.3F, 6, 8, 8, 0.0F);
        this.setRotateAngle(flank, -0.136659280431156F, 0.0F, 0.0F);
        this.lLegWool01 = new ModelRenderer(this, 84, 24);
        this.lLegWool01.setRotationPoint(1.6F, 3.1F, 0.0F);
        this.lLegWool01.addBox(-2.0F, -4.5F, -3.0F, 4, 9, 6, 0.0F);
        this.woolFur04 = new ModelRenderer(this, 93, 51);
        this.woolFur04.setRotationPoint(0.0F, 4.9F, -2.8F);
        this.woolFur04.addBox(-4.0F, 0.0F, -3.5F, 8, 3, 9, 0.0F);
        this.lowerJaw = new ModelRenderer(this, 68, 16);
        this.lowerJaw.setRotationPoint(0.0F, 3.5F, 1.4F);
        this.lowerJaw.addBox(-1.5F, -0.3F, -0.5F, 3, 3, 1, 0.0F);
        this.head = new ModelRenderer(this, 66, 0);
        this.head.setRotationPoint(0.0F, -1.4F, -3.7F);
        this.head.addBox(-2.5F, 0.0F, -2.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(head, -0.5918411493512771F, 0.0F, 0.0F);
        this.lEar = new ModelRenderer(this, 87, 0);
        this.lEar.setRotationPoint(2.0F, 1.4F, -0.8F);
        this.lEar.addBox(0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(lEar, 0.4553564018453205F, 0.091106186954104F, 0.0F);
        this.lLeg03 = new ModelRenderer(this, 33, 26);
        this.lLeg03.setRotationPoint(0.1F, 4.7F, 0.0F);
        this.lLeg03.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(lLeg03, -0.31869712141416456F, 0.0F, 0.0F);
        this.woolFur02 = new ModelRenderer(this, 43, 48);
        this.woolFur02.setRotationPoint(0.0F, 0.9F, -0.1F);
        this.woolFur02.addBox(-2.5F, 0.0F, 0.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(woolFur02, -0.5918411493512771F, 0.0F, 0.0F);
        this.rLeg02 = new ModelRenderer(this, 28, 15);
        this.rLeg02.mirror = true;
        this.rLeg02.setRotationPoint(-1.4F, 6.1F, -0.4F);
        this.rLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rLeg02, 0.6373942428283291F, 0.0F, 0.0F);
        this.wool06 = new ModelRenderer(this, 74, 57);
        this.wool06.setRotationPoint(0.0F, 3.1F, 1.4F);
        this.wool06.addBox(-3.0F, -1.5F, -1.0F, 6, 2, 2, 0.0F);
        this.lArmWool01 = new ModelRenderer(this, 64, 31);
        this.lArmWool01.setRotationPoint(1.5F, 2.7F, -0.2F);
        this.lArmWool01.addBox(-2.0F, -5.0F, -2.5F, 4, 10, 5, 0.0F);
        this.lArm01 = new ModelRenderer(this, 48, 0);
        this.lArm01.setRotationPoint(2.1F, -0.8F, -3.6F);
        this.lArm01.addBox(0.0F, -1.5F, -2.0F, 3, 9, 4, 0.0F);
        this.setRotateAngle(lArm01, 0.091106186954104F, 0.0F, 0.06981317007977318F);
        this.snoot = new ModelRenderer(this, 68, 21);
        this.snoot.setRotationPoint(0.0F, 3.7F, -0.9F);
        this.snoot.addBox(-1.5F, 0.0F, -0.8F, 3, 3, 2, 0.0F);
        this.setRotateAngle(snoot, 0.27314402793711257F, 0.0F, 0.0F);
        this.lArmWool02 = new ModelRenderer(this, 64, 47);
        this.lArmWool02.setRotationPoint(0.0F, 1.3F, 0.0F);
        this.lArmWool02.addBox(-1.5F, -2.0F, -1.5F, 3, 5, 3, 0.0F);
        this.rEar = new ModelRenderer(this, 87, 0);
        this.rEar.mirror = true;
        this.rEar.setRotationPoint(-2.0F, 1.4F, -0.8F);
        this.rEar.addBox(-3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(rEar, 0.4553564018453205F, -0.091106186954104F, 0.0F);
        this.woolFur03 = new ModelRenderer(this, 40, 39);
        this.woolFur03.setRotationPoint(0.0F, 1.9F, 1.3F);
        this.woolFur03.addBox(-3.5F, 0.0F, 0.0F, 7, 2, 5, 0.0F);
        this.setRotateAngle(woolFur03, -0.9560913642424937F, 0.0F, 0.0F);
        this.wool02 = new ModelRenderer(this, 90, 4);
        this.wool02.setRotationPoint(0.0F, -0.1F, 2.9F);
        this.wool02.addBox(-4.0F, -4.5F, -4.5F, 8, 9, 9, 0.0F);
        this.wool01 = new ModelRenderer(this, 84, 0);
        this.wool01.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.wool01.addBox(-4.5F, -5.0F, -6.5F, 9, 10, 13, 0.0F);
        this.lArm02 = new ModelRenderer(this, 51, 16);
        this.lArm02.setRotationPoint(1.5F, 7.4F, 0.0F);
        this.lArm02.addBox(-1.0F, -0.3F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(lArm02, -0.091106186954104F, 0.0F, -0.06981317007977318F);
        this.rHindHoof = new ModelRenderer(this, 51, 29);
        this.rHindHoof.mirror = true;
        this.rHindHoof.setRotationPoint(-0.1F, 5.1F, 0.0F);
        this.rHindHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 2, 0.0F);
        this.wool04 = new ModelRenderer(this, 109, 42);
        this.wool04.setRotationPoint(0.0F, -0.2F, -2.2F);
        this.wool04.addBox(-3.0F, -3.0F, -1.3F, 6, 6, 3, 0.0F);
        this.lForeHoof = new ModelRenderer(this, 51, 29);
        this.lForeHoof.setRotationPoint(0.1F, 6.5F, 0.0F);
        this.lForeHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 2, 2, 0.0F);
        this.rLeg01 = new ModelRenderer(this, 28, 0);
        this.rLeg01.mirror = true;
        this.rLeg01.setRotationPoint(-2.3F, -2.3F, 4.5F);
        this.rLeg01.addBox(-3.0F, -1.0F, -2.5F, 3, 8, 5, 0.0F);
        this.setRotateAngle(rLeg01, -0.18203784098300857F, 0.0F, 0.0F);
        this.rLeg03 = new ModelRenderer(this, 33, 26);
        this.rLeg03.mirror = true;
        this.rLeg03.setRotationPoint(-0.1F, 4.7F, 0.0F);
        this.rLeg03.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(rLeg03, -0.31869712141416456F, 0.0F, 0.0F);
        this.rArmWool01 = new ModelRenderer(this, 64, 31);
        this.rArmWool01.mirror = true;
        this.rArmWool01.setRotationPoint(-1.5F, 2.7F, -0.2F);
        this.rArmWool01.addBox(-2.0F, -5.0F, -2.5F, 4, 10, 5, 0.0F);
        this.body.addChild(this.rArm01);
        this.rArm02.addChild(this.rArmWool02);
        this.lLeg01.addChild(this.lLeg02);
        this.tail.addChild(this.wool07);
        this.rArm01.addChild(this.rArm02);
        this.lLeg02.addChild(this.lLegWool02);
        this.rArm02.addChild(this.rForeHoof);
        this.body.addChild(this.neck);
        this.rLeg03.addChild(this.rLegWool03);
        this.head.addChild(this.upperJaw01);
        this.lLeg03.addChild(this.lLegWool03);
        this.rLeg02.addChild(this.rLegWool02);
        this.neck.addChild(this.wool03);
        this.upperJaw01.addChild(this.upperJaw02);
        this.rLeg01.addChild(this.rLegWool01);
        this.wool05.addChild(this.wool08);
        this.flank.addChild(this.tail);
        this.neck.addChild(this.neck02);
        this.head.addChild(this.wool05);
        this.flank.addChild(this.lLeg01);
        this.lLeg03.addChild(this.lHindHoof);
        this.wool03.addChild(this.woolFur01);
        this.body.addChild(this.flank);
        this.lLeg01.addChild(this.lLegWool01);
        this.wool01.addChild(this.woolFur04);
        this.head.addChild(this.lowerJaw);
        this.neck02.addChild(this.head);
        this.head.addChild(this.lEar);
        this.lLeg02.addChild(this.lLeg03);
        this.wool04.addChild(this.woolFur02);
        this.rLeg01.addChild(this.rLeg02);
        this.head.addChild(this.wool06);
        this.lArm01.addChild(this.lArmWool01);
        this.body.addChild(this.lArm01);
        this.head.addChild(this.snoot);
        this.lArm02.addChild(this.lArmWool02);
        this.head.addChild(this.rEar);
        this.wool03.addChild(this.woolFur03);
        this.flank.addChild(this.wool02);
        this.body.addChild(this.wool01);
        this.lArm01.addChild(this.lArm02);
        this.rLeg03.addChild(this.rHindHoof);
        this.neck02.addChild(this.wool04);
        this.lArm02.addChild(this.lForeHoof);
        this.flank.addChild(this.rLeg01);
        this.rLeg02.addChild(this.rLeg03);
        this.rArm01.addChild(this.rArmWool01);

    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.lLegWool03.showModel = !sheared;
        this.lLegWool02.showModel = !sheared;
        this.lLegWool01.showModel = !sheared;
        this.rLegWool03.showModel = !sheared;
        this.rLegWool02.showModel = !sheared;
        this.rLegWool01.showModel = !sheared;
        this.wool07.showModel = !sheared;
        this.wool02.showModel = !sheared;
        this.wool05.showModel = !sheared;
        this.wool08.showModel = !sheared;
        this.wool06.showModel = !sheared;
        this.wool04.showModel = !sheared;
        this.woolFur02.showModel = !sheared;
        this.wool03.showModel = !sheared;
        this.woolFur01.showModel = !sheared;
        this.woolFur03.showModel = !sheared;
        this.lArmWool02.showModel = !sheared;
        this.lArmWool01.showModel = !sheared;
        this.rArmWool02.showModel = !sheared;
        this.rArmWool01.showModel = !sheared;
        this.wool01.showModel = !sheared;
        this.woolFur04.showModel = !sheared;
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleY = rad(netHeadYaw);
        this.head.rotateAngleZ = this.head.rotateAngleY;
        this.head.rotateAngleX = rad(headPitch);
        lLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * 0.9F * limbSwingAmount - 0.18203784098300857F;
        lArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * 0.9F * limbSwingAmount + 0.091106186954104F;
        rLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F) * 0.9F * limbSwingAmount - 0.18203784098300857F;
        rArm01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F) * 0.9F * limbSwingAmount + 0.091106186954104F;
        this.neck.rotateAngleX = -0.5918411493512771F;
        this.head.rotateAngleX = -0.5918411493512771F;
        if(entity instanceof SheepEntity) {
            this.sheared = ((SheepEntity) entity).getSheared();
            this.neck.rotateAngleX = ((SheepEntity) entity).getHeadRotationAngleX(Minecraft.getInstance().getRenderPartialTicks()) - 0.5918411493512771F;
        }
    }
}