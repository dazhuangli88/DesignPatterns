package BuilderPattern;

/**
 * 瓶子类
 * 打包类的实现
 * @Author 富贵
 * @Date 2023/10/26 17:58
 * @Version 1.0
 */
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}
