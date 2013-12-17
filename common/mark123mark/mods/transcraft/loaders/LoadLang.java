package mark123mark.mods.transcraft.loaders;

import net.minecraft.item.ItemStack;
import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Blocks.CrystalGlass;
import mark123mark.mods.transcraft.Blocks.CutEnderQuartz;
import mark123mark.mods.transcraft.Blocks.Quartz.EnderQuartz;
import mark123mark.mods.transcraft.Blocks.Quartz.EnderQuartzBigBrick;
import mark123mark.mods.transcraft.Blocks.Quartz.EnderQuartzBrick;
import mark123mark.mods.transcraft.api.Fluids;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LoadLang
{

	public static void loadlang()
	{
		LanguageRegistry.instance().addStringLocalization("itemGroup.TranstabItems", "en_US", "Transcraft Items");
		LanguageRegistry.instance().addStringLocalization("itemGroup.TranstabBlocks", "en_US", "Transcraft Blocks");

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
		LanguageRegistry.addName(Fluids.ItemBucketLiquidTrasnmutter.get(), "Transbucket");

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

		for(int i = 0; i < EnderQuartz.types.length; i++) {
			LanguageRegistry.addName(new ItemStack(Transcraft.EnderQuartz, 1, i), EnderQuartz.types[i] + " Ender Quartz");
		}
		
		for(int i = 0; i < CutEnderQuartz.types.length; i++) {
			LanguageRegistry.addName(new ItemStack(Transcraft.CutenderQuartz, 1, i), CutEnderQuartz.types[i] + " Cut Ender Quartz");
		}

		for(int i = 0; i < EnderQuartzBrick.types.length; i++) {
			LanguageRegistry.addName(new ItemStack(Transcraft.EnderQuartzBrick, 1, i), EnderQuartzBrick.types[i] + " Ender Quartz Bricks");
		}
		
		for(int i = 0; i < EnderQuartzBigBrick.types.length; i++) {
			LanguageRegistry.addName(new ItemStack(Transcraft.EnderQuartzBigBrick, 1, i), EnderQuartzBrick.types[i] + " Ender Quartz Big Bricks");
		}
		
		
		// LanguageRegistry.addName(Transcraft.DimPortalEscapeBlock,
		// "Transmania Escape Portal");
		// LanguageRegistry.addName(Transcraft.DimPortalBlock,
		// "TransMania Portal");

		LanguageRegistry.addName(Transcraft.TransManiaOre, "TransManiaOre");
	}

}
