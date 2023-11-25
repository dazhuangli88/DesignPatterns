package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单类
 * 用于记录订单情况
 * @Author 富贵
 * @Date 2023/10/26 18:15
 * @Version 1.0
 */
public class Meal {

    /**
     * 用于存储食品信息的列表
     */
    private List<Item> items = new ArrayList<Item>();
    /***
     * 添加食品
     */
    public void addItem(Item item){
        items.add(item);

    }
    /**
     * 总计金额
     */
     public float getCost(){
         float cost = 0.0f;

         //遍历食品信息列表并金额进行累加
         for(Item item : items){
             cost += item.price();
         }
         return cost;
     }

    /**
     * 展示已添加的食物
     */
    public void showItems(){
        for(Item item : items){
            System.out.println("Item : " + item.name());
            System.out.println(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }


}

