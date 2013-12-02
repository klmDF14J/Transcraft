package mark123mark.mods.transcraft.TileEntitys.Transcrafter;

import java.util.Random;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class Transcrafter extends BlockContainer {
	public static Icon[] icons = new Icon[2];
	public int multiblock;

	public Transcrafter(int id) {
		super(id, Material.rock);
		this.setStepSound(Block.soundStoneFootstep);
		this.setHardness(2F);

	}

	@Override
	public Icon getIcon(int side, int meta) {
		if (side == 1 || side == 0) {
			return icons[0];
		} else {
			return icons[1];
		}
	}

	public int tickRate(World par1World) {
		return 2;
	}

	@Override
	public void registerIcons(IconRegister i) {
		icons[0] = i.registerIcon("transcraft:TC_top");
		icons[1] = i.registerIcon("transcraft:TC_side");
	}

	@Override
	public boolean onBlockActivated(World w, int x, int y, int z,
			EntityPlayer p, int par6, float par7, float par8, float par9) {
		int xs = 0;
		int ys = 0;
		int zs = 0;

		xs = x;
		ys = y;
		zs = z;

		if (p.isSneaking()) {
			return true;
		} else {
			p.openGui(Transcraft.instance, 1, w, x, y, z);
		}

		this.isMuliBlock(w, x, y, z);

		return true;

	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileTC();
	}

	public Block setTickRandomly(boolean par1) {
		this.needsRandomTick = true;
		return this;
	}

	@Override
	public void updateTick(World par1World, int par2, int par3, int par4,
			Random par5Random) {

		int xs = 0;
		int ys = 0;
		int zs = 0;

		xs = par2;
		ys = par3;
		zs = par4;

		this.isMuliBlock(par1World, xs, ys, zs);

	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int id) {
		super.onNeighborBlockChange(world, x, y, z, id);
		this.isMuliBlock(world, x, y, z);

	}

	@Override
	public void breakBlock(World par1World, int par2, int par3, int par4,
			int par5, int par6) {

	}

	@Override
	public int onBlockPlaced(World par1World, int par2, int par3, int par4,
			int par5, float par6, float par7, float par8, int par9) {

		par1World.markBlockForUpdate(par2, par3, par4);
		return 0;
	}

	public Boolean isMuliBlock(World w, int x, int y, int z) {

		int xs = 0;
		int ys = 0;
		int zs = 0;

		xs = x;
		ys = y;
		zs = z;

		if (w.getBlockId(xs, ys, zs) == Transcraft.Transcrafter.blockID
				&& w.getBlockId(xs, ys + 1, zs) == Transcraft.Transcrafter.blockID

				&& w.getBlockId(xs - 1, ys, z) == Transcraft.Transcrafter.blockID
				&& w.getBlockId(xs, ys, zs - 1) == Transcraft.Transcrafter.blockID

				&& w.getBlockId(xs - 1, ys + 1, zs) == Transcraft.Transcrafter.blockID
				&& w.getBlockId(xs, ys + 1, zs - 1) == Transcraft.Transcrafter.blockID

				&& w.getBlockId(xs - 1, ys, zs - 1) == Transcraft.Transcrafter.blockID
				&& w.getBlockId(xs - 1, ys + 1, zs - 1) == Transcraft.Transcrafter.blockID) {

			multiblock = 1;

			if (multiblock == 1) {
				w.setBlock(xs, ys, zs, 0);
				w.setBlock(xs, ys + 1, zs, 0);
				w.setBlock(xs - 1, ys, zs, 0);
				w.setBlock(xs, ys, zs - 1, 0);
				w.setBlock(xs - 1, ys + 1, zs, 0);
				w.setBlock(xs, ys + 1, zs - 1, 0);
				w.setBlock(xs - 1, ys, zs - 1, 0);
				w.setBlock(xs - 1, ys + 1, zs - 1, 0);

				w.spawnParticle("largeexplode", xs - 1, ys + 2, zs - 1, 1.0D,
						0.0D, 0.0D);

				w.playSoundEffect(
						xs,
						ys,
						zs,
						"random.explode",
						4.0F,
						(1.0F + (w.rand.nextFloat() - w.rand.nextFloat()) * 0.2F) * 0.7F);

				ItemStack Item = new ItemStack(Block.blockDiamond, 1);
				EntityItem entityitem = new EntityItem(w, x, y + (double) 2, z,
						Item);
				entityitem.delayBeforeCanPickup = 10;
				w.spawnEntityInWorld(entityitem);

			}

			return true;

		} else {
			multiblock = 0;
			return false;
		}
	}

}
