package mark123mark.mods.transcraft;


import java.util.Random;

import mark123mark.mods.transcraft.Entitys.mob.EnderBatRender;
import mark123mark.mods.transcraft.Entitys.mob.Enderbat;
import mark123mark.mods.transcraft.Entitys.mob.NukeCreeper;
import mark123mark.mods.transcraft.Entitys.mob.NukeCreeperRender;
import mark123mark.mods.transcraft.particles.GlassFX;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class TranscraftClientProxy extends TranscraftCommonProxy {

	
public static Minecraft mc = Minecraft.getMinecraft();

	 @Override
	public void registerHandlers()
		{
		//	TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
		}
	
	 @Override
	public void registerTickHandlers()
		{
			TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);	
			TickRegistry.registerTickHandler(new TickHandler(), Side.SERVER);
			 RenderingRegistry.registerEntityRenderingHandler(NukeCreeper.class, new NukeCreeperRender());
			 RenderingRegistry.registerEntityRenderingHandler(Enderbat.class, new EnderBatRender());
		}
	
	 
	 public void registerRenderer ()
	    {
		
	    }
	 
	 
	 @Override
     public void spawnParticle(String string, double x, double y, double z)
     {
             EntityFX entityfx = null;
             
             Random rand = new Random();

           
              if (string == "glass") 
             {
                     entityfx = new GlassFX(mc.theWorld, x, y, z, 0.0D, 0.0D, 0.0D);
             }
             
             mc.effectRenderer.addEffect(entityfx);
     }
	 
}
