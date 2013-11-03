package mark123mark.mods.transcraft;

import mark123mark.mods.transcraft.Blocks.ThinCrystalGlass;
import mark123mark.mods.transcraft.Blocks.TranscraftOre;
import mark123mark.mods.transcraft.Blocks.TransDim.TransDimGrass;
import mark123mark.mods.transcraft.Entitys.mob.Enderbat;
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
import mark123mark.mods.transcraft.biomes.transmania.FlatLands;
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
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLCommonHandler;
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
	public static final String VERSION = "1.6.4_V1.1.0_";
	public static final String STATE = "Release";
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
	
	public static Block DimPortalBlock;
	
	public static Block TransDimGrass= (new TransDimGrass(Config.TransDimGrassID))
			.setUnlocalizedName("Transcraft:TransDimGrass").setHardness(0.6F).setStepSound(Block.soundGrassFootstep)
			.setTextureName("Transcraft:Trans_grass")
			.setCreativeTab(Transcraft.TranstabBlocks);
	
	public static final BiomeGenBase FlatLands = (new FlatLands(1)).setBiomeName("TransLands").setDisableRain();
	
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
	
	
	public static EnumToolMaterial PlasticTool = EnumHelper.addToolMaterial(
			"PlasticTool", 2, 750, 5.0F, 2, 0);
	public static EnumToolMaterial BunkerToolEnum = EnumHelper.addToolMaterial(
			"BunkerToolEnum", 4, 1000, 20.0F, 4, 0);
	public static EnumToolMaterial EnderToolEnum = EnumHelper.addToolMaterial(
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

		FMLLog.info("[TRANSCRAFT]	Starting Transcraft verison " + Transcraft.VERSION);

		FMLLog.info("[TRANSCRAFT]	Loading Handlers");
		Coproxy.registerHandlers();
		Coproxy.registerTickHandlers();

		FMLLog.info("[TRANSCRAFT]	Loading Config");
		Config.initConfig();

		FMLLog.info("[TRANSCRAFT]	Loading Blocks");
		LoadBlocks.LoadBlocks();
		
		FMLLog.info("[TRANSCRAFT]	Registering Blocks");
		RegisterBlocks.RegisterBlocks();

		FMLLog.info("[TRANSCRAFT]	Loading Fluids");
		TranscraftFluids.init();

		FMLLog.info("[TRANSCRAFT]	Loading Items");
		LoadItems.LoadItems();
		
		FMLLog.info("[TRANSCRAFT]	Loading Block Settings");
		LoadBlockSettings.LoadSet();		

		FMLLog.info("[TRANSCRAFT]	Adding Recipes");
		RecipeLoader.LoadRecipe();
		
		FMLLog.info("[TRANSCRAFT]	Registering Items with the LanguageRegistry");
		LoadLang.loadlang();

		FMLLog.info("[TRANSCRAFT]	Loading entitys");
		LoadEntity.loadentity();
		

     
	}

	
	
	
	@EventHandler
	public void init(FMLInitializationEvent event) {

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
		
	}


	
	
	public static void oreRegistration() {
		
		FMLLog.info("[TRANSCRAFT]	Adding Ore dic support");
		LoadOreDics.oredic();
		
	}

	@ForgeSubscribe
	@EventHandler
	public void onServerStarting(FMLServerStartingEvent event , EntityPlayer player) {
		
		FMLLog.info("[TRANSCRAFT]	Adding new commands");
		event.registerServerCommand(new CommandTranscraftVersion());
		
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		FMLLog.info("[TRANSCRAFT]	Adding gui hander");
		NetworkRegistry.instance().registerGuiHandler(instance,new GuiHanderTC());
		
		LoadDim.load();
		
		
	}

	public static CreativeTabs TranstabItems = new CreativeTabs("TranstabItems") {
		public ItemStack getIconItemStack() {
			return new ItemStack(EnderSword, 1, 0);

		}

	};
	public static CreativeTabs TranstabBlocks = new CreativeTabs("TranstabBlocks") {
		public ItemStack getIconItemStack() {
			return new ItemStack(TranscraftOre, 1, 0);
		}

	};
	
}