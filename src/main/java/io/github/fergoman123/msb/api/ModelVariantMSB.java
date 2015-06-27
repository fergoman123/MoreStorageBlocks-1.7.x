/*
 * More Storage Blocks
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.msb.api;

import io.github.fergoman123.fergoutil.model.ModelVariant;
import io.github.fergoman123.msb.info.ModInfo;
import net.minecraft.block.Block;

public class ModelVariantMSB extends ModelVariant
{

    public ModelVariantMSB(Block block, String variant) {
        super(block, ModInfo.modid.toLowerCase() + ":" + variant);
    }
}
