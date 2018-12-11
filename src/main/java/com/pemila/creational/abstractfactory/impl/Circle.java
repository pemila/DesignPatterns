package com.pemila.creational.abstractfactory.impl;

import com.pemila.creational.abstractfactory.interfacee.Shape;
import com.pemila.util.Logs;

/**
 * 步骤2：创建实现接口的实体类
 * @author： 月在未央
 * @date： 2018/12/11 10:32
 * @Description：
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        Logs.info("圆形Circle::draw() method.");
    }
}
