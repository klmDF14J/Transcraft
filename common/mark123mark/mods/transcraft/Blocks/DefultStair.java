package mark123mark.mods.transcraft.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class DefultStair extends BlockStairs
{

	public DefultStair(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
		
		this.useNeighborBrightness[blockID] = true;
	}


}
