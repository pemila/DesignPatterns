package com.pemila.structural.Proxy.cglibproxy;

/**
 * @author： 月在未央
 * @date： 2019/1/10 17:22
 */
public class CglibProxyDemo {
    public static void main(String[] args) {
        //生成代理类
        Engineer enProxy = (Engineer) CglibProxy.getProxy(new Engineer());
        //调用public方法
        enProxy.eat();
        //调用final方法
        enProxy.work();
        Engineer.wasteTime();
    }
}
