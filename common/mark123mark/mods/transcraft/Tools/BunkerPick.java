package mark123mark.mods.transcraft.Tools;

import java.util.List;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BunkerPick extends ItemPickaxe  
{

	public BunkerPick(int par1, EnumToolMaterial par2EnumToolMaterial) 
	{
		super(par1, par2EnumToolMaterial);
	}


    @Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		 itemIcon = par1IconRegister.registerIcon("Transcraft:EnderPick");
	}

    
    @Override
	@SideOnly(Side.CLIENT)
	public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add("Breaks Harded Blocks");
		list.add("Try right clicking!");
		list.add("Powered by the magic of Nano Transmuter!");
	}
    
    
    
    public boolean onItemUse(ItemStack ist, EntityPlayer player, World world, int x, int y, int z, int side, float xOff, float yOff, float zOff) {
			
    	if (hasItems(player)) {
			doExplosion(world, x, y, z, side, player);
		}
    	
		return true;
	}

	public void doExplosion(World world, int x, int y, int z, int side, EntityPlayer player) {
		boolean destroyedSomething = false;
		boolean playOnce = true;
		y = y + (side == 0 ? 1 : side == 1 ? -1 : 0);
		z = z + (side == 2 ? 1 : side == 3 ? -1 : 0);
		x = x + (side == 4 ? 1 : side == 5 ? -1 : 0);
		for (int xD = -1; xD <= 1; xD++) {
			for (int yD = -1; yD <= 1; yD++) {
				for (int zD = -1; zD <= 1; zD++) {
					if (isBreakable(world.getBlockId(x + xD, y + yD, z + zD))) {
						if (player.capabilities.isCreativeMode)
						{
							world.setBlock(x + xD, y + yD, z + zD, 0);
						}
						else
						{
							world.destroyBlock(x + xD, y + yD, z + zD, true);
						}
						
						if (world.rand.nextInt(2) == 0) {
							if (player.capabilities.isCreativeMode)
							{
								world.spawnParticle("largeexplode", x + xD, y + yD, z + zD, 1.0D, 0.0D, 0.0D);
							}
						}
						destroyedSomething = true;
						if (playOnce) {
							if (player.capabilities.isCreativeMode)
							{
								world.playSoundEffect(x, y, z, "random.explode", 4.0F, (1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.2F) * 0.7F);
							}
							playOnce = false;
						}
					}
				}
			}
		}
		if (destroyedSomething) {
			
		}
	}

	public boolean isBreakable(int id) {
		return id == Block.dirt.blockID || id == Block.grass.blockID || id == Block.gravel.blockID || id == Block.cobblestone.blockID || id == Block.stone.blockID || id == Block.sand.blockID || id == Block.sandStone.blockID || id == Block.snow.blockID || id == Block.slowSand.blockID || id == Block.netherrack.blockID || id == Block.whiteStone.blockID|| id == Transcraft.BunkerBlock.blockID || id == Transcraft.BunkerStair.blockID || id == Transcraft.SmoothBunkerBlock.blockID || id == Transcraft.SmoothBunkerStair.blockID;
	}
    
	
	public boolean hasItems(EntityPlayer player) {
		int gunPowderCount = 0;
		IInventory inventory = player.inventory;
		for (int slot = 0; slot < inventory.getSizeInventory(); slot++) {
			if (inventory.getStackInSlot(slot) == null) {
				continue;
			}
			
		
		
			if (player.isSneaking())
			{
				
			return false;	
			
			}
				else
			{
					if (player.capabilities.isCreativeMode)
					{
						return true;
					}
						else
					{
						if (inventory.getStackInSlot(slot).getItem() == Transcraft.NanoTransmuter) {
							gunPowderCount += inventory.getStackInSlot(slot).stackSize;
						
							if (gunPowderCount >= 1) return true;	
					}
					
				}
		}
			
			
			
		}
		return false;
	}
}
