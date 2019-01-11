package com.pemila.behavioral.ChainOfResponsibility.base;

/**
 * 抽象的请求接收者
 * @author： 月在未央
 * @date： 2019/1/11 10:04
 */
public abstract class AbstractLogger {
    //日志级别
    protected int level;
    //责任链的下一个请求接收者
    protected AbstractLogger nextLogger;

    //向链中添加下一个请求接收者
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    //定义请求接收者的处理逻辑
    public void LogMessage(int level,String message){
        if(this.level<=level){
            write(message);
        }
        //下一个接收者不为空，则请求转发
        if(nextLogger!=null){
            nextLogger.LogMessage(level,message);
        }
    }
    protected abstract void write(String message);

    //定义各日志级别常量
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
}
