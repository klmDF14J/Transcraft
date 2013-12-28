package mark123mark.mods.transcraft.helpers;

import net.minecraftforge.client.event.sound.SoundLoadEvent;

public class SoundHelper {
	@ForgeSubscribe
	public void onSound(SoundLoadEvent e) {
		e.manager.addSound("Transcraft:SwordHit.ogg");
	}

}
