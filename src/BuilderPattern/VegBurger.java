package BuilderPattern;

/**
 * 蔬菜汉堡
 * 根据 Burger 进行扩展
 * @Author 富贵
 * @Date 2023/10/26 18:08
 * @Version 1.0
 */
public class VegBurger extends Burger{


    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
