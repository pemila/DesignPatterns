package com.pemila.structural.Flyweight;

import com.pemila.util.Logs;

import java.util.HashMap;

/**
 * 享元工厂
 * @author： 月在未央
 * @date： 2019/1/10 15:03
 */
public class GoodsFactory {
    private static HashMap<String,Goods> pool = new HashMap<>();

    public static Goods GetGoods(String name){
        Logs.info("--------------------");
        Logs.info("对象池大小为{}",pool.size());
        if(pool.containsKey(name)){
            return pool.get(name);
        }else {
            Goods goods = new Goods(name);
            pool.put(name,goods);
            Logs.info("创建商品：{}",name);
            return goods;
        }
    }
}
