package com.company;
// Telescoping constructor pattern - does not scale well!
public class NutritionTelescoping {
    private final int servingSize;
    private final int servings;
    private final int calories;

    public NutritionTelescoping(int servingSize, int servings){
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = 0;
    }

    public NutritionTelescoping(int servingSize, int servings, int calories){
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
    }
}
