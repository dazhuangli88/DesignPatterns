package AbstractFactory;

/**
 * @Author 富贵
 * @Date 2023/10/25 14:03
 * @Version 1.0
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println( "Inside Circle::draw() method.");
    }
}
