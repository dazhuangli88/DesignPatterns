package InerpreterPattern;

import InerpreterPattern.Expression;

/**
 * @Author 富贵
 * @Date 2023/10/26 10:49
 * @Version 1.0
 */
public class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    /**
     * 设置两个表达式
     * @param
     * @return
     */
    public AndExpression(Expression expr1,Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    /**
     * 解释器，一般来说有固定的搭配
     * @param context 上下文
     * @return 是否为true
     */
    @Override
    public boolean interpret(String context) {
        //***且表达式
        return expr1.interpret(context) && expr2 .interpret(context);
    }
}
