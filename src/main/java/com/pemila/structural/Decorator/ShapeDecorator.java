package com.pemila.structural.Decorator;

/**
 * @author： 月在未央
 * @date： 2018/12/17 14:42
 * @Description：
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape  = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
