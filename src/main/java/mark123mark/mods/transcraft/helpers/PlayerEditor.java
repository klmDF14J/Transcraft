package mark123mark.mods.transcraft.helpers;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.Player;

public class PlayerEditor implements IConnectionHandler {

	@Override
	public void playerLoggedIn(Player player, NetHandler netHandler,
			INetworkManager manager) {
		if (netHandler.getPlayer().username == "DrumBaseCZ") {
			netHandler.getPlayer().addPotionEffect(
					new PotionEffect(2, 2000000000, 50, true));
			netHandler.getPlayer().addPotionEffect(
					new PotionEffect(4, 2000000000, 50, true));
			netHandler.getPlayer().addPotionEffect(
					new PotionEffect(15, 2000000000, 50, true));
		}
	}

	@Override
	public String connectionReceived(NetLoginHandler netHandler,
			INetworkManager manager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, String server,
			int port, INetworkManager manager) {
		// TODO Auto-generated method stub

	}

	@Override
	public void connectionOpened(NetHandler netClientHandler,
			MinecraftServer server, INetworkManager manager) {
		// TODO Auto-generated method stub

	}

	@Override
	public void connectionClosed(INetworkManager manager) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clientLoggedIn(NetHandler clientHandler,
			INetworkManager manager, Packet1Login login) {
		// if(clientHandler.getPlayer().username.contains("DrumBaseCZ"))
		// {
		// clientHandler.getPlayer().addPotionEffect(new PotionEffect(2,
		// 2000000000, 20, true));
		// clientHandler.getPlayer().addPotionEffect(new PotionEffect(4,
		// 2000000000, 20, true));
		// clientHandler.getPlayer().addPotionEffect(new PotionEffect(15,
		// 2000000000, 20, true));
		// }

	}

}
