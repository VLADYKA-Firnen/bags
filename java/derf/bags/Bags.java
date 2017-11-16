package derf.bags;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = Bags.MODID, name = Bags.MODNAME, version = Bags.VERSION)
public class Bags {
	public static final String MODID = "bags", MODNAME = "Bags", VERSION = "1.0";

	public static Item 
	random_box_bounty, 
	random_box_silver, 
	random_box_gold, 
	random_box_diamond, 
	random_box_lock_bounty, 
	random_box_lock_silver,
	random_box_lock_gold, 
	random_box_lock_diamond, 
	key_bounty, 
	key_silver, 
	key_gold, 
	key_diamond;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		random_box_bounty  = new ItemRandomBox("random_box_bounty");
		random_box_silver  = new ItemRandomBox("random_box_silver");
		random_box_gold    = new ItemRandomBox("random_box_gold");
		random_box_diamond = new ItemRandomBox("random_box_diamond");
		
		random_box_lock_bounty  = new ItemRandomBoxLock("random_box_lock_bounty");
		random_box_lock_silver  = new ItemRandomBoxLock("random_box_lock_silver");
		random_box_lock_gold    = new ItemRandomBoxLock("random_box_lock_gold");
		random_box_lock_diamond = new ItemRandomBoxLock("random_box_lock_diamond");

		key_bounty  = new ItemKey("key_bounty");
		key_silver  = new ItemKey("key_silver");
		key_gold    = new ItemKey("key_gold");
		key_diamond = new ItemKey("key_diamond");

		GameRegistry.addShapelessRecipe(new ItemStack(Bags.random_box_bounty, 1),
				new Object[] { Bags.key_bounty, Bags.random_box_lock_bounty });

		GameRegistry.addShapelessRecipe(new ItemStack(Bags.random_box_silver, 1),
				new Object[] { Bags.key_silver, Bags.random_box_lock_silver });

		GameRegistry.addShapelessRecipe(new ItemStack(Bags.random_box_gold, 1),
				new Object[] { Bags.key_gold, Bags.random_box_lock_gold });

		GameRegistry.addShapelessRecipe(new ItemStack(Bags.random_box_diamond, 1),
				new Object[] { Bags.key_diamond, Bags.random_box_lock_diamond });

	}
}