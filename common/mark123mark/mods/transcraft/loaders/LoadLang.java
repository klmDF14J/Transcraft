package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LoadLang {

	public static void loadlang()
	{
		LanguageRegistry.instance().addStringLocalization(
				"itemGroup.TranstabItems", "en_US", "Transcraft Items");
		LanguageRegistry.instance().addStringLocalization(
				"itemGroup.TranstabBlocks", "en_US", "Transcraft Blocks");

		
		LanguageRegistry.addName(Transcraft.BasicTransmuter, "Basic Transmuter");
		LanguageRegistry.addName(Transcraft.QuadTransmuter, "QuadTransmuter");
		LanguageRegistry.addName(Transcraft.NanoTransmuter, "NanoTransmuter");
		LanguageRegistry.addName(Transcraft.HotDog, "Hot Dog");
		LanguageRegistry.addName(Transcraft.Oil, "Oil");
		LanguageRegistry.addName(Transcraft.Plastic, "Plastic");
		LanguageRegistry.addName(Transcraft.IronStick, "Iron Stick");
		LanguageRegistry.addName(Transcraft.HardendPlastic, "Hardend Plastic");
		LanguageRegistry.addName(Transcraft.EnderQuartz, "Ender Quartz");
		LanguageRegistry.addName(Transcraft.EnderGem, "Ender Gem");
		LanguageRegistry.addName(Transcraft.DarkEndershard, "DarkEnder Shard");
		
		LanguageRegistry.addName(Transcraft.PlasticAxe, "Plastic Axe");
		LanguageRegistry.addName(Transcraft.PlasticHoe, "Plastic Hoe");
		LanguageRegistry.addName(Transcraft.PlasticPickaxe, "Plastic Pickaxe");
		LanguageRegistry.addName(Transcraft.PlasticShovel, "Plastic Shovel");
		LanguageRegistry.addName(Transcraft.PlasticSword, "Plastic Sword");
		LanguageRegistry.addName(Transcraft.BunkerPick, "Ender Pickaxe");
		LanguageRegistry.addName(Transcraft.EnderSword, "Ender Sword");

		LanguageRegistry.addName(Transcraft.PlasticHelmet, "Plastic Helmet");
		LanguageRegistry.addName(Transcraft.PlasticChest, "Plastic Chest");
		LanguageRegistry.addName(Transcraft.PlasticLegs, "Plastic Legs");
		LanguageRegistry.addName(Transcraft.PlasticBoots, "Plastic Boots");

		LanguageRegistry.addName(Transcraft.EnderHelmet, "Ender Helmet");
		LanguageRegistry.addName(Transcraft.EnderChest, "Ender Chestplate");
		LanguageRegistry.addName(Transcraft.EnderLegs, "Ender Legs");
		LanguageRegistry.addName(Transcraft.EnderBoots, "Ender Boots");
		LanguageRegistry.addName(Transcraft.DimPortalEscapeBlock, "Transmania Escape Portal");
		LanguageRegistry.addName(Transcraft.DimPortalBlock, "TransMania Portal");
		
		LanguageRegistry.addName(Transcraft.TransManiaOre, "TransManiaOre");
	}
	
}
