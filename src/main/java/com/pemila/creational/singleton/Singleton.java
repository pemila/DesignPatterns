package com.pemila.creational.singleton;

import lombok.Data;

/**
 * 单例模式简易实现
 * @author： 月在未央
 * @date： 2018/12/11 13:46
 * @Description：
 */
public class Singleton {

    //1.创建私有静态对象
    private static Singleton instance = new Singleton();
    //2.修改默认构造方法为私有，防止外部实例化
    private Singleton(){}
    //3.提供静态方法获取唯一实例
    public static Singleton getInstance(){
        return instance;
    }
}
