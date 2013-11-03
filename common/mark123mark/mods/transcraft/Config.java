package mark123mark.mods.transcraft;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import java.io.File;
import java.io.IOException;
import java.io.File;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

import net.minecraftforge.common.Configuration;

import mark123mark.mods.transcraft.*;

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
	
	public static int BlockEnderQuartzID = 2113;
	public static int BlockChiselEnderQuartzID = 2114;
	
	public static int BlueBlockEnderQuartzID = 2115;
	public static int BlueBlockChiselEnderQuartzID = 2116;
	
	public static int RedBlockEnderQuartzID = 2117;
	public static int RedBlockChiselEnderQuartzID = 2118;
	
	
	
	public static int StairBlockEnderQuartzID = 2119;
	public static int StairBlockChiselEnderQuartzID = 2120;
	
	public static int StairBlueBlockEnderQuartzID = 2121;
	public static int StairBlueBlockChiselEnderQuartzID = 2122;
	
	public static int StairRedBlockEnderQuartzID = 2123;
	public static int StairRedBlockChiselEnderQuartzID = 2124;
	
	public static int DimPortalBlockID = 2200;
	public static int TransDimGrassID = 191;
	
	
	
	public static int ComIronOreID = 2021;
	public static int ComGoldOreID = 2022;
	public static int ComTransmutterOreID = 2023;
	public static int ComOilOreID = 2024;

	public static int  LiquidTransmutterFluidStillID = 2101;

	public static int  TranscrafterID = 2112;
	
	public static int BasicTransmuterID = 5000;
	public static int QuadTransmuterID = 5001;
	public static int NanoTransmuterID = 5002;
	public static int HotdogID = 5003;
	public static int OilID = 5011;
	public static int PlasticID = 5012;
	public static int IronStickID = 5013;
	public static int HardendPlasticID = 5014;
	public static int EnderGemID = 5016;
	public static int EnderQuartzID = 5017;
	public static int DarkEndershardID = 5018;
	public static int transmutationTabletID = 5049;
	
	
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
	
	
	public static File getMinecraftDir() 
	{
		return new File(".");
	}
	
	
	public static void init(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	}
		
        //config.load();
	
	public static void initConfig()
	{
		
		
		//File fileDir = new File(proxy.getMinecraftDir() + "/Transcraft/config/");
    	//fileDir.mkdir();
    	File cfgFile = new File(mark123mark.mods.transcraft.TranscraftCommonProxy.getMinecraftDir() + "/config/Transcraft.cfg");
    	
        try
        {
            cfgFile.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }
        
		Configuration config = new Configuration(cfgFile);
		config.load();
	
      //Blocks
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
       
       BlockEnderQuartzID = config.getBlock("Ender Quartz", 2113).getInt();
       BlockChiselEnderQuartzID = config.getBlock("Chisel Ender Quartz", 2114).getInt();
       
       BlueBlockEnderQuartzID = config.getBlock("Blue Ender Quartz", 2115).getInt();
       BlueBlockChiselEnderQuartzID = config.getBlock("Blue Chisel Ender Quartz", 2116).getInt();
       
       RedBlockEnderQuartzID = config.getBlock("Red Ender Quartz", 2117).getInt();
       RedBlockChiselEnderQuartzID = config.getBlock("Red Chisel Ender Quartz", 2118).getInt();
       
       
       
       StairBlockEnderQuartzID = config.getBlock("Stair Ender Quartz", 2119).getInt();
       StairBlockChiselEnderQuartzID = config.getBlock("Stair Chisel Ender Quartz", 2120).getInt();
       
       StairBlueBlockEnderQuartzID = config.getBlock("Stair Blue Ender Quartz", 2121).getInt();
       StairBlueBlockChiselEnderQuartzID = config.getBlock("Stair Blue Chisel Ender Quartz", 2122).getInt();
       
       StairRedBlockEnderQuartzID = config.getBlock("Stair Red Ender Quartz", 2123).getInt();
       StairRedBlockChiselEnderQuartzID = config.getBlock("Stair Red Chisel Ender Quartz", 2124).getInt();
     
       
       
       ComIronOreID = config.getBlock("Packed Iron Ore", 2021).getInt();
       ComGoldOreID = config.getBlock("Packed Gold Ore", 2022).getInt();
       ComTransmutterOreID = config.getBlock("Packed Transmuter Ore", 2023).getInt();
       ComOilOreID = config.getBlock("Packed Oil Ore", 2024).getInt();

       LiquidTransmutterFluidStillID = config.getBlock("LiquidTransmuterFluidStillID", 2101).getInt();
 
       
       TranscrafterID = config.getBlock("Transcrafter", 2112).getInt();
      
       DimPortalBlockID = config.getBlock("Portal Block", 2200).getInt();
       
       
       
       
       TransDimGrassID = config.getBlock("Transmania grass   256 or less", 250).getInt();
       
       
       
       
        //Items
        BasicTransmuterID = config.getItem("BasicTransmuter", 5000).getInt();
        QuadTransmuterID = config.getItem("QuadTransmuter", 5001).getInt();
        NanoTransmuterID = config.getItem("NanoTransmuter", 5002).getInt();
        HotdogID = config.getItem("Hot Dog", 5003).getInt();
        OilID = config.getItem("Oil", 5011).getInt();
        PlasticID = config.getItem("Plastic", 5012).getInt();
        IronStickID = config.getItem("IronStick", 5013).getInt();
        HardendPlasticID = config.getItem("HardendPlastic", 5014).getInt();
        EnderGemID = config.getItem("EnderGem", 5016).getInt();
        EnderQuartzID = config.getItem("EnderQuartz", 5017).getInt();
        DarkEndershardID = config.getItem("DarkEndershard", 5018).getInt();
        
       
        
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
        
        config.save();
	}
}
