package mark123mark.mods.transcraft.Items.TransTab;

import mark123mark.mods.transcraft.GuiIds;
import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.world.World;

public class ItemTransTab extends Item
{
	public ItemTransTab(int id)
	{
		super(id);
	}
	
	public ItemStack onItemRightClick(ItemStack i, World w, EntityPlayer p)
	{
		if(p.username.contains("mark123mark"))
		{
			p.openGui(Transcraft.instance, GuiIds.TransTab, w, (int)p.posX, (int)p.posY, (int)p.posZ);
			i.stackSize = i.stackSize-1;
		}
		else if(p.username.contains("tattyseal"))
		{
			p.openGui(Transcraft.instance, GuiIds.TransTab, w, (int)p.posX, (int)p.posY, (int)p.posZ);
			i.stackSize = i.stackSize-1;
		}
		else
		{
			 p.sendChatToPlayer(ChatMessageComponent.createFromTranslationWithSubstitutions("This item is not working yet!"));
			 p.sendChatToPlayer(ChatMessageComponent.createFromTranslationWithSubstitutions("Update soon!"));
		}
		
		return i;
		
	}
}
