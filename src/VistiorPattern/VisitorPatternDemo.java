package VistiorPattern;

/**
 * @Author 富贵
 * @Date 2023/10/28 22:38
 * @Version 1.0
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        //***外部调用，只知道计算机装载访问者，不对外暴露细节
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
