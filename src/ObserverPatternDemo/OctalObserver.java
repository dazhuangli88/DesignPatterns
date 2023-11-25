package ObserverPatternDemo;

/**
 * 八进制观察者
 *
 * @Author 富贵
 * @Date 2023/10/28 19:31
 * @Version 1.0
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        //***这里将观察者注册进主题的观察者列表中
        this.subject.attach(this);
    }

    /**
     * 更新为八进制
     * 当触发变更后会进行的操作
     */
    @Override
    public void update() {
        System.out.println("Octal String:"
                +Integer.toOctalString(subject.getState()));

    }
}
