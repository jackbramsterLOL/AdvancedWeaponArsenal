package jackbramsterLOL.advancedweaponarsenal;

import me.modmuss50.jsonDestroyer.api.IHandHeld;
import me.modmuss50.jsonDestroyer.api.ITexturedItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import reborncore.RebornCore;

/**
 * Created by Jammer on 28/08/2016.
 */
public class ItemKatana extends ItemSword implements ITexturedItem, IHandHeld {
    public ItemKatana(ToolMaterial material) {
        super(material);
        setCreativeTab(WeaponsTab.tab);
        RebornCore.jsonDestroyer.registerObject(this);
    }

    @Override
    public String getTextureName(int i) {
        return "AdvancedWeaponArsenal:katana";
    }

    @Override
    public int getMaxMeta() {
        return 1;
    }

    @Override
    public ModelResourceLocation getModel(ItemStack itemStack, EntityPlayer entityPlayer, int i) {
        return new ModelResourceLocation("AdvancedWeaponArsenal:" + getUnlocalizedName(itemStack).substring(5), "inventory");
    }
}
