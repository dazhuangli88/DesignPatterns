package VistiorPattern;


/**
 * ***访问者接口
 *
 * @Author 富贵
 * @Date 2023/10/28 21:55
 * @Version 1.0
 */
public interface ComputerPartVisitor {
    /***
     * 机箱访问
     */
    public void visit(Computer computer);

    /***
     * 鼠标访问
     */
    public void visit(Mouse mouse);

    /**
     * 键盘访问
     */
    public void visit(Keyboard keyboard);

    /**
     * 显示器访问
     */
    public void visit(Monitor monitor);

}
