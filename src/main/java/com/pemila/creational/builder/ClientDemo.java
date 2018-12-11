package com.pemila.creational.builder;

import com.pemila.util.Logs;

/**
 * 用户
 * @author： 月在未央
 * @date： 2018/12/11 16:50
 * @Description：
 */
public class ClientDemo {
    public static void main(String[] args) {
        //获取Director实例
        Director director = new Director();
        //director根据传入的具体建造者实现类创建对象
        Computer computer = director.createComputerByDirector(new HaseeComputerBuilder());
        Logs.info(computer.toString());
    }
}
