package com.pemila.structural.Decorator;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2018/12/17 14:47
 * @Description：
 */
public class DecoratorDemo {
    public static void main(String[] args) {

        //基本的Circle使用
        Circle circle = new Circle();
        Logs.info("circle--------------");
        circle.draw();

        //进行装饰之后的Circle使用
        Shape redCircle = new RedShapeDecorator(new Circle());
        Logs.info("Red circle ---------");
        redCircle.draw();
    }
}
