package com.pemila.creational.singleton.mode;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 登记式单例是对一组单例进行维护，保证map中的对象为同一份
 * @author： 月在未央
 * @date： 2018/12/11 15:42
 * @Description：
 */
public class RegisteredSingleton2 {

    private static Map<String, Object> map;

    static {
        map = new ConcurrentHashMap<>();
        map.put(RegisteredSingleton2.class.getName(), new RegisteredSingleton2());
    }

    private RegisteredSingleton2() {
    }

    public static Object getInstance(String name) {
        if (name == null) {
            name = RegisteredSingleton2.class.getName();
        }

        if (map.get(name) == null) {
            try {
                map.put(name, Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }
}
