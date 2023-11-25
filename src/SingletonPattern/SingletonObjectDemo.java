package SingletonPattern;

/**
 * @Author 富贵
 * @Date 2023/10/25 10:39
 * @Version 1.0
 */
public class SingletonObjectDemo {
    public static void main(String[] args) {
        //获取唯一可用对象
        SingletonObject singletonPattern = SingletonObject.getInstance();

        //显示消息
        singletonPattern.showMessage();


    }
}
