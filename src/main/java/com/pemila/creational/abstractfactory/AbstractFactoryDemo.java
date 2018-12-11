package com.pemila.creational.abstractfactory;

import com.pemila.creational.abstractfactory.factory.AbstractFactory;
import com.pemila.creational.abstractfactory.interfacee.Color;

/**
 * DEMO
 * @author： 月在未央
 * @date： 2018/12/11 10:49
 * @Description：
 */
public class AbstractFactoryDemo {
    public static void main(String[] args){
        //使用工厂生成器获取工厂
        AbstractFactory factory = FactoryProducer.GetFactory("COLOR");
        //根据条件从工厂中获取具体对象
        Color c1 = factory.getColor("RED");
        //调用对象
        c1.fill();
    }
}
