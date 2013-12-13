package mark123mark.mods.transcraft;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class EventMobDeath
{

	public static double rand;
	public Random r = new Random();

	@ForgeSubscribe
	public void onEntityDrop(LivingDropsEvent event)
	{

		if (event.source.getSourceOfDamage() instanceof EntityArrow)
		{
			if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity != null)
			{
				if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity instanceof EntityPlayer)
				{
					ItemHelper.droparrow((EntityPlayer) ((EntityArrow) event.source.getSourceOfDamage()).shootingEntity, event.entityLiving);
				}
			}
		}
	}

}
