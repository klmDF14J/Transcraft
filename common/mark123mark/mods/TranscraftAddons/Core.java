package mark123mark.mods.TranscraftAddons;


import mark123mark.mods.transcraft.Transcraft;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;




@Mod(modid="TranscraftAddons", name="TranscraftAddons", version=Transcraft.VERSION + Transcraft.STATE)// , dependencies = "required-after:transcraft")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Core {

	@SidedProxy(clientSide = "mark123mark.mods.TranscraftAddons.ClientProxy", serverSide = "mark123mark.mods.TranscraftAddons.CommonProxy")
	public static CommonProxy Coproxy;
	public static ClientProxy Clproxy;
	
	
		@Instance("TranscraftAddons")
		public static Core instance;
		
		@PreInit
		public void preInit(FMLPreInitializationEvent event) {
			

			FMLLog.info("[Transcraft Addons]	Starting Transcraft Addons verison " + Transcraft.VERSION + Transcraft.STATE);
			
			if (Loader.isModLoaded("Thaumcraft"))
	        {
				FMLLog.info("[Transcraft Addons]	Thaumcraft was detected!");
				
	        }
			
			if(Loader.isModLoaded("NotEnoughItems"))
			{
				Coproxy.registerNEI();
				FMLLog.info("[Transcraft Addons]	NotEnoughItems was detected!");
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
