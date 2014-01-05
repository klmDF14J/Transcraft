package mark123mark.mods.transcraft.Items.gui;

import mark123mark.mods.transcraft.Entitys.mob.NukeCreeper;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TranspediaGui extends GuiContainer
{
    private static final ResourceLocation field_110421_t = new ResourceLocation("transcraft", "textures/gui/Transpedia.png");

    private float xSize_lo;
    private float ySize_lo;
   

	public TranspediaGui() {super(new ContainerTranspedia());
		this.xSize = 256;
		this.ySize = 256;
	}

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        this.fontRenderer.drawString("Transpedia", 8, 8, 4210752);
    }

    @SuppressWarnings("unchecked")
	@Override
	public void initGui() {
		super.initGui();
		
	}
    
    
    
    public void drawScreen(int par1, int par2, float par3) {
        super.drawScreen(par1, par2, par3);
        this.xSize_lo = (float) par1;
        this.ySize_lo = (float) par2;
}
    
    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(field_110421_t);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
       
        if(this.mc.thePlayer.username.contains("shifu_"))
        {
            drawPlayerModel(k + 200, l + 80, 30, (float) (k + 200) - this.xSize_lo, (float) (l + 60 - 30) - this.ySize_lo, new EntityPig(this.mc.theWorld));
        }
        else  if(this.mc.thePlayer.username.contains("mark123mark"))
        {
            drawPlayerModel(k + 200, l + 80, 30, (float) (k + 200) - this.xSize_lo, (float) (l + 60 - 30) - this.ySize_lo, new NukeCreeper(this.mc.theWorld));
        }
        else
        {
            drawPlayerModel(k + 200, l + 80, 30, (float) (k + 200) - this.xSize_lo, (float) (l + 60 - 30) - this.ySize_lo, this.mc.thePlayer);
        }
    }
   
    
    /**
     * This renders the player model in standard inventory position
     */
    public static void drawPlayerModel(int par0, int par1, int par2, float par3, float par4, EntityLivingBase par5EntityLivingBase) {
            GL11.glEnable(GL11.GL_COLOR_MATERIAL);
            GL11.glPushMatrix();
            GL11.glTranslatef((float) par0, (float) par1, 50.0F);
            GL11.glScalef((float) (-par2), (float) par2, (float) par2);
            GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
            float f2 = par5EntityLivingBase.renderYawOffset;
            float f3 = par5EntityLivingBase.rotationYaw;
            float f4 = par5EntityLivingBase.rotationPitch;
            float f5 = par5EntityLivingBase.prevRotationYawHead;
            float f6 = par5EntityLivingBase.rotationYawHead;
            GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
            RenderHelper.enableStandardItemLighting();
            GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-((float) Math.atan((double) (par4 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
            par5EntityLivingBase.renderYawOffset = (float) Math.atan((double) (par3 / 40.0F)) * 20.0F;
            par5EntityLivingBase.rotationYaw = (float) Math.atan((double) (par3 / 40.0F)) * 40.0F;
            par5EntityLivingBase.rotationPitch = -((float) Math.atan((double) (par4 / 40.0F))) * 20.0F;
            par5EntityLivingBase.rotationYawHead = par5EntityLivingBase.rotationYaw;
            par5EntityLivingBase.prevRotationYawHead = par5EntityLivingBase.rotationYaw;
            GL11.glTranslatef(0.0F, par5EntityLivingBase.yOffset, 0.0F);
            RenderManager.instance.playerViewY = 180.0F;
            RenderManager.instance.renderEntityWithPosYaw(par5EntityLivingBase, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
            par5EntityLivingBase.renderYawOffset = f2;
            par5EntityLivingBase.rotationYaw = f3;
            par5EntityLivingBase.rotationPitch = f4;
            par5EntityLivingBase.prevRotationYawHead = f5;
            par5EntityLivingBase.rotationYawHead = f6;
            GL11.glPopMatrix();
            RenderHelper.disableStandardItemLighting();
            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
            OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
	
	
}
