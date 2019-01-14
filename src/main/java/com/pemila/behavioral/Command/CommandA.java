package com.pemila.behavioral.Command;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2019/1/14 15:41
 */
public class CommandA implements ICommand {
    @Override
    public void excute() {
        Logs.info("执行A命令");
    }

    @Override
    public void undo() {
        Logs.info("撤销A命令");
    }
}
