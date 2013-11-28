package mark123mark.mods.transcraft.TileEntitys.Transcrafter;

import java.util.Random;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;



public class Transcrafter  extends BlockContainer
{
	public int multiblock;
	public static Icon[] icons = new Icon[16];
	private boolean shouldRenderSelectionBox = true;
    protected String folder;
    private int renderPass;
    
	
	public Transcrafter(int id, String location ,boolean hasAlpha)
    
	
	{
		super(id, Material.rock);
		this.setStepSound(Block.soundStoneFootstep);
		this.setHardness(2F);
		
		renderPass = hasAlpha ? 1 : 0;
	}
	

	
	
	@Override
	public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p, int par6, float par7, float par8, float par9)
	{
		this.isMuliBlock(w, x, y, z);
		w.markBlockForUpdate(x, y, z);
		if(this.multiblock == 1)
		{
			if(p.isSneaking())
			{
				return true;
			}
			else
			{
				p.openGui(Transcraft.instance, 1, w, x, y, z);
			}
		}
		else
		{
			return true;
		}
		
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world)
	{
		return new TileTC();
	}

	public Block setTickRandomly(boolean par1)
    {
        this.needsRandomTick = true;
        return this;
    }
	
	@Override
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		this.isMuliBlock(par1World, par2, par3, par4);
	}
	
	
	 @Override
     public void onNeighborBlockChange(World world, int x, int y, int z, int id) {
             super.onNeighborBlockChange(world, x, y, z, id);
             this.isMuliBlock(world, x, y, z);
             world.markBlockForUpdate(x, y, z);
     }
	
	 
	 @Override
	 public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
	    {

		 this.isMuliBlock(par1World, par2, par3, par4);
	    }
	 
	 @Override
	 public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
	    {
		 this.isMuliBlock(par1World, par2, par3, par4);
		 par1World.markBlockForUpdate(par2, par3, par4);
		return 0;
	    }
	 
	@Override
    public int getRenderBlockPass ()
    {
        return renderPass;
    }
	
	
	/**
     * This is checked to see if the texture should connect to this block
     * @param par2 x
     * @param par3 y
     * @param par4 z
     * @param par5 ID this block is asking to connect to (may be 0 if there is no block)
     * @param par6 Metadata of the block this block is trying to connect to
     * @return true if should connect
     */
    public boolean shouldConnectToBlock (IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5, int par6)
    {
    	return par5 == this.blockID;
    }

    
    public Boolean isMuliBlock(World w, int x, int y, int z)
    {
    	if(w.getBlockId(x, y, z) == Transcraft.Transcrafter.blockID && w.getBlockId(x, y - 1, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x -1, y, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y, z -1 ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y -1, z -1 ) == Transcraft.Transcrafter.blockID&& w.getBlockId(x -1 , y -1, z ) == Transcraft.Transcrafter.blockID)
	    {
	      multiblock = 1;
	
	    }
	    else
	    {
	    	if(w.getBlockId(x, y, z) == Transcraft.Transcrafter.blockID && w.getBlockId(x, y + 1, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x -1, y, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y, z -1 ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y +1, z -1 ) == Transcraft.Transcrafter.blockID&& w.getBlockId(x -1 , y +1, z ) == Transcraft.Transcrafter.blockID)
		    {
		      multiblock = 1;
		
		    }
		    else
		    {
		    	if(w.getBlockId(x, y, z) == Transcraft.Transcrafter.blockID && w.getBlockId(x, y + 1, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x -1, y, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y, z +1 ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y +1, z +1 ) == Transcraft.Transcrafter.blockID&& w.getBlockId(x -1 , y +1, z ) == Transcraft.Transcrafter.blockID)
			    {
			      multiblock = 1;
			
			    }
			    else
			    {
			    	if(w.getBlockId(x, y, z) == Transcraft.Transcrafter.blockID && w.getBlockId(x, y - 1, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x -1, y, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y, z +1 ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y -1, z +1 ) == Transcraft.Transcrafter.blockID&& w.getBlockId(x -1 , y -1, z ) == Transcraft.Transcrafter.blockID)
				    {
				      multiblock = 1;
				
				    }
				    else
				    {
				    	if(w.getBlockId(x, y, z) == Transcraft.Transcrafter.blockID && w.getBlockId(x, y - 1, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x +1, y, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y, z -1 ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y -1, z -1 ) == Transcraft.Transcrafter.blockID&& w.getBlockId(x +1 , y -1, z ) == Transcraft.Transcrafter.blockID)
					    {
					      multiblock = 1;
					
					    }
					    else
					    {
					    	if(w.getBlockId(x, y, z) == Transcraft.Transcrafter.blockID && w.getBlockId(x, y + 1, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x +1, y, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y, z -1 ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y +1, z -1 ) == Transcraft.Transcrafter.blockID&& w.getBlockId(x +1 , y +1, z ) == Transcraft.Transcrafter.blockID)
						    {
						      multiblock = 1;
						
						    }
						    else
						    {
						    	if(w.getBlockId(x, y, z) == Transcraft.Transcrafter.blockID && w.getBlockId(x, y - 1, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x +1, y, z ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y, z +1 ) == Transcraft.Transcrafter.blockID && w.getBlockId(x , y -1, z +1 ) == Transcraft.Transcrafter.blockID&& w.getBlockId(x +1 , y -1, z ) == Transcraft.Transcrafter.blockID)
							    {
							      multiblock = 1;
							
							    }
							    else
							    {
							    	multiblock = 0;
							    }
						    }
					    }
				    }
			    }
		    }
	    }
		return true;
    }
 
    
    
    @Override
    public Icon getBlockTexture (IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return getConnectedBlockTexture(par1IBlockAccess, par2, par3, par4, par5, icons);
    }

    public Icon getConnectedBlockTexture (IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5, Icon[] icons)
    {
     
    	
    	
    	if(this.multiblock == 1)
		{
			
        	boolean isOpenUp = false, isOpenDown = false, isOpenLeft = false, isOpenRight = false;

            switch (par5)
            {
            case 0:
                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4)))
                {
                    isOpenDown = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4)))
                {
                    isOpenUp = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1)))
                {
                    isOpenLeft = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1)))
                {
                    isOpenRight = true;
                }

                if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight)
                {
                    return icons[15];
                }
                else if (isOpenUp && isOpenDown && isOpenLeft)
                {
                    return icons[11];
                }
                else if (isOpenUp && isOpenDown && isOpenRight)
                {
                    return icons[12];
                }
                else if (isOpenUp && isOpenLeft && isOpenRight)
                {
                    return icons[13];
                }
                else if (isOpenDown && isOpenLeft && isOpenRight)
                {
                    return icons[14];
                }
                else if (isOpenDown && isOpenUp)
                {
                    return icons[5];
                }
                else if (isOpenLeft && isOpenRight)
                {
                    return icons[6];
                }
                else if (isOpenDown && isOpenLeft)
                {
                    return icons[8];
                }
                else if (isOpenDown && isOpenRight)
                {
                    return icons[10];
                }
                else if (isOpenUp && isOpenLeft)
                {
                    return icons[7];
                }
                else if (isOpenUp && isOpenRight)
                {
                    return icons[9];
                }
                else if (isOpenDown)
                {
                    return icons[3];
                }
                else if (isOpenUp)
                {
                    return icons[4];
                }
                else if (isOpenLeft)
                {
                    return icons[2];
                }
                else if (isOpenRight)
                {
                    return icons[1];
                }
                break;
            case 1:
                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4)))
                {
                    isOpenDown = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4)))
                {
                    isOpenUp = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1)))
                {
                    isOpenLeft = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1)))
                {
                    isOpenRight = true;
                }

                if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight)
                {
                    return icons[15];
                }
                else if (isOpenUp && isOpenDown && isOpenLeft)
                {
                    return icons[11];
                }
                else if (isOpenUp && isOpenDown && isOpenRight)
                {
                    return icons[12];
                }
                else if (isOpenUp && isOpenLeft && isOpenRight)
                {
                    return icons[13];
                }
                else if (isOpenDown && isOpenLeft && isOpenRight)
                {
                    return icons[14];
                }
                else if (isOpenDown && isOpenUp)
                {
                    return icons[5];
                }
                else if (isOpenLeft && isOpenRight)
                {
                    return icons[6];
                }
                else if (isOpenDown && isOpenLeft)
                {
                    return icons[8];
                }
                else if (isOpenDown && isOpenRight)
                {
                    return icons[10];
                }
                else if (isOpenUp && isOpenLeft)
                {
                    return icons[7];
                }
                else if (isOpenUp && isOpenRight)
                {
                    return icons[9];
                }
                else if (isOpenDown)
                {
                    return icons[3];
                }
                else if (isOpenUp)
                {
                    return icons[4];
                }
                else if (isOpenLeft)
                {
                    return icons[2];
                }
                else if (isOpenRight)
                {
                    return icons[1];
                }
                break;
            case 2:
                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4)))
                {
                    isOpenDown = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4)))
                {
                    isOpenUp = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4)))
                {
                    isOpenLeft = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4)))
                {
                    isOpenRight = true;
                }

                if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight)
                {
                    return icons[15];
                }
                else if (isOpenUp && isOpenDown && isOpenLeft)
                {
                    return icons[13];
                }
                else if (isOpenUp && isOpenDown && isOpenRight)
                {
                    return icons[14];
                }
                else if (isOpenUp && isOpenLeft && isOpenRight)
                {
                    return icons[11];
                }
                else if (isOpenDown && isOpenLeft && isOpenRight)
                {
                    return icons[12];
                }
                else if (isOpenDown && isOpenUp)
                {
                    return icons[6];
                }
                else if (isOpenLeft && isOpenRight)
                {
                    return icons[5];
                }
                else if (isOpenDown && isOpenLeft)
                {
                    return icons[9];
                }
                else if (isOpenDown && isOpenRight)
                {
                    return icons[10];
                }
                else if (isOpenUp && isOpenLeft)
                {
                    return icons[7];
                }
                else if (isOpenUp && isOpenRight)
                {
                    return icons[8];
                }
                else if (isOpenDown)
                {
                    return icons[1];
                }
                else if (isOpenUp)
                {
                    return icons[2];
                }
                else if (isOpenLeft)
                {
                    return icons[4];
                }
                else if (isOpenRight)
                {
                    return icons[3];
                }
                break;
            case 3:
                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4)))
                {
                    isOpenDown = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4)))
                {
                    isOpenUp = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4)))
                {
                    isOpenLeft = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4)))
                {
                    isOpenRight = true;
                }

                if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight)
                {
                    return icons[15];
                }
                else if (isOpenUp && isOpenDown && isOpenLeft)
                {
                    return icons[14];
                }
                else if (isOpenUp && isOpenDown && isOpenRight)
                {
                    return icons[13];
                }
                else if (isOpenUp && isOpenLeft && isOpenRight)
                {
                    return icons[11];
                }
                else if (isOpenDown && isOpenLeft && isOpenRight)
                {
                    return icons[12];
                }
                else if (isOpenDown && isOpenUp)
                {
                    return icons[6];
                }
                else if (isOpenLeft && isOpenRight)
                {
                    return icons[5];
                }
                else if (isOpenDown && isOpenLeft)
                {
                    return icons[10];
                }
                else if (isOpenDown && isOpenRight)
                {
                    return icons[9];
                }
                else if (isOpenUp && isOpenLeft)
                {
                    return icons[8];
                }
                else if (isOpenUp && isOpenRight)
                {
                    return icons[7];
                }
                else if (isOpenDown)
                {
                    return icons[1];
                }
                else if (isOpenUp)
                {
                    return icons[2];
                }
                else if (isOpenLeft)
                {
                    return icons[3];
                }
                else if (isOpenRight)
                {
                    return icons[4];
                }
                break;
            case 4:
                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4)))
                {
                    isOpenDown = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4)))
                {
                    isOpenUp = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1)))
                {
                    isOpenLeft = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1)))
                {
                    isOpenRight = true;
                }

                if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight)
                {
                    return icons[15];
                }
                else if (isOpenUp && isOpenDown && isOpenLeft)
                {
                    return icons[14];
                }
                else if (isOpenUp && isOpenDown && isOpenRight)
                {
                    return icons[13];
                }
                else if (isOpenUp && isOpenLeft && isOpenRight)
                {
                    return icons[11];
                }
                else if (isOpenDown && isOpenLeft && isOpenRight)
                {
                    return icons[12];
                }
                else if (isOpenDown && isOpenUp)
                {
                    return icons[6];
                }
                else if (isOpenLeft && isOpenRight)
                {
                    return icons[5];
                }
                else if (isOpenDown && isOpenLeft)
                {
                    return icons[10];
                }
                else if (isOpenDown && isOpenRight)
                {
                    return icons[9];
                }
                else if (isOpenUp && isOpenLeft)
                {
                    return icons[8];
                }
                else if (isOpenUp && isOpenRight)
                {
                    return icons[7];
                }
                else if (isOpenDown)
                {
                    return icons[1];
                }
                else if (isOpenUp)
                {
                    return icons[2];
                }
                else if (isOpenLeft)
                {
                    return icons[3];
                }
                else if (isOpenRight)
                {
                    return icons[4];
                }
                break;
            case 5:
                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4)))
                {
                    isOpenDown = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4)))
                {
                    isOpenUp = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1)))
                {
                    isOpenLeft = true;
                }

                if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlockId(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1)))
                {
                    isOpenRight = true;
                }

                if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight)
                {
                    return icons[15];
                }
                else if (isOpenUp && isOpenDown && isOpenLeft)
                {
                    return icons[13];
                }
                else if (isOpenUp && isOpenDown && isOpenRight)
                {
                    return icons[14];
                }
                else if (isOpenUp && isOpenLeft && isOpenRight)
                {
                    return icons[11];
                }
                else if (isOpenDown && isOpenLeft && isOpenRight)
                {
                    return icons[12];
                }
                else if (isOpenDown && isOpenUp)
                {
                    return icons[6];
                }
                else if (isOpenLeft && isOpenRight)
                {
                    return icons[5];
                }
                else if (isOpenDown && isOpenLeft)
                {
                    return icons[9];
                }
                else if (isOpenDown && isOpenRight)
                {
                    return icons[10];
                }
                else if (isOpenUp && isOpenLeft)
                {
                    return icons[7];
                }
                else if (isOpenUp && isOpenRight)
                {
                    return icons[8];
                }
                else if (isOpenDown)
                {
                    return icons[1];
                }
                else if (isOpenUp)
                {
                    return icons[2];
                }
                else if (isOpenLeft)
                {
                    return icons[4];
                }
                else if (isOpenRight)
                {
                    return icons[3];
                }
                break;
            }
    	}
    	
        return icons[0];
    }

    @Override
    public boolean shouldSideBeRendered (IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        int i1 = par1IBlockAccess.getBlockId(par2, par3, par4);
        return i1 == this.blockID ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }

    @Override
    public Icon getIcon (int par1, int par2)
    {
        return icons[0];
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBoxFromPool (World par1World, int par2, int par3, int par4)
    {
        if (shouldRenderSelectionBox)
        {
            return super.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
        }
        else
        {
            return AxisAlignedBB.getAABBPool().getAABB(0D, 0D, 0D, 0D, 0D, 0D);
        }
    }

    @Override
    public void registerIcons (IconRegister par1IconRegister)
    {
        icons[0] = par1IconRegister.registerIcon("Transcraft:tcraft/tc");
        icons[1] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_1_d");
        icons[2] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_1_u");
        icons[3] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_1_l");
        icons[4] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_1_r");
        icons[5] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_2_h");
        icons[6] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_2_v");
        icons[7] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_2_dl");
        icons[8] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_2_dr");
        icons[9] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_2_ul");
        icons[10] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_2_ur");
        icons[11] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_3_d");
        icons[12] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_3_u");
        icons[13] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_3_l");
        icons[14] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_3_r");
        icons[15] = par1IconRegister.registerIcon("Transcraft:tcraft/tc_4");
    }
	
}
