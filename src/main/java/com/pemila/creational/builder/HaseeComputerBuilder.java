package com.pemila.creational.builder;

/**
 * @author： 月在未央
 * @date： 2018/12/11 16:24
 * @Description：
 */
public class HaseeComputerBuilder implements Builder{

    Computer computer;

    public HaseeComputerBuilder(){
        computer = new Computer();
    }

    @Override
    public void buildHost() {
        computer.setHost("神舟主机");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("神舟显示器");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("神舟键盘");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("神舟鼠标");
    }

    @Override
    public Computer assembleComputer() {
        return computer;
    }
}
