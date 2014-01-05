package mark123mark.mods.transcraft.command;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatMessageComponent;

public class CommandTranscraftVersion extends Command {

	public CommandTranscraftVersion() {
		super("Tversion");
	}

	@Override
	public void processCommand(ICommandSender par1ICommandSender,
			String[] par2ArrayOfStr) {
		par1ICommandSender
				.sendChatToPlayer(ChatMessageComponent
						.createFromTranslationWithSubstitutions("----------Transcraft!----------"));
		par1ICommandSender.sendChatToPlayer(ChatMessageComponent
				.createFromTranslationWithSubstitutions("Transcraft Version "
						+ Transcraft.VERSION + Transcraft.STATE));
		par1ICommandSender
				.sendChatToPlayer(ChatMessageComponent
						.createFromTranslationWithSubstitutions("Made by mark123mark, shifu_ and tattyseal"));
		par1ICommandSender
				.sendChatToPlayer(ChatMessageComponent
						.createFromTranslationWithSubstitutions("----------Transcraft!----------"));

	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		return "/Tversion Gets the version of transcraft";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
