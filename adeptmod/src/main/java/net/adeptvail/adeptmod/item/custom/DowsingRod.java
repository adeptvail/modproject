package net.adeptvail.adeptmod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

import java.util.Objects;

public class DowsingRod extends Item {


    public DowsingRod(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        if(context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = Objects.requireNonNull(context.getPlayer());
            boolean foundBlock = false;

            for (int i = 0; i<= positionClicked.getY(); i++) {
                Block blockBelow = context.getWorld().getBlockState(positionClicked.down(i)).getBlock();

                if (isValubleBlock(blockBelow)) {
                    outputValubleCoordnates(blockBelow, positionClicked.add(0,-i,0), player);
                    foundBlock = true;
                    break;
                }

            }
            if (!foundBlock) {
                player.sendMessage(new LiteralText("Didn't find anything"), true);
            }
        }

        context.getStack().damage(1, context.getPlayer(),
                (player) -> player.sendToolBreakStatus(player.getActiveHand()));





        return super.useOnBlock(context);
    }

    private boolean isValubleBlock(Block block) {
        return block == Blocks.COAL_ORE || block == Blocks.COPPER_ORE || block == Blocks.IRON_ORE ||
                block == Blocks.GOLD_ORE || block == Blocks.DIAMOND_ORE || block == Blocks.ANCIENT_DEBRIS;
    }

    private void outputValubleCoordnates(Block blockFound, BlockPos pos, PlayerEntity player) {
        player.sendMessage(new LiteralText("Found " + blockFound.asItem().getName().getString() +
                " " + "at (" + pos.getX() + ", " + pos.getY() + ", " + pos.getZ() + ")"), true);
    }

}
