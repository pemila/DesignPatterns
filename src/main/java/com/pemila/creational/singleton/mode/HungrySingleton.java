package com.pemila.creational.singleton.mode;

/**
 * 饿汉式
 * @author： 月在未央
 * @date： 2018/12/11 14:39
 * @Description：
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance() {
        return instance;
    }
}
