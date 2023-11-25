package BuilderPattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 18:12
 * @Version 1.0
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
