package com.company;

public class Main {

    public static void main(String[] args) {
        /***
         * Typically this constructor invocation will require many parameters that you don’t
         * want to set, but you’re forced to pass a value for them anyway. In this case, we
         * passed a value of 0 for fat. With “only” six parameters this may not seem so bad,
         * but it quickly gets out of hand as the number of parameters increases.
         * In short, the telescoping constructor pattern works, but it is hard to write
         * client code when there are many parameters, and harder still to read it. The
         * reader is left wondering what all those values mean and must carefully count
         * parameters to find out. Long sequences of identically typed parameters can cause
         * subtle bugs.
         */

        NutritionTelescoping factory = new NutritionTelescoping(10,10);
        NutritionTelescoping factory2 = new NutritionTelescoping(10,10,102);


        /**
         * Unfortunately, the JavaBeans pattern has serious disadvantages of its own.
         * Because construction is split across multiple calls, a JavaBean may be in an
         * inconsistent state partway through its construction. The class does not have
         * the option of enforcing consistency merely by checking the validity of the
         * constructor parameters. Attempting to use an object when it’s in an inconsistent
         * state may cause failures that are far removed from the code containing the bug and
         * hence difficult to debug. A related disadvantage is that the JavaBeans pattern
         * precludes the possibility of making a class immutable
         *
         */

        NutritionFactsJavaBeans nutritionFacts = new NutritionFactsJavaBeans();
        nutritionFacts.setServingSize(10);
        nutritionFacts.setServing(120);
        System.out.println(nutritionFacts.toString());

        /**
         *This client code is easy to write and, more importantly, easy to read. The Builder
         * pattern simulates named optional parameters as found in Python and Scala.
         * Validity checks were omitted for brevity. To detect invalid parameters as soon
         * as possible, check parameter validity in the builder’s constructor and methods.
         * Check invariants involving multiple parameters in the constructor invoked by the
         * build method. To ensure these invariants against attack, do the checks on object
         * fields after copying parameters from the builde
         */

        NutritionFactsBuilder cocaCola = new NutritionFactsBuilder.Builder(10,10)
                .calories(10).build();

    }
}
