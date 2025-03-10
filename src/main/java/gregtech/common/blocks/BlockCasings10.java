package gregtech.common.blocks;

import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Textures;
import gregtech.api.util.GTLanguageManager;

/**
 * The casings are split into separate files because they are registered as regular blocks, and a regular block can have
 * 16 subtypes at most.
 */
public class BlockCasings10 extends BlockCasingsAbstract {

    public BlockCasings10() {
        super(ItemCasings10.class, "gt.blockcasings10", MaterialCasings.INSTANCE, 16);
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".0.name", "MagTech Casing");
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".1.name", "Laser Containment Casing");
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".2.name", "Quark Exclusion Casing");
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".3.name", "Pressure Containment Casing");
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".4.name", "Electric Compressor Casing");
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".5.name", "Compression Pipe Casing");
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".6.name", "Neutronium Casing");
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".7.name", "Active Neutronium Casing");
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".8.name", "Neutronium Stabilization Casing");
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".9.name", "Coolant Duct");
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".10.name", "Heating Duct");
        GTLanguageManager
            .addStringLocalization(getUnlocalizedName() + ".11.name", "Extreme Density Space-Bending Casing");
        GTLanguageManager
            .addStringLocalization(getUnlocalizedName() + ".12.name", "Background Radiation Absorbent Casing");
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".13.name", "Solidifier Casing");
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".14.name", "Solidifier Radiator");
        GTLanguageManager.addStringLocalization(getUnlocalizedName() + ".15.name", "Reinforced Wooden Casing");

        ItemList.Casing_Electromagnetic_Separator.set(new ItemStack(this, 1, 0));
        ItemList.Casing_Laser.set(new ItemStack(this, 1, 1));
        ItemList.BlockQuarkContainmentCasing.set(new ItemStack(this, 1, 2));
        ItemList.Casing_Autoclave.set(new ItemStack(this, 1, 3));
        ItemList.Compressor_Casing.set(new ItemStack(this, 1, 4));
        ItemList.Compressor_Pipe_Casing.set(new ItemStack(this, 1, 5));
        ItemList.Neutronium_Casing.set(new ItemStack(this, 1, 6));
        ItemList.Neutronium_Active_Casing.set(new ItemStack(this, 1, 7));
        ItemList.Neutronium_Stable_Casing.set(new ItemStack(this, 1, 8));
        ItemList.Coolant_Duct_Casing.set(new ItemStack(this, 1, 9));
        ItemList.Heating_Duct_Casing.set(new ItemStack(this, 1, 10));
        ItemList.Extreme_Density_Casing.set(new ItemStack(this, 1, 11));
        ItemList.Background_Radiation_Casing.set(new ItemStack(this, 1, 12));
        ItemList.Casing_Fluid_Solidifier.set(new ItemStack(this, 1, 13));
        ItemList.Radiator_Fluid_Solidifier.set(new ItemStack(this, 1, 14));
        ItemList.Casing_Reinforced_Wood.set(new ItemStack(this, 1, 15));
    }

    @Override
    public int getTextureIndex(int aMeta) {
        return (16 << 7) | (aMeta + 48);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int ordinalSide, int aMeta) {
        return switch (aMeta) {
            case 0 -> Textures.BlockIcons.MACHINE_CASING_EMS.getIcon();
            case 1 -> Textures.BlockIcons.MACHINE_CASING_LASER.getIcon();
            case 2 -> Textures.BlockIcons.BLOCK_QUARK_CONTAINMENT_CASING.getIcon();
            case 3 -> Textures.BlockIcons.MACHINE_CASING_AUTOCLAVE.getIcon();
            case 4 -> Textures.BlockIcons.COMPRESSOR_CASING.getIcon();
            case 5 -> Textures.BlockIcons.COMPRESSOR_PIPE_CASING.getIcon();
            case 6 -> Textures.BlockIcons.NEUTRONIUM_CASING.getIcon();
            case 7 -> Textures.BlockIcons.NEUTRONIUM_ACTIVE_CASING.getIcon();
            case 8 -> Textures.BlockIcons.NEUTRONIUM_STABLE_CASING.getIcon();
            case 9 -> Textures.BlockIcons.COOLANT_DUCT_CASING.getIcon();
            case 10 -> Textures.BlockIcons.HEATING_DUCT_CASING.getIcon();
            case 11 -> Textures.BlockIcons.EXTREME_DENSITY_CASING.getIcon();
            case 12 -> Textures.BlockIcons.RADIATION_ABSORBENT_CASING.getIcon();
            case 13 -> Textures.BlockIcons.MACHINE_CASING_MS160.getIcon();
            case 14 -> Textures.BlockIcons.RADIATOR_MS160.getIcon();
            case 15 -> ordinalSide > 1 ? Textures.BlockIcons.CASING_REINFORCED_WOOD.getIcon()
                : Textures.BlockIcons.CASING_REINFORCED_WOOD_TOP.getIcon();
            default -> Textures.BlockIcons.MACHINE_CASING_ROBUST_TUNGSTENSTEEL.getIcon();
        };
    }
}
