package io.github.fergoman123.msb.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static io.github.fergoman123.fergoutil.helper.RecipeHelper.addStorageBlockRecipe;
//todo recipes
public class Recipes
{
    public static final String[] blockRecipe = new String[]{"xxx", "xxx", "xxx"};
    public static final char x = 'x';

    public static void init()
    {
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockCharcoal), new ItemStack(Items.coal, 1, 1));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockApple), new ItemStack(Items.apple));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockGoldApple, 1, 0), new ItemStack(Items.golden_apple, 1, 0));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockGoldApple, 1, 1), new ItemStack(Items.golden_apple, 1, 1));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockBook), new ItemStack(Items.book));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockEgg), new ItemStack(Items.egg));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockEnderPearl), new ItemStack(Items.ender_pearl));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockEnderEye), new ItemStack(Items.ender_eye));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockLead), new ItemStack(Items.lead));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockReed), new ItemStack(Items.reeds));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockSeeds, 1, 0), new ItemStack(Items.wheat_seeds));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockSeeds, 1, 1), new ItemStack(Items.pumpkin_seeds));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockSeeds, 1, 2), new ItemStack(Items.melon_seeds));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockStick), new ItemStack(Items.stick));
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockLeather), new ItemStack(Items.leather));
        for (int i = 0; i < 15; i++) {
            int[] dyedamage = new int[]{0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
            addStorageBlockRecipe(new ItemStack(ModBlocks.blockDye, 1, i), new ItemStack(Items.dye, 1, dyedamage[i]));
        }
        addStorageBlockRecipe(new ItemStack(ModBlocks.blockFireball), new ItemStack(Items.fire_charge));
//        addBlockRecipe(RecipeList.blockFireball);
//        addBlockRecipe(RecipeList.blockSlimeball);
//        addBlockRecipe(RecipeList.blockRottenFlesh);
//        addBlockRecipe(RecipeList.blockPotato);
//        addBlockRecipe(RecipeList.blockNetherWart);
//        addBlockRecipe(RecipeList.blockGunpowder);
//        addBlockRecipe(RecipeList.blockCarrot);
//        addBlockRecipe(RecipeList.blockArrow);
//        addBlockRecipe(RecipeList.blockBlazeRod);
//        addBlockRecipe(RecipeList.blockFlint);
//        addBlockRecipe(RecipeList.blockBone);
//        addBlockRecipe(RecipeList.blockSugar);
//        addBlockRecipe(RecipeList.blockNetherStar);
//        addBlockRecipe(RecipeList.blockClay);
//        addBlockRecipe(RecipeList.blockString);
//        addBlockRecipe(RecipeList.blockFeather);
//        addBlockRecipe(RecipeList.blockBread);
//        addBlockRecipe(RecipeList.blockPorkchop0);
//        addBlockRecipe(RecipeList.blockPorkchop1);
//        addBlockRecipe(RecipeList.blockFish0);
//        addBlockRecipe(RecipeList.blockFish1);
//        addBlockRecipe(RecipeList.blockFish2);
//        addBlockRecipe(RecipeList.blockFish3);
//        addBlockRecipe(RecipeList.blockFish4);
//        addBlockRecipe(RecipeList.blockFish5);
//        addBlockRecipe(RecipeList.blockCookie);
//        addBlockRecipe(RecipeList.blockBeef0);
//        addBlockRecipe(RecipeList.blockBeef1);
//        addBlockRecipe(RecipeList.blockPumpkinPie);
//        addBlockRecipe(RecipeList.blockGhastTear);
//        addBlockRecipe(RecipeList.blockSkull0);
//        addBlockRecipe(RecipeList.blockSkull1);
//        addBlockRecipe(RecipeList.blockSkull2);
//        addBlockRecipe(RecipeList.blockSkull3);
//        addBlockRecipe(RecipeList.blockMutton0);
//        addBlockRecipe(RecipeList.blockMutton1);
//        addBlockRecipe(RecipeList.blockRabbit0);
//        addBlockRecipe(RecipeList.blockRabbit1);
//
//        addShapelessItemRecipe(RecipeList.charcoal);
//        addShapelessItemRecipe(RecipeList.apple);
//        addShapelessItemRecipe(RecipeList.golden_apple0);
//        addShapelessItemRecipe(RecipeList.golden_apple1);
//        addShapelessItemRecipe(RecipeList.book);
//        addShapelessItemRecipe(RecipeList.egg);
//        addShapelessItemRecipe(RecipeList.ender_pearl);
//        addShapelessItemRecipe(RecipeList.ender_eye);
//        addShapelessItemRecipe(RecipeList.lead);
//        addShapelessItemRecipe(RecipeList.reeds);
//        addShapelessItemRecipe(RecipeList.wheat_seeds);
//        addShapelessItemRecipe(RecipeList.pumpkin_seeds);
//        addShapelessItemRecipe(RecipeList.melon_seeds);
//        addShapelessItemRecipe(RecipeList.stick);
//        addShapelessItemRecipe(RecipeList.leather);
//        addShapelessItemRecipe(RecipeList.bucket);
//        for (ShapelessItemRecipe recipe : RecipeList.dye) {
//            addShapelessItemRecipe(recipe);
//        }
//        addShapelessItemRecipe(RecipeList.fire_charge);
//        addShapelessItemRecipe(RecipeList.slime_ball);
//        addShapelessItemRecipe(RecipeList.rotten_flesh);
//        addShapelessItemRecipe(RecipeList.potato);
//        addShapelessItemRecipe(RecipeList.nether_wart);
//        addShapelessItemRecipe(RecipeList.gunpowder);
//        addShapelessItemRecipe(RecipeList.carrot);
//        addShapelessItemRecipe(RecipeList.arrow);
//        addShapelessItemRecipe(RecipeList.blaze_rod);
//        addShapelessItemRecipe(RecipeList.flint);
//        addShapelessItemRecipe(RecipeList.bone);
//        addShapelessItemRecipe(RecipeList.sugar);
//        addShapelessItemRecipe(RecipeList.nether_star);
//        addShapelessItemRecipe(RecipeList.clay_ball);
//        addShapelessItemRecipe(RecipeList.string);
//        addShapelessItemRecipe(RecipeList.feather);
//        addShapelessItemRecipe(RecipeList.bread);
//        addShapelessItemRecipe(RecipeList.porkchop);
//        addShapelessItemRecipe(RecipeList.cooked_porkchop);
//        addShapelessItemRecipe(RecipeList.fish0);
//        addShapelessItemRecipe(RecipeList.fish1);
//        addShapelessItemRecipe(RecipeList.fish2);
//        addShapelessItemRecipe(RecipeList.fish3);
//        addShapelessItemRecipe(RecipeList.cooked_fish0);
//        addShapelessItemRecipe(RecipeList.cooked_fish1);
//        addShapelessItemRecipe(RecipeList.cookie);
//        addShapelessItemRecipe(RecipeList.beef);
//        addShapelessItemRecipe(RecipeList.cooked_beef);
//        addShapelessItemRecipe(RecipeList.pumpkin_pie);
//        addShapelessItemRecipe(RecipeList.ghast_tear);
//        addShapelessItemRecipe(RecipeList.skull0);
//        addShapelessItemRecipe(RecipeList.skull1);
//        addShapelessItemRecipe(RecipeList.skull2);
//        addShapelessItemRecipe(RecipeList.skull4);
//        addShapelessItemRecipe(RecipeList.mutton);
//        addShapelessItemRecipe(RecipeList.cooked_mutton);
//        addShapelessItemRecipe(RecipeList.rabbit);
//        addShapelessItemRecipe(RecipeList.cooked_rabbit);
    }

    //    public static final ItemStack blockCharcoal = new ItemStack(new ItemStack(ModBlocks.blockCharcoal), new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.coal, 1, 1)});
//    public static final BlockRecipe blockApple = new BlockRecipe(ModBlocks.blockApple, new Object[]{"xxx", "xxx", "xxx", 'x', Items.apple});
//    public static final BlockRecipe blockGoldApple0 = new BlockRecipe(ModBlocks.blockGoldApple, 1, 0, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.golden_apple, 1, 0)});
//    public static final BlockRecipe blockGoldApple1 = new BlockRecipe(ModBlocks.blockGoldApple, 1, 1, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.golden_apple, 1, 1)});
//    public static final BlockRecipe blockBook = new BlockRecipe(ModBlocks.blockBook, new Object[]{"xxx", "xxx", "xxx", 'x', Items.book});
//    public static final BlockRecipe blockEgg = new BlockRecipe(ModBlocks.blockEgg, new Object[]{"xxx", "xxx", "xxx", 'x', Items.egg});
//    public static final BlockRecipe blockEnderPearl = new BlockRecipe(ModBlocks.blockEnderPearl, new Object[]{"xxx", "xxx", "xxx", 'x', Items.ender_pearl});
//    public static final BlockRecipe blockEnderEye = new BlockRecipe(ModBlocks.blockEnderEye, new Object[]{"xxx", "xxx", "xxx", 'x', Items.ender_eye});
//    public static final BlockRecipe blockLead = new BlockRecipe(ModBlocks.blockLead, new Object[]{"xxx", "xxx", "xxx", 'x', Items.lead});
//    public static final BlockRecipe blockLeather = new BlockRecipe(ModBlocks.blockLeather, new Object[]{"xxx", "xxx", "xxx", 'x', Items.leather});
//    public static final BlockRecipe blockReed = new BlockRecipe(ModBlocks.blockReed, new Object[]{"xxx", "xxx", "xxx", 'x', Items.reeds});
//    public static final BlockRecipe blockSeeds0 = new BlockRecipe(ModBlocks.blockSeeds, 1, 0, new Object[]{"xxx", "xxx", "xxx", 'x', Items.wheat_seeds});
//    public static final BlockRecipe blockSeeds1 = new BlockRecipe(ModBlocks.blockSeeds, 1, 1, new Object[]{"xxx", "xxx", "xxx", 'x', Items.pumpkin_seeds});
//    public static final BlockRecipe blockSeeds2 = new BlockRecipe(ModBlocks.blockSeeds, 1, 2, new Object[]{"xxx", "xxx", "xxx", 'x', Items.melon_seeds});
//    public static final BlockRecipe blockStick = new BlockRecipe(ModBlocks.blockStick, new Object[]{"xxx", "xxx", "xxx", 'x', Items.stick});
//    public static final BlockRecipe blockBucket = new BlockRecipe(ModBlocks.blockBucket, new Object[]{"xxx", "xxx", "xxx", 'x', Items.bucket});
//    public static final BlockRecipe blockDye0 = new BlockRecipe(ModBlocks.blockDye, 1, 0, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 0)});
//    public static final BlockRecipe blockDye1 = new BlockRecipe(ModBlocks.blockDye, 1, 1, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 1)});
//    public static final BlockRecipe blockDye2 = new BlockRecipe(ModBlocks.blockDye, 1, 2, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 2)});
//    public static final BlockRecipe blockDye3 = new BlockRecipe(ModBlocks.blockDye, 1, 3, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 3)});
//    public static final BlockRecipe blockDye4 = new BlockRecipe(ModBlocks.blockDye, 1, 4, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 5)});
//    public static final BlockRecipe blockDye5 = new BlockRecipe(ModBlocks.blockDye, 1, 5, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 6)});
//    public static final BlockRecipe blockDye6 = new BlockRecipe(ModBlocks.blockDye, 1, 6, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 7)});
//    public static final BlockRecipe blockDye7 = new BlockRecipe(ModBlocks.blockDye, 1, 7, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 8)});
//    public static final BlockRecipe blockDye8 = new BlockRecipe(ModBlocks.blockDye, 1, 8, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 9)});
//    public static final BlockRecipe blockDye9 = new BlockRecipe(ModBlocks.blockDye, 1, 9, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 10)});
//    public static final BlockRecipe blockDye10 = new BlockRecipe(ModBlocks.blockDye, 1, 10, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 11)});
//    public static final BlockRecipe blockDye11 = new BlockRecipe(ModBlocks.blockDye, 1, 11, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 12)});
//    public static final BlockRecipe blockDye12 = new BlockRecipe(ModBlocks.blockDye, 1, 12, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 13)});
//    public static final BlockRecipe blockDye13 = new BlockRecipe(ModBlocks.blockDye, 1, 13, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 14)});
//    public static final BlockRecipe blockDye14 = new BlockRecipe(ModBlocks.blockDye, 1, 14, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 15)});
//    public static final BlockRecipe blockFireball = new BlockRecipe(ModBlocks.blockFireball, new Object[]{"xxx", "xxx", "xxx", 'x', Items.fire_charge});
//    public static final BlockRecipe blockSlimeball = new BlockRecipe(ModBlocks.blockSlimeball, new Object[]{"xxx", "xxx", "xxx", 'x', Items.slime_ball});
//    public static final BlockRecipe blockRottenFlesh = new BlockRecipe(ModBlocks.blockRottenFlesh, new Object[]{"xxx", "xxx", "xxx", 'x', Items.rotten_flesh});
//    public static final BlockRecipe blockPotato = new BlockRecipe(ModBlocks.blockPotato, new Object[]{"xxx", "xxx", "xxx", 'x', Items.potato});
//    public static final BlockRecipe blockNetherWart = new BlockRecipe(ModBlocks.blockNetherWart, new Object[]{"xxx", "xxx", "xxx", 'x', Items.nether_wart});
//    public static final BlockRecipe blockGunpowder = new BlockRecipe(ModBlocks.blockGunpowder, new Object[]{"xxx", "xxx", "xxx", 'x', Items.gunpowder});
//    public static final BlockRecipe blockCarrot = new BlockRecipe(ModBlocks.blockCarrot, new Object[]{"xxx", "xxx", "xxx", 'x', Items.carrot});
//    public static final BlockRecipe blockArrow = new BlockRecipe(ModBlocks.blockArrow, new Object[]{"xxx", "xxx", "xxx", 'x', Items.arrow});
//    public static final BlockRecipe blockBlazeRod = new BlockRecipe(ModBlocks.blockBlazeRod, new Object[]{"xxx", "xxx", "xxx", 'x', Items.blaze_rod});
//    public static final BlockRecipe blockFlint = new BlockRecipe(ModBlocks.blockFlint, new Object[]{"xxx", "xxx", "xxx", 'x', Items.flint});
//    public static final BlockRecipe blockBone = new BlockRecipe(ModBlocks.blockBone, new Object[]{"xxx", "xxx", "xxx", 'x', Items.bone});
//    public static final BlockRecipe blockSugar = new BlockRecipe(ModBlocks.blockSugar, new Object[]{"xxx", "xxx", "xxx", 'x', Items.sugar});
//    public static final BlockRecipe blockNetherStar = new BlockRecipe(ModBlocks.blockNetherStar, new Object[]{"xxx", "xxx", "xxx", 'x', Items.nether_star});
//    public static final BlockRecipe blockClay = new BlockRecipe(ModBlocks.blockClay, new Object[]{"xxx", "xxx", "xxx", 'x', Items.clay_ball});
//    public static final BlockRecipe blockString = new BlockRecipe(ModBlocks.blockString, new Object[]{"xxx", "xxx", "xxx", 'x', Items.string});
//    public static final BlockRecipe blockFeather = new BlockRecipe(ModBlocks.blockFeather, new Object[]{"xxx", "xxx", "xxx", 'x', Items.feather});
//    public static final BlockRecipe blockBread = new BlockRecipe(ModBlocks.blockBread, new Object[]{"xxx", "xxx", "xxx", 'x', Items.bread});
//    public static final BlockRecipe blockPorkchop0 = new BlockRecipe(ModBlocks.blockPorkchop, 1, 0, new Object[]{"xxx", "xxx", "xxx", 'x', Items.porkchop});
//    public static final BlockRecipe blockPorkchop1 = new BlockRecipe(ModBlocks.blockPorkchop, 1, 1, new Object[]{"xxx", "xxx", "xxx", 'x', Items.cooked_porkchop});
//    public static final BlockRecipe blockFish0 = new BlockRecipe(ModBlocks.blockFish, 1, 0, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.fish, 1, 0)});
//    public static final BlockRecipe blockFish1 = new BlockRecipe(ModBlocks.blockFish, 1, 1, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.fish, 1, 1)});
//    public static final BlockRecipe blockFish2 = new BlockRecipe(ModBlocks.blockFish, 1, 2, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.fish, 1, 2)});
//    public static final BlockRecipe blockFish3 = new BlockRecipe(ModBlocks.blockFish, 1, 3, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.fish, 1, 3)});
//    public static final BlockRecipe blockFish4 = new BlockRecipe(ModBlocks.blockFish, 1, 4, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.cooked_fish, 1, 0)});
//    public static final BlockRecipe blockFish5 = new BlockRecipe(ModBlocks.blockFish, 1, 5, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.cooked_fish, 1, 1)});
//    public static final BlockRecipe blockCookie = new BlockRecipe(ModBlocks.blockCookie, new Object[]{"xxx", "xxx", "xxx", 'x', Items.cookie});
//    public static final BlockRecipe blockBeef0 = new BlockRecipe(ModBlocks.blockBeef, 1, 0, new Object[]{"xxx", "xxx", "xxx", 'x', Items.beef});
//    public static final BlockRecipe blockBeef1 = new BlockRecipe(ModBlocks.blockBeef, 1, 1, new Object[]{"xxx", "xxx", "xxx", 'x', Items.cooked_beef});
//    public static final BlockRecipe blockPumpkinPie = new BlockRecipe(ModBlocks.blockPumpkinPie, new Object[]{"xxx", "xxx", "xxx", 'x', Items.pumpkin_pie});
//    public static final BlockRecipe blockGhastTear = new BlockRecipe(ModBlocks.blockGhastTear, new Object[]{"xxx", "xxx", "xxx", 'x', Items.ghast_tear});
//    public static final BlockRecipe blockSkull0 = new BlockRecipe(ModBlocks.blockSkull, 1, 0, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.skull, 1, 0)});
//    public static final BlockRecipe blockSkull1 = new BlockRecipe(ModBlocks.blockSkull, 1, 1, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.skull, 1, 1)});
//    public static final BlockRecipe blockSkull2 = new BlockRecipe(ModBlocks.blockSkull, 1, 2, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.skull, 1, 2)});
//    public static final BlockRecipe blockSkull3 = new BlockRecipe(ModBlocks.blockSkull, 1, 3, new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.skull, 1, 4)});
//    public static final BlockRecipe blockMutton0 = new BlockRecipe(ModBlocks.blockMutton, 1, 0, new Object[]{"xxx", "xxx", "xxx", 'x', Items.mutton});
//    public static final BlockRecipe blockMutton1 = new BlockRecipe(ModBlocks.blockMutton, 1, 1, new Object[]{"xxx", "xxx", "xxx", 'x', Items.cooked_mutton});
//    public static final BlockRecipe blockRabbit0 = new BlockRecipe(ModBlocks.blockRabbit, 1, 0, new Object[]{"xxx", "xxx", "xxx", 'x', Items.rabbit});
//    public static final BlockRecipe blockRabbit1 = new BlockRecipe(ModBlocks.blockRabbit, 1, 1, new Object[]{"xxx", "xxx", "xxx", 'x', Items.cooked_rabbit});
//
//    public static final BlockRecipe[] blockDye = new BlockRecipe[]{blockDye0, blockDye1, blockDye2, blockDye3, blockDye4, blockDye5, blockDye6, blockDye7, blockDye8, blockDye9, blockDye10, blockDye11, blockDye12, blockDye13, blockDye14};
//
//    public static final ShapelessItemRecipe charcoal = new ShapelessItemRecipe(Items.coal, 9, 1, new ItemStack(ModBlocks.blockCharcoal));
//    public static final ShapelessItemRecipe apple = new ShapelessItemRecipe(Items.apple, 9, new ItemStack(ModBlocks.blockApple));
//    public static final ShapelessItemRecipe golden_apple0 = new ShapelessItemRecipe(Items.golden_apple, 9, 0, new ItemStack(ModBlocks.blockGoldApple, 1, 0));
//    public static final ShapelessItemRecipe golden_apple1 = new ShapelessItemRecipe(Items.golden_apple, 9, 1, new ItemStack(ModBlocks.blockGoldApple, 1, 1));
//    public static final ShapelessItemRecipe book = new ShapelessItemRecipe(Items.book, new ItemStack(ModBlocks.blockBook));
//    public static final ShapelessItemRecipe egg = new ShapelessItemRecipe(Items.egg, 9, new ItemStack(ModBlocks.blockEgg));
//    public static final ShapelessItemRecipe ender_pearl = new ShapelessItemRecipe(Items.ender_pearl, 9, new ItemStack(ModBlocks.blockEnderPearl));
//    public static final ShapelessItemRecipe ender_eye = new ShapelessItemRecipe(Items.ender_eye, 9, new ItemStack(ModBlocks.blockEnderEye));
//    public static final ShapelessItemRecipe lead = new ShapelessItemRecipe(Items.lead, 9, new ItemStack(ModBlocks.blockLead));
//    public static final ShapelessItemRecipe reeds = new ShapelessItemRecipe(Items.reeds, 9, new ItemStack(ModBlocks.blockReed));
//    public static final ShapelessItemRecipe wheat_seeds = new ShapelessItemRecipe(Items.wheat_seeds, 9, new ItemStack(ModBlocks.blockSeeds, 1, 0));
//    public static final ShapelessItemRecipe pumpkin_seeds = new ShapelessItemRecipe(Items.pumpkin_seeds, 9, new ItemStack(ModBlocks.blockSeeds, 1, 1));
//    public static final ShapelessItemRecipe melon_seeds = new ShapelessItemRecipe(Items.melon_seeds, 9, new ItemStack(ModBlocks.blockSeeds, 1, 2));
//    public static final ShapelessItemRecipe stick = new ShapelessItemRecipe(Items.stick, 9, new ItemStack(ModBlocks.blockStick));
//    public static final ShapelessItemRecipe leather = new ShapelessItemRecipe(Items.leather, 9, new ItemStack(ModBlocks.blockLeather));
//    public static final ShapelessItemRecipe bucket = new ShapelessItemRecipe(Items.bucket, 9, new ItemStack(ModBlocks.blockBucket));
//    public static final ShapelessItemRecipe dye0 = new ShapelessItemRecipe(Items.dye, 9, 0, new ItemStack(ModBlocks.blockDye, 1, 0));
//    public static final ShapelessItemRecipe dye1 = new ShapelessItemRecipe(Items.dye, 9, 1, new ItemStack(ModBlocks.blockDye, 1, 1));
//    public static final ShapelessItemRecipe dye2 = new ShapelessItemRecipe(Items.dye, 9, 2, new ItemStack(ModBlocks.blockDye, 1, 2));
//    public static final ShapelessItemRecipe dye3 = new ShapelessItemRecipe(Items.dye, 9, 3, new ItemStack(ModBlocks.blockDye, 1, 3));
//    public static final ShapelessItemRecipe dye5 = new ShapelessItemRecipe(Items.dye, 9, 5, new ItemStack(ModBlocks.blockDye, 1, 4));
//    public static final ShapelessItemRecipe dye6 = new ShapelessItemRecipe(Items.dye, 9, 6, new ItemStack(ModBlocks.blockDye, 1, 5));
//    public static final ShapelessItemRecipe dye7 = new ShapelessItemRecipe(Items.dye, 9, 7, new ItemStack(ModBlocks.blockDye, 1, 6));
//    public static final ShapelessItemRecipe dye8 = new ShapelessItemRecipe(Items.dye, 9, 8, new ItemStack(ModBlocks.blockDye, 1, 7));
//    public static final ShapelessItemRecipe dye9 = new ShapelessItemRecipe(Items.dye, 9, 9, new ItemStack(ModBlocks.blockDye, 1, 8));
//    public static final ShapelessItemRecipe dye10 = new ShapelessItemRecipe(Items.dye, 9, 10, new ItemStack(ModBlocks.blockDye, 1, 9));
//    public static final ShapelessItemRecipe dye11 = new ShapelessItemRecipe(Items.dye, 9, 11, new ItemStack(ModBlocks.blockDye, 1, 10));
//    public static final ShapelessItemRecipe dye12 = new ShapelessItemRecipe(Items.dye, 9, 12, new ItemStack(ModBlocks.blockDye, 1, 11));
//    public static final ShapelessItemRecipe dye13 = new ShapelessItemRecipe(Items.dye, 9, 13, new ItemStack(ModBlocks.blockDye, 1, 12));
//    public static final ShapelessItemRecipe dye14 = new ShapelessItemRecipe(Items.dye, 9, 14, new ItemStack(ModBlocks.blockDye, 1, 13));
//    public static final ShapelessItemRecipe dye15 = new ShapelessItemRecipe(Items.dye, 9, 15, new ItemStack(ModBlocks.blockDye, 1, 14));
//    public static final ShapelessItemRecipe[] dye = new ShapelessItemRecipe[]{dye0, dye1, dye2, dye3, dye5, dye6, dye7, dye8, dye9, dye10, dye11, dye12, dye13, dye14, dye15};
//    public static final ShapelessItemRecipe fire_charge = new ShapelessItemRecipe(Items.fire_charge, 9, new ItemStack(ModBlocks.blockFireball));
//    public static final ShapelessItemRecipe slime_ball = new ShapelessItemRecipe(Items.slime_ball, 9, new ItemStack(ModBlocks.blockSlimeball));
//    public static final ShapelessItemRecipe rotten_flesh = new ShapelessItemRecipe(Items.rotten_flesh, 9, new ItemStack(ModBlocks.blockRottenFlesh));
//    public static final ShapelessItemRecipe potato = new ShapelessItemRecipe(Items.potato, 9, new ItemStack(ModBlocks.blockPotato));
//    public static final ShapelessItemRecipe nether_wart = new ShapelessItemRecipe(Items.nether_wart, 9, new ItemStack(ModBlocks.blockNetherWart));
//    public static final ShapelessItemRecipe gunpowder = new ShapelessItemRecipe(Items.gunpowder, 9, new ItemStack(ModBlocks.blockGunpowder));
//    public static final ShapelessItemRecipe carrot = new ShapelessItemRecipe(Items.carrot, 9, new ItemStack(ModBlocks.blockCarrot));
//    public static final ShapelessItemRecipe arrow = new ShapelessItemRecipe(Items.arrow, 9, new ItemStack(ModBlocks.blockArrow));
//    public static final ShapelessItemRecipe blaze_rod = new ShapelessItemRecipe(Items.blaze_rod, 9, new ItemStack(ModBlocks.blockBlazeRod));
//    public static final ShapelessItemRecipe flint = new ShapelessItemRecipe(Items.flint, 9, new ItemStack(ModBlocks.blockFlint));
//    public static final ShapelessItemRecipe bone = new ShapelessItemRecipe(Items.bone, 9, new ItemStack(ModBlocks.blockBone));
//    public static final ShapelessItemRecipe sugar = new ShapelessItemRecipe(Items.sugar, 9, new ItemStack(ModBlocks.blockSugar));
//    public static final ShapelessItemRecipe nether_star = new ShapelessItemRecipe(Items.nether_star, 9, new ItemStack(ModBlocks.blockNetherStar));
//    public static final ShapelessItemRecipe clay_ball = new ShapelessItemRecipe(Items.clay_ball, 9, new ItemStack(ModBlocks.blockClay));
//    public static final ShapelessItemRecipe string = new ShapelessItemRecipe(Items.string, 9, new ItemStack(ModBlocks.blockString));
//    public static final ShapelessItemRecipe feather = new ShapelessItemRecipe(Items.feather, 9, new ItemStack(ModBlocks.blockFeather));
//    public static final ShapelessItemRecipe bread = new ShapelessItemRecipe(Items.bread, 9, new ItemStack(ModBlocks.blockBread));
//    public static final ShapelessItemRecipe porkchop = new ShapelessItemRecipe(Items.porkchop, 9, new ItemStack(ModBlocks.blockPorkchop, 1, 0));
//    public static final ShapelessItemRecipe cooked_porkchop = new ShapelessItemRecipe(Items.cooked_porkchop, 9, new ItemStack(ModBlocks.blockPorkchop, 1, 1));
//    public static final ShapelessItemRecipe fish0 = new ShapelessItemRecipe(Items.fish, 9, 0, new ItemStack(ModBlocks.blockFish, 1, 0));
//    public static final ShapelessItemRecipe fish1 = new ShapelessItemRecipe(Items.fish, 9, 1, new ItemStack(ModBlocks.blockFish, 1, 1));
//    public static final ShapelessItemRecipe fish2 = new ShapelessItemRecipe(Items.fish, 9, 2, new ItemStack(ModBlocks.blockFish, 1, 2));
//    public static final ShapelessItemRecipe fish3 = new ShapelessItemRecipe(Items.fish, 9, 3, new ItemStack(ModBlocks.blockFish, 1, 3));
//    public static final ShapelessItemRecipe cooked_fish0 = new ShapelessItemRecipe(Items.cooked_fish, 9, 0, new ItemStack(ModBlocks.blockFish, 1, 4));
//    public static final ShapelessItemRecipe cooked_fish1 = new ShapelessItemRecipe(Items.cooked_fish, 9, 1, new ItemStack(ModBlocks.blockFish, 1, 5));
//    public static final ShapelessItemRecipe cookie = new ShapelessItemRecipe(Items.cookie, 9, new ItemStack(ModBlocks.blockCookie));
//    public static final ShapelessItemRecipe beef = new ShapelessItemRecipe(Items.beef, 9, new ItemStack(ModBlocks.blockBeef, 1, 0));
//    public static final ShapelessItemRecipe cooked_beef = new ShapelessItemRecipe(Items.cooked_beef, 9, new ItemStack(ModBlocks.blockBeef, 1, 1));
//    public static final ShapelessItemRecipe pumpkin_pie = new ShapelessItemRecipe(Items.pumpkin_pie, 9, new ItemStack(ModBlocks.blockPumpkinPie));
//    public static final ShapelessItemRecipe ghast_tear = new ShapelessItemRecipe(Items.ghast_tear, 9, new ItemStack(ModBlocks.blockGhastTear));
//    public static final ShapelessItemRecipe skull0 = new ShapelessItemRecipe(Items.skull, 9, 0, new ItemStack(ModBlocks.blockSkull, 1, 0));
//    public static final ShapelessItemRecipe skull1 = new ShapelessItemRecipe(Items.skull, 9, 1, new ItemStack(ModBlocks.blockSkull, 1, 1));
//    public static final ShapelessItemRecipe skull2 = new ShapelessItemRecipe(Items.skull, 9, 2, new ItemStack(ModBlocks.blockSkull, 1, 2));
//    public static final ShapelessItemRecipe skull4 = new ShapelessItemRecipe(Items.skull, 9, 4, new ItemStack(ModBlocks.blockSkull, 1, 3));
//    public static final ShapelessItemRecipe mutton = new ShapelessItemRecipe(Items.mutton, 9, new ItemStack(ModBlocks.blockMutton, 1, 0));
//    public static final ShapelessItemRecipe cooked_mutton = new ShapelessItemRecipe(Items.cooked_mutton, 9, new ItemStack(ModBlocks.blockMutton, 1, 1));
//    public static final ShapelessItemRecipe rabbit = new ShapelessItemRecipe(Items.rabbit, 9, new ItemStack(ModBlocks.blockRabbit, 1, 0));
//    public static final ShapelessItemRecipe cooked_rabbit = new ShapelessItemRecipe(Items.cooked_rabbit, 9, new ItemStack(ModBlocks.blockRabbit, 1, 1));
}