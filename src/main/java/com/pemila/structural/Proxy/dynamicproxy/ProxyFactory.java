package com.pemila.structural.Proxy.dynamicproxy;

import com.pemila.util.Logs;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author： 月在未央
 * @date： 2019/1/10 16:36
 */
public class ProxyFactory {
    //维护一个目标对象
    private Object target;
    public ProxyFactory(Object target){
        this.target = target;
    }

    //为目标对象生成代理对象
    public Object getProxyInstance(){
        return  Proxy.newProxyInstance(
                    target.getClass().getClassLoader(),
                    target.getClass().getInterfaces(),
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy,
                                             Method method,
                                             Object[] args) throws Throwable {
                            Logs.info("开始事务...");
                            //执行目标对象的方法
                            Object returnValue = method.invoke(target,args);
                            Logs.info("提交事务...");
                            return returnValue;
                        }
                    }
                );
    }


}
