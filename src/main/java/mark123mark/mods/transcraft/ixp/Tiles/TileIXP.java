package mark123mark.mods.transcraft.ixp.Tiles;

import java.util.Iterator;
import java.util.List;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Items.TranscraftItems;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileIXP extends TileEntity implements IInventory, ISidedInventory
{
    private ItemStack[] chestContents = new ItemStack[36];

    
    /** The current angle of the lid (between 0 and 1) */
    public float lidAngle;
    
    public static double CurrentIXPValue = 0;

    /** The angle of the lid last tick */
    public float prevLidAngle;

    /** The number of players currently using this chest */
    public int numUsingPlayers;

    /** Server sync counter (once per 20 ticks) */
    private int ticksSinceSync;
    private int field_94046_i;
    private String field_94045_s;

    public TileIXP()
    {
        this.field_94046_i = -1;
    }

    @SideOnly(Side.CLIENT)
    public TileIXP(int par1)
    {
        this.field_94046_i = par1;
    }

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return chestContents.length;
    }

    /**
     * 
     * @param i How much to increase the IXP Value by
     */
    public void incIXP()
    {
    	CurrentIXPValue= CurrentIXPValue+0.125;
    }
    
    /**
     * 
     * @param i How much to increase the IXP Value by
     */
    public void incIXP(int am)
    {
    	CurrentIXPValue= CurrentIXPValue+am;
    }
    
    /**
     * Returns the stack in slot i
     */
    public ItemStack getStackInSlot(int par1)
    {
        return par1 >= this.chestContents.length ? null : this.chestContents[par1];
    }

    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
    public ItemStack decrStackSize(int par1, int par2)
    {
        if (this.chestContents[par1] != null)
        {
            ItemStack itemstack;

            if (this.chestContents[par1].stackSize <= par2)
            {
                itemstack = this.chestContents[par1];
                this.chestContents[par1] = null;
                this.onInventoryChanged();
                return itemstack;
            }
            else
            {
                itemstack = this.chestContents[par1].splitStack(par2);

                if (this.chestContents[par1].stackSize == 0)
                {
                    this.chestContents[par1] = null;
                }

                this.onInventoryChanged();
                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }
    
    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
    public ItemStack incrStackSize(int par1, int par2)
    {
        if (this.chestContents[par1] != null)
        {
        	if(this.chestContents[par1].stackSize < 64)
        	{
        		ItemStack i;
        		ItemStack newI;
        		
        		i = chestContents[par1];
        		newI = i;
        		
        		newI.stackSize = i.stackSize+1;
        		
        		return newI;
        	}
        	else
        	{
        		return null;
        	}
        }
        else
        {
        	return null;
        }
    }

    /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
     */
    public ItemStack getStackInSlotOnClosing(int par1)
    {
        if (this.chestContents[par1] != null)
        {
            ItemStack itemstack = this.chestContents[par1];
            this.chestContents[par1] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

   public void setInventorySlotContents(int par1, ItemStack par2ItemStack)
    {
    if(par1 < this.chestContents.length){ 
        this.chestContents[par1] = par2ItemStack;

        if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit())
        {
            par2ItemStack.stackSize = this.getInventoryStackLimit();
        }

        this.onInventoryChanged();
    }
    }

    /**
     * Returns the name of the inventory.
     */
    public String getInvName()
    {
        return this.isInvNameLocalized() ? this.field_94045_s : "container.chest";
    }

    /**
     * If this returns false, the inventory name will be used as an unlocalized name, and translated into the player's
     * language. Otherwise it will be used directly.
     */
    public boolean isInvNameLocalized()
    {
        return this.field_94045_s != null && this.field_94045_s.length() > 0;
    }

    /**
     * Sets the custom display name to use when opening a GUI for this specific TileEntityChest.
     */
    public void setChestGuiName(String par1Str)
    {
        this.field_94045_s = par1Str;
    }

    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList nbttaglist = par1NBTTagCompound.getTagList("Items");
        this.chestContents = new ItemStack[this.getSizeInventory()];
        
        this.CurrentIXPValue = par1NBTTagCompound.getDouble("IXP");

        if (par1NBTTagCompound.hasKey("CustomName"))
        {
            this.field_94045_s = par1NBTTagCompound.getString("CustomName");
        }

        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.tagAt(i);
            int j = nbttagcompound1.getByte("Slot") & 255;

            if (j >= 0 && j < this.chestContents.length)
            {
                this.chestContents[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }

    public double getIXPValue()
    {
    	return this.CurrentIXPValue;
    }
    /**
     * Writes a tile entity to NBT.
     */
    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        NBTTagList nbttaglist = new NBTTagList();

        par1NBTTagCompound.setDouble("IXP", CurrentIXPValue);
        
        for (int i = 0; i < this.chestContents.length; ++i)
        {
            if (this.chestContents[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.chestContents[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        par1NBTTagCompound.setTag("Items", nbttaglist);

        if (this.isInvNameLocalized())
        {
            par1NBTTagCompound.setString("CustomName", this.field_94045_s);
        }
    }

    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't
     * this more of a set than a get?*
     */
    public int getInventoryStackLimit()
    {
        return 64;
    }

    /**
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer)
    {
        return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : par1EntityPlayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    /**
     * Causes the TileEntity to reset all it's cached values for it's container block, blockID, metaData and in the case
     * of chests, the adjcacent chest check
     */
    public void updateContainingBlockInfo()
    {
        super.updateContainingBlockInfo();
    }

   
    private boolean func_94044_a(int par1, int par2, int par3)
    {
        Block block = Block.blocksList[this.worldObj.getBlockId(par1, par2, par3)];
        return block != null && block instanceof IXPGrinderMk2 ? ((IXPGrinderMk2)block).isTrapped == this.func_98041_l() : false;
    }

    private void handleEnergy()
    {
    	int slot = 1;
    	
    	for(int j = 0; slot < 10; slot++)
    	{
    		if (getStackInSlot(0).itemID != TranscraftItems.BasicTransmuter.itemID)
    		{
    		}
    		else
    		{
    			if(getStackInSlot(slot) != null && getStackInSlot(0) != null)
    				{
        			int IXP = 1;
        			if(IXP != 0 &&  getStackInSlot(0).stackSize <= 64)
        			{
        				CurrentIXPValue=CurrentIXPValue+IXP;
        				decrStackSize(slot, 1);
        			}
        		}
    		}
    	}
    }
    
    private void makeItems()
    {
    	int slot = 0;
    	int mainSlot = 1;
    	
    	int BASIC = 256;
    	int QUAD = 256;
    	int NANO = 256;
    	
    	if(getStackInSlot(0) != null)
    	{
    		if (getStackInSlot(0).itemID == TranscraftItems.BasicTransmuter.itemID)
    		{
    			if(BASIC != 0 && getStackInSlot(0).stackSize <=  64)
        		{
        			if(CurrentIXPValue >= BASIC)
        			{
        				CurrentIXPValue=CurrentIXPValue-BASIC;
        				incrStackSize(0, 1);
        				
        			}
        		}
    		}
    		
    		if (getStackInSlot(0).itemID == TranscraftItems.QuadTransmuter.itemID)
    		{
    			if(QUAD != 0 && getStackInSlot(0).stackSize <=  64)
        		{
        			if(CurrentIXPValue >= QUAD)
        			{
        				CurrentIXPValue=CurrentIXPValue-QUAD;
        				incrStackSize(0, 1);
        				
        			}
        		}
    		}
    		
    		if (getStackInSlot(0).itemID == TranscraftItems.NanoTransmuter.itemID)
    		{
    			if(NANO != 0 && getStackInSlot(0).stackSize <=  64)
        		{
        			if(CurrentIXPValue >= NANO)
        			{
        				CurrentIXPValue=CurrentIXPValue-NANO;
        				incrStackSize(0, 1);
        				
        			}
        		}
    		}
    		
    	}
    }
    /**
     * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
     * ticks and creates a new spawn inside its implementation.
     */
    public void updateEntity()
    {
        super.updateEntity();
        if(getStackInSlot(0) != null)
        {
        	if(getStackInSlot(0).stackSize != 64)
        	{
                handleEnergy();
                makeItems();
        	}
        }
        ++this.ticksSinceSync;
        float f;

        if (!this.worldObj.isRemote && this.numUsingPlayers != 0 && (this.ticksSinceSync + this.xCoord + this.yCoord + this.zCoord) % 200 == 0)
        {
            this.numUsingPlayers = 0;
            f = 5.0F;
            List list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getAABBPool().getAABB((double)((float)this.xCoord - f), (double)((float)this.yCoord - f), (double)((float)this.zCoord - f), (double)((float)(this.xCoord + 1) + f), (double)((float)(this.yCoord + 1) + f), (double)((float)(this.zCoord + 1) + f)));
            Iterator iterator = list.iterator();

            while (iterator.hasNext())
            {
                EntityPlayer entityplayer = (EntityPlayer)iterator.next();

                if (entityplayer.openContainer instanceof ContainerIXP)
                {
                    IInventory iinventory = ((ContainerIXP)entityplayer.openContainer).getLowerChestInventory();

                    if (iinventory == this || iinventory instanceof InventoryLargeChest && ((InventoryLargeChest)iinventory).isPartOfLargeChest(this))
                    {
                        ++this.numUsingPlayers;
                    }
                }
            }
        }

        this.prevLidAngle = this.lidAngle;
        f = 0.1F;
        double d0;

       

        if (this.numUsingPlayers == 0 && this.lidAngle > 0.0F || this.numUsingPlayers > 0 && this.lidAngle < 1.0F)
        {
            float f1 = this.lidAngle;

            if (this.numUsingPlayers > 0)
            {
                this.lidAngle += f;
            }
            else
            {
                this.lidAngle -= f;
            }

            if (this.lidAngle > 1.0F)
            {
                this.lidAngle = 1.0F;
            }

            float f2 = 0.5F;

            
            if (this.lidAngle < 0.0F)
            {
                this.lidAngle = 0.0F;
            }
        }
    }

    /**
     * Called when a client event is received with the event number and argument, see World.sendClientEvent
     */
    public boolean receiveClientEvent(int par1, int par2)
    {
        if (par1 == 1)
        {
            this.numUsingPlayers = par2;
            return true;
        }
        else
        {
            return super.receiveClientEvent(par1, par2);
        }
    }

    public void openChest()
    {
        if (this.numUsingPlayers < 0)
        {
            this.numUsingPlayers = 0;
        }

        ++this.numUsingPlayers;
        this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, this.getBlockType().blockID, 1, this.numUsingPlayers);
        this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord, this.zCoord, this.getBlockType().blockID);
        this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord - 1, this.zCoord, this.getBlockType().blockID);
    }

    public void closeChest()
    {
        if (this.getBlockType() != null && this.getBlockType() instanceof IXPGrinderMk2)
        {
            --this.numUsingPlayers;
            this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, this.getBlockType().blockID, 1, this.numUsingPlayers);
            this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord, this.zCoord, this.getBlockType().blockID);
            this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord - 1, this.zCoord, this.getBlockType().blockID);
        }
    }

    /**
     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot.
     */
    public boolean isItemValidForSlot(int par1, ItemStack par2ItemStack)
    {
        return true;
    }

    /**
     * invalidates a tile entity
     */
    public void invalidate()
    {
        super.invalidate();
        this.updateContainingBlockInfo();
    }

    public int func_98041_l()
    {
        if (this.field_94046_i == -1)
        {
            if (this.worldObj == null || !(this.getBlockType() instanceof IXPGrinderMk2))
            {
                return 0;
            }

            this.field_94046_i = ((IXPGrinderMk2)this.getBlockType()).isTrapped;
        }

        return this.field_94046_i;
    }

	@Override
	public int[] getAccessibleSlotsFromSide(int side)
	{
		return new int[37];
	}

	@Override
	public boolean canInsertItem(int slot, ItemStack itemstack, int side)
	{
		if(side == 0 || side == 1)
		{
			if(slot == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(slot > 1 && slot < 37)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

	@Override
	public boolean canExtractItem(int slot, ItemStack itemstack, int side)
	{
		if(side == 0 || side == 1)
		{
			if(slot == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(slot > 1 && slot < 37)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}
