package com.pemila.structural.Facade;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2019/1/10 12:03
 */
public class FacadeClient {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        Logs.info("--------------");
        computer.shutdown();
    }
}
