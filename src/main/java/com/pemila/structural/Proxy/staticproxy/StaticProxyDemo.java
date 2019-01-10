package com.pemila.structural.Proxy.staticproxy;

/**
 * @author： 月在未央
 * @date： 2019/1/10 15:59
 */
public class StaticProxyDemo {
    public static void main(String[] args) {
        //获取目标对象（被代理对象）
        UserDao target = new UserDao();
        //创建代理对象
        UserDaoProxy proxy = new UserDaoProxy(target);
        //代理执行
        proxy.save();
    }
}
