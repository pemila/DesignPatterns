package com.pemila.creational.singleton;

import com.pemila.util.Logs;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式反射机制漏洞
 * @author： 月在未央
 * @date： 2018/12/11 14:00
 * @Description：
 */
public class BreakSingletinDemo {

    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.pemila.creational.singleton.Singleton");
        Constructor c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);

        Singleton s1 = (Singleton) c.newInstance();
        Singleton s2 = (Singleton) c.newInstance();

        Logs.info(s1.toString());
        Logs.info(s2.toString());
    }
}
