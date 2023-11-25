package StatePattern;

/**
 * @Author 富贵
 * @Date 2023/10/28 20:28
 * @Version 1.0
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    /**
     * ***设置状态
     */
    public State getState() {
        return state;
    }


    public void setState(State state) {
        this.state = state;
    }
}

