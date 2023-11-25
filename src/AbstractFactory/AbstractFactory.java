package AbstractFactory;

/**
 * 重点：抽象工厂
 * @Author 富贵
 * @Date 2023/10/25 14:11
 * @Version 1.0
 */
public abstract class AbstractFactory {
    /**
     * 获得颜色
     *
     */
    public abstract Color getColor(String color);

    /**
     * * 获得形状
     */
    public abstract Shape getShape(String shape);
    }

