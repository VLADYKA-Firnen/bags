package derf.bags;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemKey extends Item {

	public ItemKey(String name) {
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(Bags.MODID + ":" + name);
		setUnlocalizedName(name);
		GameRegistry.registerItem(this, name, Bags.MODID);
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(Bags.MODID + ":" + getUnlocalizedName().substring(5));
	}
}