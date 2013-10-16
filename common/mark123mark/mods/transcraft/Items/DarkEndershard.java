package mark123mark.mods.transcraft.Items;

import java.util.Iterator;
import java.util.List;




import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class DarkEndershard extends Item {

	public void updateIcons(IconRegister iconRegister)
	{
	         Icon iconIndex = iconRegister.registerIcon("Transcraft:DarkEndershard");
	}
	
	public DarkEndershard(int id) {
        super(id);
        maxStackSize = 64;
     
	}
	
	
	
	

}
