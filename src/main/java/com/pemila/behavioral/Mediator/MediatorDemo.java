package com.pemila.behavioral.Mediator;

import org.apache.tools.ant.taskdefs.Sleep;

import java.util.Objects;

/**
 * @author： 月在未央
 * @date： 2019/1/15 16:02
 */
public class MediatorDemo {
    public static void main(String[] args) {
        User laa  = new User("laa");
        User WWeeee = new User("WWeeee");
        laa.sendMessage("今天星期天");
        WWeeee.sendMessage("明天不放假");
    }
}
