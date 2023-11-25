package AbstractFactory;

/**
 * @Author 富贵
 * @Date 2023/10/25 14:08
 * @Version 1.0
 */
public class Green implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Green::fill()method.");
    }
}
