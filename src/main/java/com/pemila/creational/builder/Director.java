package com.pemila.creational.builder;

/**
 * 监工/导演
 * @author： 月在未央
 * @date： 2018/12/11 16:47
 * @Description：
 */
public class Director {
    public Computer createComputerByDirector(Builder build){
        build.buildHost();
        build.buildKeyboard();
        build.buildMouse();
        build.buildScreen();
        return build.assembleComputer();
    }
}
