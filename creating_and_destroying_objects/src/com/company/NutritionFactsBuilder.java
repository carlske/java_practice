package com.company;
// Builder Pattern
public class NutritionFactsBuilder {
    private final int servingSize;
    private final int servings;
    private final int calories;

    public static class  Builder {
        // Required parametes
        private final int servingSize;
        private final int servings;

        // Optional Parameters - initialized to default values

        private int calories = 0;

        public Builder(int servingSize,int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            this.calories = val;
            return this;
        }

        public NutritionFactsBuilder build(){
            return  new NutritionFactsBuilder(this);
        }
    }

    private NutritionFactsBuilder(Builder builder){
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
    }

}
