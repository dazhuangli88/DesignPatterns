package DecoratorPatternDecorator;

/**
 * 长方形具体实现
 *
 * @Author 富贵
 * @Date 2023/10/27 17:56
 * @Version 1.0
 */
public class Rectangle implements Shape{
    /**
     * 画长方形
     */
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");

    }
}
