package VistiorPattern;

/**
 * *** 计算机部件接口
 * @Author 富贵
 * @Date 2023/10/28 21:52
 * @Version 1.0
 */
public interface ComputerPart {

    /**
     * 部件插入（访问）
     */
    public void accept(ComputerPartVisitor computerPartVisitor);

}
