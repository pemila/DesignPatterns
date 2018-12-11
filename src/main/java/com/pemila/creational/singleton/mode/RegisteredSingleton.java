package com.pemila.creational.singleton.mode;

/**
 * 登记式（静态内部类）
 * @author： 月在未央
 * @date： 2018/12/11 14:47
 * @Description：
 */
public class RegisteredSingleton {

    private static class SingletonHolder {
        private static final RegisteredSingleton Instance = new RegisteredSingleton();
    }

    private RegisteredSingleton(){}

    public static final RegisteredSingleton getInstance(){
        return SingletonHolder.Instance;
    }
}
