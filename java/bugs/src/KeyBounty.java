package bugs.src;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KeyBounty extends Item {

	protected KeyBounty(int par1) {
		super();
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName("bugs:keyring_bounty");
	}

}