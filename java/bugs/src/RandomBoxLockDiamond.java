package bugs.src;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RandomBoxLockDiamond extends Item {

	protected RandomBoxLockDiamond(int par1) {
		super();
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName("bugs:TreasureChestDiamond");
	}

}