package ObserverPatternDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题类
 *
 * @Author 富贵
 * @Date 2023/10/28 11:33
 * @Version 1.0
 */
public class Subject {
    /**
     * 观察者列表
     */
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 状态
     */
    private int state;

    public int getState(){
        return state;
    }

    /**
     * ***设置状态
     * 设置状态后还会调用通知所有观察者的方法
     */
    public void setState(int state){
        this.state = state;
        notifyAllObserver();
    }

    /**
     * ***添加观察者
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 通知所有观察者
     */

    private void notifyAllObserver() {
        for(Observer observer : observers){
            observer.update();
        }
    }
}
