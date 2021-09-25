package net.adeptvail.adeptmod.client.renderer;

import net.adeptvail.adeptmod.AdeptMod;
import net.adeptvail.adeptmod.EntityTestingClient;
import net.adeptvail.adeptmod.client.model.CubeEntityModel;
import net.adeptvail.adeptmod.entity.CubeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel> {

    public CubeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CubeEntityModel(context.getPart(EntityTestingClient.MODEL_CUBE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {
        return new Identifier(AdeptMod.MOD_ID, "textures/entity/cube/cube.png");
    }

}
