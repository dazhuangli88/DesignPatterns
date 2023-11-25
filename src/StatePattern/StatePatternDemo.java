package StatePattern;

/**
 * @Author 富贵
 * @Date 2023/10/28 20:36
 * @Version 1.0
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        //初始化上下文
   Context context = new Context();

        //设置上下文
        StartState startState = new StartState();
        startState.doAction(context);
        //***同步启动状态
        System.out.println(context.getState().toString());

        //设置上下文
        StopState stopState = new StopState();
        stopState.doAction(context);
        //***同步停止状态
        System.out.println(context.getState().toString());


    }
}
