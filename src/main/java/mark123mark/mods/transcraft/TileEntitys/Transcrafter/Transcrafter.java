package mark123mark.mods.transcraft.TileEntitys.Transcrafter;

import javax.swing.Icon;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
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

		return true;

	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileTC();
	}

}
