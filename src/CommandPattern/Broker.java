package CommandPattern;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用类
 *
 * @Author 富贵
 * @Date 2023/10/28 9:39
 * @Version 1.0
 */
public class Broker {
    /**
     * 订单列表
     */
    private List<Order> orderList = new ArrayList<Order>();

    /**
     * 下订单
     */
    public void takeOrder(Order order){
        orderList.add(order);
    }

    /**
     * 执行订单
     */
    public void placeOrders(){
        for(Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
