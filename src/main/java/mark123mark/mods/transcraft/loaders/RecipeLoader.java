package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeLoader {

	public static void LoadRecipe() {
		ItemStack dirtStack = new ItemStack(Blocks.dirt);
		ItemStack gravelStack = new ItemStack(Blocks.gravel);
		ItemStack CStoneStack = new ItemStack(Blocks.cobblestone);
		ItemStack CoalStack = new ItemStack(Items.coal);
		ItemStack GoldIStack = new ItemStack(Items.gold_nugget);
		ItemStack IronIStack = new ItemStack(Items.iron_ingot);
		ItemStack neatherbrickStack = new ItemStack(Blocks.nether_brick);
		ItemStack ObsidianStack = new ItemStack(Blocks.obsidian);
		ItemStack Water = new ItemStack(Items.water_bucket);
		ItemStack sponge = new ItemStack(Blocks.sponge);
		ItemStack DiamondBlock = new ItemStack(Blocks.diamond_block);
		ItemStack Owood = new ItemStack(Blocks.log);
		ItemStack Swood = new ItemStack(Blocks.log, 1, 1);
		ItemStack Bwood = new ItemStack(Blocks.log, 1, 2);
		ItemStack Jwood = new ItemStack(Blocks.log, 1, 3);

		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticHelmet, 1),
				"ppp", "p p", "   ", 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticChest, 1),
				"p p", "ppp", "ppp", 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticLegs, 1), "ppp",
				"p p", "p p", 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticBoots, 1),
				"   ", "p p", "p p", 'p', Transcraft.Plastic);

		GameRegistry.addRecipe(new ItemStack(Transcraft.ComIronOre, 1), "ii",
				"ii", 'i', Blocks.iron_ore);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ComGoldOre, 1), "ii",
				"ii", 'i', Blocks.gold_ore);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ComTransmutterOre, 1),
				"ii", "ii", 'i', Transcraft.TranscraftOre);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ComOilOre, 1), "ii",
				"ii", 'i', Transcraft.Oil);

		GameRegistry.addRecipe(new ItemStack(Blocks.iron_ore, 4), "i", 'i',
				Transcraft.ComIronOre);
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_ore, 4), "i", 'i',
				Transcraft.ComGoldOre);
		GameRegistry.addRecipe(new ItemStack(Transcraft.TranscraftOre, 4), "i",
				'i', Transcraft.ComTransmutterOre);
		GameRegistry.addRecipe(new ItemStack(Transcraft.Oil, 4), "i", 'i',
				Transcraft.ComOilOre);

		GameRegistry.addRecipe(new ItemStack(Transcraft.HotDog, 8), "bbb",
				"ppp", "bbb", 'b', Items.bread, 'p', Items.porkchop);

		GameRegistry.addRecipe(new ItemStack(Transcraft.ObsidianLever, 2),
				"lb ", "   ", "  ", 'l', Blocks.lever, 'b',
				Transcraft.BunkerBlock);

		GameRegistry.addRecipe(new ItemStack(Blocks.sponge, 16), "yxy", "xdx",
				"yxy", 'x', Water, 'y', GoldIStack, 'd', Items.diamond);

		GameRegistry.addRecipe(new ItemStack(Transcraft.BunkerBlock, 8), "opo",
				"pdp", "opo", 'o', Transcraft.HardendPlastic, 'p',
				Transcraft.Plastic, 'd', Items.diamond);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ClearGlass, 8), "ggg",
				"gpg", "ggg", 'g', Blocks.glass, 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.FancyCrystalGlass, 8),
				"ggg", "gpg", "ggg", 'g', Transcraft.ClearGlass, 'p',
				Blocks.sponge);
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
				"ece", "ooo", 'e', Items.emerald, 'd', Items.diamond, 'c',
				Blocks.chest, 'o', Blocks.obsidian);

		ItemStack BlueDye = new ItemStack(Items.dye, 1, 12);
		ItemStack GreenDye = new ItemStack(Items.dye, 1, 2);
		ItemStack OrangeDye = new ItemStack(Items.dye, 1, 14);

		GameRegistry.addRecipe(new ItemStack(Transcraft.enderQuartzBlock, 8),
				" q ", "qqq", " d ", 'd', GreenDye, 'q', Items.quartz);

		GameRegistry.addRecipe(new ItemStack(Transcraft.BlueLight, 8), "prp",
				"pbp", "prp", 'r', Items.redstone, 'p', Transcraft.Plastic, 'b',
				BlueDye);
		GameRegistry.addRecipe(new ItemStack(Transcraft.GreenLight, 8), "prp",
				"pbp", "prp", 'r', Items.redstone, 'p', Transcraft.Plastic, 'b',
				GreenDye);
		GameRegistry.addRecipe(new ItemStack(Transcraft.OrangeLight, 8), "prp",
				"pbp", "prp", 'r', Items.redstone, 'p', Transcraft.Plastic, 'b',
				OrangeDye);
		GameRegistry.addRecipe(new ItemStack(Transcraft.DarkLight, 8), "prp",
				"pbp", "prp", 'r', Items.redstone, 'p', Transcraft.Plastic, 'b',
				Blocks.obsidian);
		GameRegistry.addRecipe(new ItemStack(Transcraft.HardendPlastic, 8),
				"pop", "ooo", "pop", 'p', Transcraft.Plastic, 'o',
				Blocks.obsidian);

		GameRegistry.addRecipe(new ItemStack(Transcraft.IronStick, 4), " i ",
				" s ", " i ", 'i', Items.iron_ingot, 's', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Transcraft.IronTorch, 16), "o",
				"i", 'i', Transcraft.IronStick, 'o', Transcraft.Oil);

		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticSword), " p ",
				" p ", " i ", 'i', Transcraft.IronStick, 'p',
				Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticPickaxe), "ppp",
				" i ", " i ", 'i', Transcraft.IronStick, 'p',
				Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticAxe), " pp",
				" ip", " i ", 'i', Transcraft.IronStick, 'p',
				Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticAxe), "pp ",
				"pi ", " i ", 'i', Transcraft.IronStick, 'p',
				Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticHoe), "pp ",
				" i ", " i ", 'i', Transcraft.IronStick, 'p',
				Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticHoe), " pp",
				" i ", " i ", 'i', Transcraft.IronStick, 'p',
				Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticShovel), " p ",
				" i ", " i ", 'i', Transcraft.IronStick, 'p',
				Transcraft.Plastic);

		GameRegistry.addRecipe(new ItemStack(Transcraft.BunkerPick), "bbb",
				"dod", "qoq", 'b', Transcraft.BunkerBlock, 'd',
				Blocks.diamond_block, 'o', Transcraft.HardendPlastic, 'q',
				Transcraft.DarkEndershard);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderSword), "ebe",
				"ebe", "ndn", 'e', Transcraft.EnderGem, 'd',
				Blocks.diamond_block, 'b', Transcraft.BunkerBlock, 'n',
				Items.diamond_sword);

		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderQuartz, 6), "qeq",
				"qdq", "qeq", 'q', Transcraft.DarkEndershard, 'd',
				Blocks.end_stone, 'e', Items.ender_eye);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderGem), "qdq",
				"qeq", "qdq", 'q', Transcraft.EnderQuartz, 'd', Items.diamond,
				'e', Items.ender_eye);

		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderHelmet, 1), "ppp",
				"pgp", "   ", 'p', Transcraft.EnderGem, 'g',
				Transcraft.FancyCrystalGlass);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderChest, 1), "pbp",
				"ppp", "ppp", 'p', Transcraft.EnderGem, 'b',
				Transcraft.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderLegs, 1), "ppp",
				"p p", "pep", 'p', Transcraft.EnderGem, 'e', Items.ender_eye);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderBoots, 1), "   ",
				"pep", "pep", 'p', Transcraft.EnderGem, 'e', Items.ender_pearl);

		GameRegistry
				.addRecipe(new ItemStack(Transcraft.QuadTransmuter), "sbs",
						"bsb", "sbs", 'b', Transcraft.BasicTransmuter, 's',
						Blocks.stone);

		GameRegistry.addRecipe(new ItemStack(Transcraft.NanoTransmuter), "qqr",
				"qqg", "qqr", 'q', Transcraft.QuadTransmuter, 'g',
				Items.glowstone_dust, 'r', Items.redstone);

		// GameRegistry.addRecipe(new ItemStack(Transcraft.DimPortalBlock, 1),
		// "dgd","bbb", "dgd", 'd', Item.diamond, 'g', Item.ingotGold,'b',
		// Transcraft.BasicTransmuter);

		// Smelting Recipes
		GameRegistry.addSmelting(Transcraft.TranscraftOre,new ItemStack(Transcraft.BasicTransmuter), 2.3f);
		GameRegistry.addSmelting(Transcraft.Oil, new ItemStack(Transcraft.Plastic), 2.3f);
		GameRegistry.addSmelting(Transcraft.OilOre, new ItemStack(Transcraft.Oil), 2.3f);

	}

}
