package mark123mark.mods.transcraft.Entitys.mob;

import net.minecraft.client.model.ModelBat;
import net.minecraft.client.renderer.entity.RenderBat;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.util.ResourceLocation;

public class EnderBatRender extends RenderBat
{ 
	
	private int renderedBatSize;

    public EnderBatRender()
    {
    	 super();
         this.renderedBatSize = ((ModelBat)this.mainModel).getBatSize();
    }

   
    public void func_82443_a(EntityBat par1EntityBat, double par2, double par4, double par6, float par8, float par9)
    {
        int i = ((ModelBat)this.mainModel).getBatSize();

        if (i != this.renderedBatSize)
        {
            this.renderedBatSize = i;
            this.mainModel = new ModelBat();
        }

        super.doRenderLiving(par1EntityBat, par2, par4, par6, par8, par9);
    }
   
    
    static final ResourceLocation texture = new ResourceLocation("transcraft", "mob/EnderBat.png");

    protected ResourceLocation getBatTextures(EntityBat par1EntityBat)
    {
        return texture;
    }
    
    
}
