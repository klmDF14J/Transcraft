package mark123mark.mods.transcraft.loaders;

import net.minecraftforge.common.DimensionManager;
import mark123mark.mods.transcraft.Config;
import mark123mark.mods.transcraft.TransDim.DimWorldProv;

public class LoadDim {

	public static void load()
	{
		
		DimensionManager.registerProviderType(234, DimWorldProv.class, false);
		DimensionManager.registerDimension(234, Config.DimID);
		
	}
	
}
