package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeLoader
{

	public static void LoadRecipe()
	{
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

		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticHelmet, 1), "ppp", "p p", "   ", 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticChest, 1), "p p", "ppp", "ppp", 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticLegs, 1), "ppp", "p p", "p p", 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticBoots, 1), "   ", "p p", "p p", 'p', Transcraft.Plastic);

		GameRegistry.addRecipe(new ItemStack(Transcraft.ComIronOre, 1), "ii", "ii", 'i', Block.oreIron);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ComGoldOre, 1), "ii", "ii", 'i', Block.oreGold);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ComTransmutterOre, 1), "ii", "ii", 'i', Transcraft.TranscraftOre);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ComOilOre, 1), "ii", "ii", 'i', Transcraft.Oil);

		GameRegistry.addRecipe(new ItemStack(Block.oreIron, 4), "i", 'i', Transcraft.ComIronOre);
		GameRegistry.addRecipe(new ItemStack(Block.oreGold, 4), "i", 'i', Transcraft.ComGoldOre);
		GameRegistry.addRecipe(new ItemStack(Transcraft.TranscraftOre, 4), "i", 'i', Transcraft.ComTransmutterOre);
		GameRegistry.addRecipe(new ItemStack(Transcraft.Oil, 4), "i", 'i', Transcraft.ComOilOre);

		GameRegistry.addRecipe(new ItemStack(Transcraft.HotDog, 8), "bbb", "ppp", "bbb", 'b', Item.bread, 'p', Item.porkCooked);

		GameRegistry.addRecipe(new ItemStack(Transcraft.ObsidianLever, 2), "lb ", "   ", "  ", 'l', Block.lever, 'b', Transcraft.BunkerBlock);

		GameRegistry.addRecipe(new ItemStack(Block.sponge, 16), "yxy", "xdx", "yxy", 'x', Water, 'y', GoldIStack, 'd', Item.diamond);

		GameRegistry.addRecipe(new ItemStack(Transcraft.BunkerBlock, 8), "opo", "pdp", "opo", 'o', Transcraft.HardendPlastic, 'p', Transcraft.Plastic, 'd', Item.diamond);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ClearGlass, 8), "ggg", "gpg", "ggg", 'g', Block.glass, 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.FancyCrystalGlass, 8), "ggg", "gpg", "ggg", 'g', Transcraft.ClearGlass, 'p', Block.sponge);
		GameRegistry.addRecipe(new ItemStack(Transcraft.ThinClearGlass, 8), "   ", "ggg", "ggg", 'g', Transcraft.ClearGlass);
		GameRegistry.addRecipe(new ItemStack(Transcraft.BunkerStair, 4), "b  ", "bb ", "bbb", 'b', Transcraft.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(Transcraft.BunkerStair, 4), "  b", " bb", "bbb", 'b', Transcraft.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(Transcraft.SmoothBunkerBlock, 4), "bb", "bb", 'b', Transcraft.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(Transcraft.SmoothBunkerStair, 4), "b  ", "bb ", "bbb", 'b', Transcraft.SmoothBunkerBlock);
		GameRegistry.addRecipe(new ItemStack(Transcraft.SmoothBunkerStair, 4), "  b", " bb", "bbb", 'b', Transcraft.SmoothBunkerBlock);

		GameRegistry.addRecipe(new ItemStack(Transcraft.Transcrafter), "ddd", "ece", "ooo", 'e', Item.emerald, 'd', Item.diamond, 'c', Block.chest, 'o', Block.obsidian);

		ItemStack BlueDye = new ItemStack(Item.dyePowder, 1, 12);
		ItemStack GreenDye = new ItemStack(Item.dyePowder, 1, 2);
		ItemStack OrangeDye = new ItemStack(Item.dyePowder, 1, 14);

		GameRegistry.addRecipe(new ItemStack(Transcraft.enderQuartzBlock, 8), " q ", "qqq", " d ", 'd', GreenDye, 'q', Item.netherQuartz);
		

		GameRegistry.addRecipe(new ItemStack(Transcraft.BlueLight, 8), "prp", "pbp", "prp", 'r', Item.redstone, 'p', Transcraft.Plastic, 'b', BlueDye);
		GameRegistry.addRecipe(new ItemStack(Transcraft.GreenLight, 8), "prp", "pbp", "prp", 'r', Item.redstone, 'p', Transcraft.Plastic, 'b', GreenDye);
		GameRegistry.addRecipe(new ItemStack(Transcraft.OrangeLight, 8), "prp", "pbp", "prp", 'r', Item.redstone, 'p', Transcraft.Plastic, 'b', OrangeDye);
		GameRegistry.addRecipe(new ItemStack(Transcraft.DarkLight, 8), "prp", "pbp", "prp", 'r', Item.redstone, 'p', Transcraft.Plastic, 'b', Block.obsidian);
		GameRegistry.addRecipe(new ItemStack(Transcraft.HardendPlastic, 8), "pop", "ooo", "pop", 'p', Transcraft.Plastic, 'o', Block.obsidian);

		GameRegistry.addRecipe(new ItemStack(Transcraft.IronStick, 4), " i ", " s ", " i ", 'i', Item.ingotIron, 's', Item.stick);
		GameRegistry.addRecipe(new ItemStack(Transcraft.IronTorch, 16), "o", "i", 'i', Transcraft.IronStick, 'o', Transcraft.Oil);

		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticSword), " p ", " p ", " i ", 'i', Transcraft.IronStick, 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticPickaxe), "ppp", " i ", " i ", 'i', Transcraft.IronStick, 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticAxe), " pp", " ip", " i ", 'i', Transcraft.IronStick, 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticAxe), "pp ", "pi ", " i ", 'i', Transcraft.IronStick, 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticHoe), "pp ", " i ", " i ", 'i', Transcraft.IronStick, 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticHoe), " pp", " i ", " i ", 'i', Transcraft.IronStick, 'p', Transcraft.Plastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.PlasticShovel), " p ", " i ", " i ", 'i', Transcraft.IronStick, 'p', Transcraft.Plastic);

		GameRegistry.addRecipe(new ItemStack(Transcraft.BunkerPick), "bbb", "dod", "qoq", 'b', Transcraft.BunkerBlock, 'd', Block.blockDiamond, 'o', Transcraft.HardendPlastic, 'q', Transcraft.DarkEndershard);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderSword), "ebe", "ebe", "ndn", 'e', Transcraft.EnderGem, 'd', Block.blockDiamond, 'b', Transcraft.BunkerBlock, 'n', Item.swordDiamond);

		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderQuartz, 6), "qeq", "qdq", "qeq", 'q', Transcraft.DarkEndershard, 'd', Block.whiteStone, 'e', Item.eyeOfEnder);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderGem), "qdq", "qeq", "qdq", 'q', Transcraft.EnderQuartz, 'd', Item.diamond, 'e', Item.eyeOfEnder);

		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderHelmet, 1), "ppp", "pgp", "   ", 'p', Transcraft.EnderGem, 'g', Transcraft.FancyCrystalGlass);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderChest, 1), "pbp", "ppp", "ppp", 'p', Transcraft.EnderGem, 'b', Transcraft.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderLegs, 1), "ppp", "p p", "pep", 'p', Transcraft.EnderGem, 'e', Item.eyeOfEnder);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderBoots, 1), "   ", "pep", "pep", 'p', Transcraft.EnderGem, 'e', Item.enderPearl);

		GameRegistry.addRecipe(new ItemStack(Transcraft.QuadTransmuter), "sbs", "bsb", "sbs", 'b', Transcraft.BasicTransmuter, 's', Block.stone);

		GameRegistry.addRecipe(new ItemStack(Transcraft.NanoTransmuter), "qqr", "qqg", "qqr", 'q', Transcraft.QuadTransmuter, 'g', Item.glowstone, 'r', Item.redstone);

		// GameRegistry.addRecipe(new ItemStack(Transcraft.DimPortalBlock, 1),
		// "dgd","bbb", "dgd", 'd', Item.diamond, 'g', Item.ingotGold,'b',
		// Transcraft.BasicTransmuter);

		// Smelting Recipes
		GameRegistry.addSmelting(Transcraft.TranscraftOre.blockID, new ItemStack(Transcraft.BasicTransmuter), 2.3f);
		GameRegistry.addSmelting(Transcraft.Oil.itemID, new ItemStack(Transcraft.Plastic), 2.3f);
		GameRegistry.addSmelting(Transcraft.OilOre.blockID, new ItemStack(Transcraft.Oil), 2.3f);

	}

}
