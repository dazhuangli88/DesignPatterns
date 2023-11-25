package VistiorPattern;

/**
 * @Author 富贵
 * @Date 2023/10/28 22:06
 * @Version 1.0
 */
public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
