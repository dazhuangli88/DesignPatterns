package MediatorPattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 11:47
 * @Version 1.0
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User tom = new User("Tom");
        User july = new User("July");

        tom.sendMessage("Hi tom");
        july.sendMessage("hi july");
    }
}
