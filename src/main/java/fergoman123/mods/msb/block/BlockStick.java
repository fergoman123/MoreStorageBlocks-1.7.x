package fergoman123.mods.msb.block;

import fergoman123.mods.msb.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 24/08/2014.
 */
public class BlockStick extends BlockMSB {

    public BlockStick() {
        super();
        this.setBlockName(Names.Blocks.blockStick);
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par3) {
        return Item.getItemFromBlock(this);
    }
}
