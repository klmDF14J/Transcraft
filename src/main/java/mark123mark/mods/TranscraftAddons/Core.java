package mark123mark.mods.TranscraftAddons;

import mark123mark.mods.transcraft.Transcraft;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "TranscraftAddons", name = "TranscraftAddons", version = Transcraft.VERSION
		+ Transcraft.STATE, dependencies = "required-after:transcraft")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Core {

	@SidedProxy(clientSide = "mark123mark.mods.TranscraftAddons.ClientProxy", serverSide = "mark123mark.mods.TranscraftAddons.CommonProxy")
	public static CommonProxy Coproxy;
	public static ClientProxy Clproxy;

	@Instance("TranscraftAddons")
	public static Core instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			if (Loader.isModLoaded("NotEnoughItems"))
			{
				if (Loader.isModLoaded("CodeChickenCore"))
				{

					AddonNEILoad.StartNei();

					FMLLog.info("[Transcraft Addons]	NotEnoughItems was detected!");
				}
			}

		}

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		FMLLog.info("[Transcraft Addons]	Starting Transcraft Addons verison "
				+ Transcraft.VERSION + Transcraft.STATE);

		if (Loader.isModLoaded("IC2")) {
			FMLLog.info("[Transcraft Addons]	IC2 was detected!");
			AddonIC2.addIC2();

		}

	}

	@EventHandler
	public void load(FMLInitializationEvent event) {

		if (Loader.isModLoaded("ForgeMultipart")) {
			FMLLog.info("[Transcraft Addons]	ForgeMultipart was detected!");

			AddonFMP.registerBlocks();

		}

	}

}
