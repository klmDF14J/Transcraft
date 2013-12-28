package mark123mark.mods.transcraft.helpers;

import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.registry.GameRegistry;

public class DevMessage implements IPlayerTracker {

	public DevMessage() {
		GameRegistry.registerPlayerTracker(this);
	}

	@Override
	public void onPlayerLogin(EntityPlayer player) {
		serveDEV(player);
	}

	@Override
	public void onPlayerLogout(EntityPlayer player) {
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {
		serveDEV(player);
	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		serveDEV(player);
	}

	public void serveDEV(ICommandSender sender) {

		sender.sendChatToPlayer(ChatMessageComponent
				.createFromTranslationWithSubstitutions("YOU ARE USING A DEV VERSION OF TRANSCRAFT"));
		sender.sendChatToPlayer(ChatMessageComponent
				.createFromTranslationWithSubstitutions("THIS WILL HAVE ERRORS AND BUGS!"));
	}

}
