package mark123mark.mods.transcraft;

import mark123mark.mods.transcraft.Blocks.GalssStair;
import mark123mark.mods.transcraft.Blocks.ThinCrystalGlass;
import mark123mark.mods.transcraft.Blocks.TranscraftOre;
import mark123mark.mods.transcraft.Entitys.mob.NukeCreeper;
import mark123mark.mods.transcraft.Items.BasicTransmuter;
import mark123mark.mods.transcraft.Items.TransTab.ItemTransTab;
import mark123mark.mods.transcraft.TileEntitys.Transcrafter.GuiHanderTC;
import mark123mark.mods.transcraft.TileEntitys.Transcrafter.TileTC;
import mark123mark.mods.transcraft.armor.ArmorEnderBoots;
import mark123mark.mods.transcraft.armor.ArmorEnderChest;
import mark123mark.mods.transcraft.armor.ArmorEnderHelmet;
import mark123mark.mods.transcraft.armor.ArmorEnderLegs;
import mark123mark.mods.transcraft.armor.ArmorPlasticBoots;
import mark123mark.mods.transcraft.armor.ArmorPlasticChestplate;
import mark123mark.mods.transcraft.armor.ArmorPlasticHelmet;
import mark123mark.mods.transcraft.armor.ArmorPlasticLegs;
import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "transcraft", name = "Transcraft", version = Transcraft.VERSION + Transcraft.STATE)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = "transcraft", packetHandler = PacketHandlerTranscraft.class)

public class Transcraft {
	public static final String VERSION = "1.6.4_V1.0.0_";
	public static final String STATE = "ReleaseCandidate_1";
	public static boolean SHOWDEVMESSGAE = false;
	public static boolean TransmatterFurnace = true;

	
	// Listblocks here
	public static Block TranscraftOre;
	public static Block OilOre;
	public static Block BlueLight;
	public static Block GreenLight;
	public static Block OrangeLight;
	public static Block DarkLight;
	public static Block IronTorch;
	public static Block ClearGlass;
	public static Block ThinClearGlass;
	public static Block FancyCrystalGlass;
	public static Block BunkerBlock;
	public static Block BunkerStair;
	public static Block SmoothBunkerBlock;
	public static Block SmoothBunkerStair;
	public static Block ObsidianLever;
	public static Block ComIronOre;
	public static Block ComGoldOre;
	public static Block ComTransmutterOre;
	public static Block ComOilOre;
	public static Block DriedTransmutter;

	public static Block Transcrafter;
	
	public static Block enderQuartz;
	public static Block chiselEnderQuartz;
	public static Block BlueenderQuartz;
	public static Block BluechiselEnderQuartz;
	public static Block RedenderQuartz;
	public static Block RedchiselEnderQuartz;
	
	public static Block StairenderQuartz;
	public static Block StairchiselEnderQuartz;
	public static Block StairBlueenderQuartz;
	public static Block StairBluechiselEnderQuartz;
	public static Block StairRedenderQuartz;
	public static Block StairRedchiselEnderQuartz;
	
	
	public static Item BasicTransmuter;
	public static Item QuadTransmuter;
	public static Item NanoTransmuter;
	public static Item HotDog;
	public static Item Oil;
	public static Item Plastic;
	public static Item IronStick;
	public static Item HardendPlastic;
	public static Item IronTorchThrower;
	public static Item EnderGem;
	public static Item EnderQuartz;
	public static Item DarkEndershard;

	public static Item PlasticAxe;
	public static Item PlasticHoe;
	public static Item PlasticPickaxe;
	public static Item PlasticShovel;
	public static Item PlasticSword;
	public static Item BunkerPick;
	public static Item EnderSword;

	public static Item PlasticHelmet;
	public static Item PlasticChest;
	public static Item PlasticLegs;
	public static Item PlasticBoots;
	public static Item EnderHelmet;
	public static Item EnderChest;
	public static Item EnderLegs;
	public static Item EnderBoots;

	public static Item transmutationTablet;
	
	public static int TrancraftOreID;
	public static int OilOreID;
	public static int BlueLighID;
	public static int GreenLightID;
	public static int OrangeLightID;
	public static int DarkLightID;
	public static int ClearGlassID;
	public static int BunkerBlockID;
	public static int enderQuartzID;
	public static int chiselEnderQuartzID;

	public static final StepSound soundPowderFootstep = new StepSound("stone",
			1.0F, 1.0F);
	public static final StepSound soundWoodFootstep = new StepSound("wood",
			1.0F, 1.0F);
	public static final StepSound soundGravelFootstep = new StepSound("gravel",
			1.0F, 1.0F);
	public static final StepSound soundGrassFootstep = new StepSound("grass",
			1.0F, 1.0F);
	public static final StepSound soundStoneFootstep = new StepSound("stone",
			1.0F, 1.0F);
	public static final StepSound soundMetalFootstep = new StepSound("stone",
			1.0F, 1.5F);
	public static final StepSound soundGlassFootstep = new StepSound("stone",
			1.0F, 1.0F);
	public static final StepSound soundClothFootstep = new StepSound("cloth",
			1.0F, 1.0F);
	public static final StepSound soundSandFootstep = new StepSound("sand",
			1.0F, 1.0F);
	public static final StepSound soundSnowFootstep = new StepSound("snow",
			1.0F, 1.0F);
	
	
	static EnumToolMaterial PlasticTool = EnumHelper.addToolMaterial(
			"PlasticTool", 2, 750, 5.0F, 2, 0);
	static EnumToolMaterial BunkerToolEnum = EnumHelper.addToolMaterial(
			"BunkerToolEnum", 4, 1000, 20.0F, 4, 0);
	static EnumToolMaterial EnderToolEnum = EnumHelper.addToolMaterial(
			"EnderToolEnum", 400, 10000, 80.0F, 46, 100);

	@Instance("transcraft")
	public static Transcraft instance;

	
	public static Block TransmatterFurnaceIdle;
	public static Block TransmatterFurnaceBurning;



	@SidedProxy(clientSide = "mark123mark.mods.transcraft.TranscraftClientProxy", serverSide = "mark123mark.mods.transcraft.TranscraftCommonProxy")
	public static TranscraftCommonProxy Coproxy;
	public static TranscraftClientProxy Clproxy;

	private String field_111218_cA;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		FMLLog.info("[TRANSCRAFT]	Starting Transcraft verison "
				+ Transcraft.VERSION);


		Coproxy.registerHandlers();
		Coproxy.registerTickHandlers();

		FMLLog.info("[TRANSCRAFT]	Loading Config");
		Config.initConfig();

		FMLLog.info("[TRANSCRAFT]	Loading Blocks");
		TranscraftOre = new TranscraftOre(Config.TranscraftOreID)
				.setUnlocalizedName("Transcraft:TranscraftOre")
				.setHardness(1.5F).setCreativeTab(TranstabBlocks)
				.setTextureName("Transcraft:TranscraftOre");
		OilOre = new mark123mark.mods.transcraft.Blocks.OilOre(Config.OilOreID)
				.setUnlocalizedName("Transcraft:OilOre").setHardness(1.5F)
				.setTextureName("Transcraft:OilOre");
		BlueLight = new mark123mark.mods.transcraft.Blocks.Lights.BlueLight(
				Config.BlueLightID).setUnlocalizedName("Transcraft:BlueLight")
				.setHardness(1.0F).setCreativeTab(TranstabBlocks)
				.setLightValue(1.0F).setLightOpacity(0)
				.setTextureName("Transcraft:BlueLight");
		;
		GreenLight = new mark123mark.mods.transcraft.Blocks.Lights.GreenLight(
				Config.GreenLightID)
				.setUnlocalizedName("Transcraft:GreenLight").setHardness(1.0F)
				.setCreativeTab(TranstabBlocks).setLightValue(1.0F)
				.setLightOpacity(0).setTextureName("Transcraft:GreenLight");
		;
		OrangeLight = new mark123mark.mods.transcraft.Blocks.Lights.OrangeLight(
				Config.OrangeLightID)
				.setUnlocalizedName("Transcraft:OrangeLight").setHardness(1.0F)
				.setCreativeTab(TranstabBlocks).setLightValue(1.0F)
				.setLightOpacity(0).setTextureName("Transcraft:OrangeLight");
		;
		DarkLight = new mark123mark.mods.transcraft.Blocks.Lights.DarkLight(
				Config.DarkLightID).setUnlocalizedName("Transcraft:DarkLight")
				.setHardness(1.0F).setCreativeTab(TranstabBlocks)
				.setLightValue(1.0F).setLightOpacity(0)
				.setTextureName("Transcraft:DarkLight");
		;
		IronTorch = new mark123mark.mods.transcraft.Blocks.IronTorch(
				Config.IronTorchID).setUnlocalizedName("Transcraft:IronTorch")
				.setHardness(1.0F).setCreativeTab(TranstabBlocks)
				.setLightValue(1.0F).setLightOpacity(0)
				.setTextureName("Transcraft:IronTorch");
		;
		ClearGlass = new mark123mark.mods.transcraft.Blocks.ClearGlass(
				Config.ClearGlassID).setStepSound(soundGlassFootstep)
				.setUnlocalizedName("Transcraft:ClearGlass").setHardness(1.5F)
				.setCreativeTab(TranstabBlocks).setLightValue(0.0F)
				.setLightOpacity(0).setTextureName("Transcraft:ClearGlass");
		;
		FancyCrystalGlass = new mark123mark.mods.transcraft.Blocks.FancyCrystalGlass.FancyCrystalGlass(
				Config.FancyCrystalGlassID, "clear", false)
				.setStepSound(soundGlassFootstep)
				.setUnlocalizedName("Transcraft:FancyCrystalGlass")
				.setHardness(1.5F).setCreativeTab(TranstabBlocks)
				.setLightValue(0.0F).setLightOpacity(0)
				.setTextureName("Transcraft:FancyCrystalGlass");
		;
		ThinClearGlass = new ThinCrystalGlass(Config.ThinClearGlassID)
				.setStepSound(soundGlassFootstep)
				.setUnlocalizedName("Transcraft:ThinClearGlass")
				.setHardness(1.5F).setCreativeTab(TranstabBlocks)
				.setLightValue(0.0F).setLightOpacity(0)
				.setTextureName("Transcraft:ClearGlass");
		;
		BunkerBlock = new mark123mark.mods.transcraft.Blocks.BunkerBlock(
				Config.BunkerBlockID)
				.setUnlocalizedName("Transcraft:BunkerBlock")
				.setHardness(10.0F).setResistance(999999999999999999999.0F)
				.setCreativeTab(TranstabBlocks).setLightValue(0.0F)
				.setLightOpacity(0).setTextureName("Transcraft:BunkerBlock");
		;
		BunkerStair = (new mark123mark.mods.transcraft.Blocks.BunkerStair(
				Config.BunkerStairID, BunkerBlock, 0))
				.setUnlocalizedName("Transcraft:BunkerStair")
				.setCreativeTab(TranstabBlocks).setHardness(10.0F)
				.setResistance(999999999999.0F)
				.setTextureName("Transcraft:BunkerStair");
		;
		ObsidianLever = new mark123mark.mods.transcraft.Blocks.ObsidianLever(
				Config.ObsidianLeverID)
				.setUnlocalizedName("Transcraft:ObsidianLever")
				.setHardness(50.0F).setResistance(999999999999999999999.0F)
				.setCreativeTab(TranstabBlocks)
				.setTextureName("Transcraft:ObsidianLever");
		;
		SmoothBunkerBlock = new mark123mark.mods.transcraft.Blocks.SmoothBunkerBlock(
				Config.SmoothBunkerBlockID)
				.setUnlocalizedName("Transcraft:SmoothBunkerBlock")
				.setHardness(10.0F).setResistance(999999999999999999999.0F)
				.setCreativeTab(TranstabBlocks).setLightValue(0.0F)
				.setLightOpacity(0)
				.setTextureName("Transcraft:SmoothBunkerBlock");
		;
		SmoothBunkerStair = (new mark123mark.mods.transcraft.Blocks.SmoothBunkerStair(
				Config.SmoothBunkerStairID, SmoothBunkerBlock, 0))
				.setUnlocalizedName("Transcraft:SmoothBunkerStair")
				.setCreativeTab(TranstabBlocks).setHardness(10.0F)
				.setResistance(999999999999999999999.0F)
				.setTextureName("Transcraft:SmoothBunkerStair");
		;
		DriedTransmutter = (new mark123mark.mods.transcraft.Blocks.DriedTransmutter(
				Config.DriedTransmutterID)
				.setUnlocalizedName("Transcraft:DriedTransmutter")
				.setCreativeTab(TranstabBlocks).setHardness(3.0F)
				.setResistance(9.0F).setLightValue(1.0F)
				.setTextureName("Transcraft:DriedTransmutter"));

		ComIronOre = new mark123mark.mods.transcraft.Blocks.ComOres.ComIronOre(
				Config.ComIronOreID)
				.setUnlocalizedName("Transcraft:ComIronOre").setHardness(1.5F)
				.setCreativeTab(TranstabBlocks)
				.setTextureName("Transcraft:ComIronOre");
		;
		ComGoldOre = new mark123mark.mods.transcraft.Blocks.ComOres.ComGoldOre(
				Config.ComGoldOreID)
				.setUnlocalizedName("Transcraft:ComGoldOre").setHardness(1.5F)
				.setCreativeTab(TranstabBlocks)
				.setTextureName("Transcraft:ComGoldOre");
		;
		ComTransmutterOre = new mark123mark.mods.transcraft.Blocks.ComOres.ComTransmutterOre(
				Config.ComTransmutterOreID)
				.setUnlocalizedName("Transcraft:ComTransmutterOre")
				.setHardness(1.5F).setCreativeTab(TranstabBlocks)
				.setTextureName("Transcraft:ComTransmutterOre");
		;
		ComOilOre = new mark123mark.mods.transcraft.Blocks.ComOres.ComOilOre(
				Config.ComOilOreID).setUnlocalizedName("Transcraft:ComOilOre")
				.setHardness(1.5F).setCreativeTab(TranstabBlocks)
				.setTextureName("Transcraft:ComOilOre");
		;

	
		Transcrafter = new mark123mark.mods.transcraft.TileEntitys.Transcrafter.Transcrafter(
				Config.TranscrafterID).setCreativeTab(TranstabBlocks).setHardness(1.0F)
				.setUnlocalizedName("Transcraft:Transcrafter");
		GameRegistry.registerBlock(Transcrafter, "Transcrafter");
		LanguageRegistry.addName(Transcrafter, "Transcrafter");
		GameRegistry.registerTileEntity(TileTC.class, "TileEntityTC");

		enderQuartz = new mark123mark.mods.transcraft.Blocks.EnderQuartz(
				Config.BlockEnderQuartzID)
		.setUnlocalizedName("Transcraft:enderquartz")
		.setTextureName("Transcraft:enderquartz").setHardness(1.0F)
		.setCreativeTab(TranstabBlocks);
		GameRegistry.registerBlock(enderQuartz, "EnderQuartz");
		LanguageRegistry.addName(enderQuartz, "Ender Quartz Block");
		
		chiselEnderQuartz = new mark123mark.mods.transcraft.Blocks.EnderQuartz(
				Config.BlockChiselEnderQuartzID)
		.setUnlocalizedName("Transcraft:chiselenderquartz").setHardness(1.0F)
		.setTextureName("Transcraft:chiselenderquartz")
		.setCreativeTab(TranstabBlocks);
		GameRegistry.registerBlock(chiselEnderQuartz, "ChiselEnderQuartz");
		LanguageRegistry.addName(chiselEnderQuartz, "Chiseled Ender Quartz Block");
		
	BlueenderQuartz = new mark123mark.mods.transcraft.Blocks.EnderQuartz(
				Config.BlueBlockEnderQuartzID)
		.setUnlocalizedName("Transcraft:Blueenderquartz").setHardness(1.0F)
		.setTextureName("Transcraft:Blueenderquartz")
		.setCreativeTab(TranstabBlocks);
		GameRegistry.registerBlock(BlueenderQuartz, "BlueEnderQuartz");
		LanguageRegistry.addName(BlueenderQuartz, "Blue Ender Quartz Block");
		
		BluechiselEnderQuartz = new mark123mark.mods.transcraft.Blocks.EnderQuartz(
				Config.BlueBlockChiselEnderQuartzID)
		.setUnlocalizedName("Transcraft:Bluechiselenderquartz").setHardness(1.0F)
		.setTextureName("Transcraft:Bluechiselenderquartz")
		.setCreativeTab(TranstabBlocks);
		GameRegistry.registerBlock(BluechiselEnderQuartz, "BlueChiselEnderQuartz");
		LanguageRegistry.addName(BluechiselEnderQuartz, "Blue Chiseled Ender Quartz Block");
		
		RedenderQuartz = new mark123mark.mods.transcraft.Blocks.EnderQuartz(
				Config.RedBlockEnderQuartzID)
		.setUnlocalizedName("Transcraft:Redenderquartz").setHardness(1.0F)
		.setTextureName("Transcraft:Redenderquartz")
		.setCreativeTab(TranstabBlocks);
		GameRegistry.registerBlock(RedenderQuartz, "RedEnderQuartz");
		LanguageRegistry.addName(RedenderQuartz, "Red Ender Quartz Block");
		
		RedchiselEnderQuartz = new mark123mark.mods.transcraft.Blocks.EnderQuartz(
				Config.RedBlockChiselEnderQuartzID)
		.setUnlocalizedName("Transcraft:Redchiselenderquartz").setHardness(1.0F)
		.setTextureName("Transcraft:Redchiselenderquartz")
		.setCreativeTab(TranstabBlocks);
		GameRegistry.registerBlock(RedchiselEnderQuartz, "RedChiselEnderQuartz");
		LanguageRegistry.addName(RedchiselEnderQuartz, "Red Chiseled Ender Quartz Block");
		
		

		
		Block.torchWood.setLightValue(0.8F);
		Block.whiteStone.setHardness(0.5F);

		LanguageRegistry.addName(TranscraftOre, "Transmutter Ore");
		LanguageRegistry.addName(OilOre, "Oil Ore");
		LanguageRegistry.addName(BlueLight, "Blue Light");
		LanguageRegistry.addName(GreenLight, "Green Light");
		LanguageRegistry.addName(OrangeLight, "Orange Light");
		LanguageRegistry.addName(DarkLight, "Dark Light");
		LanguageRegistry.addName(IronTorch, "Iron Torch");
		LanguageRegistry.addName(ClearGlass, "Crystal Glass");
		LanguageRegistry.addName(FancyCrystalGlass, "Fancy Crystal Glass");
		LanguageRegistry.addName(ThinClearGlass, "Thin Crystal Glass");
		LanguageRegistry.addName(BunkerBlock, "Bunker Block");
		LanguageRegistry.addName(BunkerStair, "Bunker Stair");
		LanguageRegistry.addName(SmoothBunkerStair, "Smooth Bunker Stair");
		LanguageRegistry.addName(ObsidianLever, "Obsidian Lever");
		LanguageRegistry.addName(SmoothBunkerBlock, "Smooth Bunker Block");
		LanguageRegistry.addName(DriedTransmutter, "DriedTransmuter");

		LanguageRegistry.addName(ComIronOre, "Packed Iron Ore");
		LanguageRegistry.addName(ComGoldOre, "Packed Gold Ore");
		LanguageRegistry.addName(ComTransmutterOre, "Packed Transmuter Ore");
		LanguageRegistry.addName(ComOilOre, "Packed Oil Ore");

		GameRegistry.registerBlock(TranscraftOre, "Transmuter Ore");
		GameRegistry.registerBlock(OilOre, "Oil Ore");
		GameRegistry.registerBlock(BlueLight, "Blue Light");
		GameRegistry.registerBlock(GreenLight, "Green Light");
		GameRegistry.registerBlock(OrangeLight, "Orange Light");
		GameRegistry.registerBlock(DarkLight, "Dark Light");
		GameRegistry.registerBlock(IronTorch, "IronTorch");
		GameRegistry.registerBlock(ClearGlass, "Clear Glass");
		GameRegistry.registerBlock(FancyCrystalGlass, "Fancy Crystal Glass");
		GameRegistry.registerBlock(ThinClearGlass, "Thin Clear Glass");
		GameRegistry.registerBlock(BunkerBlock, "Bunker Block");
		GameRegistry.registerBlock(SmoothBunkerStair, "Smooth Bunker Stair");
		GameRegistry.registerBlock(DriedTransmutter, "DriedTransmuter");

		GameRegistry.registerBlock(ComIronOre, "Packed Iron Ore");
		GameRegistry.registerBlock(ComGoldOre, "Packed Gold Ore");
		GameRegistry.registerBlock(ComTransmutterOre, "Packed Transmuter Ore");
		GameRegistry.registerBlock(ComOilOre, "Packed Oil Ore");

		GameRegistry.registerBlock(BunkerStair, "Bunker Stair");
		GameRegistry.registerBlock(ObsidianLever, "Obsidian Lever");
		GameRegistry.registerBlock(SmoothBunkerBlock, "Smooth Bunker Block");

		FMLLog.info("[TRANSCRAFT]	Loading Fluids");
		TranscraftFluids.init();

		FMLLog.info("[TRANSCRAFT]	Loading Items");
		BasicTransmuter = new BasicTransmuter(Config.BasicTransmuterID)
				.setUnlocalizedName("transcraft:BasicTransmuter")
				.setCreativeTab(TranstabItems)
				.setTextureName("transcraft:BasicTransmuter");
		QuadTransmuter = new mark123mark.mods.transcraft.Items.QuadTransmuter(
				Config.QuadTransmuterID)
				.setUnlocalizedName("Transcraft:QuadTransmuter")
				.setCreativeTab(TranstabItems)
				.setTextureName("transcraft:QuadTransmuter");
		NanoTransmuter = new mark123mark.mods.transcraft.Items.NanoTransmuter(
				Config.NanoTransmuterID)
				.setUnlocalizedName("Transcraft:NanoTransmuter")
				.setCreativeTab(TranstabItems)
				.setTextureName("transcraft:NanoTransmuter");
		Oil = new mark123mark.mods.transcraft.Items.Oil(Config.OilID)
				.setUnlocalizedName("Transcraft:Oil")
				.setCreativeTab(TranstabItems).setTextureName("transcraft:Oil");
		Plastic = new mark123mark.mods.transcraft.Items.Plastic(
				Config.PlasticID).setUnlocalizedName("Transcraft:Plastic")
				.setCreativeTab(TranstabItems)
				.setTextureName("transcraft:Plastic");
		IronStick = new mark123mark.mods.transcraft.Items.IronStick(
				Config.IronStickID).setUnlocalizedName("Transcraft:IronStick")
				.setCreativeTab(TranstabItems)
				.setTextureName("transcraft:BasicTransmuter");
		HardendPlastic = new mark123mark.mods.transcraft.Items.HardendPlastic(
				Config.HardendPlasticID)
				.setUnlocalizedName("Transcraft:HardendPlastic")
				.setCreativeTab(TranstabItems)
				.setTextureName("transcraft:IronStick");
		EnderGem = new mark123mark.mods.transcraft.Items.EnderGem(
				Config.EnderGemID).setUnlocalizedName("Transcraft:EnderGem")
				.setCreativeTab(TranstabItems)
				.setTextureName("transcraft:EnderGem");
		EnderQuartz = new mark123mark.mods.transcraft.Items.EnderQuartz(
				Config.EnderQuartzID)
				.setUnlocalizedName("Transcraft:EnderQuartz")
				.setCreativeTab(TranstabItems)
				.setTextureName("transcraft:EnderQuartz");
		DarkEndershard = new mark123mark.mods.transcraft.Items.DarkEndershard(
				Config.DarkEndershardID)
				.setUnlocalizedName("Transcraft:DarkEndershard")
				.setCreativeTab(TranstabItems)
				.setTextureName("transcraft:DarkEndershard");
		HotDog = new mark123mark.mods.transcraft.Items.Food.HotDog(
				Config.HotdogID).setUnlocalizedName("Transcraft:HotDog")
				.setCreativeTab(TranstabItems);

		PlasticAxe = new mark123mark.mods.transcraft.Tools.PlasticAxe(
				Config.PlasticAxeID, PlasticTool).setUnlocalizedName(
				"Transcraft:PlasticAxe").setCreativeTab(TranstabItems);
		PlasticHoe = new mark123mark.mods.transcraft.Tools.PlasticHoe(
				Config.PlasticHoeID, PlasticTool).setUnlocalizedName(
				"Transcraft:PlasticHoe").setCreativeTab(TranstabItems);
		PlasticPickaxe = new mark123mark.mods.transcraft.Tools.PlasticPickaxe(
				Config.PlasticPickaxeID, PlasticTool).setUnlocalizedName(
				"Transcraft:PlasticPickaxe").setCreativeTab(TranstabItems);
		PlasticShovel = new mark123mark.mods.transcraft.Tools.PlasticShovel(
				Config.PlasticShovelID, PlasticTool).setUnlocalizedName(
				"Transcraft:PlasticShovel").setCreativeTab(TranstabItems);
		PlasticSword = new mark123mark.mods.transcraft.Tools.PlasticSword(
				Config.PlasticSwordID, PlasticTool).setUnlocalizedName(
				"Transcraft:PlasticSword").setCreativeTab(TranstabItems);
		BunkerPick = new mark123mark.mods.transcraft.Tools.BunkerPick(
				Config.BunkerPickID, BunkerToolEnum).setUnlocalizedName(
				"Transcraft:EnderPick").setCreativeTab(TranstabItems);
		EnderSword = new mark123mark.mods.transcraft.Tools.EnderSword(
				Config.EnderSwordID, EnderToolEnum).setUnlocalizedName(
				"Transcraft:EnderSword").setCreativeTab(TranstabItems)
				.setFull3D();

		EnumArmorMaterial PlasticEnum = EnumHelper.addArmorMaterial("Plastic",
				15, new int[] { 3, 5, 5, 2 }, 5);
		PlasticHelmet = (mark123mark.mods.transcraft.armor.ArmorPlasticHelmet) (new ArmorPlasticHelmet(
				Config.PlasticHelmetID, PlasticEnum, 0, 0)).setUnlocalizedName(
				"Transcraft:PlasticHelmet").setCreativeTab(TranstabItems);
		PlasticChest = (mark123mark.mods.transcraft.armor.ArmorPlasticChestplate) (new ArmorPlasticChestplate(
				Config.PlasticChestID, PlasticEnum, 0, 1)).setUnlocalizedName(
				"Transcraft:PlasticChest").setCreativeTab(TranstabItems);
		PlasticLegs = (mark123mark.mods.transcraft.armor.ArmorPlasticLegs) (new ArmorPlasticLegs(
				Config.PlasticLegsID, PlasticEnum, 0, 2)).setUnlocalizedName(
				"Transcraft:PlasticLegs").setCreativeTab(TranstabItems);
		PlasticBoots = (mark123mark.mods.transcraft.armor.ArmorPlasticBoots) (new ArmorPlasticBoots(
				Config.PlasticBootsID, PlasticEnum, 0, 3)).setUnlocalizedName(
				"Transcraft:PlasticBoots").setCreativeTab(TranstabItems);

		EnumArmorMaterial EnderEnum = EnumHelper.addArmorMaterial("Ender",
				9850, new int[] { 10000, 10000, 10000, 10000 }, 100);
		EnderHelmet = (mark123mark.mods.transcraft.armor.ArmorEnderHelmet) (new ArmorEnderHelmet(
				Config.EnderHelmetID, EnderEnum, 0, 0)).setUnlocalizedName(
				"Transcraft:EnderHelmet").setCreativeTab(TranstabItems);
		EnderChest = (mark123mark.mods.transcraft.armor.ArmorEnderChest) (new ArmorEnderChest(
				Config.EnderChestID, EnderEnum, 0, 1)).setUnlocalizedName(
				"Transcraft:EnderChest").setCreativeTab(TranstabItems);
		EnderLegs = (mark123mark.mods.transcraft.armor.ArmorEnderLegs) (new ArmorEnderLegs(
				Config.EnderLegsID, EnderEnum, 0, 2)).setUnlocalizedName(
				"Transcraft:EnderLegs").setCreativeTab(TranstabItems);
		EnderBoots = (mark123mark.mods.transcraft.armor.ArmorEnderBoots) (new ArmorEnderBoots(
				Config.EnderBootsID, EnderEnum, 0, 3)).setUnlocalizedName(
				"Transcraft:EnderBoots").setCreativeTab(TranstabItems);

		
		
		
		//***********************************************************************************
		
		StairenderQuartz = (new mark123mark.mods.transcraft.Blocks.DefultStair(
				Config.StairBlockEnderQuartzID , enderQuartz , 0))
		.setUnlocalizedName("Transcraft:Stairenderquartz").setHardness(1.0F)
		.setTextureName("Transcraft:Stairenderquartz")
		.setCreativeTab(TranstabBlocks);
		GameRegistry.registerBlock(StairenderQuartz, "StairEnderQuartz");
		LanguageRegistry.addName(StairenderQuartz, "Ender Quartz Block Stair");
		
		StairchiselEnderQuartz = (new mark123mark.mods.transcraft.Blocks.DefultStair(
				Config.StairBlockChiselEnderQuartzID, chiselEnderQuartz , 0))
		.setUnlocalizedName("Transcraft:Stairchiselenderquartz").setHardness(1.0F)
		.setTextureName("Transcraft:Stairchiselenderquartz")
		.setCreativeTab(TranstabBlocks);
		GameRegistry.registerBlock(StairchiselEnderQuartz, "StairChiselEnderQuartz");
		LanguageRegistry.addName(StairchiselEnderQuartz, "Chiseled Ender Quartz Block Stair");
		
		StairBlueenderQuartz = (new mark123mark.mods.transcraft.Blocks.DefultStair(
				Config.StairBlueBlockEnderQuartzID , BlueenderQuartz , 0))
		.setUnlocalizedName("Transcraft:StairBlueenderquartz").setHardness(1.0F)
		.setTextureName("Transcraft:StairBlueenderquartz")
		.setCreativeTab(TranstabBlocks);
		GameRegistry.registerBlock(StairBlueenderQuartz, "StairBlueEnderQuartz");
		LanguageRegistry.addName(StairBlueenderQuartz, "Blue Ender Quartz Block Stair");
		
		StairBluechiselEnderQuartz = (new mark123mark.mods.transcraft.Blocks.DefultStair(
				Config.StairBlueBlockChiselEnderQuartzID, BluechiselEnderQuartz , 0))
		.setUnlocalizedName("Transcraft:StairBluechiselenderquartz").setHardness(1.0F)
		.setTextureName("Transcraft:StairBluechiselenderquartz")
		.setCreativeTab(TranstabBlocks);
		GameRegistry.registerBlock(StairBluechiselEnderQuartz, "StairBlueChiselEnderQuartz");
		LanguageRegistry.addName(StairBluechiselEnderQuartz, "Blue Chiseled Ender Quartz Block Stair");
		
		StairRedenderQuartz = (new mark123mark.mods.transcraft.Blocks.DefultStair(
				Config.StairRedBlockEnderQuartzID, RedenderQuartz , 0))
		.setUnlocalizedName("Transcraft:StairRedenderquartz").setHardness(1.0F)
		.setTextureName("Transcraft:StairRedenderquartz")
		.setCreativeTab(TranstabBlocks);
		GameRegistry.registerBlock(StairRedenderQuartz, "StairRedEnderQuartz");
		LanguageRegistry.addName(StairRedenderQuartz, "Red Ender Quartz Block Stair");
		
		StairRedchiselEnderQuartz = (new mark123mark.mods.transcraft.Blocks.DefultStair(
				Config.StairRedBlockChiselEnderQuartzID, RedchiselEnderQuartz , 0))
		.setUnlocalizedName("Transcraft:StairRedchiselenderquartz").setHardness(1.0F)
		.setTextureName("Transcraft:StairRedchiselenderquartz")
		.setCreativeTab(TranstabBlocks);
		GameRegistry.registerBlock(StairRedchiselEnderQuartz, "StairRedChiselEnderQuartz");
		LanguageRegistry.addName(StairRedchiselEnderQuartz, "Red Chiseled Ender Quartz Block Stair");
		
		transmutationTablet = new ItemTransTab(
				Config.transmutationTablet)
		.setCreativeTab(TranstabItems)
		.setTextureName("Transcraft:transtab")
		.setUnlocalizedName("Transcraft:transtab");
		
		MinecraftForge.setBlockHarvestLevel(OilOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(TranscraftOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(BunkerBlock, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(SmoothBunkerBlock, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(BunkerStair, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(SmoothBunkerStair, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(ObsidianLever, "pickaxe", 4);

		FMLLog.info("[TRANSCRAFT]	Adding Recipes");
		// List Item Stacks!
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

		GameRegistry.addRecipe(new ItemStack(PlasticHelmet, 1), "ppp", "p p",
				"   ", 'p', Plastic);
		GameRegistry.addRecipe(new ItemStack(PlasticChest, 1), "p p", "ppp",
				"ppp", 'p', Plastic);
		GameRegistry.addRecipe(new ItemStack(PlasticLegs, 1), "ppp", "p p",
				"p p", 'p', Plastic);
		GameRegistry.addRecipe(new ItemStack(PlasticBoots, 1), "   ", "p p",
				"p p", 'p', Plastic);

		GameRegistry.addRecipe(new ItemStack(ComIronOre, 1), "ii", "ii", 'i',
				Block.oreIron);
		GameRegistry.addRecipe(new ItemStack(ComGoldOre, 1), "ii", "ii", 'i',
				Block.oreGold);
		GameRegistry.addRecipe(new ItemStack(ComTransmutterOre, 1), "ii", "ii",
				'i', TranscraftOre);
		GameRegistry.addRecipe(new ItemStack(ComOilOre, 1), "ii", "ii", 'i',
				Oil);

		GameRegistry.addRecipe(new ItemStack(Block.oreIron, 4), "i", 'i',
				ComIronOre);
		GameRegistry.addRecipe(new ItemStack(Block.oreGold, 4), "i", 'i',
				ComGoldOre);
		GameRegistry.addRecipe(new ItemStack(TranscraftOre, 4), "i", 'i',
				ComTransmutterOre);
		GameRegistry.addRecipe(new ItemStack(Oil, 4), "i", 'i', ComOilOre);

		GameRegistry.addRecipe(new ItemStack(HotDog, 8), "bbb", "ppp", "bbb",
				'b', Item.bread, 'p', Item.porkCooked);

		GameRegistry.addRecipe(new ItemStack(ObsidianLever, 2), "lb ", "   ",
				"  ", 'l', Block.lever, 'b', BunkerBlock);

		GameRegistry.addRecipe(new ItemStack(Block.sponge, 16), "yxy", "xdx",
				"yxy", 'x', Water, 'y', GoldIStack, 'd', Item.diamond);

		GameRegistry.addRecipe(new ItemStack(BunkerBlock, 8), "opo", "pdp",
				"opo", 'o', HardendPlastic, 'p', Plastic, 'd', Item.diamond);
		GameRegistry.addRecipe(new ItemStack(ClearGlass, 8), "ggg", "gpg",
				"ggg", 'g', Block.glass, 'p', Plastic);
		GameRegistry.addRecipe(new ItemStack(FancyCrystalGlass, 8), "ggg",
				"gpg", "ggg", 'g', ClearGlass, 'p', Block.sponge);
		GameRegistry.addRecipe(new ItemStack(ThinClearGlass, 8), "   ", "ggg",
				"ggg", 'g', ClearGlass);
		GameRegistry.addRecipe(new ItemStack(BunkerStair, 4), "b  ", "bb ",
				"bbb", 'b', BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(BunkerStair, 4), "  b", " bb",
				"bbb", 'b', BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(SmoothBunkerBlock, 4), "bb", "bb",
				'b', BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(SmoothBunkerStair, 4), "b  ",
				"bb ", "bbb", 'b', SmoothBunkerBlock);
		GameRegistry.addRecipe(new ItemStack(SmoothBunkerStair, 4), "  b",
				" bb", "bbb", 'b', SmoothBunkerBlock);

		GameRegistry.addRecipe(new ItemStack(Transcrafter), "ddd", "ece",
				"ooo", 'e', Item.emerald, 'd', Item.diamond, 'c', Block.chest,
				'o', Block.obsidian);

		ItemStack BlueDye = new ItemStack(Item.dyePowder, 1, 12);
		ItemStack GreenDye = new ItemStack(Item.dyePowder, 1, 2);
		ItemStack OrangeDye = new ItemStack(Item.dyePowder, 1, 14);
		
		GameRegistry.addRecipe(new ItemStack(enderQuartz, 1), " q ", "qqq"," d ", 'd', GreenDye, 'q', Item.netherQuartz);
		GameRegistry.addRecipe(new ItemStack(chiselEnderQuartz, 1), " q ", "qqq"," d ", 'd', enderQuartz, 'q', Item.netherQuartz);
		
		GameRegistry.addRecipe(new ItemStack(BlueenderQuartz, 1), " q ", "qqq"," d ", 'd', BlueDye, 'q', Item.netherQuartz);
		GameRegistry.addRecipe(new ItemStack(BluechiselEnderQuartz, 1), " q ", "qqq"," d ", 'd', BlueenderQuartz, 'q', Item.netherQuartz);
		
		GameRegistry.addRecipe(new ItemStack(RedenderQuartz, 1), " q ", "qqq"," d ", 'd', OrangeDye, 'q', Item.netherQuartz);
		GameRegistry.addRecipe(new ItemStack(RedchiselEnderQuartz, 1), " q ", "qqq"," d ", 'd', RedenderQuartz, 'q', Item.netherQuartz);
		
		
		GameRegistry.addRecipe(new ItemStack(StairenderQuartz, 4), "b  ","bb ", "bbb", 'b', enderQuartz);
		GameRegistry.addRecipe(new ItemStack(StairchiselEnderQuartz, 4), "b  ","bb ", "bbb", 'b', chiselEnderQuartz);
		
		GameRegistry.addRecipe(new ItemStack(StairBlueenderQuartz, 4), "b  ","bb ", "bbb", 'b', BlueenderQuartz);
		GameRegistry.addRecipe(new ItemStack(StairBluechiselEnderQuartz, 4), "b  ","bb ", "bbb", 'b', BluechiselEnderQuartz);
		
		GameRegistry.addRecipe(new ItemStack(StairRedenderQuartz, 4), "b  ","bb ", "bbb", 'b', RedenderQuartz);
		GameRegistry.addRecipe(new ItemStack(StairRedchiselEnderQuartz, 4), "b  ","bb ", "bbb", 'b', RedchiselEnderQuartz);
		
	
		GameRegistry.addRecipe(new ItemStack(BlueLight, 8), "prp", "pbp",
				"prp", 'r', Item.redstone, 'p', Plastic, 'b', BlueDye);
		GameRegistry.addRecipe(new ItemStack(GreenLight, 8), "prp", "pbp",
				"prp", 'r', Item.redstone, 'p', Plastic, 'b', GreenDye);
		GameRegistry.addRecipe(new ItemStack(OrangeLight, 8), "prp", "pbp",
				"prp", 'r', Item.redstone, 'p', Plastic, 'b', OrangeDye);
		GameRegistry.addRecipe(new ItemStack(DarkLight, 8), "prp", "pbp",
				"prp", 'r', Item.redstone, 'p', Plastic, 'b', Block.obsidian);
		GameRegistry.addRecipe(new ItemStack(HardendPlastic, 8), "pop", "ooo",
				"pop", 'p', Plastic, 'o', Block.obsidian);

		GameRegistry.addRecipe(new ItemStack(IronStick, 4), " i ", " s ",
				" i ", 'i', Item.ingotIron, 's', Item.stick);
		GameRegistry.addRecipe(new ItemStack(IronTorch, 16), "o", "i", 'i',
				IronStick, 'o', Oil);

		GameRegistry.addRecipe(new ItemStack(PlasticSword), " p ", " p ",
				" i ", 'i', IronStick, 'p', Plastic);
		GameRegistry.addRecipe(new ItemStack(PlasticPickaxe), "ppp", " i ",
				" i ", 'i', IronStick, 'p', Plastic);
		GameRegistry.addRecipe(new ItemStack(PlasticAxe), " pp", " ip", " i ",
				'i', IronStick, 'p', Plastic);
		GameRegistry.addRecipe(new ItemStack(PlasticAxe), "pp ", "pi ", " i ",
				'i', IronStick, 'p', Plastic);
		GameRegistry.addRecipe(new ItemStack(PlasticHoe), "pp ", " i ", " i ",
				'i', IronStick, 'p', Plastic);
		GameRegistry.addRecipe(new ItemStack(PlasticHoe), " pp", " i ", " i ",
				'i', IronStick, 'p', Plastic);
		GameRegistry.addRecipe(new ItemStack(PlasticShovel), " p ", " i ",
				" i ", 'i', IronStick, 'p', Plastic);

		GameRegistry.addRecipe(new ItemStack(Transcraft.BunkerPick), "bbb",
				"dod", " o ", 'b', Transcraft.BunkerBlock, 'd',
				Block.blockDiamond, 'o', Transcraft.HardendPlastic);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderSword), "ebe",
				"ebe", "ndn", 'e', Transcraft.EnderGem, 'd',
				Block.blockDiamond, 'b', Transcraft.BunkerBlock, 'n',
				Item.swordDiamond);

		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderQuartz, 6), "qeq",
				"qdq", "qeq", 'q', DarkEndershard, 'd', Block.whiteStone,
				'e', Item.eyeOfEnder);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderGem), "qdq",
				"qeq", "qdq", 'q', Transcraft.EnderQuartz, 'd', Item.diamond,
				'e', Item.eyeOfEnder);

		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderHelmet, 1), "ppp",
				"pgp", "   ", 'p', Transcraft.EnderGem, 'g',
				Transcraft.FancyCrystalGlass);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderChest, 1), "pbp",
				"ppp", "ppp", 'p', Transcraft.EnderGem, 'b',
				Transcraft.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderLegs, 1), "ppp",
				"p p", "pep", 'p', Transcraft.EnderGem, 'e', Item.eyeOfEnder);
		GameRegistry.addRecipe(new ItemStack(Transcraft.EnderBoots, 1), "   ",
				"pep", "pep", 'p', Transcraft.EnderGem, 'e', Item.enderPearl);

		GameRegistry
				.addRecipe(new ItemStack(Transcraft.QuadTransmuter), "sbs","bsb", "sbs", 'b', Transcraft.BasicTransmuter, 's',Block.stone);
		
		GameRegistry.addRecipe(new ItemStack(Transcraft.NanoTransmuter), "qqr",
				"qqg", "qqr", 'q', Transcraft.QuadTransmuter, 'g',
				Item.glowstone, 'r', Item.redstone);

		// Smelting Recipes
		GameRegistry.addSmelting(TranscraftOre.blockID, new ItemStack(
				BasicTransmuter), 2.3f);
		GameRegistry.addSmelting(Oil.itemID, new ItemStack(Plastic), 2.3f);
		GameRegistry.addSmelting(OilOre.blockID, new ItemStack(Oil), 2.3f);

		FMLLog.info("[TRANSCRAFT]	Registering Items with the LanguageRegistry");
		LanguageRegistry.instance().addStringLocalization(
				"itemGroup.TranstabItems", "en_US", "Transcraft Items");
		LanguageRegistry.instance().addStringLocalization(
				"itemGroup.TranstabBlocks", "en_US", "Transcraft Blocks");

		LanguageRegistry.addName(BasicTransmuter, "Basic Transmuter");
		LanguageRegistry.addName(QuadTransmuter, "QuadTransmuter");
		LanguageRegistry.addName(NanoTransmuter, "NanoTransmuter");
		LanguageRegistry.addName(HotDog, "Hot Dog");
		LanguageRegistry.addName(Oil, "Oil");
		LanguageRegistry.addName(Plastic, "Plastic");
		LanguageRegistry.addName(IronStick, "Iron Stick");
		LanguageRegistry.addName(HardendPlastic, "Hardend Plastic");
		LanguageRegistry.addName(EnderQuartz, "Ender Quartz");
		LanguageRegistry.addName(EnderGem, "Ender Gem");
		LanguageRegistry.addName(DarkEndershard, "DarkEnder Shard");
		
		LanguageRegistry.addName(PlasticAxe, "Plastic Axe");
		LanguageRegistry.addName(PlasticHoe, "Plastic Hoe");
		LanguageRegistry.addName(PlasticPickaxe, "Plastic Pickaxe");
		LanguageRegistry.addName(PlasticShovel, "Plastic Shovel");
		LanguageRegistry.addName(PlasticSword, "Plastic Sword");
		LanguageRegistry.addName(BunkerPick, "Ender Pickaxe");
		LanguageRegistry.addName(EnderSword, "Ender Sword");

		LanguageRegistry.addName(PlasticHelmet, "Plastic Helmet");
		LanguageRegistry.addName(PlasticChest, "Plastic Chest");
		LanguageRegistry.addName(PlasticLegs, "Plastic Legs");
		LanguageRegistry.addName(PlasticBoots, "Plastic Boots");

		LanguageRegistry.addName(EnderHelmet, "Ender Helmet");
		LanguageRegistry.addName(EnderChest, "Ender Chestplate");
		LanguageRegistry.addName(EnderLegs, "Ender Legs");
		LanguageRegistry.addName(EnderBoots, "Ender Boots");

		int entityID;
		entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(NukeCreeper.class, "EnderCreeper", entityID);
		EntityList.addMapping(NukeCreeper.class, "EnderCreeper", entityID, 0x515838, 0x868F6B);
		EntityRegistry.registerModEntity(NukeCreeper.class, "EnderCreeper", 2, Transcraft.instance, 64, 5, true);
	
		BiomeGenBase[] nether = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.NETHER);
		BiomeGenBase[] end = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.END);
		BiomeGenBase[] PlanesOverworld = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.PLAINS);
		
		
        EntityRegistry.addSpawn(NukeCreeper.class, 10, 8, 12, EnumCreatureType.creature, end);
     
	}

	

	@EventHandler
	public void init(FMLInitializationEvent event) {

		LanguageRegistry.instance().addStringLocalization(
				"itemGroup.TranstabItems", "en_US", "Transcraft Items");
		LanguageRegistry.instance().addStringLocalization(
				"itemGroup.TranstabBlocks", "en_US", "Transcraft Blocks");


		LanguageRegistry.addName(BasicTransmuter, "Basic Transmuter");
		LanguageRegistry.addName(QuadTransmuter, "QuadTransmuter");
		LanguageRegistry.addName(NanoTransmuter, "NanoTransmuter");
		LanguageRegistry.addName(HotDog, "Hot Dog");
		LanguageRegistry.addName(Oil, "Oil");
		LanguageRegistry.addName(Plastic, "Plastic");
		LanguageRegistry.addName(IronStick, "Iron Stick");
		LanguageRegistry.addName(HardendPlastic, "Hardend Plastic");
		LanguageRegistry.addName(EnderQuartz, "Ender Quartz");
		LanguageRegistry.addName(EnderGem, "Ender Gem");
		LanguageRegistry.addName(DarkEndershard, "DarkEnder Shard");
		
		LanguageRegistry.addName(PlasticAxe, "Plastic Axe");
		LanguageRegistry.addName(PlasticHoe, "Plastic Hoe");
		LanguageRegistry.addName(PlasticPickaxe, "Plastic Pickaxe");
		LanguageRegistry.addName(PlasticShovel, "Plastic Shovel");
		LanguageRegistry.addName(PlasticSword, "Plastic Sword");
		LanguageRegistry.addName(BunkerPick, "Ender Pickaxe");
		LanguageRegistry.addName(EnderSword, "Ender Sword");

		LanguageRegistry.addName(PlasticHelmet, "Plastic Helmet");
		LanguageRegistry.addName(PlasticChest, "Plastic Chest");
		LanguageRegistry.addName(PlasticLegs, "Plastic Legs");
		LanguageRegistry.addName(PlasticBoots, "Plastic Boots");

		LanguageRegistry.addName(EnderHelmet, "Ender Helmet");
		LanguageRegistry.addName(EnderChest, "Ender Chestplate");
		LanguageRegistry.addName(EnderLegs, "Ender Legs");
		LanguageRegistry.addName(EnderBoots, "Ender Boots");

		FMLLog.info("[TRANSCRAFT]	Adding Chest gen hooks");

		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(
				new WeightedRandomChestContent(new ItemStack(BasicTransmuter),
						1, 10, 50));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(
				new WeightedRandomChestContent(new ItemStack(QuadTransmuter),
						1, 10, 10));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(
				new WeightedRandomChestContent(new ItemStack(NanoTransmuter),
						1, 10, 5));

		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(BasicTransmuter),
						1, 10, 50));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(QuadTransmuter),
						1, 10, 10));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(NanoTransmuter),
						1, 10, 5));

		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(BasicTransmuter),
						1, 10, 50));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(QuadTransmuter),
						1, 10, 15));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(NanoTransmuter),
						1, 10, 5));

		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
				new WeightedRandomChestContent(new ItemStack(BasicTransmuter),
						1, 10, 15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
				new WeightedRandomChestContent(new ItemStack(QuadTransmuter),
						1, 10, 10));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
				new WeightedRandomChestContent(new ItemStack(NanoTransmuter),
						1, 10, 5));

		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
				new WeightedRandomChestContent(new ItemStack(BasicTransmuter),
						1, 10, 50));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
				new WeightedRandomChestContent(new ItemStack(QuadTransmuter),
						1, 10, 10));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
				new WeightedRandomChestContent(new ItemStack(NanoTransmuter),
						1, 10, 5));

		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
				new WeightedRandomChestContent(new ItemStack(BasicTransmuter),
						1, 10, 50));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
				new WeightedRandomChestContent(new ItemStack(QuadTransmuter),
						1, 10, 10));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
				new WeightedRandomChestContent(new ItemStack(NanoTransmuter),
						1, 10, 5));

		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(BasicTransmuter),
						1, 10, 50));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(QuadTransmuter),
						1, 10, 10));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(NanoTransmuter),
						1, 10, 5));

		GameRegistry.registerWorldGenerator(new TranscraftGenerator());
		GameRegistry.registerFuelHandler(new FuelHandler());
		
		NetworkRegistry.instance().registerConnectionHandler(new PlayerEditor());
		
	}

	public static CreativeTabs TranstabItems = new CreativeTabs("TranstabItems") {
		public ItemStack getIconItemStack() {
			return new ItemStack(PlasticSword, 1, 0);

		}

	};
	public static CreativeTabs TranstabBlocks = new CreativeTabs(
			"TranstabBlocks") {
		public ItemStack getIconItemStack() {
			return new ItemStack(BlueLight, 1, 0);
		}

	};

	public static void oreRegistration() {
		FMLLog.info("[TRANSCRAFT]	Adding Ore dic support");
		OreDictionary.registerOre("TRANS-oreTranscraft", new ItemStack(
				TranscraftOre));
		OreDictionary.registerOre("TRANS-Oil", new ItemStack(Oil));
		OreDictionary.registerOre("TRANS-oreOil", new ItemStack(OilOre));
		OreDictionary.registerOre("TRANS-BlockBlueLight", new ItemStack(
				BlueLight));
		OreDictionary.registerOre("TRANS-BlockOrangeLight", new ItemStack(
				OrangeLight));
		OreDictionary.registerOre("TRANS-BlockGreenLight", new ItemStack(
				GreenLight));
		OreDictionary.registerOre("TRANS-BlockDarkLight", new ItemStack(
				DarkLight));
		OreDictionary.registerOre("TRANS-BunkerBlock", new ItemStack(
				BunkerBlock));
		OreDictionary.registerOre("TRANS-BunkerStair", new ItemStack(
				BunkerStair));
		OreDictionary
				.registerOre("TRANS-ComGoldOre", new ItemStack(ComGoldOre));
		OreDictionary
				.registerOre("TRANS-ComIronOre", new ItemStack(ComIronOre));
		OreDictionary.registerOre("TRANS-ComOilOre", new ItemStack(ComOilOre));
		OreDictionary.registerOre("TRANS-ComTransmuterOre", new ItemStack(
				ComTransmutterOre));
		OreDictionary.registerOre("TRANS-ComTransmuterOre", new ItemStack(
				ComTransmutterOre));
		OreDictionary.registerOre("TRANS-IronTorch", new ItemStack(IronTorch));
		OreDictionary.registerOre("TRANS-SmoothBunkerBlock", new ItemStack(
				SmoothBunkerBlock));
		OreDictionary.registerOre("TRANS-SmoothBunkerStair", new ItemStack(
				SmoothBunkerStair));
		OreDictionary.registerOre("TRANS-DiredTrannsmuter", DriedTransmutter);

		OreDictionary.registerOre("TRANS-BasicTransmuter", new ItemStack(
				BasicTransmuter));
		OreDictionary.registerOre("TRANS-QuadTransmuter", new ItemStack(
				QuadTransmuter));
		OreDictionary.registerOre("TRANS-NanoTransmuter", new ItemStack(
				NanoTransmuter));
		OreDictionary.registerOre("TRANS-EnderGem", new ItemStack(EnderGem));
		OreDictionary.registerOre("TRANS-EnderQuartz", new ItemStack(
				EnderQuartz));
		OreDictionary.registerOre("TRANS-Plastic", new ItemStack(Plastic));
		OreDictionary.registerOre("TRANS-HardendPlastic", new ItemStack(
				HardendPlastic));
		OreDictionary.registerOre("TRANS-IronStick", new ItemStack(IronStick));

		OreDictionary
				.registerOre("TRANS-BunkerPick", new ItemStack(BunkerPick));
		OreDictionary
				.registerOre("TRANS-EnderSword", new ItemStack(EnderSword));
		OreDictionary.registerOre("TRANS-PlasicAxe", new ItemStack(PlasticAxe));
		OreDictionary.registerOre("TRANS-PlasicHoe", new ItemStack(PlasticHoe));
		OreDictionary.registerOre("TRANS-PlasicPickaxe", new ItemStack(
				PlasticPickaxe));
		OreDictionary.registerOre("TRANS-PlasicShovel", new ItemStack(
				PlasticShovel));
		OreDictionary.registerOre("TRANS-PlasicSword", new ItemStack(
				PlasticSword));
	}

	@ForgeSubscribe
	@EventHandler
	public void onServerStarting(FMLServerStartingEvent event , EntityPlayer player) {
		FMLLog.info("[TRANSCRAFT]	Adding new commands");
		event.registerServerCommand(new CommandTranscraftVersion());
		if (SHOWDEVMESSGAE) {
			new DevMessage();
		}
		
	}

	@EventHandler
	@SuppressWarnings("unchecked")
	public void load(FMLInitializationEvent event) {
		NetworkRegistry.instance().registerGuiHandler(instance,
				new GuiHanderTC());
	}

}