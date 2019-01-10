package com.pemila.structural.Proxy.dynamicproxy;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2019/1/10 16:42
 */
public class DynamicProxyDemo {
    public static void main(String[] args) {
        //目标对象
        IUserDao target = new UserDao();
        Logs.info("目标对象的类型：{}",target.getClass());
        //使用动态代理生成代理类
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        Logs.info("代理对象的类型：{}",proxy.getClass());
        proxy.save();
    }
}
