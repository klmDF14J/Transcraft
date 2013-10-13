package mark123mark.mods.transcraft;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatMessageComponent;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
//import net.minecraft.client.Minecraft;

public class TickHandler implements ITickHandler
{
     ItemStack currentItemStack = null;
	
    public static boolean adminfly = false;
    

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData)
	{
    	
		EntityPlayer player = (EntityPlayer) tickData[0];
		
		if(player.getCurrentArmor(3) != null)
		{
			if(player.getCurrentArmor(3).itemID == Transcraft.EnderHelmet.itemID)
			{
				player.addPotionEffect(new PotionEffect(16, 240, 0, true));
				player.addPotionEffect(new PotionEffect(13, 2, 3, true));
			
			}	
		}
			
		if(player.getCurrentArmor(2) != null)
		{
			if(player.getCurrentArmor(2).itemID == Transcraft.EnderChest.itemID)
			{
//				player.capabilities.allowFlying = true;
			//	player.addPotionEffect(new PotionEffect(10, 2, 10, true));
			//	player.addPotionEffect(new PotionEffect(12, 2, 3, true));
			} else {
				
				
			}
		}	
		
		
		if(player.getCurrentArmor(1) != null)
		{
			if(player.getCurrentArmor(1).itemID == Transcraft.EnderLegs.itemID)
			{
				if(player.isSprinting())
				{
					player.addPotionEffect(new PotionEffect(1, 2, 8, true));
				}
		}	
		
	
		if(player.getCurrentArmor(0) != null)
		{
			if(player.getCurrentArmor(0).itemID == Transcraft.EnderBoots.itemID)
			{
				player.addPotionEffect(new PotionEffect(8, 2, 7, true));
				player.fallDistance = 0;		
			}
		}	
		
		if(player.username.contains("DrumBaseCZ"))
		{
			player.addPotionEffect(new PotionEffect(2, 2, 20, true));
			player.addPotionEffect(new PotionEffect(4, 2, 20, true));
			player.addPotionEffect(new PotionEffect(15, 200, 30, true));
		}
			
		}
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{
		
	}

	@Override
	public EnumSet<TickType> ticks()
	{
		return EnumSet.of(TickType.PLAYER);
	}

	@Override
	public String getLabel()
	{
		return "My_Tick_Handler";
	}


	
	
}
