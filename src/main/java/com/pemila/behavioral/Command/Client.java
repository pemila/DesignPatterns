package com.pemila.behavioral.Command;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2019/1/14 15:43
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Logs.info("AAAAAAAAAAAAAAAAAAAA");
        invoker.excuteCommand("a");
        Logs.info("BBBBBBBBBBBBBBBBBBBB");
        invoker.excuteCommand("b");
        Logs.info("ABABABABABABABABABAB");
        invoker.excuteCommand("aba");
    }
}
