package mark123mark.mods.transcraft;


import mark123mark.mods.transcraft.Entitys.mob.EnderBatRender;
import mark123mark.mods.transcraft.Entitys.mob.Enderbat;
import mark123mark.mods.transcraft.Entitys.mob.NukeCreeper;
import mark123mark.mods.transcraft.Entitys.mob.NukeCreeperRender;
import mark123mark.mods.transcraft.Renders.RenderEnderSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBat;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;



public class TranscraftClientProxy extends TranscraftCommonProxy {

	
public static Minecraft mc = Minecraft.getMinecraft();


	
	 
	 
	 public void registerHandlers()
		{
		//	TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
		}
	
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
	 
	 
}
