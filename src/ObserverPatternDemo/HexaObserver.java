package ObserverPatternDemo;


/**
 * 十六进制观察者
 *
 * @Author 富贵
 * @Date 2023/10/28 19:50
 * @Version 1.0
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;

        //***这里将观察者注册进主题的观察者列表中
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
               +Integer.toHexString(subject.getState()).toUpperCase());
    }
}
