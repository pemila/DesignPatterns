package com.pemila.creational.singleton;

import com.pemila.creational.singleton.mode.EnumSingleton;
import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2018/12/11 13:55
 * @Description：
 */
public class SingletonDemo {
    public static void main(String[] args){
        Singleton object = Singleton.getInstance();
        Logs.info(object.toString());
    }
}
