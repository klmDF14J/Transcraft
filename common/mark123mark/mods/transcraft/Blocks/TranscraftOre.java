package mark123mark.mods.transcraft.Blocks;

import java.util.Random;

import mark123mark.mods.transcraft.Renders.particles.OreParticle;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TranscraftOre extends Block
{
	public static Minecraft mc = Minecraft.getMinecraft();
	public TranscraftOre(int par1)
	{
		super(par1, Material.rock);
	}


	 
	@Override
	@SideOnly(Side.CLIENT)
	
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{

		if (Minecraft.isFancyGraphicsEnabled())
		{
			for (int l = 0; l < 20; ++l)
			{
				double d0 = par2 + par5Random.nextFloat();
				double d1 = par3 + par5Random.nextFloat();
				d0 = par4 + par5Random.nextFloat();
				double d2 = 0.0D;
				double d3 = 0.0D;
				double d4 = 0.0D;
				int i1 = par5Random.nextInt(2) * 2 - 1;
				int j1 = par5Random.nextInt(2) * 2 - 1;
				d2 = (par5Random.nextFloat() - .5D) * 0.125D;
				d3 = (par5Random.nextFloat() - 0.5D) * 0.125D;
				d4 = (par5Random.nextFloat() - 0.5D) * 0.125D;
				double d5 = par4 + 0.5D + 0.25D * j1;
				d4 = par5Random.nextFloat() * 1.0F * j1;
				double d6 = par2 + 0.5D + 0.25D * i1;
				d2 = par5Random.nextFloat() * 1.0F * i1;
				par1World.spawnParticle("portal", d6, d1, d5, d2, d3, d4);
			}

		}

	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
    public int getBlockColor()
    {

        return 0x07D7FF;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	    /**
	     * Returns the color this block should be rendered. Used by leaves.
	     */
	    public int getRenderColor(int par1)
	    {
	        return 0x07D7FF;
	    }

	@Override
	@SideOnly(Side.CLIENT)

	    /**
	     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
	     * when first determining what to render.
	     */
	    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	    {
	        return 0x07D7FF;
	    }
}
