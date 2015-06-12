package io.github.fergoman123.msb.common.blocks;

import io.github.fergoman123.fergoutil.block.BlockFergo;
import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.enums.SkullType;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.World;

import java.util.List;

public class BlockSkullStorage extends BlockMultiMSB
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", SkullType.class);

    public BlockSkullStorage()
    {
        super(BlockNames.blockSkull, BlockNames.blockSkullName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, SkullType.blockSkullSkeleton));
        this.setStepSound(BlockFergo.soundTypeMetal);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, SkullType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {

        return ((SkullType)state.getValue(VARIANT)).ordinal();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }

    @Override
    public Item getItem(World worldIn, BlockPos pos) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((SkullType)state.getValue(VARIANT)).ordinal();
    }
}
