package BuilderPattern;

import java.sql.SQLOutput;

/**
 * @Author 富贵
 * @Date 2023/10/26 18:36
 * @Version 1.0
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        /**
         * 点一份蔬菜汉堡套餐
         */
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        /**
         * 点一份非蔬菜汉堡
         */
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
