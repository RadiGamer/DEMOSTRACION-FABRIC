package net.radi.pruebamod.entity.client;

import net.minecraft.util.Identifier;
import net.radi.pruebamod.entity.custom.EntidadElDed;
import net.radi.pruebamod.pruebamod;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class Modeloeelded extends AnimatedGeoModel<EntidadElDed> {
    @Override
    public Identifier getModelLocation(EntidadElDed object) {
        return new Identifier(pruebamod.MOD_ID, "geo/elded.geo.json");
    }

    @Override
    public Identifier getTextureLocation(EntidadElDed object) {
        return new Identifier(pruebamod.MOD_ID, "textures/entity/elded/elded.png");
    }

    @Override
    public Identifier getAnimationFileLocation(EntidadElDed animatable) {
        return new Identifier(pruebamod.MOD_ID, "animations/elded.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(EntidadElDed entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
