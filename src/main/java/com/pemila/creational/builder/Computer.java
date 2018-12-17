package com.pemila.creational.builder;

import com.pemila.util.JSON;
import lombok.Data;

/**
 * 建造者将要构造的对象
 * @author： 月在未央
 * @date： 2018/12/11 16:17
 * @Description：
 */
@Data
public class Computer {
    private String Host;
    private String screen;
    private String keyboard;
    private String mouse;

    @Override
    public String toString() {
        return JSON.toJson(this);
    }
}
