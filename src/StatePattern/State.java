package StatePattern;

/**
 * 状态接口
 *
 * @Author 富贵
 * @Date 2023/10/28 20:26
 * @Version 1.0
 */
public interface State {
    /**
     * ***行为
     */
    public void doAction(Context context);
}
