package com.pemila.structural.bridge;

import com.pemila.structural.bridge.Brand.DellBrand;
import com.pemila.structural.bridge.Brand.HaseeBrand;
import com.pemila.structural.bridge.product.NotebookProd;

/**
 * @author： 月在未央
 * @date： 2018/12/12 17:14
 * @Description：
 */
public class BridgeDemo {
    public static void main(String[] args) {
        NotebookProd n1 = new NotebookProd(new HaseeBrand());
        n1.show();

        NotebookProd n2 = new NotebookProd(new DellBrand());
        n2.show();
    }
}
