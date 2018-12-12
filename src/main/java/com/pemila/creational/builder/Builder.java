package com.pemila.creational.builder;

/**
 * @author： 月在未央
 * @date： 2018/12/11 16:15
 * @Description：
 */
public interface Builder {
    void buildHost();
    void buildScreen();
    void buildKeyboard();
    void buildMouse();

    Computer assembleComputer();
}
