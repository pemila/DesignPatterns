package com.pemila.structural.Proxy.cglibproxy;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2019/1/10 17:09
 */
public class Engineer {
    //可以被代理
    public void eat(){
        Logs.info("工程师正在吃饭");
    }
    //final方法不会被生成的子类覆盖
    public final void work(){
        Logs.info("工程师正在工作");
    }
    //static方法不会被生成的子类覆盖
    public static void wasteTime(){
        Logs.info("工程师正在浪费时间");
    }
    //private方法不会被生成的子类覆盖
    private void play(){
        Logs.info("工程师正在玩游戏");
    }
}
