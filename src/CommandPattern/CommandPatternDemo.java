package CommandPattern;

/**
 * @Author 富贵
 * @Date 2023/10/28 9:57
 * @Version 1.0
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        //购买
        BuyStock buyStockOrder = new BuyStock(abcStock);
        //出售
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        //添加命令
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        //***执行
        broker.placeOrders();

    }
}
