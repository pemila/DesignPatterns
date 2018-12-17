package com.pemila.creational.prototype;

import lombok.Data;

/**
 * 1.创建原型：创建一个实现Cloneable接口的抽象类
 * @author： 月在未央
 * @date： 2018/12/12 11:00
 * @Description：
 */
@Data
public abstract class Mobile implements Cloneable{

    private String id;

    protected String mobileType;

    abstract void dialNumber();

    public Mobile clone(){
        Mobile clone = null;
        try{
            clone = (Mobile) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
