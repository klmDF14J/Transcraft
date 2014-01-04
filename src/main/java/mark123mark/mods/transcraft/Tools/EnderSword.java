package mark123mark.mods.transcraft.Tools;

import java.util.List;

import org.lwjgl.input.Keyboard;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.helpers.Config;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EnderSword extends ItemSword {

	public EnderSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:EnderSword");
	}

	/**
	 * returns the action that specifies what animation to play when the items
	 * is being used
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.block;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer) {
		
		if(Config.enderswordpearl == true)
		{
			if (par3EntityPlayer.isSneaking()) 
			{
				par3EntityPlayer.setItemInUse(par1ItemStack,this.getMaxItemUseDuration(par1ItemStack));
				return par1ItemStack;
			} 
			
			else 
			{
				par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F,0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

				if (!par2World.isRemote) {
					par2World.spawnEntityInWorld(new EntityEnderPearl(par2World,par3EntityPlayer));
				}
			}
		}
		else
		{
			par3EntityPlayer.setItemInUse(par1ItemStack,this.getMaxItemUseDuration(par1ItemStack));
		}
		return par1ItemStack;

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean par4) {
		
		
		if(Config.enderswordpearl == true)
		{
			if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
	        {
				list.add("Right click to throw an ender peral");
	        }
			else
			{
				list.add("§2[§4SHIFT§2]");
			}
		}
	}

}
