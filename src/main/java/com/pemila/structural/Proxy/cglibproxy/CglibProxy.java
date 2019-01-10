package com.pemila.structural.Proxy.cglibproxy;

import com.pemila.util.Logs;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author： 月在未央
 * @date： 2019/1/10 17:13
 */
public class CglibProxy implements MethodInterceptor {
    //维护一个被代理的对象
    private Object target;
    public CglibProxy(Object target){
        this.target = target;
    }
    //获取代理类
    public static Object getProxy(Object target){
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置需要代理的对象
        enhancer.setSuperclass(target.getClass());
        //设置回调
        enhancer.setCallback(new CglibProxy(target));
        //创建子类（代理对象）
        return enhancer.create();
    }
    @Override
    public Object intercept(
            Object o, Method method, Object[] objects,
            MethodProxy methodProxy) throws Throwable {
        Logs.info("### before Intercept");
        Object result = method.invoke(target,objects);
        Logs.info("### end Intercept");
        return result;
    }
}
