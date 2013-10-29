package mark123mark.mods.TranscraftAddons;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;

public class ClientProxy extends CommonProxy{

	public void registerNEI()
	{
		AddonNEILoad.StartNei();
	}

}
