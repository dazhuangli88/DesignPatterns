package ProxyPattern;

/**
 * @Author 富贵
 * @Date 2023/10/25 15:53
 * @Version 1.0
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("data.jpg");
        image.display();
    }
}
