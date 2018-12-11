package com.pemila.creational.factory.impl;

import com.pemila.creational.factory.Shape;
import com.pemila.util.Logs;

/**
 * 步骤 2 创建实现接口的实体类
 * @author： 月在未央
 * @date： 2018/12/10 18:08
 * @Description： 圆形
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        Logs.info("圆形Circle::draw() method.");
    }
}
