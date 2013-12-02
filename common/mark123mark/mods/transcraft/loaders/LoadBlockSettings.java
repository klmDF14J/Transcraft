package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;

public class LoadBlockSettings
{

	public static void LoadSet()
	{
		Block.torchWood.setLightValue(0.8F);
		Block.whiteStone.setHardness(0.5F);

		MinecraftForge.setBlockHarvestLevel(Transcraft.OilOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(Transcraft.TranscraftOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(Transcraft.BunkerBlock, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(Transcraft.SmoothBunkerBlock, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(Transcraft.BunkerStair, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(Transcraft.SmoothBunkerStair, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(Transcraft.ObsidianLever, "pickaxe", 4);

	}

}
