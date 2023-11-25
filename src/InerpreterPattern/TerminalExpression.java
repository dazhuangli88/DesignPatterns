package InerpreterPattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 10:45
 * @Version 1.0
 */
public class TerminalExpression implements Expression{
    private String data;
    public TerminalExpression(String data){
        this.data = data;
    }

    /**
     * 上下文解释器
     * @param context
     * @return
     */
    @Override
    public boolean interpret(String context) {
        //用于判断表达式
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
