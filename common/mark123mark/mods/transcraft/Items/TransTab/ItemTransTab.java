package mark123mark.mods.transcraft.Items.TransTab;

import mark123mark.mods.transcraft.GuiIds;
import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTransTab extends Item
{
	public ItemTransTab(int id)
	{
		super(id);
	}
	
	public ItemStack onItemRightClick(ItemStack i, World w, EntityPlayer p)
	{
		p.openGui(Transcraft.instance, GuiIds.TransTab, w, (int)p.posX, (int)p.posY, (int)p.posZ);
		i.stackSize = i.stackSize-1;
		return i;
	}
}
