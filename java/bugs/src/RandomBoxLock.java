package bugs.src;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RandomBoxLock extends Item{

    protected RandomBoxLock(int par1) {
        super();
    this.setCreativeTab(CreativeTabs.tabTools);
    this.setTextureName("bugs:TreasureChestGold");
}
	
}