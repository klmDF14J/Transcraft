package mark123mark.mods.transcraft.helpers;

import java.util.EnumSet;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements ITickHandler {
	ItemStack currentItemStack = null;

	public static boolean adminfly = false;

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		EntityPlayer player = (EntityPlayer) tickData[0];
		EntityPlayerMP thePlayer = (EntityPlayerMP) tickData[0];
		
		if(player.username.contains("mark123mark"))
		{
			if(thePlayer.dimension == 0)
			{
				if(player.posY < -5)
				{
					player.moveEntity(player.posX, player.posY + 32, player.posZ);
					player.travelToDimension(-1);
				}	
			}
		}
		
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		EntityPlayer player = (EntityPlayer) tickData[0];

		if (player.getCurrentArmor(3) != null) {
			if (player.getCurrentArmor(3).itemID == Transcraft.EnderHelmet.itemID) {
				player.addPotionEffect(new PotionEffect(16, 240, 0, true));
				player.addPotionEffect(new PotionEffect(13, 2, 3, true));

			}
		}

		if (player.getCurrentArmor(2) != null) {
			if (player.getCurrentArmor(2).itemID == Transcraft.EnderChest.itemID) {

			} else {

			}
		}

		if (player.getCurrentArmor(1) != null) {
			if (player.getCurrentArmor(1).itemID == Transcraft.EnderLegs.itemID) {
				if (player.isSprinting()) {
					player.addPotionEffect(new PotionEffect(1, 2, 8, true));
				}

			}

			if (player.getCurrentArmor(0) != null) {
				if (player.getCurrentArmor(0).itemID == Transcraft.EnderBoots.itemID) {
					player.addPotionEffect(new PotionEffect(8, 2, 7, true));
					player.fallDistance = 0;
				}
			}

			
			
			
		}
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER);
	}

	@Override
	public String getLabel() {
		return "Transcraft_Tick_Handler";
	}

}
