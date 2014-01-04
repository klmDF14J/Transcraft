package mark123mark.mods.transcraft.command;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.helpers.Config;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatMessageComponent;

public class CommandReloadConfig extends Command {

	public CommandReloadConfig() {
		super("Tconfig");
	}

	@Override
	public void processCommand(ICommandSender par1ICommandSender,String[] par2ArrayOfStr) 
	{
		Config.initConfig();
		par1ICommandSender.sendChatToPlayer(ChatMessageComponent.createFromTranslationWithSubstitutions("Config Reloaded"));

	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		return "/Tconfig";
	}

	@Override
	public int compareTo(Object arg0) {
		return 0;
		// TODO Auto-generated method stub
		
	}
	
}
