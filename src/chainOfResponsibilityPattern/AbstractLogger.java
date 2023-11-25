package chainOfResponsibilityPattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 9:14
 * @Version 1.0
 */
public class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    /**
     * 设置链子中的下一个元素，从而串成链
     *
     * @Param nextLogger 下一个元素
     */
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    /***
     * 写日志
     */
    public void logMessage(int level,String message){
        if(this.level <= level){
            write(message);
        }

        //此处往下一段链子找，直到链子尾部
        if(nextLogger != null){
            nextLogger.logMessage(level,message);
        }
    }

    /**
     * 此方法在继承后需要重写
     */
    protected void write(String message) {

    }

}
