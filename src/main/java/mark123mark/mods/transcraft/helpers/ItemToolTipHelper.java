package mark123mark.mods.transcraft.helpers;

import java.text.DecimalFormat;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Items.TranscraftItems;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemToolTipHelper {

	@SideOnly(Side.CLIENT)
	public class ItemTooltipEventHandler
	{

	    @ForgeSubscribe
	    public void handleItemTooltipEvent(ItemTooltipEvent event)
	    {
	        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
	        {

	            if (TranscraftItems.BasicTransmuter != null)
	            {
	                event.toolTip.add("TEST");
	            }
	            else
	            {
	                event.toolTip.add("TEST222");
	            }
	        }
	    }
	}
	
	
}
