package com.pemila.creational.abstractfactory.factory;

import com.pemila.creational.abstractfactory.impl.Green;
import com.pemila.creational.abstractfactory.impl.Red;
import com.pemila.creational.abstractfactory.interfacee.Color;
import com.pemila.creational.abstractfactory.interfacee.Shape;

/**
 * 步骤4.构建形状和颜色的工厂类，继承abstractfactory
 * @author： 月在未央
 * @date： 2018/12/11 10:44
 * @Description：
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        switch (color) {
            case "RED":
                return new Red();
            case "GREEN":
                return new Green();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
