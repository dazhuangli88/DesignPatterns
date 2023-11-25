package SingletonPattern;

/**
 * @Author 富贵
 * @Date 2023/10/25 10:25
 * @Version 1.0
 */
public class SingletonObject {
    //懒汉式
    private static SingletonObject singletonObject = null;

    private SingletonObject() {}

    public static SingletonObject getInstance() {
        if (singletonObject == null) {
            singletonObject = new SingletonObject();
        }
        return singletonObject;
    }

    public static void showMessage() {
        System.out.println("111");
    }
}