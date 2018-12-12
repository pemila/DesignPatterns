package com.pemila.structural.bridge.product;

import com.pemila.structural.bridge.Brand.Brand;
import com.pemila.util.Logs;

/**
 * 4.继承桥接类，实现方法
 * @author： 月在未央
 * @date： 2018/12/12 17:07
 * @Description：
 */
public class NotebookProd extends Product {
    public NotebookProd(Brand b) {
        super(b);
    }

    @Override
    public void show() {
        brand.sale();
        Logs.info("笔记本");
    }
}
