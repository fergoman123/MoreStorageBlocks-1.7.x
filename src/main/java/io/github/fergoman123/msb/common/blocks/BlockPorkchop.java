package io.github.fergoman123.msb.common.blocks;

import java.util.Random;

import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.enums.EnumTypes;
import io.github.fergoman123.msb.info.BlockNames;
import io.github.fergoman123.msb.init.Sounds;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockPorkchop extends BlockMultiMSB
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumTypes.Porkchop.class);

    public BlockPorkchop()
    {
        super(BlockNames.blockPorkchop, BlockNames.blockPorkchopName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumTypes.Porkchop.blockRawPorkchop));
        this.setStepSound(Sounds.pig);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote)
        {
            return false;
        }
        else
        {
            worldIn.playSoundAtEntity(playerIn, "pig", 1f, 1f);
            return true;
        }
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumTypes.Porkchop.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumTypes.Porkchop)state.getValue(VARIANT)).ordinal();
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
        return ((EnumTypes.Porkchop)state.getValue(VARIANT)).ordinal();
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
    	return Item.getItemFromBlock(this);
    }
}
