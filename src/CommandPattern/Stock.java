package CommandPattern;

/**
 * 仓库
 *
 * @Author 富贵
 * @Date 2023/10/28 9:01
 * @Version 1.0
 */
public class Stock {
    /**
     *名称
     */
    private String name = "ABC";

    /**
     * 数量
     */
    private int quantity = 10;

    /**
     * 购买
     */

    public void buy(){
        System.out.println("Stock [ Name:" + name +", Quantity:" + quantity +" ]bought ");
    }

    /**
     * 售卖
     */
    public void sell(){
        System.out.println("Stock [ Name:" + name +", Quantity:" + quantity + " ]sold");
    }
}
