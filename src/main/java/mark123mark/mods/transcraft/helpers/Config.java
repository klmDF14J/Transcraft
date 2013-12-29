package mark123mark.mods.transcraft.helpers;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config {

	public static int TranscraftOreID = 2000;
	public static int OilOreID = 2001;

	public static int BlueLightID = 2011;
	public static int GreenLightID = 2012;
	public static int OrangeLightID = 2013;
	public static int DarkLightID = 2014;
	public static int IronTorchID = 2015;
	public static int BunkerBlockID = 2002;
	public static int ClearGlassID = 2003;
	public static int ObsidianLeverID = 2004;
	public static int BunkerStairID = 2005;
	public static int SmoothBunkerBlockID = 2006;
	public static int SmoothBunkerStairID = 2007;
	public static int DriedTransmutterID = 2008;
	public static int ThinClearGlassID = 2009;
	public static int FancyCrystalGlassID = 2010;
	public static int TransManiaOreID = 2011;

	public static int BlockEnderQuartzID = 2113;
	public static int BlockCutEnderQuartzID = 2114;
	public static int BlockEnderQuartzBrickID = 2115;
	public static int BlockEnderQuartzBigBrickID = 2116;

	// public static int DimPortalBlockID = 2200;
	// public static int DimPortalEscapeBlockID = 2201;

	public static int ComIronOreID = 2021;
	public static int ComGoldOreID = 2022;
	public static int ComTransmutterOreID = 2023;
	public static int ComOilOreID = 2024;

	 public static int ixpGrinderID =2025;

	public static int LiquidTransmutterFluidStillID = 2101;

	public static int TranscrafterID = 2112;
	public static int LTranscrafterID = 2113;

	public static int BasicTransmuterID = 5000;
	public static int QuadTransmuterID = 5001;
	public static int NanoTransmuterID = 5002;
	public static int HotdogID = 5003;
	public static int OilID = 5011;
	public static int PlasticID = 5012;
	public static int IronStickID = 5013;
	public static int HardendPlasticID = 5014;
	public static int EnderGemID = 5015;
	public static int EnderQuartzID = 5016;
	public static int DarkEndershardID = 5017;
	public static int BucketLiquidTrasnmutterID = 5018;
	public static int TranspeadiaID = 5019;

	public static int PlasticAxeID = 5031;
	public static int PlasticHoeID = 5032;
	public static int PlasticPickaxeID = 5033;
	public static int PlasticShovelID = 5034;
	public static int PlasticSwordID = 5035;
	public static int BunkerPickID = 5036;
	public static int EnderSwordID = 5037;

	public static int PlasticHelmetID = 5041;
	public static int PlasticChestID = 5042;
	public static int PlasticLegsID = 5043;
	public static int PlasticBootsID = 5044;
	public static int EnderHelmetID = 5045;
	public static int EnderChestID = 5046;
	public static int EnderLegsID = 5047;
	public static int EnderBootsID = 5048;

	public static int DimID = 234;

	public static boolean WorldGen = true;

	public static File getMinecraftDir() {
		return new File(".");
	}

	public static void init(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(
				event.getSuggestedConfigurationFile());
	}

	// config.load();

	public static void initConfig() {

		// File fileDir = new File(proxy.getMinecraftDir() +
		// "/Transcraft/config/");
		// fileDir.mkdir();
		File cfgFile = new File(
				mark123mark.mods.transcraft.TranscraftCommonProxy
						.getMinecraftDir() + "/config/Transcraft.cfg");

		try {
			cfgFile.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}

		Configuration config = new Configuration(cfgFile);
		config.load();

		// Blocks
		
		/*
		 * 
		
		
		TranscraftOreID = config.getBlock("TransmutterOre", 2000).getInt();
		OilOreID = config.getBlock("OilOre", 2001).getInt();
		BlueLightID = config.getBlock("BlueLight", 2011).getInt();
		GreenLightID = config.getBlock("GreenLight", 2012).getInt();
		OrangeLightID = config.getBlock("OrangeLight", 2013).getInt();
		DarkLightID = config.getBlock("DarkLight", 2014).getInt();
		IronTorchID = config.getBlock("IronTorch", 2015).getInt();
		ClearGlassID = config.getBlock("Crystal Glass", 2003).getInt();
		ObsidianLeverID = config.getBlock("ObsidianLever", 2004).getInt();
		BunkerBlockID = config.getBlock("BunkerBlock", 2002).getInt();
		BunkerStairID = config.getBlock("BunkerStair", 2005).getInt();
		SmoothBunkerBlockID = config.getBlock("SmoothBunkerBlock", 2006).getInt();
		SmoothBunkerStairID = config.getBlock("SmoothBunkerStair", 2007).getInt();
		DriedTransmutterID = config.getBlock("Dried Transmuter", 2008).getInt();
		ThinClearGlassID = config.getBlock("Thin Crystal Glass", 2009).getInt();
		FancyCrystalGlassID = config.getBlock("Fancy Crystal Glass", 2010).getInt();
		TransManiaOreID = config.getBlock("TransMania Ore", 2011).getInt();

		BlockEnderQuartzID = config.getBlock("Ender Quartz", 2113).getInt();
		BlockCutEnderQuartzID = config.getBlock("Cut Ender Quartz", 2114)	.getInt();
		BlockEnderQuartzBrickID = config.getBlock("Ender Quartz Brick", 2115)	.getInt();
		BlockEnderQuartzBigBrickID = config.getBlock("Big Ender Quartz Brick",	2116).getInt();

		ComIronOreID = config.getBlock("Packed Iron Ore", 2021).getInt();
		ComGoldOreID = config.getBlock("Packed Gold Ore", 2022).getInt();
		ComTransmutterOreID = config.getBlock("Packed Transmuter Ore", 2023)
				.getInt();
		ComOilOreID = config.getBlock("Packed Oil Ore", 2024).getInt();

		 ixpGrinderID = config.getBlock("iXP Grinder", 2025).getInt();

		LiquidTransmutterFluidStillID = config.getBlock(
				"LiquidTransmuterFluidStillID", 2101).getInt();

		TranscrafterID = config.getBlock("Transcrafter", 2112).getInt();
		LTranscrafterID = config.getBlock("Liquid Transcrafter", 2113).getInt();

		// DimPortalBlockID = config.getBlock("Portal Block", 2200).getInt();
		// DimPortalEscapeBlockID = config.getBlock("Portal Escape Block",
		// 2201).getInt();

		// Items
		BasicTransmuterID = config.getItem("BasicTransmuter", 5000).getInt();
		QuadTransmuterID = config.getItem("QuadTransmuter", 5001).getInt();
		NanoTransmuterID = config.getItem("NanoTransmuter", 5002).getInt();
		HotdogID = config.getItem("Hot Dog", 5003).getInt();
		OilID = config.getItem("Oil", 5011).getInt();
		PlasticID = config.getItem("Plastic", 5012).getInt();
		IronStickID = config.getItem("IronStick", 5013).getInt();
		HardendPlasticID = config.getItem("HardendPlastic", 5014).getInt();
		EnderGemID = config.getItem("EnderGem", 5015).getInt();
		EnderQuartzID = config.getItem("EnderQuartz", 5016).getInt();
		DarkEndershardID = config.getItem("DarkEndershard", 5017).getInt();
		BucketLiquidTrasnmutterID = config.getItem("BucketLiquidTrasnmutter",5018).getInt();
		TranspeadiaID = config.getItem("Transpeadia", 5019).getInt();
		
		

		PlasticAxeID = config.getItem("PlasticAxe", 5031).getInt();
		PlasticHoeID = config.getItem("PlasticHoe", 5032).getInt();
		PlasticPickaxeID = config.getItem("PlasticPickaxe", 5033).getInt();
		PlasticShovelID = config.getItem("PlasticShovel", 5034).getInt();
		PlasticSwordID = config.getItem("PlasticSword", 5035).getInt();
		BunkerPickID = config.getItem("Ender Pickaxe", 5036).getInt();
		EnderSwordID = config.getItem("Ender Sword", 5037).getInt();

		PlasticHelmetID = config.getItem("PlasticHelmet", 5041).getInt();
		PlasticChestID = config.getItem("PlasticChest", 5042).getInt();
		PlasticLegsID = config.getItem(" PlasticLegs", 5043).getInt();
		PlasticBootsID = config.getItem("PlasticBoots", 5044).getInt();
		EnderHelmetID = config.getItem("EnderHelmet", 5045).getInt();
		EnderChestID = config.getItem("EnderChest", 5046).getInt();
		EnderLegsID = config.getItem("EnderLegs", 5047).getInt();
		EnderBootsID = config.getItem("EnderBoots", 5048).getInt();

 */

		config.save();
	}
}
