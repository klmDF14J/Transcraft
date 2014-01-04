package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Items.BasicTransmuter;
import mark123mark.mods.transcraft.Items.TranscraftItems;
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
import net.minecraft.item.EnumArmorMaterial;
import net.minecraftforge.common.EnumHelper;

public class LoadItems {

	public static void LoadItems() {
		TranscraftItems.BasicTransmuter = new BasicTransmuter(
				Config.BasicTransmuterID)
				.setUnlocalizedName("transcraft:BasicTransmuter")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:BasicTransmuter");

		TranscraftItems.QuadTransmuter = new mark123mark.mods.transcraft.Items.QuadTransmuter(
				Config.QuadTransmuterID)
				.setUnlocalizedName("Transcraft:QuadTransmuter")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:QuadTransmuter");

		TranscraftItems.NanoTransmuter = new mark123mark.mods.transcraft.Items.NanoTransmuter(
				Config.NanoTransmuterID)
				.setUnlocalizedName("Transcraft:NanoTransmuter")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:NanoTransmuter");

		TranscraftItems.Oil = new mark123mark.mods.transcraft.Items.Oil(Config.OilID)
				.setUnlocalizedName("Transcraft:Oil")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:Oil");
		TranscraftItems.Plastic = new mark123mark.mods.transcraft.Items.Plastic(
				Config.PlasticID).setUnlocalizedName("Transcraft:Plastic")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:Plastic");

		TranscraftItems.IronStick = new mark123mark.mods.transcraft.Items.IronStick(
				Config.IronStickID).setUnlocalizedName("Transcraft:IronStick")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:BasicTransmuter");
		TranscraftItems.HardendPlastic = new mark123mark.mods.transcraft.Items.HardendPlastic(
				Config.HardendPlasticID)
				.setUnlocalizedName("Transcraft:HardendPlastic")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:IronStick");

		TranscraftItems.EnderGem = new mark123mark.mods.transcraft.Items.EnderGem(
				Config.EnderGemID).setUnlocalizedName("Transcraft:EnderGem")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:EnderGem");

		TranscraftItems.EnderQuartz = new mark123mark.mods.transcraft.Items.EnderQuartz(
				Config.EnderQuartzID)
				.setUnlocalizedName("Transcraft:EnderQuartz")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:EnderQuartz");

		TranscraftItems.DarkEndershard = new mark123mark.mods.transcraft.Items.DarkEndershard(
				Config.DarkEndershardID)
				.setUnlocalizedName("Transcraft:DarkEndershard")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:DarkEndershard");

		TranscraftItems.HotDog = new mark123mark.mods.transcraft.Items.Food.HotDog(
				Config.HotdogID).setUnlocalizedName("Transcraft:HotDog")
				.setCreativeTab(Transcraft.TranstabItems);

		TranscraftItems.PlasticAxe = new mark123mark.mods.transcraft.Tools.PlasticAxe(
				Config.PlasticAxeID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticAxe").setCreativeTab(
						Transcraft.TranstabItems);

		TranscraftItems.PlasticHoe = new mark123mark.mods.transcraft.Tools.PlasticHoe(
				Config.PlasticHoeID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticHoe").setCreativeTab(
						Transcraft.TranstabItems);

		TranscraftItems.PlasticPickaxe = new mark123mark.mods.transcraft.Tools.PlasticPickaxe(
				Config.PlasticPickaxeID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticPickaxe")
				.setCreativeTab(Transcraft.TranstabItems);

		TranscraftItems.PlasticShovel = new mark123mark.mods.transcraft.Tools.PlasticShovel(
				Config.PlasticShovelID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticShovel").setCreativeTab(
						Transcraft.TranstabItems);

		TranscraftItems.PlasticSword = new mark123mark.mods.transcraft.Tools.PlasticSword(
				Config.PlasticSwordID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticSword").setCreativeTab(
						Transcraft.TranstabItems);

		TranscraftItems.BunkerPick = new mark123mark.mods.transcraft.Tools.BunkerPick(
				Config.BunkerPickID, Transcraft.BunkerToolEnum)
				.setUnlocalizedName("Transcraft:EnderPick").setCreativeTab(
						Transcraft.TranstabItems);

		TranscraftItems.EnderSword = new mark123mark.mods.transcraft.Tools.EnderSword(
				Config.EnderSwordID, Transcraft.EnderToolEnum)
				.setUnlocalizedName("Transcraft:EnderSword")
				.setCreativeTab(Transcraft.TranstabItems).setFull3D();

		EnumArmorMaterial PlasticEnum = EnumHelper.addArmorMaterial("Plastic",
				15, new int[] { 3, 5, 5, 2 }, 5);
		EnumArmorMaterial EnderEnum = EnumHelper.addArmorMaterial("Ender",
				9850, new int[] { 10000, 10000, 10000, 10000 }, 100);

		TranscraftItems.PlasticHelmet = (new ArmorPlasticHelmet(
				Config.PlasticHelmetID, PlasticEnum, 0, 0)).setUnlocalizedName(
				"Transcraft:PlasticHelmet").setCreativeTab(
				Transcraft.TranstabItems);

		TranscraftItems.PlasticChest = (new ArmorPlasticChestplate(
				Config.PlasticChestID, PlasticEnum, 0, 1)).setUnlocalizedName(
				"Transcraft:PlasticChest").setCreativeTab(
				Transcraft.TranstabItems);

		TranscraftItems.PlasticLegs = (new ArmorPlasticLegs(Config.PlasticLegsID,
				PlasticEnum, 0, 2))
				.setUnlocalizedName("Transcraft:PlasticLegs").setCreativeTab(
						Transcraft.TranstabItems);

		TranscraftItems.PlasticBoots = (new ArmorPlasticBoots(Config.PlasticBootsID,
				PlasticEnum, 0, 3)).setUnlocalizedName(
				"Transcraft:PlasticBoots").setCreativeTab(
				Transcraft.TranstabItems);

		TranscraftItems.EnderHelmet = (new ArmorEnderHelmet(Config.EnderHelmetID,
				EnderEnum, 0, 0)).setUnlocalizedName("Transcraft:EnderHelmet")
				.setCreativeTab(Transcraft.TranstabItems);

		TranscraftItems.EnderChest = (new ArmorEnderChest(Config.EnderChestID,
				EnderEnum, 0, 1)).setUnlocalizedName("Transcraft:EnderChest")
				.setCreativeTab(Transcraft.TranstabItems);

		TranscraftItems.EnderLegs = (new ArmorEnderLegs(Config.EnderLegsID,
				EnderEnum, 0, 2)).setUnlocalizedName("Transcraft:EnderLegs")
				.setCreativeTab(Transcraft.TranstabItems);

		TranscraftItems.EnderBoots = (new ArmorEnderBoots(Config.EnderBootsID,
				EnderEnum, 0, 3)).setUnlocalizedName("Transcraft:EnderBoots")
				.setCreativeTab(Transcraft.TranstabItems);

	
		TranscraftItems.Transpedia = new Transpeadia(Config.TranspeadiaID).setUnlocalizedName("Transcraft:Transpedia").setCreativeTab(Transcraft.TranstabItems).setTextureName("transcraft:Transpedia");
	
	
	}

}
