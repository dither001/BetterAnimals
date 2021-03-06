package com.ocelot.betteranimals.client.render.entity;

import com.ocelot.betteranimals.BetterAnimals;
import com.ocelot.betteranimals.client.model.ModelNewSilverfish;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.util.ResourceLocation;

public class RenderNewSilverfish extends RenderLiving<EntitySilverfish> {

	private static final ResourceLocation BASE = new ResourceLocation(BetterAnimals.MODID, "textures/mobs/silverfish.png");

	public RenderNewSilverfish(RenderManager m) {
		super(m, new ModelNewSilverfish(), 0.25f);
	}
	
	@Override
	protected void preRenderCallback(EntitySilverfish entity, float partialTickTime) {
		GlStateManager.scale(0.5, 0.5, 0.5);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySilverfish entity) {
		return BASE;
	}
}