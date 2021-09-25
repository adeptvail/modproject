package net.adeptvail.adeptmod.block.custom;

import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.sql.Time;
import java.util.Vector;

public class StatusBlock extends Block {
    public StatusBlock(Settings settings) {
        super(settings);


    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {

        if (!world.isClient()) {
            if (hand == Hand.MAIN_HAND) {
                BlockPos playerBlockPos = player.getBlockPos();
                int n1=0,n2=1,n3,i,count=25;

                System.out.print(n1+" "+n2);//printing 0 and 1

                for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
                {

                    n3=n1+n2;
                    n1=n2;
                    n2=n3;

                    player.sendMessage(new LiteralText("we are at " + n3),false);
                }
            }
        }else {
            if(hand == Hand.MAIN_HAND) {
                player.sendMessage(new LiteralText(" "), true);
            }else {
                player.sendMessage(new LiteralText(" You are going to space"), true);
            }

        }


        return super.onUse(state, world, pos, player, hand, hit);
    }
}
