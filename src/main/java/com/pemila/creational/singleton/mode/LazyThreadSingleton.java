package com.pemila.creational.singleton.mode;

/**
 * 懒汉式线程安全
 * @author： 月在未央
 * @date： 2018/12/11 14:34
 * @Description：
 */
public class LazyThreadSingleton {

    private static LazyThreadSingleton instance;
    private LazyThreadSingleton(){}
    public synchronized static LazyThreadSingleton getInstance() {
        if(instance==null){
            instance = new LazyThreadSingleton();
        }
        return instance;
    }
}
