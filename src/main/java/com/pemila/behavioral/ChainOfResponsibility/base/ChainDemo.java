package com.pemila.behavioral.ChainOfResponsibility.base;

/**
 * @author： 月在未央
 * @date： 2019/1/11 10:22
 */
public class ChainDemo {

    private static AbstractLogger GetChainOfLoggers(){
        //创建三个不同的处理者对象
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        //指定各处理者之间的链关系
        //从链的尾部开始指定，最后返回链首的对象
        debugLogger.setNextLogger(infoLogger);
        errorLogger.setNextLogger(debugLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = GetChainOfLoggers();

        loggerChain.LogMessage(1,"请求响应内容");

        System.out.println("########################");

        loggerChain.LogMessage(2,"SQL语句");

        System.out.println("########################");

        loggerChain.LogMessage(3,"空指针异常");
    }

}
