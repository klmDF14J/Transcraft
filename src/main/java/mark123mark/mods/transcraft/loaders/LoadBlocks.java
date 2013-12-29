package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Blocks.ThinCrystalGlass;
import mark123mark.mods.transcraft.Blocks.TranscraftOre;
import mark123mark.mods.transcraft.Blocks.Quartz.CutEnderQuartz;
import mark123mark.mods.transcraft.Blocks.Quartz.EnderQuartz;
import mark123mark.mods.transcraft.Blocks.Quartz.EnderQuartzBigBrick;
import mark123mark.mods.transcraft.Blocks.Quartz.EnderQuartzBrick;
import mark123mark.mods.transcraft.Blocks.TransDim.TransManiaOre;
import mark123mark.mods.transcraft.helpers.Config;
import mark123mark.mods.transcraft.ixp.Tiles.IXPGrinderMk2;
import net.minecraft.block.Block;

public class LoadBlocks {

	public static void LoadBlocks() {

		Transcraft.TranscraftOre = new TranscraftOre(Config.TranscraftOreID).func_149663_c("Transcraft:TranscraftOre").func_149711_c(1.5F).func_149647_a(Transcraft.TranstabBlocks).func_149658_d("Transcraft:TranscraftOre");

		Transcraft.TransManiaOre = new TransManiaOre(Config.TransManiaOreID)
				.func_149663_c("Transcraft:TransManiaOre")
				.func_149711_c(1.5F).func_149647_a(Transcraft.TranstabBlocks)
				.func_149658_d("Transcraft:TransManiaOre");

		Transcraft.OilOre = new mark123mark.mods.transcraft.Blocks.OilOre(
				Config.OilOreID).func_149663_c("Transcraft:OilOre")
				.func_149711_c(1.5F).func_149658_d("Transcraft:OilOre");

		Transcraft.BlueLight = new mark123mark.mods.transcraft.Blocks.Lights.BlueLight(
				Config.BlueLightID).func_149663_c("Transcraft:BlueLight")
				.func_149711_c(1.0F).func_149647_a(Transcraft.TranstabBlocks)
				.func_149715_a(1.0F).func_149713_g(0)
				.func_149658_d("Transcraft:BlueLight");

		Transcraft.GreenLight = new mark123mark.mods.transcraft.Blocks.Lights.GreenLight(
				Config.GreenLightID)
				.func_149663_c("Transcraft:GreenLight").func_149711_c(1.0F)
				.func_149647_a(Transcraft.TranstabBlocks).func_149715_a(1.0F)
				.func_149713_g(0).func_149658_d("Transcraft:GreenLight");

		Transcraft.OrangeLight = new mark123mark.mods.transcraft.Blocks.Lights.OrangeLight(
				Config.OrangeLightID)
				.func_149663_c("Transcraft:OrangeLight").func_149711_c(1.0F)
				.func_149647_a(Transcraft.TranstabBlocks).func_149715_a(1.0F)
				.func_149713_g(0).func_149658_d("Transcraft:OrangeLight");

		Transcraft.DarkLight = new mark123mark.mods.transcraft.Blocks.Lights.DarkLight(
				Config.DarkLightID).func_149663_c("Transcraft:DarkLight")
				.func_149711_c(1.0F).func_149647_a(Transcraft.TranstabBlocks)
				.func_149715_a(1.0F).func_149713_g(0)
				.func_149658_d("Transcraft:DarkLight");

		Transcraft.IronTorch = new mark123mark.mods.transcraft.Blocks.IronTorch(
				Config.IronTorchID).func_149663_c("Transcraft:IronTorch")
				.func_149711_c(1.0F).func_149647_a(Transcraft.TranstabBlocks)
				.func_149715_a(1.0F).func_149713_g(0)
				.func_149658_d("Transcraft:IronTorch");

		Transcraft.ClearGlass = new mark123mark.mods.transcraft.Blocks.CrystalGlass(
				Config.ClearGlassID)
				.func_149663_c("Transcraft:ClearGlass").func_149711_c(1.5F)
				.func_149647_a(Transcraft.TranstabBlocks)
				.func_149713_g(0).func_149658_d("Transcraft:ClearGlass");

		Transcraft.FancyCrystalGlass = new mark123mark.mods.transcraft.Blocks.FancyCrystalGlass.FancyCrystalGlass(
				Config.FancyCrystalGlassID, "clear", false)
				.func_149663_c("Transcraft:FancyCrystalGlass")
				.func_149711_c(1.5F).func_149647_a(Transcraft.TranstabDecBlocks)
				.func_149713_g(0)
				.func_149658_d("Transcraft:FancyCrystalGlass");

		Transcraft.ThinClearGlass = new ThinCrystalGlass(
				Config.ThinClearGlassID)
				.func_149663_c("Transcraft:ThinClearGlass")
				.func_149711_c(1.5F).func_149647_a(Transcraft.TranstabBlocks)
				.func_149713_g(0)
				.func_149658_d("Transcraft:ClearGlass");

		Transcraft.BunkerBlock = new mark123mark.mods.transcraft.Blocks.BunkerBlock(
				Config.BunkerBlockID)
				.func_149663_c("Transcraft:BunkerBlock")
				.func_149711_c(10.0F).func_149752_b(999999999999999999999.0F)
				.func_149647_a(Transcraft.TranstabBlocks)
				.func_149713_g(0).func_149658_d("Transcraft:BunkerBlock");

		Transcraft.BunkerStair = (new mark123mark.mods.transcraft.Blocks.BunkerStair(
				Config.BunkerStairID, Transcraft.BunkerBlock, 0))
				.func_149663_c("Transcraft:BunkerStair")
				.func_149647_a(Transcraft.TranstabBlocks).func_149711_c(10.0F)
				.func_149752_b(999999999999.0F)
				.func_149658_d("Transcraft:BunkerStair");

		Transcraft.ObsidianLever = new mark123mark.mods.transcraft.Blocks.ObsidianLever(
				Config.ObsidianLeverID)
				.func_149663_c("Transcraft:ObsidianLever")
				.func_149711_c(50.0F).func_149752_b(999999999999999999999.0F)
				.func_149647_a(Transcraft.TranstabBlocks)
				.func_149658_d("Transcraft:ObsidianLever");

		Transcraft.SmoothBunkerBlock = new mark123mark.mods.transcraft.Blocks.SmoothBunkerBlock(
				Config.SmoothBunkerBlockID)
				.func_149663_c("Transcraft:SmoothBunkerBlock")
				.func_149711_c(10.0F).func_149752_b(999999999999999999999.0F)
				.func_149647_a(Transcraft.TranstabBlocks)
				.func_149713_g(0)
				.func_149658_d("Transcraft:SmoothBunkerBlock");

		Transcraft.SmoothBunkerStair = (new mark123mark.mods.transcraft.Blocks.SmoothBunkerStair(
				Config.SmoothBunkerStairID, Transcraft.SmoothBunkerBlock, 0))
				.func_149663_c("Transcraft:SmoothBunkerStair")
				.func_149647_a(Transcraft.TranstabBlocks).func_149711_c(10.0F)
				.func_149752_b(999999999999999999999.0F)
				.func_149658_d("Transcraft:SmoothBunkerStair");

		Transcraft.DriedTransmutter = (new mark123mark.mods.transcraft.Blocks.DriedTransmutter(
				Config.DriedTransmutterID)
				.func_149663_c("Transcraft:DriedTransmutter")
				.func_149647_a(Transcraft.TranstabBlocks).func_149711_c(3.0F)
				.func_149752_b(9.0F).func_149715_a(1.0F)
				.func_149658_d("Transcraft:DriedTransmutter"));

		Transcraft.ComIronOre = new mark123mark.mods.transcraft.Blocks.ComOres.ComIronOre(
				Config.ComIronOreID)
				.func_149663_c("Transcraft:ComIronOre").func_149711_c(1.5F)
				.func_149647_a(Transcraft.TranstabBlocks)
				.func_149658_d("Transcraft:ComIronOre");

		Transcraft.ComGoldOre = new mark123mark.mods.transcraft.Blocks.ComOres.ComGoldOre(
				Config.ComGoldOreID)
				.func_149663_c("Transcraft:ComGoldOre").func_149711_c(1.5F)
				.func_149647_a(Transcraft.TranstabBlocks)
				.func_149658_d("Transcraft:ComGoldOre");

		Transcraft.ComTransmutterOre = new mark123mark.mods.transcraft.Blocks.ComOres.ComTransmutterOre(
				Config.ComTransmutterOreID)
				.func_149663_c("Transcraft:ComTransmutterOre")
				.func_149711_c(1.5F).func_149647_a(Transcraft.TranstabBlocks)
				.func_149658_d("Transcraft:ComTransmutterOre");

		Transcraft.ComOilOre = new mark123mark.mods.transcraft.Blocks.ComOres.ComOilOre(
				Config.ComOilOreID).func_149663_c("Transcraft:ComOilOre")
				.func_149711_c(1.5F).func_149647_a(Transcraft.TranstabBlocks)
				.func_149658_d("Transcraft:ComOilOre");

		Transcraft.Transcrafter = new mark123mark.mods.transcraft.TileEntitys.Transcrafter.Transcrafter(
				Config.TranscrafterID)
				.func_149647_a(Transcraft.TranstabBlocks).func_149711_c(1.0F)
				.func_149663_c("Transcraft:Transcrafter");

		Transcraft.enderQuartzBlock = new EnderQuartz(Config.BlockEnderQuartzID)
				.func_149663_c("Transcraft:enderquartz")
				.func_149658_d("Transcraft:enderquartz").func_149711_c(1.0F)
				.func_149647_a(Transcraft.TranstabDecBlocks);

		Transcraft.CutenderQuartz = new CutEnderQuartz(
				Config.BlockCutEnderQuartzID)
				.func_149663_c("Transcraft:CutEnderQuartz")
				.func_149658_d("Transcraft:CutEnderQuartz").func_149711_c(1.0F)
				.func_149647_a(Transcraft.TranstabDecBlocks);

		Transcraft.EnderQuartzBrick = new EnderQuartzBrick(
				Config.BlockEnderQuartzBrickID)
				.func_149663_c("Transcraft:EnderQuartzBrick")
				.func_149658_d("Transcraft:EnderQuartzBrick")
				.func_149711_c(1.0F).func_149647_a(Transcraft.TranstabDecBlocks);

		Transcraft.EnderQuartzBigBrick = new EnderQuartzBigBrick(
				Config.BlockEnderQuartzBigBrickID)
				.func_149663_c("Transcraft:EnderQuartzBigBricks")
				.func_149658_d("Transcraft:EnderQuartzBrick2")
				.func_149711_c(1.0F).func_149647_a(Transcraft.TranstabDecBlocks);
		
	
		 
		Transcraft.ixpGrinder = new IXPGrinderMk2(Config.ixpGrinderID, 0).func_149663_c("Transcraft:ixpGrinder").func_149711_c(1.0F)
				  .func_149658_d("Transcraft:ixpGrinder")
					 .func_149647_a(Transcraft.TranstabBlocks);
		
	
		
		
		
		/*
		 * 
		 * Transcraft.DimPortalBlock = (new
		 * DimPortalBlock(Config.DimPortalBlockID))
		 * .setUnlocalizedName("Transcraft:DimPortalBlock").setHardness(1.0F)
		 * .setTextureName("Transcraft:Portal")
		 * .setCreativeTab(Transcraft.TranstabBlocks);
		 * 
		 * 
		 * 
		 * 
		 * Transcraft.DimPortalEscapeBlock = (new
		 * EscapePortalBlock(Config.DimPortalEscapeBlockID))
		 * .setUnlocalizedName(
		 * "Transcraft:DimPortalEscapeBlock").setHardness(1.0F)
		 * .setTextureName("Transcraft:EscapePortal")
		 * .setCreativeTab(Transcraft.TranstabBlocks).setBlockUnbreakable();
		*/
		  
		 
	}
}
