package mark123mark.mods.TranscraftAddons;


import mark123mark.mods.transcraft.CommandTranscraftVersion;
import mark123mark.mods.transcraft.Config;
import mark123mark.mods.transcraft.DevMessage;
import mark123mark.mods.transcraft.FuelHandler;
import mark123mark.mods.transcraft.PacketHandlerTranscraft;
import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.TranscraftClientProxy;
import mark123mark.mods.transcraft.TranscraftCommonProxy;
import mark123mark.mods.transcraft.TranscraftFluids;
import mark123mark.mods.transcraft.TranscraftGenerator;
import mark123mark.mods.transcraft.Blocks.ThinCrystalGlass;
import mark123mark.mods.transcraft.Blocks.TranscraftOre;
import mark123mark.mods.transcraft.Items.BasicTransmuter;
import mark123mark.mods.transcraft.TileEntitys.Transcrafter.RecipesTC;
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
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;




@Mod(modid="TranscraftAddons", name="TranscraftAddons", version=Transcraft.VERSION + Transcraft.STATE)// , dependencies = "required-after:transcraft")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Core {

		@Instance("TranscraftAddons")
		public static Core instance;
		
		@PreInit
		public void preInit(FMLPreInitializationEvent event) {
			

			FMLLog.info("[Transcraft Addons]	Starting Transcraft Addons verison " + Transcraft.VERSION + Transcraft.STATE);
			
			if (Loader.isModLoaded("Thaumcraft"))
	        {
				FMLLog.info("[Transcraft Addons]	Thaumcraft was detected!");
				
	        }
	       
		}
		
		@Init
		public void init(FMLInitializationEvent event) {
			
			if (Loader.isModLoaded("transcraft"))
	        {
				
	        }
			else
			{
				FMLLog.info("[Transcraft Addons]	TRANSCRAFT was NOT detected!");
				FMLLog.info("[Transcraft Addons]	TRANSCRAFT Addons WILL NOT WORK!");
				
				
			}
			
			
		
			
			if (Loader.isModLoaded("IC2"))
	        {
				FMLLog.info("[Transcraft Addons]	IC2 was detected!");
				AddonIC2.addIC2();
				
	        }
	       
			
			if (Loader.isModLoaded("AppliedEnergistics"))
	        {
				FMLLog.info("[Transcraft Addons]	AppliedEnergistics was detected!");
				AddonAE.addAE();
				
	        }
			
			if (Loader.isModLoaded("Railcraft"))
	        {
				FMLLog.info("[Transcraft Addons]	Railcraft was detected!");
				
				
	        }
		}

		@PostInit
		public static void postInit(FMLPostInitializationEvent event) {
			//Not much here!
		}
	
	
}
