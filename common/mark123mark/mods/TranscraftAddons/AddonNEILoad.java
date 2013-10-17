package mark123mark.mods.TranscraftAddons;

import codechicken.nei.api.API;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class AddonNEILoad {

	
	public static void StartNei ()
	{
		LanguageRegistry.instance().addStringLocalization("nei.Transcrafter", "Transcrafter");
		API.registerRecipeHandler(new AddonNEI());
	}
	
}
