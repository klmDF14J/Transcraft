package mark123mark.mods.transcraft.Blocks;

import java.util.Random;

import mark123mark.mods.transcraft.Config;
import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DriedTransmutter extends Block
{

	public DriedTransmutter(int par1) 
	{
		super(par1, Material.rock);
	}

	public int idDropped(int par1, Random random, int zero) {
        return Config.LiquidTransmutterFluidStillID;
}
	
	 protected boolean canSilkHarvest()
	    {
	        return true;
	    }
}
