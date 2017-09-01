package bugs.src;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RandomBoxBounty extends RandomBox {

	public RandomBoxBounty(int par1) {
		super(par1);
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(ModInfo.MODID + ":TreasureChestDiamondBounty");
	}

	@Override
	public ItemStack GetRandomItem() {
		Random rand = new Random();
		ArrayList<ItemStack> Item = new ArrayList();
		Item.add(new ItemStack(Items.diamond, 16));
		Item.add(new ItemStack(Items.emerald, 5));
		Item.add(new ItemStack(Items.ender_pearl, 4));
		return Item.get(rand.nextInt(Item.size()));
	}

}