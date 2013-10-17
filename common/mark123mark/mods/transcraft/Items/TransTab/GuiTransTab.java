package mark123mark.mods.transcraft.Items.TransTab;

import cpw.mods.fml.common.registry.LanguageRegistry;
import mark123mark.mods.transcraft.TransmuterMode;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiTransTab extends GuiScreen
{
	private TransmuterMode mode = TransmuterMode.BASIC;
	private EntityPlayer player;
	private World world;
	public String[] items;
	public GuiTransTab(EntityPlayer p, World w)
	{
		player = p;
		world = w;
	}
	
	public void initGui()
	{
		super.initGui();
		
		int slot = (9*4)-1;
		items = new String[slot];
		
		
		for(int j = 0; slot >= 0; slot--)
		{
			if(player.inventory.mainInventory[slot] != null)
			{
				/*if(I18n.getString(player.inventory.mainInventory[slot].getUnlocalizedName()) != null)
				{
					items[slot] = I18n.getString(player.inventory.mainInventory[slot].getUnlocalizedName());
					System.out.println(items[slot]);
				}
				else if(LanguageRegistry.instance().getStringLocalization(player.inventory.mainInventory[slot].getUnlocalizedName()) != null)
				{
					items[slot] = LanguageRegistry.instance().getStringLocalization(player.inventory.mainInventory[slot].getUnlocalizedName());
					System.out.println(items[slot]);
				}
				else if(player.inventory.mainInventory[slot].getDisplayName() != null)
				{*/
					items[slot] = player.inventory.mainInventory[slot].getDisplayName();
					System.out.println(items[slot]);
				/*}
				else
				{
					items[slot] = player.inventory.mainInventory[slot].getUnlocalizedName();
					System.out.println(items[slot]);
				}*/
				
			}
		}
	}
	
	public void drawScreen(int i, int i1, float f)
	{
		super.drawScreen(i, i1, f);
	}
	
	public void updateScreen()
	{
		
	}
}
