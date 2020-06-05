package dev.itsmeow.betteranimals.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

/**
 * newsquid - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelNewSquid<T extends LivingEntity> extends Model<T> {
    public ModelRenderer head;
    public ModelRenderer mantle01;
    public ModelRenderer lEye;
    public ModelRenderer rEye;
    public ModelRenderer tentacle01a;
    public ModelRenderer tentacle02a;
    public ModelRenderer tentacle03a;
    public ModelRenderer tentacle04a;
    public ModelRenderer beak01;
    public ModelRenderer beak02;
    public ModelRenderer tentacle05a;
    public ModelRenderer tentacle06a;
    public ModelRenderer tentacle07a;
    public ModelRenderer tentacle08a;
    public ModelRenderer longTentacle01a;
    public ModelRenderer longTentacle02a;
    public ModelRenderer mantle02;
    public ModelRenderer siphon;
    public ModelRenderer mantle03;
    public ModelRenderer mantle04;
    public ModelRenderer rFin;
    public ModelRenderer lFin;
    public ModelRenderer tentacle01b;
    public ModelRenderer tentacle01c;
    public ModelRenderer tentacle02b;
    public ModelRenderer tentacle02c;
    public ModelRenderer tentacle03b;
    public ModelRenderer tentacle03c;
    public ModelRenderer tentacle04b;
    public ModelRenderer tentacle04c;
    public ModelRenderer tentacle05b;
    public ModelRenderer tentacle05c;
    public ModelRenderer tentacle06b;
    public ModelRenderer tentacle06c;
    public ModelRenderer tentacle07b;
    public ModelRenderer tentacle07c;
    public ModelRenderer tentacle08b;
    public ModelRenderer tentacle08c;
    public ModelRenderer longTentacle01b;
    public ModelRenderer longTentacle01c;
    public ModelRenderer longTentacle01d;
    public ModelRenderer longTentacle02b;
    public ModelRenderer longTentacle02c;
    public ModelRenderer longTentacle02d;

    public ModelRenderer[] squidTentacles;

    public ModelNewSquid() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.lFin = new ModelRenderer(this, 31, 16);
        this.lFin.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.lFin.addBox(0.0F, -6.0F, 0.0F, 9, 12, 0, 0.0F);
        this.mantle03 = new ModelRenderer(this, 0, 31);
        this.mantle03.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.mantle03.addBox(-2.0F, -5.0F, -2.0F, 4, 5, 4, 0.0F);
        this.tentacle04b = new ModelRenderer(this, 31, 41);
        this.tentacle04b.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle04b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.longTentacle01b = new ModelRenderer(this, 41, 41);
        this.longTentacle01b.setRotationPoint(0.0F, 7.9F, 0.0F);
        this.longTentacle01b.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.rFin = new ModelRenderer(this, 31, 16);
        this.rFin.mirror = true;
        this.rFin.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.rFin.addBox(-9.0F, -6.0F, 0.0F, 9, 12, 0, 0.0F);
        this.tentacle04c = new ModelRenderer(this, 31, 41);
        this.tentacle04c.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle04c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.longTentacle01d = new ModelRenderer(this, 41, 52);
        this.longTentacle01d.setRotationPoint(0.0F, 7.8F, 0.0F);
        this.longTentacle01d.addBox(-1.5F, 0.0F, -1.0F, 3, 5, 2, 0.0F);
        this.longTentacle02b = new ModelRenderer(this, 41, 41);
        this.longTentacle02b.setRotationPoint(0.0F, 7.9F, 0.0F);
        this.longTentacle02b.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.longTentacle02c = new ModelRenderer(this, 41, 41);
        this.longTentacle02c.setRotationPoint(0.0F, 7.8F, 0.0F);
        this.longTentacle02c.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.tentacle02a = new ModelRenderer(this, 31, 41);
        this.tentacle02a.setRotationPoint(2.0F, 2.8F, 0.0F);
        this.tentacle02a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle02a, 0.0F, -1.5707963267948966F, 0.0F);
        this.beak02 = new ModelRenderer(this, 14, 49);
        this.beak02.setRotationPoint(0.0F, 1.5F, 0.3F);
        this.beak02.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(beak02, 0.5009094953223726F, 0.0F, 0.0F);
        this.tentacle05a = new ModelRenderer(this, 31, 41);
        this.tentacle05a.setRotationPoint(1.7F, 2.8F, -1.7F);
        this.tentacle05a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle05a, 0.0F, -0.7853981633974483F, 0.0F);
        this.longTentacle02d = new ModelRenderer(this, 41, 52);
        this.longTentacle02d.setRotationPoint(0.0F, 7.8F, 0.0F);
        this.longTentacle02d.addBox(-1.5F, 0.0F, -1.0F, 3, 5, 2, 0.0F);
        this.tentacle04a = new ModelRenderer(this, 31, 41);
        this.tentacle04a.setRotationPoint(0.0F, 2.8F, 2.0F);
        this.tentacle04a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle04a, 0.0F, 3.141592653589793F, 0.0F);
        this.tentacle07a = new ModelRenderer(this, 31, 41);
        this.tentacle07a.setRotationPoint(-1.7F, 2.8F, -1.7F);
        this.tentacle07a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle07a, 0.0F, 0.7853981633974483F, 0.0F);
        this.tentacle01b = new ModelRenderer(this, 31, 41);
        this.tentacle01b.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle01b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle01a = new ModelRenderer(this, 31, 41);
        this.tentacle01a.setRotationPoint(0.0F, 2.8F, -2.0F);
        this.tentacle01a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle08b = new ModelRenderer(this, 31, 41);
        this.tentacle08b.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle08b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.head = new ModelRenderer(this, 40, 0);
        this.head.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.head.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
        this.lEye = new ModelRenderer(this, 29, 0);
        this.lEye.setRotationPoint(2.7F, 0.1F, 0.0F);
        this.lEye.addBox(0.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.tentacle07c = new ModelRenderer(this, 31, 41);
        this.tentacle07c.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle07c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle06b = new ModelRenderer(this, 31, 41);
        this.tentacle06b.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle06b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle06a = new ModelRenderer(this, 31, 41);
        this.tentacle06a.setRotationPoint(1.7F, 2.8F, 1.7F);
        this.tentacle06a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle06a, 0.0F, -2.356194490192345F, 0.0F);
        this.beak01 = new ModelRenderer(this, 14, 43);
        this.beak01.setRotationPoint(0.0F, 1.5F, -1.2F);
        this.beak01.addBox(-1.5F, 0.0F, -0.5F, 3, 2, 3, 0.0F);
        this.setRotateAngle(beak01, -0.6373942428283291F, 0.0F, 0.0F);
        this.tentacle02b = new ModelRenderer(this, 31, 41);
        this.tentacle02b.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle02b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle02c = new ModelRenderer(this, 31, 41);
        this.tentacle02c.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle02c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.longTentacle02a = new ModelRenderer(this, 41, 41);
        this.longTentacle02a.setRotationPoint(-1.6F, 3.2F, 0.0F);
        this.longTentacle02a.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(longTentacle02a, 0.0F, 1.5707963267948966F, 0.0F);
        this.tentacle08c = new ModelRenderer(this, 31, 41);
        this.tentacle08c.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle08c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle03a = new ModelRenderer(this, 31, 41);
        this.tentacle03a.setRotationPoint(-2.0F, 2.8F, 0.0F);
        this.tentacle03a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle03a, 0.0F, 1.5707963267948966F, 0.0F);
        this.siphon = new ModelRenderer(this, 54, 16);
        this.siphon.setRotationPoint(0.0F, -0.6F, 2.4F);
        this.siphon.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(siphon, 0.36425021489121656F, 0.0F, 0.0F);
        this.tentacle07b = new ModelRenderer(this, 31, 41);
        this.tentacle07b.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle07b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.rEye = new ModelRenderer(this, 29, 0);
        this.rEye.mirror = true;
        this.rEye.setRotationPoint(-2.7F, 0.0F, 0.0F);
        this.rEye.addBox(-1.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.tentacle08a = new ModelRenderer(this, 31, 41);
        this.tentacle08a.setRotationPoint(-1.7F, 2.8F, 1.7F);
        this.tentacle08a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(tentacle08a, 0.0F, 2.356194490192345F, 0.0F);
        this.tentacle05b = new ModelRenderer(this, 31, 41);
        this.tentacle05b.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle05b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle01c = new ModelRenderer(this, 31, 41);
        this.tentacle01c.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle01c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle03b = new ModelRenderer(this, 31, 41);
        this.tentacle03b.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle03b.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.longTentacle01a = new ModelRenderer(this, 41, 41);
        this.longTentacle01a.setRotationPoint(1.6F, 3.2F, 0.0F);
        this.longTentacle01a.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(longTentacle01a, 0.0F, -1.5707963267948966F, 0.0F);
        this.tentacle03c = new ModelRenderer(this, 31, 41);
        this.tentacle03c.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle03c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.mantle01 = new ModelRenderer(this, 0, 0);
        this.mantle01.setRotationPoint(0.0F, -2.4F, 0.0F);
        this.mantle01.addBox(-3.5F, -8.0F, -3.5F, 7, 8, 7, 0.0F);
        this.mantle02 = new ModelRenderer(this, 0, 16);
        this.mantle02.setRotationPoint(0.0F, -7.9F, 0.0F);
        this.mantle02.addBox(-3.0F, -7.0F, -3.0F, 6, 7, 6, 0.0F);
        this.longTentacle01c = new ModelRenderer(this, 41, 41);
        this.longTentacle01c.setRotationPoint(0.0F, 7.8F, 0.0F);
        this.longTentacle01c.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.tentacle05c = new ModelRenderer(this, 31, 41);
        this.tentacle05c.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle05c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.tentacle06c = new ModelRenderer(this, 31, 41);
        this.tentacle06c.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.tentacle06c.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.mantle04 = new ModelRenderer(this, 0, 45);
        this.mantle04.setRotationPoint(0.0F, -4.9F, 0.0F);
        this.mantle04.addBox(-1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F);
        this.mantle03.addChild(this.lFin);
        this.mantle02.addChild(this.mantle03);
        this.tentacle04a.addChild(this.tentacle04b);
        this.longTentacle01a.addChild(this.longTentacle01b);
        this.mantle03.addChild(this.rFin);
        this.tentacle04b.addChild(this.tentacle04c);
        this.longTentacle01c.addChild(this.longTentacle01d);
        this.longTentacle02a.addChild(this.longTentacle02b);
        this.longTentacle02b.addChild(this.longTentacle02c);
        this.head.addChild(this.tentacle02a);
        this.head.addChild(this.beak02);
        this.head.addChild(this.tentacle05a);
        this.longTentacle02c.addChild(this.longTentacle02d);
        this.head.addChild(this.tentacle04a);
        this.head.addChild(this.tentacle07a);
        this.tentacle01a.addChild(this.tentacle01b);
        this.head.addChild(this.tentacle01a);
        this.tentacle08a.addChild(this.tentacle08b);
        this.head.addChild(this.lEye);
        this.tentacle07b.addChild(this.tentacle07c);
        this.tentacle06a.addChild(this.tentacle06b);
        this.head.addChild(this.tentacle06a);
        this.head.addChild(this.beak01);
        this.tentacle02a.addChild(this.tentacle02b);
        this.tentacle02b.addChild(this.tentacle02c);
        this.head.addChild(this.longTentacle02a);
        this.tentacle08b.addChild(this.tentacle08c);
        this.head.addChild(this.tentacle03a);
        this.mantle01.addChild(this.siphon);
        this.tentacle07a.addChild(this.tentacle07b);
        this.head.addChild(this.rEye);
        this.head.addChild(this.tentacle08a);
        this.tentacle05a.addChild(this.tentacle05b);
        this.tentacle01b.addChild(this.tentacle01c);
        this.tentacle03a.addChild(this.tentacle03b);
        this.head.addChild(this.longTentacle01a);
        this.tentacle03b.addChild(this.tentacle03c);
        this.head.addChild(this.mantle01);
        this.mantle01.addChild(this.mantle02);
        this.longTentacle01b.addChild(this.longTentacle01c);
        this.tentacle05b.addChild(this.tentacle05c);
        this.tentacle06b.addChild(this.tentacle06c);
        this.mantle03.addChild(this.mantle04);

        this.squidTentacles = new ModelRenderer[] { this.tentacle01a, this.tentacle02a, this.tentacle03a, this.tentacle04a, this.tentacle05a, this.tentacle06a, this.tentacle07a, this.tentacle08a };
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.head.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        for(ModelRenderer modelrenderer : this.squidTentacles) {
            modelrenderer.rotateAngleX = ageInTicks;
        }
    }
}