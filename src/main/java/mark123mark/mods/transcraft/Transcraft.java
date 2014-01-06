package mark123mark.mods.transcraft;

import mark123mark.mods.transcraft.Items.TranscraftItems;
import mark123mark.mods.transcraft.WorldGen.TranscraftGenerator;
import mark123mark.mods.transcraft.biomes.transmania.FlatLands;
import mark123mark.mods.transcraft.command.CommandReloadConfig;
import mark123mark.mods.transcraft.command.CommandTranscraftVersion;
import mark123mark.mods.transcraft.fluids.TranscraftFluids;
import mark123mark.mods.transcraft.helpers.Config;
import mark123mark.mods.transcraft.helpers.EventMobDeath;
import mark123mark.mods.transcraft.helpers.FuelHandler;
import mark123mark.mods.transcraft.helpers.GuiHand;
import mark123mark.mods.transcraft.helpers.ItemToolTipHelper;
import mark123mark.mods.transcraft.helpers.PacketHandlerTranscraft;
import mark123mark.mods.transcraft.helpers.PlayerEditor;
import mark123mark.mods.transcraft.loaders.LoadBlockSettings;
import mark123mark.mods.transcraft.loaders.LoadBlocks;
import mark123mark.mods.transcraft.loaders.LoadChestGen;
import mark123mark.mods.transcraft.loaders.LoadDim;
import mark123mark.mods.transcraft.loaders.LoadEntity;
import mark123mark.mods.transcraft.loaders.LoadItems;
import mark123mark.mods.transcraft.loaders.LoadLang;
import mark123mark.mods.transcraft.loaders.LoadOreDics;
import mark123mark.mods.transcraft.loaders.RecipeLoader;
import mark123mark.mods.transcraft.loaders.RegisterBlocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "transcraft", name = "Transcraft", version = Transcraft.VERSION+ Transcraft.STATE, useMetadata = true)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = "transcraft", packetHandler = PacketHandlerTranscraft.class)
public class Transcraft {
	public static final String VERSION = "1.6.4_V2.0.0_";
	public static final String STATE = "BROKEN";
	public static boolean SHOWDEVMESSGAE = false;

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
	public static Block TransManiaOre;

	public static Block Transcrafter;

	public static Block enderQuartzBlock;
	public static Block CutenderQuartz;
	public static Block EnderQuartzBrick;
	public static Block EnderQuartzBigBrick;

	 public static Block DimPortalBlock;
	 public static Block DimPortalEscapeBlock;

	 public static Block ixpGrinder;

	public static final BiomeGenBase FlatLands = (new FlatLands(189))
			.setBiomeName("TransLands").setDisableRain()
			.setMinMaxHeight(0.3F, 10.5F);
	
	public static final BiomeGenBase TransmutterBiome = (new mark123mark.mods.transcraft.biomes.TransmutterBiome(
			190)).setBiomeName("TransmutterBiome").setTemperatureRainfall(0.8F,
			0.4F);




	public static EnumToolMaterial PlasticTool = EnumHelper.addToolMaterial(
			"PlasticTool", 2, 750, 5.0F, 2, 0);
	public static EnumToolMaterial BunkerToolEnum = EnumHelper.addToolMaterial(
			"BunkerToolEnum", 4, 1000, 20.0F, 4, 0);
	public static EnumToolMaterial EnderToolEnum = EnumHelper.addToolMaterial(
			"EnderToolEnum", 400, 10000, 80.0F, 46, 100);

	@Instance("transcraft")
	public static Transcraft instance;

	@SidedProxy(clientSide = "mark123mark.mods.transcraft.TranscraftClientProxy", serverSide = "mark123mark.mods.transcraft.TranscraftCommonProxy")
	public static TranscraftCommonProxy Coproxy;
	public static TranscraftClientProxy Clproxy;


	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		FMLLog.info("[TRANSCRAFT]	Starting Transcraft verison "
				+ Transcraft.VERSION);

		FMLLog.info("[TRANSCRAFT]	Loading Handlers");
		Coproxy.registerHandlers();
		Coproxy.registerTickHandlers();

		FMLLog.info("[TRANSCRAFT]	Loading Config");
		Config.initConfig();

		FMLLog.info("[TRANSCRAFT]	Loading Blocks");
		LoadBlocks.LoadBlocks();

		FMLLog.info("[TRANSCRAFT]	Loading Items");
		LoadItems.LoadItems();

		FMLLog.info("[TRANSCRAFT]	Loading Fluids");
		TranscraftFluids.init();

		FMLLog.info("[TRANSCRAFT]	Registering Blocks");
		RegisterBlocks.RegisterBlocks();

		FMLLog.info("[TRANSCRAFT]	Registering Items with the LanguageRegistry");
		LoadLang.loadlang();

		FMLLog.info("[TRANSCRAFT]	Loading Block Settings");
		LoadBlockSettings.LoadSet();

		FMLLog.info("[TRANSCRAFT]	Adding Recipes");
		RecipeLoader.LoadRecipe();

		FMLLog.info("[TRANSCRAFT]	Loading entitys");
		LoadEntity.loadentity();
		
		
		

		BiomeDictionary.registerBiomeType(TransmutterBiome, Type.HILLS,
				Type.FOREST, Type.WATER);
		GameRegistry.addBiome(TransmutterBiome);
		BiomeManager.addSpawnBiome(TransmutterBiome);
		BiomeManager.addStrongholdBiome(TransmutterBiome);

		 GameRegistry.addBiome(FlatLands);

		MinecraftForge.EVENT_BUS.register(new ItemToolTipHelper());
		
		if(Loader.isModLoaded("Waila")) {
			FMLInterModComms.sendMessage("Waila", "register", "mark123mark.mods.transcraft.waila.TranscraftProvider.callbackRegister");
		}
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		FMLLog.info("[TRANSCRAFT]	Registering  the Languages");
		LoadLang.loadlang();

		FMLLog.info("[TRANSCRAFT]	Adding Chest gen hooks");
		LoadChestGen.LoadChest();

		FMLLog.info("[TRANSCRAFT]	Registering world gen");
		GameRegistry.registerWorldGenerator(new TranscraftGenerator());

		FMLLog.info("[TRANSCRAFT]	Registering Fuel handler");
		GameRegistry.registerFuelHandler(new FuelHandler());

		FMLLog.info("[TRANSCRAFT]	Registering Player Editor");
		NetworkRegistry.instance()
				.registerConnectionHandler(new PlayerEditor());

		Coproxy.renderThings();
		
		
/*
		if (event.getSide() == Side.CLIENT) {
			MinecraftForge.EVENT_BUS.register(new EventCloakRender());
		}
 */


		MinecraftForge.EVENT_BUS.register(new EventMobDeath());

	}

	public static void oreRegistration() {

		FMLLog.info("[TRANSCRAFT]	Adding Ore dic support");
		LoadOreDics.oredic();

	}

	@EventHandler
	public void onServerStarting(FMLServerStartingEvent event)
	{
		FMLLog.info("[TRANSCRAFT]	Adding new commands");
		event.registerServerCommand(new CommandTranscraftVersion());
		event.registerServerCommand(new CommandReloadConfig());
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {

		FMLLog.info("[TRANSCRAFT]	Adding gui hander");
		NetworkRegistry.instance().registerGuiHandler(instance,
				new GuiHand());


		FMLLog.info("[TRANSCRAFT]	Adding new dims");
		 LoadDim.load();

	}

	public static CreativeTabs TranstabItems = new CreativeTabs("TranstabItems") {
		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(TranscraftItems.EnderSword, 1, 0);
		}

	};

	public static CreativeTabs TranstabBlocks = new CreativeTabs("TranstabBlocks") 
	{
		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(TranscraftOre, 1, 0);
		}

	};

	public static CreativeTabs TranstabDecBlocks = new CreativeTabs(
			"TranstabDecBlocks") {

		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(EnderQuartzBigBrick, 1, 11);
		}

	};

}