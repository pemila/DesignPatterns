package com.pemila.structural.Flyweight;

import com.pemila.util.Logs;

import javax.naming.Name;

/**
 * 具体享元角色
 * @author： 月在未央
 * @date： 2019/1/10 14:55
 */
public class Goods implements IGoods{
    //内部状态
    private String name;
    //外部状态
    private String version;

    public Goods(String name){
        this.name = name;
    }

    @Override
    public void showPrice(String vesion) {
        switch (vesion){
            case "16":
                Logs.info("{}-{}销售价格为100CNY",this.name,vesion);
                break;
            case "32":
                Logs.info("{}-{}销售价格为300CNY",this.name,vesion);
                break;
            case "64":
                Logs.info("{}-{}销售价格为600CNY",this.name,vesion);
                break;
            default:
                Logs.info("无此商品");
        }
    }
}
