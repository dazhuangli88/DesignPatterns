package InerpreterPattern;

import com.sun.deploy.panel.AndOrRadioPropertyGroup;

/**
 * @Author 富贵
 * @Date 2023/10/26 11:08
 * @Version 1.0
 */
public class InterpreterPatternDemo {
    /**
     * 规则设置：tom和jake是男性
     */
    public static Expression getMaleExpression(){
        Expression tom = new TerminalExpression("Tom");
        Expression jake = new TerminalExpression("Jake");

        //OrExpression 的interpret方法和 TerminalExpression 的interpret方法实现不一样
        return new OrExpression(tom,jake);
    }

        /**
         * 设置规则：lily是一个已婚女性
         */
        public static Expression getMarriedWomanExpression(){
            //注入表达式条件
            Expression lily = new TerminalExpression("Lily");
            Expression married = new TerminalExpression("Married");

            //AndExpression的interpret方法
            // 和TerminalExpression的interpret方法实现是不一样的
            return new AndExpression(lily,married);

        }

    public static void main(String[] args) {
        //获得表达式
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("tom is male?" + isMale.interpret("jake"));

        System.out.println("lily is a married women?"
        +isMarriedWoman.interpret("Married lily"));
    }




}
