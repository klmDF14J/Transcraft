package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Items.TranscraftItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeLoader {

	public static void LoadRecipe() {
		ItemStack dirtStack = new ItemStack(Block.dirt);
		ItemStack gravelStack = new ItemStack(Block.gravel);
		ItemStack CStoneStack = new ItemStack(Block.cobblestone);
		ItemStack CoalStack = new ItemStack(Item.coal);
		ItemStack GoldIStack = new ItemStack(Item.ingotGold);
		ItemStack IronIStack = new ItemStack(Item.ingotIron);
		ItemStack neatherbrickStack = new ItemStack(Block.netherBrick);
		ItemStack ObsidianStack = new ItemStack(Block.obsidian);
		ItemStack Water = new ItemStack(Item.bucketWater);
		ItemStack sponge = new ItemStack(Block.sponge);
		ItemStack DiamondBlock = new ItemStack(Block.blockDiamond);
		ItemStack Owood = new ItemStack(Block.wood);
		ItemStack Swood = new ItemStack(Block.wood, 1, 1);
		ItemStack Bwood = new ItemStack(Block.wood, 1, 2);
		ItemStack Jwood = new ItemStack(Block.wood, 1, 3);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticHelmet, 1),
				"ppp", "p p", "   ", 'p', TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticChest, 1),
				"p p", "ppp", "ppp", 'p', TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticLegs, 1), "ppp",
				"p p", "p p", 'p', TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticBoots, 1),
				"   ", "p p", "p p", 'p', TranscraftItems.Plastic);

		GameRegistry.addRecipe(new ItemStack(Transcraft.ComIronOre, 1), "ii",
				"ii", 'i', Block.oreIron);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ComGoldOre, 1), "ii",
				"ii", 'i', Block.oreGold);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ComTransmutterOre, 1),
				"ii", "ii", 'i', Transcraft.TranscraftOre);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ComOilOre, 1), "ii",
				"ii", 'i', TranscraftItems.Oil);

		GameRegistry.addRecipe(new ItemStack(Block.oreIron, 4), "i", 'i',
				Transcraft.ComIronOre);
		GameRegistry.addRecipe(new ItemStack(Block.oreGold, 4), "i", 'i',
				Transcraft.ComGoldOre);
		GameRegistry.addRecipe(new ItemStack(Transcraft.TranscraftOre, 4), "i",
				'i', Transcraft.ComTransmutterOre);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.Oil, 4), "i", 'i',
				Transcraft.ComOilOre);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.HotDog, 8), "bbb",
				"ppp", "bbb", 'b', Item.bread, 'p', Item.porkCooked);

		GameRegistry.addRecipe(new ItemStack(Transcraft.ObsidianLever, 2),
				"lb ", "   ", "  ", 'l', Block.lever, 'b',
				Transcraft.BunkerBlock);

		GameRegistry.addRecipe(new ItemStack(Block.sponge, 16), "yxy", "xdx",
				"yxy", 'x', Water, 'y', GoldIStack, 'd', Item.diamond);

		GameRegistry.addRecipe(new ItemStack(Transcraft.BunkerBlock, 8), "opo",
				"pdp", "opo", 'o', TranscraftItems.HardendPlastic, 'p',
				TranscraftItems.Plastic, 'd', Item.diamond);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ClearGlass, 8), "ggg",
				"gpg", "ggg", 'g', Block.glass, 'p', TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.FancyCrystalGlass, 8),
				"ggg", "gpg", "ggg", 'g', Transcraft.ClearGlass, 'p',
				Block.sponge);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ThinClearGlass, 8),
				"   ", "ggg", "ggg", 'g', Transcraft.ClearGlass);
		GameRegistry.addRecipe(new ItemStack(Transcraft.BunkerStair, 4), "b  ",
				"bb ", "bbb", 'b', Transcraft.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(Transcraft.BunkerStair, 4), "  b",
				" bb", "bbb", 'b', Transcraft.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(Transcraft.SmoothBunkerBlock, 4),
				"bb", "bb", 'b', Transcraft.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(Transcraft.SmoothBunkerStair, 4),
				"b  ", "bb ", "bbb", 'b', Transcraft.SmoothBunkerBlock);
		GameRegistry.addRecipe(new ItemStack(Transcraft.SmoothBunkerStair, 4),
				"  b", " bb", "bbb", 'b', Transcraft.SmoothBunkerBlock);

		GameRegistry.addRecipe(new ItemStack(Transcraft.Transcrafter), "ddd",
				"ece", "ooo", 'e', Item.emerald, 'd', Item.diamond, 'c',
				Block.chest, 'o', Block.obsidian);

		ItemStack BlueDye = new ItemStack(Item.dyePowder, 1, 12);
		ItemStack GreenDye = new ItemStack(Item.dyePowder, 1, 2);
		ItemStack OrangeDye = new ItemStack(Item.dyePowder, 1, 14);

		GameRegistry.addRecipe(new ItemStack(Transcraft.enderQuartzBlock, 8),
				" q ", "qqq", " d ", 'd', GreenDye, 'q', Item.netherQuartz);

		GameRegistry.addRecipe(new ItemStack(Transcraft.BlueLight, 8), "prp",
				"pbp", "prp", 'r', Item.redstone, 'p', TranscraftItems.Plastic, 'b',
				BlueDye);
		GameRegistry.addRecipe(new ItemStack(Transcraft.GreenLight, 8), "prp",
				"pbp", "prp", 'r', Item.redstone, 'p', TranscraftItems.Plastic, 'b',
				GreenDye);
		GameRegistry.addRecipe(new ItemStack(Transcraft.OrangeLight, 8), "prp",
				"pbp", "prp", 'r', Item.redstone, 'p', TranscraftItems.Plastic, 'b',
				OrangeDye);
		GameRegistry.addRecipe(new ItemStack(Transcraft.DarkLight, 8), "prp",
				"pbp", "prp", 'r', Item.redstone, 'p', TranscraftItems.Plastic, 'b',
				Block.obsidian);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.HardendPlastic, 8),
				"pop", "ooo", "pop", 'p', TranscraftItems.Plastic, 'o',
				Block.obsidian);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.IronStick, 4), " i ",
				" s ", " i ", 'i', Item.ingotIron, 's', Item.stick);
		GameRegistry.addRecipe(new ItemStack(Transcraft.IronTorch, 16), "o",
				"i", 'i', TranscraftItems.IronStick, 'o', TranscraftItems.Oil);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticSword), " p ",
				" p ", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticPickaxe), "ppp",
				" i ", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticAxe), " pp",
				" ip", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticAxe), "pp ",
				"pi ", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticHoe), "pp ",
				" i ", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticHoe), " pp",
				" i ", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticShovel), " p ",
				" i ", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.BunkerPick), "bbb",
				"dod", "qoq", 'b', Transcraft.BunkerBlock, 'd',
				Block.blockDiamond, 'o', TranscraftItems.HardendPlastic, 'q',
				TranscraftItems.DarkEndershard);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderSword), "ebe",
				"ebe", "ndn", 'e', TranscraftItems.EnderGem, 'd',
				Block.blockDiamond, 'b', Transcraft.BunkerBlock, 'n',
				Item.swordDiamond);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderQuartz, 6), "qeq",
				"qdq", "qeq", 'q', TranscraftItems.DarkEndershard, 'd',
				Block.whiteStone, 'e', Item.eyeOfEnder);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderGem), "qdq",
				"qeq", "qdq", 'q', TranscraftItems.EnderQuartz, 'd', Item.diamond,
				'e', Item.eyeOfEnder);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderHelmet, 1), "ppp",
				"pgp", "   ", 'p', TranscraftItems.EnderGem, 'g',
				Transcraft.FancyCrystalGlass);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderChest, 1), "pbp",
				"ppp", "ppp", 'p', TranscraftItems.EnderGem, 'b',
				Transcraft.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderLegs, 1), "ppp",
				"p p", "pep", 'p', TranscraftItems.EnderGem, 'e', Item.eyeOfEnder);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderBoots, 1), "   ",
				"pep", "pep", 'p', TranscraftItems.EnderGem, 'e', Item.enderPearl);

		GameRegistry
				.addRecipe(new ItemStack(TranscraftItems.QuadTransmuter), "sbs",
						"bsb", "sbs", 'b', TranscraftItems.BasicTransmuter, 's',
						Block.stone);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.NanoTransmuter), "qqr",
				"qqg", "qqr", 'q', TranscraftItems.QuadTransmuter, 'g',
				Item.glowstone, 'r', Item.redstone);

		// GameRegistry.addRecipe(new ItemStack(Transcraft.DimPortalBlock, 1),
		// "dgd","bbb", "dgd", 'd', Item.diamond, 'g', Item.ingotGold,'b',
		// Transcraft.BasicTransmuter);

		// Smelting Recipes
		GameRegistry.addSmelting(Transcraft.TranscraftOre.blockID,
				new ItemStack(TranscraftItems.BasicTransmuter), 2.3f);
		GameRegistry.addSmelting(TranscraftItems.Oil.itemID, new ItemStack(
				TranscraftItems.Plastic), 2.3f);
		GameRegistry.addSmelting(Transcraft.OilOre.blockID, new ItemStack(
				TranscraftItems.Oil), 2.3f);

	}

}
