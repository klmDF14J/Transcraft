package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Blocks.CutEnderQuartz;
import mark123mark.mods.transcraft.Blocks.ThinCrystalGlass;
import mark123mark.mods.transcraft.Blocks.TranscraftOre;
import mark123mark.mods.transcraft.Blocks.Quartz.EnderQuartz;
import mark123mark.mods.transcraft.Blocks.Quartz.EnderQuartzBigBrick;
import mark123mark.mods.transcraft.Blocks.Quartz.EnderQuartzBrick;
import mark123mark.mods.transcraft.Blocks.TransDim.TransManiaOre;
import mark123mark.mods.transcraft.helpers.Config;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;

public class LoadBlocks
{

	public static void LoadBlocks()
	{

		Transcraft.TranscraftOre = new TranscraftOre(Config.TranscraftOreID).setUnlocalizedName("Transcraft:TranscraftOre").setHardness(1.5F).setCreativeTab(Transcraft.TranstabBlocks).setTextureName("Transcraft:TranscraftOre");

		Transcraft.TransManiaOre = new TransManiaOre(Config.TransManiaOreID).setUnlocalizedName("Transcraft:TransManiaOre").setHardness(1.5F).setCreativeTab(Transcraft.TranstabBlocks).setTextureName("Transcraft:TransManiaOre");

		Transcraft.OilOre = new mark123mark.mods.transcraft.Blocks.OilOre(Config.OilOreID).setUnlocalizedName("Transcraft:OilOre").setHardness(1.5F).setTextureName("Transcraft:OilOre");

		Transcraft.BlueLight = new mark123mark.mods.transcraft.Blocks.Lights.BlueLight(Config.BlueLightID).setUnlocalizedName("Transcraft:BlueLight").setHardness(1.0F).setCreativeTab(Transcraft.TranstabBlocks).setLightValue(1.0F).setLightOpacity(0).setTextureName("Transcraft:BlueLight");

		Transcraft.GreenLight = new mark123mark.mods.transcraft.Blocks.Lights.GreenLight(Config.GreenLightID).setUnlocalizedName("Transcraft:GreenLight").setHardness(1.0F).setCreativeTab(Transcraft.TranstabBlocks).setLightValue(1.0F).setLightOpacity(0).setTextureName("Transcraft:GreenLight");

		Transcraft.OrangeLight = new mark123mark.mods.transcraft.Blocks.Lights.OrangeLight(Config.OrangeLightID).setUnlocalizedName("Transcraft:OrangeLight").setHardness(1.0F).setCreativeTab(Transcraft.TranstabBlocks).setLightValue(1.0F).setLightOpacity(0).setTextureName("Transcraft:OrangeLight");

		Transcraft.DarkLight = new mark123mark.mods.transcraft.Blocks.Lights.DarkLight(Config.DarkLightID).setUnlocalizedName("Transcraft:DarkLight").setHardness(1.0F).setCreativeTab(Transcraft.TranstabBlocks).setLightValue(1.0F).setLightOpacity(0).setTextureName("Transcraft:DarkLight");

		Transcraft.IronTorch = new mark123mark.mods.transcraft.Blocks.IronTorch(Config.IronTorchID).setUnlocalizedName("Transcraft:IronTorch").setHardness(1.0F).setCreativeTab(Transcraft.TranstabBlocks).setLightValue(1.0F).setLightOpacity(0).setTextureName("Transcraft:IronTorch");

		Transcraft.ClearGlass = new mark123mark.mods.transcraft.Blocks.CrystalGlass(Config.ClearGlassID).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("Transcraft:ClearGlass").setHardness(1.5F).setCreativeTab(Transcraft.TranstabBlocks).setLightValue(0.0F).setLightOpacity(0).setTextureName("Transcraft:ClearGlass");

		Transcraft.FancyCrystalGlass = new mark123mark.mods.transcraft.Blocks.FancyCrystalGlass.FancyCrystalGlass(Config.FancyCrystalGlassID, "clear", false).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("Transcraft:FancyCrystalGlass").setHardness(1.5F).setCreativeTab(Transcraft.TranstabBlocks).setLightValue(0.0F).setLightOpacity(0).setTextureName("Transcraft:FancyCrystalGlass");

		Transcraft.ThinClearGlass = new ThinCrystalGlass(Config.ThinClearGlassID).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("Transcraft:ThinClearGlass").setHardness(1.5F).setCreativeTab(Transcraft.TranstabBlocks).setLightValue(0.0F).setLightOpacity(0).setTextureName("Transcraft:ClearGlass");

		Transcraft.BunkerBlock = new mark123mark.mods.transcraft.Blocks.BunkerBlock(Config.BunkerBlockID).setUnlocalizedName("Transcraft:BunkerBlock").setHardness(10.0F).setResistance(999999999999999999999.0F).setCreativeTab(Transcraft.TranstabBlocks).setLightValue(0.0F).setLightOpacity(0).setTextureName("Transcraft:BunkerBlock");

		Transcraft.BunkerStair = (new mark123mark.mods.transcraft.Blocks.BunkerStair(Config.BunkerStairID, Transcraft.BunkerBlock, 0)).setUnlocalizedName("Transcraft:BunkerStair").setCreativeTab(Transcraft.TranstabBlocks).setHardness(10.0F).setResistance(999999999999.0F).setTextureName("Transcraft:BunkerStair");

		Transcraft.ObsidianLever = new mark123mark.mods.transcraft.Blocks.ObsidianLever(Config.ObsidianLeverID).setUnlocalizedName("Transcraft:ObsidianLever").setHardness(50.0F).setResistance(999999999999999999999.0F).setCreativeTab(Transcraft.TranstabBlocks).setTextureName("Transcraft:ObsidianLever");

		Transcraft.SmoothBunkerBlock = new mark123mark.mods.transcraft.Blocks.SmoothBunkerBlock(Config.SmoothBunkerBlockID).setUnlocalizedName("Transcraft:SmoothBunkerBlock").setHardness(10.0F).setResistance(999999999999999999999.0F).setCreativeTab(Transcraft.TranstabBlocks).setLightValue(0.0F).setLightOpacity(0).setTextureName("Transcraft:SmoothBunkerBlock");

		Transcraft.SmoothBunkerStair = (new mark123mark.mods.transcraft.Blocks.SmoothBunkerStair(Config.SmoothBunkerStairID, Transcraft.SmoothBunkerBlock, 0)).setUnlocalizedName("Transcraft:SmoothBunkerStair").setCreativeTab(Transcraft.TranstabBlocks).setHardness(10.0F).setResistance(999999999999999999999.0F).setTextureName("Transcraft:SmoothBunkerStair");

		Transcraft.DriedTransmutter = (new mark123mark.mods.transcraft.Blocks.DriedTransmutter(Config.DriedTransmutterID).setUnlocalizedName("Transcraft:DriedTransmutter").setCreativeTab(Transcraft.TranstabBlocks).setHardness(3.0F).setResistance(9.0F).setLightValue(1.0F).setTextureName("Transcraft:DriedTransmutter"));

		Transcraft.ComIronOre = new mark123mark.mods.transcraft.Blocks.ComOres.ComIronOre(Config.ComIronOreID).setUnlocalizedName("Transcraft:ComIronOre").setHardness(1.5F).setCreativeTab(Transcraft.TranstabBlocks).setTextureName("Transcraft:ComIronOre");

		Transcraft.ComGoldOre = new mark123mark.mods.transcraft.Blocks.ComOres.ComGoldOre(Config.ComGoldOreID).setUnlocalizedName("Transcraft:ComGoldOre").setHardness(1.5F).setCreativeTab(Transcraft.TranstabBlocks).setTextureName("Transcraft:ComGoldOre");

		Transcraft.ComTransmutterOre = new mark123mark.mods.transcraft.Blocks.ComOres.ComTransmutterOre(Config.ComTransmutterOreID).setUnlocalizedName("Transcraft:ComTransmutterOre").setHardness(1.5F).setCreativeTab(Transcraft.TranstabBlocks).setTextureName("Transcraft:ComTransmutterOre");

		Transcraft.ComOilOre = new mark123mark.mods.transcraft.Blocks.ComOres.ComOilOre(Config.ComOilOreID).setUnlocalizedName("Transcraft:ComOilOre").setHardness(1.5F).setCreativeTab(Transcraft.TranstabBlocks).setTextureName("Transcraft:ComOilOre");

		Transcraft.Transcrafter = new mark123mark.mods.transcraft.TileEntitys.Transcrafter.Transcrafter(Config.TranscrafterID).setCreativeTab(Transcraft.TranstabBlocks).setHardness(1.0F).setUnlocalizedName("Transcraft:Transcrafter");

		Transcraft.LTranscrafter = new mark123mark.mods.transcraft.TileEntitys.LiquidTranscrafter.LiquidTranscrafter(Config.LTranscrafterID).setCreativeTab(Transcraft.TranstabBlocks).setHardness(1.0F).setUnlocalizedName("Transcraft:LTranscrafter");

		Transcraft.enderQuartz = new EnderQuartz(Config.BlockEnderQuartzID,"EnderQuartz").setUnlocalizedName("Transcraft:enderquartz").setTextureName("Transcraft:enderquartz").setHardness(1.0F).setCreativeTab(Transcraft.TranstabBlocks);
		
		Transcraft.CutenderQuartz = new CutEnderQuartz(Config.BlockCutEnderQuartzID,"CutEnderQuartz").setUnlocalizedName("Transcraft:CutEnderQuartz").setTextureName("Transcraft:CutEnderQuartz").setHardness(1.0F).setCreativeTab(Transcraft.TranstabBlocks);

		Transcraft.EnderQuartzBrick = new EnderQuartzBrick(Config.BlockEnderQuartzBrickID,"EnderQuartzBrick").setUnlocalizedName("Transcraft:EnderQuartzBricks").setTextureName("Transcraft:EnderQuartzBricks").setHardness(1.0F).setCreativeTab(Transcraft.TranstabBlocks);
		
		Transcraft.EnderQuartzBigBrick = new EnderQuartzBigBrick(Config.BlockEnderQuartzBigBrickID,"EnderQuartzBrick2").setUnlocalizedName("Transcraft:EnderQuartzBigBricks").setTextureName("Transcraft:EnderQuartzBigBricks").setHardness(1.0F).setCreativeTab(Transcraft.TranstabBlocks);
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
		 * 
		 * 
		 * Transcraft.ixpGrinder = (new ixpGrinder(Config.ixpGrinderID))
		 * .setUnlocalizedName("Transcraft:ixpGrinder").setHardness(1.0F)
		 * .setTextureName("Transcraft:ixpGrinder")
		 * .setCreativeTab(Transcraft.TranstabBlocks);
		 */
	}
}
