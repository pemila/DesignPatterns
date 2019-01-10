package com.pemila.structural.Facade.subsysterm;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2019/1/10 11:56
 */
public class Disk {
    public void startup(){
        Logs.info("Disk start up!");
    }
    public void shutdown(){
        Logs.info("Disk shut down!");
    }
}
