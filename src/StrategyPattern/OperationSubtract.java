package StrategyPattern;

/**
 * @Author 富贵
 * @Date 2023/10/28 21:35
 * @Version 1.0
 */
public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
