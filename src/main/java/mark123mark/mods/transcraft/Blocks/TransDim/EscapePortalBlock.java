package mark123mark.mods.transcraft.Blocks.TransDim;

import java.util.Random;

import mark123mark.mods.transcraft.TransDim.DimTpEscape;
import mark123mark.mods.transcraft.helpers.Config;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EscapePortalBlock extends Block {
	public EscapePortalBlock(int par1) {
		super(Material.portal);
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
	 */
	public int getRenderBlockPass() {
		return 1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
	 * coordinates.  Args: blockAccess, x, y, z, side
	 */
	public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess,
			int par2, int par3, int par4, int par5) {
		return super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4,
				1 - par5);
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this
	 * box can change after the pool has been cleared to be reused)
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World,
			int par2, int par3, int par4) {
		return null;
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube? This determines whether
	 * or not to render the shared face of two adjacent blocks and also whether
	 * the player can attach torches, redstone wire, etc to this block.
	 */
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3,
			int par4, Entity par5Entity) {
		if (par5Entity.ridingEntity == null
				&& par5Entity.riddenByEntity == null) {
			if (par5Entity instanceof EntityPlayerMP) {
				EntityPlayerMP thePlayer = (EntityPlayerMP) par5Entity;
				if (par5Entity.dimension != Config.DimID) {
					// thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer,
					// Config.DimID, new
					// DimTp(thePlayer.mcServer.worldServerForDimension(Config.DimID)));
				} else {
					thePlayer.mcServer.getConfigurationManager()
							.transferPlayerToDimension(
									thePlayer,
									0,
									new DimTpEscape(thePlayer.mcServer
											.worldServerForDimension(0)));
				}
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */
	public void randomDisplayTick(World par1World, int par2, int par3,
			int par4, Random par5Random) {

		for (int l = 0; l < 20; ++l) {
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
