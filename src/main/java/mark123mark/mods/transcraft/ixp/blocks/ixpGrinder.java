package mark123mark.mods.transcraft.ixp.blocks;

import javax.swing.Icon;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ixpGrinder extends Block {

	@SideOnly(Side.CLIENT)
	public static Icon[] texture;

	public ixpGrinder(int ID) {
		super(ID, Material.iron);
		setCreativeTab(Transcraft.TranstabBlocks);

	}

	@SideOnly(Side.CLIENT)
	private Icon TopIc;
	@SideOnly(Side.CLIENT)
	private Icon BotIc;

	@SideOnly(Side.CLIENT)
	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	public Icon getIcon(int par1, int par2) {
		return par1 == 0 ? this.BotIc : (par1 == 1 ? this.TopIc
				: this.blockIcon);
	}

	@SideOnly(Side.CLIENT)
	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon("transcraft:ixpGrinder"); // side
		this.TopIc = par1IconRegister.registerIcon("transcraft:ixpGrinder_top");// top
		this.BotIc = par1IconRegister.registerIcon("minecraft:cobblestone");// bottom
	}

	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer player, int i, float a, float b, float c) {

		if (player.getHeldItem() != null) {

			if (player.getHeldItem().itemID == Block.cloth.blockID) {
				if (player.getHeldItem().stackSize >= 32) {
					player.getHeldItem().stackSize = player.getHeldItem().stackSize - 32;

					if (!world.isRemote) {

						world.playSoundAtEntity(player, "random.explode", 0.5F,
								0.4F * 0.4F + 0.8F);

						ItemStack ItemStack = new ItemStack(Item.expBottle, 1);
						EntityItem entityitem = new EntityItem(world, x, y
								+ (double) 1.5, z, ItemStack);
						entityitem.delayBeforeCanPickup = 10;
						world.spawnEntityInWorld(entityitem);

					}

				}
			}

			if (player.getHeldItem().itemID == Item.flint.itemID) {
				if (player.getHeldItem().stackSize >= 16) {
					player.getHeldItem().stackSize = player.getHeldItem().stackSize - 16;

					if (!world.isRemote) {

						world.playSoundAtEntity(player, "random.explode", 0.5F,
								0.4F * 0.4F + 0.8F);

						ItemStack ItemStack = new ItemStack(Item.expBottle, 1);
						EntityItem entityitem = new EntityItem(world, x, y
								+ (double) 1.5, z, ItemStack);
						entityitem.delayBeforeCanPickup = 10;
						world.spawnEntityInWorld(entityitem);

					}
				}
			}

			if (player.getHeldItem().itemID == Item.flint.itemID) {
				if (player.getHeldItem().stackSize >= 16) {
					player.getHeldItem().stackSize = player.getHeldItem().stackSize - 16;

					if (!world.isRemote) {

						world.playSoundAtEntity(player, "random.explode", 0.5F,
								0.4F * 0.4F + 0.8F);

						ItemStack ItemStack = new ItemStack(Item.expBottle, 1);
						EntityItem entityitem = new EntityItem(world, x, y
								+ (double) 1.5, z, ItemStack);
						entityitem.delayBeforeCanPickup = 10;
						world.spawnEntityInWorld(entityitem);

					}
				}
			}

			if (player.getHeldItem().itemID == Block.cobblestone.blockID) {
				if (player.getHeldItem().stackSize >= 64) {
					player.getHeldItem().stackSize = player.getHeldItem().stackSize - 64;

					if (!world.isRemote) {

						world.playSoundAtEntity(player, "random.explode", 0.5F,
								0.4F * 0.4F + 0.8F);

						ItemStack ItemStack = new ItemStack(Item.expBottle, 1);
						EntityItem entityitem = new EntityItem(world, x, y
								+ (double) 1.5, z, ItemStack);
						entityitem.delayBeforeCanPickup = 10;
						world.spawnEntityInWorld(entityitem);

					}
				}
			}

			if (player.getHeldItem().itemID == Block.dirt.blockID) {
				if (player.getHeldItem().stackSize >= 64) {
					player.getHeldItem().stackSize = player.getHeldItem().stackSize - 64;

					if (!world.isRemote) {

						world.playSoundAtEntity(player, "random.explode", 0.5F,
								0.4F * 0.4F + 0.8F);

						ItemStack ItemStack = new ItemStack(Item.expBottle, 1);
						EntityItem entityitem = new EntityItem(world, x, y
								+ (double) 1.5, z, ItemStack);
						entityitem.delayBeforeCanPickup = 10;
						world.spawnEntityInWorld(entityitem);

					}
				}
			}

			if (player.getHeldItem().itemID == Block.netherrack.blockID) {
				if (player.getHeldItem().stackSize >= 64) {
					player.getHeldItem().stackSize = player.getHeldItem().stackSize - 64;

					if (!world.isRemote) {

						world.playSoundAtEntity(player, "random.explode", 0.5F,
								0.4F * 0.4F + 0.8F);

						ItemStack ItemStack = new ItemStack(Item.expBottle, 1);
						EntityItem entityitem = new EntityItem(world, x, y
								+ (double) 1.5, z, ItemStack);
						entityitem.delayBeforeCanPickup = 10;
						world.spawnEntityInWorld(entityitem);

					}
				}
			}

			if (player.getHeldItem().itemID == Block.gravel.blockID) {
				if (player.getHeldItem().stackSize >= 64) {
					player.getHeldItem().stackSize = player.getHeldItem().stackSize - 64;

					if (!world.isRemote) {

						world.playSoundAtEntity(player, "random.explode", 0.5F,
								0.4F * 0.4F + 0.8F);

						ItemStack ItemStack = new ItemStack(Item.expBottle, 1);
						EntityItem entityitem = new EntityItem(world, x, y
								+ (double) 1.5, z, ItemStack);
						entityitem.delayBeforeCanPickup = 10;
						world.spawnEntityInWorld(entityitem);

					}
				}
			}

			if (player.getHeldItem().itemID == Block.whiteStone.blockID) {
				if (player.getHeldItem().stackSize >= 64) {
					player.getHeldItem().stackSize = player.getHeldItem().stackSize - 64;

					if (!world.isRemote) {

						world.playSoundAtEntity(player, "random.explode", 0.5F,
								0.4F * 0.4F + 0.8F);

						ItemStack ItemStack = new ItemStack(Item.expBottle, 1);
						EntityItem entityitem = new EntityItem(world, x, y
								+ (double) 1.5, z, ItemStack);
						entityitem.delayBeforeCanPickup = 10;
						world.spawnEntityInWorld(entityitem);

					}
				}
			}

			if (player.getHeldItem().itemID == Block.wood.blockID) {
				if (player.getHeldItem().stackSize >= 64) {
					player.getHeldItem().stackSize = player.getHeldItem().stackSize - 64;

					if (!world.isRemote) {

						world.playSoundAtEntity(player, "random.explode", 0.5F,
								0.4F * 0.4F + 0.8F);

						ItemStack ItemStack = new ItemStack(Item.expBottle, 1);
						EntityItem entityitem = new EntityItem(world, x, y
								+ (double) 1.5, z, ItemStack);
						entityitem.delayBeforeCanPickup = 10;
						world.spawnEntityInWorld(entityitem);

					}
				}
			}

			if (player.getHeldItem().itemID == Block.netherBrick.blockID) {
				if (player.getHeldItem().stackSize >= 32) {
					player.getHeldItem().stackSize = player.getHeldItem().stackSize - 32;

					if (!world.isRemote) {

						world.playSoundAtEntity(player, "random.explode", 0.5F,
								0.4F * 0.4F + 0.8F);

						ItemStack ItemStack = new ItemStack(Item.expBottle, 1);
						EntityItem entityitem = new EntityItem(world, x, y
								+ (double) 1.5, z, ItemStack);
						entityitem.delayBeforeCanPickup = 10;
						world.spawnEntityInWorld(entityitem);

					}
				}
			}

		}

		return true;
	}

}
