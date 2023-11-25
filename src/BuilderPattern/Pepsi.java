package BuilderPattern;

/**
 * 百事类
 * 继承自冷饮类
 * @Author 富贵
 * @Date 2023/10/26 18:14
 * @Version 1.0
 */
public class Pepsi extends ColdDrink{

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 16.0f;
    }
}
