package mark123mark.mods.transcraft.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class DarkEndershard extends Item {

	public void updateIcons(IconRegister iconRegister) {
		Icon iconIndex = iconRegister.registerIcon("Transcraft:DarkEndershard");
	}

	public DarkEndershard(int id) {
		super(id);
		maxStackSize = 64;

	}

}
