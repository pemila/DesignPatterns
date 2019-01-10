package com.pemila.structural.Facade.subsysterm;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2019/1/10 11:53
 */
public class CPU {
    public void startup(){
        Logs.info("CPU start up!");
    }
    public void shutdown(){
        Logs.info("CPU shut down!");
    }
}
