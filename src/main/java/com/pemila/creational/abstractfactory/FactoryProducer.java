package com.pemila.creational.abstractfactory;

import com.pemila.creational.abstractfactory.factory.AbstractFactory;
import com.pemila.creational.abstractfactory.factory.ColorFactory;
import com.pemila.creational.abstractfactory.factory.ShapeFactory;

/**
 * 步骤5.构建工厂生成器类，通过传递选择类型获取工厂实例
 * @author： 月在未央
 * @date： 2018/12/11 10:47
 * @Description：
 */
public class FactoryProducer {
    public static AbstractFactory GetFactory(String chioce){
        switch (chioce){
            case "SHAPE":
                return new ShapeFactory();
            case "COLOR":
                return new ColorFactory();
            default:
                return null;
        }
    }
}
