package com.pemila.creational.prototype;

import java.util.Hashtable;

/**
 * 3.维护注册表，用于存储原型，并提供获取原型克隆的方法
 * @author： 月在未央
 * @date： 2018/12/12 11:12
 * @Description：
 */
public class MobileCache {
    //原型注册表
    private static Hashtable<String,Mobile> mobileMap = new Hashtable<>();

    //获取注册表中某个原型对象的克隆
    public static Mobile getMobile(String id){
        Mobile cacheMobile = mobileMap.get(id);
        return cacheMobile.clone();
    }

    //初始化原型注册表，
    //表中对象可以是从任何可获取的途径获取，
    //如下new MeizuMobile()仅为示例
    public static void loadCache(){
        MeizuMobile meizu = new MeizuMobile();
        meizu.setId("1");
        mobileMap.put(meizu.getId(),meizu);
    }

}
