package ObserverPatternDemo;

/**
 * 观察者
 *
 * @Author 富贵
 * @Date 2023/10/28 18:53
 * @Version 1.0
 */
public abstract class Observer {

    /**
     * 主题
     */
    protected Subject subject;

    /**
     * 更新观察者
     */
    public abstract void update();
}
