package mark123mark.mods.transcraft.Items.TransTab;

import mark123mark.mods.transcraft.TransmuterMode;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiTransTab extends GuiScreen
{
	private TransmuterMode mode = TransmuterMode.BASIC;
	private EntityPlayer player;
	private World world;
	public String[] items;
	public int currentItem;
	
	public GuiButton next;
	public GuiButton back;
	public GuiButton trans;
	
	public GuiTransTab(EntityPlayer p, World w)
	{
		player = p;
		world = w;
	}
	
	@Override
	public void initGui()
	{
		super.initGui();
	
		next = new GuiButton(0, width/2+50, height/2+20, 20, 20, ">");
		
		back = new GuiButton(1, width/2-50, height/2+20, 20, 20, "<");
		
		trans = new GuiButton(2, width/2-50, height/2+45, next.xPosition-back.xPosition+20, 20, "Transmute");
		
		buttonList.add(next);
		buttonList.add(back);
		buttonList.add(trans);
		
		int slot = (9*4)-1;
		items = new String[slot+1];
		
		
		for(int j = 0; slot >= 0; slot--)
		{
			if(player.inventory.mainInventory[slot] != null)
			{
				String s1 = player.inventory.mainInventory[slot].getDisplayName();
				items[slot] = s1;
			}
		}
	}
	
	@Override
	public void drawScreen(int i, int i1, float f)
	{
		//Fix
		drawDefaultBackground();
 
		if(currentItem >= 1 && currentItem <= 35)
		{
			
		
		if(mode == TransmuterMode.BASIC)
		{
			
		}
		super.drawScreen(i, i1, f);
		
		}
	}

	
	
	@Override
	public void updateScreen()
	{
		super.updateScreen();
		if(currentItem >= 1 && currentItem <= 35)
		{
			if(items[currentItem] == null)
			{
				if(currentItem < 35 && currentItem >= 1)
				{
					currentItem = currentItem + 1;
				}
				
				if(currentItem == 35)
				{
					currentItem = 1;
				}
				
			}
		}
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
	
	@Override
	public void actionPerformed(GuiButton gui)
	{
		if(gui.id == next.id)
		{
			if(currentItem <= 35 && currentItem >= 1)
			{
				if(items[currentItem] == null)
				{
					currentItem = currentItem+1;
					return;
				}
				currentItem = currentItem+1;
			}
			else
			{
				currentItem = 1;
			}

		}
		
		if(gui.id == back.id)
		{
			if(currentItem <= 35)
			{
				if(currentItem >= 0)
				{
					currentItem = currentItem - 1;
				}
			}

		}
	}
}
