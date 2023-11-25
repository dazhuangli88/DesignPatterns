package InerpreterPattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 11:01
 * @Version 1.0
 */
public class OrExpression implements Expression{

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1,Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpret(String context){
        //***或表达式
        return expr1.interpret(context) || expr2.interpret(context);

    }
}
