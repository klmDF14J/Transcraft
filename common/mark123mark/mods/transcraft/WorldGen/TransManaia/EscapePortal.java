package mark123mark.mods.transcraft.WorldGen.TransManaia;

import java.util.Random;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.WorldGen.FishyWorldGenBase;
import net.minecraft.block.Block;
import net.minecraft.world.World;

public class EscapePortal extends FishyWorldGenBase
{

	public EscapePortal(World worldObj, Random rand)
	{
		super(worldObj, rand);
	}

	@Override
	public void generate(int i, int j, int k)
	{
		j = getTerrainHeightAt(i, k);

		int radius = rand.nextInt(6) + 6;

		genCircle(i, j, k, Block.stone.blockID, 0, radius, 0, 3, true);

		float pillarRadius = radius * .8F;
		float angle = rand.nextFloat() * 6;
		float step = (float) (6.28318531 / (radius / 2));
		for (int n = 0; n < radius / 2; n++)
		{
			int x = (int) (Math.sin(angle) * pillarRadius);
			int z = (int) (Math.cos(angle) * pillarRadius);
			// fillDown(x + i, getTerrainHeightAt(x + i, z + k) +
			// rand.nextInt(3) + 3, z + k,
			// Transcraft.DimPortalEscapeBlock.blockID, 0);
			angle += step;
		}

		int towerHeight = rand.nextInt(4) + 4;
		// fillDown(i, j + towerHeight + 3, k,
		// Transcraft.DimPortalEscapeBlock.blockID, 0);
		// fillDown(i + 1, j + towerHeight, k,
		// Transcraft.DimPortalEscapeBlock.blockID, 0);
		// fillDown(i - 1, j + towerHeight, k,
		// Transcraft.DimPortalEscapeBlock.blockID, 0);
		// fillDown(i, j + towerHeight, k + 1,
		// Transcraft.DimPortalEscapeBlock.blockID, 0);
		// fillDown(i, j + towerHeight, k - 1,
		// Transcraft.DimPortalEscapeBlock.blockID, 0);

	}

}
