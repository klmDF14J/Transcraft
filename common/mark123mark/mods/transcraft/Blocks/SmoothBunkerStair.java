package mark123mark.mods.transcraft.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class SmoothBunkerStair extends BlockStairs {

	public SmoothBunkerStair(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);

		Block.useNeighborBrightness[blockID] = true;
	}

}
