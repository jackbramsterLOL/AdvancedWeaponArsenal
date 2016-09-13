package jackbramsterLOL.advancedweaponarsenal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
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
    public static Block crafter;
    public static Item sword;
    public static Item.ToolMaterial katanameterial = EnumHelper.addToolMaterial("katana", 0, 1000, 10.0F, 7.0F, 14);
    public static Item axe;
    public static Item.ToolMaterial battleaxemeterial = EnumHelper.addToolMaterial("battleaxe", 0, 1000, 10.0F, 10.0F, 14);
    public static Item spikedclub;
    public static Item.ToolMaterial spikedclubmeterial = EnumHelper.addToolMaterial("spikedclub", 0, 1000, 10.0F, 7.0F, 14);
    public static Item mace;
    public static Item.ToolMaterial macemeterial = EnumHelper.addToolMaterial("mace", 0, 1000, 10.0F, 5.0F, 14);

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        sword = new ItemKatana(katanameterial);
        registerItem(sword, "katana");
        axe = new ItemBattleAxe(battleaxemeterial);
        registerItem(axe, "battleaxe");
        spikedclub = new ItemSpikedClub(spikedclubmeterial);
        registerItem(spikedclub, "spikedclub");
        mace = new ItemMace(macemeterial);
        registerItem(mace, "mace");

        crafter = new BlockCrafter(Material.DRAGON_EGG);
        registerBlock(crafter, "crafter");
    }

    static void registerBlock(Block block, String name)
    {
        block.setRegistryName(name);
        block.setUnlocalizedName(block.getRegistryName().toString());
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());}



    private static void registerItem(Item item, String name) {
        item.setRegistryName(new ResourceLocation("advancedweaponarsenal", name));
        item.setUnlocalizedName(item.getRegistryName().toString());
        GameRegistry.register(item);
    }
}
