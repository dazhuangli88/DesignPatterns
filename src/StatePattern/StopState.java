package StatePattern;

/**
 * @Author 富贵
 * @Date 2023/10/28 20:34
 * @Version 1.0
 */
public class StopState implements State{
    @Override
    public void doAction(Context context) {

        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
