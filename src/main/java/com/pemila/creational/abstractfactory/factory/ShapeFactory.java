package com.pemila.creational.abstractfactory.factory;

import com.pemila.creational.abstractfactory.impl.Circle;
import com.pemila.creational.abstractfactory.impl.Square;
import com.pemila.creational.abstractfactory.interfacee.Color;
import com.pemila.creational.abstractfactory.interfacee.Shape;

/**
 * 步骤4.构建形状和颜色的工厂类，继承abstractfactory
 * @author： 月在未央
 * @date： 2018/12/11 10:40
 * @Description：
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
