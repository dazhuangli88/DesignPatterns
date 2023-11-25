package DecoratorPatternDecorator;

/**
 * 圆形具体实现
 *
 * @Author 富贵
 * @Date 2023/10/27 17:58
 * @Version 1.0
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
