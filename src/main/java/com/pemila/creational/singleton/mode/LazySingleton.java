package com.pemila.creational.singleton.mode;

/**
 * 懒汉式
 * @author： 月在未央
 * @date： 2018/12/11 14:30
 * @Description：
 */
public class LazySingleton {

    private static LazySingleton instance;
    private LazySingleton(){}
    public static LazySingleton getInstance() {
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
