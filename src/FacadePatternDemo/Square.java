package FacadePatternDemo;

/**
 * @Author 富贵
 * @Date 2023/10/27 18:28
 * @Version 1.0
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
