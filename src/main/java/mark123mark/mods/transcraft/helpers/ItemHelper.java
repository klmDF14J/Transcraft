package mark123mark.mods.transcraft.helpers;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Items.TranscraftItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

public class ItemHelper {
	private static double rand;

	public static void droptransmutter(EntityPlayer player,
			EntityLivingBase entity) {

		if (GeneralHelper.isHostileEntity(entity)) {
			rand = Math.random();

			if (rand < 0.15d) {
				entity.dropItem(TranscraftItems.BasicTransmuter.itemID, 1);
			}
		}
	}

}
