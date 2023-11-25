package ObserverPatternDemo;

/**
 * @Author 富贵
 * @Date 2023/10/28 19:57
 * @Version 1.0
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        //初始化主题对象
        Subject subject = new Subject();

        //***注册观察者
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        //修改状态的时候会触发注册的观察者
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
