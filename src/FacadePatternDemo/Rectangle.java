package FacadePatternDemo;

/**
 * 长方形具体实现
 *
 * @Author 富贵
 * @Date 2023/10/27 18:26
 * @Version 1.0
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
