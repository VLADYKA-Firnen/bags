package bugs.src;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KeyDiamond extends Item {

	protected KeyDiamond(int par1) {
		super();
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName("bugs:keyring_diamond");
	}

}