package StrategyPattern;

import StatePattern.StartState;

/**
 * @Author 富贵
 * @Date 2023/10/28 21:36
 * @Version 1.0
 */
public class Context {
    private Strategy strategy;

    /**
     * 初始化设置策略
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
