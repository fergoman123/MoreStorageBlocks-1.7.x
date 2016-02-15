package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public class BlockCompGravel extends BlockMultiMSB {
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockCompGravel(String name) {
        super(EnumType.getNames(), name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockCompGravel1));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((EnumType) state.getValue(VARIANT)).ordinal();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumType) state.getValue(VARIANT)).ordinal();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }

    @Override
    protected ItemStack createStackedBlock(IBlockState state) {
        return ((EnumType) state.getValue(VARIANT)).getItemStack(1);
    }

    public enum EnumType implements IStringSerializable {

        blockCompGravel1(0, "blockCompGravel1"),
        blockCompGravel2(1, "blockCompGravel2"),
        blockCompGravel3(2, "blockCompGravel3"),
        blockCompGravel4(3, "blockCompGravel4"),
        blockCompGravel5(4, "blockCompGravel5"),
        blockCompGravel6(5, "blockCompGravel6"),
        blockCompGravel7(6, "blockCompGravel7"),
        blockCompGravel8(7, "blockCompGravel8"),
        blockCompGravel9(8, "blockCompGravel9"),
        blockCompGravel10(9, "blockCompGravel10"),
        blockCompGravel11(10, "blockCompGravel11"),
        blockCompGravel12(11, "blockCompGravel12"),
        blockCompGravel13(12, "blockCompGravel13"),
        blockCompGravel14(13, "blockCompGravel14"),
        blockCompGravel15(14, "blockCompGravel15"),
        blockCompGravel16(15, "blockCompGravel16");

        private int meta;
        public String name;

        EnumType(int meta, String name) {
            this.meta = meta;
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }

        public static String[] getNames() {
            String[] names = new String[values().length];
            for (int i = 0; i < names.length; i++) {
                names[i] = values()[i].getName();
            }
            return names;
        }

        public int meta(){
            return this.meta;
        }

        public ItemStack getItemStack(int amt) {
            return new ItemStack(ModBlocks.blockCompGravel, amt, this.meta);
        }
    }
}
