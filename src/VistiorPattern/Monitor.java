package VistiorPattern;

/**
 * @Author 富贵
 * @Date 2023/10/28 22:04
 * @Version 1.0
 */
public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
