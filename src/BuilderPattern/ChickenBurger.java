package BuilderPattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 18:11
 * @Version 1.0
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 40.0f;
    }
}
