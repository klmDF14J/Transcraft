package mark123mark.mods.transcraft.Blocks.TransDim;

import java.util.Random;

import mark123mark.mods.transcraft.Config;
import mark123mark.mods.transcraft.TransDim.DimTp;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EscapePortalBlock extends Block
{
	public EscapePortalBlock(int par1)
	{
		super(par1, Material.portal);
	}


	@Override
	@SideOnly(Side.CLIENT)

	/**
	 * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
	 */
	public int getRenderBlockPass()
	{
		return 1;
	}

	@Override
	@SideOnly(Side.CLIENT)

	/**
	 * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
	 * coordinates.  Args: blockAccess, x, y, z, side
	 */
	public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
	{
		return super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, 1 - par5);
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		return null;
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	 * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	 */
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		if (par5Entity.ridingEntity == null && par5Entity.riddenByEntity == null)
		{
			if (par5Entity instanceof EntityPlayerMP)
			{
				EntityPlayerMP thePlayer = (EntityPlayerMP) par5Entity;
				if (par5Entity.dimension != Config.DimID)
				{
					thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, Config.DimID, new DimTp(thePlayer.mcServer.worldServerForDimension(Config.DimID)));
				}
				else
				{
					thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new DimTp(thePlayer.mcServer.worldServerForDimension(0)));
				}
			}
		}
	}

	 @SideOnly(Side.CLIENT)

	    /**
	     * A randomly called display update to be able to add particles or other items for display
	     */
	    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	    {
	    	
	    	
	    		for (int l = 0; l < 20; ++l)
	            {
	                double d0 = (double)((float)par2 + par5Random.nextFloat());
	                double d1 = (double)((float)par3 + par5Random.nextFloat());
	                d0 = (double)((float)par4 + par5Random.nextFloat());
	                double d2 = 0.0D;
	                double d3 = 0.0D;
	                double d4 = 0.0D;
	                int i1 = par5Random.nextInt(2) * 2 - 1;
	                int j1 = par5Random.nextInt(2) * 2 - 1;
	                d2 = ((double)par5Random.nextFloat() - .5D) * 0.125D;
	                d3 = ((double)par5Random.nextFloat() - 0.5D) * 0.125D;
	                d4 = ((double)par5Random.nextFloat() - 0.5D) * 0.125D;
	                double d5 = (double)par4 + 0.5D + 0.25D * (double)j1;
	                d4 = (double)(par5Random.nextFloat() * 1.0F * (float)j1);
	                double d6 = (double)par2 + 0.5D + 0.25D * (double)i1;
	                d2 = (double)(par5Random.nextFloat() * 1.0F * (float)i1);
	                par1World.spawnParticle("portal", d6, d1, d5, d2, d3, d4);
	    	
	        
	        }
	
	}

}
