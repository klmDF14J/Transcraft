package mark123mark.mods.transcraft.Items.gui;

import mark123mark.mods.transcraft.helpers.TransmuterMode;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;


public class TranspediaGui extends GuiScreen
{

	private EntityPlayer player;
	private World world;
	public String[] items;
	public int currentItem;
	
	public GuiButton next;
	public GuiButton back;
	
	
	public TranspediaGui(EntityPlayer p, World w)
	{
		player = p;
		world = w;
	}
	
	public void initGui()
	{
		super.initGui();
	
		
	}
	
	public void drawScreen(int i, int i1, float f)
	{
		//Fix
		drawDefaultBackground();
 
		drawString(mc.fontRenderer, "§fTesting", width/2-"Basic Mode".length()-5, height/2-30, 0);
		
		super.drawScreen(i, i1, f);

	}
	
	public void updateScreen()
	{
		super.updateScreen();
		
		next = new GuiButton(0, width/2+100, height/2+60, 20, 20, ">");
		
		back = new GuiButton(1, width/2-100, height/2+60, 20, 20, "<");
		
		
		
		buttonList.add(next);
		buttonList.add(back);
		
	}
	
	public boolean doesGuiPauseGame()
	{
		return false;
	}
	
	public void actionPerformed(GuiButton gui)
	{
		if(gui.id == next.id)
		{
			

		}
		
		if(gui.id == back.id)
		{
			
		}
	}
	

	
	
	
	
}
