package StrategyPattern;

/**
 * 策略接口
 *
 * @Author 富贵
 * @Date 2023/10/28 21:31
 * @Version 1.0
 */
public interface Strategy {
    /**
     * 计算操作
     */
    public int doOperation(int num1,int num2);

}
