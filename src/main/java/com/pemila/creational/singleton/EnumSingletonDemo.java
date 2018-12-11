package com.pemila.creational.singleton;

import com.pemila.creational.singleton.mode.EnumSingleton;
import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2018/12/11 15:27
 * @Description：
 */
public class EnumSingletonDemo {
    public static void main(String[] args) {
        Object o1 = EnumSingleton.Instance.getInstance();
        Object o2 = EnumSingleton.Instance.getInstance();

        Logs.info(o1.toString());
        Logs.info(o2.toString());
    }
}
