package bugs.src;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = DKarpov.MODID, version = DKarpov.VERSION)
public class DKarpov {
	public static final boolean debug = true;
	public static final String MODID = "dkarpov";
	public static final String VERSION = "1.0";

	public static Item randombox;
	public static Item keygold;
	public static Item randomboxlock;
	public static Item randomboxsilver;
	public static Item keysilver;
	public static Item randomboxlocksilver;
	public static Item randomboxbounty;
	public static Item keybounty;
	public static Item randomboxlockbounty;
	public static Item randomboxdiamond;
	public static Item keydiamond;
	public static Item randomboxlockdiamond;

	@EventHandler
	public void init(FMLInitializationEvent event) {
		if (debug)
			System.out.println("Initialization Random Box " + DKarpov.VERSION);

	}

	@EventHandler
	public void Load(FMLInitializationEvent event) {
		randombox = new RandomBox(1001).setUnlocalizedName("randombox");
		GameRegistry.registerItem(randombox, "randombox");
		LanguageRegistry.instance().addNameForObject(randombox, "en_US", "Random Box");
		LanguageRegistry.instance().addNameForObject(randombox, "ru_RU", "Золотой сундук");

		keygold = new KeyGold(1002).setUnlocalizedName("keygold");
		GameRegistry.registerItem(keygold, "keygold");
		LanguageRegistry.instance().addNameForObject(keygold, "ru_RU", "Золотой ключ");

		randomboxlock = new RandomBoxLock(1003).setUnlocalizedName("randomboxlock");
		GameRegistry.registerItem(randomboxlock, "randomboxlock");
		LanguageRegistry.instance().addNameForObject(randomboxlock, "ru_RU", "Закрытый золотой сундук");

		GameRegistry.addShapelessRecipe(new ItemStack(DKarpov.randombox, 1),
				new Object[] { DKarpov.keygold, DKarpov.randomboxlock });

		randomboxsilver = new RandomBoxSilver(1004).setUnlocalizedName("randomboxsilver");
		GameRegistry.registerItem(randomboxsilver, "randomboxsilver");
		LanguageRegistry.instance().addNameForObject(randomboxsilver, "en_US", "Random Box Silver");
		LanguageRegistry.instance().addNameForObject(randomboxsilver, "ru_RU", "Серебряный сундук");

		keysilver = new KeySilver(1005).setUnlocalizedName("keysilver");
		GameRegistry.registerItem(keysilver, "keysilver");
		LanguageRegistry.instance().addNameForObject(keysilver, "ru_RU", "Серебряный ключ");

		randomboxlocksilver = new RandomBoxLockSilver(1006).setUnlocalizedName("randomboxlocksilver");
		GameRegistry.registerItem(randomboxlocksilver, "randomboxlocksilver");
		LanguageRegistry.instance().addNameForObject(randomboxlocksilver, "ru_RU", "Закрытый серебряный сундук");

		GameRegistry.addShapelessRecipe(new ItemStack(DKarpov.randomboxsilver, 1),
				new Object[] { DKarpov.keysilver, DKarpov.randomboxlocksilver });

		randomboxbounty = new RandomBoxBounty(1007).setUnlocalizedName("randomboxbounty");
		GameRegistry.registerItem(randomboxbounty, "randomboxbounty");
		LanguageRegistry.instance().addNameForObject(randomboxbounty, "en_US", "Random Box Bounty");
		LanguageRegistry.instance().addNameForObject(randomboxbounty, "ru_RU", "Фиолетовый сундук");

		keybounty = new KeyBounty(1008).setUnlocalizedName("keybounty");
		GameRegistry.registerItem(keybounty, "keybounty");
		LanguageRegistry.instance().addNameForObject(keybounty, "ru_RU", "Фиолетовый ключ");

		randomboxlockbounty = new RandomBoxLockBounty(1009).setUnlocalizedName("randomboxlockbounty");
		GameRegistry.registerItem(randomboxlockbounty, "randomboxlockbounty");
		LanguageRegistry.instance().addNameForObject(randomboxlockbounty, "ru_RU", "Закрытый фиолетовый сундук");

		GameRegistry.addShapelessRecipe(new ItemStack(DKarpov.randomboxbounty, 1),
				new Object[] { DKarpov.keybounty, DKarpov.randomboxlockbounty });

		randomboxdiamond = new RandomBoxDiamond(1010).setUnlocalizedName("randomboxdiamond");
		GameRegistry.registerItem(randomboxdiamond, "randomboxdiamond");
		LanguageRegistry.instance().addNameForObject(randomboxdiamond, "en_US", "Random Box Diamond");
		LanguageRegistry.instance().addNameForObject(randomboxdiamond, "ru_RU", "Алмазный сундук");

		keydiamond = new KeyDiamond(1011).setUnlocalizedName("keybounty");
		GameRegistry.registerItem(keydiamond, "keydiamond");
		LanguageRegistry.instance().addNameForObject(keydiamond, "ru_RU", "Алмазный ключ");

		randomboxlockdiamond = new RandomBoxLockDiamond(1012).setUnlocalizedName("randomboxlockdiamond");
		GameRegistry.registerItem(randomboxlockdiamond, "randomboxlockdiamond");
		LanguageRegistry.instance().addNameForObject(randomboxlockdiamond, "ru_RU", "Закрытый алмазный сундук");

		GameRegistry.addShapelessRecipe(new ItemStack(DKarpov.randomboxdiamond, 1),
				new Object[] { DKarpov.keydiamond, DKarpov.randomboxlockdiamond });

	}

}
