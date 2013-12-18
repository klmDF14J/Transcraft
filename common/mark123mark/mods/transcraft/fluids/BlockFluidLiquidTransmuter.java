package mark123mark.mods.transcraft.fluids;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFluidLiquidTransmuter extends BlockFluidClassic {
	public static Icon springWaterStillIcon;
	public static Icon springWaterFlowingIcon;

	public BlockFluidLiquidTransmuter(int id, Fluid fluid, Material material) {
		super(id, fluid, material);
		for (int i = 8; i < 11; i++) {
			displacementIds.put(i, false);
		}

	}

	// @Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World par1World, int par2, int par3,
			int par4, Random par5Random, int x, int y, int z, Random rand) {
		super.randomDisplayTick(par1World, par2, par3, par4, par5Random);

		if (par5Random.nextInt(1) == 0) {
			// Transcraft.Coproxy.spawnParticle("steam", par2 +
			// par5Random.nextFloat(), par3 + 1.0F, par4 +
			// par5Random.nextFloat());

			// par1World.spawnParticle("mobSpell", x + 0.5D +
			// rand.nextGaussian() / 8, y, z + 0.5D + rand.nextGaussian() / 8,
			// 0.0D, 0.9D, 0.5D);
		}

	}

	@Override
	public boolean canDisplace(IBlockAccess world, int x, int y, int z) {

		int bId = world.getBlockId(x, y, z);

		if (bId == 0)
			return true;
		if (bId == blockID)
			return false;
		if (displacementIds.containsKey(bId))
			return displacementIds.get(bId);
		Material material = Block.blocksList[bId].blockMaterial;

		if (material.blocksMovement() || material == Material.water
				|| material == Material.lava || material == Material.portal)
			return false;
		return true;
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z,
			Entity entity) {
		int meta = world.getBlockMetadata(x, y, z);

		if (!world.isRemote) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(
						Potion.regeneration.id, 1));
			}

			if (entity instanceof EntityPlayer) {
				if (world.rand.nextInt(150) == 0) {
					EntityPlayer player = (EntityPlayer) entity;

					if (player.getFoodStats().needFood()) {
						((EntityPlayer) entity)
								.addPotionEffect(new PotionEffect(
										Potion.field_76443_y.id, 1));
					}
				}
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		springWaterStillIcon = iconRegister
				.registerIcon("transcraft:transmutter_liquid_still");
		springWaterFlowingIcon = iconRegister
				.registerIcon("transcraft:transmutter_liquid_flowing");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {
		return par1 != 0 && par1 != 1 ? springWaterFlowingIcon
				: springWaterStillIcon;
	}

	// the update tick for this block, rather than growing, forces stuff around
	// it to grow.
	@Override
	public void updateTick(World par1World, int x, int y, int z,
			Random par5Random) {
		this.growCropsNearby(par1World, x, y, z);

		int quantaRemaining = quantaPerBlock
				- par1World.getBlockMetadata(x, y, z);
		int expQuanta = -101;

		// check adjacent block levels if non-source
		if (quantaRemaining < quantaPerBlock) {
			int y2 = y - densityDir;

			if (par1World.getBlockId(x, y2, z) == blockID
					|| par1World.getBlockId(x - 1, y2, z) == blockID
					|| par1World.getBlockId(x + 1, y2, z) == blockID
					|| par1World.getBlockId(x, y2, z - 1) == blockID
					|| par1World.getBlockId(x, y2, z + 1) == blockID) {
				expQuanta = quantaPerBlock - 1;
			} else {
				int maxQuanta = -100;
				maxQuanta = getLargerQuanta(par1World, x - 1, y, z, maxQuanta);
				maxQuanta = getLargerQuanta(par1World, x + 1, y, z, maxQuanta);
				maxQuanta = getLargerQuanta(par1World, x, y, z - 1, maxQuanta);
				maxQuanta = getLargerQuanta(par1World, x, y, z + 1, maxQuanta);

				expQuanta = maxQuanta - 1;
			}

			// decay calculation
			if (expQuanta != quantaRemaining) {
				quantaRemaining = expQuanta;

				if (expQuanta <= 0) {
					par1World.setBlockToAir(x, y, z);
				} else {
					par1World.setBlockMetadataWithNotify(x, y, z,
							quantaPerBlock - expQuanta, 3);
					par1World.scheduleBlockUpdate(x, y, z, blockID, tickRate);
					par1World.notifyBlocksOfNeighborChange(x, y, z, blockID);
				}
			}
		}
		// This is a "source" block, set meta to zero, and send a server only
		// update
		else if (quantaRemaining >= quantaPerBlock) {
			par1World.setBlockMetadataWithNotify(x, y, z, 0, 2);
		}

		// Flow vertically if possible
		if (canDisplace(par1World, x, y + densityDir, z)) {
			flowIntoBlock(par1World, x, y + densityDir, z, 1);
			return;
		}

		// Flow outward if possible
		int flowMeta = quantaPerBlock - quantaRemaining + 1;
		if (flowMeta >= quantaPerBlock) {
			return;
		}

		if (isSourceBlock(par1World, x, y, z)
				|| !isFlowingVertically(par1World, x, y, z)) {
			if (par1World.getBlockId(x, y - densityDir, z) == blockID) {
				flowMeta = 1;
			}
			boolean flowTo[] = getOptimalFlowDirections(par1World, x, y, z);

			if (flowTo[0])
				flowIntoBlock(par1World, x - 1, y, z, flowMeta);
			if (flowTo[1])
				flowIntoBlock(par1World, x + 1, y, z, flowMeta);
			if (flowTo[2])
				flowIntoBlock(par1World, x, y, z - 1, flowMeta);
			if (flowTo[3])
				flowIntoBlock(par1World, x, y, z + 1, flowMeta);
		}
	}

	public void growCropsNearby(World world, int xO, int yO, int zO) {
		for (int xD = -4; xD <= 4; xD++) {
			for (int yD = -1; yD <= 4; yD++) {
				for (int zD = -4; zD <= 4; zD++) {
					int x = xO + xD;
					int y = yO + yD;
					int z = zO + zD;
					int id = world.getBlockId(x, y, z);
					Block block = Block.blocksList[id];
					if (id == blockID) {
						continue;
					}
					if (block instanceof IPlantable) {
						block.updateTick(world, x, y, z, world.rand);
					}
				}
			}
		}
	}

}
