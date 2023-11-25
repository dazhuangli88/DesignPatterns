package CommandPattern;

/**
 * 销售仓储类
 *
 * @Author 富贵
 * @Date 2023/10/28 9:34
 * @Version 1.0
 */
public class SellStock implements Order{
    private Stock abcStock;

    /**
     * 售卖
     */
    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
