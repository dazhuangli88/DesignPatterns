package AbstractFactory;


/**
 * @Author 富贵
 * @Date 2023/10/25 14:00
 * @Version 1.0
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
