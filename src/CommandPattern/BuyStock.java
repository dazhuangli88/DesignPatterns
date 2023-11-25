package CommandPattern;

/**
 * 购买仓储类
 * 订单接口具体实现
 *
 * @Author 富贵
 * @Date 2023/10/28 9:26
 * @Version 1.0
 */
public class BuyStock implements Order{
    private Stock abcStock;

    /**
     * 购买
     */
    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    @Override
    public void execute() {
        abcStock.buy();

    }
}
