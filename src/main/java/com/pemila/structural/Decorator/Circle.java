package com.pemila.structural.Decorator;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2018/12/17 14:34
 * @Description：
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        Logs.info("Shape:Circle");
    }
}
