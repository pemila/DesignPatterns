package com.pemila.structural.bridge.product;

import com.pemila.structural.bridge.Brand.Brand;

/**
 * 3.创建产品桥接对象，其需要持有品牌的引用
 * @author： 月在未央
 * @date： 2018/12/12 16:59
 * @Description：
 */
public abstract class Product{
    protected Brand brand;

    public Product(Brand b){
        this.brand = b;
    }
    public abstract void show();
}
