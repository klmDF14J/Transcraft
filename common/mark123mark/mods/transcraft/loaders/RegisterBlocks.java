package mark123mark.mods.transcraft.loaders;

import net.minecraft.item.Item;
import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.TileEntitys.Transcrafter.TileTC;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RegisterBlocks {

	public static void RegisterBlocks()
	{
		LanguageRegistry.addName(Transcraft.TranscraftOre, "Transmutter Ore");
		LanguageRegistry.addName(Transcraft.OilOre, "Oil Ore");
		LanguageRegistry.addName(Transcraft.BlueLight, "Blue Light");
		LanguageRegistry.addName(Transcraft.GreenLight, "Green Light");
		LanguageRegistry.addName(Transcraft.OrangeLight, "Orange Light");
		LanguageRegistry.addName(Transcraft.DarkLight, "Dark Light");
		LanguageRegistry.addName(Transcraft.IronTorch, "Iron Torch");
		LanguageRegistry.addName(Transcraft.ClearGlass, "Crystal Glass");
		LanguageRegistry.addName(Transcraft.FancyCrystalGlass, "Fancy Crystal Glass");
		LanguageRegistry.addName(Transcraft.ThinClearGlass, "Thin Crystal Glass");
		LanguageRegistry.addName(Transcraft.BunkerBlock, "Bunker Block");
		LanguageRegistry.addName(Transcraft.BunkerStair, "Bunker Stair");
		LanguageRegistry.addName(Transcraft.SmoothBunkerStair, "Smooth Bunker Stair");
		LanguageRegistry.addName(Transcraft.ObsidianLever, "Obsidian Lever");
		LanguageRegistry.addName(Transcraft.SmoothBunkerBlock, "Smooth Bunker Block");
		LanguageRegistry.addName(Transcraft.DriedTransmutter, "Dried Transmuter");
		LanguageRegistry.addName(Transcraft.Transcrafter, "Transcrafter");
		LanguageRegistry.addName(Transcraft.ComIronOre, "Packed Iron Ore");
		LanguageRegistry.addName(Transcraft.ComGoldOre, "Packed Gold Ore");
		LanguageRegistry.addName(Transcraft.ComTransmutterOre, "Packed Transmuter Ore");
		LanguageRegistry.addName(Transcraft.ComOilOre, "Packed Oil Ore");
		LanguageRegistry.addName(Transcraft.enderQuartz, "Ender Quartz Block");
		LanguageRegistry.addName(Transcraft.chiselEnderQuartz, "Chiseled Ender Quartz Block");
		LanguageRegistry.addName(Transcraft.BlueenderQuartz, "Blue Ender Quartz Block");
		LanguageRegistry.addName(Transcraft.BluechiselEnderQuartz, "Blue Chiseled Ender Quartz Block");
		LanguageRegistry.addName(Transcraft.RedenderQuartz, "Red Ender Quartz Block");
		LanguageRegistry.addName(Transcraft.RedchiselEnderQuartz, "Red Chiseled Ender Quartz Block");
		LanguageRegistry.addName(Transcraft.StairRedchiselEnderQuartz, "Red Chiseled Ender Quartz Block Stair");
		LanguageRegistry.addName(Transcraft.StairRedenderQuartz, "Red Ender Quartz Block Stair");
		LanguageRegistry.addName(Transcraft.StairBluechiselEnderQuartz, "Blue Chiseled Ender Quartz Block Stair");
		LanguageRegistry.addName(Transcraft.StairBlueenderQuartz, "Blue Ender Quartz Block Stair");
		LanguageRegistry.addName(Transcraft.StairchiselEnderQuartz, "Chiseled Ender Quartz Block Stair");
		LanguageRegistry.addName(Transcraft.StairenderQuartz, "Ender Quartz Block Stair");
//		LanguageRegistry.addName(Transcraft.DimPortalBlock, "TransMania Portal");


//		LanguageRegistry.addName(Transcraft.DimPortalEscapeBlock, "Transmania Escape block");
		LanguageRegistry.addName(Transcraft.TransManiaOre, "TransManiaOre");

	//	LanguageRegistry.addName(Transcraft.DimPortalEscapeBlock, "Transmania Escape Portal");


		
		
		GameRegistry.registerBlock(Transcraft.TranscraftOre, "Transmuter Ore");
		GameRegistry.registerBlock(Transcraft.OilOre, "Oil Ore");
		GameRegistry.registerBlock(Transcraft.BlueLight, "Blue Light");
		GameRegistry.registerBlock(Transcraft.GreenLight, "Green Light");
		GameRegistry.registerBlock(Transcraft.OrangeLight, "Orange Light");
		GameRegistry.registerBlock(Transcraft.DarkLight, "Dark Light");
		GameRegistry.registerBlock(Transcraft.IronTorch, "IronTorch");
		GameRegistry.registerBlock(Transcraft.ClearGlass, "Clear Glass");
		GameRegistry.registerBlock(Transcraft.FancyCrystalGlass, "Fancy Crystal Glass");
		GameRegistry.registerBlock(Transcraft.ThinClearGlass, "Thin Clear Glass");
		GameRegistry.registerBlock(Transcraft.BunkerBlock, "Bunker Block");
		GameRegistry.registerBlock(Transcraft.SmoothBunkerStair, "Smooth Bunker Stair");
		GameRegistry.registerBlock(Transcraft.DriedTransmutter, "Dried Transmuter");
		GameRegistry.registerBlock(Transcraft.ComIronOre, "Packed Iron Ore");
		GameRegistry.registerBlock(Transcraft.ComGoldOre, "Packed Gold Ore");
		GameRegistry.registerBlock(Transcraft.ComTransmutterOre, "Packed Transmuter Ore");
		GameRegistry.registerBlock(Transcraft.ComOilOre, "Packed Oil Ore");
		GameRegistry.registerBlock(Transcraft.BunkerStair, "Bunker Stair");
		GameRegistry.registerBlock(Transcraft.ObsidianLever, "Obsidian Lever");
		GameRegistry.registerBlock(Transcraft.SmoothBunkerBlock, "Smooth Bunker Block");
		GameRegistry.registerBlock(Transcraft.enderQuartz, "EnderQuartz");
		GameRegistry.registerBlock(Transcraft.chiselEnderQuartz, "ChiselEnderQuartz");
		GameRegistry.registerBlock(Transcraft.BlueenderQuartz, "BlueEnderQuartz");
		GameRegistry.registerBlock(Transcraft.BluechiselEnderQuartz, "BlueChiselEnderQuartz");
		GameRegistry.registerBlock(Transcraft.RedenderQuartz, "RedEnderQuartz");
		GameRegistry.registerBlock(Transcraft.RedchiselEnderQuartz, "RedChiselEnderQuartz");
		GameRegistry.registerBlock(Transcraft.StairenderQuartz, "StairEnderQuartz");	
		GameRegistry.registerBlock(Transcraft.StairchiselEnderQuartz, "StairChiselEnderQuartz");
		GameRegistry.registerBlock(Transcraft.StairBlueenderQuartz, "StairBlueEnderQuartz");
		GameRegistry.registerBlock(Transcraft.StairBluechiselEnderQuartz, "StairBlueChiselEnderQuartz");
		GameRegistry.registerBlock(Transcraft.StairRedenderQuartz, "StairRedEnderQuartz");
		GameRegistry.registerBlock(Transcraft.StairRedchiselEnderQuartz, "StairRedChiselEnderQuartz");
//		GameRegistry.registerBlock(Transcraft.DimPortalBlock, "DimPortalBlock");
//		GameRegistry.registerBlock(Transcraft.DimPortalEscapeBlock, "DimPortalEscapeBlock");
		GameRegistry.registerBlock(Transcraft.TransManiaOre, "TransManiaOre");
	//	GameRegistry.registerBlock(Transcraft.ixpGrinder, "ixpGrinder");
		
		
		/*
		 * 
		
		
		GameRegistry.registerItem(Transcraft.BasicTransmuter, "BasicTransmutter" );
		GameRegistry.registerItem(Transcraft.QuadTransmuter, "QuadTransmutter");
		GameRegistry.registerItem(Transcraft.NanoTransmuter, "NanoTransmutter");
		GameRegistry.registerItem(Transcraft.HotDog, "HotDog");
		GameRegistry.registerItem(Transcraft.Oil, "Oil");
		GameRegistry.registerItem(Transcraft.Plastic, "Plastic");
		GameRegistry.registerItem(Transcraft.IronStick, "IronStick");
		GameRegistry.registerItem(Transcraft.HardendPlastic, "HardendPlastic");
		GameRegistry.registerItem(Transcraft.EnderGem, "EnderGem");
		GameRegistry.registerItem(Transcraft.EnderQuartz, "EnderQuartz");
		GameRegistry.registerItem(Transcraft.DarkEndershard, "DarkEndershard");
		
		GameRegistry.registerItem(Transcraft.PlasticAxe, "PlasticAxe");
		GameRegistry.registerItem(Transcraft.PlasticHoe, "PlasticHoe");
		GameRegistry.registerItem(Transcraft.PlasticPickaxe, "PlasticPickaxe");
		GameRegistry.registerItem(Transcraft.PlasticShovel, "PlasticShovel");
		GameRegistry.registerItem(Transcraft.PlasticSword, "PlasticSword");
		GameRegistry.registerItem(Transcraft.BunkerPick, "BunkerPick");
		GameRegistry.registerItem(Transcraft.EnderSword, "EnderSword");
	
		GameRegistry.registerItem(Transcraft.PlasticHelmet, "PlasticHelmet");
		GameRegistry.registerItem(Transcraft.PlasticChest, "PlasticChest");
		GameRegistry.registerItem(Transcraft.PlasticLegs, "PlasticLegs");
		GameRegistry.registerItem(Transcraft.PlasticBoots, "PlasticBoots");
		GameRegistry.registerItem(Transcraft.EnderHelmet, "EnderHelmet");
		GameRegistry.registerItem(Transcraft.EnderChest, "EnderChest");
		GameRegistry.registerItem(Transcraft.EnderLegs, "EnderLegs");
		GameRegistry.registerItem(Transcraft.EnderBoots, "EnderBoots");
		
		 */
		
		GameRegistry.registerTileEntity(TileTC.class, "TileEntityTC");
		
	}
	
}
