package com.company;

public class NutritionFactsJavaBeans {
    private int servingSize  = -1; // Required not default value
    private int serving      = -1; // Required not default value
    private int calories     = 0;
    private int fat          = 0;
    private int sodiem       = 0;
    private int carbohydrate = 0;

    public NutritionFactsJavaBeans(){ }

    // Setters
    public void setServingSize(int val) { servingSize =  val;}
    public void setServing(int val) {serving = val;}
    public void setCalories(int val) {serving = val;}
    public void setFat(int val) {fat = val;}
    public void setSodiem(int val) {sodiem = val;}
    public void setCarbohydrate(int val) {carbohydrate = val;}

    public String toString(){
        return this.servingSize +" "+ this.serving;
    }

}
