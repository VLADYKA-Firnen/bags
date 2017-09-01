package bugs.src;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KeySilver extends Item {

	protected KeySilver(int par1) {
		super();
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName("bugs:key_silver");
	}

}