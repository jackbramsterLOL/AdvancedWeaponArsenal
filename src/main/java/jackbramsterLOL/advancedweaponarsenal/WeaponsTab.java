package jackbramsterLOL.advancedweaponarsenal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Jammer on 14/08/2016.
 */
public class WeaponsTab extends CreativeTabs {

    public static WeaponsTab tab = new WeaponsTab();

    public WeaponsTab() {
        super("AdvancedWeapons");
    }

    @Override
    public Item getTabIconItem() {
        return (advancedweaponarsenal.sword);
    }
}

