package com.pemila.structural.composite;

import com.pemila.util.JSON;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.创建持有自身list引用的对象
 * @author： 月在未央
 * @date： 2018/12/14 17:23
 * @Description：
 */
@Data
public class Grade {
    private String name;
    private String num;
    private List<Grade> subGrade;

    public Grade(String name, String num) {
        this.name = name;
        this.num = num;
        this.subGrade = new ArrayList<>();
    }

    public void add(Grade e) {
        subGrade.add(e);
    }

    public void remove(Grade e) {
        subGrade.remove(e);
    }

    @Override
    public String toString() {
        return JSON.toJson(this);
    }
}
