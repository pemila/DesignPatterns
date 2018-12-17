package com.pemila.structural.Filter;

import com.pemila.util.JSON;
import lombok.Data;

/**
 * 1.创建需要过滤的对象
 * @author： 月在未央
 * @date： 2018/12/13 14:24
 * @Description：
 */
@Data
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return JSON.toJson(this);
    }

}
