package jackbramsterLOL.advancedweaponarsenal;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Jammer on 15/08/2016.
 */
@Mod(name = "AdvancedWeaponArsenal", modid = "advancedweaponarsenal", version = "1")
public class AdvancedWeaponArsenal {
    public static Item sword;
    public static Item axe;
    public static Item.ToolMaterial katanameterial = EnumHelper.addToolMaterial("katana", 0, 1000, 10.0F, 7.0F, 14);
    public static Item.ToolMaterial battleaxemeterial = EnumHelper.addToolMaterial("battleaxe", 0, 1000, 10.0F, 10.0F, 14);
    public static Item spikedclub;
    public static Item.ToolMaterial spikedclubmeterial = EnumHelper.addToolMaterial("spikedclub", 0, 1000, 10.0F, 7.0F, 14);

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        sword = new ItemKatana(katanameterial);
        registerItem(sword, "katana");
        axe = new ItemBattleAxe(battleaxemeterial);
        registerItem(axe, "battleaxe");
        spikedclub = new ItemSpikedClub(spikedclubmeterial);
        registerItem(spikedclub, "spikedclub");
    }

    private static void registerItem(Item item, String name) {
        item.setRegistryName(new ResourceLocation("advancedweaponarsenal", name));
        item.setUnlocalizedName(item.getRegistryName().toString());
        GameRegistry.register(item);
    }
}
