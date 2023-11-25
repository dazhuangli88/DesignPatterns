package VistiorPattern;

/**
 * @Author 富贵
 * @Date 2023/10/28 22:02
 * @Version 1.0
 */
public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
