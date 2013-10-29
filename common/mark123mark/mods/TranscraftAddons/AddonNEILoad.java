package mark123mark.mods.TranscraftAddons;

import java.io.FileNotFoundException;

import codechicken.nei.api.API;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AddonNEILoad {

	 @SideOnly(Side.CLIENT)
	public static void StartNei ()
	{
	
		 LanguageRegistry.instance().addStringLocalization("nei.Transcrafter", "Transcrafter");
			API.registerRecipeHandler(new AddonNEI()); 
			 
	}
	
}
