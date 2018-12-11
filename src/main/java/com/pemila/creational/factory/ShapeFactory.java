package com.pemila.creational.factory;

import com.pemila.creational.factory.impl.Circle;
import com.pemila.creational.factory.impl.Rectangle;
import com.pemila.creational.factory.impl.Square;

/**
 * 步骤3 ：创建工厂，生成基于给定信息的实体类对象
 *
 * @author： 月在未央
 * @date： 2018/12/10 18:20
 * @Description：
 */
public class ShapeFactory {
    /**
     * 根据给定的shapeTye生成不同的实体类。
     * 注意此处为简易期间使用stringequals方法，
     * 实际使用过程中可根据任意条件生成不同的实例
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType) {
        switch (shapeType){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
