package AbstractFactory;

/**
 * @Author 富贵
 * @Date 2023/10/25 14:09
 * @Version 1.0
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill()method.");
    }
}
