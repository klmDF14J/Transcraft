package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class LoadOreDics
{

	public static void oredic()
	{
		OreDictionary.registerOre("TRANS-oreTranscraft", new ItemStack(Transcraft.TranscraftOre));
		OreDictionary.registerOre("TRANS-Oil", new ItemStack(Transcraft.Oil));
		OreDictionary.registerOre("TRANS-oreOil", new ItemStack(Transcraft.OilOre));
		OreDictionary.registerOre("TRANS-BlockBlueLight", new ItemStack(Transcraft.BlueLight));
		OreDictionary.registerOre("TRANS-BlockOrangeLight", new ItemStack(Transcraft.OrangeLight));
		OreDictionary.registerOre("TRANS-BlockGreenLight", new ItemStack(Transcraft.GreenLight));
		OreDictionary.registerOre("TRANS-BlockDarkLight", new ItemStack(Transcraft.DarkLight));
		OreDictionary.registerOre("TRANS-BunkerBlock", new ItemStack(Transcraft.BunkerBlock));
		OreDictionary.registerOre("TRANS-BunkerStair", new ItemStack(Transcraft.BunkerStair));
		OreDictionary.registerOre("TRANS-ComGoldOre", new ItemStack(Transcraft.ComGoldOre));
		OreDictionary.registerOre("TRANS-ComIronOre", new ItemStack(Transcraft.ComIronOre));
		OreDictionary.registerOre("TRANS-ComOilOre", new ItemStack(Transcraft.ComOilOre));
		OreDictionary.registerOre("TRANS-ComTransmuterOre", new ItemStack(Transcraft.ComTransmutterOre));
		OreDictionary.registerOre("TRANS-ComTransmuterOre", new ItemStack(Transcraft.ComTransmutterOre));
		OreDictionary.registerOre("TRANS-IronTorch", new ItemStack(Transcraft.IronTorch));
		OreDictionary.registerOre("TRANS-SmoothBunkerBlock", new ItemStack(Transcraft.SmoothBunkerBlock));
		OreDictionary.registerOre("TRANS-SmoothBunkerStair", new ItemStack(Transcraft.SmoothBunkerStair));
		OreDictionary.registerOre("TRANS-DiredTrannsmuter", Transcraft.DriedTransmutter);

		OreDictionary.registerOre("TRANS-BasicTransmuter", new ItemStack(Transcraft.BasicTransmuter));
		OreDictionary.registerOre("TRANS-QuadTransmuter", new ItemStack(Transcraft.QuadTransmuter));
		OreDictionary.registerOre("TRANS-NanoTransmuter", new ItemStack(Transcraft.NanoTransmuter));
		OreDictionary.registerOre("TRANS-EnderGem", new ItemStack(Transcraft.EnderGem));
		OreDictionary.registerOre("TRANS-EnderQuartz", new ItemStack(Transcraft.EnderQuartz));
		OreDictionary.registerOre("TRANS-Plastic", new ItemStack(Transcraft.Plastic));
		OreDictionary.registerOre("TRANS-HardendPlastic", new ItemStack(Transcraft.HardendPlastic));
		OreDictionary.registerOre("TRANS-IronStick", new ItemStack(Transcraft.IronStick));

		OreDictionary.registerOre("TRANS-BunkerPick", new ItemStack(Transcraft.BunkerPick));
		OreDictionary.registerOre("TRANS-EnderSword", new ItemStack(Transcraft.EnderSword));
		OreDictionary.registerOre("TRANS-PlasicAxe", new ItemStack(Transcraft.PlasticAxe));
		OreDictionary.registerOre("TRANS-PlasicHoe", new ItemStack(Transcraft.PlasticHoe));
		OreDictionary.registerOre("TRANS-PlasicPickaxe", new ItemStack(Transcraft.PlasticPickaxe));
		OreDictionary.registerOre("TRANS-PlasicShovel", new ItemStack(Transcraft.PlasticShovel));
		OreDictionary.registerOre("TRANS-PlasicSword", new ItemStack(Transcraft.PlasticSword));
	}

}
