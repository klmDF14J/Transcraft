package mark123mark.mods.transcraft;

import mark123mark.mods.transcraft.TileEntitys.Transcrafter.GuiHanderTC;
import mark123mark.mods.transcraft.WorldGen.TranscraftGenerator;
import mark123mark.mods.transcraft.biomes.transmania.FlatLands;
import mark123mark.mods.transcraft.command.CommandTranscraftVersion;
import mark123mark.mods.transcraft.fluids.TranscraftFluids;
import mark123mark.mods.transcraft.helpers.Config;
import mark123mark.mods.transcraft.helpers.EventCloakRender;
import mark123mark.mods.transcraft.helpers.EventMobDeath;
import mark123mark.mods.transcraft.helpers.FuelHandler;
import mark123mark.mods.transcraft.helpers.PacketHandlerTranscraft;
import mark123mark.mods.transcraft.helpers.PlayerEditor;
import mark123mark.mods.transcraft.loaders.LoadBlockSettings;
import mark123mark.mods.transcraft.loaders.LoadBlocks;
import mark123mark.mods.transcraft.loaders.LoadChestGen;
import mark123mark.mods.transcraft.loaders.LoadEntity;
import mark123mark.mods.transcraft.loaders.LoadItems;
import mark123mark.mods.transcraft.loaders.LoadLang;
import mark123mark.mods.transcraft.loaders.LoadOreDics;
import mark123mark.mods.transcraft.loaders.RecipeLoader;
import mark123mark.mods.transcraft.loaders.RegisterBlocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
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
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "transcraft", name = "Transcraft", version = Transcraft.VERSION + Transcraft.STATE)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = "transcraft", packetHandler = PacketHandlerTranscraft.class)
public class Transcraft
{
	public static final String VERSION = "1.6.4_V1.3.0_";
	public static final String STATE = "ALPHA";
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
	public static Block ColourTest;

	public static Block Transcrafter;
	public static Block LTranscrafter;

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

	// public static Block DimPortalBlock;
	// public static Block DimPortalEscapeBlock;

	// public static Block ixpGrinder;

	public static final BiomeGenBase FlatLands = (new FlatLands(189)).setBiomeName("TransLands").setDisableRain().setMinMaxHeight(0.3F, 10.5F);
	public static final BiomeGenBase TransmutterBiome = (new mark123mark.mods.transcraft.biomes.TransmutterBiome(190)).setBiomeName("TransmutterBiome").setTemperatureRainfall(0.8F, 0.4F);

	public static Item BasicTransmuter;
	public static Item QuadTransmuter;
	public static Item NanoTransmuter;
	public static Item HotDog;
	public static Item Oil;
	public static Item Plastic;
	public static Item IronStick;
	public static Item HardendPlastic;
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

	public static EnumToolMaterial PlasticTool = EnumHelper.addToolMaterial("PlasticTool", 2, 750, 5.0F, 2, 0);
	public static EnumToolMaterial BunkerToolEnum = EnumHelper.addToolMaterial("BunkerToolEnum", 4, 1000, 20.0F, 4, 0);
	public static EnumToolMaterial EnderToolEnum = EnumHelper.addToolMaterial("EnderToolEnum", 400, 10000, 80.0F, 46, 100);

	@Instance("transcraft")
	public static Transcraft instance;

	@SidedProxy(clientSide = "mark123mark.mods.transcraft.TranscraftClientProxy", serverSide = "mark123mark.mods.transcraft.TranscraftCommonProxy")
	public static TranscraftCommonProxy Coproxy;
	public static TranscraftClientProxy Clproxy;

	private String field_111218_cA;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

		FMLLog.info("[TRANSCRAFT]	Starting Transcraft verison " + Transcraft.VERSION);

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

		BiomeDictionary.registerBiomeType(TransmutterBiome, Type.HILLS, Type.FOREST, Type.WATER);
		GameRegistry.addBiome(TransmutterBiome);
		BiomeManager.addSpawnBiome(TransmutterBiome);
		BiomeManager.addStrongholdBiome(TransmutterBiome);

		// GameRegistry.addBiome(FlatLands);

	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{

		FMLLog.info("[TRANSCRAFT]	Registering  the Languages");
		LoadLang.loadlang();

		FMLLog.info("[TRANSCRAFT]	Adding Chest gen hooks");
		LoadChestGen.LoadChest();

		FMLLog.info("[TRANSCRAFT]	Registering world gen");
		GameRegistry.registerWorldGenerator(new TranscraftGenerator());

		FMLLog.info("[TRANSCRAFT]	Registering Fule handler");
		GameRegistry.registerFuelHandler(new FuelHandler());

		FMLLog.info("[TRANSCRAFT]	Registering Player Editor");
		NetworkRegistry.instance().registerConnectionHandler(new PlayerEditor());

		if (event.getSide() == Side.CLIENT)
		{
			MinecraftForge.EVENT_BUS.register(new EventCloakRender());
		}

		MinecraftForge.EVENT_BUS.register(new EventMobDeath());

	}

	public static void oreRegistration()
	{

		FMLLog.info("[TRANSCRAFT]	Adding Ore dic support");
		LoadOreDics.oredic();

	}

	@ForgeSubscribe
	@EventHandler
	public void postinit(FMLServerStartingEvent event, EntityPlayer player)
	{

		FMLLog.info("[TRANSCRAFT]	Adding new commands");
		event.registerServerCommand(new CommandTranscraftVersion());

	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{

		FMLLog.info("[TRANSCRAFT]	Adding gui hander");
		NetworkRegistry.instance().registerGuiHandler(instance, new GuiHanderTC());

		FMLLog.info("[TRANSCRAFT]	Adding new dims");
		// LoadDim.load();

	}

	public static CreativeTabs TranstabItems = new CreativeTabs("TranstabItems")
	{

		@Override
		public ItemStack getIconItemStack()
		{
			return new ItemStack(EnderSword, 1, 0);

		}

	};
	public static CreativeTabs TranstabBlocks = new CreativeTabs("TranstabBlocks")
	{

		@Override
		public ItemStack getIconItemStack()
		{
			return new ItemStack(TranscraftOre, 1, 0);
		}

	};

}