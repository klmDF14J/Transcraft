package mark123mark.mods.transcraft.helpers;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		int var1 = Config.OilID;

		if (var1 == Config.OilID) {
			return 300;
		} else {
			return 0;
		}
	}

}
