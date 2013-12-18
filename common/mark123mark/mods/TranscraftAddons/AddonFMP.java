package mark123mark.mods.TranscraftAddons;

import net.minecraft.item.ItemStack;
import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Blocks.Quartz.EnderQuartz;
import codechicken.microblock.BlockMicroMaterial;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class AddonFMP {

	public static void registerBlocks()
	{
		BlockMicroMaterial.createAndRegister(Transcraft.TranscraftOre);
		BlockMicroMaterial.createAndRegister(Transcraft.OilOre);
		BlockMicroMaterial.createAndRegister(Transcraft.BlueLight);
		BlockMicroMaterial.createAndRegister(Transcraft.GreenLight);
		BlockMicroMaterial.createAndRegister(Transcraft.OrangeLight);
		BlockMicroMaterial.createAndRegister(Transcraft.DarkLight);
		BlockMicroMaterial.createAndRegister(Transcraft.ClearGlass);
		BlockMicroMaterial.createAndRegister(Transcraft.FancyCrystalGlass);
		BlockMicroMaterial.createAndRegister(Transcraft.BunkerBlock);
		BlockMicroMaterial.createAndRegister(Transcraft.SmoothBunkerBlock);
		BlockMicroMaterial.createAndRegister(Transcraft.ComIronOre);
		BlockMicroMaterial.createAndRegister(Transcraft.ComGoldOre);
		BlockMicroMaterial.createAndRegister(Transcraft.ComTransmutterOre);
		BlockMicroMaterial.createAndRegister(Transcraft.DriedTransmutter);
		BlockMicroMaterial.createAndRegister(Transcraft.TransManiaOre);

		/*
		 * 
		
		
		for(int i = 15; i >= 0; i--)
		{
			BlockMicroMaterial.createAndRegister(Transcraft.enderQuartzBlock, i);
		}

		for(int i = 15; i >= 0; i--)
		{
			BlockMicroMaterial.createAndRegister(Transcraft.CutenderQuartz ,i);
		}

		for(int i = 15; i >= 0; i--)
		{
			BlockMicroMaterial.createAndRegister(Transcraft.EnderQuartzBrick, i);
		}

		for(int i = 15; i >= 0; i--)
		{
			BlockMicroMaterial.createAndRegister(Transcraft.EnderQuartzBigBrick, i);
		}
 */
	
	}
	
}
