package com.pemila.creational.singleton.mode;

/**
 * 双重校验锁
 * @author： 月在未央
 * @date： 2018/12/11 14:42
 * @Description：
 */
public class DclSingleton {
    private volatile static DclSingleton instance;
    private DclSingleton(){}
    public static DclSingleton getInstance(){
        if(instance==null){
            synchronized (DclSingleton.class){
                if(instance==null){
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }
}
