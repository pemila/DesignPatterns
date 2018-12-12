package com.pemila.structural.bridge.Brand;

import com.pemila.structural.bridge.Brand.Brand;
import com.pemila.util.Logs;

/**
 * 2.实现品牌接口
 * @author： 月在未央
 * @date： 2018/12/12 16:56
 * @Description：
 */
public class HPBrand implements Brand {
    @Override
    public void sale() {
        Logs.info("销售惠普");
    }
}
