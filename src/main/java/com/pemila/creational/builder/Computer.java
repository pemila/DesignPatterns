package com.pemila.creational.builder;

import com.pemila.util.JSON;

/**
 * 建造者将要构造的对象
 * @author： 月在未央
 * @date： 2018/12/11 16:17
 * @Description：
 */
public class Computer {
    private String Host;
    private String screen;
    private String keyboard;
    private String mouse;

    @Override
    public String toString() {
        return JSON.toJson(this);
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
}
