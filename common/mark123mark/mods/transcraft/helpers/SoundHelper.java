package mark123mark.mods.transcraft.helpers;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundHelper
{
	@ForgeSubscribe
	public void onSound(SoundLoadEvent e)
	{
		e.manager.addSound("Transcraft:SwordHit.ogg");
	}

}
