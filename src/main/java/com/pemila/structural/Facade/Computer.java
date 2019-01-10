package com.pemila.structural.Facade;

import com.pemila.structural.Facade.subsysterm.CPU;
import com.pemila.structural.Facade.subsysterm.Disk;
import com.pemila.structural.Facade.subsysterm.Memory;
import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2019/1/10 11:57
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startup(){
        Logs.info("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        Logs.info("start the computer finished!");
    }

    public void shutdown(){
        Logs.info("close the computer!");
        disk.shutdown();
        memory.shutdown();
        cpu.shutdown();
        Logs.info("computer closed!");
    }

}
