package com.pemila.creational.factory.impl;

import com.pemila.creational.factory.Shape;

/**
 * 步骤 2 创建实现接口的实体类
 * @author： 月在未央
 * @date： 2018/12/10 18:04
 * @Description：矩形
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("矩形Rectangle::draw() method.");
    }
}
