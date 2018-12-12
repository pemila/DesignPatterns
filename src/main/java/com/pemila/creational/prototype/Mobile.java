package com.pemila.creational.prototype;

/**
 * 1.创建原型：创建一个实现Cloneable接口的抽象类
 * @author： 月在未央
 * @date： 2018/12/12 11:00
 * @Description：
 */
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



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobileType() {
        return mobileType;
    }

    public void setMobileType(String mobileType) {
        this.mobileType = mobileType;
    }
}
