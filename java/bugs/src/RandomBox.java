package bugs.src;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class RandomBox extends Item {

	private int costil = 0; // Костыльная переменная для onItemRightClick

	public ItemStack GetRandomItem() {
		Random rand = new Random();
		ArrayList<ItemStack> Item = new ArrayList();
		Item.add(new ItemStack(Items.diamond, 16));
		Item.add(new ItemStack(Items.emerald, 5));
		Item.add(new ItemStack(Items.ender_pearl, 4));
		return Item.get(rand.nextInt(Item.size()));

	}

	public RandomBox(int par1) {
		super();
		this.setCreativeTab(CreativeTabs.tabTools);
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(ModInfo.MODID + ":TreasureChestGold");
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if (DKarpov.debug)
			System.out.println("onItemRightClick Triggered");
		par1ItemStack = par1ItemStack.splitStack(par1ItemStack.stackSize - 1);
		if (this.costil >= 1) {
			ItemStack obj = GetRandomItem();
			int count = obj.stackSize;
			par3EntityPlayer.inventory.addItemStackToInventory(obj);
			if (DKarpov.debug)
				par3EntityPlayer
						.addChatMessage(new ChatComponentText("§r§1[§6" + par3EntityPlayer.getGameProfile().getName()
								+ "§1] §r§2Получил " + obj.getDisplayName() + " в количестве " + count));
			this.costil = 0;
		} else {
			this.costil++;
		}

		return par1ItemStack;
	}

}
