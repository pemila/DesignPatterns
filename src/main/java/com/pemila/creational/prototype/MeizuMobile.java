package com.pemila.creational.prototype;

import com.pemila.util.Logs;

/**
 * 2.创建具体原型：继承原型抽象类
 * @author： 月在未央
 * @date： 2018/12/12 11:07
 * @Description：
 */
public class MeizuMobile extends Mobile{

    public MeizuMobile(){
        mobileType = "meizu";
    }

    @Override
    public void dialNumber() {
        Logs.info("{}:dial telephone",mobileType);
    }
}
