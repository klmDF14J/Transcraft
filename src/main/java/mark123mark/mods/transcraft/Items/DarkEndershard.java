package mark123mark.mods.transcraft.Items;

import javax.swing.Icon;

import net.minecraft.item.Item;

public class DarkEndershard extends Item {

	public void updateIcons(IconRegister iconRegister) {
		Icon iconIndex = iconRegister.registerIcon("Transcraft:DarkEndershard");
	}

	public DarkEndershard(int id) {
		super(id);
		maxStackSize = 64;

	}

}
