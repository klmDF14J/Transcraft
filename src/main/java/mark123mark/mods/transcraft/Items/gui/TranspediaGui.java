package mark123mark.mods.transcraft.Items.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;


public class TranspediaGui extends GuiScreen
{
	
	private static final ResourceLocation P1 = new ResourceLocation("transcraft", "textures/gui/IxpGrinder.png");

	private EntityPlayer player;
	private World world;
	public String[] items;
	public int currentItem;
	
	public GuiButton next;
	public GuiButton back;
	
	
	public static int guiImgID = 0;
	
	
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
 
		drawString(mc.fontRenderer, "§fTranspeadia", width/2-20, height/2-100, 0);
		
		super.drawScreen(i, i1, f);

		if (guiImgID == 1)
		{
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	        this.mc.renderEngine.bindTexture(P1);
	        int k = (this.width - this.width) / 2;
	        int l = (this.height - this.height) / 2;
	        this.drawTexturedModalRect(k, l, 0, 0, width, height);
	        
		}
		
		
		
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
			guiImgID = guiImgID + 1;
			
		}
		
		if(gui.id == back.id)
		{
			if(guiImgID == 0)
			{
				
			}
			else
			{
				guiImgID = guiImgID - 1;
			}

		}
	}
	
	
}
