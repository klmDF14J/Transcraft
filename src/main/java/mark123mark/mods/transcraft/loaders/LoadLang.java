package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Items.TranscraftItems;
import mark123mark.mods.transcraft.api.Fluids;
import mark123mark.zaetApi.api.ColoredBlockUtil;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LoadLang {

	public static void loadlang() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.TranstabItems", "en_US", "Transcraft Items");
		LanguageRegistry.instance().addStringLocalization("itemGroup.TranstabBlocks", "en_US", "Transcraft Blocks");
		LanguageRegistry.instance().addStringLocalization("itemGroup.TranstabDecBlocks", "en_US","Transcraft Decorative Blocks");

		LanguageRegistry.addName(TranscraftItems.BasicTransmuter, "Basic Transmuter");
		LanguageRegistry.addName(TranscraftItems.QuadTransmuter, "QuadTransmuter");
		LanguageRegistry.addName(TranscraftItems.NanoTransmuter, "NanoTransmuter");
		LanguageRegistry.addName(TranscraftItems.HotDog, "Hot Dog");
		LanguageRegistry.addName(TranscraftItems.Oil, "Oil");
		LanguageRegistry.addName(TranscraftItems.Plastic, "Plastic");
		LanguageRegistry.addName(TranscraftItems.IronStick, "Iron Stick");
		LanguageRegistry.addName(TranscraftItems.HardendPlastic, "Hardend Plastic");
		LanguageRegistry.addName(TranscraftItems.EnderQuartz, "Ender Quartz");
		LanguageRegistry.addName(TranscraftItems.EnderGem, "Ender Gem");
		LanguageRegistry.addName(TranscraftItems.DarkEndershard, "DarkEnder Shard");
		LanguageRegistry.addName(Fluids.ItemBucketLiquidTrasnmutter.get(),"Transbucket");
		LanguageRegistry.addName(TranscraftItems.Transpedia, "Transpedia");
		
		
		LanguageRegistry.addName(TranscraftItems.PlasticAxe, "Plastic Axe");
		LanguageRegistry.addName(TranscraftItems.PlasticHoe, "Plastic Hoe");
		LanguageRegistry.addName(TranscraftItems.PlasticPickaxe, "Plastic Pickaxe");
		LanguageRegistry.addName(TranscraftItems.PlasticShovel, "Plastic Shovel");
		LanguageRegistry.addName(TranscraftItems.PlasticSword, "Plastic Sword");
		LanguageRegistry.addName(TranscraftItems.BunkerPick, "Ender Pickaxe");
		LanguageRegistry.addName(TranscraftItems.EnderSword, "Ender Sword");

		LanguageRegistry.addName(TranscraftItems.PlasticHelmet, "Plastic Helmet");
		LanguageRegistry.addName(TranscraftItems.PlasticChest, "Plastic Chest");
		LanguageRegistry.addName(TranscraftItems.PlasticLegs, "Plastic Legs");
		LanguageRegistry.addName(TranscraftItems.PlasticBoots, "Plastic Boots");

		LanguageRegistry.addName(TranscraftItems.EnderHelmet, "Ender Helmet");
		LanguageRegistry.addName(TranscraftItems.EnderChest, "Ender Chestplate");
		LanguageRegistry.addName(TranscraftItems.EnderLegs, "Ender Legs");
		LanguageRegistry.addName(TranscraftItems.EnderBoots, "Ender Boots");

		ColoredBlockUtil.addLocalizationsForBlock((ItemBlock) new ItemStack(
				Transcraft.enderQuartzBlock, 1).getItem(), "Ender Quartz");

		ColoredBlockUtil.addLocalizationsForBlock((ItemBlock) new ItemStack(
				Transcraft.CutenderQuartz, 1).getItem(), "Chiseled Ender Quartz");

		ColoredBlockUtil
				.addLocalizationsForBlock((ItemBlock) new ItemStack(
						Transcraft.EnderQuartzBrick, 1).getItem(),
						"Ender Quartz Brick");

		ColoredBlockUtil.addLocalizationsForBlock((ItemBlock) new ItemStack(
				Transcraft.EnderQuartzBigBrick, 1).getItem(),
				"Ender Quartz Big Brick");

		ColoredBlockUtil.addLocalizationsForBlock((ItemBlock) new ItemStack(Transcraft.FancyCrystalGlass, 1).getItem(),"Fancy Crystal Glass");

		ColoredBlockUtil.addLocalizationsForBlock((ItemBlock) new ItemStack(Transcraft.ClearGlass, 1).getItem(), "Crystal Glass");

		 LanguageRegistry.addName(Transcraft.DimPortalEscapeBlock,
		 "Transmania Escape Portal");
		 LanguageRegistry.addName(Transcraft.DimPortalBlock,
		 "TransMania Portal");

		LanguageRegistry.addName(Transcraft.ixpGrinder, "Ixp Grinder");
		
		LanguageRegistry.addName(Transcraft.TransManiaOre, "TransManiaOre");
	}

}
