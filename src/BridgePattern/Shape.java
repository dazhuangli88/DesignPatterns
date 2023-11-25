package BridgePattern;

/**
 * @Author 富贵
 * @Date 2023/10/27 12:42
 * @Version 1.0
 */
public abstract class Shape {
    /**
     * ***此处抽离 draw,符合单一工作原则
     */
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
