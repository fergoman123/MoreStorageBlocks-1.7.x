package io.github.fergoman123.msb.block;

import io.github.fergoman123.msb.init.ModBlocks;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public class BlockFish extends BlockMultiMSB {
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockFish(String name) {
        super(EnumType.getNames(), name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockRawFish));
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

    public enum EnumType implements IStringSerializable {
        blockRawFish(0, "blockRawFish"),
        blockRawSalmon(1, "blockRawSalmon"),
        blockClownfish(2, "blockClownfish"),
        blockPufferfish(3, "blockPufferfish"),
        blockCookedFish(4, "blockCookedFish"),
        blockCookedSalmon(5, "blockCookedSalmon");

        private int meta;
        private String name;

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
            return new ItemStack(ModBlocks.blockFish, amt, this.meta);
        }
    }
}
