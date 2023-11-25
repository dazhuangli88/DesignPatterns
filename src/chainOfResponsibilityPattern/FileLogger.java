package chainOfResponsibilityPattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 9:36
 * @Version 1.0
 */
public class FileLogger extends AbstractLogger{

    public FileLogger(int level){
        this.level = level;
    }

    protected void write(String message){
        System.out.println("File::Logger: \" + message");
    }
}
