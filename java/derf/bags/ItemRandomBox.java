package derf.bags;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class ItemRandomBox extends Item {

	protected ItemRandomBox(String name) {
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(Bags.MODID + ":" + name);
		setUnlocalizedName(name);
		GameRegistry.registerItem(this, name, Bags.MODID);
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(Bags.MODID + ":" + getUnlocalizedName().substring(5));
	}

	@Override
	public ItemStack onItemRightClick(ItemStack is, World w, EntityPlayer p) {
		if (!w.isRemote) {
			is = is.splitStack(is.stackSize - 1);
			p.inventory.addItemStackToInventory(getRandomItem());
		}
		return is;
	}

	public ItemStack getRandomItem() {
		Random rand = new Random();
		ArrayList<ItemStack> list = new ArrayList();
		list.add(new ItemStack(Items.diamond, 16));
		list.add(new ItemStack(Items.emerald, 5));
		list.add(new ItemStack(Items.ender_pearl, 4));
		return list.get(rand.nextInt(list.size()));
	}
}