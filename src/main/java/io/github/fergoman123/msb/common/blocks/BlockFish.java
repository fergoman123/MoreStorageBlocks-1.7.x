package io.github.fergoman123.msb.common.blocks;

import io.github.fergoman123.msb.api.BlockMultiMSB;
import io.github.fergoman123.msb.info.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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

public class BlockFish extends BlockMultiMSB
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", EnumType.class);

    public BlockFish()
    {
        super(Material.iron, BlockNames.blockFish, BlockNames.blockFishName);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType.blockRawFish));
        this.setStepSound(Block.soundTypeMetal);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumType)state.getValue(VARIANT)).ordinal();
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
        return ((EnumType)state.getValue(VARIANT)).ordinal();
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        list.add(new ItemStack(item, 1, EnumType.blockRawFish.getMeta()));
        list.add(new ItemStack(item, 1, EnumType.blockRawSalmon.getMeta()));
        list.add(new ItemStack(item, 1, EnumType.blockClownfish.getMeta()));
        list.add(new ItemStack(item, 1, EnumType.blockPufferfish.getMeta()));
        list.add(new ItemStack(item, 1, EnumType.blockCookedFish.getMeta()));
        list.add(new ItemStack(item, 1, EnumType.blockCookedSalmon.getMeta()));
    }

    public enum EnumType implements IStringSerializable
    {
        blockRawFish,
        blockRawSalmon,
        blockClownfish,
        blockPufferfish,
        blockCookedFish,
        blockCookedSalmon;

        @Override
        public String getName() {
            return this.name();
        }

        @Override
        public String toString() {
            return this.getName();
        }

        public int getMeta()
        {
            return this.ordinal();
        }
    }
}