package com.pemila.behavioral.Command;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2019/1/14 15:42
 */
public class CommandB implements ICommand {
    @Override
    public void excute() {
        Logs.info("执行B命令");
    }

    @Override
    public void undo() {
        Logs.info("撤销B命令");
    }
}
