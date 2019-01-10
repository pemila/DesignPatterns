package com.pemila.structural.Decorator;

import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2018/12/17 14:45
 * @Description：
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        setColor(decoratorShape);
    }

    private void setColor(Shape decoratorShape){
        Logs.info("Color:Red");
    }
}
