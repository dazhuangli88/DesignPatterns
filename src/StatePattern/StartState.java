package StatePattern;

/**
 * 开始状态
 *
 * @Author 富贵
 * @Date 2023/10/28 20:30
 * @Version 1.0
 */
public class StartState implements State{
    /**
     * ***开始行为
     * @param context
     */

    @Override
    public void doAction(Context context) {
        context.setState(this);

        //***除了做其他操作外，还需要更新上下文状态

    }
    public String toString(){
        return "Start State";
    }
}



