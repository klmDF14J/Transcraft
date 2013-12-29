package mark123mark.mods.transcraft.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TranscraftOre extends Block {
	public static Minecraft mc = Minecraft.getMinecraft();

	public TranscraftOre(int par1) {
		super(Material.field_151576_e);
	}

	@SideOnly(Side.CLIENT)
    public void func_149734_b(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
    {
       if(Minecraft.isFancyGraphicsEnabled())
       {
    	   for (int l = 0; l < 4; ++l)
           {
               double d0 = (double)((float)p_149734_2_ + p_149734_5_.nextFloat());
               double d1 = (double)((float)p_149734_3_ + p_149734_5_.nextFloat());
               double d2 = (double)((float)p_149734_4_ + p_149734_5_.nextFloat());
               double d3 = 0.0D;
               double d4 = 0.0D;
               double d5 = 0.0D;
               int i1 = p_149734_5_.nextInt(2) * 2 - 1;
               d3 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;
               d4 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;
               d5 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;

               if (p_149734_1_.func_147439_a(p_149734_2_ - 1, p_149734_3_, p_149734_4_) != this && p_149734_1_.func_147439_a(p_149734_2_ + 1, p_149734_3_, p_149734_4_) != this)
               {
                   d0 = (double)p_149734_2_ + 0.5D + 0.25D * (double)i1;
                   d3 = (double)(p_149734_5_.nextFloat() * 2.0F * (float)i1);
               }
               else
               {
                   d2 = (double)p_149734_4_ + 0.5D + 0.25D * (double)i1;
                   d5 = (double)(p_149734_5_.nextFloat() * 2.0F * (float)i1);
               }

               p_149734_1_.spawnParticle("portal", d0, d1, d2, d3, d4, d5);
           }
       }
        
    }

}
