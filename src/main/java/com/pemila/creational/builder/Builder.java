package com.pemila.creational.builder;

/**
 * @author： 月在未央
 * @date： 2018/12/11 16:15
 * @Description：
 */
public interface Builder {
    public void buildHost();
    public void buildScreen();
    public void buildKeyboard();
    public void buildMouse();

    public Computer assembleComputer();
}
