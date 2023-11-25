package BuilderPattern;

/**
 * 冷饮类
 * 实现食物条目
 * @Author 富贵
 * @Date 2023/10/26 18:05
 * @Version 1.0
 */
public abstract class ColdDrink implements Item {


    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
