package mark123mark.mods.transcraft.TileEntitys.LiquidTranscrafter;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;

public class TileLTC extends TileEntity implements IFluidHandler
{

	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill)
	{

		return 1;
	}

	@Override
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain)
	{
		return null;

	}

	@Override
	public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain)
	{
		return resource;

	}

	@Override
	public boolean canFill(ForgeDirection from, Fluid fluid)
	{
		// return tank.fill(fluid, false) > 0;
		return true;
	}

	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public FluidTankInfo[] getTankInfo(ForgeDirection from)
	{
		FluidStack fluid = null;

		return new FluidTankInfo[]
		{ new FluidTankInfo(fluid, 10) };
	}

	public boolean canUpdate()
	{
		return true;
	}

	@Override
	public void updateEntity()
	{

	}

}
