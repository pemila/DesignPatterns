package com.pemila.creational.abstractfactory.factory;

import com.pemila.creational.abstractfactory.interfacee.Color;
import com.pemila.creational.abstractfactory.interfacee.Shape;

/**
 * 步骤3：为color和shape创建抽象类用于获取工厂
 * @author： 月在未央
 * @date： 2018/12/11 10:37
 * @Description：
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
