package com.pemila.creational.singleton.mode;

import com.pemila.creational.singleton.Singleton;

/**
 * 枚举方式
 * @author： 月在未央
 * @date： 2018/12/11 15:19
 * @Description：
 */
public enum EnumSingleton {
    Instance;
    private Object ob = null;

    EnumSingleton(){
        ob = new Object();
    }
    public Object getInstance(){
        return ob;
    }
}
