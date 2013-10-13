package mark123mark.mods.transcraft;


import java.io.File;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class TranscraftCommonProxy {

	
	
	public static File getMinecraftDir() 
	{
		return new File(".");
	}
	
	 
	 
	 public void registerHandlers()
		{
			TickRegistry.registerTickHandler(new TickHandler(), Side.SERVER);
			TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);	
		}
	 
	 public void registerTickHandlers()
		{
		//	TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
			TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);	
		}
	 
	 
		public void register() {
		//		GameRegistry.registerTileEntity(TileEntityTF.class, "TileEntity");
		}
		
}	