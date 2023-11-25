package VistiorPattern;

/**
 * 计算机具体实现（可以视为机箱）
 * 计算机部件接口具体实现
 * @Author 富贵
 * @Date 2023/10/28 22:17
 * @Version 1.0
 */
public class Computer implements ComputerPart{

    ComputerPart[] parts;

    //在构造函数内初始化数组
    public Computer() {
        parts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(int i = 0; i < parts.length; i++){
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
