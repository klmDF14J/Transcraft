package mark123mark.mods.transcraft;

import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatMessageComponent;



public class CommandTranscraftVersion  extends Command {
	
	
	public CommandTranscraftVersion() {
		super("Tversion");
	}
	
	
	public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr)
    {
		 par1ICommandSender.sendChatToPlayer(ChatMessageComponent.createFromTranslationWithSubstitutions("----------Transcraft!----------"));
		 par1ICommandSender.sendChatToPlayer(ChatMessageComponent.createFromTranslationWithSubstitutions("Transcraft Version " + Transcraft.VERSION + Transcraft.STATE));
		 par1ICommandSender.sendChatToPlayer(ChatMessageComponent.createFromTranslationWithSubstitutions("Made by Mark123mark,shifu_"));
		 par1ICommandSender.sendChatToPlayer(ChatMessageComponent.createFromTranslationWithSubstitutions("And some epic help form Tattyseal!"));
		 par1ICommandSender.sendChatToPlayer(ChatMessageComponent.createFromTranslationWithSubstitutions("----------Transcraft!----------"));
    
    }
	
	
	
	

	public String getCommandUsage(ICommandSender var1) {
		return "/Tversion Gets the version of transcraft";
	}
	
	

}
