package net.bartosz.mod_pierwszy_bartosza.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.LUCK , 200), 1.0f).build();
    public static final FoodComponent BEER = new FoodComponent.Builder().hunger(-2).saturationModifier(0.25f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600), 1.0f).build();
}
