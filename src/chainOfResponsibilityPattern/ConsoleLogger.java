package chainOfResponsibilityPattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 9:25
 * @Version 1.0
 */
public class ConsoleLogger extends AbstractLogger{
    /**
     * 这里设置父类的level
     */
    public ConsoleLogger(int level){
        this.level = level;
    }

    protected void write(String message){
        System.out.println("Standard Console::Logger: \" + message");
    }

}
