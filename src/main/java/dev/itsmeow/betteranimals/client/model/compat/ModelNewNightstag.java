package dev.itsmeow.betteranimals.client.model.compat;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mushroom.midnight.Midnight;
import com.mushroom.midnight.common.entity.creature.NightStagEntity;

import dev.itsmeow.betteranimals.client.model.Model;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

/**
 * nightstagBA - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelNewNightstag extends Model<NightStagEntity> {
    public ModelRenderer body;
    public ModelRenderer ass;
    public ModelRenderer chest;
    public ModelRenderer lForeleg01;
    public ModelRenderer rForeleg01;
    public ModelRenderer bodyFur;
    public ModelRenderer lHindLeg01;
    public ModelRenderer rHindLeg01;
    public ModelRenderer tail;
    public ModelRenderer lHindLeg02;
    public ModelRenderer lHindLeg03;
    public ModelRenderer lHindHoof;
    public ModelRenderer rHindLeg02;
    public ModelRenderer rHindLeg03;
    public ModelRenderer rHindHoof;
    public ModelRenderer neck;
    public ModelRenderer mane03;
    public ModelRenderer mane04;
    public ModelRenderer head;
    public ModelRenderer mane01;
    public ModelRenderer mane02;
    public ModelRenderer muzzle;
    public ModelRenderer lowerJaw;
    public ModelRenderer lEar;
    public ModelRenderer rEar;
    public ModelRenderer lAntler01;
    public ModelRenderer rAntler01;
    public ModelRenderer lAntler02;
    public ModelRenderer lAntler09a;
    public ModelRenderer lAntler03;
    public ModelRenderer lAntler04;
    public ModelRenderer lAntler10;
    public ModelRenderer lAntler05;
    public ModelRenderer lAntler06;
    public ModelRenderer lAntler07;
    public ModelRenderer lAntler08a;
    public ModelRenderer lAntler05b;
    public ModelRenderer lAntler08b;
    public ModelRenderer lAntler09b;
    public ModelRenderer rAntler02;
    public ModelRenderer rAntler09a;
    public ModelRenderer rAntler03;
    public ModelRenderer rAntler04;
    public ModelRenderer rAntler10;
    public ModelRenderer rAntler05;
    public ModelRenderer rAntler06;
    public ModelRenderer rAntler07;
    public ModelRenderer rAntler08a;
    public ModelRenderer rAntler05b;
    public ModelRenderer rAntler08b;
    public ModelRenderer rAntler09b;
    public ModelRenderer lForeleg02;
    public ModelRenderer lForeleg03;
    public ModelRenderer lForeHoof;
    public ModelRenderer rForeleg02;
    public ModelRenderer rForeleg03;
    public ModelRenderer rForeHoof;

    public ModelNewNightstag() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.rHindLeg03 = new ModelRenderer(this, 68, 30);
        this.rHindLeg03.mirror = true;
        this.rHindLeg03.setRotationPoint(-0.1F, 6.4F, 0.5F);
        this.rHindLeg03.addBox(-1.0F, -0.3F, -1.5F, 2, 8, 3, 0.0F);
        this.setRotateAngle(rHindLeg03, -0.5009094953223726F, 0.0F, 0.0F);
        this.lAntler10 = new ModelRenderer(this, 89, 37);
        this.lAntler10.setRotationPoint(0.0F, 0.0F, -1.2F);
        this.lAntler10.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntler10, 0.7155849933176751F, 1.5882496193148399F, 0.0F);
        this.body = new ModelRenderer(this, 0, 13);
        this.body.setRotationPoint(0.0F, 6.5F, -9.2F);
        this.body.addBox(-4.0F, -3.5F, 0.0F, 8, 9, 13, 0.0F);
        this.rAntler04 = new ModelRenderer(this, 89, 36);
        this.rAntler04.mirror = true;
        this.rAntler04.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.rAntler04.addBox(-0.5F, -0.5F, -2.9F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rAntler04, 0.05235987755982988F, -0.5235987755982988F, 0.0F);
        this.ass = new ModelRenderer(this, 0, 35);
        this.ass.setRotationPoint(0.0F, -0.3F, 12.3F);
        this.ass.addBox(-3.5F, -3.5F, 0.0F, 7, 7, 6, 0.0F);
        this.setRotateAngle(ass, -0.18203784098300857F, 0.0F, 0.0F);
        this.mane03 = new ModelRenderer(this, 46, 50);
        this.mane03.setRotationPoint(0.0F, 1.8F, -4.6F);
        this.mane03.addBox(-3.0F, -0.1F, -0.1F, 6, 1, 8, 0.0F);
        this.setRotateAngle(mane03, -0.767944870877505F, 0.0F, 0.0F);
        this.rForeHoof = new ModelRenderer(this, 32, 12);
        this.rForeHoof.mirror = true;
        this.rForeHoof.setRotationPoint(-0.0F, 8.3F, 0.3F);
        this.rForeHoof.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 3, 0.0F);
        this.lForeleg02 = new ModelRenderer(this, 48, 14);
        this.lForeleg02.setRotationPoint(0.8F, 4.4F, 0.1F);
        this.lForeleg02.addBox(-2.0F, 0.0F, -2.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(lForeleg02, 0.0F, 0.0F, 0.091106186954104F);
        this.lForeHoof = new ModelRenderer(this, 32, 12);
        this.lForeHoof.setRotationPoint(-0.0F, 8.3F, 0.3F);
        this.lForeHoof.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 3, 0.0F);
        this.lHindLeg02 = new ModelRenderer(this, 65, 15);
        this.lHindLeg02.setRotationPoint(1.4F, 5.0F, -1.1F);
        this.lHindLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 4, 0.0F);
        this.setRotateAngle(lHindLeg02, 0.9105382707654417F, 0.0F, 0.0F);
        this.rAntler08b = new ModelRenderer(this, 89, 37);
        this.rAntler08b.mirror = true;
        this.rAntler08b.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.rAntler08b.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rAntler08b, 0.0F, -0.3490658503988659F, 0.0F);
        this.rHindHoof = new ModelRenderer(this, 32, 12);
        this.rHindHoof.mirror = true;
        this.rHindHoof.setRotationPoint(-0.0F, 7.1F, 0.3F);
        this.rHindHoof.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 3, 0.0F);
        this.lEar = new ModelRenderer(this, 0, 13);
        this.lEar.setRotationPoint(2.1F, -1.0F, -3.0F);
        this.lEar.addBox(-1.0F, -0.7F, -3.1F, 2, 1, 3, 0.0F);
        this.setRotateAngle(lEar, 0.2792526803190927F, -1.0821041362364843F, 0.0F);
        this.rAntler01 = new ModelRenderer(this, 89, 36);
        this.rAntler01.mirror = true;
        this.rAntler01.setRotationPoint(-1.1F, 0.5F, -3.6F);
        this.rAntler01.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rAntler01, -0.08726646259971647F, 0.9075712110370513F, 0.0F);
        this.head = new ModelRenderer(this, 88, 14);
        this.head.setRotationPoint(0.0F, 1.1F, -5.0F);
        this.head.addBox(-2.5F, -3.0F, -4.0F, 5, 7, 4, 0.0F);
        this.setRotateAngle(head, -0.31869712141416456F, 0.0F, 0.0F);
        this.lAntler05b = new ModelRenderer(this, 89, 37);
        this.lAntler05b.setRotationPoint(0.0F, 0.0F, -4.2F);
        this.lAntler05b.addBox(-0.5F, -0.5F, -2.7F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntler05b, 0.0F, 0.4363323129985824F, 0.0F);
        this.rForeleg03 = new ModelRenderer(this, 50, 25);
        this.rForeleg03.mirror = true;
        this.rForeleg03.setRotationPoint(0.0F, 2.7F, 0.0F);
        this.rForeleg03.addBox(-0.99F, 0.0F, -1.5F, 2, 9, 3, 0.0F);
        this.setRotateAngle(rForeleg03, -0.136659280431156F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 88, 0);
        this.neck.setRotationPoint(0.0F, 0.3F, -4.0F);
        this.neck.addBox(-2.5F, -2.5F, -6.0F, 5, 5, 6, 0.0F);
        this.setRotateAngle(neck, -0.31869712141416456F, 0.0F, 0.0F);
        this.lAntler09b = new ModelRenderer(this, 89, 37);
        this.lAntler09b.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.lAntler09b.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntler09b, 0.0F, 0.5235987755982988F, 0.0F);
        this.rAntler10 = new ModelRenderer(this, 89, 37);
        this.rAntler10.mirror = true;
        this.rAntler10.setRotationPoint(0.0F, 0.0F, -1.2F);
        this.rAntler10.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rAntler10, 0.7155849933176751F, -1.5882496193148399F, 0.0F);
        this.bodyFur = new ModelRenderer(this, 99, 52);
        this.bodyFur.setRotationPoint(0.0F, 5.3F, 0.8F);
        this.bodyFur.addBox(-3.0F, 0.0F, 0.0F, 6, 4, 7, 0.0F);
        this.muzzle = new ModelRenderer(this, 88, 27);
        this.muzzle.setRotationPoint(0.0F, 3.7F, -2.2F);
        this.muzzle.addBox(-2.0F, 0.0F, -1.0F, 4, 3, 2, 0.0F);
        this.lAntler08a = new ModelRenderer(this, 89, 37);
        this.lAntler08a.setRotationPoint(0.0F, 0.0F, 0.3F);
        this.lAntler08a.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntler08a, 0.6981317007977318F, 0.5235987755982988F, 0.2617993877991494F);
        this.lHindLeg01 = new ModelRenderer(this, 64, 0);
        this.lHindLeg01.setRotationPoint(2.5F, -1.1F, 2.9F);
        this.lHindLeg01.addBox(0.0F, -1.9F, -2.0F, 3, 8, 6, 0.0F);
        this.setRotateAngle(lHindLeg01, -0.22759093446006054F, 0.0F, 0.0F);
        this.lAntler05 = new ModelRenderer(this, 89, 37);
        this.lAntler05.setRotationPoint(0.0F, 0.0F, -2.7F);
        this.lAntler05.addBox(-0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F);
        this.setRotateAngle(lAntler05, 0.3490658503988659F, 0.05235987755982988F, 0.0F);
        this.lAntler02 = new ModelRenderer(this, 89, 36);
        this.lAntler02.setRotationPoint(0.0F, 0.0F, -1.8F);
        this.lAntler02.addBox(-0.5F, -0.5F, -2.9F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntler02, -0.5235987755982988F, 0.22689280275926282F, 0.0F);
        this.lAntler07 = new ModelRenderer(this, 89, 37);
        this.lAntler07.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.lAntler07.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(lAntler07, 0.6108652381980153F, 0.5235987755982988F, 0.0F);
        this.rAntler05b = new ModelRenderer(this, 89, 37);
        this.rAntler05b.mirror = true;
        this.rAntler05b.setRotationPoint(0.0F, 0.0F, -4.2F);
        this.rAntler05b.addBox(-0.5F, -0.5F, -2.7F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rAntler05b, 0.0F, -0.4363323129985824F, 0.0F);
        this.rAntler09b = new ModelRenderer(this, 89, 37);
        this.rAntler09b.mirror = true;
        this.rAntler09b.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.rAntler09b.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rAntler09b, 0.0F, -0.5235987755982988F, 0.0F);
        this.lAntler03 = new ModelRenderer(this, 89, 36);
        this.lAntler03.setRotationPoint(0.0F, 0.0F, -2.7F);
        this.lAntler03.addBox(-0.5F, -0.5F, -2.9F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntler03, -0.3490658503988659F, -0.17453292519943295F, 0.0F);
        this.rAntler08a = new ModelRenderer(this, 89, 37);
        this.rAntler08a.mirror = true;
        this.rAntler08a.setRotationPoint(0.0F, 0.0F, 0.3F);
        this.rAntler08a.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rAntler08a, 0.6981317007977318F, -0.5235987755982988F, -0.2617993877991494F);
        this.rAntler07 = new ModelRenderer(this, 89, 37);
        this.rAntler07.mirror = true;
        this.rAntler07.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.rAntler07.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(rAntler07, 0.6108652381980153F, -0.5235987755982988F, 0.0F);
        this.lForeleg01 = new ModelRenderer(this, 45, 0);
        this.lForeleg01.setRotationPoint(3.1F, 0.6F, 2.3F);
        this.lForeleg01.addBox(-1.0F, -2.4F, -2.5F, 3, 7, 5, 0.0F);
        this.setRotateAngle(lForeleg01, 0.136659280431156F, 0.0F, -0.091106186954104F);
        this.rAntler06 = new ModelRenderer(this, 89, 37);
        this.rAntler06.mirror = true;
        this.rAntler06.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.rAntler06.addBox(-0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(rAntler06, -0.4363323129985824F, -0.3665191429188092F, 0.0F);
        this.lForeleg03 = new ModelRenderer(this, 50, 25);
        this.lForeleg03.setRotationPoint(0.0F, 2.7F, 0.0F);
        this.lForeleg03.addBox(-1.01F, 0.0F, -1.5F, 2, 9, 3, 0.0F);
        this.setRotateAngle(lForeleg03, -0.136659280431156F, 0.0F, 0.0F);
        this.rAntler03 = new ModelRenderer(this, 89, 36);
        this.rAntler03.mirror = true;
        this.rAntler03.setRotationPoint(0.0F, 0.0F, -2.7F);
        this.rAntler03.addBox(-0.5F, -0.5F, -2.9F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rAntler03, -0.3490658503988659F, 0.17453292519943295F, 0.0F);
        this.rHindLeg01 = new ModelRenderer(this, 64, 0);
        this.rHindLeg01.mirror = true;
        this.rHindLeg01.setRotationPoint(-2.5F, -1.1F, 2.9F);
        this.rHindLeg01.addBox(-3.0F, -1.9F, -2.0F, 3, 8, 6, 0.0F);
        this.setRotateAngle(rHindLeg01, -0.22759093446006054F, 0.0F, 0.0F);
        this.lHindHoof = new ModelRenderer(this, 32, 12);
        this.lHindHoof.setRotationPoint(-0.0F, 7.1F, 0.3F);
        this.lHindHoof.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 3, 0.0F);
        this.rForeleg01 = new ModelRenderer(this, 45, 0);
        this.rForeleg01.mirror = true;
        this.rForeleg01.setRotationPoint(-3.1F, 0.6F, 2.3F);
        this.rForeleg01.addBox(-2.0F, -2.4F, -2.5F, 3, 7, 5, 0.0F);
        this.setRotateAngle(rForeleg01, 0.136659280431156F, 0.0F, 0.091106186954104F);
        this.tail = new ModelRenderer(this, 33, 0);
        this.tail.setRotationPoint(0.0F, -2.7F, 5.4F);
        this.tail.addBox(-1.5F, 0.0F, -1.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(tail, 0.5918411493512771F, 0.0F, 0.0F);
        this.mane01 = new ModelRenderer(this, 0, 50);
        this.mane01.setRotationPoint(0.0F, 1.6F, -3.7F);
        this.mane01.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F);
        this.setRotateAngle(mane01, -0.5410520681182421F, 0.0F, 0.0F);
        this.rHindLeg02 = new ModelRenderer(this, 65, 15);
        this.rHindLeg02.mirror = true;
        this.rHindLeg02.setRotationPoint(-1.4F, 5.0F, -1.1F);
        this.rHindLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 4, 0.0F);
        this.setRotateAngle(rHindLeg02, 0.9105382707654417F, 0.0F, 0.0F);
        this.lAntler01 = new ModelRenderer(this, 89, 36);
        this.lAntler01.setRotationPoint(1.1F, 0.5F, -3.6F);
        this.lAntler01.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lAntler01, -0.08726646259971647F, -0.9075712110370513F, 0.0F);
        this.mane04 = new ModelRenderer(this, 75, 49);
        this.mane04.setRotationPoint(0.0F, 1.8F, -3.0F);
        this.mane04.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 8, 0.0F);
        this.setRotateAngle(mane04, -0.7330382858376184F, 0.0F, 0.0F);
        this.lHindLeg03 = new ModelRenderer(this, 68, 30);
        this.lHindLeg03.setRotationPoint(0.1F, 6.4F, 0.5F);
        this.lHindLeg03.addBox(-1.0F, -0.3F, -1.5F, 2, 8, 3, 0.0F);
        this.setRotateAngle(lHindLeg03, -0.5009094953223726F, 0.0F, 0.0F);
        this.chest = new ModelRenderer(this, 0, 0);
        this.chest.setRotationPoint(0.0F, 0.8F, 2.4F);
        this.chest.addBox(-3.5F, -3.0F, -5.0F, 7, 6, 5, 0.0F);
        this.setRotateAngle(chest, -0.8377580409572781F, 0.0F, 0.0F);
        this.rForeleg02 = new ModelRenderer(this, 48, 14);
        this.rForeleg02.mirror = true;
        this.rForeleg02.setRotationPoint(-0.8F, 4.4F, 0.1F);
        this.rForeleg02.addBox(-1.0F, 0.0F, -2.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(rForeleg02, 0.0F, 0.0F, -0.091106186954104F);
        this.rAntler05 = new ModelRenderer(this, 89, 37);
        this.rAntler05.mirror = true;
        this.rAntler05.setRotationPoint(0.0F, 0.0F, -2.7F);
        this.rAntler05.addBox(-0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F);
        this.setRotateAngle(rAntler05, 0.3490658503988659F, 0.05235987755982988F, 0.0F);
        this.lAntler09a = new ModelRenderer(this, 89, 37);
        this.lAntler09a.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.lAntler09a.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntler09a, 0.7155849933176751F, 0.17453292519943295F, 0.2617993877991494F);
        this.rAntler02 = new ModelRenderer(this, 89, 36);
        this.rAntler02.mirror = true;
        this.rAntler02.setRotationPoint(0.0F, 0.0F, -1.8F);
        this.rAntler02.addBox(-0.5F, -0.5F, -2.9F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rAntler02, -0.5235987755982988F, -0.22689280275926282F, 0.0F);
        this.rAntler09a = new ModelRenderer(this, 89, 37);
        this.rAntler09a.mirror = true;
        this.rAntler09a.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.rAntler09a.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rAntler09a, 0.890117918517108F, -0.17453292519943295F, -0.2617993877991494F);
        this.mane02 = new ModelRenderer(this, 20, 50);
        this.mane02.setRotationPoint(0.0F, 1.7F, -1.7F);
        this.mane02.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 7, 0.0F);
        this.setRotateAngle(mane02, -0.5410520681182421F, 0.0F, 0.0F);
        this.lAntler04 = new ModelRenderer(this, 89, 36);
        this.lAntler04.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.lAntler04.addBox(-0.5F, -0.5F, -2.9F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntler04, 0.05235987755982988F, 0.5235987755982988F, 0.0F);
        this.lowerJaw = new ModelRenderer(this, 102, 28);
        this.lowerJaw.setRotationPoint(0.0F, 3.4F, -0.8F);
        this.lowerJaw.addBox(-2.0F, 0.0F, -0.5F, 4, 3, 1, 0.0F);
        this.rEar = new ModelRenderer(this, 0, 13);
        this.rEar.mirror = true;
        this.rEar.setRotationPoint(-2.1F, -1.0F, -3.0F);
        this.rEar.addBox(-1.0F, -0.7F, -3.1F, 2, 1, 3, 0.0F);
        this.setRotateAngle(rEar, 0.2792526803190927F, 1.0821041362364843F, 0.0F);
        this.lAntler08b = new ModelRenderer(this, 89, 37);
        this.lAntler08b.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.lAntler08b.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntler08b, 0.0F, 0.3490658503988659F, 0.0F);
        this.lAntler06 = new ModelRenderer(this, 89, 37);
        this.lAntler06.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.lAntler06.addBox(-0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(lAntler06, -0.4363323129985824F, 0.3665191429188092F, 0.0F);
        this.rHindLeg02.addChild(this.rHindLeg03);
        this.lAntler03.addChild(this.lAntler10);
        this.rAntler03.addChild(this.rAntler04);
        this.body.addChild(this.ass);
        this.chest.addChild(this.mane03);
        this.rForeleg03.addChild(this.rForeHoof);
        this.lForeleg01.addChild(this.lForeleg02);
        this.lForeleg03.addChild(this.lForeHoof);
        this.lHindLeg01.addChild(this.lHindLeg02);
        this.rAntler08a.addChild(this.rAntler08b);
        this.rHindLeg03.addChild(this.rHindHoof);
        this.head.addChild(this.lEar);
        this.head.addChild(this.rAntler01);
        this.neck.addChild(this.head);
        this.lAntler05.addChild(this.lAntler05b);
        this.rForeleg02.addChild(this.rForeleg03);
        this.chest.addChild(this.neck);
        this.lAntler09a.addChild(this.lAntler09b);
        this.rAntler03.addChild(this.rAntler10);
        this.body.addChild(this.bodyFur);
        this.head.addChild(this.muzzle);
        this.lAntler04.addChild(this.lAntler08a);
        this.ass.addChild(this.lHindLeg01);
        this.lAntler04.addChild(this.lAntler05);
        this.lAntler01.addChild(this.lAntler02);
        this.lAntler04.addChild(this.lAntler07);
        this.rAntler05.addChild(this.rAntler05b);
        this.rAntler09a.addChild(this.rAntler09b);
        this.lAntler02.addChild(this.lAntler03);
        this.rAntler04.addChild(this.rAntler08a);
        this.rAntler04.addChild(this.rAntler07);
        this.body.addChild(this.lForeleg01);
        this.rAntler04.addChild(this.rAntler06);
        this.lForeleg02.addChild(this.lForeleg03);
        this.rAntler02.addChild(this.rAntler03);
        this.ass.addChild(this.rHindLeg01);
        this.lHindLeg03.addChild(this.lHindHoof);
        this.body.addChild(this.rForeleg01);
        this.ass.addChild(this.tail);
        this.neck.addChild(this.mane01);
        this.rHindLeg01.addChild(this.rHindLeg02);
        this.head.addChild(this.lAntler01);
        this.chest.addChild(this.mane04);
        this.lHindLeg02.addChild(this.lHindLeg03);
        this.body.addChild(this.chest);
        this.rForeleg01.addChild(this.rForeleg02);
        this.rAntler04.addChild(this.rAntler05);
        this.lAntler01.addChild(this.lAntler09a);
        this.rAntler01.addChild(this.rAntler02);
        this.rAntler01.addChild(this.rAntler09a);
        this.neck.addChild(this.mane02);
        this.lAntler03.addChild(this.lAntler04);
        this.head.addChild(this.lowerJaw);
        this.head.addChild(this.rEar);
        this.lAntler08a.addChild(this.lAntler08b);
        this.lAntler04.addChild(this.lAntler06);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setRotationAngles(NightStagEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.neck.rotateAngleX = rad(headPitch) + 0.17453292519943295f;
        this.neck.rotateAngleY = rad(netHeadYaw);
        this.body.rotateAngleX = 0f;
        this.lForeleg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount + 0.136659280431156F;
        this.rHindLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount - 0.22759093446006054F;
        this.rForeleg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + (float) Math.PI) * 1.4f * limbSwingAmount + 0.136659280431156F;
        this.lHindLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + (float) Math.PI) * 1.4f * limbSwingAmount - 0.22759093446006054F;
        this.neck.rotationPointX = 0f;
        this.lHindLeg01.rotateAngleZ = 0f;

        this.lForeleg01.rotateAngleY = 0F;
        this.rHindLeg01.rotateAngleY = 0F;
        this.rForeleg01.rotateAngleY = 0F;
        this.lHindLeg01.rotateAngleY = 0F;

        this.lForeleg01.rotateAngleZ = -0.091106186954104F;
        this.rHindLeg01.rotateAngleZ = 0F;
        this.rForeleg01.rotateAngleZ = 0.091106186954104F;
        this.lHindLeg01.rotateAngleZ = 0F;

        entity.getCapability(Midnight.ANIMATION_CAP, null).ifPresent(animationCap -> {
            if(animationCap.isAnimate()) {
                float partialTicks = Minecraft.getInstance().getRenderPartialTicks();
                float progress = animationCap.getProgress(partialTicks);
                float fctAnimation;
                switch(animationCap.getAnimationType()) {
                case ATTACK:
                    fctAnimation = MathHelper.sin((float) (progress * Math.PI));
                    // this.body.rotateAngleX = fctAnimation * 0.2f;
                    this.neck.rotateAngleX = 0.17453292519943295f + (fctAnimation * 1.5f);
                    break;
                case CURTSEY:
                    fctAnimation = MathHelper.sin((float) (progress * Math.PI));
                    this.neck.rotateAngleX = 0.17453292519943295f + fctAnimation;
                    /* this.body.rotateAngleX = */this.rHindLeg01.rotateAngleX = this.rHindLeg01.rotateAngleZ = fctAnimation * 0.2f;
                    this.rForeleg01.rotateAngleX = -this.rForeleg01.rotateAngleZ;
                    break;
                case EAT:
                    // this.body.rotateAngleX = MathHelper.sin((float) (progress * Math.PI)) * 0.2f;
                    this.neck.rotateAngleX = 0.17453292519943295f + (progress <= 0.1f ? progress * 15f : progress >= 0.9f ? (1f - progress) * 15f : 1.5f);
                    if(progress > 0.1f && progress < 0.9f) {
                        this.neck.rotationPointX = -partialTicks;
                    }
                    break;
                case CHARGE:
                    fctAnimation = MathHelper.sin((float) ((progress % 1) * 10f * Math.PI));
                    this.neck.rotateAngleX = 0.17453292519943295f + (progress <= 0.05f ? progress * 28f : progress >= 0.9f ? (1f - progress) * 14f : 1.4f + fctAnimation * 0.02f);
                    this.neck.rotateAngleY = 0f;
                    // this.body.rotateAngleX = fctAnimation * 0.05f;
                    if(progress <= 0.1f) {
                        this.rHindLeg01.rotateAngleX = this.rHindLeg01.rotateAngleY = fctAnimation * 0.3f;
                    }
                    break;
                case NONE:
                    break;
                default:
                    break;
                }
            }
        });
    }
}