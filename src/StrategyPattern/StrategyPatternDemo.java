package StrategyPattern;

import java.sql.SQLOutput;

/**
 * @Author 富贵
 * @Date 2023/10/28 21:39
 * @Version 1.0
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        //***使用相加策略
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 =" + context.executeStrategy(10, 5));
        //相减策略
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 =" + context.executeStrategy(10, 5));
        //使用相乘策略
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 =" +context.executeStrategy(10, 5));
    }
}
