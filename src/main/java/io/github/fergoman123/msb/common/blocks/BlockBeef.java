package io.github.fergoman123.msb.common.blocks;

import java.util.Random;

import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.enums.EnumTypes.Beef;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.init.Sounds;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockBeef extends BlockMultiMSB {

    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", Beef.class);

    public BlockBeef() {
        super(BlockNames.blockBeef, BlockNames.blockBeefName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, Beef.blockRawBeef));
        this.setStepSound(Sounds.cow);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, Beef.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((Beef) state.getValue(VARIANT)).getMeta();
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
        return ((Beef)state.getValue(VARIANT)).getMeta();
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
    	// TODO fix this
    	return null;
    }
}
