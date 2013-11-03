package mark123mark.mods.transcraft.WorldGen.TransManaia;

import java.util.Random;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EscapePortal extends WorldGenerator
{
    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        while (par1World.isAirBlock(par3, par4, par5) && par4 > 2)
        {
            --par4;
        }

        int l = par1World.getBlockId(par3, par4, par5);

        if (l != Transcraft.RedenderQuartz.blockID)
        {
            return false;
        }
        else
        {
            int i1;
            int j1;

            for (i1 = -2; i1 <= 2; ++i1)
            {
                for (j1 = -2; j1 <= 2; ++j1)
                {
                    if (par1World.isAirBlock(par3 + i1, par4 - 1, par5 + j1) && par1World.isAirBlock(par3 + i1, par4 - 2, par5 + j1))
                    {
                        return false;
                    }
                }
            }

            for (i1 = -1; i1 <= 0; ++i1)
            {
                for (j1 = -2; j1 <= 2; ++j1)
                {
                    for (int k1 = -2; k1 <= 2; ++k1)
                    {
                        par1World.setBlock(par3 + j1, par4 + i1, par5 + k1, Transcraft.RedenderQuartz.blockID, 0, 2);
                    }
                }
            }

            par1World.setBlock(par3, par4, par5, Transcraft.DimPortalBlock.blockID, 0, 2);
            par1World.setBlock(par3 - 1, par4, par5, Transcraft.DimPortalBlock.blockID, 0, 2);
            par1World.setBlock(par3 + 1, par4, par5, Transcraft.DimPortalBlock.blockID, 0, 2);
            par1World.setBlock(par3, par4, par5 - 1, Transcraft.DimPortalBlock.blockID, 0, 2);
            par1World.setBlock(par3, par4, par5 + 1, Transcraft.DimPortalBlock.blockID, 0, 2);

            for (i1 = -2; i1 <= 2; ++i1)
            {
                for (j1 = -2; j1 <= 2; ++j1)
                {
                    if (i1 == -2 || i1 == 2 || j1 == -2 || j1 == 2)
                    {
                        par1World.setBlock(par3 + i1, par4 + 1, par5 + j1, Block.sandStone.blockID, 0, 2);
                    }
                }
            }

            par1World.setBlock(par3 + 2, par4 + 1, par5, Transcraft.RedenderQuartz.blockID, 1, 2);
            par1World.setBlock(par3 - 2, par4 + 1, par5, Transcraft.RedenderQuartz.blockID, 1, 2);
            par1World.setBlock(par3, par4 + 1, par5 + 2, Transcraft.RedenderQuartz.blockID, 1, 2);
            par1World.setBlock(par3, par4 + 1, par5 - 2, Transcraft.RedenderQuartz.blockID, 1, 2);

            for (i1 = -1; i1 <= 1; ++i1)
            {
                for (j1 = -1; j1 <= 1; ++j1)
                {
                    if (i1 == 0 && j1 == 0)
                    {
                        par1World.setBlock(par3 + i1, par4 + 4, par5 + j1, Transcraft.RedenderQuartz.blockID, 0, 2);
                    }
                    else
                    {
                        par1World.setBlock(par3 + i1, par4 + 4, par5 + j1, Transcraft.RedenderQuartz.blockID, 1, 2);
                    }
                }
            }

            for (i1 = 1; i1 <= 3; ++i1)
            {
                par1World.setBlock(par3 - 1, par4 + i1, par5 - 1, Transcraft.RedenderQuartz.blockID, 0, 2);
                par1World.setBlock(par3 - 1, par4 + i1, par5 + 1, Transcraft.RedenderQuartz.blockID, 0, 2);
                par1World.setBlock(par3 + 1, par4 + i1, par5 - 1, Transcraft.RedenderQuartz.blockID, 0, 2);
                par1World.setBlock(par3 + 1, par4 + i1, par5 + 1, Transcraft.RedenderQuartz.blockID, 0, 2);
            }

            return true;
        }
    }

}
