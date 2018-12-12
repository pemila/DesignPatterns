package com.pemila.creational.prototype;

import com.pemila.util.JSON;
import com.pemila.util.Logs;

/**
 * 4.使用示例
 * @author： 月在未央
 * @date： 2018/12/12 11:26
 * @Description：
 */
public class ProtoTypeDemo {
    public static void main(String[] args) {
        //初始化注册表(必须)
        MobileCache.loadCache();
        //根据key获取对象克隆
        Mobile m1 = MobileCache.getMobile("1");
        Mobile m2 = MobileCache.getMobile("1");
        Logs.info("\n{}:{}\n{}:{}",
                m1.toString(),JSON.toJson(m1),
                m2.toString(),JSON.toJson(m2));
    }
}
