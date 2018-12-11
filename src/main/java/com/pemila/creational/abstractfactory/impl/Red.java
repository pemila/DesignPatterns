package com.pemila.creational.abstractfactory.impl;

import com.pemila.creational.abstractfactory.interfacee.Color;
import com.pemila.util.Logs;

/**
 * 步骤2：创建实现接口的实体类
 * @author： 月在未央
 * @date： 2018/12/11 10:34
 * @Description：
 */
public class Red implements Color {
    @Override
    public void fill() {
        Logs.info("填充Red::fill method");
    }
}
