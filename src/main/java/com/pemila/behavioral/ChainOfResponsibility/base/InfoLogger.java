package com.pemila.behavioral.ChainOfResponsibility.base;

/**
 * @author： 月在未央
 * @date： 2019/1/11 10:16
 */
public class InfoLogger extends AbstractLogger {
    public InfoLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO：--------"+message);
    }
}
