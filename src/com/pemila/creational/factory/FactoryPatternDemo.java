package com.pemila.creational.factory;

/**
 * 步骤 4: 使用该工厂，通过传递类型信息来获取实体类的对象。
 * @author： 月在未央
 * @date： 2018/12/10 18:26
 * @Description：
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        //获取工厂对象实例
        ShapeFactory shapeFactory = new ShapeFactory();
        //从工厂获取 Circle 的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        //调用 Rectangle 的 draw 方法
        shape2.draw();
        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        //调用 Square 的 draw 方法
        shape3.draw();
    }

}
