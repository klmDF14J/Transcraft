package mark123mark.mods.transcraft.Renders;

import java.util.Random;

import org.lwjgl.opengl.GL11;


import cpw.mods.fml.client.FMLClientHandler;

import mark123mark.mods.transcraft.models.EnderSwordModel;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

public class RenderEnderSword implements IItemRenderer 
{
	protected EnderSwordModel EnderSwordModel;

	private static final ResourceLocation texCamera = new ResourceLocation("transcraft", "textures/models/EnderSwoadModelTexture.png");
	
	public RenderEnderSword() {
		EnderSwordModel = new EnderSwordModel();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch (type) {
			case EQUIPPED:
				return true;
			default:
				return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {
			case EQUIPPED: {
				GL11.glPushMatrix();
				Minecraft.getMinecraft().getTextureManager().bindTexture(texCamera);
				GL11.glRotatef(0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(176F, 0.0F, 1.0F, 0.0F);
				GL11.glRotatef(145F, 0.0F, 0.0F, 1.0F);
				GL11.glTranslatef(0.8F, .20F, 0.08F);
				float scale = 0.5F;
				GL11.glScalef(scale, scale, scale);
				EnderSwordModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			//	GL11.glPopMatrix();
			}
			default:
				break;
		}
	}
}
