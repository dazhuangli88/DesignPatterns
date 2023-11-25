package chainOfResponsibilityPattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 9:34
 * @Version 1.0
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }


    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: \" + message");
    }
}
