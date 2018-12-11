package com.pemila.creational.abstractfactory.impl;

import com.pemila.creational.abstractfactory.interfacee.Shape;
import com.pemila.util.Logs;

/**
 * 步骤2：创建实现接口的实体类
 * @author： 月在未央
 * @date： 2018/12/11 10:06
 * @Description：
 */
public class Square implements Shape {
    @Override
    public void draw() {
        Logs.info("正方形Square::draw() method.");
    }
}
