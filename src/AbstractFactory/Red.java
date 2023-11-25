package AbstractFactory;

/**
 * @Author 富贵
 * @Date 2023/10/25 14:07
 * @Version 1.0
 */
public class Red implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Red::fill()method.");
    }
}
