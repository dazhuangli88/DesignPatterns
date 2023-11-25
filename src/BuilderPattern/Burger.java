package BuilderPattern;

/**
 * 汉堡类
 *实现食物条目接口
 *
 * @Author 富贵
 * @Date 2023/10/26 18:02
 * @Version 1.0
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
