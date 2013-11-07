package mark123mark.mods.transcraft.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GalssStair extends BlockStairs
{

	public GalssStair(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
		
		this.useNeighborBrightness[blockID] = true;
	}


	 
	    @SideOnly(Side.CLIENT)

	    /**
	     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
	     */
	    public int getRenderBlockPass()
	    {
	        return 0;
	    }

	    /**
	     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	     */
	    public boolean isOpaqueCube()
	    {
	        return false;
	    }

	    /**
	     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	     */
	    public boolean renderAsNormalBlock()
	    {
	        return false;
	    }

	    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) //Renders neighbouring blocks
	    {

	    int i = par1IBlockAccess.getBlockId(par2, par3, par4);

	    return i == blockID ? false:true;
	    }
}


