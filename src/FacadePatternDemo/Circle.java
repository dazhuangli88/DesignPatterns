package FacadePatternDemo;

/**
 * @Author 富贵
 * @Date 2023/10/27 18:29
 * @Version 1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
