package mark123mark.mods.transcraft.fluids;

import net.minecraft.util.Icon;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class LiquidTransmutterFluid extends Fluid
{
	public LiquidTransmutterFluid(String fluidName)
	{
		super(fluidName);
	}
	
    @Override
	@SideOnly(Side.CLIENT)
    public Icon getStillIcon() 
    {
        return BlockFluidLiquidTransmuter.springWaterStillIcon;
    }

    @Override
	@SideOnly(Side.CLIENT)
    public Icon getFlowingIcon() 
    {
        return BlockFluidLiquidTransmuter.springWaterFlowingIcon;
    }	

}
