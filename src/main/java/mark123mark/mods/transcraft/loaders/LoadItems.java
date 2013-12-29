package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Items.BasicTransmuter;
import mark123mark.mods.transcraft.Items.Transpeadia;
import mark123mark.mods.transcraft.armor.ArmorEnderBoots;
import mark123mark.mods.transcraft.armor.ArmorEnderChest;
import mark123mark.mods.transcraft.armor.ArmorEnderHelmet;
import mark123mark.mods.transcraft.armor.ArmorEnderLegs;
import mark123mark.mods.transcraft.armor.ArmorPlasticBoots;
import mark123mark.mods.transcraft.armor.ArmorPlasticChestplate;
import mark123mark.mods.transcraft.armor.ArmorPlasticHelmet;
import mark123mark.mods.transcraft.armor.ArmorPlasticLegs;
import mark123mark.mods.transcraft.helpers.Config;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class LoadItems {

	public static void LoadItems() {
		Transcraft.BasicTransmuter = new BasicTransmuter(
				Config.BasicTransmuterID)
				.setUnlocalizedName("transcraft:BasicTransmuter")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:BasicTransmuter");

		Transcraft.QuadTransmuter = new mark123mark.mods.transcraft.Items.QuadTransmuter(
				Config.QuadTransmuterID)
				.setUnlocalizedName("Transcraft:QuadTransmuter")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:QuadTransmuter");

		Transcraft.NanoTransmuter = new mark123mark.mods.transcraft.Items.NanoTransmuter(
				Config.NanoTransmuterID)
				.setUnlocalizedName("Transcraft:NanoTransmuter")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:NanoTransmuter");

		Transcraft.Oil = new mark123mark.mods.transcraft.Items.Oil(Config.OilID)
				.setUnlocalizedName("Transcraft:Oil")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:Oil");
		Transcraft.Plastic = new mark123mark.mods.transcraft.Items.Plastic(
				Config.PlasticID).setUnlocalizedName("Transcraft:Plastic")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:Plastic");

		Transcraft.IronStick = new mark123mark.mods.transcraft.Items.IronStick(
				Config.IronStickID).setUnlocalizedName("Transcraft:IronStick")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:BasicTransmuter");
		Transcraft.HardendPlastic = new mark123mark.mods.transcraft.Items.HardendPlastic(
				Config.HardendPlasticID)
				.setUnlocalizedName("Transcraft:HardendPlastic")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:IronStick");

		Transcraft.EnderGem = new mark123mark.mods.transcraft.Items.EnderGem(
				Config.EnderGemID).setUnlocalizedName("Transcraft:EnderGem")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:EnderGem");

		Transcraft.EnderQuartz = new mark123mark.mods.transcraft.Items.EnderQuartz(
				Config.EnderQuartzID)
				.setUnlocalizedName("Transcraft:EnderQuartz")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:EnderQuartz");

		Transcraft.DarkEndershard = new mark123mark.mods.transcraft.Items.DarkEndershard(
				Config.DarkEndershardID)
				.setUnlocalizedName("Transcraft:DarkEndershard")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:DarkEndershard");

		Transcraft.HotDog = new mark123mark.mods.transcraft.Items.Food.HotDog(
				Config.HotdogID).setUnlocalizedName("Transcraft:HotDog")
				.setCreativeTab(Transcraft.TranstabItems);

		Transcraft.PlasticAxe = new mark123mark.mods.transcraft.Tools.PlasticAxe(Config.PlasticAxeID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticAxe").setCreativeTab(
						Transcraft.TranstabItems);

		Transcraft.PlasticHoe = new mark123mark.mods.transcraft.Tools.PlasticHoe(
				Config.PlasticHoeID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticHoe").setCreativeTab(
						Transcraft.TranstabItems);

		Transcraft.PlasticPickaxe = new mark123mark.mods.transcraft.Tools.PlasticPickaxe(
				Config.PlasticPickaxeID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticPickaxe")
				.setCreativeTab(Transcraft.TranstabItems);

		Transcraft.PlasticShovel = new mark123mark.mods.transcraft.Tools.PlasticShovel(
				Config.PlasticShovelID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticShovel").setCreativeTab(
						Transcraft.TranstabItems);

		Transcraft.PlasticSword = new mark123mark.mods.transcraft.Tools.PlasticSword(
				Config.PlasticSwordID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticSword").setCreativeTab(
						Transcraft.TranstabItems);

		Transcraft.BunkerPick = new mark123mark.mods.transcraft.Tools.BunkerPick(
				Config.BunkerPickID, Transcraft.BunkerToolEnum)
				.setUnlocalizedName("Transcraft:EnderPick").setCreativeTab(
						Transcraft.TranstabItems);

		Transcraft.EnderSword = new mark123mark.mods.transcraft.Tools.EnderSword(
				Config.EnderSwordID, Transcraft.EnderToolEnum)
				.setUnlocalizedName("Transcraft:EnderSword")
				.setCreativeTab(Transcraft.TranstabItems).setFull3D();

		ArmorMaterial PlasticEnum = EnumHelper.addArmorMaterial("Plastic",
				15, new int[] { 3, 5, 5, 2 }, 5);
		ArmorMaterial EnderEnum = EnumHelper.addArmorMaterial("Ender",
				9850, new int[] { 10000, 10000, 10000, 10000 }, 100);

		Transcraft.PlasticHelmet = (new ArmorPlasticHelmet(Config.PlasticHelmetID, PlasticEnum, 0, 0)).setUnlocalizedName(
				"Transcraft:PlasticHelmet").setCreativeTab(
				Transcraft.TranstabItems);

		Transcraft.PlasticChest = (new ArmorPlasticChestplate(
				Config.PlasticChestID, PlasticEnum, 0, 1)).setUnlocalizedName(
				"Transcraft:PlasticChest").setCreativeTab(
				Transcraft.TranstabItems);

		Transcraft.PlasticLegs = (new ArmorPlasticLegs(Config.PlasticLegsID,
				PlasticEnum, 0, 2))
				.setUnlocalizedName("Transcraft:PlasticLegs").setCreativeTab(
						Transcraft.TranstabItems);

		Transcraft.PlasticBoots = (new ArmorPlasticBoots(Config.PlasticBootsID,
				PlasticEnum, 0, 3)).setUnlocalizedName(
				"Transcraft:PlasticBoots").setCreativeTab(
				Transcraft.TranstabItems);

		Transcraft.EnderHelmet = (new ArmorEnderHelmet(Config.EnderHelmetID,
				EnderEnum, 0, 0)).setUnlocalizedName("Transcraft:EnderHelmet")
				.setCreativeTab(Transcraft.TranstabItems);

		Transcraft.EnderChest = (new ArmorEnderChest(Config.EnderChestID,
				EnderEnum, 0, 1)).setUnlocalizedName("Transcraft:EnderChest")
				.setCreativeTab(Transcraft.TranstabItems);

		Transcraft.EnderLegs = (new ArmorEnderLegs(Config.EnderLegsID,
				EnderEnum, 0, 2)).setUnlocalizedName("Transcraft:EnderLegs")
				.setCreativeTab(Transcraft.TranstabItems);

		Transcraft.EnderBoots = (new ArmorEnderBoots(Config.EnderBootsID,
				EnderEnum, 0, 3)).setUnlocalizedName("Transcraft:EnderBoots")
				.setCreativeTab(Transcraft.TranstabItems);

	
		Transcraft.Transpedia = new Transpeadia(Config.TranspeadiaID).setUnlocalizedName("Transcraft:Transpedia").setCreativeTab(Transcraft.TranstabItems).setTextureName("transcraft:Transpedia");
	
	
	}

}
