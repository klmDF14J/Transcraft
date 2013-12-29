package mark123mark.mods.transcraft;

import java.io.File;

import net.minecraftforge.common.MinecraftForge;
import mark123mark.mods.transcraft.helpers.ServerTickHandler;
import mark123mark.mods.transcraft.helpers.TickHandler;
import cpw.mods.fml.relauncher.Side;

public class TranscraftCommonProxy {

	public static File getMinecraftDir() {
		return new File(".");
	}

	public void registerHandlers() {
		
		
	}

	public void registerTickHandlers() {
		MinecraftForge.EVENT_BUS.register(new TickHandler());
		MinecraftForge.EVENT_BUS.register(new ServerTickHandler());
	}

	public void register() {

	}

	public void spawnParticle(String string, double x, double y, double z) {
	}
	
	
	public void renderThings()
	{
		
	}
	
}