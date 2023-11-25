package VistiorPattern;

/**
 * @Author 富贵
 * @Date 2023/10/28 21:54
 * @Version 1.0
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

    @Override
    public void visit(Computer computer) {
        System.out.println("Dispalying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Dispalying Mouse.");

    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Dispalying Keyboar.");

    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Dispalying Monitor.");
    }
}
