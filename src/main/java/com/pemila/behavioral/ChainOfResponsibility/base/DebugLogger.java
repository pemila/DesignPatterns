package com.pemila.behavioral.ChainOfResponsibility.base;

/**
 * @author： 月在未央
 * @date： 2019/1/11 10:20
 */
public class DebugLogger extends AbstractLogger{
    public DebugLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG：-------"+message);
    }
}
