package mark123mark.mods.transcraft.ixp.Tiles;

import java.util.Random;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class IXPGrinderMk2 extends BlockContainer
{
    private final Random random = new Random();

    /** Determines whether of not the chest is trapped. */
    public final int isTrapped;

    public IXPGrinderMk2(int par1, int par2)
    {
        super(par1, Material.wood);
        this.isTrapped = par2;
        this.setCreativeTab(Transcraft.TranstabBlocks);
        this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
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

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 22;
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        if (par1IBlockAccess.getBlockId(par2, par3, par4 - 1) == this.blockID)
        {
            this.setBlockBounds(0.0625F, 0.0F, 0.0F, 0.9375F, 0.875F, 0.9375F);
        }
        else if (par1IBlockAccess.getBlockId(par2, par3, par4 + 1) == this.blockID)
        {
            this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 1.0F);
        }
        else if (par1IBlockAccess.getBlockId(par2 - 1, par3, par4) == this.blockID)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
        }
        else if (par1IBlockAccess.getBlockId(par2 + 1, par3, par4) == this.blockID)
        {
            this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 1.0F, 0.875F, 0.9375F);
        }
        else
        {
            this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
        }
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
    {
        int l = par1World.getBlockId(par2, par3, par4 - 1);
        int i1 = par1World.getBlockId(par2, par3, par4 + 1);
        int j1 = par1World.getBlockId(par2 - 1, par3, par4);
        int k1 = par1World.getBlockId(par2 + 1, par3, par4);
        byte b0 = 0;
        int l1 = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l1 == 0)
        {
            b0 = 2;
        }

        if (l1 == 1)
        {
            b0 = 5;
        }

        if (l1 == 2)
        {
            b0 = 3;
        }

        if (l1 == 3)
        {
            b0 = 4;
        }

        if (l != this.blockID && i1 != this.blockID && j1 != this.blockID && k1 != this.blockID)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 3);
        }
       

        if (par6ItemStack.hasDisplayName())
        {
            ((TileIXP)par1World.getBlockTileEntity(par2, par3, par4)).setChestGuiName(par6ItemStack.getDisplayName());
        }
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        TileIXP tileentitychest = (TileIXP)par1World.getBlockTileEntity(par2, par3, par4);

        if (tileentitychest != null)
        {
            for (int j1 = 0; j1 < tileentitychest.getSizeInventory(); ++j1)
            {
                ItemStack itemstack = tileentitychest.getStackInSlot(j1);

                if (itemstack != null)
                {
                    float f = this.random.nextFloat() * 0.8F + 0.1F;
                    float f1 = this.random.nextFloat() * 0.8F + 0.1F;
                    EntityItem entityitem;

                    for (float f2 = this.random.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; par1World.spawnEntityInWorld(entityitem))
                    {
                        int k1 = this.random.nextInt(21) + 10;

                        if (k1 > itemstack.stackSize)
                        {
                            k1 = itemstack.stackSize;
                        }

                        itemstack.stackSize -= k1;
                        entityitem = new EntityItem(par1World, (double)((float)par2 + f), (double)((float)par3 + f1), (double)((float)par4 + f2), new ItemStack(itemstack.itemID, k1, itemstack.getItemDamage()));
                        float f3 = 0.05F;
                        entityitem.motionX = (double)((float)this.random.nextGaussian() * f3);
                        entityitem.motionY = (double)((float)this.random.nextGaussian() * f3 + 0.2F);
                        entityitem.motionZ = (double)((float)this.random.nextGaussian() * f3);

                        if (itemstack.hasTagCompound())
                        {
                            entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                        }
                    }
                }
            }

            par1World.func_96440_m(par2, par3, par4, par5);
        }

        super.breakBlock(par1World, par2, par3, par4, par5, par6);
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
            IInventory iinventory = this.getInventory(par1World, par2, par3, par4);

            if (iinventory != null)
            {
            	if(!par5EntityPlayer.isSneaking())
            	{
            		par5EntityPlayer.openGui(Transcraft.instance, 2, par1World, par2, par3, par4);
            	}
            	
            }

            return true;
        }
    }

    /**
     * Gets the inventory of the chest at the specified coords, accounting for blocks or ocelots on top of the chest,
     * and double chests.
     */
    public IInventory getInventory(World par1World, int par2, int par3, int par4)
    {
        Object object = (TileIXP)par1World.getBlockTileEntity(par2, par3, par4);

        if (object == null)
        {
            return null;
        }
        else if (par1World.isBlockSolidOnSide(par2, par3 + 1, par4, DOWN))
        {
            return null;
        }
        else if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && (par1World.isBlockSolidOnSide(par2 - 1, par3 + 1, par4, DOWN)))
        {
            return null;
        }
        else if (par1World.getBlockId(par2 + 1, par3, par4) == this.blockID && (par1World.isBlockSolidOnSide(par2 + 1, par3 + 1, par4, DOWN)))
        {
            return null;
        }
        else if (par1World.getBlockId(par2, par3, par4 - 1) == this.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 - 1, DOWN)))
        {
            return null;
        }
        else if (par1World.getBlockId(par2, par3, par4 + 1) == this.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 + 1, DOWN)))
        {
            return null;
        }
        else
        {
            if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID)
            {
                object = new InventoryLargeChest("container.chestDouble", (TileIXP)par1World.getBlockTileEntity(par2 - 1, par3, par4), (IInventory)object);
            }

            if (par1World.getBlockId(par2 + 1, par3, par4) == this.blockID)
            {
                object = new InventoryLargeChest("container.chestDouble", (IInventory)object, (TileIXP)par1World.getBlockTileEntity(par2 + 1, par3, par4));
            }

            if (par1World.getBlockId(par2, par3, par4 - 1) == this.blockID)
            {
                object = new InventoryLargeChest("container.chestDouble", (TileIXP)par1World.getBlockTileEntity(par2, par3, par4 - 1), (IInventory)object);
            }

            if (par1World.getBlockId(par2, par3, par4 + 1) == this.blockID)
            {
                object = new InventoryLargeChest("container.chestDouble", (IInventory)object, (TileIXP)par1World.getBlockTileEntity(par2, par3, par4 + 1));
            }

            return (IInventory)object;
        }
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World par1World)
    {
    	return new TileIXP();
    }

    
    /**
     * If this returns true, then comparators facing away from this block will use the value from
     * getComparatorInputOverride instead of the actual redstone signal strength.
     */
    public boolean hasComparatorInputOverride()
    {
        return true;
    }

    /**
     * If hasComparatorInputOverride returns true, the return value from this is used instead of the redstone signal
     * strength when this block inputs to a comparator.
     */
    public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5)
    {
        return Container.calcRedstoneFromInventory(this.getInventory(par1World, par2, par3, par4));
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("planks_oak");
    }
}
