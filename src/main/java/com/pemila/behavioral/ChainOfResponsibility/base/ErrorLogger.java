package com.pemila.behavioral.ChainOfResponsibility.base;

/**
 * @author： 月在未央
 * @date： 2019/1/11 10:20
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR：-------"+message);
    }
}
