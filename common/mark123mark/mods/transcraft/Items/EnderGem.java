package mark123mark.mods.transcraft.Items;



import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class EnderGem extends Item {

	public void updateIcons(IconRegister iconRegister)
	{
	         Icon iconIndex = iconRegister.registerIcon("Transcraft:EnderGem");
	}
	
	public EnderGem(int id) {
        super(id);
     // Constructor Configuration
        maxStackSize = 16;
      //  setCreativeTab(Transcraft.Transtab);
        setUnlocalizedName("EnderGem");
}

	
	 @Override
		public void registerIcons(IconRegister par1IconRegister)
		{
			 itemIcon = par1IconRegister.registerIcon("Transcraft:EnderGem");
		}
	
	 @Override
	 public ItemStack onItemRightClick(ItemStack i, World w, EntityPlayer p)
	 {
		 
	 if(Minecraft.getMinecraft().objectMouseOver != null)
	  {
	   if(Minecraft.getMinecraft().objectMouseOver.typeOfHit == EnumMovingObjectType.ENTITY)
	   {
	 //   if(Minecraft.getMinecraft().objectMouseOver.entityHit instanceof EntityChicken)
	   // {
	     w.createExplosion(Minecraft.getMinecraft().objectMouseOver.entityHit, Minecraft.getMinecraft().objectMouseOver.entityHit.posX, Minecraft.getMinecraft().objectMouseOver.entityHit.posY, Minecraft.getMinecraft().objectMouseOver.entityHit.posZ, 30F, true);
	  //  }
	   }
	  }
	return i;
	 }
  
	
}
