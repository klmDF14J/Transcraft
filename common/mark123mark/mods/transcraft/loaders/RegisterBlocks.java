package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.TileEntitys.LiquidTranscrafter.TileLTC;
import mark123mark.mods.transcraft.TileEntitys.Transcrafter.TileTC;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RegisterBlocks
{

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
		// LanguageRegistry.addName(Transcraft.DimPortalBlock,
		// "TransMania Portal");

		// LanguageRegistry.addName(Transcraft.DimPortalEscapeBlock,
		// "Transmania Escape block");
		LanguageRegistry.addName(Transcraft.TransManiaOre, "TransManiaOre");

		// LanguageRegistry.addName(Transcraft.DimPortalEscapeBlock,
		// "Transmania Escape Portal");

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
		GameRegistry.registerBlock(Transcraft.LTranscrafter, "Liquid Transcrafter");
		GameRegistry.registerBlock(Transcraft.Transcrafter, "Transcrafter");
		// GameRegistry.registerBlock(Transcraft.DimPortalBlock,
		// "DimPortalBlock");
		// GameRegistry.registerBlock(Transcraft.DimPortalEscapeBlock,
		// "DimPortalEscapeBlock");
		GameRegistry.registerBlock(Transcraft.TransManiaOre, "TransManiaOre");
		// GameRegistry.registerBlock(Transcraft.ixpGrinder, "ixpGrinder");

		registerItem(Transcraft.BasicTransmuter);
		registerItem(Transcraft.QuadTransmuter);
		registerItem(Transcraft.NanoTransmuter);
		registerItem(Transcraft.HotDog);
		registerItem(Transcraft.Oil);
		registerItem(Transcraft.Plastic);
		registerItem(Transcraft.IronStick);
		registerItem(Transcraft.HardendPlastic);
		registerItem(Transcraft.EnderGem);
		registerItem(Transcraft.EnderQuartz);
		registerItem(Transcraft.DarkEndershard);

		registerItem(Transcraft.PlasticAxe);
		registerItem(Transcraft.PlasticHoe);
		registerItem(Transcraft.PlasticPickaxe);
		registerItem(Transcraft.PlasticShovel);
		registerItem(Transcraft.PlasticSword);
		registerItem(Transcraft.BunkerPick);
		registerItem(Transcraft.EnderSword);

		registerItem(Transcraft.PlasticHelmet);
		registerItem(Transcraft.PlasticChest);
		registerItem(Transcraft.PlasticLegs);
		registerItem(Transcraft.PlasticBoots);
		registerItem(Transcraft.EnderHelmet);
		registerItem(Transcraft.EnderChest);
		registerItem(Transcraft.EnderLegs);
		registerItem(Transcraft.EnderBoots);

		GameRegistry.registerTileEntity(TileTC.class, "TileEntityTC");
		GameRegistry.registerTileEntity(TileLTC.class, "TileEntityLTC");

	}

	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName().replace("item.", ""));
	}

}
