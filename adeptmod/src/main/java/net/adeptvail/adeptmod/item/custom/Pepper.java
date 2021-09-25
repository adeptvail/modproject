package net.adeptvail.adeptmod.item.custom;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Pepper extends Item {
    public Pepper(Settings settings) {
        super(settings);

    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {


        if (!world.isClient()) {
            double X = user.getX();
            double Y = user.getY();
            double Z = user.getZ();

            user.teleport(X-1,Y+1,Z-1,true);

        }



        return super.finishUsing(stack, world, user);
    }
}
