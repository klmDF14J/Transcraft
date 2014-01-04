package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Items.TranscraftItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class LoadOreDics {

	public static void oredic() {
		OreDictionary.registerOre("TRANS-oreTranscraft", new ItemStack(
				Transcraft.TranscraftOre));
		OreDictionary.registerOre("TRANS-Oil", new ItemStack(TranscraftItems.Oil));
		OreDictionary.registerOre("TRANS-oreOil", new ItemStack(
				Transcraft.OilOre));
		OreDictionary.registerOre("TRANS-BlockBlueLight", new ItemStack(
				Transcraft.BlueLight));
		OreDictionary.registerOre("TRANS-BlockOrangeLight", new ItemStack(
				Transcraft.OrangeLight));
		OreDictionary.registerOre("TRANS-BlockGreenLight", new ItemStack(
				Transcraft.GreenLight));
		OreDictionary.registerOre("TRANS-BlockDarkLight", new ItemStack(
				Transcraft.DarkLight));
		OreDictionary.registerOre("TRANS-BunkerBlock", new ItemStack(
				Transcraft.BunkerBlock));
		OreDictionary.registerOre("TRANS-BunkerStair", new ItemStack(
				Transcraft.BunkerStair));
		OreDictionary.registerOre("TRANS-ComGoldOre", new ItemStack(
				Transcraft.ComGoldOre));
		OreDictionary.registerOre("TRANS-ComIronOre", new ItemStack(
				Transcraft.ComIronOre));
		OreDictionary.registerOre("TRANS-ComOilOre", new ItemStack(
				Transcraft.ComOilOre));
		OreDictionary.registerOre("TRANS-ComTransmuterOre", new ItemStack(
				Transcraft.ComTransmutterOre));
		OreDictionary.registerOre("TRANS-ComTransmuterOre", new ItemStack(
				Transcraft.ComTransmutterOre));
		OreDictionary.registerOre("TRANS-IronTorch", new ItemStack(
				Transcraft.IronTorch));
		OreDictionary.registerOre("TRANS-SmoothBunkerBlock", new ItemStack(
				Transcraft.SmoothBunkerBlock));
		OreDictionary.registerOre("TRANS-SmoothBunkerStair", new ItemStack(
				Transcraft.SmoothBunkerStair));
		OreDictionary.registerOre("TRANS-DiredTrannsmuter",
				Transcraft.DriedTransmutter);

		OreDictionary.registerOre("TRANS-BasicTransmuter", new ItemStack(
				TranscraftItems.BasicTransmuter));
		OreDictionary.registerOre("TRANS-QuadTransmuter", new ItemStack(
				TranscraftItems.QuadTransmuter));
		OreDictionary.registerOre("TRANS-NanoTransmuter", new ItemStack(
				TranscraftItems.NanoTransmuter));
		OreDictionary.registerOre("TRANS-EnderGem", new ItemStack(
				TranscraftItems.EnderGem));
		OreDictionary.registerOre("TRANS-EnderQuartz", new ItemStack(
				TranscraftItems.EnderQuartz));
		OreDictionary.registerOre("TRANS-Plastic", new ItemStack(
				TranscraftItems.Plastic));
		OreDictionary.registerOre("TRANS-HardendPlastic", new ItemStack(
				TranscraftItems.HardendPlastic));
		OreDictionary.registerOre("TRANS-IronStick", new ItemStack(
				TranscraftItems.IronStick));

		OreDictionary.registerOre("TRANS-BunkerPick", new ItemStack(
				TranscraftItems.BunkerPick));
		OreDictionary.registerOre("TRANS-EnderSword", new ItemStack(
				TranscraftItems.EnderSword));
		OreDictionary.registerOre("TRANS-PlasicAxe", new ItemStack(
				TranscraftItems.PlasticAxe));
		OreDictionary.registerOre("TRANS-PlasicHoe", new ItemStack(
				TranscraftItems.PlasticHoe));
		OreDictionary.registerOre("TRANS-PlasicPickaxe", new ItemStack(
				TranscraftItems.PlasticPickaxe));
		OreDictionary.registerOre("TRANS-PlasicShovel", new ItemStack(
				TranscraftItems.PlasticShovel));
		OreDictionary.registerOre("TRANS-PlasicSword", new ItemStack(
				TranscraftItems.PlasticSword));
	}

}
