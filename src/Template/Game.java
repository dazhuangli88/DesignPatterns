package Template;

/**
 * @Author 富贵
 * @Date 2023/10/25 16:07
 * @Version 1.0
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    /**
     * 作为模板，不关注具体实现，只需知道调用该方法即可，
     * 具体实现由对应的实例变量来决定
     */
    public final void play(){
        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
