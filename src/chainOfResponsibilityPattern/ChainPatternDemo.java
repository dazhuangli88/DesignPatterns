package chainOfResponsibilityPattern;

/**
 * @Author 富贵
 * @Date 2023/10/26 9:39
 * @Version 1.0
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);


        //此处设置了链子先后顺序 errorLogger -> fileLogger ->consoleLogger
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        //最后返回链子的开头，如果返回链子的结尾consoleLogger，那就会导致前面的链子没有了
        return errorLogger;
    }
    public static void main (String[]args){
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "this is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG, "this is a debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR, "this is an error information.");
    }
}
