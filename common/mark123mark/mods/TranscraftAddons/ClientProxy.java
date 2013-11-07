package mark123mark.mods.TranscraftAddons;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy{

	@SideOnly(Side.CLIENT)
	public void registerNEI()
	{
		AddonNEILoad.StartNei();
	}

}
