package BuilderPattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 18:29
 * @Version 1.0
 */
public class MealBuilder {
    /**
     * 添加蔬菜汉堡套装
     */
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;

    }

    /**
     * 添加非蔬菜汉堡套餐
     */
    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
